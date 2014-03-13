package com.woyao.XinggangLi;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.woyao.XinggangLi.parser.*;

import com.woyao.XinggangLi.rules.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        String curPath = System.getProperty("user.dir");
        curPath += "\\struct.cpp";

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(curPath));
        structLexer lexer = new structLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        structParser parser = new structParser(tokens);
        try{
            ParseTree tree = parser.structDefine();

            ParseTreeWalker walker = new ParseTreeWalker();
            structFieldsExtractor listener = new structFieldsExtractor();
            walker.walk(listener, tree);
            //System.out.println(listener.);

            for(Map.Entry<structParser.StructDefineContext, structFieldsExtractor.structInfo> entry : listener.getGeneratedMethods().entrySet()) {
                System.out.println(entry.getValue().fullQualifiedName);
                for(String fieldName : entry.getValue().fieldNames) {
                    System.out.println("    " + fieldName);
                }
                System.out.println("    ");
            }

            System.out.println(tree.toStringTree(parser));
        }
        catch(RecognitionException ex)
        {
            ex.printStackTrace();
        }
        //怎么回事？intellij对直接的"hello world"会提示class or interfaces expected,只好改成这样子，它提示一个警告，不管了
        //System.out.println( new String("hello world"));

    }
}
