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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RefModel'", "'version'", "'{'", "'userTypes'", "','", "'}'", "'resourceTypes'", "'contextTypes'", "'resourceRelations'", "'feedbackTypes'", "'feedbackDefinitions'", "'authorizationRules'", "'validationRules'", "'moderationPolicies'", "'automationRules'", "'verificationPolicies'", "'UserType'", "'kind'", "'superTypes'", "'('", "')'", "'ContextType'", "'contains'", "'ResourceType'", "'supportsMedia'", "'attributes'", "'ResourceRelation'", "'source'", "'target'", "'sourceCardinality'", "'targetCardinality'", "'containment'", "'recursive'", "'required'", "'multiValued'", "'Attribute'", "'type'", "'FeedbackType'", "'subjectScope'", "'hasRating'", "'allowsMedia'", "'FeedbackDefinition'", "'requiresVerifiedContext'", "'uniquePerAuthorTarget'", "'author'", "'subjectResource'", "'subjectFeedback'", "'parent'", "'policy'", "'rating'", "'FeedbackPolicy'", "'status'", "'RatingPolicy'", "'min'", "'max'", "'step'", "'scaleKind'", "'ValidationRule'", "'name'", "'severity'", "'expression'", "'implementationId'", "'appliesToResource'", "'appliesToFeedback'", "'invokedBy'", "'ModerationPolicy'", "'mode'", "'trigger'", "'decision'", "'monitorsResource'", "'monitorsFeedback'", "'executedBy'", "'inContext'", "'AuthorizationRule'", "'allowedAction'", "'actor'", "'context'", "'resourceTarget'", "'feedbackTarget'", "'AutomationRule'", "'condition'", "'actionDescription'", "'onFeedback'", "'uses'", "'VerificationPolicy'", "'appliesWhen'", "'verifies'", "'true'", "'false'", "'.'", "'GENERIC'", "'BUYER'", "'SELLER'", "'CREATOR'", "'MODERATOR'", "'GLOBAL'", "'COMMUNITY'", "'CHANNEL'", "'CATALOG'", "'TEXT'", "'NUMBER'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'IMAGE'", "'VIDEO'", "'URL'", "'COMMENT'", "'REVIEW'", "'REACTION'", "'VOTE'", "'REPORT'", "'SUBSCRIPTION'", "'RESOURCE_ONLY'", "'FEEDBACK_ONLY'", "'RESOURCE_OR_FEEDBACK'", "'ENABLED'", "'DISABLED'", "'NUMERIC'", "'ORDINAL'", "'PERCENTAGE'", "'AUTOMATIC'", "'MANUAL'", "'INFO'", "'WARNING'", "'ERROR'", "'HYBRID'", "'APPROVED'", "'FLAGGED'", "'HIDDEN'", "'REMOVED'", "'BLOCKED'", "'REJECTED'", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'", "'RATE'", "'SUBSCRIBE'", "'MODERATE'", "'VALIDATE'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalRefDsl.g:72:1: ruleRefModel returns [EObject current=null] : (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? otherlv_4= '{' (otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}' )? (otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}' )? (otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}' )? (otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}' )? (otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}' )? (otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}' )? (otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}' )? (otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}' )? (otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}' )? (otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}' )? (otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}' )? otherlv_71= '}' ) ;
    public final EObject ruleRefModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;

        EObject lv_userTypes_7_0 = null;

        EObject lv_userTypes_9_0 = null;

        EObject lv_resourceTypes_13_0 = null;

        EObject lv_resourceTypes_15_0 = null;

        EObject lv_contextTypes_19_0 = null;

        EObject lv_contextTypes_21_0 = null;

        EObject lv_resourceRelations_25_0 = null;

        EObject lv_resourceRelations_27_0 = null;

        EObject lv_feedbackTypes_31_0 = null;

        EObject lv_feedbackTypes_33_0 = null;

        EObject lv_feedbackDefinitions_37_0 = null;

        EObject lv_feedbackDefinitions_39_0 = null;

        EObject lv_authorizationRules_43_0 = null;

        EObject lv_authorizationRules_45_0 = null;

        EObject lv_validationRules_49_0 = null;

        EObject lv_validationRules_51_0 = null;

        EObject lv_moderationPolicies_55_0 = null;

        EObject lv_moderationPolicies_57_0 = null;

        EObject lv_automationRules_61_0 = null;

        EObject lv_automationRules_63_0 = null;

        EObject lv_verificationPolicies_67_0 = null;

        EObject lv_verificationPolicies_69_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:78:2: ( (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? otherlv_4= '{' (otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}' )? (otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}' )? (otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}' )? (otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}' )? (otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}' )? (otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}' )? (otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}' )? (otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}' )? (otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}' )? (otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}' )? (otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}' )? otherlv_71= '}' ) )
            // InternalRefDsl.g:79:2: (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? otherlv_4= '{' (otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}' )? (otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}' )? (otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}' )? (otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}' )? (otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}' )? (otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}' )? (otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}' )? (otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}' )? (otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}' )? (otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}' )? (otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}' )? otherlv_71= '}' )
            {
            // InternalRefDsl.g:79:2: (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? otherlv_4= '{' (otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}' )? (otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}' )? (otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}' )? (otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}' )? (otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}' )? (otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}' )? (otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}' )? (otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}' )? (otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}' )? (otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}' )? (otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}' )? otherlv_71= '}' )
            // InternalRefDsl.g:80:3: otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? otherlv_4= '{' (otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}' )? (otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}' )? (otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}' )? (otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}' )? (otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}' )? (otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}' )? (otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}' )? (otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}' )? (otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}' )? (otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}' )? (otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}' )? otherlv_71= '}'
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

            // InternalRefDsl.g:103:3: (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRefDsl.g:104:4: otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRefModelAccess().getVersionKeyword_2_0());
                    			
                    // InternalRefDsl.g:108:4: ( (lv_version_3_0= ruleEString ) )
                    // InternalRefDsl.g:109:5: (lv_version_3_0= ruleEString )
                    {
                    // InternalRefDsl.g:109:5: (lv_version_3_0= ruleEString )
                    // InternalRefDsl.g:110:6: lv_version_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getVersionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_version_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_3_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRefDsl.g:132:3: (otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRefDsl.g:133:4: otherlv_5= 'userTypes' otherlv_6= '{' ( (lv_userTypes_7_0= ruleUserType ) ) (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRefModelAccess().getUserTypesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRefDsl.g:141:4: ( (lv_userTypes_7_0= ruleUserType ) )
                    // InternalRefDsl.g:142:5: (lv_userTypes_7_0= ruleUserType )
                    {
                    // InternalRefDsl.g:142:5: (lv_userTypes_7_0= ruleUserType )
                    // InternalRefDsl.g:143:6: lv_userTypes_7_0= ruleUserType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getUserTypesUserTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalRefDsl.g:160:4: (otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRefDsl.g:161:5: otherlv_8= ',' ( (lv_userTypes_9_0= ruleUserType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRefModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:165:5: ( (lv_userTypes_9_0= ruleUserType ) )
                    	    // InternalRefDsl.g:166:6: (lv_userTypes_9_0= ruleUserType )
                    	    {
                    	    // InternalRefDsl.g:166:6: (lv_userTypes_9_0= ruleUserType )
                    	    // InternalRefDsl.g:167:7: lv_userTypes_9_0= ruleUserType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getUserTypesUserTypeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_userTypes_9_0=ruleUserType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"userTypes",
                    	    								lv_userTypes_9_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.UserType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:190:3: (otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRefDsl.g:191:4: otherlv_11= 'resourceTypes' otherlv_12= '{' ( (lv_resourceTypes_13_0= ruleResourceType ) ) (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getRefModelAccess().getResourceTypesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRefDsl.g:199:4: ( (lv_resourceTypes_13_0= ruleResourceType ) )
                    // InternalRefDsl.g:200:5: (lv_resourceTypes_13_0= ruleResourceType )
                    {
                    // InternalRefDsl.g:200:5: (lv_resourceTypes_13_0= ruleResourceType )
                    // InternalRefDsl.g:201:6: lv_resourceTypes_13_0= ruleResourceType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getResourceTypesResourceTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalRefDsl.g:218:4: (otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRefDsl.g:219:5: otherlv_14= ',' ( (lv_resourceTypes_15_0= ruleResourceType ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRefModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRefDsl.g:223:5: ( (lv_resourceTypes_15_0= ruleResourceType ) )
                    	    // InternalRefDsl.g:224:6: (lv_resourceTypes_15_0= ruleResourceType )
                    	    {
                    	    // InternalRefDsl.g:224:6: (lv_resourceTypes_15_0= ruleResourceType )
                    	    // InternalRefDsl.g:225:7: lv_resourceTypes_15_0= ruleResourceType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getResourceTypesResourceTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_resourceTypes_15_0=ruleResourceType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resourceTypes",
                    	    								lv_resourceTypes_15_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ResourceType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:248:3: (otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRefDsl.g:249:4: otherlv_17= 'contextTypes' otherlv_18= '{' ( (lv_contextTypes_19_0= ruleContextType ) ) (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getRefModelAccess().getContextTypesKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRefDsl.g:257:4: ( (lv_contextTypes_19_0= ruleContextType ) )
                    // InternalRefDsl.g:258:5: (lv_contextTypes_19_0= ruleContextType )
                    {
                    // InternalRefDsl.g:258:5: (lv_contextTypes_19_0= ruleContextType )
                    // InternalRefDsl.g:259:6: lv_contextTypes_19_0= ruleContextType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getContextTypesContextTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_contextTypes_19_0=ruleContextType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"contextTypes",
                    							lv_contextTypes_19_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ContextType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:276:4: (otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRefDsl.g:277:5: otherlv_20= ',' ( (lv_contextTypes_21_0= ruleContextType ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getRefModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRefDsl.g:281:5: ( (lv_contextTypes_21_0= ruleContextType ) )
                    	    // InternalRefDsl.g:282:6: (lv_contextTypes_21_0= ruleContextType )
                    	    {
                    	    // InternalRefDsl.g:282:6: (lv_contextTypes_21_0= ruleContextType )
                    	    // InternalRefDsl.g:283:7: lv_contextTypes_21_0= ruleContextType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getContextTypesContextTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_contextTypes_21_0=ruleContextType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contextTypes",
                    	    								lv_contextTypes_21_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ContextType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:306:3: (otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRefDsl.g:307:4: otherlv_23= 'resourceRelations' otherlv_24= '{' ( (lv_resourceRelations_25_0= ruleResourceRelation ) ) (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getRefModelAccess().getResourceRelationsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRefDsl.g:315:4: ( (lv_resourceRelations_25_0= ruleResourceRelation ) )
                    // InternalRefDsl.g:316:5: (lv_resourceRelations_25_0= ruleResourceRelation )
                    {
                    // InternalRefDsl.g:316:5: (lv_resourceRelations_25_0= ruleResourceRelation )
                    // InternalRefDsl.g:317:6: lv_resourceRelations_25_0= ruleResourceRelation
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getResourceRelationsResourceRelationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_resourceRelations_25_0=ruleResourceRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"resourceRelations",
                    							lv_resourceRelations_25_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ResourceRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:334:4: (otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRefDsl.g:335:5: otherlv_26= ',' ( (lv_resourceRelations_27_0= ruleResourceRelation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getRefModelAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRefDsl.g:339:5: ( (lv_resourceRelations_27_0= ruleResourceRelation ) )
                    	    // InternalRefDsl.g:340:6: (lv_resourceRelations_27_0= ruleResourceRelation )
                    	    {
                    	    // InternalRefDsl.g:340:6: (lv_resourceRelations_27_0= ruleResourceRelation )
                    	    // InternalRefDsl.g:341:7: lv_resourceRelations_27_0= ruleResourceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getResourceRelationsResourceRelationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_resourceRelations_27_0=ruleResourceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resourceRelations",
                    	    								lv_resourceRelations_27_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ResourceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:364:3: (otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRefDsl.g:365:4: otherlv_29= 'feedbackTypes' otherlv_30= '{' ( (lv_feedbackTypes_31_0= ruleFeedbackType ) ) (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_29, grammarAccess.getRefModelAccess().getFeedbackTypesKeyword_8_0());
                    			
                    otherlv_30=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_30, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRefDsl.g:373:4: ( (lv_feedbackTypes_31_0= ruleFeedbackType ) )
                    // InternalRefDsl.g:374:5: (lv_feedbackTypes_31_0= ruleFeedbackType )
                    {
                    // InternalRefDsl.g:374:5: (lv_feedbackTypes_31_0= ruleFeedbackType )
                    // InternalRefDsl.g:375:6: lv_feedbackTypes_31_0= ruleFeedbackType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackTypesFeedbackTypeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_feedbackTypes_31_0=ruleFeedbackType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"feedbackTypes",
                    							lv_feedbackTypes_31_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:392:4: (otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRefDsl.g:393:5: otherlv_32= ',' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) )
                    	    {
                    	    otherlv_32=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getRefModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRefDsl.g:397:5: ( (lv_feedbackTypes_33_0= ruleFeedbackType ) )
                    	    // InternalRefDsl.g:398:6: (lv_feedbackTypes_33_0= ruleFeedbackType )
                    	    {
                    	    // InternalRefDsl.g:398:6: (lv_feedbackTypes_33_0= ruleFeedbackType )
                    	    // InternalRefDsl.g:399:7: lv_feedbackTypes_33_0= ruleFeedbackType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackTypesFeedbackTypeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_feedbackTypes_33_0=ruleFeedbackType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feedbackTypes",
                    	    								lv_feedbackTypes_33_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.FeedbackType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_34, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:422:3: (otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRefDsl.g:423:4: otherlv_35= 'feedbackDefinitions' otherlv_36= '{' ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) ) (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_35, grammarAccess.getRefModelAccess().getFeedbackDefinitionsKeyword_9_0());
                    			
                    otherlv_36=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_36, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRefDsl.g:431:4: ( (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition ) )
                    // InternalRefDsl.g:432:5: (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition )
                    {
                    // InternalRefDsl.g:432:5: (lv_feedbackDefinitions_37_0= ruleFeedbackDefinition )
                    // InternalRefDsl.g:433:6: lv_feedbackDefinitions_37_0= ruleFeedbackDefinition
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackDefinitionsFeedbackDefinitionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_feedbackDefinitions_37_0=ruleFeedbackDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"feedbackDefinitions",
                    							lv_feedbackDefinitions_37_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:450:4: (otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRefDsl.g:451:5: otherlv_38= ',' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) )
                    	    {
                    	    otherlv_38=(Token)match(input,15,FOLLOW_18); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getRefModelAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRefDsl.g:455:5: ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) )
                    	    // InternalRefDsl.g:456:6: (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition )
                    	    {
                    	    // InternalRefDsl.g:456:6: (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition )
                    	    // InternalRefDsl.g:457:7: lv_feedbackDefinitions_39_0= ruleFeedbackDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackDefinitionsFeedbackDefinitionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_feedbackDefinitions_39_0=ruleFeedbackDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feedbackDefinitions",
                    	    								lv_feedbackDefinitions_39_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.FeedbackDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_40, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:480:3: (otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRefDsl.g:481:4: otherlv_41= 'authorizationRules' otherlv_42= '{' ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) ) (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )* otherlv_46= '}'
                    {
                    otherlv_41=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_41, grammarAccess.getRefModelAccess().getAuthorizationRulesKeyword_10_0());
                    			
                    otherlv_42=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_42, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRefDsl.g:489:4: ( (lv_authorizationRules_43_0= ruleAuthorizationRule ) )
                    // InternalRefDsl.g:490:5: (lv_authorizationRules_43_0= ruleAuthorizationRule )
                    {
                    // InternalRefDsl.g:490:5: (lv_authorizationRules_43_0= ruleAuthorizationRule )
                    // InternalRefDsl.g:491:6: lv_authorizationRules_43_0= ruleAuthorizationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getAuthorizationRulesAuthorizationRuleParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_authorizationRules_43_0=ruleAuthorizationRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"authorizationRules",
                    							lv_authorizationRules_43_0,
                    							"pt.isep.enorm.refdsl.RefDsl.AuthorizationRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:508:4: (otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRefDsl.g:509:5: otherlv_44= ',' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) )
                    	    {
                    	    otherlv_44=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_44, grammarAccess.getRefModelAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRefDsl.g:513:5: ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) )
                    	    // InternalRefDsl.g:514:6: (lv_authorizationRules_45_0= ruleAuthorizationRule )
                    	    {
                    	    // InternalRefDsl.g:514:6: (lv_authorizationRules_45_0= ruleAuthorizationRule )
                    	    // InternalRefDsl.g:515:7: lv_authorizationRules_45_0= ruleAuthorizationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getAuthorizationRulesAuthorizationRuleParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_authorizationRules_45_0=ruleAuthorizationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"authorizationRules",
                    	    								lv_authorizationRules_45_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.AuthorizationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_46, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:538:3: (otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRefDsl.g:539:4: otherlv_47= 'validationRules' otherlv_48= '{' ( (lv_validationRules_49_0= ruleValidationRule ) ) (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )* otherlv_52= '}'
                    {
                    otherlv_47=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_47, grammarAccess.getRefModelAccess().getValidationRulesKeyword_11_0());
                    			
                    otherlv_48=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_48, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalRefDsl.g:547:4: ( (lv_validationRules_49_0= ruleValidationRule ) )
                    // InternalRefDsl.g:548:5: (lv_validationRules_49_0= ruleValidationRule )
                    {
                    // InternalRefDsl.g:548:5: (lv_validationRules_49_0= ruleValidationRule )
                    // InternalRefDsl.g:549:6: lv_validationRules_49_0= ruleValidationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getValidationRulesValidationRuleParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_validationRules_49_0=ruleValidationRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"validationRules",
                    							lv_validationRules_49_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ValidationRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:566:4: (otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRefDsl.g:567:5: otherlv_50= ',' ( (lv_validationRules_51_0= ruleValidationRule ) )
                    	    {
                    	    otherlv_50=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_50, grammarAccess.getRefModelAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalRefDsl.g:571:5: ( (lv_validationRules_51_0= ruleValidationRule ) )
                    	    // InternalRefDsl.g:572:6: (lv_validationRules_51_0= ruleValidationRule )
                    	    {
                    	    // InternalRefDsl.g:572:6: (lv_validationRules_51_0= ruleValidationRule )
                    	    // InternalRefDsl.g:573:7: lv_validationRules_51_0= ruleValidationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getValidationRulesValidationRuleParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_validationRules_51_0=ruleValidationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"validationRules",
                    	    								lv_validationRules_51_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ValidationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_52=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_52, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:596:3: (otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRefDsl.g:597:4: otherlv_53= 'moderationPolicies' otherlv_54= '{' ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) ) (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )* otherlv_58= '}'
                    {
                    otherlv_53=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_53, grammarAccess.getRefModelAccess().getModerationPoliciesKeyword_12_0());
                    			
                    otherlv_54=(Token)match(input,13,FOLLOW_24); 

                    				newLeafNode(otherlv_54, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalRefDsl.g:605:4: ( (lv_moderationPolicies_55_0= ruleModerationPolicy ) )
                    // InternalRefDsl.g:606:5: (lv_moderationPolicies_55_0= ruleModerationPolicy )
                    {
                    // InternalRefDsl.g:606:5: (lv_moderationPolicies_55_0= ruleModerationPolicy )
                    // InternalRefDsl.g:607:6: lv_moderationPolicies_55_0= ruleModerationPolicy
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getModerationPoliciesModerationPolicyParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_moderationPolicies_55_0=ruleModerationPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"moderationPolicies",
                    							lv_moderationPolicies_55_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ModerationPolicy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:624:4: (otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRefDsl.g:625:5: otherlv_56= ',' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) )
                    	    {
                    	    otherlv_56=(Token)match(input,15,FOLLOW_24); 

                    	    					newLeafNode(otherlv_56, grammarAccess.getRefModelAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalRefDsl.g:629:5: ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) )
                    	    // InternalRefDsl.g:630:6: (lv_moderationPolicies_57_0= ruleModerationPolicy )
                    	    {
                    	    // InternalRefDsl.g:630:6: (lv_moderationPolicies_57_0= ruleModerationPolicy )
                    	    // InternalRefDsl.g:631:7: lv_moderationPolicies_57_0= ruleModerationPolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getModerationPoliciesModerationPolicyParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_moderationPolicies_57_0=ruleModerationPolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"moderationPolicies",
                    	    								lv_moderationPolicies_57_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ModerationPolicy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_58=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_58, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:654:3: (otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRefDsl.g:655:4: otherlv_59= 'automationRules' otherlv_60= '{' ( (lv_automationRules_61_0= ruleAutomationRule ) ) (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )* otherlv_64= '}'
                    {
                    otherlv_59=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_59, grammarAccess.getRefModelAccess().getAutomationRulesKeyword_13_0());
                    			
                    otherlv_60=(Token)match(input,13,FOLLOW_26); 

                    				newLeafNode(otherlv_60, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalRefDsl.g:663:4: ( (lv_automationRules_61_0= ruleAutomationRule ) )
                    // InternalRefDsl.g:664:5: (lv_automationRules_61_0= ruleAutomationRule )
                    {
                    // InternalRefDsl.g:664:5: (lv_automationRules_61_0= ruleAutomationRule )
                    // InternalRefDsl.g:665:6: lv_automationRules_61_0= ruleAutomationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getAutomationRulesAutomationRuleParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_automationRules_61_0=ruleAutomationRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"automationRules",
                    							lv_automationRules_61_0,
                    							"pt.isep.enorm.refdsl.RefDsl.AutomationRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:682:4: (otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRefDsl.g:683:5: otherlv_62= ',' ( (lv_automationRules_63_0= ruleAutomationRule ) )
                    	    {
                    	    otherlv_62=(Token)match(input,15,FOLLOW_26); 

                    	    					newLeafNode(otherlv_62, grammarAccess.getRefModelAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalRefDsl.g:687:5: ( (lv_automationRules_63_0= ruleAutomationRule ) )
                    	    // InternalRefDsl.g:688:6: (lv_automationRules_63_0= ruleAutomationRule )
                    	    {
                    	    // InternalRefDsl.g:688:6: (lv_automationRules_63_0= ruleAutomationRule )
                    	    // InternalRefDsl.g:689:7: lv_automationRules_63_0= ruleAutomationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getAutomationRulesAutomationRuleParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_automationRules_63_0=ruleAutomationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"automationRules",
                    	    								lv_automationRules_63_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.AutomationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_64=(Token)match(input,16,FOLLOW_27); 

                    				newLeafNode(otherlv_64, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:712:3: (otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRefDsl.g:713:4: otherlv_65= 'verificationPolicies' otherlv_66= '{' ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) ) (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )* otherlv_70= '}'
                    {
                    otherlv_65=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_65, grammarAccess.getRefModelAccess().getVerificationPoliciesKeyword_14_0());
                    			
                    otherlv_66=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_66, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalRefDsl.g:721:4: ( (lv_verificationPolicies_67_0= ruleVerificationPolicy ) )
                    // InternalRefDsl.g:722:5: (lv_verificationPolicies_67_0= ruleVerificationPolicy )
                    {
                    // InternalRefDsl.g:722:5: (lv_verificationPolicies_67_0= ruleVerificationPolicy )
                    // InternalRefDsl.g:723:6: lv_verificationPolicies_67_0= ruleVerificationPolicy
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getVerificationPoliciesVerificationPolicyParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_verificationPolicies_67_0=ruleVerificationPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"verificationPolicies",
                    							lv_verificationPolicies_67_0,
                    							"pt.isep.enorm.refdsl.RefDsl.VerificationPolicy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:740:4: (otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRefDsl.g:741:5: otherlv_68= ',' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) )
                    	    {
                    	    otherlv_68=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_68, grammarAccess.getRefModelAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalRefDsl.g:745:5: ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) )
                    	    // InternalRefDsl.g:746:6: (lv_verificationPolicies_69_0= ruleVerificationPolicy )
                    	    {
                    	    // InternalRefDsl.g:746:6: (lv_verificationPolicies_69_0= ruleVerificationPolicy )
                    	    // InternalRefDsl.g:747:7: lv_verificationPolicies_69_0= ruleVerificationPolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getVerificationPoliciesVerificationPolicyParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_verificationPolicies_69_0=ruleVerificationPolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"verificationPolicies",
                    	    								lv_verificationPolicies_69_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.VerificationPolicy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_70=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_70, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_71=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_71, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalRefDsl.g:778:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // InternalRefDsl.g:778:49: (iv_ruleUserType= ruleUserType EOF )
            // InternalRefDsl.g:779:2: iv_ruleUserType= ruleUserType EOF
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
    // InternalRefDsl.g:785:1: ruleUserType returns [EObject current=null] : (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_3_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:791:2: ( (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) )
            // InternalRefDsl.g:792:2: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            {
            // InternalRefDsl.g:792:2: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            // InternalRefDsl.g:793:3: otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserTypeAccess().getUserTypeKeyword_0());
            		
            // InternalRefDsl.g:797:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:798:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:798:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:799:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getUserTypeAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:820:3: ( (lv_kind_3_0= ruleUserKind ) )
            // InternalRefDsl.g:821:4: (lv_kind_3_0= ruleUserKind )
            {
            // InternalRefDsl.g:821:4: (lv_kind_3_0= ruleUserKind )
            // InternalRefDsl.g:822:5: lv_kind_3_0= ruleUserKind
            {

            					newCompositeNode(grammarAccess.getUserTypeAccess().getKindUserKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_kind_3_0=ruleUserKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserTypeRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.UserKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:839:3: (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRefDsl.g:840:4: otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getUserTypeAccess().getSuperTypesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserTypeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRefDsl.g:848:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:849:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:849:5: ( ruleEString )
                    // InternalRefDsl.g:850:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUserTypeAccess().getSuperTypesUserTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:864:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRefDsl.g:865:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUserTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:869:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:870:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:870:6: ( ruleEString )
                    	    // InternalRefDsl.g:871:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUserTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUserTypeAccess().getSuperTypesUserTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getUserTypeAccess().getRightParenthesisKeyword_4_4());
                    			

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


    // $ANTLR start "entryRuleContextType"
    // InternalRefDsl.g:895:1: entryRuleContextType returns [EObject current=null] : iv_ruleContextType= ruleContextType EOF ;
    public final EObject entryRuleContextType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextType = null;


        try {
            // InternalRefDsl.g:895:52: (iv_ruleContextType= ruleContextType EOF )
            // InternalRefDsl.g:896:2: iv_ruleContextType= ruleContextType EOF
            {
             newCompositeNode(grammarAccess.getContextTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextType=ruleContextType();

            state._fsp--;

             current =iv_ruleContextType; 
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
    // $ANTLR end "entryRuleContextType"


    // $ANTLR start "ruleContextType"
    // InternalRefDsl.g:902:1: ruleContextType returns [EObject current=null] : (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) ;
    public final EObject ruleContextType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_3_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:908:2: ( (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) )
            // InternalRefDsl.g:909:2: (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            {
            // InternalRefDsl.g:909:2: (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            // InternalRefDsl.g:910:3: otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextTypeAccess().getContextTypeKeyword_0());
            		
            // InternalRefDsl.g:914:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:915:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:915:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:916:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContextTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getContextTypeAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:937:3: ( (lv_kind_3_0= ruleContextKind ) )
            // InternalRefDsl.g:938:4: (lv_kind_3_0= ruleContextKind )
            {
            // InternalRefDsl.g:938:4: (lv_kind_3_0= ruleContextKind )
            // InternalRefDsl.g:939:5: lv_kind_3_0= ruleContextKind
            {

            					newCompositeNode(grammarAccess.getContextTypeAccess().getKindContextKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_kind_3_0=ruleContextKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextTypeRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.ContextKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:956:3: (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRefDsl.g:957:4: otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getContextTypeAccess().getContainsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextTypeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRefDsl.g:965:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:966:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:966:5: ( ruleEString )
                    // InternalRefDsl.g:967:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContextTypeAccess().getContainsResourceTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:981:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRefDsl.g:982:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getContextTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:986:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:987:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:987:6: ( ruleEString )
                    	    // InternalRefDsl.g:988:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContextTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getContextTypeAccess().getContainsResourceTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextTypeAccess().getRightParenthesisKeyword_4_4());
                    			

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
    // $ANTLR end "ruleContextType"


    // $ANTLR start "entryRuleResourceType"
    // InternalRefDsl.g:1012:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalRefDsl.g:1012:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalRefDsl.g:1013:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalRefDsl.g:1019:1: ruleResourceType returns [EObject current=null] : (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_supportsMedia_3_0 = null;

        EObject lv_attributes_13_0 = null;

        EObject lv_attributes_15_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1025:2: ( (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRefDsl.g:1026:2: (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRefDsl.g:1026:2: (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRefDsl.g:1027:3: otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_0());
            		
            // InternalRefDsl.g:1031:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1032:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1032:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1033:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalRefDsl.g:1050:3: (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRefDsl.g:1051:4: otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getResourceTypeAccess().getSupportsMediaKeyword_2_0());
                    			
                    // InternalRefDsl.g:1055:4: ( (lv_supportsMedia_3_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1056:5: (lv_supportsMedia_3_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1056:5: (lv_supportsMedia_3_0= ruleEBoolean )
                    // InternalRefDsl.g:1057:6: lv_supportsMedia_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getSupportsMediaEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_supportsMedia_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    						}
                    						set(
                    							current,
                    							"supportsMedia",
                    							lv_supportsMedia_3_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1075:3: (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRefDsl.g:1076:4: otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getSuperTypesKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourceTypeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRefDsl.g:1084:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1085:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1085:5: ( ruleEString )
                    // InternalRefDsl.g:1086:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getSuperTypesResourceTypeCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:1100:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRefDsl.g:1101:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getResourceTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRefDsl.g:1105:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:1106:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:1106:6: ( ruleEString )
                    	    // InternalRefDsl.g:1107:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourceTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getResourceTypeAccess().getSuperTypesResourceTypeCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getResourceTypeAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_10, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRefDsl.g:1131:3: (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRefDsl.g:1132:4: otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getResourceTypeAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_12, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRefDsl.g:1140:4: ( (lv_attributes_13_0= ruleAttribute ) )
                    // InternalRefDsl.g:1141:5: (lv_attributes_13_0= ruleAttribute )
                    {
                    // InternalRefDsl.g:1141:5: (lv_attributes_13_0= ruleAttribute )
                    // InternalRefDsl.g:1142:6: lv_attributes_13_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getAttributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_attributes_13_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_13_0,
                    							"pt.isep.enorm.refdsl.RefDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:1159:4: (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRefDsl.g:1160:5: otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_41); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getResourceTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRefDsl.g:1164:5: ( (lv_attributes_15_0= ruleAttribute ) )
                    	    // InternalRefDsl.g:1165:6: (lv_attributes_15_0= ruleAttribute )
                    	    {
                    	    // InternalRefDsl.g:1165:6: (lv_attributes_15_0= ruleAttribute )
                    	    // InternalRefDsl.g:1166:7: lv_attributes_15_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceTypeAccess().getAttributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributes_15_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_15_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleResourceRelation"
    // InternalRefDsl.g:1197:1: entryRuleResourceRelation returns [EObject current=null] : iv_ruleResourceRelation= ruleResourceRelation EOF ;
    public final EObject entryRuleResourceRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRelation = null;


        try {
            // InternalRefDsl.g:1197:57: (iv_ruleResourceRelation= ruleResourceRelation EOF )
            // InternalRefDsl.g:1198:2: iv_ruleResourceRelation= ruleResourceRelation EOF
            {
             newCompositeNode(grammarAccess.getResourceRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceRelation=ruleResourceRelation();

            state._fsp--;

             current =iv_ruleResourceRelation; 
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
    // $ANTLR end "entryRuleResourceRelation"


    // $ANTLR start "ruleResourceRelation"
    // InternalRefDsl.g:1204:1: ruleResourceRelation returns [EObject current=null] : (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleResourceRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sourceCardinality_7_0 = null;

        AntlrDatatypeRuleToken lv_targetCardinality_9_0 = null;

        AntlrDatatypeRuleToken lv_containment_11_0 = null;

        AntlrDatatypeRuleToken lv_recursive_13_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1210:2: ( (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? ) )
            // InternalRefDsl.g:1211:2: (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? )
            {
            // InternalRefDsl.g:1211:2: (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? )
            // InternalRefDsl.g:1212:3: otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceRelationAccess().getResourceRelationKeyword_0());
            		
            // InternalRefDsl.g:1216:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1217:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1217:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1218:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceRelationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceRelationAccess().getSourceKeyword_2());
            		
            // InternalRefDsl.g:1239:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1240:4: ( ruleEString )
            {
            // InternalRefDsl.g:1240:4: ( ruleEString )
            // InternalRefDsl.g:1241:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceRelationAccess().getSourceResourceTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getResourceRelationAccess().getTargetKeyword_4());
            		
            // InternalRefDsl.g:1259:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1260:4: ( ruleEString )
            {
            // InternalRefDsl.g:1260:4: ( ruleEString )
            // InternalRefDsl.g:1261:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceRelationAccess().getTargetResourceTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1275:3: (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRefDsl.g:1276:4: otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getResourceRelationAccess().getSourceCardinalityKeyword_6_0());
                    			
                    // InternalRefDsl.g:1280:4: ( (lv_sourceCardinality_7_0= ruleEString ) )
                    // InternalRefDsl.g:1281:5: (lv_sourceCardinality_7_0= ruleEString )
                    {
                    // InternalRefDsl.g:1281:5: (lv_sourceCardinality_7_0= ruleEString )
                    // InternalRefDsl.g:1282:6: lv_sourceCardinality_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getSourceCardinalityEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_sourceCardinality_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceCardinality",
                    							lv_sourceCardinality_7_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1300:3: (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRefDsl.g:1301:4: otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceRelationAccess().getTargetCardinalityKeyword_7_0());
                    			
                    // InternalRefDsl.g:1305:4: ( (lv_targetCardinality_9_0= ruleEString ) )
                    // InternalRefDsl.g:1306:5: (lv_targetCardinality_9_0= ruleEString )
                    {
                    // InternalRefDsl.g:1306:5: (lv_targetCardinality_9_0= ruleEString )
                    // InternalRefDsl.g:1307:6: lv_targetCardinality_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getTargetCardinalityEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_targetCardinality_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetCardinality",
                    							lv_targetCardinality_9_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1325:3: (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRefDsl.g:1326:4: otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceRelationAccess().getContainmentKeyword_8_0());
                    			
                    // InternalRefDsl.g:1330:4: ( (lv_containment_11_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1331:5: (lv_containment_11_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1331:5: (lv_containment_11_0= ruleEBoolean )
                    // InternalRefDsl.g:1332:6: lv_containment_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getContainmentEBooleanParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_containment_11_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRelationRule());
                    						}
                    						set(
                    							current,
                    							"containment",
                    							lv_containment_11_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1350:3: (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRefDsl.g:1351:4: otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,43,FOLLOW_38); 

                    				newLeafNode(otherlv_12, grammarAccess.getResourceRelationAccess().getRecursiveKeyword_9_0());
                    			
                    // InternalRefDsl.g:1355:4: ( (lv_recursive_13_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1356:5: (lv_recursive_13_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1356:5: (lv_recursive_13_0= ruleEBoolean )
                    // InternalRefDsl.g:1357:6: lv_recursive_13_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getRecursiveEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_recursive_13_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRelationRule());
                    						}
                    						set(
                    							current,
                    							"recursive",
                    							lv_recursive_13_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
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
    // $ANTLR end "ruleResourceRelation"


    // $ANTLR start "entryRuleAttribute"
    // InternalRefDsl.g:1379:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRefDsl.g:1379:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRefDsl.g:1380:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRefDsl.g:1386:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_required_1_0 = null;

        AntlrDatatypeRuleToken lv_multiValued_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1392:2: ( ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) ) )
            // InternalRefDsl.g:1393:2: ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) )
            {
            // InternalRefDsl.g:1393:2: ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) )
            // InternalRefDsl.g:1394:3: (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) )
            {
            // InternalRefDsl.g:1394:3: (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRefDsl.g:1395:4: otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_38); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getRequiredKeyword_0_0());
                    			
                    // InternalRefDsl.g:1399:4: ( (lv_required_1_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1400:5: (lv_required_1_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1400:5: (lv_required_1_0= ruleEBoolean )
                    // InternalRefDsl.g:1401:6: lv_required_1_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getRequiredEBooleanParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_required_1_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_1_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1419:3: (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRefDsl.g:1420:4: otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getMultiValuedKeyword_1_0());
                    			
                    // InternalRefDsl.g:1424:4: ( (lv_multiValued_3_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1425:5: (lv_multiValued_3_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1425:5: (lv_multiValued_3_0= ruleEBoolean )
                    // InternalRefDsl.g:1426:6: lv_multiValued_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getMultiValuedEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_multiValued_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"multiValued",
                    							lv_multiValued_3_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getAttributeKeyword_2());
            		
            // InternalRefDsl.g:1448:3: ( (lv_name_5_0= ruleEString ) )
            // InternalRefDsl.g:1449:4: (lv_name_5_0= ruleEString )
            {
            // InternalRefDsl.g:1449:4: (lv_name_5_0= ruleEString )
            // InternalRefDsl.g:1450:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_50);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,47,FOLLOW_51); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTypeKeyword_4());
            		
            // InternalRefDsl.g:1471:3: ( (lv_type_7_0= rulePrimitiveType ) )
            // InternalRefDsl.g:1472:4: (lv_type_7_0= rulePrimitiveType )
            {
            // InternalRefDsl.g:1472:4: (lv_type_7_0= rulePrimitiveType )
            // InternalRefDsl.g:1473:5: lv_type_7_0= rulePrimitiveType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypePrimitiveTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=rulePrimitiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
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
    // InternalRefDsl.g:1494:1: entryRuleFeedbackType returns [EObject current=null] : iv_ruleFeedbackType= ruleFeedbackType EOF ;
    public final EObject entryRuleFeedbackType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackType = null;


        try {
            // InternalRefDsl.g:1494:53: (iv_ruleFeedbackType= ruleFeedbackType EOF )
            // InternalRefDsl.g:1495:2: iv_ruleFeedbackType= ruleFeedbackType EOF
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
    // InternalRefDsl.g:1501:1: ruleFeedbackType returns [EObject current=null] : (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleFeedbackType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_3_0 = null;

        Enumerator lv_subjectScope_5_0 = null;

        AntlrDatatypeRuleToken lv_hasRating_7_0 = null;

        AntlrDatatypeRuleToken lv_recursive_9_0 = null;

        AntlrDatatypeRuleToken lv_allowsMedia_11_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1507:2: ( (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) ) )? ) )
            // InternalRefDsl.g:1508:2: (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) ) )? )
            {
            // InternalRefDsl.g:1508:2: (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) ) )? )
            // InternalRefDsl.g:1509:3: otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackTypeAccess().getFeedbackTypeKeyword_0());
            		
            // InternalRefDsl.g:1513:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1514:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1514:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1515:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,28,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackTypeAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:1536:3: ( (lv_kind_3_0= ruleFeedbackKind ) )
            // InternalRefDsl.g:1537:4: (lv_kind_3_0= ruleFeedbackKind )
            {
            // InternalRefDsl.g:1537:4: (lv_kind_3_0= ruleFeedbackKind )
            // InternalRefDsl.g:1538:5: lv_kind_3_0= ruleFeedbackKind
            {

            					newCompositeNode(grammarAccess.getFeedbackTypeAccess().getKindFeedbackKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_53);
            lv_kind_3_0=ruleFeedbackKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.FeedbackKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1555:3: (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRefDsl.g:1556:4: otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedbackTypeAccess().getSubjectScopeKeyword_4_0());
                    			
                    // InternalRefDsl.g:1560:4: ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) )
                    // InternalRefDsl.g:1561:5: (lv_subjectScope_5_0= ruleFeedbackSubjectScope )
                    {
                    // InternalRefDsl.g:1561:5: (lv_subjectScope_5_0= ruleFeedbackSubjectScope )
                    // InternalRefDsl.g:1562:6: lv_subjectScope_5_0= ruleFeedbackSubjectScope
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getSubjectScopeFeedbackSubjectScopeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_subjectScope_5_0=ruleFeedbackSubjectScope();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"subjectScope",
                    							lv_subjectScope_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackSubjectScope");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1580:3: (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRefDsl.g:1581:4: otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackTypeAccess().getHasRatingKeyword_5_0());
                    			
                    // InternalRefDsl.g:1585:4: ( (lv_hasRating_7_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1586:5: (lv_hasRating_7_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1586:5: (lv_hasRating_7_0= ruleEBoolean )
                    // InternalRefDsl.g:1587:6: lv_hasRating_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getHasRatingEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_hasRating_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"hasRating",
                    							lv_hasRating_7_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1605:3: (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRefDsl.g:1606:4: otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeedbackTypeAccess().getRecursiveKeyword_6_0());
                    			
                    // InternalRefDsl.g:1610:4: ( (lv_recursive_9_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1611:5: (lv_recursive_9_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1611:5: (lv_recursive_9_0= ruleEBoolean )
                    // InternalRefDsl.g:1612:6: lv_recursive_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getRecursiveEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_recursive_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"recursive",
                    							lv_recursive_9_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1630:3: (otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRefDsl.g:1631:4: otherlv_10= 'allowsMedia' ( (lv_allowsMedia_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeedbackTypeAccess().getAllowsMediaKeyword_7_0());
                    			
                    // InternalRefDsl.g:1635:4: ( (lv_allowsMedia_11_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1636:5: (lv_allowsMedia_11_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1636:5: (lv_allowsMedia_11_0= ruleEBoolean )
                    // InternalRefDsl.g:1637:6: lv_allowsMedia_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getAllowsMediaEBooleanParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_allowsMedia_11_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"allowsMedia",
                    							lv_allowsMedia_11_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
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
    // $ANTLR end "ruleFeedbackType"


    // $ANTLR start "entryRuleFeedbackDefinition"
    // InternalRefDsl.g:1659:1: entryRuleFeedbackDefinition returns [EObject current=null] : iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF ;
    public final EObject entryRuleFeedbackDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackDefinition = null;


        try {
            // InternalRefDsl.g:1659:59: (iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF )
            // InternalRefDsl.g:1660:2: iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF
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
    // InternalRefDsl.g:1666:1: ruleFeedbackDefinition returns [EObject current=null] : (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) ) )? otherlv_8= 'author' ( ( ruleEString ) ) (otherlv_10= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_12= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_14= 'parent' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? ) ;
    public final EObject ruleFeedbackDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_requiresVerifiedContext_5_0 = null;

        AntlrDatatypeRuleToken lv_uniquePerAuthorTarget_7_0 = null;

        EObject lv_policy_17_0 = null;

        EObject lv_rating_19_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1672:2: ( (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) ) )? otherlv_8= 'author' ( ( ruleEString ) ) (otherlv_10= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_12= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_14= 'parent' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? ) )
            // InternalRefDsl.g:1673:2: (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) ) )? otherlv_8= 'author' ( ( ruleEString ) ) (otherlv_10= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_12= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_14= 'parent' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? )
            {
            // InternalRefDsl.g:1673:2: (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) ) )? otherlv_8= 'author' ( ( ruleEString ) ) (otherlv_10= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_12= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_14= 'parent' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? )
            // InternalRefDsl.g:1674:3: otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) ) )? otherlv_8= 'author' ( ( ruleEString ) ) (otherlv_10= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_12= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_14= 'parent' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackDefinitionAccess().getFeedbackDefinitionKeyword_0());
            		
            // InternalRefDsl.g:1678:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1679:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1679:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1680:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
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

            otherlv_2=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackDefinitionAccess().getTypeKeyword_2());
            		
            // InternalRefDsl.g:1701:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1702:4: ( ruleEString )
            {
            // InternalRefDsl.g:1702:4: ( ruleEString )
            // InternalRefDsl.g:1703:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getTypeFeedbackTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1717:3: (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRefDsl.g:1718:4: otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedbackDefinitionAccess().getRequiresVerifiedContextKeyword_4_0());
                    			
                    // InternalRefDsl.g:1722:4: ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1723:5: (lv_requiresVerifiedContext_5_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1723:5: (lv_requiresVerifiedContext_5_0= ruleEBoolean )
                    // InternalRefDsl.g:1724:6: lv_requiresVerifiedContext_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getRequiresVerifiedContextEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_requiresVerifiedContext_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"requiresVerifiedContext",
                    							lv_requiresVerifiedContext_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1742:3: (otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRefDsl.g:1743:4: otherlv_6= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackDefinitionAccess().getUniquePerAuthorTargetKeyword_5_0());
                    			
                    // InternalRefDsl.g:1747:4: ( (lv_uniquePerAuthorTarget_7_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1748:5: (lv_uniquePerAuthorTarget_7_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1748:5: (lv_uniquePerAuthorTarget_7_0= ruleEBoolean )
                    // InternalRefDsl.g:1749:6: lv_uniquePerAuthorTarget_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getUniquePerAuthorTargetEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_uniquePerAuthorTarget_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"uniquePerAuthorTarget",
                    							lv_uniquePerAuthorTarget_7_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getFeedbackDefinitionAccess().getAuthorKeyword_6());
            		
            // InternalRefDsl.g:1771:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1772:4: ( ruleEString )
            {
            // InternalRefDsl.g:1772:4: ( ruleEString )
            // InternalRefDsl.g:1773:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getAuthorUserTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1787:3: (otherlv_10= 'subjectResource' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRefDsl.g:1788:4: otherlv_10= 'subjectResource' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeedbackDefinitionAccess().getSubjectResourceKeyword_8_0());
                    			
                    // InternalRefDsl.g:1792:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1793:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1793:5: ( ruleEString )
                    // InternalRefDsl.g:1794:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getSubjectResourceResourceTypeCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1809:3: (otherlv_12= 'subjectFeedback' ( ( ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRefDsl.g:1810:4: otherlv_12= 'subjectFeedback' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeedbackDefinitionAccess().getSubjectFeedbackKeyword_9_0());
                    			
                    // InternalRefDsl.g:1814:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1815:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1815:5: ( ruleEString )
                    // InternalRefDsl.g:1816:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getSubjectFeedbackFeedbackDefinitionCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1831:3: (otherlv_14= 'parent' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRefDsl.g:1832:4: otherlv_14= 'parent' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getFeedbackDefinitionAccess().getParentKeyword_10_0());
                    			
                    // InternalRefDsl.g:1836:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1837:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1837:5: ( ruleEString )
                    // InternalRefDsl.g:1838:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getParentFeedbackDefinitionCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1853:3: (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRefDsl.g:1854:4: otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) )
                    {
                    otherlv_16=(Token)match(input,59,FOLLOW_65); 

                    				newLeafNode(otherlv_16, grammarAccess.getFeedbackDefinitionAccess().getPolicyKeyword_11_0());
                    			
                    // InternalRefDsl.g:1858:4: ( (lv_policy_17_0= ruleFeedbackPolicy ) )
                    // InternalRefDsl.g:1859:5: (lv_policy_17_0= ruleFeedbackPolicy )
                    {
                    // InternalRefDsl.g:1859:5: (lv_policy_17_0= ruleFeedbackPolicy )
                    // InternalRefDsl.g:1860:6: lv_policy_17_0= ruleFeedbackPolicy
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getPolicyFeedbackPolicyParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_policy_17_0=ruleFeedbackPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"policy",
                    							lv_policy_17_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackPolicy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1878:3: (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRefDsl.g:1879:4: otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) )
                    {
                    otherlv_18=(Token)match(input,60,FOLLOW_67); 

                    				newLeafNode(otherlv_18, grammarAccess.getFeedbackDefinitionAccess().getRatingKeyword_12_0());
                    			
                    // InternalRefDsl.g:1883:4: ( (lv_rating_19_0= ruleRatingPolicy ) )
                    // InternalRefDsl.g:1884:5: (lv_rating_19_0= ruleRatingPolicy )
                    {
                    // InternalRefDsl.g:1884:5: (lv_rating_19_0= ruleRatingPolicy )
                    // InternalRefDsl.g:1885:6: lv_rating_19_0= ruleRatingPolicy
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getRatingRatingPolicyParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rating_19_0=ruleRatingPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"rating",
                    							lv_rating_19_0,
                    							"pt.isep.enorm.refdsl.RefDsl.RatingPolicy");
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
    // $ANTLR end "ruleFeedbackDefinition"


    // $ANTLR start "entryRuleFeedbackPolicy"
    // InternalRefDsl.g:1907:1: entryRuleFeedbackPolicy returns [EObject current=null] : iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF ;
    public final EObject entryRuleFeedbackPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackPolicy = null;


        try {
            // InternalRefDsl.g:1907:55: (iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF )
            // InternalRefDsl.g:1908:2: iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF
            {
             newCompositeNode(grammarAccess.getFeedbackPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedbackPolicy=ruleFeedbackPolicy();

            state._fsp--;

             current =iv_ruleFeedbackPolicy; 
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
    // $ANTLR end "entryRuleFeedbackPolicy"


    // $ANTLR start "ruleFeedbackPolicy"
    // InternalRefDsl.g:1914:1: ruleFeedbackPolicy returns [EObject current=null] : (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? ) ;
    public final EObject ruleFeedbackPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1920:2: ( (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? ) )
            // InternalRefDsl.g:1921:2: (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? )
            {
            // InternalRefDsl.g:1921:2: (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? )
            // InternalRefDsl.g:1922:3: otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackPolicyAccess().getFeedbackPolicyKeyword_0());
            		
            // InternalRefDsl.g:1926:3: (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==62) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRefDsl.g:1927:4: otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_69); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeedbackPolicyAccess().getStatusKeyword_1_0());
                    			
                    // InternalRefDsl.g:1931:4: ( (lv_status_2_0= ruleFeedbackStatus ) )
                    // InternalRefDsl.g:1932:5: (lv_status_2_0= ruleFeedbackStatus )
                    {
                    // InternalRefDsl.g:1932:5: (lv_status_2_0= ruleFeedbackStatus )
                    // InternalRefDsl.g:1933:6: lv_status_2_0= ruleFeedbackStatus
                    {

                    						newCompositeNode(grammarAccess.getFeedbackPolicyAccess().getStatusFeedbackStatusEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_status_2_0=ruleFeedbackStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackPolicyRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_2_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackStatus");
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
    // $ANTLR end "ruleFeedbackPolicy"


    // $ANTLR start "entryRuleRatingPolicy"
    // InternalRefDsl.g:1955:1: entryRuleRatingPolicy returns [EObject current=null] : iv_ruleRatingPolicy= ruleRatingPolicy EOF ;
    public final EObject entryRuleRatingPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingPolicy = null;


        try {
            // InternalRefDsl.g:1955:53: (iv_ruleRatingPolicy= ruleRatingPolicy EOF )
            // InternalRefDsl.g:1956:2: iv_ruleRatingPolicy= ruleRatingPolicy EOF
            {
             newCompositeNode(grammarAccess.getRatingPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRatingPolicy=ruleRatingPolicy();

            state._fsp--;

             current =iv_ruleRatingPolicy; 
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
    // $ANTLR end "entryRuleRatingPolicy"


    // $ANTLR start "ruleRatingPolicy"
    // InternalRefDsl.g:1962:1: ruleRatingPolicy returns [EObject current=null] : (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? (otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) ) )? ) ;
    public final EObject ruleRatingPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_minValue_2_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_4_0 = null;

        AntlrDatatypeRuleToken lv_step_6_0 = null;

        Enumerator lv_scaleKind_8_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1968:2: ( (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? (otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) ) )? ) )
            // InternalRefDsl.g:1969:2: (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? (otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) ) )? )
            {
            // InternalRefDsl.g:1969:2: (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? (otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) ) )? )
            // InternalRefDsl.g:1970:3: otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? (otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getRatingPolicyAccess().getRatingPolicyKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingPolicyAccess().getMinKeyword_1());
            		
            // InternalRefDsl.g:1978:3: ( (lv_minValue_2_0= ruleEDouble ) )
            // InternalRefDsl.g:1979:4: (lv_minValue_2_0= ruleEDouble )
            {
            // InternalRefDsl.g:1979:4: (lv_minValue_2_0= ruleEDouble )
            // InternalRefDsl.g:1980:5: lv_minValue_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRatingPolicyAccess().getMinValueEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_72);
            lv_minValue_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRatingPolicyRule());
            					}
            					set(
            						current,
            						"minValue",
            						lv_minValue_2_0,
            						"pt.isep.enorm.refdsl.RefDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,65,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getRatingPolicyAccess().getMaxKeyword_3());
            		
            // InternalRefDsl.g:2001:3: ( (lv_maxValue_4_0= ruleEDouble ) )
            // InternalRefDsl.g:2002:4: (lv_maxValue_4_0= ruleEDouble )
            {
            // InternalRefDsl.g:2002:4: (lv_maxValue_4_0= ruleEDouble )
            // InternalRefDsl.g:2003:5: lv_maxValue_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRatingPolicyAccess().getMaxValueEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_73);
            lv_maxValue_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRatingPolicyRule());
            					}
            					set(
            						current,
            						"maxValue",
            						lv_maxValue_4_0,
            						"pt.isep.enorm.refdsl.RefDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2020:3: (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==66) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRefDsl.g:2021:4: otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_71); 

                    				newLeafNode(otherlv_5, grammarAccess.getRatingPolicyAccess().getStepKeyword_5_0());
                    			
                    // InternalRefDsl.g:2025:4: ( (lv_step_6_0= ruleEDouble ) )
                    // InternalRefDsl.g:2026:5: (lv_step_6_0= ruleEDouble )
                    {
                    // InternalRefDsl.g:2026:5: (lv_step_6_0= ruleEDouble )
                    // InternalRefDsl.g:2027:6: lv_step_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRatingPolicyAccess().getStepEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_step_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRatingPolicyRule());
                    						}
                    						set(
                    							current,
                    							"step",
                    							lv_step_6_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2045:3: (otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==67) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRefDsl.g:2046:4: otherlv_7= 'scaleKind' ( (lv_scaleKind_8_0= ruleRatingScaleKind ) )
                    {
                    otherlv_7=(Token)match(input,67,FOLLOW_75); 

                    				newLeafNode(otherlv_7, grammarAccess.getRatingPolicyAccess().getScaleKindKeyword_6_0());
                    			
                    // InternalRefDsl.g:2050:4: ( (lv_scaleKind_8_0= ruleRatingScaleKind ) )
                    // InternalRefDsl.g:2051:5: (lv_scaleKind_8_0= ruleRatingScaleKind )
                    {
                    // InternalRefDsl.g:2051:5: (lv_scaleKind_8_0= ruleRatingScaleKind )
                    // InternalRefDsl.g:2052:6: lv_scaleKind_8_0= ruleRatingScaleKind
                    {

                    						newCompositeNode(grammarAccess.getRatingPolicyAccess().getScaleKindRatingScaleKindEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_scaleKind_8_0=ruleRatingScaleKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRatingPolicyRule());
                    						}
                    						set(
                    							current,
                    							"scaleKind",
                    							lv_scaleKind_8_0,
                    							"pt.isep.enorm.refdsl.RefDsl.RatingScaleKind");
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
    // $ANTLR end "ruleRatingPolicy"


    // $ANTLR start "entryRuleValidationRule"
    // InternalRefDsl.g:2074:1: entryRuleValidationRule returns [EObject current=null] : iv_ruleValidationRule= ruleValidationRule EOF ;
    public final EObject entryRuleValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationRule = null;


        try {
            // InternalRefDsl.g:2074:55: (iv_ruleValidationRule= ruleValidationRule EOF )
            // InternalRefDsl.g:2075:2: iv_ruleValidationRule= ruleValidationRule EOF
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
    // InternalRefDsl.g:2081:1: ruleValidationRule returns [EObject current=null] : (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) ) ;
    public final EObject ruleValidationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_4_0 = null;

        Enumerator lv_severity_6_0 = null;

        AntlrDatatypeRuleToken lv_expression_8_0 = null;

        AntlrDatatypeRuleToken lv_implementationId_10_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2087:2: ( (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) ) )
            // InternalRefDsl.g:2088:2: (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) )
            {
            // InternalRefDsl.g:2088:2: (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) )
            // InternalRefDsl.g:2089:3: otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_76); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationRuleAccess().getValidationRuleKeyword_0());
            		
            // InternalRefDsl.g:2093:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==69) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRefDsl.g:2094:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getValidationRuleAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:2098:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:2099:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:2099:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:2100:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,28,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getValidationRuleAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:2122:3: ( (lv_kind_4_0= ruleValidationKind ) )
            // InternalRefDsl.g:2123:4: (lv_kind_4_0= ruleValidationKind )
            {
            // InternalRefDsl.g:2123:4: (lv_kind_4_0= ruleValidationKind )
            // InternalRefDsl.g:2124:5: lv_kind_4_0= ruleValidationKind
            {

            					newCompositeNode(grammarAccess.getValidationRuleAccess().getKindValidationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_78);
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

            // InternalRefDsl.g:2141:3: (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==70) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRefDsl.g:2142:4: otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidationRuleAccess().getSeverityKeyword_4_0());
                    			
                    // InternalRefDsl.g:2146:4: ( (lv_severity_6_0= ruleRuleSeverity ) )
                    // InternalRefDsl.g:2147:5: (lv_severity_6_0= ruleRuleSeverity )
                    {
                    // InternalRefDsl.g:2147:5: (lv_severity_6_0= ruleRuleSeverity )
                    // InternalRefDsl.g:2148:6: lv_severity_6_0= ruleRuleSeverity
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getSeverityRuleSeverityEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_severity_6_0=ruleRuleSeverity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationRuleRule());
                    						}
                    						set(
                    							current,
                    							"severity",
                    							lv_severity_6_0,
                    							"pt.isep.enorm.refdsl.RefDsl.RuleSeverity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2166:3: (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==71) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRefDsl.g:2167:4: otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getValidationRuleAccess().getExpressionKeyword_5_0());
                    			
                    // InternalRefDsl.g:2171:4: ( (lv_expression_8_0= ruleEString ) )
                    // InternalRefDsl.g:2172:5: (lv_expression_8_0= ruleEString )
                    {
                    // InternalRefDsl.g:2172:5: (lv_expression_8_0= ruleEString )
                    // InternalRefDsl.g:2173:6: lv_expression_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getExpressionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_expression_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationRuleRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2191:3: (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==72) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRefDsl.g:2192:4: otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getValidationRuleAccess().getImplementationIdKeyword_6_0());
                    			
                    // InternalRefDsl.g:2196:4: ( (lv_implementationId_10_0= ruleEString ) )
                    // InternalRefDsl.g:2197:5: (lv_implementationId_10_0= ruleEString )
                    {
                    // InternalRefDsl.g:2197:5: (lv_implementationId_10_0= ruleEString )
                    // InternalRefDsl.g:2198:6: lv_implementationId_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getImplementationIdEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_implementationId_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationRuleRule());
                    						}
                    						set(
                    							current,
                    							"implementationId",
                    							lv_implementationId_10_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2216:3: (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==73) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRefDsl.g:2217:4: otherlv_11= 'appliesToResource' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,73,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getValidationRuleAccess().getAppliesToResourceKeyword_7_0());
                    			
                    // InternalRefDsl.g:2221:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2222:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2222:5: ( ruleEString )
                    // InternalRefDsl.g:2223:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getAppliesToResourceResourceTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2238:3: (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==74) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRefDsl.g:2239:4: otherlv_13= 'appliesToFeedback' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getValidationRuleAccess().getAppliesToFeedbackKeyword_8_0());
                    			
                    // InternalRefDsl.g:2243:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2244:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2244:5: ( ruleEString )
                    // InternalRefDsl.g:2245:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getAppliesToFeedbackFeedbackDefinitionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getValidationRuleAccess().getInvokedByKeyword_9());
            		
            // InternalRefDsl.g:2264:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2265:4: ( ruleEString )
            {
            // InternalRefDsl.g:2265:4: ( ruleEString )
            // InternalRefDsl.g:2266:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getValidationRuleAccess().getInvokedByAutomationRuleCrossReference_10_0());
            				
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
    // $ANTLR end "ruleValidationRule"


    // $ANTLR start "entryRuleModerationPolicy"
    // InternalRefDsl.g:2284:1: entryRuleModerationPolicy returns [EObject current=null] : iv_ruleModerationPolicy= ruleModerationPolicy EOF ;
    public final EObject entryRuleModerationPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModerationPolicy = null;


        try {
            // InternalRefDsl.g:2284:57: (iv_ruleModerationPolicy= ruleModerationPolicy EOF )
            // InternalRefDsl.g:2285:2: iv_ruleModerationPolicy= ruleModerationPolicy EOF
            {
             newCompositeNode(grammarAccess.getModerationPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModerationPolicy=ruleModerationPolicy();

            state._fsp--;

             current =iv_ruleModerationPolicy; 
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
    // $ANTLR end "entryRuleModerationPolicy"


    // $ANTLR start "ruleModerationPolicy"
    // InternalRefDsl.g:2291:1: ruleModerationPolicy returns [EObject current=null] : (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleModerationPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_mode_4_0 = null;

        AntlrDatatypeRuleToken lv_trigger_6_0 = null;

        Enumerator lv_decision_8_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2297:2: ( (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? ) )
            // InternalRefDsl.g:2298:2: (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? )
            {
            // InternalRefDsl.g:2298:2: (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? )
            // InternalRefDsl.g:2299:3: otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_85); 

            			newLeafNode(otherlv_0, grammarAccess.getModerationPolicyAccess().getModerationPolicyKeyword_0());
            		
            // InternalRefDsl.g:2303:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==69) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRefDsl.g:2304:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getModerationPolicyAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:2308:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:2309:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:2309:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:2310:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModerationPolicyRule());
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

            otherlv_3=(Token)match(input,77,FOLLOW_87); 

            			newLeafNode(otherlv_3, grammarAccess.getModerationPolicyAccess().getModeKeyword_2());
            		
            // InternalRefDsl.g:2332:3: ( (lv_mode_4_0= ruleModerationMode ) )
            // InternalRefDsl.g:2333:4: (lv_mode_4_0= ruleModerationMode )
            {
            // InternalRefDsl.g:2333:4: (lv_mode_4_0= ruleModerationMode )
            // InternalRefDsl.g:2334:5: lv_mode_4_0= ruleModerationMode
            {

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getModeModerationModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_88);
            lv_mode_4_0=ruleModerationMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModerationPolicyRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"pt.isep.enorm.refdsl.RefDsl.ModerationMode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2351:3: (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==78) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRefDsl.g:2352:4: otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModerationPolicyAccess().getTriggerKeyword_4_0());
                    			
                    // InternalRefDsl.g:2356:4: ( (lv_trigger_6_0= ruleEString ) )
                    // InternalRefDsl.g:2357:5: (lv_trigger_6_0= ruleEString )
                    {
                    // InternalRefDsl.g:2357:5: (lv_trigger_6_0= ruleEString )
                    // InternalRefDsl.g:2358:6: lv_trigger_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getTriggerEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_89);
                    lv_trigger_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModerationPolicyRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_6_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2376:3: (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==79) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRefDsl.g:2377:4: otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) )
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_90); 

                    				newLeafNode(otherlv_7, grammarAccess.getModerationPolicyAccess().getDecisionKeyword_5_0());
                    			
                    // InternalRefDsl.g:2381:4: ( (lv_decision_8_0= ruleModerationDecision ) )
                    // InternalRefDsl.g:2382:5: (lv_decision_8_0= ruleModerationDecision )
                    {
                    // InternalRefDsl.g:2382:5: (lv_decision_8_0= ruleModerationDecision )
                    // InternalRefDsl.g:2383:6: lv_decision_8_0= ruleModerationDecision
                    {

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getDecisionModerationDecisionEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_decision_8_0=ruleModerationDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModerationPolicyRule());
                    						}
                    						set(
                    							current,
                    							"decision",
                    							lv_decision_8_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ModerationDecision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getModerationPolicyAccess().getMonitorsResourceKeyword_6());
            		
            // InternalRefDsl.g:2405:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2406:4: ( ruleEString )
            {
            // InternalRefDsl.g:2406:4: ( ruleEString )
            // InternalRefDsl.g:2407:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getMonitorsResourceResourceTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_92);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getModerationPolicyAccess().getMonitorsFeedbackKeyword_8());
            		
            // InternalRefDsl.g:2425:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2426:4: ( ruleEString )
            {
            // InternalRefDsl.g:2426:4: ( ruleEString )
            // InternalRefDsl.g:2427:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getMonitorsFeedbackFeedbackDefinitionCrossReference_9_0());
            				
            pushFollow(FOLLOW_93);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getModerationPolicyAccess().getExecutedByKeyword_10());
            		
            // InternalRefDsl.g:2445:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2446:4: ( ruleEString )
            {
            // InternalRefDsl.g:2446:4: ( ruleEString )
            // InternalRefDsl.g:2447:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getExecutedByUserTypeCrossReference_11_0());
            				
            pushFollow(FOLLOW_94);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2461:3: (otherlv_15= 'inContext' ( ( ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==83) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRefDsl.g:2462:4: otherlv_15= 'inContext' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getModerationPolicyAccess().getInContextKeyword_12_0());
                    			
                    // InternalRefDsl.g:2466:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2467:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2467:5: ( ruleEString )
                    // InternalRefDsl.g:2468:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModerationPolicyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getInContextContextTypeCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleModerationPolicy"


    // $ANTLR start "entryRuleAuthorizationRule"
    // InternalRefDsl.g:2487:1: entryRuleAuthorizationRule returns [EObject current=null] : iv_ruleAuthorizationRule= ruleAuthorizationRule EOF ;
    public final EObject entryRuleAuthorizationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorizationRule = null;


        try {
            // InternalRefDsl.g:2487:58: (iv_ruleAuthorizationRule= ruleAuthorizationRule EOF )
            // InternalRefDsl.g:2488:2: iv_ruleAuthorizationRule= ruleAuthorizationRule EOF
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
    // InternalRefDsl.g:2494:1: ruleAuthorizationRule returns [EObject current=null] : (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'actor' ( ( ruleEString ) ) (otherlv_5= 'context' ( ( ruleEString ) ) )? otherlv_7= 'resourceTarget' ( ( ruleEString ) ) (otherlv_9= 'feedbackTarget' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleAuthorizationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_allowedAction_2_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2500:2: ( (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'actor' ( ( ruleEString ) ) (otherlv_5= 'context' ( ( ruleEString ) ) )? otherlv_7= 'resourceTarget' ( ( ruleEString ) ) (otherlv_9= 'feedbackTarget' ( ( ruleEString ) ) )? ) )
            // InternalRefDsl.g:2501:2: (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'actor' ( ( ruleEString ) ) (otherlv_5= 'context' ( ( ruleEString ) ) )? otherlv_7= 'resourceTarget' ( ( ruleEString ) ) (otherlv_9= 'feedbackTarget' ( ( ruleEString ) ) )? )
            {
            // InternalRefDsl.g:2501:2: (otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'actor' ( ( ruleEString ) ) (otherlv_5= 'context' ( ( ruleEString ) ) )? otherlv_7= 'resourceTarget' ( ( ruleEString ) ) (otherlv_9= 'feedbackTarget' ( ( ruleEString ) ) )? )
            // InternalRefDsl.g:2502:3: otherlv_0= 'AuthorizationRule' otherlv_1= 'allowedAction' ( (lv_allowedAction_2_0= ruleActionKind ) ) otherlv_3= 'actor' ( ( ruleEString ) ) (otherlv_5= 'context' ( ( ruleEString ) ) )? otherlv_7= 'resourceTarget' ( ( ruleEString ) ) (otherlv_9= 'feedbackTarget' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,84,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorizationRuleAccess().getAuthorizationRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,85,FOLLOW_96); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthorizationRuleAccess().getAllowedActionKeyword_1());
            		
            // InternalRefDsl.g:2510:3: ( (lv_allowedAction_2_0= ruleActionKind ) )
            // InternalRefDsl.g:2511:4: (lv_allowedAction_2_0= ruleActionKind )
            {
            // InternalRefDsl.g:2511:4: (lv_allowedAction_2_0= ruleActionKind )
            // InternalRefDsl.g:2512:5: lv_allowedAction_2_0= ruleActionKind
            {

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getAllowedActionActionKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_97);
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

            otherlv_3=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthorizationRuleAccess().getActorKeyword_3());
            		
            // InternalRefDsl.g:2533:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2534:4: ( ruleEString )
            {
            // InternalRefDsl.g:2534:4: ( ruleEString )
            // InternalRefDsl.g:2535:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorizationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getActorUserTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_98);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2549:3: (otherlv_5= 'context' ( ( ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==87) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRefDsl.g:2550:4: otherlv_5= 'context' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAuthorizationRuleAccess().getContextKeyword_5_0());
                    			
                    // InternalRefDsl.g:2554:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2555:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2555:5: ( ruleEString )
                    // InternalRefDsl.g:2556:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorizationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getContextContextTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAuthorizationRuleAccess().getResourceTargetKeyword_6());
            		
            // InternalRefDsl.g:2575:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2576:4: ( ruleEString )
            {
            // InternalRefDsl.g:2576:4: ( ruleEString )
            // InternalRefDsl.g:2577:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorizationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getResourceTargetResourceTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_100);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2591:3: (otherlv_9= 'feedbackTarget' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==89) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRefDsl.g:2592:4: otherlv_9= 'feedbackTarget' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAuthorizationRuleAccess().getFeedbackTargetKeyword_8_0());
                    			
                    // InternalRefDsl.g:2596:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2597:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2597:5: ( ruleEString )
                    // InternalRefDsl.g:2598:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorizationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getFeedbackTargetFeedbackDefinitionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleAuthorizationRule"


    // $ANTLR start "entryRuleAutomationRule"
    // InternalRefDsl.g:2617:1: entryRuleAutomationRule returns [EObject current=null] : iv_ruleAutomationRule= ruleAutomationRule EOF ;
    public final EObject entryRuleAutomationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomationRule = null;


        try {
            // InternalRefDsl.g:2617:55: (iv_ruleAutomationRule= ruleAutomationRule EOF )
            // InternalRefDsl.g:2618:2: iv_ruleAutomationRule= ruleAutomationRule EOF
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
    // InternalRefDsl.g:2624:1: ruleAutomationRule returns [EObject current=null] : (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) (otherlv_8= 'context' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? otherlv_12= 'onFeedback' ( ( ruleEString ) ) otherlv_14= 'uses' ( ( ruleEString ) ) ) ;
    public final EObject ruleAutomationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_trigger_3_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        AntlrDatatypeRuleToken lv_actionDescription_7_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2630:2: ( (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) (otherlv_8= 'context' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? otherlv_12= 'onFeedback' ( ( ruleEString ) ) otherlv_14= 'uses' ( ( ruleEString ) ) ) )
            // InternalRefDsl.g:2631:2: (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) (otherlv_8= 'context' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? otherlv_12= 'onFeedback' ( ( ruleEString ) ) otherlv_14= 'uses' ( ( ruleEString ) ) )
            {
            // InternalRefDsl.g:2631:2: (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) (otherlv_8= 'context' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? otherlv_12= 'onFeedback' ( ( ruleEString ) ) otherlv_14= 'uses' ( ( ruleEString ) ) )
            // InternalRefDsl.g:2632:3: otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )? otherlv_6= 'actionDescription' ( (lv_actionDescription_7_0= ruleEString ) ) (otherlv_8= 'context' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? otherlv_12= 'onFeedback' ( ( ruleEString ) ) otherlv_14= 'uses' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomationRuleAccess().getAutomationRuleKeyword_0());
            		
            // InternalRefDsl.g:2636:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:2637:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:2637:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:2638:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_101);
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

            otherlv_2=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomationRuleAccess().getTriggerKeyword_2());
            		
            // InternalRefDsl.g:2659:3: ( (lv_trigger_3_0= ruleEString ) )
            // InternalRefDsl.g:2660:4: (lv_trigger_3_0= ruleEString )
            {
            // InternalRefDsl.g:2660:4: (lv_trigger_3_0= ruleEString )
            // InternalRefDsl.g:2661:5: lv_trigger_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getTriggerEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_102);
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

            // InternalRefDsl.g:2678:3: (otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==91) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRefDsl.g:2679:4: otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,91,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAutomationRuleAccess().getConditionKeyword_4_0());
                    			
                    // InternalRefDsl.g:2683:4: ( (lv_condition_5_0= ruleEString ) )
                    // InternalRefDsl.g:2684:5: (lv_condition_5_0= ruleEString )
                    {
                    // InternalRefDsl.g:2684:5: (lv_condition_5_0= ruleEString )
                    // InternalRefDsl.g:2685:6: lv_condition_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getConditionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            otherlv_6=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getAutomationRuleAccess().getActionDescriptionKeyword_5());
            		
            // InternalRefDsl.g:2707:3: ( (lv_actionDescription_7_0= ruleEString ) )
            // InternalRefDsl.g:2708:4: (lv_actionDescription_7_0= ruleEString )
            {
            // InternalRefDsl.g:2708:4: (lv_actionDescription_7_0= ruleEString )
            // InternalRefDsl.g:2709:5: lv_actionDescription_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getActionDescriptionEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_104);
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

            // InternalRefDsl.g:2726:3: (otherlv_8= 'context' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==87) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRefDsl.g:2727:4: otherlv_8= 'context' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAutomationRuleAccess().getContextKeyword_7_0());
                    			
                    // InternalRefDsl.g:2731:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2732:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2732:5: ( ruleEString )
                    // InternalRefDsl.g:2733:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutomationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getContextResourceTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2748:3: (otherlv_10= 'inContext' ( ( ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==83) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRefDsl.g:2749:4: otherlv_10= 'inContext' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAutomationRuleAccess().getInContextKeyword_8_0());
                    			
                    // InternalRefDsl.g:2753:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2754:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2754:5: ( ruleEString )
                    // InternalRefDsl.g:2755:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutomationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getInContextContextTypeCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getAutomationRuleAccess().getOnFeedbackKeyword_9());
            		
            // InternalRefDsl.g:2774:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2775:4: ( ruleEString )
            {
            // InternalRefDsl.g:2775:4: ( ruleEString )
            // InternalRefDsl.g:2776:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getOnFeedbackFeedbackDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_107);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getAutomationRuleAccess().getUsesKeyword_11());
            		
            // InternalRefDsl.g:2794:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2795:4: ( ruleEString )
            {
            // InternalRefDsl.g:2795:4: ( ruleEString )
            // InternalRefDsl.g:2796:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getUsesValidationRuleCrossReference_12_0());
            				
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
    // $ANTLR end "ruleAutomationRule"


    // $ANTLR start "entryRuleVerificationPolicy"
    // InternalRefDsl.g:2814:1: entryRuleVerificationPolicy returns [EObject current=null] : iv_ruleVerificationPolicy= ruleVerificationPolicy EOF ;
    public final EObject entryRuleVerificationPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationPolicy = null;


        try {
            // InternalRefDsl.g:2814:59: (iv_ruleVerificationPolicy= ruleVerificationPolicy EOF )
            // InternalRefDsl.g:2815:2: iv_ruleVerificationPolicy= ruleVerificationPolicy EOF
            {
             newCompositeNode(grammarAccess.getVerificationPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerificationPolicy=ruleVerificationPolicy();

            state._fsp--;

             current =iv_ruleVerificationPolicy; 
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
    // $ANTLR end "entryRuleVerificationPolicy"


    // $ANTLR start "ruleVerificationPolicy"
    // InternalRefDsl.g:2821:1: ruleVerificationPolicy returns [EObject current=null] : (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleEString ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) ) ;
    public final EObject ruleVerificationPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_mode_4_0 = null;

        AntlrDatatypeRuleToken lv_appliesWhen_6_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2827:2: ( (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleEString ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) ) )
            // InternalRefDsl.g:2828:2: (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleEString ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) )
            {
            // InternalRefDsl.g:2828:2: (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleEString ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) )
            // InternalRefDsl.g:2829:3: otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleEString ) ) otherlv_7= 'verifies' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_85); 

            			newLeafNode(otherlv_0, grammarAccess.getVerificationPolicyAccess().getVerificationPolicyKeyword_0());
            		
            // InternalRefDsl.g:2833:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==69) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRefDsl.g:2834:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerificationPolicyAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:2838:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:2839:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:2839:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:2840:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVerificationPolicyAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerificationPolicyRule());
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

            otherlv_3=(Token)match(input,77,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getVerificationPolicyAccess().getModeKeyword_2());
            		
            // InternalRefDsl.g:2862:3: ( (lv_mode_4_0= ruleValidationKind ) )
            // InternalRefDsl.g:2863:4: (lv_mode_4_0= ruleValidationKind )
            {
            // InternalRefDsl.g:2863:4: (lv_mode_4_0= ruleValidationKind )
            // InternalRefDsl.g:2864:5: lv_mode_4_0= ruleValidationKind
            {

            					newCompositeNode(grammarAccess.getVerificationPolicyAccess().getModeValidationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_108);
            lv_mode_4_0=ruleValidationKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerificationPolicyRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"pt.isep.enorm.refdsl.RefDsl.ValidationKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getVerificationPolicyAccess().getAppliesWhenKeyword_4());
            		
            // InternalRefDsl.g:2885:3: ( (lv_appliesWhen_6_0= ruleEString ) )
            // InternalRefDsl.g:2886:4: (lv_appliesWhen_6_0= ruleEString )
            {
            // InternalRefDsl.g:2886:4: (lv_appliesWhen_6_0= ruleEString )
            // InternalRefDsl.g:2887:5: lv_appliesWhen_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVerificationPolicyAccess().getAppliesWhenEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_109);
            lv_appliesWhen_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerificationPolicyRule());
            					}
            					set(
            						current,
            						"appliesWhen",
            						lv_appliesWhen_6_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,97,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVerificationPolicyAccess().getVerifiesKeyword_6());
            		
            // InternalRefDsl.g:2908:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2909:4: ( ruleEString )
            {
            // InternalRefDsl.g:2909:4: ( ruleEString )
            // InternalRefDsl.g:2910:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerificationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVerificationPolicyAccess().getVerifiesFeedbackDefinitionCrossReference_7_0());
            				
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
    // $ANTLR end "ruleVerificationPolicy"


    // $ANTLR start "entryRuleEString"
    // InternalRefDsl.g:2928:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRefDsl.g:2928:47: (iv_ruleEString= ruleEString EOF )
            // InternalRefDsl.g:2929:2: iv_ruleEString= ruleEString EOF
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
    // InternalRefDsl.g:2935:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:2941:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRefDsl.g:2942:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRefDsl.g:2942:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalRefDsl.g:2943:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:2951:3: this_ID_1= RULE_ID
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
    // InternalRefDsl.g:2962:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalRefDsl.g:2962:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalRefDsl.g:2963:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalRefDsl.g:2969:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRefDsl.g:2975:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalRefDsl.g:2976:2: (kw= 'true' | kw= 'false' )
            {
            // InternalRefDsl.g:2976:2: (kw= 'true' | kw= 'false' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==98) ) {
                alt70=1;
            }
            else if ( (LA70_0==99) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalRefDsl.g:2977:3: kw= 'true'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:2983:3: kw= 'false'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEDouble"
    // InternalRefDsl.g:2992:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalRefDsl.g:2992:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalRefDsl.g:2993:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalRefDsl.g:2999:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3005:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalRefDsl.g:3006:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalRefDsl.g:3006:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalRefDsl.g:3007:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_110); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
            		
            // InternalRefDsl.g:3014:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==100) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRefDsl.g:3015:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,100,FOLLOW_71); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleUserKind"
    // InternalRefDsl.g:3032:1: ruleUserKind returns [Enumerator current=null] : ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) ) ;
    public final Enumerator ruleUserKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3038:2: ( ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) ) )
            // InternalRefDsl.g:3039:2: ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) )
            {
            // InternalRefDsl.g:3039:2: ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) )
            int alt72=5;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt72=1;
                }
                break;
            case 102:
                {
                alt72=2;
                }
                break;
            case 103:
                {
                alt72=3;
                }
                break;
            case 104:
                {
                alt72=4;
                }
                break;
            case 105:
                {
                alt72=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalRefDsl.g:3040:3: (enumLiteral_0= 'GENERIC' )
                    {
                    // InternalRefDsl.g:3040:3: (enumLiteral_0= 'GENERIC' )
                    // InternalRefDsl.g:3041:4: enumLiteral_0= 'GENERIC'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getGENERICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserKindAccess().getGENERICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3048:3: (enumLiteral_1= 'BUYER' )
                    {
                    // InternalRefDsl.g:3048:3: (enumLiteral_1= 'BUYER' )
                    // InternalRefDsl.g:3049:4: enumLiteral_1= 'BUYER'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getBUYEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUserKindAccess().getBUYEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3056:3: (enumLiteral_2= 'SELLER' )
                    {
                    // InternalRefDsl.g:3056:3: (enumLiteral_2= 'SELLER' )
                    // InternalRefDsl.g:3057:4: enumLiteral_2= 'SELLER'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getSELLEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUserKindAccess().getSELLEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3064:3: (enumLiteral_3= 'CREATOR' )
                    {
                    // InternalRefDsl.g:3064:3: (enumLiteral_3= 'CREATOR' )
                    // InternalRefDsl.g:3065:4: enumLiteral_3= 'CREATOR'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getCREATOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUserKindAccess().getCREATOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3072:3: (enumLiteral_4= 'MODERATOR' )
                    {
                    // InternalRefDsl.g:3072:3: (enumLiteral_4= 'MODERATOR' )
                    // InternalRefDsl.g:3073:4: enumLiteral_4= 'MODERATOR'
                    {
                    enumLiteral_4=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getMODERATOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUserKindAccess().getMODERATOREnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleUserKind"


    // $ANTLR start "ruleContextKind"
    // InternalRefDsl.g:3083:1: ruleContextKind returns [Enumerator current=null] : ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) ) ;
    public final Enumerator ruleContextKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3089:2: ( ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) ) )
            // InternalRefDsl.g:3090:2: ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) )
            {
            // InternalRefDsl.g:3090:2: ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt73=1;
                }
                break;
            case 107:
                {
                alt73=2;
                }
                break;
            case 108:
                {
                alt73=3;
                }
                break;
            case 109:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalRefDsl.g:3091:3: (enumLiteral_0= 'GLOBAL' )
                    {
                    // InternalRefDsl.g:3091:3: (enumLiteral_0= 'GLOBAL' )
                    // InternalRefDsl.g:3092:4: enumLiteral_0= 'GLOBAL'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getGLOBALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContextKindAccess().getGLOBALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3099:3: (enumLiteral_1= 'COMMUNITY' )
                    {
                    // InternalRefDsl.g:3099:3: (enumLiteral_1= 'COMMUNITY' )
                    // InternalRefDsl.g:3100:4: enumLiteral_1= 'COMMUNITY'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getCOMMUNITYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContextKindAccess().getCOMMUNITYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3107:3: (enumLiteral_2= 'CHANNEL' )
                    {
                    // InternalRefDsl.g:3107:3: (enumLiteral_2= 'CHANNEL' )
                    // InternalRefDsl.g:3108:4: enumLiteral_2= 'CHANNEL'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getCHANNELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getContextKindAccess().getCHANNELEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3115:3: (enumLiteral_3= 'CATALOG' )
                    {
                    // InternalRefDsl.g:3115:3: (enumLiteral_3= 'CATALOG' )
                    // InternalRefDsl.g:3116:4: enumLiteral_3= 'CATALOG'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getCATALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getContextKindAccess().getCATALOGEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleContextKind"


    // $ANTLR start "rulePrimitiveType"
    // InternalRefDsl.g:3126:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
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
            // InternalRefDsl.g:3132:2: ( ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) ) )
            // InternalRefDsl.g:3133:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) )
            {
            // InternalRefDsl.g:3133:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) )
            int alt74=8;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt74=1;
                }
                break;
            case 111:
                {
                alt74=2;
                }
                break;
            case 112:
                {
                alt74=3;
                }
                break;
            case 113:
                {
                alt74=4;
                }
                break;
            case 114:
                {
                alt74=5;
                }
                break;
            case 115:
                {
                alt74=6;
                }
                break;
            case 116:
                {
                alt74=7;
                }
                break;
            case 117:
                {
                alt74=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalRefDsl.g:3134:3: (enumLiteral_0= 'TEXT' )
                    {
                    // InternalRefDsl.g:3134:3: (enumLiteral_0= 'TEXT' )
                    // InternalRefDsl.g:3135:4: enumLiteral_0= 'TEXT'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getTEXTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3142:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalRefDsl.g:3142:3: (enumLiteral_1= 'NUMBER' )
                    // InternalRefDsl.g:3143:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3150:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalRefDsl.g:3150:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalRefDsl.g:3151:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3158:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalRefDsl.g:3158:3: (enumLiteral_3= 'DATE' )
                    // InternalRefDsl.g:3159:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3166:3: (enumLiteral_4= 'DATETIME' )
                    {
                    // InternalRefDsl.g:3166:3: (enumLiteral_4= 'DATETIME' )
                    // InternalRefDsl.g:3167:4: enumLiteral_4= 'DATETIME'
                    {
                    enumLiteral_4=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDATETIMEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getDATETIMEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:3174:3: (enumLiteral_5= 'IMAGE' )
                    {
                    // InternalRefDsl.g:3174:3: (enumLiteral_5= 'IMAGE' )
                    // InternalRefDsl.g:3175:4: enumLiteral_5= 'IMAGE'
                    {
                    enumLiteral_5=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getIMAGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getIMAGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:3182:3: (enumLiteral_6= 'VIDEO' )
                    {
                    // InternalRefDsl.g:3182:3: (enumLiteral_6= 'VIDEO' )
                    // InternalRefDsl.g:3183:4: enumLiteral_6= 'VIDEO'
                    {
                    enumLiteral_6=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getVIDEOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveTypeAccess().getVIDEOEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:3190:3: (enumLiteral_7= 'URL' )
                    {
                    // InternalRefDsl.g:3190:3: (enumLiteral_7= 'URL' )
                    // InternalRefDsl.g:3191:4: enumLiteral_7= 'URL'
                    {
                    enumLiteral_7=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getURLEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveTypeAccess().getURLEnumLiteralDeclaration_7());
                    			

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


    // $ANTLR start "ruleFeedbackKind"
    // InternalRefDsl.g:3201:1: ruleFeedbackKind returns [Enumerator current=null] : ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) ) ;
    public final Enumerator ruleFeedbackKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3207:2: ( ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) ) )
            // InternalRefDsl.g:3208:2: ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) )
            {
            // InternalRefDsl.g:3208:2: ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt75=1;
                }
                break;
            case 119:
                {
                alt75=2;
                }
                break;
            case 120:
                {
                alt75=3;
                }
                break;
            case 121:
                {
                alt75=4;
                }
                break;
            case 122:
                {
                alt75=5;
                }
                break;
            case 123:
                {
                alt75=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalRefDsl.g:3209:3: (enumLiteral_0= 'COMMENT' )
                    {
                    // InternalRefDsl.g:3209:3: (enumLiteral_0= 'COMMENT' )
                    // InternalRefDsl.g:3210:4: enumLiteral_0= 'COMMENT'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getCOMMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackKindAccess().getCOMMENTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3217:3: (enumLiteral_1= 'REVIEW' )
                    {
                    // InternalRefDsl.g:3217:3: (enumLiteral_1= 'REVIEW' )
                    // InternalRefDsl.g:3218:4: enumLiteral_1= 'REVIEW'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getREVIEWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackKindAccess().getREVIEWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3225:3: (enumLiteral_2= 'REACTION' )
                    {
                    // InternalRefDsl.g:3225:3: (enumLiteral_2= 'REACTION' )
                    // InternalRefDsl.g:3226:4: enumLiteral_2= 'REACTION'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getREACTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeedbackKindAccess().getREACTIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3233:3: (enumLiteral_3= 'VOTE' )
                    {
                    // InternalRefDsl.g:3233:3: (enumLiteral_3= 'VOTE' )
                    // InternalRefDsl.g:3234:4: enumLiteral_3= 'VOTE'
                    {
                    enumLiteral_3=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getVOTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFeedbackKindAccess().getVOTEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3241:3: (enumLiteral_4= 'REPORT' )
                    {
                    // InternalRefDsl.g:3241:3: (enumLiteral_4= 'REPORT' )
                    // InternalRefDsl.g:3242:4: enumLiteral_4= 'REPORT'
                    {
                    enumLiteral_4=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getREPORTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFeedbackKindAccess().getREPORTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:3249:3: (enumLiteral_5= 'SUBSCRIPTION' )
                    {
                    // InternalRefDsl.g:3249:3: (enumLiteral_5= 'SUBSCRIPTION' )
                    // InternalRefDsl.g:3250:4: enumLiteral_5= 'SUBSCRIPTION'
                    {
                    enumLiteral_5=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getSUBSCRIPTIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFeedbackKindAccess().getSUBSCRIPTIONEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleFeedbackKind"


    // $ANTLR start "ruleFeedbackSubjectScope"
    // InternalRefDsl.g:3260:1: ruleFeedbackSubjectScope returns [Enumerator current=null] : ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) ) ;
    public final Enumerator ruleFeedbackSubjectScope() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3266:2: ( ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) ) )
            // InternalRefDsl.g:3267:2: ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) )
            {
            // InternalRefDsl.g:3267:2: ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt76=1;
                }
                break;
            case 125:
                {
                alt76=2;
                }
                break;
            case 126:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalRefDsl.g:3268:3: (enumLiteral_0= 'RESOURCE_ONLY' )
                    {
                    // InternalRefDsl.g:3268:3: (enumLiteral_0= 'RESOURCE_ONLY' )
                    // InternalRefDsl.g:3269:4: enumLiteral_0= 'RESOURCE_ONLY'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackSubjectScopeAccess().getRESOURCE_ONLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackSubjectScopeAccess().getRESOURCE_ONLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3276:3: (enumLiteral_1= 'FEEDBACK_ONLY' )
                    {
                    // InternalRefDsl.g:3276:3: (enumLiteral_1= 'FEEDBACK_ONLY' )
                    // InternalRefDsl.g:3277:4: enumLiteral_1= 'FEEDBACK_ONLY'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackSubjectScopeAccess().getFEEDBACK_ONLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackSubjectScopeAccess().getFEEDBACK_ONLYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3284:3: (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' )
                    {
                    // InternalRefDsl.g:3284:3: (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' )
                    // InternalRefDsl.g:3285:4: enumLiteral_2= 'RESOURCE_OR_FEEDBACK'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackSubjectScopeAccess().getRESOURCE_OR_FEEDBACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeedbackSubjectScopeAccess().getRESOURCE_OR_FEEDBACKEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleFeedbackSubjectScope"


    // $ANTLR start "ruleFeedbackStatus"
    // InternalRefDsl.g:3295:1: ruleFeedbackStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) ) ;
    public final Enumerator ruleFeedbackStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3301:2: ( ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) ) )
            // InternalRefDsl.g:3302:2: ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) )
            {
            // InternalRefDsl.g:3302:2: ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==127) ) {
                alt77=1;
            }
            else if ( (LA77_0==128) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalRefDsl.g:3303:3: (enumLiteral_0= 'ENABLED' )
                    {
                    // InternalRefDsl.g:3303:3: (enumLiteral_0= 'ENABLED' )
                    // InternalRefDsl.g:3304:4: enumLiteral_0= 'ENABLED'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackStatusAccess().getENABLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackStatusAccess().getENABLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3311:3: (enumLiteral_1= 'DISABLED' )
                    {
                    // InternalRefDsl.g:3311:3: (enumLiteral_1= 'DISABLED' )
                    // InternalRefDsl.g:3312:4: enumLiteral_1= 'DISABLED'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackStatusAccess().getDISABLEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackStatusAccess().getDISABLEDEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleFeedbackStatus"


    // $ANTLR start "ruleRatingScaleKind"
    // InternalRefDsl.g:3322:1: ruleRatingScaleKind returns [Enumerator current=null] : ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'ORDINAL' ) | (enumLiteral_2= 'PERCENTAGE' ) ) ;
    public final Enumerator ruleRatingScaleKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3328:2: ( ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'ORDINAL' ) | (enumLiteral_2= 'PERCENTAGE' ) ) )
            // InternalRefDsl.g:3329:2: ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'ORDINAL' ) | (enumLiteral_2= 'PERCENTAGE' ) )
            {
            // InternalRefDsl.g:3329:2: ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'ORDINAL' ) | (enumLiteral_2= 'PERCENTAGE' ) )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt78=1;
                }
                break;
            case 130:
                {
                alt78=2;
                }
                break;
            case 131:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalRefDsl.g:3330:3: (enumLiteral_0= 'NUMERIC' )
                    {
                    // InternalRefDsl.g:3330:3: (enumLiteral_0= 'NUMERIC' )
                    // InternalRefDsl.g:3331:4: enumLiteral_0= 'NUMERIC'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getRatingScaleKindAccess().getNUMERICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRatingScaleKindAccess().getNUMERICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3338:3: (enumLiteral_1= 'ORDINAL' )
                    {
                    // InternalRefDsl.g:3338:3: (enumLiteral_1= 'ORDINAL' )
                    // InternalRefDsl.g:3339:4: enumLiteral_1= 'ORDINAL'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getRatingScaleKindAccess().getORDINALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRatingScaleKindAccess().getORDINALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3346:3: (enumLiteral_2= 'PERCENTAGE' )
                    {
                    // InternalRefDsl.g:3346:3: (enumLiteral_2= 'PERCENTAGE' )
                    // InternalRefDsl.g:3347:4: enumLiteral_2= 'PERCENTAGE'
                    {
                    enumLiteral_2=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getRatingScaleKindAccess().getPERCENTAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRatingScaleKindAccess().getPERCENTAGEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRatingScaleKind"


    // $ANTLR start "ruleValidationKind"
    // InternalRefDsl.g:3357:1: ruleValidationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) ) ;
    public final Enumerator ruleValidationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3363:2: ( ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) ) )
            // InternalRefDsl.g:3364:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) )
            {
            // InternalRefDsl.g:3364:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==132) ) {
                alt79=1;
            }
            else if ( (LA79_0==133) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalRefDsl.g:3365:3: (enumLiteral_0= 'AUTOMATIC' )
                    {
                    // InternalRefDsl.g:3365:3: (enumLiteral_0= 'AUTOMATIC' )
                    // InternalRefDsl.g:3366:4: enumLiteral_0= 'AUTOMATIC'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getValidationKindAccess().getAUTOMATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationKindAccess().getAUTOMATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3373:3: (enumLiteral_1= 'MANUAL' )
                    {
                    // InternalRefDsl.g:3373:3: (enumLiteral_1= 'MANUAL' )
                    // InternalRefDsl.g:3374:4: enumLiteral_1= 'MANUAL'
                    {
                    enumLiteral_1=(Token)match(input,133,FOLLOW_2); 

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


    // $ANTLR start "ruleRuleSeverity"
    // InternalRefDsl.g:3384:1: ruleRuleSeverity returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) ) ;
    public final Enumerator ruleRuleSeverity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3390:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) ) )
            // InternalRefDsl.g:3391:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) )
            {
            // InternalRefDsl.g:3391:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt80=1;
                }
                break;
            case 135:
                {
                alt80=2;
                }
                break;
            case 136:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalRefDsl.g:3392:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalRefDsl.g:3392:3: (enumLiteral_0= 'INFO' )
                    // InternalRefDsl.g:3393:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getRuleSeverityAccess().getINFOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleSeverityAccess().getINFOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3400:3: (enumLiteral_1= 'WARNING' )
                    {
                    // InternalRefDsl.g:3400:3: (enumLiteral_1= 'WARNING' )
                    // InternalRefDsl.g:3401:4: enumLiteral_1= 'WARNING'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getRuleSeverityAccess().getWARNINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleSeverityAccess().getWARNINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3408:3: (enumLiteral_2= 'ERROR' )
                    {
                    // InternalRefDsl.g:3408:3: (enumLiteral_2= 'ERROR' )
                    // InternalRefDsl.g:3409:4: enumLiteral_2= 'ERROR'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getRuleSeverityAccess().getERROREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRuleSeverityAccess().getERROREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRuleSeverity"


    // $ANTLR start "ruleModerationMode"
    // InternalRefDsl.g:3419:1: ruleModerationMode returns [Enumerator current=null] : ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) ) ;
    public final Enumerator ruleModerationMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3425:2: ( ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) ) )
            // InternalRefDsl.g:3426:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) )
            {
            // InternalRefDsl.g:3426:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt81=1;
                }
                break;
            case 133:
                {
                alt81=2;
                }
                break;
            case 137:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalRefDsl.g:3427:3: (enumLiteral_0= 'AUTOMATIC' )
                    {
                    // InternalRefDsl.g:3427:3: (enumLiteral_0= 'AUTOMATIC' )
                    // InternalRefDsl.g:3428:4: enumLiteral_0= 'AUTOMATIC'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getModerationModeAccess().getAUTOMATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModerationModeAccess().getAUTOMATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3435:3: (enumLiteral_1= 'MANUAL' )
                    {
                    // InternalRefDsl.g:3435:3: (enumLiteral_1= 'MANUAL' )
                    // InternalRefDsl.g:3436:4: enumLiteral_1= 'MANUAL'
                    {
                    enumLiteral_1=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getModerationModeAccess().getMANUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModerationModeAccess().getMANUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3443:3: (enumLiteral_2= 'HYBRID' )
                    {
                    // InternalRefDsl.g:3443:3: (enumLiteral_2= 'HYBRID' )
                    // InternalRefDsl.g:3444:4: enumLiteral_2= 'HYBRID'
                    {
                    enumLiteral_2=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getModerationModeAccess().getHYBRIDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModerationModeAccess().getHYBRIDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleModerationMode"


    // $ANTLR start "ruleModerationDecision"
    // InternalRefDsl.g:3454:1: ruleModerationDecision returns [Enumerator current=null] : ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) ) ;
    public final Enumerator ruleModerationDecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3460:2: ( ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) ) )
            // InternalRefDsl.g:3461:2: ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) )
            {
            // InternalRefDsl.g:3461:2: ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) )
            int alt82=6;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt82=1;
                }
                break;
            case 139:
                {
                alt82=2;
                }
                break;
            case 140:
                {
                alt82=3;
                }
                break;
            case 141:
                {
                alt82=4;
                }
                break;
            case 142:
                {
                alt82=5;
                }
                break;
            case 143:
                {
                alt82=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalRefDsl.g:3462:3: (enumLiteral_0= 'APPROVED' )
                    {
                    // InternalRefDsl.g:3462:3: (enumLiteral_0= 'APPROVED' )
                    // InternalRefDsl.g:3463:4: enumLiteral_0= 'APPROVED'
                    {
                    enumLiteral_0=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getAPPROVEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModerationDecisionAccess().getAPPROVEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3470:3: (enumLiteral_1= 'FLAGGED' )
                    {
                    // InternalRefDsl.g:3470:3: (enumLiteral_1= 'FLAGGED' )
                    // InternalRefDsl.g:3471:4: enumLiteral_1= 'FLAGGED'
                    {
                    enumLiteral_1=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getFLAGGEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModerationDecisionAccess().getFLAGGEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3478:3: (enumLiteral_2= 'HIDDEN' )
                    {
                    // InternalRefDsl.g:3478:3: (enumLiteral_2= 'HIDDEN' )
                    // InternalRefDsl.g:3479:4: enumLiteral_2= 'HIDDEN'
                    {
                    enumLiteral_2=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getHIDDENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModerationDecisionAccess().getHIDDENEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3486:3: (enumLiteral_3= 'REMOVED' )
                    {
                    // InternalRefDsl.g:3486:3: (enumLiteral_3= 'REMOVED' )
                    // InternalRefDsl.g:3487:4: enumLiteral_3= 'REMOVED'
                    {
                    enumLiteral_3=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getREMOVEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getModerationDecisionAccess().getREMOVEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3494:3: (enumLiteral_4= 'BLOCKED' )
                    {
                    // InternalRefDsl.g:3494:3: (enumLiteral_4= 'BLOCKED' )
                    // InternalRefDsl.g:3495:4: enumLiteral_4= 'BLOCKED'
                    {
                    enumLiteral_4=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getBLOCKEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getModerationDecisionAccess().getBLOCKEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:3502:3: (enumLiteral_5= 'REJECTED' )
                    {
                    // InternalRefDsl.g:3502:3: (enumLiteral_5= 'REJECTED' )
                    // InternalRefDsl.g:3503:4: enumLiteral_5= 'REJECTED'
                    {
                    enumLiteral_5=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getREJECTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getModerationDecisionAccess().getREJECTEDEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleModerationDecision"


    // $ANTLR start "ruleActionKind"
    // InternalRefDsl.g:3513:1: ruleActionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) ) ;
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
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3519:2: ( ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) ) )
            // InternalRefDsl.g:3520:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) )
            {
            // InternalRefDsl.g:3520:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) )
            int alt83=11;
            switch ( input.LA(1) ) {
            case 144:
                {
                alt83=1;
                }
                break;
            case 145:
                {
                alt83=2;
                }
                break;
            case 146:
                {
                alt83=3;
                }
                break;
            case 147:
                {
                alt83=4;
                }
                break;
            case 118:
                {
                alt83=5;
                }
                break;
            case 148:
                {
                alt83=6;
                }
                break;
            case 121:
                {
                alt83=7;
                }
                break;
            case 122:
                {
                alt83=8;
                }
                break;
            case 149:
                {
                alt83=9;
                }
                break;
            case 150:
                {
                alt83=10;
                }
                break;
            case 151:
                {
                alt83=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalRefDsl.g:3521:3: (enumLiteral_0= 'READ' )
                    {
                    // InternalRefDsl.g:3521:3: (enumLiteral_0= 'READ' )
                    // InternalRefDsl.g:3522:4: enumLiteral_0= 'READ'
                    {
                    enumLiteral_0=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionKindAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3529:3: (enumLiteral_1= 'CREATE' )
                    {
                    // InternalRefDsl.g:3529:3: (enumLiteral_1= 'CREATE' )
                    // InternalRefDsl.g:3530:4: enumLiteral_1= 'CREATE'
                    {
                    enumLiteral_1=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getCREATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionKindAccess().getCREATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3537:3: (enumLiteral_2= 'UPDATE' )
                    {
                    // InternalRefDsl.g:3537:3: (enumLiteral_2= 'UPDATE' )
                    // InternalRefDsl.g:3538:4: enumLiteral_2= 'UPDATE'
                    {
                    enumLiteral_2=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionKindAccess().getUPDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3545:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalRefDsl.g:3545:3: (enumLiteral_3= 'DELETE' )
                    // InternalRefDsl.g:3546:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionKindAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3553:3: (enumLiteral_4= 'COMMENT' )
                    {
                    // InternalRefDsl.g:3553:3: (enumLiteral_4= 'COMMENT' )
                    // InternalRefDsl.g:3554:4: enumLiteral_4= 'COMMENT'
                    {
                    enumLiteral_4=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getCOMMENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionKindAccess().getCOMMENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:3561:3: (enumLiteral_5= 'RATE' )
                    {
                    // InternalRefDsl.g:3561:3: (enumLiteral_5= 'RATE' )
                    // InternalRefDsl.g:3562:4: enumLiteral_5= 'RATE'
                    {
                    enumLiteral_5=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getRATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionKindAccess().getRATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:3569:3: (enumLiteral_6= 'VOTE' )
                    {
                    // InternalRefDsl.g:3569:3: (enumLiteral_6= 'VOTE' )
                    // InternalRefDsl.g:3570:4: enumLiteral_6= 'VOTE'
                    {
                    enumLiteral_6=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getVOTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionKindAccess().getVOTEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:3577:3: (enumLiteral_7= 'REPORT' )
                    {
                    // InternalRefDsl.g:3577:3: (enumLiteral_7= 'REPORT' )
                    // InternalRefDsl.g:3578:4: enumLiteral_7= 'REPORT'
                    {
                    enumLiteral_7=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getREPORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getActionKindAccess().getREPORTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRefDsl.g:3585:3: (enumLiteral_8= 'SUBSCRIBE' )
                    {
                    // InternalRefDsl.g:3585:3: (enumLiteral_8= 'SUBSCRIBE' )
                    // InternalRefDsl.g:3586:4: enumLiteral_8= 'SUBSCRIBE'
                    {
                    enumLiteral_8=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getSUBSCRIBEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getActionKindAccess().getSUBSCRIBEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRefDsl.g:3593:3: (enumLiteral_9= 'MODERATE' )
                    {
                    // InternalRefDsl.g:3593:3: (enumLiteral_9= 'MODERATE' )
                    // InternalRefDsl.g:3594:4: enumLiteral_9= 'MODERATE'
                    {
                    enumLiteral_9=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getMODERATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getActionKindAccess().getMODERATEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRefDsl.g:3601:3: (enumLiteral_10= 'VALIDATE' )
                    {
                    // InternalRefDsl.g:3601:3: (enumLiteral_10= 'VALIDATE' )
                    // InternalRefDsl.g:3602:4: enumLiteral_10= 'VALIDATE'
                    {
                    enumLiteral_10=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getVALIDATEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getActionKindAccess().getVALIDATEEnumLiteralDeclaration_10());
                    			

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007FF4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007FF0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007FD0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007F90000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007F10000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007E10000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007C10000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007810000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000006010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000003E000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000820002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x003FC00000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0FC0000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000E080000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000C080000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008080000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1F00000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002020L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000230L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0640000000000000L,0x0000000000FF0000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000020880000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000020080000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});

}