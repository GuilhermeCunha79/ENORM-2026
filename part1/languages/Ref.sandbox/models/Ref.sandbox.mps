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
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="75b0389b-83f9-4003-b95d-1b8432efd2b6" name="Ref">
      <concept id="6041381794867197938" name="Ref.structure.ContextResourceTypeLink" flags="ng" index="28hnH9">
        <reference id="6041381794867197945" name="resourceType" index="28hnH2" />
      </concept>
      <concept id="8641311204900321898" name="Ref.structure.AuthorizationRule" flags="ng" index="2IgU2F">
        <property id="8641311204900472292" name="allowedAction" index="2InxW_" />
        <reference id="6041381794867197732" name="resourceTarget" index="28hnIv" />
        <reference id="6041381794867197707" name="feedbackTarget" index="28hnIK" />
        <reference id="4020620510182583077" name="actor" index="1LQjoC" />
      </concept>
      <concept id="8641311204900321916" name="Ref.structure.Attribute" flags="ng" index="2IgU2X" />
      <concept id="3890156942413033123" name="Ref.structure.UserType" flags="ng" index="3$Wfe3">
        <property id="8641311204900472258" name="kind" index="2InxW3" />
        <child id="746375748528706432" name="superType" index="3UnFH9" />
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
        <property id="8641311204900472305" name="appliesWhen" index="2InxWK" />
        <property id="8641311204900472304" name="mode" index="2InxWL" />
        <reference id="6041381794867197704" name="feedbackDefinition" index="28hnIN" />
      </concept>
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <property id="4020620510182583079" name="version" index="1LQjoE" />
        <child id="8641311204900321895" name="userType" index="2IgU2A" />
        <child id="8641311204900321897" name="authorizationRule" index="2IgU2C" />
        <child id="8641311204900321896" name="resourceType" index="2IgU2D" />
        <child id="8641311204900321901" name="verificationPolicy" index="2IgU2G" />
        <child id="8641311204900321900" name="validationRule" index="2IgU2H" />
        <child id="3890156942413033150" name="automationRule" index="3$Wfeu" />
        <child id="3890156942413033162" name="contextType" index="3$WffE" />
        <child id="3890156942413033164" name="feedbackDefinition" index="3$WffG" />
        <child id="3890156942413033167" name="feedbackType" index="3$WffJ" />
        <child id="3890156942413033168" name="moderationPolicy" index="3$WffK" />
        <child id="3890156942413033176" name="resourceRelation" index="3$WffS" />
      </concept>
      <concept id="3890156942413033112" name="Ref.structure.ResourceRelation" flags="ng" index="3$WfeS">
        <property id="8641311204900368825" name="targetCardinality" index="2In6HS" />
        <property id="8641311204900368824" name="sourceCardinality" index="2In6HT" />
        <reference id="6041381794867197710" name="targetResourceType" index="28hnIP" />
        <reference id="8641311204900368828" name="sourceResourceType" index="2In6HX" />
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
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$">
        <child id="8641311204900368822" name="attribute" index="2In6HR" />
        <child id="746375748528706428" name="superType" index="3UnFIP" />
      </concept>
      <concept id="746375748528706429" name="Ref.structure.UserTypeSuperType" flags="ng" index="3UnFIO">
        <reference id="746375748528706430" name="superType" index="3UnFIR" />
      </concept>
      <concept id="746375748528706422" name="Ref.structure.ResourceTypeSuperType" flags="ng" index="3UnFIZ">
        <reference id="746375748528706424" name="superType" index="3UnFIL" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="3HQf9Tjw$TD">
    <property role="TrG5h" value="Amazon" />
    <property role="1LQjoE" value="2.2" />
    <node concept="3$WfeS" id="1DpsEsTmxCy" role="3$WffS">
      <property role="TrG5h" value="Olo" />
      <property role="2In6HT" value="1" />
      <property role="2In6HS" value="2" />
      <ref role="2In6HX" node="or9vid_8Yg" resolve="Aaaa" />
      <ref role="28hnIP" node="1AYOqaGiNgT" resolve="Bbbbb" />
    </node>
    <node concept="2IgU2F" id="1DpsEsTkYQn" role="2IgU2C">
      <property role="TrG5h" value="Auth" />
      <property role="2InxW_" value="7vG6G7pGwnk/CREATE" />
      <ref role="28hnIK" node="or9vid$STD" resolve="Lol" />
      <ref role="28hnIv" node="1AYOqaGiNgT" resolve="Bbbbb" />
      <ref role="1LQjoC" node="42rXvlg5Ney" resolve="Moderator" />
    </node>
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
      <node concept="2IgU2X" id="1DpsEsTmxCv" role="2In6HR">
        <property role="TrG5h" value="OLo" />
      </node>
      <node concept="3UnFIZ" id="1DpsEsTmxCu" role="3UnFIP">
        <property role="TrG5h" value="ASs" />
        <ref role="3UnFIL" node="1AYOqaGiNgT" resolve="Bbbbb" />
      </node>
    </node>
    <node concept="3$Wff$" id="1AYOqaGiNgT" role="2IgU2D">
      <property role="TrG5h" value="Bbbbb" />
      <node concept="2IgU2X" id="1DpsEsTmxCp" role="2In6HR">
        <property role="TrG5h" value="Bola" />
      </node>
      <node concept="3UnFIZ" id="1DpsEsTmxCo" role="3UnFIP">
        <property role="TrG5h" value="Adas" />
        <ref role="3UnFIL" node="or9vid_8Yg" resolve="Aaaa" />
      </node>
    </node>
    <node concept="3$Wfe3" id="or9vid$STI" role="2IgU2A">
      <property role="TrG5h" value="Auhtor" />
      <property role="2InxW3" value="7vG6G7pGwmY/BUYER" />
      <node concept="3UnFIO" id="1DpsEsTmxCx" role="3UnFH9">
        <property role="TrG5h" value="OLs" />
        <ref role="3UnFIR" node="42rXvlg5Ney" resolve="Moderator" />
      </node>
    </node>
    <node concept="3$Wfe3" id="42rXvlg5Ney" role="2IgU2A">
      <property role="TrG5h" value="Moderator" />
      <property role="2InxW3" value="7vG6G7pGwn1/MODERATOR" />
      <node concept="3UnFIO" id="1DpsEsTmxCw" role="3UnFH9">
        <property role="TrG5h" value="Ola" />
        <ref role="3UnFIR" node="or9vid$STI" resolve="Auhtor" />
      </node>
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
      <property role="2InxWL" value="7vG6G7pGwnC/AUTOMATIC" />
      <property role="2InxWK" value="ew" />
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
  <node concept="312cEu" id="ms3wLqsKH9">
    <property role="TrG5h" value="Main" />
    <node concept="3Tm1VV" id="ms3wLqsKHa" role="1B3o_S" />
  </node>
</model>

