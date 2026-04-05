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
        <child id="746375748528706432" name="superType" index="3UnFH9" />
      </concept>
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <property id="4020620510182583079" name="version" index="1LQjoE" />
        <child id="8641311204900321895" name="userType" index="2IgU2A" />
      </concept>
      <concept id="746375748528706429" name="Ref.structure.UserTypeSuperType" flags="ng" index="3UnFIO">
        <reference id="746375748528706430" name="superType" index="3UnFIR" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="29H_ccUkUqe">
    <property role="TrG5h" value="Qaaaa" />
    <property role="1LQjoE" value="2.1" />
    <node concept="3$Wfe3" id="5C09d0qG7tE" role="2IgU2A">
      <property role="TrG5h" value="Buyer" />
      <property role="2InxW3" value="7vG6G7pGwmY/BUYER" />
      <node concept="3UnFIO" id="5C09d0qGdSf" role="3UnFH9">
        <ref role="3UnFIR" node="5C09d0qG7tE" resolve="Buyer" />
      </node>
    </node>
  </node>
</model>

