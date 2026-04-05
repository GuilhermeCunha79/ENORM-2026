<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:15564ed4-df53-409b-b2dd-ba3734930263(Ref.typesystem)">
  <persistence version="9" />
  <languages>
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="5" />
    <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
    <import index="2rvu" ref="r:322f8d2c-fa9d-4224-b267-a1958299e237(Ref.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1225271369338" name="jetbrains.mps.baseLanguage.structure.IsEmptyOperation" flags="nn" index="17RlXB" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1081506773034" name="jetbrains.mps.baseLanguage.structure.LessThanExpression" flags="nn" index="3eOVzh" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1175517767210" name="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement" flags="nn" index="2MkqsV">
        <child id="1175517851849" name="errorString" index="2MkJ7o" />
      </concept>
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1195214364922" name="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule" flags="ig" index="18kY7G" />
      <concept id="3937244445246642777" name="jetbrains.mps.lang.typesystem.structure.AbstractReportStatement" flags="ng" index="1urrMJ">
        <child id="3937244445246642781" name="nodeToReport" index="1urrMF" />
      </concept>
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
      <concept id="1174648085619" name="jetbrains.mps.lang.typesystem.structure.AbstractRule" flags="ng" index="1YuPPy">
        <child id="1174648101952" name="applicableNode" index="1YuTPh" />
      </concept>
      <concept id="1174650418652" name="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference" flags="nn" index="1YBJjd">
        <reference id="1174650432090" name="applicableNode" index="1YBMHb" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1226511727824" name="jetbrains.mps.baseLanguage.collections.structure.SetType" flags="in" index="2hMVRd">
        <child id="1226511765987" name="elementType" index="2hN53Y" />
      </concept>
      <concept id="1226516258405" name="jetbrains.mps.baseLanguage.collections.structure.HashSetCreator" flags="nn" index="2i4dXS" />
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1237721394592" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator" flags="nn" index="HWqM0">
        <child id="1237721435807" name="elementType" index="HW$YZ" />
      </concept>
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1172254888721" name="jetbrains.mps.baseLanguage.collections.structure.ContainsOperation" flags="nn" index="3JPx81" />
    </language>
  </registry>
  <node concept="18kY7G" id="29H_ccUka5W">
    <property role="TrG5h" value="checkNameNotEmpty" />
    <node concept="3clFbS" id="29H_ccUka5X" role="18ibNy">
      <node concept="3clFbJ" id="29H_ccUkdGW" role="3cqZAp">
        <node concept="3clFbS" id="29H_ccUkdGY" role="3clFbx">
          <node concept="2MkqsV" id="29H_ccUkxmq" role="3cqZAp">
            <node concept="Xl_RD" id="29H_ccUkxmz" role="2MkJ7o">
              <property role="Xl_RC" value="Name must not be empty" />
            </node>
            <node concept="1YBJjd" id="29H_ccUkxnz" role="1urrMF">
              <ref role="1YBMHb" node="29H_ccUkdGn" resolve="iNamedConcept" />
            </node>
          </node>
        </node>
        <node concept="22lmx$" id="29H_ccUkuqo" role="3clFbw">
          <node concept="3clFbC" id="29H_ccUku82" role="3uHU7B">
            <node concept="2OqwBi" id="29H_ccUkriy" role="3uHU7B">
              <node concept="1YBJjd" id="29H_ccUkr9j" role="2Oq$k0">
                <ref role="1YBMHb" node="29H_ccUkdGn" resolve="iNamedConcept" />
              </node>
              <node concept="3TrcHB" id="29H_ccUktfb" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="10Nm6u" id="29H_ccUkupW" role="3uHU7w" />
          </node>
          <node concept="2OqwBi" id="29H_ccUkvh7" role="3uHU7w">
            <node concept="2OqwBi" id="29H_ccUkuAs" role="2Oq$k0">
              <node concept="1YBJjd" id="29H_ccUkusM" role="2Oq$k0">
                <ref role="1YBMHb" node="29H_ccUkdGn" resolve="iNamedConcept" />
              </node>
              <node concept="3TrcHB" id="29H_ccUkuLL" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="17RlXB" id="29H_ccUkxl$" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="29H_ccUkdGn" role="1YuTPh">
      <property role="TrG5h" value="iNamedConcept" />
      <ref role="1YaFvo" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="18kY7G" id="29H_ccUkGag">
    <property role="TrG5h" value="checkRefModelMore2Char" />
    <node concept="3clFbS" id="29H_ccUkGah" role="18ibNy">
      <node concept="3clFbJ" id="29H_ccUkGax" role="3cqZAp">
        <node concept="3eOVzh" id="29H_ccUkNdk" role="3clFbw">
          <node concept="3cmrfG" id="29H_ccUkNeg" role="3uHU7w">
            <property role="3cmrfH" value="2" />
          </node>
          <node concept="2OqwBi" id="29H_ccUkHcN" role="3uHU7B">
            <node concept="2OqwBi" id="29H_ccUkGkM" role="2Oq$k0">
              <node concept="1YBJjd" id="29H_ccUkGaE" role="2Oq$k0">
                <ref role="1YBMHb" node="29H_ccUkGaj" resolve="refModell" />
              </node>
              <node concept="3TrcHB" id="29H_ccUkGFR" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="liA8E" id="29H_ccUkI3f" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~String.length()" resolve="length" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="29H_ccUkGaz" role="3clFbx">
          <node concept="2MkqsV" id="29H_ccUkNm6" role="3cqZAp">
            <node concept="Xl_RD" id="29H_ccUkNmf" role="2MkJ7o">
              <property role="Xl_RC" value="RefModel name should have more then 2 characters" />
            </node>
            <node concept="1YBJjd" id="29H_ccUkNnE" role="1urrMF">
              <ref role="1YBMHb" node="29H_ccUkGaj" resolve="refModell" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="29H_ccUkGaj" role="1YuTPh">
      <property role="TrG5h" value="refModell" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="29H_ccUkNo0">
    <property role="TrG5h" value="checkRefModelVersionPattern" />
    <node concept="3clFbS" id="29H_ccUkNo1" role="18ibNy" />
    <node concept="1YaCAy" id="29H_ccUkNo3" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="5C09d0qFeli">
    <property role="TrG5h" value="checkUserTypeUnique" />
    <node concept="3clFbS" id="5C09d0qFelj" role="18ibNy">
      <node concept="3cpWs8" id="5C09d0qFmJg" role="3cqZAp">
        <node concept="3cpWsn" id="5C09d0qFmJj" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="5C09d0qFmJc" role="1tU5fm">
            <node concept="3uibUv" id="5C09d0qFobp" role="2hN53Y">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
          </node>
          <node concept="2ShNRf" id="5C09d0qFmKF" role="33vP2m">
            <node concept="2i4dXS" id="5C09d0qFo7f" role="2ShVmc">
              <node concept="3uibUv" id="5C09d0qFo9v" role="HW$YZ">
                <ref role="3uigEE" to="wyt6:~String" resolve="String" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="5C09d0qFexi" role="3cqZAp">
        <node concept="2GrKxI" id="5C09d0qFexj" role="2Gsz3X">
          <property role="TrG5h" value="userType" />
        </node>
        <node concept="2OqwBi" id="5C09d0qFeGj" role="2GsD0m">
          <node concept="1YBJjd" id="5C09d0qFey0" role="2Oq$k0">
            <ref role="1YBMHb" node="5C09d0qFell" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="5C09d0qFgH7" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:7vG6G7pFVDB" resolve="userType" />
          </node>
        </node>
        <node concept="3clFbS" id="5C09d0qFexl" role="2LFqv$">
          <node concept="3clFbJ" id="5C09d0qFmIM" role="3cqZAp">
            <node concept="2OqwBi" id="5C09d0qFp4m" role="3clFbw">
              <node concept="37vLTw" id="5C09d0qFoWJ" role="2Oq$k0">
                <ref role="3cqZAo" node="5C09d0qFmJj" resolve="names" />
              </node>
              <node concept="3JPx81" id="5C09d0qFqFU" role="2OqNvi">
                <node concept="2OqwBi" id="5C09d0qFrdm" role="25WWJ7">
                  <node concept="2GrUjf" id="5C09d0qFr2u" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="5C09d0qFexj" resolve="userType" />
                  </node>
                  <node concept="3TrcHB" id="5C09d0qFs7$" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="5C09d0qFmIO" role="3clFbx">
              <node concept="2MkqsV" id="5C09d0qFscJ" role="3cqZAp">
                <node concept="Xl_RD" id="5C09d0qFscS" role="2MkJ7o">
                  <property role="Xl_RC" value="UserType must be unique within the model." />
                </node>
                <node concept="1YBJjd" id="5C09d0qFsej" role="1urrMF">
                  <ref role="1YBMHb" node="5C09d0qFell" resolve="refModel" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="5C09d0qFseE" role="9aQIa">
              <node concept="3clFbS" id="5C09d0qFseF" role="9aQI4">
                <node concept="3clFbF" id="5C09d0qFsmv" role="3cqZAp">
                  <node concept="2OqwBi" id="5C09d0qFt1Y" role="3clFbG">
                    <node concept="37vLTw" id="5C09d0qFsmu" role="2Oq$k0">
                      <ref role="3cqZAo" node="5C09d0qFmJj" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="5C09d0qFuo8" role="2OqNvi">
                      <node concept="2OqwBi" id="5C09d0qFuE1" role="25WWJ7">
                        <node concept="2GrUjf" id="5C09d0qFuph" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="5C09d0qFexj" resolve="userType" />
                        </node>
                        <node concept="3TrcHB" id="5C09d0qFvvn" role="2OqNvi">
                          <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="5C09d0qFell" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="5C09d0qF_U9">
    <property role="TrG5h" value="checkUserTypeUppercase" />
    <node concept="3clFbS" id="5C09d0qF_Ua" role="18ibNy">
      <node concept="3clFbJ" id="5C09d0qF_Uz" role="3cqZAp">
        <node concept="3y3z36" id="5C09d0qFIob" role="3clFbw">
          <node concept="2OqwBi" id="5C09d0qFA6G" role="3uHU7B">
            <node concept="1YBJjd" id="5C09d0qF_UG" role="2Oq$k0">
              <ref role="1YBMHb" node="5C09d0qF_Uc" resolve="userType" />
            </node>
            <node concept="3TrcHB" id="5C09d0qFAwY" role="2OqNvi">
              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
            </node>
          </node>
          <node concept="10Nm6u" id="5C09d0qFIJT" role="3uHU7w" />
        </node>
        <node concept="3clFbS" id="5C09d0qF_U_" role="3clFbx">
          <node concept="3clFbJ" id="5C09d0qFOct" role="3cqZAp">
            <node concept="3fqX7Q" id="5C09d0qGaF5" role="3clFbw">
              <node concept="2YIFZM" id="5C09d0qGaF7" role="3fr31v">
                <ref role="37wK5l" to="wyt6:~Character.isUpperCase(char)" resolve="isUpperCase" />
                <ref role="1Pybhc" to="wyt6:~Character" resolve="Character" />
                <node concept="2OqwBi" id="5C09d0qGaF8" role="37wK5m">
                  <node concept="2OqwBi" id="5C09d0qGaF9" role="2Oq$k0">
                    <node concept="1YBJjd" id="5C09d0qGaFa" role="2Oq$k0">
                      <ref role="1YBMHb" node="5C09d0qF_Uc" resolve="userType" />
                    </node>
                    <node concept="3TrcHB" id="5C09d0qGaFb" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                  <node concept="liA8E" id="5C09d0qGaFc" role="2OqNvi">
                    <ref role="37wK5l" to="wyt6:~String.charAt(int)" resolve="charAt" />
                    <node concept="3cmrfG" id="5C09d0qGaFd" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="5C09d0qFOcv" role="3clFbx">
              <node concept="2MkqsV" id="5C09d0qFQNk" role="3cqZAp">
                <node concept="Xl_RD" id="5C09d0qFQNt" role="2MkJ7o">
                  <property role="Xl_RC" value="UserType name must start with an uppercase letter." />
                </node>
                <node concept="1YBJjd" id="5C09d0qFQPa" role="1urrMF">
                  <ref role="1YBMHb" node="5C09d0qF_Uc" resolve="userType" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="5C09d0qF_Uc" role="1YuTPh">
      <property role="TrG5h" value="userType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
    </node>
  </node>
  <node concept="18kY7G" id="5C09d0qFQQ1">
    <property role="TrG5h" value="checkNoSelfInSuperTypes" />
    <node concept="3clFbS" id="5C09d0qFQQ2" role="18ibNy">
      <node concept="2Gpval" id="5C09d0qG0Ql" role="3cqZAp">
        <node concept="2GrKxI" id="5C09d0qG0Qm" role="2Gsz3X">
          <property role="TrG5h" value="superType" />
        </node>
        <node concept="2OqwBi" id="5C09d0qG11p" role="2GsD0m">
          <node concept="1YBJjd" id="5C09d0qG0R6" role="2Oq$k0">
            <ref role="1YBMHb" node="5C09d0qFQQ5" resolve="userType" />
          </node>
          <node concept="3Tsc0h" id="5C09d0qG1nO" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:DrEcBK1he0" resolve="superType" />
          </node>
        </node>
        <node concept="3clFbS" id="5C09d0qG0Qo" role="2LFqv$">
          <node concept="3clFbJ" id="5C09d0qG1rZ" role="3cqZAp">
            <node concept="3clFbC" id="5C09d0qG1GO" role="3clFbw">
              <node concept="1YBJjd" id="5C09d0qG1Qb" role="3uHU7w">
                <ref role="1YBMHb" node="5C09d0qFQQ5" resolve="userType" />
              </node>
              <node concept="2OqwBi" id="5C09d0qG3xL" role="3uHU7B">
                <node concept="2GrUjf" id="5C09d0qG1s8" role="2Oq$k0">
                  <ref role="2Gs0qQ" node="5C09d0qG0Qm" resolve="superType" />
                </node>
                <node concept="3TrEf2" id="5C09d0qG4c7" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:DrEcBK1hdY" resolve="superType" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="5C09d0qG1s1" role="3clFbx">
              <node concept="2MkqsV" id="5C09d0qG4gA" role="3cqZAp">
                <node concept="Xl_RD" id="5C09d0qG4gJ" role="2MkJ7o">
                  <property role="Xl_RC" value="UserType cannot be its own supertype." />
                </node>
                <node concept="1YBJjd" id="5C09d0qG4hS" role="1urrMF">
                  <ref role="1YBMHb" node="5C09d0qFQQ5" resolve="userType" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="5C09d0qFQQ5" role="1YuTPh">
      <property role="TrG5h" value="userType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
    </node>
  </node>
  <node concept="18kY7G" id="5C09d0qGfWc">
    <property role="TrG5h" value="checkContextTypeNameUnique" />
    <node concept="3clFbS" id="5C09d0qGfWd" role="18ibNy">
      <node concept="3cpWs8" id="5C09d0qGm4F" role="3cqZAp">
        <node concept="3cpWsn" id="5C09d0qGm4I" role="3cpWs9">
          <property role="TrG5h" value="contextTypeNames" />
          <node concept="2hMVRd" id="5C09d0qGm4B" role="1tU5fm">
            <node concept="3uibUv" id="5C09d0qGm84" role="2hN53Y">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
          </node>
          <node concept="2ShNRf" id="5C09d0qGm94" role="33vP2m">
            <node concept="2i4dXS" id="5C09d0qGmlm" role="2ShVmc">
              <node concept="3uibUv" id="5C09d0qGmnM" role="HW$YZ">
                <ref role="3uigEE" to="wyt6:~String" resolve="String" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="5C09d0qGloR" role="3cqZAp">
        <node concept="2GrKxI" id="5C09d0qGloS" role="2Gsz3X">
          <property role="TrG5h" value="contextType" />
        </node>
        <node concept="2OqwBi" id="5C09d0qGl$x" role="2GsD0m">
          <node concept="1YBJjd" id="5C09d0qGlqe" role="2Oq$k0">
            <ref role="1YBMHb" node="5C09d0qGfWf" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="5C09d0qGlV_" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:3nWBi3h36Va" resolve="contextType" />
          </node>
        </node>
        <node concept="3clFbS" id="5C09d0qGloU" role="2LFqv$">
          <node concept="3clFbJ" id="5C09d0qGm0d" role="3cqZAp">
            <node concept="2OqwBi" id="5C09d0qGn4D" role="3clFbw">
              <node concept="37vLTw" id="5C09d0qGmol" role="2Oq$k0">
                <ref role="3cqZAo" node="5C09d0qGm4I" resolve="contextTypeNames" />
              </node>
              <node concept="3JPx81" id="5C09d0qGoGd" role="2OqNvi">
                <node concept="2OqwBi" id="5C09d0qGoSn" role="25WWJ7">
                  <node concept="2GrUjf" id="5C09d0qGoHv" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="5C09d0qGloS" resolve="contextType" />
                  </node>
                  <node concept="3TrcHB" id="5C09d0qGpEc" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="5C09d0qGm0f" role="3clFbx">
              <node concept="2MkqsV" id="5C09d0qGpJE" role="3cqZAp">
                <node concept="Xl_RD" id="5C09d0qGpJO" role="2MkJ7o">
                  <property role="Xl_RC" value="ContextType names must be unique." />
                </node>
                <node concept="1YBJjd" id="5C09d0qGpKX" role="1urrMF">
                  <ref role="1YBMHb" node="5C09d0qGfWf" resolve="refModel" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="5C09d0qGfWf" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
</model>

