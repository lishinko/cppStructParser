package com.woyao.XinggangLi;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.woyao.XinggangLi.parser.*;

import com.woyao.XinggangLi.rules.*;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.FileReader;
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
            structRewriter rewriter = new structRewriter(tokens, group);
            walker.walk(rewriter, tree);
            System.out.println(rewriter.getHeader());
            //System.out.println(listener.);

            for(Map.Entry<structParser.StructDefineContext, structInfo> entry : extractor.getGeneratedMethods().entrySet()) {
                generateParsingMethod cpp = new generateParsingMethod(entry.getValue(), group);
                System.out.println(cpp.generate());
            }



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
