// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license.
package com.github.daniilsloputevs.amplicodetesttask.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes;
import com.intellij.psi.TokenType;

%%

%class ATTLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
NUMBER=[0-9]+
LOGICAL_OPERATOR="and"|"or"|"&&"|"||"
COMPARISON_OPERATOR="=="|"!="|"<"|">"|"<="|">="
ADDITION_OPERATOR="+"|"-"
MULTIPLICATION_OPERATOR="*"|"/"|"%"
SEPARATOR="="

%%

// General statements
<YYINITIAL> "var" { return ATTTypes.VARIABLE_DECLARATION; }
<YYINITIAL> "var" { return ATTTypes.VARIABLE_DECLARATION_AND_INIT; }
<YYINITIAL> {IDENTIFIER} "=" { return ATTTypes.ASSIGNMENT; }

// While loop
<YYINITIAL> "while" "(" { return ATTTypes.WHILE_LOOP; }
<YYINITIAL> "do" { return ATTTypes.DO_WHILE_LOOP; }

// If statement
<YYINITIAL> "if" "(" { return ATTTypes.IF_STATEMENT; }
<YYINITIAL> "else" { return ATTTypes.ELSE_STATEMENT; }

// Expressions
<YYINITIAL> {NUMBER} { return ATTTypes.NUMBER; }
<YYINITIAL> {IDENTIFIER} { return ATTTypes.IDENTIFIER; }
<YYINITIAL> "(" { return ATTTypes.OPEN_PARENTHESIS; }
<YYINITIAL> ")" { return ATTTypes.CLOSE_PARENTHESIS; }

// Operators
<YYINITIAL> {LOGICAL_OPERATOR} { return ATTTypes.LOGICAL_OPERATOR; }
<YYINITIAL> {COMPARISON_OPERATOR} { return ATTTypes.COMPARISON_OPERATOR; }
<YYINITIAL> {ADDITION_OPERATOR} { return ATTTypes.ADDITION_OPERATOR; }
<YYINITIAL> {MULTIPLICATION_OPERATOR} { return ATTTypes.MULTIPLICATION_OPERATOR; }

// Block and statements
<YYINITIAL> "{" { return ATTTypes.BLOCK_OPEN; }
<YYINITIAL> "}" { return ATTTypes.BLOCK_CLOSE; }

// Whitespace handling
<YYINITIAL> {WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }



