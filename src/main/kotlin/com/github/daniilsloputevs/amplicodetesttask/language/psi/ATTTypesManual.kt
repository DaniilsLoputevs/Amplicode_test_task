package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.intellij.psi.tree.IElementType

/**
 * ToolKit не генерирует ElementType для констант, их приходиться прописывать ручками
 * Без @[JvmField] генератор не видит поля, считает их приватными
 */
object ATTTypesManual {
    @JvmField val OPEN_PARENTHESIS: IElementType = ATTTokenType("OPEN_PARENTHESIS")
    @JvmField val CLOSE_PARENTHESIS: IElementType = ATTTokenType("CLOSE_PARENTHESIS")
    @JvmField val BLOCK_OPEN: IElementType = ATTTokenType("BLOCK_OPEN")
    @JvmField val BLOCK_CLOSE: IElementType = ATTTokenType("BLOCK_CLOSE")
    @JvmField val ELSE_STATEMENT: IElementType = ATTTokenType("ELSE_STATEMENT")
    @JvmField val SEMICOLON: IElementType = ATTTokenType("SEMICOLON")
    @JvmField val ASSIGN: IElementType = ATTTokenType("ASSIGN")
    @JvmField val LOGICAL_OPERATOR_KEYWORD: IElementType = ATTTokenType("LOGICAL_OPERATOR_KEYWORD")
    @JvmField val LOGICAL_OPERATOR_SIGN: IElementType = ATTTokenType("LOGICAL_OPERATOR_SIGN")
}