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
      <concept id="3890156942413033141" name="Ref.structure.AutomationRule" flags="ng" index="3$Wfel" />
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <child id="3890156942413033150" name="automationRule" index="3$Wfeu" />
        <child id="3890156942413033162" name="contextType" index="3$WffE" />
      </concept>
      <concept id="3890156942413033115" name="Ref.structure.ContextType" flags="ng" index="3$WfeV" />
    </language>
  </registry>
  <node concept="3$WfeP" id="7vG6G7pGkrg">
    <property role="TrG5h" value="Amazon" />
    <node concept="3$WfeV" id="7vG6G7pGwmK" role="3$WffE">
      <property role="TrG5h" value="lul" />
    </node>
    <node concept="3$Wfel" id="7vG6G7pGwiO" role="3$Wfeu">
      <property role="TrG5h" value="automation" />
    </node>
  </node>
</model>

