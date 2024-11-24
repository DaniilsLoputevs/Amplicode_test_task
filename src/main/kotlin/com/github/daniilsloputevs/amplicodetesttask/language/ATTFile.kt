package com.github.daniilsloputevs.amplicodetesttask.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class ATTFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ATTLanguage.INSTANCE) {

    override fun getFileType(): FileType {
        return ATTFileType
    }

    override fun toString(): String {
        return "ATT File"
    }
}