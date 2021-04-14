/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.FirstJSONStatements;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialVal;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.Instruction;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.LastJSONStatement;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StandardVal;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StringDeclaration;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDeclaration;

@SuppressWarnings("all")
public class TraceryLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TraceryLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TraceryLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TraceryLanguagePackage.FIRST_JSON_STATEMENTS:
				sequence_FirstJSONStatements(context, (FirstJSONStatements) semanticObject); 
				return; 
			case TraceryLanguagePackage.INITIAL_VAL:
				if (rule == grammarAccess.getInitialValRule()) {
					sequence_InitialVal(context, (InitialVal) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFirstJSONFinishRule()
						|| rule == grammarAccess.getInternalValsRule()) {
					sequence_InitialVal_InternalVals(context, (InitialVal) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLastJSONFinishRule()) {
					sequence_InitialVal_LastJSONFinish(context, (InitialVal) semanticObject); 
					return; 
				}
				else break;
			case TraceryLanguagePackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case TraceryLanguagePackage.LAST_JSON_STATEMENT:
				sequence_LastJSONStatement(context, (LastJSONStatement) semanticObject); 
				return; 
			case TraceryLanguagePackage.STANDARD_VAL:
				sequence_StandardVal(context, (StandardVal) semanticObject); 
				return; 
			case TraceryLanguagePackage.STRING_DECLARATION:
				sequence_StringDeclaration(context, (StringDeclaration) semanticObject); 
				return; 
			case TraceryLanguagePackage.TRACERY_PROGRAM:
				sequence_TraceryProgram(context, (TraceryProgram) semanticObject); 
				return; 
			case TraceryLanguagePackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FirstJSONStatements returns FirstJSONStatements
	 *
	 * Constraint:
	 *     (name=ID value=FirstJSONFinish)
	 */
	protected void sequence_FirstJSONStatements(ISerializationContext context, FirstJSONStatements semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryLanguagePackage.Literals.FIRST_JSON_STATEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryLanguagePackage.Literals.FIRST_JSON_STATEMENTS__NAME));
			if (transientValues.isValueTransient(semanticObject, TraceryLanguagePackage.Literals.FIRST_JSON_STATEMENTS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryLanguagePackage.Literals.FIRST_JSON_STATEMENTS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFirstJSONStatementsAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFirstJSONStatementsAccess().getValueFirstJSONFinishParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InitialVal returns InitialVal
	 *
	 * Constraint:
	 *     valInternalInstruction+=InternalInstructions+
	 */
	protected void sequence_InitialVal(ISerializationContext context, InitialVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FirstJSONFinish returns InitialVal
	 *     InternalVals returns InitialVal
	 *
	 * Constraint:
	 *     (valInternalInstruction+=InternalInstructions+ vals+=StandardVal*)
	 */
	protected void sequence_InitialVal_InternalVals(ISerializationContext context, InitialVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LastJSONFinish returns InitialVal
	 *
	 * Constraint:
	 *     (valInternalInstruction+=InternalInstructions+ vals+=StandardVal*)
	 */
	protected void sequence_InitialVal_LastJSONFinish(ISerializationContext context, InitialVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     (firstInstruction+=FirstJSONStatements* lastInstruction=LastJSONStatement)
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LastJSONStatement returns LastJSONStatement
	 *
	 * Constraint:
	 *     value=LastJSONFinish
	 */
	protected void sequence_LastJSONStatement(ISerializationContext context, LastJSONStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryLanguagePackage.Literals.LAST_JSON_STATEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryLanguagePackage.Literals.LAST_JSON_STATEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLastJSONStatementAccess().getValueLastJSONFinishParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StandardVal returns StandardVal
	 *
	 * Constraint:
	 *     valInternalInstruction+=InternalInstructions+
	 */
	protected void sequence_StandardVal(ISerializationContext context, StandardVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InternalInstructions returns StringDeclaration
	 *     StringDeclaration returns StringDeclaration
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringDeclaration(ISerializationContext context, StringDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryLanguagePackage.Literals.STRING_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryLanguagePackage.Literals.STRING_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TraceryProgram returns TraceryProgram
	 *
	 * Constraint:
	 *     instructions+=Instruction
	 */
	protected void sequence_TraceryProgram(ISerializationContext context, TraceryProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InternalInstructions returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     variable=[FirstJSONStatements|ID]
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryLanguagePackage.Literals.VARIABLE_DECLARATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryLanguagePackage.Literals.VARIABLE_DECLARATION__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getVariableFirstJSONStatementsIDTerminalRuleCall_1_0_1(), semanticObject.eGet(TraceryLanguagePackage.Literals.VARIABLE_DECLARATION__VARIABLE, false));
		feeder.finish();
	}
	
	
}
