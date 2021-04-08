/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONExpression;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InternalInstruction;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StandardJSONStatement;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONStatement;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguageFactory;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDeclaration;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.initialValue;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.standardValue;

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
  private EClass initialJSONExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass standardJSONStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startingJSONStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass standardValueEClass = null;

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
  public EReference getTraceryProgram_StartingInstruction()
  {
    return (EReference)traceryProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitialJSONExpression()
  {
    return initialJSONExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialJSONExpression_Var()
  {
    return (EReference)initialJSONExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialJSONExpression_InitialValues()
  {
    return (EReference)initialJSONExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialJSONExpression_StandardValues()
  {
    return (EReference)initialJSONExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getinitialValue()
  {
    return initialValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getinitialValue_Value()
  {
    return (EReference)initialValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInternalInstruction()
  {
    return internalInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInternalInstruction_Value()
  {
    return (EAttribute)internalInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStandardJSONStatement()
  {
    return standardJSONStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStartingJSONStatement()
  {
    return startingJSONStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStartingJSONStatement_InitialValues()
  {
    return (EReference)startingJSONStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStartingJSONStatement_StandardValues()
  {
    return (EReference)startingJSONStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getstandardValue()
  {
    return standardValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getstandardValue_Value()
  {
    return (EReference)standardValueEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
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
    createEReference(traceryProgramEClass, TRACERY_PROGRAM__STARTING_INSTRUCTION);

    initialJSONExpressionEClass = createEClass(INITIAL_JSON_EXPRESSION);
    createEReference(initialJSONExpressionEClass, INITIAL_JSON_EXPRESSION__VAR);
    createEReference(initialJSONExpressionEClass, INITIAL_JSON_EXPRESSION__INITIAL_VALUES);
    createEReference(initialJSONExpressionEClass, INITIAL_JSON_EXPRESSION__STANDARD_VALUES);

    initialValueEClass = createEClass(INITIAL_VALUE);
    createEReference(initialValueEClass, INITIAL_VALUE__VALUE);

    internalInstructionEClass = createEClass(INTERNAL_INSTRUCTION);
    createEAttribute(internalInstructionEClass, INTERNAL_INSTRUCTION__VALUE);

    standardJSONStatementEClass = createEClass(STANDARD_JSON_STATEMENT);

    startingJSONStatementEClass = createEClass(STARTING_JSON_STATEMENT);
    createEReference(startingJSONStatementEClass, STARTING_JSON_STATEMENT__INITIAL_VALUES);
    createEReference(startingJSONStatementEClass, STARTING_JSON_STATEMENT__STANDARD_VALUES);

    standardValueEClass = createEClass(STANDARD_VALUE);
    createEReference(standardValueEClass, STANDARD_VALUE__VALUE);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
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
    initialJSONExpressionEClass.getESuperTypes().add(this.getStandardJSONStatement());
    variableDeclarationEClass.getESuperTypes().add(this.getInternalInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(traceryProgramEClass, TraceryProgram.class, "TraceryProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTraceryProgram_Instructions(), this.getStandardJSONStatement(), null, "instructions", null, 0, -1, TraceryProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraceryProgram_StartingInstruction(), this.getStartingJSONStatement(), null, "startingInstruction", null, 0, 1, TraceryProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialJSONExpressionEClass, InitialJSONExpression.class, "InitialJSONExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitialJSONExpression_Var(), this.getVariableDeclaration(), null, "var", null, 0, 1, InitialJSONExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialJSONExpression_InitialValues(), this.getinitialValue(), null, "initialValues", null, 0, -1, InitialJSONExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialJSONExpression_StandardValues(), this.getstandardValue(), null, "standardValues", null, 0, -1, InitialJSONExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialValueEClass, initialValue.class, "initialValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinitialValue_Value(), this.getInternalInstruction(), null, "value", null, 0, -1, initialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalInstructionEClass, InternalInstruction.class, "InternalInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInternalInstruction_Value(), ecorePackage.getEString(), "value", null, 0, 1, InternalInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardJSONStatementEClass, StandardJSONStatement.class, "StandardJSONStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(startingJSONStatementEClass, StartingJSONStatement.class, "StartingJSONStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartingJSONStatement_InitialValues(), this.getinitialValue(), null, "initialValues", null, 0, -1, StartingJSONStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStartingJSONStatement_StandardValues(), this.getstandardValue(), null, "standardValues", null, 0, -1, StartingJSONStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardValueEClass, standardValue.class, "standardValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstandardValue_Value(), this.getInternalInstruction(), null, "value", null, 0, -1, standardValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TraceryLanguagePackageImpl
