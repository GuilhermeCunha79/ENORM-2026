<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:42562a9e-3d64-45b7-ab65-7a88d741ffc1(Ref.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="75b0389b-83f9-4003-b95d-1b8432efd2b6" name="Ref" version="0" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="2" />
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
      <concept id="3890156942413033123" name="Ref.structure.UserType" flags="ng" index="3$Wfe3">
        <property id="8641311204900472258" name="kind" index="2InxW3" />
      </concept>
      <concept id="3890156942413033126" name="Ref.structure.FeedbackPolicy" flags="ng" index="3$Wfe6" />
      <concept id="3890156942413033129" name="Ref.structure.FeedbackType" flags="ng" index="3$Wfe9">
        <property id="4020620510182532815" name="hasRating" index="1LQ7J2" />
        <property id="4020620510182532801" name="kind" index="1LQ7Jc" />
      </concept>
      <concept id="3890156942413033132" name="Ref.structure.FeedbackDefinition" flags="ng" index="3$Wfec">
        <property id="4020620510182532819" name="requiresVerifiedContext" index="1LQ7Ju" />
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
        <reference id="6041381794867197729" name="userType" index="28hnIq" />
        <reference id="6041381794867197728" name="resourceType" index="28hnIr" />
        <reference id="6041381794867197708" name="feedbackDefinition" index="28hnIR" />
        <reference id="4020620510182583086" name="invokedBy" index="1LQjoz" />
      </concept>
      <concept id="3890156942413033141" name="Ref.structure.AutomationRule" flags="ng" index="3$Wfel">
        <property id="8641311204900472301" name="trigger" index="2InxWG" />
        <property id="8641311204900472303" name="actionDescription" index="2InxWI" />
        <property id="8641311204900472302" name="condition" index="2InxWJ" />
        <reference id="6041381794867197727" name="uses" index="28hnI$" />
        <reference id="6041381794867197726" name="inContext" index="28hnI_" />
        <reference id="6041381794867197724" name="context" index="28hnIB" />
        <reference id="6041381794867197705" name="feedbackDefinition" index="28hnIM" />
      </concept>
      <concept id="3890156942413033144" name="Ref.structure.VerificationPolicy" flags="ng" index="3$Wfeo">
        <reference id="6041381794867197704" name="feedbackDefinition" index="28hnIN" />
      </concept>
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <property id="4020620510182583079" name="version" index="1LQjoE" />
        <child id="8641311204900321895" name="userType" index="2IgU2A" />
        <child id="8641311204900321896" name="resourceType" index="2IgU2D" />
        <child id="8641311204900321901" name="verificationPolicy" index="2IgU2G" />
        <child id="8641311204900321900" name="validationRule" index="2IgU2H" />
        <child id="3890156942413033150" name="automationRule" index="3$Wfeu" />
        <child id="3890156942413033162" name="contextType" index="3$WffE" />
        <child id="3890156942413033164" name="feedbackDefinition" index="3$WffG" />
        <child id="3890156942413033167" name="feedbackType" index="3$WffJ" />
        <child id="3890156942413033168" name="moderationPolicy" index="3$WffK" />
      </concept>
      <concept id="3890156942413033115" name="Ref.structure.ContextType" flags="ng" index="3$WfeV">
        <property id="8641311204900472246" name="contextKind" index="2InxXR" />
        <child id="6041381794867197943" name="resourceTypeLink" index="28hnHc" />
      </concept>
      <concept id="3890156942413033117" name="Ref.structure.ModerationPolicy" flags="ng" index="3$WfeX">
        <property id="8641311204900472265" name="trigger" index="2InxW8" />
        <property id="8641311204900472264" name="moderationMode" index="2InxW9" />
        <property id="8641311204900472266" name="moderationDecision" index="2InxWb" />
        <reference id="6041381794867197723" name="inContext" index="28hnIw" />
        <reference id="6041381794867197722" name="monitorsResource" index="28hnIx" />
        <reference id="6041381794867197718" name="executedBy" index="28hnIH" />
        <reference id="6041381794867197706" name="feedbackDefinition" index="28hnIL" />
      </concept>
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$" />
    </language>
  </registry>
  <node concept="3$WfeP" id="3HQf9Tjw$TD">
    <property role="TrG5h" value="Ref" />
    <property role="1LQjoE" value="2.2" />
    <node concept="3$Wfei" id="1AYOqaGiNgS" role="2IgU2H">
      <property role="TrG5h" value="ValRule" />
      <property role="2InxW$" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWF" value="7vG6G7pGwnz/ERROR" />
      <property role="2InxWE" value="sdada" />
      <property role="2InxWH" value="123" />
      <ref role="28hnIR" node="or9vid$STD" resolve="Lol" />
      <ref role="28hnIr" node="or9vid_8Yg" resolve="Aaaa" />
      <ref role="28hnIq" node="or9vid$STI" resolve="Auhtor" />
      <ref role="1LQjoz" node="1AYOqaGiNgR" resolve="Autom" />
    </node>
    <node concept="3$Wfel" id="1AYOqaGiNgR" role="3$Wfeu">
      <property role="TrG5h" value="Autom" />
      <property role="2InxWG" value="23213" />
      <property role="2InxWJ" value="123432" />
      <property role="2InxWI" value="fwsef" />
      <ref role="28hnIB" node="or9vid_8Yg" resolve="Aaaa" />
      <ref role="28hnIM" node="or9vid$STD" resolve="Lol" />
      <ref role="28hnI$" node="1AYOqaGiNgS" resolve="ValRule" />
      <ref role="28hnI_" node="1AYOqaGhfnC" resolve="ModerationContext_Aaaa" />
    </node>
    <node concept="3$WfeX" id="1AYOqaGgma5" role="3$WffK">
      <property role="TrG5h" value="Moder" />
      <property role="2InxW9" value="7vG6G7pGwn5/AUTOMATIC" />
      <property role="2InxW8" value="i=2" />
      <property role="2InxWb" value="7vG6G7pGwnd/FLAGGED" />
      <ref role="28hnIw" node="1AYOqaGhfnC" resolve="ModerationContext_Aaaa" />
      <ref role="28hnIx" node="or9vid_8Yg" resolve="Aaaa" />
      <ref role="28hnIH" node="or9vid$STI" resolve="Auhtor" />
      <ref role="28hnIL" node="or9vid$STD" resolve="Lol" />
    </node>
    <node concept="3$WfeV" id="1AYOqaG8RyK" role="3$WffE">
      <property role="TrG5h" value="OLO" />
      <property role="2InxXR" value="7vG6G7pGwmP/CATALOG" />
      <node concept="28hnH9" id="1AYOqaG8RyL" role="28hnHc">
        <property role="TrG5h" value="Pol" />
        <ref role="28hnH2" node="or9vid_8Yg" resolve="Aaaa" />
      </node>
    </node>
    <node concept="3$Wff$" id="or9vid_8Yg" role="2IgU2D">
      <property role="TrG5h" value="Aaaa" />
    </node>
    <node concept="3$Wff$" id="1AYOqaGiNgT" role="2IgU2D">
      <property role="TrG5h" value="Bbbbb" />
    </node>
    <node concept="3$Wfe3" id="or9vid$STI" role="2IgU2A">
      <property role="TrG5h" value="Auhtor" />
      <property role="2InxW3" value="7vG6G7pGwmY/BUYER" />
    </node>
    <node concept="3$Wfe3" id="42rXvlg5Ney" role="2IgU2A">
      <property role="TrG5h" value="Moderator" />
      <property role="2InxW3" value="7vG6G7pGwn1/MODERATOR" />
    </node>
    <node concept="3$Wfe9" id="or9vid$STE" role="3$WffJ">
      <property role="TrG5h" value="Feed" />
      <property role="1LQ7Jc" value="3vc7gP656r6/VOTE" />
    </node>
    <node concept="3$Wfe9" id="or9vid$Wek" role="3$WffJ">
      <property role="TrG5h" value="Food" />
      <property role="1LQ7Jc" value="3vc7gP656r3/COMMENT" />
      <property role="1LQ7J2" value="true" />
    </node>
    <node concept="3$Wfec" id="or9vid$STD" role="3$WffG">
      <property role="TrG5h" value="Lol" />
      <property role="1LQ7Ju" value="true" />
      <ref role="28hnIj" node="or9vid$Wek" resolve="Food" />
      <ref role="3UnFHb" node="or9vid$STI" resolve="Auhtor" />
      <ref role="28hnIs" node="or9vid_8Yg" resolve="Aaaa" />
      <node concept="3$Wfe6" id="or9vid$STF" role="28hnIE">
        <property role="TrG5h" value="Lol" />
      </node>
      <node concept="3$Wfef" id="1AYOqaGhfnQ" role="28hnID">
        <property role="TrG5h" value="Ratinh" />
        <property role="3UnM3c" value="2" />
        <property role="3UnM3f" value="1" />
        <property role="3UnM3a" value="1" />
      </node>
    </node>
    <node concept="3$Wfeo" id="1AYOqaGhfnB" role="2IgU2G">
      <property role="TrG5h" value="LolVerification" />
      <ref role="28hnIN" node="or9vid$STD" resolve="Lol" />
    </node>
    <node concept="3$WfeV" id="1AYOqaGhfnC" role="3$WffE">
      <property role="TrG5h" value="ModerationContext_Aaaa" />
      <property role="2InxXR" value="7vG6G7pGwmP/CATALOG" />
      <node concept="28hnH9" id="1AYOqaGhfnD" role="28hnHc">
        <property role="TrG5h" value="LOL" />
        <ref role="28hnH2" node="or9vid_8Yg" resolve="Aaaa" />
      </node>
    </node>
  </node>
</model>

