/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.scoping;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONExpression;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDeclaration;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class TraceryLanguageScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_InitialJSONExpression_var(final InitialJSONExpression context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final TraceryProgram containingTraceryProgram = EcoreUtil2.<TraceryProgram>getContainerOfType(context, TraceryProgram.class);
      IScope _xifexpression = null;
      if ((containingTraceryProgram != null)) {
        _xifexpression = this.visibleVariablesScope(containingTraceryProgram);
      } else {
        IScope _xblockexpression_1 = null;
        {
          final TraceryProgram containingProgram = EcoreUtil2.<TraceryProgram>getContainerOfType(context, TraceryProgram.class);
          _xblockexpression_1 = Scopes.scopeFor(Iterables.<VariableDeclaration>filter(containingProgram.getInstructions(), VariableDeclaration.class));
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public IScope visibleVariablesScope(final EObject context) {
    IScope _xifexpression = null;
    if ((context instanceof TraceryProgram)) {
      _xifexpression = Scopes.scopeFor(Iterables.<VariableDeclaration>filter(((TraceryProgram)context).getInstructions(), VariableDeclaration.class));
    }
    return _xifexpression;
  }
}
