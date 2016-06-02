// Generated from nottex.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link nottexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface nottexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link nottexParser#markupText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkupText(nottexParser.MarkupTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(nottexParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#tagUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagUse(nottexParser.TagUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#tagIdens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagIdens(nottexParser.TagIdensContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(nottexParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(nottexParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArg(nottexParser.StringArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArg(nottexParser.ExpressionArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArg(nottexParser.FunctionCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubtract(nottexParser.ExprSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(nottexParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(nottexParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(nottexParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDivis}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivis(nottexParser.ExprDivisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubSubExpr}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSubExpr(nottexParser.SubSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultip}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultip(nottexParser.ExprMultipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link nottexParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParens(nottexParser.ExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link nottexParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(nottexParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(nottexParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link nottexParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(nottexParser.WsContext ctx);
}