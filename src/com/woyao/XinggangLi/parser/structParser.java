// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.x
package com.woyao.XinggangLi.parser;

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
            T__5 = 1, T__4 = 2, T__3 = 3, T__2 = 4, T__1 = 5, T__0 = 6, COLLTYPE = 7, CLASS_KEYWORD = 8,
            STRUCT = 9, CLASS = 10, PROTECTION_LEVEL = 11, FIELD_PROTECTION = 12, PUBLIC = 13,
            PROTECTED = 14, PRIVATE = 15, STD_NAMESPACE = 16, MAP = 17, VECTOR = 18, NAMESPACE_PREFIX = 19,
            LEFT_CURLY_BRACE = 20, RIGHT_CURLY_BRACE = 21, Digit = 22, LEFT_ANGLE_BRACKET = 23,
            RIGHT_ANGLE_BRACKET = 24, SEMICOLON = 25, COMMA = 26, LEFTBRACKET = 27, RIGHTBRACKET = 28,
            LEFT_PARANS = 29, RIGHT_PARANS = 30, INDENTIFIER = 31, WS = 32, COMMENT = 33, LINE_COMMENT = 34;
    public static final String[] tokenNames = {
            "<INVALID>", "'&'", "'*'", "':'", "'std::'", "'void'", "'const'", "COLLTYPE",
            "CLASS_KEYWORD", "'struct'", "'class'", "PROTECTION_LEVEL", "FIELD_PROTECTION",
            "'public'", "'protected'", "'private'", "'std'", "'map'", "'vector'",
            "NAMESPACE_PREFIX", "'{'", "'}'", "Digit", "'<'", "'>'", "';'", "','",
            "'['", "']'", "'('", "')'", "INDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
    };
    public static final int
            RULE_structDefine = 0, RULE_inheritance = 1, RULE_structField = 2, RULE_fieldDecl = 3,
            RULE_method = 4, RULE_methodDecl = 5, RULE_methodDefine = 6, RULE_methodSignature = 7,
            RULE_paramList = 8, RULE_param = 9, RULE_fieldType = 10, RULE_concreteType = 11,
            RULE_genericCollType = 12, RULE_nameInNamespace = 13, RULE_elementType = 14,
            RULE_mapType = 15;
    public static final String[] ruleNames = {
            "structDefine", "inheritance", "structField", "fieldDecl", "method", "methodDecl",
            "methodDefine", "methodSignature", "paramList", "param", "fieldType",
            "concreteType", "genericCollType", "nameInNamespace", "elementType", "mapType"
    };

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
    public ATN getATN() {
        return _ATN;
    }

    public structParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class StructDefineContext extends ParserRuleContext {
        public Token name;
        public Token leftCurlyBrace;
        public Token rightCurlyBrace;

        public TerminalNode INDENTIFIER() {
            return getToken(structParser.INDENTIFIER, 0);
        }

        public StructFieldContext structField() {
            return getRuleContext(StructFieldContext.class, 0);
        }

        public TerminalNode CLASS_KEYWORD() {
            return getToken(structParser.CLASS_KEYWORD, 0);
        }

        public InheritanceContext inheritance() {
            return getRuleContext(InheritanceContext.class, 0);
        }

        public StructDefineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_structDefine;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterStructDefine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitStructDefine(this);
        }
    }

    public final StructDefineContext structDefine() throws RecognitionException {
        StructDefineContext _localctx = new StructDefineContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_structDefine);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(32);
                match(CLASS_KEYWORD);
                setState(33);
                ((StructDefineContext) _localctx).name = match(INDENTIFIER);
                setState(35);
                _la = _input.LA(1);
                if (_la == T__3) {
                    {
                        setState(34);
                        inheritance();
                    }
                }

                setState(37);
                ((StructDefineContext) _localctx).leftCurlyBrace = match(LEFT_CURLY_BRACE);
                setState(38);
                structField();
                setState(39);
                ((StructDefineContext) _localctx).rightCurlyBrace = match(RIGHT_CURLY_BRACE);
                setState(40);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InheritanceContext extends ParserRuleContext {
        public TerminalNode INDENTIFIER() {
            return getToken(structParser.INDENTIFIER, 0);
        }

        public TerminalNode PROTECTION_LEVEL() {
            return getToken(structParser.PROTECTION_LEVEL, 0);
        }

        public InheritanceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inheritance;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterInheritance(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitInheritance(this);
        }
    }

    public final InheritanceContext inheritance() throws RecognitionException {
        InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_inheritance);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(42);
                match(T__3);
                setState(43);
                match(PROTECTION_LEVEL);
                setState(44);
                match(INDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StructFieldContext extends ParserRuleContext {
        public List<StructDefineContext> structDefine() {
            return getRuleContexts(StructDefineContext.class);
        }

        public FieldDeclContext fieldDecl(int i) {
            return getRuleContext(FieldDeclContext.class, i);
        }

        public StructDefineContext structDefine(int i) {
            return getRuleContext(StructDefineContext.class, i);
        }

        public List<MethodContext> method() {
            return getRuleContexts(MethodContext.class);
        }

        public MethodContext method(int i) {
            return getRuleContext(MethodContext.class, i);
        }

        public List<FieldDeclContext> fieldDecl() {
            return getRuleContexts(FieldDeclContext.class);
        }

        public StructFieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_structField;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterStructField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitStructField(this);
        }
    }

    public final StructFieldContext structField() throws RecognitionException {
        StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_structField);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(49);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(49);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(46);
                                fieldDecl();
                            }
                            break;
                            case 2: {
                                setState(47);
                                structDefine();
                            }
                            break;
                            case 3: {
                                setState(48);
                                method();
                            }
                            break;
                        }
                    }
                    setState(51);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << COLLTYPE) | (1L << CLASS_KEYWORD) | (1L << INDENTIFIER))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldDeclContext extends ParserRuleContext {
        public Token name;
        public Token number;

        public List<TerminalNode> INDENTIFIER() {
            return getTokens(structParser.INDENTIFIER);
        }

        public TerminalNode INDENTIFIER(int i) {
            return getToken(structParser.INDENTIFIER, i);
        }

        public FieldTypeContext fieldType() {
            return getRuleContext(FieldTypeContext.class, 0);
        }

        public FieldDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterFieldDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitFieldDecl(this);
        }
    }

    public final FieldDeclContext fieldDecl() throws RecognitionException {
        FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_fieldDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                fieldType();
                setState(54);
                ((FieldDeclContext) _localctx).name = match(INDENTIFIER);
                setState(58);
                _la = _input.LA(1);
                if (_la == LEFTBRACKET) {
                    {
                        setState(55);
                        match(LEFTBRACKET);
                        setState(56);
                        ((FieldDeclContext) _localctx).number = match(INDENTIFIER);
                        setState(57);
                        match(RIGHTBRACKET);
                    }
                }

                setState(60);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodContext extends ParserRuleContext {
        public MethodDefineContext methodDefine() {
            return getRuleContext(MethodDefineContext.class, 0);
        }

        public MethodDeclContext methodDecl() {
            return getRuleContext(MethodDeclContext.class, 0);
        }

        public MethodContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterMethod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitMethod(this);
        }
    }

    public final MethodContext method() throws RecognitionException {
        MethodContext _localctx = new MethodContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_method);
        try {
            setState(64);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(62);
                    methodDecl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(63);
                    methodDefine();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodDeclContext extends ParserRuleContext {
        public MethodSignatureContext methodSignature() {
            return getRuleContext(MethodSignatureContext.class, 0);
        }

        public MethodDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterMethodDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitMethodDecl(this);
        }
    }

    public final MethodDeclContext methodDecl() throws RecognitionException {
        MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_methodDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                methodSignature();
                setState(67);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodDefineContext extends ParserRuleContext {
        public MethodSignatureContext methodSignature() {
            return getRuleContext(MethodSignatureContext.class, 0);
        }

        public MethodDefineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDefine;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterMethodDefine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitMethodDefine(this);
        }
    }

    public final MethodDefineContext methodDefine() throws RecognitionException {
        MethodDefineContext _localctx = new MethodDefineContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_methodDefine);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(69);
                methodSignature();
                setState(70);
                match(LEFT_CURLY_BRACE);
                setState(74);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 1 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(71);
                                matchWildcard();
                            }
                        }
                    }
                    setState(76);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
                setState(77);
                match(RIGHT_CURLY_BRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodSignatureContext extends ParserRuleContext {
        public Token returnType;
        public Token name;

        public List<TerminalNode> INDENTIFIER() {
            return getTokens(structParser.INDENTIFIER);
        }

        public ParamListContext paramList() {
            return getRuleContext(ParamListContext.class, 0);
        }

        public TerminalNode INDENTIFIER(int i) {
            return getToken(structParser.INDENTIFIER, i);
        }

        public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodSignature;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterMethodSignature(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitMethodSignature(this);
        }
    }

    public final MethodSignatureContext methodSignature() throws RecognitionException {
        MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_methodSignature);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                ((MethodSignatureContext) _localctx).returnType = match(INDENTIFIER);
                setState(80);
                ((MethodSignatureContext) _localctx).name = match(INDENTIFIER);
                setState(81);
                match(LEFT_PARANS);
                setState(83);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << COLLTYPE) | (1L << INDENTIFIER))) != 0)) {
                    {
                        setState(82);
                        paramList();
                    }
                }

                setState(85);
                match(RIGHT_PARANS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParamListContext extends ParserRuleContext {
        public List<ParamContext> param() {
            return getRuleContexts(ParamContext.class);
        }

        public ParamContext param(int i) {
            return getRuleContext(ParamContext.class, i);
        }

        public ParamListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_paramList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterParamList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitParamList(this);
        }
    }

    public final ParamListContext paramList() throws RecognitionException {
        ParamListContext _localctx = new ParamListContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_paramList);
        int _la;
        try {
            setState(96);
            switch (_input.LA(1)) {
                case T__2:
                case T__0:
                case COLLTYPE:
                case INDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(87);
                    param();
                    setState(92);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(88);
                                match(COMMA);
                                setState(89);
                                param();
                            }
                        }
                        setState(94);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(95);
                    match(T__1);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParamContext extends ParserRuleContext {
        public Token name;

        public TerminalNode INDENTIFIER() {
            return getToken(structParser.INDENTIFIER, 0);
        }

        public FieldTypeContext fieldType() {
            return getRuleContext(FieldTypeContext.class, 0);
        }

        public ParamContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterParam(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitParam(this);
        }
    }

    public final ParamContext param() throws RecognitionException {
        ParamContext _localctx = new ParamContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_param);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(98);
                fieldType();
                setState(99);
                ((ParamContext) _localctx).name = match(INDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldTypeContext extends ParserRuleContext {
        public ConcreteTypeContext concreteType() {
            return getRuleContext(ConcreteTypeContext.class, 0);
        }

        public FieldTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterFieldType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitFieldType(this);
        }
    }

    public final FieldTypeContext fieldType() throws RecognitionException {
        FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_fieldType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                _la = _input.LA(1);
                if (_la == T__0) {
                    {
                        setState(101);
                        match(T__0);
                    }
                }

                setState(104);
                concreteType();
                setState(106);
                _la = _input.LA(1);
                if (_la == T__5 || _la == T__4) {
                    {
                        setState(105);
                        _la = _input.LA(1);
                        if (!(_la == T__5 || _la == T__4)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConcreteTypeContext extends ParserRuleContext {
        public TerminalNode INDENTIFIER() {
            return getToken(structParser.INDENTIFIER, 0);
        }

        public NameInNamespaceContext nameInNamespace() {
            return getRuleContext(NameInNamespaceContext.class, 0);
        }

        public GenericCollTypeContext genericCollType() {
            return getRuleContext(GenericCollTypeContext.class, 0);
        }

        public ConcreteTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_concreteType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterConcreteType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitConcreteType(this);
        }
    }

    public final ConcreteTypeContext concreteType() throws RecognitionException {
        ConcreteTypeContext _localctx = new ConcreteTypeContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_concreteType);
        try {
            setState(111);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(108);
                    match(INDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(109);
                    nameInNamespace();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(110);
                    genericCollType();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GenericCollTypeContext extends ParserRuleContext {
        public TerminalNode COLLTYPE() {
            return getToken(structParser.COLLTYPE, 0);
        }

        public ElementTypeContext elementType() {
            return getRuleContext(ElementTypeContext.class, 0);
        }

        public GenericCollTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericCollType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterGenericCollType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitGenericCollType(this);
        }
    }

    public final GenericCollTypeContext genericCollType() throws RecognitionException {
        GenericCollTypeContext _localctx = new GenericCollTypeContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_genericCollType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(113);
                        match(T__2);
                    }
                }

                setState(116);
                match(COLLTYPE);
                setState(117);
                match(LEFT_ANGLE_BRACKET);
                setState(118);
                elementType();
                setState(119);
                match(RIGHT_ANGLE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NameInNamespaceContext extends ParserRuleContext {
        public TerminalNode INDENTIFIER() {
            return getToken(structParser.INDENTIFIER, 0);
        }

        public NameInNamespaceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nameInNamespace;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterNameInNamespace(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitNameInNamespace(this);
        }
    }

    public final NameInNamespaceContext nameInNamespace() throws RecognitionException {
        NameInNamespaceContext _localctx = new NameInNamespaceContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_nameInNamespace);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(122);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(121);
                        match(T__2);
                    }
                }

                setState(124);
                match(INDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementTypeContext extends ParserRuleContext {
        public MapTypeContext mapType() {
            return getRuleContext(MapTypeContext.class, 0);
        }

        public FieldTypeContext fieldType() {
            return getRuleContext(FieldTypeContext.class, 0);
        }

        public ElementTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterElementType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitElementType(this);
        }
    }

    public final ElementTypeContext elementType() throws RecognitionException {
        ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_elementType);
        try {
            setState(128);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(126);
                    fieldType();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(127);
                    mapType();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MapTypeContext extends ParserRuleContext {
        public List<TerminalNode> INDENTIFIER() {
            return getTokens(structParser.INDENTIFIER);
        }

        public TerminalNode INDENTIFIER(int i) {
            return getToken(structParser.INDENTIFIER, i);
        }

        public MapTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).enterMapType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof structListener) ((structListener) listener).exitMapType(this);
        }
    }

    public final MapTypeContext mapType() throws RecognitionException {
        MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_mapType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(INDENTIFIER);
                setState(131);
                match(COMMA);
                setState(132);
                match(INDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0089\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3" +
                    "\2\5\2&\n\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4\64\n\4" +
                    "\r\4\16\4\65\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\6\3\6\5\6C\n\6\3\7" +
                    "\3\7\3\7\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5" +
                    "\tV\n\t\3\t\3\t\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\n\5\nc\n\n\3\13" +
                    "\3\13\3\13\3\f\5\fi\n\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\5\rr\n\r\3\16\5\16" +
                    "u\n\16\3\16\3\16\3\16\3\16\3\16\3\17\5\17}\n\17\3\17\3\17\3\20\3\20\5" +
                    "\20\u0083\n\20\3\21\3\21\3\21\3\21\3\21\3L\2\22\2\4\6\b\n\f\16\20\22\24" +
                    "\26\30\32\34\36 \2\3\3\2\3\4\u0089\2\"\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2" +
                    "\b\67\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16G\3\2\2\2\20Q\3\2\2\2\22b\3\2\2" +
                    "\2\24d\3\2\2\2\26h\3\2\2\2\30q\3\2\2\2\32t\3\2\2\2\34|\3\2\2\2\36\u0082" +
                    "\3\2\2\2 \u0084\3\2\2\2\"#\7\n\2\2#%\7!\2\2$&\5\4\3\2%$\3\2\2\2%&\3\2" +
                    "\2\2&\'\3\2\2\2\'(\7\26\2\2()\5\6\4\2)*\7\27\2\2*+\7\33\2\2+\3\3\2\2\2" +
                    ",-\7\5\2\2-.\7\r\2\2./\7!\2\2/\5\3\2\2\2\60\64\5\b\5\2\61\64\5\2\2\2\62" +
                    "\64\5\n\6\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65" +
                    "\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\678\5\26\f\28<\7!\2\29:\7\35\2" +
                    "\2:;\7!\2\2;=\7\36\2\2<9\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\33\2\2?\t\3\2" +
                    "\2\2@C\5\f\7\2AC\5\16\b\2B@\3\2\2\2BA\3\2\2\2C\13\3\2\2\2DE\5\20\t\2E" +
                    "F\7\33\2\2F\r\3\2\2\2GH\5\20\t\2HL\7\26\2\2IK\13\2\2\2JI\3\2\2\2KN\3\2" +
                    "\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\27\2\2P\17\3\2\2\2QR" +
                    "\7!\2\2RS\7!\2\2SU\7\37\2\2TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W" +
                    "X\7 \2\2X\21\3\2\2\2Y^\5\24\13\2Z[\7\34\2\2[]\5\24\13\2\\Z\3\2\2\2]`\3" +
                    "\2\2\2^\\\3\2\2\2^_\3\2\2\2_c\3\2\2\2`^\3\2\2\2ac\7\7\2\2bY\3\2\2\2ba" +
                    "\3\2\2\2c\23\3\2\2\2de\5\26\f\2ef\7!\2\2f\25\3\2\2\2gi\7\b\2\2hg\3\2\2" +
                    "\2hi\3\2\2\2ij\3\2\2\2jl\5\30\r\2km\t\2\2\2lk\3\2\2\2lm\3\2\2\2m\27\3" +
                    "\2\2\2nr\7!\2\2or\5\34\17\2pr\5\32\16\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2" +
                    "r\31\3\2\2\2su\7\6\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\t\2\2wx\7\31" +
                    "\2\2xy\5\36\20\2yz\7\32\2\2z\33\3\2\2\2{}\7\6\2\2|{\3\2\2\2|}\3\2\2\2" +
                    "}~\3\2\2\2~\177\7!\2\2\177\35\3\2\2\2\u0080\u0083\5\26\f\2\u0081\u0083" +
                    "\5 \21\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\37\3\2\2\2\u0084" +
                    "\u0085\7!\2\2\u0085\u0086\7\34\2\2\u0086\u0087\7!\2\2\u0087!\3\2\2\2\21" +
                    "%\63\65<BLU^bhlqt|\u0082";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}