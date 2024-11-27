package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiRecursiveElementVisitor

class ATTPsiImplUtil {
    companion object {

        fun findVariableDeclaration(variableName: String, file: PsiFile): ATTVariableDeclaration? {
            var declaration: ATTVariableDeclaration? = null
            file.containingFile.accept(object : PsiRecursiveElementVisitor() {
                override fun visitElement(element: PsiElement) {
                    if (element is ATTVariableDeclaration
                        && element.identifier.text == variableName
                    ) {
                        declaration = element
                    }
                    super.visitElement(element) // Обход дочерних элементов
                }
            })
            return declaration
        }

    }

}