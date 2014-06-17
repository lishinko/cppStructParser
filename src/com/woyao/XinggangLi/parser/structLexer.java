// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.x
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
		T__0=1, COLLTYPE=2, STRUCT=3, KEYWORD=4, INT=5, FLOAT=6, DOUBLE=7, STD_NAMESPACE=8, 
		MAP=9, VECTOR=10, NAMESPACE_PREFIX=11, LEFTPARANS=12, RIGHTPARANS=13, 
		DOUBLE_COLON=14, LEFT_ANGLE_BRACKET=15, RIGHT_ANGLE_BRACKET=16, SEMICOLON=17, 
		COMMA=18, INDENTIFIER=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
            "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
            "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'",
            "'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
            "'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
    };
    public static final String[] ruleNames = {
            "T__0", "COLLTYPE", "STRUCT", "KEYWORD", "INT", "FLOAT", "DOUBLE", "STD_NAMESPACE",
		"MAP", "VECTOR", "NAMESPACE_PREFIX", "LEFTPARANS", "RIGHTPARANS", "DOUBLE_COLON", 
		"LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", "SEMICOLON", "COMMA", "INDENTIFIER", 
		"WS", "COMMENT", "LINE_COMMENT"
	};


    public static final int WHITESPACE = HIDDEN + 1;
    public static final int COMMENTS = HIDDEN + 2;


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
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		case 20: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 21: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 0:
                _channel = WHITESPACE;
                break;
        }
    }

    private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 2:
                _channel = COMMENTS;
                break;
        }
    }

    private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 1:
                _channel = COMMENTS;
                break;
        }
    }

	public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u009e\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5"+
		"\5D\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\7\24z\n\24\f\24\16\24}\13\24\3\25\6\25\u0080"+
		"\n\25\r\25\16\25\u0081\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u008a\n\26\f"+
		"\26\16\26\u008d\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
                    "\u0098\n\27\f\27\16\27\u009b\13\27\3\27\3\27\3\u008b\2\30\3\3\5\4\7\5" +
                    "\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23" +
                    "%\24\'\25)\26+\27-\30\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"" +
                    "\"\4\2\f\f\17\17\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2" +
                    "\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25" +
                    "\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2" +
                    "\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2" +
                    "\2\2-\3\2\2\2\3/\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\tC\3\2\2\2\13E\3\2\2" +
                    "\2\rI\3\2\2\2\17O\3\2\2\2\21V\3\2\2\2\23Z\3\2\2\2\25^\3\2\2\2\27e\3\2" +
                    "\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2" +
                    "\2%u\3\2\2\2\'w\3\2\2\2)\177\3\2\2\2+\u0085\3\2\2\2-\u0093\3\2\2\2/\60" +
                    "\7u\2\2\60\61\7v\2\2\61\62\7f\2\2\62\63\7<\2\2\63\64\7<\2\2\64\4\3\2\2" +
                    "\2\658\5\23\n\2\668\5\25\13\2\67\65\3\2\2\2\67\66\3\2\2\28\6\3\2\2\29" +
                    ":\7u\2\2:;\7v\2\2;<\7t\2\2<=\7w\2\2=>\7e\2\2>?\7v\2\2?\b\3\2\2\2@D\5\13" +
                    "\6\2AD\5\r\7\2BD\5\17\b\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\n\3\2\2\2EF\7" +
                    "k\2\2FG\7p\2\2GH\7v\2\2H\f\3\2\2\2IJ\7h\2\2JK\7n\2\2KL\7q\2\2LM\7c\2\2" +
                    "MN\7v\2\2N\16\3\2\2\2OP\7f\2\2PQ\7q\2\2QR\7w\2\2RS\7d\2\2ST\7n\2\2TU\7" +
                    "g\2\2U\20\3\2\2\2VW\7u\2\2WX\7v\2\2XY\7f\2\2Y\22\3\2\2\2Z[\7o\2\2[\\\7" +
                    "c\2\2\\]\7r\2\2]\24\3\2\2\2^_\7x\2\2_`\7g\2\2`a\7e\2\2ab\7v\2\2bc\7q\2" +
                    "\2cd\7t\2\2d\26\3\2\2\2ef\5\21\t\2fg\5\35\17\2g\30\3\2\2\2hi\7}\2\2i\32" +
                    "\3\2\2\2jk\7\177\2\2k\34\3\2\2\2lm\7<\2\2mn\7<\2\2n\36\3\2\2\2op\7>\2" +
                    "\2p \3\2\2\2qr\7@\2\2r\"\3\2\2\2st\7=\2\2t$\3\2\2\2uv\7.\2\2v&\3\2\2\2" +
                    "w{\t\2\2\2xz\t\3\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|(\3\2\2\2" +
                    "}{\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3" +
                    "\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\25\2\2\u0084" +
                    "*\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087\7,\2\2\u0087\u008b\3\2\2\2" +
                    "\u0088\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c" +
                    "\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e" +
                    "\u008f\7,\2\2\u008f\u0090\7\61\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\26" +
                    "\3\2\u0092,\3\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095\7\61\2\2\u0095\u0099" +
                    "\3\2\2\2\u0096\u0098\n\5\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099" +
                    "\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2" +
                    "\2\2\u009c\u009d\b\27\4\2\u009d.\3\2\2\2\t\2\67C{\u0081\u008b\u0099\5" +
                    "\3\25\2\3\26\3\3\27\4";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}