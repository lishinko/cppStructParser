// Generated from E:/My Documents/NetBeansProjects/cppStructParser/src/com/woyao/XinggangLi\commonLexerRules.g4 by ANTLR 4.x
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
		LEFT_CURLY_BRACE=1, RIGHT_CURLY_BRACE=2, Digit=3, LEFT_ANGLE_BRACKET=4, 
		RIGHT_ANGLE_BRACKET=5, SEMICOLON=6, COMMA=7, LEFTBRACKET=8, RIGHTBRACKET=9, 
		LEFT_PARANS=10, RIGHT_PARANS=11, INDENTIFIER=12, WS=13, COMMENT=14, LINE_COMMENT=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "DOUBLE_COLON", "COLON", "Digit", 
		"LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", "SEMICOLON", "COMMA", "LEFTBRACKET", 
		"RIGHTBRACKET", "LEFT_PARANS", "RIGHT_PARANS", "INDENTIFIER", "WS", "COMMENT", 
		"LINE_COMMENT"
	};


	    public static final int WHITESPACE = HIDDEN + 1;
	    public static final int COMMENTS = HIDDEN + 2;


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
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14: WS_action((RuleContext)_localctx, actionIndex); break;
		case 15: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 16: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = WHITESPACE; break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = COMMENTS; break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = COMMENTS; break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\6\6\60\n\6\r\6\16\6\61\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\7\17F\n\17\f\17\16\17I\13\17\3\20\6\20L\n\20\r\20\16\20M\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\7\21V\n\21\f\21\16\21Y\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22d\n\22\f\22\16\22g\13\22\3\22\3\22\3W\2"+
		"\23\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17l\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2"+
		"\2\5\'\3\2\2\2\7)\3\2\2\2\t,\3\2\2\2\13/\3\2\2\2\r\63\3\2\2\2\17\65\3"+
		"\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31?\3\2\2\2\33"+
		"A\3\2\2\2\35C\3\2\2\2\37K\3\2\2\2!Q\3\2\2\2#_\3\2\2\2%&\7}\2\2&\4\3\2"+
		"\2\2\'(\7\177\2\2(\6\3\2\2\2)*\7<\2\2*+\7<\2\2+\b\3\2\2\2,-\7<\2\2-\n"+
		"\3\2\2\2.\60\4\62;\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2"+
		"\62\f\3\2\2\2\63\64\7>\2\2\64\16\3\2\2\2\65\66\7@\2\2\66\20\3\2\2\2\67"+
		"8\7=\2\28\22\3\2\2\29:\7.\2\2:\24\3\2\2\2;<\7]\2\2<\26\3\2\2\2=>\7_\2"+
		"\2>\30\3\2\2\2?@\7*\2\2@\32\3\2\2\2AB\7+\2\2B\34\3\2\2\2CG\t\2\2\2DF\t"+
		"\3\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\36\3\2\2\2IG\3\2\2\2J"+
		"L\t\4\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\20\2\2"+
		"P \3\2\2\2QR\7\61\2\2RS\7,\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2"+
		"\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7,\2\2[\\\7\61\2\2\\]\3\2"+
		"\2\2]^\b\21\3\2^\"\3\2\2\2_`\7\61\2\2`a\7\61\2\2ae\3\2\2\2bd\n\5\2\2c"+
		"b\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\b\22\4\2"+
		"i$\3\2\2\2\b\2\61GMWe\5\3\20\2\3\21\3\3\22\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}