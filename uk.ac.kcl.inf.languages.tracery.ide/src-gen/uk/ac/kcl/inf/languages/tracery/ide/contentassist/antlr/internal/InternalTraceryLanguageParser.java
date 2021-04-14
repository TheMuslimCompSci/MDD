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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'&'", "':'", "'['", "']'", "','", "'&origin&'", "'#'"
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
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start "entryRuleFirstJSONStatements"
    // InternalTraceryLanguage.g:78:1: entryRuleFirstJSONStatements : ruleFirstJSONStatements EOF ;
    public final void entryRuleFirstJSONStatements() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:82:1: ( ruleFirstJSONStatements EOF )
            // InternalTraceryLanguage.g:83:1: ruleFirstJSONStatements EOF
            {
             before(grammarAccess.getFirstJSONStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleFirstJSONStatements();

            state._fsp--;

             after(grammarAccess.getFirstJSONStatementsRule()); 
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
    // $ANTLR end "entryRuleFirstJSONStatements"


    // $ANTLR start "ruleFirstJSONStatements"
    // InternalTraceryLanguage.g:93:1: ruleFirstJSONStatements : ( ( rule__FirstJSONStatements__Group__0 ) ) ;
    public final void ruleFirstJSONStatements() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:98:2: ( ( ( rule__FirstJSONStatements__Group__0 ) ) )
            // InternalTraceryLanguage.g:99:2: ( ( rule__FirstJSONStatements__Group__0 ) )
            {
            // InternalTraceryLanguage.g:99:2: ( ( rule__FirstJSONStatements__Group__0 ) )
            // InternalTraceryLanguage.g:100:3: ( rule__FirstJSONStatements__Group__0 )
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getGroup()); 
            // InternalTraceryLanguage.g:101:3: ( rule__FirstJSONStatements__Group__0 )
            // InternalTraceryLanguage.g:101:4: rule__FirstJSONStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFirstJSONStatementsAccess().getGroup()); 

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
    // $ANTLR end "ruleFirstJSONStatements"


    // $ANTLR start "entryRuleFirstJSONFinish"
    // InternalTraceryLanguage.g:111:1: entryRuleFirstJSONFinish : ruleFirstJSONFinish EOF ;
    public final void entryRuleFirstJSONFinish() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:115:1: ( ruleFirstJSONFinish EOF )
            // InternalTraceryLanguage.g:116:1: ruleFirstJSONFinish EOF
            {
             before(grammarAccess.getFirstJSONFinishRule()); 
            pushFollow(FOLLOW_1);
            ruleFirstJSONFinish();

            state._fsp--;

             after(grammarAccess.getFirstJSONFinishRule()); 
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
    // $ANTLR end "entryRuleFirstJSONFinish"


    // $ANTLR start "ruleFirstJSONFinish"
    // InternalTraceryLanguage.g:126:1: ruleFirstJSONFinish : ( ( rule__FirstJSONFinish__Group__0 ) ) ;
    public final void ruleFirstJSONFinish() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:131:2: ( ( ( rule__FirstJSONFinish__Group__0 ) ) )
            // InternalTraceryLanguage.g:132:2: ( ( rule__FirstJSONFinish__Group__0 ) )
            {
            // InternalTraceryLanguage.g:132:2: ( ( rule__FirstJSONFinish__Group__0 ) )
            // InternalTraceryLanguage.g:133:3: ( rule__FirstJSONFinish__Group__0 )
            {
             before(grammarAccess.getFirstJSONFinishAccess().getGroup()); 
            // InternalTraceryLanguage.g:134:3: ( rule__FirstJSONFinish__Group__0 )
            // InternalTraceryLanguage.g:134:4: rule__FirstJSONFinish__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FirstJSONFinish__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFirstJSONFinishAccess().getGroup()); 

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
    // $ANTLR end "ruleFirstJSONFinish"


    // $ANTLR start "entryRuleInitialVal"
    // InternalTraceryLanguage.g:144:1: entryRuleInitialVal : ruleInitialVal EOF ;
    public final void entryRuleInitialVal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:148:1: ( ruleInitialVal EOF )
            // InternalTraceryLanguage.g:149:1: ruleInitialVal EOF
            {
             before(grammarAccess.getInitialValRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialVal();

            state._fsp--;

             after(grammarAccess.getInitialValRule()); 
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
    // $ANTLR end "entryRuleInitialVal"


    // $ANTLR start "ruleInitialVal"
    // InternalTraceryLanguage.g:159:1: ruleInitialVal : ( ( rule__InitialVal__Group__0 ) ) ;
    public final void ruleInitialVal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:164:2: ( ( ( rule__InitialVal__Group__0 ) ) )
            // InternalTraceryLanguage.g:165:2: ( ( rule__InitialVal__Group__0 ) )
            {
            // InternalTraceryLanguage.g:165:2: ( ( rule__InitialVal__Group__0 ) )
            // InternalTraceryLanguage.g:166:3: ( rule__InitialVal__Group__0 )
            {
             before(grammarAccess.getInitialValAccess().getGroup()); 
            // InternalTraceryLanguage.g:167:3: ( rule__InitialVal__Group__0 )
            // InternalTraceryLanguage.g:167:4: rule__InitialVal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialVal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialValAccess().getGroup()); 

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
    // $ANTLR end "ruleInitialVal"


    // $ANTLR start "entryRuleInstruction"
    // InternalTraceryLanguage.g:177:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:181:1: ( ruleInstruction EOF )
            // InternalTraceryLanguage.g:182:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalTraceryLanguage.g:192:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:197:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // InternalTraceryLanguage.g:198:2: ( ( rule__Instruction__Group__0 ) )
            {
            // InternalTraceryLanguage.g:198:2: ( ( rule__Instruction__Group__0 ) )
            // InternalTraceryLanguage.g:199:3: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // InternalTraceryLanguage.g:200:3: ( rule__Instruction__Group__0 )
            // InternalTraceryLanguage.g:200:4: rule__Instruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getGroup()); 

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInternalInstructions"
    // InternalTraceryLanguage.g:210:1: entryRuleInternalInstructions : ruleInternalInstructions EOF ;
    public final void entryRuleInternalInstructions() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:214:1: ( ruleInternalInstructions EOF )
            // InternalTraceryLanguage.g:215:1: ruleInternalInstructions EOF
            {
             before(grammarAccess.getInternalInstructionsRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalInstructions();

            state._fsp--;

             after(grammarAccess.getInternalInstructionsRule()); 
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
    // $ANTLR end "entryRuleInternalInstructions"


    // $ANTLR start "ruleInternalInstructions"
    // InternalTraceryLanguage.g:225:1: ruleInternalInstructions : ( ( rule__InternalInstructions__Alternatives ) ) ;
    public final void ruleInternalInstructions() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:230:2: ( ( ( rule__InternalInstructions__Alternatives ) ) )
            // InternalTraceryLanguage.g:231:2: ( ( rule__InternalInstructions__Alternatives ) )
            {
            // InternalTraceryLanguage.g:231:2: ( ( rule__InternalInstructions__Alternatives ) )
            // InternalTraceryLanguage.g:232:3: ( rule__InternalInstructions__Alternatives )
            {
             before(grammarAccess.getInternalInstructionsAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:233:3: ( rule__InternalInstructions__Alternatives )
            // InternalTraceryLanguage.g:233:4: rule__InternalInstructions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InternalInstructions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInternalInstructionsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInternalInstructions"


    // $ANTLR start "entryRuleInternalVals"
    // InternalTraceryLanguage.g:243:1: entryRuleInternalVals : ruleInternalVals EOF ;
    public final void entryRuleInternalVals() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:247:1: ( ruleInternalVals EOF )
            // InternalTraceryLanguage.g:248:1: ruleInternalVals EOF
            {
             before(grammarAccess.getInternalValsRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalVals();

            state._fsp--;

             after(grammarAccess.getInternalValsRule()); 
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
    // $ANTLR end "entryRuleInternalVals"


    // $ANTLR start "ruleInternalVals"
    // InternalTraceryLanguage.g:258:1: ruleInternalVals : ( ( rule__InternalVals__Group__0 ) ) ;
    public final void ruleInternalVals() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:263:2: ( ( ( rule__InternalVals__Group__0 ) ) )
            // InternalTraceryLanguage.g:264:2: ( ( rule__InternalVals__Group__0 ) )
            {
            // InternalTraceryLanguage.g:264:2: ( ( rule__InternalVals__Group__0 ) )
            // InternalTraceryLanguage.g:265:3: ( rule__InternalVals__Group__0 )
            {
             before(grammarAccess.getInternalValsAccess().getGroup()); 
            // InternalTraceryLanguage.g:266:3: ( rule__InternalVals__Group__0 )
            // InternalTraceryLanguage.g:266:4: rule__InternalVals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternalVals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalValsAccess().getGroup()); 

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
    // $ANTLR end "ruleInternalVals"


    // $ANTLR start "entryRuleLastJSONFinish"
    // InternalTraceryLanguage.g:276:1: entryRuleLastJSONFinish : ruleLastJSONFinish EOF ;
    public final void entryRuleLastJSONFinish() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:280:1: ( ruleLastJSONFinish EOF )
            // InternalTraceryLanguage.g:281:1: ruleLastJSONFinish EOF
            {
             before(grammarAccess.getLastJSONFinishRule()); 
            pushFollow(FOLLOW_1);
            ruleLastJSONFinish();

            state._fsp--;

             after(grammarAccess.getLastJSONFinishRule()); 
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
    // $ANTLR end "entryRuleLastJSONFinish"


    // $ANTLR start "ruleLastJSONFinish"
    // InternalTraceryLanguage.g:291:1: ruleLastJSONFinish : ( ( rule__LastJSONFinish__Group__0 ) ) ;
    public final void ruleLastJSONFinish() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:296:2: ( ( ( rule__LastJSONFinish__Group__0 ) ) )
            // InternalTraceryLanguage.g:297:2: ( ( rule__LastJSONFinish__Group__0 ) )
            {
            // InternalTraceryLanguage.g:297:2: ( ( rule__LastJSONFinish__Group__0 ) )
            // InternalTraceryLanguage.g:298:3: ( rule__LastJSONFinish__Group__0 )
            {
             before(grammarAccess.getLastJSONFinishAccess().getGroup()); 
            // InternalTraceryLanguage.g:299:3: ( rule__LastJSONFinish__Group__0 )
            // InternalTraceryLanguage.g:299:4: rule__LastJSONFinish__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LastJSONFinish__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLastJSONFinishAccess().getGroup()); 

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
    // $ANTLR end "ruleLastJSONFinish"


    // $ANTLR start "entryRuleLastJSONStatement"
    // InternalTraceryLanguage.g:309:1: entryRuleLastJSONStatement : ruleLastJSONStatement EOF ;
    public final void entryRuleLastJSONStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:313:1: ( ruleLastJSONStatement EOF )
            // InternalTraceryLanguage.g:314:1: ruleLastJSONStatement EOF
            {
             before(grammarAccess.getLastJSONStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLastJSONStatement();

            state._fsp--;

             after(grammarAccess.getLastJSONStatementRule()); 
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
    // $ANTLR end "entryRuleLastJSONStatement"


    // $ANTLR start "ruleLastJSONStatement"
    // InternalTraceryLanguage.g:324:1: ruleLastJSONStatement : ( ( rule__LastJSONStatement__Group__0 ) ) ;
    public final void ruleLastJSONStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:329:2: ( ( ( rule__LastJSONStatement__Group__0 ) ) )
            // InternalTraceryLanguage.g:330:2: ( ( rule__LastJSONStatement__Group__0 ) )
            {
            // InternalTraceryLanguage.g:330:2: ( ( rule__LastJSONStatement__Group__0 ) )
            // InternalTraceryLanguage.g:331:3: ( rule__LastJSONStatement__Group__0 )
            {
             before(grammarAccess.getLastJSONStatementAccess().getGroup()); 
            // InternalTraceryLanguage.g:332:3: ( rule__LastJSONStatement__Group__0 )
            // InternalTraceryLanguage.g:332:4: rule__LastJSONStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LastJSONStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLastJSONStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleLastJSONStatement"


    // $ANTLR start "entryRuleStandardVal"
    // InternalTraceryLanguage.g:342:1: entryRuleStandardVal : ruleStandardVal EOF ;
    public final void entryRuleStandardVal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:346:1: ( ruleStandardVal EOF )
            // InternalTraceryLanguage.g:347:1: ruleStandardVal EOF
            {
             before(grammarAccess.getStandardValRule()); 
            pushFollow(FOLLOW_1);
            ruleStandardVal();

            state._fsp--;

             after(grammarAccess.getStandardValRule()); 
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
    // $ANTLR end "entryRuleStandardVal"


    // $ANTLR start "ruleStandardVal"
    // InternalTraceryLanguage.g:357:1: ruleStandardVal : ( ( rule__StandardVal__Group__0 ) ) ;
    public final void ruleStandardVal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:362:2: ( ( ( rule__StandardVal__Group__0 ) ) )
            // InternalTraceryLanguage.g:363:2: ( ( rule__StandardVal__Group__0 ) )
            {
            // InternalTraceryLanguage.g:363:2: ( ( rule__StandardVal__Group__0 ) )
            // InternalTraceryLanguage.g:364:3: ( rule__StandardVal__Group__0 )
            {
             before(grammarAccess.getStandardValAccess().getGroup()); 
            // InternalTraceryLanguage.g:365:3: ( rule__StandardVal__Group__0 )
            // InternalTraceryLanguage.g:365:4: rule__StandardVal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StandardVal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardValAccess().getGroup()); 

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
    // $ANTLR end "ruleStandardVal"


    // $ANTLR start "entryRuleStringDeclaration"
    // InternalTraceryLanguage.g:375:1: entryRuleStringDeclaration : ruleStringDeclaration EOF ;
    public final void entryRuleStringDeclaration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:379:1: ( ruleStringDeclaration EOF )
            // InternalTraceryLanguage.g:380:1: ruleStringDeclaration EOF
            {
             before(grammarAccess.getStringDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringDeclaration();

            state._fsp--;

             after(grammarAccess.getStringDeclarationRule()); 
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
    // $ANTLR end "entryRuleStringDeclaration"


    // $ANTLR start "ruleStringDeclaration"
    // InternalTraceryLanguage.g:390:1: ruleStringDeclaration : ( ( rule__StringDeclaration__ValueAssignment ) ) ;
    public final void ruleStringDeclaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:395:2: ( ( ( rule__StringDeclaration__ValueAssignment ) ) )
            // InternalTraceryLanguage.g:396:2: ( ( rule__StringDeclaration__ValueAssignment ) )
            {
            // InternalTraceryLanguage.g:396:2: ( ( rule__StringDeclaration__ValueAssignment ) )
            // InternalTraceryLanguage.g:397:3: ( rule__StringDeclaration__ValueAssignment )
            {
             before(grammarAccess.getStringDeclarationAccess().getValueAssignment()); 
            // InternalTraceryLanguage.g:398:3: ( rule__StringDeclaration__ValueAssignment )
            // InternalTraceryLanguage.g:398:4: rule__StringDeclaration__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTraceryLanguage.g:408:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:412:1: ( ruleVariableDeclaration EOF )
            // InternalTraceryLanguage.g:413:1: ruleVariableDeclaration EOF
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
    // InternalTraceryLanguage.g:423:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:428:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalTraceryLanguage.g:429:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalTraceryLanguage.g:429:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalTraceryLanguage.g:430:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalTraceryLanguage.g:431:3: ( rule__VariableDeclaration__Group__0 )
            // InternalTraceryLanguage.g:431:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

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


    // $ANTLR start "rule__InternalInstructions__Alternatives"
    // InternalTraceryLanguage.g:440:1: rule__InternalInstructions__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleStringDeclaration ) );
    public final void rule__InternalInstructions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:444:1: ( ( ruleVariableDeclaration ) | ( ruleStringDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryLanguage.g:445:2: ( ruleVariableDeclaration )
                    {
                    // InternalTraceryLanguage.g:445:2: ( ruleVariableDeclaration )
                    // InternalTraceryLanguage.g:446:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getInternalInstructionsAccess().getVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInternalInstructionsAccess().getVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:451:2: ( ruleStringDeclaration )
                    {
                    // InternalTraceryLanguage.g:451:2: ( ruleStringDeclaration )
                    // InternalTraceryLanguage.g:452:3: ruleStringDeclaration
                    {
                     before(grammarAccess.getInternalInstructionsAccess().getStringDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInternalInstructionsAccess().getStringDeclarationParserRuleCall_1()); 

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
    // $ANTLR end "rule__InternalInstructions__Alternatives"


    // $ANTLR start "rule__TraceryProgram__Group__0"
    // InternalTraceryLanguage.g:461:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:465:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:466:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
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
    // InternalTraceryLanguage.g:473:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:477:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:478:1: ( '{' )
            {
            // InternalTraceryLanguage.g:478:1: ( '{' )
            // InternalTraceryLanguage.g:479:2: '{'
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
    // InternalTraceryLanguage.g:488:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:492:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:493:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalTraceryLanguage.g:500:1: rule__TraceryProgram__Group__1__Impl : ( ( rule__TraceryProgram__InstructionsAssignment_1 ) ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:504:1: ( ( ( rule__TraceryProgram__InstructionsAssignment_1 ) ) )
            // InternalTraceryLanguage.g:505:1: ( ( rule__TraceryProgram__InstructionsAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:505:1: ( ( rule__TraceryProgram__InstructionsAssignment_1 ) )
            // InternalTraceryLanguage.g:506:2: ( rule__TraceryProgram__InstructionsAssignment_1 )
            {
             before(grammarAccess.getTraceryProgramAccess().getInstructionsAssignment_1()); 
            // InternalTraceryLanguage.g:507:2: ( rule__TraceryProgram__InstructionsAssignment_1 )
            // InternalTraceryLanguage.g:507:3: rule__TraceryProgram__InstructionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__InstructionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getInstructionsAssignment_1()); 

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
    // $ANTLR end "rule__TraceryProgram__Group__1__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__2"
    // InternalTraceryLanguage.g:515:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:519:1: ( rule__TraceryProgram__Group__2__Impl )
            // InternalTraceryLanguage.g:520:2: rule__TraceryProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__2__Impl();

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
    // InternalTraceryLanguage.g:526:1: rule__TraceryProgram__Group__2__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:530:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:531:1: ( '}' )
            {
            // InternalTraceryLanguage.g:531:1: ( '}' )
            // InternalTraceryLanguage.g:532:2: '}'
            {
             before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__FirstJSONStatements__Group__0"
    // InternalTraceryLanguage.g:542:1: rule__FirstJSONStatements__Group__0 : rule__FirstJSONStatements__Group__0__Impl rule__FirstJSONStatements__Group__1 ;
    public final void rule__FirstJSONStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:546:1: ( rule__FirstJSONStatements__Group__0__Impl rule__FirstJSONStatements__Group__1 )
            // InternalTraceryLanguage.g:547:2: rule__FirstJSONStatements__Group__0__Impl rule__FirstJSONStatements__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FirstJSONStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__Group__1();

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
    // $ANTLR end "rule__FirstJSONStatements__Group__0"


    // $ANTLR start "rule__FirstJSONStatements__Group__0__Impl"
    // InternalTraceryLanguage.g:554:1: rule__FirstJSONStatements__Group__0__Impl : ( '&' ) ;
    public final void rule__FirstJSONStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:558:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:559:1: ( '&' )
            {
            // InternalTraceryLanguage.g:559:1: ( '&' )
            // InternalTraceryLanguage.g:560:2: '&'
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getAmpersandKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFirstJSONStatementsAccess().getAmpersandKeyword_0()); 

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
    // $ANTLR end "rule__FirstJSONStatements__Group__0__Impl"


    // $ANTLR start "rule__FirstJSONStatements__Group__1"
    // InternalTraceryLanguage.g:569:1: rule__FirstJSONStatements__Group__1 : rule__FirstJSONStatements__Group__1__Impl rule__FirstJSONStatements__Group__2 ;
    public final void rule__FirstJSONStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:573:1: ( rule__FirstJSONStatements__Group__1__Impl rule__FirstJSONStatements__Group__2 )
            // InternalTraceryLanguage.g:574:2: rule__FirstJSONStatements__Group__1__Impl rule__FirstJSONStatements__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FirstJSONStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__Group__2();

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
    // $ANTLR end "rule__FirstJSONStatements__Group__1"


    // $ANTLR start "rule__FirstJSONStatements__Group__1__Impl"
    // InternalTraceryLanguage.g:581:1: rule__FirstJSONStatements__Group__1__Impl : ( ( rule__FirstJSONStatements__NameAssignment_1 ) ) ;
    public final void rule__FirstJSONStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:585:1: ( ( ( rule__FirstJSONStatements__NameAssignment_1 ) ) )
            // InternalTraceryLanguage.g:586:1: ( ( rule__FirstJSONStatements__NameAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:586:1: ( ( rule__FirstJSONStatements__NameAssignment_1 ) )
            // InternalTraceryLanguage.g:587:2: ( rule__FirstJSONStatements__NameAssignment_1 )
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getNameAssignment_1()); 
            // InternalTraceryLanguage.g:588:2: ( rule__FirstJSONStatements__NameAssignment_1 )
            // InternalTraceryLanguage.g:588:3: rule__FirstJSONStatements__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFirstJSONStatementsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FirstJSONStatements__Group__1__Impl"


    // $ANTLR start "rule__FirstJSONStatements__Group__2"
    // InternalTraceryLanguage.g:596:1: rule__FirstJSONStatements__Group__2 : rule__FirstJSONStatements__Group__2__Impl rule__FirstJSONStatements__Group__3 ;
    public final void rule__FirstJSONStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:600:1: ( rule__FirstJSONStatements__Group__2__Impl rule__FirstJSONStatements__Group__3 )
            // InternalTraceryLanguage.g:601:2: rule__FirstJSONStatements__Group__2__Impl rule__FirstJSONStatements__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FirstJSONStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__Group__3();

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
    // $ANTLR end "rule__FirstJSONStatements__Group__2"


    // $ANTLR start "rule__FirstJSONStatements__Group__2__Impl"
    // InternalTraceryLanguage.g:608:1: rule__FirstJSONStatements__Group__2__Impl : ( '&' ) ;
    public final void rule__FirstJSONStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:612:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:613:1: ( '&' )
            {
            // InternalTraceryLanguage.g:613:1: ( '&' )
            // InternalTraceryLanguage.g:614:2: '&'
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getAmpersandKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFirstJSONStatementsAccess().getAmpersandKeyword_2()); 

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
    // $ANTLR end "rule__FirstJSONStatements__Group__2__Impl"


    // $ANTLR start "rule__FirstJSONStatements__Group__3"
    // InternalTraceryLanguage.g:623:1: rule__FirstJSONStatements__Group__3 : rule__FirstJSONStatements__Group__3__Impl rule__FirstJSONStatements__Group__4 ;
    public final void rule__FirstJSONStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:627:1: ( rule__FirstJSONStatements__Group__3__Impl rule__FirstJSONStatements__Group__4 )
            // InternalTraceryLanguage.g:628:2: rule__FirstJSONStatements__Group__3__Impl rule__FirstJSONStatements__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__FirstJSONStatements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__Group__4();

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
    // $ANTLR end "rule__FirstJSONStatements__Group__3"


    // $ANTLR start "rule__FirstJSONStatements__Group__3__Impl"
    // InternalTraceryLanguage.g:635:1: rule__FirstJSONStatements__Group__3__Impl : ( ':' ) ;
    public final void rule__FirstJSONStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:639:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:640:1: ( ':' )
            {
            // InternalTraceryLanguage.g:640:1: ( ':' )
            // InternalTraceryLanguage.g:641:2: ':'
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFirstJSONStatementsAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__FirstJSONStatements__Group__3__Impl"


    // $ANTLR start "rule__FirstJSONStatements__Group__4"
    // InternalTraceryLanguage.g:650:1: rule__FirstJSONStatements__Group__4 : rule__FirstJSONStatements__Group__4__Impl ;
    public final void rule__FirstJSONStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:654:1: ( rule__FirstJSONStatements__Group__4__Impl )
            // InternalTraceryLanguage.g:655:2: rule__FirstJSONStatements__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__Group__4__Impl();

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
    // $ANTLR end "rule__FirstJSONStatements__Group__4"


    // $ANTLR start "rule__FirstJSONStatements__Group__4__Impl"
    // InternalTraceryLanguage.g:661:1: rule__FirstJSONStatements__Group__4__Impl : ( ( rule__FirstJSONStatements__ValueAssignment_4 ) ) ;
    public final void rule__FirstJSONStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:665:1: ( ( ( rule__FirstJSONStatements__ValueAssignment_4 ) ) )
            // InternalTraceryLanguage.g:666:1: ( ( rule__FirstJSONStatements__ValueAssignment_4 ) )
            {
            // InternalTraceryLanguage.g:666:1: ( ( rule__FirstJSONStatements__ValueAssignment_4 ) )
            // InternalTraceryLanguage.g:667:2: ( rule__FirstJSONStatements__ValueAssignment_4 )
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getValueAssignment_4()); 
            // InternalTraceryLanguage.g:668:2: ( rule__FirstJSONStatements__ValueAssignment_4 )
            // InternalTraceryLanguage.g:668:3: rule__FirstJSONStatements__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FirstJSONStatements__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFirstJSONStatementsAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__FirstJSONStatements__Group__4__Impl"


    // $ANTLR start "rule__FirstJSONFinish__Group__0"
    // InternalTraceryLanguage.g:677:1: rule__FirstJSONFinish__Group__0 : rule__FirstJSONFinish__Group__0__Impl rule__FirstJSONFinish__Group__1 ;
    public final void rule__FirstJSONFinish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:681:1: ( rule__FirstJSONFinish__Group__0__Impl rule__FirstJSONFinish__Group__1 )
            // InternalTraceryLanguage.g:682:2: rule__FirstJSONFinish__Group__0__Impl rule__FirstJSONFinish__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FirstJSONFinish__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONFinish__Group__1();

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
    // $ANTLR end "rule__FirstJSONFinish__Group__0"


    // $ANTLR start "rule__FirstJSONFinish__Group__0__Impl"
    // InternalTraceryLanguage.g:689:1: rule__FirstJSONFinish__Group__0__Impl : ( '[' ) ;
    public final void rule__FirstJSONFinish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:693:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:694:1: ( '[' )
            {
            // InternalTraceryLanguage.g:694:1: ( '[' )
            // InternalTraceryLanguage.g:695:2: '['
            {
             before(grammarAccess.getFirstJSONFinishAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFirstJSONFinishAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__FirstJSONFinish__Group__0__Impl"


    // $ANTLR start "rule__FirstJSONFinish__Group__1"
    // InternalTraceryLanguage.g:704:1: rule__FirstJSONFinish__Group__1 : rule__FirstJSONFinish__Group__1__Impl rule__FirstJSONFinish__Group__2 ;
    public final void rule__FirstJSONFinish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:708:1: ( rule__FirstJSONFinish__Group__1__Impl rule__FirstJSONFinish__Group__2 )
            // InternalTraceryLanguage.g:709:2: rule__FirstJSONFinish__Group__1__Impl rule__FirstJSONFinish__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FirstJSONFinish__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONFinish__Group__2();

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
    // $ANTLR end "rule__FirstJSONFinish__Group__1"


    // $ANTLR start "rule__FirstJSONFinish__Group__1__Impl"
    // InternalTraceryLanguage.g:716:1: rule__FirstJSONFinish__Group__1__Impl : ( ruleInternalVals ) ;
    public final void rule__FirstJSONFinish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:720:1: ( ( ruleInternalVals ) )
            // InternalTraceryLanguage.g:721:1: ( ruleInternalVals )
            {
            // InternalTraceryLanguage.g:721:1: ( ruleInternalVals )
            // InternalTraceryLanguage.g:722:2: ruleInternalVals
            {
             before(grammarAccess.getFirstJSONFinishAccess().getInternalValsParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleInternalVals();

            state._fsp--;

             after(grammarAccess.getFirstJSONFinishAccess().getInternalValsParserRuleCall_1()); 

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
    // $ANTLR end "rule__FirstJSONFinish__Group__1__Impl"


    // $ANTLR start "rule__FirstJSONFinish__Group__2"
    // InternalTraceryLanguage.g:731:1: rule__FirstJSONFinish__Group__2 : rule__FirstJSONFinish__Group__2__Impl rule__FirstJSONFinish__Group__3 ;
    public final void rule__FirstJSONFinish__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:735:1: ( rule__FirstJSONFinish__Group__2__Impl rule__FirstJSONFinish__Group__3 )
            // InternalTraceryLanguage.g:736:2: rule__FirstJSONFinish__Group__2__Impl rule__FirstJSONFinish__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__FirstJSONFinish__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstJSONFinish__Group__3();

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
    // $ANTLR end "rule__FirstJSONFinish__Group__2"


    // $ANTLR start "rule__FirstJSONFinish__Group__2__Impl"
    // InternalTraceryLanguage.g:743:1: rule__FirstJSONFinish__Group__2__Impl : ( ']' ) ;
    public final void rule__FirstJSONFinish__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:747:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:748:1: ( ']' )
            {
            // InternalTraceryLanguage.g:748:1: ( ']' )
            // InternalTraceryLanguage.g:749:2: ']'
            {
             before(grammarAccess.getFirstJSONFinishAccess().getRightSquareBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFirstJSONFinishAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__FirstJSONFinish__Group__2__Impl"


    // $ANTLR start "rule__FirstJSONFinish__Group__3"
    // InternalTraceryLanguage.g:758:1: rule__FirstJSONFinish__Group__3 : rule__FirstJSONFinish__Group__3__Impl ;
    public final void rule__FirstJSONFinish__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:762:1: ( rule__FirstJSONFinish__Group__3__Impl )
            // InternalTraceryLanguage.g:763:2: rule__FirstJSONFinish__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FirstJSONFinish__Group__3__Impl();

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
    // $ANTLR end "rule__FirstJSONFinish__Group__3"


    // $ANTLR start "rule__FirstJSONFinish__Group__3__Impl"
    // InternalTraceryLanguage.g:769:1: rule__FirstJSONFinish__Group__3__Impl : ( ',' ) ;
    public final void rule__FirstJSONFinish__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:773:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:774:1: ( ',' )
            {
            // InternalTraceryLanguage.g:774:1: ( ',' )
            // InternalTraceryLanguage.g:775:2: ','
            {
             before(grammarAccess.getFirstJSONFinishAccess().getCommaKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFirstJSONFinishAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__FirstJSONFinish__Group__3__Impl"


    // $ANTLR start "rule__InitialVal__Group__0"
    // InternalTraceryLanguage.g:785:1: rule__InitialVal__Group__0 : rule__InitialVal__Group__0__Impl rule__InitialVal__Group__1 ;
    public final void rule__InitialVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:789:1: ( rule__InitialVal__Group__0__Impl rule__InitialVal__Group__1 )
            // InternalTraceryLanguage.g:790:2: rule__InitialVal__Group__0__Impl rule__InitialVal__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__InitialVal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialVal__Group__1();

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
    // $ANTLR end "rule__InitialVal__Group__0"


    // $ANTLR start "rule__InitialVal__Group__0__Impl"
    // InternalTraceryLanguage.g:797:1: rule__InitialVal__Group__0__Impl : ( '&' ) ;
    public final void rule__InitialVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:801:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:802:1: ( '&' )
            {
            // InternalTraceryLanguage.g:802:1: ( '&' )
            // InternalTraceryLanguage.g:803:2: '&'
            {
             before(grammarAccess.getInitialValAccess().getAmpersandKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialValAccess().getAmpersandKeyword_0()); 

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
    // $ANTLR end "rule__InitialVal__Group__0__Impl"


    // $ANTLR start "rule__InitialVal__Group__1"
    // InternalTraceryLanguage.g:812:1: rule__InitialVal__Group__1 : rule__InitialVal__Group__1__Impl rule__InitialVal__Group__2 ;
    public final void rule__InitialVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:816:1: ( rule__InitialVal__Group__1__Impl rule__InitialVal__Group__2 )
            // InternalTraceryLanguage.g:817:2: rule__InitialVal__Group__1__Impl rule__InitialVal__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__InitialVal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialVal__Group__2();

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
    // $ANTLR end "rule__InitialVal__Group__1"


    // $ANTLR start "rule__InitialVal__Group__1__Impl"
    // InternalTraceryLanguage.g:824:1: rule__InitialVal__Group__1__Impl : ( ( ( rule__InitialVal__ValInternalInstructionAssignment_1 ) ) ( ( rule__InitialVal__ValInternalInstructionAssignment_1 )* ) ) ;
    public final void rule__InitialVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:828:1: ( ( ( ( rule__InitialVal__ValInternalInstructionAssignment_1 ) ) ( ( rule__InitialVal__ValInternalInstructionAssignment_1 )* ) ) )
            // InternalTraceryLanguage.g:829:1: ( ( ( rule__InitialVal__ValInternalInstructionAssignment_1 ) ) ( ( rule__InitialVal__ValInternalInstructionAssignment_1 )* ) )
            {
            // InternalTraceryLanguage.g:829:1: ( ( ( rule__InitialVal__ValInternalInstructionAssignment_1 ) ) ( ( rule__InitialVal__ValInternalInstructionAssignment_1 )* ) )
            // InternalTraceryLanguage.g:830:2: ( ( rule__InitialVal__ValInternalInstructionAssignment_1 ) ) ( ( rule__InitialVal__ValInternalInstructionAssignment_1 )* )
            {
            // InternalTraceryLanguage.g:830:2: ( ( rule__InitialVal__ValInternalInstructionAssignment_1 ) )
            // InternalTraceryLanguage.g:831:3: ( rule__InitialVal__ValInternalInstructionAssignment_1 )
            {
             before(grammarAccess.getInitialValAccess().getValInternalInstructionAssignment_1()); 
            // InternalTraceryLanguage.g:832:3: ( rule__InitialVal__ValInternalInstructionAssignment_1 )
            // InternalTraceryLanguage.g:832:4: rule__InitialVal__ValInternalInstructionAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__InitialVal__ValInternalInstructionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialValAccess().getValInternalInstructionAssignment_1()); 

            }

            // InternalTraceryLanguage.g:835:2: ( ( rule__InitialVal__ValInternalInstructionAssignment_1 )* )
            // InternalTraceryLanguage.g:836:3: ( rule__InitialVal__ValInternalInstructionAssignment_1 )*
            {
             before(grammarAccess.getInitialValAccess().getValInternalInstructionAssignment_1()); 
            // InternalTraceryLanguage.g:837:3: ( rule__InitialVal__ValInternalInstructionAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:837:4: rule__InitialVal__ValInternalInstructionAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__InitialVal__ValInternalInstructionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInitialValAccess().getValInternalInstructionAssignment_1()); 

            }


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
    // $ANTLR end "rule__InitialVal__Group__1__Impl"


    // $ANTLR start "rule__InitialVal__Group__2"
    // InternalTraceryLanguage.g:846:1: rule__InitialVal__Group__2 : rule__InitialVal__Group__2__Impl ;
    public final void rule__InitialVal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:850:1: ( rule__InitialVal__Group__2__Impl )
            // InternalTraceryLanguage.g:851:2: rule__InitialVal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialVal__Group__2__Impl();

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
    // $ANTLR end "rule__InitialVal__Group__2"


    // $ANTLR start "rule__InitialVal__Group__2__Impl"
    // InternalTraceryLanguage.g:857:1: rule__InitialVal__Group__2__Impl : ( '&' ) ;
    public final void rule__InitialVal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:861:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:862:1: ( '&' )
            {
            // InternalTraceryLanguage.g:862:1: ( '&' )
            // InternalTraceryLanguage.g:863:2: '&'
            {
             before(grammarAccess.getInitialValAccess().getAmpersandKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialValAccess().getAmpersandKeyword_2()); 

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
    // $ANTLR end "rule__InitialVal__Group__2__Impl"


    // $ANTLR start "rule__Instruction__Group__0"
    // InternalTraceryLanguage.g:873:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:877:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalTraceryLanguage.g:878:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Instruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1();

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
    // $ANTLR end "rule__Instruction__Group__0"


    // $ANTLR start "rule__Instruction__Group__0__Impl"
    // InternalTraceryLanguage.g:885:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__FirstInstructionAssignment_0 )* ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:889:1: ( ( ( rule__Instruction__FirstInstructionAssignment_0 )* ) )
            // InternalTraceryLanguage.g:890:1: ( ( rule__Instruction__FirstInstructionAssignment_0 )* )
            {
            // InternalTraceryLanguage.g:890:1: ( ( rule__Instruction__FirstInstructionAssignment_0 )* )
            // InternalTraceryLanguage.g:891:2: ( rule__Instruction__FirstInstructionAssignment_0 )*
            {
             before(grammarAccess.getInstructionAccess().getFirstInstructionAssignment_0()); 
            // InternalTraceryLanguage.g:892:2: ( rule__Instruction__FirstInstructionAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:892:3: rule__Instruction__FirstInstructionAssignment_0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Instruction__FirstInstructionAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInstructionAccess().getFirstInstructionAssignment_0()); 

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
    // $ANTLR end "rule__Instruction__Group__0__Impl"


    // $ANTLR start "rule__Instruction__Group__1"
    // InternalTraceryLanguage.g:900:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:904:1: ( rule__Instruction__Group__1__Impl )
            // InternalTraceryLanguage.g:905:2: rule__Instruction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group__1"


    // $ANTLR start "rule__Instruction__Group__1__Impl"
    // InternalTraceryLanguage.g:911:1: rule__Instruction__Group__1__Impl : ( ( rule__Instruction__LastInstructionAssignment_1 ) ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:915:1: ( ( ( rule__Instruction__LastInstructionAssignment_1 ) ) )
            // InternalTraceryLanguage.g:916:1: ( ( rule__Instruction__LastInstructionAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:916:1: ( ( rule__Instruction__LastInstructionAssignment_1 ) )
            // InternalTraceryLanguage.g:917:2: ( rule__Instruction__LastInstructionAssignment_1 )
            {
             before(grammarAccess.getInstructionAccess().getLastInstructionAssignment_1()); 
            // InternalTraceryLanguage.g:918:2: ( rule__Instruction__LastInstructionAssignment_1 )
            // InternalTraceryLanguage.g:918:3: rule__Instruction__LastInstructionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__LastInstructionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getLastInstructionAssignment_1()); 

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
    // $ANTLR end "rule__Instruction__Group__1__Impl"


    // $ANTLR start "rule__InternalVals__Group__0"
    // InternalTraceryLanguage.g:927:1: rule__InternalVals__Group__0 : rule__InternalVals__Group__0__Impl rule__InternalVals__Group__1 ;
    public final void rule__InternalVals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:931:1: ( rule__InternalVals__Group__0__Impl rule__InternalVals__Group__1 )
            // InternalTraceryLanguage.g:932:2: rule__InternalVals__Group__0__Impl rule__InternalVals__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InternalVals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalVals__Group__1();

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
    // $ANTLR end "rule__InternalVals__Group__0"


    // $ANTLR start "rule__InternalVals__Group__0__Impl"
    // InternalTraceryLanguage.g:939:1: rule__InternalVals__Group__0__Impl : ( ruleInitialVal ) ;
    public final void rule__InternalVals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:943:1: ( ( ruleInitialVal ) )
            // InternalTraceryLanguage.g:944:1: ( ruleInitialVal )
            {
            // InternalTraceryLanguage.g:944:1: ( ruleInitialVal )
            // InternalTraceryLanguage.g:945:2: ruleInitialVal
            {
             before(grammarAccess.getInternalValsAccess().getInitialValParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialVal();

            state._fsp--;

             after(grammarAccess.getInternalValsAccess().getInitialValParserRuleCall_0()); 

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
    // $ANTLR end "rule__InternalVals__Group__0__Impl"


    // $ANTLR start "rule__InternalVals__Group__1"
    // InternalTraceryLanguage.g:954:1: rule__InternalVals__Group__1 : rule__InternalVals__Group__1__Impl ;
    public final void rule__InternalVals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:958:1: ( rule__InternalVals__Group__1__Impl )
            // InternalTraceryLanguage.g:959:2: rule__InternalVals__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalVals__Group__1__Impl();

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
    // $ANTLR end "rule__InternalVals__Group__1"


    // $ANTLR start "rule__InternalVals__Group__1__Impl"
    // InternalTraceryLanguage.g:965:1: rule__InternalVals__Group__1__Impl : ( ( rule__InternalVals__ValsAssignment_1 )* ) ;
    public final void rule__InternalVals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:969:1: ( ( ( rule__InternalVals__ValsAssignment_1 )* ) )
            // InternalTraceryLanguage.g:970:1: ( ( rule__InternalVals__ValsAssignment_1 )* )
            {
            // InternalTraceryLanguage.g:970:1: ( ( rule__InternalVals__ValsAssignment_1 )* )
            // InternalTraceryLanguage.g:971:2: ( rule__InternalVals__ValsAssignment_1 )*
            {
             before(grammarAccess.getInternalValsAccess().getValsAssignment_1()); 
            // InternalTraceryLanguage.g:972:2: ( rule__InternalVals__ValsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:972:3: rule__InternalVals__ValsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__InternalVals__ValsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getInternalValsAccess().getValsAssignment_1()); 

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
    // $ANTLR end "rule__InternalVals__Group__1__Impl"


    // $ANTLR start "rule__LastJSONFinish__Group__0"
    // InternalTraceryLanguage.g:981:1: rule__LastJSONFinish__Group__0 : rule__LastJSONFinish__Group__0__Impl rule__LastJSONFinish__Group__1 ;
    public final void rule__LastJSONFinish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:985:1: ( rule__LastJSONFinish__Group__0__Impl rule__LastJSONFinish__Group__1 )
            // InternalTraceryLanguage.g:986:2: rule__LastJSONFinish__Group__0__Impl rule__LastJSONFinish__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LastJSONFinish__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastJSONFinish__Group__1();

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
    // $ANTLR end "rule__LastJSONFinish__Group__0"


    // $ANTLR start "rule__LastJSONFinish__Group__0__Impl"
    // InternalTraceryLanguage.g:993:1: rule__LastJSONFinish__Group__0__Impl : ( '[' ) ;
    public final void rule__LastJSONFinish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:997:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:998:1: ( '[' )
            {
            // InternalTraceryLanguage.g:998:1: ( '[' )
            // InternalTraceryLanguage.g:999:2: '['
            {
             before(grammarAccess.getLastJSONFinishAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLastJSONFinishAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__LastJSONFinish__Group__0__Impl"


    // $ANTLR start "rule__LastJSONFinish__Group__1"
    // InternalTraceryLanguage.g:1008:1: rule__LastJSONFinish__Group__1 : rule__LastJSONFinish__Group__1__Impl rule__LastJSONFinish__Group__2 ;
    public final void rule__LastJSONFinish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1012:1: ( rule__LastJSONFinish__Group__1__Impl rule__LastJSONFinish__Group__2 )
            // InternalTraceryLanguage.g:1013:2: rule__LastJSONFinish__Group__1__Impl rule__LastJSONFinish__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__LastJSONFinish__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastJSONFinish__Group__2();

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
    // $ANTLR end "rule__LastJSONFinish__Group__1"


    // $ANTLR start "rule__LastJSONFinish__Group__1__Impl"
    // InternalTraceryLanguage.g:1020:1: rule__LastJSONFinish__Group__1__Impl : ( ruleInitialVal ) ;
    public final void rule__LastJSONFinish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1024:1: ( ( ruleInitialVal ) )
            // InternalTraceryLanguage.g:1025:1: ( ruleInitialVal )
            {
            // InternalTraceryLanguage.g:1025:1: ( ruleInitialVal )
            // InternalTraceryLanguage.g:1026:2: ruleInitialVal
            {
             before(grammarAccess.getLastJSONFinishAccess().getInitialValParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleInitialVal();

            state._fsp--;

             after(grammarAccess.getLastJSONFinishAccess().getInitialValParserRuleCall_1()); 

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
    // $ANTLR end "rule__LastJSONFinish__Group__1__Impl"


    // $ANTLR start "rule__LastJSONFinish__Group__2"
    // InternalTraceryLanguage.g:1035:1: rule__LastJSONFinish__Group__2 : rule__LastJSONFinish__Group__2__Impl rule__LastJSONFinish__Group__3 ;
    public final void rule__LastJSONFinish__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1039:1: ( rule__LastJSONFinish__Group__2__Impl rule__LastJSONFinish__Group__3 )
            // InternalTraceryLanguage.g:1040:2: rule__LastJSONFinish__Group__2__Impl rule__LastJSONFinish__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__LastJSONFinish__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastJSONFinish__Group__3();

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
    // $ANTLR end "rule__LastJSONFinish__Group__2"


    // $ANTLR start "rule__LastJSONFinish__Group__2__Impl"
    // InternalTraceryLanguage.g:1047:1: rule__LastJSONFinish__Group__2__Impl : ( ( rule__LastJSONFinish__ValsAssignment_2 )* ) ;
    public final void rule__LastJSONFinish__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1051:1: ( ( ( rule__LastJSONFinish__ValsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:1052:1: ( ( rule__LastJSONFinish__ValsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:1052:1: ( ( rule__LastJSONFinish__ValsAssignment_2 )* )
            // InternalTraceryLanguage.g:1053:2: ( rule__LastJSONFinish__ValsAssignment_2 )*
            {
             before(grammarAccess.getLastJSONFinishAccess().getValsAssignment_2()); 
            // InternalTraceryLanguage.g:1054:2: ( rule__LastJSONFinish__ValsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1054:3: rule__LastJSONFinish__ValsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__LastJSONFinish__ValsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLastJSONFinishAccess().getValsAssignment_2()); 

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
    // $ANTLR end "rule__LastJSONFinish__Group__2__Impl"


    // $ANTLR start "rule__LastJSONFinish__Group__3"
    // InternalTraceryLanguage.g:1062:1: rule__LastJSONFinish__Group__3 : rule__LastJSONFinish__Group__3__Impl ;
    public final void rule__LastJSONFinish__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1066:1: ( rule__LastJSONFinish__Group__3__Impl )
            // InternalTraceryLanguage.g:1067:2: rule__LastJSONFinish__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LastJSONFinish__Group__3__Impl();

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
    // $ANTLR end "rule__LastJSONFinish__Group__3"


    // $ANTLR start "rule__LastJSONFinish__Group__3__Impl"
    // InternalTraceryLanguage.g:1073:1: rule__LastJSONFinish__Group__3__Impl : ( ']' ) ;
    public final void rule__LastJSONFinish__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1077:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:1078:1: ( ']' )
            {
            // InternalTraceryLanguage.g:1078:1: ( ']' )
            // InternalTraceryLanguage.g:1079:2: ']'
            {
             before(grammarAccess.getLastJSONFinishAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLastJSONFinishAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__LastJSONFinish__Group__3__Impl"


    // $ANTLR start "rule__LastJSONStatement__Group__0"
    // InternalTraceryLanguage.g:1089:1: rule__LastJSONStatement__Group__0 : rule__LastJSONStatement__Group__0__Impl rule__LastJSONStatement__Group__1 ;
    public final void rule__LastJSONStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1093:1: ( rule__LastJSONStatement__Group__0__Impl rule__LastJSONStatement__Group__1 )
            // InternalTraceryLanguage.g:1094:2: rule__LastJSONStatement__Group__0__Impl rule__LastJSONStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LastJSONStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastJSONStatement__Group__1();

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
    // $ANTLR end "rule__LastJSONStatement__Group__0"


    // $ANTLR start "rule__LastJSONStatement__Group__0__Impl"
    // InternalTraceryLanguage.g:1101:1: rule__LastJSONStatement__Group__0__Impl : ( '&origin&' ) ;
    public final void rule__LastJSONStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1105:1: ( ( '&origin&' ) )
            // InternalTraceryLanguage.g:1106:1: ( '&origin&' )
            {
            // InternalTraceryLanguage.g:1106:1: ( '&origin&' )
            // InternalTraceryLanguage.g:1107:2: '&origin&'
            {
             before(grammarAccess.getLastJSONStatementAccess().getOriginKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLastJSONStatementAccess().getOriginKeyword_0()); 

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
    // $ANTLR end "rule__LastJSONStatement__Group__0__Impl"


    // $ANTLR start "rule__LastJSONStatement__Group__1"
    // InternalTraceryLanguage.g:1116:1: rule__LastJSONStatement__Group__1 : rule__LastJSONStatement__Group__1__Impl rule__LastJSONStatement__Group__2 ;
    public final void rule__LastJSONStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1120:1: ( rule__LastJSONStatement__Group__1__Impl rule__LastJSONStatement__Group__2 )
            // InternalTraceryLanguage.g:1121:2: rule__LastJSONStatement__Group__1__Impl rule__LastJSONStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LastJSONStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastJSONStatement__Group__2();

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
    // $ANTLR end "rule__LastJSONStatement__Group__1"


    // $ANTLR start "rule__LastJSONStatement__Group__1__Impl"
    // InternalTraceryLanguage.g:1128:1: rule__LastJSONStatement__Group__1__Impl : ( ':' ) ;
    public final void rule__LastJSONStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1132:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:1133:1: ( ':' )
            {
            // InternalTraceryLanguage.g:1133:1: ( ':' )
            // InternalTraceryLanguage.g:1134:2: ':'
            {
             before(grammarAccess.getLastJSONStatementAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLastJSONStatementAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__LastJSONStatement__Group__1__Impl"


    // $ANTLR start "rule__LastJSONStatement__Group__2"
    // InternalTraceryLanguage.g:1143:1: rule__LastJSONStatement__Group__2 : rule__LastJSONStatement__Group__2__Impl ;
    public final void rule__LastJSONStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1147:1: ( rule__LastJSONStatement__Group__2__Impl )
            // InternalTraceryLanguage.g:1148:2: rule__LastJSONStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LastJSONStatement__Group__2__Impl();

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
    // $ANTLR end "rule__LastJSONStatement__Group__2"


    // $ANTLR start "rule__LastJSONStatement__Group__2__Impl"
    // InternalTraceryLanguage.g:1154:1: rule__LastJSONStatement__Group__2__Impl : ( ( rule__LastJSONStatement__ValueAssignment_2 ) ) ;
    public final void rule__LastJSONStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1158:1: ( ( ( rule__LastJSONStatement__ValueAssignment_2 ) ) )
            // InternalTraceryLanguage.g:1159:1: ( ( rule__LastJSONStatement__ValueAssignment_2 ) )
            {
            // InternalTraceryLanguage.g:1159:1: ( ( rule__LastJSONStatement__ValueAssignment_2 ) )
            // InternalTraceryLanguage.g:1160:2: ( rule__LastJSONStatement__ValueAssignment_2 )
            {
             before(grammarAccess.getLastJSONStatementAccess().getValueAssignment_2()); 
            // InternalTraceryLanguage.g:1161:2: ( rule__LastJSONStatement__ValueAssignment_2 )
            // InternalTraceryLanguage.g:1161:3: rule__LastJSONStatement__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LastJSONStatement__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLastJSONStatementAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__LastJSONStatement__Group__2__Impl"


    // $ANTLR start "rule__StandardVal__Group__0"
    // InternalTraceryLanguage.g:1170:1: rule__StandardVal__Group__0 : rule__StandardVal__Group__0__Impl rule__StandardVal__Group__1 ;
    public final void rule__StandardVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1174:1: ( rule__StandardVal__Group__0__Impl rule__StandardVal__Group__1 )
            // InternalTraceryLanguage.g:1175:2: rule__StandardVal__Group__0__Impl rule__StandardVal__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StandardVal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardVal__Group__1();

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
    // $ANTLR end "rule__StandardVal__Group__0"


    // $ANTLR start "rule__StandardVal__Group__0__Impl"
    // InternalTraceryLanguage.g:1182:1: rule__StandardVal__Group__0__Impl : ( ',' ) ;
    public final void rule__StandardVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1186:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:1187:1: ( ',' )
            {
            // InternalTraceryLanguage.g:1187:1: ( ',' )
            // InternalTraceryLanguage.g:1188:2: ','
            {
             before(grammarAccess.getStandardValAccess().getCommaKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStandardValAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__StandardVal__Group__0__Impl"


    // $ANTLR start "rule__StandardVal__Group__1"
    // InternalTraceryLanguage.g:1197:1: rule__StandardVal__Group__1 : rule__StandardVal__Group__1__Impl rule__StandardVal__Group__2 ;
    public final void rule__StandardVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1201:1: ( rule__StandardVal__Group__1__Impl rule__StandardVal__Group__2 )
            // InternalTraceryLanguage.g:1202:2: rule__StandardVal__Group__1__Impl rule__StandardVal__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__StandardVal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardVal__Group__2();

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
    // $ANTLR end "rule__StandardVal__Group__1"


    // $ANTLR start "rule__StandardVal__Group__1__Impl"
    // InternalTraceryLanguage.g:1209:1: rule__StandardVal__Group__1__Impl : ( '&' ) ;
    public final void rule__StandardVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1213:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1214:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1214:1: ( '&' )
            // InternalTraceryLanguage.g:1215:2: '&'
            {
             before(grammarAccess.getStandardValAccess().getAmpersandKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStandardValAccess().getAmpersandKeyword_1()); 

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
    // $ANTLR end "rule__StandardVal__Group__1__Impl"


    // $ANTLR start "rule__StandardVal__Group__2"
    // InternalTraceryLanguage.g:1224:1: rule__StandardVal__Group__2 : rule__StandardVal__Group__2__Impl rule__StandardVal__Group__3 ;
    public final void rule__StandardVal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1228:1: ( rule__StandardVal__Group__2__Impl rule__StandardVal__Group__3 )
            // InternalTraceryLanguage.g:1229:2: rule__StandardVal__Group__2__Impl rule__StandardVal__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StandardVal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardVal__Group__3();

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
    // $ANTLR end "rule__StandardVal__Group__2"


    // $ANTLR start "rule__StandardVal__Group__2__Impl"
    // InternalTraceryLanguage.g:1236:1: rule__StandardVal__Group__2__Impl : ( ( ( rule__StandardVal__ValInternalInstructionAssignment_2 ) ) ( ( rule__StandardVal__ValInternalInstructionAssignment_2 )* ) ) ;
    public final void rule__StandardVal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1240:1: ( ( ( ( rule__StandardVal__ValInternalInstructionAssignment_2 ) ) ( ( rule__StandardVal__ValInternalInstructionAssignment_2 )* ) ) )
            // InternalTraceryLanguage.g:1241:1: ( ( ( rule__StandardVal__ValInternalInstructionAssignment_2 ) ) ( ( rule__StandardVal__ValInternalInstructionAssignment_2 )* ) )
            {
            // InternalTraceryLanguage.g:1241:1: ( ( ( rule__StandardVal__ValInternalInstructionAssignment_2 ) ) ( ( rule__StandardVal__ValInternalInstructionAssignment_2 )* ) )
            // InternalTraceryLanguage.g:1242:2: ( ( rule__StandardVal__ValInternalInstructionAssignment_2 ) ) ( ( rule__StandardVal__ValInternalInstructionAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:1242:2: ( ( rule__StandardVal__ValInternalInstructionAssignment_2 ) )
            // InternalTraceryLanguage.g:1243:3: ( rule__StandardVal__ValInternalInstructionAssignment_2 )
            {
             before(grammarAccess.getStandardValAccess().getValInternalInstructionAssignment_2()); 
            // InternalTraceryLanguage.g:1244:3: ( rule__StandardVal__ValInternalInstructionAssignment_2 )
            // InternalTraceryLanguage.g:1244:4: rule__StandardVal__ValInternalInstructionAssignment_2
            {
            pushFollow(FOLLOW_12);
            rule__StandardVal__ValInternalInstructionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStandardValAccess().getValInternalInstructionAssignment_2()); 

            }

            // InternalTraceryLanguage.g:1247:2: ( ( rule__StandardVal__ValInternalInstructionAssignment_2 )* )
            // InternalTraceryLanguage.g:1248:3: ( rule__StandardVal__ValInternalInstructionAssignment_2 )*
            {
             before(grammarAccess.getStandardValAccess().getValInternalInstructionAssignment_2()); 
            // InternalTraceryLanguage.g:1249:3: ( rule__StandardVal__ValInternalInstructionAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1249:4: rule__StandardVal__ValInternalInstructionAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__StandardVal__ValInternalInstructionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStandardValAccess().getValInternalInstructionAssignment_2()); 

            }


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
    // $ANTLR end "rule__StandardVal__Group__2__Impl"


    // $ANTLR start "rule__StandardVal__Group__3"
    // InternalTraceryLanguage.g:1258:1: rule__StandardVal__Group__3 : rule__StandardVal__Group__3__Impl ;
    public final void rule__StandardVal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1262:1: ( rule__StandardVal__Group__3__Impl )
            // InternalTraceryLanguage.g:1263:2: rule__StandardVal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardVal__Group__3__Impl();

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
    // $ANTLR end "rule__StandardVal__Group__3"


    // $ANTLR start "rule__StandardVal__Group__3__Impl"
    // InternalTraceryLanguage.g:1269:1: rule__StandardVal__Group__3__Impl : ( '&' ) ;
    public final void rule__StandardVal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1273:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1274:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1274:1: ( '&' )
            // InternalTraceryLanguage.g:1275:2: '&'
            {
             before(grammarAccess.getStandardValAccess().getAmpersandKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStandardValAccess().getAmpersandKeyword_3()); 

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
    // $ANTLR end "rule__StandardVal__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalTraceryLanguage.g:1285:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1289:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalTraceryLanguage.g:1290:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalTraceryLanguage.g:1297:1: rule__VariableDeclaration__Group__0__Impl : ( '#' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1301:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1302:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1302:1: ( '#' )
            // InternalTraceryLanguage.g:1303:2: '#'
            {
             before(grammarAccess.getVariableDeclarationAccess().getNumberSignKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalTraceryLanguage.g:1312:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1316:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalTraceryLanguage.g:1317:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalTraceryLanguage.g:1324:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__VariableAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1328:1: ( ( ( rule__VariableDeclaration__VariableAssignment_1 ) ) )
            // InternalTraceryLanguage.g:1329:1: ( ( rule__VariableDeclaration__VariableAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:1329:1: ( ( rule__VariableDeclaration__VariableAssignment_1 ) )
            // InternalTraceryLanguage.g:1330:2: ( rule__VariableDeclaration__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableAssignment_1()); 
            // InternalTraceryLanguage.g:1331:2: ( rule__VariableDeclaration__VariableAssignment_1 )
            // InternalTraceryLanguage.g:1331:3: rule__VariableDeclaration__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getVariableAssignment_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalTraceryLanguage.g:1339:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1343:1: ( rule__VariableDeclaration__Group__2__Impl )
            // InternalTraceryLanguage.g:1344:2: rule__VariableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalTraceryLanguage.g:1350:1: rule__VariableDeclaration__Group__2__Impl : ( '#' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1354:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1355:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1355:1: ( '#' )
            // InternalTraceryLanguage.g:1356:2: '#'
            {
             before(grammarAccess.getVariableDeclarationAccess().getNumberSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNumberSignKeyword_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TraceryProgram__InstructionsAssignment_1"
    // InternalTraceryLanguage.g:1366:1: rule__TraceryProgram__InstructionsAssignment_1 : ( ruleInstruction ) ;
    public final void rule__TraceryProgram__InstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1370:1: ( ( ruleInstruction ) )
            // InternalTraceryLanguage.g:1371:2: ( ruleInstruction )
            {
            // InternalTraceryLanguage.g:1371:2: ( ruleInstruction )
            // InternalTraceryLanguage.g:1372:3: ruleInstruction
            {
             before(grammarAccess.getTraceryProgramAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getInstructionsInstructionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TraceryProgram__InstructionsAssignment_1"


    // $ANTLR start "rule__FirstJSONStatements__NameAssignment_1"
    // InternalTraceryLanguage.g:1381:1: rule__FirstJSONStatements__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FirstJSONStatements__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1385:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1386:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:1386:2: ( RULE_ID )
            // InternalTraceryLanguage.g:1387:3: RULE_ID
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFirstJSONStatementsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FirstJSONStatements__NameAssignment_1"


    // $ANTLR start "rule__FirstJSONStatements__ValueAssignment_4"
    // InternalTraceryLanguage.g:1396:1: rule__FirstJSONStatements__ValueAssignment_4 : ( ruleFirstJSONFinish ) ;
    public final void rule__FirstJSONStatements__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1400:1: ( ( ruleFirstJSONFinish ) )
            // InternalTraceryLanguage.g:1401:2: ( ruleFirstJSONFinish )
            {
            // InternalTraceryLanguage.g:1401:2: ( ruleFirstJSONFinish )
            // InternalTraceryLanguage.g:1402:3: ruleFirstJSONFinish
            {
             before(grammarAccess.getFirstJSONStatementsAccess().getValueFirstJSONFinishParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFirstJSONFinish();

            state._fsp--;

             after(grammarAccess.getFirstJSONStatementsAccess().getValueFirstJSONFinishParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FirstJSONStatements__ValueAssignment_4"


    // $ANTLR start "rule__InitialVal__ValInternalInstructionAssignment_1"
    // InternalTraceryLanguage.g:1411:1: rule__InitialVal__ValInternalInstructionAssignment_1 : ( ruleInternalInstructions ) ;
    public final void rule__InitialVal__ValInternalInstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1415:1: ( ( ruleInternalInstructions ) )
            // InternalTraceryLanguage.g:1416:2: ( ruleInternalInstructions )
            {
            // InternalTraceryLanguage.g:1416:2: ( ruleInternalInstructions )
            // InternalTraceryLanguage.g:1417:3: ruleInternalInstructions
            {
             before(grammarAccess.getInitialValAccess().getValInternalInstructionInternalInstructionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInternalInstructions();

            state._fsp--;

             after(grammarAccess.getInitialValAccess().getValInternalInstructionInternalInstructionsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitialVal__ValInternalInstructionAssignment_1"


    // $ANTLR start "rule__Instruction__FirstInstructionAssignment_0"
    // InternalTraceryLanguage.g:1426:1: rule__Instruction__FirstInstructionAssignment_0 : ( ruleFirstJSONStatements ) ;
    public final void rule__Instruction__FirstInstructionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1430:1: ( ( ruleFirstJSONStatements ) )
            // InternalTraceryLanguage.g:1431:2: ( ruleFirstJSONStatements )
            {
            // InternalTraceryLanguage.g:1431:2: ( ruleFirstJSONStatements )
            // InternalTraceryLanguage.g:1432:3: ruleFirstJSONStatements
            {
             before(grammarAccess.getInstructionAccess().getFirstInstructionFirstJSONStatementsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFirstJSONStatements();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getFirstInstructionFirstJSONStatementsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Instruction__FirstInstructionAssignment_0"


    // $ANTLR start "rule__Instruction__LastInstructionAssignment_1"
    // InternalTraceryLanguage.g:1441:1: rule__Instruction__LastInstructionAssignment_1 : ( ruleLastJSONStatement ) ;
    public final void rule__Instruction__LastInstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1445:1: ( ( ruleLastJSONStatement ) )
            // InternalTraceryLanguage.g:1446:2: ( ruleLastJSONStatement )
            {
            // InternalTraceryLanguage.g:1446:2: ( ruleLastJSONStatement )
            // InternalTraceryLanguage.g:1447:3: ruleLastJSONStatement
            {
             before(grammarAccess.getInstructionAccess().getLastInstructionLastJSONStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLastJSONStatement();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getLastInstructionLastJSONStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Instruction__LastInstructionAssignment_1"


    // $ANTLR start "rule__InternalVals__ValsAssignment_1"
    // InternalTraceryLanguage.g:1456:1: rule__InternalVals__ValsAssignment_1 : ( ruleStandardVal ) ;
    public final void rule__InternalVals__ValsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1460:1: ( ( ruleStandardVal ) )
            // InternalTraceryLanguage.g:1461:2: ( ruleStandardVal )
            {
            // InternalTraceryLanguage.g:1461:2: ( ruleStandardVal )
            // InternalTraceryLanguage.g:1462:3: ruleStandardVal
            {
             before(grammarAccess.getInternalValsAccess().getValsStandardValParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStandardVal();

            state._fsp--;

             after(grammarAccess.getInternalValsAccess().getValsStandardValParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InternalVals__ValsAssignment_1"


    // $ANTLR start "rule__LastJSONFinish__ValsAssignment_2"
    // InternalTraceryLanguage.g:1471:1: rule__LastJSONFinish__ValsAssignment_2 : ( ruleStandardVal ) ;
    public final void rule__LastJSONFinish__ValsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1475:1: ( ( ruleStandardVal ) )
            // InternalTraceryLanguage.g:1476:2: ( ruleStandardVal )
            {
            // InternalTraceryLanguage.g:1476:2: ( ruleStandardVal )
            // InternalTraceryLanguage.g:1477:3: ruleStandardVal
            {
             before(grammarAccess.getLastJSONFinishAccess().getValsStandardValParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStandardVal();

            state._fsp--;

             after(grammarAccess.getLastJSONFinishAccess().getValsStandardValParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LastJSONFinish__ValsAssignment_2"


    // $ANTLR start "rule__LastJSONStatement__ValueAssignment_2"
    // InternalTraceryLanguage.g:1486:1: rule__LastJSONStatement__ValueAssignment_2 : ( ruleLastJSONFinish ) ;
    public final void rule__LastJSONStatement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1490:1: ( ( ruleLastJSONFinish ) )
            // InternalTraceryLanguage.g:1491:2: ( ruleLastJSONFinish )
            {
            // InternalTraceryLanguage.g:1491:2: ( ruleLastJSONFinish )
            // InternalTraceryLanguage.g:1492:3: ruleLastJSONFinish
            {
             before(grammarAccess.getLastJSONStatementAccess().getValueLastJSONFinishParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLastJSONFinish();

            state._fsp--;

             after(grammarAccess.getLastJSONStatementAccess().getValueLastJSONFinishParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LastJSONStatement__ValueAssignment_2"


    // $ANTLR start "rule__StandardVal__ValInternalInstructionAssignment_2"
    // InternalTraceryLanguage.g:1501:1: rule__StandardVal__ValInternalInstructionAssignment_2 : ( ruleInternalInstructions ) ;
    public final void rule__StandardVal__ValInternalInstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1505:1: ( ( ruleInternalInstructions ) )
            // InternalTraceryLanguage.g:1506:2: ( ruleInternalInstructions )
            {
            // InternalTraceryLanguage.g:1506:2: ( ruleInternalInstructions )
            // InternalTraceryLanguage.g:1507:3: ruleInternalInstructions
            {
             before(grammarAccess.getStandardValAccess().getValInternalInstructionInternalInstructionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInternalInstructions();

            state._fsp--;

             after(grammarAccess.getStandardValAccess().getValInternalInstructionInternalInstructionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StandardVal__ValInternalInstructionAssignment_2"


    // $ANTLR start "rule__StringDeclaration__ValueAssignment"
    // InternalTraceryLanguage.g:1516:1: rule__StringDeclaration__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringDeclaration__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1520:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:1521:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:1521:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:1522:3: RULE_STRING
            {
             before(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringDeclaration__ValueAssignment"


    // $ANTLR start "rule__VariableDeclaration__VariableAssignment_1"
    // InternalTraceryLanguage.g:1531:1: rule__VariableDeclaration__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableDeclaration__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1535:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:1536:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:1536:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1537:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableFirstJSONStatementsCrossReference_1_0()); 
            // InternalTraceryLanguage.g:1538:3: ( RULE_ID )
            // InternalTraceryLanguage.g:1539:4: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableFirstJSONStatementsIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVariableFirstJSONStatementsIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableDeclarationAccess().getVariableFirstJSONStatementsCrossReference_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__VariableAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});

}