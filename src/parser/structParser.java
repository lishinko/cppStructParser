// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\cppstructparser\struct.g4 by ANTLR 4.0
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class structParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, SEMICOLON=2, STRUCT=3, LEFTPARANS=4, RIGHTPARANS=5, INT=6, 
		FLOAT=7, DOUBLE=8, STD_NAMESPACE=9, DOUBLE_COLON=10, LEFT_ANGLE_BRACKET=11, 
		RIGHT_ANGLE_BRACKET=12, MAP=13, VECTOR=14, INDENTIFIER=15, WS=16, COMMENT=17, 
		LINE_COMMENT=18;
	public static final String[] tokenNames = {
		"<INVALID>", "KEYWORD", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", 
		"'double'", "'std'", "'::'", "'<'", "'>'", "'map'", "'vector'", "INDENTIFIER", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_structDefine = 0, RULE_structBody = 1, RULE_fields = 2, RULE_fieldDecl2 = 3, 
		RULE_normalDecl = 4, RULE_genericDecl = 5, RULE_genericCollType = 6, RULE_elements = 7, 
		RULE_collFullType = 8, RULE_elementType = 9, RULE_collType = 10;
	public static final String[] ruleNames = {
		"structDefine", "structBody", "fields", "fieldDecl2", "normalDecl", "genericDecl", 
		"genericCollType", "elements", "collFullType", "elementType", "collType"
	};

	@Override
	public String getGrammarFileName() { return "struct.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public structParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StructDefineContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(structParser.STRUCT, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public StructDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitStructDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefineContext structDefine() throws RecognitionException {
		StructDefineContext _localctx = new StructDefineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_structDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(STRUCT);
			setState(23); structBody();
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

	public static class StructBodyContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LEFTPARANS() { return getToken(structParser.LEFTPARANS, 0); }
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public TerminalNode RIGHTPARANS() { return getToken(structParser.RIGHTPARANS, 0); }
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); ((StructBodyContext)_localctx).name = match(INDENTIFIER);
			setState(26); match(LEFTPARANS);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27); fields();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << STRUCT) | (1L << STD_NAMESPACE) | (1L << MAP) | (1L << VECTOR) | (1L << INDENTIFIER))) != 0) );
			setState(32); match(RIGHTPARANS);
			setState(33); match(SEMICOLON);
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

	public static class FieldsContext extends ParserRuleContext {
		public FieldDecl2Context fieldDecl2() {
			return getRuleContext(FieldDecl2Context.class,0);
		}
		public StructDefineContext structDefine() {
			return getRuleContext(StructDefineContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fields);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case KEYWORD:
			case STD_NAMESPACE:
			case MAP:
			case VECTOR:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); fieldDecl2();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); structDefine();
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

	public static class FieldDecl2Context extends ParserRuleContext {
		public GenericDeclContext genericDecl() {
			return getRuleContext(GenericDeclContext.class,0);
		}
		public NormalDeclContext normalDecl() {
			return getRuleContext(NormalDeclContext.class,0);
		}
		public FieldDecl2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitFieldDecl2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDecl2Context fieldDecl2() throws RecognitionException {
		FieldDecl2Context _localctx = new FieldDecl2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDecl2);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case KEYWORD:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); normalDecl();
				}
				break;
			case STD_NAMESPACE:
			case MAP:
			case VECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); genericDecl();
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

	public static class NormalDeclContext extends ParserRuleContext {
		public NormalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalDecl; }
	 
		public NormalDeclContext() { }
		public void copyFrom(NormalDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDeclContext extends NormalDeclContext {
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public TerminalNode INDENTIFIER(int i) {
			return getToken(structParser.INDENTIFIER, i);
		}
		public List<TerminalNode> INDENTIFIER() { return getTokens(structParser.INDENTIFIER); }
		public StructDeclContext(NormalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitStructDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeywordDeclContext extends NormalDeclContext {
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public TerminalNode KEYWORD() { return getToken(structParser.KEYWORD, 0); }
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public KeywordDeclContext(NormalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitKeywordDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalDeclContext normalDecl() throws RecognitionException {
		NormalDeclContext _localctx = new NormalDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normalDecl);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case KEYWORD:
				_localctx = new KeywordDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43); ((KeywordDeclContext)_localctx).type = match(KEYWORD);
				setState(44); ((KeywordDeclContext)_localctx).name = match(INDENTIFIER);
				setState(45); match(SEMICOLON);
				}
				break;
			case INDENTIFIER:
				_localctx = new StructDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46); ((StructDeclContext)_localctx).type = match(INDENTIFIER);
				setState(47); ((StructDeclContext)_localctx).name = match(INDENTIFIER);
				setState(48); match(SEMICOLON);
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

	public static class GenericDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public GenericCollTypeContext genericCollType() {
			return getRuleContext(GenericCollTypeContext.class,0);
		}
		public GenericDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitGenericDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDeclContext genericDecl() throws RecognitionException {
		GenericDeclContext _localctx = new GenericDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); genericCollType();
			setState(52); ((GenericDeclContext)_localctx).name = match(INDENTIFIER);
			setState(53); match(SEMICOLON);
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

	public static class GenericCollTypeContext extends ParserRuleContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public CollFullTypeContext collFullType() {
			return getRuleContext(CollFullTypeContext.class,0);
		}
		public GenericCollTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericCollType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitGenericCollType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericCollTypeContext genericCollType() throws RecognitionException {
		GenericCollTypeContext _localctx = new GenericCollTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_genericCollType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); collFullType();
			setState(56); elements();
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

	public static class ElementsContext extends ParserRuleContext {
		public TerminalNode RIGHT_ANGLE_BRACKET() { return getToken(structParser.RIGHT_ANGLE_BRACKET, 0); }
		public TerminalNode LEFT_ANGLE_BRACKET() { return getToken(structParser.LEFT_ANGLE_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(LEFT_ANGLE_BRACKET);
			setState(59); elementType();
			setState(60); match(RIGHT_ANGLE_BRACKET);
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

	public static class CollFullTypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COLON() { return getToken(structParser.DOUBLE_COLON, 0); }
		public TerminalNode STD_NAMESPACE() { return getToken(structParser.STD_NAMESPACE, 0); }
		public CollTypeContext collType() {
			return getRuleContext(CollTypeContext.class,0);
		}
		public CollFullTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collFullType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitCollFullType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollFullTypeContext collFullType() throws RecognitionException {
		CollFullTypeContext _localctx = new CollFullTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_collFullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if (_la==STD_NAMESPACE) {
				{
				setState(62); match(STD_NAMESPACE);
				setState(63); match(DOUBLE_COLON);
				}
			}

			setState(66); collType();
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

	public static class ElementTypeContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(structParser.KEYWORD, 0); }
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD || _la==INDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CollTypeContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(structParser.VECTOR, 0); }
		public TerminalNode MAP() { return getToken(structParser.MAP, 0); }
		public CollTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitCollType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollTypeContext collType() throws RecognitionException {
		CollTypeContext _localctx = new CollTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_collType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==MAP || _la==VECTOR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\2\3\24K\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\6\3\37\n\3\r\3\16"+
		"\3 \3\3\3\3\3\3\3\4\3\4\5\4(\n\4\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\64\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\nC\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\4\4\3\3\21\21\3\17\20D\2\30\3\2\2\2\4\33\3\2\2\2\6\'\3\2\2\2\b+\3\2\2"+
		"\2\n\63\3\2\2\2\f\65\3\2\2\2\169\3\2\2\2\20<\3\2\2\2\22B\3\2\2\2\24F\3"+
		"\2\2\2\26H\3\2\2\2\30\31\7\5\2\2\31\32\5\4\3\2\32\3\3\2\2\2\33\34\7\21"+
		"\2\2\34\36\7\6\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!\"\3\2\2\2\"#\7\7\2\2#$\7\4\2\2$\5\3\2\2\2%(\5\b\5\2&(\5\2"+
		"\2\2\'%\3\2\2\2\'&\3\2\2\2(\7\3\2\2\2),\5\n\6\2*,\5\f\7\2+)\3\2\2\2+*"+
		"\3\2\2\2,\t\3\2\2\2-.\7\3\2\2./\7\21\2\2/\64\7\4\2\2\60\61\7\21\2\2\61"+
		"\62\7\21\2\2\62\64\7\4\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\13\3\2\2\2\65"+
		"\66\5\16\b\2\66\67\7\21\2\2\678\7\4\2\28\r\3\2\2\29:\5\22\n\2:;\5\20\t"+
		"\2;\17\3\2\2\2<=\7\r\2\2=>\5\24\13\2>?\7\16\2\2?\21\3\2\2\2@A\7\13\2\2"+
		"AC\7\f\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\26\f\2E\23\3\2\2\2FG\t\2"+
		"\2\2G\25\3\2\2\2HI\t\3\2\2I\27\3\2\2\2\7 \'+\63B";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}