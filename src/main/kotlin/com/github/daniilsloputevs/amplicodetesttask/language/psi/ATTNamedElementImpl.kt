package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference


abstract class ATTNamedElementImpl(node: ASTNode)
    : ATTNamedElement, ASTWrapperPsiElement(node) {

     override fun setName(name: String): PsiElement {
         println("ATTNamedElementImpl.setName(name=$name)")
         return this
     }

     override fun getNameIdentifier(): PsiElement {
         println("ATTNamedElementImpl.getNameIdentifier => node.toString()=${node.toString()}")
         println("ATTNamedElementImpl.getNameIdentifier => node.text=${node.text}")
         println("ATTNamedElementImpl.getNameIdentifier => this::class=${this::class}")
//         if  (this is ATTVariableDeclaration) {
//             println("ATTNamedElementImpl.getReferences => this is var_dec | text=${varName}")
//             return this.identifier
//         }
         return this
     }

     override fun getReferences(): Array<PsiReference> {
         println("ATTNamedElementImpl.getReferences => node::class=${node.javaClass}")
         println("ATTNamedElementImpl.getReferences => this::class=${this.javaClass}")
         return when (this) {
             is ATTIdentifier ->
                 ATTPsiImplUtil.findVariableDeclaration(super.getNode().text, super.getContainingFile())
                     ?.let {  arrayOf(ATTVariableReference(it.identifier))}
                     ?: PsiReference.EMPTY_ARRAY
             else -> PsiReference.EMPTY_ARRAY
         }
//         if (this is ATTVariableDeclaration) {
//             println("ATTNamedElementImpl.getReferences => is var")
//             return arrayOf(ATTVariableReference(this, TextRange(0, varName.length))) // TODO: TextRange(0, 0)
//         }
//         return arrayOf()
     }

//    private val variableName : String = this.node.text
//    private val varName : String = if (this is ATTVariableDeclaration) this.identifier.text else ""
 }