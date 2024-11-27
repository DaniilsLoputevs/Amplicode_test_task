package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.parser.ATTLanguageParser
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class ATTParserDefinition : ParserDefinition {

    override fun createLexer(p0: Project?): Lexer = ATTLexerAdapter()

    override fun createParser(p0: Project?): PsiParser = ATTLanguageParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = ATTTokenSets.COMMENT_STUB

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode): PsiElement = ATTTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = ATTFile(viewProvider)

}

private val FILE: IFileElementType = IFileElementType(ATTLanguage.INSTANCE)