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
		FLOAT=7, DOUBLE=8, INDENTIFIER=9, WS=10, COMMENT=11, LINE_COMMENT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"KEYWORD", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", "'double'", 
		"INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"KEYWORD", "SEMICOLON", "STRUCT", "LEFTPARANS", "RIGHTPARANS", "INT", 
		"FLOAT", "DOUBLE", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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
		case 9: WS_action((RuleContext)_localctx, actionIndex); break;

		case 10: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 11: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\16e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\37\n\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\nA\n\n\f\n\16\n"+
		"D\13\n\3\13\6\13G\n\13\r\13\16\13H\3\13\3\13\3\f\3\f\3\f\3\f\7\fQ\n\f"+
		"\f\f\16\fT\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r_\n\r\f\r\16\r"+
		"b\13\r\3\r\3\r\3R\16\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\2\27\r\3\31\16\4\3\2\6\5C\\aac|\6\62;C\\aac|\5\13\f\17"+
		"\17\"\"\4\f\f\17\17j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\36\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t"+
		")\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17\61\3\2\2\2\21\67\3\2\2\2\23>\3\2\2"+
		"\2\25F\3\2\2\2\27L\3\2\2\2\31Z\3\2\2\2\33\37\5\r\7\2\34\37\5\17\b\2\35"+
		"\37\5\21\t\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\4\3\2\2\2 !"+
		"\7=\2\2!\6\3\2\2\2\"#\7u\2\2#$\7v\2\2$%\7t\2\2%&\7w\2\2&\'\7e\2\2\'(\7"+
		"v\2\2(\b\3\2\2\2)*\7}\2\2*\n\3\2\2\2+,\7\177\2\2,\f\3\2\2\2-.\7k\2\2."+
		"/\7p\2\2/\60\7v\2\2\60\16\3\2\2\2\61\62\7h\2\2\62\63\7n\2\2\63\64\7q\2"+
		"\2\64\65\7c\2\2\65\66\7v\2\2\66\20\3\2\2\2\678\7f\2\289\7q\2\29:\7w\2"+
		"\2:;\7d\2\2;<\7n\2\2<=\7g\2\2=\22\3\2\2\2>B\t\2\2\2?A\t\3\2\2@?\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\24\3\2\2\2DB\3\2\2\2EG\t\4\2\2FE\3\2"+
		"\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\13\2\2K\26\3\2\2\2LM"+
		"\7\61\2\2MN\7,\2\2NR\3\2\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2"+
		"RP\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7,\2\2VW\7\61\2\2WX\3\2\2\2XY\b\f\3\2"+
		"Y\30\3\2\2\2Z[\7\61\2\2[\\\7\61\2\2\\`\3\2\2\2]_\n\5\2\2^]\3\2\2\2_b\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\b\r\4\2d\32\3\2\2\2\b"+
		"\2\36BHR`";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}