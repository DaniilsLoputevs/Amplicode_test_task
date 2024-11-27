package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTVariableDeclaration
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiRecursiveElementVisitor
import com.intellij.util.ProcessingContext


class ATTCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(),
            VariableCompletionProvider()
        )

        extend(
            CompletionType.BASIC, PlatformPatterns.psiElement(),
            object : CompletionProvider<CompletionParameters>() {
                public override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    KEYWORDS_SUGGESTIONS.forEach { keyword ->
                        resultSet.addElement(LookupElementBuilder.create(keyword)) }
                }
            }
        )
    }

}

class VariableCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        collectVariablesNames(parameters.originalFile, parameters.position)
            .forEach { result.addElement(LookupElementBuilder.create(it)) }
    }

    private fun collectVariablesNames(scope: PsiFile, position: PsiElement): List<String> {
        val variablesNames = mutableListOf<String>()
        scope.accept(object : PsiRecursiveElementVisitor() {
            override fun visitElement(element: PsiElement) {
                if (element is ATTVariableDeclaration && element.textOffset < position.textOffset) {
                    variablesNames.add(element.identifier.text)
                }
                super.visitElement(element)
            }
        })
        return variablesNames
    }

}

private val KEYWORDS_SUGGESTIONS = listOf("if", "while", "do")