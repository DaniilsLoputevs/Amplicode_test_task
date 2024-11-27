// This is a generated file. Not intended for manual editing.
package com.github.daniilsloputevs.amplicodetesttask.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ATTStatement extends PsiElement {

  @Nullable
  ATTAssignment getAssignment();

  @Nullable
  ATTBlock getBlock();

  @Nullable
  ATTDoWhileLoop getDoWhileLoop();

  @Nullable
  ATTIfStatement getIfStatement();

  @Nullable
  ATTVariableDeclaration getVariableDeclaration();

  @Nullable
  ATTWhileLoop getWhileLoop();

}
