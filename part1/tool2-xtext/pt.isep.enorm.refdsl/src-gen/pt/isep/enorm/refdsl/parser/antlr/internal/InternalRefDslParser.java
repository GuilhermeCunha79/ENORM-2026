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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RefModel'", "'version'", "'description'", "'{'", "'userTypes'", "','", "'}'", "'resourceTypes'", "'contextTypes'", "'resourceRelations'", "'feedbackTypes'", "'feedbackDefinitions'", "'authorizationRules'", "'validationRules'", "'moderationPolicies'", "'automationRules'", "'verificationPolicies'", "'sortingPolicies'", "'UserType'", "'kind'", "'superTypes'", "'('", "')'", "'ContextType'", "'contains'", "'ResourceType'", "'supportsMedia'", "'attributes'", "'ResourceRelation'", "'source'", "'target'", "'sourceCardinality'", "'targetCardinality'", "'containment'", "'recursive'", "'required'", "'multiValued'", "'Attribute'", "'type'", "'FeedbackType'", "'subjectScope'", "'hasRating'", "'allowsText'", "'allowsMedia'", "'polarity'", "'FeedbackDefinition'", "'requiresVerifiedContext'", "'verificationRequirement'", "'uniquePerAuthorTarget'", "'author'", "'subjectResource'", "'subjectFeedback'", "'policy'", "'rating'", "'FeedbackPolicy'", "'status'", "'RatingPolicy'", "'min'", "'max'", "'step'", "'ValidationRule'", "'name'", "'severity'", "'expression'", "'implementationId'", "'appliesToResource'", "'appliesToFeedback'", "'invokedBy'", "'ModerationPolicy'", "'mode'", "'trigger'", "'decision'", "'monitorsResource'", "'monitorsFeedback'", "'executedBy'", "'inContext'", "'AuthorizationRule'", "'allowedAction'", "'actor'", "'context'", "'resourceTarget'", "'feedbackTarget'", "'AutomationRule'", "'onFeedback'", "'uses'", "'invokedValidationRules'", "'conditions'", "'actions'", "'Condition'", "'operator'", "'attribute'", "'values'", "'value'", "'Action'", "'message'", "'VerificationPolicy'", "'appliesWhen'", "'verifies'", "'SortingPolicy'", "'criterion'", "'direction'", "'true'", "'false'", "'.'", "'GENERIC'", "'BUYER'", "'SELLER'", "'CREATOR'", "'MODERATOR'", "'GLOBAL'", "'COMMUNITY'", "'CHANNEL'", "'CATALOG'", "'TEXT'", "'NUMBER'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'IMAGE'", "'VIDEO'", "'URL'", "'COMMENT'", "'REVIEW'", "'REACTION'", "'VOTE'", "'REPORT'", "'SUBSCRIPTION'", "'RESOURCE_ONLY'", "'FEEDBACK_ONLY'", "'RESOURCE_OR_FEEDBACK'", "'NONE'", "'LIKE_DISLIKE'", "'UP_DOWN'", "'STARS'", "'ENABLED'", "'DISABLED'", "'OPTIONAL'", "'REQUIRED'", "'AUTOMATIC'", "'MANUAL'", "'INFO'", "'WARNING'", "'ERROR'", "'HYBRID'", "'APPROVED'", "'FLAGGED'", "'HIDDEN'", "'REMOVED'", "'BLOCKED'", "'REJECTED'", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'", "'RATE'", "'SUBSCRIBE'", "'MODERATE'", "'VALIDATE'", "'ON_RESOURCE_CREATE'", "'ON_RESOURCE_UPDATE'", "'ON_RESOURCE_DELETE'", "'ON_FEEDBACK_CREATE'", "'ON_FEEDBACK_UPDATE'", "'ON_FEEDBACK_DELETE'", "'ON_REPORT_SUBMITTED'", "'ON_REPORT_THRESHOLD'", "'ON_MANUAL_REQUEST'", "'CONTAINS_KEYWORDS'", "'NOT_CONTAINS_KEYWORDS'", "'MATCH_REGEX'", "'NOT_MATCH_REGEX'", "'HAS_PROPERTY'", "'NOT_HAS_PROPERTY'", "'HAS_SPECIFIC_PROPERTY'", "'NOT_HAS_SPECIFIC_PROPERTY'", "'DISPLAY_MESSAGE'", "'FLAG_CONTENT'", "'HIDE_CONTENT'", "'REMOVE_CONTENT'", "'BLOCK_SUBMISSION'", "'NOTIFY_MODERATOR'", "'AUTO_APPROVE'", "'AUTO_REJECT'", "'VALUE'", "'ASC'", "'DESC'"
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
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
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
    public static final int T__100=100;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int T__105=105;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=9;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalRefDsl.g:72:1: ruleRefModel returns [EObject current=null] : (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}' )? (otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}' )? (otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}' )? (otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}' )? (otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}' )? (otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}' )? (otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}' )? (otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}' )? (otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}' )? (otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}' )? (otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}' )? (otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}' )? otherlv_79= '}' ) ;
    public final EObject ruleRefModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_userTypes_9_0 = null;

        EObject lv_userTypes_11_0 = null;

        EObject lv_resourceTypes_15_0 = null;

        EObject lv_resourceTypes_17_0 = null;

        EObject lv_contextTypes_21_0 = null;

        EObject lv_contextTypes_23_0 = null;

        EObject lv_resourceRelations_27_0 = null;

        EObject lv_resourceRelations_29_0 = null;

        EObject lv_feedbackTypes_33_0 = null;

        EObject lv_feedbackTypes_35_0 = null;

        EObject lv_feedbackDefinitions_39_0 = null;

        EObject lv_feedbackDefinitions_41_0 = null;

        EObject lv_authorizationRules_45_0 = null;

        EObject lv_authorizationRules_47_0 = null;

        EObject lv_validationRules_51_0 = null;

        EObject lv_validationRules_53_0 = null;

        EObject lv_moderationPolicies_57_0 = null;

        EObject lv_moderationPolicies_59_0 = null;

        EObject lv_automationRules_63_0 = null;

        EObject lv_automationRules_65_0 = null;

        EObject lv_verificationPolicies_69_0 = null;

        EObject lv_verificationPolicies_71_0 = null;

        EObject lv_sortingPolicies_75_0 = null;

        EObject lv_sortingPolicies_77_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:78:2: ( (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}' )? (otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}' )? (otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}' )? (otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}' )? (otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}' )? (otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}' )? (otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}' )? (otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}' )? (otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}' )? (otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}' )? (otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}' )? (otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}' )? otherlv_79= '}' ) )
            // InternalRefDsl.g:79:2: (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}' )? (otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}' )? (otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}' )? (otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}' )? (otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}' )? (otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}' )? (otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}' )? (otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}' )? (otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}' )? (otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}' )? (otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}' )? (otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}' )? otherlv_79= '}' )
            {
            // InternalRefDsl.g:79:2: (otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}' )? (otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}' )? (otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}' )? (otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}' )? (otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}' )? (otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}' )? (otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}' )? (otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}' )? (otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}' )? (otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}' )? (otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}' )? (otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}' )? otherlv_79= '}' )
            // InternalRefDsl.g:80:3: otherlv_0= 'RefModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}' )? (otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}' )? (otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}' )? (otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}' )? (otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}' )? (otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}' )? (otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}' )? (otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}' )? (otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}' )? (otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}' )? (otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}' )? (otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}' )? otherlv_79= '}'
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

            // InternalRefDsl.g:128:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRefDsl.g:129:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRefModelAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRefDsl.g:133:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalRefDsl.g:134:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalRefDsl.g:134:5: (lv_description_5_0= ruleEString )
                    // InternalRefDsl.g:135:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRefDsl.g:157:3: (otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefDsl.g:158:4: otherlv_7= 'userTypes' otherlv_8= '{' ( (lv_userTypes_9_0= ruleUserType ) ) (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getRefModelAccess().getUserTypesKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRefDsl.g:166:4: ( (lv_userTypes_9_0= ruleUserType ) )
                    // InternalRefDsl.g:167:5: (lv_userTypes_9_0= ruleUserType )
                    {
                    // InternalRefDsl.g:167:5: (lv_userTypes_9_0= ruleUserType )
                    // InternalRefDsl.g:168:6: lv_userTypes_9_0= ruleUserType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getUserTypesUserTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:185:4: (otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRefDsl.g:186:5: otherlv_10= ',' ( (lv_userTypes_11_0= ruleUserType ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRefModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRefDsl.g:190:5: ( (lv_userTypes_11_0= ruleUserType ) )
                    	    // InternalRefDsl.g:191:6: (lv_userTypes_11_0= ruleUserType )
                    	    {
                    	    // InternalRefDsl.g:191:6: (lv_userTypes_11_0= ruleUserType )
                    	    // InternalRefDsl.g:192:7: lv_userTypes_11_0= ruleUserType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getUserTypesUserTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_userTypes_11_0=ruleUserType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"userTypes",
                    	    								lv_userTypes_11_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.UserType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:215:3: (otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefDsl.g:216:4: otherlv_13= 'resourceTypes' otherlv_14= '{' ( (lv_resourceTypes_15_0= ruleResourceType ) ) (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getRefModelAccess().getResourceTypesKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRefDsl.g:224:4: ( (lv_resourceTypes_15_0= ruleResourceType ) )
                    // InternalRefDsl.g:225:5: (lv_resourceTypes_15_0= ruleResourceType )
                    {
                    // InternalRefDsl.g:225:5: (lv_resourceTypes_15_0= ruleResourceType )
                    // InternalRefDsl.g:226:6: lv_resourceTypes_15_0= ruleResourceType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getResourceTypesResourceTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:243:4: (otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRefDsl.g:244:5: otherlv_16= ',' ( (lv_resourceTypes_17_0= ruleResourceType ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRefModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRefDsl.g:248:5: ( (lv_resourceTypes_17_0= ruleResourceType ) )
                    	    // InternalRefDsl.g:249:6: (lv_resourceTypes_17_0= ruleResourceType )
                    	    {
                    	    // InternalRefDsl.g:249:6: (lv_resourceTypes_17_0= ruleResourceType )
                    	    // InternalRefDsl.g:250:7: lv_resourceTypes_17_0= ruleResourceType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getResourceTypesResourceTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_resourceTypes_17_0=ruleResourceType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resourceTypes",
                    	    								lv_resourceTypes_17_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ResourceType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:273:3: (otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefDsl.g:274:4: otherlv_19= 'contextTypes' otherlv_20= '{' ( (lv_contextTypes_21_0= ruleContextType ) ) (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getRefModelAccess().getContextTypesKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRefDsl.g:282:4: ( (lv_contextTypes_21_0= ruleContextType ) )
                    // InternalRefDsl.g:283:5: (lv_contextTypes_21_0= ruleContextType )
                    {
                    // InternalRefDsl.g:283:5: (lv_contextTypes_21_0= ruleContextType )
                    // InternalRefDsl.g:284:6: lv_contextTypes_21_0= ruleContextType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getContextTypesContextTypeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:301:4: (otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRefDsl.g:302:5: otherlv_22= ',' ( (lv_contextTypes_23_0= ruleContextType ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getRefModelAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRefDsl.g:306:5: ( (lv_contextTypes_23_0= ruleContextType ) )
                    	    // InternalRefDsl.g:307:6: (lv_contextTypes_23_0= ruleContextType )
                    	    {
                    	    // InternalRefDsl.g:307:6: (lv_contextTypes_23_0= ruleContextType )
                    	    // InternalRefDsl.g:308:7: lv_contextTypes_23_0= ruleContextType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getContextTypesContextTypeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_contextTypes_23_0=ruleContextType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contextTypes",
                    	    								lv_contextTypes_23_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ContextType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:331:3: (otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRefDsl.g:332:4: otherlv_25= 'resourceRelations' otherlv_26= '{' ( (lv_resourceRelations_27_0= ruleResourceRelation ) ) (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_25, grammarAccess.getRefModelAccess().getResourceRelationsKeyword_8_0());
                    			
                    otherlv_26=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_26, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRefDsl.g:340:4: ( (lv_resourceRelations_27_0= ruleResourceRelation ) )
                    // InternalRefDsl.g:341:5: (lv_resourceRelations_27_0= ruleResourceRelation )
                    {
                    // InternalRefDsl.g:341:5: (lv_resourceRelations_27_0= ruleResourceRelation )
                    // InternalRefDsl.g:342:6: lv_resourceRelations_27_0= ruleResourceRelation
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getResourceRelationsResourceRelationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:359:4: (otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRefDsl.g:360:5: otherlv_28= ',' ( (lv_resourceRelations_29_0= ruleResourceRelation ) )
                    	    {
                    	    otherlv_28=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getRefModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRefDsl.g:364:5: ( (lv_resourceRelations_29_0= ruleResourceRelation ) )
                    	    // InternalRefDsl.g:365:6: (lv_resourceRelations_29_0= ruleResourceRelation )
                    	    {
                    	    // InternalRefDsl.g:365:6: (lv_resourceRelations_29_0= ruleResourceRelation )
                    	    // InternalRefDsl.g:366:7: lv_resourceRelations_29_0= ruleResourceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getResourceRelationsResourceRelationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_resourceRelations_29_0=ruleResourceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resourceRelations",
                    	    								lv_resourceRelations_29_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ResourceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_30, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:389:3: (otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRefDsl.g:390:4: otherlv_31= 'feedbackTypes' otherlv_32= '{' ( (lv_feedbackTypes_33_0= ruleFeedbackType ) ) (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_31, grammarAccess.getRefModelAccess().getFeedbackTypesKeyword_9_0());
                    			
                    otherlv_32=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_32, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRefDsl.g:398:4: ( (lv_feedbackTypes_33_0= ruleFeedbackType ) )
                    // InternalRefDsl.g:399:5: (lv_feedbackTypes_33_0= ruleFeedbackType )
                    {
                    // InternalRefDsl.g:399:5: (lv_feedbackTypes_33_0= ruleFeedbackType )
                    // InternalRefDsl.g:400:6: lv_feedbackTypes_33_0= ruleFeedbackType
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackTypesFeedbackTypeParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:417:4: (otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRefDsl.g:418:5: otherlv_34= ',' ( (lv_feedbackTypes_35_0= ruleFeedbackType ) )
                    	    {
                    	    otherlv_34=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getRefModelAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRefDsl.g:422:5: ( (lv_feedbackTypes_35_0= ruleFeedbackType ) )
                    	    // InternalRefDsl.g:423:6: (lv_feedbackTypes_35_0= ruleFeedbackType )
                    	    {
                    	    // InternalRefDsl.g:423:6: (lv_feedbackTypes_35_0= ruleFeedbackType )
                    	    // InternalRefDsl.g:424:7: lv_feedbackTypes_35_0= ruleFeedbackType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackTypesFeedbackTypeParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_feedbackTypes_35_0=ruleFeedbackType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feedbackTypes",
                    	    								lv_feedbackTypes_35_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.FeedbackType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_36, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:447:3: (otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRefDsl.g:448:4: otherlv_37= 'feedbackDefinitions' otherlv_38= '{' ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) ) (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )* otherlv_42= '}'
                    {
                    otherlv_37=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_37, grammarAccess.getRefModelAccess().getFeedbackDefinitionsKeyword_10_0());
                    			
                    otherlv_38=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_38, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRefDsl.g:456:4: ( (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition ) )
                    // InternalRefDsl.g:457:5: (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition )
                    {
                    // InternalRefDsl.g:457:5: (lv_feedbackDefinitions_39_0= ruleFeedbackDefinition )
                    // InternalRefDsl.g:458:6: lv_feedbackDefinitions_39_0= ruleFeedbackDefinition
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackDefinitionsFeedbackDefinitionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:475:4: (otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRefDsl.g:476:5: otherlv_40= ',' ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) )
                    	    {
                    	    otherlv_40=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_40, grammarAccess.getRefModelAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRefDsl.g:480:5: ( (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition ) )
                    	    // InternalRefDsl.g:481:6: (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition )
                    	    {
                    	    // InternalRefDsl.g:481:6: (lv_feedbackDefinitions_41_0= ruleFeedbackDefinition )
                    	    // InternalRefDsl.g:482:7: lv_feedbackDefinitions_41_0= ruleFeedbackDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getFeedbackDefinitionsFeedbackDefinitionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_feedbackDefinitions_41_0=ruleFeedbackDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feedbackDefinitions",
                    	    								lv_feedbackDefinitions_41_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.FeedbackDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_42=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_42, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:505:3: (otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRefDsl.g:506:4: otherlv_43= 'authorizationRules' otherlv_44= '{' ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) ) (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )* otherlv_48= '}'
                    {
                    otherlv_43=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_43, grammarAccess.getRefModelAccess().getAuthorizationRulesKeyword_11_0());
                    			
                    otherlv_44=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_44, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalRefDsl.g:514:4: ( (lv_authorizationRules_45_0= ruleAuthorizationRule ) )
                    // InternalRefDsl.g:515:5: (lv_authorizationRules_45_0= ruleAuthorizationRule )
                    {
                    // InternalRefDsl.g:515:5: (lv_authorizationRules_45_0= ruleAuthorizationRule )
                    // InternalRefDsl.g:516:6: lv_authorizationRules_45_0= ruleAuthorizationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getAuthorizationRulesAuthorizationRuleParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:533:4: (otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRefDsl.g:534:5: otherlv_46= ',' ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) )
                    	    {
                    	    otherlv_46=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_46, grammarAccess.getRefModelAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalRefDsl.g:538:5: ( (lv_authorizationRules_47_0= ruleAuthorizationRule ) )
                    	    // InternalRefDsl.g:539:6: (lv_authorizationRules_47_0= ruleAuthorizationRule )
                    	    {
                    	    // InternalRefDsl.g:539:6: (lv_authorizationRules_47_0= ruleAuthorizationRule )
                    	    // InternalRefDsl.g:540:7: lv_authorizationRules_47_0= ruleAuthorizationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getAuthorizationRulesAuthorizationRuleParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_authorizationRules_47_0=ruleAuthorizationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"authorizationRules",
                    	    								lv_authorizationRules_47_0,
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

                    otherlv_48=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_48, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:563:3: (otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRefDsl.g:564:4: otherlv_49= 'validationRules' otherlv_50= '{' ( (lv_validationRules_51_0= ruleValidationRule ) ) (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )* otherlv_54= '}'
                    {
                    otherlv_49=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_49, grammarAccess.getRefModelAccess().getValidationRulesKeyword_12_0());
                    			
                    otherlv_50=(Token)match(input,14,FOLLOW_23); 

                    				newLeafNode(otherlv_50, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalRefDsl.g:572:4: ( (lv_validationRules_51_0= ruleValidationRule ) )
                    // InternalRefDsl.g:573:5: (lv_validationRules_51_0= ruleValidationRule )
                    {
                    // InternalRefDsl.g:573:5: (lv_validationRules_51_0= ruleValidationRule )
                    // InternalRefDsl.g:574:6: lv_validationRules_51_0= ruleValidationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getValidationRulesValidationRuleParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:591:4: (otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRefDsl.g:592:5: otherlv_52= ',' ( (lv_validationRules_53_0= ruleValidationRule ) )
                    	    {
                    	    otherlv_52=(Token)match(input,16,FOLLOW_23); 

                    	    					newLeafNode(otherlv_52, grammarAccess.getRefModelAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalRefDsl.g:596:5: ( (lv_validationRules_53_0= ruleValidationRule ) )
                    	    // InternalRefDsl.g:597:6: (lv_validationRules_53_0= ruleValidationRule )
                    	    {
                    	    // InternalRefDsl.g:597:6: (lv_validationRules_53_0= ruleValidationRule )
                    	    // InternalRefDsl.g:598:7: lv_validationRules_53_0= ruleValidationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getValidationRulesValidationRuleParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_validationRules_53_0=ruleValidationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"validationRules",
                    	    								lv_validationRules_53_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ValidationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_54=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_54, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:621:3: (otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRefDsl.g:622:4: otherlv_55= 'moderationPolicies' otherlv_56= '{' ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) ) (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )* otherlv_60= '}'
                    {
                    otherlv_55=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_55, grammarAccess.getRefModelAccess().getModerationPoliciesKeyword_13_0());
                    			
                    otherlv_56=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_56, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalRefDsl.g:630:4: ( (lv_moderationPolicies_57_0= ruleModerationPolicy ) )
                    // InternalRefDsl.g:631:5: (lv_moderationPolicies_57_0= ruleModerationPolicy )
                    {
                    // InternalRefDsl.g:631:5: (lv_moderationPolicies_57_0= ruleModerationPolicy )
                    // InternalRefDsl.g:632:6: lv_moderationPolicies_57_0= ruleModerationPolicy
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getModerationPoliciesModerationPolicyParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:649:4: (otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRefDsl.g:650:5: otherlv_58= ',' ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) )
                    	    {
                    	    otherlv_58=(Token)match(input,16,FOLLOW_25); 

                    	    					newLeafNode(otherlv_58, grammarAccess.getRefModelAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalRefDsl.g:654:5: ( (lv_moderationPolicies_59_0= ruleModerationPolicy ) )
                    	    // InternalRefDsl.g:655:6: (lv_moderationPolicies_59_0= ruleModerationPolicy )
                    	    {
                    	    // InternalRefDsl.g:655:6: (lv_moderationPolicies_59_0= ruleModerationPolicy )
                    	    // InternalRefDsl.g:656:7: lv_moderationPolicies_59_0= ruleModerationPolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getModerationPoliciesModerationPolicyParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_moderationPolicies_59_0=ruleModerationPolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"moderationPolicies",
                    	    								lv_moderationPolicies_59_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ModerationPolicy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_60=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_60, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:679:3: (otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRefDsl.g:680:4: otherlv_61= 'automationRules' otherlv_62= '{' ( (lv_automationRules_63_0= ruleAutomationRule ) ) (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )* otherlv_66= '}'
                    {
                    otherlv_61=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_61, grammarAccess.getRefModelAccess().getAutomationRulesKeyword_14_0());
                    			
                    otherlv_62=(Token)match(input,14,FOLLOW_27); 

                    				newLeafNode(otherlv_62, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalRefDsl.g:688:4: ( (lv_automationRules_63_0= ruleAutomationRule ) )
                    // InternalRefDsl.g:689:5: (lv_automationRules_63_0= ruleAutomationRule )
                    {
                    // InternalRefDsl.g:689:5: (lv_automationRules_63_0= ruleAutomationRule )
                    // InternalRefDsl.g:690:6: lv_automationRules_63_0= ruleAutomationRule
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getAutomationRulesAutomationRuleParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:707:4: (otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRefDsl.g:708:5: otherlv_64= ',' ( (lv_automationRules_65_0= ruleAutomationRule ) )
                    	    {
                    	    otherlv_64=(Token)match(input,16,FOLLOW_27); 

                    	    					newLeafNode(otherlv_64, grammarAccess.getRefModelAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalRefDsl.g:712:5: ( (lv_automationRules_65_0= ruleAutomationRule ) )
                    	    // InternalRefDsl.g:713:6: (lv_automationRules_65_0= ruleAutomationRule )
                    	    {
                    	    // InternalRefDsl.g:713:6: (lv_automationRules_65_0= ruleAutomationRule )
                    	    // InternalRefDsl.g:714:7: lv_automationRules_65_0= ruleAutomationRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getAutomationRulesAutomationRuleParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_automationRules_65_0=ruleAutomationRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"automationRules",
                    	    								lv_automationRules_65_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.AutomationRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_66=(Token)match(input,17,FOLLOW_28); 

                    				newLeafNode(otherlv_66, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:737:3: (otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRefDsl.g:738:4: otherlv_67= 'verificationPolicies' otherlv_68= '{' ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) ) (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )* otherlv_72= '}'
                    {
                    otherlv_67=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_67, grammarAccess.getRefModelAccess().getVerificationPoliciesKeyword_15_0());
                    			
                    otherlv_68=(Token)match(input,14,FOLLOW_29); 

                    				newLeafNode(otherlv_68, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalRefDsl.g:746:4: ( (lv_verificationPolicies_69_0= ruleVerificationPolicy ) )
                    // InternalRefDsl.g:747:5: (lv_verificationPolicies_69_0= ruleVerificationPolicy )
                    {
                    // InternalRefDsl.g:747:5: (lv_verificationPolicies_69_0= ruleVerificationPolicy )
                    // InternalRefDsl.g:748:6: lv_verificationPolicies_69_0= ruleVerificationPolicy
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getVerificationPoliciesVerificationPolicyParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:765:4: (otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRefDsl.g:766:5: otherlv_70= ',' ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) )
                    	    {
                    	    otherlv_70=(Token)match(input,16,FOLLOW_29); 

                    	    					newLeafNode(otherlv_70, grammarAccess.getRefModelAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalRefDsl.g:770:5: ( (lv_verificationPolicies_71_0= ruleVerificationPolicy ) )
                    	    // InternalRefDsl.g:771:6: (lv_verificationPolicies_71_0= ruleVerificationPolicy )
                    	    {
                    	    // InternalRefDsl.g:771:6: (lv_verificationPolicies_71_0= ruleVerificationPolicy )
                    	    // InternalRefDsl.g:772:7: lv_verificationPolicies_71_0= ruleVerificationPolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getVerificationPoliciesVerificationPolicyParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_verificationPolicies_71_0=ruleVerificationPolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"verificationPolicies",
                    	    								lv_verificationPolicies_71_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.VerificationPolicy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_72=(Token)match(input,17,FOLLOW_30); 

                    				newLeafNode(otherlv_72, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalRefDsl.g:795:3: (otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRefDsl.g:796:4: otherlv_73= 'sortingPolicies' otherlv_74= '{' ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) ) (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )* otherlv_78= '}'
                    {
                    otherlv_73=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_73, grammarAccess.getRefModelAccess().getSortingPoliciesKeyword_16_0());
                    			
                    otherlv_74=(Token)match(input,14,FOLLOW_31); 

                    				newLeafNode(otherlv_74, grammarAccess.getRefModelAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalRefDsl.g:804:4: ( (lv_sortingPolicies_75_0= ruleSortingPolicy ) )
                    // InternalRefDsl.g:805:5: (lv_sortingPolicies_75_0= ruleSortingPolicy )
                    {
                    // InternalRefDsl.g:805:5: (lv_sortingPolicies_75_0= ruleSortingPolicy )
                    // InternalRefDsl.g:806:6: lv_sortingPolicies_75_0= ruleSortingPolicy
                    {

                    						newCompositeNode(grammarAccess.getRefModelAccess().getSortingPoliciesSortingPolicyParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_sortingPolicies_75_0=ruleSortingPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefModelRule());
                    						}
                    						add(
                    							current,
                    							"sortingPolicies",
                    							lv_sortingPolicies_75_0,
                    							"pt.isep.enorm.refdsl.RefDsl.SortingPolicy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:823:4: (otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRefDsl.g:824:5: otherlv_76= ',' ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) )
                    	    {
                    	    otherlv_76=(Token)match(input,16,FOLLOW_31); 

                    	    					newLeafNode(otherlv_76, grammarAccess.getRefModelAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalRefDsl.g:828:5: ( (lv_sortingPolicies_77_0= ruleSortingPolicy ) )
                    	    // InternalRefDsl.g:829:6: (lv_sortingPolicies_77_0= ruleSortingPolicy )
                    	    {
                    	    // InternalRefDsl.g:829:6: (lv_sortingPolicies_77_0= ruleSortingPolicy )
                    	    // InternalRefDsl.g:830:7: lv_sortingPolicies_77_0= ruleSortingPolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefModelAccess().getSortingPoliciesSortingPolicyParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_sortingPolicies_77_0=ruleSortingPolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sortingPolicies",
                    	    								lv_sortingPolicies_77_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.SortingPolicy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_78=(Token)match(input,17,FOLLOW_32); 

                    				newLeafNode(otherlv_78, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            otherlv_79=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_79, grammarAccess.getRefModelAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalRefDsl.g:861:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // InternalRefDsl.g:861:49: (iv_ruleUserType= ruleUserType EOF )
            // InternalRefDsl.g:862:2: iv_ruleUserType= ruleUserType EOF
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
    // InternalRefDsl.g:868:1: ruleUserType returns [EObject current=null] : (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) ;
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
            // InternalRefDsl.g:874:2: ( (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) )
            // InternalRefDsl.g:875:2: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            {
            // InternalRefDsl.g:875:2: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            // InternalRefDsl.g:876:3: otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleUserKind ) ) (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserTypeAccess().getUserTypeKeyword_0());
            		
            // InternalRefDsl.g:880:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:881:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:881:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:882:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,30,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getUserTypeAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:903:3: ( (lv_kind_3_0= ruleUserKind ) )
            // InternalRefDsl.g:904:4: (lv_kind_3_0= ruleUserKind )
            {
            // InternalRefDsl.g:904:4: (lv_kind_3_0= ruleUserKind )
            // InternalRefDsl.g:905:5: lv_kind_3_0= ruleUserKind
            {

            					newCompositeNode(grammarAccess.getUserTypeAccess().getKindUserKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalRefDsl.g:922:3: (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRefDsl.g:923:4: otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getUserTypeAccess().getSuperTypesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserTypeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRefDsl.g:931:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:932:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:932:5: ( ruleEString )
                    // InternalRefDsl.g:933:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUserTypeAccess().getSuperTypesUserTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:947:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRefDsl.g:948:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUserTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:952:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:953:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:953:6: ( ruleEString )
                    	    // InternalRefDsl.g:954:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUserTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUserTypeAccess().getSuperTypesUserTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRefDsl.g:978:1: entryRuleContextType returns [EObject current=null] : iv_ruleContextType= ruleContextType EOF ;
    public final EObject entryRuleContextType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextType = null;


        try {
            // InternalRefDsl.g:978:52: (iv_ruleContextType= ruleContextType EOF )
            // InternalRefDsl.g:979:2: iv_ruleContextType= ruleContextType EOF
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
    // InternalRefDsl.g:985:1: ruleContextType returns [EObject current=null] : (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) ;
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
            // InternalRefDsl.g:991:2: ( (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? ) )
            // InternalRefDsl.g:992:2: (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            {
            // InternalRefDsl.g:992:2: (otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? )
            // InternalRefDsl.g:993:3: otherlv_0= 'ContextType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleContextKind ) ) (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextTypeAccess().getContextTypeKeyword_0());
            		
            // InternalRefDsl.g:997:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:998:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:998:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:999:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContextTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getContextTypeAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:1020:3: ( (lv_kind_3_0= ruleContextKind ) )
            // InternalRefDsl.g:1021:4: (lv_kind_3_0= ruleContextKind )
            {
            // InternalRefDsl.g:1021:4: (lv_kind_3_0= ruleContextKind )
            // InternalRefDsl.g:1022:5: lv_kind_3_0= ruleContextKind
            {

            					newCompositeNode(grammarAccess.getContextTypeAccess().getKindContextKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalRefDsl.g:1039:3: (otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRefDsl.g:1040:4: otherlv_4= 'contains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getContextTypeAccess().getContainsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextTypeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRefDsl.g:1048:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1049:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1049:5: ( ruleEString )
                    // InternalRefDsl.g:1050:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContextTypeAccess().getContainsResourceTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:1064:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRefDsl.g:1065:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getContextTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRefDsl.g:1069:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:1070:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:1070:6: ( ruleEString )
                    	    // InternalRefDsl.g:1071:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContextTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getContextTypeAccess().getContainsResourceTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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

                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRefDsl.g:1095:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalRefDsl.g:1095:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalRefDsl.g:1096:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalRefDsl.g:1102:1: ruleResourceType returns [EObject current=null] : (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
            // InternalRefDsl.g:1108:2: ( (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRefDsl.g:1109:2: (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRefDsl.g:1109:2: (otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRefDsl.g:1110:3: otherlv_0= 'ResourceType' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )? (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '{' (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_0());
            		
            // InternalRefDsl.g:1114:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1115:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1115:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1116:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalRefDsl.g:1133:3: (otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRefDsl.g:1134:4: otherlv_2= 'supportsMedia' ( (lv_supportsMedia_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_41); 

                    				newLeafNode(otherlv_2, grammarAccess.getResourceTypeAccess().getSupportsMediaKeyword_2_0());
                    			
                    // InternalRefDsl.g:1138:4: ( (lv_supportsMedia_3_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1139:5: (lv_supportsMedia_3_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1139:5: (lv_supportsMedia_3_0= ruleEBoolean )
                    // InternalRefDsl.g:1140:6: lv_supportsMedia_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getSupportsMediaEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalRefDsl.g:1158:3: (otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRefDsl.g:1159:4: otherlv_4= 'superTypes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getSuperTypesKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourceTypeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRefDsl.g:1167:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1168:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1168:5: ( ruleEString )
                    // InternalRefDsl.g:1169:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getSuperTypesResourceTypeCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:1183:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRefDsl.g:1184:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getResourceTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRefDsl.g:1188:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:1189:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:1189:6: ( ruleEString )
                    	    // InternalRefDsl.g:1190:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourceTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getResourceTypeAccess().getSuperTypesResourceTypeCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getResourceTypeAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_43); 

            			newLeafNode(otherlv_10, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRefDsl.g:1214:3: (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRefDsl.g:1215:4: otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getResourceTypeAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_44); 

                    				newLeafNode(otherlv_12, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRefDsl.g:1223:4: ( (lv_attributes_13_0= ruleAttribute ) )
                    // InternalRefDsl.g:1224:5: (lv_attributes_13_0= ruleAttribute )
                    {
                    // InternalRefDsl.g:1224:5: (lv_attributes_13_0= ruleAttribute )
                    // InternalRefDsl.g:1225:6: lv_attributes_13_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getResourceTypeAccess().getAttributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalRefDsl.g:1242:4: (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRefDsl.g:1243:5: otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_44); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getResourceTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRefDsl.g:1247:5: ( (lv_attributes_15_0= ruleAttribute ) )
                    	    // InternalRefDsl.g:1248:6: (lv_attributes_15_0= ruleAttribute )
                    	    {
                    	    // InternalRefDsl.g:1248:6: (lv_attributes_15_0= ruleAttribute )
                    	    // InternalRefDsl.g:1249:7: lv_attributes_15_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceTypeAccess().getAttributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRefDsl.g:1280:1: entryRuleResourceRelation returns [EObject current=null] : iv_ruleResourceRelation= ruleResourceRelation EOF ;
    public final EObject entryRuleResourceRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRelation = null;


        try {
            // InternalRefDsl.g:1280:57: (iv_ruleResourceRelation= ruleResourceRelation EOF )
            // InternalRefDsl.g:1281:2: iv_ruleResourceRelation= ruleResourceRelation EOF
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
    // InternalRefDsl.g:1287:1: ruleResourceRelation returns [EObject current=null] : (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? ) ;
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
            // InternalRefDsl.g:1293:2: ( (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? ) )
            // InternalRefDsl.g:1294:2: (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? )
            {
            // InternalRefDsl.g:1294:2: (otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )? )
            // InternalRefDsl.g:1295:3: otherlv_0= 'ResourceRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )? (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )? (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )? (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceRelationAccess().getResourceRelationKeyword_0());
            		
            // InternalRefDsl.g:1299:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1300:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1300:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1301:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceRelationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_2=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceRelationAccess().getSourceKeyword_2());
            		
            // InternalRefDsl.g:1322:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1323:4: ( ruleEString )
            {
            // InternalRefDsl.g:1323:4: ( ruleEString )
            // InternalRefDsl.g:1324:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceRelationAccess().getSourceResourceTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getResourceRelationAccess().getTargetKeyword_4());
            		
            // InternalRefDsl.g:1342:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1343:4: ( ruleEString )
            {
            // InternalRefDsl.g:1343:4: ( ruleEString )
            // InternalRefDsl.g:1344:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceRelationAccess().getTargetResourceTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1358:3: (otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRefDsl.g:1359:4: otherlv_6= 'sourceCardinality' ( (lv_sourceCardinality_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getResourceRelationAccess().getSourceCardinalityKeyword_6_0());
                    			
                    // InternalRefDsl.g:1363:4: ( (lv_sourceCardinality_7_0= ruleEString ) )
                    // InternalRefDsl.g:1364:5: (lv_sourceCardinality_7_0= ruleEString )
                    {
                    // InternalRefDsl.g:1364:5: (lv_sourceCardinality_7_0= ruleEString )
                    // InternalRefDsl.g:1365:6: lv_sourceCardinality_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getSourceCardinalityEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            // InternalRefDsl.g:1383:3: (otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRefDsl.g:1384:4: otherlv_8= 'targetCardinality' ( (lv_targetCardinality_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceRelationAccess().getTargetCardinalityKeyword_7_0());
                    			
                    // InternalRefDsl.g:1388:4: ( (lv_targetCardinality_9_0= ruleEString ) )
                    // InternalRefDsl.g:1389:5: (lv_targetCardinality_9_0= ruleEString )
                    {
                    // InternalRefDsl.g:1389:5: (lv_targetCardinality_9_0= ruleEString )
                    // InternalRefDsl.g:1390:6: lv_targetCardinality_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getTargetCardinalityEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalRefDsl.g:1408:3: (otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRefDsl.g:1409:4: otherlv_10= 'containment' ( (lv_containment_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceRelationAccess().getContainmentKeyword_8_0());
                    			
                    // InternalRefDsl.g:1413:4: ( (lv_containment_11_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1414:5: (lv_containment_11_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1414:5: (lv_containment_11_0= ruleEBoolean )
                    // InternalRefDsl.g:1415:6: lv_containment_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getResourceRelationAccess().getContainmentEBooleanParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

            // InternalRefDsl.g:1433:3: (otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRefDsl.g:1434:4: otherlv_12= 'recursive' ( (lv_recursive_13_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_41); 

                    				newLeafNode(otherlv_12, grammarAccess.getResourceRelationAccess().getRecursiveKeyword_9_0());
                    			
                    // InternalRefDsl.g:1438:4: ( (lv_recursive_13_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1439:5: (lv_recursive_13_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1439:5: (lv_recursive_13_0= ruleEBoolean )
                    // InternalRefDsl.g:1440:6: lv_recursive_13_0= ruleEBoolean
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
    // InternalRefDsl.g:1462:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRefDsl.g:1462:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRefDsl.g:1463:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRefDsl.g:1469:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) ) ;
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
            // InternalRefDsl.g:1475:2: ( ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) ) )
            // InternalRefDsl.g:1476:2: ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) )
            {
            // InternalRefDsl.g:1476:2: ( (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) ) )
            // InternalRefDsl.g:1477:3: (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )? (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )? otherlv_4= 'Attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'type' ( (lv_type_7_0= rulePrimitiveType ) )
            {
            // InternalRefDsl.g:1477:3: (otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRefDsl.g:1478:4: otherlv_0= 'required' ( (lv_required_1_0= ruleEBoolean ) )
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_41); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getRequiredKeyword_0_0());
                    			
                    // InternalRefDsl.g:1482:4: ( (lv_required_1_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1483:5: (lv_required_1_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1483:5: (lv_required_1_0= ruleEBoolean )
                    // InternalRefDsl.g:1484:6: lv_required_1_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getRequiredEBooleanParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalRefDsl.g:1502:3: (otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRefDsl.g:1503:4: otherlv_2= 'multiValued' ( (lv_multiValued_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_41); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getMultiValuedKeyword_1_0());
                    			
                    // InternalRefDsl.g:1507:4: ( (lv_multiValued_3_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1508:5: (lv_multiValued_3_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1508:5: (lv_multiValued_3_0= ruleEBoolean )
                    // InternalRefDsl.g:1509:6: lv_multiValued_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getMultiValuedEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            otherlv_4=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getAttributeKeyword_2());
            		
            // InternalRefDsl.g:1531:3: ( (lv_name_5_0= ruleEString ) )
            // InternalRefDsl.g:1532:4: (lv_name_5_0= ruleEString )
            {
            // InternalRefDsl.g:1532:4: (lv_name_5_0= ruleEString )
            // InternalRefDsl.g:1533:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_6=(Token)match(input,49,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTypeKeyword_4());
            		
            // InternalRefDsl.g:1554:3: ( (lv_type_7_0= rulePrimitiveType ) )
            // InternalRefDsl.g:1555:4: (lv_type_7_0= rulePrimitiveType )
            {
            // InternalRefDsl.g:1555:4: (lv_type_7_0= rulePrimitiveType )
            // InternalRefDsl.g:1556:5: lv_type_7_0= rulePrimitiveType
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
    // InternalRefDsl.g:1577:1: entryRuleFeedbackType returns [EObject current=null] : iv_ruleFeedbackType= ruleFeedbackType EOF ;
    public final EObject entryRuleFeedbackType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackType = null;


        try {
            // InternalRefDsl.g:1577:53: (iv_ruleFeedbackType= ruleFeedbackType EOF )
            // InternalRefDsl.g:1578:2: iv_ruleFeedbackType= ruleFeedbackType EOF
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
    // InternalRefDsl.g:1584:1: ruleFeedbackType returns [EObject current=null] : (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) ) )? (otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) ) )? (otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) ) )? ) ;
    public final EObject ruleFeedbackType() throws RecognitionException {
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

        Enumerator lv_kind_3_0 = null;

        Enumerator lv_subjectScope_5_0 = null;

        AntlrDatatypeRuleToken lv_hasRating_7_0 = null;

        AntlrDatatypeRuleToken lv_recursive_9_0 = null;

        AntlrDatatypeRuleToken lv_allowsText_11_0 = null;

        AntlrDatatypeRuleToken lv_allowsMedia_13_0 = null;

        Enumerator lv_polarity_15_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1590:2: ( (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) ) )? (otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) ) )? (otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) ) )? ) )
            // InternalRefDsl.g:1591:2: (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) ) )? (otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) ) )? (otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) ) )? )
            {
            // InternalRefDsl.g:1591:2: (otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) ) )? (otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) ) )? (otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) ) )? )
            // InternalRefDsl.g:1592:3: otherlv_0= 'FeedbackType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleFeedbackKind ) ) (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )? (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )? (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )? (otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) ) )? (otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) ) )? (otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackTypeAccess().getFeedbackTypeKeyword_0());
            		
            // InternalRefDsl.g:1596:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1597:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1597:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1598:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,30,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackTypeAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:1619:3: ( (lv_kind_3_0= ruleFeedbackKind ) )
            // InternalRefDsl.g:1620:4: (lv_kind_3_0= ruleFeedbackKind )
            {
            // InternalRefDsl.g:1620:4: (lv_kind_3_0= ruleFeedbackKind )
            // InternalRefDsl.g:1621:5: lv_kind_3_0= ruleFeedbackKind
            {

            					newCompositeNode(grammarAccess.getFeedbackTypeAccess().getKindFeedbackKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalRefDsl.g:1638:3: (otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRefDsl.g:1639:4: otherlv_4= 'subjectScope' ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedbackTypeAccess().getSubjectScopeKeyword_4_0());
                    			
                    // InternalRefDsl.g:1643:4: ( (lv_subjectScope_5_0= ruleFeedbackSubjectScope ) )
                    // InternalRefDsl.g:1644:5: (lv_subjectScope_5_0= ruleFeedbackSubjectScope )
                    {
                    // InternalRefDsl.g:1644:5: (lv_subjectScope_5_0= ruleFeedbackSubjectScope )
                    // InternalRefDsl.g:1645:6: lv_subjectScope_5_0= ruleFeedbackSubjectScope
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getSubjectScopeFeedbackSubjectScopeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
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

            // InternalRefDsl.g:1663:3: (otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRefDsl.g:1664:4: otherlv_6= 'hasRating' ( (lv_hasRating_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackTypeAccess().getHasRatingKeyword_5_0());
                    			
                    // InternalRefDsl.g:1668:4: ( (lv_hasRating_7_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1669:5: (lv_hasRating_7_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1669:5: (lv_hasRating_7_0= ruleEBoolean )
                    // InternalRefDsl.g:1670:6: lv_hasRating_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getHasRatingEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_59);
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

            // InternalRefDsl.g:1688:3: (otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRefDsl.g:1689:4: otherlv_8= 'recursive' ( (lv_recursive_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeedbackTypeAccess().getRecursiveKeyword_6_0());
                    			
                    // InternalRefDsl.g:1693:4: ( (lv_recursive_9_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1694:5: (lv_recursive_9_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1694:5: (lv_recursive_9_0= ruleEBoolean )
                    // InternalRefDsl.g:1695:6: lv_recursive_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getRecursiveEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalRefDsl.g:1713:3: (otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRefDsl.g:1714:4: otherlv_10= 'allowsText' ( (lv_allowsText_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeedbackTypeAccess().getAllowsTextKeyword_7_0());
                    			
                    // InternalRefDsl.g:1718:4: ( (lv_allowsText_11_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1719:5: (lv_allowsText_11_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1719:5: (lv_allowsText_11_0= ruleEBoolean )
                    // InternalRefDsl.g:1720:6: lv_allowsText_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getAllowsTextEBooleanParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_allowsText_11_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"allowsText",
                    							lv_allowsText_11_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1738:3: (otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRefDsl.g:1739:4: otherlv_12= 'allowsMedia' ( (lv_allowsMedia_13_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,54,FOLLOW_41); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeedbackTypeAccess().getAllowsMediaKeyword_8_0());
                    			
                    // InternalRefDsl.g:1743:4: ( (lv_allowsMedia_13_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1744:5: (lv_allowsMedia_13_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1744:5: (lv_allowsMedia_13_0= ruleEBoolean )
                    // InternalRefDsl.g:1745:6: lv_allowsMedia_13_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getAllowsMediaEBooleanParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_allowsMedia_13_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"allowsMedia",
                    							lv_allowsMedia_13_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1763:3: (otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRefDsl.g:1764:4: otherlv_14= 'polarity' ( (lv_polarity_15_0= ruleFeedbackPolarity ) )
                    {
                    otherlv_14=(Token)match(input,55,FOLLOW_63); 

                    				newLeafNode(otherlv_14, grammarAccess.getFeedbackTypeAccess().getPolarityKeyword_9_0());
                    			
                    // InternalRefDsl.g:1768:4: ( (lv_polarity_15_0= ruleFeedbackPolarity ) )
                    // InternalRefDsl.g:1769:5: (lv_polarity_15_0= ruleFeedbackPolarity )
                    {
                    // InternalRefDsl.g:1769:5: (lv_polarity_15_0= ruleFeedbackPolarity )
                    // InternalRefDsl.g:1770:6: lv_polarity_15_0= ruleFeedbackPolarity
                    {

                    						newCompositeNode(grammarAccess.getFeedbackTypeAccess().getPolarityFeedbackPolarityEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_polarity_15_0=ruleFeedbackPolarity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackTypeRule());
                    						}
                    						set(
                    							current,
                    							"polarity",
                    							lv_polarity_15_0,
                    							"pt.isep.enorm.refdsl.RefDsl.FeedbackPolarity");
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
    // InternalRefDsl.g:1792:1: entryRuleFeedbackDefinition returns [EObject current=null] : iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF ;
    public final EObject entryRuleFeedbackDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackDefinition = null;


        try {
            // InternalRefDsl.g:1792:59: (iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF )
            // InternalRefDsl.g:1793:2: iv_ruleFeedbackDefinition= ruleFeedbackDefinition EOF
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
    // InternalRefDsl.g:1799:1: ruleFeedbackDefinition returns [EObject current=null] : (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) ) )? (otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) ) )? otherlv_10= 'author' ( ( ruleEString ) ) (otherlv_12= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_14= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? ) ;
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

        Enumerator lv_verificationRequirement_7_0 = null;

        AntlrDatatypeRuleToken lv_uniquePerAuthorTarget_9_0 = null;

        EObject lv_policy_17_0 = null;

        EObject lv_rating_19_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:1805:2: ( (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) ) )? (otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) ) )? otherlv_10= 'author' ( ( ruleEString ) ) (otherlv_12= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_14= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? ) )
            // InternalRefDsl.g:1806:2: (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) ) )? (otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) ) )? otherlv_10= 'author' ( ( ruleEString ) ) (otherlv_12= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_14= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? )
            {
            // InternalRefDsl.g:1806:2: (otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) ) )? (otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) ) )? otherlv_10= 'author' ( ( ruleEString ) ) (otherlv_12= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_14= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )? )
            // InternalRefDsl.g:1807:3: otherlv_0= 'FeedbackDefinition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )? (otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) ) )? (otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) ) )? otherlv_10= 'author' ( ( ruleEString ) ) (otherlv_12= 'subjectResource' ( ( ruleEString ) ) )? (otherlv_14= 'subjectFeedback' ( ( ruleEString ) ) )? (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )? (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackDefinitionAccess().getFeedbackDefinitionKeyword_0());
            		
            // InternalRefDsl.g:1811:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:1812:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:1812:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:1813:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_2=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackDefinitionAccess().getTypeKeyword_2());
            		
            // InternalRefDsl.g:1834:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1835:4: ( ruleEString )
            {
            // InternalRefDsl.g:1835:4: ( ruleEString )
            // InternalRefDsl.g:1836:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getTypeFeedbackTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_64);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1850:3: (otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRefDsl.g:1851:4: otherlv_4= 'requiresVerifiedContext' ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedbackDefinitionAccess().getRequiresVerifiedContextKeyword_4_0());
                    			
                    // InternalRefDsl.g:1855:4: ( (lv_requiresVerifiedContext_5_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1856:5: (lv_requiresVerifiedContext_5_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1856:5: (lv_requiresVerifiedContext_5_0= ruleEBoolean )
                    // InternalRefDsl.g:1857:6: lv_requiresVerifiedContext_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getRequiresVerifiedContextEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalRefDsl.g:1875:3: (otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRefDsl.g:1876:4: otherlv_6= 'verificationRequirement' ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_66); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackDefinitionAccess().getVerificationRequirementKeyword_5_0());
                    			
                    // InternalRefDsl.g:1880:4: ( (lv_verificationRequirement_7_0= ruleVerificationRequirement ) )
                    // InternalRefDsl.g:1881:5: (lv_verificationRequirement_7_0= ruleVerificationRequirement )
                    {
                    // InternalRefDsl.g:1881:5: (lv_verificationRequirement_7_0= ruleVerificationRequirement )
                    // InternalRefDsl.g:1882:6: lv_verificationRequirement_7_0= ruleVerificationRequirement
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getVerificationRequirementVerificationRequirementEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_verificationRequirement_7_0=ruleVerificationRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"verificationRequirement",
                    							lv_verificationRequirement_7_0,
                    							"pt.isep.enorm.refdsl.RefDsl.VerificationRequirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1900:3: (otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRefDsl.g:1901:4: otherlv_8= 'uniquePerAuthorTarget' ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeedbackDefinitionAccess().getUniquePerAuthorTargetKeyword_6_0());
                    			
                    // InternalRefDsl.g:1905:4: ( (lv_uniquePerAuthorTarget_9_0= ruleEBoolean ) )
                    // InternalRefDsl.g:1906:5: (lv_uniquePerAuthorTarget_9_0= ruleEBoolean )
                    {
                    // InternalRefDsl.g:1906:5: (lv_uniquePerAuthorTarget_9_0= ruleEBoolean )
                    // InternalRefDsl.g:1907:6: lv_uniquePerAuthorTarget_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getUniquePerAuthorTargetEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_uniquePerAuthorTarget_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"uniquePerAuthorTarget",
                    							lv_uniquePerAuthorTarget_9_0,
                    							"pt.isep.enorm.refdsl.RefDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getFeedbackDefinitionAccess().getAuthorKeyword_7());
            		
            // InternalRefDsl.g:1929:3: ( ( ruleEString ) )
            // InternalRefDsl.g:1930:4: ( ruleEString )
            {
            // InternalRefDsl.g:1930:4: ( ruleEString )
            // InternalRefDsl.g:1931:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getAuthorUserTypeCrossReference_8_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:1945:3: (otherlv_12= 'subjectResource' ( ( ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRefDsl.g:1946:4: otherlv_12= 'subjectResource' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeedbackDefinitionAccess().getSubjectResourceKeyword_9_0());
                    			
                    // InternalRefDsl.g:1950:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1951:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1951:5: ( ruleEString )
                    // InternalRefDsl.g:1952:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getSubjectResourceResourceTypeCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1967:3: (otherlv_14= 'subjectFeedback' ( ( ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRefDsl.g:1968:4: otherlv_14= 'subjectFeedback' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getFeedbackDefinitionAccess().getSubjectFeedbackKeyword_10_0());
                    			
                    // InternalRefDsl.g:1972:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:1973:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:1973:5: ( ruleEString )
                    // InternalRefDsl.g:1974:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeedbackDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getSubjectFeedbackFeedbackDefinitionCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:1989:3: (otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==63) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRefDsl.g:1990:4: otherlv_16= 'policy' ( (lv_policy_17_0= ruleFeedbackPolicy ) )
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_72); 

                    				newLeafNode(otherlv_16, grammarAccess.getFeedbackDefinitionAccess().getPolicyKeyword_11_0());
                    			
                    // InternalRefDsl.g:1994:4: ( (lv_policy_17_0= ruleFeedbackPolicy ) )
                    // InternalRefDsl.g:1995:5: (lv_policy_17_0= ruleFeedbackPolicy )
                    {
                    // InternalRefDsl.g:1995:5: (lv_policy_17_0= ruleFeedbackPolicy )
                    // InternalRefDsl.g:1996:6: lv_policy_17_0= ruleFeedbackPolicy
                    {

                    						newCompositeNode(grammarAccess.getFeedbackDefinitionAccess().getPolicyFeedbackPolicyParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalRefDsl.g:2014:3: (otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRefDsl.g:2015:4: otherlv_18= 'rating' ( (lv_rating_19_0= ruleRatingPolicy ) )
                    {
                    otherlv_18=(Token)match(input,64,FOLLOW_74); 

                    				newLeafNode(otherlv_18, grammarAccess.getFeedbackDefinitionAccess().getRatingKeyword_12_0());
                    			
                    // InternalRefDsl.g:2019:4: ( (lv_rating_19_0= ruleRatingPolicy ) )
                    // InternalRefDsl.g:2020:5: (lv_rating_19_0= ruleRatingPolicy )
                    {
                    // InternalRefDsl.g:2020:5: (lv_rating_19_0= ruleRatingPolicy )
                    // InternalRefDsl.g:2021:6: lv_rating_19_0= ruleRatingPolicy
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
    // InternalRefDsl.g:2043:1: entryRuleFeedbackPolicy returns [EObject current=null] : iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF ;
    public final EObject entryRuleFeedbackPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackPolicy = null;


        try {
            // InternalRefDsl.g:2043:55: (iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF )
            // InternalRefDsl.g:2044:2: iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF
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
    // InternalRefDsl.g:2050:1: ruleFeedbackPolicy returns [EObject current=null] : (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? ) ;
    public final EObject ruleFeedbackPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2056:2: ( (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? ) )
            // InternalRefDsl.g:2057:2: (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? )
            {
            // InternalRefDsl.g:2057:2: (otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )? )
            // InternalRefDsl.g:2058:3: otherlv_0= 'FeedbackPolicy' (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_75); 

            			newLeafNode(otherlv_0, grammarAccess.getFeedbackPolicyAccess().getFeedbackPolicyKeyword_0());
            		
            // InternalRefDsl.g:2062:3: (otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRefDsl.g:2063:4: otherlv_1= 'status' ( (lv_status_2_0= ruleFeedbackStatus ) )
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_76); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeedbackPolicyAccess().getStatusKeyword_1_0());
                    			
                    // InternalRefDsl.g:2067:4: ( (lv_status_2_0= ruleFeedbackStatus ) )
                    // InternalRefDsl.g:2068:5: (lv_status_2_0= ruleFeedbackStatus )
                    {
                    // InternalRefDsl.g:2068:5: (lv_status_2_0= ruleFeedbackStatus )
                    // InternalRefDsl.g:2069:6: lv_status_2_0= ruleFeedbackStatus
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
    // InternalRefDsl.g:2091:1: entryRuleRatingPolicy returns [EObject current=null] : iv_ruleRatingPolicy= ruleRatingPolicy EOF ;
    public final EObject entryRuleRatingPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingPolicy = null;


        try {
            // InternalRefDsl.g:2091:53: (iv_ruleRatingPolicy= ruleRatingPolicy EOF )
            // InternalRefDsl.g:2092:2: iv_ruleRatingPolicy= ruleRatingPolicy EOF
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
    // InternalRefDsl.g:2098:1: ruleRatingPolicy returns [EObject current=null] : (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleRatingPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_minValue_2_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_4_0 = null;

        AntlrDatatypeRuleToken lv_step_6_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2104:2: ( (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? ) )
            // InternalRefDsl.g:2105:2: (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? )
            {
            // InternalRefDsl.g:2105:2: (otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )? )
            // InternalRefDsl.g:2106:3: otherlv_0= 'RatingPolicy' otherlv_1= 'min' ( (lv_minValue_2_0= ruleEDouble ) ) otherlv_3= 'max' ( (lv_maxValue_4_0= ruleEDouble ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getRatingPolicyAccess().getRatingPolicyKeyword_0());
            		
            otherlv_1=(Token)match(input,68,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingPolicyAccess().getMinKeyword_1());
            		
            // InternalRefDsl.g:2114:3: ( (lv_minValue_2_0= ruleEDouble ) )
            // InternalRefDsl.g:2115:4: (lv_minValue_2_0= ruleEDouble )
            {
            // InternalRefDsl.g:2115:4: (lv_minValue_2_0= ruleEDouble )
            // InternalRefDsl.g:2116:5: lv_minValue_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRatingPolicyAccess().getMinValueEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_79);
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

            otherlv_3=(Token)match(input,69,FOLLOW_78); 

            			newLeafNode(otherlv_3, grammarAccess.getRatingPolicyAccess().getMaxKeyword_3());
            		
            // InternalRefDsl.g:2137:3: ( (lv_maxValue_4_0= ruleEDouble ) )
            // InternalRefDsl.g:2138:4: (lv_maxValue_4_0= ruleEDouble )
            {
            // InternalRefDsl.g:2138:4: (lv_maxValue_4_0= ruleEDouble )
            // InternalRefDsl.g:2139:5: lv_maxValue_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRatingPolicyAccess().getMaxValueEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_80);
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

            // InternalRefDsl.g:2156:3: (otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==70) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRefDsl.g:2157:4: otherlv_5= 'step' ( (lv_step_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_78); 

                    				newLeafNode(otherlv_5, grammarAccess.getRatingPolicyAccess().getStepKeyword_5_0());
                    			
                    // InternalRefDsl.g:2161:4: ( (lv_step_6_0= ruleEDouble ) )
                    // InternalRefDsl.g:2162:5: (lv_step_6_0= ruleEDouble )
                    {
                    // InternalRefDsl.g:2162:5: (lv_step_6_0= ruleEDouble )
                    // InternalRefDsl.g:2163:6: lv_step_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRatingPolicyAccess().getStepEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
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
    // InternalRefDsl.g:2185:1: entryRuleValidationRule returns [EObject current=null] : iv_ruleValidationRule= ruleValidationRule EOF ;
    public final EObject entryRuleValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationRule = null;


        try {
            // InternalRefDsl.g:2185:55: (iv_ruleValidationRule= ruleValidationRule EOF )
            // InternalRefDsl.g:2186:2: iv_ruleValidationRule= ruleValidationRule EOF
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
    // InternalRefDsl.g:2192:1: ruleValidationRule returns [EObject current=null] : (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) ) ;
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
            // InternalRefDsl.g:2198:2: ( (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) ) )
            // InternalRefDsl.g:2199:2: (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) )
            {
            // InternalRefDsl.g:2199:2: (otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) ) )
            // InternalRefDsl.g:2200:3: otherlv_0= 'ValidationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'kind' ( (lv_kind_4_0= ruleValidationKind ) ) (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )? (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )? (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )? (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )? otherlv_15= 'invokedBy' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_81); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationRuleAccess().getValidationRuleKeyword_0());
            		
            // InternalRefDsl.g:2204:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==72) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRefDsl.g:2205:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getValidationRuleAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:2209:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:2210:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:2210:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:2211:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            otherlv_3=(Token)match(input,30,FOLLOW_82); 

            			newLeafNode(otherlv_3, grammarAccess.getValidationRuleAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:2233:3: ( (lv_kind_4_0= ruleValidationKind ) )
            // InternalRefDsl.g:2234:4: (lv_kind_4_0= ruleValidationKind )
            {
            // InternalRefDsl.g:2234:4: (lv_kind_4_0= ruleValidationKind )
            // InternalRefDsl.g:2235:5: lv_kind_4_0= ruleValidationKind
            {

            					newCompositeNode(grammarAccess.getValidationRuleAccess().getKindValidationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_83);
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

            // InternalRefDsl.g:2252:3: (otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==73) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRefDsl.g:2253:4: otherlv_5= 'severity' ( (lv_severity_6_0= ruleRuleSeverity ) )
                    {
                    otherlv_5=(Token)match(input,73,FOLLOW_84); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidationRuleAccess().getSeverityKeyword_4_0());
                    			
                    // InternalRefDsl.g:2257:4: ( (lv_severity_6_0= ruleRuleSeverity ) )
                    // InternalRefDsl.g:2258:5: (lv_severity_6_0= ruleRuleSeverity )
                    {
                    // InternalRefDsl.g:2258:5: (lv_severity_6_0= ruleRuleSeverity )
                    // InternalRefDsl.g:2259:6: lv_severity_6_0= ruleRuleSeverity
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getSeverityRuleSeverityEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_85);
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

            // InternalRefDsl.g:2277:3: (otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==74) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRefDsl.g:2278:4: otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getValidationRuleAccess().getExpressionKeyword_5_0());
                    			
                    // InternalRefDsl.g:2282:4: ( (lv_expression_8_0= ruleEString ) )
                    // InternalRefDsl.g:2283:5: (lv_expression_8_0= ruleEString )
                    {
                    // InternalRefDsl.g:2283:5: (lv_expression_8_0= ruleEString )
                    // InternalRefDsl.g:2284:6: lv_expression_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getExpressionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_86);
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

            // InternalRefDsl.g:2302:3: (otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==75) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRefDsl.g:2303:4: otherlv_9= 'implementationId' ( (lv_implementationId_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getValidationRuleAccess().getImplementationIdKeyword_6_0());
                    			
                    // InternalRefDsl.g:2307:4: ( (lv_implementationId_10_0= ruleEString ) )
                    // InternalRefDsl.g:2308:5: (lv_implementationId_10_0= ruleEString )
                    {
                    // InternalRefDsl.g:2308:5: (lv_implementationId_10_0= ruleEString )
                    // InternalRefDsl.g:2309:6: lv_implementationId_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getImplementationIdEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_87);
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

            // InternalRefDsl.g:2327:3: (otherlv_11= 'appliesToResource' ( ( ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==76) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRefDsl.g:2328:4: otherlv_11= 'appliesToResource' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getValidationRuleAccess().getAppliesToResourceKeyword_7_0());
                    			
                    // InternalRefDsl.g:2332:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2333:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2333:5: ( ruleEString )
                    // InternalRefDsl.g:2334:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getAppliesToResourceResourceTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2349:3: (otherlv_13= 'appliesToFeedback' ( ( ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==77) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRefDsl.g:2350:4: otherlv_13= 'appliesToFeedback' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getValidationRuleAccess().getAppliesToFeedbackKeyword_8_0());
                    			
                    // InternalRefDsl.g:2354:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2355:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2355:5: ( ruleEString )
                    // InternalRefDsl.g:2356:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidationRuleAccess().getAppliesToFeedbackFeedbackDefinitionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_89);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getValidationRuleAccess().getInvokedByKeyword_9());
            		
            // InternalRefDsl.g:2375:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2376:4: ( ruleEString )
            {
            // InternalRefDsl.g:2376:4: ( ruleEString )
            // InternalRefDsl.g:2377:5: ruleEString
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
    // InternalRefDsl.g:2395:1: entryRuleModerationPolicy returns [EObject current=null] : iv_ruleModerationPolicy= ruleModerationPolicy EOF ;
    public final EObject entryRuleModerationPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModerationPolicy = null;


        try {
            // InternalRefDsl.g:2395:57: (iv_ruleModerationPolicy= ruleModerationPolicy EOF )
            // InternalRefDsl.g:2396:2: iv_ruleModerationPolicy= ruleModerationPolicy EOF
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
    // InternalRefDsl.g:2402:1: ruleModerationPolicy returns [EObject current=null] : (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? ) ;
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

        Enumerator lv_trigger_6_0 = null;

        Enumerator lv_decision_8_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2408:2: ( (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? ) )
            // InternalRefDsl.g:2409:2: (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? )
            {
            // InternalRefDsl.g:2409:2: (otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )? )
            // InternalRefDsl.g:2410:3: otherlv_0= 'ModerationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleModerationMode ) ) (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) ) )? (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )? otherlv_9= 'monitorsResource' ( ( ruleEString ) ) otherlv_11= 'monitorsFeedback' ( ( ruleEString ) ) otherlv_13= 'executedBy' ( ( ruleEString ) ) (otherlv_15= 'inContext' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,79,FOLLOW_90); 

            			newLeafNode(otherlv_0, grammarAccess.getModerationPolicyAccess().getModerationPolicyKeyword_0());
            		
            // InternalRefDsl.g:2414:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==72) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRefDsl.g:2415:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getModerationPolicyAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:2419:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:2420:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:2420:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:2421:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_91);
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

            otherlv_3=(Token)match(input,80,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getModerationPolicyAccess().getModeKeyword_2());
            		
            // InternalRefDsl.g:2443:3: ( (lv_mode_4_0= ruleModerationMode ) )
            // InternalRefDsl.g:2444:4: (lv_mode_4_0= ruleModerationMode )
            {
            // InternalRefDsl.g:2444:4: (lv_mode_4_0= ruleModerationMode )
            // InternalRefDsl.g:2445:5: lv_mode_4_0= ruleModerationMode
            {

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getModeModerationModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_93);
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

            // InternalRefDsl.g:2462:3: (otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==81) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRefDsl.g:2463:4: otherlv_5= 'trigger' ( (lv_trigger_6_0= ruleTriggerEvent ) )
                    {
                    otherlv_5=(Token)match(input,81,FOLLOW_94); 

                    				newLeafNode(otherlv_5, grammarAccess.getModerationPolicyAccess().getTriggerKeyword_4_0());
                    			
                    // InternalRefDsl.g:2467:4: ( (lv_trigger_6_0= ruleTriggerEvent ) )
                    // InternalRefDsl.g:2468:5: (lv_trigger_6_0= ruleTriggerEvent )
                    {
                    // InternalRefDsl.g:2468:5: (lv_trigger_6_0= ruleTriggerEvent )
                    // InternalRefDsl.g:2469:6: lv_trigger_6_0= ruleTriggerEvent
                    {

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getTriggerTriggerEventEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_trigger_6_0=ruleTriggerEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModerationPolicyRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_6_0,
                    							"pt.isep.enorm.refdsl.RefDsl.TriggerEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2487:3: (otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==82) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRefDsl.g:2488:4: otherlv_7= 'decision' ( (lv_decision_8_0= ruleModerationDecision ) )
                    {
                    otherlv_7=(Token)match(input,82,FOLLOW_96); 

                    				newLeafNode(otherlv_7, grammarAccess.getModerationPolicyAccess().getDecisionKeyword_5_0());
                    			
                    // InternalRefDsl.g:2492:4: ( (lv_decision_8_0= ruleModerationDecision ) )
                    // InternalRefDsl.g:2493:5: (lv_decision_8_0= ruleModerationDecision )
                    {
                    // InternalRefDsl.g:2493:5: (lv_decision_8_0= ruleModerationDecision )
                    // InternalRefDsl.g:2494:6: lv_decision_8_0= ruleModerationDecision
                    {

                    						newCompositeNode(grammarAccess.getModerationPolicyAccess().getDecisionModerationDecisionEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_97);
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

            otherlv_9=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getModerationPolicyAccess().getMonitorsResourceKeyword_6());
            		
            // InternalRefDsl.g:2516:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2517:4: ( ruleEString )
            {
            // InternalRefDsl.g:2517:4: ( ruleEString )
            // InternalRefDsl.g:2518:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getMonitorsResourceResourceTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_98);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getModerationPolicyAccess().getMonitorsFeedbackKeyword_8());
            		
            // InternalRefDsl.g:2536:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2537:4: ( ruleEString )
            {
            // InternalRefDsl.g:2537:4: ( ruleEString )
            // InternalRefDsl.g:2538:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getMonitorsFeedbackFeedbackDefinitionCrossReference_9_0());
            				
            pushFollow(FOLLOW_99);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getModerationPolicyAccess().getExecutedByKeyword_10());
            		
            // InternalRefDsl.g:2556:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2557:4: ( ruleEString )
            {
            // InternalRefDsl.g:2557:4: ( ruleEString )
            // InternalRefDsl.g:2558:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationPolicyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationPolicyAccess().getExecutedByUserTypeCrossReference_11_0());
            				
            pushFollow(FOLLOW_100);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2572:3: (otherlv_15= 'inContext' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==86) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRefDsl.g:2573:4: otherlv_15= 'inContext' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,86,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getModerationPolicyAccess().getInContextKeyword_12_0());
                    			
                    // InternalRefDsl.g:2577:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2578:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2578:5: ( ruleEString )
                    // InternalRefDsl.g:2579:6: ruleEString
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
    // InternalRefDsl.g:2598:1: entryRuleAuthorizationRule returns [EObject current=null] : iv_ruleAuthorizationRule= ruleAuthorizationRule EOF ;
    public final EObject entryRuleAuthorizationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorizationRule = null;


        try {
            // InternalRefDsl.g:2598:58: (iv_ruleAuthorizationRule= ruleAuthorizationRule EOF )
            // InternalRefDsl.g:2599:2: iv_ruleAuthorizationRule= ruleAuthorizationRule EOF
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
    // InternalRefDsl.g:2605:1: ruleAuthorizationRule returns [EObject current=null] : (otherlv_0= 'AuthorizationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'allowedAction' ( (lv_allowedAction_4_0= ruleActionKind ) ) otherlv_5= 'actor' ( ( ruleEString ) ) (otherlv_7= 'context' ( ( ruleEString ) ) )? otherlv_9= 'resourceTarget' ( ( ruleEString ) ) (otherlv_11= 'feedbackTarget' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleAuthorizationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_allowedAction_4_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2611:2: ( (otherlv_0= 'AuthorizationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'allowedAction' ( (lv_allowedAction_4_0= ruleActionKind ) ) otherlv_5= 'actor' ( ( ruleEString ) ) (otherlv_7= 'context' ( ( ruleEString ) ) )? otherlv_9= 'resourceTarget' ( ( ruleEString ) ) (otherlv_11= 'feedbackTarget' ( ( ruleEString ) ) )? ) )
            // InternalRefDsl.g:2612:2: (otherlv_0= 'AuthorizationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'allowedAction' ( (lv_allowedAction_4_0= ruleActionKind ) ) otherlv_5= 'actor' ( ( ruleEString ) ) (otherlv_7= 'context' ( ( ruleEString ) ) )? otherlv_9= 'resourceTarget' ( ( ruleEString ) ) (otherlv_11= 'feedbackTarget' ( ( ruleEString ) ) )? )
            {
            // InternalRefDsl.g:2612:2: (otherlv_0= 'AuthorizationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'allowedAction' ( (lv_allowedAction_4_0= ruleActionKind ) ) otherlv_5= 'actor' ( ( ruleEString ) ) (otherlv_7= 'context' ( ( ruleEString ) ) )? otherlv_9= 'resourceTarget' ( ( ruleEString ) ) (otherlv_11= 'feedbackTarget' ( ( ruleEString ) ) )? )
            // InternalRefDsl.g:2613:3: otherlv_0= 'AuthorizationRule' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'allowedAction' ( (lv_allowedAction_4_0= ruleActionKind ) ) otherlv_5= 'actor' ( ( ruleEString ) ) (otherlv_7= 'context' ( ( ruleEString ) ) )? otherlv_9= 'resourceTarget' ( ( ruleEString ) ) (otherlv_11= 'feedbackTarget' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,87,FOLLOW_101); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorizationRuleAccess().getAuthorizationRuleKeyword_0());
            		
            // InternalRefDsl.g:2617:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==72) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRefDsl.g:2618:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthorizationRuleAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:2622:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:2623:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:2623:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:2624:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthorizationRuleRule());
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

            otherlv_3=(Token)match(input,88,FOLLOW_103); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthorizationRuleAccess().getAllowedActionKeyword_2());
            		
            // InternalRefDsl.g:2646:3: ( (lv_allowedAction_4_0= ruleActionKind ) )
            // InternalRefDsl.g:2647:4: (lv_allowedAction_4_0= ruleActionKind )
            {
            // InternalRefDsl.g:2647:4: (lv_allowedAction_4_0= ruleActionKind )
            // InternalRefDsl.g:2648:5: lv_allowedAction_4_0= ruleActionKind
            {

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getAllowedActionActionKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_104);
            lv_allowedAction_4_0=ruleActionKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthorizationRuleRule());
            					}
            					set(
            						current,
            						"allowedAction",
            						lv_allowedAction_4_0,
            						"pt.isep.enorm.refdsl.RefDsl.ActionKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAuthorizationRuleAccess().getActorKeyword_4());
            		
            // InternalRefDsl.g:2669:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2670:4: ( ruleEString )
            {
            // InternalRefDsl.g:2670:4: ( ruleEString )
            // InternalRefDsl.g:2671:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorizationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getActorUserTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_105);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2685:3: (otherlv_7= 'context' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==90) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRefDsl.g:2686:4: otherlv_7= 'context' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAuthorizationRuleAccess().getContextKeyword_6_0());
                    			
                    // InternalRefDsl.g:2690:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2691:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2691:5: ( ruleEString )
                    // InternalRefDsl.g:2692:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorizationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getContextContextTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getAuthorizationRuleAccess().getResourceTargetKeyword_7());
            		
            // InternalRefDsl.g:2711:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2712:4: ( ruleEString )
            {
            // InternalRefDsl.g:2712:4: ( ruleEString )
            // InternalRefDsl.g:2713:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorizationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getResourceTargetResourceTypeCrossReference_8_0());
            				
            pushFollow(FOLLOW_107);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2727:3: (otherlv_11= 'feedbackTarget' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==92) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRefDsl.g:2728:4: otherlv_11= 'feedbackTarget' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,92,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAuthorizationRuleAccess().getFeedbackTargetKeyword_9_0());
                    			
                    // InternalRefDsl.g:2732:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2733:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2733:5: ( ruleEString )
                    // InternalRefDsl.g:2734:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorizationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAuthorizationRuleAccess().getFeedbackTargetFeedbackDefinitionCrossReference_9_1_0());
                    					
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
    // InternalRefDsl.g:2753:1: entryRuleAutomationRule returns [EObject current=null] : iv_ruleAutomationRule= ruleAutomationRule EOF ;
    public final EObject entryRuleAutomationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomationRule = null;


        try {
            // InternalRefDsl.g:2753:55: (iv_ruleAutomationRule= ruleAutomationRule EOF )
            // InternalRefDsl.g:2754:2: iv_ruleAutomationRule= ruleAutomationRule EOF
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
    // InternalRefDsl.g:2760:1: ruleAutomationRule returns [EObject current=null] : (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleTriggerEvent ) ) (otherlv_4= 'context' ( ( ruleEString ) ) )? (otherlv_6= 'inContext' ( ( ruleEString ) ) )? otherlv_8= 'onFeedback' ( ( ruleEString ) ) otherlv_10= 'uses' ( ( ruleEString ) ) (otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= 'conditions' otherlv_19= '{' ( (lv_conditions_20_0= ruleCondition ) ) (otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) ) )* otherlv_23= '}' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= ruleAction ) ) (otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) ) )* otherlv_29= '}' ) ;
    public final EObject ruleAutomationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_trigger_3_0 = null;

        EObject lv_conditions_20_0 = null;

        EObject lv_conditions_22_0 = null;

        EObject lv_actions_26_0 = null;

        EObject lv_actions_28_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:2766:2: ( (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleTriggerEvent ) ) (otherlv_4= 'context' ( ( ruleEString ) ) )? (otherlv_6= 'inContext' ( ( ruleEString ) ) )? otherlv_8= 'onFeedback' ( ( ruleEString ) ) otherlv_10= 'uses' ( ( ruleEString ) ) (otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= 'conditions' otherlv_19= '{' ( (lv_conditions_20_0= ruleCondition ) ) (otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) ) )* otherlv_23= '}' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= ruleAction ) ) (otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) ) )* otherlv_29= '}' ) )
            // InternalRefDsl.g:2767:2: (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleTriggerEvent ) ) (otherlv_4= 'context' ( ( ruleEString ) ) )? (otherlv_6= 'inContext' ( ( ruleEString ) ) )? otherlv_8= 'onFeedback' ( ( ruleEString ) ) otherlv_10= 'uses' ( ( ruleEString ) ) (otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= 'conditions' otherlv_19= '{' ( (lv_conditions_20_0= ruleCondition ) ) (otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) ) )* otherlv_23= '}' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= ruleAction ) ) (otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) ) )* otherlv_29= '}' )
            {
            // InternalRefDsl.g:2767:2: (otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleTriggerEvent ) ) (otherlv_4= 'context' ( ( ruleEString ) ) )? (otherlv_6= 'inContext' ( ( ruleEString ) ) )? otherlv_8= 'onFeedback' ( ( ruleEString ) ) otherlv_10= 'uses' ( ( ruleEString ) ) (otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= 'conditions' otherlv_19= '{' ( (lv_conditions_20_0= ruleCondition ) ) (otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) ) )* otherlv_23= '}' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= ruleAction ) ) (otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) ) )* otherlv_29= '}' )
            // InternalRefDsl.g:2768:3: otherlv_0= 'AutomationRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleTriggerEvent ) ) (otherlv_4= 'context' ( ( ruleEString ) ) )? (otherlv_6= 'inContext' ( ( ruleEString ) ) )? otherlv_8= 'onFeedback' ( ( ruleEString ) ) otherlv_10= 'uses' ( ( ruleEString ) ) (otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= 'conditions' otherlv_19= '{' ( (lv_conditions_20_0= ruleCondition ) ) (otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) ) )* otherlv_23= '}' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= ruleAction ) ) (otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) ) )* otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomationRuleAccess().getAutomationRuleKeyword_0());
            		
            // InternalRefDsl.g:2772:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:2773:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:2773:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:2774:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_108);
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

            otherlv_2=(Token)match(input,81,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomationRuleAccess().getTriggerKeyword_2());
            		
            // InternalRefDsl.g:2795:3: ( (lv_trigger_3_0= ruleTriggerEvent ) )
            // InternalRefDsl.g:2796:4: (lv_trigger_3_0= ruleTriggerEvent )
            {
            // InternalRefDsl.g:2796:4: (lv_trigger_3_0= ruleTriggerEvent )
            // InternalRefDsl.g:2797:5: lv_trigger_3_0= ruleTriggerEvent
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getTriggerTriggerEventEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_109);
            lv_trigger_3_0=ruleTriggerEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.TriggerEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2814:3: (otherlv_4= 'context' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==90) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRefDsl.g:2815:4: otherlv_4= 'context' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAutomationRuleAccess().getContextKeyword_4_0());
                    			
                    // InternalRefDsl.g:2819:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2820:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2820:5: ( ruleEString )
                    // InternalRefDsl.g:2821:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutomationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getContextResourceTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_110);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:2836:3: (otherlv_6= 'inContext' ( ( ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==86) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRefDsl.g:2837:4: otherlv_6= 'inContext' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,86,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAutomationRuleAccess().getInContextKeyword_5_0());
                    			
                    // InternalRefDsl.g:2841:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2842:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2842:5: ( ruleEString )
                    // InternalRefDsl.g:2843:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutomationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getInContextContextTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_111);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAutomationRuleAccess().getOnFeedbackKeyword_6());
            		
            // InternalRefDsl.g:2862:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2863:4: ( ruleEString )
            {
            // InternalRefDsl.g:2863:4: ( ruleEString )
            // InternalRefDsl.g:2864:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getOnFeedbackFeedbackDefinitionCrossReference_7_0());
            				
            pushFollow(FOLLOW_112);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getAutomationRuleAccess().getUsesKeyword_8());
            		
            // InternalRefDsl.g:2882:3: ( ( ruleEString ) )
            // InternalRefDsl.g:2883:4: ( ruleEString )
            {
            // InternalRefDsl.g:2883:4: ( ruleEString )
            // InternalRefDsl.g:2884:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getUsesValidationRuleCrossReference_9_0());
            				
            pushFollow(FOLLOW_113);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2898:3: (otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==96) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRefDsl.g:2899:4: otherlv_12= 'invokedValidationRules' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,96,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getAutomationRuleAccess().getInvokedValidationRulesKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAutomationRuleAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalRefDsl.g:2907:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:2908:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:2908:5: ( ruleEString )
                    // InternalRefDsl.g:2909:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutomationRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getInvokedValidationRulesValidationRuleCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:2923:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==16) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalRefDsl.g:2924:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAutomationRuleAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRefDsl.g:2928:5: ( ( ruleEString ) )
                    	    // InternalRefDsl.g:2929:6: ( ruleEString )
                    	    {
                    	    // InternalRefDsl.g:2929:6: ( ruleEString )
                    	    // InternalRefDsl.g:2930:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAutomationRuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAutomationRuleAccess().getInvokedValidationRulesValidationRuleCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,33,FOLLOW_114); 

                    				newLeafNode(otherlv_17, grammarAccess.getAutomationRuleAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,97,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getAutomationRuleAccess().getConditionsKeyword_11());
            		
            otherlv_19=(Token)match(input,14,FOLLOW_115); 

            			newLeafNode(otherlv_19, grammarAccess.getAutomationRuleAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalRefDsl.g:2958:3: ( (lv_conditions_20_0= ruleCondition ) )
            // InternalRefDsl.g:2959:4: (lv_conditions_20_0= ruleCondition )
            {
            // InternalRefDsl.g:2959:4: (lv_conditions_20_0= ruleCondition )
            // InternalRefDsl.g:2960:5: lv_conditions_20_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getConditionsConditionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_conditions_20_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_20_0,
            						"pt.isep.enorm.refdsl.RefDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:2977:3: (otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==16) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalRefDsl.g:2978:4: otherlv_21= ',' ( (lv_conditions_22_0= ruleCondition ) )
            	    {
            	    otherlv_21=(Token)match(input,16,FOLLOW_115); 

            	    				newLeafNode(otherlv_21, grammarAccess.getAutomationRuleAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalRefDsl.g:2982:4: ( (lv_conditions_22_0= ruleCondition ) )
            	    // InternalRefDsl.g:2983:5: (lv_conditions_22_0= ruleCondition )
            	    {
            	    // InternalRefDsl.g:2983:5: (lv_conditions_22_0= ruleCondition )
            	    // InternalRefDsl.g:2984:6: lv_conditions_22_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getConditionsConditionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_conditions_22_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_22_0,
            	    							"pt.isep.enorm.refdsl.RefDsl.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_23=(Token)match(input,17,FOLLOW_116); 

            			newLeafNode(otherlv_23, grammarAccess.getAutomationRuleAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_24=(Token)match(input,98,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getAutomationRuleAccess().getActionsKeyword_16());
            		
            otherlv_25=(Token)match(input,14,FOLLOW_117); 

            			newLeafNode(otherlv_25, grammarAccess.getAutomationRuleAccess().getLeftCurlyBracketKeyword_17());
            		
            // InternalRefDsl.g:3014:3: ( (lv_actions_26_0= ruleAction ) )
            // InternalRefDsl.g:3015:4: (lv_actions_26_0= ruleAction )
            {
            // InternalRefDsl.g:3015:4: (lv_actions_26_0= ruleAction )
            // InternalRefDsl.g:3016:5: lv_actions_26_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_9);
            lv_actions_26_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_26_0,
            						"pt.isep.enorm.refdsl.RefDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:3033:3: (otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==16) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalRefDsl.g:3034:4: otherlv_27= ',' ( (lv_actions_28_0= ruleAction ) )
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_117); 

            	    				newLeafNode(otherlv_27, grammarAccess.getAutomationRuleAccess().getCommaKeyword_19_0());
            	    			
            	    // InternalRefDsl.g:3038:4: ( (lv_actions_28_0= ruleAction ) )
            	    // InternalRefDsl.g:3039:5: (lv_actions_28_0= ruleAction )
            	    {
            	    // InternalRefDsl.g:3039:5: (lv_actions_28_0= ruleAction )
            	    // InternalRefDsl.g:3040:6: lv_actions_28_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_19_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_actions_28_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_28_0,
            	    							"pt.isep.enorm.refdsl.RefDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getAutomationRuleAccess().getRightCurlyBracketKeyword_20());
            		

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


    // $ANTLR start "entryRuleCondition"
    // InternalRefDsl.g:3066:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRefDsl.g:3066:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRefDsl.g:3067:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalRefDsl.g:3073:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'operator' ( (lv_operator_3_0= ruleConditionOperator ) ) otherlv_4= 'attribute' ( ( ruleEString ) ) (otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_children_8_0 = null;

        EObject lv_children_10_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:3079:2: ( (otherlv_0= 'Condition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'operator' ( (lv_operator_3_0= ruleConditionOperator ) ) otherlv_4= 'attribute' ( ( ruleEString ) ) (otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}' )? ) )
            // InternalRefDsl.g:3080:2: (otherlv_0= 'Condition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'operator' ( (lv_operator_3_0= ruleConditionOperator ) ) otherlv_4= 'attribute' ( ( ruleEString ) ) (otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}' )? )
            {
            // InternalRefDsl.g:3080:2: (otherlv_0= 'Condition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'operator' ( (lv_operator_3_0= ruleConditionOperator ) ) otherlv_4= 'attribute' ( ( ruleEString ) ) (otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}' )? )
            // InternalRefDsl.g:3081:3: otherlv_0= 'Condition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'operator' ( (lv_operator_3_0= ruleConditionOperator ) ) otherlv_4= 'attribute' ( ( ruleEString ) ) (otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalRefDsl.g:3085:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:3086:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:3086:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:3087:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_118);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,100,FOLLOW_119); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getOperatorKeyword_2());
            		
            // InternalRefDsl.g:3108:3: ( (lv_operator_3_0= ruleConditionOperator ) )
            // InternalRefDsl.g:3109:4: (lv_operator_3_0= ruleConditionOperator )
            {
            // InternalRefDsl.g:3109:4: (lv_operator_3_0= ruleConditionOperator )
            // InternalRefDsl.g:3110:5: lv_operator_3_0= ruleConditionOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorConditionOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_120);
            lv_operator_3_0=ruleConditionOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.ConditionOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getAttributeKeyword_4());
            		
            // InternalRefDsl.g:3131:3: ( ( ruleEString ) )
            // InternalRefDsl.g:3132:4: ( ruleEString )
            {
            // InternalRefDsl.g:3132:4: ( ruleEString )
            // InternalRefDsl.g:3133:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_5_0());
            				
            pushFollow(FOLLOW_121);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:3147:3: (otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==102) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalRefDsl.g:3148:4: otherlv_6= 'values' otherlv_7= '{' ( (lv_children_8_0= ruleConditionValue ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getValuesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_122); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRefDsl.g:3156:4: ( (lv_children_8_0= ruleConditionValue ) )
                    // InternalRefDsl.g:3157:5: (lv_children_8_0= ruleConditionValue )
                    {
                    // InternalRefDsl.g:3157:5: (lv_children_8_0= ruleConditionValue )
                    // InternalRefDsl.g:3158:6: lv_children_8_0= ruleConditionValue
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getChildrenConditionValueParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_children_8_0=ruleConditionValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_8_0,
                    							"pt.isep.enorm.refdsl.RefDsl.ConditionValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRefDsl.g:3175:4: (otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==16) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalRefDsl.g:3176:5: otherlv_9= ',' ( (lv_children_10_0= ruleConditionValue ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_122); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRefDsl.g:3180:5: ( (lv_children_10_0= ruleConditionValue ) )
                    	    // InternalRefDsl.g:3181:6: (lv_children_10_0= ruleConditionValue )
                    	    {
                    	    // InternalRefDsl.g:3181:6: (lv_children_10_0= ruleConditionValue )
                    	    // InternalRefDsl.g:3182:7: lv_children_10_0= ruleConditionValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getConditionAccess().getChildrenConditionValueParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_children_10_0=ruleConditionValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_10_0,
                    	    								"pt.isep.enorm.refdsl.RefDsl.ConditionValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6_4());
                    			

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionValue"
    // InternalRefDsl.g:3209:1: entryRuleConditionValue returns [EObject current=null] : iv_ruleConditionValue= ruleConditionValue EOF ;
    public final EObject entryRuleConditionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionValue = null;


        try {
            // InternalRefDsl.g:3209:55: (iv_ruleConditionValue= ruleConditionValue EOF )
            // InternalRefDsl.g:3210:2: iv_ruleConditionValue= ruleConditionValue EOF
            {
             newCompositeNode(grammarAccess.getConditionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionValue=ruleConditionValue();

            state._fsp--;

             current =iv_ruleConditionValue; 
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
    // $ANTLR end "entryRuleConditionValue"


    // $ANTLR start "ruleConditionValue"
    // InternalRefDsl.g:3216:1: ruleConditionValue returns [EObject current=null] : (otherlv_0= 'value' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleConditionValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:3222:2: ( (otherlv_0= 'value' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalRefDsl.g:3223:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalRefDsl.g:3223:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleEString ) ) )
            // InternalRefDsl.g:3224:3: otherlv_0= 'value' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionValueAccess().getValueKeyword_0());
            		
            // InternalRefDsl.g:3228:3: ( (lv_value_1_0= ruleEString ) )
            // InternalRefDsl.g:3229:4: (lv_value_1_0= ruleEString )
            {
            // InternalRefDsl.g:3229:4: (lv_value_1_0= ruleEString )
            // InternalRefDsl.g:3230:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionValueAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
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
    // $ANTLR end "ruleConditionValue"


    // $ANTLR start "entryRuleAction"
    // InternalRefDsl.g:3251:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRefDsl.g:3251:47: (iv_ruleAction= ruleAction EOF )
            // InternalRefDsl.g:3252:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRefDsl.g:3258:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleActionResultKind ) ) (otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_message_5_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:3264:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleActionResultKind ) ) (otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) ) )? ) )
            // InternalRefDsl.g:3265:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleActionResultKind ) ) (otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) ) )? )
            {
            // InternalRefDsl.g:3265:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleActionResultKind ) ) (otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) ) )? )
            // InternalRefDsl.g:3266:3: otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'kind' ( (lv_kind_3_0= ruleActionResultKind ) ) (otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalRefDsl.g:3270:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:3271:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:3271:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:3272:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_123); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getKindKeyword_2());
            		
            // InternalRefDsl.g:3293:3: ( (lv_kind_3_0= ruleActionResultKind ) )
            // InternalRefDsl.g:3294:4: (lv_kind_3_0= ruleActionResultKind )
            {
            // InternalRefDsl.g:3294:4: (lv_kind_3_0= ruleActionResultKind )
            // InternalRefDsl.g:3295:5: lv_kind_3_0= ruleActionResultKind
            {

            					newCompositeNode(grammarAccess.getActionAccess().getKindActionResultKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_124);
            lv_kind_3_0=ruleActionResultKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.ActionResultKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:3312:3: (otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==105) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalRefDsl.g:3313:4: otherlv_4= 'message' ( (lv_message_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,105,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getMessageKeyword_4_0());
                    			
                    // InternalRefDsl.g:3317:4: ( (lv_message_5_0= ruleEString ) )
                    // InternalRefDsl.g:3318:5: (lv_message_5_0= ruleEString )
                    {
                    // InternalRefDsl.g:3318:5: (lv_message_5_0= ruleEString )
                    // InternalRefDsl.g:3319:6: lv_message_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getMessageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_message_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_5_0,
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleVerificationPolicy"
    // InternalRefDsl.g:3341:1: entryRuleVerificationPolicy returns [EObject current=null] : iv_ruleVerificationPolicy= ruleVerificationPolicy EOF ;
    public final EObject entryRuleVerificationPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationPolicy = null;


        try {
            // InternalRefDsl.g:3341:59: (iv_ruleVerificationPolicy= ruleVerificationPolicy EOF )
            // InternalRefDsl.g:3342:2: iv_ruleVerificationPolicy= ruleVerificationPolicy EOF
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
    // InternalRefDsl.g:3348:1: ruleVerificationPolicy returns [EObject current=null] : (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleTriggerEvent ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) ) ;
    public final EObject ruleVerificationPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_mode_4_0 = null;

        Enumerator lv_appliesWhen_6_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:3354:2: ( (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleTriggerEvent ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) ) )
            // InternalRefDsl.g:3355:2: (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleTriggerEvent ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) )
            {
            // InternalRefDsl.g:3355:2: (otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleTriggerEvent ) ) otherlv_7= 'verifies' ( ( ruleEString ) ) )
            // InternalRefDsl.g:3356:3: otherlv_0= 'VerificationPolicy' (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )? otherlv_3= 'mode' ( (lv_mode_4_0= ruleValidationKind ) ) otherlv_5= 'appliesWhen' ( (lv_appliesWhen_6_0= ruleTriggerEvent ) ) otherlv_7= 'verifies' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_90); 

            			newLeafNode(otherlv_0, grammarAccess.getVerificationPolicyAccess().getVerificationPolicyKeyword_0());
            		
            // InternalRefDsl.g:3360:3: (otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==72) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalRefDsl.g:3361:4: otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerificationPolicyAccess().getNameKeyword_1_0());
                    			
                    // InternalRefDsl.g:3365:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalRefDsl.g:3366:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalRefDsl.g:3366:5: (lv_name_2_0= ruleEString )
                    // InternalRefDsl.g:3367:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVerificationPolicyAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_91);
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

            otherlv_3=(Token)match(input,80,FOLLOW_82); 

            			newLeafNode(otherlv_3, grammarAccess.getVerificationPolicyAccess().getModeKeyword_2());
            		
            // InternalRefDsl.g:3389:3: ( (lv_mode_4_0= ruleValidationKind ) )
            // InternalRefDsl.g:3390:4: (lv_mode_4_0= ruleValidationKind )
            {
            // InternalRefDsl.g:3390:4: (lv_mode_4_0= ruleValidationKind )
            // InternalRefDsl.g:3391:5: lv_mode_4_0= ruleValidationKind
            {

            					newCompositeNode(grammarAccess.getVerificationPolicyAccess().getModeValidationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_125);
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

            otherlv_5=(Token)match(input,107,FOLLOW_94); 

            			newLeafNode(otherlv_5, grammarAccess.getVerificationPolicyAccess().getAppliesWhenKeyword_4());
            		
            // InternalRefDsl.g:3412:3: ( (lv_appliesWhen_6_0= ruleTriggerEvent ) )
            // InternalRefDsl.g:3413:4: (lv_appliesWhen_6_0= ruleTriggerEvent )
            {
            // InternalRefDsl.g:3413:4: (lv_appliesWhen_6_0= ruleTriggerEvent )
            // InternalRefDsl.g:3414:5: lv_appliesWhen_6_0= ruleTriggerEvent
            {

            					newCompositeNode(grammarAccess.getVerificationPolicyAccess().getAppliesWhenTriggerEventEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_126);
            lv_appliesWhen_6_0=ruleTriggerEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerificationPolicyRule());
            					}
            					set(
            						current,
            						"appliesWhen",
            						lv_appliesWhen_6_0,
            						"pt.isep.enorm.refdsl.RefDsl.TriggerEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVerificationPolicyAccess().getVerifiesKeyword_6());
            		
            // InternalRefDsl.g:3435:3: ( ( ruleEString ) )
            // InternalRefDsl.g:3436:4: ( ruleEString )
            {
            // InternalRefDsl.g:3436:4: ( ruleEString )
            // InternalRefDsl.g:3437:5: ruleEString
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


    // $ANTLR start "entryRuleSortingPolicy"
    // InternalRefDsl.g:3455:1: entryRuleSortingPolicy returns [EObject current=null] : iv_ruleSortingPolicy= ruleSortingPolicy EOF ;
    public final EObject entryRuleSortingPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortingPolicy = null;


        try {
            // InternalRefDsl.g:3455:54: (iv_ruleSortingPolicy= ruleSortingPolicy EOF )
            // InternalRefDsl.g:3456:2: iv_ruleSortingPolicy= ruleSortingPolicy EOF
            {
             newCompositeNode(grammarAccess.getSortingPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSortingPolicy=ruleSortingPolicy();

            state._fsp--;

             current =iv_ruleSortingPolicy; 
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
    // $ANTLR end "entryRuleSortingPolicy"


    // $ANTLR start "ruleSortingPolicy"
    // InternalRefDsl.g:3462:1: ruleSortingPolicy returns [EObject current=null] : (otherlv_0= 'SortingPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'criterion' ( (lv_criterion_3_0= ruleSortCriterion ) ) otherlv_4= 'direction' ( (lv_direction_5_0= ruleSortDirection ) ) (otherlv_6= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_8= 'appliesToFeedback' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleSortingPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_criterion_3_0 = null;

        Enumerator lv_direction_5_0 = null;



        	enterRule();

        try {
            // InternalRefDsl.g:3468:2: ( (otherlv_0= 'SortingPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'criterion' ( (lv_criterion_3_0= ruleSortCriterion ) ) otherlv_4= 'direction' ( (lv_direction_5_0= ruleSortDirection ) ) (otherlv_6= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_8= 'appliesToFeedback' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? ) )
            // InternalRefDsl.g:3469:2: (otherlv_0= 'SortingPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'criterion' ( (lv_criterion_3_0= ruleSortCriterion ) ) otherlv_4= 'direction' ( (lv_direction_5_0= ruleSortDirection ) ) (otherlv_6= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_8= 'appliesToFeedback' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? )
            {
            // InternalRefDsl.g:3469:2: (otherlv_0= 'SortingPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'criterion' ( (lv_criterion_3_0= ruleSortCriterion ) ) otherlv_4= 'direction' ( (lv_direction_5_0= ruleSortDirection ) ) (otherlv_6= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_8= 'appliesToFeedback' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )? )
            // InternalRefDsl.g:3470:3: otherlv_0= 'SortingPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'criterion' ( (lv_criterion_3_0= ruleSortCriterion ) ) otherlv_4= 'direction' ( (lv_direction_5_0= ruleSortDirection ) ) (otherlv_6= 'appliesToResource' ( ( ruleEString ) ) )? (otherlv_8= 'appliesToFeedback' ( ( ruleEString ) ) )? (otherlv_10= 'inContext' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSortingPolicyAccess().getSortingPolicyKeyword_0());
            		
            // InternalRefDsl.g:3474:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRefDsl.g:3475:4: (lv_name_1_0= ruleEString )
            {
            // InternalRefDsl.g:3475:4: (lv_name_1_0= ruleEString )
            // InternalRefDsl.g:3476:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSortingPolicyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_127);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortingPolicyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.enorm.refdsl.RefDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,110,FOLLOW_128); 

            			newLeafNode(otherlv_2, grammarAccess.getSortingPolicyAccess().getCriterionKeyword_2());
            		
            // InternalRefDsl.g:3497:3: ( (lv_criterion_3_0= ruleSortCriterion ) )
            // InternalRefDsl.g:3498:4: (lv_criterion_3_0= ruleSortCriterion )
            {
            // InternalRefDsl.g:3498:4: (lv_criterion_3_0= ruleSortCriterion )
            // InternalRefDsl.g:3499:5: lv_criterion_3_0= ruleSortCriterion
            {

            					newCompositeNode(grammarAccess.getSortingPolicyAccess().getCriterionSortCriterionEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_129);
            lv_criterion_3_0=ruleSortCriterion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortingPolicyRule());
            					}
            					set(
            						current,
            						"criterion",
            						lv_criterion_3_0,
            						"pt.isep.enorm.refdsl.RefDsl.SortCriterion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,111,FOLLOW_130); 

            			newLeafNode(otherlv_4, grammarAccess.getSortingPolicyAccess().getDirectionKeyword_4());
            		
            // InternalRefDsl.g:3520:3: ( (lv_direction_5_0= ruleSortDirection ) )
            // InternalRefDsl.g:3521:4: (lv_direction_5_0= ruleSortDirection )
            {
            // InternalRefDsl.g:3521:4: (lv_direction_5_0= ruleSortDirection )
            // InternalRefDsl.g:3522:5: lv_direction_5_0= ruleSortDirection
            {

            					newCompositeNode(grammarAccess.getSortingPolicyAccess().getDirectionSortDirectionEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_131);
            lv_direction_5_0=ruleSortDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortingPolicyRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_5_0,
            						"pt.isep.enorm.refdsl.RefDsl.SortDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefDsl.g:3539:3: (otherlv_6= 'appliesToResource' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==76) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalRefDsl.g:3540:4: otherlv_6= 'appliesToResource' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSortingPolicyAccess().getAppliesToResourceKeyword_6_0());
                    			
                    // InternalRefDsl.g:3544:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:3545:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:3545:5: ( ruleEString )
                    // InternalRefDsl.g:3546:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSortingPolicyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSortingPolicyAccess().getAppliesToResourceResourceTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:3561:3: (otherlv_8= 'appliesToFeedback' ( ( ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==77) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalRefDsl.g:3562:4: otherlv_8= 'appliesToFeedback' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSortingPolicyAccess().getAppliesToFeedbackKeyword_7_0());
                    			
                    // InternalRefDsl.g:3566:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:3567:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:3567:5: ( ruleEString )
                    // InternalRefDsl.g:3568:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSortingPolicyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSortingPolicyAccess().getAppliesToFeedbackFeedbackDefinitionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_100);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRefDsl.g:3583:3: (otherlv_10= 'inContext' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==86) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalRefDsl.g:3584:4: otherlv_10= 'inContext' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,86,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSortingPolicyAccess().getInContextKeyword_8_0());
                    			
                    // InternalRefDsl.g:3588:4: ( ( ruleEString ) )
                    // InternalRefDsl.g:3589:5: ( ruleEString )
                    {
                    // InternalRefDsl.g:3589:5: ( ruleEString )
                    // InternalRefDsl.g:3590:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSortingPolicyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSortingPolicyAccess().getInContextContextTypeCrossReference_8_1_0());
                    					
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
    // $ANTLR end "ruleSortingPolicy"


    // $ANTLR start "entryRuleEString"
    // InternalRefDsl.g:3609:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRefDsl.g:3609:47: (iv_ruleEString= ruleEString EOF )
            // InternalRefDsl.g:3610:2: iv_ruleEString= ruleEString EOF
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
    // InternalRefDsl.g:3616:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'description' | kw= 'version' ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3622:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'description' | kw= 'version' ) )
            // InternalRefDsl.g:3623:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'description' | kw= 'version' )
            {
            // InternalRefDsl.g:3623:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'description' | kw= 'version' )
            int alt83=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt83=1;
                }
                break;
            case RULE_ID:
                {
                alt83=2;
                }
                break;
            case 13:
                {
                alt83=3;
                }
                break;
            case 12:
                {
                alt83=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalRefDsl.g:3624:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3632:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3640:3: kw= 'description'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEStringAccess().getDescriptionKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3646:3: kw= 'version'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEStringAccess().getVersionKeyword_3());
                    		

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
    // InternalRefDsl.g:3655:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalRefDsl.g:3655:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalRefDsl.g:3656:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalRefDsl.g:3662:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3668:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalRefDsl.g:3669:2: (kw= 'true' | kw= 'false' )
            {
            // InternalRefDsl.g:3669:2: (kw= 'true' | kw= 'false' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==112) ) {
                alt84=1;
            }
            else if ( (LA84_0==113) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalRefDsl.g:3670:3: kw= 'true'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3676:3: kw= 'false'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

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
    // InternalRefDsl.g:3685:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalRefDsl.g:3685:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalRefDsl.g:3686:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalRefDsl.g:3692:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3698:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalRefDsl.g:3699:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalRefDsl.g:3699:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalRefDsl.g:3700:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_133); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
            		
            // InternalRefDsl.g:3707:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==114) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalRefDsl.g:3708:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,114,FOLLOW_78); 

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
    // InternalRefDsl.g:3725:1: ruleUserKind returns [Enumerator current=null] : ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) ) ;
    public final Enumerator ruleUserKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3731:2: ( ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) ) )
            // InternalRefDsl.g:3732:2: ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) )
            {
            // InternalRefDsl.g:3732:2: ( (enumLiteral_0= 'GENERIC' ) | (enumLiteral_1= 'BUYER' ) | (enumLiteral_2= 'SELLER' ) | (enumLiteral_3= 'CREATOR' ) | (enumLiteral_4= 'MODERATOR' ) )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt86=1;
                }
                break;
            case 116:
                {
                alt86=2;
                }
                break;
            case 117:
                {
                alt86=3;
                }
                break;
            case 118:
                {
                alt86=4;
                }
                break;
            case 119:
                {
                alt86=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalRefDsl.g:3733:3: (enumLiteral_0= 'GENERIC' )
                    {
                    // InternalRefDsl.g:3733:3: (enumLiteral_0= 'GENERIC' )
                    // InternalRefDsl.g:3734:4: enumLiteral_0= 'GENERIC'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getGENERICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserKindAccess().getGENERICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3741:3: (enumLiteral_1= 'BUYER' )
                    {
                    // InternalRefDsl.g:3741:3: (enumLiteral_1= 'BUYER' )
                    // InternalRefDsl.g:3742:4: enumLiteral_1= 'BUYER'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getBUYEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUserKindAccess().getBUYEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3749:3: (enumLiteral_2= 'SELLER' )
                    {
                    // InternalRefDsl.g:3749:3: (enumLiteral_2= 'SELLER' )
                    // InternalRefDsl.g:3750:4: enumLiteral_2= 'SELLER'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getSELLEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUserKindAccess().getSELLEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3757:3: (enumLiteral_3= 'CREATOR' )
                    {
                    // InternalRefDsl.g:3757:3: (enumLiteral_3= 'CREATOR' )
                    // InternalRefDsl.g:3758:4: enumLiteral_3= 'CREATOR'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getUserKindAccess().getCREATOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUserKindAccess().getCREATOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3765:3: (enumLiteral_4= 'MODERATOR' )
                    {
                    // InternalRefDsl.g:3765:3: (enumLiteral_4= 'MODERATOR' )
                    // InternalRefDsl.g:3766:4: enumLiteral_4= 'MODERATOR'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); 

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
    // InternalRefDsl.g:3776:1: ruleContextKind returns [Enumerator current=null] : ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) ) ;
    public final Enumerator ruleContextKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3782:2: ( ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) ) )
            // InternalRefDsl.g:3783:2: ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) )
            {
            // InternalRefDsl.g:3783:2: ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'COMMUNITY' ) | (enumLiteral_2= 'CHANNEL' ) | (enumLiteral_3= 'CATALOG' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt87=1;
                }
                break;
            case 121:
                {
                alt87=2;
                }
                break;
            case 122:
                {
                alt87=3;
                }
                break;
            case 123:
                {
                alt87=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalRefDsl.g:3784:3: (enumLiteral_0= 'GLOBAL' )
                    {
                    // InternalRefDsl.g:3784:3: (enumLiteral_0= 'GLOBAL' )
                    // InternalRefDsl.g:3785:4: enumLiteral_0= 'GLOBAL'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getGLOBALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContextKindAccess().getGLOBALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3792:3: (enumLiteral_1= 'COMMUNITY' )
                    {
                    // InternalRefDsl.g:3792:3: (enumLiteral_1= 'COMMUNITY' )
                    // InternalRefDsl.g:3793:4: enumLiteral_1= 'COMMUNITY'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getCOMMUNITYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContextKindAccess().getCOMMUNITYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3800:3: (enumLiteral_2= 'CHANNEL' )
                    {
                    // InternalRefDsl.g:3800:3: (enumLiteral_2= 'CHANNEL' )
                    // InternalRefDsl.g:3801:4: enumLiteral_2= 'CHANNEL'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getContextKindAccess().getCHANNELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getContextKindAccess().getCHANNELEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3808:3: (enumLiteral_3= 'CATALOG' )
                    {
                    // InternalRefDsl.g:3808:3: (enumLiteral_3= 'CATALOG' )
                    // InternalRefDsl.g:3809:4: enumLiteral_3= 'CATALOG'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_2); 

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
    // InternalRefDsl.g:3819:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) ) ;
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
            // InternalRefDsl.g:3825:2: ( ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) ) )
            // InternalRefDsl.g:3826:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) )
            {
            // InternalRefDsl.g:3826:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DATETIME' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'VIDEO' ) | (enumLiteral_7= 'URL' ) )
            int alt88=8;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt88=1;
                }
                break;
            case 125:
                {
                alt88=2;
                }
                break;
            case 126:
                {
                alt88=3;
                }
                break;
            case 127:
                {
                alt88=4;
                }
                break;
            case 128:
                {
                alt88=5;
                }
                break;
            case 129:
                {
                alt88=6;
                }
                break;
            case 130:
                {
                alt88=7;
                }
                break;
            case 131:
                {
                alt88=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalRefDsl.g:3827:3: (enumLiteral_0= 'TEXT' )
                    {
                    // InternalRefDsl.g:3827:3: (enumLiteral_0= 'TEXT' )
                    // InternalRefDsl.g:3828:4: enumLiteral_0= 'TEXT'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getTEXTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3835:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalRefDsl.g:3835:3: (enumLiteral_1= 'NUMBER' )
                    // InternalRefDsl.g:3836:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3843:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalRefDsl.g:3843:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalRefDsl.g:3844:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3851:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalRefDsl.g:3851:3: (enumLiteral_3= 'DATE' )
                    // InternalRefDsl.g:3852:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3859:3: (enumLiteral_4= 'DATETIME' )
                    {
                    // InternalRefDsl.g:3859:3: (enumLiteral_4= 'DATETIME' )
                    // InternalRefDsl.g:3860:4: enumLiteral_4= 'DATETIME'
                    {
                    enumLiteral_4=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDATETIMEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getDATETIMEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:3867:3: (enumLiteral_5= 'IMAGE' )
                    {
                    // InternalRefDsl.g:3867:3: (enumLiteral_5= 'IMAGE' )
                    // InternalRefDsl.g:3868:4: enumLiteral_5= 'IMAGE'
                    {
                    enumLiteral_5=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getIMAGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getIMAGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:3875:3: (enumLiteral_6= 'VIDEO' )
                    {
                    // InternalRefDsl.g:3875:3: (enumLiteral_6= 'VIDEO' )
                    // InternalRefDsl.g:3876:4: enumLiteral_6= 'VIDEO'
                    {
                    enumLiteral_6=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getVIDEOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveTypeAccess().getVIDEOEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:3883:3: (enumLiteral_7= 'URL' )
                    {
                    // InternalRefDsl.g:3883:3: (enumLiteral_7= 'URL' )
                    // InternalRefDsl.g:3884:4: enumLiteral_7= 'URL'
                    {
                    enumLiteral_7=(Token)match(input,131,FOLLOW_2); 

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
    // InternalRefDsl.g:3894:1: ruleFeedbackKind returns [Enumerator current=null] : ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) ) ;
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
            // InternalRefDsl.g:3900:2: ( ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) ) )
            // InternalRefDsl.g:3901:2: ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) )
            {
            // InternalRefDsl.g:3901:2: ( (enumLiteral_0= 'COMMENT' ) | (enumLiteral_1= 'REVIEW' ) | (enumLiteral_2= 'REACTION' ) | (enumLiteral_3= 'VOTE' ) | (enumLiteral_4= 'REPORT' ) | (enumLiteral_5= 'SUBSCRIPTION' ) )
            int alt89=6;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt89=1;
                }
                break;
            case 133:
                {
                alt89=2;
                }
                break;
            case 134:
                {
                alt89=3;
                }
                break;
            case 135:
                {
                alt89=4;
                }
                break;
            case 136:
                {
                alt89=5;
                }
                break;
            case 137:
                {
                alt89=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalRefDsl.g:3902:3: (enumLiteral_0= 'COMMENT' )
                    {
                    // InternalRefDsl.g:3902:3: (enumLiteral_0= 'COMMENT' )
                    // InternalRefDsl.g:3903:4: enumLiteral_0= 'COMMENT'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getCOMMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackKindAccess().getCOMMENTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3910:3: (enumLiteral_1= 'REVIEW' )
                    {
                    // InternalRefDsl.g:3910:3: (enumLiteral_1= 'REVIEW' )
                    // InternalRefDsl.g:3911:4: enumLiteral_1= 'REVIEW'
                    {
                    enumLiteral_1=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getREVIEWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackKindAccess().getREVIEWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3918:3: (enumLiteral_2= 'REACTION' )
                    {
                    // InternalRefDsl.g:3918:3: (enumLiteral_2= 'REACTION' )
                    // InternalRefDsl.g:3919:4: enumLiteral_2= 'REACTION'
                    {
                    enumLiteral_2=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getREACTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeedbackKindAccess().getREACTIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:3926:3: (enumLiteral_3= 'VOTE' )
                    {
                    // InternalRefDsl.g:3926:3: (enumLiteral_3= 'VOTE' )
                    // InternalRefDsl.g:3927:4: enumLiteral_3= 'VOTE'
                    {
                    enumLiteral_3=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getVOTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFeedbackKindAccess().getVOTEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:3934:3: (enumLiteral_4= 'REPORT' )
                    {
                    // InternalRefDsl.g:3934:3: (enumLiteral_4= 'REPORT' )
                    // InternalRefDsl.g:3935:4: enumLiteral_4= 'REPORT'
                    {
                    enumLiteral_4=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackKindAccess().getREPORTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFeedbackKindAccess().getREPORTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:3942:3: (enumLiteral_5= 'SUBSCRIPTION' )
                    {
                    // InternalRefDsl.g:3942:3: (enumLiteral_5= 'SUBSCRIPTION' )
                    // InternalRefDsl.g:3943:4: enumLiteral_5= 'SUBSCRIPTION'
                    {
                    enumLiteral_5=(Token)match(input,137,FOLLOW_2); 

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
    // InternalRefDsl.g:3953:1: ruleFeedbackSubjectScope returns [Enumerator current=null] : ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) ) ;
    public final Enumerator ruleFeedbackSubjectScope() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3959:2: ( ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) ) )
            // InternalRefDsl.g:3960:2: ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) )
            {
            // InternalRefDsl.g:3960:2: ( (enumLiteral_0= 'RESOURCE_ONLY' ) | (enumLiteral_1= 'FEEDBACK_ONLY' ) | (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt90=1;
                }
                break;
            case 139:
                {
                alt90=2;
                }
                break;
            case 140:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalRefDsl.g:3961:3: (enumLiteral_0= 'RESOURCE_ONLY' )
                    {
                    // InternalRefDsl.g:3961:3: (enumLiteral_0= 'RESOURCE_ONLY' )
                    // InternalRefDsl.g:3962:4: enumLiteral_0= 'RESOURCE_ONLY'
                    {
                    enumLiteral_0=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackSubjectScopeAccess().getRESOURCE_ONLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackSubjectScopeAccess().getRESOURCE_ONLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:3969:3: (enumLiteral_1= 'FEEDBACK_ONLY' )
                    {
                    // InternalRefDsl.g:3969:3: (enumLiteral_1= 'FEEDBACK_ONLY' )
                    // InternalRefDsl.g:3970:4: enumLiteral_1= 'FEEDBACK_ONLY'
                    {
                    enumLiteral_1=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackSubjectScopeAccess().getFEEDBACK_ONLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackSubjectScopeAccess().getFEEDBACK_ONLYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:3977:3: (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' )
                    {
                    // InternalRefDsl.g:3977:3: (enumLiteral_2= 'RESOURCE_OR_FEEDBACK' )
                    // InternalRefDsl.g:3978:4: enumLiteral_2= 'RESOURCE_OR_FEEDBACK'
                    {
                    enumLiteral_2=(Token)match(input,140,FOLLOW_2); 

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


    // $ANTLR start "ruleFeedbackPolarity"
    // InternalRefDsl.g:3988:1: ruleFeedbackPolarity returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LIKE_DISLIKE' ) | (enumLiteral_2= 'UP_DOWN' ) | (enumLiteral_3= 'STARS' ) ) ;
    public final Enumerator ruleFeedbackPolarity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRefDsl.g:3994:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LIKE_DISLIKE' ) | (enumLiteral_2= 'UP_DOWN' ) | (enumLiteral_3= 'STARS' ) ) )
            // InternalRefDsl.g:3995:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LIKE_DISLIKE' ) | (enumLiteral_2= 'UP_DOWN' ) | (enumLiteral_3= 'STARS' ) )
            {
            // InternalRefDsl.g:3995:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LIKE_DISLIKE' ) | (enumLiteral_2= 'UP_DOWN' ) | (enumLiteral_3= 'STARS' ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt91=1;
                }
                break;
            case 142:
                {
                alt91=2;
                }
                break;
            case 143:
                {
                alt91=3;
                }
                break;
            case 144:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalRefDsl.g:3996:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalRefDsl.g:3996:3: (enumLiteral_0= 'NONE' )
                    // InternalRefDsl.g:3997:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackPolarityAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackPolarityAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4004:3: (enumLiteral_1= 'LIKE_DISLIKE' )
                    {
                    // InternalRefDsl.g:4004:3: (enumLiteral_1= 'LIKE_DISLIKE' )
                    // InternalRefDsl.g:4005:4: enumLiteral_1= 'LIKE_DISLIKE'
                    {
                    enumLiteral_1=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackPolarityAccess().getLIKE_DISLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackPolarityAccess().getLIKE_DISLIKEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4012:3: (enumLiteral_2= 'UP_DOWN' )
                    {
                    // InternalRefDsl.g:4012:3: (enumLiteral_2= 'UP_DOWN' )
                    // InternalRefDsl.g:4013:4: enumLiteral_2= 'UP_DOWN'
                    {
                    enumLiteral_2=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackPolarityAccess().getUP_DOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeedbackPolarityAccess().getUP_DOWNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:4020:3: (enumLiteral_3= 'STARS' )
                    {
                    // InternalRefDsl.g:4020:3: (enumLiteral_3= 'STARS' )
                    // InternalRefDsl.g:4021:4: enumLiteral_3= 'STARS'
                    {
                    enumLiteral_3=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackPolarityAccess().getSTARSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFeedbackPolarityAccess().getSTARSEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleFeedbackPolarity"


    // $ANTLR start "ruleFeedbackStatus"
    // InternalRefDsl.g:4031:1: ruleFeedbackStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) ) ;
    public final Enumerator ruleFeedbackStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4037:2: ( ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) ) )
            // InternalRefDsl.g:4038:2: ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) )
            {
            // InternalRefDsl.g:4038:2: ( (enumLiteral_0= 'ENABLED' ) | (enumLiteral_1= 'DISABLED' ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==145) ) {
                alt92=1;
            }
            else if ( (LA92_0==146) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalRefDsl.g:4039:3: (enumLiteral_0= 'ENABLED' )
                    {
                    // InternalRefDsl.g:4039:3: (enumLiteral_0= 'ENABLED' )
                    // InternalRefDsl.g:4040:4: enumLiteral_0= 'ENABLED'
                    {
                    enumLiteral_0=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackStatusAccess().getENABLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackStatusAccess().getENABLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4047:3: (enumLiteral_1= 'DISABLED' )
                    {
                    // InternalRefDsl.g:4047:3: (enumLiteral_1= 'DISABLED' )
                    // InternalRefDsl.g:4048:4: enumLiteral_1= 'DISABLED'
                    {
                    enumLiteral_1=(Token)match(input,146,FOLLOW_2); 

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


    // $ANTLR start "ruleVerificationRequirement"
    // InternalRefDsl.g:4058:1: ruleVerificationRequirement returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'OPTIONAL' ) | (enumLiteral_2= 'REQUIRED' ) ) ;
    public final Enumerator ruleVerificationRequirement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4064:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'OPTIONAL' ) | (enumLiteral_2= 'REQUIRED' ) ) )
            // InternalRefDsl.g:4065:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'OPTIONAL' ) | (enumLiteral_2= 'REQUIRED' ) )
            {
            // InternalRefDsl.g:4065:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'OPTIONAL' ) | (enumLiteral_2= 'REQUIRED' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt93=1;
                }
                break;
            case 147:
                {
                alt93=2;
                }
                break;
            case 148:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalRefDsl.g:4066:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalRefDsl.g:4066:3: (enumLiteral_0= 'NONE' )
                    // InternalRefDsl.g:4067:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getVerificationRequirementAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVerificationRequirementAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4074:3: (enumLiteral_1= 'OPTIONAL' )
                    {
                    // InternalRefDsl.g:4074:3: (enumLiteral_1= 'OPTIONAL' )
                    // InternalRefDsl.g:4075:4: enumLiteral_1= 'OPTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getVerificationRequirementAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVerificationRequirementAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4082:3: (enumLiteral_2= 'REQUIRED' )
                    {
                    // InternalRefDsl.g:4082:3: (enumLiteral_2= 'REQUIRED' )
                    // InternalRefDsl.g:4083:4: enumLiteral_2= 'REQUIRED'
                    {
                    enumLiteral_2=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getVerificationRequirementAccess().getREQUIREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVerificationRequirementAccess().getREQUIREDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleVerificationRequirement"


    // $ANTLR start "ruleValidationKind"
    // InternalRefDsl.g:4093:1: ruleValidationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) ) ;
    public final Enumerator ruleValidationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4099:2: ( ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) ) )
            // InternalRefDsl.g:4100:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) )
            {
            // InternalRefDsl.g:4100:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==149) ) {
                alt94=1;
            }
            else if ( (LA94_0==150) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalRefDsl.g:4101:3: (enumLiteral_0= 'AUTOMATIC' )
                    {
                    // InternalRefDsl.g:4101:3: (enumLiteral_0= 'AUTOMATIC' )
                    // InternalRefDsl.g:4102:4: enumLiteral_0= 'AUTOMATIC'
                    {
                    enumLiteral_0=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getValidationKindAccess().getAUTOMATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationKindAccess().getAUTOMATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4109:3: (enumLiteral_1= 'MANUAL' )
                    {
                    // InternalRefDsl.g:4109:3: (enumLiteral_1= 'MANUAL' )
                    // InternalRefDsl.g:4110:4: enumLiteral_1= 'MANUAL'
                    {
                    enumLiteral_1=(Token)match(input,150,FOLLOW_2); 

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
    // InternalRefDsl.g:4120:1: ruleRuleSeverity returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) ) ;
    public final Enumerator ruleRuleSeverity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4126:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) ) )
            // InternalRefDsl.g:4127:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) )
            {
            // InternalRefDsl.g:4127:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'ERROR' ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 151:
                {
                alt95=1;
                }
                break;
            case 152:
                {
                alt95=2;
                }
                break;
            case 153:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalRefDsl.g:4128:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalRefDsl.g:4128:3: (enumLiteral_0= 'INFO' )
                    // InternalRefDsl.g:4129:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getRuleSeverityAccess().getINFOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleSeverityAccess().getINFOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4136:3: (enumLiteral_1= 'WARNING' )
                    {
                    // InternalRefDsl.g:4136:3: (enumLiteral_1= 'WARNING' )
                    // InternalRefDsl.g:4137:4: enumLiteral_1= 'WARNING'
                    {
                    enumLiteral_1=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getRuleSeverityAccess().getWARNINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleSeverityAccess().getWARNINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4144:3: (enumLiteral_2= 'ERROR' )
                    {
                    // InternalRefDsl.g:4144:3: (enumLiteral_2= 'ERROR' )
                    // InternalRefDsl.g:4145:4: enumLiteral_2= 'ERROR'
                    {
                    enumLiteral_2=(Token)match(input,153,FOLLOW_2); 

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
    // InternalRefDsl.g:4155:1: ruleModerationMode returns [Enumerator current=null] : ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) ) ;
    public final Enumerator ruleModerationMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4161:2: ( ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) ) )
            // InternalRefDsl.g:4162:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) )
            {
            // InternalRefDsl.g:4162:2: ( (enumLiteral_0= 'AUTOMATIC' ) | (enumLiteral_1= 'MANUAL' ) | (enumLiteral_2= 'HYBRID' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt96=1;
                }
                break;
            case 150:
                {
                alt96=2;
                }
                break;
            case 154:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalRefDsl.g:4163:3: (enumLiteral_0= 'AUTOMATIC' )
                    {
                    // InternalRefDsl.g:4163:3: (enumLiteral_0= 'AUTOMATIC' )
                    // InternalRefDsl.g:4164:4: enumLiteral_0= 'AUTOMATIC'
                    {
                    enumLiteral_0=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getModerationModeAccess().getAUTOMATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModerationModeAccess().getAUTOMATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4171:3: (enumLiteral_1= 'MANUAL' )
                    {
                    // InternalRefDsl.g:4171:3: (enumLiteral_1= 'MANUAL' )
                    // InternalRefDsl.g:4172:4: enumLiteral_1= 'MANUAL'
                    {
                    enumLiteral_1=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getModerationModeAccess().getMANUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModerationModeAccess().getMANUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4179:3: (enumLiteral_2= 'HYBRID' )
                    {
                    // InternalRefDsl.g:4179:3: (enumLiteral_2= 'HYBRID' )
                    // InternalRefDsl.g:4180:4: enumLiteral_2= 'HYBRID'
                    {
                    enumLiteral_2=(Token)match(input,154,FOLLOW_2); 

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
    // InternalRefDsl.g:4190:1: ruleModerationDecision returns [Enumerator current=null] : ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) ) ;
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
            // InternalRefDsl.g:4196:2: ( ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) ) )
            // InternalRefDsl.g:4197:2: ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) )
            {
            // InternalRefDsl.g:4197:2: ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'FLAGGED' ) | (enumLiteral_2= 'HIDDEN' ) | (enumLiteral_3= 'REMOVED' ) | (enumLiteral_4= 'BLOCKED' ) | (enumLiteral_5= 'REJECTED' ) )
            int alt97=6;
            switch ( input.LA(1) ) {
            case 155:
                {
                alt97=1;
                }
                break;
            case 156:
                {
                alt97=2;
                }
                break;
            case 157:
                {
                alt97=3;
                }
                break;
            case 158:
                {
                alt97=4;
                }
                break;
            case 159:
                {
                alt97=5;
                }
                break;
            case 160:
                {
                alt97=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalRefDsl.g:4198:3: (enumLiteral_0= 'APPROVED' )
                    {
                    // InternalRefDsl.g:4198:3: (enumLiteral_0= 'APPROVED' )
                    // InternalRefDsl.g:4199:4: enumLiteral_0= 'APPROVED'
                    {
                    enumLiteral_0=(Token)match(input,155,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getAPPROVEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModerationDecisionAccess().getAPPROVEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4206:3: (enumLiteral_1= 'FLAGGED' )
                    {
                    // InternalRefDsl.g:4206:3: (enumLiteral_1= 'FLAGGED' )
                    // InternalRefDsl.g:4207:4: enumLiteral_1= 'FLAGGED'
                    {
                    enumLiteral_1=(Token)match(input,156,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getFLAGGEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModerationDecisionAccess().getFLAGGEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4214:3: (enumLiteral_2= 'HIDDEN' )
                    {
                    // InternalRefDsl.g:4214:3: (enumLiteral_2= 'HIDDEN' )
                    // InternalRefDsl.g:4215:4: enumLiteral_2= 'HIDDEN'
                    {
                    enumLiteral_2=(Token)match(input,157,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getHIDDENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModerationDecisionAccess().getHIDDENEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:4222:3: (enumLiteral_3= 'REMOVED' )
                    {
                    // InternalRefDsl.g:4222:3: (enumLiteral_3= 'REMOVED' )
                    // InternalRefDsl.g:4223:4: enumLiteral_3= 'REMOVED'
                    {
                    enumLiteral_3=(Token)match(input,158,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getREMOVEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getModerationDecisionAccess().getREMOVEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:4230:3: (enumLiteral_4= 'BLOCKED' )
                    {
                    // InternalRefDsl.g:4230:3: (enumLiteral_4= 'BLOCKED' )
                    // InternalRefDsl.g:4231:4: enumLiteral_4= 'BLOCKED'
                    {
                    enumLiteral_4=(Token)match(input,159,FOLLOW_2); 

                    				current = grammarAccess.getModerationDecisionAccess().getBLOCKEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getModerationDecisionAccess().getBLOCKEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:4238:3: (enumLiteral_5= 'REJECTED' )
                    {
                    // InternalRefDsl.g:4238:3: (enumLiteral_5= 'REJECTED' )
                    // InternalRefDsl.g:4239:4: enumLiteral_5= 'REJECTED'
                    {
                    enumLiteral_5=(Token)match(input,160,FOLLOW_2); 

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
    // InternalRefDsl.g:4249:1: ruleActionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) ) ;
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
            // InternalRefDsl.g:4255:2: ( ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) ) )
            // InternalRefDsl.g:4256:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) )
            {
            // InternalRefDsl.g:4256:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'COMMENT' ) | (enumLiteral_5= 'RATE' ) | (enumLiteral_6= 'VOTE' ) | (enumLiteral_7= 'REPORT' ) | (enumLiteral_8= 'SUBSCRIBE' ) | (enumLiteral_9= 'MODERATE' ) | (enumLiteral_10= 'VALIDATE' ) )
            int alt98=11;
            switch ( input.LA(1) ) {
            case 161:
                {
                alt98=1;
                }
                break;
            case 162:
                {
                alt98=2;
                }
                break;
            case 163:
                {
                alt98=3;
                }
                break;
            case 164:
                {
                alt98=4;
                }
                break;
            case 132:
                {
                alt98=5;
                }
                break;
            case 165:
                {
                alt98=6;
                }
                break;
            case 135:
                {
                alt98=7;
                }
                break;
            case 136:
                {
                alt98=8;
                }
                break;
            case 166:
                {
                alt98=9;
                }
                break;
            case 167:
                {
                alt98=10;
                }
                break;
            case 168:
                {
                alt98=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalRefDsl.g:4257:3: (enumLiteral_0= 'READ' )
                    {
                    // InternalRefDsl.g:4257:3: (enumLiteral_0= 'READ' )
                    // InternalRefDsl.g:4258:4: enumLiteral_0= 'READ'
                    {
                    enumLiteral_0=(Token)match(input,161,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionKindAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4265:3: (enumLiteral_1= 'CREATE' )
                    {
                    // InternalRefDsl.g:4265:3: (enumLiteral_1= 'CREATE' )
                    // InternalRefDsl.g:4266:4: enumLiteral_1= 'CREATE'
                    {
                    enumLiteral_1=(Token)match(input,162,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getCREATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionKindAccess().getCREATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4273:3: (enumLiteral_2= 'UPDATE' )
                    {
                    // InternalRefDsl.g:4273:3: (enumLiteral_2= 'UPDATE' )
                    // InternalRefDsl.g:4274:4: enumLiteral_2= 'UPDATE'
                    {
                    enumLiteral_2=(Token)match(input,163,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionKindAccess().getUPDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:4281:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalRefDsl.g:4281:3: (enumLiteral_3= 'DELETE' )
                    // InternalRefDsl.g:4282:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,164,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionKindAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:4289:3: (enumLiteral_4= 'COMMENT' )
                    {
                    // InternalRefDsl.g:4289:3: (enumLiteral_4= 'COMMENT' )
                    // InternalRefDsl.g:4290:4: enumLiteral_4= 'COMMENT'
                    {
                    enumLiteral_4=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getCOMMENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionKindAccess().getCOMMENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:4297:3: (enumLiteral_5= 'RATE' )
                    {
                    // InternalRefDsl.g:4297:3: (enumLiteral_5= 'RATE' )
                    // InternalRefDsl.g:4298:4: enumLiteral_5= 'RATE'
                    {
                    enumLiteral_5=(Token)match(input,165,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getRATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionKindAccess().getRATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:4305:3: (enumLiteral_6= 'VOTE' )
                    {
                    // InternalRefDsl.g:4305:3: (enumLiteral_6= 'VOTE' )
                    // InternalRefDsl.g:4306:4: enumLiteral_6= 'VOTE'
                    {
                    enumLiteral_6=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getVOTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionKindAccess().getVOTEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:4313:3: (enumLiteral_7= 'REPORT' )
                    {
                    // InternalRefDsl.g:4313:3: (enumLiteral_7= 'REPORT' )
                    // InternalRefDsl.g:4314:4: enumLiteral_7= 'REPORT'
                    {
                    enumLiteral_7=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getREPORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getActionKindAccess().getREPORTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRefDsl.g:4321:3: (enumLiteral_8= 'SUBSCRIBE' )
                    {
                    // InternalRefDsl.g:4321:3: (enumLiteral_8= 'SUBSCRIBE' )
                    // InternalRefDsl.g:4322:4: enumLiteral_8= 'SUBSCRIBE'
                    {
                    enumLiteral_8=(Token)match(input,166,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getSUBSCRIBEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getActionKindAccess().getSUBSCRIBEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRefDsl.g:4329:3: (enumLiteral_9= 'MODERATE' )
                    {
                    // InternalRefDsl.g:4329:3: (enumLiteral_9= 'MODERATE' )
                    // InternalRefDsl.g:4330:4: enumLiteral_9= 'MODERATE'
                    {
                    enumLiteral_9=(Token)match(input,167,FOLLOW_2); 

                    				current = grammarAccess.getActionKindAccess().getMODERATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getActionKindAccess().getMODERATEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRefDsl.g:4337:3: (enumLiteral_10= 'VALIDATE' )
                    {
                    // InternalRefDsl.g:4337:3: (enumLiteral_10= 'VALIDATE' )
                    // InternalRefDsl.g:4338:4: enumLiteral_10= 'VALIDATE'
                    {
                    enumLiteral_10=(Token)match(input,168,FOLLOW_2); 

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


    // $ANTLR start "ruleTriggerEvent"
    // InternalRefDsl.g:4348:1: ruleTriggerEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'ON_RESOURCE_CREATE' ) | (enumLiteral_1= 'ON_RESOURCE_UPDATE' ) | (enumLiteral_2= 'ON_RESOURCE_DELETE' ) | (enumLiteral_3= 'ON_FEEDBACK_CREATE' ) | (enumLiteral_4= 'ON_FEEDBACK_UPDATE' ) | (enumLiteral_5= 'ON_FEEDBACK_DELETE' ) | (enumLiteral_6= 'ON_REPORT_SUBMITTED' ) | (enumLiteral_7= 'ON_REPORT_THRESHOLD' ) | (enumLiteral_8= 'ON_MANUAL_REQUEST' ) ) ;
    public final Enumerator ruleTriggerEvent() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalRefDsl.g:4354:2: ( ( (enumLiteral_0= 'ON_RESOURCE_CREATE' ) | (enumLiteral_1= 'ON_RESOURCE_UPDATE' ) | (enumLiteral_2= 'ON_RESOURCE_DELETE' ) | (enumLiteral_3= 'ON_FEEDBACK_CREATE' ) | (enumLiteral_4= 'ON_FEEDBACK_UPDATE' ) | (enumLiteral_5= 'ON_FEEDBACK_DELETE' ) | (enumLiteral_6= 'ON_REPORT_SUBMITTED' ) | (enumLiteral_7= 'ON_REPORT_THRESHOLD' ) | (enumLiteral_8= 'ON_MANUAL_REQUEST' ) ) )
            // InternalRefDsl.g:4355:2: ( (enumLiteral_0= 'ON_RESOURCE_CREATE' ) | (enumLiteral_1= 'ON_RESOURCE_UPDATE' ) | (enumLiteral_2= 'ON_RESOURCE_DELETE' ) | (enumLiteral_3= 'ON_FEEDBACK_CREATE' ) | (enumLiteral_4= 'ON_FEEDBACK_UPDATE' ) | (enumLiteral_5= 'ON_FEEDBACK_DELETE' ) | (enumLiteral_6= 'ON_REPORT_SUBMITTED' ) | (enumLiteral_7= 'ON_REPORT_THRESHOLD' ) | (enumLiteral_8= 'ON_MANUAL_REQUEST' ) )
            {
            // InternalRefDsl.g:4355:2: ( (enumLiteral_0= 'ON_RESOURCE_CREATE' ) | (enumLiteral_1= 'ON_RESOURCE_UPDATE' ) | (enumLiteral_2= 'ON_RESOURCE_DELETE' ) | (enumLiteral_3= 'ON_FEEDBACK_CREATE' ) | (enumLiteral_4= 'ON_FEEDBACK_UPDATE' ) | (enumLiteral_5= 'ON_FEEDBACK_DELETE' ) | (enumLiteral_6= 'ON_REPORT_SUBMITTED' ) | (enumLiteral_7= 'ON_REPORT_THRESHOLD' ) | (enumLiteral_8= 'ON_MANUAL_REQUEST' ) )
            int alt99=9;
            switch ( input.LA(1) ) {
            case 169:
                {
                alt99=1;
                }
                break;
            case 170:
                {
                alt99=2;
                }
                break;
            case 171:
                {
                alt99=3;
                }
                break;
            case 172:
                {
                alt99=4;
                }
                break;
            case 173:
                {
                alt99=5;
                }
                break;
            case 174:
                {
                alt99=6;
                }
                break;
            case 175:
                {
                alt99=7;
                }
                break;
            case 176:
                {
                alt99=8;
                }
                break;
            case 177:
                {
                alt99=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalRefDsl.g:4356:3: (enumLiteral_0= 'ON_RESOURCE_CREATE' )
                    {
                    // InternalRefDsl.g:4356:3: (enumLiteral_0= 'ON_RESOURCE_CREATE' )
                    // InternalRefDsl.g:4357:4: enumLiteral_0= 'ON_RESOURCE_CREATE'
                    {
                    enumLiteral_0=(Token)match(input,169,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_RESOURCE_CREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTriggerEventAccess().getON_RESOURCE_CREATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4364:3: (enumLiteral_1= 'ON_RESOURCE_UPDATE' )
                    {
                    // InternalRefDsl.g:4364:3: (enumLiteral_1= 'ON_RESOURCE_UPDATE' )
                    // InternalRefDsl.g:4365:4: enumLiteral_1= 'ON_RESOURCE_UPDATE'
                    {
                    enumLiteral_1=(Token)match(input,170,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_RESOURCE_UPDATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTriggerEventAccess().getON_RESOURCE_UPDATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4372:3: (enumLiteral_2= 'ON_RESOURCE_DELETE' )
                    {
                    // InternalRefDsl.g:4372:3: (enumLiteral_2= 'ON_RESOURCE_DELETE' )
                    // InternalRefDsl.g:4373:4: enumLiteral_2= 'ON_RESOURCE_DELETE'
                    {
                    enumLiteral_2=(Token)match(input,171,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_RESOURCE_DELETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTriggerEventAccess().getON_RESOURCE_DELETEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:4380:3: (enumLiteral_3= 'ON_FEEDBACK_CREATE' )
                    {
                    // InternalRefDsl.g:4380:3: (enumLiteral_3= 'ON_FEEDBACK_CREATE' )
                    // InternalRefDsl.g:4381:4: enumLiteral_3= 'ON_FEEDBACK_CREATE'
                    {
                    enumLiteral_3=(Token)match(input,172,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_FEEDBACK_CREATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTriggerEventAccess().getON_FEEDBACK_CREATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:4388:3: (enumLiteral_4= 'ON_FEEDBACK_UPDATE' )
                    {
                    // InternalRefDsl.g:4388:3: (enumLiteral_4= 'ON_FEEDBACK_UPDATE' )
                    // InternalRefDsl.g:4389:4: enumLiteral_4= 'ON_FEEDBACK_UPDATE'
                    {
                    enumLiteral_4=(Token)match(input,173,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_FEEDBACK_UPDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTriggerEventAccess().getON_FEEDBACK_UPDATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:4396:3: (enumLiteral_5= 'ON_FEEDBACK_DELETE' )
                    {
                    // InternalRefDsl.g:4396:3: (enumLiteral_5= 'ON_FEEDBACK_DELETE' )
                    // InternalRefDsl.g:4397:4: enumLiteral_5= 'ON_FEEDBACK_DELETE'
                    {
                    enumLiteral_5=(Token)match(input,174,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_FEEDBACK_DELETEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTriggerEventAccess().getON_FEEDBACK_DELETEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:4404:3: (enumLiteral_6= 'ON_REPORT_SUBMITTED' )
                    {
                    // InternalRefDsl.g:4404:3: (enumLiteral_6= 'ON_REPORT_SUBMITTED' )
                    // InternalRefDsl.g:4405:4: enumLiteral_6= 'ON_REPORT_SUBMITTED'
                    {
                    enumLiteral_6=(Token)match(input,175,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_REPORT_SUBMITTEDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTriggerEventAccess().getON_REPORT_SUBMITTEDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:4412:3: (enumLiteral_7= 'ON_REPORT_THRESHOLD' )
                    {
                    // InternalRefDsl.g:4412:3: (enumLiteral_7= 'ON_REPORT_THRESHOLD' )
                    // InternalRefDsl.g:4413:4: enumLiteral_7= 'ON_REPORT_THRESHOLD'
                    {
                    enumLiteral_7=(Token)match(input,176,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_REPORT_THRESHOLDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTriggerEventAccess().getON_REPORT_THRESHOLDEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRefDsl.g:4420:3: (enumLiteral_8= 'ON_MANUAL_REQUEST' )
                    {
                    // InternalRefDsl.g:4420:3: (enumLiteral_8= 'ON_MANUAL_REQUEST' )
                    // InternalRefDsl.g:4421:4: enumLiteral_8= 'ON_MANUAL_REQUEST'
                    {
                    enumLiteral_8=(Token)match(input,177,FOLLOW_2); 

                    				current = grammarAccess.getTriggerEventAccess().getON_MANUAL_REQUESTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTriggerEventAccess().getON_MANUAL_REQUESTEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleTriggerEvent"


    // $ANTLR start "ruleConditionOperator"
    // InternalRefDsl.g:4431:1: ruleConditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'CONTAINS_KEYWORDS' ) | (enumLiteral_1= 'NOT_CONTAINS_KEYWORDS' ) | (enumLiteral_2= 'MATCH_REGEX' ) | (enumLiteral_3= 'NOT_MATCH_REGEX' ) | (enumLiteral_4= 'HAS_PROPERTY' ) | (enumLiteral_5= 'NOT_HAS_PROPERTY' ) | (enumLiteral_6= 'HAS_SPECIFIC_PROPERTY' ) | (enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY' ) ) ;
    public final Enumerator ruleConditionOperator() throws RecognitionException {
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
            // InternalRefDsl.g:4437:2: ( ( (enumLiteral_0= 'CONTAINS_KEYWORDS' ) | (enumLiteral_1= 'NOT_CONTAINS_KEYWORDS' ) | (enumLiteral_2= 'MATCH_REGEX' ) | (enumLiteral_3= 'NOT_MATCH_REGEX' ) | (enumLiteral_4= 'HAS_PROPERTY' ) | (enumLiteral_5= 'NOT_HAS_PROPERTY' ) | (enumLiteral_6= 'HAS_SPECIFIC_PROPERTY' ) | (enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY' ) ) )
            // InternalRefDsl.g:4438:2: ( (enumLiteral_0= 'CONTAINS_KEYWORDS' ) | (enumLiteral_1= 'NOT_CONTAINS_KEYWORDS' ) | (enumLiteral_2= 'MATCH_REGEX' ) | (enumLiteral_3= 'NOT_MATCH_REGEX' ) | (enumLiteral_4= 'HAS_PROPERTY' ) | (enumLiteral_5= 'NOT_HAS_PROPERTY' ) | (enumLiteral_6= 'HAS_SPECIFIC_PROPERTY' ) | (enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY' ) )
            {
            // InternalRefDsl.g:4438:2: ( (enumLiteral_0= 'CONTAINS_KEYWORDS' ) | (enumLiteral_1= 'NOT_CONTAINS_KEYWORDS' ) | (enumLiteral_2= 'MATCH_REGEX' ) | (enumLiteral_3= 'NOT_MATCH_REGEX' ) | (enumLiteral_4= 'HAS_PROPERTY' ) | (enumLiteral_5= 'NOT_HAS_PROPERTY' ) | (enumLiteral_6= 'HAS_SPECIFIC_PROPERTY' ) | (enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY' ) )
            int alt100=8;
            switch ( input.LA(1) ) {
            case 178:
                {
                alt100=1;
                }
                break;
            case 179:
                {
                alt100=2;
                }
                break;
            case 180:
                {
                alt100=3;
                }
                break;
            case 181:
                {
                alt100=4;
                }
                break;
            case 182:
                {
                alt100=5;
                }
                break;
            case 183:
                {
                alt100=6;
                }
                break;
            case 184:
                {
                alt100=7;
                }
                break;
            case 185:
                {
                alt100=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalRefDsl.g:4439:3: (enumLiteral_0= 'CONTAINS_KEYWORDS' )
                    {
                    // InternalRefDsl.g:4439:3: (enumLiteral_0= 'CONTAINS_KEYWORDS' )
                    // InternalRefDsl.g:4440:4: enumLiteral_0= 'CONTAINS_KEYWORDS'
                    {
                    enumLiteral_0=(Token)match(input,178,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getCONTAINS_KEYWORDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionOperatorAccess().getCONTAINS_KEYWORDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4447:3: (enumLiteral_1= 'NOT_CONTAINS_KEYWORDS' )
                    {
                    // InternalRefDsl.g:4447:3: (enumLiteral_1= 'NOT_CONTAINS_KEYWORDS' )
                    // InternalRefDsl.g:4448:4: enumLiteral_1= 'NOT_CONTAINS_KEYWORDS'
                    {
                    enumLiteral_1=(Token)match(input,179,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getNOT_CONTAINS_KEYWORDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionOperatorAccess().getNOT_CONTAINS_KEYWORDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4455:3: (enumLiteral_2= 'MATCH_REGEX' )
                    {
                    // InternalRefDsl.g:4455:3: (enumLiteral_2= 'MATCH_REGEX' )
                    // InternalRefDsl.g:4456:4: enumLiteral_2= 'MATCH_REGEX'
                    {
                    enumLiteral_2=(Token)match(input,180,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getMATCH_REGEXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionOperatorAccess().getMATCH_REGEXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:4463:3: (enumLiteral_3= 'NOT_MATCH_REGEX' )
                    {
                    // InternalRefDsl.g:4463:3: (enumLiteral_3= 'NOT_MATCH_REGEX' )
                    // InternalRefDsl.g:4464:4: enumLiteral_3= 'NOT_MATCH_REGEX'
                    {
                    enumLiteral_3=(Token)match(input,181,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getNOT_MATCH_REGEXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getConditionOperatorAccess().getNOT_MATCH_REGEXEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:4471:3: (enumLiteral_4= 'HAS_PROPERTY' )
                    {
                    // InternalRefDsl.g:4471:3: (enumLiteral_4= 'HAS_PROPERTY' )
                    // InternalRefDsl.g:4472:4: enumLiteral_4= 'HAS_PROPERTY'
                    {
                    enumLiteral_4=(Token)match(input,182,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getHAS_PROPERTYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getConditionOperatorAccess().getHAS_PROPERTYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:4479:3: (enumLiteral_5= 'NOT_HAS_PROPERTY' )
                    {
                    // InternalRefDsl.g:4479:3: (enumLiteral_5= 'NOT_HAS_PROPERTY' )
                    // InternalRefDsl.g:4480:4: enumLiteral_5= 'NOT_HAS_PROPERTY'
                    {
                    enumLiteral_5=(Token)match(input,183,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getNOT_HAS_PROPERTYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getConditionOperatorAccess().getNOT_HAS_PROPERTYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:4487:3: (enumLiteral_6= 'HAS_SPECIFIC_PROPERTY' )
                    {
                    // InternalRefDsl.g:4487:3: (enumLiteral_6= 'HAS_SPECIFIC_PROPERTY' )
                    // InternalRefDsl.g:4488:4: enumLiteral_6= 'HAS_SPECIFIC_PROPERTY'
                    {
                    enumLiteral_6=(Token)match(input,184,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getHAS_SPECIFIC_PROPERTYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getConditionOperatorAccess().getHAS_SPECIFIC_PROPERTYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:4495:3: (enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY' )
                    {
                    // InternalRefDsl.g:4495:3: (enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY' )
                    // InternalRefDsl.g:4496:4: enumLiteral_7= 'NOT_HAS_SPECIFIC_PROPERTY'
                    {
                    enumLiteral_7=(Token)match(input,185,FOLLOW_2); 

                    				current = grammarAccess.getConditionOperatorAccess().getNOT_HAS_SPECIFIC_PROPERTYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getConditionOperatorAccess().getNOT_HAS_SPECIFIC_PROPERTYEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleConditionOperator"


    // $ANTLR start "ruleActionResultKind"
    // InternalRefDsl.g:4506:1: ruleActionResultKind returns [Enumerator current=null] : ( (enumLiteral_0= 'DISPLAY_MESSAGE' ) | (enumLiteral_1= 'FLAG_CONTENT' ) | (enumLiteral_2= 'HIDE_CONTENT' ) | (enumLiteral_3= 'REMOVE_CONTENT' ) | (enumLiteral_4= 'BLOCK_SUBMISSION' ) | (enumLiteral_5= 'NOTIFY_MODERATOR' ) | (enumLiteral_6= 'AUTO_APPROVE' ) | (enumLiteral_7= 'AUTO_REJECT' ) ) ;
    public final Enumerator ruleActionResultKind() throws RecognitionException {
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
            // InternalRefDsl.g:4512:2: ( ( (enumLiteral_0= 'DISPLAY_MESSAGE' ) | (enumLiteral_1= 'FLAG_CONTENT' ) | (enumLiteral_2= 'HIDE_CONTENT' ) | (enumLiteral_3= 'REMOVE_CONTENT' ) | (enumLiteral_4= 'BLOCK_SUBMISSION' ) | (enumLiteral_5= 'NOTIFY_MODERATOR' ) | (enumLiteral_6= 'AUTO_APPROVE' ) | (enumLiteral_7= 'AUTO_REJECT' ) ) )
            // InternalRefDsl.g:4513:2: ( (enumLiteral_0= 'DISPLAY_MESSAGE' ) | (enumLiteral_1= 'FLAG_CONTENT' ) | (enumLiteral_2= 'HIDE_CONTENT' ) | (enumLiteral_3= 'REMOVE_CONTENT' ) | (enumLiteral_4= 'BLOCK_SUBMISSION' ) | (enumLiteral_5= 'NOTIFY_MODERATOR' ) | (enumLiteral_6= 'AUTO_APPROVE' ) | (enumLiteral_7= 'AUTO_REJECT' ) )
            {
            // InternalRefDsl.g:4513:2: ( (enumLiteral_0= 'DISPLAY_MESSAGE' ) | (enumLiteral_1= 'FLAG_CONTENT' ) | (enumLiteral_2= 'HIDE_CONTENT' ) | (enumLiteral_3= 'REMOVE_CONTENT' ) | (enumLiteral_4= 'BLOCK_SUBMISSION' ) | (enumLiteral_5= 'NOTIFY_MODERATOR' ) | (enumLiteral_6= 'AUTO_APPROVE' ) | (enumLiteral_7= 'AUTO_REJECT' ) )
            int alt101=8;
            switch ( input.LA(1) ) {
            case 186:
                {
                alt101=1;
                }
                break;
            case 187:
                {
                alt101=2;
                }
                break;
            case 188:
                {
                alt101=3;
                }
                break;
            case 189:
                {
                alt101=4;
                }
                break;
            case 190:
                {
                alt101=5;
                }
                break;
            case 191:
                {
                alt101=6;
                }
                break;
            case 192:
                {
                alt101=7;
                }
                break;
            case 193:
                {
                alt101=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalRefDsl.g:4514:3: (enumLiteral_0= 'DISPLAY_MESSAGE' )
                    {
                    // InternalRefDsl.g:4514:3: (enumLiteral_0= 'DISPLAY_MESSAGE' )
                    // InternalRefDsl.g:4515:4: enumLiteral_0= 'DISPLAY_MESSAGE'
                    {
                    enumLiteral_0=(Token)match(input,186,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getDISPLAY_MESSAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionResultKindAccess().getDISPLAY_MESSAGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4522:3: (enumLiteral_1= 'FLAG_CONTENT' )
                    {
                    // InternalRefDsl.g:4522:3: (enumLiteral_1= 'FLAG_CONTENT' )
                    // InternalRefDsl.g:4523:4: enumLiteral_1= 'FLAG_CONTENT'
                    {
                    enumLiteral_1=(Token)match(input,187,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getFLAG_CONTENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionResultKindAccess().getFLAG_CONTENTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRefDsl.g:4530:3: (enumLiteral_2= 'HIDE_CONTENT' )
                    {
                    // InternalRefDsl.g:4530:3: (enumLiteral_2= 'HIDE_CONTENT' )
                    // InternalRefDsl.g:4531:4: enumLiteral_2= 'HIDE_CONTENT'
                    {
                    enumLiteral_2=(Token)match(input,188,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getHIDE_CONTENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionResultKindAccess().getHIDE_CONTENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRefDsl.g:4538:3: (enumLiteral_3= 'REMOVE_CONTENT' )
                    {
                    // InternalRefDsl.g:4538:3: (enumLiteral_3= 'REMOVE_CONTENT' )
                    // InternalRefDsl.g:4539:4: enumLiteral_3= 'REMOVE_CONTENT'
                    {
                    enumLiteral_3=(Token)match(input,189,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getREMOVE_CONTENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionResultKindAccess().getREMOVE_CONTENTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRefDsl.g:4546:3: (enumLiteral_4= 'BLOCK_SUBMISSION' )
                    {
                    // InternalRefDsl.g:4546:3: (enumLiteral_4= 'BLOCK_SUBMISSION' )
                    // InternalRefDsl.g:4547:4: enumLiteral_4= 'BLOCK_SUBMISSION'
                    {
                    enumLiteral_4=(Token)match(input,190,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getBLOCK_SUBMISSIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionResultKindAccess().getBLOCK_SUBMISSIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRefDsl.g:4554:3: (enumLiteral_5= 'NOTIFY_MODERATOR' )
                    {
                    // InternalRefDsl.g:4554:3: (enumLiteral_5= 'NOTIFY_MODERATOR' )
                    // InternalRefDsl.g:4555:4: enumLiteral_5= 'NOTIFY_MODERATOR'
                    {
                    enumLiteral_5=(Token)match(input,191,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getNOTIFY_MODERATOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionResultKindAccess().getNOTIFY_MODERATOREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRefDsl.g:4562:3: (enumLiteral_6= 'AUTO_APPROVE' )
                    {
                    // InternalRefDsl.g:4562:3: (enumLiteral_6= 'AUTO_APPROVE' )
                    // InternalRefDsl.g:4563:4: enumLiteral_6= 'AUTO_APPROVE'
                    {
                    enumLiteral_6=(Token)match(input,192,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getAUTO_APPROVEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionResultKindAccess().getAUTO_APPROVEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRefDsl.g:4570:3: (enumLiteral_7= 'AUTO_REJECT' )
                    {
                    // InternalRefDsl.g:4570:3: (enumLiteral_7= 'AUTO_REJECT' )
                    // InternalRefDsl.g:4571:4: enumLiteral_7= 'AUTO_REJECT'
                    {
                    enumLiteral_7=(Token)match(input,193,FOLLOW_2); 

                    				current = grammarAccess.getActionResultKindAccess().getAUTO_REJECTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getActionResultKindAccess().getAUTO_REJECTEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleActionResultKind"


    // $ANTLR start "ruleSortCriterion"
    // InternalRefDsl.g:4581:1: ruleSortCriterion returns [Enumerator current=null] : ( (enumLiteral_0= 'DATE' ) | (enumLiteral_1= 'VALUE' ) ) ;
    public final Enumerator ruleSortCriterion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4587:2: ( ( (enumLiteral_0= 'DATE' ) | (enumLiteral_1= 'VALUE' ) ) )
            // InternalRefDsl.g:4588:2: ( (enumLiteral_0= 'DATE' ) | (enumLiteral_1= 'VALUE' ) )
            {
            // InternalRefDsl.g:4588:2: ( (enumLiteral_0= 'DATE' ) | (enumLiteral_1= 'VALUE' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==127) ) {
                alt102=1;
            }
            else if ( (LA102_0==194) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalRefDsl.g:4589:3: (enumLiteral_0= 'DATE' )
                    {
                    // InternalRefDsl.g:4589:3: (enumLiteral_0= 'DATE' )
                    // InternalRefDsl.g:4590:4: enumLiteral_0= 'DATE'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getSortCriterionAccess().getDATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSortCriterionAccess().getDATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4597:3: (enumLiteral_1= 'VALUE' )
                    {
                    // InternalRefDsl.g:4597:3: (enumLiteral_1= 'VALUE' )
                    // InternalRefDsl.g:4598:4: enumLiteral_1= 'VALUE'
                    {
                    enumLiteral_1=(Token)match(input,194,FOLLOW_2); 

                    				current = grammarAccess.getSortCriterionAccess().getVALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSortCriterionAccess().getVALUEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSortCriterion"


    // $ANTLR start "ruleSortDirection"
    // InternalRefDsl.g:4608:1: ruleSortDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'ASC' ) | (enumLiteral_1= 'DESC' ) ) ;
    public final Enumerator ruleSortDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRefDsl.g:4614:2: ( ( (enumLiteral_0= 'ASC' ) | (enumLiteral_1= 'DESC' ) ) )
            // InternalRefDsl.g:4615:2: ( (enumLiteral_0= 'ASC' ) | (enumLiteral_1= 'DESC' ) )
            {
            // InternalRefDsl.g:4615:2: ( (enumLiteral_0= 'ASC' ) | (enumLiteral_1= 'DESC' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==195) ) {
                alt103=1;
            }
            else if ( (LA103_0==196) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalRefDsl.g:4616:3: (enumLiteral_0= 'ASC' )
                    {
                    // InternalRefDsl.g:4616:3: (enumLiteral_0= 'ASC' )
                    // InternalRefDsl.g:4617:4: enumLiteral_0= 'ASC'
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); 

                    				current = grammarAccess.getSortDirectionAccess().getASCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSortDirectionAccess().getASCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRefDsl.g:4624:3: (enumLiteral_1= 'DESC' )
                    {
                    // InternalRefDsl.g:4624:3: (enumLiteral_1= 'DESC' )
                    // InternalRefDsl.g:4625:4: enumLiteral_1= 'DESC'
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); 

                    				current = grammarAccess.getSortDirectionAccess().getDESCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSortDirectionAccess().getDESCEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSortDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001FFE8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001FFE0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001FFA0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001FF20000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001FE20000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001FC20000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001F820000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001E020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001C020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x00F8000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002080004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F0L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00F8200000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00F0200000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00E0200000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000182000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010100L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004600000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0003FE0000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001F8000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000100L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001FE00000190L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000044400000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000040400000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x03FC000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFC00000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000403000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000402000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});

}