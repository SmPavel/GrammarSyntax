// Generated from C:/Users/user/Documents/java projects/GrammarSyntax/src/main/java/org/example\CSyntax.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSyntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSyntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericAtomExp(CSyntaxParser.NumericAtomExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExp(CSyntaxParser.PowerExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExp(CSyntaxParser.MulDivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExp(CSyntaxParser.ParenthesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtomExp(CSyntaxParser.IdAtomExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExp(CSyntaxParser.AddSubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link CSyntaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExp(CSyntaxParser.FunctionExpContext ctx);
}