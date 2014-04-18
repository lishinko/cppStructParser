package com.woyao.XinggangLi;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.woyao.XinggangLi.parser.*;

import com.woyao.XinggangLi.rules.*;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("usage: cppStructParser cppFile templateFile");
            return;
        }
        String cppFile = args[0];//System.getProperty("user.dir");
        String templateFile = args[1];

        File file = new File(cppFile);
        String nameWithExt = file.getName();
        String ext = nameWithExt.substring(nameWithExt.lastIndexOf('.') + 1);
        String name = nameWithExt.substring(0, nameWithExt.lastIndexOf('.'));
        ANTLRInputStream input = new ANTLRInputStream(new FileReader(file));
        structLexer lexer = new structLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        structParser parser = new structParser(tokens);
        try{
            ParseTree tree = parser.structDefine();

            ParseTreeWalker walker = new ParseTreeWalker();
            structFieldsExtractor extractor = new structFieldsExtractor();
            walker.walk(extractor, tree);

            STGroup group = new STGroupFile(templateFile);
            insertParseMethodForStruct insertparsemethodforstruct = new insertParseMethodForStruct(tokens, group);
            walker.walk(insertparsemethodforstruct, tree);

            wrapHeaderFile wrapper = new wrapHeaderFile(group, name, ext);

            File headFile = new File("output" + File.separator + name + ".h");
            if (!headFile.exists()) {
                headFile.createNewFile();
            }
            FileWriter writer = new FileWriter(headFile, false);
            writer.write(wrapper.generate(insertparsemethodforstruct.getHeader()));
            writer.close();
            //System.out.println(listener.);

            String cppFileName = name + ".cpp";
            File sourceFile = new File("output" + File.separator + cppFileName);
            if (!sourceFile.exists()) {
                sourceFile.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            File outputPath = new File(absolutePath + "output");
            if (!outputPath.exists()) {
                outputPath.mkdir();
            }
            StringBuilder sb = new StringBuilder();
            FileWriter writer1 = new FileWriter(sourceFile, false);
            for(Map.Entry<structParser.StructDefineContext, structInfo> entry : extractor.getGeneratedMethods().entrySet()) {
                generateParsingMethod cpp = new generateParsingMethod(entry.getValue(), group);
                sb.append(cpp.generate());
            }
            wrapSourceFile wsf = new wrapSourceFile(group, cppFileName);
            writer1.write(wsf.generate(sb.toString()));
            writer1.close();



//            System.out.println(tree.toStringTree(parser));
        }
        catch(RecognitionException ex)
        {
            ex.printStackTrace();
        }
        //怎么回事？intellij对直接的"hello world"会提示class or interfaces expected,只好改成这样子，它提示一个警告，不管了
        //System.out.println( new String("hello world"));

    }
}
