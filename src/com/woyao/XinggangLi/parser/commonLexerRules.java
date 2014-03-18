// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\com\woyao\XinggangLi\commonLexerRules.g4 by ANTLR 4.1
package com.woyao.XinggangLi.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class commonLexerRules extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFTPARANS=1, RIGHTPARANS=2, DOUBLE_COLON=3, LEFT_ANGLE_BRACKET=4, RIGHT_ANGLE_BRACKET=5, 
		SEMICOLON=6, COMMA=7, INDENTIFIER=8, WS=9, COMMENT=10, LINE_COMMENT=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'}'", "'::'", "'<'", "'>'", "';'", "','", "INDENTIFIER", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"LEFTPARANS", "RIGHTPARANS", "DOUBLE_COLON", "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", 
		"SEMICOLON", "COMMA", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
	};


	    public static final int WHITESPACE = 1;
	    public static final int COMMENTS = 2;


	public commonLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "commonLexerRules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8: WS_action((RuleContext)_localctx, actionIndex); break;

		case 9: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 10: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = WHITESPACE;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = COMMENTS;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = COMMENTS;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rO\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\7\t+\n\t\f\t\16\t.\13\t\3\n\6\n\61\n\n\r\n\16\n\62\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\7\13;\n\13\f\13\16\13>\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\fI\n\f\f\f\16\fL\13\f\3\f\3\f\3<\r\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\2\25\f\3\27\r\4\3\2\6\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17R\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2"+
		"\5\33\3\2\2\2\7\35\3\2\2\2\t \3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17&\3\2"+
		"\2\2\21(\3\2\2\2\23\60\3\2\2\2\25\66\3\2\2\2\27D\3\2\2\2\31\32\7}\2\2"+
		"\32\4\3\2\2\2\33\34\7\177\2\2\34\6\3\2\2\2\35\36\7<\2\2\36\37\7<\2\2\37"+
		"\b\3\2\2\2 !\7>\2\2!\n\3\2\2\2\"#\7@\2\2#\f\3\2\2\2$%\7=\2\2%\16\3\2\2"+
		"\2&\'\7.\2\2\'\20\3\2\2\2(,\t\2\2\2)+\t\3\2\2*)\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-\22\3\2\2\2.,\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\b\n\2\2\65\24\3"+
		"\2\2\2\66\67\7\61\2\2\678\7,\2\28<\3\2\2\29;\13\2\2\2:9\3\2\2\2;>\3\2"+
		"\2\2<=\3\2\2\2<:\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7,\2\2@A\7\61\2\2AB\3\2"+
		"\2\2BC\b\13\3\2C\26\3\2\2\2DE\7\61\2\2EF\7\61\2\2FJ\3\2\2\2GI\n\5\2\2"+
		"HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\b\f\4\2"+
		"N\30\3\2\2\2\7\2,\62<J";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}