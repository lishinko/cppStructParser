/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cppstructparser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;
/**
 *
 * @author lixg
 */
public class CppStructParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String curPath = System.getProperty("user.dir");
        curPath += "\\struct.cpp";
        
        ANTLRInputStream input = new ANTLRInputStream(new FileReader(curPath));
        structLexer lexer = new structLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        structParser parser = new structParser(tokens);
        ParseTree tree = parser.structDefine();
        
        fieldsVisitor visitor = new fieldsVisitor();
        visitor.visit(tree);
        
        System.out.println(tree.toStringTree(parser));
    }
}
