package com.github.daniilsloputevs.amplicodetesttask.language

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes
import com.intellij.psi.tree.TokenSet

interface ATTTokenSets {
    companion object {
        val ADDITION_OPERATOR = TokenSet.create(ATTTypes.ADDITION_OPERATOR)
        val ASSIGNMENT = TokenSet.create(ATTTypes.ASSIGNMENT)
        val BLOCK = TokenSet.create(ATTTypes.BLOCK)
        val COMMENT = TokenSet.create(ATTTypes.COMMENT)
        val COMPARISON = TokenSet.create(ATTTypes.COMPARISON)
        val COMPARISON_OPERATOR = TokenSet.create(ATTTypes.COMPARISON_OPERATOR)
        val DO_WHILE_LOOP = TokenSet.create(ATTTypes.DO_WHILE_LOOP)
        val EXPRESSION = TokenSet.create(ATTTypes.EXPRESSION)
        val FACTOR = TokenSet.create(ATTTypes.FACTOR)
        val IDENTIFIER = TokenSet.create(ATTTypes.IDENTIFIER)
        val IF_STATEMENT = TokenSet.create(ATTTypes.IF_STATEMENT)
        val LOGICAL_OPERATOR = TokenSet.create(ATTTypes.LOGICAL_OPERATOR)
        val MULTIPLICATION_OPERATOR = TokenSet.create(ATTTypes.MULTIPLICATION_OPERATOR)
        val NUMBER = TokenSet.create(ATTTypes.NUMBER)
        val PRIMARY = TokenSet.create(ATTTypes.PRIMARY)
        val STATEMENT = TokenSet.create(ATTTypes.STATEMENT)
        val STATEMENT_LIST = TokenSet.create(ATTTypes.STATEMENT_LIST)
        val TERM = TokenSet.create(ATTTypes.TERM)
        val VARIABLE_DECLARATION = TokenSet.create(ATTTypes.VARIABLE_DECLARATION)
        val VARIABLE_DECLARATION_AND_INIT = TokenSet.create(ATTTypes.VARIABLE_DECLARATION_AND_INIT)
        val WHILE_LOOP = TokenSet.create(ATTTypes.WHILE_LOOP)




//        val IDENTIFIER = TokenSet.create(ATTTypes.IDENTIFIER)
//        val EXPRESSION = TokenSet.create(ATTTypes.EXPRESSION)
//        val BLOCK = TokenSet.create(ATTTypes.BLOCK)
//        val NUMBER = TokenSet.create(ATTTypes.NUMBER)
//        val PRIMARY = TokenSet.create(ATTTypes.PRIMARY)
//        val WHILE_LOOP = TokenSet.create(ATTTypes.WHILE_LOOP)
//        val COMMENT = TokenSet.create(ATTTypes.COMMENT)
    }
}