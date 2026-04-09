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
      <concept id="3890156942413033123" name="Ref.structure.UserType" flags="ng" index="3$Wfe3">
        <property id="8641311204900472258" name="kind" index="2InxW3" />
      </concept>
      <concept id="3890156942413033126" name="Ref.structure.FeedbackPolicy" flags="ng" index="3$Wfe6" />
      <concept id="3890156942413033129" name="Ref.structure.FeedbackType" flags="ng" index="3$Wfe9">
        <property id="4020620510182532801" name="kind" index="1LQ7Jc" />
      </concept>
      <concept id="3890156942413033132" name="Ref.structure.FeedbackDefinition" flags="ng" index="3$Wfec">
        <reference id="6041381794867197736" name="feedbackType" index="28hnIj" />
        <reference id="6041381794867197735" name="subjectResource" index="28hnIs" />
        <reference id="746375748528706434" name="author" index="3UnFHb" />
        <child id="6041381794867197713" name="feedbackPolicy" index="28hnIE" />
      </concept>
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <property id="4020620510182583079" name="version" index="1LQjoE" />
        <child id="8641311204900321895" name="userType" index="2IgU2A" />
        <child id="8641311204900321896" name="resourceType" index="2IgU2D" />
        <child id="3890156942413033164" name="feedbackDefinition" index="3$WffG" />
        <child id="3890156942413033167" name="feedbackType" index="3$WffJ" />
      </concept>
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$">
        <child id="746375748528706428" name="superType" index="3UnFIP" />
      </concept>
      <concept id="746375748528706422" name="Ref.structure.ResourceTypeSuperType" flags="ng" index="3UnFIZ">
        <reference id="746375748528706424" name="superType" index="3UnFIL" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="3HQf9Tjw$TD">
    <property role="TrG5h" value="Ref" />
    <property role="1LQjoE" value="2.2" />
    <node concept="3$Wff$" id="or9vid_8Yg" role="2IgU2D">
      <property role="TrG5h" value="AKA" />
      <node concept="3UnFIZ" id="or9vidLHkC" role="3UnFIP">
        <ref role="3UnFIL" node="or9vid_8Yg" resolve="AKA" />
      </node>
    </node>
    <node concept="3$Wfe3" id="or9vid$STI" role="2IgU2A">
      <property role="TrG5h" value="Auhtor" />
      <property role="2InxW3" value="7vG6G7pGwmY/BUYER" />
    </node>
    <node concept="3$Wfe9" id="or9vid$STE" role="3$WffJ">
      <property role="TrG5h" value="Feed" />
      <property role="1LQ7Jc" value="3vc7gP656r6/VOTE" />
    </node>
    <node concept="3$Wfe9" id="or9vid$Wek" role="3$WffJ">
      <property role="TrG5h" value="Food" />
      <property role="1LQ7Jc" value="3vc7gP656r3/COMMENT" />
    </node>
    <node concept="3$Wfec" id="or9vid$STD" role="3$WffG">
      <property role="TrG5h" value="Lol" />
      <ref role="28hnIj" node="or9vid$Wek" resolve="Food" />
      <ref role="3UnFHb" node="or9vid$STI" resolve="Auhtor" />
      <ref role="28hnIs" node="or9vid_8Yg" resolve="AKA" />
      <node concept="3$Wfe6" id="or9vid$STF" role="28hnIE">
        <property role="TrG5h" value="Lol" />
      </node>
    </node>
    <node concept="3$Wfec" id="or9vid$Wej" role="3$WffG">
      <property role="TrG5h" value="Lul" />
      <ref role="3UnFHb" node="or9vid$STI" resolve="Auhtor" />
      <ref role="28hnIj" node="or9vid$Wek" resolve="Food" />
      <ref role="28hnIs" node="or9vid_8Yg" resolve="AKA" />
    </node>
    <node concept="3$Wfec" id="or9vidKqA2" role="3$WffG">
      <property role="TrG5h" value="llll" />
    </node>
  </node>
</model>

