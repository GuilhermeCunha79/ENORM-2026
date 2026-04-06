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
      <concept id="8641311204900321916" name="Ref.structure.Attribute" flags="ng" index="2IgU2X" />
      <concept id="3890156942413033129" name="Ref.structure.FeedbackType" flags="ng" index="3$Wfe9" />
      <concept id="3890156942413033109" name="Ref.structure.RefModel" flags="ng" index="3$WfeP">
        <property id="4020620510182583079" name="version" index="1LQjoE" />
        <child id="8641311204900321896" name="resourceType" index="2IgU2D" />
        <child id="3890156942413033167" name="feedbackType" index="3$WffJ" />
        <child id="3890156942413033176" name="resourceRelation" index="3$WffS" />
      </concept>
      <concept id="3890156942413033112" name="Ref.structure.ResourceRelation" flags="ng" index="3$WfeS">
        <reference id="6041381794867197710" name="targetResourceType" index="28hnIP" />
        <reference id="8641311204900368828" name="sourceResourceType" index="2In6HX" />
      </concept>
      <concept id="3890156942413033156" name="Ref.structure.ResourceType" flags="ng" index="3$Wff$">
        <child id="8641311204900368822" name="attribute" index="2In6HR" />
      </concept>
    </language>
  </registry>
  <node concept="3$WfeP" id="29H_ccUkUqe">
    <property role="TrG5h" value="Qaaaa" />
    <property role="1LQjoE" value="2.1" />
    <node concept="3$Wff$" id="3HQf9TjwmbP" role="2IgU2D">
      <property role="TrG5h" value="res" />
    </node>
  </node>
  <node concept="3$WfeP" id="3HQf9Tjw$TD">
    <property role="TrG5h" value="ref" />
    <property role="1LQjoE" value="2.2" />
    <node concept="3$WfeS" id="3HQf9TjxS9V" role="3$WffS">
      <property role="TrG5h" value="lili" />
      <ref role="2In6HX" node="3HQf9Tjw$TE" resolve="Lol" />
      <ref role="28hnIP" node="3HQf9Tjw$TE" resolve="Lol" />
    </node>
    <node concept="3$Wfe9" id="3HQf9TjxdgW" role="3$WffJ">
      <property role="TrG5h" value="lol" />
    </node>
    <node concept="3$Wfe9" id="3HQf9TjxdgX" role="3$WffJ">
      <property role="TrG5h" value=" " />
    </node>
    <node concept="3$Wff$" id="3HQf9Tjw$TE" role="2IgU2D">
      <property role="TrG5h" value="Lol" />
      <node concept="2IgU2X" id="3HQf9Tjx72U" role="2In6HR">
        <property role="TrG5h" value="lol" />
      </node>
    </node>
  </node>
</model>

