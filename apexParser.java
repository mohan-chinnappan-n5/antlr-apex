// Generated from apex.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class apexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SoqlLiteral=2, OVERRIDE=3, VIRTUAL=4, SET=5, GET=6, ABSTRACT=7, 
		BREAK=8, BYTE=9, CATCH=10, CHAR=11, CLASS=12, CONST=13, CONTINUE=14, DEFAULT=15, 
		DO=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FLOAT=22, FOR=23, 
		IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, INT=29, INTERFACE=30, 
		NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, RETURN=37, 
		SHORT=38, STATIC=39, SUPER=40, SYNCHRONIZED=41, THIS=42, THROW=43, THROWS=44, 
		TRANSIENT=45, TRY=46, VOID=47, VOLATILE=48, WHILE=49, GLOBAL=50, WEBSERVICE=51, 
		APEX_WITH_SHARING=52, APEX_WITHOUT_SHARING=53, SELECT=54, DB_INSERT=55, 
		DB_UPSERT=56, DB_UPDATE=57, DB_DELETE=58, DB_UNDELETE=59, TESTMETHOD=60, 
		RUNAS=61, IntegerLiteral=62, FloatingPointLiteral=63, BooleanLiteral=64, 
		CharacterLiteral=65, StringLiteral=66, NullLiteral=67, LPAREN=68, RPAREN=69, 
		LBRACE=70, RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, COMMA=75, DOT=76, 
		ASSIGN=77, GT=78, LT=79, BANG=80, TILDE=81, QUESTION=82, COLON=83, EQUAL=84, 
		LE=85, GE=86, NOTEQUAL=87, AND=88, OR=89, INC=90, DEC=91, ADD=92, SUB=93, 
		MUL=94, DIV=95, BITAND=96, BITOR=97, CARET=98, MOD=99, ADD_ASSIGN=100, 
		SUB_ASSIGN=101, MUL_ASSIGN=102, DIV_ASSIGN=103, AND_ASSIGN=104, OR_ASSIGN=105, 
		XOR_ASSIGN=106, MOD_ASSIGN=107, LSHIFT_ASSIGN=108, RSHIFT_ASSIGN=109, 
		URSHIFT_ASSIGN=110, LAMBDA_LIKE=111, Identifier=112, AT=113, ELLIPSIS=114, 
		WS=115, APEXDOC_COMMENT=116, APEXDOC_COMMENT_START=117, COMMENT=118, COMMENT_START=119, 
		LINE_COMMENT=120, QUOTE=121;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_propertyDeclaration = 26, 
		RULE_propertyBodyDeclaration = 27, RULE_interfaceBodyDeclaration = 28, 
		RULE_interfaceMemberDeclaration = 29, RULE_constDeclaration = 30, RULE_constantDeclarator = 31, 
		RULE_interfaceMethodDeclaration = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, 
		RULE_variableInitializer = 37, RULE_arrayInitializer = 38, RULE_enumConstantName = 39, 
		RULE_type_ = 40, RULE_classOrInterfaceType = 41, RULE_primitiveType = 42, 
		RULE_typeArguments = 43, RULE_typeArgument = 44, RULE_qualifiedNameList = 45, 
		RULE_formalParameters = 46, RULE_formalParameterList = 47, RULE_formalParameter = 48, 
		RULE_lastFormalParameter = 49, RULE_methodBody = 50, RULE_constructorBody = 51, 
		RULE_qualifiedName = 52, RULE_literal = 53, RULE_annotation = 54, RULE_annotationName = 55, 
		RULE_elementValuePairs = 56, RULE_elementValuePair = 57, RULE_elementValue = 58, 
		RULE_elementValueArrayInitializer = 59, RULE_annotationTypeDeclaration = 60, 
		RULE_annotationTypeBody = 61, RULE_annotationTypeElementDeclaration = 62, 
		RULE_annotationTypeElementRest = 63, RULE_annotationMethodOrConstantRest = 64, 
		RULE_annotationMethodRest = 65, RULE_annotationConstantRest = 66, RULE_defaultValue = 67, 
		RULE_block = 68, RULE_blockStatement = 69, RULE_localVariableDeclarationStatement = 70, 
		RULE_localVariableDeclaration = 71, RULE_statement = 72, RULE_propertyBlock = 73, 
		RULE_getter = 74, RULE_setter = 75, RULE_catchClause = 76, RULE_catchType = 77, 
		RULE_finallyBlock = 78, RULE_resourceSpecification = 79, RULE_resources = 80, 
		RULE_resource = 81, RULE_forControl = 82, RULE_forInit = 83, RULE_enhancedForControl = 84, 
		RULE_forUpdate = 85, RULE_parExpression = 86, RULE_expressionList = 87, 
		RULE_statementExpression = 88, RULE_constantExpression = 89, RULE_apexDbUpsertExpression = 90, 
		RULE_apexDbExpression = 91, RULE_expression = 92, RULE_primary = 93, RULE_creator = 94, 
		RULE_createdName = 95, RULE_innerCreator = 96, RULE_arrayCreatorRest = 97, 
		RULE_mapCreatorRest = 98, RULE_setCreatorRest = 99, RULE_classCreatorRest = 100, 
		RULE_explicitGenericInvocation = 101, RULE_nonWildcardTypeArguments = 102, 
		RULE_typeArgumentsOrDiamond = 103, RULE_nonWildcardTypeArgumentsOrDiamond = 104, 
		RULE_superSuffix = 105, RULE_explicitGenericInvocationSuffix = 106, RULE_arguments = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
			"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
			"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
			"genericConstructorDeclaration", "fieldDeclaration", "propertyDeclaration", 
			"propertyBodyDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "enumConstantName", 
			"type_", "classOrInterfaceType", "primitiveType", "typeArguments", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "methodBody", "constructorBody", "qualifiedName", 
			"literal", "annotation", "annotationName", "elementValuePairs", "elementValuePair", 
			"elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "statement", "propertyBlock", "getter", "setter", 
			"catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "forControl", "forInit", "enhancedForControl", 
			"forUpdate", "parExpression", "expressionList", "statementExpression", 
			"constantExpression", "apexDbUpsertExpression", "apexDbExpression", "expression", 
			"primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"mapCreatorRest", "setCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
			"superSuffix", "explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<>'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'=>'", null, "'@'", "'...'", null, null, "'/**'", 
			null, "'/*'", null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SoqlLiteral", "OVERRIDE", "VIRTUAL", "SET", "GET", "ABSTRACT", 
			"BREAK", "BYTE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
			"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "GLOBAL", "WEBSERVICE", 
			"APEX_WITH_SHARING", "APEX_WITHOUT_SHARING", "SELECT", "DB_INSERT", "DB_UPSERT", 
			"DB_UPDATE", "DB_DELETE", "DB_UNDELETE", "TESTMETHOD", "RUNAS", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"LAMBDA_LIKE", "Identifier", "AT", "ELLIPSIS", "WS", "APEXDOC_COMMENT", 
			"APEXDOC_COMMENT_START", "COMMENT", "COMMENT_START", "LINE_COMMENT", 
			"QUOTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "apex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public apexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(apexParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(216);
				packageDeclaration();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(219);
				importDeclaration();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169810674299441304L) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(225);
				typeDeclaration();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(apexParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(233);
				annotation();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(PACKAGE);
			setState(240);
			qualifiedName();
			setState(241);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(apexParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(apexParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(apexParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IMPORT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(244);
				match(STATIC);
				}
			}

			setState(247);
			qualifiedName();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(248);
				match(DOT);
				setState(249);
				match(MUL);
				}
			}

			setState(252);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169810673225433240L) != 0) || _la==AT) {
					{
					{
					setState(254);
					classOrInterfaceModifier();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169810673225433240L) != 0) || _la==AT) {
					{
					{
					setState(261);
					classOrInterfaceModifier();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169810673225433240L) != 0) || _la==AT) {
					{
					{
					setState(268);
					classOrInterfaceModifier();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(281);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(apexParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(apexParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(apexParser.TRANSIENT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case VIRTUAL:
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case GLOBAL:
			case WEBSERVICE:
			case APEX_WITH_SHARING:
			case APEX_WITHOUT_SHARING:
			case TESTMETHOD:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(TRANSIENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(apexParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(apexParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(apexParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(apexParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(apexParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(apexParser.FINAL, 0); }
		public TerminalNode GLOBAL() { return getToken(apexParser.GLOBAL, 0); }
		public TerminalNode WEBSERVICE() { return getToken(apexParser.WEBSERVICE, 0); }
		public TerminalNode OVERRIDE() { return getToken(apexParser.OVERRIDE, 0); }
		public TerminalNode VIRTUAL() { return getToken(apexParser.VIRTUAL, 0); }
		public TerminalNode TESTMETHOD() { return getToken(apexParser.TESTMETHOD, 0); }
		public TerminalNode APEX_WITH_SHARING() { return getToken(apexParser.APEX_WITH_SHARING, 0); }
		public TerminalNode APEX_WITHOUT_SHARING() { return getToken(apexParser.APEX_WITHOUT_SHARING, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				match(FINAL);
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				match(GLOBAL);
				}
				break;
			case WEBSERVICE:
				enterOuterAlt(_localctx, 9);
				{
				setState(299);
				match(WEBSERVICE);
				}
				break;
			case OVERRIDE:
				enterOuterAlt(_localctx, 10);
				{
				setState(300);
				match(OVERRIDE);
				}
				break;
			case VIRTUAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(301);
				match(VIRTUAL);
				}
				break;
			case TESTMETHOD:
				enterOuterAlt(_localctx, 12);
				{
				setState(302);
				match(TESTMETHOD);
				}
				break;
			case APEX_WITH_SHARING:
				enterOuterAlt(_localctx, 13);
				{
				setState(303);
				match(APEX_WITH_SHARING);
				}
				break;
			case APEX_WITHOUT_SHARING:
				enterOuterAlt(_localctx, 14);
				{
				setState(304);
				match(APEX_WITHOUT_SHARING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(apexParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(apexParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(apexParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(CLASS);
			setState(312);
			match(Identifier);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(313);
				typeParameters();
				}
			}

			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(316);
				match(EXTENDS);
				setState(317);
				type_();
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(320);
				match(IMPLEMENTS);
				setState(321);
				typeList();
				}
			}

			setState(324);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LT);
			setState(327);
			typeParameter();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				typeParameter();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Identifier);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(338);
				match(EXTENDS);
				setState(339);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(apexParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(apexParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			type_();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(343);
				match(BITAND);
				setState(344);
				type_();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(apexParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(apexParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(apexParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(ENUM);
			setState(351);
			match(Identifier);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(352);
				match(IMPLEMENTS);
				setState(353);
				typeList();
				}
			}

			setState(356);
			match(LBRACE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(357);
				enumConstants();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(360);
				match(COMMA);
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(363);
				enumBodyDeclarations();
				}
			}

			setState(366);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			enumConstant();
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					match(COMMA);
					setState(370);
					enumConstant();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(376);
				annotation();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(Identifier);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(383);
				arguments();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(386);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(SEMI);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169989072749599416L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 13194139533841L) != 0)) {
				{
				{
				setState(390);
				classBodyDeclaration();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(apexParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(INTERFACE);
			setState(397);
			match(Identifier);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(398);
				typeParameters();
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(401);
				match(EXTENDS);
				setState(402);
				typeList();
				}
			}

			setState(405);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			type_();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408);
				match(COMMA);
				setState(409);
				type_();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LBRACE);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169989072749599416L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 13194139533841L) != 0)) {
				{
				{
				setState(416);
				classBodyDeclaration();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(LBRACE);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169989072749599416L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 824633720865L) != 0)) {
				{
				{
				setState(425);
				interfaceBodyDeclaration();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(apexParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(434);
					match(STATIC);
					}
				}

				setState(437);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(438);
						modifier();
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(444);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(455);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(456);
				propertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(apexParser.VOID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TerminalNode OVERRIDE() { return getToken(apexParser.OVERRIDE, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(apexParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(459);
				match(OVERRIDE);
				}
			}

			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				{
				setState(462);
				type_();
				}
				break;
			case VOID:
				{
				setState(463);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			match(Identifier);
			setState(467);
			formalParameters();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(468);
				match(LBRACK);
				setState(469);
				match(RBRACK);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(475);
				match(THROWS);
				setState(476);
				qualifiedNameList();
				}
			}

			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(479);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(480);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			typeParameters();
			setState(484);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(apexParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(Identifier);
			setState(487);
			formalParameters();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(488);
				match(THROWS);
				setState(489);
				qualifiedNameList();
				}
			}

			setState(492);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			typeParameters();
			setState(495);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			type_();
			setState(498);
			variableDeclarators();
			setState(499);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public PropertyBodyDeclarationContext propertyBodyDeclaration() {
			return getRuleContext(PropertyBodyDeclarationContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			type_();
			setState(502);
			variableDeclarators();
			setState(503);
			propertyBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public List<PropertyBlockContext> propertyBlock() {
			return getRuleContexts(PropertyBlockContext.class);
		}
		public PropertyBlockContext propertyBlock(int i) {
			return getRuleContext(PropertyBlockContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public PropertyBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPropertyBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPropertyBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitPropertyBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBodyDeclarationContext propertyBodyDeclaration() throws RecognitionException {
		PropertyBodyDeclarationContext _localctx = new PropertyBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_propertyBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LBRACE);
			setState(506);
			propertyBlock();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169848058768261368L) != 0) || _la==AT) {
				{
				setState(507);
				propertyBlock();
				}
			}

			setState(510);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case VIRTUAL:
			case SET:
			case ABSTRACT:
			case BYTE:
			case CHAR:
			case CLASS:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case GLOBAL:
			case WEBSERVICE:
			case APEX_WITH_SHARING:
			case APEX_WITHOUT_SHARING:
			case TESTMETHOD:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(512);
						modifier();
						}
						} 
					}
					setState(517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(518);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMemberDeclaration);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(527);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(528);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			type_();
			setState(532);
			constantDeclarator();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(533);
				match(COMMA);
				setState(534);
				constantDeclarator();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Identifier);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(543);
				match(LBRACK);
				setState(544);
				match(RBRACK);
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(ASSIGN);
			setState(551);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(apexParser.VOID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(apexParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				{
				setState(553);
				type_();
				}
				break;
			case VOID:
				{
				setState(554);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
			match(Identifier);
			setState(558);
			formalParameters();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(559);
				match(LBRACK);
				setState(560);
				match(RBRACK);
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(566);
				match(THROWS);
				setState(567);
				qualifiedNameList();
				}
			}

			setState(570);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			typeParameters();
			setState(573);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			variableDeclarator();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(576);
				match(COMMA);
				setState(577);
				variableDeclarator();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			variableDeclaratorId();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(584);
				match(ASSIGN);
				setState(585);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(Identifier);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(589);
				match(LBRACK);
				setState(590);
				match(RBRACK);
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				arrayInitializer();
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(LBRACE);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573087L) != 0)) {
				{
				setState(601);
				variableInitializer();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						match(COMMA);
						setState(603);
						variableInitializer();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(609);
					match(COMMA);
					}
				}

				}
			}

			setState(614);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_type_);
		try {
			int _alt;
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				classOrInterfaceType();
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(619);
						match(LBRACK);
						setState(620);
						match(RBRACK);
						}
						} 
					}
					setState(625);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				break;
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				primitiveType();
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627);
						match(LBRACK);
						setState(628);
						match(RBRACK);
						}
						} 
					}
					setState(633);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(apexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(apexParser.DOT, i);
		}
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classOrInterfaceType);
		try {
			int _alt;
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(Identifier);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(637);
					typeArguments();
					}
					break;
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(640);
						match(DOT);
						setState(641);
						match(Identifier);
						setState(643);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
						case 1:
							{
							setState(642);
							typeArguments();
							}
							break;
						}
						}
						} 
					}
					setState(649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(SET);
				setState(651);
				typeArguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(apexParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(apexParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(apexParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(apexParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(apexParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 275418974720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(LT);
			setState(657);
			typeArgument();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(658);
				match(COMMA);
				setState(659);
				typeArgument();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode QUESTION() { return getToken(apexParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeArgument);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				type_();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(QUESTION);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(669);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(670);
					type_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			qualifiedName();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(676);
				match(COMMA);
				setState(677);
				qualifiedName();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(LPAREN);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275420023328L) != 0) || _la==Identifier || _la==AT) {
				{
				setState(684);
				formalParameterList();
				}
			}

			setState(687);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				formalParameter();
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(690);
						match(COMMA);
						setState(691);
						formalParameter();
						}
						} 
					}
					setState(696);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(697);
					match(COMMA);
					setState(698);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(704);
				variableModifier();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			type_();
			setState(711);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(apexParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(713);
				variableModifier();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			type_();
			setState(720);
			match(ELLIPSIS);
			setState(721);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(apexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(apexParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(Identifier);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(728);
					match(DOT);
					setState(729);
					match(Identifier);
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(apexParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(apexParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(apexParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(apexParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(apexParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(apexParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(apexParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(AT);
			setState(738);
			annotationName();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(739);
				match(LPAREN);
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(740);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(741);
					elementValue();
					}
					break;
				}
				setState(744);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			elementValuePair();
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==Identifier) {
				{
				{
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(750);
					match(COMMA);
					}
				}

				setState(753);
				elementValuePair();
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(Identifier);
			setState(760);
			match(ASSIGN);
			setState(761);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValue);
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(LBRACE);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 844425936994399L) != 0)) {
				{
				setState(769);
				elementValue();
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(770);
						match(COMMA);
						setState(771);
						elementValue();
						}
						} 
					}
					setState(776);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
			}

			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(779);
				match(COMMA);
				}
			}

			setState(782);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(apexParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(apexParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(AT);
			setState(785);
			match(INTERFACE);
			setState(786);
			match(Identifier);
			setState(787);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(LBRACE);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169848335261244088L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 824633720833L) != 0)) {
				{
				{
				setState(790);
				annotationTypeElementDeclaration();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case VIRTUAL:
			case SET:
			case ABSTRACT:
			case BYTE:
			case CHAR:
			case CLASS:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case SYNCHRONIZED:
			case TRANSIENT:
			case GLOBAL:
			case WEBSERVICE:
			case APEX_WITH_SHARING:
			case APEX_WITHOUT_SHARING:
			case TESTMETHOD:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(798);
						modifier();
						}
						} 
					}
					setState(803);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(804);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeElementRest);
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				type_();
				setState(809);
				annotationMethodOrConstantRest();
				setState(810);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				classDeclaration();
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(813);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				interfaceDeclaration();
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(817);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(820);
				enumDeclaration();
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(821);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(824);
				annotationTypeDeclaration();
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(825);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodOrConstantRest);
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(Identifier);
			setState(835);
			match(LPAREN);
			setState(836);
			match(RPAREN);
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(837);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(apexParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(DEFAULT);
			setState(843);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(LBRACE);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -18350860311110724L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 844425936995423L) != 0)) {
				{
				{
				setState(846);
				blockStatement();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_blockStatement);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			localVariableDeclaration();
			setState(860);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(862);
				variableModifier();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			type_();
			setState(869);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(apexParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(apexParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(apexParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(apexParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(apexParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TerminalNode RUNAS() { return getToken(apexParser.RUNAS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TRY() { return getToken(apexParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(apexParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(apexParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(apexParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(apexParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(apexParser.COLON, 0); }
		public ApexDbExpressionContext apexDbExpression() {
			return getRuleContext(ApexDbExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_statement);
		int _la;
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(IF);
				setState(873);
				parExpression();
				setState(874);
				statement();
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(875);
					match(ELSE);
					setState(876);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				match(FOR);
				setState(880);
				match(LPAREN);
				setState(881);
				forControl();
				setState(882);
				match(RPAREN);
				setState(883);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				match(WHILE);
				setState(886);
				parExpression();
				setState(887);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(889);
				match(DO);
				setState(890);
				statement();
				setState(891);
				match(WHILE);
				setState(892);
				parExpression();
				setState(893);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(895);
				match(RUNAS);
				setState(896);
				match(LPAREN);
				setState(897);
				expression(0);
				setState(898);
				match(RPAREN);
				setState(899);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(901);
				match(TRY);
				setState(902);
				block();
				setState(912);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(904); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(903);
						catchClause();
						}
						}
						setState(906); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(908);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(911);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(914);
				match(TRY);
				setState(915);
				resourceSpecification();
				setState(916);
				block();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(917);
					catchClause();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(923);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(926);
				match(RETURN);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
					{
					setState(927);
					expression(0);
					}
				}

				setState(930);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(931);
				match(THROW);
				setState(932);
				expression(0);
				setState(933);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(935);
				match(BREAK);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(936);
					match(Identifier);
					}
				}

				setState(939);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(940);
				match(CONTINUE);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(941);
					match(Identifier);
					}
				}

				setState(944);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(945);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(946);
				statementExpression();
				setState(947);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(949);
				match(Identifier);
				setState(950);
				match(COLON);
				setState(951);
				statement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(952);
				apexDbExpression();
				setState(953);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBlockContext extends ParserRuleContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PropertyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPropertyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPropertyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitPropertyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBlockContext propertyBlock() throws RecognitionException {
		PropertyBlockContext _localctx = new PropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_propertyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1169848058768261272L) != 0) || _la==AT) {
				{
				{
				setState(957);
				modifier();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(963);
				getter();
				}
				break;
			case SET:
				{
				setState(964);
				setter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(apexParser.GET, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(GET);
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(968);
				match(SEMI);
				}
				break;
			case LBRACE:
				{
				setState(969);
				methodBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(SET);
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(973);
				match(SEMI);
				}
				break;
			case LBRACE:
				{
				setState(974);
				methodBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(apexParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(CATCH);
			setState(978);
			match(LPAREN);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(979);
				variableModifier();
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			catchType();
			setState(986);
			match(Identifier);
			setState(987);
			match(RPAREN);
			setState(988);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(apexParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(apexParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			qualifiedName();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(991);
				match(BITOR);
				setState(992);
				qualifiedName();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(apexParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(FINALLY);
			setState(999);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(LPAREN);
			setState(1002);
			resources();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1003);
				match(SEMI);
				}
			}

			setState(1006);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(apexParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(apexParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			resource();
			setState(1013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1009);
					match(SEMI);
					setState(1010);
					resource();
					}
					} 
				}
				setState(1015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1016);
				variableModifier();
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022);
			classOrInterfaceType();
			setState(1023);
			variableDeclaratorId();
			setState(1024);
			match(ASSIGN);
			setState(1025);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(apexParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(apexParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forControl);
		int _la;
		try {
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503665903068L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 844425936994335L) != 0)) {
					{
					setState(1028);
					forInit();
					}
				}

				setState(1031);
				match(SEMI);
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
					{
					setState(1032);
					expression(0);
					}
				}

				setState(1035);
				match(SEMI);
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
					{
					setState(1036);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_forInit);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(apexParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1045);
				variableModifier();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051);
			type_();
			setState(1052);
			variableDeclaratorId();
			setState(1053);
			match(COLON);
			setState(1054);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(LPAREN);
			setState(1059);
			expression(0);
			setState(1060);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			expression(0);
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1063);
				match(COMMA);
				setState(1064);
				expression(0);
				}
				}
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApexDbUpsertExpressionContext extends ParserRuleContext {
		public TerminalNode DB_UPSERT() { return getToken(apexParser.DB_UPSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ApexDbUpsertExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apexDbUpsertExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterApexDbUpsertExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitApexDbUpsertExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitApexDbUpsertExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApexDbUpsertExpressionContext apexDbUpsertExpression() throws RecognitionException {
		ApexDbUpsertExpressionContext _localctx = new ApexDbUpsertExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_apexDbUpsertExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(DB_UPSERT);
			setState(1075);
			expression(0);
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
				{
				{
				setState(1076);
				expression(0);
				}
				}
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApexDbExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DB_INSERT() { return getToken(apexParser.DB_INSERT, 0); }
		public TerminalNode DB_UPDATE() { return getToken(apexParser.DB_UPDATE, 0); }
		public TerminalNode DB_DELETE() { return getToken(apexParser.DB_DELETE, 0); }
		public TerminalNode DB_UNDELETE() { return getToken(apexParser.DB_UNDELETE, 0); }
		public ApexDbUpsertExpressionContext apexDbUpsertExpression() {
			return getRuleContext(ApexDbUpsertExpressionContext.class,0);
		}
		public ApexDbExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apexDbExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterApexDbExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitApexDbExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitApexDbExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApexDbExpressionContext apexDbExpression() throws RecognitionException {
		ApexDbExpressionContext _localctx = new ApexDbExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_apexDbExpression);
		int _la;
		try {
			setState(1085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DB_INSERT:
			case DB_UPDATE:
			case DB_DELETE:
			case DB_UNDELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1044835113549955072L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1083);
				expression(0);
				}
				break;
			case DB_UPSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				apexDbUpsertExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NEW() { return getToken(apexParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(apexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(apexParser.SUB, 0); }
		public TerminalNode INC() { return getToken(apexParser.INC, 0); }
		public TerminalNode DEC() { return getToken(apexParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(apexParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(apexParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(apexParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(apexParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(apexParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(apexParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(apexParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(apexParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(apexParser.GT, i);
		}
		public TerminalNode LE() { return getToken(apexParser.LE, 0); }
		public TerminalNode GE() { return getToken(apexParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(apexParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(apexParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(apexParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(apexParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(apexParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(apexParser.AND, 0); }
		public TerminalNode OR() { return getToken(apexParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(apexParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(apexParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(apexParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(apexParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(apexParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(apexParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(apexParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(apexParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(apexParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(apexParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(apexParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(apexParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(apexParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode GET() { return getToken(apexParser.GET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(apexParser.THIS, 0); }
		public TerminalNode DB_INSERT() { return getToken(apexParser.DB_INSERT, 0); }
		public TerminalNode DB_UPSERT() { return getToken(apexParser.DB_UPSERT, 0); }
		public TerminalNode DB_UPDATE() { return getToken(apexParser.DB_UPDATE, 0); }
		public TerminalNode DB_DELETE() { return getToken(apexParser.DB_DELETE, 0); }
		public TerminalNode DB_UNDELETE() { return getToken(apexParser.DB_UNDELETE, 0); }
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(apexParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(apexParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(apexParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1088);
				primary();
				}
				break;
			case 2:
				{
				setState(1089);
				match(NEW);
				setState(1090);
				creator();
				}
				break;
			case 3:
				{
				setState(1091);
				match(LPAREN);
				setState(1092);
				type_();
				setState(1093);
				match(RPAREN);
				setState(1094);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1096);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1097);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1098);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1099);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1103);
						_la = _input.LA(1);
						if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 35L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1104);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1106);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1107);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1116);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1109);
							match(LT);
							setState(1110);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1111);
							match(GT);
							setState(1112);
							match(GT);
							setState(1113);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1114);
							match(GT);
							setState(1115);
							match(GT);
							}
							break;
						}
						setState(1118);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1119);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1120);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 387L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1121);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1123);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1124);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1126);
						match(BITAND);
						setState(1127);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1129);
						match(CARET);
						setState(1130);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1132);
						match(BITOR);
						setState(1133);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1135);
						match(AND);
						setState(1136);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1138);
						match(OR);
						setState(1139);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1141);
						match(QUESTION);
						setState(1142);
						expression(0);
						setState(1143);
						match(COLON);
						setState(1144);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1147);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 17171480577L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1148);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1150);
						match(DOT);
						setState(1151);
						match(GET);
						setState(1152);
						match(LPAREN);
						setState(1154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
							{
							setState(1153);
							expressionList();
							}
						}

						setState(1156);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1158);
						match(DOT);
						setState(1159);
						match(SET);
						setState(1160);
						match(LPAREN);
						setState(1162);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
							{
							setState(1161);
							expressionList();
							}
						}

						setState(1164);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1165);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(1166);
							match(QUESTION);
							}
						}

						setState(1169);
						match(DOT);
						setState(1170);
						match(Identifier);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1171);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1172);
						match(DOT);
						setState(1173);
						match(THIS);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1175);
						match(DOT);
						setState(1176);
						match(NEW);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1178);
						match(DOT);
						setState(1179);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1180);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1181);
						match(DOT);
						setState(1182);
						match(SUPER);
						setState(1183);
						superSuffix();
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1185);
						match(DOT);
						setState(1186);
						explicitGenericInvocation();
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1188);
						match(LBRACK);
						setState(1189);
						expression(0);
						setState(1190);
						match(RBRACK);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1192);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1193);
						match(LPAREN);
						setState(1195);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
							{
							setState(1194);
							expressionList();
							}
						}

						setState(1197);
						match(RPAREN);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1199);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1200);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1201);
						match(INSTANCEOF);
						setState(1202);
						type_();
						}
						break;
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(apexParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(apexParser.CLASS, 0); }
		public TerminalNode VOID() { return getToken(apexParser.VOID, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SoqlLiteral() { return getToken(apexParser.SoqlLiteral, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_primary);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				match(LPAREN);
				setState(1209);
				expression(0);
				setState(1210);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1213);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1214);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1215);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1216);
				type_();
				setState(1217);
				match(DOT);
				setState(1218);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1220);
				match(VOID);
				setState(1221);
				match(DOT);
				setState(1222);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1223);
				nonWildcardTypeArguments();
				setState(1227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1224);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1225);
					match(THIS);
					setState(1226);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1229);
				match(SoqlLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public MapCreatorRestContext mapCreatorRest() {
			return getRuleContext(MapCreatorRestContext.class,0);
		}
		public SetCreatorRestContext setCreatorRest() {
			return getRuleContext(SetCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_creator);
		try {
			setState(1243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				nonWildcardTypeArguments();
				setState(1233);
				createdName();
				setState(1234);
				classCreatorRest();
				}
				break;
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				createdName();
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1237);
					arrayCreatorRest();
					}
					break;
				case 2:
					{
					setState(1238);
					classCreatorRest();
					}
					break;
				case 3:
					{
					setState(1239);
					mapCreatorRest();
					}
					break;
				case 4:
					{
					setState(1240);
					setCreatorRest();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(apexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(apexParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_createdName);
		int _la;
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				match(Identifier);
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1246);
					typeArgumentsOrDiamond();
					}
				}

				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1249);
					match(DOT);
					setState(1250);
					match(Identifier);
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1251);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				primitiveType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1260);
				match(SET);
				setState(1261);
				typeArgumentsOrDiamond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(Identifier);
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1265);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1268);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(LBRACK);
			setState(1298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1271);
				match(RBRACK);
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1272);
					match(LBRACK);
					setState(1273);
					match(RBRACK);
					}
					}
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1279);
				arrayInitializer();
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1280);
				expression(0);
				setState(1281);
				match(RBRACK);
				setState(1288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1282);
						match(LBRACK);
						setState(1283);
						expression(0);
						setState(1284);
						match(RBRACK);
						}
						} 
					}
					setState(1290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1291);
						match(LBRACK);
						setState(1292);
						match(RBRACK);
						}
						} 
					}
					setState(1297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<TerminalNode> LAMBDA_LIKE() { return getTokens(apexParser.LAMBDA_LIKE); }
		public TerminalNode LAMBDA_LIKE(int i) {
			return getToken(apexParser.LAMBDA_LIKE, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public MapCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMapCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMapCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitMapCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapCreatorRestContext mapCreatorRest() throws RecognitionException {
		MapCreatorRestContext _localctx = new MapCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_mapCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(LBRACE);
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				{
				setState(1301);
				match(RBRACE);
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1303);
					expression(0);
					}
					break;
				}
				setState(1306);
				match(LAMBDA_LIKE);
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1307);
					literal();
					}
					break;
				case 2:
					{
					setState(1308);
					expression(0);
					}
					break;
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1311);
					match(COMMA);
					setState(1314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1312);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1313);
						expression(0);
						}
						break;
					}
					setState(1316);
					match(LAMBDA_LIKE);
					setState(1319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
					case 1:
						{
						setState(1317);
						literal();
						}
						break;
					case 2:
						{
						setState(1318);
						expression(0);
						}
						break;
					}
					}
					}
					setState(1325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1326);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public SetCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterSetCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitSetCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitSetCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetCreatorRestContext setCreatorRest() throws RecognitionException {
		SetCreatorRestContext _localctx = new SetCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_setCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(LBRACE);
			setState(1348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				{
				setState(1331);
				match(RBRACE);
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1332);
					literal();
					}
					break;
				case 2:
					{
					setState(1333);
					expression(0);
					}
					break;
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1336);
					match(COMMA);
					setState(1339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1337);
						literal();
						}
						break;
					case 2:
						{
						setState(1338);
						expression(0);
						}
						break;
					}
					}
					}
					setState(1345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1346);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			arguments();
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1351);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			nonWildcardTypeArguments();
			setState(1355);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(LT);
			setState(1358);
			typeList();
			setState(1359);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typeArgumentsOrDiamond);
		try {
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				match(LT);
				setState(1362);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1363);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				match(LT);
				setState(1367);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_superSuffix);
		try {
			setState(1377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				match(DOT);
				setState(1373);
				match(Identifier);
				setState(1375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1374);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				match(SUPER);
				setState(1380);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
				match(Identifier);
				setState(1382);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof apexVisitor ) return ((apexVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(LPAREN);
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611539503666951644L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 281475983573023L) != 0)) {
				{
				setState(1386);
				expressionList();
				}
			}

			setState(1389);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 92:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 28);
		case 13:
			return precpred(_ctx, 27);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		case 17:
			return precpred(_ctx, 23);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 21);
		case 20:
			return precpred(_ctx, 20);
		case 21:
			return precpred(_ctx, 19);
		case 22:
			return precpred(_ctx, 16);
		case 23:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001y\u0570\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0001\u0000\u0003\u0000\u00da\b\u0000"+
		"\u0001\u0000\u0005\u0000\u00dd\b\u0000\n\u0000\f\u0000\u00e0\t\u0000\u0001"+
		"\u0000\u0005\u0000\u00e3\b\u0000\n\u0000\f\u0000\u00e6\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001\u00eb\b\u0001\n\u0001\f\u0001\u00ee"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00f6\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00fb\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003\u0100"+
		"\b\u0003\n\u0003\f\u0003\u0103\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0107\b\u0003\n\u0003\f\u0003\u010a\t\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u010e\b\u0003\n\u0003\f\u0003\u0111\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0115\b\u0003\n\u0003\f\u0003\u0118\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u011c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0122\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0132"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0136\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u013b\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u013f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0143\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u014b\b\b\n\b\f\b\u014e\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0155\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u015a\b\n\n\n\f\n\u015d\t"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0163\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0167\b\u000b\u0001\u000b\u0003"+
		"\u000b\u016a\b\u000b\u0001\u000b\u0003\u000b\u016d\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0174\b\f\n\f\f\f\u0177\t"+
		"\f\u0001\r\u0005\r\u017a\b\r\n\r\f\r\u017d\t\r\u0001\r\u0001\r\u0003\r"+
		"\u0181\b\r\u0001\r\u0003\r\u0184\b\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0188\b\u000e\n\u000e\f\u000e\u018b\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0190\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0194"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u019b\b\u0010\n\u0010\f\u0010\u019e\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u01a2\b\u0011\n\u0011\f\u0011\u01a5\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u01ab\b\u0012\n\u0012\f\u0012"+
		"\u01ae\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01b4\b\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01b8\b\u0013\n\u0013"+
		"\f\u0013\u01bb\t\u0013\u0001\u0013\u0003\u0013\u01be\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ca\b\u0014\u0001\u0015"+
		"\u0003\u0015\u01cd\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d1\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01d7"+
		"\b\u0015\n\u0015\f\u0015\u01da\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01de\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e2\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u01eb\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01fd\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0005"+
		"\u001c\u0202\b\u001c\n\u001c\f\u001c\u0205\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0209\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0212\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0218\b\u001e\n\u001e"+
		"\f\u001e\u021b\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0222\b\u001f\n\u001f\f\u001f\u0225\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u022c\b \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u0232\b \n \f \u0235\t \u0001 \u0001 \u0003 \u0239"+
		"\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u0243\b\"\n\"\f\"\u0246\t\"\u0001#\u0001#\u0001#\u0003#\u024b\b#\u0001"+
		"$\u0001$\u0001$\u0005$\u0250\b$\n$\f$\u0253\t$\u0001%\u0001%\u0003%\u0257"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u025d\b&\n&\f&\u0260\t&\u0001&"+
		"\u0003&\u0263\b&\u0003&\u0265\b&\u0001&\u0001&\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0005(\u026e\b(\n(\f(\u0271\t(\u0001(\u0001(\u0001(\u0005"+
		"(\u0276\b(\n(\f(\u0279\t(\u0003(\u027b\b(\u0001)\u0001)\u0003)\u027f\b"+
		")\u0001)\u0001)\u0001)\u0003)\u0284\b)\u0005)\u0286\b)\n)\f)\u0289\t)"+
		"\u0001)\u0001)\u0003)\u028d\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u0295\b+\n+\f+\u0298\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u02a0\b,\u0003,\u02a2\b,\u0001-\u0001-\u0001-\u0005-\u02a7\b"+
		"-\n-\f-\u02aa\t-\u0001.\u0001.\u0003.\u02ae\b.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0005/\u02b5\b/\n/\f/\u02b8\t/\u0001/\u0001/\u0003/\u02bc\b/"+
		"\u0001/\u0003/\u02bf\b/\u00010\u00050\u02c2\b0\n0\f0\u02c5\t0\u00010\u0001"+
		"0\u00010\u00011\u00051\u02cb\b1\n1\f1\u02ce\t1\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00054\u02db\b4\n4"+
		"\f4\u02de\t4\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00036\u02e7"+
		"\b6\u00016\u00036\u02ea\b6\u00017\u00017\u00018\u00018\u00038\u02f0\b"+
		"8\u00018\u00058\u02f3\b8\n8\f8\u02f6\t8\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0003:\u02ff\b:\u0001;\u0001;\u0001;\u0001;\u0005;\u0305"+
		"\b;\n;\f;\u0308\t;\u0003;\u030a\b;\u0001;\u0003;\u030d\b;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0005=\u0318\b=\n="+
		"\f=\u031b\t=\u0001=\u0001=\u0001>\u0005>\u0320\b>\n>\f>\u0323\t>\u0001"+
		">\u0001>\u0003>\u0327\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u032f\b?\u0001?\u0001?\u0003?\u0333\b?\u0001?\u0001?\u0003?\u0337\b"+
		"?\u0001?\u0001?\u0003?\u033b\b?\u0003?\u033d\b?\u0001@\u0001@\u0003@\u0341"+
		"\b@\u0001A\u0001A\u0001A\u0001A\u0003A\u0347\bA\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0005D\u0350\bD\nD\fD\u0353\tD\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0003E\u035a\bE\u0001F\u0001F\u0001F\u0001G\u0005G\u0360"+
		"\bG\nG\fG\u0363\tG\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u036e\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0004H\u0389"+
		"\bH\u000bH\fH\u038a\u0001H\u0003H\u038e\bH\u0001H\u0003H\u0391\bH\u0001"+
		"H\u0001H\u0001H\u0001H\u0005H\u0397\bH\nH\fH\u039a\tH\u0001H\u0003H\u039d"+
		"\bH\u0001H\u0001H\u0003H\u03a1\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u03aa\bH\u0001H\u0001H\u0001H\u0003H\u03af\bH\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003"+
		"H\u03bc\bH\u0001I\u0005I\u03bf\bI\nI\fI\u03c2\tI\u0001I\u0001I\u0003I"+
		"\u03c6\bI\u0001J\u0001J\u0001J\u0003J\u03cb\bJ\u0001K\u0001K\u0001K\u0003"+
		"K\u03d0\bK\u0001L\u0001L\u0001L\u0005L\u03d5\bL\nL\fL\u03d8\tL\u0001L"+
		"\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0005M\u03e2\bM\nM\f"+
		"M\u03e5\tM\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0003O\u03ed\bO\u0001"+
		"O\u0001O\u0001P\u0001P\u0001P\u0005P\u03f4\bP\nP\fP\u03f7\tP\u0001Q\u0005"+
		"Q\u03fa\bQ\nQ\fQ\u03fd\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0003R\u0406\bR\u0001R\u0001R\u0003R\u040a\bR\u0001R\u0001R\u0003R\u040e"+
		"\bR\u0003R\u0410\bR\u0001S\u0001S\u0003S\u0414\bS\u0001T\u0005T\u0417"+
		"\bT\nT\fT\u041a\tT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0005W\u042a\bW\nW\fW\u042d"+
		"\tW\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0005Z\u0436\bZ\n"+
		"Z\fZ\u0439\tZ\u0001[\u0001[\u0001[\u0003[\u043e\b[\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0003\\\u044d\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u045d\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0003\\\u0483\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u048b\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u0490\b\\\u0001\\"+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u04ac"+
		"\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u04b4\b\\"+
		"\n\\\f\\\u04b7\t\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0003]\u04cc\b]\u0001]\u0003]\u04cf\b]\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u04da\b^\u0003^\u04dc\b^\u0001"+
		"_\u0001_\u0003_\u04e0\b_\u0001_\u0001_\u0001_\u0003_\u04e5\b_\u0005_\u04e7"+
		"\b_\n_\f_\u04ea\t_\u0001_\u0001_\u0001_\u0003_\u04ef\b_\u0001`\u0001`"+
		"\u0003`\u04f3\b`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0005a\u04fb"+
		"\ba\na\fa\u04fe\ta\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0005"+
		"a\u0507\ba\na\fa\u050a\ta\u0001a\u0001a\u0005a\u050e\ba\na\fa\u0511\t"+
		"a\u0003a\u0513\ba\u0001b\u0001b\u0001b\u0001b\u0003b\u0519\bb\u0001b\u0001"+
		"b\u0001b\u0003b\u051e\bb\u0001b\u0001b\u0001b\u0003b\u0523\bb\u0001b\u0001"+
		"b\u0001b\u0003b\u0528\bb\u0005b\u052a\bb\nb\fb\u052d\tb\u0001b\u0001b"+
		"\u0003b\u0531\bb\u0001c\u0001c\u0001c\u0001c\u0003c\u0537\bc\u0001c\u0001"+
		"c\u0001c\u0003c\u053c\bc\u0005c\u053e\bc\nc\fc\u0541\tc\u0001c\u0001c"+
		"\u0003c\u0545\bc\u0001d\u0001d\u0003d\u0549\bd\u0001e\u0001e\u0001e\u0001"+
		"f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0003g\u0555\bg\u0001h\u0001"+
		"h\u0001h\u0003h\u055a\bh\u0001i\u0001i\u0001i\u0001i\u0003i\u0560\bi\u0003"+
		"i\u0562\bi\u0001j\u0001j\u0001j\u0001j\u0003j\u0568\bj\u0001k\u0001k\u0003"+
		"k\u056c\bk\u0001k\u0001k\u0001k\u0000\u0001\u00b8l\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u0000\r\u0005\u0000\t\t\u000b\u000b\u0016\u0016\u001d"+
		"\u001d&&\u0002\u0000\u0013\u0013((\u0001\u0000>C\u0002\u0000779;\u0001"+
		"\u0000Z]\u0001\u0000PQ\u0002\u0000^_cc\u0001\u0000\\]\u0002\u0000NOUV"+
		"\u0003\u0000\u0001\u0001TTWW\u0002\u0000MMdn\u0001\u00007;\u0001\u0000"+
		"Z[\u05ff\u0000\u00d9\u0001\u0000\u0000\u0000\u0002\u00ec\u0001\u0000\u0000"+
		"\u0000\u0004\u00f3\u0001\u0000\u0000\u0000\u0006\u011b\u0001\u0000\u0000"+
		"\u0000\b\u0121\u0001\u0000\u0000\u0000\n\u0131\u0001\u0000\u0000\u0000"+
		"\f\u0135\u0001\u0000\u0000\u0000\u000e\u0137\u0001\u0000\u0000\u0000\u0010"+
		"\u0146\u0001\u0000\u0000\u0000\u0012\u0151\u0001\u0000\u0000\u0000\u0014"+
		"\u0156\u0001\u0000\u0000\u0000\u0016\u015e\u0001\u0000\u0000\u0000\u0018"+
		"\u0170\u0001\u0000\u0000\u0000\u001a\u017b\u0001\u0000\u0000\u0000\u001c"+
		"\u0185\u0001\u0000\u0000\u0000\u001e\u018c\u0001\u0000\u0000\u0000 \u0197"+
		"\u0001\u0000\u0000\u0000\"\u019f\u0001\u0000\u0000\u0000$\u01a8\u0001"+
		"\u0000\u0000\u0000&\u01bd\u0001\u0000\u0000\u0000(\u01c9\u0001\u0000\u0000"+
		"\u0000*\u01cc\u0001\u0000\u0000\u0000,\u01e3\u0001\u0000\u0000\u0000."+
		"\u01e6\u0001\u0000\u0000\u00000\u01ee\u0001\u0000\u0000\u00002\u01f1\u0001"+
		"\u0000\u0000\u00004\u01f5\u0001\u0000\u0000\u00006\u01f9\u0001\u0000\u0000"+
		"\u00008\u0208\u0001\u0000\u0000\u0000:\u0211\u0001\u0000\u0000\u0000<"+
		"\u0213\u0001\u0000\u0000\u0000>\u021e\u0001\u0000\u0000\u0000@\u022b\u0001"+
		"\u0000\u0000\u0000B\u023c\u0001\u0000\u0000\u0000D\u023f\u0001\u0000\u0000"+
		"\u0000F\u0247\u0001\u0000\u0000\u0000H\u024c\u0001\u0000\u0000\u0000J"+
		"\u0256\u0001\u0000\u0000\u0000L\u0258\u0001\u0000\u0000\u0000N\u0268\u0001"+
		"\u0000\u0000\u0000P\u027a\u0001\u0000\u0000\u0000R\u028c\u0001\u0000\u0000"+
		"\u0000T\u028e\u0001\u0000\u0000\u0000V\u0290\u0001\u0000\u0000\u0000X"+
		"\u02a1\u0001\u0000\u0000\u0000Z\u02a3\u0001\u0000\u0000\u0000\\\u02ab"+
		"\u0001\u0000\u0000\u0000^\u02be\u0001\u0000\u0000\u0000`\u02c3\u0001\u0000"+
		"\u0000\u0000b\u02cc\u0001\u0000\u0000\u0000d\u02d3\u0001\u0000\u0000\u0000"+
		"f\u02d5\u0001\u0000\u0000\u0000h\u02d7\u0001\u0000\u0000\u0000j\u02df"+
		"\u0001\u0000\u0000\u0000l\u02e1\u0001\u0000\u0000\u0000n\u02eb\u0001\u0000"+
		"\u0000\u0000p\u02ed\u0001\u0000\u0000\u0000r\u02f7\u0001\u0000\u0000\u0000"+
		"t\u02fe\u0001\u0000\u0000\u0000v\u0300\u0001\u0000\u0000\u0000x\u0310"+
		"\u0001\u0000\u0000\u0000z\u0315\u0001\u0000\u0000\u0000|\u0326\u0001\u0000"+
		"\u0000\u0000~\u033c\u0001\u0000\u0000\u0000\u0080\u0340\u0001\u0000\u0000"+
		"\u0000\u0082\u0342\u0001\u0000\u0000\u0000\u0084\u0348\u0001\u0000\u0000"+
		"\u0000\u0086\u034a\u0001\u0000\u0000\u0000\u0088\u034d\u0001\u0000\u0000"+
		"\u0000\u008a\u0359\u0001\u0000\u0000\u0000\u008c\u035b\u0001\u0000\u0000"+
		"\u0000\u008e\u0361\u0001\u0000\u0000\u0000\u0090\u03bb\u0001\u0000\u0000"+
		"\u0000\u0092\u03c0\u0001\u0000\u0000\u0000\u0094\u03c7\u0001\u0000\u0000"+
		"\u0000\u0096\u03cc\u0001\u0000\u0000\u0000\u0098\u03d1\u0001\u0000\u0000"+
		"\u0000\u009a\u03de\u0001\u0000\u0000\u0000\u009c\u03e6\u0001\u0000\u0000"+
		"\u0000\u009e\u03e9\u0001\u0000\u0000\u0000\u00a0\u03f0\u0001\u0000\u0000"+
		"\u0000\u00a2\u03fb\u0001\u0000\u0000\u0000\u00a4\u040f\u0001\u0000\u0000"+
		"\u0000\u00a6\u0413\u0001\u0000\u0000\u0000\u00a8\u0418\u0001\u0000\u0000"+
		"\u0000\u00aa\u0420\u0001\u0000\u0000\u0000\u00ac\u0422\u0001\u0000\u0000"+
		"\u0000\u00ae\u0426\u0001\u0000\u0000\u0000\u00b0\u042e\u0001\u0000\u0000"+
		"\u0000\u00b2\u0430\u0001\u0000\u0000\u0000\u00b4\u0432\u0001\u0000\u0000"+
		"\u0000\u00b6\u043d\u0001\u0000\u0000\u0000\u00b8\u044c\u0001\u0000\u0000"+
		"\u0000\u00ba\u04ce\u0001\u0000\u0000\u0000\u00bc\u04db\u0001\u0000\u0000"+
		"\u0000\u00be\u04ee\u0001\u0000\u0000\u0000\u00c0\u04f0\u0001\u0000\u0000"+
		"\u0000\u00c2\u04f6\u0001\u0000\u0000\u0000\u00c4\u0514\u0001\u0000\u0000"+
		"\u0000\u00c6\u0532\u0001\u0000\u0000\u0000\u00c8\u0546\u0001\u0000\u0000"+
		"\u0000\u00ca\u054a\u0001\u0000\u0000\u0000\u00cc\u054d\u0001\u0000\u0000"+
		"\u0000\u00ce\u0554\u0001\u0000\u0000\u0000\u00d0\u0559\u0001\u0000\u0000"+
		"\u0000\u00d2\u0561\u0001\u0000\u0000\u0000\u00d4\u0567\u0001\u0000\u0000"+
		"\u0000\u00d6\u0569\u0001\u0000\u0000\u0000\u00d8\u00da\u0003\u0002\u0001"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00de\u0001\u0000\u0000\u0000\u00db\u00dd\u0003\u0004\u0002"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e4\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0003\u0006\u0003\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0000\u0000"+
		"\u0001\u00e8\u0001\u0001\u0000\u0000\u0000\u00e9\u00eb\u0003l6\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005!\u0000\u0000\u00f0\u00f1\u0003h4\u0000\u00f1\u00f2\u0005"+
		"J\u0000\u0000\u00f2\u0003\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005\u001b"+
		"\u0000\u0000\u00f4\u00f6\u0005\'\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0003h4\u0000\u00f8\u00f9\u0005L\u0000\u0000\u00f9"+
		"\u00fb\u0005^\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005J\u0000\u0000\u00fd\u0005\u0001\u0000\u0000\u0000\u00fe\u0100\u0003"+
		"\n\u0005\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u011c\u0003\u000e\u0007\u0000\u0105\u0107\u0003\n\u0005"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u011c\u0003\u0016\u000b\u0000\u010c\u010e\u0003\n\u0005\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u011c\u0003\u001e\u000f\u0000\u0113\u0115\u0003\n\u0005\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0003x<\u0000\u011a\u011c\u0005J\u0000\u0000\u011b\u0101\u0001"+
		"\u0000\u0000\u0000\u011b\u0108\u0001\u0000\u0000\u0000\u011b\u010f\u0001"+
		"\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u0007\u0001\u0000\u0000\u0000\u011d\u0122\u0003"+
		"\n\u0005\u0000\u011e\u0122\u0005\u001f\u0000\u0000\u011f\u0122\u0005)"+
		"\u0000\u0000\u0120\u0122\u0005-\u0000\u0000\u0121\u011d\u0001\u0000\u0000"+
		"\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\t\u0001\u0000\u0000\u0000"+
		"\u0123\u0132\u0003l6\u0000\u0124\u0132\u0005$\u0000\u0000\u0125\u0132"+
		"\u0005#\u0000\u0000\u0126\u0132\u0005\"\u0000\u0000\u0127\u0132\u0005"+
		"\'\u0000\u0000\u0128\u0132\u0005\u0007\u0000\u0000\u0129\u0132\u0005\u0014"+
		"\u0000\u0000\u012a\u0132\u00052\u0000\u0000\u012b\u0132\u00053\u0000\u0000"+
		"\u012c\u0132\u0005\u0003\u0000\u0000\u012d\u0132\u0005\u0004\u0000\u0000"+
		"\u012e\u0132\u0005<\u0000\u0000\u012f\u0132\u00054\u0000\u0000\u0130\u0132"+
		"\u00055\u0000\u0000\u0131\u0123\u0001\u0000\u0000\u0000\u0131\u0124\u0001"+
		"\u0000\u0000\u0000\u0131\u0125\u0001\u0000\u0000\u0000\u0131\u0126\u0001"+
		"\u0000\u0000\u0000\u0131\u0127\u0001\u0000\u0000\u0000\u0131\u0128\u0001"+
		"\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0131\u012a\u0001"+
		"\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012c\u0001"+
		"\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u000b\u0001\u0000\u0000\u0000\u0133\u0136\u0005"+
		"\u0014\u0000\u0000\u0134\u0136\u0003l6\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\r\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\f\u0000\u0000\u0138\u013a\u0005p\u0000\u0000\u0139"+
		"\u013b\u0003\u0010\b\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0005\u0013\u0000\u0000\u013d\u013f\u0003P(\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005\u001a\u0000\u0000\u0141\u0143\u0003 \u0010"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0003\"\u0011\u0000"+
		"\u0145\u000f\u0001\u0000\u0000\u0000\u0146\u0147\u0005O\u0000\u0000\u0147"+
		"\u014c\u0003\u0012\t\u0000\u0148\u0149\u0005K\u0000\u0000\u0149\u014b"+
		"\u0003\u0012\t\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005N\u0000\u0000\u0150\u0011\u0001\u0000"+
		"\u0000\u0000\u0151\u0154\u0005p\u0000\u0000\u0152\u0153\u0005\u0013\u0000"+
		"\u0000\u0153\u0155\u0003\u0014\n\u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0013\u0001\u0000\u0000\u0000"+
		"\u0156\u015b\u0003P(\u0000\u0157\u0158\u0005`\u0000\u0000\u0158\u015a"+
		"\u0003P(\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u0015\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005\u0012\u0000\u0000\u015f\u0162\u0005p\u0000"+
		"\u0000\u0160\u0161\u0005\u001a\u0000\u0000\u0161\u0163\u0003 \u0010\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0005F\u0000\u0000\u0165"+
		"\u0167\u0003\u0018\f\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u016a"+
		"\u0005K\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u016d\u0003"+
		"\u001c\u000e\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"G\u0000\u0000\u016f\u0017\u0001\u0000\u0000\u0000\u0170\u0175\u0003\u001a"+
		"\r\u0000\u0171\u0172\u0005K\u0000\u0000\u0172\u0174\u0003\u001a\r\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0019\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0178\u017a\u0003l6\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017d"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017e\u0180\u0005p\u0000\u0000\u017f\u0181\u0003"+
		"\u00d6k\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0184\u0003\"\u0011"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u001b\u0001\u0000\u0000\u0000\u0185\u0189\u0005J\u0000\u0000"+
		"\u0186\u0188\u0003&\u0013\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188"+
		"\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u001d\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u001e\u0000\u0000\u018d"+
		"\u018f\u0005p\u0000\u0000\u018e\u0190\u0003\u0010\b\u0000\u018f\u018e"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0193"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0013\u0000\u0000\u0192\u0194"+
		"\u0003 \u0010\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0003"+
		"$\u0012\u0000\u0196\u001f\u0001\u0000\u0000\u0000\u0197\u019c\u0003P("+
		"\u0000\u0198\u0199\u0005K\u0000\u0000\u0199\u019b\u0003P(\u0000\u019a"+
		"\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d"+
		"!\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a3"+
		"\u0005F\u0000\u0000\u01a0\u01a2\u0003&\u0013\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005G\u0000"+
		"\u0000\u01a7#\u0001\u0000\u0000\u0000\u01a8\u01ac\u0005F\u0000\u0000\u01a9"+
		"\u01ab\u00038\u001c\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0005G\u0000\u0000\u01b0%\u0001\u0000"+
		"\u0000\u0000\u01b1\u01be\u0005J\u0000\u0000\u01b2\u01b4\u0005\'\u0000"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01be\u0003\u0088D\u0000"+
		"\u01b6\u01b8\u0003\b\u0004\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bc\u01be\u0003(\u0014\u0000\u01bd\u01b1"+
		"\u0001\u0000\u0000\u0000\u01bd\u01b3\u0001\u0000\u0000\u0000\u01bd\u01b9"+
		"\u0001\u0000\u0000\u0000\u01be\'\u0001\u0000\u0000\u0000\u01bf\u01ca\u0003"+
		"*\u0015\u0000\u01c0\u01ca\u0003,\u0016\u0000\u01c1\u01ca\u00032\u0019"+
		"\u0000\u01c2\u01ca\u0003.\u0017\u0000\u01c3\u01ca\u00030\u0018\u0000\u01c4"+
		"\u01ca\u0003\u001e\u000f\u0000\u01c5\u01ca\u0003x<\u0000\u01c6\u01ca\u0003"+
		"\u000e\u0007\u0000\u01c7\u01ca\u0003\u0016\u000b\u0000\u01c8\u01ca\u0003"+
		"4\u001a\u0000\u01c9\u01bf\u0001\u0000\u0000\u0000\u01c9\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c1\u0001\u0000\u0000\u0000\u01c9\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c3\u0001\u0000\u0000\u0000\u01c9\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c5\u0001\u0000\u0000\u0000\u01c9\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001\u0000"+
		"\u0000\u0000\u01ca)\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005\u0003\u0000"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01d1\u0003P(\u0000\u01cf"+
		"\u01d1\u0005/\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0005p\u0000\u0000\u01d3\u01d8\u0003\\.\u0000\u01d4\u01d5\u0005H\u0000"+
		"\u0000\u01d5\u01d7\u0005I\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dd\u0001\u0000\u0000\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0005,\u0000\u0000\u01dc"+
		"\u01de\u0003Z-\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01e2\u0003"+
		"d2\u0000\u01e0\u01e2\u0005J\u0000\u0000\u01e1\u01df\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2+\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0003\u0010\b\u0000\u01e4\u01e5\u0003*\u0015\u0000\u01e5"+
		"-\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005p\u0000\u0000\u01e7\u01ea\u0003"+
		"\\.\u0000\u01e8\u01e9\u0005,\u0000\u0000\u01e9\u01eb\u0003Z-\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003f3\u0000\u01ed/\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0003\u0010\b\u0000\u01ef\u01f0\u0003."+
		"\u0017\u0000\u01f01\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003P(\u0000"+
		"\u01f2\u01f3\u0003D\"\u0000\u01f3\u01f4\u0005J\u0000\u0000\u01f43\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0003P(\u0000\u01f6\u01f7\u0003D\"\u0000"+
		"\u01f7\u01f8\u00036\u001b\u0000\u01f85\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0005F\u0000\u0000\u01fa\u01fc\u0003\u0092I\u0000\u01fb\u01fd\u0003\u0092"+
		"I\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005G\u0000\u0000"+
		"\u01ff7\u0001\u0000\u0000\u0000\u0200\u0202\u0003\b\u0004\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203"+
		"\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204"+
		"\u0206\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206"+
		"\u0209\u0003:\u001d\u0000\u0207\u0209\u0005J\u0000\u0000\u0208\u0203\u0001"+
		"\u0000\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u02099\u0001\u0000"+
		"\u0000\u0000\u020a\u0212\u0003<\u001e\u0000\u020b\u0212\u0003@ \u0000"+
		"\u020c\u0212\u0003B!\u0000\u020d\u0212\u0003\u001e\u000f\u0000\u020e\u0212"+
		"\u0003x<\u0000\u020f\u0212\u0003\u000e\u0007\u0000\u0210\u0212\u0003\u0016"+
		"\u000b\u0000\u0211\u020a\u0001\u0000\u0000\u0000\u0211\u020b\u0001\u0000"+
		"\u0000\u0000\u0211\u020c\u0001\u0000\u0000\u0000\u0211\u020d\u0001\u0000"+
		"\u0000\u0000\u0211\u020e\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212;\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u0003P(\u0000\u0214\u0219\u0003>\u001f\u0000\u0215"+
		"\u0216\u0005K\u0000\u0000\u0216\u0218\u0003>\u001f\u0000\u0217\u0215\u0001"+
		"\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0001"+
		"\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021d\u0005"+
		"J\u0000\u0000\u021d=\u0001\u0000\u0000\u0000\u021e\u0223\u0005p\u0000"+
		"\u0000\u021f\u0220\u0005H\u0000\u0000\u0220\u0222\u0005I\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223"+
		"\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224"+
		"\u0226\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005M\u0000\u0000\u0227\u0228\u0003J%\u0000\u0228?\u0001\u0000"+
		"\u0000\u0000\u0229\u022c\u0003P(\u0000\u022a\u022c\u0005/\u0000\u0000"+
		"\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0005p\u0000\u0000\u022e"+
		"\u0233\u0003\\.\u0000\u022f\u0230\u0005H\u0000\u0000\u0230\u0232\u0005"+
		"I\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0238\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0005,\u0000\u0000\u0237\u0239\u0003Z-\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0005J\u0000\u0000\u023b"+
		"A\u0001\u0000\u0000\u0000\u023c\u023d\u0003\u0010\b\u0000\u023d\u023e"+
		"\u0003@ \u0000\u023eC\u0001\u0000\u0000\u0000\u023f\u0244\u0003F#\u0000"+
		"\u0240\u0241\u0005K\u0000\u0000\u0241\u0243\u0003F#\u0000\u0242\u0240"+
		"\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245E\u0001"+
		"\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u024a\u0003"+
		"H$\u0000\u0248\u0249\u0005M\u0000\u0000\u0249\u024b\u0003J%\u0000\u024a"+
		"\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b"+
		"G\u0001\u0000\u0000\u0000\u024c\u0251\u0005p\u0000\u0000\u024d\u024e\u0005"+
		"H\u0000\u0000\u024e\u0250\u0005I\u0000\u0000\u024f\u024d\u0001\u0000\u0000"+
		"\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252I\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0003L&\u0000\u0255\u0257"+
		"\u0003\u00b8\\\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0255\u0001"+
		"\u0000\u0000\u0000\u0257K\u0001\u0000\u0000\u0000\u0258\u0264\u0005F\u0000"+
		"\u0000\u0259\u025e\u0003J%\u0000\u025a\u025b\u0005K\u0000\u0000\u025b"+
		"\u025d\u0003J%\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u0260\u0001"+
		"\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001"+
		"\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001"+
		"\u0000\u0000\u0000\u0261\u0263\u0005K\u0000\u0000\u0262\u0261\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000"+
		"\u0000\u0000\u0264\u0259\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0005G\u0000"+
		"\u0000\u0267M\u0001\u0000\u0000\u0000\u0268\u0269\u0005p\u0000\u0000\u0269"+
		"O\u0001\u0000\u0000\u0000\u026a\u026f\u0003R)\u0000\u026b\u026c\u0005"+
		"H\u0000\u0000\u026c\u026e\u0005I\u0000\u0000\u026d\u026b\u0001\u0000\u0000"+
		"\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u027b\u0001\u0000\u0000"+
		"\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0277\u0003T*\u0000\u0273"+
		"\u0274\u0005H\u0000\u0000\u0274\u0276\u0005I\u0000\u0000\u0275\u0273\u0001"+
		"\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027b\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u026a\u0001"+
		"\u0000\u0000\u0000\u027a\u0272\u0001\u0000\u0000\u0000\u027bQ\u0001\u0000"+
		"\u0000\u0000\u027c\u027e\u0005p\u0000\u0000\u027d\u027f\u0003V+\u0000"+
		"\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000"+
		"\u027f\u0287\u0001\u0000\u0000\u0000\u0280\u0281\u0005L\u0000\u0000\u0281"+
		"\u0283\u0005p\u0000\u0000\u0282\u0284\u0003V+\u0000\u0283\u0282\u0001"+
		"\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0001"+
		"\u0000\u0000\u0000\u0285\u0280\u0001\u0000\u0000\u0000\u0286\u0289\u0001"+
		"\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u028d\u0001\u0000\u0000\u0000\u0289\u0287\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0005\u0005\u0000\u0000\u028b\u028d\u0003"+
		"V+\u0000\u028c\u027c\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000"+
		"\u0000\u028dS\u0001\u0000\u0000\u0000\u028e\u028f\u0007\u0000\u0000\u0000"+
		"\u028fU\u0001\u0000\u0000\u0000\u0290\u0291\u0005O\u0000\u0000\u0291\u0296"+
		"\u0003X,\u0000\u0292\u0293\u0005K\u0000\u0000\u0293\u0295\u0003X,\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u0299\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0005N\u0000\u0000\u029aW\u0001\u0000\u0000\u0000\u029b\u02a2"+
		"\u0003P(\u0000\u029c\u029f\u0005R\u0000\u0000\u029d\u029e\u0007\u0001"+
		"\u0000\u0000\u029e\u02a0\u0003P(\u0000\u029f\u029d\u0001\u0000\u0000\u0000"+
		"\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a1\u029b\u0001\u0000\u0000\u0000\u02a1\u029c\u0001\u0000\u0000\u0000"+
		"\u02a2Y\u0001\u0000\u0000\u0000\u02a3\u02a8\u0003h4\u0000\u02a4\u02a5"+
		"\u0005K\u0000\u0000\u02a5\u02a7\u0003h4\u0000\u02a6\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9[\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ad\u0005D\u0000\u0000"+
		"\u02ac\u02ae\u0003^/\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0005E\u0000\u0000\u02b0]\u0001\u0000\u0000\u0000\u02b1\u02b6\u0003`"+
		"0\u0000\u02b2\u02b3\u0005K\u0000\u0000\u02b3\u02b5\u0003`0\u0000\u02b4"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7"+
		"\u02bb\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0005K\u0000\u0000\u02ba\u02bc\u0003b1\u0000\u02bb\u02b9\u0001"+
		"\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bf\u0003b1\u0000\u02be\u02b1\u0001\u0000\u0000"+
		"\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf_\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c2\u0003\f\u0006\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c7\u0003P(\u0000\u02c7\u02c8\u0003"+
		"H$\u0000\u02c8a\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003\f\u0006\u0000"+
		"\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cf\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d0\u0003P(\u0000\u02d0\u02d1\u0005r\u0000\u0000\u02d1\u02d2"+
		"\u0003H$\u0000\u02d2c\u0001\u0000\u0000\u0000\u02d3\u02d4\u0003\u0088"+
		"D\u0000\u02d4e\u0001\u0000\u0000\u0000\u02d5\u02d6\u0003\u0088D\u0000"+
		"\u02d6g\u0001\u0000\u0000\u0000\u02d7\u02dc\u0005p\u0000\u0000\u02d8\u02d9"+
		"\u0005L\u0000\u0000\u02d9\u02db\u0005p\u0000\u0000\u02da\u02d8\u0001\u0000"+
		"\u0000\u0000\u02db\u02de\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02ddi\u0001\u0000\u0000"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e0\u0007\u0002\u0000"+
		"\u0000\u02e0k\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005q\u0000\u0000\u02e2"+
		"\u02e9\u0003n7\u0000\u02e3\u02e6\u0005D\u0000\u0000\u02e4\u02e7\u0003"+
		"p8\u0000\u02e5\u02e7\u0003t:\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ea\u0005E\u0000\u0000\u02e9"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"m\u0001\u0000\u0000\u0000\u02eb\u02ec\u0003h4\u0000\u02eco\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f4\u0003r9\u0000\u02ee\u02f0\u0005K\u0000\u0000"+
		"\u02ef\u02ee\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0003r9\u0000\u02f2\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5q\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005"+
		"p\u0000\u0000\u02f8\u02f9\u0005M\u0000\u0000\u02f9\u02fa\u0003t:\u0000"+
		"\u02fas\u0001\u0000\u0000\u0000\u02fb\u02ff\u0003\u00b8\\\u0000\u02fc"+
		"\u02ff\u0003l6\u0000\u02fd\u02ff\u0003v;\u0000\u02fe\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02fe\u02fd\u0001\u0000"+
		"\u0000\u0000\u02ffu\u0001\u0000\u0000\u0000\u0300\u0309\u0005F\u0000\u0000"+
		"\u0301\u0306\u0003t:\u0000\u0302\u0303\u0005K\u0000\u0000\u0303\u0305"+
		"\u0003t:\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000"+
		"\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000"+
		"\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000"+
		"\u0000\u0000\u0309\u0301\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u0001\u0000\u0000\u0000\u030b\u030d\u0005K\u0000"+
		"\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u030f\u0005G\u0000\u0000"+
		"\u030fw\u0001\u0000\u0000\u0000\u0310\u0311\u0005q\u0000\u0000\u0311\u0312"+
		"\u0005\u001e\u0000\u0000\u0312\u0313\u0005p\u0000\u0000\u0313\u0314\u0003"+
		"z=\u0000\u0314y\u0001\u0000\u0000\u0000\u0315\u0319\u0005F\u0000\u0000"+
		"\u0316\u0318\u0003|>\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0318\u031b"+
		"\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000\u0000\u031b\u0319"+
		"\u0001\u0000\u0000\u0000\u031c\u031d\u0005G\u0000\u0000\u031d{\u0001\u0000"+
		"\u0000\u0000\u031e\u0320\u0003\b\u0004\u0000\u031f\u031e\u0001\u0000\u0000"+
		"\u0000\u0320\u0323\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0324\u0001\u0000\u0000"+
		"\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0324\u0327\u0003~?\u0000\u0325"+
		"\u0327\u0005J\u0000\u0000\u0326\u0321\u0001\u0000\u0000\u0000\u0326\u0325"+
		"\u0001\u0000\u0000\u0000\u0327}\u0001\u0000\u0000\u0000\u0328\u0329\u0003"+
		"P(\u0000\u0329\u032a\u0003\u0080@\u0000\u032a\u032b\u0005J\u0000\u0000"+
		"\u032b\u033d\u0001\u0000\u0000\u0000\u032c\u032e\u0003\u000e\u0007\u0000"+
		"\u032d\u032f\u0005J\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u033d\u0001\u0000\u0000\u0000\u0330"+
		"\u0332\u0003\u001e\u000f\u0000\u0331\u0333\u0005J\u0000\u0000\u0332\u0331"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u033d"+
		"\u0001\u0000\u0000\u0000\u0334\u0336\u0003\u0016\u000b\u0000\u0335\u0337"+
		"\u0005J\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0336\u0337\u0001"+
		"\u0000\u0000\u0000\u0337\u033d\u0001\u0000\u0000\u0000\u0338\u033a\u0003"+
		"x<\u0000\u0339\u033b\u0005J\u0000\u0000\u033a\u0339\u0001\u0000\u0000"+
		"\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033d\u0001\u0000\u0000"+
		"\u0000\u033c\u0328\u0001\u0000\u0000\u0000\u033c\u032c\u0001\u0000\u0000"+
		"\u0000\u033c\u0330\u0001\u0000\u0000\u0000\u033c\u0334\u0001\u0000\u0000"+
		"\u0000\u033c\u0338\u0001\u0000\u0000\u0000\u033d\u007f\u0001\u0000\u0000"+
		"\u0000\u033e\u0341\u0003\u0082A\u0000\u033f\u0341\u0003\u0084B\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0341"+
		"\u0081\u0001\u0000\u0000\u0000\u0342\u0343\u0005p\u0000\u0000\u0343\u0344"+
		"\u0005D\u0000\u0000\u0344\u0346\u0005E\u0000\u0000\u0345\u0347\u0003\u0086"+
		"C\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000"+
		"\u0000\u0347\u0083\u0001\u0000\u0000\u0000\u0348\u0349\u0003D\"\u0000"+
		"\u0349\u0085\u0001\u0000\u0000\u0000\u034a\u034b\u0005\u000f\u0000\u0000"+
		"\u034b\u034c\u0003t:\u0000\u034c\u0087\u0001\u0000\u0000\u0000\u034d\u0351"+
		"\u0005F\u0000\u0000\u034e\u0350\u0003\u008aE\u0000\u034f\u034e\u0001\u0000"+
		"\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000"+
		"\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0354\u0001\u0000"+
		"\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0355\u0005G\u0000"+
		"\u0000\u0355\u0089\u0001\u0000\u0000\u0000\u0356\u035a\u0003\u008cF\u0000"+
		"\u0357\u035a\u0003\u0090H\u0000\u0358\u035a\u0003\u0006\u0003\u0000\u0359"+
		"\u0356\u0001\u0000\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u0359"+
		"\u0358\u0001\u0000\u0000\u0000\u035a\u008b\u0001\u0000\u0000\u0000\u035b"+
		"\u035c\u0003\u008eG\u0000\u035c\u035d\u0005J\u0000\u0000\u035d\u008d\u0001"+
		"\u0000\u0000\u0000\u035e\u0360\u0003\f\u0006\u0000\u035f\u035e\u0001\u0000"+
		"\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000"+
		"\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364\u0001\u0000"+
		"\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0365\u0003P(\u0000"+
		"\u0365\u0366\u0003D\"\u0000\u0366\u008f\u0001\u0000\u0000\u0000\u0367"+
		"\u03bc\u0003\u0088D\u0000\u0368\u0369\u0005\u0018\u0000\u0000\u0369\u036a"+
		"\u0003\u00acV\u0000\u036a\u036d\u0003\u0090H\u0000\u036b\u036c\u0005\u0011"+
		"\u0000\u0000\u036c\u036e\u0003\u0090H\u0000\u036d\u036b\u0001\u0000\u0000"+
		"\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u03bc\u0001\u0000\u0000"+
		"\u0000\u036f\u0370\u0005\u0017\u0000\u0000\u0370\u0371\u0005D\u0000\u0000"+
		"\u0371\u0372\u0003\u00a4R\u0000\u0372\u0373\u0005E\u0000\u0000\u0373\u0374"+
		"\u0003\u0090H\u0000\u0374\u03bc\u0001\u0000\u0000\u0000\u0375\u0376\u0005"+
		"1\u0000\u0000\u0376\u0377\u0003\u00acV\u0000\u0377\u0378\u0003\u0090H"+
		"\u0000\u0378\u03bc\u0001\u0000\u0000\u0000\u0379\u037a\u0005\u0010\u0000"+
		"\u0000\u037a\u037b\u0003\u0090H\u0000\u037b\u037c\u00051\u0000\u0000\u037c"+
		"\u037d\u0003\u00acV\u0000\u037d\u037e\u0005J\u0000\u0000\u037e\u03bc\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0005=\u0000\u0000\u0380\u0381\u0005D\u0000"+
		"\u0000\u0381\u0382\u0003\u00b8\\\u0000\u0382\u0383\u0005E\u0000\u0000"+
		"\u0383\u0384\u0003\u0090H\u0000\u0384\u03bc\u0001\u0000\u0000\u0000\u0385"+
		"\u0386\u0005.\u0000\u0000\u0386\u0390\u0003\u0088D\u0000\u0387\u0389\u0003"+
		"\u0098L\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000"+
		"\u0000\u0000\u038b\u038d\u0001\u0000\u0000\u0000\u038c\u038e\u0003\u009c"+
		"N\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000"+
		"\u0000\u038e\u0391\u0001\u0000\u0000\u0000\u038f\u0391\u0003\u009cN\u0000"+
		"\u0390\u0388\u0001\u0000\u0000\u0000\u0390\u038f\u0001\u0000\u0000\u0000"+
		"\u0391\u03bc\u0001\u0000\u0000\u0000\u0392\u0393\u0005.\u0000\u0000\u0393"+
		"\u0394\u0003\u009eO\u0000\u0394\u0398\u0003\u0088D\u0000\u0395\u0397\u0003"+
		"\u0098L\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0397\u039a\u0001\u0000"+
		"\u0000\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000"+
		"\u0000\u0000\u0399\u039c\u0001\u0000\u0000\u0000\u039a\u0398\u0001\u0000"+
		"\u0000\u0000\u039b\u039d\u0003\u009cN\u0000\u039c\u039b\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u03bc\u0001\u0000\u0000"+
		"\u0000\u039e\u03a0\u0005%\u0000\u0000\u039f\u03a1\u0003\u00b8\\\u0000"+
		"\u03a0\u039f\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03bc\u0005J\u0000\u0000\u03a3"+
		"\u03a4\u0005+\u0000\u0000\u03a4\u03a5\u0003\u00b8\\\u0000\u03a5\u03a6"+
		"\u0005J\u0000\u0000\u03a6\u03bc\u0001\u0000\u0000\u0000\u03a7\u03a9\u0005"+
		"\b\u0000\u0000\u03a8\u03aa\u0005p\u0000\u0000\u03a9\u03a8\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ab\u03bc\u0005J\u0000\u0000\u03ac\u03ae\u0005\u000e\u0000"+
		"\u0000\u03ad\u03af\u0005p\u0000\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000"+
		"\u03b0\u03bc\u0005J\u0000\u0000\u03b1\u03bc\u0005J\u0000\u0000\u03b2\u03b3"+
		"\u0003\u00b0X\u0000\u03b3\u03b4\u0005J\u0000\u0000\u03b4\u03bc\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b6\u0005p\u0000\u0000\u03b6\u03b7\u0005S\u0000\u0000"+
		"\u03b7\u03bc\u0003\u0090H\u0000\u03b8\u03b9\u0003\u00b6[\u0000\u03b9\u03ba"+
		"\u0005J\u0000\u0000\u03ba\u03bc\u0001\u0000\u0000\u0000\u03bb\u0367\u0001"+
		"\u0000\u0000\u0000\u03bb\u0368\u0001\u0000\u0000\u0000\u03bb\u036f\u0001"+
		"\u0000\u0000\u0000\u03bb\u0375\u0001\u0000\u0000\u0000\u03bb\u0379\u0001"+
		"\u0000\u0000\u0000\u03bb\u037f\u0001\u0000\u0000\u0000\u03bb\u0385\u0001"+
		"\u0000\u0000\u0000\u03bb\u0392\u0001\u0000\u0000\u0000\u03bb\u039e\u0001"+
		"\u0000\u0000\u0000\u03bb\u03a3\u0001\u0000\u0000\u0000\u03bb\u03a7\u0001"+
		"\u0000\u0000\u0000\u03bb\u03ac\u0001\u0000\u0000\u0000\u03bb\u03b1\u0001"+
		"\u0000\u0000\u0000\u03bb\u03b2\u0001\u0000\u0000\u0000\u03bb\u03b5\u0001"+
		"\u0000\u0000\u0000\u03bb\u03b8\u0001\u0000\u0000\u0000\u03bc\u0091\u0001"+
		"\u0000\u0000\u0000\u03bd\u03bf\u0003\b\u0004\u0000\u03be\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c6\u0003\u0094"+
		"J\u0000\u03c4\u03c6\u0003\u0096K\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c6\u0093\u0001\u0000\u0000\u0000"+
		"\u03c7\u03ca\u0005\u0006\u0000\u0000\u03c8\u03cb\u0005J\u0000\u0000\u03c9"+
		"\u03cb\u0003d2\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cb\u0095\u0001\u0000\u0000\u0000\u03cc\u03cf\u0005"+
		"\u0005\u0000\u0000\u03cd\u03d0\u0005J\u0000\u0000\u03ce\u03d0\u0003d2"+
		"\u0000\u03cf\u03cd\u0001\u0000\u0000\u0000\u03cf\u03ce\u0001\u0000\u0000"+
		"\u0000\u03d0\u0097\u0001\u0000\u0000\u0000\u03d1\u03d2\u0005\n\u0000\u0000"+
		"\u03d2\u03d6\u0005D\u0000\u0000\u03d3\u03d5\u0003\f\u0006\u0000\u03d4"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d8\u0001\u0000\u0000\u0000\u03d6"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d9\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d9"+
		"\u03da\u0003\u009aM\u0000\u03da\u03db\u0005p\u0000\u0000\u03db\u03dc\u0005"+
		"E\u0000\u0000\u03dc\u03dd\u0003\u0088D\u0000\u03dd\u0099\u0001\u0000\u0000"+
		"\u0000\u03de\u03e3\u0003h4\u0000\u03df\u03e0\u0005a\u0000\u0000\u03e0"+
		"\u03e2\u0003h4\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e4\u009b\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e7\u0005\u0015\u0000\u0000\u03e7\u03e8\u0003"+
		"\u0088D\u0000\u03e8\u009d\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005D\u0000"+
		"\u0000\u03ea\u03ec\u0003\u00a0P\u0000\u03eb\u03ed\u0005J\u0000\u0000\u03ec"+
		"\u03eb\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed"+
		"\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005E\u0000\u0000\u03ef\u009f"+
		"\u0001\u0000\u0000\u0000\u03f0\u03f5\u0003\u00a2Q\u0000\u03f1\u03f2\u0005"+
		"J\u0000\u0000\u03f2\u03f4\u0003\u00a2Q\u0000\u03f3\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f7\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u00a1\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f8\u03fa\u0003\f\u0006\u0000"+
		"\u03f9\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fd\u0001\u0000\u0000\u0000"+
		"\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fe\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fe\u03ff\u0003R)\u0000\u03ff\u0400\u0003H$\u0000\u0400\u0401\u0005"+
		"M\u0000\u0000\u0401\u0402\u0003\u00b8\\\u0000\u0402\u00a3\u0001\u0000"+
		"\u0000\u0000\u0403\u0410\u0003\u00a8T\u0000\u0404\u0406\u0003\u00a6S\u0000"+
		"\u0405\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0409\u0005J\u0000\u0000\u0408"+
		"\u040a\u0003\u00b8\\\u0000\u0409\u0408\u0001\u0000\u0000\u0000\u0409\u040a"+
		"\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040d"+
		"\u0005J\u0000\u0000\u040c\u040e\u0003\u00aaU\u0000\u040d\u040c\u0001\u0000"+
		"\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u0410\u0001\u0000"+
		"\u0000\u0000\u040f\u0403\u0001\u0000\u0000\u0000\u040f\u0405\u0001\u0000"+
		"\u0000\u0000\u0410\u00a5\u0001\u0000\u0000\u0000\u0411\u0414\u0003\u008e"+
		"G\u0000\u0412\u0414\u0003\u00aeW\u0000\u0413\u0411\u0001\u0000\u0000\u0000"+
		"\u0413\u0412\u0001\u0000\u0000\u0000\u0414\u00a7\u0001\u0000\u0000\u0000"+
		"\u0415\u0417\u0003\f\u0006\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0417"+
		"\u041a\u0001\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418"+
		"\u0419\u0001\u0000\u0000\u0000\u0419\u041b\u0001\u0000\u0000\u0000\u041a"+
		"\u0418\u0001\u0000\u0000\u0000\u041b\u041c\u0003P(\u0000\u041c\u041d\u0003"+
		"H$\u0000\u041d\u041e\u0005S\u0000\u0000\u041e\u041f\u0003\u00b8\\\u0000"+
		"\u041f\u00a9\u0001\u0000\u0000\u0000\u0420\u0421\u0003\u00aeW\u0000\u0421"+
		"\u00ab\u0001\u0000\u0000\u0000\u0422\u0423\u0005D\u0000\u0000\u0423\u0424"+
		"\u0003\u00b8\\\u0000\u0424\u0425\u0005E\u0000\u0000\u0425\u00ad\u0001"+
		"\u0000\u0000\u0000\u0426\u042b\u0003\u00b8\\\u0000\u0427\u0428\u0005K"+
		"\u0000\u0000\u0428\u042a\u0003\u00b8\\\u0000\u0429\u0427\u0001\u0000\u0000"+
		"\u0000\u042a\u042d\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000\u0000"+
		"\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u00af\u0001\u0000\u0000"+
		"\u0000\u042d\u042b\u0001\u0000\u0000\u0000\u042e\u042f\u0003\u00b8\\\u0000"+
		"\u042f\u00b1\u0001\u0000\u0000\u0000\u0430\u0431\u0003\u00b8\\\u0000\u0431"+
		"\u00b3\u0001\u0000\u0000\u0000\u0432\u0433\u00058\u0000\u0000\u0433\u0437"+
		"\u0003\u00b8\\\u0000\u0434\u0436\u0003\u00b8\\\u0000\u0435\u0434\u0001"+
		"\u0000\u0000\u0000\u0436\u0439\u0001\u0000\u0000\u0000\u0437\u0435\u0001"+
		"\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u00b5\u0001"+
		"\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a\u043b\u0007"+
		"\u0003\u0000\u0000\u043b\u043e\u0003\u00b8\\\u0000\u043c\u043e\u0003\u00b4"+
		"Z\u0000\u043d\u043a\u0001\u0000\u0000\u0000\u043d\u043c\u0001\u0000\u0000"+
		"\u0000\u043e\u00b7\u0001\u0000\u0000\u0000\u043f\u0440\u0006\\\uffff\uffff"+
		"\u0000\u0440\u044d\u0003\u00ba]\u0000\u0441\u0442\u0005 \u0000\u0000\u0442"+
		"\u044d\u0003\u00bc^\u0000\u0443\u0444\u0005D\u0000\u0000\u0444\u0445\u0003"+
		"P(\u0000\u0445\u0446\u0005E\u0000\u0000\u0446\u0447\u0003\u00b8\\\u0011"+
		"\u0447\u044d\u0001\u0000\u0000\u0000\u0448\u0449\u0007\u0004\u0000\u0000"+
		"\u0449\u044d\u0003\u00b8\\\u000f\u044a\u044b\u0007\u0005\u0000\u0000\u044b"+
		"\u044d\u0003\u00b8\\\u000e\u044c\u043f\u0001\u0000\u0000\u0000\u044c\u0441"+
		"\u0001\u0000\u0000\u0000\u044c\u0443\u0001\u0000\u0000\u0000\u044c\u0448"+
		"\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044d\u04b5"+
		"\u0001\u0000\u0000\u0000\u044e\u044f\n\r\u0000\u0000\u044f\u0450\u0007"+
		"\u0006\u0000\u0000\u0450\u04b4\u0003\u00b8\\\u000e\u0451\u0452\n\f\u0000"+
		"\u0000\u0452\u0453\u0007\u0007\u0000\u0000\u0453\u04b4\u0003\u00b8\\\r"+
		"\u0454\u045c\n\u000b\u0000\u0000\u0455\u0456\u0005O\u0000\u0000\u0456"+
		"\u045d\u0005O\u0000\u0000\u0457\u0458\u0005N\u0000\u0000\u0458\u0459\u0005"+
		"N\u0000\u0000\u0459\u045d\u0005N\u0000\u0000\u045a\u045b\u0005N\u0000"+
		"\u0000\u045b\u045d\u0005N\u0000\u0000\u045c\u0455\u0001\u0000\u0000\u0000"+
		"\u045c\u0457\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000"+
		"\u045d\u045e\u0001\u0000\u0000\u0000\u045e\u04b4\u0003\u00b8\\\f\u045f"+
		"\u0460\n\n\u0000\u0000\u0460\u0461\u0007\b\u0000\u0000\u0461\u04b4\u0003"+
		"\u00b8\\\u000b\u0462\u0463\n\b\u0000\u0000\u0463\u0464\u0007\t\u0000\u0000"+
		"\u0464\u04b4\u0003\u00b8\\\t\u0465\u0466\n\u0007\u0000\u0000\u0466\u0467"+
		"\u0005`\u0000\u0000\u0467\u04b4\u0003\u00b8\\\b\u0468\u0469\n\u0006\u0000"+
		"\u0000\u0469\u046a\u0005b\u0000\u0000\u046a\u04b4\u0003\u00b8\\\u0007"+
		"\u046b\u046c\n\u0005\u0000\u0000\u046c\u046d\u0005a\u0000\u0000\u046d"+
		"\u04b4\u0003\u00b8\\\u0006\u046e\u046f\n\u0004\u0000\u0000\u046f\u0470"+
		"\u0005X\u0000\u0000\u0470\u04b4\u0003\u00b8\\\u0005\u0471\u0472\n\u0003"+
		"\u0000\u0000\u0472\u0473\u0005Y\u0000\u0000\u0473\u04b4\u0003\u00b8\\"+
		"\u0004\u0474\u0475\n\u0002\u0000\u0000\u0475\u0476\u0005R\u0000\u0000"+
		"\u0476\u0477\u0003\u00b8\\\u0000\u0477\u0478\u0005S\u0000\u0000\u0478"+
		"\u0479\u0003\u00b8\\\u0003\u0479\u04b4\u0001\u0000\u0000\u0000\u047a\u047b"+
		"\n\u0001\u0000\u0000\u047b\u047c\u0007\n\u0000\u0000\u047c\u04b4\u0003"+
		"\u00b8\\\u0001\u047d\u047e\n\u001c\u0000\u0000\u047e\u047f\u0005L\u0000"+
		"\u0000\u047f\u0480\u0005\u0006\u0000\u0000\u0480\u0482\u0005D\u0000\u0000"+
		"\u0481\u0483\u0003\u00aeW\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0482"+
		"\u0483\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484"+
		"\u04b4\u0005E\u0000\u0000\u0485\u0486\n\u001b\u0000\u0000\u0486\u0487"+
		"\u0005L\u0000\u0000\u0487\u0488\u0005\u0005\u0000\u0000\u0488\u048a\u0005"+
		"D\u0000\u0000\u0489\u048b\u0003\u00aeW\u0000\u048a\u0489\u0001\u0000\u0000"+
		"\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000"+
		"\u0000\u048c\u04b4\u0005E\u0000\u0000\u048d\u048f\n\u001a\u0000\u0000"+
		"\u048e\u0490\u0005R\u0000\u0000\u048f\u048e\u0001\u0000\u0000\u0000\u048f"+
		"\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491"+
		"\u0492\u0005L\u0000\u0000\u0492\u04b4\u0005p\u0000\u0000\u0493\u0494\n"+
		"\u0019\u0000\u0000\u0494\u0495\u0005L\u0000\u0000\u0495\u04b4\u0005*\u0000"+
		"\u0000\u0496\u0497\n\u0018\u0000\u0000\u0497\u0498\u0005L\u0000\u0000"+
		"\u0498\u04b4\u0005 \u0000\u0000\u0499\u049a\n\u0017\u0000\u0000\u049a"+
		"\u049b\u0005L\u0000\u0000\u049b\u04b4\u0007\u000b\u0000\u0000\u049c\u049d"+
		"\n\u0016\u0000\u0000\u049d\u049e\u0005L\u0000\u0000\u049e\u049f\u0005"+
		"(\u0000\u0000\u049f\u04b4\u0003\u00d2i\u0000\u04a0\u04a1\n\u0015\u0000"+
		"\u0000\u04a1\u04a2\u0005L\u0000\u0000\u04a2\u04b4\u0003\u00cae\u0000\u04a3"+
		"\u04a4\n\u0014\u0000\u0000\u04a4\u04a5\u0005H\u0000\u0000\u04a5\u04a6"+
		"\u0003\u00b8\\\u0000\u04a6\u04a7\u0005I\u0000\u0000\u04a7\u04b4\u0001"+
		"\u0000\u0000\u0000\u04a8\u04a9\n\u0013\u0000\u0000\u04a9\u04ab\u0005D"+
		"\u0000\u0000\u04aa\u04ac\u0003\u00aeW\u0000\u04ab\u04aa\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ad\u04b4\u0005E\u0000\u0000\u04ae\u04af\n\u0010\u0000\u0000"+
		"\u04af\u04b4\u0007\f\u0000\u0000\u04b0\u04b1\n\t\u0000\u0000\u04b1\u04b2"+
		"\u0005\u001c\u0000\u0000\u04b2\u04b4\u0003P(\u0000\u04b3\u044e\u0001\u0000"+
		"\u0000\u0000\u04b3\u0451\u0001\u0000\u0000\u0000\u04b3\u0454\u0001\u0000"+
		"\u0000\u0000\u04b3\u045f\u0001\u0000\u0000\u0000\u04b3\u0462\u0001\u0000"+
		"\u0000\u0000\u04b3\u0465\u0001\u0000\u0000\u0000\u04b3\u0468\u0001\u0000"+
		"\u0000\u0000\u04b3\u046b\u0001\u0000\u0000\u0000\u04b3\u046e\u0001\u0000"+
		"\u0000\u0000\u04b3\u0471\u0001\u0000\u0000\u0000\u04b3\u0474\u0001\u0000"+
		"\u0000\u0000\u04b3\u047a\u0001\u0000\u0000\u0000\u04b3\u047d\u0001\u0000"+
		"\u0000\u0000\u04b3\u0485\u0001\u0000\u0000\u0000\u04b3\u048d\u0001\u0000"+
		"\u0000\u0000\u04b3\u0493\u0001\u0000\u0000\u0000\u04b3\u0496\u0001\u0000"+
		"\u0000\u0000\u04b3\u0499\u0001\u0000\u0000\u0000\u04b3\u049c\u0001\u0000"+
		"\u0000\u0000\u04b3\u04a0\u0001\u0000\u0000\u0000\u04b3\u04a3\u0001\u0000"+
		"\u0000\u0000\u04b3\u04a8\u0001\u0000\u0000\u0000\u04b3\u04ae\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b0\u0001\u0000\u0000\u0000\u04b4\u04b7\u0001\u0000"+
		"\u0000\u0000\u04b5\u04b3\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000"+
		"\u0000\u0000\u04b6\u00b9\u0001\u0000\u0000\u0000\u04b7\u04b5\u0001\u0000"+
		"\u0000\u0000\u04b8\u04b9\u0005D\u0000\u0000\u04b9\u04ba\u0003\u00b8\\"+
		"\u0000\u04ba\u04bb\u0005E\u0000\u0000\u04bb\u04cf\u0001\u0000\u0000\u0000"+
		"\u04bc\u04cf\u0005*\u0000\u0000\u04bd\u04cf\u0005(\u0000\u0000\u04be\u04cf"+
		"\u0003j5\u0000\u04bf\u04cf\u0005p\u0000\u0000\u04c0\u04c1\u0003P(\u0000"+
		"\u04c1\u04c2\u0005L\u0000\u0000\u04c2\u04c3\u0005\f\u0000\u0000\u04c3"+
		"\u04cf\u0001\u0000\u0000\u0000\u04c4\u04c5\u0005/\u0000\u0000\u04c5\u04c6"+
		"\u0005L\u0000\u0000\u04c6\u04cf\u0005\f\u0000\u0000\u04c7\u04cb\u0003"+
		"\u00ccf\u0000\u04c8\u04cc\u0003\u00d4j\u0000\u04c9\u04ca\u0005*\u0000"+
		"\u0000\u04ca\u04cc\u0003\u00d6k\u0000\u04cb\u04c8\u0001\u0000\u0000\u0000"+
		"\u04cb\u04c9\u0001\u0000\u0000\u0000\u04cc\u04cf\u0001\u0000\u0000\u0000"+
		"\u04cd\u04cf\u0005\u0002\u0000\u0000\u04ce\u04b8\u0001\u0000\u0000\u0000"+
		"\u04ce\u04bc\u0001\u0000\u0000\u0000\u04ce\u04bd\u0001\u0000\u0000\u0000"+
		"\u04ce\u04be\u0001\u0000\u0000\u0000\u04ce\u04bf\u0001\u0000\u0000\u0000"+
		"\u04ce\u04c0\u0001\u0000\u0000\u0000\u04ce\u04c4\u0001\u0000\u0000\u0000"+
		"\u04ce\u04c7\u0001\u0000\u0000\u0000\u04ce\u04cd\u0001\u0000\u0000\u0000"+
		"\u04cf\u00bb\u0001\u0000\u0000\u0000\u04d0\u04d1\u0003\u00ccf\u0000\u04d1"+
		"\u04d2\u0003\u00be_\u0000\u04d2\u04d3\u0003\u00c8d\u0000\u04d3\u04dc\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d9\u0003\u00be_\u0000\u04d5\u04da\u0003\u00c2"+
		"a\u0000\u04d6\u04da\u0003\u00c8d\u0000\u04d7\u04da\u0003\u00c4b\u0000"+
		"\u04d8\u04da\u0003\u00c6c\u0000\u04d9\u04d5\u0001\u0000\u0000\u0000\u04d9"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9"+
		"\u04d8\u0001\u0000\u0000\u0000\u04da\u04dc\u0001\u0000\u0000\u0000\u04db"+
		"\u04d0\u0001\u0000\u0000\u0000\u04db\u04d4\u0001\u0000\u0000\u0000\u04dc"+
		"\u00bd\u0001\u0000\u0000\u0000\u04dd\u04df\u0005p\u0000\u0000\u04de\u04e0"+
		"\u0003\u00ceg\u0000\u04df\u04de\u0001\u0000\u0000\u0000\u04df\u04e0\u0001"+
		"\u0000\u0000\u0000\u04e0\u04e8\u0001\u0000\u0000\u0000\u04e1\u04e2\u0005"+
		"L\u0000\u0000\u04e2\u04e4\u0005p\u0000\u0000\u04e3\u04e5\u0003\u00ceg"+
		"\u0000\u04e4\u04e3\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e5\u04e7\u0001\u0000\u0000\u0000\u04e6\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e7\u04ea\u0001\u0000\u0000\u0000\u04e8\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04ef\u0001\u0000\u0000"+
		"\u0000\u04ea\u04e8\u0001\u0000\u0000\u0000\u04eb\u04ef\u0003T*\u0000\u04ec"+
		"\u04ed\u0005\u0005\u0000\u0000\u04ed\u04ef\u0003\u00ceg\u0000\u04ee\u04dd"+
		"\u0001\u0000\u0000\u0000\u04ee\u04eb\u0001\u0000\u0000\u0000\u04ee\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ef\u00bf\u0001\u0000\u0000\u0000\u04f0\u04f2"+
		"\u0005p\u0000\u0000\u04f1\u04f3\u0003\u00d0h\u0000\u04f2\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f5\u0003\u00c8d\u0000\u04f5\u00c1\u0001\u0000\u0000"+
		"\u0000\u04f6\u0512\u0005H\u0000\u0000\u04f7\u04fc\u0005I\u0000\u0000\u04f8"+
		"\u04f9\u0005H\u0000\u0000\u04f9\u04fb\u0005I\u0000\u0000\u04fa\u04f8\u0001"+
		"\u0000\u0000\u0000\u04fb\u04fe\u0001\u0000\u0000\u0000\u04fc\u04fa\u0001"+
		"\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000\u0000\u04fd\u04ff\u0001"+
		"\u0000\u0000\u0000\u04fe\u04fc\u0001\u0000\u0000\u0000\u04ff\u0513\u0003"+
		"L&\u0000\u0500\u0501\u0003\u00b8\\\u0000\u0501\u0508\u0005I\u0000\u0000"+
		"\u0502\u0503\u0005H\u0000\u0000\u0503\u0504\u0003\u00b8\\\u0000\u0504"+
		"\u0505\u0005I\u0000\u0000\u0505\u0507\u0001\u0000\u0000\u0000\u0506\u0502"+
		"\u0001\u0000\u0000\u0000\u0507\u050a\u0001\u0000\u0000\u0000\u0508\u0506"+
		"\u0001\u0000\u0000\u0000\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u050f"+
		"\u0001\u0000\u0000\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050b\u050c"+
		"\u0005H\u0000\u0000\u050c\u050e\u0005I\u0000\u0000\u050d\u050b\u0001\u0000"+
		"\u0000\u0000\u050e\u0511\u0001\u0000\u0000\u0000\u050f\u050d\u0001\u0000"+
		"\u0000\u0000\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u0513\u0001\u0000"+
		"\u0000\u0000\u0511\u050f\u0001\u0000\u0000\u0000\u0512\u04f7\u0001\u0000"+
		"\u0000\u0000\u0512\u0500\u0001\u0000\u0000\u0000\u0513\u00c3\u0001\u0000"+
		"\u0000\u0000\u0514\u0530\u0005F\u0000\u0000\u0515\u0531\u0005G\u0000\u0000"+
		"\u0516\u0519\u0005p\u0000\u0000\u0517\u0519\u0003\u00b8\\\u0000\u0518"+
		"\u0516\u0001\u0000\u0000\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0519"+
		"\u051a\u0001\u0000\u0000\u0000\u051a\u051d\u0005o\u0000\u0000\u051b\u051e"+
		"\u0003j5\u0000\u051c\u051e\u0003\u00b8\\\u0000\u051d\u051b\u0001\u0000"+
		"\u0000\u0000\u051d\u051c\u0001\u0000\u0000\u0000\u051e\u052b\u0001\u0000"+
		"\u0000\u0000\u051f\u0522\u0005K\u0000\u0000\u0520\u0523\u0005p\u0000\u0000"+
		"\u0521\u0523\u0003\u00b8\\\u0000\u0522\u0520\u0001\u0000\u0000\u0000\u0522"+
		"\u0521\u0001\u0000\u0000\u0000\u0523\u0524\u0001\u0000\u0000\u0000\u0524"+
		"\u0527\u0005o\u0000\u0000\u0525\u0528\u0003j5\u0000\u0526\u0528\u0003"+
		"\u00b8\\\u0000\u0527\u0525\u0001\u0000\u0000\u0000\u0527\u0526\u0001\u0000"+
		"\u0000\u0000\u0528\u052a\u0001\u0000\u0000\u0000\u0529\u051f\u0001\u0000"+
		"\u0000\u0000\u052a\u052d\u0001\u0000\u0000\u0000\u052b\u0529\u0001\u0000"+
		"\u0000\u0000\u052b\u052c\u0001\u0000\u0000\u0000\u052c\u052e\u0001\u0000"+
		"\u0000\u0000\u052d\u052b\u0001\u0000\u0000\u0000\u052e\u052f\u0005G\u0000"+
		"\u0000\u052f\u0531\u0001\u0000\u0000\u0000\u0530\u0515\u0001\u0000\u0000"+
		"\u0000\u0530\u0518\u0001\u0000\u0000\u0000\u0531\u00c5\u0001\u0000\u0000"+
		"\u0000\u0532\u0544\u0005F\u0000\u0000\u0533\u0545\u0005G\u0000\u0000\u0534"+
		"\u0537\u0003j5\u0000\u0535\u0537\u0003\u00b8\\\u0000\u0536\u0534\u0001"+
		"\u0000\u0000\u0000\u0536\u0535\u0001\u0000\u0000\u0000\u0537\u053f\u0001"+
		"\u0000\u0000\u0000\u0538\u053b\u0005K\u0000\u0000\u0539\u053c\u0003j5"+
		"\u0000\u053a\u053c\u0003\u00b8\\\u0000\u053b\u0539\u0001\u0000\u0000\u0000"+
		"\u053b\u053a\u0001\u0000\u0000\u0000\u053c\u053e\u0001\u0000\u0000\u0000"+
		"\u053d\u0538\u0001\u0000\u0000\u0000\u053e\u0541\u0001\u0000\u0000\u0000"+
		"\u053f\u053d\u0001\u0000\u0000\u0000\u053f\u0540\u0001\u0000\u0000\u0000"+
		"\u0540\u0542\u0001\u0000\u0000\u0000\u0541\u053f\u0001\u0000\u0000\u0000"+
		"\u0542\u0543\u0005G\u0000\u0000\u0543\u0545\u0001\u0000\u0000\u0000\u0544"+
		"\u0533\u0001\u0000\u0000\u0000\u0544\u0536\u0001\u0000\u0000\u0000\u0545"+
		"\u00c7\u0001\u0000\u0000\u0000\u0546\u0548\u0003\u00d6k\u0000\u0547\u0549"+
		"\u0003\"\u0011\u0000\u0548\u0547\u0001\u0000\u0000\u0000\u0548\u0549\u0001"+
		"\u0000\u0000\u0000\u0549\u00c9\u0001\u0000\u0000\u0000\u054a\u054b\u0003"+
		"\u00ccf\u0000\u054b\u054c\u0003\u00d4j\u0000\u054c\u00cb\u0001\u0000\u0000"+
		"\u0000\u054d\u054e\u0005O\u0000\u0000\u054e\u054f\u0003 \u0010\u0000\u054f"+
		"\u0550\u0005N\u0000\u0000\u0550\u00cd\u0001\u0000\u0000\u0000\u0551\u0552"+
		"\u0005O\u0000\u0000\u0552\u0555\u0005N\u0000\u0000\u0553\u0555\u0003V"+
		"+\u0000\u0554\u0551\u0001\u0000\u0000\u0000\u0554\u0553\u0001\u0000\u0000"+
		"\u0000\u0555\u00cf\u0001\u0000\u0000\u0000\u0556\u0557\u0005O\u0000\u0000"+
		"\u0557\u055a\u0005N\u0000\u0000\u0558\u055a\u0003\u00ccf\u0000\u0559\u0556"+
		"\u0001\u0000\u0000\u0000\u0559\u0558\u0001\u0000\u0000\u0000\u055a\u00d1"+
		"\u0001\u0000\u0000\u0000\u055b\u0562\u0003\u00d6k\u0000\u055c\u055d\u0005"+
		"L\u0000\u0000\u055d\u055f\u0005p\u0000\u0000\u055e\u0560\u0003\u00d6k"+
		"\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u055f\u0560\u0001\u0000\u0000"+
		"\u0000\u0560\u0562\u0001\u0000\u0000\u0000\u0561\u055b\u0001\u0000\u0000"+
		"\u0000\u0561\u055c\u0001\u0000\u0000\u0000\u0562\u00d3\u0001\u0000\u0000"+
		"\u0000\u0563\u0564\u0005(\u0000\u0000\u0564\u0568\u0003\u00d2i\u0000\u0565"+
		"\u0566\u0005p\u0000\u0000\u0566\u0568\u0003\u00d6k\u0000\u0567\u0563\u0001"+
		"\u0000\u0000\u0000\u0567\u0565\u0001\u0000\u0000\u0000\u0568\u00d5\u0001"+
		"\u0000\u0000\u0000\u0569\u056b\u0005D\u0000\u0000\u056a\u056c\u0003\u00ae"+
		"W\u0000\u056b\u056a\u0001\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000"+
		"\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056e\u0005E\u0000\u0000"+
		"\u056e\u00d7\u0001\u0000\u0000\u0000\u00a5\u00d9\u00de\u00e4\u00ec\u00f5"+
		"\u00fa\u0101\u0108\u010f\u0116\u011b\u0121\u0131\u0135\u013a\u013e\u0142"+
		"\u014c\u0154\u015b\u0162\u0166\u0169\u016c\u0175\u017b\u0180\u0183\u0189"+
		"\u018f\u0193\u019c\u01a3\u01ac\u01b3\u01b9\u01bd\u01c9\u01cc\u01d0\u01d8"+
		"\u01dd\u01e1\u01ea\u01fc\u0203\u0208\u0211\u0219\u0223\u022b\u0233\u0238"+
		"\u0244\u024a\u0251\u0256\u025e\u0262\u0264\u026f\u0277\u027a\u027e\u0283"+
		"\u0287\u028c\u0296\u029f\u02a1\u02a8\u02ad\u02b6\u02bb\u02be\u02c3\u02cc"+
		"\u02dc\u02e6\u02e9\u02ef\u02f4\u02fe\u0306\u0309\u030c\u0319\u0321\u0326"+
		"\u032e\u0332\u0336\u033a\u033c\u0340\u0346\u0351\u0359\u0361\u036d\u038a"+
		"\u038d\u0390\u0398\u039c\u03a0\u03a9\u03ae\u03bb\u03c0\u03c5\u03ca\u03cf"+
		"\u03d6\u03e3\u03ec\u03f5\u03fb\u0405\u0409\u040d\u040f\u0413\u0418\u042b"+
		"\u0437\u043d\u044c\u045c\u0482\u048a\u048f\u04ab\u04b3\u04b5\u04cb\u04ce"+
		"\u04d9\u04db\u04df\u04e4\u04e8\u04ee\u04f2\u04fc\u0508\u050f\u0512\u0518"+
		"\u051d\u0522\u0527\u052b\u0530\u0536\u053b\u053f\u0544\u0548\u0554\u0559"+
		"\u055f\u0561\u0567\u056b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}