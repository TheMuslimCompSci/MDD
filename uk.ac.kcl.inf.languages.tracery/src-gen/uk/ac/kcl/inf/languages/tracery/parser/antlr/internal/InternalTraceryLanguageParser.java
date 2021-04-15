package uk.ac.kcl.inf.languages.tracery.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'&'", "':'", "'['", "']'", "','", "'&start&'", "'#'"
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

        public InternalTraceryLanguageParser(TokenStream input, TraceryLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TraceryProgram";
       	}

       	@Override
       	protected TraceryLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTraceryProgram"
    // InternalTraceryLanguage.g:64:1: entryRuleTraceryProgram returns [EObject current=null] : iv_ruleTraceryProgram= ruleTraceryProgram EOF ;
    public final EObject entryRuleTraceryProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceryProgram = null;


        try {
            // InternalTraceryLanguage.g:64:55: (iv_ruleTraceryProgram= ruleTraceryProgram EOF )
            // InternalTraceryLanguage.g:65:2: iv_ruleTraceryProgram= ruleTraceryProgram EOF
            {
             newCompositeNode(grammarAccess.getTraceryProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceryProgram=ruleTraceryProgram();

            state._fsp--;

             current =iv_ruleTraceryProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceryProgram"


    // $ANTLR start "ruleTraceryProgram"
    // InternalTraceryLanguage.g:71:1: ruleTraceryProgram returns [EObject current=null] : (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= '}' ) ;
    public final EObject ruleTraceryProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_instructions_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:77:2: ( (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= '}' ) )
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= '}' )
            {
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= '}' )
            // InternalTraceryLanguage.g:79:3: otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:83:3: ( (lv_instructions_1_0= ruleInstruction ) )
            // InternalTraceryLanguage.g:84:4: (lv_instructions_1_0= ruleInstruction )
            {
            // InternalTraceryLanguage.g:84:4: (lv_instructions_1_0= ruleInstruction )
            // InternalTraceryLanguage.g:85:5: lv_instructions_1_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getTraceryProgramAccess().getInstructionsInstructionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_instructions_1_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceryProgram"


    // $ANTLR start "entryRuleFirstJSONStatements"
    // InternalTraceryLanguage.g:110:1: entryRuleFirstJSONStatements returns [EObject current=null] : iv_ruleFirstJSONStatements= ruleFirstJSONStatements EOF ;
    public final EObject entryRuleFirstJSONStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstJSONStatements = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:112:2: (iv_ruleFirstJSONStatements= ruleFirstJSONStatements EOF )
            // InternalTraceryLanguage.g:113:2: iv_ruleFirstJSONStatements= ruleFirstJSONStatements EOF
            {
             newCompositeNode(grammarAccess.getFirstJSONStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirstJSONStatements=ruleFirstJSONStatements();

            state._fsp--;

             current =iv_ruleFirstJSONStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFirstJSONStatements"


    // $ANTLR start "ruleFirstJSONStatements"
    // InternalTraceryLanguage.g:122:1: ruleFirstJSONStatements returns [EObject current=null] : (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleFirstJSONFinish ) ) ) ;
    public final EObject ruleFirstJSONStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:129:2: ( (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleFirstJSONFinish ) ) ) )
            // InternalTraceryLanguage.g:130:2: (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleFirstJSONFinish ) ) )
            {
            // InternalTraceryLanguage.g:130:2: (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleFirstJSONFinish ) ) )
            // InternalTraceryLanguage.g:131:3: otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleFirstJSONFinish ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFirstJSONStatementsAccess().getAmpersandKeyword_0());
            		
            // InternalTraceryLanguage.g:135:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTraceryLanguage.g:136:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:136:4: (lv_name_1_0= RULE_ID )
            // InternalTraceryLanguage.g:137:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFirstJSONStatementsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFirstJSONStatementsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFirstJSONStatementsAccess().getAmpersandKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFirstJSONStatementsAccess().getColonKeyword_3());
            		
            // InternalTraceryLanguage.g:161:3: ( (lv_value_4_0= ruleFirstJSONFinish ) )
            // InternalTraceryLanguage.g:162:4: (lv_value_4_0= ruleFirstJSONFinish )
            {
            // InternalTraceryLanguage.g:162:4: (lv_value_4_0= ruleFirstJSONFinish )
            // InternalTraceryLanguage.g:163:5: lv_value_4_0= ruleFirstJSONFinish
            {

            					newCompositeNode(grammarAccess.getFirstJSONStatementsAccess().getValueFirstJSONFinishParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleFirstJSONFinish();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFirstJSONStatementsRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FirstJSONFinish");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFirstJSONStatements"


    // $ANTLR start "entryRuleFirstJSONFinish"
    // InternalTraceryLanguage.g:187:1: entryRuleFirstJSONFinish returns [EObject current=null] : iv_ruleFirstJSONFinish= ruleFirstJSONFinish EOF ;
    public final EObject entryRuleFirstJSONFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstJSONFinish = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:189:2: (iv_ruleFirstJSONFinish= ruleFirstJSONFinish EOF )
            // InternalTraceryLanguage.g:190:2: iv_ruleFirstJSONFinish= ruleFirstJSONFinish EOF
            {
             newCompositeNode(grammarAccess.getFirstJSONFinishRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirstJSONFinish=ruleFirstJSONFinish();

            state._fsp--;

             current =iv_ruleFirstJSONFinish; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFirstJSONFinish"


    // $ANTLR start "ruleFirstJSONFinish"
    // InternalTraceryLanguage.g:199:1: ruleFirstJSONFinish returns [EObject current=null] : (otherlv_0= '[' this_InternalVals_1= ruleInternalVals otherlv_2= ']' otherlv_3= ',' ) ;
    public final EObject ruleFirstJSONFinish() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_InternalVals_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:206:2: ( (otherlv_0= '[' this_InternalVals_1= ruleInternalVals otherlv_2= ']' otherlv_3= ',' ) )
            // InternalTraceryLanguage.g:207:2: (otherlv_0= '[' this_InternalVals_1= ruleInternalVals otherlv_2= ']' otherlv_3= ',' )
            {
            // InternalTraceryLanguage.g:207:2: (otherlv_0= '[' this_InternalVals_1= ruleInternalVals otherlv_2= ']' otherlv_3= ',' )
            // InternalTraceryLanguage.g:208:3: otherlv_0= '[' this_InternalVals_1= ruleInternalVals otherlv_2= ']' otherlv_3= ','
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFirstJSONFinishAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFirstJSONFinishAccess().getInternalValsParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_InternalVals_1=ruleInternalVals();

            state._fsp--;


            			current = this_InternalVals_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFirstJSONFinishAccess().getRightSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFirstJSONFinishAccess().getCommaKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFirstJSONFinish"


    // $ANTLR start "entryRuleInitialVal"
    // InternalTraceryLanguage.g:235:1: entryRuleInitialVal returns [EObject current=null] : iv_ruleInitialVal= ruleInitialVal EOF ;
    public final EObject entryRuleInitialVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialVal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:237:2: (iv_ruleInitialVal= ruleInitialVal EOF )
            // InternalTraceryLanguage.g:238:2: iv_ruleInitialVal= ruleInitialVal EOF
            {
             newCompositeNode(grammarAccess.getInitialValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialVal=ruleInitialVal();

            state._fsp--;

             current =iv_ruleInitialVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInitialVal"


    // $ANTLR start "ruleInitialVal"
    // InternalTraceryLanguage.g:247:1: ruleInitialVal returns [EObject current=null] : (otherlv_0= '&' ( (lv_valInternalInstruction_1_0= ruleInternalInstructions ) )+ otherlv_2= '&' ) ;
    public final EObject ruleInitialVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_valInternalInstruction_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:254:2: ( (otherlv_0= '&' ( (lv_valInternalInstruction_1_0= ruleInternalInstructions ) )+ otherlv_2= '&' ) )
            // InternalTraceryLanguage.g:255:2: (otherlv_0= '&' ( (lv_valInternalInstruction_1_0= ruleInternalInstructions ) )+ otherlv_2= '&' )
            {
            // InternalTraceryLanguage.g:255:2: (otherlv_0= '&' ( (lv_valInternalInstruction_1_0= ruleInternalInstructions ) )+ otherlv_2= '&' )
            // InternalTraceryLanguage.g:256:3: otherlv_0= '&' ( (lv_valInternalInstruction_1_0= ruleInternalInstructions ) )+ otherlv_2= '&'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialValAccess().getAmpersandKeyword_0());
            		
            // InternalTraceryLanguage.g:260:3: ( (lv_valInternalInstruction_1_0= ruleInternalInstructions ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryLanguage.g:261:4: (lv_valInternalInstruction_1_0= ruleInternalInstructions )
            	    {
            	    // InternalTraceryLanguage.g:261:4: (lv_valInternalInstruction_1_0= ruleInternalInstructions )
            	    // InternalTraceryLanguage.g:262:5: lv_valInternalInstruction_1_0= ruleInternalInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getInitialValAccess().getValInternalInstructionInternalInstructionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_valInternalInstruction_1_0=ruleInternalInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitialValRule());
            	    					}
            	    					add(
            	    						current,
            	    						"valInternalInstruction",
            	    						lv_valInternalInstruction_1_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InternalInstructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialValAccess().getAmpersandKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInitialVal"


    // $ANTLR start "entryRuleInstruction"
    // InternalTraceryLanguage.g:290:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:292:2: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalTraceryLanguage.g:293:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalTraceryLanguage.g:302:1: ruleInstruction returns [EObject current=null] : ( ( (lv_firstInstruction_0_0= ruleFirstJSONStatements ) )* ( (lv_lastInstruction_1_0= ruleLastJSONStatement ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_firstInstruction_0_0 = null;

        EObject lv_lastInstruction_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:309:2: ( ( ( (lv_firstInstruction_0_0= ruleFirstJSONStatements ) )* ( (lv_lastInstruction_1_0= ruleLastJSONStatement ) ) ) )
            // InternalTraceryLanguage.g:310:2: ( ( (lv_firstInstruction_0_0= ruleFirstJSONStatements ) )* ( (lv_lastInstruction_1_0= ruleLastJSONStatement ) ) )
            {
            // InternalTraceryLanguage.g:310:2: ( ( (lv_firstInstruction_0_0= ruleFirstJSONStatements ) )* ( (lv_lastInstruction_1_0= ruleLastJSONStatement ) ) )
            // InternalTraceryLanguage.g:311:3: ( (lv_firstInstruction_0_0= ruleFirstJSONStatements ) )* ( (lv_lastInstruction_1_0= ruleLastJSONStatement ) )
            {
            // InternalTraceryLanguage.g:311:3: ( (lv_firstInstruction_0_0= ruleFirstJSONStatements ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:312:4: (lv_firstInstruction_0_0= ruleFirstJSONStatements )
            	    {
            	    // InternalTraceryLanguage.g:312:4: (lv_firstInstruction_0_0= ruleFirstJSONStatements )
            	    // InternalTraceryLanguage.g:313:5: lv_firstInstruction_0_0= ruleFirstJSONStatements
            	    {

            	    					newCompositeNode(grammarAccess.getInstructionAccess().getFirstInstructionFirstJSONStatementsParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_firstInstruction_0_0=ruleFirstJSONStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstructionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"firstInstruction",
            	    						lv_firstInstruction_0_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FirstJSONStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTraceryLanguage.g:330:3: ( (lv_lastInstruction_1_0= ruleLastJSONStatement ) )
            // InternalTraceryLanguage.g:331:4: (lv_lastInstruction_1_0= ruleLastJSONStatement )
            {
            // InternalTraceryLanguage.g:331:4: (lv_lastInstruction_1_0= ruleLastJSONStatement )
            // InternalTraceryLanguage.g:332:5: lv_lastInstruction_1_0= ruleLastJSONStatement
            {

            					newCompositeNode(grammarAccess.getInstructionAccess().getLastInstructionLastJSONStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_lastInstruction_1_0=ruleLastJSONStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionRule());
            					}
            					set(
            						current,
            						"lastInstruction",
            						lv_lastInstruction_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.LastJSONStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInternalInstructions"
    // InternalTraceryLanguage.g:356:1: entryRuleInternalInstructions returns [EObject current=null] : iv_ruleInternalInstructions= ruleInternalInstructions EOF ;
    public final EObject entryRuleInternalInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalInstructions = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:358:2: (iv_ruleInternalInstructions= ruleInternalInstructions EOF )
            // InternalTraceryLanguage.g:359:2: iv_ruleInternalInstructions= ruleInternalInstructions EOF
            {
             newCompositeNode(grammarAccess.getInternalInstructionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalInstructions=ruleInternalInstructions();

            state._fsp--;

             current =iv_ruleInternalInstructions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInternalInstructions"


    // $ANTLR start "ruleInternalInstructions"
    // InternalTraceryLanguage.g:368:1: ruleInternalInstructions returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_StringDeclaration_1= ruleStringDeclaration ) ;
    public final EObject ruleInternalInstructions() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_StringDeclaration_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:375:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_StringDeclaration_1= ruleStringDeclaration ) )
            // InternalTraceryLanguage.g:376:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_StringDeclaration_1= ruleStringDeclaration )
            {
            // InternalTraceryLanguage.g:376:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_StringDeclaration_1= ruleStringDeclaration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryLanguage.g:377:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getInternalInstructionsAccess().getVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:386:3: this_StringDeclaration_1= ruleStringDeclaration
                    {

                    			newCompositeNode(grammarAccess.getInternalInstructionsAccess().getStringDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringDeclaration_1=ruleStringDeclaration();

                    state._fsp--;


                    			current = this_StringDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInternalInstructions"


    // $ANTLR start "entryRuleInternalVals"
    // InternalTraceryLanguage.g:401:1: entryRuleInternalVals returns [EObject current=null] : iv_ruleInternalVals= ruleInternalVals EOF ;
    public final EObject entryRuleInternalVals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalVals = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:403:2: (iv_ruleInternalVals= ruleInternalVals EOF )
            // InternalTraceryLanguage.g:404:2: iv_ruleInternalVals= ruleInternalVals EOF
            {
             newCompositeNode(grammarAccess.getInternalValsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalVals=ruleInternalVals();

            state._fsp--;

             current =iv_ruleInternalVals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInternalVals"


    // $ANTLR start "ruleInternalVals"
    // InternalTraceryLanguage.g:413:1: ruleInternalVals returns [EObject current=null] : (this_InitialVal_0= ruleInitialVal ( (lv_vals_1_0= ruleStandardVal ) )* ) ;
    public final EObject ruleInternalVals() throws RecognitionException {
        EObject current = null;

        EObject this_InitialVal_0 = null;

        EObject lv_vals_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:420:2: ( (this_InitialVal_0= ruleInitialVal ( (lv_vals_1_0= ruleStandardVal ) )* ) )
            // InternalTraceryLanguage.g:421:2: (this_InitialVal_0= ruleInitialVal ( (lv_vals_1_0= ruleStandardVal ) )* )
            {
            // InternalTraceryLanguage.g:421:2: (this_InitialVal_0= ruleInitialVal ( (lv_vals_1_0= ruleStandardVal ) )* )
            // InternalTraceryLanguage.g:422:3: this_InitialVal_0= ruleInitialVal ( (lv_vals_1_0= ruleStandardVal ) )*
            {

            			newCompositeNode(grammarAccess.getInternalValsAccess().getInitialValParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_InitialVal_0=ruleInitialVal();

            state._fsp--;


            			current = this_InitialVal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryLanguage.g:430:3: ( (lv_vals_1_0= ruleStandardVal ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:431:4: (lv_vals_1_0= ruleStandardVal )
            	    {
            	    // InternalTraceryLanguage.g:431:4: (lv_vals_1_0= ruleStandardVal )
            	    // InternalTraceryLanguage.g:432:5: lv_vals_1_0= ruleStandardVal
            	    {

            	    					newCompositeNode(grammarAccess.getInternalValsAccess().getValsStandardValParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_vals_1_0=ruleStandardVal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInternalValsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vals",
            	    						lv_vals_1_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StandardVal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInternalVals"


    // $ANTLR start "entryRuleLastJSONFinish"
    // InternalTraceryLanguage.g:456:1: entryRuleLastJSONFinish returns [EObject current=null] : iv_ruleLastJSONFinish= ruleLastJSONFinish EOF ;
    public final EObject entryRuleLastJSONFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastJSONFinish = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:458:2: (iv_ruleLastJSONFinish= ruleLastJSONFinish EOF )
            // InternalTraceryLanguage.g:459:2: iv_ruleLastJSONFinish= ruleLastJSONFinish EOF
            {
             newCompositeNode(grammarAccess.getLastJSONFinishRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLastJSONFinish=ruleLastJSONFinish();

            state._fsp--;

             current =iv_ruleLastJSONFinish; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLastJSONFinish"


    // $ANTLR start "ruleLastJSONFinish"
    // InternalTraceryLanguage.g:468:1: ruleLastJSONFinish returns [EObject current=null] : (otherlv_0= '[' this_InitialVal_1= ruleInitialVal ( (lv_vals_2_0= ruleStandardVal ) )* otherlv_3= ']' ) ;
    public final EObject ruleLastJSONFinish() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_InitialVal_1 = null;

        EObject lv_vals_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:475:2: ( (otherlv_0= '[' this_InitialVal_1= ruleInitialVal ( (lv_vals_2_0= ruleStandardVal ) )* otherlv_3= ']' ) )
            // InternalTraceryLanguage.g:476:2: (otherlv_0= '[' this_InitialVal_1= ruleInitialVal ( (lv_vals_2_0= ruleStandardVal ) )* otherlv_3= ']' )
            {
            // InternalTraceryLanguage.g:476:2: (otherlv_0= '[' this_InitialVal_1= ruleInitialVal ( (lv_vals_2_0= ruleStandardVal ) )* otherlv_3= ']' )
            // InternalTraceryLanguage.g:477:3: otherlv_0= '[' this_InitialVal_1= ruleInitialVal ( (lv_vals_2_0= ruleStandardVal ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLastJSONFinishAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLastJSONFinishAccess().getInitialValParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_InitialVal_1=ruleInitialVal();

            state._fsp--;


            			current = this_InitialVal_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryLanguage.g:489:3: ( (lv_vals_2_0= ruleStandardVal ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:490:4: (lv_vals_2_0= ruleStandardVal )
            	    {
            	    // InternalTraceryLanguage.g:490:4: (lv_vals_2_0= ruleStandardVal )
            	    // InternalTraceryLanguage.g:491:5: lv_vals_2_0= ruleStandardVal
            	    {

            	    					newCompositeNode(grammarAccess.getLastJSONFinishAccess().getValsStandardValParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_vals_2_0=ruleStandardVal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLastJSONFinishRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vals",
            	    						lv_vals_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StandardVal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLastJSONFinishAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLastJSONFinish"


    // $ANTLR start "entryRuleLastJSONStatement"
    // InternalTraceryLanguage.g:519:1: entryRuleLastJSONStatement returns [EObject current=null] : iv_ruleLastJSONStatement= ruleLastJSONStatement EOF ;
    public final EObject entryRuleLastJSONStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastJSONStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:521:2: (iv_ruleLastJSONStatement= ruleLastJSONStatement EOF )
            // InternalTraceryLanguage.g:522:2: iv_ruleLastJSONStatement= ruleLastJSONStatement EOF
            {
             newCompositeNode(grammarAccess.getLastJSONStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLastJSONStatement=ruleLastJSONStatement();

            state._fsp--;

             current =iv_ruleLastJSONStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLastJSONStatement"


    // $ANTLR start "ruleLastJSONStatement"
    // InternalTraceryLanguage.g:531:1: ruleLastJSONStatement returns [EObject current=null] : (otherlv_0= '&start&' otherlv_1= ':' ( (lv_value_2_0= ruleLastJSONFinish ) ) ) ;
    public final EObject ruleLastJSONStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:538:2: ( (otherlv_0= '&start&' otherlv_1= ':' ( (lv_value_2_0= ruleLastJSONFinish ) ) ) )
            // InternalTraceryLanguage.g:539:2: (otherlv_0= '&start&' otherlv_1= ':' ( (lv_value_2_0= ruleLastJSONFinish ) ) )
            {
            // InternalTraceryLanguage.g:539:2: (otherlv_0= '&start&' otherlv_1= ':' ( (lv_value_2_0= ruleLastJSONFinish ) ) )
            // InternalTraceryLanguage.g:540:3: otherlv_0= '&start&' otherlv_1= ':' ( (lv_value_2_0= ruleLastJSONFinish ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLastJSONStatementAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLastJSONStatementAccess().getColonKeyword_1());
            		
            // InternalTraceryLanguage.g:548:3: ( (lv_value_2_0= ruleLastJSONFinish ) )
            // InternalTraceryLanguage.g:549:4: (lv_value_2_0= ruleLastJSONFinish )
            {
            // InternalTraceryLanguage.g:549:4: (lv_value_2_0= ruleLastJSONFinish )
            // InternalTraceryLanguage.g:550:5: lv_value_2_0= ruleLastJSONFinish
            {

            					newCompositeNode(grammarAccess.getLastJSONStatementAccess().getValueLastJSONFinishParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLastJSONFinish();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLastJSONStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.LastJSONFinish");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLastJSONStatement"


    // $ANTLR start "entryRuleStandardVal"
    // InternalTraceryLanguage.g:574:1: entryRuleStandardVal returns [EObject current=null] : iv_ruleStandardVal= ruleStandardVal EOF ;
    public final EObject entryRuleStandardVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:576:2: (iv_ruleStandardVal= ruleStandardVal EOF )
            // InternalTraceryLanguage.g:577:2: iv_ruleStandardVal= ruleStandardVal EOF
            {
             newCompositeNode(grammarAccess.getStandardValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardVal=ruleStandardVal();

            state._fsp--;

             current =iv_ruleStandardVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStandardVal"


    // $ANTLR start "ruleStandardVal"
    // InternalTraceryLanguage.g:586:1: ruleStandardVal returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '&' ( (lv_valInternalInstruction_2_0= ruleInternalInstructions ) )+ otherlv_3= '&' ) ;
    public final EObject ruleStandardVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valInternalInstruction_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:593:2: ( (otherlv_0= ',' otherlv_1= '&' ( (lv_valInternalInstruction_2_0= ruleInternalInstructions ) )+ otherlv_3= '&' ) )
            // InternalTraceryLanguage.g:594:2: (otherlv_0= ',' otherlv_1= '&' ( (lv_valInternalInstruction_2_0= ruleInternalInstructions ) )+ otherlv_3= '&' )
            {
            // InternalTraceryLanguage.g:594:2: (otherlv_0= ',' otherlv_1= '&' ( (lv_valInternalInstruction_2_0= ruleInternalInstructions ) )+ otherlv_3= '&' )
            // InternalTraceryLanguage.g:595:3: otherlv_0= ',' otherlv_1= '&' ( (lv_valInternalInstruction_2_0= ruleInternalInstructions ) )+ otherlv_3= '&'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStandardValAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStandardValAccess().getAmpersandKeyword_1());
            		
            // InternalTraceryLanguage.g:603:3: ( (lv_valInternalInstruction_2_0= ruleInternalInstructions ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:604:4: (lv_valInternalInstruction_2_0= ruleInternalInstructions )
            	    {
            	    // InternalTraceryLanguage.g:604:4: (lv_valInternalInstruction_2_0= ruleInternalInstructions )
            	    // InternalTraceryLanguage.g:605:5: lv_valInternalInstruction_2_0= ruleInternalInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getStandardValAccess().getValInternalInstructionInternalInstructionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_valInternalInstruction_2_0=ruleInternalInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStandardValRule());
            	    					}
            	    					add(
            	    						current,
            	    						"valInternalInstruction",
            	    						lv_valInternalInstruction_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InternalInstructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStandardValAccess().getAmpersandKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStandardVal"


    // $ANTLR start "entryRuleStringDeclaration"
    // InternalTraceryLanguage.g:633:1: entryRuleStringDeclaration returns [EObject current=null] : iv_ruleStringDeclaration= ruleStringDeclaration EOF ;
    public final EObject entryRuleStringDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:635:2: (iv_ruleStringDeclaration= ruleStringDeclaration EOF )
            // InternalTraceryLanguage.g:636:2: iv_ruleStringDeclaration= ruleStringDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStringDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringDeclaration=ruleStringDeclaration();

            state._fsp--;

             current =iv_ruleStringDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStringDeclaration"


    // $ANTLR start "ruleStringDeclaration"
    // InternalTraceryLanguage.g:645:1: ruleStringDeclaration returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:652:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryLanguage.g:653:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryLanguage.g:653:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryLanguage.g:654:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryLanguage.g:654:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryLanguage.g:655:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringDeclarationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStringDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTraceryLanguage.g:677:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:679:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTraceryLanguage.g:680:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTraceryLanguage.g:689:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:696:2: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' ) )
            // InternalTraceryLanguage.g:697:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' )
            {
            // InternalTraceryLanguage.g:697:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' )
            // InternalTraceryLanguage.g:698:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getNumberSignKeyword_0());
            		
            // InternalTraceryLanguage.g:702:3: ( (otherlv_1= RULE_ID ) )
            // InternalTraceryLanguage.g:703:4: (otherlv_1= RULE_ID )
            {
            // InternalTraceryLanguage.g:703:4: (otherlv_1= RULE_ID )
            // InternalTraceryLanguage.g:704:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getVariableFirstJSONStatementsCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getNumberSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});

}