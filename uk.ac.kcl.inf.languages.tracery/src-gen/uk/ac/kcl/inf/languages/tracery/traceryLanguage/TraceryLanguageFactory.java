/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage
 * @generated
 */
public interface TraceryLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceryLanguageFactory eINSTANCE = uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Tracery Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tracery Program</em>'.
   * @generated
   */
  TraceryProgram createTraceryProgram();

  /**
   * Returns a new object of class '<em>First JSON Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>First JSON Statements</em>'.
   * @generated
   */
  FirstJSONStatements createFirstJSONStatements();

  /**
   * Returns a new object of class '<em>First JSON Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>First JSON Finish</em>'.
   * @generated
   */
  FirstJSONFinish createFirstJSONFinish();

  /**
   * Returns a new object of class '<em>Initial Val</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial Val</em>'.
   * @generated
   */
  InitialVal createInitialVal();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Internal Instructions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Instructions</em>'.
   * @generated
   */
  InternalInstructions createInternalInstructions();

  /**
   * Returns a new object of class '<em>Internal Vals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Vals</em>'.
   * @generated
   */
  InternalVals createInternalVals();

  /**
   * Returns a new object of class '<em>Last JSON Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Last JSON Finish</em>'.
   * @generated
   */
  LastJSONFinish createLastJSONFinish();

  /**
   * Returns a new object of class '<em>Last JSON Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Last JSON Statement</em>'.
   * @generated
   */
  LastJSONStatement createLastJSONStatement();

  /**
   * Returns a new object of class '<em>Standard Val</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Val</em>'.
   * @generated
   */
  StandardVal createStandardVal();

  /**
   * Returns a new object of class '<em>String Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Declaration</em>'.
   * @generated
   */
  StringDeclaration createStringDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TraceryLanguagePackage getTraceryLanguagePackage();

} //TraceryLanguageFactory
