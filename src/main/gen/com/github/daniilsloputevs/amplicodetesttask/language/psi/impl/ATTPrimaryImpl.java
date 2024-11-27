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

public class ATTPrimaryImpl extends ASTWrapperPsiElement implements ATTPrimary {

  public ATTPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ATTVisitor visitor) {
    visitor.visitPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ATTVisitor) accept((ATTVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ATTIdentifier getIdentifier() {
    return findChildByClass(ATTIdentifier.class);
  }

  @Override
  @Nullable
  public ATTNumber getNumber() {
    return findChildByClass(ATTNumber.class);
  }

  @Override
  @Nullable
  public ATTExpression getExpression() {
    return findChildByClass(ATTExpression.class);
  }

}
