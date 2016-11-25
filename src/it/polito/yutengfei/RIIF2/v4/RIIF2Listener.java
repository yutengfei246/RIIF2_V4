// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_V4/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2.v4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RIIF2Parser}.
 */
public interface RIIF2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclarator(RIIF2Parser.ImposeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclarator(RIIF2Parser.ImposeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclaratorId(RIIF2Parser.ImposeDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclaratorId(RIIF2Parser.ImposeDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterImposeInitializer(RIIF2Parser.ImposeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitImposeInitializer(RIIF2Parser.ImposeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(RIIF2Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(RIIF2Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void enterListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void exitListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(RIIF2Parser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(RIIF2Parser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDeclaration(RIIF2Parser.AssignmentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDeclaration(RIIF2Parser.AssignmentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDeclarator(RIIF2Parser.AssignmentDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDeclarator(RIIF2Parser.AssignmentDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDeclaratorId(RIIF2Parser.AssignmentDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDeclaratorId(RIIF2Parser.AssignmentDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentVariableId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentVariableId(RIIF2Parser.AssignmentVariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentVariableId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentVariableId(RIIF2Parser.AssignmentVariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentVariableAttributeId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentVariableAttributeId(RIIF2Parser.AssignmentVariableAttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentVariableAttributeId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentVariableAttributeId(RIIF2Parser.AssignmentVariableAttributeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentInitializer(RIIF2Parser.AssignmentInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentInitializer(RIIF2Parser.AssignmentInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(RIIF2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(RIIF2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeDeclaratorId(RIIF2Parser.AssociativeDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeDeclaratorId(RIIF2Parser.AssociativeDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeInstanceId}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeInstanceId(RIIF2Parser.AssociativeInstanceIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeInstanceId}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeInstanceId(RIIF2Parser.AssociativeInstanceIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(RIIF2Parser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(RIIF2Parser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractType}.
	 * @param ctx the parse tree
	 */
	void enterAbstractType(RIIF2Parser.AbstractTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractType}.
	 * @param ctx the parse tree
	 */
	void exitAbstractType(RIIF2Parser.AbstractTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RIIF2Parser.LiteralContext ctx);
}