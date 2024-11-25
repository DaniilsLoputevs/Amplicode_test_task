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
        println("HL token type: $tokenType")
        return when (tokenType) {
            in ATTTokenSets.KEYWORDS -> HIGHLIGHT_KEYWORD
            in ATTTokenSets.OPERATORS -> HIGHLIGHT_OPERATORS
            NUMBER -> HIGHLIGHT_NUMBER
            COMMENT -> HIGHLIGHT_COMMENT
            TokenType.BAD_CHARACTER -> HIGHLIGHT_BAD_CHARACTER
            ATTTypesManual.SEMICOLON -> HIGHLIGHT_SEMICOLON
            IDENTIFIER -> HIGHLIGHT_IDENTIFIER
//            else -> when {
//                ATTTokenSets.KEYWORDS.contains(tokenType) -> HIGHLIGHT_KEYWORD
//                ATTTokenSets.OPERATORS.contains(tokenType)
                else -> {
//                    println("Unknown token type: $tokenType")
                    arrayOf()
                }
//            }

        }

    }
}

val HIGHLIGHT_KEYWORD = arrayOf(DefaultLanguageHighlighterColors.KEYWORD)
val HIGHLIGHT_OPERATORS = arrayOf(DefaultLanguageHighlighterColors.OPERATION_SIGN)
val HIGHLIGHT_NUMBER = arrayOf(DefaultLanguageHighlighterColors.NUMBER)
val HIGHLIGHT_SEMICOLON = arrayOf(DefaultLanguageHighlighterColors.SEMICOLON)
val HIGHLIGHT_COMMENT = arrayOf(DefaultLanguageHighlighterColors.LINE_COMMENT)
val HIGHLIGHT_IDENTIFIER = arrayOf(DefaultLanguageHighlighterColors.IDENTIFIER)
val HIGHLIGHT_BAD_CHARACTER = arrayOf(createTextAttributesKey("ATT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER))

//val SEPARATOR =
//    createTextAttributesKey("ATT_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
//val KEY = createTextAttributesKey("ATT_KEY", DefaultLanguageHighlighterColors.KEYWORD)
//val VALUE = createTextAttributesKey("ATT_VALUE", DefaultLanguageHighlighterColors.STRING)

//val COMMENT =
//    createTextAttributesKey("ATT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
//val HL_BAD_CHARACTER =
//    createTextAttributesKey("ATT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)


//val BAD_CHAR_KEYS: Array<TextAttributesKey> = arrayOf(HL_BAD_CHARACTER)
//val SEPARATOR_KEYS: Array<TextAttributesKey> = arrayOf(SEPARATOR)
//val KEY_KEYS: Array<TextAttributesKey> = arrayOf(KEY)
//val VALUE_KEYS: Array<TextAttributesKey> = arrayOf(VALUE)
//val COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(COMMENT)
//val EMPTY_KEYS: Array<TextAttributesKey?> = arrayOfNulls(0)