package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes.*
import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypesManual
import com.intellij.psi.tree.TokenSet

interface ATTTokenSets {
    companion object {

        val KEYWORDS = TokenSet.create(
            VARIABLE_DECLARATION,
            WHILE_LOOP, DO_WHILE_LOOP,
            IF_STATEMENT,
            ATTTypesManual.ELSE_STATEMENT,
            ATTTypesManual.LOGICAL_OPERATOR_KEYWORD
        )
        val COMMENT_STUB = TokenSet.create()
        val OPERATORS = TokenSet.create(
            ADDITION_OPERATOR,
            COMPARISON_OPERATOR,
            LOGICAL_OPERATOR,
            MULTIPLICATION_OPERATOR,
        )
    }
}