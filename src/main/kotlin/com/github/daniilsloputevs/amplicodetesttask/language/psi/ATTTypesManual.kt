package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.intellij.psi.tree.IElementType

/**
 * ToolKit не генерирует ElementType для констант, их приходиться прописывать ручками
 * Без @[JvmField] генератор не видит поля, считает их приватными
 */
object ATTTypesManual {
    @JvmField val OPEN_PARENTHESIS: IElementType = ATTElementType("OPEN_PARENTHESIS")
    @JvmField val CLOSE_PARENTHESIS: IElementType = ATTElementType("CLOSE_PARENTHESIS")
    @JvmField val BLOCK_OPEN: IElementType = ATTElementType("BLOCK_OPEN")
    @JvmField val BLOCK_CLOSE: IElementType = ATTElementType("BLOCK_CLOSE")
    @JvmField val ELSE_STATEMENT: IElementType = ATTElementType("ELSE_STATEMENT")
    @JvmField val SEMICOLON: IElementType = ATTElementType("SEMICOLON")
    @JvmField val ASSIGN: IElementType = ATTElementType("ASSIGN")
    @JvmField val LOGICAL_OPERATOR_KEYWORD: IElementType = ATTElementType("LOGICAL_OPERATOR_KEYWORD")
}