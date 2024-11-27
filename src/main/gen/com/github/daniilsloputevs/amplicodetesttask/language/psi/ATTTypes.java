// This is a generated file. Not intended for manual editing.
package com.github.daniilsloputevs.amplicodetesttask.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.daniilsloputevs.amplicodetesttask.language.psi.impl.*;

public interface ATTTypes {

  IElementType ADDITION_OPERATOR = new ATTElementType("ADDITION_OPERATOR");
  IElementType ASSIGNMENT = new ATTElementType("ASSIGNMENT");
  IElementType BLOCK = new ATTElementType("BLOCK");
  IElementType COMPARISON = new ATTElementType("COMPARISON");
  IElementType COMPARISON_OPERATOR = new ATTElementType("COMPARISON_OPERATOR");
  IElementType DO_WHILE_LOOP = new ATTElementType("DO_WHILE_LOOP");
  IElementType EXPRESSION = new ATTElementType("EXPRESSION");
  IElementType FACTOR = new ATTElementType("FACTOR");
  IElementType IDENTIFIER = new ATTElementType("IDENTIFIER");
  IElementType IF_STATEMENT = new ATTElementType("IF_STATEMENT");
  IElementType LOGICAL_OPERATOR = new ATTElementType("LOGICAL_OPERATOR");
  IElementType MULTIPLICATION_OPERATOR = new ATTElementType("MULTIPLICATION_OPERATOR");
  IElementType NUMBER = new ATTElementType("NUMBER");
  IElementType PRIMARY = new ATTElementType("PRIMARY");
  IElementType STATEMENT = new ATTElementType("STATEMENT");
  IElementType STATEMENT_LIST = new ATTElementType("STATEMENT_LIST");
  IElementType TERM = new ATTElementType("TERM");
  IElementType VARIABLE_DECLARATION = new ATTElementType("VARIABLE_DECLARATION");
  IElementType WHILE_LOOP = new ATTElementType("WHILE_LOOP");

  IElementType IDENTIFIER_LEAF = new ATTTokenType("IDENTIFIER_LEAF");
  IElementType NUMBER_LEAF = new ATTTokenType("NUMBER_LEAF");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITION_OPERATOR) {
        return new ATTAdditionOperatorImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new ATTAssignmentImpl(node);
      }
      else if (type == BLOCK) {
        return new ATTBlockImpl(node);
      }
      else if (type == COMPARISON) {
        return new ATTComparisonImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new ATTComparisonOperatorImpl(node);
      }
      else if (type == DO_WHILE_LOOP) {
        return new ATTDoWhileLoopImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ATTExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new ATTFactorImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new ATTIdentifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new ATTIfStatementImpl(node);
      }
      else if (type == LOGICAL_OPERATOR) {
        return new ATTLogicalOperatorImpl(node);
      }
      else if (type == MULTIPLICATION_OPERATOR) {
        return new ATTMultiplicationOperatorImpl(node);
      }
      else if (type == NUMBER) {
        return new ATTNumberImpl(node);
      }
      else if (type == PRIMARY) {
        return new ATTPrimaryImpl(node);
      }
      else if (type == STATEMENT) {
        return new ATTStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new ATTStatementListImpl(node);
      }
      else if (type == TERM) {
        return new ATTTermImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new ATTVariableDeclarationImpl(node);
      }
      else if (type == WHILE_LOOP) {
        return new ATTWhileLoopImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
