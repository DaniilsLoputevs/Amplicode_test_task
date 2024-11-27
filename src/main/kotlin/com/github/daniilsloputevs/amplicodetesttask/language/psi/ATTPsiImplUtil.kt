package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.github.daniilsloputevs.amplicodetesttask.language.ATTFile
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiRecursiveElementVisitor

class ATTPsiImplUtil {

    companion object {
        fun findVariableDeclaration(variableName : String, file : PsiFile) : ATTVariableDeclaration? {
            var declaration : ATTVariableDeclaration? = null
            file.containingFile.accept(object : PsiRecursiveElementVisitor() {
                override fun visitElement(element: PsiElement) {
                    if (element is ATTVariableDeclaration
                        && element.identifier.text == variableName) {
                        declaration = element
                    }
                    super.visitElement(element) // Обход дочерних элементов
                }
            })
           return declaration
        }


        fun findAllVariablesInFile(containingFile: ATTFile): List<ATTVariableDeclaration> {
            println("findAllVariablesInFile")
//            val variables1: Array<Any> = PsiTreeUtil.getChildrenOfType(containingFile, ATTVariableDeclaration.class)
//            return PsiTreeUtil.getChildrenOfTypeAsList(containingFile, ATTVariableDeclaration::class.java)

            val variables = mutableListOf<ATTVariableDeclaration>()
            containingFile.accept(object : PsiRecursiveElementVisitor() {
                override fun visitElement(element: PsiElement) {
                    if (element is ATTVariableDeclaration) {
                        variables.add(element) // Если нашли переменную, добавляем её в список
                    }
                    super.visitElement(element) // Обход дочерних элементов
                }
            })


            return variables
        }
    }

}