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
            T__5 = 1, T__4 = 2, T__3 = 3, T__2 = 4, T__1 = 5, T__0 = 6, COLLTYPE = 7, CLASS_KEYWORD = 8,
            STRUCT = 9, CLASS = 10, PROTECTION_LEVEL = 11, FIELD_PROTECTION = 12, PUBLIC = 13,
            PROTECTED = 14, PRIVATE = 15, STD_NAMESPACE = 16, MAP = 17, VECTOR = 18, NAMESPACE_PREFIX = 19,
            LEFT_CURLY_BRACE = 20, RIGHT_CURLY_BRACE = 21, Digit = 22, LEFT_ANGLE_BRACKET = 23,
            RIGHT_ANGLE_BRACKET = 24, SEMICOLON = 25, COMMA = 26, LEFTBRACKET = 27, RIGHTBRACKET = 28,
            LEFT_PARANS = 29, RIGHT_PARANS = 30, INDENTIFIER = 31, WS = 32, COMMENT = 33, LINE_COMMENT = 34;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
            "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'",
            "'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
            "'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'",
            "'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'",
            "'\\u001F'", "' '", "'!'", "'\"'"
    };
    public static final String[] ruleNames = {
            "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COLLTYPE", "CLASS_KEYWORD",
            "STRUCT", "CLASS", "PROTECTION_LEVEL", "FIELD_PROTECTION", "PUBLIC", "PROTECTED",
            "PRIVATE", "STD_NAMESPACE", "MAP", "VECTOR", "NAMESPACE_PREFIX", "LEFT_CURLY_BRACE",
            "RIGHT_CURLY_BRACE", "DOUBLE_COLON", "COLON", "Digit", "LEFT_ANGLE_BRACKET",
            "RIGHT_ANGLE_BRACKET", "SEMICOLON", "COMMA", "LEFTBRACKET", "RIGHTBRACKET",
            "LEFT_PARANS", "RIGHT_PARANS", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
    };


    public static final int WHITESPACE = HIDDEN + 1;
    public static final int COMMENTS = HIDDEN + 2;


    public structLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "struct.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 33:
                WS_action((RuleContext) _localctx, actionIndex);
                break;
            case 34:
                COMMENT_action((RuleContext) _localctx, actionIndex);
                break;
            case 35:
                LINE_COMMENT_action((RuleContext) _localctx, actionIndex);
                break;
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00f1\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\be\n\b" +
                    "\3\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13" +
                    "\3\13\3\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26" +
                    "\3\27\3\27\3\27\3\30\3\30\3\31\6\31\u00b7\n\31\r\31\16\31\u00b8\3\32\3" +
                    "\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"" +
                    "\3\"\7\"\u00cd\n\"\f\"\16\"\u00d0\13\"\3#\6#\u00d3\n#\r#\16#\u00d4\3#" +
                    "\3#\3$\3$\3$\3$\7$\u00dd\n$\f$\16$\u00e0\13$\3$\3$\3$\3$\3$\3%\3%\3%\3" +
                    "%\7%\u00eb\n%\f%\16%\u00ee\13%\3%\3%\3\u00de\2&\3\3\5\4\7\5\t\6\13\7\r" +
                    "\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25" +
                    ")\26+\27-\2/\2\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$\3\2" +
                    "\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00f7\2" +
                    "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2" +
                    "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2" +
                    "\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2" +
                    "\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3\2" +
                    "\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2" +
                    "\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2" +
                    "\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13W\3\2\2\2\r\\\3\2\2\2\17d\3\2\2\2" +
                    "\21h\3\2\2\2\23j\3\2\2\2\25q\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33\u0081" +
                    "\3\2\2\2\35\u0088\3\2\2\2\37\u0092\3\2\2\2!\u009a\3\2\2\2#\u009e\3\2\2" +
                    "\2%\u00a2\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00ae\3\2\2\2-\u00b0" +
                    "\3\2\2\2/\u00b3\3\2\2\2\61\u00b6\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2" +
                    "\2\2\67\u00be\3\2\2\29\u00c0\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c6" +
                    "\3\2\2\2A\u00c8\3\2\2\2C\u00ca\3\2\2\2E\u00d2\3\2\2\2G\u00d8\3\2\2\2I" +
                    "\u00e6\3\2\2\2KL\7(\2\2L\4\3\2\2\2MN\7,\2\2N\6\3\2\2\2OP\7<\2\2P\b\3\2" +
                    "\2\2QR\7u\2\2RS\7v\2\2ST\7f\2\2TU\7<\2\2UV\7<\2\2V\n\3\2\2\2WX\7x\2\2" +
                    "XY\7q\2\2YZ\7k\2\2Z[\7f\2\2[\f\3\2\2\2\\]\7e\2\2]^\7q\2\2^_\7p\2\2_`\7" +
                    "u\2\2`a\7v\2\2a\16\3\2\2\2be\5#\22\2ce\5%\23\2db\3\2\2\2dc\3\2\2\2e\20" +
                    "\3\2\2\2fi\5\23\n\2gi\5\25\13\2hf\3\2\2\2hg\3\2\2\2i\22\3\2\2\2jk\7u\2" +
                    "\2kl\7v\2\2lm\7t\2\2mn\7w\2\2no\7e\2\2op\7v\2\2p\24\3\2\2\2qr\7e\2\2r" +
                    "s\7n\2\2st\7c\2\2tu\7u\2\2uv\7u\2\2v\26\3\2\2\2w{\5\33\16\2x{\5\35\17" +
                    "\2y{\5\37\20\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\30\3\2\2\2|}\5\27\f\2}~" +
                    "\7<\2\2~\177\3\2\2\2\177\u0080\b\r\2\2\u0080\32\3\2\2\2\u0081\u0082\7" +
                    "r\2\2\u0082\u0083\7w\2\2\u0083\u0084\7d\2\2\u0084\u0085\7n\2\2\u0085\u0086" +
                    "\7k\2\2\u0086\u0087\7e\2\2\u0087\34\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a" +
                    "\7t\2\2\u008a\u008b\7q\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d" +
                    "\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\u0091\7f\2\2" +
                    "\u0091\36\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094\7t\2\2\u0094\u0095\7" +
                    "k\2\2\u0095\u0096\7x\2\2\u0096\u0097\7c\2\2\u0097\u0098\7v\2\2\u0098\u0099" +
                    "\7g\2\2\u0099 \3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\u009d" +
                    "\7f\2\2\u009d\"\3\2\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1" +
                    "\7r\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5" +
                    "\7e\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2\u00a8" +
                    "&\3\2\2\2\u00a9\u00aa\5!\21\2\u00aa\u00ab\5-\27\2\u00ab(\3\2\2\2\u00ac" +
                    "\u00ad\7}\2\2\u00ad*\3\2\2\2\u00ae\u00af\7\177\2\2\u00af,\3\2\2\2\u00b0" +
                    "\u00b1\7<\2\2\u00b1\u00b2\7<\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4" +
                    "\60\3\2\2\2\u00b5\u00b7\4\62;\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2" +
                    "\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\62\3\2\2\2\u00ba\u00bb" +
                    "\7>\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\66\3\2\2\2\u00be\u00bf" +
                    "\7=\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7" +
                    "]\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7_\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7*" +
                    "\2\2\u00c7@\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9B\3\2\2\2\u00ca\u00ce\t\2" +
                    "\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce" +
                    "\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cfD\3\2\2\2\u00d0\u00ce\3\2\2\2" +
                    "\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2" +
                    "\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b#\3\2\u00d7" +
                    "F\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\7,\2\2\u00da\u00de\3\2\2\2" +
                    "\u00db\u00dd\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df" +
                    "\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1" +
                    "\u00e2\7,\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b$" +
                    "\4\2\u00e5H\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ec" +
                    "\3\2\2\2\u00e9\u00eb\n\5\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec" +
                    "\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2" +
                    "\2\2\u00ef\u00f0\b%\5\2\u00f0J\3\2\2\2\13\2dhz\u00b8\u00ce\u00d4\u00de" +
                    "\u00ec\6\b\2\2\3#\2\3$\3\3%\4";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}