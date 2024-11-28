package com.github.daniilsloputevs.amplicodetesttask

import com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTIdentifier
import com.intellij.codeInsight.navigation.actions.GotoDeclarationAction
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class GoToDeclarationTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/"

    fun testGoToDeclaration() {
        myFixture.configureByFile("go-to-declaration.att")
        val target = GotoDeclarationAction.findTargetElement(project, myFixture.editor, myFixture.caretOffset)
        assertNotNull(target)
        assertEquals("varName", (target as ATTIdentifier).text)
    }
}