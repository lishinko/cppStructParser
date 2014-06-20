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
		LEFTPARANS=1, RIGHTPARANS=2, DOUBLE_COLON=3, LEFT_ANGLE_BRACKET=4, RIGHT_ANGLE_BRACKET=5, 
		SEMICOLON=6, COMMA=7, LEFTBRACKET=8, RIGHTBRACKET=9, INDENTIFIER=10, WS=11, 
		COMMENT=12, LINE_COMMENT=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"LEFTPARANS", "RIGHTPARANS", "DOUBLE_COLON", "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", 
		"SEMICOLON", "COMMA", "LEFTBRACKET", "RIGHTBRACKET", "INDENTIFIER", "WS", 
		"COMMENT", "LINE_COMMENT"
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
		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
		case 11: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 12: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13\63\n\13\f\13\16\13"+
		"\66\13\13\3\f\6\f9\n\f\r\f\16\f:\3\f\3\f\3\r\3\r\3\r\3\r\7\rC\n\r\f\r"+
		"\16\rF\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16Q\n\16\f\16\16"+
		"\16T\13\16\3\16\3\16\3D\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2"+
		"\2\7!\3\2\2\2\t$\3\2\2\2\13&\3\2\2\2\r(\3\2\2\2\17*\3\2\2\2\21,\3\2\2"+
		"\2\23.\3\2\2\2\25\60\3\2\2\2\278\3\2\2\2\31>\3\2\2\2\33L\3\2\2\2\35\36"+
		"\7}\2\2\36\4\3\2\2\2\37 \7\177\2\2 \6\3\2\2\2!\"\7<\2\2\"#\7<\2\2#\b\3"+
		"\2\2\2$%\7>\2\2%\n\3\2\2\2&\'\7@\2\2\'\f\3\2\2\2()\7=\2\2)\16\3\2\2\2"+
		"*+\7.\2\2+\20\3\2\2\2,-\7]\2\2-\22\3\2\2\2./\7_\2\2/\24\3\2\2\2\60\64"+
		"\t\2\2\2\61\63\t\3\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\26\3\2\2\2\66\64\3\2\2\2\679\t\4\2\28\67\3\2\2\29:\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\f\2\2=\30\3\2\2\2>?\7\61\2\2?@\7,\2"+
		"\2@D\3\2\2\2AC\13\2\2\2BA\3\2\2\2CF\3\2\2\2DE\3\2\2\2DB\3\2\2\2EG\3\2"+
		"\2\2FD\3\2\2\2GH\7,\2\2HI\7\61\2\2IJ\3\2\2\2JK\b\r\3\2K\32\3\2\2\2LM\7"+
		"\61\2\2MN\7\61\2\2NR\3\2\2\2OQ\n\5\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2R"+
		"S\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b\16\4\2V\34\3\2\2\2\7\2\64:DR\5\3\f\2"+
		"\3\r\3\3\16\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}