package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.github.daniilsloputevs.amplicodetesttask.language.ATTLanguage
import com.intellij.psi.tree.IElementType

class ATTTokenType(debugName : String): IElementType(debugName, ATTLanguage.INSTANCE) {
    override fun toString(): String = "ATTTokenType." + super.toString()
}