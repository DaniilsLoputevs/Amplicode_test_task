package com.github.daniilsloputevs.amplicodetesttask

import com.intellij.codeInsight.completion.CompletionType
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AutoCompleteTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/"

    fun testVariableCompletion() {
        myFixture.configureByFile("auto-complete.att")
        myFixture.complete(CompletionType.BASIC)
        val variants = myFixture.lookupElementStrings
        assertNotNull(variants)
        assertContainsElements(variants!!, "varName", "anotherVar")
    }
}