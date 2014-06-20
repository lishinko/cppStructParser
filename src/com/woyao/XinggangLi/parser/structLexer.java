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
            T__0 = 1, COLLTYPE = 2, STRUCT = 3, KEYWORD = 4, INT = 5, FLOAT = 6, DOUBLE = 7, STD_NAMESPACE = 8,
            MAP = 9, VECTOR = 10, NAMESPACE_PREFIX = 11, LEFTPARANS = 12, RIGHTPARANS = 13,
            DOUBLE_COLON = 14, LEFT_ANGLE_BRACKET = 15, RIGHT_ANGLE_BRACKET = 16, SEMICOLON = 17,
            COMMA = 18, LEFTBRACKET = 19, RIGHTBRACKET = 20, INDENTIFIER = 21, WS = 22, COMMENT = 23,
            LINE_COMMENT = 24;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
            "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'",
            "'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
            "'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
    };
    public static final String[] ruleNames = {
            "T__0", "COLLTYPE", "STRUCT", "KEYWORD", "INT", "FLOAT", "DOUBLE", "STD_NAMESPACE",
            "MAP", "VECTOR", "NAMESPACE_PREFIX", "LEFTPARANS", "RIGHTPARANS", "DOUBLE_COLON",
            "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", "SEMICOLON", "COMMA", "LEFTBRACKET",
            "RIGHTBRACKET", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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
            case 21:
                WS_action((RuleContext) _localctx, actionIndex);
                break;
            case 22:
                COMMENT_action((RuleContext) _localctx, actionIndex);
                break;
            case 23:
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a6\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20" +
                    "\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26" +
                    "\u0082\n\26\f\26\16\26\u0085\13\26\3\27\6\27\u0088\n\27\r\27\16\27\u0089" +
                    "\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0092\n\30\f\30\16\30\u0095\13\30" +
                    "\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00a0\n\31\f\31\16" +
                    "\31\u00a3\13\31\3\31\3\31\3\u0093\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21" +
                    "\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30" +
                    "/\31\61\32\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f" +
                    "\17\17\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2" +
                    "\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2" +
                    "\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2" +
                    "\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2" +
                    "\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\tG\3\2\2" +
                    "\2\13I\3\2\2\2\rM\3\2\2\2\17S\3\2\2\2\21Z\3\2\2\2\23^\3\2\2\2\25b\3\2" +
                    "\2\2\27i\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37s\3\2\2\2!u\3\2" +
                    "\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-\u0087\3\2" +
                    "\2\2/\u008d\3\2\2\2\61\u009b\3\2\2\2\63\64\7u\2\2\64\65\7v\2\2\65\66\7" +
                    "f\2\2\66\67\7<\2\2\678\7<\2\28\4\3\2\2\29<\5\23\n\2:<\5\25\13\2;9\3\2" +
                    "\2\2;:\3\2\2\2<\6\3\2\2\2=>\7u\2\2>?\7v\2\2?@\7t\2\2@A\7w\2\2AB\7e\2\2" +
                    "BC\7v\2\2C\b\3\2\2\2DH\5\13\6\2EH\5\r\7\2FH\5\17\b\2GD\3\2\2\2GE\3\2\2" +
                    "\2GF\3\2\2\2H\n\3\2\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\f\3\2\2\2MN\7h\2\2" +
                    "NO\7n\2\2OP\7q\2\2PQ\7c\2\2QR\7v\2\2R\16\3\2\2\2ST\7f\2\2TU\7q\2\2UV\7" +
                    "w\2\2VW\7d\2\2WX\7n\2\2XY\7g\2\2Y\20\3\2\2\2Z[\7u\2\2[\\\7v\2\2\\]\7f" +
                    "\2\2]\22\3\2\2\2^_\7o\2\2_`\7c\2\2`a\7r\2\2a\24\3\2\2\2bc\7x\2\2cd\7g" +
                    "\2\2de\7e\2\2ef\7v\2\2fg\7q\2\2gh\7t\2\2h\26\3\2\2\2ij\5\21\t\2jk\5\35" +
                    "\17\2k\30\3\2\2\2lm\7}\2\2m\32\3\2\2\2no\7\177\2\2o\34\3\2\2\2pq\7<\2" +
                    "\2qr\7<\2\2r\36\3\2\2\2st\7>\2\2t \3\2\2\2uv\7@\2\2v\"\3\2\2\2wx\7=\2" +
                    "\2x$\3\2\2\2yz\7.\2\2z&\3\2\2\2{|\7]\2\2|(\3\2\2\2}~\7_\2\2~*\3\2\2\2" +
                    "\177\u0083\t\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0085" +
                    "\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084,\3\2\2\2\u0085" +
                    "\u0083\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2" +
                    "\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b" +
                    "\u008c\b\27\2\2\u008c.\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7,\2\2" +
                    "\u008f\u0093\3\2\2\2\u0090\u0092\13\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095" +
                    "\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095" +
                    "\u0093\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\7\61\2\2\u0098\u0099\3\2" +
                    "\2\2\u0099\u009a\b\30\3\2\u009a\60\3\2\2\2\u009b\u009c\7\61\2\2\u009c" +
                    "\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n\5\2\2\u009f\u009e\3" +
                    "\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2" +
                    "\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\31\4\2\u00a5\62\3\2\2" +
                    "\2\t\2;G\u0083\u0089\u0093\u00a1\5\3\27\2\3\30\3\3\31\4";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}