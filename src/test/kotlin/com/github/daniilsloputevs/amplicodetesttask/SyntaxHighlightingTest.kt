package com.github.daniilsloputevs.amplicodetesttask

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class SyntaxHighlightingTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/"

    fun testHighlighting() {
        myFixture.configureByFile("highlight.att")
        myFixture.checkHighlighting(true, false, true)
    }
}