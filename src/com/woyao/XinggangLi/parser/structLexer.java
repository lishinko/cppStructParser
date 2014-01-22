// Generated from E:\My Documents\IntellijProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.1
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
public class structLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CollType=1, STRUCT=2, KEYWORD=3, INT=4, FLOAT=5, DOUBLE=6, STD_NAMESPACE=7, 
		MAP=8, VECTOR=9, NAMESPACE_PREFIX=10, LEFTPARANS=11, RIGHTPARANS=12, DOUBLE_COLON=13, 
		LEFT_ANGLE_BRACKET=14, RIGHT_ANGLE_BRACKET=15, SEMICOLON=16, COMMA=17, 
		INDENTIFIER=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"CollType", "'struct'", "KEYWORD", "'int'", "'float'", "'double'", "'std'", 
		"'map'", "'vector'", "NAMESPACE_PREFIX", "'{'", "'}'", "'::'", "'<'", 
		"'>'", "';'", "','", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"CollType", "STRUCT", "KEYWORD", "INT", "FLOAT", "DOUBLE", "STD_NAMESPACE", 
		"MAP", "VECTOR", "NAMESPACE_PREFIX", "LEFTPARANS", "RIGHTPARANS", "DOUBLE_COLON", 
		"LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", "SEMICOLON", "COMMA", "INDENTIFIER", 
		"WS", "COMMENT", "LINE_COMMENT"
	};


	public structLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "struct.g4"; }

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
		case 18: WS_action((RuleContext)_localctx, actionIndex); break;

		case 19: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2\60\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23r\n\23"+
		"\f\23\16\23u\13\23\3\24\6\24x\n\24\r\24\16\24y\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u0082\n\25\f\25\16\25\u0085\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u0090\n\26\f\26\16\26\u0093\13\26\3\26\3\26"+
		"\3\u0083\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\2)\26\3+\27\4\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3/\3"+
		"\2\2\2\5\61\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13A\3\2\2\2\rG\3\2\2\2\17N\3"+
		"\2\2\2\21R\3\2\2\2\23V\3\2\2\2\25]\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33"+
		"d\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'w\3\2"+
		"\2\2)}\3\2\2\2+\u008b\3\2\2\2-\60\5\21\t\2.\60\5\23\n\2/-\3\2\2\2/.\3"+
		"\2\2\2\60\4\3\2\2\2\61\62\7u\2\2\62\63\7v\2\2\63\64\7t\2\2\64\65\7w\2"+
		"\2\65\66\7e\2\2\66\67\7v\2\2\67\6\3\2\2\28<\5\t\5\29<\5\13\6\2:<\5\r\7"+
		"\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\b\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2"+
		"@\n\3\2\2\2AB\7h\2\2BC\7n\2\2CD\7q\2\2DE\7c\2\2EF\7v\2\2F\f\3\2\2\2GH"+
		"\7f\2\2HI\7q\2\2IJ\7w\2\2JK\7d\2\2KL\7n\2\2LM\7g\2\2M\16\3\2\2\2NO\7u"+
		"\2\2OP\7v\2\2PQ\7f\2\2Q\20\3\2\2\2RS\7o\2\2ST\7c\2\2TU\7r\2\2U\22\3\2"+
		"\2\2VW\7x\2\2WX\7g\2\2XY\7e\2\2YZ\7v\2\2Z[\7q\2\2[\\\7t\2\2\\\24\3\2\2"+
		"\2]^\5\17\b\2^_\5\33\16\2_\26\3\2\2\2`a\7}\2\2a\30\3\2\2\2bc\7\177\2\2"+
		"c\32\3\2\2\2de\7<\2\2ef\7<\2\2f\34\3\2\2\2gh\7>\2\2h\36\3\2\2\2ij\7@\2"+
		"\2j \3\2\2\2kl\7=\2\2l\"\3\2\2\2mn\7.\2\2n$\3\2\2\2os\t\2\2\2pr\t\3\2"+
		"\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t&\3\2\2\2us\3\2\2\2vx\t\4\2"+
		"\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\24\2\2|(\3\2"+
		"\2\2}~\7\61\2\2~\177\7,\2\2\177\u0083\3\2\2\2\u0080\u0082\13\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7,\2\2\u0087"+
		"\u0088\7\61\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\25\3\2\u008a*\3\2\2"+
		"\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d\u0091\3\2\2\2\u008e"+
		"\u0090\n\5\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\b\26\4\2\u0095,\3\2\2\2\t\2/;sy\u0083\u0091";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}