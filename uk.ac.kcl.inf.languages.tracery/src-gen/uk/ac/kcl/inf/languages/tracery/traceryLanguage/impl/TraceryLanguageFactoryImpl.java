/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceryLanguageFactoryImpl extends EFactoryImpl implements TraceryLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TraceryLanguageFactory init()
  {
    try
    {
      TraceryLanguageFactory theTraceryLanguageFactory = (TraceryLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(TraceryLanguagePackage.eNS_URI);
      if (theTraceryLanguageFactory != null)
      {
        return theTraceryLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TraceryLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceryLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TraceryLanguagePackage.TRACERY_PROGRAM: return createTraceryProgram();
      case TraceryLanguagePackage.FIRST_JSON_STATEMENTS: return createFirstJSONStatements();
      case TraceryLanguagePackage.FIRST_JSON_FINISH: return createFirstJSONFinish();
      case TraceryLanguagePackage.INITIAL_VAL: return createInitialVal();
      case TraceryLanguagePackage.INSTRUCTION: return createInstruction();
      case TraceryLanguagePackage.INTERNAL_INSTRUCTIONS: return createInternalInstructions();
      case TraceryLanguagePackage.INTERNAL_VALS: return createInternalVals();
      case TraceryLanguagePackage.LAST_JSON_FINISH: return createLastJSONFinish();
      case TraceryLanguagePackage.LAST_JSON_STATEMENT: return createLastJSONStatement();
      case TraceryLanguagePackage.STANDARD_VAL: return createStandardVal();
      case TraceryLanguagePackage.STRING_DECLARATION: return createStringDeclaration();
      case TraceryLanguagePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraceryProgram createTraceryProgram()
  {
    TraceryProgramImpl traceryProgram = new TraceryProgramImpl();
    return traceryProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FirstJSONStatements createFirstJSONStatements()
  {
    FirstJSONStatementsImpl firstJSONStatements = new FirstJSONStatementsImpl();
    return firstJSONStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FirstJSONFinish createFirstJSONFinish()
  {
    FirstJSONFinishImpl firstJSONFinish = new FirstJSONFinishImpl();
    return firstJSONFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitialVal createInitialVal()
  {
    InitialValImpl initialVal = new InitialValImpl();
    return initialVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InternalInstructions createInternalInstructions()
  {
    InternalInstructionsImpl internalInstructions = new InternalInstructionsImpl();
    return internalInstructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InternalVals createInternalVals()
  {
    InternalValsImpl internalVals = new InternalValsImpl();
    return internalVals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LastJSONFinish createLastJSONFinish()
  {
    LastJSONFinishImpl lastJSONFinish = new LastJSONFinishImpl();
    return lastJSONFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LastJSONStatement createLastJSONStatement()
  {
    LastJSONStatementImpl lastJSONStatement = new LastJSONStatementImpl();
    return lastJSONStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StandardVal createStandardVal()
  {
    StandardValImpl standardVal = new StandardValImpl();
    return standardVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringDeclaration createStringDeclaration()
  {
    StringDeclarationImpl stringDeclaration = new StringDeclarationImpl();
    return stringDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraceryLanguagePackage getTraceryLanguagePackage()
  {
    return (TraceryLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TraceryLanguagePackage getPackage()
  {
    return TraceryLanguagePackage.eINSTANCE;
  }

} //TraceryLanguageFactoryImpl
