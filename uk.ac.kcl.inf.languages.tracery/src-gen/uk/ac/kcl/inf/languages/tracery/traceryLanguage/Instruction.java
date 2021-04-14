/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.Instruction#getFirstInstruction <em>First Instruction</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.Instruction#getLastInstruction <em>Last Instruction</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>First Instruction</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.FirstJSONStatements}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Instruction</em>' containment reference list.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInstruction_FirstInstruction()
   * @model containment="true"
   * @generated
   */
  EList<FirstJSONStatements> getFirstInstruction();

  /**
   * Returns the value of the '<em><b>Last Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Instruction</em>' containment reference.
   * @see #setLastInstruction(LastJSONStatement)
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInstruction_LastInstruction()
   * @model containment="true"
   * @generated
   */
  LastJSONStatement getLastInstruction();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.Instruction#getLastInstruction <em>Last Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Instruction</em>' containment reference.
   * @see #getLastInstruction()
   * @generated
   */
  void setLastInstruction(LastJSONStatement value);

} // Instruction