// This is a generated file. Not intended for manual editing.
package com.github.daniilsloputevs.amplicodetesttask.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.daniilsloputevs.amplicodetesttask.language.psi.ATTTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.daniilsloputevs.amplicodetesttask.language.psi.*;

public class ATTFactorImpl extends ASTWrapperPsiElement implements ATTFactor {

  public ATTFactorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ATTVisitor visitor) {
    visitor.visitFactor(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ATTVisitor) accept((ATTVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ATTMultiplicationOperator> getMultiplicationOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ATTMultiplicationOperator.class);
  }

  @Override
  @NotNull
  public List<ATTPrimary> getPrimaryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ATTPrimary.class);
  }

}
