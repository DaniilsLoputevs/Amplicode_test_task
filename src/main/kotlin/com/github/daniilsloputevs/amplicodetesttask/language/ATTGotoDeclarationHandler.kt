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
    ): Array<PsiElement>? {
        println("ATTGotoDeclarationHandler.getGotoDeclarationTargets(sourceElement=$sourceElement, offset=$offset)")
        if (sourceElement == null) return null
        if (sourceElement.elementType != ATTTypes.IDENTIFIER_LEAF) return null
        return ATTPsiImplUtil
            .findVariableDeclaration(sourceElement.text, sourceElement.containingFile)
            ?.let { arrayOf(it.identifier) }
            ?: emptyArray()


//        return emptyArray()


//        println("ATTGotoDeclarationHandler.getGotoDeclarationTargets=> type=${sourceElement.elementType}")
//        println("ATTGotoDeclarationHandler.getGotoDeclarationTargets=> text=${sourceElement.text}")
//        println("ATTGotoDeclarationHandler.getGotoDeclarationTargets")
//        if (sourceElement.elementType == ATTTypes.IDENTIFIER_LEAF) {
////            val rsl = mutableListOf<ResolveResult>()
//            return ATTPsiImplUtil
//                .findAllVariablesInFile(sourceElement.containingFile as ATTFile)
//                .filter { it.identifier.text == sourceElement.text }
//                .map { it.identifier }
//                .toTypedArray()
////                .forEach {rsl + PsiElementResolveResult(it)  }
////                .map { PsiElementResolveResult(it)  }
////                .map { it. }
////                .map { it..resolve() }
////            return rsl.toTypedArray()
//        }
////        if (sourceElement is ATTVariableDeclaration) {
////            println("ATTGotoDeclarationHandler.getGotoDeclarationTargets => is var")
////            return sourceElement.references.mapNotNull { it.resolve() }.toTypedArray()
////        }
//        return null
    }

    override fun getActionText(context: DataContext) = "Go to declaration"

}