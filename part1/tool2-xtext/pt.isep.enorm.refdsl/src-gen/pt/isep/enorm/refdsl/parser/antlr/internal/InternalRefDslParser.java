package pt.isep.enorm.refdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.enorm.refdsl.services.RefDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RefModel'", "'{'", "'userTypes'", "','", "'}'", "'resourceTypes'", "'feedbackTypes'", "'feedbackDefinitions'", "'automationRules'", "'UserType'", "'superTypes'", "'('", "')'", "'ResourceType'", "'attributes'", "'authorizationRules'", "'Attribute'", "'type'", "'FeedbackType'", "'hasRating'", "'recursive'", "'FeedbackDefinition'", "'subject'", "'writers'", "'validationRules'", "'ValidationRule'", "'name'", "'kind'", "'implementationId'", "'AuthorizationRule'", "'allowedAction'", "'role'", "'AutomationRule'", "'trigger'", "'condition'", "'actionDescription'", "'true'", "'false'", "'TEXT'", "'NUMBER'", "'BOOLEAN'", "'DATE'", "'IMAGE'", "'VIDEO'", "'AUTOMATIC'", "'MANUAL'", "'READ'", "'WRITE'", "'CREATE'", "'UPDATE'", "'DELETE'", "'MODERATE'", "'REPORT'", "'VALIDATE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRefDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefDsl.g"; }



     	private RefDslGrammarAccess grammarAccess;

        public InternalRefDslParser(TokenStream input, RefDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RefModel";
       	}

       	@Override
       	protected RefDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRefModel"
    // InternalRefDsl.g:65:1: entryRuleRefModel returns [EObject current=null] : iv_ruleRefModel= ruleRefModel EOF ;
    public final EObject entryRuleRefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefModel = null;


        try {
            // InternalRefDsl.g:65:49: (iv_ruleRefModel= ruleRefModel EOF )
            // InternalRefDsl.g:66:2: iv_ruleRefModel= ruleRefModel EOF
            {
             newCompositeNode(grammarAccess.getRefModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefModel=ruleRefModel();

            state._fsp--;

             current =iv_ruleRefModel; 
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
    // $ANTLR end "entryRuleRefModel"


    // $ANTLR start "ruleRefModel"
    // InternalRefDsl.g:72:1: ruleRefModel returns [EObject current=null] : (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}' )? (otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}' )? (otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}' )? (otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}' )? (otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
    public final EObject ruleRefModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_userTypes_5_0 = null;

        EObject lv_userTypes_7_0 = null;

        EObject lv_resourceTypes_11_0 = null;

        EObject lv_resourceTypes_13_0 = null;

        EObject lv_feedbackTypes_17_0 = null;

        EObject lv_feedbackTypes_19_0 = null;

        EObject lv_feedbackDefinitions_23_0 = null;

        EObject lv_feedbackDefinitions_25_0 = null;

        EObject lv_automationRules_29_0 = null;

        EObject lv_automationRules_31_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:78:2: ( (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}' )? (otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}' )? (otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}' )? (otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}' )? (otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // InternalRefDsl.g:79:2: (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}' )? (otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}' )? (otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}' )? (otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}' )? (otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // InternalRefDsl.g:79:2: (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}' )? (otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}' )? (otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}' )? (otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}' )? (otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // InternalRefDsl.g:80:3: otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}' )? (otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}' )? (otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}' )? (otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}' )? (otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRefModelAccess().getRefModelKeyword_0());
            		
            // InternalRefDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRefModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRefDsl.g:107:3: (otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRefDsl.g:108:4: otherlv_3= 'userTypes' otherlv_4= '{' ( (lv_userTypes_5_0= ruleUserType ) ) (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRefModelAccess().getUserTypesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRefDsl.g:116:4: ( (lv_userTypes_5_0= ruleUserType ) )
                    // InternalRefDsl.g:117:5: (lv_userTypes_5_0= ruleUserType )
                    {
                    // InternalRefDsl.g:117:5: (lv_userTypes_5_0= ruleUserType )
                    // InternalRefDsl.g:118:6: lv_userTypes_5_0= ruleUserType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getUserTypesUserTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_userTypes_5_0=ruleUserType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"userTypes",
                    							lv_userTypes_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.UserType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:135:4: (otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRefDsl.g:136:5: otherlv_6= ',' ( (lv_userTypes_7_0= ruleUserType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRefModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRefDsl.g:140:5: ( (lv_userTypes_7_0= ruleUserType ) )
                    	    // InternalRefDsl.g:141:6: (lv_userTypes_7_0= ruleUserType )
                    	    {
                    	    // InternalRefDsl.g:141:6: (lv_userTypes_7_0= ruleUserType )
                    	    // InternalRefDsl.g:142:7: lv_userTypes_7_0= ruleUserType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getUserTypesUserTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_userTypes_7_0=ruleUserType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"userTypes",
                    	    								lv_userTypes_7_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.UserType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:165:3: (otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefDsl.g:166:4: otherlv_9= 'resourceTypes' otherlv_10= '{' ( (lv_resourceTypes_11_0= ruleResourceType ) ) (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getRefModelAccess().getResourceTypesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRefDsl.g:174:4: ( (lv_resourceTypes_11_0= ruleResourceType ) )
                    // InternalRefDsl.g:175:5: (lv_resourceTypes_11_0= ruleResourceType )
                    {
                    // InternalRefDsl.g:175:5: (lv_resourceTypes_11_0= ruleResourceType )
                    // InternalRefDsl.g:176:6: lv_resourceTypes_11_0= ruleResourceType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getResourceTypesResourceTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_resourceTypes_11_0=ruleResourceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"resourceTypes",
                    							lv_resourceTypes_11_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ResourceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:193:4: (otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRefDsl.g:194:5: otherlv_12= ',' ( (lv_resourceTypes_13_0= ruleResourceType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRefModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:198:5: ( (lv_resourceTypes_13_0= ruleResourceType ) )
                    	    // InternalRefDsl.g:199:6: (lv_resourceTypes_13_0= ruleResourceType )
                    	    {
                    	    // InternalRefDsl.g:199:6: (lv_resourceTypes_13_0= ruleResourceType )
                    	    // InternalRefDsl.g:200:7: lv_resourceTypes_13_0= ruleResourceType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getResourceTypesResourceTypeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_resourceTypes_13_0=ruleResourceType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resourceTypes",
                    	    								lv_resourceTypes_13_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ResourceType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:223:3: (otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefDsl.g:224:4: otherlv_15= 'feedbackTypes' otherlv_16= '{' ( (lv_feedbackTypes_17_0= ruleFeedbackType ) ) (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getRefModelAccess().getFeedbackTypesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRefDsl.g:232:4: ( (lv_feedbackTypes_17_0= ruleFeedbackType ) )
                    // InternalRefDsl.g:233:5: (lv_feedbackTypes_17_0= ruleFeedbackType )
                    {
                    // InternalRefDsl.g:233:5: (lv_feedbackTypes_17_0= ruleFeedbackType )
                    // InternalRefDsl.g:234:6: lv_feedbackTypes_17_0= ruleFeedbackType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackTypesFeedbackTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_feedbackTypes_17_0=ruleFeedbackType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"feedbackTypes",
                    							lv_feedbackTypes_17_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:251:4: (otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRefDsl.g:252:5: otherlv_18= ',' ( (lv_feedbackTypes_19_0= ruleFeedbackType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRefModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRefDsl.g:256:5: ( (lv_feedbackTypes_19_0= ruleFeedbackType ) )
                    	    // InternalRefDsl.g:257:6: (lv_feedbackTypes_19_0= ruleFeedbackType )
                    	    {
                    	    // InternalRefDsl.g:257:6: (lv_feedbackTypes_19_0= ruleFeedbackType )
                    	    // InternalRefDsl.g:258:7: lv_feedbackTypes_19_0= ruleFeedbackType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackTypesFeedbackTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_feedbackTypes_19_0=ruleFeedbackType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feedbackTypes",
                    	    								lv_feedbackTypes_19_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.FeedbackType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:281:3: (otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefDsl.g:282:4: otherlv_21= 'feedbackDefinitions' otherlv_22= '{' ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) ) (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getRefModelAccess().getFeedbackDefinitionsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRefDsl.g:290:4: ( (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition ) )
                    // InternalRefDsl.g:291:5: (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition )
                    {
                    // InternalRefDsl.g:291:5: (lv_feedbackDefinitions_23_0= ruleFeedbackDefinition )
                    // InternalRefDsl.g:292:6: lv_feedbackDefinitions_23_0= ruleFeedbackDefinition
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackDefinitionsFeedbackDefinitionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_feedbackDefinitions_23_0=ruleFeedbackDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"feedbackDefinitions",
                    							lv_feedbackDefinitions_23_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:309:4: (otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRefDsl.g:310:5: otherlv_24= ',' ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getRefModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRefDsl.g:314:5: ( (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition ) )
                    	    // InternalRefDsl.g:315:6: (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition )
                    	    {
                    	    // InternalRefDsl.g:315:6: (lv_feedbackDefinitions_25_0= ruleFeedbackDefinition )
                    	    // InternalRefDsl.g:316:7: lv_feedbackDefinitions_25_0= ruleFeedbackDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackDefinitionsFeedbackDefinitionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_feedbackDefinitions_25_0=ruleFeedbackDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feedbackDefinitions",
                    	    								lv_feedbackDefinitions_25_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.FeedbackDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:339:3: (otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRefDsl.g:340:4: otherlv_27= 'automationRules' otherlv_28= '{' ( (lv_automationRules_29_0= ruleAutomationRule ) ) (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getRefModelAccess().getAutomationRulesKeyword_7_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRefDsl.g:348:4: ( (lv_automationRules_29_0= ruleAutomationRule ) )
                    // InternalRefDsl.g:349:5: (lv_automationRules_29_0= ruleAutomationRule )
                    {
                    // InternalRefDsl.g:349:5: (lv_automationRules_29_0= ruleAutomationRule )
                    // InternalRefDsl.g:350:6: lv_automationRules_29_0= ruleAutomationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getAutomationRulesAutomationRuleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_automationRules_29_0=ruleAutomationRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"automationRules",
                    							lv_automationRules_29_0,
                    							"pt.isep.enorm.refdsl.RefDsl.AutomationRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:367:4: (otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRefDsl.g:368:5: otherlv_30= ',' ( (lv_automationRules_31_0= ruleAutomationRule ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getRefModelAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRefDsl.g:372:5: ( (lv_automationRules_31_0= ruleAutomationRule ) )
                    	    // InternalRefDsl.g:373:6: (lv_automationRules_31_0= ruleAutomationRule )
                    	    {
                    	    // InternalRefDsl.g:373:6: (lv_automationRules_31_0= ruleAutomationRule )
                    	    // InternalRefDsl.g:374:7: lv_automationRules_31_0= ruleAutomationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getAutomationRulesAutomationRuleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_automationRules_31_0=ruleAutomationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"automationRules",
                    	    								lv_automationRules_31_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.AutomationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_32, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_33=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRefModel"


    // $ANTLR start "entryRuleUserType"
    // InternalRefDsl.g:405:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // InternalRefDsl.g:405:49: (iv_ruleUserType= ruleUserType EOF )
            // InternalRefDsl.g:406:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
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
    // $ANTLR end "entryRuleUserType"


    // $ANTLR start "ruleUserType"
    // InternalRefDsl.g:412:1: ruleUserType returns [EObject current=null] : (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:418:2: ( (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ) )
            // InternalRefDsl.g:419:2: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? )
            {
            // InternalRefDsl.g:419:2: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? )
            // InternalRefDsl.g:420:3: otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserTypeAccess().getUserTypeKeyword_0());
            		
            // InternalRefDsl.g:424:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:425:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:425:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:426:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:443:3: (otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRefDsl.g:444:4: otherlv_2= 'superTypes' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getUserTypeAccess().getSuperTypesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserTypeAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalRefDsl.g:452:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:453:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:453:5: ( ruleEString )
                    // InternalRefDsl.g:454:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUserTypeAccess().getSuperTypesUserTypeCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:468:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRefDsl.g:469:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getUserTypeAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRefDsl.g:473:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:474:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:474:6: ( ruleEString )
                    	    // InternalRefDsl.g:475:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUserTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUserTypeAccess().getSuperTypesUserTypeCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getUserTypeAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleUserType"


    // $ANTLR start "entryRuleResourceType"
    // InternalRefDsl.g:499:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalRefDsl.g:499:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalRefDsl.g:500:2: iv_ruleResourceType= ruleResourceType EOF
            {
             newCompositeNode(grammarAccess.getResourceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceType=ruleResourceType();

            state._fsp--;

             current =iv_ruleResourceType; 
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
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // InternalRefDsl.g:506:1: ruleResourceType returns [EObject current=null] : (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? (otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_authorizationRules_11_0 = null;

        EObject lv_authorizationRules_13_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:512:2: ( (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? (otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalRefDsl.g:513:2: (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? (otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalRefDsl.g:513:2: (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? (otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalRefDsl.g:514:3: otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? (otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_0());
            		
            // InternalRefDsl.g:518:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:519:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:519:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:520:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRefDsl.g:541:3: (otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRefDsl.g:542:4: otherlv_3= 'attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getResourceTypeAccess().getAttributesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRefDsl.g:550:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalRefDsl.g:551:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalRefDsl.g:551:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalRefDsl.g:552:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getAttributesAttributeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:569:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRefDsl.g:570:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getResourceTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRefDsl.g:574:5: ( (lv_attributes_7_0= ruleAttribute ) )
                    	    // InternalRefDsl.g:575:6: (lv_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalRefDsl.g:575:6: (lv_attributes_7_0= ruleAttribute )
                    	    // InternalRefDsl.g:576:7: lv_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceTypeAccess().getAttributesAttributeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_7_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:599:3: (otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRefDsl.g:600:4: otherlv_9= 'authorizationRules' otherlv_10= '{' ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) ) (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getResourceTypeAccess().getAuthorizationRulesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRefDsl.g:608:4: ( (lv_authorizationRules_11_0= ruleAuthorizationRule ) )
                    // InternalRefDsl.g:609:5: (lv_authorizationRules_11_0= ruleAuthorizationRule )
                    {
                    // InternalRefDsl.g:609:5: (lv_authorizationRules_11_0= ruleAuthorizationRule )
                    // InternalRefDsl.g:610:6: lv_authorizationRules_11_0= ruleAuthorizationRule
                    {

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getAuthorizationRulesAuthorizationRuleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_authorizationRules_11_0=ruleAuthorizationRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    						}
                    						add(
                    							current,
                    							"authorizationRules",
                    							lv_authorizationRules_11_0,
                    							"pt.isep.enorm.refdsl.RefDsl.AuthorizationRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:627:4: (otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRefDsl.g:628:5: otherlv_12= ',' ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getResourceTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:632:5: ( (lv_authorizationRules_13_0= ruleAuthorizationRule ) )
                    	    // InternalRefDsl.g:633:6: (lv_authorizationRules_13_0= ruleAuthorizationRule )
                    	    {
                    	    // InternalRefDsl.g:633:6: (lv_authorizationRules_13_0= ruleAuthorizationRule )
                    	    // InternalRefDsl.g:634:7: lv_authorizationRules_13_0= ruleAuthorizationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceTypeAccess().getAuthorizationRulesAuthorizationRuleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_authorizationRules_13_0=ruleAuthorizationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"authorizationRules",
                    	    								lv_authorizationRules_13_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.AuthorizationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleAttribute"
    // InternalRefDsl.g:665:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRefDsl.g:665:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRefDsl.g:666:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRefDsl.g:672:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= rulePrimitiveType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:678:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= rulePrimitiveType ) ) ) )
            // InternalRefDsl.g:679:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= rulePrimitiveType ) ) )
            {
            // InternalRefDsl.g:679:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= rulePrimitiveType ) ) )
            // InternalRefDsl.g:680:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= rulePrimitiveType ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRefDsl.g:684:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:685:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:685:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:686:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeKeyword_2());
            		
            // InternalRefDsl.g:707:3: ( (lv_type_3_0= rulePrimitiveType ) )
            // InternalRefDsl.g:708:4: (lv_type_3_0= rulePrimitiveType )
            {
            // InternalRefDsl.g:708:4: (lv_type_3_0= rulePrimitiveType )
            // InternalRefDsl.g:709:5: lv_type_3_0= rulePrimitiveType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypePrimitiveTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=rulePrimitiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.PrimitiveType");
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
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleFeedbackType"
    // InternalRefDsl.g:730:1: entryRuleFeedbackType returns [EObject current=null] : iv_ruleFeedbackType= ruleFeedbackType EOF ;
    public final EObject entryRuleFeedbackType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackType = null;


        try {
            // InternalRefDsl.g:730:53: (iv_ruleFeedbackType= ruleFeedbackType EOF )
            // InternalRefDsl.g:731:2: iv_ruleFeedbackType= ruleFeedbackType EOF
            {
             newCompositeNode(grammarAccess.getFeedbackTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedbackType=ruleFeedbackType();

            state._fsp--;

             current =iv_ruleFeedbackType; 
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
    // $ANTLR end "entryRuleFeedbackType"


    // $ANTLR start "ruleFeedbackType"
    // InternalRefDsl.g:737:1: ruleFeedbackType returns [EObject current=null] : (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) ) )? (otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleFeedbackType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_hasRating_3_0 = null;

        AntlrDatatypeRuleToken lv_recursive_5_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_attributes_10_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:743:2: ( (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) ) )? (otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? ) )
            // InternalRefDsl.g:744:2: (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) ) )? (otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? )
            {
            // InternalRefDsl.g:744:2: (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) ) )? (otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? )
            // InternalRefDsl.g:745:3: otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) ) )? (otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackTypeAccess().getFeedbackTypeKeyword_0());
            		
            // InternalRefDsl.g:749:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:750:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:750:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:751:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:768:3: (otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRefDsl.g:769:4: otherlv_2= 'hasRating' ( (lv_hasRating_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeedbackTypeAccess().getHasRatingKeyword_2_0());
                    			
                    // InternalRefDsl.g:773:4: ( (lv_hasRating_3_0= ruleEBoolean ) )
                    // InternalRefDsl.g:774:5: (lv_hasRating_3_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:774:5: (lv_hasRating_3_0= ruleEBoolean )
                    // InternalRefDsl.g:775:6: lv_hasRating_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getHasRatingEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_hasRating_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"hasRating",
                    							lv_hasRating_3_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:793:3: (otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRefDsl.g:794:4: otherlv_4= 'recursive' ( (lv_recursive_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedbackTypeAccess().getRecursiveKeyword_3_0());
                    			
                    // InternalRefDsl.g:798:4: ( (lv_recursive_5_0= ruleEBoolean ) )
                    // InternalRefDsl.g:799:5: (lv_recursive_5_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:799:5: (lv_recursive_5_0= ruleEBoolean )
                    // InternalRefDsl.g:800:6: lv_recursive_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getRecursiveEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_recursive_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"recursive",
                    							lv_recursive_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:818:3: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRefDsl.g:819:4: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackTypeAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeedbackTypeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRefDsl.g:827:4: ( (lv_attributes_8_0= ruleAttribute ) )
                    // InternalRefDsl.g:828:5: (lv_attributes_8_0= ruleAttribute )
                    {
                    // InternalRefDsl.g:828:5: (lv_attributes_8_0= ruleAttribute )
                    // InternalRefDsl.g:829:6: lv_attributes_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getAttributesAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_attributes_8_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_8_0,
                    							"pt.isep.enorm.refdsl.RefDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:846:4: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRefDsl.g:847:5: otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFeedbackTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:851:5: ( (lv_attributes_10_0= ruleAttribute ) )
                    	    // InternalRefDsl.g:852:6: (lv_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalRefDsl.g:852:6: (lv_attributes_10_0= ruleAttribute )
                    	    // InternalRefDsl.g:853:7: lv_attributes_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeedbackTypeAccess().getAttributesAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributes_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_10_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getFeedbackTypeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleFeedbackType"


    // $ANTLR start "entryRuleFeedbackDefinition"
    // InternalRefDsl.g:880:1: entryRuleFeedbackDefinition returns [EObject current=null] : iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF ;
    public final EObject entryRuleFeedbackDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackDefinition = null;


        try {
            // InternalRefDsl.g:880:59: (iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF )
            // InternalRefDsl.g:881:2: iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF
            {
             newCompositeNode(grammarAccess.getFeedbackDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedbackDefinition=ruleFeedbackDefinition();

            state._fsp--;

             current =iv_ruleFeedbackDefinition; 
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
    // $ANTLR end "entryRuleFeedbackDefinition"


    // $ANTLR start "ruleFeedbackDefinition"
    // InternalRefDsl.g:887:1: ruleFeedbackDefinition returns [EObject current=null] : (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= 'subject' ( ( ruleEString ) ) (otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleFeedbackDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_validationRules_14_0 = null;

        EObject lv_validationRules_16_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:893:2: ( (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= 'subject' ( ( ruleEString ) ) (otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}' )? ) )
            // InternalRefDsl.g:894:2: (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= 'subject' ( ( ruleEString ) ) (otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}' )? )
            {
            // InternalRefDsl.g:894:2: (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= 'subject' ( ( ruleEString ) ) (otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}' )? )
            // InternalRefDsl.g:895:3: otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= 'subject' ( ( ruleEString ) ) (otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackDefinitionAccess().getFeedbackDefinitionKeyword_0());
            		
            // InternalRefDsl.g:899:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:900:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:900:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:901:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackDefinitionAccess().getTypeKeyword_2());
            		
            // InternalRefDsl.g:922:3: ( ( ruleEString ) )
            // InternalRefDsl.g:923:4: ( ruleEString )
            {
            // InternalRefDsl.g:923:4: ( ruleEString )
            // InternalRefDsl.g:924:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getTypeFeedbackTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getFeedbackDefinitionAccess().getSubjectKeyword_4());
            		
            // InternalRefDsl.g:942:3: ( ( ruleEString ) )
            // InternalRefDsl.g:943:4: ( ruleEString )
            {
            // InternalRefDsl.g:943:4: ( ruleEString )
            // InternalRefDsl.g:944:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getSubjectResourceTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:958:3: (otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRefDsl.g:959:4: otherlv_6= 'writers' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackDefinitionAccess().getWritersKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeedbackDefinitionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalRefDsl.g:967:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:968:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:968:5: ( ruleEString )
                    // InternalRefDsl.g:969:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getWritersUserTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:983:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRefDsl.g:984:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFeedbackDefinitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRefDsl.g:988:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:989:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:989:6: ( ruleEString )
                    	    // InternalRefDsl.g:990:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getWritersUserTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getFeedbackDefinitionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:1010:3: (otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRefDsl.g:1011:4: otherlv_12= 'validationRules' otherlv_13= '{' ( (lv_validationRules_14_0= ruleValidationRule ) ) (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeedbackDefinitionAccess().getValidationRulesKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getFeedbackDefinitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRefDsl.g:1019:4: ( (lv_validationRules_14_0= ruleValidationRule ) )
                    // InternalRefDsl.g:1020:5: (lv_validationRules_14_0= ruleValidationRule )
                    {
                    // InternalRefDsl.g:1020:5: (lv_validationRules_14_0= ruleValidationRule )
                    // InternalRefDsl.g:1021:6: lv_validationRules_14_0= ruleValidationRule
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getValidationRulesValidationRuleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_validationRules_14_0=ruleValidationRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"validationRules",
                    							lv_validationRules_14_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ValidationRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:1038:4: (otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRefDsl.g:1039:5: otherlv_15= ',' ( (lv_validationRules_16_0= ruleValidationRule ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getFeedbackDefinitionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRefDsl.g:1043:5: ( (lv_validationRules_16_0= ruleValidationRule ) )
                    	    // InternalRefDsl.g:1044:6: (lv_validationRules_16_0= ruleValidationRule )
                    	    {
                    	    // InternalRefDsl.g:1044:6: (lv_validationRules_16_0= ruleValidationRule )
                    	    // InternalRefDsl.g:1045:7: lv_validationRules_16_0= ruleValidationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getValidationRulesValidationRuleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_validationRules_16_0=ruleValidationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"validationRules",
                    	    								lv_validationRules_16_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ValidationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getFeedbackDefinitionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleFeedbackDefinition"


    // $ANTLR start "entryRuleValidationRule"
    // InternalRefDsl.g:1072:1: entryRuleValidationRule returns [EObject current=null] : iv_ruleValidationRule= ruleValidationRule EOF ;
    public final EObject entryRuleValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationRule = null;


        try {
            // InternalRefDsl.g:1072:55: (iv_ruleValidationRule= ruleValidationRule EOF )
            // InternalRefDsl.g:1073:2: iv_ruleValidationRule= ruleValidationRule EOF
            {
             newCompositeNode(grammarAccess.getValidationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationRule=ruleValidationRule();

            state._fsp--;

             current =iv_ruleValidationRule; 
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
    // $ANTLR end "entryRuleValidationRule"


    // $ANTLR start "ruleValidationRule"
    // InternalRefDsl.g:1079:1: ruleValidationRule returns [EObject current=null] : (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_implementationId_6_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1085:2: ( (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) ) )? ) )
            // InternalRefDsl.g:1086:2: (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) ) )? )
            {
            // InternalRefDsl.g:1086:2: (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) ) )? )
            // InternalRefDsl.g:1087:3: otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationRuleAccess().getValidationRuleKeyword_0());
            		
            // InternalRefDsl.g:1091:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRefDsl.g:1092:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getValidationRuleAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:1096:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:1097:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:1097:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:1098:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationRuleRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getValidationRuleAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:1120:3: ( (lv_kind_4_0= ruleValidationKind ) )
            // InternalRefDsl.g:1121:4: (lv_kind_4_0= ruleValidationKind )
            {
            // InternalRefDsl.g:1121:4: (lv_kind_4_0= ruleValidationKind )
            // InternalRefDsl.g:1122:5: lv_kind_4_0= ruleValidationKind
            {

            					newCompositeNode(grammarAccess.getValidationRuleAccess().getKindValidationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_kind_4_0=ruleValidationKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationRuleRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_4_0,
            						"pt.isep.enorm.refdsl.RefDsl.ValidationKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1139:3: (otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRefDsl.g:1140:4: otherlv_5= 'implementationId' ( (lv_implementationId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidationRuleAccess().getImplementationIdKeyword_4_0());
                    			
                    // InternalRefDsl.g:1144:4: ( (lv_implementationId_6_0= ruleEString ) )
                    // InternalRefDsl.g:1145:5: (lv_implementationId_6_0= ruleEString )
                    {
                    // InternalRefDsl.g:1145:5: (lv_implementationId_6_0= ruleEString )
                    // InternalRefDsl.g:1146:6: lv_implementationId_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getImplementationIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_implementationId_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationRuleRule());
                    						}
                    						set(
                    							current,
                    							"implementationId",
                    							lv_implementationId_6_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleValidationRule"


    // $ANTLR start "entryRuleAuthorizationRule"
    // InternalRefDsl.g:1168:1: entryRuleAuthorizationRule returns [EObject current=null] : iv_ruleAuthorizationRule= ruleAuthorizationRule EOF ;
    public final EObject entryRuleAuthorizationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorizationRule = null;


        try {
            // InternalRefDsl.g:1168:58: (iv_ruleAuthorizationRule= ruleAuthorizationRule EOF )
            // InternalRefDsl.g:1169:2: iv_ruleAuthorizationRule= ruleAuthorizationRule EOF
            {
             newCompositeNode(grammarAccess.getAuthorizationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthorizationRule=ruleAuthorizationRule();

            state._fsp--;

             current =iv_ruleAuthorizationRule; 
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
    // $ANTLR end "entryRuleAuthorizationRule"


    // $ANTLR start "ruleAuthorizationRule"
    // InternalRefDsl.g:1175:1: ruleAuthorizationRule returns [EObject current=null] : (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'role' ( ( ruleEString ) ) ) ;
    public final EObject ruleAuthorizationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_allowedAction_2_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1181:2: ( (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'role' ( ( ruleEString ) ) ) )
            // InternalRefDsl.g:1182:2: (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'role' ( ( ruleEString ) ) )
            {
            // InternalRefDsl.g:1182:2: (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'role' ( ( ruleEString ) ) )
            // InternalRefDsl.g:1183:3: otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'role' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorizationRuleAccess().getAuthorizationRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthorizationRuleAccess().getAllowedActionKeyword_1());
            		
            // InternalRefDsl.g:1191:3: ( (lv_allowedAction_2_0= ruleActionKind ) )
            // InternalRefDsl.g:1192:4: (lv_allowedAction_2_0= ruleActionKind )
            {
            // InternalRefDsl.g:1192:4: (lv_allowedAction_2_0= ruleActionKind )
            // InternalRefDsl.g:1193:5: lv_allowedAction_2_0= ruleActionKind
            {

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getAllowedActionActionKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_allowedAction_2_0=ruleActionKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthorizationRuleRule());
            					}
            					set(
            						current,
            						"allowedAction",
            						lv_allowedAction_2_0,
            						"pt.isep.enorm.refdsl.RefDsl.ActionKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthorizationRuleAccess().getRoleKeyword_3());
            		
            // InternalRefDsl.g:1214:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1215:4: ( ruleEString )
            {
            // InternalRefDsl.g:1215:4: ( ruleEString )
            // InternalRefDsl.g:1216:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorizationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getRoleUserTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
        }
        return current;
    }
    // $ANTLR end "ruleAuthorizationRule"


    // $ANTLR start "entryRuleAutomationRule"
    // InternalRefDsl.g:1234:1: entryRuleAutomationRule returns [EObject current=null] : iv_ruleAutomationRule= ruleAutomationRule EOF ;
    public final EObject entryRuleAutomationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomationRule = null;


        try {
            // InternalRefDsl.g:1234:55: (iv_ruleAutomationRule= ruleAutomationRule EOF )
            // InternalRefDsl.g:1235:2: iv_ruleAutomationRule= ruleAutomationRule EOF
            {
             newCompositeNode(grammarAccess.getAutomationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomationRule=ruleAutomationRule();

            state._fsp--;

             current =iv_ruleAutomationRule; 
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
    // $ANTLR end "entryRuleAutomationRule"


    // $ANTLR start "ruleAutomationRule"
    // InternalRefDsl.g:1241:1: ruleAutomationRule returns [EObject current=null] : (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) )? (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? (otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleAutomationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_trigger_3_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        AntlrDatatypeRuleToken lv_actionDescription_7_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1247:2: ( (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) )? (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? (otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) )? ) )
            // InternalRefDsl.g:1248:2: (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) )? (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? (otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) )? )
            {
            // InternalRefDsl.g:1248:2: (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) )? (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? (otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) )? )
            // InternalRefDsl.g:1249:3: otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) )? (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? (otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomationRuleAccess().getAutomationRuleKeyword_0());
            		
            // InternalRefDsl.g:1253:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1254:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1254:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1255:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1272:3: (otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRefDsl.g:1273:4: otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getAutomationRuleAccess().getTriggerKeyword_2_0());
                    			
                    // InternalRefDsl.g:1277:4: ( (lv_trigger_3_0= ruleEString ) )
                    // InternalRefDsl.g:1278:5: (lv_trigger_3_0= ruleEString )
                    {
                    // InternalRefDsl.g:1278:5: (lv_trigger_3_0= ruleEString )
                    // InternalRefDsl.g:1279:6: lv_trigger_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getTriggerEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_trigger_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_3_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1297:3: (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRefDsl.g:1298:4: otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAutomationRuleAccess().getConditionKeyword_3_0());
                    			
                    // InternalRefDsl.g:1302:4: ( (lv_condition_5_0= ruleEString ) )
                    // InternalRefDsl.g:1303:5: (lv_condition_5_0= ruleEString )
                    {
                    // InternalRefDsl.g:1303:5: (lv_condition_5_0= ruleEString )
                    // InternalRefDsl.g:1304:6: lv_condition_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getConditionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_condition_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1322:3: (otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRefDsl.g:1323:4: otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAutomationRuleAccess().getActionDescriptionKeyword_4_0());
                    			
                    // InternalRefDsl.g:1327:4: ( (lv_actionDescription_7_0= ruleEString ) )
                    // InternalRefDsl.g:1328:5: (lv_actionDescription_7_0= ruleEString )
                    {
                    // InternalRefDsl.g:1328:5: (lv_actionDescription_7_0= ruleEString )
                    // InternalRefDsl.g:1329:6: lv_actionDescription_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getActionDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_actionDescription_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionDescription",
                    							lv_actionDescription_7_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleAutomationRule"


    // $ANTLR start "entryRuleEString"
    // InternalRefDsl.g:1351:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRefDsl.g:1351:47: (iv_ruleEString= ruleEString EOF )
            // InternalRefDsl.g:1352:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRefDsl.g:1358:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:1364:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRefDsl.g:1365:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRefDsl.g:1365:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalRefDsl.g:1366:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:1374:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalRefDsl.g:1385:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalRefDsl.g:1385:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalRefDsl.g:1386:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalRefDsl.g:1392:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRefDsl.g:1398:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalRefDsl.g:1399:2: (kw= 'true' | kw= 'false' )
            {
            // InternalRefDsl.g:1399:2: (kw= 'true' | kw= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            else if ( (LA31_0==48) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRefDsl.g:1400:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:1406:3: kw= 'false'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rulePrimitiveType"
    // InternalRefDsl.g:1415:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'IMAGE' ) | (enumLiteral_5= 'VIDEO' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRefDsl.g:1421:2: ( ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'IMAGE' ) | (enumLiteral_5= 'VIDEO' ) ) )
            // InternalRefDsl.g:1422:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'IMAGE' ) | (enumLiteral_5= 'VIDEO' ) )
            {
            // InternalRefDsl.g:1422:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'IMAGE' ) | (enumLiteral_5= 'VIDEO' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt32=1;
                }
                break;
            case 50:
                {
                alt32=2;
                }
                break;
            case 51:
                {
                alt32=3;
                }
                break;
            case 52:
                {
                alt32=4;
                }
                break;
            case 53:
                {
                alt32=5;
                }
                break;
            case 54:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRefDsl.g:1423:3: (enumLiteral_0= 'TEXT' )
                    {
                    // InternalRefDsl.g:1423:3: (enumLiteral_0= 'TEXT' )
                    // InternalRefDsl.g:1424:4: enumLiteral_0= 'TEXT'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getTEXTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:1431:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalRefDsl.g:1431:3: (enumLiteral_1= 'NUMBER' )
                    // InternalRefDsl.g:1432:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:1439:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalRefDsl.g:1439:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalRefDsl.g:1440:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:1447:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalRefDsl.g:1447:3: (enumLiteral_3= 'DATE' )
                    // InternalRefDsl.g:1448:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:1455:3: (enumLiteral_4= 'IMAGE' )
                    {
                    // InternalRefDsl.g:1455:3: (enumLiteral_4= 'IMAGE' )
                    // InternalRefDsl.g:1456:4: enumLiteral_4= 'IMAGE'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getIMAGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getIMAGEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:1463:3: (enumLiteral_5= 'VIDEO' )
                    {
                    // InternalRefDsl.g:1463:3: (enumLiteral_5= 'VIDEO' )
                    // InternalRefDsl.g:1464:4: enumLiteral_5= 'VIDEO'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getVIDEOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getVIDEOEnumLiteralDeclaration_5());
                    			

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
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleValidationKind"
    // InternalRefDsl.g:1474:1: ruleValidationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) ) ;
    public final Enumerator ruleValidationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:1480:2: ( ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) ) )
            // InternalRefDsl.g:1481:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) )
            {
            // InternalRefDsl.g:1481:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            else if ( (LA33_0==56) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRefDsl.g:1482:3: (enumLiteral_0= 'AUTOMATIC' )
                    {
                    // InternalRefDsl.g:1482:3: (enumLiteral_0= 'AUTOMATIC' )
                    // InternalRefDsl.g:1483:4: enumLiteral_0= 'AUTOMATIC'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getValidationKindAccess().getAUTOMATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationKindAccess().getAUTOMATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:1490:3: (enumLiteral_1= 'MANUAL' )
                    {
                    // InternalRefDsl.g:1490:3: (enumLiteral_1= 'MANUAL' )
                    // InternalRefDsl.g:1491:4: enumLiteral_1= 'MANUAL'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getValidationKindAccess().getMANUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationKindAccess().getMANUALEnumLiteralDeclaration_1());
                    			

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
        }
        return current;
    }
    // $ANTLR end "ruleValidationKind"


    // $ANTLR start "ruleActionKind"
    // InternalRefDsl.g:1501:1: ruleActionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'WRITE' ) | (enumLiteral_2= 'CREATE' ) | (enumLiteral_3= 'UPDATE' ) | (enumLiteral_4= 'DELETE' ) | (enumLiteral_5= 'MODERATE' ) | (enumLiteral_6= 'REPORT' ) | (enumLiteral_7= 'VALIDATE' ) ) ;
    public final Enumerator ruleActionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalRefDsl.g:1507:2: ( ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'WRITE' ) | (enumLiteral_2= 'CREATE' ) | (enumLiteral_3= 'UPDATE' ) | (enumLiteral_4= 'DELETE' ) | (enumLiteral_5= 'MODERATE' ) | (enumLiteral_6= 'REPORT' ) | (enumLiteral_7= 'VALIDATE' ) ) )
            // InternalRefDsl.g:1508:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'WRITE' ) | (enumLiteral_2= 'CREATE' ) | (enumLiteral_3= 'UPDATE' ) | (enumLiteral_4= 'DELETE' ) | (enumLiteral_5= 'MODERATE' ) | (enumLiteral_6= 'REPORT' ) | (enumLiteral_7= 'VALIDATE' ) )
            {
            // InternalRefDsl.g:1508:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'WRITE' ) | (enumLiteral_2= 'CREATE' ) | (enumLiteral_3= 'UPDATE' ) | (enumLiteral_4= 'DELETE' ) | (enumLiteral_5= 'MODERATE' ) | (enumLiteral_6= 'REPORT' ) | (enumLiteral_7= 'VALIDATE' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt34=1;
                }
                break;
            case 58:
                {
                alt34=2;
                }
                break;
            case 59:
                {
                alt34=3;
                }
                break;
            case 60:
                {
                alt34=4;
                }
                break;
            case 61:
                {
                alt34=5;
                }
                break;
            case 62:
                {
                alt34=6;
                }
                break;
            case 63:
                {
                alt34=7;
                }
                break;
            case 64:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalRefDsl.g:1509:3: (enumLiteral_0= 'READ' )
                    {
                    // InternalRefDsl.g:1509:3: (enumLiteral_0= 'READ' )
                    // InternalRefDsl.g:1510:4: enumLiteral_0= 'READ'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionKindAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:1517:3: (enumLiteral_1= 'WRITE' )
                    {
                    // InternalRefDsl.g:1517:3: (enumLiteral_1= 'WRITE' )
                    // InternalRefDsl.g:1518:4: enumLiteral_1= 'WRITE'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getWRITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionKindAccess().getWRITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:1525:3: (enumLiteral_2= 'CREATE' )
                    {
                    // InternalRefDsl.g:1525:3: (enumLiteral_2= 'CREATE' )
                    // InternalRefDsl.g:1526:4: enumLiteral_2= 'CREATE'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getCREATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionKindAccess().getCREATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:1533:3: (enumLiteral_3= 'UPDATE' )
                    {
                    // InternalRefDsl.g:1533:3: (enumLiteral_3= 'UPDATE' )
                    // InternalRefDsl.g:1534:4: enumLiteral_3= 'UPDATE'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getUPDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionKindAccess().getUPDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:1541:3: (enumLiteral_4= 'DELETE' )
                    {
                    // InternalRefDsl.g:1541:3: (enumLiteral_4= 'DELETE' )
                    // InternalRefDsl.g:1542:4: enumLiteral_4= 'DELETE'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getDELETEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionKindAccess().getDELETEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:1549:3: (enumLiteral_5= 'MODERATE' )
                    {
                    // InternalRefDsl.g:1549:3: (enumLiteral_5= 'MODERATE' )
                    // InternalRefDsl.g:1550:4: enumLiteral_5= 'MODERATE'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getMODERATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionKindAccess().getMODERATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:1557:3: (enumLiteral_6= 'REPORT' )
                    {
                    // InternalRefDsl.g:1557:3: (enumLiteral_6= 'REPORT' )
                    // InternalRefDsl.g:1558:4: enumLiteral_6= 'REPORT'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getREPORTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionKindAccess().getREPORTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:1565:3: (enumLiteral_7= 'VALIDATE' )
                    {
                    // InternalRefDsl.g:1565:3: (enumLiteral_7= 'VALIDATE' )
                    // InternalRefDsl.g:1566:4: enumLiteral_7= 'VALIDATE'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getVALIDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getActionKindAccess().getVALIDATEEnumLiteralDeclaration_7());
                    			

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
        }
        return current;
    }
    // $ANTLR end "ruleActionKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x007E000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C2000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000002L});

}