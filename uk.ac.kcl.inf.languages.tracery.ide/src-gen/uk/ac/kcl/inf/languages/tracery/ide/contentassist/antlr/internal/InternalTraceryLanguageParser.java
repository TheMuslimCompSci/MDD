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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'&'", "'#'", "'.a#'", "'.capitalise#'", "'.ed#'", "'.the#'", "','", "':'", "'['", "']'", "'&origin&'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTraceryLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraceryLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraceryLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTraceryLanguage.g"; }


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



    // $ANTLR start "entryRuleTraceryProgram"
    // InternalTraceryLanguage.g:53:1: entryRuleTraceryProgram : ruleTraceryProgram EOF ;
    public final void entryRuleTraceryProgram() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:54:1: ( ruleTraceryProgram EOF )
            // InternalTraceryLanguage.g:55:1: ruleTraceryProgram EOF
            {
             before(grammarAccess.getTraceryProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleTraceryProgram();

            state._fsp--;

             after(grammarAccess.getTraceryProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraceryProgram"


    // $ANTLR start "ruleTraceryProgram"
    // InternalTraceryLanguage.g:62:1: ruleTraceryProgram : ( ( rule__TraceryProgram__Group__0 ) ) ;
    public final void ruleTraceryProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:66:2: ( ( ( rule__TraceryProgram__Group__0 ) ) )
            // InternalTraceryLanguage.g:67:2: ( ( rule__TraceryProgram__Group__0 ) )
            {
            // InternalTraceryLanguage.g:67:2: ( ( rule__TraceryProgram__Group__0 ) )
            // InternalTraceryLanguage.g:68:3: ( rule__TraceryProgram__Group__0 )
            {
             before(grammarAccess.getTraceryProgramAccess().getGroup()); 
            // InternalTraceryLanguage.g:69:3: ( rule__TraceryProgram__Group__0 )
            // InternalTraceryLanguage.g:69:4: rule__TraceryProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraceryProgram"


    // $ANTLR start "entryRuleInitialJSONExpression"
    // InternalTraceryLanguage.g:78:1: entryRuleInitialJSONExpression : ruleInitialJSONExpression EOF ;
    public final void entryRuleInitialJSONExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:82:1: ( ruleInitialJSONExpression EOF )
            // InternalTraceryLanguage.g:83:1: ruleInitialJSONExpression EOF
            {
             before(grammarAccess.getInitialJSONExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialJSONExpression();

            state._fsp--;

             after(grammarAccess.getInitialJSONExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInitialJSONExpression"


    // $ANTLR start "ruleInitialJSONExpression"
    // InternalTraceryLanguage.g:93:1: ruleInitialJSONExpression : ( ( rule__InitialJSONExpression__VarAssignment ) ) ;
    public final void ruleInitialJSONExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:98:2: ( ( ( rule__InitialJSONExpression__VarAssignment ) ) )
            // InternalTraceryLanguage.g:99:2: ( ( rule__InitialJSONExpression__VarAssignment ) )
            {
            // InternalTraceryLanguage.g:99:2: ( ( rule__InitialJSONExpression__VarAssignment ) )
            // InternalTraceryLanguage.g:100:3: ( rule__InitialJSONExpression__VarAssignment )
            {
             before(grammarAccess.getInitialJSONExpressionAccess().getVarAssignment()); 
            // InternalTraceryLanguage.g:101:3: ( rule__InitialJSONExpression__VarAssignment )
            // InternalTraceryLanguage.g:101:4: rule__InitialJSONExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInitialJSONExpression"


    // $ANTLR start "entryRuleinitialValue"
    // InternalTraceryLanguage.g:111:1: entryRuleinitialValue : ruleinitialValue EOF ;
    public final void entryRuleinitialValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:115:1: ( ruleinitialValue EOF )
            // InternalTraceryLanguage.g:116:1: ruleinitialValue EOF
            {
             before(grammarAccess.getInitialValueRule()); 
            pushFollow(FOLLOW_1);
            ruleinitialValue();

            state._fsp--;

             after(grammarAccess.getInitialValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleinitialValue"


    // $ANTLR start "ruleinitialValue"
    // InternalTraceryLanguage.g:126:1: ruleinitialValue : ( ( rule__InitialValue__Group__0 ) ) ;
    public final void ruleinitialValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:131:2: ( ( ( rule__InitialValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialValue__Group__0 ) )
            // InternalTraceryLanguage.g:133:3: ( rule__InitialValue__Group__0 )
            {
             before(grammarAccess.getInitialValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:134:3: ( rule__InitialValue__Group__0 )
            // InternalTraceryLanguage.g:134:4: rule__InitialValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleinitialValue"


    // $ANTLR start "entryRuleInternalInstruction"
    // InternalTraceryLanguage.g:144:1: entryRuleInternalInstruction : ruleInternalInstruction EOF ;
    public final void entryRuleInternalInstruction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:148:1: ( ruleInternalInstruction EOF )
            // InternalTraceryLanguage.g:149:1: ruleInternalInstruction EOF
            {
             before(grammarAccess.getInternalInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalInstruction();

            state._fsp--;

             after(grammarAccess.getInternalInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInternalInstruction"


    // $ANTLR start "ruleInternalInstruction"
    // InternalTraceryLanguage.g:159:1: ruleInternalInstruction : ( ( rule__InternalInstruction__Alternatives ) ) ;
    public final void ruleInternalInstruction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:164:2: ( ( ( rule__InternalInstruction__Alternatives ) ) )
            // InternalTraceryLanguage.g:165:2: ( ( rule__InternalInstruction__Alternatives ) )
            {
            // InternalTraceryLanguage.g:165:2: ( ( rule__InternalInstruction__Alternatives ) )
            // InternalTraceryLanguage.g:166:3: ( rule__InternalInstruction__Alternatives )
            {
             before(grammarAccess.getInternalInstructionAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:167:3: ( rule__InternalInstruction__Alternatives )
            // InternalTraceryLanguage.g:167:4: rule__InternalInstruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInternalInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInternalInstruction"


    // $ANTLR start "entryRuleStandardJSONStatement"
    // InternalTraceryLanguage.g:177:1: entryRuleStandardJSONStatement : ruleStandardJSONStatement EOF ;
    public final void entryRuleStandardJSONStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:181:1: ( ruleStandardJSONStatement EOF )
            // InternalTraceryLanguage.g:182:1: ruleStandardJSONStatement EOF
            {
             before(grammarAccess.getStandardJSONStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStandardJSONStatement();

            state._fsp--;

             after(grammarAccess.getStandardJSONStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStandardJSONStatement"


    // $ANTLR start "ruleStandardJSONStatement"
    // InternalTraceryLanguage.g:192:1: ruleStandardJSONStatement : ( ( rule__StandardJSONStatement__Group__0 ) ) ;
    public final void ruleStandardJSONStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:197:2: ( ( ( rule__StandardJSONStatement__Group__0 ) ) )
            // InternalTraceryLanguage.g:198:2: ( ( rule__StandardJSONStatement__Group__0 ) )
            {
            // InternalTraceryLanguage.g:198:2: ( ( rule__StandardJSONStatement__Group__0 ) )
            // InternalTraceryLanguage.g:199:3: ( rule__StandardJSONStatement__Group__0 )
            {
             before(grammarAccess.getStandardJSONStatementAccess().getGroup()); 
            // InternalTraceryLanguage.g:200:3: ( rule__StandardJSONStatement__Group__0 )
            // InternalTraceryLanguage.g:200:4: rule__StandardJSONStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardJSONStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStandardJSONStatement"


    // $ANTLR start "entryRuleStartingJSONStatement"
    // InternalTraceryLanguage.g:210:1: entryRuleStartingJSONStatement : ruleStartingJSONStatement EOF ;
    public final void entryRuleStartingJSONStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:214:1: ( ruleStartingJSONStatement EOF )
            // InternalTraceryLanguage.g:215:1: ruleStartingJSONStatement EOF
            {
             before(grammarAccess.getStartingJSONStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStartingJSONStatement();

            state._fsp--;

             after(grammarAccess.getStartingJSONStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStartingJSONStatement"


    // $ANTLR start "ruleStartingJSONStatement"
    // InternalTraceryLanguage.g:225:1: ruleStartingJSONStatement : ( ( rule__StartingJSONStatement__Group__0 ) ) ;
    public final void ruleStartingJSONStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:230:2: ( ( ( rule__StartingJSONStatement__Group__0 ) ) )
            // InternalTraceryLanguage.g:231:2: ( ( rule__StartingJSONStatement__Group__0 ) )
            {
            // InternalTraceryLanguage.g:231:2: ( ( rule__StartingJSONStatement__Group__0 ) )
            // InternalTraceryLanguage.g:232:3: ( rule__StartingJSONStatement__Group__0 )
            {
             before(grammarAccess.getStartingJSONStatementAccess().getGroup()); 
            // InternalTraceryLanguage.g:233:3: ( rule__StartingJSONStatement__Group__0 )
            // InternalTraceryLanguage.g:233:4: rule__StartingJSONStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartingJSONStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStartingJSONStatement"


    // $ANTLR start "entryRulestandardValue"
    // InternalTraceryLanguage.g:243:1: entryRulestandardValue : rulestandardValue EOF ;
    public final void entryRulestandardValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:247:1: ( rulestandardValue EOF )
            // InternalTraceryLanguage.g:248:1: rulestandardValue EOF
            {
             before(grammarAccess.getStandardValueRule()); 
            pushFollow(FOLLOW_1);
            rulestandardValue();

            state._fsp--;

             after(grammarAccess.getStandardValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulestandardValue"


    // $ANTLR start "rulestandardValue"
    // InternalTraceryLanguage.g:258:1: rulestandardValue : ( ( rule__StandardValue__Group__0 ) ) ;
    public final void rulestandardValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:263:2: ( ( ( rule__StandardValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:264:2: ( ( rule__StandardValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:264:2: ( ( rule__StandardValue__Group__0 ) )
            // InternalTraceryLanguage.g:265:3: ( rule__StandardValue__Group__0 )
            {
             before(grammarAccess.getStandardValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:266:3: ( rule__StandardValue__Group__0 )
            // InternalTraceryLanguage.g:266:4: rule__StandardValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StandardValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulestandardValue"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTraceryLanguage.g:276:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:280:1: ( ruleVariableDeclaration EOF )
            // InternalTraceryLanguage.g:281:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTraceryLanguage.g:291:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__NameAssignment ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:296:2: ( ( ( rule__VariableDeclaration__NameAssignment ) ) )
            // InternalTraceryLanguage.g:297:2: ( ( rule__VariableDeclaration__NameAssignment ) )
            {
            // InternalTraceryLanguage.g:297:2: ( ( rule__VariableDeclaration__NameAssignment ) )
            // InternalTraceryLanguage.g:298:3: ( rule__VariableDeclaration__NameAssignment )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment()); 
            // InternalTraceryLanguage.g:299:3: ( rule__VariableDeclaration__NameAssignment )
            // InternalTraceryLanguage.g:299:4: rule__VariableDeclaration__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "rule__InternalInstruction__Alternatives"
    // InternalTraceryLanguage.g:308:1: rule__InternalInstruction__Alternatives : ( ( ( rule__InternalInstruction__ValueAssignment_0 ) ) | ( ( rule__InternalInstruction__Group_1__0 ) ) | ( ( rule__InternalInstruction__Group_2__0 ) ) | ( ( rule__InternalInstruction__Group_3__0 ) ) | ( ( rule__InternalInstruction__Group_4__0 ) ) | ( ( rule__InternalInstruction__Group_5__0 ) ) );
    public final void rule__InternalInstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:312:1: ( ( ( rule__InternalInstruction__ValueAssignment_0 ) ) | ( ( rule__InternalInstruction__Group_1__0 ) ) | ( ( rule__InternalInstruction__Group_2__0 ) ) | ( ( rule__InternalInstruction__Group_3__0 ) ) | ( ( rule__InternalInstruction__Group_4__0 ) ) | ( ( rule__InternalInstruction__Group_5__0 ) ) )
            int alt1=6;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        alt1=4;
                        }
                        break;
                    case 16:
                        {
                        alt1=3;
                        }
                        break;
                    case 14:
                        {
                        alt1=6;
                        }
                        break;
                    case 15:
                        {
                        alt1=2;
                        }
                        break;
                    case 18:
                        {
                        alt1=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryLanguage.g:313:2: ( ( rule__InternalInstruction__ValueAssignment_0 ) )
                    {
                    // InternalTraceryLanguage.g:313:2: ( ( rule__InternalInstruction__ValueAssignment_0 ) )
                    // InternalTraceryLanguage.g:314:3: ( rule__InternalInstruction__ValueAssignment_0 )
                    {
                     before(grammarAccess.getInternalInstructionAccess().getValueAssignment_0()); 
                    // InternalTraceryLanguage.g:315:3: ( rule__InternalInstruction__ValueAssignment_0 )
                    // InternalTraceryLanguage.g:315:4: rule__InternalInstruction__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternalInstruction__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInternalInstructionAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:319:2: ( ( rule__InternalInstruction__Group_1__0 ) )
                    {
                    // InternalTraceryLanguage.g:319:2: ( ( rule__InternalInstruction__Group_1__0 ) )
                    // InternalTraceryLanguage.g:320:3: ( rule__InternalInstruction__Group_1__0 )
                    {
                     before(grammarAccess.getInternalInstructionAccess().getGroup_1()); 
                    // InternalTraceryLanguage.g:321:3: ( rule__InternalInstruction__Group_1__0 )
                    // InternalTraceryLanguage.g:321:4: rule__InternalInstruction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternalInstruction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInternalInstructionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryLanguage.g:325:2: ( ( rule__InternalInstruction__Group_2__0 ) )
                    {
                    // InternalTraceryLanguage.g:325:2: ( ( rule__InternalInstruction__Group_2__0 ) )
                    // InternalTraceryLanguage.g:326:3: ( rule__InternalInstruction__Group_2__0 )
                    {
                     before(grammarAccess.getInternalInstructionAccess().getGroup_2()); 
                    // InternalTraceryLanguage.g:327:3: ( rule__InternalInstruction__Group_2__0 )
                    // InternalTraceryLanguage.g:327:4: rule__InternalInstruction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternalInstruction__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInternalInstructionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryLanguage.g:331:2: ( ( rule__InternalInstruction__Group_3__0 ) )
                    {
                    // InternalTraceryLanguage.g:331:2: ( ( rule__InternalInstruction__Group_3__0 ) )
                    // InternalTraceryLanguage.g:332:3: ( rule__InternalInstruction__Group_3__0 )
                    {
                     before(grammarAccess.getInternalInstructionAccess().getGroup_3()); 
                    // InternalTraceryLanguage.g:333:3: ( rule__InternalInstruction__Group_3__0 )
                    // InternalTraceryLanguage.g:333:4: rule__InternalInstruction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternalInstruction__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInternalInstructionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryLanguage.g:337:2: ( ( rule__InternalInstruction__Group_4__0 ) )
                    {
                    // InternalTraceryLanguage.g:337:2: ( ( rule__InternalInstruction__Group_4__0 ) )
                    // InternalTraceryLanguage.g:338:3: ( rule__InternalInstruction__Group_4__0 )
                    {
                     before(grammarAccess.getInternalInstructionAccess().getGroup_4()); 
                    // InternalTraceryLanguage.g:339:3: ( rule__InternalInstruction__Group_4__0 )
                    // InternalTraceryLanguage.g:339:4: rule__InternalInstruction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternalInstruction__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInternalInstructionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTraceryLanguage.g:343:2: ( ( rule__InternalInstruction__Group_5__0 ) )
                    {
                    // InternalTraceryLanguage.g:343:2: ( ( rule__InternalInstruction__Group_5__0 ) )
                    // InternalTraceryLanguage.g:344:3: ( rule__InternalInstruction__Group_5__0 )
                    {
                     before(grammarAccess.getInternalInstructionAccess().getGroup_5()); 
                    // InternalTraceryLanguage.g:345:3: ( rule__InternalInstruction__Group_5__0 )
                    // InternalTraceryLanguage.g:345:4: rule__InternalInstruction__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternalInstruction__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInternalInstructionAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Alternatives"


    // $ANTLR start "rule__TraceryProgram__Group__0"
    // InternalTraceryLanguage.g:353:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:357:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:358:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TraceryProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__0"


    // $ANTLR start "rule__TraceryProgram__Group__0__Impl"
    // InternalTraceryLanguage.g:365:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:369:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:370:1: ( '{' )
            {
            // InternalTraceryLanguage.g:370:1: ( '{' )
            // InternalTraceryLanguage.g:371:2: '{'
            {
             before(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__0__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__1"
    // InternalTraceryLanguage.g:380:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:384:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:385:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__TraceryProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__1"


    // $ANTLR start "rule__TraceryProgram__Group__1__Impl"
    // InternalTraceryLanguage.g:392:1: rule__TraceryProgram__Group__1__Impl : ( () ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:396:1: ( ( () ) )
            // InternalTraceryLanguage.g:397:1: ( () )
            {
            // InternalTraceryLanguage.g:397:1: ( () )
            // InternalTraceryLanguage.g:398:2: ()
            {
             before(grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1()); 
            // InternalTraceryLanguage.g:399:2: ()
            // InternalTraceryLanguage.g:399:3: 
            {
            }

             after(grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__1__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__2"
    // InternalTraceryLanguage.g:407:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3 ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:411:1: ( rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3 )
            // InternalTraceryLanguage.g:412:2: rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TraceryProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__2"


    // $ANTLR start "rule__TraceryProgram__Group__2__Impl"
    // InternalTraceryLanguage.g:419:1: rule__TraceryProgram__Group__2__Impl : ( ( rule__TraceryProgram__InstructionsAssignment_2 )* ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:423:1: ( ( ( rule__TraceryProgram__InstructionsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:424:1: ( ( rule__TraceryProgram__InstructionsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:424:1: ( ( rule__TraceryProgram__InstructionsAssignment_2 )* )
            // InternalTraceryLanguage.g:425:2: ( rule__TraceryProgram__InstructionsAssignment_2 )*
            {
             before(grammarAccess.getTraceryProgramAccess().getInstructionsAssignment_2()); 
            // InternalTraceryLanguage.g:426:2: ( rule__TraceryProgram__InstructionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:426:3: rule__TraceryProgram__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TraceryProgram__InstructionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTraceryProgramAccess().getInstructionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__2__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__3"
    // InternalTraceryLanguage.g:434:1: rule__TraceryProgram__Group__3 : rule__TraceryProgram__Group__3__Impl rule__TraceryProgram__Group__4 ;
    public final void rule__TraceryProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:438:1: ( rule__TraceryProgram__Group__3__Impl rule__TraceryProgram__Group__4 )
            // InternalTraceryLanguage.g:439:2: rule__TraceryProgram__Group__3__Impl rule__TraceryProgram__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TraceryProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__3"


    // $ANTLR start "rule__TraceryProgram__Group__3__Impl"
    // InternalTraceryLanguage.g:446:1: rule__TraceryProgram__Group__3__Impl : ( ( rule__TraceryProgram__StartingInstructionAssignment_3 ) ) ;
    public final void rule__TraceryProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:450:1: ( ( ( rule__TraceryProgram__StartingInstructionAssignment_3 ) ) )
            // InternalTraceryLanguage.g:451:1: ( ( rule__TraceryProgram__StartingInstructionAssignment_3 ) )
            {
            // InternalTraceryLanguage.g:451:1: ( ( rule__TraceryProgram__StartingInstructionAssignment_3 ) )
            // InternalTraceryLanguage.g:452:2: ( rule__TraceryProgram__StartingInstructionAssignment_3 )
            {
             before(grammarAccess.getTraceryProgramAccess().getStartingInstructionAssignment_3()); 
            // InternalTraceryLanguage.g:453:2: ( rule__TraceryProgram__StartingInstructionAssignment_3 )
            // InternalTraceryLanguage.g:453:3: rule__TraceryProgram__StartingInstructionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__StartingInstructionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getStartingInstructionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__3__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__4"
    // InternalTraceryLanguage.g:461:1: rule__TraceryProgram__Group__4 : rule__TraceryProgram__Group__4__Impl ;
    public final void rule__TraceryProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:465:1: ( rule__TraceryProgram__Group__4__Impl )
            // InternalTraceryLanguage.g:466:2: rule__TraceryProgram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__4"


    // $ANTLR start "rule__TraceryProgram__Group__4__Impl"
    // InternalTraceryLanguage.g:472:1: rule__TraceryProgram__Group__4__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:476:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:477:1: ( '}' )
            {
            // InternalTraceryLanguage.g:477:1: ( '}' )
            // InternalTraceryLanguage.g:478:2: '}'
            {
             before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__4__Impl"


    // $ANTLR start "rule__InitialValue__Group__0"
    // InternalTraceryLanguage.g:488:1: rule__InitialValue__Group__0 : rule__InitialValue__Group__0__Impl rule__InitialValue__Group__1 ;
    public final void rule__InitialValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:492:1: ( rule__InitialValue__Group__0__Impl rule__InitialValue__Group__1 )
            // InternalTraceryLanguage.g:493:2: rule__InitialValue__Group__0__Impl rule__InitialValue__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InitialValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__0"


    // $ANTLR start "rule__InitialValue__Group__0__Impl"
    // InternalTraceryLanguage.g:500:1: rule__InitialValue__Group__0__Impl : ( () ) ;
    public final void rule__InitialValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:504:1: ( ( () ) )
            // InternalTraceryLanguage.g:505:1: ( () )
            {
            // InternalTraceryLanguage.g:505:1: ( () )
            // InternalTraceryLanguage.g:506:2: ()
            {
             before(grammarAccess.getInitialValueAccess().getInitialValueAction_0()); 
            // InternalTraceryLanguage.g:507:2: ()
            // InternalTraceryLanguage.g:507:3: 
            {
            }

             after(grammarAccess.getInitialValueAccess().getInitialValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__0__Impl"


    // $ANTLR start "rule__InitialValue__Group__1"
    // InternalTraceryLanguage.g:515:1: rule__InitialValue__Group__1 : rule__InitialValue__Group__1__Impl rule__InitialValue__Group__2 ;
    public final void rule__InitialValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:519:1: ( rule__InitialValue__Group__1__Impl rule__InitialValue__Group__2 )
            // InternalTraceryLanguage.g:520:2: rule__InitialValue__Group__1__Impl rule__InitialValue__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__InitialValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__1"


    // $ANTLR start "rule__InitialValue__Group__1__Impl"
    // InternalTraceryLanguage.g:527:1: rule__InitialValue__Group__1__Impl : ( '&' ) ;
    public final void rule__InitialValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:531:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:532:1: ( '&' )
            {
            // InternalTraceryLanguage.g:532:1: ( '&' )
            // InternalTraceryLanguage.g:533:2: '&'
            {
             before(grammarAccess.getInitialValueAccess().getAmpersandKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialValueAccess().getAmpersandKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__1__Impl"


    // $ANTLR start "rule__InitialValue__Group__2"
    // InternalTraceryLanguage.g:542:1: rule__InitialValue__Group__2 : rule__InitialValue__Group__2__Impl rule__InitialValue__Group__3 ;
    public final void rule__InitialValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:546:1: ( rule__InitialValue__Group__2__Impl rule__InitialValue__Group__3 )
            // InternalTraceryLanguage.g:547:2: rule__InitialValue__Group__2__Impl rule__InitialValue__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__InitialValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__2"


    // $ANTLR start "rule__InitialValue__Group__2__Impl"
    // InternalTraceryLanguage.g:554:1: rule__InitialValue__Group__2__Impl : ( ( rule__InitialValue__ValueAssignment_2 )* ) ;
    public final void rule__InitialValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:558:1: ( ( ( rule__InitialValue__ValueAssignment_2 )* ) )
            // InternalTraceryLanguage.g:559:1: ( ( rule__InitialValue__ValueAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:559:1: ( ( rule__InitialValue__ValueAssignment_2 )* )
            // InternalTraceryLanguage.g:560:2: ( rule__InitialValue__ValueAssignment_2 )*
            {
             before(grammarAccess.getInitialValueAccess().getValueAssignment_2()); 
            // InternalTraceryLanguage.g:561:2: ( rule__InitialValue__ValueAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:561:3: rule__InitialValue__ValueAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__InitialValue__ValueAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInitialValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__2__Impl"


    // $ANTLR start "rule__InitialValue__Group__3"
    // InternalTraceryLanguage.g:569:1: rule__InitialValue__Group__3 : rule__InitialValue__Group__3__Impl ;
    public final void rule__InitialValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:573:1: ( rule__InitialValue__Group__3__Impl )
            // InternalTraceryLanguage.g:574:2: rule__InitialValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__3"


    // $ANTLR start "rule__InitialValue__Group__3__Impl"
    // InternalTraceryLanguage.g:580:1: rule__InitialValue__Group__3__Impl : ( '&' ) ;
    public final void rule__InitialValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:584:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:585:1: ( '&' )
            {
            // InternalTraceryLanguage.g:585:1: ( '&' )
            // InternalTraceryLanguage.g:586:2: '&'
            {
             before(grammarAccess.getInitialValueAccess().getAmpersandKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialValueAccess().getAmpersandKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__Group__3__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_1__0"
    // InternalTraceryLanguage.g:596:1: rule__InternalInstruction__Group_1__0 : rule__InternalInstruction__Group_1__0__Impl rule__InternalInstruction__Group_1__1 ;
    public final void rule__InternalInstruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:600:1: ( rule__InternalInstruction__Group_1__0__Impl rule__InternalInstruction__Group_1__1 )
            // InternalTraceryLanguage.g:601:2: rule__InternalInstruction__Group_1__0__Impl rule__InternalInstruction__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__InternalInstruction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_1__0"


    // $ANTLR start "rule__InternalInstruction__Group_1__0__Impl"
    // InternalTraceryLanguage.g:608:1: rule__InternalInstruction__Group_1__0__Impl : ( '#' ) ;
    public final void rule__InternalInstruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:612:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:613:1: ( '#' )
            {
            // InternalTraceryLanguage.g:613:1: ( '#' )
            // InternalTraceryLanguage.g:614:2: '#'
            {
             before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_1__0__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_1__1"
    // InternalTraceryLanguage.g:623:1: rule__InternalInstruction__Group_1__1 : rule__InternalInstruction__Group_1__1__Impl rule__InternalInstruction__Group_1__2 ;
    public final void rule__InternalInstruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:627:1: ( rule__InternalInstruction__Group_1__1__Impl rule__InternalInstruction__Group_1__2 )
            // InternalTraceryLanguage.g:628:2: rule__InternalInstruction__Group_1__1__Impl rule__InternalInstruction__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__InternalInstruction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_1__1"


    // $ANTLR start "rule__InternalInstruction__Group_1__1__Impl"
    // InternalTraceryLanguage.g:635:1: rule__InternalInstruction__Group_1__1__Impl : ( ruleVariableDeclaration ) ;
    public final void rule__InternalInstruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:639:1: ( ( ruleVariableDeclaration ) )
            // InternalTraceryLanguage.g:640:1: ( ruleVariableDeclaration )
            {
            // InternalTraceryLanguage.g:640:1: ( ruleVariableDeclaration )
            // InternalTraceryLanguage.g:641:2: ruleVariableDeclaration
            {
             before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_1__1__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_1__2"
    // InternalTraceryLanguage.g:650:1: rule__InternalInstruction__Group_1__2 : rule__InternalInstruction__Group_1__2__Impl ;
    public final void rule__InternalInstruction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:654:1: ( rule__InternalInstruction__Group_1__2__Impl )
            // InternalTraceryLanguage.g:655:2: rule__InternalInstruction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_1__2"


    // $ANTLR start "rule__InternalInstruction__Group_1__2__Impl"
    // InternalTraceryLanguage.g:661:1: rule__InternalInstruction__Group_1__2__Impl : ( '.a#' ) ;
    public final void rule__InternalInstruction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:665:1: ( ( '.a#' ) )
            // InternalTraceryLanguage.g:666:1: ( '.a#' )
            {
            // InternalTraceryLanguage.g:666:1: ( '.a#' )
            // InternalTraceryLanguage.g:667:2: '.a#'
            {
             before(grammarAccess.getInternalInstructionAccess().getAKeyword_1_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getAKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_1__2__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_2__0"
    // InternalTraceryLanguage.g:677:1: rule__InternalInstruction__Group_2__0 : rule__InternalInstruction__Group_2__0__Impl rule__InternalInstruction__Group_2__1 ;
    public final void rule__InternalInstruction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:681:1: ( rule__InternalInstruction__Group_2__0__Impl rule__InternalInstruction__Group_2__1 )
            // InternalTraceryLanguage.g:682:2: rule__InternalInstruction__Group_2__0__Impl rule__InternalInstruction__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__InternalInstruction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_2__0"


    // $ANTLR start "rule__InternalInstruction__Group_2__0__Impl"
    // InternalTraceryLanguage.g:689:1: rule__InternalInstruction__Group_2__0__Impl : ( '#' ) ;
    public final void rule__InternalInstruction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:693:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:694:1: ( '#' )
            {
            // InternalTraceryLanguage.g:694:1: ( '#' )
            // InternalTraceryLanguage.g:695:2: '#'
            {
             before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_2__0__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_2__1"
    // InternalTraceryLanguage.g:704:1: rule__InternalInstruction__Group_2__1 : rule__InternalInstruction__Group_2__1__Impl rule__InternalInstruction__Group_2__2 ;
    public final void rule__InternalInstruction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:708:1: ( rule__InternalInstruction__Group_2__1__Impl rule__InternalInstruction__Group_2__2 )
            // InternalTraceryLanguage.g:709:2: rule__InternalInstruction__Group_2__1__Impl rule__InternalInstruction__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__InternalInstruction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_2__1"


    // $ANTLR start "rule__InternalInstruction__Group_2__1__Impl"
    // InternalTraceryLanguage.g:716:1: rule__InternalInstruction__Group_2__1__Impl : ( ruleVariableDeclaration ) ;
    public final void rule__InternalInstruction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:720:1: ( ( ruleVariableDeclaration ) )
            // InternalTraceryLanguage.g:721:1: ( ruleVariableDeclaration )
            {
            // InternalTraceryLanguage.g:721:1: ( ruleVariableDeclaration )
            // InternalTraceryLanguage.g:722:2: ruleVariableDeclaration
            {
             before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_2__1__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_2__2"
    // InternalTraceryLanguage.g:731:1: rule__InternalInstruction__Group_2__2 : rule__InternalInstruction__Group_2__2__Impl ;
    public final void rule__InternalInstruction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:735:1: ( rule__InternalInstruction__Group_2__2__Impl )
            // InternalTraceryLanguage.g:736:2: rule__InternalInstruction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_2__2"


    // $ANTLR start "rule__InternalInstruction__Group_2__2__Impl"
    // InternalTraceryLanguage.g:742:1: rule__InternalInstruction__Group_2__2__Impl : ( '.capitalise#' ) ;
    public final void rule__InternalInstruction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:746:1: ( ( '.capitalise#' ) )
            // InternalTraceryLanguage.g:747:1: ( '.capitalise#' )
            {
            // InternalTraceryLanguage.g:747:1: ( '.capitalise#' )
            // InternalTraceryLanguage.g:748:2: '.capitalise#'
            {
             before(grammarAccess.getInternalInstructionAccess().getCapitaliseKeyword_2_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getCapitaliseKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_2__2__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_3__0"
    // InternalTraceryLanguage.g:758:1: rule__InternalInstruction__Group_3__0 : rule__InternalInstruction__Group_3__0__Impl rule__InternalInstruction__Group_3__1 ;
    public final void rule__InternalInstruction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:762:1: ( rule__InternalInstruction__Group_3__0__Impl rule__InternalInstruction__Group_3__1 )
            // InternalTraceryLanguage.g:763:2: rule__InternalInstruction__Group_3__0__Impl rule__InternalInstruction__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__InternalInstruction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_3__0"


    // $ANTLR start "rule__InternalInstruction__Group_3__0__Impl"
    // InternalTraceryLanguage.g:770:1: rule__InternalInstruction__Group_3__0__Impl : ( '#' ) ;
    public final void rule__InternalInstruction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:774:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:775:1: ( '#' )
            {
            // InternalTraceryLanguage.g:775:1: ( '#' )
            // InternalTraceryLanguage.g:776:2: '#'
            {
             before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_3__0__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_3__1"
    // InternalTraceryLanguage.g:785:1: rule__InternalInstruction__Group_3__1 : rule__InternalInstruction__Group_3__1__Impl rule__InternalInstruction__Group_3__2 ;
    public final void rule__InternalInstruction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:789:1: ( rule__InternalInstruction__Group_3__1__Impl rule__InternalInstruction__Group_3__2 )
            // InternalTraceryLanguage.g:790:2: rule__InternalInstruction__Group_3__1__Impl rule__InternalInstruction__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__InternalInstruction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_3__1"


    // $ANTLR start "rule__InternalInstruction__Group_3__1__Impl"
    // InternalTraceryLanguage.g:797:1: rule__InternalInstruction__Group_3__1__Impl : ( ruleVariableDeclaration ) ;
    public final void rule__InternalInstruction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:801:1: ( ( ruleVariableDeclaration ) )
            // InternalTraceryLanguage.g:802:1: ( ruleVariableDeclaration )
            {
            // InternalTraceryLanguage.g:802:1: ( ruleVariableDeclaration )
            // InternalTraceryLanguage.g:803:2: ruleVariableDeclaration
            {
             before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_3__1__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_3__2"
    // InternalTraceryLanguage.g:812:1: rule__InternalInstruction__Group_3__2 : rule__InternalInstruction__Group_3__2__Impl ;
    public final void rule__InternalInstruction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:816:1: ( rule__InternalInstruction__Group_3__2__Impl )
            // InternalTraceryLanguage.g:817:2: rule__InternalInstruction__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_3__2"


    // $ANTLR start "rule__InternalInstruction__Group_3__2__Impl"
    // InternalTraceryLanguage.g:823:1: rule__InternalInstruction__Group_3__2__Impl : ( '.ed#' ) ;
    public final void rule__InternalInstruction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:827:1: ( ( '.ed#' ) )
            // InternalTraceryLanguage.g:828:1: ( '.ed#' )
            {
            // InternalTraceryLanguage.g:828:1: ( '.ed#' )
            // InternalTraceryLanguage.g:829:2: '.ed#'
            {
             before(grammarAccess.getInternalInstructionAccess().getEdKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getEdKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_3__2__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_4__0"
    // InternalTraceryLanguage.g:839:1: rule__InternalInstruction__Group_4__0 : rule__InternalInstruction__Group_4__0__Impl rule__InternalInstruction__Group_4__1 ;
    public final void rule__InternalInstruction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:843:1: ( rule__InternalInstruction__Group_4__0__Impl rule__InternalInstruction__Group_4__1 )
            // InternalTraceryLanguage.g:844:2: rule__InternalInstruction__Group_4__0__Impl rule__InternalInstruction__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__InternalInstruction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_4__0"


    // $ANTLR start "rule__InternalInstruction__Group_4__0__Impl"
    // InternalTraceryLanguage.g:851:1: rule__InternalInstruction__Group_4__0__Impl : ( '#' ) ;
    public final void rule__InternalInstruction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:855:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:856:1: ( '#' )
            {
            // InternalTraceryLanguage.g:856:1: ( '#' )
            // InternalTraceryLanguage.g:857:2: '#'
            {
             before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_4__0__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_4__1"
    // InternalTraceryLanguage.g:866:1: rule__InternalInstruction__Group_4__1 : rule__InternalInstruction__Group_4__1__Impl rule__InternalInstruction__Group_4__2 ;
    public final void rule__InternalInstruction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:870:1: ( rule__InternalInstruction__Group_4__1__Impl rule__InternalInstruction__Group_4__2 )
            // InternalTraceryLanguage.g:871:2: rule__InternalInstruction__Group_4__1__Impl rule__InternalInstruction__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__InternalInstruction__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_4__1"


    // $ANTLR start "rule__InternalInstruction__Group_4__1__Impl"
    // InternalTraceryLanguage.g:878:1: rule__InternalInstruction__Group_4__1__Impl : ( ruleVariableDeclaration ) ;
    public final void rule__InternalInstruction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:882:1: ( ( ruleVariableDeclaration ) )
            // InternalTraceryLanguage.g:883:1: ( ruleVariableDeclaration )
            {
            // InternalTraceryLanguage.g:883:1: ( ruleVariableDeclaration )
            // InternalTraceryLanguage.g:884:2: ruleVariableDeclaration
            {
             before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_4__1__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_4__2"
    // InternalTraceryLanguage.g:893:1: rule__InternalInstruction__Group_4__2 : rule__InternalInstruction__Group_4__2__Impl ;
    public final void rule__InternalInstruction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:897:1: ( rule__InternalInstruction__Group_4__2__Impl )
            // InternalTraceryLanguage.g:898:2: rule__InternalInstruction__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_4__2"


    // $ANTLR start "rule__InternalInstruction__Group_4__2__Impl"
    // InternalTraceryLanguage.g:904:1: rule__InternalInstruction__Group_4__2__Impl : ( '.the#' ) ;
    public final void rule__InternalInstruction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:908:1: ( ( '.the#' ) )
            // InternalTraceryLanguage.g:909:1: ( '.the#' )
            {
            // InternalTraceryLanguage.g:909:1: ( '.the#' )
            // InternalTraceryLanguage.g:910:2: '.the#'
            {
             before(grammarAccess.getInternalInstructionAccess().getTheKeyword_4_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getTheKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_4__2__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_5__0"
    // InternalTraceryLanguage.g:920:1: rule__InternalInstruction__Group_5__0 : rule__InternalInstruction__Group_5__0__Impl rule__InternalInstruction__Group_5__1 ;
    public final void rule__InternalInstruction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:924:1: ( rule__InternalInstruction__Group_5__0__Impl rule__InternalInstruction__Group_5__1 )
            // InternalTraceryLanguage.g:925:2: rule__InternalInstruction__Group_5__0__Impl rule__InternalInstruction__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__InternalInstruction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_5__0"


    // $ANTLR start "rule__InternalInstruction__Group_5__0__Impl"
    // InternalTraceryLanguage.g:932:1: rule__InternalInstruction__Group_5__0__Impl : ( '#' ) ;
    public final void rule__InternalInstruction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:936:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:937:1: ( '#' )
            {
            // InternalTraceryLanguage.g:937:1: ( '#' )
            // InternalTraceryLanguage.g:938:2: '#'
            {
             before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_5__0__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_5__1"
    // InternalTraceryLanguage.g:947:1: rule__InternalInstruction__Group_5__1 : rule__InternalInstruction__Group_5__1__Impl rule__InternalInstruction__Group_5__2 ;
    public final void rule__InternalInstruction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:951:1: ( rule__InternalInstruction__Group_5__1__Impl rule__InternalInstruction__Group_5__2 )
            // InternalTraceryLanguage.g:952:2: rule__InternalInstruction__Group_5__1__Impl rule__InternalInstruction__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__InternalInstruction__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_5__1"


    // $ANTLR start "rule__InternalInstruction__Group_5__1__Impl"
    // InternalTraceryLanguage.g:959:1: rule__InternalInstruction__Group_5__1__Impl : ( ruleVariableDeclaration ) ;
    public final void rule__InternalInstruction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:963:1: ( ( ruleVariableDeclaration ) )
            // InternalTraceryLanguage.g:964:1: ( ruleVariableDeclaration )
            {
            // InternalTraceryLanguage.g:964:1: ( ruleVariableDeclaration )
            // InternalTraceryLanguage.g:965:2: ruleVariableDeclaration
            {
             before(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_5__1__Impl"


    // $ANTLR start "rule__InternalInstruction__Group_5__2"
    // InternalTraceryLanguage.g:974:1: rule__InternalInstruction__Group_5__2 : rule__InternalInstruction__Group_5__2__Impl ;
    public final void rule__InternalInstruction__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:978:1: ( rule__InternalInstruction__Group_5__2__Impl )
            // InternalTraceryLanguage.g:979:2: rule__InternalInstruction__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstruction__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_5__2"


    // $ANTLR start "rule__InternalInstruction__Group_5__2__Impl"
    // InternalTraceryLanguage.g:985:1: rule__InternalInstruction__Group_5__2__Impl : ( '#' ) ;
    public final void rule__InternalInstruction__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:989:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:990:1: ( '#' )
            {
            // InternalTraceryLanguage.g:990:1: ( '#' )
            // InternalTraceryLanguage.g:991:2: '#'
            {
             before(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__Group_5__2__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__0"
    // InternalTraceryLanguage.g:1001:1: rule__StandardJSONStatement__Group__0 : rule__StandardJSONStatement__Group__0__Impl rule__StandardJSONStatement__Group__1 ;
    public final void rule__StandardJSONStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1005:1: ( rule__StandardJSONStatement__Group__0__Impl rule__StandardJSONStatement__Group__1 )
            // InternalTraceryLanguage.g:1006:2: rule__StandardJSONStatement__Group__0__Impl rule__StandardJSONStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StandardJSONStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__0"


    // $ANTLR start "rule__StandardJSONStatement__Group__0__Impl"
    // InternalTraceryLanguage.g:1013:1: rule__StandardJSONStatement__Group__0__Impl : ( ',' ) ;
    public final void rule__StandardJSONStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1017:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:1018:1: ( ',' )
            {
            // InternalTraceryLanguage.g:1018:1: ( ',' )
            // InternalTraceryLanguage.g:1019:2: ','
            {
             before(grammarAccess.getStandardJSONStatementAccess().getCommaKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStandardJSONStatementAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__0__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__1"
    // InternalTraceryLanguage.g:1028:1: rule__StandardJSONStatement__Group__1 : rule__StandardJSONStatement__Group__1__Impl rule__StandardJSONStatement__Group__2 ;
    public final void rule__StandardJSONStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1032:1: ( rule__StandardJSONStatement__Group__1__Impl rule__StandardJSONStatement__Group__2 )
            // InternalTraceryLanguage.g:1033:2: rule__StandardJSONStatement__Group__1__Impl rule__StandardJSONStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__StandardJSONStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__1"


    // $ANTLR start "rule__StandardJSONStatement__Group__1__Impl"
    // InternalTraceryLanguage.g:1040:1: rule__StandardJSONStatement__Group__1__Impl : ( '&' ) ;
    public final void rule__StandardJSONStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1044:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1045:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1045:1: ( '&' )
            // InternalTraceryLanguage.g:1046:2: '&'
            {
             before(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__1__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__2"
    // InternalTraceryLanguage.g:1055:1: rule__StandardJSONStatement__Group__2 : rule__StandardJSONStatement__Group__2__Impl rule__StandardJSONStatement__Group__3 ;
    public final void rule__StandardJSONStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1059:1: ( rule__StandardJSONStatement__Group__2__Impl rule__StandardJSONStatement__Group__3 )
            // InternalTraceryLanguage.g:1060:2: rule__StandardJSONStatement__Group__2__Impl rule__StandardJSONStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StandardJSONStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__2"


    // $ANTLR start "rule__StandardJSONStatement__Group__2__Impl"
    // InternalTraceryLanguage.g:1067:1: rule__StandardJSONStatement__Group__2__Impl : ( ruleInitialJSONExpression ) ;
    public final void rule__StandardJSONStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1071:1: ( ( ruleInitialJSONExpression ) )
            // InternalTraceryLanguage.g:1072:1: ( ruleInitialJSONExpression )
            {
            // InternalTraceryLanguage.g:1072:1: ( ruleInitialJSONExpression )
            // InternalTraceryLanguage.g:1073:2: ruleInitialJSONExpression
            {
             before(grammarAccess.getStandardJSONStatementAccess().getInitialJSONExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleInitialJSONExpression();

            state._fsp--;

             after(grammarAccess.getStandardJSONStatementAccess().getInitialJSONExpressionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__2__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__3"
    // InternalTraceryLanguage.g:1082:1: rule__StandardJSONStatement__Group__3 : rule__StandardJSONStatement__Group__3__Impl rule__StandardJSONStatement__Group__4 ;
    public final void rule__StandardJSONStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1086:1: ( rule__StandardJSONStatement__Group__3__Impl rule__StandardJSONStatement__Group__4 )
            // InternalTraceryLanguage.g:1087:2: rule__StandardJSONStatement__Group__3__Impl rule__StandardJSONStatement__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__StandardJSONStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__3"


    // $ANTLR start "rule__StandardJSONStatement__Group__3__Impl"
    // InternalTraceryLanguage.g:1094:1: rule__StandardJSONStatement__Group__3__Impl : ( '&' ) ;
    public final void rule__StandardJSONStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1098:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1099:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1099:1: ( '&' )
            // InternalTraceryLanguage.g:1100:2: '&'
            {
             before(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__3__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__4"
    // InternalTraceryLanguage.g:1109:1: rule__StandardJSONStatement__Group__4 : rule__StandardJSONStatement__Group__4__Impl rule__StandardJSONStatement__Group__5 ;
    public final void rule__StandardJSONStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1113:1: ( rule__StandardJSONStatement__Group__4__Impl rule__StandardJSONStatement__Group__5 )
            // InternalTraceryLanguage.g:1114:2: rule__StandardJSONStatement__Group__4__Impl rule__StandardJSONStatement__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__StandardJSONStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__4"


    // $ANTLR start "rule__StandardJSONStatement__Group__4__Impl"
    // InternalTraceryLanguage.g:1121:1: rule__StandardJSONStatement__Group__4__Impl : ( ':' ) ;
    public final void rule__StandardJSONStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1125:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:1126:1: ( ':' )
            {
            // InternalTraceryLanguage.g:1126:1: ( ':' )
            // InternalTraceryLanguage.g:1127:2: ':'
            {
             before(grammarAccess.getStandardJSONStatementAccess().getColonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStandardJSONStatementAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__4__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__5"
    // InternalTraceryLanguage.g:1136:1: rule__StandardJSONStatement__Group__5 : rule__StandardJSONStatement__Group__5__Impl rule__StandardJSONStatement__Group__6 ;
    public final void rule__StandardJSONStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1140:1: ( rule__StandardJSONStatement__Group__5__Impl rule__StandardJSONStatement__Group__6 )
            // InternalTraceryLanguage.g:1141:2: rule__StandardJSONStatement__Group__5__Impl rule__StandardJSONStatement__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__StandardJSONStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__5"


    // $ANTLR start "rule__StandardJSONStatement__Group__5__Impl"
    // InternalTraceryLanguage.g:1148:1: rule__StandardJSONStatement__Group__5__Impl : ( '[' ) ;
    public final void rule__StandardJSONStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1152:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:1153:1: ( '[' )
            {
            // InternalTraceryLanguage.g:1153:1: ( '[' )
            // InternalTraceryLanguage.g:1154:2: '['
            {
             before(grammarAccess.getStandardJSONStatementAccess().getLeftSquareBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStandardJSONStatementAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__5__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__6"
    // InternalTraceryLanguage.g:1163:1: rule__StandardJSONStatement__Group__6 : rule__StandardJSONStatement__Group__6__Impl rule__StandardJSONStatement__Group__7 ;
    public final void rule__StandardJSONStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1167:1: ( rule__StandardJSONStatement__Group__6__Impl rule__StandardJSONStatement__Group__7 )
            // InternalTraceryLanguage.g:1168:2: rule__StandardJSONStatement__Group__6__Impl rule__StandardJSONStatement__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__StandardJSONStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__6"


    // $ANTLR start "rule__StandardJSONStatement__Group__6__Impl"
    // InternalTraceryLanguage.g:1175:1: rule__StandardJSONStatement__Group__6__Impl : ( ( rule__StandardJSONStatement__InitialValuesAssignment_6 ) ) ;
    public final void rule__StandardJSONStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1179:1: ( ( ( rule__StandardJSONStatement__InitialValuesAssignment_6 ) ) )
            // InternalTraceryLanguage.g:1180:1: ( ( rule__StandardJSONStatement__InitialValuesAssignment_6 ) )
            {
            // InternalTraceryLanguage.g:1180:1: ( ( rule__StandardJSONStatement__InitialValuesAssignment_6 ) )
            // InternalTraceryLanguage.g:1181:2: ( rule__StandardJSONStatement__InitialValuesAssignment_6 )
            {
             before(grammarAccess.getStandardJSONStatementAccess().getInitialValuesAssignment_6()); 
            // InternalTraceryLanguage.g:1182:2: ( rule__StandardJSONStatement__InitialValuesAssignment_6 )
            // InternalTraceryLanguage.g:1182:3: rule__StandardJSONStatement__InitialValuesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__InitialValuesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStandardJSONStatementAccess().getInitialValuesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__6__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__7"
    // InternalTraceryLanguage.g:1190:1: rule__StandardJSONStatement__Group__7 : rule__StandardJSONStatement__Group__7__Impl rule__StandardJSONStatement__Group__8 ;
    public final void rule__StandardJSONStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1194:1: ( rule__StandardJSONStatement__Group__7__Impl rule__StandardJSONStatement__Group__8 )
            // InternalTraceryLanguage.g:1195:2: rule__StandardJSONStatement__Group__7__Impl rule__StandardJSONStatement__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__StandardJSONStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__7"


    // $ANTLR start "rule__StandardJSONStatement__Group__7__Impl"
    // InternalTraceryLanguage.g:1202:1: rule__StandardJSONStatement__Group__7__Impl : ( ( rule__StandardJSONStatement__StandardValuesAssignment_7 )* ) ;
    public final void rule__StandardJSONStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1206:1: ( ( ( rule__StandardJSONStatement__StandardValuesAssignment_7 )* ) )
            // InternalTraceryLanguage.g:1207:1: ( ( rule__StandardJSONStatement__StandardValuesAssignment_7 )* )
            {
            // InternalTraceryLanguage.g:1207:1: ( ( rule__StandardJSONStatement__StandardValuesAssignment_7 )* )
            // InternalTraceryLanguage.g:1208:2: ( rule__StandardJSONStatement__StandardValuesAssignment_7 )*
            {
             before(grammarAccess.getStandardJSONStatementAccess().getStandardValuesAssignment_7()); 
            // InternalTraceryLanguage.g:1209:2: ( rule__StandardJSONStatement__StandardValuesAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1209:3: rule__StandardJSONStatement__StandardValuesAssignment_7
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StandardJSONStatement__StandardValuesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStandardJSONStatementAccess().getStandardValuesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__7__Impl"


    // $ANTLR start "rule__StandardJSONStatement__Group__8"
    // InternalTraceryLanguage.g:1217:1: rule__StandardJSONStatement__Group__8 : rule__StandardJSONStatement__Group__8__Impl ;
    public final void rule__StandardJSONStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1221:1: ( rule__StandardJSONStatement__Group__8__Impl )
            // InternalTraceryLanguage.g:1222:2: rule__StandardJSONStatement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardJSONStatement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__8"


    // $ANTLR start "rule__StandardJSONStatement__Group__8__Impl"
    // InternalTraceryLanguage.g:1228:1: rule__StandardJSONStatement__Group__8__Impl : ( ']' ) ;
    public final void rule__StandardJSONStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1232:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:1233:1: ( ']' )
            {
            // InternalTraceryLanguage.g:1233:1: ( ']' )
            // InternalTraceryLanguage.g:1234:2: ']'
            {
             before(grammarAccess.getStandardJSONStatementAccess().getRightSquareBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStandardJSONStatementAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__Group__8__Impl"


    // $ANTLR start "rule__StartingJSONStatement__Group__0"
    // InternalTraceryLanguage.g:1244:1: rule__StartingJSONStatement__Group__0 : rule__StartingJSONStatement__Group__0__Impl rule__StartingJSONStatement__Group__1 ;
    public final void rule__StartingJSONStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1248:1: ( rule__StartingJSONStatement__Group__0__Impl rule__StartingJSONStatement__Group__1 )
            // InternalTraceryLanguage.g:1249:2: rule__StartingJSONStatement__Group__0__Impl rule__StartingJSONStatement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__StartingJSONStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__0"


    // $ANTLR start "rule__StartingJSONStatement__Group__0__Impl"
    // InternalTraceryLanguage.g:1256:1: rule__StartingJSONStatement__Group__0__Impl : ( '&origin&' ) ;
    public final void rule__StartingJSONStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1260:1: ( ( '&origin&' ) )
            // InternalTraceryLanguage.g:1261:1: ( '&origin&' )
            {
            // InternalTraceryLanguage.g:1261:1: ( '&origin&' )
            // InternalTraceryLanguage.g:1262:2: '&origin&'
            {
             before(grammarAccess.getStartingJSONStatementAccess().getOriginKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStartingJSONStatementAccess().getOriginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__0__Impl"


    // $ANTLR start "rule__StartingJSONStatement__Group__1"
    // InternalTraceryLanguage.g:1271:1: rule__StartingJSONStatement__Group__1 : rule__StartingJSONStatement__Group__1__Impl rule__StartingJSONStatement__Group__2 ;
    public final void rule__StartingJSONStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1275:1: ( rule__StartingJSONStatement__Group__1__Impl rule__StartingJSONStatement__Group__2 )
            // InternalTraceryLanguage.g:1276:2: rule__StartingJSONStatement__Group__1__Impl rule__StartingJSONStatement__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__StartingJSONStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__1"


    // $ANTLR start "rule__StartingJSONStatement__Group__1__Impl"
    // InternalTraceryLanguage.g:1283:1: rule__StartingJSONStatement__Group__1__Impl : ( ':' ) ;
    public final void rule__StartingJSONStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1287:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:1288:1: ( ':' )
            {
            // InternalTraceryLanguage.g:1288:1: ( ':' )
            // InternalTraceryLanguage.g:1289:2: ':'
            {
             before(grammarAccess.getStartingJSONStatementAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStartingJSONStatementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__1__Impl"


    // $ANTLR start "rule__StartingJSONStatement__Group__2"
    // InternalTraceryLanguage.g:1298:1: rule__StartingJSONStatement__Group__2 : rule__StartingJSONStatement__Group__2__Impl rule__StartingJSONStatement__Group__3 ;
    public final void rule__StartingJSONStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1302:1: ( rule__StartingJSONStatement__Group__2__Impl rule__StartingJSONStatement__Group__3 )
            // InternalTraceryLanguage.g:1303:2: rule__StartingJSONStatement__Group__2__Impl rule__StartingJSONStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StartingJSONStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__2"


    // $ANTLR start "rule__StartingJSONStatement__Group__2__Impl"
    // InternalTraceryLanguage.g:1310:1: rule__StartingJSONStatement__Group__2__Impl : ( '[' ) ;
    public final void rule__StartingJSONStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1314:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:1315:1: ( '[' )
            {
            // InternalTraceryLanguage.g:1315:1: ( '[' )
            // InternalTraceryLanguage.g:1316:2: '['
            {
             before(grammarAccess.getStartingJSONStatementAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStartingJSONStatementAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__2__Impl"


    // $ANTLR start "rule__StartingJSONStatement__Group__3"
    // InternalTraceryLanguage.g:1325:1: rule__StartingJSONStatement__Group__3 : rule__StartingJSONStatement__Group__3__Impl rule__StartingJSONStatement__Group__4 ;
    public final void rule__StartingJSONStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1329:1: ( rule__StartingJSONStatement__Group__3__Impl rule__StartingJSONStatement__Group__4 )
            // InternalTraceryLanguage.g:1330:2: rule__StartingJSONStatement__Group__3__Impl rule__StartingJSONStatement__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__StartingJSONStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__3"


    // $ANTLR start "rule__StartingJSONStatement__Group__3__Impl"
    // InternalTraceryLanguage.g:1337:1: rule__StartingJSONStatement__Group__3__Impl : ( ( rule__StartingJSONStatement__InitialValuesAssignment_3 ) ) ;
    public final void rule__StartingJSONStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1341:1: ( ( ( rule__StartingJSONStatement__InitialValuesAssignment_3 ) ) )
            // InternalTraceryLanguage.g:1342:1: ( ( rule__StartingJSONStatement__InitialValuesAssignment_3 ) )
            {
            // InternalTraceryLanguage.g:1342:1: ( ( rule__StartingJSONStatement__InitialValuesAssignment_3 ) )
            // InternalTraceryLanguage.g:1343:2: ( rule__StartingJSONStatement__InitialValuesAssignment_3 )
            {
             before(grammarAccess.getStartingJSONStatementAccess().getInitialValuesAssignment_3()); 
            // InternalTraceryLanguage.g:1344:2: ( rule__StartingJSONStatement__InitialValuesAssignment_3 )
            // InternalTraceryLanguage.g:1344:3: rule__StartingJSONStatement__InitialValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__InitialValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStartingJSONStatementAccess().getInitialValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__3__Impl"


    // $ANTLR start "rule__StartingJSONStatement__Group__4"
    // InternalTraceryLanguage.g:1352:1: rule__StartingJSONStatement__Group__4 : rule__StartingJSONStatement__Group__4__Impl rule__StartingJSONStatement__Group__5 ;
    public final void rule__StartingJSONStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1356:1: ( rule__StartingJSONStatement__Group__4__Impl rule__StartingJSONStatement__Group__5 )
            // InternalTraceryLanguage.g:1357:2: rule__StartingJSONStatement__Group__4__Impl rule__StartingJSONStatement__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__StartingJSONStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__4"


    // $ANTLR start "rule__StartingJSONStatement__Group__4__Impl"
    // InternalTraceryLanguage.g:1364:1: rule__StartingJSONStatement__Group__4__Impl : ( ( rule__StartingJSONStatement__StandardValuesAssignment_4 )* ) ;
    public final void rule__StartingJSONStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1368:1: ( ( ( rule__StartingJSONStatement__StandardValuesAssignment_4 )* ) )
            // InternalTraceryLanguage.g:1369:1: ( ( rule__StartingJSONStatement__StandardValuesAssignment_4 )* )
            {
            // InternalTraceryLanguage.g:1369:1: ( ( rule__StartingJSONStatement__StandardValuesAssignment_4 )* )
            // InternalTraceryLanguage.g:1370:2: ( rule__StartingJSONStatement__StandardValuesAssignment_4 )*
            {
             before(grammarAccess.getStartingJSONStatementAccess().getStandardValuesAssignment_4()); 
            // InternalTraceryLanguage.g:1371:2: ( rule__StartingJSONStatement__StandardValuesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1371:3: rule__StartingJSONStatement__StandardValuesAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StartingJSONStatement__StandardValuesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStartingJSONStatementAccess().getStandardValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__4__Impl"


    // $ANTLR start "rule__StartingJSONStatement__Group__5"
    // InternalTraceryLanguage.g:1379:1: rule__StartingJSONStatement__Group__5 : rule__StartingJSONStatement__Group__5__Impl ;
    public final void rule__StartingJSONStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1383:1: ( rule__StartingJSONStatement__Group__5__Impl )
            // InternalTraceryLanguage.g:1384:2: rule__StartingJSONStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartingJSONStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__5"


    // $ANTLR start "rule__StartingJSONStatement__Group__5__Impl"
    // InternalTraceryLanguage.g:1390:1: rule__StartingJSONStatement__Group__5__Impl : ( ']' ) ;
    public final void rule__StartingJSONStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1394:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:1395:1: ( ']' )
            {
            // InternalTraceryLanguage.g:1395:1: ( ']' )
            // InternalTraceryLanguage.g:1396:2: ']'
            {
             before(grammarAccess.getStartingJSONStatementAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStartingJSONStatementAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__Group__5__Impl"


    // $ANTLR start "rule__StandardValue__Group__0"
    // InternalTraceryLanguage.g:1406:1: rule__StandardValue__Group__0 : rule__StandardValue__Group__0__Impl rule__StandardValue__Group__1 ;
    public final void rule__StandardValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1410:1: ( rule__StandardValue__Group__0__Impl rule__StandardValue__Group__1 )
            // InternalTraceryLanguage.g:1411:2: rule__StandardValue__Group__0__Impl rule__StandardValue__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__StandardValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__0"


    // $ANTLR start "rule__StandardValue__Group__0__Impl"
    // InternalTraceryLanguage.g:1418:1: rule__StandardValue__Group__0__Impl : ( () ) ;
    public final void rule__StandardValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1422:1: ( ( () ) )
            // InternalTraceryLanguage.g:1423:1: ( () )
            {
            // InternalTraceryLanguage.g:1423:1: ( () )
            // InternalTraceryLanguage.g:1424:2: ()
            {
             before(grammarAccess.getStandardValueAccess().getStandardValueAction_0()); 
            // InternalTraceryLanguage.g:1425:2: ()
            // InternalTraceryLanguage.g:1425:3: 
            {
            }

             after(grammarAccess.getStandardValueAccess().getStandardValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__0__Impl"


    // $ANTLR start "rule__StandardValue__Group__1"
    // InternalTraceryLanguage.g:1433:1: rule__StandardValue__Group__1 : rule__StandardValue__Group__1__Impl rule__StandardValue__Group__2 ;
    public final void rule__StandardValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1437:1: ( rule__StandardValue__Group__1__Impl rule__StandardValue__Group__2 )
            // InternalTraceryLanguage.g:1438:2: rule__StandardValue__Group__1__Impl rule__StandardValue__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StandardValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__1"


    // $ANTLR start "rule__StandardValue__Group__1__Impl"
    // InternalTraceryLanguage.g:1445:1: rule__StandardValue__Group__1__Impl : ( ',' ) ;
    public final void rule__StandardValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1449:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:1450:1: ( ',' )
            {
            // InternalTraceryLanguage.g:1450:1: ( ',' )
            // InternalTraceryLanguage.g:1451:2: ','
            {
             before(grammarAccess.getStandardValueAccess().getCommaKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStandardValueAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__1__Impl"


    // $ANTLR start "rule__StandardValue__Group__2"
    // InternalTraceryLanguage.g:1460:1: rule__StandardValue__Group__2 : rule__StandardValue__Group__2__Impl rule__StandardValue__Group__3 ;
    public final void rule__StandardValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1464:1: ( rule__StandardValue__Group__2__Impl rule__StandardValue__Group__3 )
            // InternalTraceryLanguage.g:1465:2: rule__StandardValue__Group__2__Impl rule__StandardValue__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__StandardValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__2"


    // $ANTLR start "rule__StandardValue__Group__2__Impl"
    // InternalTraceryLanguage.g:1472:1: rule__StandardValue__Group__2__Impl : ( '&' ) ;
    public final void rule__StandardValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1476:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1477:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1477:1: ( '&' )
            // InternalTraceryLanguage.g:1478:2: '&'
            {
             before(grammarAccess.getStandardValueAccess().getAmpersandKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStandardValueAccess().getAmpersandKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__2__Impl"


    // $ANTLR start "rule__StandardValue__Group__3"
    // InternalTraceryLanguage.g:1487:1: rule__StandardValue__Group__3 : rule__StandardValue__Group__3__Impl rule__StandardValue__Group__4 ;
    public final void rule__StandardValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1491:1: ( rule__StandardValue__Group__3__Impl rule__StandardValue__Group__4 )
            // InternalTraceryLanguage.g:1492:2: rule__StandardValue__Group__3__Impl rule__StandardValue__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__StandardValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__3"


    // $ANTLR start "rule__StandardValue__Group__3__Impl"
    // InternalTraceryLanguage.g:1499:1: rule__StandardValue__Group__3__Impl : ( ( rule__StandardValue__ValueAssignment_3 )* ) ;
    public final void rule__StandardValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1503:1: ( ( ( rule__StandardValue__ValueAssignment_3 )* ) )
            // InternalTraceryLanguage.g:1504:1: ( ( rule__StandardValue__ValueAssignment_3 )* )
            {
            // InternalTraceryLanguage.g:1504:1: ( ( rule__StandardValue__ValueAssignment_3 )* )
            // InternalTraceryLanguage.g:1505:2: ( rule__StandardValue__ValueAssignment_3 )*
            {
             before(grammarAccess.getStandardValueAccess().getValueAssignment_3()); 
            // InternalTraceryLanguage.g:1506:2: ( rule__StandardValue__ValueAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1506:3: rule__StandardValue__ValueAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StandardValue__ValueAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStandardValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__3__Impl"


    // $ANTLR start "rule__StandardValue__Group__4"
    // InternalTraceryLanguage.g:1514:1: rule__StandardValue__Group__4 : rule__StandardValue__Group__4__Impl ;
    public final void rule__StandardValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1518:1: ( rule__StandardValue__Group__4__Impl )
            // InternalTraceryLanguage.g:1519:2: rule__StandardValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__4"


    // $ANTLR start "rule__StandardValue__Group__4__Impl"
    // InternalTraceryLanguage.g:1525:1: rule__StandardValue__Group__4__Impl : ( '&' ) ;
    public final void rule__StandardValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1529:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1530:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1530:1: ( '&' )
            // InternalTraceryLanguage.g:1531:2: '&'
            {
             before(grammarAccess.getStandardValueAccess().getAmpersandKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStandardValueAccess().getAmpersandKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__Group__4__Impl"


    // $ANTLR start "rule__TraceryProgram__InstructionsAssignment_2"
    // InternalTraceryLanguage.g:1541:1: rule__TraceryProgram__InstructionsAssignment_2 : ( ruleStandardJSONStatement ) ;
    public final void rule__TraceryProgram__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1545:1: ( ( ruleStandardJSONStatement ) )
            // InternalTraceryLanguage.g:1546:2: ( ruleStandardJSONStatement )
            {
            // InternalTraceryLanguage.g:1546:2: ( ruleStandardJSONStatement )
            // InternalTraceryLanguage.g:1547:3: ruleStandardJSONStatement
            {
             before(grammarAccess.getTraceryProgramAccess().getInstructionsStandardJSONStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStandardJSONStatement();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getInstructionsStandardJSONStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__InstructionsAssignment_2"


    // $ANTLR start "rule__TraceryProgram__StartingInstructionAssignment_3"
    // InternalTraceryLanguage.g:1556:1: rule__TraceryProgram__StartingInstructionAssignment_3 : ( ruleStartingJSONStatement ) ;
    public final void rule__TraceryProgram__StartingInstructionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1560:1: ( ( ruleStartingJSONStatement ) )
            // InternalTraceryLanguage.g:1561:2: ( ruleStartingJSONStatement )
            {
            // InternalTraceryLanguage.g:1561:2: ( ruleStartingJSONStatement )
            // InternalTraceryLanguage.g:1562:3: ruleStartingJSONStatement
            {
             before(grammarAccess.getTraceryProgramAccess().getStartingInstructionStartingJSONStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingJSONStatement();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getStartingInstructionStartingJSONStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__StartingInstructionAssignment_3"


    // $ANTLR start "rule__InitialJSONExpression__VarAssignment"
    // InternalTraceryLanguage.g:1571:1: rule__InitialJSONExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__InitialJSONExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1575:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:1576:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:1576:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1577:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTraceryLanguage.g:1578:3: ( RULE_ID )
            // InternalTraceryLanguage.g:1579:4: RULE_ID
            {
             before(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialJSONExpression__VarAssignment"


    // $ANTLR start "rule__InitialValue__ValueAssignment_2"
    // InternalTraceryLanguage.g:1590:1: rule__InitialValue__ValueAssignment_2 : ( ruleInternalInstruction ) ;
    public final void rule__InitialValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1594:1: ( ( ruleInternalInstruction ) )
            // InternalTraceryLanguage.g:1595:2: ( ruleInternalInstruction )
            {
            // InternalTraceryLanguage.g:1595:2: ( ruleInternalInstruction )
            // InternalTraceryLanguage.g:1596:3: ruleInternalInstruction
            {
             before(grammarAccess.getInitialValueAccess().getValueInternalInstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInternalInstruction();

            state._fsp--;

             after(grammarAccess.getInitialValueAccess().getValueInternalInstructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialValue__ValueAssignment_2"


    // $ANTLR start "rule__InternalInstruction__ValueAssignment_0"
    // InternalTraceryLanguage.g:1605:1: rule__InternalInstruction__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InternalInstruction__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1609:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:1610:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:1610:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:1611:3: RULE_STRING
            {
             before(grammarAccess.getInternalInstructionAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInternalInstructionAccess().getValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInstruction__ValueAssignment_0"


    // $ANTLR start "rule__StandardJSONStatement__InitialValuesAssignment_6"
    // InternalTraceryLanguage.g:1620:1: rule__StandardJSONStatement__InitialValuesAssignment_6 : ( ruleinitialValue ) ;
    public final void rule__StandardJSONStatement__InitialValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1624:1: ( ( ruleinitialValue ) )
            // InternalTraceryLanguage.g:1625:2: ( ruleinitialValue )
            {
            // InternalTraceryLanguage.g:1625:2: ( ruleinitialValue )
            // InternalTraceryLanguage.g:1626:3: ruleinitialValue
            {
             before(grammarAccess.getStandardJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleinitialValue();

            state._fsp--;

             after(grammarAccess.getStandardJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__InitialValuesAssignment_6"


    // $ANTLR start "rule__StandardJSONStatement__StandardValuesAssignment_7"
    // InternalTraceryLanguage.g:1635:1: rule__StandardJSONStatement__StandardValuesAssignment_7 : ( rulestandardValue ) ;
    public final void rule__StandardJSONStatement__StandardValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1639:1: ( ( rulestandardValue ) )
            // InternalTraceryLanguage.g:1640:2: ( rulestandardValue )
            {
            // InternalTraceryLanguage.g:1640:2: ( rulestandardValue )
            // InternalTraceryLanguage.g:1641:3: rulestandardValue
            {
             before(grammarAccess.getStandardJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulestandardValue();

            state._fsp--;

             after(grammarAccess.getStandardJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardJSONStatement__StandardValuesAssignment_7"


    // $ANTLR start "rule__StartingJSONStatement__InitialValuesAssignment_3"
    // InternalTraceryLanguage.g:1650:1: rule__StartingJSONStatement__InitialValuesAssignment_3 : ( ruleinitialValue ) ;
    public final void rule__StartingJSONStatement__InitialValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1654:1: ( ( ruleinitialValue ) )
            // InternalTraceryLanguage.g:1655:2: ( ruleinitialValue )
            {
            // InternalTraceryLanguage.g:1655:2: ( ruleinitialValue )
            // InternalTraceryLanguage.g:1656:3: ruleinitialValue
            {
             before(grammarAccess.getStartingJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleinitialValue();

            state._fsp--;

             after(grammarAccess.getStartingJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__InitialValuesAssignment_3"


    // $ANTLR start "rule__StartingJSONStatement__StandardValuesAssignment_4"
    // InternalTraceryLanguage.g:1665:1: rule__StartingJSONStatement__StandardValuesAssignment_4 : ( rulestandardValue ) ;
    public final void rule__StartingJSONStatement__StandardValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1669:1: ( ( rulestandardValue ) )
            // InternalTraceryLanguage.g:1670:2: ( rulestandardValue )
            {
            // InternalTraceryLanguage.g:1670:2: ( rulestandardValue )
            // InternalTraceryLanguage.g:1671:3: rulestandardValue
            {
             before(grammarAccess.getStartingJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulestandardValue();

            state._fsp--;

             after(grammarAccess.getStartingJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingJSONStatement__StandardValuesAssignment_4"


    // $ANTLR start "rule__StandardValue__ValueAssignment_3"
    // InternalTraceryLanguage.g:1680:1: rule__StandardValue__ValueAssignment_3 : ( ruleInternalInstruction ) ;
    public final void rule__StandardValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1684:1: ( ( ruleInternalInstruction ) )
            // InternalTraceryLanguage.g:1685:2: ( ruleInternalInstruction )
            {
            // InternalTraceryLanguage.g:1685:2: ( ruleInternalInstruction )
            // InternalTraceryLanguage.g:1686:3: ruleInternalInstruction
            {
             before(grammarAccess.getStandardValueAccess().getValueInternalInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInternalInstruction();

            state._fsp--;

             after(grammarAccess.getStandardValueAccess().getValueInternalInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardValue__ValueAssignment_3"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment"
    // InternalTraceryLanguage.g:1695:1: rule__VariableDeclaration__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1699:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1700:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:1700:2: ( RULE_ID )
            // InternalTraceryLanguage.g:1701:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});

}