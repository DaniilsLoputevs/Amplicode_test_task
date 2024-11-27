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

public class ATTStatementImpl extends ASTWrapperPsiElement implements ATTStatement {

  public ATTStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ATTVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ATTVisitor) accept((ATTVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ATTAssignment getAssignment() {
    return findChildByClass(ATTAssignment.class);
  }

  @Override
  @Nullable
  public ATTBlock getBlock() {
    return findChildByClass(ATTBlock.class);
  }

  @Override
  @Nullable
  public ATTDoWhileLoop getDoWhileLoop() {
    return findChildByClass(ATTDoWhileLoop.class);
  }

  @Override
  @Nullable
  public ATTIfStatement getIfStatement() {
    return findChildByClass(ATTIfStatement.class);
  }

  @Override
  @Nullable
  public ATTVariableDeclaration getVariableDeclaration() {
    return findChildByClass(ATTVariableDeclaration.class);
  }

  @Override
  @Nullable
  public ATTWhileLoop getWhileLoop() {
    return findChildByClass(ATTWhileLoop.class);
  }

}
