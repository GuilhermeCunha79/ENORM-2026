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
      <concept id="6041381794867197938" name="Ref.structure.ContextResourceTypeLink" flags="ng" index="28hnH9" />
      <concept id="8641311204900321916" name="Ref.structure.Attribute" flags="ng" index="2IgU2X" />
      <concept id="3890156942413033126" name="Ref.structure.FeedbackPolicy" flags="ng" index="3$Wfe6" />
      <concept id="3890156942413033132" name="Ref.structure.FeedbackDefinition" flags="ng" index="3$Wfec">
        <child id="6041381794867197714" name="RatingPolicy" index="28hnID" />
        <child id="6041381794867197713" name="feedbackPolicy" index="28hnIE" />
      </concept>
      <concept id="3890156942413033135" name="Ref.structure.RatingPolicy" flags="ng" index="3$Wfef" />
      <concept id="3890156942413033141" name="Ref.structure.AutomationRule" flags="ng" index="3$Wfel" />
      <concept id="3890156942413033147" name="Ref.structure.EvolutionRule" flags="ng" index="3$Wfer" />
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <child id="8641311204900321896" name="resourceType" index="2IgU2D" />
        <child id="3890156942413033150" name="automationRule" index="3$Wfeu" />
        <child id="3890156942413033162" name="contextType" index="3$WffE" />
        <child id="3890156942413033163" name="evolutionRule" index="3$WffF" />
        <child id="3890156942413033164" name="feedbackDefinition" index="3$WffG" />
      </concept>
      <concept id="3890156942413033115" name="Ref.structure.ContextType" flags="ng" index="3$WfeV">
        <child id="6041381794867197943" name="resourceTypeLink" index="28hnHc" />
      </concept>
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$">
        <child id="8641311204900368822" name="attribute" index="2In6HR" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="7vG6G7pGkrg">
    <property role="TrG5h" value="Amazon" />
    <node concept="3$Wfec" id="DrEcBK18wh" role="3$WffG">
      <property role="TrG5h" value="feedback" />
    </node>
    <node concept="3$Wfec" id="DrEcBK18wi" role="3$WffG" />
    <node concept="3$Wff$" id="DrEcBK18wf" role="2IgU2D">
      <property role="TrG5h" value="Video" />
      <node concept="2IgU2X" id="DrEcBK18wg" role="2In6HR" />
    </node>
    <node concept="3$WfeV" id="7vG6G7pGwmK" role="3$WffE">
      <property role="TrG5h" value="lul" />
    </node>
    <node concept="3$Wfel" id="7vG6G7pGwiO" role="3$Wfeu">
      <property role="TrG5h" value="automation" />
    </node>
    <node concept="3$Wfel" id="DrEcBK18wj" role="3$Wfeu" />
  </node>
  <node concept="3$WfeP" id="DrEcBK1hdN">
    <property role="TrG5h" value="lul" />
    <node concept="3$Wfec" id="DrEcBK1jBn" role="3$WffG">
      <node concept="3$Wfe6" id="DrEcBK1jBo" role="28hnIE" />
      <node concept="3$Wfef" id="DrEcBK1jBp" role="28hnID" />
    </node>
    <node concept="3$Wfer" id="DrEcBK1jBl" role="3$WffF">
      <property role="TrG5h" value="ggg" />
    </node>
    <node concept="3$WfeV" id="DrEcBK1jBj" role="3$WffE">
      <node concept="28hnH9" id="DrEcBK1jBk" role="28hnHc" />
    </node>
    <node concept="3$Wfel" id="DrEcBK1jBi" role="3$Wfeu" />
  </node>
</model>

