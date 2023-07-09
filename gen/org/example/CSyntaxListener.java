// Generated from C:/Users/user/Documents/java projects/GrammarSyntax/src/main/java/org/example\CSyntax.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSyntaxParser}.
 */
public interface CSyntaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtomExp(CSyntaxParser.NumericAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtomExp(CSyntaxParser.NumericAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExp(CSyntaxParser.PowerExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExp(CSyntaxParser.PowerExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(CSyntaxParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(CSyntaxParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(CSyntaxParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(CSyntaxParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdAtomExp(CSyntaxParser.IdAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdAtomExp(CSyntaxParser.IdAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(CSyntaxParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(CSyntaxParser.AddSubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExp(CSyntaxParser.FunctionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExp(CSyntaxParser.FunctionExpContext ctx);
}