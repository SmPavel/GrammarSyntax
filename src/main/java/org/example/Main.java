package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String inputCode = "1 + 2 * (3 - 4) / 5";

        CSyntaxLexer lexer = new CSyntaxLexer(CharStreams.fromString(inputCode));
        CSyntaxParser parser = new CSyntaxParser(new CommonTokenStream(lexer));

        parser.setBuildParseTree(true);
        CSyntaxParser.ExpressionContext parseTree = parser.expression();

        CustomVisitor visitor = new CustomVisitor();

        visitor.visit(parseTree);
    }
}