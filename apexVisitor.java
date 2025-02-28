// Generated from apex.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link apexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface apexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link apexParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(apexParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(apexParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(apexParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(apexParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(apexParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(apexParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(apexParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(apexParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(apexParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(apexParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(apexParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(apexParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(apexParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(apexParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(apexParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(apexParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(apexParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(apexParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(apexParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(apexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(apexParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(apexParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(apexParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(apexParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(apexParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(apexParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(apexParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#propertyBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBodyDeclaration(apexParser.PropertyBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(apexParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(apexParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(apexParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(apexParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(apexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(apexParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(apexParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(apexParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(apexParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(apexParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(apexParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(apexParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(apexParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(apexParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(apexParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(apexParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(apexParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(apexParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(apexParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(apexParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(apexParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(apexParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(apexParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(apexParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(apexParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(apexParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(apexParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(apexParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(apexParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(apexParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(apexParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(apexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(apexParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(apexParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(apexParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(apexParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(apexParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(apexParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(apexParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(apexParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(apexParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(apexParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(apexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(apexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(apexParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#propertyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBlock(apexParser.PropertyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(apexParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(apexParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(apexParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(apexParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(apexParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(apexParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(apexParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(apexParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(apexParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(apexParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(apexParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(apexParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(apexParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(apexParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(apexParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(apexParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#apexDbUpsertExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApexDbUpsertExpression(apexParser.ApexDbUpsertExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#apexDbExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApexDbExpression(apexParser.ApexDbExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(apexParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(apexParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(apexParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(apexParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(apexParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(apexParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCreatorRest(apexParser.MapCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCreatorRest(apexParser.SetCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(apexParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(apexParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(apexParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(apexParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(apexParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(apexParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(apexParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link apexParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(apexParser.ArgumentsContext ctx);
}