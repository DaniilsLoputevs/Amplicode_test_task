package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTIdentifier
import com.github.daniilsloputevs.amplicodetesttask.language.psi.impl.ATTIdentifierImpl
import com.intellij.openapi.util.TextRange
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext
import org.jetbrains.annotations.NotNull


class ATTReferenceContributor : PsiReferenceContributor() {
    override fun registerReferenceProviders(@NotNull registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement(ATTIdentifier::class.java),
            object : PsiReferenceProvider() {
                override fun getReferencesByElement(
                    @NotNull element: PsiElement,
                    @NotNull context: ProcessingContext
                ): Array<out PsiReference> {

                    return when (element) {
                        is ATTIdentifierImpl -> return element.references
                        else -> PsiReference.EMPTY_ARRAY
                    }

//                    val id = element as ATTIdentifierImpl
//                    return id.references
//                    val literalExpression: PsiLiteralExpression = element as PsiLiteralExpression
//                    val value = if (literalExpression.getValue() is String) literalExpression.getValue() else null
//                    if ((value != null && value.startsWith(SIMPLE_PREFIX_STR + SIMPLE_SEPARATOR_STR))) {
//                        val property: TextRange = TextRange(
//                            SIMPLE_PREFIX_STR.length() + SIMPLE_SEPARATOR_STR.length() + 1,
//                            value.length + 1
//                        )
//                        return arrayOf<PsiReference>(SimpleReference(element, property))
//                    }
//                    return PsiReference.EMPTY_ARRAY
                }
            })
    }
}