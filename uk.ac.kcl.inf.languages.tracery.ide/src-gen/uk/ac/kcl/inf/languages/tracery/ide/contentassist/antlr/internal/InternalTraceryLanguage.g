/*
 * generated by Xtext 2.24.0
 */
grammar InternalTraceryLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;

}
@parser::members {
	private TraceryLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(TraceryLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTraceryProgram
entryRuleTraceryProgram
:
{ before(grammarAccess.getTraceryProgramRule()); }
	 ruleTraceryProgram
{ after(grammarAccess.getTraceryProgramRule()); } 
	 EOF 
;

// Rule TraceryProgram
ruleTraceryProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTraceryProgramAccess().getGroup()); }
		(rule__TraceryProgram__Group__0)
		{ after(grammarAccess.getTraceryProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitialJSONExpression
entryRuleInitialJSONExpression
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getInitialJSONExpressionRule()); }
	 ruleInitialJSONExpression
{ after(grammarAccess.getInitialJSONExpressionRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule InitialJSONExpression
ruleInitialJSONExpression 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitialJSONExpressionAccess().getVarAssignment()); }
		(rule__InitialJSONExpression__VarAssignment)
		{ after(grammarAccess.getInitialJSONExpressionAccess().getVarAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleinitialValue
entryRuleinitialValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getInitialValueRule()); }
	 ruleinitialValue
{ after(grammarAccess.getInitialValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule initialValue
ruleinitialValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitialValueAccess().getGroup()); }
		(rule__InitialValue__Group__0)
		{ after(grammarAccess.getInitialValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInternalInstruction
entryRuleInternalInstruction
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getInternalInstructionRule()); }
	 ruleInternalInstruction
{ after(grammarAccess.getInternalInstructionRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule InternalInstruction
ruleInternalInstruction 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInternalInstructionAccess().getAlternatives()); }
		(rule__InternalInstruction__Alternatives)
		{ after(grammarAccess.getInternalInstructionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStandardJSONStatement
entryRuleStandardJSONStatement
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getStandardJSONStatementRule()); }
	 ruleStandardJSONStatement
{ after(grammarAccess.getStandardJSONStatementRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule StandardJSONStatement
ruleStandardJSONStatement 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStandardJSONStatementAccess().getGroup()); }
		(rule__StandardJSONStatement__Group__0)
		{ after(grammarAccess.getStandardJSONStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStartingJSONStatement
entryRuleStartingJSONStatement
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getStartingJSONStatementRule()); }
	 ruleStartingJSONStatement
{ after(grammarAccess.getStartingJSONStatementRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule StartingJSONStatement
ruleStartingJSONStatement 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStartingJSONStatementAccess().getGroup()); }
		(rule__StartingJSONStatement__Group__0)
		{ after(grammarAccess.getStartingJSONStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRulestandardValue
entryRulestandardValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getStandardValueRule()); }
	 rulestandardValue
{ after(grammarAccess.getStandardValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule standardValue
rulestandardValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStandardValueAccess().getGroup()); }
		(rule__StandardValue__Group__0)
		{ after(grammarAccess.getStandardValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getVariableDeclarationRule()); }
	 ruleVariableDeclaration
{ after(grammarAccess.getVariableDeclarationRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule VariableDeclaration
ruleVariableDeclaration 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableDeclarationAccess().getNameAssignment()); }
		(rule__VariableDeclaration__NameAssignment)
		{ after(grammarAccess.getVariableDeclarationAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

rule__InternalInstruction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalInstructionAccess().getValueAssignment_0()); }
		(rule__InternalInstruction__ValueAssignment_0)
		{ after(grammarAccess.getInternalInstructionAccess().getValueAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getInternalInstructionAccess().getGroup_1()); }
		(rule__InternalInstruction__Group_1__0)
		{ after(grammarAccess.getInternalInstructionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getInternalInstructionAccess().getGroup_2()); }
		(rule__InternalInstruction__Group_2__0)
		{ after(grammarAccess.getInternalInstructionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getInternalInstructionAccess().getGroup_3()); }
		(rule__InternalInstruction__Group_3__0)
		{ after(grammarAccess.getInternalInstructionAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getInternalInstructionAccess().getGroup_4()); }
		(rule__InternalInstruction__Group_4__0)
		{ after(grammarAccess.getInternalInstructionAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getInternalInstructionAccess().getGroup_5()); }
		(rule__InternalInstruction__Group_5__0)
		{ after(grammarAccess.getInternalInstructionAccess().getGroup_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__0__Impl
	rule__TraceryProgram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__1__Impl
	rule__TraceryProgram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1()); }
	()
	{ after(grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__2__Impl
	rule__TraceryProgram__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getStartingInstructionAssignment_2()); }
	(rule__TraceryProgram__StartingInstructionAssignment_2)
	{ after(grammarAccess.getTraceryProgramAccess().getStartingInstructionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__3__Impl
	rule__TraceryProgram__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getInstructionsAssignment_3()); }
	(rule__TraceryProgram__InstructionsAssignment_3)*
	{ after(grammarAccess.getTraceryProgramAccess().getInstructionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InitialValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialValue__Group__0__Impl
	rule__InitialValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialValueAccess().getInitialValueAction_0()); }
	()
	{ after(grammarAccess.getInitialValueAccess().getInitialValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialValue__Group__1__Impl
	rule__InitialValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialValueAccess().getAmpersandKeyword_1()); }
	'&'
	{ after(grammarAccess.getInitialValueAccess().getAmpersandKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialValue__Group__2__Impl
	rule__InitialValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialValueAccess().getValueAssignment_2()); }
	(rule__InitialValue__ValueAssignment_2)*
	{ after(grammarAccess.getInitialValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialValue__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialValueAccess().getAmpersandKeyword_3()); }
	'&'
	{ after(grammarAccess.getInitialValueAccess().getAmpersandKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalInstruction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_1__0__Impl
	rule__InternalInstruction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_1_0()); }
	'#'
	{ after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_1__1__Impl
	rule__InternalInstruction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_1_1()); }
	ruleVariableDeclaration
	{ after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getAKeyword_1_2()); }
	'.a#'
	{ after(grammarAccess.getInternalInstructionAccess().getAKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalInstruction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_2__0__Impl
	rule__InternalInstruction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_2_0()); }
	'#'
	{ after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_2__1__Impl
	rule__InternalInstruction__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_2_1()); }
	ruleVariableDeclaration
	{ after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getCapitaliseKeyword_2_2()); }
	'.capitalise#'
	{ after(grammarAccess.getInternalInstructionAccess().getCapitaliseKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalInstruction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_3__0__Impl
	rule__InternalInstruction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_3_0()); }
	'#'
	{ after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_3__1__Impl
	rule__InternalInstruction__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_3_1()); }
	ruleVariableDeclaration
	{ after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getEdKeyword_3_2()); }
	'.ed#'
	{ after(grammarAccess.getInternalInstructionAccess().getEdKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalInstruction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_4__0__Impl
	rule__InternalInstruction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_4_0()); }
	'#'
	{ after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_4__1__Impl
	rule__InternalInstruction__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_4_1()); }
	ruleVariableDeclaration
	{ after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getTheKeyword_4_2()); }
	'.the#'
	{ after(grammarAccess.getInternalInstructionAccess().getTheKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalInstruction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_5__0__Impl
	rule__InternalInstruction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_0()); }
	'#'
	{ after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_5__1__Impl
	rule__InternalInstruction__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_5_1()); }
	ruleVariableDeclaration
	{ after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalInstruction__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_2()); }
	'#'
	{ after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StandardJSONStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__0__Impl
	rule__StandardJSONStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getCommaKeyword_0()); }
	','
	{ after(grammarAccess.getStandardJSONStatementAccess().getCommaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__1__Impl
	rule__StandardJSONStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_1()); }
	'&'
	{ after(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__2__Impl
	rule__StandardJSONStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getInitialJSONExpressionParserRuleCall_2()); }
	ruleInitialJSONExpression
	{ after(grammarAccess.getStandardJSONStatementAccess().getInitialJSONExpressionParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__3__Impl
	rule__StandardJSONStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_3()); }
	'&'
	{ after(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__4__Impl
	rule__StandardJSONStatement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getStandardJSONStatementAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__5__Impl
	rule__StandardJSONStatement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getLeftSquareBracketKeyword_5()); }
	'['
	{ after(grammarAccess.getStandardJSONStatementAccess().getLeftSquareBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__6__Impl
	rule__StandardJSONStatement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getInitialValuesAssignment_6()); }
	(rule__StandardJSONStatement__InitialValuesAssignment_6)
	{ after(grammarAccess.getStandardJSONStatementAccess().getInitialValuesAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__7__Impl
	rule__StandardJSONStatement__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getStandardValuesAssignment_7()); }
	(rule__StandardJSONStatement__StandardValuesAssignment_7)*
	{ after(grammarAccess.getStandardJSONStatementAccess().getStandardValuesAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardJSONStatement__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardJSONStatementAccess().getRightSquareBracketKeyword_8()); }
	']'
	{ after(grammarAccess.getStandardJSONStatementAccess().getRightSquareBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StartingJSONStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartingJSONStatement__Group__0__Impl
	rule__StartingJSONStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartingJSONStatementAccess().getOriginKeyword_0()); }
	'&origin&'
	{ after(grammarAccess.getStartingJSONStatementAccess().getOriginKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartingJSONStatement__Group__1__Impl
	rule__StartingJSONStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartingJSONStatementAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getStartingJSONStatementAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartingJSONStatement__Group__2__Impl
	rule__StartingJSONStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartingJSONStatementAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getStartingJSONStatementAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartingJSONStatement__Group__3__Impl
	rule__StartingJSONStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartingJSONStatementAccess().getInitialValuesAssignment_3()); }
	(rule__StartingJSONStatement__InitialValuesAssignment_3)
	{ after(grammarAccess.getStartingJSONStatementAccess().getInitialValuesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartingJSONStatement__Group__4__Impl
	rule__StartingJSONStatement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartingJSONStatementAccess().getStandardValuesAssignment_4()); }
	(rule__StartingJSONStatement__StandardValuesAssignment_4)*
	{ after(grammarAccess.getStartingJSONStatementAccess().getStandardValuesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartingJSONStatement__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartingJSONStatementAccess().getRightSquareBracketKeyword_5()); }
	']'
	{ after(grammarAccess.getStartingJSONStatementAccess().getRightSquareBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StandardValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardValue__Group__0__Impl
	rule__StandardValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardValueAccess().getStandardValueAction_0()); }
	()
	{ after(grammarAccess.getStandardValueAccess().getStandardValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardValue__Group__1__Impl
	rule__StandardValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardValueAccess().getCommaKeyword_1()); }
	','
	{ after(grammarAccess.getStandardValueAccess().getCommaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardValue__Group__2__Impl
	rule__StandardValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardValueAccess().getAmpersandKeyword_2()); }
	'&'
	{ after(grammarAccess.getStandardValueAccess().getAmpersandKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardValue__Group__3__Impl
	rule__StandardValue__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardValueAccess().getValueAssignment_3()); }
	(rule__StandardValue__ValueAssignment_3)*
	{ after(grammarAccess.getStandardValueAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StandardValue__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStandardValueAccess().getAmpersandKeyword_4()); }
	'&'
	{ after(grammarAccess.getStandardValueAccess().getAmpersandKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TraceryProgram__StartingInstructionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTraceryProgramAccess().getStartingInstructionStartingJSONStatementParserRuleCall_2_0()); }
		ruleStartingJSONStatement
		{ after(grammarAccess.getTraceryProgramAccess().getStartingInstructionStartingJSONStatementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__InstructionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTraceryProgramAccess().getInstructionsStandardJSONStatementParserRuleCall_3_0()); }
		ruleStandardJSONStatement
		{ after(grammarAccess.getTraceryProgramAccess().getInstructionsStandardJSONStatementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONExpression__VarAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationCrossReference_0()); }
		(
			{ before(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialValueAccess().getValueInternalInstructionParserRuleCall_2_0()); }
		ruleInternalInstruction
		{ after(grammarAccess.getInitialValueAccess().getValueInternalInstructionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalInstruction__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalInstructionAccess().getValueSTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getInternalInstructionAccess().getValueSTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__InitialValuesAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStandardJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_6_0()); }
		ruleinitialValue
		{ after(grammarAccess.getStandardJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardJSONStatement__StandardValuesAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStandardJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_7_0()); }
		rulestandardValue
		{ after(grammarAccess.getStandardJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__InitialValuesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartingJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_3_0()); }
		ruleinitialValue
		{ after(grammarAccess.getStartingJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartingJSONStatement__StandardValuesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartingJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_4_0()); }
		rulestandardValue
		{ after(grammarAccess.getStartingJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandardValue__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStandardValueAccess().getValueInternalInstructionParserRuleCall_3_0()); }
		ruleInternalInstruction
		{ after(grammarAccess.getStandardValueAccess().getValueInternalInstructionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDeclaration__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
