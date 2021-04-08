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
    // InternalTraceryLanguage.g:71:1: ruleTraceryProgram returns [EObject current=null] : (otherlv_0= '{' () ( (lv_instructions_2_0= ruleStandardJSONStatement ) )* ( (lv_startingInstruction_3_0= ruleStartingJSONStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleTraceryProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_instructions_2_0 = null;

        EObject lv_startingInstruction_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:77:2: ( (otherlv_0= '{' () ( (lv_instructions_2_0= ruleStandardJSONStatement ) )* ( (lv_startingInstruction_3_0= ruleStartingJSONStatement ) ) otherlv_4= '}' ) )
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' () ( (lv_instructions_2_0= ruleStandardJSONStatement ) )* ( (lv_startingInstruction_3_0= ruleStartingJSONStatement ) ) otherlv_4= '}' )
            {
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' () ( (lv_instructions_2_0= ruleStandardJSONStatement ) )* ( (lv_startingInstruction_3_0= ruleStartingJSONStatement ) ) otherlv_4= '}' )
            // InternalTraceryLanguage.g:79:3: otherlv_0= '{' () ( (lv_instructions_2_0= ruleStandardJSONStatement ) )* ( (lv_startingInstruction_3_0= ruleStartingJSONStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:83:3: ()
            // InternalTraceryLanguage.g:84:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1(),
            					current);
            			

            }

            // InternalTraceryLanguage.g:90:3: ( (lv_instructions_2_0= ruleStandardJSONStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryLanguage.g:91:4: (lv_instructions_2_0= ruleStandardJSONStatement )
            	    {
            	    // InternalTraceryLanguage.g:91:4: (lv_instructions_2_0= ruleStandardJSONStatement )
            	    // InternalTraceryLanguage.g:92:5: lv_instructions_2_0= ruleStandardJSONStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTraceryProgramAccess().getInstructionsStandardJSONStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_2_0=ruleStandardJSONStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StandardJSONStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTraceryLanguage.g:109:3: ( (lv_startingInstruction_3_0= ruleStartingJSONStatement ) )
            // InternalTraceryLanguage.g:110:4: (lv_startingInstruction_3_0= ruleStartingJSONStatement )
            {
            // InternalTraceryLanguage.g:110:4: (lv_startingInstruction_3_0= ruleStartingJSONStatement )
            // InternalTraceryLanguage.g:111:5: lv_startingInstruction_3_0= ruleStartingJSONStatement
            {

            					newCompositeNode(grammarAccess.getTraceryProgramAccess().getStartingInstructionStartingJSONStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_startingInstruction_3_0=ruleStartingJSONStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            					}
            					set(
            						current,
            						"startingInstruction",
            						lv_startingInstruction_3_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StartingJSONStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleInitialJSONExpression"
    // InternalTraceryLanguage.g:136:1: entryRuleInitialJSONExpression returns [EObject current=null] : iv_ruleInitialJSONExpression= ruleInitialJSONExpression EOF ;
    public final EObject entryRuleInitialJSONExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialJSONExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:138:2: (iv_ruleInitialJSONExpression= ruleInitialJSONExpression EOF )
            // InternalTraceryLanguage.g:139:2: iv_ruleInitialJSONExpression= ruleInitialJSONExpression EOF
            {
             newCompositeNode(grammarAccess.getInitialJSONExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialJSONExpression=ruleInitialJSONExpression();

            state._fsp--;

             current =iv_ruleInitialJSONExpression; 
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
    // $ANTLR end "entryRuleInitialJSONExpression"


    // $ANTLR start "ruleInitialJSONExpression"
    // InternalTraceryLanguage.g:148:1: ruleInitialJSONExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInitialJSONExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:155:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:156:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:156:2: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryLanguage.g:157:3: (otherlv_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:157:3: (otherlv_0= RULE_ID )
            // InternalTraceryLanguage.g:158:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInitialJSONExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getInitialJSONExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleInitialJSONExpression"


    // $ANTLR start "entryRuleinitialValue"
    // InternalTraceryLanguage.g:175:1: entryRuleinitialValue returns [EObject current=null] : iv_ruleinitialValue= ruleinitialValue EOF ;
    public final EObject entryRuleinitialValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitialValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:177:2: (iv_ruleinitialValue= ruleinitialValue EOF )
            // InternalTraceryLanguage.g:178:2: iv_ruleinitialValue= ruleinitialValue EOF
            {
             newCompositeNode(grammarAccess.getInitialValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinitialValue=ruleinitialValue();

            state._fsp--;

             current =iv_ruleinitialValue; 
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
    // $ANTLR end "entryRuleinitialValue"


    // $ANTLR start "ruleinitialValue"
    // InternalTraceryLanguage.g:187:1: ruleinitialValue returns [EObject current=null] : ( () otherlv_1= '&' ( (lv_value_2_0= ruleInternalInstruction ) )* otherlv_3= '&' ) ;
    public final EObject ruleinitialValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:194:2: ( ( () otherlv_1= '&' ( (lv_value_2_0= ruleInternalInstruction ) )* otherlv_3= '&' ) )
            // InternalTraceryLanguage.g:195:2: ( () otherlv_1= '&' ( (lv_value_2_0= ruleInternalInstruction ) )* otherlv_3= '&' )
            {
            // InternalTraceryLanguage.g:195:2: ( () otherlv_1= '&' ( (lv_value_2_0= ruleInternalInstruction ) )* otherlv_3= '&' )
            // InternalTraceryLanguage.g:196:3: () otherlv_1= '&' ( (lv_value_2_0= ruleInternalInstruction ) )* otherlv_3= '&'
            {
            // InternalTraceryLanguage.g:196:3: ()
            // InternalTraceryLanguage.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialValueAccess().getInitialValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialValueAccess().getAmpersandKeyword_1());
            		
            // InternalTraceryLanguage.g:207:3: ( (lv_value_2_0= ruleInternalInstruction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:208:4: (lv_value_2_0= ruleInternalInstruction )
            	    {
            	    // InternalTraceryLanguage.g:208:4: (lv_value_2_0= ruleInternalInstruction )
            	    // InternalTraceryLanguage.g:209:5: lv_value_2_0= ruleInternalInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getInitialValueAccess().getValueInternalInstructionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_value_2_0=ruleInternalInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitialValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InternalInstruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialValueAccess().getAmpersandKeyword_3());
            		

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
    // $ANTLR end "ruleinitialValue"


    // $ANTLR start "entryRuleInternalInstruction"
    // InternalTraceryLanguage.g:237:1: entryRuleInternalInstruction returns [EObject current=null] : iv_ruleInternalInstruction= ruleInternalInstruction EOF ;
    public final EObject entryRuleInternalInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalInstruction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:239:2: (iv_ruleInternalInstruction= ruleInternalInstruction EOF )
            // InternalTraceryLanguage.g:240:2: iv_ruleInternalInstruction= ruleInternalInstruction EOF
            {
             newCompositeNode(grammarAccess.getInternalInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalInstruction=ruleInternalInstruction();

            state._fsp--;

             current =iv_ruleInternalInstruction; 
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
    // $ANTLR end "entryRuleInternalInstruction"


    // $ANTLR start "ruleInternalInstruction"
    // InternalTraceryLanguage.g:249:1: ruleInternalInstruction returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#' ) | (otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#' ) | (otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#' ) | (otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#' ) ) ;
    public final EObject ruleInternalInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_VariableDeclaration_2 = null;

        EObject this_VariableDeclaration_5 = null;

        EObject this_VariableDeclaration_8 = null;

        EObject this_VariableDeclaration_11 = null;

        EObject this_VariableDeclaration_14 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:256:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#' ) | (otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#' ) | (otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#' ) | (otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#' ) ) )
            // InternalTraceryLanguage.g:257:2: ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#' ) | (otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#' ) | (otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#' ) | (otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#' ) )
            {
            // InternalTraceryLanguage.g:257:2: ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#' ) | (otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#' ) | (otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#' ) | (otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#' ) )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 15:
                        {
                        alt3=2;
                        }
                        break;
                    case 16:
                        {
                        alt3=3;
                        }
                        break;
                    case 17:
                        {
                        alt3=4;
                        }
                        break;
                    case 18:
                        {
                        alt3=5;
                        }
                        break;
                    case 14:
                        {
                        alt3=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryLanguage.g:258:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalTraceryLanguage.g:258:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalTraceryLanguage.g:259:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalTraceryLanguage.g:259:4: (lv_value_0_0= RULE_STRING )
                    // InternalTraceryLanguage.g:260:5: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getInternalInstructionAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInternalInstructionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:277:3: (otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#' )
                    {
                    // InternalTraceryLanguage.g:277:3: (otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#' )
                    // InternalTraceryLanguage.g:278:4: otherlv_1= '#' this_VariableDeclaration_2= ruleVariableDeclaration otherlv_3= '.a#'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_VariableDeclaration_2=ruleVariableDeclaration();

                    state._fsp--;


                    				current = this_VariableDeclaration_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInternalInstructionAccess().getAKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryLanguage.g:296:3: (otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#' )
                    {
                    // InternalTraceryLanguage.g:296:3: (otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#' )
                    // InternalTraceryLanguage.g:297:4: otherlv_4= '#' this_VariableDeclaration_5= ruleVariableDeclaration otherlv_6= '.capitalise#'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_VariableDeclaration_5=ruleVariableDeclaration();

                    state._fsp--;


                    				current = this_VariableDeclaration_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getInternalInstructionAccess().getCapitaliseKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryLanguage.g:315:3: (otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#' )
                    {
                    // InternalTraceryLanguage.g:315:3: (otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#' )
                    // InternalTraceryLanguage.g:316:4: otherlv_7= '#' this_VariableDeclaration_8= ruleVariableDeclaration otherlv_9= '.ed#'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_VariableDeclaration_8=ruleVariableDeclaration();

                    state._fsp--;


                    				current = this_VariableDeclaration_8;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getInternalInstructionAccess().getEdKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryLanguage.g:334:3: (otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#' )
                    {
                    // InternalTraceryLanguage.g:334:3: (otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#' )
                    // InternalTraceryLanguage.g:335:4: otherlv_10= '#' this_VariableDeclaration_11= ruleVariableDeclaration otherlv_12= '.the#'
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_VariableDeclaration_11=ruleVariableDeclaration();

                    state._fsp--;


                    				current = this_VariableDeclaration_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getInternalInstructionAccess().getTheKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTraceryLanguage.g:353:3: (otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#' )
                    {
                    // InternalTraceryLanguage.g:353:3: (otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#' )
                    // InternalTraceryLanguage.g:354:4: otherlv_13= '#' this_VariableDeclaration_14= ruleVariableDeclaration otherlv_15= '#'
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getInternalInstructionAccess().getVariableDeclarationParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_VariableDeclaration_14=ruleVariableDeclaration();

                    state._fsp--;


                    				current = this_VariableDeclaration_14;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getInternalInstructionAccess().getNumberSignKeyword_5_2());
                    			

                    }


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
    // $ANTLR end "ruleInternalInstruction"


    // $ANTLR start "entryRuleStandardJSONStatement"
    // InternalTraceryLanguage.g:378:1: entryRuleStandardJSONStatement returns [EObject current=null] : iv_ruleStandardJSONStatement= ruleStandardJSONStatement EOF ;
    public final EObject entryRuleStandardJSONStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardJSONStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:380:2: (iv_ruleStandardJSONStatement= ruleStandardJSONStatement EOF )
            // InternalTraceryLanguage.g:381:2: iv_ruleStandardJSONStatement= ruleStandardJSONStatement EOF
            {
             newCompositeNode(grammarAccess.getStandardJSONStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardJSONStatement=ruleStandardJSONStatement();

            state._fsp--;

             current =iv_ruleStandardJSONStatement; 
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
    // $ANTLR end "entryRuleStandardJSONStatement"


    // $ANTLR start "ruleStandardJSONStatement"
    // InternalTraceryLanguage.g:390:1: ruleStandardJSONStatement returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '&' this_InitialJSONExpression_2= ruleInitialJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_initialValues_6_0= ruleinitialValue ) ) ( (lv_standardValues_7_0= rulestandardValue ) )* otherlv_8= ']' ) ;
    public final EObject ruleStandardJSONStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_InitialJSONExpression_2 = null;

        EObject lv_initialValues_6_0 = null;

        EObject lv_standardValues_7_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:397:2: ( (otherlv_0= ',' otherlv_1= '&' this_InitialJSONExpression_2= ruleInitialJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_initialValues_6_0= ruleinitialValue ) ) ( (lv_standardValues_7_0= rulestandardValue ) )* otherlv_8= ']' ) )
            // InternalTraceryLanguage.g:398:2: (otherlv_0= ',' otherlv_1= '&' this_InitialJSONExpression_2= ruleInitialJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_initialValues_6_0= ruleinitialValue ) ) ( (lv_standardValues_7_0= rulestandardValue ) )* otherlv_8= ']' )
            {
            // InternalTraceryLanguage.g:398:2: (otherlv_0= ',' otherlv_1= '&' this_InitialJSONExpression_2= ruleInitialJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_initialValues_6_0= ruleinitialValue ) ) ( (lv_standardValues_7_0= rulestandardValue ) )* otherlv_8= ']' )
            // InternalTraceryLanguage.g:399:3: otherlv_0= ',' otherlv_1= '&' this_InitialJSONExpression_2= ruleInitialJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_initialValues_6_0= ruleinitialValue ) ) ( (lv_standardValues_7_0= rulestandardValue ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStandardJSONStatementAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_1());
            		

            			newCompositeNode(grammarAccess.getStandardJSONStatementAccess().getInitialJSONExpressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_12);
            this_InitialJSONExpression_2=ruleInitialJSONExpression();

            state._fsp--;


            			current = this_InitialJSONExpression_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getStandardJSONStatementAccess().getAmpersandKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardJSONStatementAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getStandardJSONStatementAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalTraceryLanguage.g:427:3: ( (lv_initialValues_6_0= ruleinitialValue ) )
            // InternalTraceryLanguage.g:428:4: (lv_initialValues_6_0= ruleinitialValue )
            {
            // InternalTraceryLanguage.g:428:4: (lv_initialValues_6_0= ruleinitialValue )
            // InternalTraceryLanguage.g:429:5: lv_initialValues_6_0= ruleinitialValue
            {

            					newCompositeNode(grammarAccess.getStandardJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_initialValues_6_0=ruleinitialValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardJSONStatementRule());
            					}
            					add(
            						current,
            						"initialValues",
            						lv_initialValues_6_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.initialValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:446:3: ( (lv_standardValues_7_0= rulestandardValue ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:447:4: (lv_standardValues_7_0= rulestandardValue )
            	    {
            	    // InternalTraceryLanguage.g:447:4: (lv_standardValues_7_0= rulestandardValue )
            	    // InternalTraceryLanguage.g:448:5: lv_standardValues_7_0= rulestandardValue
            	    {

            	    					newCompositeNode(grammarAccess.getStandardJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_standardValues_7_0=rulestandardValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStandardJSONStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"standardValues",
            	    						lv_standardValues_7_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.standardValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStandardJSONStatementAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStandardJSONStatement"


    // $ANTLR start "entryRuleStartingJSONStatement"
    // InternalTraceryLanguage.g:476:1: entryRuleStartingJSONStatement returns [EObject current=null] : iv_ruleStartingJSONStatement= ruleStartingJSONStatement EOF ;
    public final EObject entryRuleStartingJSONStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingJSONStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:478:2: (iv_ruleStartingJSONStatement= ruleStartingJSONStatement EOF )
            // InternalTraceryLanguage.g:479:2: iv_ruleStartingJSONStatement= ruleStartingJSONStatement EOF
            {
             newCompositeNode(grammarAccess.getStartingJSONStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartingJSONStatement=ruleStartingJSONStatement();

            state._fsp--;

             current =iv_ruleStartingJSONStatement; 
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
    // $ANTLR end "entryRuleStartingJSONStatement"


    // $ANTLR start "ruleStartingJSONStatement"
    // InternalTraceryLanguage.g:488:1: ruleStartingJSONStatement returns [EObject current=null] : (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_initialValues_3_0= ruleinitialValue ) ) ( (lv_standardValues_4_0= rulestandardValue ) )* otherlv_5= ']' ) ;
    public final EObject ruleStartingJSONStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_initialValues_3_0 = null;

        EObject lv_standardValues_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:495:2: ( (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_initialValues_3_0= ruleinitialValue ) ) ( (lv_standardValues_4_0= rulestandardValue ) )* otherlv_5= ']' ) )
            // InternalTraceryLanguage.g:496:2: (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_initialValues_3_0= ruleinitialValue ) ) ( (lv_standardValues_4_0= rulestandardValue ) )* otherlv_5= ']' )
            {
            // InternalTraceryLanguage.g:496:2: (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_initialValues_3_0= ruleinitialValue ) ) ( (lv_standardValues_4_0= rulestandardValue ) )* otherlv_5= ']' )
            // InternalTraceryLanguage.g:497:3: otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_initialValues_3_0= ruleinitialValue ) ) ( (lv_standardValues_4_0= rulestandardValue ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getStartingJSONStatementAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getStartingJSONStatementAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStartingJSONStatementAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalTraceryLanguage.g:509:3: ( (lv_initialValues_3_0= ruleinitialValue ) )
            // InternalTraceryLanguage.g:510:4: (lv_initialValues_3_0= ruleinitialValue )
            {
            // InternalTraceryLanguage.g:510:4: (lv_initialValues_3_0= ruleinitialValue )
            // InternalTraceryLanguage.g:511:5: lv_initialValues_3_0= ruleinitialValue
            {

            					newCompositeNode(grammarAccess.getStartingJSONStatementAccess().getInitialValuesInitialValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_initialValues_3_0=ruleinitialValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartingJSONStatementRule());
            					}
            					add(
            						current,
            						"initialValues",
            						lv_initialValues_3_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.initialValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:528:3: ( (lv_standardValues_4_0= rulestandardValue ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:529:4: (lv_standardValues_4_0= rulestandardValue )
            	    {
            	    // InternalTraceryLanguage.g:529:4: (lv_standardValues_4_0= rulestandardValue )
            	    // InternalTraceryLanguage.g:530:5: lv_standardValues_4_0= rulestandardValue
            	    {

            	    					newCompositeNode(grammarAccess.getStartingJSONStatementAccess().getStandardValuesStandardValueParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_standardValues_4_0=rulestandardValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartingJSONStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"standardValues",
            	    						lv_standardValues_4_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.standardValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStartingJSONStatementAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStartingJSONStatement"


    // $ANTLR start "entryRulestandardValue"
    // InternalTraceryLanguage.g:558:1: entryRulestandardValue returns [EObject current=null] : iv_rulestandardValue= rulestandardValue EOF ;
    public final EObject entryRulestandardValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestandardValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:560:2: (iv_rulestandardValue= rulestandardValue EOF )
            // InternalTraceryLanguage.g:561:2: iv_rulestandardValue= rulestandardValue EOF
            {
             newCompositeNode(grammarAccess.getStandardValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestandardValue=rulestandardValue();

            state._fsp--;

             current =iv_rulestandardValue; 
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
    // $ANTLR end "entryRulestandardValue"


    // $ANTLR start "rulestandardValue"
    // InternalTraceryLanguage.g:570:1: rulestandardValue returns [EObject current=null] : ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInternalInstruction ) )* otherlv_4= '&' ) ;
    public final EObject rulestandardValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:577:2: ( ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInternalInstruction ) )* otherlv_4= '&' ) )
            // InternalTraceryLanguage.g:578:2: ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInternalInstruction ) )* otherlv_4= '&' )
            {
            // InternalTraceryLanguage.g:578:2: ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInternalInstruction ) )* otherlv_4= '&' )
            // InternalTraceryLanguage.g:579:3: () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInternalInstruction ) )* otherlv_4= '&'
            {
            // InternalTraceryLanguage.g:579:3: ()
            // InternalTraceryLanguage.g:580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStandardValueAccess().getStandardValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStandardValueAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStandardValueAccess().getAmpersandKeyword_2());
            		
            // InternalTraceryLanguage.g:594:3: ( (lv_value_3_0= ruleInternalInstruction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:595:4: (lv_value_3_0= ruleInternalInstruction )
            	    {
            	    // InternalTraceryLanguage.g:595:4: (lv_value_3_0= ruleInternalInstruction )
            	    // InternalTraceryLanguage.g:596:5: lv_value_3_0= ruleInternalInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getStandardValueAccess().getValueInternalInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_value_3_0=ruleInternalInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStandardValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_3_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InternalInstruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardValueAccess().getAmpersandKeyword_4());
            		

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
    // $ANTLR end "rulestandardValue"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTraceryLanguage.g:624:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:626:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTraceryLanguage.g:627:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalTraceryLanguage.g:636:1: ruleVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:643:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:644:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:644:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryLanguage.g:645:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:645:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryLanguage.g:646:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableDeclarationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariableDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000480000L});

}