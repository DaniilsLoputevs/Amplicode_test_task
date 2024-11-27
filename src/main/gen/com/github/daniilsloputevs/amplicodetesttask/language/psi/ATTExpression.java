// This is a generated file. Not intended for manual editing.
package com.github.daniilsloputevs.amplicodetesttask.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ATTExpression extends PsiElement {

  @NotNull
  List<ATTLogicalOperator> getLogicalOperatorList();

  @NotNull
  List<ATTComparison> getComparisonList();

}
