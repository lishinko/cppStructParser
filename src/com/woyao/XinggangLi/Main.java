package com.woyao.XinggangLi;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.woyao.XinggangLi.parser.*;

import java.io.FileReader;
import java.io.IOException;

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

            fieldsVisitor visitor = new fieldsVisitor();
            visitor.visit(tree);

            System.out.println(tree.toStringTree(parser));
        }
        catch(RecognitionException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("hello world");

    }
}
