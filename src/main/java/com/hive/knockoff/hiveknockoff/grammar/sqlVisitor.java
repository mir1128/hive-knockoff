// Generated from sql.g4 by ANTLR 4.7.1
package com.hive.knockoff.hiveknockoff.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(sqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(sqlParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(sqlParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(sqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(sqlParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(sqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(sqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(sqlParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(sqlParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(sqlParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(sqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(sqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(sqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(sqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(sqlParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(sqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(sqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(sqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(sqlParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(sqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(sqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(sqlParser.KeywordContext ctx);
}