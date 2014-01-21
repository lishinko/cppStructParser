// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\cppstructparser\struct.g4 by ANTLR 4.0
package parser;
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
		KEYWORD=1, SEMICOLON=2, STRUCT=3, LEFTPARANS=4, RIGHTPARANS=5, INT=6, 
		FLOAT=7, DOUBLE=8, STD_NAMESPACE=9, DOUBLE_COLON=10, LEFT_ANGLE_BRACKET=11, 
		RIGHT_ANGLE_BRACKET=12, MAP=13, VECTOR=14, INDENTIFIER=15, WS=16, COMMENT=17, 
		LINE_COMMENT=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"KEYWORD", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", "'double'", 
		"'std'", "'::'", "'<'", "'>'", "'map'", "'vector'", "INDENTIFIER", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"KEYWORD", "SEMICOLON", "STRUCT", "LEFTPARANS", "RIGHTPARANS", "INT", 
		"FLOAT", "DOUBLE", "STD_NAMESPACE", "DOUBLE_COLON", "LEFT_ANGLE_BRACKET", 
		"RIGHT_ANGLE_BRACKET", "MAP", "VECTOR", "INDENTIFIER", "WS", "COMMENT", 
		"LINE_COMMENT"
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
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;

		case 16: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 17: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\24\u0087\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\7\20c\n\20\f\20\16\20f\13\20\3\21\6\21i\n\21\r\21\16\21j\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\7\22s\n\22\f\22\16\22v\13\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0081\n\23\f\23\16\23\u0084\13"+
		"\23\3\23\3\23\3t\24\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1"+
		"\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\2#\23\3%\24"+
		"\4\3\2\6\5C\\aac|\6\62;C\\aac|\5\13\f\17\17\"\"\4\f\f\17\17\u008c\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\3*\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2"+
		"\2\r9\3\2\2\2\17=\3\2\2\2\21C\3\2\2\2\23J\3\2\2\2\25N\3\2\2\2\27Q\3\2"+
		"\2\2\31S\3\2\2\2\33U\3\2\2\2\35Y\3\2\2\2\37`\3\2\2\2!h\3\2\2\2#n\3\2\2"+
		"\2%|\3\2\2\2\'+\5\r\7\2(+\5\17\b\2)+\5\21\t\2*\'\3\2\2\2*(\3\2\2\2*)\3"+
		"\2\2\2+\4\3\2\2\2,-\7=\2\2-\6\3\2\2\2./\7u\2\2/\60\7v\2\2\60\61\7t\2\2"+
		"\61\62\7w\2\2\62\63\7e\2\2\63\64\7v\2\2\64\b\3\2\2\2\65\66\7}\2\2\66\n"+
		"\3\2\2\2\678\7\177\2\28\f\3\2\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<\16\3\2\2"+
		"\2=>\7h\2\2>?\7n\2\2?@\7q\2\2@A\7c\2\2AB\7v\2\2B\20\3\2\2\2CD\7f\2\2D"+
		"E\7q\2\2EF\7w\2\2FG\7d\2\2GH\7n\2\2HI\7g\2\2I\22\3\2\2\2JK\7u\2\2KL\7"+
		"v\2\2LM\7f\2\2M\24\3\2\2\2NO\7<\2\2OP\7<\2\2P\26\3\2\2\2QR\7>\2\2R\30"+
		"\3\2\2\2ST\7@\2\2T\32\3\2\2\2UV\7o\2\2VW\7c\2\2WX\7r\2\2X\34\3\2\2\2Y"+
		"Z\7x\2\2Z[\7g\2\2[\\\7e\2\2\\]\7v\2\2]^\7q\2\2^_\7t\2\2_\36\3\2\2\2`d"+
		"\t\2\2\2ac\t\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e \3\2\2\2f"+
		"d\3\2\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2"+
		"lm\b\21\2\2m\"\3\2\2\2no\7\61\2\2op\7,\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2"+
		"\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7,\2\2xy\7\61"+
		"\2\2yz\3\2\2\2z{\b\22\3\2{$\3\2\2\2|}\7\61\2\2}~\7\61\2\2~\u0082\3\2\2"+
		"\2\177\u0081\n\5\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\b\23\4\2\u0086&\3\2\2\2\b\2*djt\u0082";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}