package com.github.daniilsloputevs.amplicodetesttask.language.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*


class ATTVariableReference(
    val target: ATTIdentifier,
//    val variableName: String,
//    variableElement: ATTVariableDeclaration,
    textRange: TextRange = target.textRange,
//    val variableName: String = variableElement.identifier.text
//    val variableName: String = variableElement.identifier.text
) :
    PsiReferenceBase<ATTIdentifier>(target, textRange) {

    override fun resolve(): PsiElement {
        println("ATTVariableReference.resolve()")
        return target
    }
//
//    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
//        TODO("Not yet implemented")
//    }

//    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
//        println("ATTVariableReference.multiResolve(incompleteCode=$incompleteCode)")
//        val variables = ATTPsiImplUtil.findAllVariablesInFile(element.containingFile as ATTFile)
//            .filter { it.name == variableName }
//        val rsl = mutableListOf<ResolveResult>()
//        val rsl2 = variables.map { rsl += PsiElementResolveResult(it) }
////        val rsl2 = variables.map { PsiElementResolveResult(it) }.toTypedArray()
//        return rsl.toTypedArray()
////        val rsl = variables.map { LookupElementBuilder.create(it) }
//
////        val project: Project = myElement.project
////        val properties: List<SimpleProperty> = SimpleUtil.findProperties(project, key)
////        val results: MutableList<ResolveResult> = ArrayList()
////        for (property in properties) {
////            results.add(PsiElementResolveResult(property))
////        }
////        return results.toTypedArray<ResolveResult>()
//    }

//    @Nullable override fun resolve(): PsiElement? {
//        println("ATTVariableReference.resolve()")
//        val resolveResults: Array<ResolveResult> = multiResolve(false)
//        return if (resolveResults.size == 1) resolveResults[0].element else null
//    }

//    override fun getVariants(): Array<Any> {
//        println("ATTVariableReference.variants()")
//        val variables = ATTPsiImplUtil.findAllVariablesInFile(element.containingFile as ATTFile)
//        val rsl = mutableListOf<ResolveResult>()
////        val rsl2 = variables.map { rsl +=PsiElementResolveResult(it) }
////        val rsl2 = variables.map { PsiElementResolveResult(it) }.toTypedArray()
//        return variables.map { variable ->
//            LookupElementBuilder
//                .create(variable)
//                .withIcon(ATTIcons.FILE)
////                .withTypeText(it.elementType.toString())
//                .withTypeText("var:${variable.containingFile.name}")
//        }.toTypedArray()
//
//
////        val project: Project = myElement.project
////        val properties: List<SimpleProperty> = SimpleUtil.findProperties(project)
////        val variants: MutableList<LookupElement> = ArrayList()
////        for (property in properties) {
////            if (property.getKey() != null && !property.getKey().isEmpty()) {
////                variants.add(
////                    LookupElementBuilder
////                        .create(property).withIcon(SimpleIcons.FILE)
////                        .withTypeText(property.getContainingFile().getName())
////                )
////            }
////        }
////        return variants.toTypedArray()
//    }
}