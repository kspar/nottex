// Generated from C:/Users/Kaspar/Dropbox/CODE/Java/akt2016/nottex/src/main/antlr\nottex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nottexParser}.
 */
public interface nottexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link nottexParser#markupText}.
	 * @param ctx the parse tree
	 */
	void enterMarkupText(nottexParser.MarkupTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#markupText}.
	 * @param ctx the parse tree
	 */
	void exitMarkupText(nottexParser.MarkupTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(nottexParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(nottexParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#tagUse}.
	 * @param ctx the parse tree
	 */
	void enterTagUse(nottexParser.TagUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#tagUse}.
	 * @param ctx the parse tree
	 */
	void exitTagUse(nottexParser.TagUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#tagIdens}.
	 * @param ctx the parse tree
	 */
	void enterTagIdens(nottexParser.TagIdensContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#tagIdens}.
	 * @param ctx the parse tree
	 */
	void exitTagIdens(nottexParser.TagIdensContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(nottexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(nottexParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(nottexParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(nottexParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(nottexParser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(nottexParser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(nottexParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(nottexParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(nottexParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(nottexParser.WsContext ctx);
}