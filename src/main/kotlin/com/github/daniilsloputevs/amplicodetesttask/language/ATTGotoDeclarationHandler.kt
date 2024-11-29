package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTPsiImplUtil
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes
import com.intellij.codeInsight.navigation.actions.GotoDeclarationHandler
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

class ATTGotoDeclarationHandler : GotoDeclarationHandler {

    override fun getGotoDeclarationTargets(
        sourceElement: PsiElement?,
        offset: Int,
        editor: Editor
    ): Array<PsiElement> {
        if (sourceElement == null) return PsiElement.EMPTY_ARRAY
        if (sourceElement.elementType != ATTTypes.IDENTIFIER_LEAF) return PsiElement.EMPTY_ARRAY
        return ATTPsiImplUtil
            .findVariableDeclaration(sourceElement.text, sourceElement.containingFile)
            ?.let { arrayOf(it.identifier) }
            ?: PsiElement.EMPTY_ARRAY
    }

    override fun getActionText(context: DataContext) = "GO TO DECLARATION"

}