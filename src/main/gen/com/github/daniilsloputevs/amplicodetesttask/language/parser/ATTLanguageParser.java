// This is a generated file. Not intended for manual editing.
package com.github.daniilsloputevs.amplicodetesttask.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ATTLanguageParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // "+" | "-"
  public static boolean ADDITION_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ADDITION_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITION_OPERATOR, "<addition operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "==" | "!=" | "<" | ">" | "<=" | ">="
  public static boolean COMPARISON_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMPARISON_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_LEAF["[a-zA-Z_][a-zA-Z0-9_]*"]
  public static boolean IDENTIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IDENTIFIER")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LEAF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_LEAF);
    r = r && IDENTIFIER_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  // ["[a-zA-Z_][a-zA-Z0-9_]*"]
  private static boolean IDENTIFIER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IDENTIFIER_1")) return false;
    consumeToken(b, "[a-zA-Z_][a-zA-Z0-9_]*");
    return true;
  }

  /* ********************************************************** */
  // "and" | "or" | "&&" | "||"
  public static boolean LOGICAL_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LOGICAL_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OPERATOR, "<logical operator>");
    r = consumeToken(b, "and");
    if (!r) r = consumeToken(b, "or");
    if (!r) r = consumeToken(b, "&&");
    if (!r) r = consumeToken(b, "||");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "*" | "/" | "%"
  public static boolean MULTIPLICATION_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTIPLICATION_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATION_OPERATOR, "<multiplication operator>");
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUMBER_LEAF["[0-9]+"]
  public static boolean NUMBER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NUMBER")) return false;
    if (!nextTokenIs(b, NUMBER_LEAF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER_LEAF);
    r = r && NUMBER_1(b, l + 1);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  // ["[0-9]+"]
  private static boolean NUMBER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NUMBER_1")) return false;
    consumeToken(b, "[0-9]+");
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER "=" expression ";"
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LEAF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // "{" statement_list "}"
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = consumeToken(b, "{");
    r = r && statement_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // term (COMPARISON_OPERATOR term)*
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = term(b, l + 1);
    r = r && comparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMPARISON_OPERATOR term)*
  private static boolean comparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparison_1", c)) break;
    }
    return true;
  }

  // COMPARISON_OPERATOR term
  private static boolean comparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COMPARISON_OPERATOR(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "do" block "while" "(" expression ")"
  public static boolean do_while_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_while_loop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DO_WHILE_LOOP, "<do while loop>");
    r = consumeToken(b, "do");
    r = r && block(b, l + 1);
    r = r && consumeToken(b, "while");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // comparison (LOGICAL_OPERATOR comparison)*
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = comparison(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LOGICAL_OPERATOR comparison)*
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1", c)) break;
    }
    return true;
  }

  // LOGICAL_OPERATOR comparison
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LOGICAL_OPERATOR(b, l + 1);
    r = r && comparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary (MULTIPLICATION_OPERATOR primary)*
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = primary(b, l + 1);
    r = r && factor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (MULTIPLICATION_OPERATOR primary)*
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!factor_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factor_1", c)) break;
    }
    return true;
  }

  // MULTIPLICATION_OPERATOR primary
  private static boolean factor_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MULTIPLICATION_OPERATOR(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "if" "(" expression ")" block ("else" block)?
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = consumeToken(b, "if");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && block(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("else" block)?
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // "else" block
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  //           | IDENTIFIER
  //           | "(" expression ")"
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = NUMBER(b, l + 1);
    if (!r) r = IDENTIFIER(b, l + 1);
    if (!r) r = primary_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" expression ")"
  private static boolean primary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_list
  static boolean root(PsiBuilder b, int l) {
    return statement_list(b, l + 1);
  }

  /* ********************************************************** */
  // variable_declaration
  //             | assignment
  //             | while_loop
  //             | do_while_loop
  //             | if_statement
  //             | block
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = variable_declaration(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = while_loop(b, l + 1);
    if (!r) r = do_while_loop(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement*
  public static boolean statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, "<statement list>");
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_list", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // factor (ADDITION_OPERATOR factor)*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ADDITION_OPERATOR factor)*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // ADDITION_OPERATOR factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ADDITION_OPERATOR(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "var" IDENTIFIER ";"
  //             | "var" IDENTIFIER "=" expression ";"
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_0(b, l + 1);
    if (!r) r = variable_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "var" IDENTIFIER ";"
  private static boolean variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "var");
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // "var" IDENTIFIER "=" expression ";"
  private static boolean variable_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "var");
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "while" "(" expression ")" block
  public static boolean while_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_loop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_LOOP, "<while loop>");
    r = consumeToken(b, "while");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
