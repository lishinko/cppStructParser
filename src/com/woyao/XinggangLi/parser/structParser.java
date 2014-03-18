// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.1
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
		T__0=1, COLLTYPE=2, STRUCT=3, KEYWORD=4, INT=5, FLOAT=6, DOUBLE=7, STD_NAMESPACE=8, 
		MAP=9, VECTOR=10, NAMESPACE_PREFIX=11, LEFTPARANS=12, RIGHTPARANS=13, 
		DOUBLE_COLON=14, LEFT_ANGLE_BRACKET=15, RIGHT_ANGLE_BRACKET=16, SEMICOLON=17, 
		COMMA=18, INDENTIFIER=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'std::'", "COLLTYPE", "'struct'", "KEYWORD", "'int'", "'float'", 
		"'double'", "'std'", "'map'", "'vector'", "NAMESPACE_PREFIX", "'{'", "'}'", 
		"'::'", "'<'", "'>'", "';'", "','", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_structDefine = 0, RULE_structField = 1, RULE_fieldDecl = 2, RULE_fieldType = 3, 
		RULE_genericCollType = 4, RULE_elementType = 5, RULE_normalType = 6, RULE_mapType = 7;
	public static final String[] ruleNames = {
		"structDefine", "structField", "fieldDecl", "fieldType", "genericCollType", 
		"elementType", "normalType", "mapType"
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
		public Token name;
		public Token leftCurlyBrace;
		public Token rightCurlyBrace;
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public StructFieldContext structField() {
			return getRuleContext(StructFieldContext.class,0);
		}
		public StructDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterStructDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitStructDefine(this);
		}
	}

	public final StructDefineContext structDefine() throws RecognitionException {
		StructDefineContext _localctx = new StructDefineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_structDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(STRUCT);
			setState(17); ((StructDefineContext)_localctx).name = match(INDENTIFIER);
			setState(18); ((StructDefineContext)_localctx).leftCurlyBrace = match(LEFTPARANS);
			setState(19); structField();
			setState(20); ((StructDefineContext)_localctx).rightCurlyBrace = match(RIGHTPARANS);
			setState(21); match(SEMICOLON);
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

	public static class StructFieldContext extends ParserRuleContext {
		public List<StructDefineContext> structDefine() {
			return getRuleContexts(StructDefineContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public StructDefineContext structDefine(int i) {
			return getRuleContext(StructDefineContext.class,i);
		}
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitStructField(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				switch (_input.LA(1)) {
				case 1:
				case COLLTYPE:
				case KEYWORD:
				case INDENTIFIER:
					{
					setState(23); fieldDecl();
					}
					break;
				case STRUCT:
					{
					setState(24); structDefine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << COLLTYPE) | (1L << STRUCT) | (1L << KEYWORD) | (1L << INDENTIFIER))) != 0) );
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); fieldType();
			setState(30); match(INDENTIFIER);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitFieldType(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldType);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case KEYWORD:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); normalType();
				}
				break;
			case 1:
			case COLLTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); genericCollType();
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

	public static class GenericCollTypeContext extends ParserRuleContext {
		public TerminalNode COLLTYPE() { return getToken(structParser.COLLTYPE, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public GenericCollTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericCollType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterGenericCollType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitGenericCollType(this);
		}
	}

	public final GenericCollTypeContext genericCollType() throws RecognitionException {
		GenericCollTypeContext _localctx = new GenericCollTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericCollType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(37); match(1);
				}
			}

			setState(40); match(COLLTYPE);
			setState(41); match(LEFT_ANGLE_BRACKET);
			setState(42); elementType();
			setState(43); match(RIGHT_ANGLE_BRACKET);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementType);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); fieldType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); mapType();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterNormalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitNormalType(this);
		}
	}

	public final NormalTypeContext normalType() throws RecognitionException {
		NormalTypeContext _localctx = new NormalTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof structListener ) ((structListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); normalType();
			setState(52); match(COMMA);
			setState(53); normalType();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\30:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\4\3\4\3\4\3\4\3\5\3\5\5\5&\n"+
		"\5\3\6\5\6)\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\3\4\2\6\6\25\25\66\2\22\3\2\2\2\4"+
		"\33\3\2\2\2\6\37\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f\61\3\2\2\2\16\63\3\2"+
		"\2\2\20\65\3\2\2\2\22\23\7\5\2\2\23\24\7\25\2\2\24\25\7\16\2\2\25\26\5"+
		"\4\3\2\26\27\7\17\2\2\27\30\7\23\2\2\30\3\3\2\2\2\31\34\5\6\4\2\32\34"+
		"\5\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\5\3\2\2\2\37 \5\b\5\2 !\7\25\2\2!\"\7\23\2\2\"\7\3\2\2\2#"+
		"&\5\16\b\2$&\5\n\6\2%#\3\2\2\2%$\3\2\2\2&\t\3\2\2\2\')\7\3\2\2(\'\3\2"+
		"\2\2()\3\2\2\2)*\3\2\2\2*+\7\4\2\2+,\7\21\2\2,-\5\f\7\2-.\7\22\2\2.\13"+
		"\3\2\2\2/\62\5\b\5\2\60\62\5\20\t\2\61/\3\2\2\2\61\60\3\2\2\2\62\r\3\2"+
		"\2\2\63\64\t\2\2\2\64\17\3\2\2\2\65\66\5\16\b\2\66\67\7\24\2\2\678\5\16"+
		"\b\28\21\3\2\2\2\7\33\35%(\61";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}