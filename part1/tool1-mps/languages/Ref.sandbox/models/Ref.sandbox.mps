<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:42562a9e-3d64-45b7-ab65-7a88d741ffc1(Ref.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="75b0389b-83f9-4003-b95d-1b8432efd2b6" name="Ref" version="0" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="2" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="12" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="19" />
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="2" />
    <use id="446c26eb-2b7b-4bf0-9b35-f83fa582753e" name="jetbrains.mps.lang.modelapi" version="0" />
    <use id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures" version="0" />
  </languages>
  <imports>
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="z1c3" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project(MPS.Core/)" />
    <import index="hlw7" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.ide.save(MPS.Platform/)" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="79ha" ref="r:2876f1ee-0b45-4db5-8c09-0682cdee5c67(jetbrains.mps.tool.environment)" />
    <import index="vndm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.language(MPS.Core/)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="bd8o" ref="3a8d80d2-32d9-f1f2-4443-6a1111e12ef3/java:com.intellij.openapi.application(MPS.Boot/)" />
  </imports>
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
      <concept id="8211790453394313185" name="Ref.structure.Action" flags="ng" index="2xtiK9">
        <property id="8211790453394313209" name="kind" index="2xtiKh" />
        <property id="8211790453394313210" name="message" index="2xtiKi" />
      </concept>
      <concept id="8211790453394313161" name="Ref.structure.Condition" flags="ng" index="2xtiKx">
        <property id="8211790453394313183" name="value" index="2xtiKR" />
        <reference id="1362352576491186694" name="field" index="1ms6pP" />
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
        <property id="4749802104983637077" name="allowsText" index="l6mec" />
        <property id="4749802104983637076" name="polarity" index="l6med" />
        <property id="4020620510182532815" name="hasRating" index="1LQ7J2" />
        <property id="4020620510182532810" name="subjectScope" index="1LQ7J7" />
        <property id="4020620510182532801" name="kind" index="1LQ7Jc" />
        <property id="4020620510182532818" name="allowsMedia" index="1LQ7Jv" />
      </concept>
      <concept id="3890156942413033132" name="Ref.structure.FeedbackDefinition" flags="ng" index="3$Wfec">
        <property id="4749802104983637084" name="verificationRequirement" index="l6me5" />
        <property id="4020620510182532820" name="uniquePerAuthorTarget" index="1LQ7Jp" />
        <reference id="6041381794867197736" name="feedbackType" index="28hnIj" />
        <reference id="6041381794867197735" name="subjectResource" index="28hnIs" />
        <reference id="746375748528706434" name="author" index="3UnFHb" />
        <child id="6041381794867197714" name="ratingPolicy" index="28hnID" />
        <child id="6041381794867197713" name="feedbackPolicy" index="28hnIE" />
      </concept>
      <concept id="3890156942413033135" name="Ref.structure.RatingPolicy" flags="ng" index="3$Wfef">
        <property id="746375748528670723" name="minValue" index="3UnM3a" />
        <property id="746375748528670725" name="maxValue" index="3UnM3c" />
        <property id="746375748528670726" name="step" index="3UnM3f" />
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
        <reference id="6041381794867197706" name="feedbackDefinition" index="28hnIL" />
      </concept>
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$">
        <property id="4020620510182583082" name="supportsMedia" index="1LQjoB" />
        <child id="8641311204900368822" name="attribute" index="2In6HR" />
      </concept>
      <concept id="746375748528706429" name="Ref.structure.UserTypeSuperType" flags="ng" index="3UnFIO">
        <reference id="746375748528706430" name="superType" index="3UnFIR" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="47EFX_mxMIp">
    <property role="TrG5h" value="AmazonRef" />
    <property role="1LQjoE" value="1.0.0" />
    <node concept="3$WfeX" id="77Q8YzluWDn" role="3$WffK">
      <property role="TrG5h" value="ReviewModerationPolicy " />
      <property role="2InxW8" value="77Q8YzgwKZ6/ON_REPORT_THRESHOLD" />
      <property role="2InxW9" value="7vG6G7pGwn7/HYBRID" />
      <ref role="28hnIL" node="47EFX_nz$PB" resolve="ProductReview" />
      <ref role="28hnIH" node="47EFX_nz$Pp" resolve="Moderator" />
      <ref role="28hnIx" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="28hnIw" node="47EFX_nz$Pf" resolve="ModerationContext" />
    </node>
    <node concept="3$Wfel" id="77Q8YzluUbU" role="3$Wfeu">
      <property role="TrG5h" value="ReviewGuardAutomation" />
      <property role="2InxWG" value="77Q8YzgwKYX/ON_FEEDBACK_CREATE" />
      <ref role="28hnIM" node="47EFX_nz$PB" resolve="ProductReview" />
      <ref role="28hnIB" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="28hnI_" node="47EFX_nz$Pf" resolve="ModerationContext" />
      <ref role="28hnI$" node="47EFX_nz$PR" resolve="ReviewValidationRule" />
      <node concept="2xtiKx" id="1bC37d4ZRLk" role="2xtiKm">
        <property role="2xtiKR" value="g" />
        <property role="TrG5h" value="LOl" />
        <ref role="1ms6pP" node="47EFX_nz$Pt" resolve="Description" />
      </node>
      <node concept="2xtiK9" id="77Q8YzluUbW" role="2xtiKn">
        <property role="TrG5h" value="FlagReview" />
        <property role="2xtiKh" value="77Q8YzgwKZF/FLAG_CONTENT" />
        <property role="2xtiKi" value="Content Restricted" />
      </node>
    </node>
    <node concept="3$Wfeo" id="47EFX_nz$PZ" role="2IgU2G">
      <property role="TrG5h" value="ProductReviewVerificationAuto" />
      <property role="2InxWL" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWK" value="77Q8YzgwKYX/ON_FEEDBACK_CREATE" />
      <ref role="28hnIN" node="47EFX_nz$PB" resolve="ProductReview" />
    </node>
    <node concept="3$Wfeo" id="77Q8YzlE6In" role="2IgU2G">
      <property role="TrG5h" value="ProductReviewVerificationManual " />
      <property role="2InxWL" value="7vG6G7pGwnD/MANUAL" />
      <property role="2InxWK" value="77Q8YzgwKZ8/ON_MANUAL_REQUEST" />
      <ref role="28hnIN" node="47EFX_nz$PB" resolve="ProductReview" />
    </node>
    <node concept="2IgU2F" id="47EFX_nz$PV" role="2IgU2C">
      <property role="TrG5h" value="BuyerCanCreateReview" />
      <property role="2InxW_" value="7vG6G7pGwnk/CREATE" />
      <ref role="28hnIK" node="47EFX_nz$PB" resolve="ProductReview" />
      <ref role="28hnIo" node="47EFX_nz$Pa" resolve="CatalogContext" />
      <ref role="28hnIv" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="1LQjoC" node="47EFX_nz$Pl" resolve="Reviewer" />
    </node>
    <node concept="2IgU2F" id="47EFX_nz$PW" role="2IgU2C">
      <property role="TrG5h" value="ReviewerCanCreateReview" />
      <property role="2InxW_" value="7vG6G7pGwnk/CREATE" />
      <ref role="28hnIK" node="47EFX_nz$PB" resolve="ProductReview" />
      <ref role="28hnIo" node="47EFX_nz$Pa" resolve="CatalogContext" />
      <ref role="28hnIv" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="1LQjoC" node="47EFX_nz$Pl" resolve="Reviewer" />
    </node>
    <node concept="2IgU2F" id="47EFX_nz$PX" role="2IgU2C">
      <property role="TrG5h" value="ModeratorCanModerateReviews" />
      <property role="2InxW_" value="7vG6G7pGwnt/MODERATE" />
      <ref role="28hnIK" node="47EFX_nz$PB" resolve="ProductReview" />
      <ref role="28hnIo" node="47EFX_nz$Pf" resolve="ModerationContext" />
      <ref role="28hnIv" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="1LQjoC" node="47EFX_nz$Pp" resolve="Moderator" />
    </node>
    <node concept="2IgU2F" id="47EFX_nz$PY" role="2IgU2C">
      <property role="TrG5h" value="BuyerCanVoteHelpful" />
      <property role="2InxW_" value="7vG6G7pGwnp/VOTE" />
      <ref role="28hnIK" node="47EFX_nz$PE" resolve="HelpfulVoteOnComment" />
      <ref role="28hnIo" node="47EFX_nz$Pa" resolve="CatalogContext" />
      <ref role="28hnIv" node="47EFX_nz$PF" resolve="CommentReview" />
      <ref role="1LQjoC" node="47EFX_nz$Pm" resolve="Buyer" />
    </node>
    <node concept="3$Wfei" id="47EFX_nz$PR" role="mDdG5">
      <property role="TrG5h" value="ReviewValidationRule" />
      <property role="2InxW$" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWF" value="7vG6G7pGwnz/ERROR" />
      <property role="2InxWE" value="rating_in_range_and_non_empty_text" />
      <property role="2InxWH" value="amazon_review_validation" />
      <ref role="28hnIR" node="47EFX_nz$PB" resolve="ProductReview" />
      <ref role="28hnIr" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="28hnIq" node="47EFX_nz$Pl" resolve="Reviewer" />
      <ref role="28hnIp" node="47EFX_nz$Pa" resolve="CatalogContext" />
      <ref role="1LQjoz" node="77Q8YzluUbU" resolve="ReviewGuardAutomation" />
    </node>
    <node concept="l6mf$" id="47EFX_nz$PL" role="mDdGm">
      <property role="TrG5h" value="ProductListingSort" />
      <property role="l6mej" value="47EFX_kWWL5/VALUE" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meT" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="l6meV" node="47EFX_nz$Pa" resolve="CatalogContext" />
    </node>
    <node concept="l6mf$" id="47EFX_nz$PM" role="mDdGm">
      <property role="TrG5h" value="ProductSearchSort" />
      <ref role="l6meT" node="47EFX_nz$Pq" resolve="Product" />
    </node>
    <node concept="l6mf$" id="47EFX_nz$PN" role="mDdGm">
      <property role="TrG5h" value="CommentSortByDate" />
      <property role="l6mej" value="47EFX_kWWL4/DATE" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meT" node="47EFX_nz$PF" resolve="CommentReview" />
      <ref role="l6meV" node="47EFX_nz$Pa" resolve="CatalogContext" />
    </node>
    <node concept="l6mf$" id="47EFX_nz$PP" role="mDdGm">
      <property role="TrG5h" value="CommentSortByRating" />
      <ref role="l6meT" node="47EFX_nz$PF" resolve="CommentReview" />
      <ref role="l6meV" node="47EFX_nz$Pa" resolve="CatalogContext" />
    </node>
    <node concept="3$Wfec" id="47EFX_nz$PB" role="mDdGs">
      <property role="TrG5h" value="ProductReview" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <property role="1LQ7Jp" value="true" />
      <ref role="28hnIs" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="28hnIj" node="47EFX_nz$P_" resolve="ReviewType" />
      <ref role="3UnFHb" node="47EFX_nz$Pl" resolve="Reviewer" />
      <node concept="3$Wfe6" id="47EFX_nz$PC" role="28hnIE">
        <property role="TrG5h" value="ProductReviewPolicy" />
      </node>
      <node concept="3$Wfef" id="47EFX_nz$PD" role="28hnID">
        <property role="TrG5h" value="ProductReviewRating" />
        <property role="3UnM3a" value="1" />
        <property role="3UnM3c" value="5" />
        <property role="3UnM3f" value="1" />
      </node>
    </node>
    <node concept="3$Wfec" id="47EFX_nz$PE" role="mDdGs">
      <property role="TrG5h" value="HelpfulVoteOnComment" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIj" node="47EFX_nz$PA" resolve="HelpfulVoteType" />
      <ref role="28hnIs" node="47EFX_nz$PF" resolve="CommentReview" />
      <ref role="3UnFHb" node="47EFX_nz$Pm" resolve="Buyer" />
      <node concept="3$Wfe6" id="47EFX_nz$PJ" role="28hnIE">
        <property role="TrG5h" value="HelpfulVotePolicy" />
      </node>
    </node>
    <node concept="3$Wfe9" id="47EFX_nz$P_" role="mDdHy">
      <property role="TrG5h" value="ReviewType" />
      <property role="1LQ7Jc" value="3vc7gP656r4/REVIEW" />
      <property role="1LQ7J7" value="3vc7gP656rc/RESOURCE_ONLY" />
      <property role="1LQ7J2" value="true" />
      <property role="1LQ7Jv" value="true" />
      <property role="l6mec" value="true" />
      <property role="l6med" value="47EFX_kWWLg/NONE" />
    </node>
    <node concept="3$Wfe9" id="47EFX_nz$PA" role="mDdHy">
      <property role="TrG5h" value="HelpfulVoteType" />
      <property role="1LQ7Jc" value="3vc7gP656r6/VOTE" />
      <property role="1LQ7J7" value="3vc7gP656rc/RESOURCE_ONLY" />
      <property role="l6med" value="47EFX_kWWLi/UP_DOWN" />
    </node>
    <node concept="3$WfeS" id="47EFX_nz$Pz" role="3$WffS">
      <property role="TrG5h" value="OrderContainsOrderItem" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <ref role="2In6HX" node="47EFX_nz$Pu" resolve="Order" />
      <ref role="28hnIP" node="47EFX_nz$Px" resolve="OrderItem" />
    </node>
    <node concept="3$WfeS" id="47EFX_nz$P$" role="3$WffS">
      <property role="TrG5h" value="OrderItemTargetsProduct" />
      <property role="2In6HT" value="2" />
      <property role="2In6HS" value="1" />
      <ref role="2In6HX" node="47EFX_nz$Px" resolve="OrderItem" />
      <ref role="28hnIP" node="47EFX_nz$Pq" resolve="Product" />
    </node>
    <node concept="3$WfeS" id="47EFX_nz$PO" role="3$WffS">
      <property role="TrG5h" value="ProductContainsComment" />
      <property role="2In6HS" value="2" />
      <property role="2In6HT" value="1" />
      <property role="2In6HV" value="true" />
      <ref role="2In6HX" node="47EFX_nz$Pq" resolve="Product" />
      <ref role="28hnIP" node="47EFX_nz$PF" resolve="CommentReview" />
    </node>
    <node concept="3$Wff$" id="47EFX_nz$Pq" role="2IgU2D">
      <property role="TrG5h" value="Product" />
      <node concept="2IgU2X" id="47EFX_nz$Pr" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="47EFX_nz$Ps" role="2In6HR">
        <property role="TrG5h" value="Name" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="47EFX_nz$Pt" role="2In6HR">
        <property role="TrG5h" value="Description" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="1rkHUYT3wR7" role="2In6HR">
        <property role="TrG5h" value="CreatedAt" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
      </node>
    </node>
    <node concept="3$Wff$" id="47EFX_nz$Pu" role="2IgU2D">
      <property role="TrG5h" value="Order" />
      <node concept="2IgU2X" id="47EFX_nz$Pv" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="47EFX_nz$Pw" role="2In6HR">
        <property role="TrG5h" value="Date" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wff$" id="47EFX_nz$Px" role="2IgU2D">
      <property role="TrG5h" value="OrderItem" />
      <node concept="2IgU2X" id="47EFX_nz$Py" role="2In6HR">
        <property role="TrG5h" value="Quantity" />
        <property role="2IgU2Z" value="7vG6G7pFVDN/NUMBER" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wff$" id="47EFX_nz$PF" role="2IgU2D">
      <property role="TrG5h" value="CommentReview" />
      <property role="1LQjoB" value="true" />
      <node concept="2IgU2X" id="47EFX_nz$PG" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="47EFX_nz$PH" role="2In6HR">
        <property role="TrG5h" value="Text" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="47EFX_nz$PI" role="2In6HR">
        <property role="TrG5h" value="CreatedAt" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wfe3" id="47EFX_nz$Pl" role="nroh4">
      <property role="TrG5h" value="Reviewer" />
      <property role="2InxW3" value="7vG6G7pGwmX/GENERIC" />
    </node>
    <node concept="3$Wfe3" id="47EFX_nz$Pm" role="nroh4">
      <property role="TrG5h" value="Buyer" />
      <property role="2InxW3" value="7vG6G7pGwmY/BUYER" />
      <node concept="3UnFIO" id="47EFX_nz$Pn" role="3UnFH9">
        <property role="TrG5h" value="BuyerIsReviewer" />
        <ref role="3UnFIR" node="47EFX_nz$Pl" resolve="Reviewer" />
      </node>
    </node>
    <node concept="3$Wfe3" id="47EFX_nz$Po" role="nroh4">
      <property role="TrG5h" value="Seller" />
      <property role="2InxW3" value="7vG6G7pGwmZ/SELLER" />
    </node>
    <node concept="3$Wfe3" id="47EFX_nz$Pp" role="nroh4">
      <property role="TrG5h" value="Moderator" />
      <property role="2InxW3" value="7vG6G7pGwn1/MODERATOR" />
    </node>
    <node concept="3$WfeV" id="47EFX_nz$Pa" role="3$WffE">
      <property role="TrG5h" value="CatalogContext" />
      <property role="2InxXR" value="7vG6G7pGwmP/CATALOG" />
      <node concept="28hnH9" id="47EFX_nz$Pb" role="28hnHc">
        <property role="TrG5h" value="CatalogProductLink" />
        <ref role="28hnH2" node="47EFX_nz$Pq" resolve="Product" />
      </node>
      <node concept="28hnH9" id="47EFX_nz$Pd" role="28hnHc">
        <property role="TrG5h" value="CatalogOrderLink" />
        <ref role="28hnH2" node="47EFX_nz$Pu" resolve="Order" />
      </node>
      <node concept="28hnH9" id="47EFX_nz$Pe" role="28hnHc">
        <property role="TrG5h" value="CatalogOrderItemLink" />
        <ref role="28hnH2" node="47EFX_nz$Px" resolve="OrderItem" />
      </node>
      <node concept="28hnH9" id="47EFX_nz$PQ" role="28hnHc">
        <property role="TrG5h" value="CatalogCommentLink" />
        <ref role="28hnH2" node="47EFX_nz$PF" resolve="CommentReview" />
      </node>
    </node>
    <node concept="3$WfeV" id="47EFX_nz$Pf" role="3$WffE">
      <property role="TrG5h" value="ModerationContext" />
      <property role="2InxXR" value="7vG6G7pGwmP/CATALOG" />
      <node concept="28hnH9" id="47EFX_nz$Pg" role="28hnHc">
        <property role="TrG5h" value="ModerationProductLink" />
        <ref role="28hnH2" node="47EFX_nz$Pq" resolve="Product" />
      </node>
    </node>
    <node concept="3$WfeV" id="47EFX_nz$Ph" role="3$WffE">
      <property role="TrG5h" value="SearchContext" />
      <property role="2InxXR" value="7vG6G7pGwmP/CATALOG" />
      <node concept="28hnH9" id="47EFX_nz$Pi" role="28hnHc">
        <property role="TrG5h" value="SearchProductLink" />
        <ref role="28hnH2" node="47EFX_nz$Pq" resolve="Product" />
      </node>
    </node>
    <node concept="3$WfeV" id="47EFX_nz$Pj" role="3$WffE">
      <property role="TrG5h" value="RecommendationContext" />
      <property role="2InxXR" value="7vG6G7pGwmP/CATALOG" />
      <node concept="28hnH9" id="47EFX_nz$Pk" role="28hnHc">
        <property role="TrG5h" value="RecommendationProductLink" />
        <ref role="28hnH2" node="47EFX_nz$Pq" resolve="Product" />
      </node>
    </node>
  </node>
  <node concept="3$WfeP" id="77Q8YzlE6Io">
    <property role="TrG5h" value="RedditRef" />
    <property role="1LQjoE" value="1.0.0" />
    <node concept="2IgU2F" id="77Q8YzlE7hL" role="2IgU2C">
      <property role="TrG5h" value="UserCanVotePost" />
      <property role="2InxW_" value="7vG6G7pGwnp/VOTE" />
      <ref role="28hnIK" node="77Q8YzlE6IM" resolve="VoteOnPost" />
      <ref role="28hnIo" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="28hnIv" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="1LQjoC" node="77Q8YzlE6It" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlE7hO" role="2IgU2C">
      <property role="TrG5h" value="UserCanVoteComment" />
      <property role="2InxW_" value="7vG6G7pGwnp/VOTE" />
      <ref role="28hnIK" node="77Q8YzlE6IP" resolve="VoteOnComment" />
      <ref role="28hnIo" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="28hnIv" node="77Q8YzlE6IE" resolve="Comment" />
      <ref role="1LQjoC" node="77Q8YzlE6It" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlE7hP" role="2IgU2C">
      <property role="TrG5h" value="UserCanReportPost" />
      <property role="2InxW_" value="7vG6G7pGwnq/REPORT" />
      <ref role="28hnIK" node="77Q8YzlE6IR" resolve="ReportOnPost" />
      <ref role="28hnIo" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="28hnIv" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="1LQjoC" node="77Q8YzlE6It" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlE7hQ" role="2IgU2C">
      <property role="TrG5h" value="UserCanReportComment" />
      <property role="2InxW_" value="7vG6G7pGwnq/REPORT" />
      <ref role="28hnIK" node="77Q8YzlE6IT" resolve="ReportOnComment" />
      <ref role="28hnIo" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="28hnIv" node="77Q8YzlE6IE" resolve="Comment" />
      <ref role="1LQjoC" node="77Q8YzlE6It" resolve="User" />
    </node>
    <node concept="2IgU2F" id="77Q8YzlE7hR" role="2IgU2C">
      <property role="2InxW_" value="7vG6G7pGwnt/MODERATE" />
      <property role="TrG5h" value="ModeratorCanModerateContent" />
      <ref role="28hnIK" node="77Q8YzlE6IR" resolve="ReportOnPost" />
      <ref role="28hnIo" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="28hnIv" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="1LQjoC" node="77Q8YzlE6Iu" resolve="Moderator" />
    </node>
    <node concept="3$WfeX" id="77Q8YzlE7hK" role="3$WffK">
      <property role="TrG5h" value="PostModerationPolicy" />
      <property role="2InxW9" value="7vG6G7pGwn7/HYBRID" />
      <property role="2InxW8" value="77Q8YzgwKZ6/ON_REPORT_THRESHOLD" />
      <ref role="28hnIL" node="77Q8YzlE6IR" resolve="ReportOnPost" />
      <ref role="28hnIH" node="77Q8YzlE6Iu" resolve="Moderator" />
      <ref role="28hnIx" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="28hnIw" node="77Q8YzlE6Ip" resolve="CommunityContext" />
    </node>
    <node concept="3$Wfel" id="77Q8YzlE6IZ" role="3$Wfeu">
      <property role="TrG5h" value="AutoModerationRule" />
      <property role="2InxWG" value="77Q8YzgwKZ4/ON_REPORT_SUBMITTED" />
      <ref role="28hnIM" node="77Q8YzlE6IR" resolve="ReportOnPost" />
      <ref role="28hnIB" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="28hnI_" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="28hnI$" node="77Q8YzlE6IY" resolve="ContentRuleValidation" />
      <node concept="2xtiKx" id="1bC37d5mSlZ" role="2xtiKm">
        <property role="TrG5h" value="ReportCountOverThresholdCondition" />
        <property role="2xtiKR" value="report_count_over_threshold" />
        <ref role="1ms6pP" node="1bC37d5mSlY" resolve="ReportNumber" />
      </node>
      <node concept="2xtiK9" id="77Q8YzlE6J1" role="2xtiKn">
        <property role="TrG5h" value="FlagOrHidePostAction" />
        <property role="2xtiKh" value="77Q8YzgwKZF/FLAG_CONTENT" />
        <property role="2xtiKi" value="flag_or_hide_post" />
      </node>
    </node>
    <node concept="3$Wfei" id="77Q8YzlE6IY" role="mDdG5">
      <property role="TrG5h" value="ContentRuleValidation" />
      <property role="2InxW$" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWF" value="7vG6G7pGwny/WARNING" />
      <property role="2InxWE" value="blocked_words_or_spam_signal" />
      <property role="2InxWH" value="reddit_content_validation" />
      <ref role="28hnIR" node="77Q8YzlE6IR" resolve="ReportOnPost" />
      <ref role="28hnIr" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="28hnIq" node="77Q8YzlE6Iu" resolve="Moderator" />
      <ref role="28hnIp" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="1LQjoz" node="77Q8YzlE6IZ" resolve="AutoModerationRule" />
    </node>
    <node concept="l6mf$" id="77Q8YzlE6IV" role="mDdGm">
      <property role="TrG5h" value="PostFeedSort" />
      <property role="l6mej" value="47EFX_kWWL4/DATE" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meV" node="77Q8YzlE6Ip" resolve="CommunityContext" />
      <ref role="l6meT" node="77Q8YzlE6I$" resolve="Post" />
    </node>
    <node concept="l6mf$" id="77Q8YzlE6IW" role="mDdGm">
      <property role="TrG5h" value="SubredditListingSort" />
      <property role="l6mej" value="47EFX_kWWL5/VALUE" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meT" node="77Q8YzlE6Iw" resolve="Subreddit" />
      <ref role="l6meV" node="77Q8YzlE6Ip" resolve="CommunityContext" />
    </node>
    <node concept="l6mf$" id="77Q8YzlE6IX" role="mDdGm">
      <property role="TrG5h" value="CommentSort" />
      <property role="l6mei" value="47EFX_kWWL9/DESC" />
      <ref role="l6meT" node="77Q8YzlE6IE" resolve="Comment" />
      <ref role="l6meV" node="77Q8YzlE6Ip" resolve="CommunityContext" />
    </node>
    <node concept="3$Wfec" id="77Q8YzlE6IM" role="mDdGs">
      <property role="TrG5h" value="VoteOnPost" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="28hnIj" node="77Q8YzlE6IK" resolve="VoteType" />
      <ref role="3UnFHb" node="77Q8YzlE6It" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlE6IN" role="28hnIE">
        <property role="TrG5h" value="VoteOnPostPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlE6IP" role="mDdGs">
      <property role="TrG5h" value="VoteOnComment" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE6IE" resolve="Comment" />
      <ref role="28hnIj" node="77Q8YzlE6IK" resolve="VoteType" />
      <ref role="3UnFHb" node="77Q8YzlE6It" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlE6IQ" role="28hnIE">
        <property role="TrG5h" value="VoteOnCommentPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlE6IR" role="mDdGs">
      <property role="TrG5h" value="ReportOnPost" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="28hnIj" node="77Q8YzlE6IL" resolve="ReportType" />
      <ref role="3UnFHb" node="77Q8YzlE6It" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlE6IS" role="28hnIE">
        <property role="TrG5h" value="ReportOnPostPolicy" />
      </node>
    </node>
    <node concept="3$Wfec" id="77Q8YzlE6IT" role="mDdGs">
      <property role="TrG5h" value="ReportOnComment" />
      <property role="l6me5" value="47EFX_kWWLq/OPTIONAL" />
      <ref role="28hnIs" node="77Q8YzlE6IE" resolve="Comment" />
      <ref role="28hnIj" node="77Q8YzlE6IL" resolve="ReportType" />
      <ref role="3UnFHb" node="77Q8YzlE6It" resolve="User" />
      <node concept="3$Wfe6" id="77Q8YzlE6IU" role="28hnIE">
        <property role="TrG5h" value="ReportOnCommentPolicy" />
      </node>
    </node>
    <node concept="3$Wfe9" id="77Q8YzlE6IK" role="mDdHy">
      <property role="TrG5h" value="VoteType" />
      <property role="1LQ7Jc" value="3vc7gP656r6/VOTE" />
      <property role="l6med" value="47EFX_kWWLi/UP_DOWN" />
    </node>
    <node concept="3$Wfe9" id="77Q8YzlE6IL" role="mDdHy">
      <property role="TrG5h" value="ReportType" />
      <property role="1LQ7Jc" value="3vc7gP656r6/VOTE" />
      <property role="1LQ7J7" value="3vc7gP656rc/RESOURCE_ONLY" />
      <property role="l6med" value="47EFX_kWWLg/NONE" />
    </node>
    <node concept="3$WfeS" id="77Q8YzlE6II" role="3$WffS">
      <property role="TrG5h" value="SubredditContainsPost" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <property role="2In6HV" value="true" />
      <ref role="2In6HX" node="77Q8YzlE6Iw" resolve="Subreddit" />
      <ref role="28hnIP" node="77Q8YzlE6I$" resolve="Post" />
    </node>
    <node concept="3$WfeS" id="77Q8YzlE6IJ" role="3$WffS">
      <property role="TrG5h" value="PostContainsComment" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <property role="2In6HU" value="true" />
      <ref role="2In6HX" node="77Q8YzlE6I$" resolve="Post" />
      <ref role="28hnIP" node="77Q8YzlE6IE" resolve="Comment" />
    </node>
    <node concept="3$Wff$" id="77Q8YzlE6Iw" role="2IgU2D">
      <property role="TrG5h" value="Subreddit" />
      <node concept="2IgU2X" id="77Q8YzlE6Ix" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6Iy" role="2In6HR">
        <property role="TrG5h" value="Name" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6Iz" role="2In6HR">
        <property role="TrG5h" value="Description" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wff$" id="77Q8YzlE6I$" role="2IgU2D">
      <property role="TrG5h" value="Post" />
      <property role="1LQjoB" value="true" />
      <node concept="2IgU2X" id="77Q8YzlE6I_" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6IA" role="2In6HR">
        <property role="TrG5h" value="Title" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6IB" role="2In6HR">
        <property role="TrG5h" value="Body" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6IC" role="2In6HR">
        <property role="TrG5h" value="PostType" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6ID" role="2In6HR">
        <property role="TrG5h" value="CreationDate" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="1bC37d5mSlY" role="2In6HR">
        <property role="TrG5h" value="ReportNumber" />
        <property role="2IgU2Z" value="7vG6G7pFVDN/NUMBER" />
        <property role="2IgU2Y" value="true" />
      </node>
    </node>
    <node concept="3$Wff$" id="77Q8YzlE6IE" role="2IgU2D">
      <property role="TrG5h" value="Comment" />
      <property role="1LQjoB" value="true" />
      <node concept="2IgU2X" id="77Q8YzlE6IF" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6IG" role="2In6HR">
        <property role="TrG5h" value="Body" />
        <property role="2IgU2Y" value="true" />
      </node>
      <node concept="2IgU2X" id="77Q8YzlE6IH" role="2In6HR">
        <property role="TrG5h" value="CreationDate" />
        <property role="2IgU2Y" value="true" />
        <property role="2IgU2Z" value="7vG6G7pFVDP/DATE" />
      </node>
    </node>
    <node concept="3$Wfe3" id="77Q8YzlE6It" role="nroh4">
      <property role="TrG5h" value="User" />
      <property role="2InxW3" value="7vG6G7pGwmX/GENERIC" />
    </node>
    <node concept="3$Wfe3" id="77Q8YzlE6Iu" role="nroh4">
      <property role="TrG5h" value="Moderator" />
      <property role="2InxW3" value="7vG6G7pGwn1/MODERATOR" />
      <node concept="3UnFIO" id="77Q8YzlE6Iv" role="3UnFH9">
        <property role="TrG5h" value="ModeratorIsUser" />
        <ref role="3UnFIR" node="77Q8YzlE6It" resolve="User" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE6Ip" role="3$WffE">
      <property role="TrG5h" value="CommunityContext" />
      <property role="2InxXR" value="7vG6G7pGwmN/COMMUNITY" />
      <node concept="28hnH9" id="77Q8YzlE6Iq" role="28hnHc">
        <property role="TrG5h" value="CommunitySubredditLink" />
        <ref role="28hnH2" node="77Q8YzlE6Iw" resolve="Subreddit" />
      </node>
      <node concept="28hnH9" id="77Q8YzlE6Ir" role="28hnHc">
        <property role="TrG5h" value="CommunityPostLink" />
        <ref role="28hnH2" node="77Q8YzlE6I$" resolve="Post" />
      </node>
      <node concept="28hnH9" id="77Q8YzlE6Is" role="28hnHc">
        <property role="TrG5h" value="CommunityCommentLink" />
        <ref role="28hnH2" node="77Q8YzlE6IE" resolve="Comment" />
      </node>
    </node>
  </node>
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
      <node concept="2xtiKx" id="1bC37d5mSm0" role="2xtiKm">
        <property role="TrG5h" value="TitleRestrictedWords" />
        <property role="2xtiKR" value="war, crime" />
        <ref role="1ms6pP" node="77Q8YzlE7ig" resolve="Title" />
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
      <node concept="2xtiKx" id="1bC37d5mSm1" role="2xtiKm">
        <property role="TrG5h" value="CommentRestrictedWords" />
        <property role="2xtiKR" value="knife, blood" />
        <ref role="1ms6pP" node="77Q8YzlJGRq" resolve="Text" />
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
      <ref role="2In6HX" node="77Q8YzlE6IE" resolve="Comment" />
      <ref role="28hnIP" node="77Q8YzlE6IE" resolve="Comment" />
    </node>
    <node concept="3$Wff$" id="77Q8YzlE7i9" role="2IgU2D">
      <property role="TrG5h" value="Channel" />
      <node concept="2IgU2X" id="77Q8YzlE7ia" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
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
      <node concept="2IgU2X" id="77Q8YzlE7if" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
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
      <node concept="2IgU2X" id="77Q8YzlJGRp" role="2In6HR">
        <property role="TrG5h" value="Id" />
        <property role="2IgU2Y" value="true" />
      </node>
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
      <node concept="3UnFIO" id="77Q8YzlE7i4" role="3UnFH9">
        <property role="TrG5h" value="CreatorIsUser" />
        <ref role="3UnFIR" node="77Q8YzlE7i2" resolve="User" />
      </node>
      <node concept="3UnFIO" id="77Q8YzlE7i8" role="3UnFH9">
        <property role="TrG5h" value="CreatorIsModerator" />
        <ref role="3UnFIR" node="77Q8YzlE7i5" resolve="Moderator" />
      </node>
    </node>
    <node concept="3$Wfe3" id="77Q8YzlE7i5" role="nroh4">
      <property role="TrG5h" value="Moderator" />
      <property role="2InxW3" value="7vG6G7pGwn1/MODERATOR" />
      <node concept="3UnFIO" id="77Q8YzlE7i6" role="3UnFH9">
        <property role="TrG5h" value="ModeratorIsUser" />
        <ref role="3UnFIR" node="77Q8YzlE7i2" resolve="User" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE7hT" role="3$WffE">
      <property role="TrG5h" value="ChannelContext" />
      <property role="2InxXR" value="7vG6G7pGwmO/CHANNEL" />
      <node concept="28hnH9" id="77Q8YzlE7hU" role="28hnHc">
        <property role="TrG5h" value="ChannelResourceLink" />
        <ref role="28hnH2" node="77Q8YzlE7i9" resolve="Channel" />
      </node>
      <node concept="28hnH9" id="77Q8YzlE7hW" role="28hnHc">
        <property role="TrG5h" value="VideoResourceLink" />
        <ref role="28hnH2" node="77Q8YzlE7ie" resolve="Video" />
      </node>
      <node concept="28hnH9" id="77Q8YzlE7hX" role="28hnHc">
        <property role="TrG5h" value="CommentResourceLink" />
        <ref role="28hnH2" node="77Q8YzlJGRo" resolve="Comment" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE7hY" role="3$WffE">
      <property role="TrG5h" value="TrendingContext" />
      <property role="2InxXR" value="7vG6G7pGwmO/CHANNEL" />
      <node concept="28hnH9" id="77Q8YzlE7hZ" role="28hnHc">
        <property role="TrG5h" value="TrendingVideoLink" />
        <ref role="28hnH2" node="77Q8YzlE7ie" resolve="Video" />
      </node>
    </node>
    <node concept="3$WfeV" id="77Q8YzlE7i0" role="3$WffE">
      <property role="TrG5h" value="RecommendationContext" />
      <property role="2InxXR" value="7vG6G7pGwmO/CHANNEL" />
      <node concept="28hnH9" id="77Q8YzlE7i1" role="28hnHc">
        <property role="TrG5h" value="RecommendationVideoLink" />
        <ref role="28hnH2" node="77Q8YzlE7ie" resolve="Video" />
      </node>
    </node>
  </node>
</model>

