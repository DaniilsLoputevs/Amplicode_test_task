package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes.*
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypesManual
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType


class ATTSyntaxHighlighter : SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = ATTLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey> {
        return when (tokenType) {
            in ATTTokenSets.KEYWORDS -> Highlight.KEYWORD
            in ATTTokenSets.OPERATORS -> Highlight.OPERATORS
            NUMBER, NUMBER_LEAF -> Highlight.NUMBER
            TokenType.BAD_CHARACTER -> Highlight.BAD_CHARACTER
            ATTTypesManual.SEMICOLON -> Highlight.SEMICOLON
            IDENTIFIER, IDENTIFIER_LEAF -> Highlight.IDENTIFIER
            else -> Highlight.EMPTY
        }
    }

    object Highlight {
        val KEYWORD = arrayOf(DefaultLanguageHighlighterColors.KEYWORD)
        val OPERATORS = arrayOf(DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val NUMBER = arrayOf(DefaultLanguageHighlighterColors.NUMBER)
        val SEMICOLON = arrayOf(DefaultLanguageHighlighterColors.SEMICOLON)
        val IDENTIFIER = arrayOf(DefaultLanguageHighlighterColors.IDENTIFIER)
        val BAD_CHARACTER = arrayOf(createTextAttributesKey("ATT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER))
        val EMPTY = emptyArray<TextAttributesKey>()
    }

}
