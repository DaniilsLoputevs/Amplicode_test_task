package com.github.daniilsloputevs.amplicodetesttask.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object ATTFileType : LanguageFileType(ATTLanguage.INSTANCE) {
    override fun getName(): String = "ATT File"

    override fun getDescription(): String = "Amplicode test task language"

    override fun getDefaultExtension(): String = "att"

    override fun getIcon(): Icon = ATTIcons.FILE
}