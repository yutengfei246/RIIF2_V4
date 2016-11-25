// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_V4/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2.v4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RIIF2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, COMPONENT=44, END_COMPONENT=45, 
		ENVIRONMENT=46, END_ENVIRONMENT=47, REQUIREMENT=48, END_REQUIREMENT=49, 
		CHILD_COMPONENT=50, FAIL_MODE=51, EXTENDS=52, ASSIGN=53, ASSERT=54, INPUT=55, 
		OUTPUT=56, PARAMETER=57, CONSTANT=58, TYPE_FLOAT=59, TYPE_INTEGER=60, 
		TYPE_STRING=61, TYPE_ENUM=62, FUNC_AGG_SINGLE=63, FUNC_GT_N_FAIL=64, FUNC_LOG=65, 
		FUNC_EXP=66, TEMPLATE=67, END_TEMPLATE=68, IMPOSE=69, ABSTRACT=70, IMPLEMENTS=71, 
		SELF=72, SET=73, TYPE_TABLE=74, PLATFORM=75, Identifier=76, StringLiteral=77, 
		FloatingPointLiteral=78, DecimalLiteral=79, WS=80, COMMENT=81, LINE_COMMENT=82;
	public static final int
		RULE_program = 0, RULE_typeDeclaration = 1, RULE_templateDeclaration = 2, 
		RULE_templateBodyElement = 3, RULE_componentDeclaration = 4, RULE_componentBodyElement = 5, 
		RULE_fieldDeclaration = 6, RULE_failModeDeclaration = 7, RULE_failModeDeclarator = 8, 
		RULE_imposeDeclaration = 9, RULE_imposeDeclarator = 10, RULE_imposeDeclaratorId = 11, 
		RULE_imposeInitializer = 12, RULE_variableDeclarator = 13, RULE_associativeDeclarator = 14, 
		RULE_variableInitializer = 15, RULE_listInitializer = 16, RULE_arrayInitializer = 17, 
		RULE_item = 18, RULE_assignmentDeclaration = 19, RULE_assignmentDeclarator = 20, 
		RULE_assignmentDeclaratorId = 21, RULE_assignmentVariableId = 22, RULE_assignmentVariableAttributeId = 23, 
		RULE_assignmentInitializer = 24, RULE_variableId = 25, RULE_vector = 26, 
		RULE_variableDeclaratorId = 27, RULE_associativeDeclaratorId = 28, RULE_associativeInstanceId = 29, 
		RULE_primitiveType = 30, RULE_componentType = 31, RULE_abstractType = 32, 
		RULE_enumType = 33, RULE_expression = 34, RULE_primary = 35, RULE_funcCall = 36, 
		RULE_funcName = 37, RULE_funcArg = 38, RULE_literal = 39;
	public static final String[] ruleNames = {
		"program", "typeDeclaration", "templateDeclaration", "templateBodyElement", 
		"componentDeclaration", "componentBodyElement", "fieldDeclaration", "failModeDeclaration", 
		"failModeDeclarator", "imposeDeclaration", "imposeDeclarator", "imposeDeclaratorId", 
		"imposeInitializer", "variableDeclarator", "associativeDeclarator", "variableInitializer", 
		"listInitializer", "arrayInitializer", "item", "assignmentDeclaration", 
		"assignmentDeclarator", "assignmentDeclaratorId", "assignmentVariableId", 
		"assignmentVariableAttributeId", "assignmentInitializer", "variableId", 
		"vector", "variableDeclaratorId", "associativeDeclaratorId", "associativeInstanceId", 
		"primitiveType", "componentType", "abstractType", "enumType", "expression", 
		"primary", "funcCall", "funcName", "funcArg", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "':'", "':='", "'{'", "'}'", "'['", "']'", 
		"'.'", "'''", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
		"'?'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'>>='", 
		"'>>>='", "'<<='", "'%='", "'('", "')'", "'component'", "'endcomponent'", 
		"'environment'", "'endenvironment'", "'requirement'", "'endrequirement'", 
		"'child_component'", "'fail_mode'", "'extends'", "'assign'", "'assert'", 
		"'input'", "'output'", "'parameter'", "'constant'", "'float'", "'integer'", 
		"'string'", "'enum'", "'agg_single_fail'", "'agg_gt_n_fail'", "'LOG'", 
		"'EXP'", "'template'", "'endtemplate'", "'impose'", "'abstract'", "'implements'", 
		"'self'", "'set'", "'table'", "'platform'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "COMPONENT", "END_COMPONENT", 
		"ENVIRONMENT", "END_ENVIRONMENT", "REQUIREMENT", "END_REQUIREMENT", "CHILD_COMPONENT", 
		"FAIL_MODE", "EXTENDS", "ASSIGN", "ASSERT", "INPUT", "OUTPUT", "PARAMETER", 
		"CONSTANT", "TYPE_FLOAT", "TYPE_INTEGER", "TYPE_STRING", "TYPE_ENUM", 
		"FUNC_AGG_SINGLE", "FUNC_GT_N_FAIL", "FUNC_LOG", "FUNC_EXP", "TEMPLATE", 
		"END_TEMPLATE", "IMPOSE", "ABSTRACT", "IMPLEMENTS", "SELF", "SET", "TYPE_TABLE", 
		"PLATFORM", "Identifier", "StringLiteral", "FloatingPointLiteral", "DecimalLiteral", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "RIIF2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RIIF2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RIIF2Parser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				typeDeclaration();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEMPLATE );
			setState(85);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			templateDeclaration();
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

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(RIIF2Parser.TEMPLATE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public TerminalNode END_TEMPLATE() { return getToken(RIIF2Parser.END_TEMPLATE, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public List<TemplateBodyElementContext> templateBodyElement() {
			return getRuleContexts(TemplateBodyElementContext.class);
		}
		public TemplateBodyElementContext templateBodyElement(int i) {
			return getRuleContext(TemplateBodyElementContext.class,i);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateDeclaration(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_templateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(TEMPLATE);
			setState(90);
			match(Identifier);
			setState(93);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(91);
				match(EXTENDS);
				setState(92);
				match(Identifier);
				}
			}

			setState(95);
			match(T__0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (FAIL_MODE - 51)) | (1L << (IMPOSE - 51)) | (1L << (ABSTRACT - 51)))) != 0)) {
				{
				{
				setState(96);
				templateBodyElement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(END_TEMPLATE);
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

	public static class TemplateBodyElementContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FailModeDeclarationContext failModeDeclaration() {
			return getRuleContext(FailModeDeclarationContext.class,0);
		}
		public ImposeDeclarationContext imposeDeclaration() {
			return getRuleContext(ImposeDeclarationContext.class,0);
		}
		public TemplateBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateBodyElement(this);
		}
	}

	public final TemplateBodyElementContext templateBodyElement() throws RecognitionException {
		TemplateBodyElementContext _localctx = new TemplateBodyElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateBodyElement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				failModeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				imposeDeclaration();
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

	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(RIIF2Parser.COMPONENT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public TerminalNode END_COMPONENT() { return getToken(RIIF2Parser.END_COMPONENT, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(RIIF2Parser.IMPLEMENTS, 0); }
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentDeclaration(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(COMPONENT);
			setState(110);
			match(Identifier);
			setState(120);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(111);
				match(EXTENDS);
				setState(112);
				match(Identifier);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(113);
					match(T__1);
					setState(114);
					match(Identifier);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(122);
				match(IMPLEMENTS);
				setState(123);
				match(Identifier);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(124);
					match(T__1);
					setState(125);
					match(Identifier);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FAIL_MODE || _la==ABSTRACT) {
				{
				{
				setState(134);
				componentBodyElement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(END_COMPONENT);
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

	public static class ComponentBodyElementContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FailModeDeclarationContext failModeDeclaration() {
			return getRuleContext(FailModeDeclarationContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentBodyElement(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentBodyElement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				failModeDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public AbstractTypeContext abstractType() {
			return getRuleContext(AbstractTypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public AssociativeDeclaratorContext associativeDeclarator() {
			return getRuleContext(AssociativeDeclaratorContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			abstractType();
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(147);
				variableDeclarator();
				}
				break;
			case 2:
				{
				setState(148);
				associativeDeclarator();
				}
				break;
			}
			setState(151);
			match(T__0);
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

	public static class FailModeDeclarationContext extends ParserRuleContext {
		public AbstractTypeContext abstractType() {
			return getRuleContext(AbstractTypeContext.class,0);
		}
		public FailModeDeclaratorContext failModeDeclarator() {
			return getRuleContext(FailModeDeclaratorContext.class,0);
		}
		public FailModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclaration(this);
		}
	}

	public final FailModeDeclarationContext failModeDeclaration() throws RecognitionException {
		FailModeDeclarationContext _localctx = new FailModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_failModeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			abstractType();
			setState(154);
			failModeDeclarator();
			setState(155);
			match(T__0);
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

	public static class FailModeDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AssociativeDeclaratorIdContext associativeDeclaratorId() {
			return getRuleContext(AssociativeDeclaratorIdContext.class,0);
		}
		public FailModeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclarator(this);
		}
	}

	public final FailModeDeclaratorContext failModeDeclarator() throws RecognitionException {
		FailModeDeclaratorContext _localctx = new FailModeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_failModeDeclarator);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				associativeDeclaratorId();
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

	public static class ImposeDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPOSE() { return getToken(RIIF2Parser.IMPOSE, 0); }
		public ImposeDeclaratorContext imposeDeclarator() {
			return getRuleContext(ImposeDeclaratorContext.class,0);
		}
		public ImposeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclaration(this);
		}
	}

	public final ImposeDeclarationContext imposeDeclaration() throws RecognitionException {
		ImposeDeclarationContext _localctx = new ImposeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imposeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IMPOSE);
			setState(162);
			imposeDeclarator();
			setState(163);
			match(T__0);
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

	public static class ImposeDeclaratorContext extends ParserRuleContext {
		public ImposeDeclaratorIdContext imposeDeclaratorId() {
			return getRuleContext(ImposeDeclaratorIdContext.class,0);
		}
		public ImposeInitializerContext imposeInitializer() {
			return getRuleContext(ImposeInitializerContext.class,0);
		}
		public ImposeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclarator(this);
		}
	}

	public final ImposeDeclaratorContext imposeDeclarator() throws RecognitionException {
		ImposeDeclaratorContext _localctx = new ImposeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imposeDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			imposeDeclaratorId();
			setState(166);
			match(T__2);
			setState(167);
			imposeInitializer();
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

	public static class ImposeDeclaratorIdContext extends ParserRuleContext {
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public ImposeDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclaratorId(this);
		}
	}

	public final ImposeDeclaratorIdContext imposeDeclaratorId() throws RecognitionException {
		ImposeDeclaratorIdContext _localctx = new ImposeDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imposeDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			assignmentDeclaratorId();
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

	public static class ImposeInitializerContext extends ParserRuleContext {
		public AssignmentInitializerContext assignmentInitializer() {
			return getRuleContext(AssignmentInitializerContext.class,0);
		}
		public ImposeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeInitializer(this);
		}
	}

	public final ImposeInitializerContext imposeInitializer() throws RecognitionException {
		ImposeInitializerContext _localctx = new ImposeInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imposeInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			assignmentInitializer();
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			variableDeclaratorId();
			setState(182);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(174);
				match(T__3);
				setState(175);
				primitiveType();
				setState(178);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(176);
					match(T__4);
					setState(177);
					variableInitializer();
					}
				}

				}
				break;
			case T__4:
				{
				setState(180);
				match(T__4);
				setState(181);
				listInitializer();
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

	public static class AssociativeDeclaratorContext extends ParserRuleContext {
		public AssociativeDeclaratorIdContext associativeDeclaratorId() {
			return getRuleContext(AssociativeDeclaratorIdContext.class,0);
		}
		public AssociativeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeDeclarator(this);
		}
	}

	public final AssociativeDeclaratorContext associativeDeclarator() throws RecognitionException {
		AssociativeDeclaratorContext _localctx = new AssociativeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_associativeDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			associativeDeclaratorId();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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

	public static class ListInitializerContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ListInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListInitializer(this);
		}
	}

	public final ListInitializerContext listInitializer() throws RecognitionException {
		ListInitializerContext _localctx = new ListInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__5);
			setState(189);
			item();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(190);
				match(T__1);
				setState(191);
				item();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(T__6);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__7);
			setState(200);
			item();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(201);
				match(T__1);
				setState(202);
				item();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(T__8);
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

	public static class ItemContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_item);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				arrayInitializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				listInitializer();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__41:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case Identifier:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
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

	public static class AssignmentDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RIIF2Parser.ASSIGN, 0); }
		public AssignmentDeclaratorContext assignmentDeclarator() {
			return getRuleContext(AssignmentDeclaratorContext.class,0);
		}
		public AssignmentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentDeclaration(this);
		}
	}

	public final AssignmentDeclarationContext assignmentDeclaration() throws RecognitionException {
		AssignmentDeclarationContext _localctx = new AssignmentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ASSIGN);
			setState(216);
			assignmentDeclarator();
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

	public static class AssignmentDeclaratorContext extends ParserRuleContext {
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public AssignmentInitializerContext assignmentInitializer() {
			return getRuleContext(AssignmentInitializerContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignmentDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentDeclarator(this);
		}
	}

	public final AssignmentDeclaratorContext assignmentDeclarator() throws RecognitionException {
		AssignmentDeclaratorContext _localctx = new AssignmentDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			assignmentDeclaratorId();
			setState(220);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(219);
				vector();
				}
			}

			setState(222);
			match(T__2);
			setState(223);
			assignmentInitializer();
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

	public static class AssignmentDeclaratorIdContext extends ParserRuleContext {
		public AssignmentVariableIdContext assignmentVariableId() {
			return getRuleContext(AssignmentVariableIdContext.class,0);
		}
		public AssignmentVariableAttributeIdContext assignmentVariableAttributeId() {
			return getRuleContext(AssignmentVariableAttributeIdContext.class,0);
		}
		public AssignmentDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentDeclaratorId(this);
		}
	}

	public final AssignmentDeclaratorIdContext assignmentDeclaratorId() throws RecognitionException {
		AssignmentDeclaratorIdContext _localctx = new AssignmentDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentDeclaratorId);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				assignmentVariableId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				assignmentVariableAttributeId();
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

	public static class AssignmentVariableIdContext extends ParserRuleContext {
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public AssignmentVariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentVariableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentVariableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentVariableId(this);
		}
	}

	public final AssignmentVariableIdContext assignmentVariableId() throws RecognitionException {
		AssignmentVariableIdContext _localctx = new AssignmentVariableIdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentVariableId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					variableId();
					setState(230);
					match(T__9);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(237);
			variableId();
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

	public static class AssignmentVariableAttributeIdContext extends ParserRuleContext {
		public AssignmentVariableIdContext assignmentVariableId() {
			return getRuleContext(AssignmentVariableIdContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssignmentVariableAttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentVariableAttributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentVariableAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentVariableAttributeId(this);
		}
	}

	public final AssignmentVariableAttributeIdContext assignmentVariableAttributeId() throws RecognitionException {
		AssignmentVariableAttributeIdContext _localctx = new AssignmentVariableAttributeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentVariableAttributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			assignmentVariableId();
			{
			setState(240);
			match(T__10);
			setState(241);
			match(Identifier);
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

	public static class AssignmentInitializerContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public AssignmentInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentInitializer(this);
		}
	}

	public final AssignmentInitializerContext assignmentInitializer() throws RecognitionException {
		AssignmentInitializerContext _localctx = new AssignmentInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			item();
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

	public static class VariableIdContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AssociativeInstanceIdContext associativeInstanceId() {
			return getRuleContext(AssociativeInstanceIdContext.class,0);
		}
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableId(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableId);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				associativeInstanceId();
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

	public static class VectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__7);
			setState(250);
			expression(0);
			setState(251);
			match(T__1);
			setState(252);
			expression(0);
			setState(253);
			match(T__8);
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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

	public static class AssociativeDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssociativeDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeDeclaratorId(this);
		}
	}

	public final AssociativeDeclaratorIdContext associativeDeclaratorId() throws RecognitionException {
		AssociativeDeclaratorIdContext _localctx = new AssociativeDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_associativeDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(Identifier);
			setState(258);
			match(T__7);
			setState(259);
			match(T__8);
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

	public static class AssociativeInstanceIdContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public AssociativeInstanceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeInstanceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeInstanceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeInstanceId(this);
		}
	}

	public final AssociativeInstanceIdContext associativeInstanceId() throws RecognitionException {
		AssociativeInstanceIdContext _localctx = new AssociativeInstanceIdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_associativeInstanceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Identifier);
			setState(262);
			match(T__7);
			setState(263);
			match(Identifier);
			setState(264);
			match(T__8);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_FLOAT() { return getToken(RIIF2Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(RIIF2Parser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_STRING() { return getToken(RIIF2Parser.TYPE_STRING, 0); }
		public TerminalNode TYPE_TABLE() { return getToken(RIIF2Parser.TYPE_TABLE, 0); }
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primitiveType);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(TYPE_FLOAT);
				}
				break;
			case TYPE_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(TYPE_INTEGER);
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(TYPE_STRING);
				}
				break;
			case TYPE_TABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(TYPE_TABLE);
				}
				break;
			case TYPE_ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				enumType();
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

	public static class ComponentTypeContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentType(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_componentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAIL_MODE) | (1L << PARAMETER) | (1L << CONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AbstractTypeContext extends ParserRuleContext {
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public AbstractTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractType(this);
		}
	}

	public final AbstractTypeContext abstractType() throws RecognitionException {
		AbstractTypeContext _localctx = new AbstractTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_abstractType);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(FAIL_MODE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(ABSTRACT);
				setState(277);
				match(PARAMETER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(ABSTRACT);
				setState(279);
				match(CONSTANT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(ABSTRACT);
				setState(281);
				match(FAIL_MODE);
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

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_ENUM() { return getToken(RIIF2Parser.TYPE_ENUM, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnumType(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(TYPE_ENUM);
			setState(285);
			match(T__5);
			setState(286);
			match(Identifier);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(287);
				match(T__1);
				setState(288);
				match(Identifier);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__6);
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExpression(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			switch (_input.LA(1)) {
			case T__41:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case Identifier:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				{
				setState(297);
				primary();
				}
				break;
			case T__11:
			case T__12:
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(299);
				expression(14);
				}
				break;
			case T__13:
			case T__14:
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(301);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(305);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(306);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(308);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(309);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(318);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(311);
							match(T__18);
							setState(312);
							match(T__18);
							}
							break;
						case 2:
							{
							setState(313);
							match(T__19);
							setState(314);
							match(T__19);
							setState(315);
							match(T__19);
							}
							break;
						case 3:
							{
							setState(316);
							match(T__19);
							setState(317);
							match(T__19);
							}
							break;
						}
						setState(320);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(322);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(323);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(325);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(326);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(328);
						match(T__24);
						setState(329);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(331);
						match(T__25);
						setState(332);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(334);
						match(T__26);
						setState(335);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(337);
						match(T__27);
						setState(338);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(340);
						match(T__28);
						setState(341);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(343);
						match(T__29);
						setState(344);
						expression(0);
						setState(345);
						match(T__3);
						setState(346);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(349);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(350);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(RIIF2Parser.SELF, 0); }
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primary);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__41);
				setState(357);
				expression(0);
				setState(358);
				match(T__42);
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(SELF);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				assignmentDeclaratorId();
				}
				break;
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				literal();
				}
				break;
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				funcCall();
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			funcName();
			setState(367);
			match(T__41);
			setState(368);
			funcArg();
			setState(371);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(369);
				match(T__1);
				setState(370);
				funcArg();
				}
			}

			setState(373);
			match(T__42);
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

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode FUNC_LOG() { return getToken(RIIF2Parser.FUNC_LOG, 0); }
		public TerminalNode FUNC_EXP() { return getToken(RIIF2Parser.FUNC_EXP, 0); }
		public TerminalNode FUNC_AGG_SINGLE() { return getToken(RIIF2Parser.FUNC_AGG_SINGLE, 0); }
		public TerminalNode FUNC_GT_N_FAIL() { return getToken(RIIF2Parser.FUNC_GT_N_FAIL, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (FUNC_AGG_SINGLE - 63)) | (1L << (FUNC_GT_N_FAIL - 63)) | (1L << (FUNC_LOG - 63)) | (1L << (FUNC_EXP - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FuncArgContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncArg(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_funcArg);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(377);
				assignmentDeclaratorId();
				}
				setState(378);
				vector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				expression(0);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RIIF2Parser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(RIIF2Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RIIF2Parser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (StringLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (DecimalLiteral - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\6\2T\n\2\r"+
		"\2\16\2U\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\7\4d\n\4\f\4"+
		"\16\4g\13\4\3\4\3\4\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6v"+
		"\n\6\f\6\16\6y\13\6\5\6{\n\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084"+
		"\13\6\5\6\u0086\n\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6"+
		"\3\7\3\7\5\7\u0093\n\7\3\b\3\b\3\b\5\b\u0098\n\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\5\17\u00b9"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00c3\n\22\f\22\16"+
		"\22\u00c6\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00ce\n\23\f\23\16"+
		"\23\u00d1\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u00d8\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u00df\n\26\3\26\3\26\3\26\3\27\3\27\5\27\u00e6\n\27\3"+
		"\30\3\30\3\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u00fa\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \5 \u0112\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u011d\n\""+
		"\3#\3#\3#\3#\3#\7#\u0124\n#\f#\16#\u0127\13#\3#\3#\3$\3$\3$\3$\3$\3$\5"+
		"$\u0131\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0141\n$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\7$\u0162\n$\f$\16$\u0165\13$\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u016f\n%\3&\3&\3&\3&\3&\5&\u0176\n&\3&\3&\3\'\3\'\3(\3(\3(\3(\5"+
		"(\u0180\n(\3)\3)\3)\2\3F*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNP\2\13\4\2\65\65;<\3\2\16\17\3\2\20\21\3\2"+
		"\22\24\3\2\25\30\3\2\31\32\4\2\5\5!+\3\2AD\3\2OQ\u0190\2S\3\2\2\2\4Y\3"+
		"\2\2\2\6[\3\2\2\2\bm\3\2\2\2\no\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2"+
		"\2\20\u009b\3\2\2\2\22\u00a1\3\2\2\2\24\u00a3\3\2\2\2\26\u00a7\3\2\2\2"+
		"\30\u00ab\3\2\2\2\32\u00ad\3\2\2\2\34\u00af\3\2\2\2\36\u00ba\3\2\2\2 "+
		"\u00bc\3\2\2\2\"\u00be\3\2\2\2$\u00c9\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3"+
		"\2\2\2*\u00dc\3\2\2\2,\u00e5\3\2\2\2.\u00ec\3\2\2\2\60\u00f1\3\2\2\2\62"+
		"\u00f5\3\2\2\2\64\u00f9\3\2\2\2\66\u00fb\3\2\2\28\u0101\3\2\2\2:\u0103"+
		"\3\2\2\2<\u0107\3\2\2\2>\u0111\3\2\2\2@\u0113\3\2\2\2B\u011c\3\2\2\2D"+
		"\u011e\3\2\2\2F\u0130\3\2\2\2H\u016e\3\2\2\2J\u0170\3\2\2\2L\u0179\3\2"+
		"\2\2N\u017f\3\2\2\2P\u0181\3\2\2\2RT\5\4\3\2SR\3\2\2\2TU\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VW\3\2\2\2WX\7\2\2\3X\3\3\2\2\2YZ\5\6\4\2Z\5\3\2\2\2[\\"+
		"\7E\2\2\\_\7N\2\2]^\7\66\2\2^`\7N\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae"+
		"\7\3\2\2bd\5\b\5\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2g"+
		"e\3\2\2\2hi\7F\2\2i\7\3\2\2\2jn\5\16\b\2kn\5\20\t\2ln\5\24\13\2mj\3\2"+
		"\2\2mk\3\2\2\2ml\3\2\2\2n\t\3\2\2\2op\7.\2\2pz\7N\2\2qr\7\66\2\2rw\7N"+
		"\2\2st\7\4\2\2tv\7N\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2zq\3\2\2\2z{\3\2\2\2{\u0085\3\2\2\2|}\7I\2\2}\u0082\7N\2"+
		"\2~\177\7\4\2\2\177\u0081\7N\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085|\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b"+
		"\7\3\2\2\u0088\u008a\5\f\7\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7/\2\2\u008f\13\3\2\2\2\u0090\u0093\5\16\b\2\u0091\u0093"+
		"\5\20\t\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\r\3\2\2\2\u0094"+
		"\u0097\5B\"\2\u0095\u0098\5\34\17\2\u0096\u0098\5\36\20\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\3\2\2\u009a"+
		"\17\3\2\2\2\u009b\u009c\5B\"\2\u009c\u009d\5\22\n\2\u009d\u009e\7\3\2"+
		"\2\u009e\21\3\2\2\2\u009f\u00a2\58\35\2\u00a0\u00a2\5:\36\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a4\7G\2\2\u00a4"+
		"\u00a5\5\26\f\2\u00a5\u00a6\7\3\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\5\30"+
		"\r\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5\32\16\2\u00aa\27\3\2\2\2\u00ab"+
		"\u00ac\5,\27\2\u00ac\31\3\2\2\2\u00ad\u00ae\5\62\32\2\u00ae\33\3\2\2\2"+
		"\u00af\u00b8\58\35\2\u00b0\u00b1\7\6\2\2\u00b1\u00b4\5> \2\u00b2\u00b3"+
		"\7\7\2\2\u00b3\u00b5\5 \21\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b9\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b0\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\5:\36\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00bd\5F$\2\u00bd!\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf"+
		"\u00c4\5&\24\2\u00c0\u00c1\7\4\2\2\u00c1\u00c3\5&\24\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8#\3\2\2\2"+
		"\u00c9\u00ca\7\n\2\2\u00ca\u00cf\5&\24\2\u00cb\u00cc\7\4\2\2\u00cc\u00ce"+
		"\5&\24\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\13"+
		"\2\2\u00d3%\3\2\2\2\u00d4\u00d8\5$\23\2\u00d5\u00d8\5\"\22\2\u00d6\u00d8"+
		"\5F$\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\'\3\2\2\2\u00d9\u00da\7\67\2\2\u00da\u00db\5*\26\2\u00db)\3\2\2\2\u00dc"+
		"\u00de\5,\27\2\u00dd\u00df\5\66\34\2\u00de\u00dd\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\5\62\32\2\u00e2"+
		"+\3\2\2\2\u00e3\u00e6\5.\30\2\u00e4\u00e6\5\60\31\2\u00e5\u00e3\3\2\2"+
		"\2\u00e5\u00e4\3\2\2\2\u00e6-\3\2\2\2\u00e7\u00e8\5\64\33\2\u00e8\u00e9"+
		"\7\f\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f0\5\64\33\2\u00f0/\3\2\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f3"+
		"\7\r\2\2\u00f3\u00f4\7N\2\2\u00f4\61\3\2\2\2\u00f5\u00f6\5&\24\2\u00f6"+
		"\63\3\2\2\2\u00f7\u00fa\58\35\2\u00f8\u00fa\5<\37\2\u00f9\u00f7\3\2\2"+
		"\2\u00f9\u00f8\3\2\2\2\u00fa\65\3\2\2\2\u00fb\u00fc\7\n\2\2\u00fc\u00fd"+
		"\5F$\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\5F$\2\u00ff\u0100\7\13\2\2\u0100"+
		"\67\3\2\2\2\u0101\u0102\7N\2\2\u01029\3\2\2\2\u0103\u0104\7N\2\2\u0104"+
		"\u0105\7\n\2\2\u0105\u0106\7\13\2\2\u0106;\3\2\2\2\u0107\u0108\7N\2\2"+
		"\u0108\u0109\7\n\2\2\u0109\u010a\7N\2\2\u010a\u010b\7\13\2\2\u010b=\3"+
		"\2\2\2\u010c\u0112\7=\2\2\u010d\u0112\7>\2\2\u010e\u0112\7?\2\2\u010f"+
		"\u0112\7L\2\2\u0110\u0112\5D#\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2"+
		"\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112?"+
		"\3\2\2\2\u0113\u0114\t\2\2\2\u0114A\3\2\2\2\u0115\u011d\7\65\2\2\u0116"+
		"\u0117\7H\2\2\u0117\u011d\7;\2\2\u0118\u0119\7H\2\2\u0119\u011d\7<\2\2"+
		"\u011a\u011b\7H\2\2\u011b\u011d\7\65\2\2\u011c\u0115\3\2\2\2\u011c\u0116"+
		"\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011a\3\2\2\2\u011dC\3\2\2\2\u011e"+
		"\u011f\7@\2\2\u011f\u0120\7\b\2\2\u0120\u0125\7N\2\2\u0121\u0122\7\4\2"+
		"\2\u0122\u0124\7N\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\7\t\2\2\u0129E\3\2\2\2\u012a\u012b\b$\1\2\u012b\u0131\5H%\2\u012c"+
		"\u012d\t\3\2\2\u012d\u0131\5F$\20\u012e\u012f\t\4\2\2\u012f\u0131\5F$"+
		"\17\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0163\3\2\2\2\u0132\u0133\f\16\2\2\u0133\u0134\t\5\2\2\u0134\u0162\5"+
		"F$\17\u0135\u0136\f\r\2\2\u0136\u0137\t\3\2\2\u0137\u0162\5F$\16\u0138"+
		"\u0140\f\f\2\2\u0139\u013a\7\25\2\2\u013a\u0141\7\25\2\2\u013b\u013c\7"+
		"\26\2\2\u013c\u013d\7\26\2\2\u013d\u0141\7\26\2\2\u013e\u013f\7\26\2\2"+
		"\u013f\u0141\7\26\2\2\u0140\u0139\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0162\5F$\r\u0143\u0144\f\13\2\2\u0144"+
		"\u0145\t\6\2\2\u0145\u0162\5F$\f\u0146\u0147\f\n\2\2\u0147\u0148\t\7\2"+
		"\2\u0148\u0162\5F$\13\u0149\u014a\f\t\2\2\u014a\u014b\7\33\2\2\u014b\u0162"+
		"\5F$\n\u014c\u014d\f\b\2\2\u014d\u014e\7\34\2\2\u014e\u0162\5F$\t\u014f"+
		"\u0150\f\7\2\2\u0150\u0151\7\35\2\2\u0151\u0162\5F$\b\u0152\u0153\f\6"+
		"\2\2\u0153\u0154\7\36\2\2\u0154\u0162\5F$\7\u0155\u0156\f\5\2\2\u0156"+
		"\u0157\7\37\2\2\u0157\u0162\5F$\6\u0158\u0159\f\4\2\2\u0159\u015a\7 \2"+
		"\2\u015a\u015b\5F$\2\u015b\u015c\7\6\2\2\u015c\u015d\5F$\5\u015d\u0162"+
		"\3\2\2\2\u015e\u015f\f\3\2\2\u015f\u0160\t\b\2\2\u0160\u0162\5F$\3\u0161"+
		"\u0132\3\2\2\2\u0161\u0135\3\2\2\2\u0161\u0138\3\2\2\2\u0161\u0143\3\2"+
		"\2\2\u0161\u0146\3\2\2\2\u0161\u0149\3\2\2\2\u0161\u014c\3\2\2\2\u0161"+
		"\u014f\3\2\2\2\u0161\u0152\3\2\2\2\u0161\u0155\3\2\2\2\u0161\u0158\3\2"+
		"\2\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164G\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7,\2\2\u0167"+
		"\u0168\5F$\2\u0168\u0169\7-\2\2\u0169\u016f\3\2\2\2\u016a\u016f\7J\2\2"+
		"\u016b\u016f\5,\27\2\u016c\u016f\5P)\2\u016d\u016f\5J&\2\u016e\u0166\3"+
		"\2\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016fI\3\2\2\2\u0170\u0171\5L\'\2\u0171\u0172\7,\2\2\u0172"+
		"\u0175\5N(\2\u0173\u0174\7\4\2\2\u0174\u0176\5N(\2\u0175\u0173\3\2\2\2"+
		"\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7-\2\2\u0178K\3\2"+
		"\2\2\u0179\u017a\t\t\2\2\u017aM\3\2\2\2\u017b\u017c\5,\27\2\u017c\u017d"+
		"\5\66\34\2\u017d\u0180\3\2\2\2\u017e\u0180\5F$\2\u017f\u017b\3\2\2\2\u017f"+
		"\u017e\3\2\2\2\u0180O\3\2\2\2\u0181\u0182\t\n\2\2\u0182Q\3\2\2\2!U_em"+
		"wz\u0082\u0085\u008b\u0092\u0097\u00a1\u00b4\u00b8\u00c4\u00cf\u00d7\u00de"+
		"\u00e5\u00ec\u00f9\u0111\u011c\u0125\u0130\u0140\u0161\u0163\u016e\u0175"+
		"\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}