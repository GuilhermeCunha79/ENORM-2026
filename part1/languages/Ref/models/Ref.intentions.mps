<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c34dd009-a12a-457e-81bf-e34d4d598bbe(Ref.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="2rvu" ref="r:322f8d2c-fa9d-4224-b267-a1958299e237(Ref.structure)" implicit="true" />
    <import index="4e49" ref="r:b9046e81-c27e-480a-afca-05cd0e1ba83f(Ref.behavior)" implicit="true" />
    <import index="tpcu" ref="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
    </language>
    <language id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions">
      <concept id="1192794744107" name="jetbrains.mps.lang.intentions.structure.IntentionDeclaration" flags="ig" index="2S6QgY" />
      <concept id="1192794782375" name="jetbrains.mps.lang.intentions.structure.DescriptionBlock" flags="in" index="2S6ZIM" />
      <concept id="1192795911897" name="jetbrains.mps.lang.intentions.structure.ExecuteBlock" flags="in" index="2Sbjvc" />
      <concept id="1192796902958" name="jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node" flags="nn" index="2Sf5sV" />
      <concept id="2522969319638091381" name="jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration" flags="ig" index="2ZfUlf">
        <reference id="2522969319638198290" name="forConcept" index="2ZfgGC" />
        <child id="2522969319638198291" name="executeFunction" index="2ZfgGD" />
        <child id="2522969319638093993" name="descriptionFunction" index="2ZfVej" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2S6QgY" id="49Ym4PIMxYP">
    <property role="TrG5h" value="GeneratePlantUml" />
    <ref role="2ZfgGC" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    <node concept="2S6ZIM" id="49Ym4PIMxYQ" role="2ZfVej">
      <node concept="3clFbS" id="49Ym4PIMxYR" role="2VODD2">
        <node concept="3clFbF" id="49Ym4PIMyc3" role="3cqZAp">
          <node concept="Xl_RD" id="5fYWOe7Zlzx" role="3clFbG">
            <property role="Xl_RC" value="Generates Plantuml for Model" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2Sbjvc" id="49Ym4PIMxYS" role="2ZfgGD">
      <node concept="3clFbS" id="49Ym4PIMxYT" role="2VODD2">
        <node concept="3clFbF" id="ms3wLqrxPO" role="3cqZAp">
          <node concept="2OqwBi" id="ms3wLqry0q" role="3clFbG">
            <node concept="2Sf5sV" id="ms3wLqrxPN" role="2Oq$k0" />
            <node concept="2qgKlT" id="ms3wLqrBPS" role="2OqNvi">
              <ref role="37wK5l" to="4e49:ms3wLqnxnD" resolve="toPlantUml" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2S6QgY" id="77Q8YznAXlV">
    <property role="TrG5h" value="GenerateTextRepresentation" />
    <ref role="2ZfgGC" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    <node concept="2S6ZIM" id="77Q8YznAXlW" role="2ZfVej">
      <node concept="3clFbS" id="77Q8YznAXlX" role="2VODD2">
        <node concept="3clFbF" id="77Q8YznAXCM" role="3cqZAp">
          <node concept="3cpWs3" id="77Q8YznAYyD" role="3clFbG">
            <node concept="Xl_RD" id="77Q8YznAXCO" role="3uHU7B">
              <property role="Xl_RC" value="Generates Text Model for " />
            </node>
            <node concept="2OqwBi" id="77Q8YznAYZw" role="3uHU7w">
              <node concept="2Sf5sV" id="77Q8YznAYQt" role="2Oq$k0" />
              <node concept="2qgKlT" id="77Q8YznAZaS" role="2OqNvi">
                <ref role="37wK5l" to="tpcu:22G2W3WJ92t" resolve="getDetailedPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2Sbjvc" id="77Q8YznAXlY" role="2ZfgGD">
      <node concept="3clFbS" id="77Q8YznAXlZ" role="2VODD2">
        <node concept="3clFbF" id="77Q8YznIy7k" role="3cqZAp">
          <node concept="2OqwBi" id="77Q8YznIyhy" role="3clFbG">
            <node concept="2Sf5sV" id="77Q8YznIy7j" role="2Oq$k0" />
            <node concept="2qgKlT" id="77Q8YznIysI" role="2OqNvi">
              <ref role="37wK5l" to="4e49:77Q8YzlW2WQ" resolve="toText" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

