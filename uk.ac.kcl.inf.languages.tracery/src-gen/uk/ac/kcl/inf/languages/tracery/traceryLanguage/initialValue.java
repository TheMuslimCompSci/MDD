/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>initial Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.initialValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getinitialValue()
 * @model
 * @generated
 */
public interface initialValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InternalInstruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getinitialValue_Value()
   * @model containment="true"
   * @generated
   */
  EList<InternalInstruction> getValue();

} // initialValue
