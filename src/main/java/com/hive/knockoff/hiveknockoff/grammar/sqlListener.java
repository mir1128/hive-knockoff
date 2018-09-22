// Generated from sql.g4 by ANTLR 4.7.1
package com.hive.knockoff.hiveknockoff.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParser}.
 */
public interface sqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(sqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(sqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(sqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(sqlParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(sqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(sqlParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(sqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(sqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(sqlParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(sqlParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(sqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(sqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(sqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(sqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(sqlParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(sqlParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(sqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(sqlParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(sqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(sqlParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(sqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(sqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(sqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(sqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(sqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(sqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(sqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(sqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(sqlParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(sqlParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(sqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(sqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(sqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(sqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(sqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(sqlParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(sqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(sqlParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(sqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(sqlParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(sqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(sqlParser.KeywordContext ctx);
}