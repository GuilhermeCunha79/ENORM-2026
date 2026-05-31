<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:9ba50f7b-920d-4b57-b421-a94853f78ad0(Ref.sandbox.two)">
  <persistence version="9" />
  <languages>
    <use id="75b0389b-83f9-4003-b95d-1b8432efd2b6" name="Ref" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="75b0389b-83f9-4003-b95d-1b8432efd2b6" name="Ref">
      <concept id="6041381794867197938" name="Ref.structure.ContextResourceTypeLink" flags="ng" index="28hnH9">
        <reference id="6041381794867197945" name="resourceType" index="28hnH2" />
      </concept>
      <concept id="4749802104983637053" name="Ref.structure.SortingPolicy" flags="ng" index="l6mf$">
        <property id="4749802104983637067" name="direction" index="l6mei" />
        <property id="4749802104983637066" name="criterion" index="l6mej" />
        <reference id="4749802104983637088" name="appliesToResource" index="l6meT" />
        <reference id="4749802104983637090" name="inContext" index="l6meV" />
      </concept>
      <concept id="8211790453394313185" name="Ref.structure.AutomationAction" flags="ng" index="2xtiK9">
        <property id="8211790453394313209" name="kind" index="2xtiKh" />
        <property id="8211790453394313210" name="message" index="2xtiKi" />
      </concept>
      <concept id="8211790453394313161" name="Ref.structure.AutomationCondition" flags="ng" index="2xtiKx">
        <reference id="1362352576491186694" name="field" index="1ms6pP" />
        <child id="1876292974281914365" name="keywords" index="3SET_T" />
      </concept>
      <concept id="8641311204900321898" name="Ref.structure.AuthorizationRule" flags="ng" index="2IgU2F">
        <property id="8641311204900472292" name="allowedAction" index="2InxW_" />
        <reference id="6041381794867197731" name="context" index="28hnIo" />
        <reference id="6041381794867197732" name="resourceTarget" index="28hnIv" />
        <reference id="6041381794867197707" name="feedbackTarget" index="28hnIK" />
        <reference id="4020620510182583077" name="actor" index="1LQjoC" />
      </concept>
      <concept id="8641311204900321916" name="Ref.structure.Attribute" flags="ng" index="2IgU2X">
        <property id="8641311204900321919" name="required" index="2IgU2Y" />
        <property id="8641311204900321918" name="type" index="2IgU2Z" />
      </concept>
      <concept id="3890156942413033123" name="Ref.structure.UserType" flags="ng" index="3$Wfe3">
        <property id="8641311204900472258" name="kind" index="2InxW3" />
        <child id="746375748528706432" name="superType" index="3UnFH9" />
      </concept>
      <concept id="3890156942413033126" name="Ref.structure.FeedbackPolicy" flags="ng" index="3$Wfe6" />
      <concept id="3890156942413033129" name="Ref.structure.FeedbackType" flags="ng" index="3$Wfe9">
        <property id="4749802104983637076" name="polarity" index="l6med" />
        <property id="4020620510182532810" name="subjectScope" index="1LQ7J7" />
        <property id="4020620510182532801" name="kind" index="1LQ7Jc" />
      </concept>
      <concept id="3890156942413033132" name="Ref.structure.FeedbackDefinition" flags="ng" index="3$Wfec">
        <property id="4749802104983637084" name="verificationRequirement" index="l6me5" />
        <reference id="6041381794867197736" name="feedbackType" index="28hnIj" />
        <reference id="6041381794867197735" name="subjectResource" index="28hnIs" />
        <reference id="746375748528706434" name="author" index="3UnFHb" />
        <child id="6041381794867197713" name="feedbackPolicy" index="28hnIE" />
      </concept>
      <concept id="3890156942413033138" name="Ref.structure.ValidationRule" flags="ng" index="3$Wfei">
        <property id="8641311204900472293" name="kind" index="2InxW$" />
        <property id="8641311204900472299" name="expression" index="2InxWE" />
        <property id="8641311204900472298" name="severity" index="2InxWF" />
        <property id="8641311204900472300" name="implementationId" index="2InxWH" />
        <reference id="6041381794867197730" name="contextType" index="28hnIp" />
        <reference id="6041381794867197729" name="userType" index="28hnIq" />
        <reference id="6041381794867197728" name="resourceType" index="28hnIr" />
        <reference id="6041381794867197708" name="feedbackDefinition" index="28hnIR" />
        <reference id="4020620510182583086" name="invokedBy" index="1LQjoz" />
      </concept>
      <concept id="3890156942413033141" name="Ref.structure.AutomationRule" flags="ng" index="3$Wfel">
        <property id="8641311204900472301" name="trigger" index="2InxWG" />
        <reference id="6041381794867197727" name="uses" index="28hnI$" />
        <reference id="6041381794867197726" name="inContext" index="28hnI_" />
        <reference id="6041381794867197724" name="context" index="28hnIB" />
        <reference id="6041381794867197705" name="feedbackDefinition" index="28hnIM" />
        <child id="8211790453394313214" name="conditions" index="2xtiKm" />
        <child id="8211790453394313215" name="actions" index="2xtiKn" />
      </concept>
      <concept id="3890156942413033144" name="Ref.structure.VerificationPolicy" flags="ng" index="3$Wfeo">
        <property id="8641311204900472305" name="appliesWhen" index="2InxWK" />
        <property id="8641311204900472304" name="mode" index="2InxWL" />
        <reference id="6041381794867197704" name="feedbackDefinition" index="28hnIN" />
      </concept>
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <property id="4020620510182583079" name="version" index="1LQjoE" />
        <child id="4749802105023132892" name="validationRule" index="mDdG5" />
        <child id="4749802105023132879" name="sortingPolicy" index="mDdGm" />
        <child id="4749802105023132869" name="feedbackDefinition" index="mDdGs" />
        <child id="4749802105023132859" name="feedbackType" index="mDdHy" />
        <child id="4749802105010072477" name="userType" index="nroh4" />
        <child id="8641311204900321897" name="authorizationRule" index="2IgU2C" />
        <child id="8641311204900321896" name="resourceType" index="2IgU2D" />
        <child id="8641311204900321901" name="verificationPolicy" index="2IgU2G" />
        <child id="3890156942413033150" name="automationRule" index="3$Wfeu" />
        <child id="3890156942413033162" name="contextType" index="3$WffE" />
        <child id="3890156942413033168" name="moderationPolicy" index="3$WffK" />
        <child id="3890156942413033176" name="resourceRelation" index="3$WffS" />
      </concept>
      <concept id="3890156942413033112" name="Ref.structure.ResourceRelation" flags="ng" index="3$WfeS">
        <property id="8641311204900368825" name="targetCardinality" index="2In6HS" />
        <property id="8641311204900368824" name="sourceCardinality" index="2In6HT" />
        <property id="8641311204900368827" name="recursive" index="2In6HU" />
        <property id="8641311204900368826" name="containment" index="2In6HV" />
        <reference id="6041381794867197710" name="targetResourceType" index="28hnIP" />
        <reference id="8641311204900368828" name="sourceResourceType" index="2In6HX" />
      </concept>
      <concept id="3890156942413033115" name="Ref.structure.ContextType" flags="ng" index="3$WfeV">
        <property id="8641311204900472246" name="contextKind" index="2InxXR" />
        <child id="6041381794867197943" name="resourceTypeLink" index="28hnHc" />
      </concept>
      <concept id="3890156942413033117" name="Ref.structure.ModerationPolicy" flags="ng" index="3$WfeX">
        <property id="8641311204900472265" name="trigger" index="2InxW8" />
        <property id="8641311204900472264" name="mode" index="2InxW9" />
        <property id="8641311204900472266" name="decision" index="2InxWb" />
        <reference id="6041381794867197723" name="inContext" index="28hnIw" />
        <reference id="6041381794867197722" name="monitorsResource" index="28hnIx" />
        <reference id="6041381794867197718" name="executedBy" index="28hnIH" />
        <reference id="6041381794867197706" name="monitorsFeedback" index="28hnIL" />
      </concept>
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$">
        <property id="4020620510182583082" name="supportsMedia" index="1LQjoB" />
        <child id="8641311204900368822" name="attribute" index="2In6HR" />
      </concept>
      <concept id="1876292974281914363" name="Ref.structure.ConditionValue" flags="ng" index="3SET_Z">
        <property id="1876292974281914364" name="word" index="3SET_S" />
      </concept>
      <concept id="746375748528706429" name="Ref.structure.UserTypeSuperType" flags="ng" index="3UnFIO">
        <reference id="746375748528706430" name="superType" index="3UnFIR" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="77Q8YzlE7hS">
    <property role="TrG5h" value="YoutubeRef" />
    <property role="1LQjoE" value="1.0.0" />
    <node concept="2IgU2F" id="77Q8YzlUPUA" role="2IgU2C">
      <property role="TrG5h" value="UserCanReactVideo" />
      <property role="2InxW_" value="7vG6G7pGwnp/VOTE" />
      <ref role="28hnIK" node="77Q8YzlPhyc" resolve="LikeOnVideo" />
      <ref role="28hnIo" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnIv" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="1LQjoC" node="77Q8YzlE7i2" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlUPUB" role="2IgU2C">
      <property role="TrG5h" value="UserCanReactComment" />
      <property role="2InxW_" value="7vG6G7pGwnp/VOTE" />
      <ref role="28hnIK" node="77Q8YzlPhye" resolve="LikeOnComment" />
      <ref role="28hnIo" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnIv" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="1LQjoC" node="77Q8YzlE7i2" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlUPUC" role="2IgU2C">
      <property role="TrG5h" value="UserCanReportVideo" />
      <property role="2InxW_" value="7vG6G7pGwnq/REPORT" />
      <ref role="28hnIK" node="77Q8YzlPhyg" resolve="ReportOnVideo" />
      <ref role="28hnIo" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnIv" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="1LQjoC" node="77Q8YzlE7i2" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlUPUD" role="2IgU2C">
      <property role="TrG5h" value="UserCanReportComment" />
      <property role="2InxW_" value="7vG6G7pGwnq/REPORT" />
      <ref role="28hnIK" node="77Q8YzlPhyi" resolve="ReportOnComment" />
      <ref role="28hnIo" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnIv" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="1LQjoC" node="77Q8YzlE7i2" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlUPUE" role="2IgU2C">
      <property role="TrG5h" value="UserCanSubscribeChannel" />
      <property role="2InxW_" value="7vG6G7pGwnr/SUBSCRIBE" />
      <ref role="28hnIK" node="77Q8YzlPhyk" resolve="SubscriptionOnChannel" />
      <ref role="28hnIo" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnIv" node="77Q8YzlE7i9" resolve="Channel" />
      <ref role="1LQjoC" node="77Q8YzlE7i2" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlUPUF" role="2IgU2C">
      <property role="TrG5h" value="ModeratorCanModerateVideo" />
      <property role="2InxW_" value="7vG6G7pGwnt/MODERATE" />
      <ref role="28hnIK" node="77Q8YzlPhyg" resolve="ReportOnVideo" />
      <ref role="28hnIo" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnIv" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="1LQjoC" node="77Q8YzlE7i5" resolve="Moderator" />
    </node>
    <node concept="3$WfeX" id="77Q8YzlUPUz" role="3$WffK">
      <property role="TrG5h" value="VideoModerationPolicy" />
      <property role="2InxW9" value="7vG6G7pGwn7/HYBRID" />
      <property role="2InxW8" value="77Q8YzgwKZ6/ON_REPORT_THRESHOLD" />
      <ref role="28hnIL" node="77Q8YzlPhyg" resolve="ReportOnVideo" />
      <ref role="28hnIH" node="77Q8YzlE7i5" resolve="Moderator" />
      <ref role="28hnIx" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="28hnIw" node="77Q8YzlE7hT" resolve="ChannelContext" />
    </node>
    <node concept="3$WfeX" id="77Q8YzlUPU$" role="3$WffK">
      <property role="TrG5h" value="CommentModerationPolicy" />
      <property role="2InxW9" value="7vG6G7pGwn7/HYBRID" />
      <property role="2InxW8" value="77Q8YzgwKZ6/ON_REPORT_THRESHOLD" />
      <property role="2InxWb" value="7vG6G7pGwne/HIDDEN" />
      <ref role="28hnIL" node="77Q8YzlPhyi" resolve="ReportOnComment" />
      <ref role="28hnIH" node="77Q8YzlE7i5" resolve="Moderator" />
      <ref role="28hnIx" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="28hnIw" node="77Q8YzlE7hT" resolve="ChannelContext" />
    </node>
    <node concept="3$Wfel" id="77Q8YzlUPUt" role="3$Wfeu">
      <property role="TrG5h" value="AutoVideoModeration" />
      <property role="2InxWG" value="77Q8YzgwKZ4/ON_REPORT_SUBMITTED" />
      <ref role="28hnIM" node="77Q8YzlPhyg" resolve="ReportOnVideo" />
      <ref role="28hnIB" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="28hnI_" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnI$" node="77Q8YzlUPUr" resolve="VideoContentValidation" />
      <node concept="2xtiKx" id="1C9VCj$ak7G" role="2xtiKm">
        <property role="TrG5h" value="TitleRestrictedWords" />
        <ref role="1ms6pP" node="77Q8YzlE7ig" resolve="Title" />
        <node concept="3SET_Z" id="1C9VCj$ak7H" role="3SET_T">
          <property role="3SET_S" value="WAR" />
        </node>
      </node>
      <node concept="2xtiK9" id="77Q8YzlUPUv" role="2xtiKn">
        <property role="TrG5h" value="FlagVideoForReviewAction" />
        <property role="2xtiKh" value="77Q8YzgwKZF/FLAG_CONTENT" />
        <property role="2xtiKi" value="flag_video_for_review" />
      </node>
    </node>
    <node concept="3$Wfel" id="77Q8YzlUPUw" role="3$Wfeu">
      <property role="TrG5h" value="AutoCommentModeration" />
      <property role="2InxWG" value="77Q8YzgwKZ4/ON_REPORT_SUBMITTED" />
      <ref role="28hnIM" node="77Q8YzlPhyi" resolve="ReportOnComment" />
      <ref role="28hnIB" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="28hnI_" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="28hnI$" node="77Q8YzlUPUs" resolve="CommentContentValidation" />
      <node concept="2xtiKx" id="1C9VCjzUwcE" role="2xtiKm">
        <property role="TrG5h" value="DescriptionCheck" />
        <ref role="1ms6pP" node="77Q8YzlJGRq" resolve="Text" />
        <node concept="3SET_Z" id="1C9VCjzUwcG" role="3SET_T">
          <property role="3SET_S" value="war" />
        </node>
      </node>
      <node concept="2xtiK9" id="77Q8YzlUPUy" role="2xtiKn">
        <property role="TrG5h" value="HideOrFlagCommentAction" />
        <property role="2xtiKh" value="77Q8YzgwKZH/HIDE_CONTENT" />
        <property role="2xtiKi" value="hide_or_flag_comment" />
      </node>
    </node>
    <node concept="3$Wfei" id="77Q8YzlUPUr" role="mDdG5">
      <property role="TrG5h" value="VideoContentValidation" />
      <property role="2InxW$" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWF" value="7vG6G7pGwny/WARNING" />
      <property role="2InxWE" value="regex(detect_policy_violation_or_spam)" />
      <property role="2InxWH" value="youtube_video_validation" />
      <ref role="28hnIR" node="77Q8YzlPhyg" resolve="ReportOnVideo" />
      <ref role="28hnIr" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="28hnIq" node="77Q8YzlE7i5" resolve="Moderator" />
      <ref role="28hnIp" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="1LQjoz" node="77Q8YzlUPUt" resolve="AutoVideoModeration" />
    </node>
    <node concept="3$Wfei" id="77Q8YzlUPUs" role="mDdG5">
      <property role="TrG5h" value="CommentContentValidation" />
      <property role="2InxWE" value="regex.contains(detect_toxicity_or_blocked_terms)" />
      <property role="2InxWH" value="youtube_comment_validation" />
      <property role="2InxWF" value="7vG6G7pGwny/WARNING" />
      <property role="2InxW$" value="7vG6G7pGwnC/AUTOMATIC" />
      <ref role="28hnIq" node="77Q8YzlE7i5" resolve="Moderator" />
      <ref role="28hnIR" node="77Q8YzlPhyi" resolve="ReportOnComment" />
      <ref role="28hnIr" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="28hnIp" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="1LQjoz" node="77Q8YzlUPUw" resolve="AutoCommentModeration" />
    </node>
    <node concept="l6mf$" id="77Q8YzlPhym" role="mDdGm">
      <property role="TrG5h" value="VideoListingSort" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <property role="l6mej" value="47EFX_kWWL4/DATE" />
      <ref role="l6meT" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="l6meV" node="77Q8YzlE7hT" resolve="ChannelContext" />
    </node>
    <node concept="l6mf$" id="77Q8YzlPhyn" role="mDdGm">
      <property role="TrG5h" value="TrendingFeedSort" />
      <property role="l6mej" value="47EFX_kWWL5/VALUE" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meT" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="l6meV" node="77Q8YzlE7hY" resolve="TrendingContext" />
    </node>
    <node concept="l6mf$" id="77Q8YzlPhyo" role="mDdGm">
      <property role="TrG5h" value="RecommendationSort" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meT" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="l6meV" node="77Q8YzlE7i0" resolve="RecommendationContext" />
    </node>
    <node concept="l6mf$" id="77Q8YzlUPUp" role="mDdGm">
      <property role="TrG5h" value="CommentSortByDate" />
      <property role="l6mej" value="47EFX_kWWL4/DATE" />
      <ref role="l6meT" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="l6meV" node="77Q8YzlE7hT" resolve="ChannelContext" />
    </node>
    <node concept="l6mf$" id="77Q8YzlUPUq" role="mDdGm">
      <property role="TrG5h" value="CommentSortByValue" />
      <property role="l6mej" value="47EFX_kWWL5/VALUE" />
      <ref role="l6meV" node="77Q8YzlE7hT" resolve="ChannelContext" />
      <ref role="l6meT" node="77Q8YzlJGRo" resolve="Comment" />
    </node>
    <node concept="3$Wfec" id="77Q8YzlPhyc" role="mDdGs">
      <property role="TrG5h" value="LikeOnVideo" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="3UnFHb" node="77Q8YzlE7i2" resolve="User" />
      <ref role="28hnIj" node="77Q8YzlPhy9" resolve="ReactionType" />
      <node concept="3$Wfe6" id="77Q8YzlPhyd" role="28hnIE">
        <property role="TrG5h" value="LikeOnVideoPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlPhye" role="mDdGs">
      <property role="TrG5h" value="LikeOnComment" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="28hnIj" node="77Q8YzlPhy9" resolve="ReactionType" />
      <ref role="3UnFHb" node="77Q8YzlE7i2" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlPhyf" role="28hnIE">
        <property role="TrG5h" value="LikeOnCommentPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlPhyg" role="mDdGs">
      <property role="TrG5h" value="ReportOnVideo" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="28hnIj" node="77Q8YzlPhya" resolve="ReportType" />
      <ref role="3UnFHb" node="77Q8YzlE7i2" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlPhyh" role="28hnIE">
        <property role="TrG5h" value="ReportOnVideoPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlPhyi" role="mDdGs">
      <property role="TrG5h" value="ReportOnComment" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="28hnIj" node="77Q8YzlPhya" resolve="ReportType" />
      <ref role="3UnFHb" node="77Q8YzlE7i2" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlPhyj" role="28hnIE">
        <property role="TrG5h" value="ReportOnCommentPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlPhyk" role="mDdGs">
      <property role="TrG5h" value="SubscriptionOnChannel" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE7i9" resolve="Channel" />
      <ref role="28hnIj" node="77Q8YzlPhyb" resolve="SubscriptionType" />
      <ref role="3UnFHb" node="77Q8YzlE7i2" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlPhyl" role="28hnIE">
        <property role="TrG5h" value="SubscriptionPolicy" />
      </node>
    </node>
    <node concept="3$Wfe9" id="77Q8YzlPhy9" role="mDdHy">
      <property role="TrG5h" value="ReactionType" />
      <property role="1LQ7Jc" value="3vc7gP656r5/REACTION" />
      <property role="1LQ7J7" value="3vc7gP656rc/RESOURCE_ONLY" />
      <property role="l6med" value="47EFX_kWWLh/LIKE_DISLIKE" />
    </node>
    <node concept="3$Wfe9" id="77Q8YzlPhya" role="mDdHy">
      <property role="TrG5h" value="ReportType" />
      <property role="1LQ7Jc" value="3vc7gP656r7/REPORT" />
      <property role="1LQ7J7" value="3vc7gP656rc/RESOURCE_ONLY" />
      <property role="l6med" value="47EFX_kWWLg/NONE" />
    </node>
    <node concept="3$Wfe9" id="77Q8YzlPhyb" role="mDdHy">
      <property role="TrG5h" value="SubscriptionType" />
      <property role="1LQ7Jc" value="3vc7gP656r8/SUBSCRIPTION" />
      <property role="1LQ7J7" value="3vc7gP656rc/RESOURCE_ONLY" />
      <property role="l6med" value="47EFX_kWWLg/NONE" />
    </node>
    <node concept="3$WfeS" id="77Q8YzlJGRs" role="3$WffS">
      <property role="TrG5h" value="ChannelContainsVideo" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <property role="2In6HV" value="true" />
      <ref role="2In6HX" node="77Q8YzlE7i9" resolve="Channel" />
      <ref role="28hnIP" node="77Q8YzlE7ie" resolve="Video" />
    </node>
    <node concept="3$WfeS" id="77Q8YzlPhy7" role="3$WffS">
      <property role="TrG5h" value="VideoContainsComment" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <property role="2In6HV" value="true" />
      <ref role="2In6HX" node="77Q8YzlE7ie" resolve="Video" />
      <ref role="28hnIP" node="77Q8YzlJGRo" resolve="Comment" />
    </node>
    <node concept="3$WfeS" id="77Q8YzlPhy8" role="3$WffS">
      <property role="TrG5h" value="CommentRepliesComment" />
      <property role="2In6HU" value="true" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <ref role="2In6HX" node="77Q8YzlJGRo" resolve="Comment" />
      <ref role="28hnIP" node="77Q8YzlJGRo" resolve="Comment" />
    </node>
    <node concept="3$Wff$" id="77Q8YzlE7i9" role="2IgU2D">
      <property role="TrG5h" value="Channel" />
      <node concept="2IgU2X" id="77Q8YzlE7ib" role="2In6HR">
        <property role="TrG5h" value="Name" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE7ic" role="2In6HR">
        <property role="TrG5h" value="Description" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE7id" role="2In6HR">
        <property role="TrG5h" value="CreationDate" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wff$" id="77Q8YzlE7ie" role="2IgU2D">
      <property role="TrG5h" value="Video" />
      <property role="1LQjoB" value="true" />
      <node concept="2IgU2X" id="77Q8YzlE7ig" role="2In6HR">
        <property role="TrG5h" value="Title" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE7ih" role="2In6HR">
        <property role="TrG5h" value="Video" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlJGRl" role="2In6HR">
        <property role="TrG5h" value="UploadDate" />
        <property role="2IgU2Y" value="true" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlJGRm" role="2In6HR">
        <property role="TrG5h" value="Duration" />
        <property role="2IgU2Z" value="7vG6G7pFVDN/NUMBER" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlJGRn" role="2In6HR">
        <property role="TrG5h" value="CommentStatus" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wff$" id="77Q8YzlJGRo" role="2IgU2D">
      <property role="TrG5h" value="Comment" />
      <node concept="2IgU2X" id="77Q8YzlJGRq" role="2In6HR">
        <property role="TrG5h" value="Text" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlJGRr" role="2In6HR">
        <property role="TrG5h" value="CreationDate" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wfe3" id="77Q8YzlE7i2" role="nroh4">
      <property role="TrG5h" value="User" />
      <property role="2InxW3" value="7vG6G7pGwmX/GENERIC" />
    </node>
    <node concept="3$Wfe3" id="77Q8YzlE7i3" role="nroh4">
      <property role="TrG5h" value="Creator" />
      <property role="2InxW3" value="7vG6G7pGwn0/CREATOR" />
      <node concept="3UnFIO" id="4b31TA4ZheL" role="3UnFH9">
        <ref role="3UnFIR" node="77Q8YzlE7i2" resolve="User" />
      </node>
      <node concept="3UnFIO" id="4b31TA4ZheM" role="3UnFH9">
        <ref role="3UnFIR" node="77Q8YzlE7i5" resolve="Moderator" />
      </node>
    </node>
    <node concept="3$Wfe3" id="77Q8YzlE7i5" role="nroh4">
      <property role="TrG5h" value="Moderator" />
      <property role="2InxW3" value="7vG6G7pGwn1/MODERATOR" />
      <node concept="3UnFIO" id="4b31TA52y4K" role="3UnFH9">
        <ref role="3UnFIR" node="77Q8YzlE7i2" resolve="User" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE7hT" role="3$WffE">
      <property role="TrG5h" value="ChannelContext" />
      <property role="2InxXR" value="7vG6G7pGwmO/CHANNEL" />
      <node concept="28hnH9" id="4b31TA54zzs" role="28hnHc">
        <ref role="28hnH2" node="77Q8YzlE7i9" resolve="Channel" />
      </node>
      <node concept="28hnH9" id="4b31TA54zzt" role="28hnHc">
        <ref role="28hnH2" node="77Q8YzlE7ie" resolve="Video" />
      </node>
      <node concept="28hnH9" id="4b31TA54zzu" role="28hnHc">
        <ref role="28hnH2" node="77Q8YzlJGRo" resolve="Comment" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE7hY" role="3$WffE">
      <property role="TrG5h" value="TrendingContext" />
      <property role="2InxXR" value="7vG6G7pGwmO/CHANNEL" />
      <node concept="28hnH9" id="4b31TA54zzr" role="28hnHc">
        <ref role="28hnH2" node="77Q8YzlE7ie" resolve="Video" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE7i0" role="3$WffE">
      <property role="TrG5h" value="RecommendationContext" />
      <property role="2InxXR" value="7vG6G7pGwmO/CHANNEL" />
      <node concept="28hnH9" id="4b31TA54zzq" role="28hnHc">
        <ref role="28hnH2" node="77Q8YzlE7ie" resolve="Video" />
      </node>
    </node>
    <node concept="3$Wfeo" id="4AWrYK7TKI" role="2IgU2G">
      <property role="TrG5h" value="CommentReview" />
      <property role="2InxWL" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWK" value="77Q8YzgwKYX/ON_FEEDBACK_CREATE" />
      <ref role="28hnIN" node="77Q8YzlPhyi" resolve="ReportOnComment" />
    </node>
  </node>
</model>

