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
            in ATTTokenSets.KEYWORDS -> HIGHLIGHT_KEYWORD
            in ATTTokenSets.OPERATORS -> HIGHLIGHT_OPERATORS
            NUMBER, NUMBER_LEAF -> HIGHLIGHT_NUMBER
            TokenType.BAD_CHARACTER -> HIGHLIGHT_BAD_CHARACTER
            ATTTypesManual.SEMICOLON -> HIGHLIGHT_SEMICOLON
            IDENTIFIER, IDENTIFIER_LEAF -> HIGHLIGHT_IDENTIFIER
            else -> HIGHLIGHT_EMPTY
        }
    }
}

val HIGHLIGHT_KEYWORD = arrayOf(DefaultLanguageHighlighterColors.KEYWORD)
val HIGHLIGHT_OPERATORS = arrayOf(DefaultLanguageHighlighterColors.OPERATION_SIGN)
val HIGHLIGHT_NUMBER = arrayOf(DefaultLanguageHighlighterColors.NUMBER)
val HIGHLIGHT_SEMICOLON = arrayOf(DefaultLanguageHighlighterColors.SEMICOLON)
val HIGHLIGHT_IDENTIFIER = arrayOf(DefaultLanguageHighlighterColors.IDENTIFIER)
val HIGHLIGHT_BAD_CHARACTER = arrayOf(createTextAttributesKey("ATT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER))
val HIGHLIGHT_EMPTY = emptyArray<TextAttributesKey>()
