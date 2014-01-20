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
		FLOAT=7, DOUBLE=8, INDENTIFIER=9, WS=10, COMMENT=11, LINE_COMMENT=12;
	public static final String[] tokenNames = {
		"<INVALID>", "KEYWORD", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", 
		"'double'", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_structDefine = 0, RULE_structBody = 1, RULE_fields = 2, RULE_fieldDecl = 3;
	public static final String[] ruleNames = {
		"structDefine", "structBody", "fields", "fieldDecl"
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
			setState(8); match(STRUCT);
			setState(9); structBody();
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
			setState(11); ((StructBodyContext)_localctx).name = match(INDENTIFIER);
			setState(12); match(LEFTPARANS);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13); fields();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << STRUCT) | (1L << INDENTIFIER))) != 0) );
			setState(18); match(RIGHTPARANS);
			setState(19); match(SEMICOLON);
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
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
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
			setState(23);
			switch (_input.LA(1)) {
			case KEYWORD:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); fieldDecl();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); structDefine();
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

	public static class FieldDeclContext extends ParserRuleContext {
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
	 
		public FieldDeclContext() { }
		public void copyFrom(FieldDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDeclContext extends FieldDeclContext {
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public TerminalNode INDENTIFIER(int i) {
			return getToken(structParser.INDENTIFIER, i);
		}
		public List<TerminalNode> INDENTIFIER() { return getTokens(structParser.INDENTIFIER); }
		public StructDeclContext(FieldDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitStructDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeywordDeclContext extends FieldDeclContext {
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(structParser.SEMICOLON, 0); }
		public TerminalNode KEYWORD() { return getToken(structParser.KEYWORD, 0); }
		public TerminalNode INDENTIFIER() { return getToken(structParser.INDENTIFIER, 0); }
		public KeywordDeclContext(FieldDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof structVisitor ) return ((structVisitor<? extends T>)visitor).visitKeywordDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDecl);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case KEYWORD:
				_localctx = new KeywordDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25); ((KeywordDeclContext)_localctx).type = match(KEYWORD);
				setState(26); ((KeywordDeclContext)_localctx).name = match(INDENTIFIER);
				setState(27); match(SEMICOLON);
				}
				break;
			case INDENTIFIER:
				_localctx = new StructDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28); ((StructDeclContext)_localctx).type = match(INDENTIFIER);
				setState(29); ((StructDeclContext)_localctx).name = match(INDENTIFIER);
				setState(30); match(SEMICOLON);
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

	public static final String _serializedATN =
		"\2\3\16$\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\6\3\21"+
		"\n\3\r\3\16\3\22\3\3\3\3\3\3\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\"\n\5\3\5\2\6\2\4\6\b\2\2\"\2\n\3\2\2\2\4\r\3\2\2\2\6\31\3\2\2"+
		"\2\b!\3\2\2\2\n\13\7\5\2\2\13\f\5\4\3\2\f\3\3\2\2\2\r\16\7\13\2\2\16\20"+
		"\7\6\2\2\17\21\5\6\4\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23"+
		"\3\2\2\2\23\24\3\2\2\2\24\25\7\7\2\2\25\26\7\4\2\2\26\5\3\2\2\2\27\32"+
		"\5\b\5\2\30\32\5\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\33\34"+
		"\7\3\2\2\34\35\7\13\2\2\35\"\7\4\2\2\36\37\7\13\2\2\37 \7\13\2\2 \"\7"+
		"\4\2\2!\33\3\2\2\2!\36\3\2\2\2\"\t\3\2\2\2\5\22\31!";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}