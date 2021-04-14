/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialVal#getValInternalInstruction <em>Val Internal Instruction</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialVal#getVals <em>Vals</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInitialVal()
 * @model
 * @generated
 */
public interface InitialVal extends InternalVals, LastJSONFinish
{
  /**
   * Returns the value of the '<em><b>Val Internal Instruction</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InternalInstructions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Internal Instruction</em>' containment reference list.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInitialVal_ValInternalInstruction()
   * @model containment="true"
   * @generated
   */
  EList<InternalInstructions> getValInternalInstruction();

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.StandardVal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInitialVal_Vals()
   * @model containment="true"
   * @generated
   */
  EList<StandardVal> getVals();

} // InitialVal
