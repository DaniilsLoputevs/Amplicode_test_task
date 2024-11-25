// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license.
package com.github.daniilsloputevs.amplicodetesttask.language;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.intellij.lexer.FlexLexer;
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypesManual;
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes;

%%

%{
  public ATTLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class ATTLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

CRLF=\r|\n|\r\n
WHITE_SPACE=[\ \n\t\f]
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
NUMBER=[0-9]+
LOGICAL_OPERATOR_KEYWORD="and"|"or"
LOGICAL_OPERATOR_SIGN="&&"|"||"
LOGICAL_OPERATOR={LOGICAL_OPERATOR_KEYWORD}|{LOGICAL_OPERATOR_SIGN}
COMPARISON_OPERATOR="=="|"!="|"<"|">"|"<="|">="
ADDITION_OPERATOR="+"|"-"
MULTIPLICATION_OPERATOR="*"|"/"|"%"
//SEPARATOR="="
//SEMICOLON=";"



%%

// General statements
<YYINITIAL> "var" { return ATTTypes.VARIABLE_DECLARATION; }
//<YYINITIAL> "var" {IDENTIFIER} { return ATTTypes.VARIABLE_DECLARATION; }
//<YYINITIAL> "var" { return ATTTypes.VARIABLE_DECLARATION_AND_INIT; }
//<YYINITIAL> {IDENTIFIER} { return ATTTypes.IDENTIFIER; }
<YYINITIAL> "="  { return ATTTypesManual.ASSIGN; }
<YYINITIAL> ";"  { return ATTTypesManual.SEMICOLON; }
//<YYINITIAL> "//" [a-zA-Z0-9_]* {CRLF} { return ATTTypesManual.SEMICOLON; }

// While loop
<YYINITIAL> "while" { return ATTTypes.WHILE_LOOP; }
<YYINITIAL> "do" { return ATTTypes.DO_WHILE_LOOP; }

// If statement
<YYINITIAL> "if" { return ATTTypes.IF_STATEMENT; }
<YYINITIAL> "else" { return ATTTypesManual.ELSE_STATEMENT; }

// Expressions
<YYINITIAL> {NUMBER} { return ATTTypes.TOKEN; }
<YYINITIAL> {IDENTIFIER} { return ATTTypes.TOKEN; }
<YYINITIAL> "(" { return ATTTypesManual.OPEN_PARENTHESIS; }
<YYINITIAL> ")" { return ATTTypesManual.CLOSE_PARENTHESIS; }

// Operators
<YYINITIAL> {LOGICAL_OPERATOR_SIGN} { return ATTTypes.LOGICAL_OPERATOR; }
<YYINITIAL> {LOGICAL_OPERATOR_KEYWORD} { return ATTTypesManual.LOGICAL_OPERATOR_KEYWORD; }
<YYINITIAL> {COMPARISON_OPERATOR} { return ATTTypes.COMPARISON_OPERATOR; }
<YYINITIAL> {ADDITION_OPERATOR} { return ATTTypes.ADDITION_OPERATOR; }
<YYINITIAL> {MULTIPLICATION_OPERATOR} { return ATTTypes.MULTIPLICATION_OPERATOR; }

// Block and statements
<YYINITIAL> "{" { return ATTTypesManual.BLOCK_OPEN; }
<YYINITIAL> "}" { return ATTTypesManual.BLOCK_CLOSE; }

// Whitespace handling
<YYINITIAL> {WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }

. {System.out.println("Token: |" + yytext() + "| Type: BAD_CHARACTER");}

