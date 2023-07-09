package org.example;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

public class CustomVisitor extends CSyntaxBaseVisitor<Tree> {
    private int indentLevel = 0;

    private void printIndent() {
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("  ");
        }
    }

    @Override
    public Tree visitAddSubExp(CSyntaxParser.AddSubExpContext ctx) {
        printIndent();
        System.out.println("Expression: " + ctx.getText());
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitParenthesisExp(CSyntaxParser.ParenthesisExpContext ctx) {
        printIndent();
        System.out.println("parenthesisExp");
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitMulDivExp(CSyntaxParser.MulDivExpContext ctx) {
        printIndent();
        System.out.println("mulDivExp");
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitPowerExp(CSyntaxParser.PowerExpContext ctx) {
        printIndent();
        System.out.println("powerExp");
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitNumericAtomExp(CSyntaxParser.NumericAtomExpContext ctx) {
        printIndent();
        System.out.println("numericAtomExp");
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitFunctionExp(CSyntaxParser.FunctionExpContext ctx) {
        printIndent();
        System.out.println("functionExp");
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitIdAtomExp(CSyntaxParser.IdAtomExpContext ctx) {
        printIndent();
        System.out.println("idAtomExp");
        indentLevel++;
        Tree result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Tree visitTerminal(TerminalNode node) {
        printIndent();
        System.out.println(node.getText());
        return null;
    }
}