// Generated from E:\My Documents\IntellijProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.1
package com.woyao.XinggangLi.parser;
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
		CollType=1, STRUCT=2, KEYWORD=3, INT=4, FLOAT=5, DOUBLE=6, STD_NAMESPACE=7, 
		MAP=8, VECTOR=9, NAMESPACE_PREFIX=10, LEFTPARANS=11, RIGHTPARANS=12, DOUBLE_COLON=13, 
		LEFT_ANGLE_BRACKET=14, RIGHT_ANGLE_BRACKET=15, SEMICOLON=16, COMMA=17, 
		INDENTIFIER=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static final String[] tokenNames = {
		"<INVALID>", "CollType", "'struct'", "KEYWORD", "'int'", "'float'", "'double'", 
		"'std'", "'map'", "'vector'", "NAMESPACE_PREFIX", "'{'", "'}'", "'::'", 
		"'<'", "'>'", "';'", "','", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_structDefine = 0, RULE_structBody = 1, RULE_fields = 2, RULE_fieldDecl3 = 3, 
		RULE_fieldType = 4, RULE_fieldName = 5, RULE_genericCollType = 6, RULE_elementType = 7, 
		RULE_normalType = 8, RULE_mapType = 9;
	public static final String[] ruleNames = {
		"structDefine", "structBody", "fields", "fieldDecl3", "fieldType", "fieldName", 
		"genericCollType", "elementType", "normalType", "mapType"
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
			setState(20); match(STRUCT);
			setState(21); structBody();
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
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public TerminalNode RIGHTPARANS() { return getToken(structParser.RIGHTPARANS, 0); }
		public TerminalNode LEFTPARANS() { return getToken(structParser.LEFTPARANS, 0); }
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
			setState(23); ((StructBodyContext)_localctx).name = match(INDENTIFIER);
			setState(24); match(LEFTPARANS);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25); fields();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CollType) | (1L << STRUCT) | (1L << KEYWORD) | (1L << NAMESPACE_PREFIX) | (1L << INDENTIFIER))) != 0) );
			setState(30); match(RIGHTPARANS);
			setState(31); match(SEMICOLON);
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
		public StructDefineContext structDefine() {
			return getRuleContext(StructDefineContext.class,0);
		}
		public FieldDecl3Context fieldDecl3() {
			return getRuleContext(FieldDecl3Context.class,0);
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
			setState(35);
			switch (_input.LA(1)) {
			case CollType:
			case KEYWORD:
			case NAMESPACE_PREFIX:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); fieldDecl3();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); structDefine();
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

	public static class FieldDecl3Context extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FieldDecl3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitFieldDecl3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDecl3Context fieldDecl3() throws RecognitionException {
		FieldDecl3Context _localctx = new FieldDecl3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDecl3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); fieldType();
			setState(38); fieldName();
			setState(39); match(SEMICOLON);
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

	public static class FieldTypeContext extends ParserRuleContext {
		public GenericCollTypeContext genericCollType() {
			return getRuleContext(GenericCollTypeContext.class,0);
		}
		public NormalTypeContext normalType() {
			return getRuleContext(NormalTypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldType);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case KEYWORD:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); normalType();
				}
				break;
			case CollType:
			case NAMESPACE_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); genericCollType();
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(INDENTIFIER);
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
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public TerminalNode RIGHT_ANGLE_BRACKET() { return getToken(structParser.RIGHT_ANGLE_BRACKET, 0); }
		public TerminalNode LEFT_ANGLE_BRACKET() { return getToken(structParser.LEFT_ANGLE_BRACKET, 0); }
		public TerminalNode NAMESPACE_PREFIX() { return getToken(structParser.NAMESPACE_PREFIX, 0); }
		public TerminalNode CollType() { return getToken(structParser.CollType, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if (_la==NAMESPACE_PREFIX) {
				{
				setState(47); match(NAMESPACE_PREFIX);
				}
			}

			setState(50); match(CollType);
			setState(51); match(LEFT_ANGLE_BRACKET);
			setState(52); elementType();
			setState(53); match(RIGHT_ANGLE_BRACKET);
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
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_elementType);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); fieldType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); mapType();
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

	public static class NormalTypeContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public TerminalNode KEYWORD() { return getToken(structParser.KEYWORD, 0); }
		public NormalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitNormalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalTypeContext normalType() throws RecognitionException {
		NormalTypeContext _localctx = new NormalTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_normalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	public static class MapTypeContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(structParser.COMMA, 0); }
		public NormalTypeContext normalType(int i) {
			return getRuleContext(NormalTypeContext.class,i);
		}
		public List<NormalTypeContext> normalType() {
			return getRuleContexts(NormalTypeContext.class);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); normalType();
			setState(62); match(COMMA);
			setState(63); normalType();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\3\3\3\4\3\4\5\4"+
		"&\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6.\n\6\3\7\3\7\3\b\5\b\63\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\5\t<\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\2\f\2\4"+
		"\6\b\n\f\16\20\22\24\2\3\4\2\5\5\24\24>\2\26\3\2\2\2\4\31\3\2\2\2\6%\3"+
		"\2\2\2\b\'\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2\16\62\3\2\2\2\20;\3\2\2\2\22"+
		"=\3\2\2\2\24?\3\2\2\2\26\27\7\4\2\2\27\30\5\4\3\2\30\3\3\2\2\2\31\32\7"+
		"\24\2\2\32\34\7\r\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\16\2\2!\"\7\22\2\2\"\5\3\2\2\2"+
		"#&\5\b\5\2$&\5\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\'(\5\n\6\2()\5\f\7"+
		"\2)*\7\22\2\2*\t\3\2\2\2+.\5\22\n\2,.\5\16\b\2-+\3\2\2\2-,\3\2\2\2.\13"+
		"\3\2\2\2/\60\7\24\2\2\60\r\3\2\2\2\61\63\7\f\2\2\62\61\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\3\2\2\2\64\65\7\3\2\2\65\66\7\20\2\2\66\67\5\20\t\2\678\7"+
		"\21\2\28\17\3\2\2\29<\5\n\6\2:<\5\24\13\2;9\3\2\2\2;:\3\2\2\2<\21\3\2"+
		"\2\2=>\t\2\2\2>\23\3\2\2\2?@\5\22\n\2@A\7\23\2\2AB\5\22\n\2B\25\3\2\2"+
		"\2\7\36%-\62;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}