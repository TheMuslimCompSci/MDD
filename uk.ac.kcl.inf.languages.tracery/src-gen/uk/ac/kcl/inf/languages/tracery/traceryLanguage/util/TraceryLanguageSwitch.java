/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage
 * @generated
 */
public class TraceryLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TraceryLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceryLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TraceryLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TraceryLanguagePackage.TRACERY_PROGRAM:
      {
        TraceryProgram traceryProgram = (TraceryProgram)theEObject;
        T result = caseTraceryProgram(traceryProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.FIRST_JSON_STATEMENTS:
      {
        FirstJSONStatements firstJSONStatements = (FirstJSONStatements)theEObject;
        T result = caseFirstJSONStatements(firstJSONStatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.FIRST_JSON_FINISH:
      {
        FirstJSONFinish firstJSONFinish = (FirstJSONFinish)theEObject;
        T result = caseFirstJSONFinish(firstJSONFinish);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.INITIAL_VAL:
      {
        InitialVal initialVal = (InitialVal)theEObject;
        T result = caseInitialVal(initialVal);
        if (result == null) result = caseInternalVals(initialVal);
        if (result == null) result = caseLastJSONFinish(initialVal);
        if (result == null) result = caseFirstJSONFinish(initialVal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.INTERNAL_INSTRUCTIONS:
      {
        InternalInstructions internalInstructions = (InternalInstructions)theEObject;
        T result = caseInternalInstructions(internalInstructions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.INTERNAL_VALS:
      {
        InternalVals internalVals = (InternalVals)theEObject;
        T result = caseInternalVals(internalVals);
        if (result == null) result = caseFirstJSONFinish(internalVals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.LAST_JSON_FINISH:
      {
        LastJSONFinish lastJSONFinish = (LastJSONFinish)theEObject;
        T result = caseLastJSONFinish(lastJSONFinish);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.LAST_JSON_STATEMENT:
      {
        LastJSONStatement lastJSONStatement = (LastJSONStatement)theEObject;
        T result = caseLastJSONStatement(lastJSONStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.STANDARD_VAL:
      {
        StandardVal standardVal = (StandardVal)theEObject;
        T result = caseStandardVal(standardVal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.STRING_DECLARATION:
      {
        StringDeclaration stringDeclaration = (StringDeclaration)theEObject;
        T result = caseStringDeclaration(stringDeclaration);
        if (result == null) result = caseInternalInstructions(stringDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TraceryLanguagePackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseInternalInstructions(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tracery Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tracery Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceryProgram(TraceryProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>First JSON Statements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>First JSON Statements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirstJSONStatements(FirstJSONStatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>First JSON Finish</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>First JSON Finish</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirstJSONFinish(FirstJSONFinish object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Val</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Val</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialVal(InitialVal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Instructions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Instructions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalInstructions(InternalInstructions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Vals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Vals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalVals(InternalVals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Last JSON Finish</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Last JSON Finish</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLastJSONFinish(LastJSONFinish object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Last JSON Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Last JSON Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLastJSONStatement(LastJSONStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Standard Val</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Standard Val</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStandardVal(StandardVal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringDeclaration(StringDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TraceryLanguageSwitch
