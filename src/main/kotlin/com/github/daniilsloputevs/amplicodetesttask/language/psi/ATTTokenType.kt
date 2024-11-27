package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.github.daniilsloputevs.amplicodetesttask.language.ATTLanguage
import com.intellij.psi.tree.IElementType

/**
 * An IElementType subclass to be used for PSI tree leaves (tokens).
 */
open class ATTTokenType(debugName: String) : IElementType(debugName, ATTLanguage.INSTANCE) {
    override fun toString(): String = "ATT Leaf: " + super.toString()
}