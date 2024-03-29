/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.FirstJSONFinish;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.FirstJSONStatements;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialVal;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.Instruction;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InternalInstructions;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InternalVals;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.LastJSONFinish;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.LastJSONStatement;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StandardVal;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StringDeclaration;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguageFactory;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceryLanguagePackageImpl extends EPackageImpl implements TraceryLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceryProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass firstJSONStatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass firstJSONFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialValEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalInstructionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalValsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lastJSONFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lastJSONStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass standardValEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TraceryLanguagePackageImpl()
  {
    super(eNS_URI, TraceryLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TraceryLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TraceryLanguagePackage init()
  {
    if (isInited) return (TraceryLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(TraceryLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTraceryLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TraceryLanguagePackageImpl theTraceryLanguagePackage = registeredTraceryLanguagePackage instanceof TraceryLanguagePackageImpl ? (TraceryLanguagePackageImpl)registeredTraceryLanguagePackage : new TraceryLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTraceryLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theTraceryLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTraceryLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TraceryLanguagePackage.eNS_URI, theTraceryLanguagePackage);
    return theTraceryLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTraceryProgram()
  {
    return traceryProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTraceryProgram_Instructions()
  {
    return (EReference)traceryProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFirstJSONStatements()
  {
    return firstJSONStatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFirstJSONStatements_Name()
  {
    return (EAttribute)firstJSONStatementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFirstJSONStatements_Value()
  {
    return (EReference)firstJSONStatementsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFirstJSONFinish()
  {
    return firstJSONFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitialVal()
  {
    return initialValEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialVal_ValInternalInstruction()
  {
    return (EReference)initialValEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialVal_Vals()
  {
    return (EReference)initialValEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInstruction_FirstInstruction()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInstruction_LastInstruction()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInternalInstructions()
  {
    return internalInstructionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInternalVals()
  {
    return internalValsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLastJSONFinish()
  {
    return lastJSONFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLastJSONStatement()
  {
    return lastJSONStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLastJSONStatement_Value()
  {
    return (EReference)lastJSONStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStandardVal()
  {
    return standardValEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStandardVal_ValInternalInstruction()
  {
    return (EReference)standardValEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringDeclaration()
  {
    return stringDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStringDeclaration_Value()
  {
    return (EAttribute)stringDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariableDeclaration_Variable()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraceryLanguageFactory getTraceryLanguageFactory()
  {
    return (TraceryLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    traceryProgramEClass = createEClass(TRACERY_PROGRAM);
    createEReference(traceryProgramEClass, TRACERY_PROGRAM__INSTRUCTIONS);

    firstJSONStatementsEClass = createEClass(FIRST_JSON_STATEMENTS);
    createEAttribute(firstJSONStatementsEClass, FIRST_JSON_STATEMENTS__NAME);
    createEReference(firstJSONStatementsEClass, FIRST_JSON_STATEMENTS__VALUE);

    firstJSONFinishEClass = createEClass(FIRST_JSON_FINISH);

    initialValEClass = createEClass(INITIAL_VAL);
    createEReference(initialValEClass, INITIAL_VAL__VAL_INTERNAL_INSTRUCTION);
    createEReference(initialValEClass, INITIAL_VAL__VALS);

    instructionEClass = createEClass(INSTRUCTION);
    createEReference(instructionEClass, INSTRUCTION__FIRST_INSTRUCTION);
    createEReference(instructionEClass, INSTRUCTION__LAST_INSTRUCTION);

    internalInstructionsEClass = createEClass(INTERNAL_INSTRUCTIONS);

    internalValsEClass = createEClass(INTERNAL_VALS);

    lastJSONFinishEClass = createEClass(LAST_JSON_FINISH);

    lastJSONStatementEClass = createEClass(LAST_JSON_STATEMENT);
    createEReference(lastJSONStatementEClass, LAST_JSON_STATEMENT__VALUE);

    standardValEClass = createEClass(STANDARD_VAL);
    createEReference(standardValEClass, STANDARD_VAL__VAL_INTERNAL_INSTRUCTION);

    stringDeclarationEClass = createEClass(STRING_DECLARATION);
    createEAttribute(stringDeclarationEClass, STRING_DECLARATION__VALUE);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    initialValEClass.getESuperTypes().add(this.getInternalVals());
    initialValEClass.getESuperTypes().add(this.getLastJSONFinish());
    internalValsEClass.getESuperTypes().add(this.getFirstJSONFinish());
    stringDeclarationEClass.getESuperTypes().add(this.getInternalInstructions());
    variableDeclarationEClass.getESuperTypes().add(this.getInternalInstructions());

    // Initialize classes and features; add operations and parameters
    initEClass(traceryProgramEClass, TraceryProgram.class, "TraceryProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTraceryProgram_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, TraceryProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(firstJSONStatementsEClass, FirstJSONStatements.class, "FirstJSONStatements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFirstJSONStatements_Name(), ecorePackage.getEString(), "name", null, 0, 1, FirstJSONStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFirstJSONStatements_Value(), this.getFirstJSONFinish(), null, "value", null, 0, 1, FirstJSONStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(firstJSONFinishEClass, FirstJSONFinish.class, "FirstJSONFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initialValEClass, InitialVal.class, "InitialVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitialVal_ValInternalInstruction(), this.getInternalInstructions(), null, "valInternalInstruction", null, 0, -1, InitialVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialVal_Vals(), this.getStandardVal(), null, "vals", null, 0, -1, InitialVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_FirstInstruction(), this.getFirstJSONStatements(), null, "firstInstruction", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_LastInstruction(), this.getLastJSONStatement(), null, "lastInstruction", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalInstructionsEClass, InternalInstructions.class, "InternalInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(internalValsEClass, InternalVals.class, "InternalVals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lastJSONFinishEClass, LastJSONFinish.class, "LastJSONFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lastJSONStatementEClass, LastJSONStatement.class, "LastJSONStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLastJSONStatement_Value(), this.getLastJSONFinish(), null, "value", null, 0, 1, LastJSONStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardValEClass, StandardVal.class, "StandardVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStandardVal_ValInternalInstruction(), this.getInternalInstructions(), null, "valInternalInstruction", null, 0, -1, StandardVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringDeclarationEClass, StringDeclaration.class, "StringDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringDeclaration_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_Variable(), this.getFirstJSONStatements(), null, "variable", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TraceryLanguagePackageImpl
