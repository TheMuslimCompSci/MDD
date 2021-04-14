/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracery Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getTraceryProgram()
 * @model
 * @generated
 */
public interface TraceryProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.Instruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getTraceryProgram_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // TraceryProgram
