<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:15564ed4-df53-409b-b2dd-ba3734930263(Ref.typesystem)">
  <persistence version="9" />
  <languages>
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="5" />
    <use id="443f4c36-fcf5-4eb6-9500-8d06ed259e3e" name="jetbrains.mps.baseLanguage.classifiers" version="0" />
    <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="2rvu" ref="r:322f8d2c-fa9d-4224-b267-a1958299e237(Ref.structure)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1153417849900" name="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" flags="nn" index="2d3UOw" />
      <concept id="1153422105332" name="jetbrains.mps.baseLanguage.structure.RemExpression" flags="nn" index="2dk9JS" />
      <concept id="1153422305557" name="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression" flags="nn" index="2dkUwp" />
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1076505808687" name="jetbrains.mps.baseLanguage.structure.WhileStatement" flags="nn" index="2$JKZl">
        <child id="1076505808688" name="condition" index="2$JKZa" />
      </concept>
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
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="1225271369338" name="jetbrains.mps.baseLanguage.structure.IsEmptyOperation" flags="nn" index="17RlXB" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
        <child id="1206060520071" name="elsifClauses" index="3eNLev" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242869" name="jetbrains.mps.baseLanguage.structure.MinusExpression" flags="nn" index="3cpWsd" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1206060495898" name="jetbrains.mps.baseLanguage.structure.ElsifClause" flags="ng" index="3eNFk2">
        <child id="1206060619838" name="condition" index="3eO9$A" />
        <child id="1206060644605" name="statementList" index="3eOfB_" />
      </concept>
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1081506773034" name="jetbrains.mps.baseLanguage.structure.LessThanExpression" flags="nn" index="3eOVzh" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="2524418899405758586" name="jetbrains.mps.baseLanguage.closures.structure.InferredClosureParameterDeclaration" flags="ig" index="gl6BB" />
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="443f4c36-fcf5-4eb6-9500-8d06ed259e3e" name="jetbrains.mps.baseLanguage.classifiers">
      <concept id="1205752633985" name="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression" flags="nn" index="2WthIp" />
      <concept id="1205756064662" name="jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation" flags="ngI" index="2WEnae">
        <reference id="1205756909548" name="member" index="2WH_rO" />
      </concept>
      <concept id="1205769003971" name="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" flags="ng" index="2XrIbr" />
      <concept id="1205769149993" name="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" flags="nn" index="2XshWL" />
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1175517767210" name="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement" flags="nn" index="2MkqsV">
        <child id="1175517851849" name="errorString" index="2MkJ7o" />
      </concept>
      <concept id="1216383170661" name="jetbrains.mps.lang.typesystem.structure.TypesystemQuickFix" flags="ng" index="Q5z_Y">
        <child id="1216383424566" name="executeBlock" index="Q6x$H" />
        <child id="1216383476350" name="quickFixArgument" index="Q6Id_" />
        <child id="1216391046856" name="descriptionBlock" index="QzAvj" />
        <child id="1205851242421" name="methodDeclaration" index="32lrUH" />
        <child id="8090891477833133023" name="quickFixField" index="3OczkL" />
      </concept>
      <concept id="1216383287005" name="jetbrains.mps.lang.typesystem.structure.QuickFixExecuteBlock" flags="in" index="Q5ZZ6" />
      <concept id="1216383482742" name="jetbrains.mps.lang.typesystem.structure.QuickFixArgument" flags="ng" index="Q6JDH">
        <child id="1216383511839" name="argumentType" index="Q6QK4" />
      </concept>
      <concept id="1216390348809" name="jetbrains.mps.lang.typesystem.structure.QuickFixArgumentReference" flags="nn" index="QwW4i">
        <reference id="1216390348810" name="quickFixArgument" index="QwW4h" />
      </concept>
      <concept id="1216390987552" name="jetbrains.mps.lang.typesystem.structure.QuickFixDescriptionBlock" flags="in" index="QznSV" />
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1195214364922" name="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule" flags="ig" index="18kY7G" />
      <concept id="3937244445246642777" name="jetbrains.mps.lang.typesystem.structure.AbstractReportStatement" flags="ng" index="1urrMJ">
        <child id="3937244445246643221" name="helginsIntention" index="1urrFz" />
        <child id="3937244445246642781" name="nodeToReport" index="1urrMF" />
      </concept>
      <concept id="1210784285454" name="jetbrains.mps.lang.typesystem.structure.TypesystemIntention" flags="ng" index="3Cnw8n">
        <property id="1216127910019" name="applyImmediately" index="ARO6o" />
        <reference id="1216388525179" name="quickFix" index="QpYPw" />
        <child id="1210784493590" name="actualArgument" index="3Coj4f" />
      </concept>
      <concept id="1210784384552" name="jetbrains.mps.lang.typesystem.structure.TypesystemIntentionArgument" flags="ng" index="3CnSsL">
        <reference id="1216386999476" name="quickFixArgument" index="QkamJ" />
        <child id="1210784642750" name="value" index="3CoRuB" />
      </concept>
      <concept id="8090891477833017662" name="jetbrains.mps.lang.typesystem.structure.QuickFixField" flags="ng" index="3Oc7vg">
        <child id="8090891477833017663" name="fieldType" index="3Oc7vh" />
      </concept>
      <concept id="8090891477833069917" name="jetbrains.mps.lang.typesystem.structure.QuickFixFieldReference" flags="nn" index="3OciIN">
        <reference id="8090891477833069918" name="quickFixField" index="3OciIK" />
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
    <language id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging">
      <concept id="6332851714983831325" name="jetbrains.mps.baseLanguage.logging.structure.MsgStatement" flags="ng" index="2xdQw9">
        <property id="6332851714983843871" name="severity" index="2xdLsb" />
        <child id="5721587534047265374" name="message" index="9lYJi" />
        <child id="2096919206290089922" name="hint" index="1wxasE" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1140725362528" name="jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation" flags="nn" index="2oxUTD">
        <child id="1140725362529" name="linkTarget" index="2oxUTC" />
      </concept>
      <concept id="1138661924179" name="jetbrains.mps.lang.smodel.structure.Property_SetOperation" flags="nn" index="tyxLq">
        <child id="1138662048170" name="value" index="tz02z" />
      </concept>
      <concept id="7453996997717780434" name="jetbrains.mps.lang.smodel.structure.Node_GetSConceptOperation" flags="nn" index="2yIwOk" />
      <concept id="1966870290088668512" name="jetbrains.mps.lang.smodel.structure.Enum_MemberLiteral" flags="ng" index="2ViDtV">
        <reference id="1966870290088668516" name="memberDeclaration" index="2ViDtZ" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="1171999116870" name="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" flags="nn" index="3w_OXm" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1146253292180" name="jetbrains.mps.lang.smodel.structure.Property_HasValue_Simple" flags="nn" index="3y1jeu">
        <child id="1146253292181" name="value" index="3y1jev" />
      </concept>
      <concept id="1180636770613" name="jetbrains.mps.lang.smodel.structure.SNodeCreator" flags="nn" index="3zrR0B">
        <child id="1180636770616" name="createdType" index="3zrR0E" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
      <concept id="5779574625830813396" name="jetbrains.mps.lang.smodel.structure.EnumerationIdRefExpression" flags="ng" index="1XH99k">
        <reference id="5779574625830813397" name="enumDeclaration" index="1XH99l" />
      </concept>
      <concept id="1228341669568" name="jetbrains.mps.lang.smodel.structure.Node_DetachOperation" flags="nn" index="3YRAZt" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="779128492853369165" name="jetbrains.mps.lang.core.structure.SideTransformInfo" flags="ng" index="1KehLL">
        <property id="779128492853934523" name="cellId" index="1K8rM7" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
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
      <concept id="1167380149909" name="jetbrains.mps.baseLanguage.collections.structure.RemoveElementOperation" flags="nn" index="3dhRuq" />
      <concept id="1165525191778" name="jetbrains.mps.baseLanguage.collections.structure.GetFirstOperation" flags="nn" index="1uHKPH" />
      <concept id="1225727723840" name="jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation" flags="nn" index="1z4cxt" />
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
    <property role="TrG5h" value="checkUserTypeNameUnique" />
    <node concept="3clFbS" id="5C09d0qFelj" role="18ibNy">
      <node concept="3cpWs8" id="5C09d0qFmJg" role="3cqZAp">
        <node concept="3cpWsn" id="5C09d0qFmJj" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="5C09d0qFmJc" role="1tU5fm">
            <node concept="17QB3L" id="3HQf9TjwvED" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="5C09d0qFmKF" role="33vP2m">
            <node concept="2i4dXS" id="5C09d0qFo7f" role="2ShVmc">
              <node concept="17QB3L" id="3HQf9TjwvAL" role="HW$YZ" />
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
            <ref role="3TtcxE" to="2rvu:47EFX_mxMIt" resolve="userType" />
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
                <node concept="2GrUjf" id="3HQf9TjwNsS" role="1urrMF">
                  <ref role="2Gs0qQ" node="5C09d0qFexj" resolve="userType" />
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
  <node concept="18kY7G" id="5C09d0qFQQ1">
    <property role="TrG5h" value="checkNoSelfInUserTypeSuperTypes" />
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
            <node concept="17QB3L" id="3HQf9Tjwv0T" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="5C09d0qGm94" role="33vP2m">
            <node concept="2i4dXS" id="5C09d0qGmlm" role="2ShVmc">
              <node concept="17QB3L" id="3HQf9TjwuXN" role="HW$YZ" />
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
                <node concept="2GrUjf" id="3HQf9TjwNHQ" role="1urrMF">
                  <ref role="2Gs0qQ" node="5C09d0qGloS" resolve="contextType" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="3HQf9TjwNL4" role="9aQIa">
              <node concept="3clFbS" id="3HQf9TjwNL5" role="9aQI4">
                <node concept="3clFbF" id="3HQf9TjwNMQ" role="3cqZAp">
                  <node concept="2OqwBi" id="3HQf9TjwOuF" role="3clFbG">
                    <node concept="37vLTw" id="3HQf9TjwNMP" role="2Oq$k0">
                      <ref role="3cqZAo" node="5C09d0qGm4I" resolve="contextTypeNames" />
                    </node>
                    <node concept="TSZUe" id="3HQf9TjwQ6z" role="2OqNvi">
                      <node concept="2OqwBi" id="3HQf9TjwQpq" role="25WWJ7">
                        <node concept="2GrUjf" id="3HQf9TjwQ8c" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="5C09d0qGloS" resolve="contextType" />
                        </node>
                        <node concept="3TrcHB" id="3HQf9TjwR7G" role="2OqNvi">
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
    <node concept="1YaCAy" id="5C09d0qGfWf" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9Tjw6db">
    <property role="TrG5h" value="checkResourceTypeNameUnique" />
    <node concept="3clFbS" id="3HQf9Tjw6dc" role="18ibNy">
      <node concept="3cpWs8" id="3HQf9Tjw6ea" role="3cqZAp">
        <node concept="3cpWsn" id="3HQf9Tjw6ed" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="3HQf9Tjw6e8" role="1tU5fm">
            <node concept="17QB3L" id="3HQf9Tjwvgj" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="3HQf9Tjw6fR" role="33vP2m">
            <node concept="2i4dXS" id="3HQf9Tjw7Qv" role="2ShVmc">
              <node concept="17QB3L" id="3HQf9Tjwvdd" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="3HQf9Tjw7XU" role="3cqZAp">
        <node concept="2GrKxI" id="3HQf9Tjw7XW" role="2Gsz3X">
          <property role="TrG5h" value="resourceType" />
        </node>
        <node concept="2OqwBi" id="3HQf9Tjw8a3" role="2GsD0m">
          <node concept="1YBJjd" id="3HQf9Tjw7ZK" role="2Oq$k0">
            <ref role="1YBMHb" node="3HQf9Tjw6dC" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="3HQf9Tjwac9" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:7vG6G7pFVDC" resolve="resourceType" />
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9Tjw7Y0" role="2LFqv$">
          <node concept="3clFbJ" id="3HQf9Tjwagx" role="3cqZAp">
            <node concept="2OqwBi" id="3HQf9TjwaWY" role="3clFbw">
              <node concept="37vLTw" id="3HQf9TjwagE" role="2Oq$k0">
                <ref role="3cqZAo" node="3HQf9Tjw6ed" resolve="names" />
              </node>
              <node concept="3JPx81" id="3HQf9TjwdYC" role="2OqNvi">
                <node concept="2OqwBi" id="3HQf9TjweaM" role="25WWJ7">
                  <node concept="2GrUjf" id="3HQf9TjwdZU" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="3HQf9Tjw7XW" resolve="resourceType" />
                  </node>
                  <node concept="3TrcHB" id="3HQf9TjweWZ" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="3HQf9Tjwagz" role="3clFbx">
              <node concept="2MkqsV" id="3HQf9Tjwf2y" role="3cqZAp">
                <node concept="Xl_RD" id="3HQf9Tjwf2G" role="2MkJ7o">
                  <property role="Xl_RC" value="ResourceType names must be unique." />
                </node>
                <node concept="2GrUjf" id="3HQf9TjwHLa" role="1urrMF">
                  <ref role="2Gs0qQ" node="3HQf9Tjw7XW" resolve="resourceType" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="3HQf9Tjw$TH" role="9aQIa">
              <node concept="3clFbS" id="3HQf9Tjw$TI" role="9aQI4">
                <node concept="3clFbF" id="3HQf9Tjw$XN" role="3cqZAp">
                  <node concept="2OqwBi" id="3HQf9Tjw_DC" role="3clFbG">
                    <node concept="37vLTw" id="3HQf9Tjw$XM" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HQf9Tjw6ed" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="3HQf9TjwBbH" role="2OqNvi">
                      <node concept="2OqwBi" id="3HQf9TjwBu0" role="25WWJ7">
                        <node concept="2GrUjf" id="3HQf9TjwBcS" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="3HQf9Tjw7XW" resolve="resourceType" />
                        </node>
                        <node concept="3TrcHB" id="3HQf9TjwCiA" role="2OqNvi">
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
    <node concept="1YaCAy" id="3HQf9Tjw6dC" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9TjwRbB">
    <property role="TrG5h" value="checkAttributeNameUniqueResourceType" />
    <node concept="3clFbS" id="3HQf9TjwRbC" role="18ibNy">
      <node concept="3cpWs8" id="3HQf9TjwRcf" role="3cqZAp">
        <node concept="3cpWsn" id="3HQf9TjwRci" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="3HQf9TjwRcd" role="1tU5fm">
            <node concept="17QB3L" id="3HQf9TjwRdf" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="3HQf9TjwRe5" role="33vP2m">
            <node concept="2i4dXS" id="3HQf9TjwRtR" role="2ShVmc">
              <node concept="17QB3L" id="3HQf9TjwRwx" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="3HQf9TjwRxD" role="3cqZAp">
        <node concept="2GrKxI" id="3HQf9TjwRxF" role="2Gsz3X">
          <property role="TrG5h" value="attribute" />
        </node>
        <node concept="2OqwBi" id="3HQf9TjwRH0" role="2GsD0m">
          <node concept="1YBJjd" id="3HQf9TjwRyH" role="2Oq$k0">
            <ref role="1YBMHb" node="3HQf9TjwRbE" resolve="resourceType" />
          </node>
          <node concept="3Tsc0h" id="3HQf9TjwS3r" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9TjwRxJ" role="2LFqv$">
          <node concept="3clFbJ" id="3HQf9TjwS7Q" role="3cqZAp">
            <node concept="3clFbS" id="3HQf9TjwS7S" role="3clFbx">
              <node concept="2MkqsV" id="3HQf9TjwWHP" role="3cqZAp">
                <node concept="Xl_RD" id="3HQf9TjwWHY" role="2MkJ7o">
                  <property role="Xl_RC" value="Attribute names must be unique within ResourceType." />
                </node>
                <node concept="2GrUjf" id="3HQf9Tjx73a" role="1urrMF">
                  <ref role="2Gs0qQ" node="3HQf9TjwRxF" resolve="attribute" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="3HQf9TjwU7y" role="3clFbw">
              <node concept="37vLTw" id="3HQf9TjwTp7" role="2Oq$k0">
                <ref role="3cqZAo" node="3HQf9TjwRci" resolve="names" />
              </node>
              <node concept="3JPx81" id="3HQf9TjwV_T" role="2OqNvi">
                <node concept="2OqwBi" id="3HQf9TjwVQ4" role="25WWJ7">
                  <node concept="2GrUjf" id="3HQf9TjwVDe" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="3HQf9TjwRxF" resolve="attribute" />
                  </node>
                  <node concept="3TrcHB" id="3HQf9TjwW_V" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="3HQf9TjwWIM" role="9aQIa">
              <node concept="3clFbS" id="3HQf9TjwWIN" role="9aQI4">
                <node concept="3clFbF" id="3HQf9TjwWQB" role="3cqZAp">
                  <node concept="2OqwBi" id="3HQf9TjwXys" role="3clFbG">
                    <node concept="37vLTw" id="3HQf9TjwWQA" role="2Oq$k0">
                      <ref role="3cqZAo" node="3HQf9TjwRci" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="3HQf9TjwZN0" role="2OqNvi">
                      <node concept="2OqwBi" id="3HQf9Tjx05R" role="25WWJ7">
                        <node concept="2GrUjf" id="3HQf9TjwZOD" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="3HQf9TjwRxF" resolve="attribute" />
                        </node>
                        <node concept="3TrcHB" id="3HQf9Tjx0SZ" role="2OqNvi">
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
    <node concept="1YaCAy" id="3HQf9TjwRbE" role="1YuTPh">
      <property role="TrG5h" value="resourceType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9TjxdjR">
    <property role="TrG5h" value="checkFeedbackTypeNameUnique" />
    <node concept="3clFbS" id="3HQf9TjxdjS" role="18ibNy">
      <node concept="3cpWs8" id="3HQf9TjxdkC" role="3cqZAp">
        <node concept="3cpWsn" id="3HQf9TjxdkF" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="3HQf9TjxdkA" role="1tU5fm">
            <node concept="17QB3L" id="3HQf9TjxdlI" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="3HQf9Tjxdmv" role="33vP2m">
            <node concept="2i4dXS" id="3HQf9TjxdyL" role="2ShVmc">
              <node concept="17QB3L" id="3HQf9Tjxd_x" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="3HQf9TjxdBx" role="3cqZAp">
        <node concept="2GrKxI" id="3HQf9TjxdBz" role="2Gsz3X">
          <property role="TrG5h" value="feedbackType" />
        </node>
        <node concept="2OqwBi" id="3HQf9TjxdN2" role="2GsD0m">
          <node concept="1YBJjd" id="3HQf9TjxdCJ" role="2Oq$k0">
            <ref role="1YBMHb" node="3HQf9TjxdjU" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="3HQf9Tjxei_" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:47EFX_njBiV" resolve="feedbackType" />
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9TjxdBB" role="2LFqv$">
          <node concept="3clFbJ" id="3HQf9Tjxen3" role="3cqZAp">
            <node concept="2OqwBi" id="3HQf9Tjxf3G" role="3clFbw">
              <node concept="37vLTw" id="3HQf9Tjxenc" role="2Oq$k0">
                <ref role="3cqZAo" node="3HQf9TjxdkF" resolve="names" />
              </node>
              <node concept="3JPx81" id="3HQf9TjxgFC" role="2OqNvi">
                <node concept="2OqwBi" id="3HQf9TjxgRS" role="25WWJ7">
                  <node concept="2GrUjf" id="3HQf9TjxgH0" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="3HQf9TjxdBz" resolve="feedbackType" />
                  </node>
                  <node concept="3TrcHB" id="3HQf9TjxhDH" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="3HQf9Tjxen5" role="3clFbx">
              <node concept="2MkqsV" id="3HQf9TjxhJp" role="3cqZAp">
                <node concept="Xl_RD" id="3HQf9TjxhJy" role="2MkJ7o">
                  <property role="Xl_RC" value="FeedbackType names must be unique" />
                </node>
                <node concept="2GrUjf" id="3HQf9TjxhJR" role="1urrMF">
                  <ref role="2Gs0qQ" node="3HQf9TjxdBz" resolve="feedbackType" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3HQf9TjxdjU" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9Tjxn8l">
    <property role="TrG5h" value="checkResourceTypeName2Char" />
    <node concept="3clFbS" id="3HQf9Tjxn8m" role="18ibNy">
      <node concept="3clFbJ" id="3HQf9Tjxnvl" role="3cqZAp">
        <node concept="3eOVzh" id="3HQf9Tjxqll" role="3clFbw">
          <node concept="3cmrfG" id="3HQf9Tjxqlo" role="3uHU7w">
            <property role="3cmrfH" value="2" />
          </node>
          <node concept="2OqwBi" id="3HQf9TjxorW" role="3uHU7B">
            <node concept="2OqwBi" id="3HQf9TjxnHK" role="2Oq$k0">
              <node concept="1YBJjd" id="3HQf9Tjxnzq" role="2Oq$k0">
                <ref role="1YBMHb" node="3HQf9Tjxn8o" resolve="resourceType" />
              </node>
              <node concept="3TrcHB" id="3HQf9TjxnUP" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="liA8E" id="3HQf9TjxpkE" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~String.length()" resolve="length" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9Tjxnvn" role="3clFbx">
          <node concept="2MkqsV" id="3HQf9Tjxnym" role="3cqZAp">
            <node concept="Xl_RD" id="3HQf9Tjxnyv" role="2MkJ7o">
              <property role="Xl_RC" value="ResourceType name should have more then 2 characters" />
            </node>
            <node concept="1YBJjd" id="3HQf9Tjxnz4" role="1urrMF">
              <ref role="1YBMHb" node="3HQf9Tjxn8o" resolve="resourceType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3HQf9Tjxn8o" role="1YuTPh">
      <property role="TrG5h" value="resourceType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9TjxqET">
    <property role="TrG5h" value="checkNoSelfInResourceTypeSuperTypes" />
    <node concept="3clFbS" id="3HQf9TjxqEU" role="18ibNy">
      <node concept="2Gpval" id="3HQf9TjxqQw" role="3cqZAp">
        <node concept="2GrKxI" id="3HQf9TjxqQx" role="2Gsz3X">
          <property role="TrG5h" value="superType" />
        </node>
        <node concept="2OqwBi" id="3HQf9Tjxreu" role="2GsD0m">
          <node concept="1YBJjd" id="3HQf9Tjxr4b" role="2Oq$k0">
            <ref role="1YBMHb" node="3HQf9TjxqEX" resolve="resourceType" />
          </node>
          <node concept="3Tsc0h" id="3HQf9Tjxr_y" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:DrEcBK1hdW" resolve="superType" />
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9TjxqQz" role="2LFqv$">
          <node concept="3clFbJ" id="3HQf9TjxrE2" role="3cqZAp">
            <node concept="3clFbC" id="3HQf9TjxsJl" role="3clFbw">
              <node concept="1YBJjd" id="3HQf9TjxsRe" role="3uHU7w">
                <ref role="1YBMHb" node="3HQf9TjxqEX" resolve="resourceType" />
              </node>
              <node concept="2OqwBi" id="3HQf9TjxrPh" role="3uHU7B">
                <node concept="2GrUjf" id="3HQf9TjxrEb" role="2Oq$k0">
                  <ref role="2Gs0qQ" node="3HQf9TjxqQx" resolve="superType" />
                </node>
                <node concept="3TrEf2" id="3HQf9TjxspP" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:DrEcBK1hdS" resolve="superType" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="3HQf9TjxrE4" role="3clFbx">
              <node concept="2MkqsV" id="3HQf9TjxsUu" role="3cqZAp">
                <node concept="Xl_RD" id="3HQf9TjxsUB" role="2MkJ7o">
                  <property role="Xl_RC" value="ResourceType cannot be its own supertype." />
                </node>
                <node concept="2GrUjf" id="3HQf9TjxsWt" role="1urrMF">
                  <ref role="2Gs0qQ" node="3HQf9TjxqQx" resolve="superType" />
                </node>
                <node concept="3Cnw8n" id="or9vidLfo3" role="1urrFz">
                  <ref role="QpYPw" node="or9vidKqCZ" resolve="removeResourceTypeSuperTypeWhenContainSelf" />
                  <node concept="3CnSsL" id="or9vidLfqs" role="3Coj4f">
                    <ref role="QkamJ" node="or9vidKqDq" resolve="resourceType" />
                    <node concept="1YBJjd" id="or9vidLfqB" role="3CoRuB">
                      <ref role="1YBMHb" node="3HQf9TjxqEX" resolve="resourceType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3HQf9TjxqEX" role="1YuTPh">
      <property role="TrG5h" value="resourceType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9TjxsWN">
    <property role="TrG5h" value="checkResourceRelationNonRecursiveSourceTarget" />
    <node concept="3clFbS" id="3HQf9TjxsWO" role="18ibNy">
      <node concept="3clFbJ" id="3HQf9TjxvQR" role="3cqZAp">
        <node concept="1Wc70l" id="3HQf9Tjxzlq" role="3clFbw">
          <node concept="1eOMI4" id="3HQf9Tjx_nZ" role="3uHU7w">
            <node concept="3clFbC" id="3HQf9Tjx$jO" role="1eOMHV">
              <node concept="2OqwBi" id="3HQf9Tjx$H_" role="3uHU7w">
                <node concept="1YBJjd" id="3HQf9Tjx$rc" role="2Oq$k0">
                  <ref role="1YBMHb" node="3HQf9TjxvQ5" resolve="resourceRelation" />
                </node>
                <node concept="3TrEf2" id="3HQf9Tjx_ed" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zse" resolve="targetResourceType" />
                </node>
              </node>
              <node concept="2OqwBi" id="3HQf9TjxzAX" role="3uHU7B">
                <node concept="1YBJjd" id="3HQf9Tjxzqu" role="2Oq$k0">
                  <ref role="1YBMHb" node="3HQf9TjxvQ5" resolve="resourceRelation" />
                </node>
                <node concept="3TrEf2" id="3HQf9Tjx$0s" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:7vG6G7pG76W" resolve="sourceResourceType" />
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="3HQf9TjxxE3" role="3uHU7B">
            <node concept="2OqwBi" id="3HQf9Tjxw30" role="2Oq$k0">
              <node concept="1YBJjd" id="3HQf9TjxvR0" role="2Oq$k0">
                <ref role="1YBMHb" node="3HQf9TjxvQ5" resolve="resourceRelation" />
              </node>
              <node concept="3TrcHB" id="3HQf9Tjxwrn" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pG76V" resolve="recursive" />
              </node>
            </node>
            <node concept="3y1jeu" id="3HQf9TjxyfH" role="2OqNvi">
              <node concept="3clFbT" id="3HQf9TjxyiV" role="3y1jev" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9TjxvQT" role="3clFbx">
          <node concept="2MkqsV" id="3HQf9Tjx_pW" role="3cqZAp">
            <node concept="Xl_RD" id="3HQf9Tjx_q5" role="2MkJ7o">
              <property role="Xl_RC" value="Non-recursive relation cannot have same source and target." />
            </node>
            <node concept="1YBJjd" id="3HQf9Tjx_qy" role="1urrMF">
              <ref role="1YBMHb" node="3HQf9TjxvQ5" resolve="resourceRelation" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3HQf9TjxvQ5" role="1YuTPh">
      <property role="TrG5h" value="resourceRelation" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Uo" resolve="ResourceRelation" />
    </node>
  </node>
  <node concept="18kY7G" id="3HQf9TjxS9W">
    <property role="TrG5h" value="checkResourceRelationUnique" />
    <node concept="3clFbS" id="3HQf9TjxS9X" role="18ibNy">
      <node concept="3cpWs8" id="3HQf9TjxTbq" role="3cqZAp">
        <node concept="3cpWsn" id="3HQf9TjxTbt" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="3HQf9TjxTbo" role="1tU5fm">
            <node concept="17QB3L" id="3HQf9TjxTcY" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="3HQf9TjxTdO" role="33vP2m">
            <node concept="2i4dXS" id="3HQf9TjxTtA" role="2ShVmc">
              <node concept="17QB3L" id="3HQf9TjxTvS" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="3HQf9TjxTxo" role="3cqZAp">
        <node concept="2GrKxI" id="3HQf9TjxTxq" role="2Gsz3X">
          <property role="TrG5h" value="resourceRelation" />
        </node>
        <node concept="2OqwBi" id="3HQf9TjxTHF" role="2GsD0m">
          <node concept="1YBJjd" id="3HQf9TjxTzo" role="2Oq$k0">
            <ref role="1YBMHb" node="3HQf9TjxS9Z" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="3HQf9TjxU5o" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:3nWBi3h36Vo" resolve="resourceRelation" />
          </node>
        </node>
        <node concept="3clFbS" id="3HQf9TjxTxu" role="2LFqv$">
          <node concept="3clFbJ" id="3HQf9TjxUa5" role="3cqZAp">
            <node concept="2OqwBi" id="3HQf9TjxUQI" role="3clFbw">
              <node concept="37vLTw" id="3HQf9TjxUae" role="2Oq$k0">
                <ref role="3cqZAo" node="3HQf9TjxTbt" resolve="names" />
              </node>
              <node concept="3JPx81" id="3HQf9TjxWCp" role="2OqNvi">
                <node concept="2OqwBi" id="3HQf9TjxWOD" role="25WWJ7">
                  <node concept="2GrUjf" id="3HQf9TjxWDL" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="3HQf9TjxTxq" resolve="resourceRelation" />
                  </node>
                  <node concept="3TrcHB" id="3HQf9TjxXAu" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="3HQf9TjxUa7" role="3clFbx">
              <node concept="2MkqsV" id="3HQf9TjxXGM" role="3cqZAp">
                <node concept="Xl_RD" id="3HQf9TjxXGW" role="2MkJ7o">
                  <property role="Xl_RC" value="ResourceRelation names should be unique." />
                </node>
                <node concept="2GrUjf" id="3HQf9TjxXIn" role="1urrMF">
                  <ref role="2Gs0qQ" node="3HQf9TjxTxq" resolve="resourceRelation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3HQf9TjxS9Z" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="1CDfzOrScIb">
    <property role="TrG5h" value="checkFeedbackDefinitionTargetItselfViaSubjectFeedback" />
    <node concept="3clFbS" id="1CDfzOrScIc" role="18ibNy">
      <node concept="3clFbH" id="1CDfzOrSdgv" role="3cqZAp" />
      <node concept="3clFbJ" id="1CDfzOrScJ9" role="3cqZAp">
        <node concept="3clFbC" id="1CDfzOrSeJ_" role="3clFbw">
          <node concept="2OqwBi" id="1CDfzOrSfQE" role="3uHU7w">
            <node concept="1XH99k" id="1CDfzOrSf3F" role="2Oq$k0">
              <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
            </node>
            <node concept="2ViDtV" id="1CDfzOrSgqC" role="2OqNvi">
              <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
            </node>
          </node>
          <node concept="2OqwBi" id="1CDfzOrSdGf" role="3uHU7B">
            <node concept="2OqwBi" id="1CDfzOrScTq" role="2Oq$k0">
              <node concept="1YBJjd" id="1CDfzOrScJi" role="2Oq$k0">
                <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1CDfzOrSdvd" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
              </node>
            </node>
            <node concept="3TrcHB" id="1CDfzOrSe7B" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1CDfzOrScJb" role="3clFbx">
          <node concept="3clFbJ" id="1CDfzOrSgs4" role="3cqZAp">
            <node concept="3clFbC" id="1CDfzOrShsw" role="3clFbw">
              <node concept="10Nm6u" id="1CDfzOrShFG" role="3uHU7w" />
              <node concept="2OqwBi" id="1CDfzOrSgAl" role="3uHU7B">
                <node concept="1YBJjd" id="1CDfzOrSgsd" role="2Oq$k0">
                  <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1CDfzOrSh79" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1CDfzOrSgs6" role="3clFbx">
              <node concept="2MkqsV" id="1CDfzOrShHV" role="3cqZAp">
                <node concept="Xl_RD" id="1CDfzOrShI4" role="2MkJ7o">
                  <property role="Xl_RC" value="FeedbackDefinition with RESOURCE_ONLY scope must have subjectResource." />
                </node>
                <node concept="1YBJjd" id="1CDfzOrShIx" role="1urrMF">
                  <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1CDfzOrShTw" role="3cqZAp">
            <node concept="3clFbS" id="1CDfzOrShTy" role="3clFbx">
              <node concept="2MkqsV" id="1CDfzOrSj4j" role="3cqZAp">
                <node concept="Xl_RD" id="1CDfzOrSj4v" role="2MkJ7o">
                  <property role="Xl_RC" value="FeedbackDefinition with RESOURCE_ONLY scope cannot have subjectFeedback." />
                </node>
                <node concept="1YBJjd" id="1CDfzOrSj4W" role="1urrMF">
                  <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
            <node concept="3y3z36" id="1CDfzOrSiUa" role="3clFbw">
              <node concept="10Nm6u" id="1CDfzOrSj1B" role="3uHU7w" />
              <node concept="2OqwBi" id="1CDfzOrSi3N" role="3uHU7B">
                <node concept="1YBJjd" id="1CDfzOrShTF" role="2Oq$k0">
                  <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1CDfzOrSitk" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3eNFk2" id="1CDfzOrSj5x" role="3eNLev">
          <node concept="3clFbC" id="1CDfzOrSkQJ" role="3eO9$A">
            <node concept="2OqwBi" id="1CDfzOrSlF8" role="3uHU7w">
              <node concept="1XH99k" id="1CDfzOrSkUA" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
              </node>
              <node concept="2ViDtV" id="1CDfzOrSmsV" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656rd" resolve="FEEDBACK_ONLY" />
              </node>
            </node>
            <node concept="2OqwBi" id="1CDfzOrSk8j" role="3uHU7B">
              <node concept="2OqwBi" id="1CDfzOrSjpP" role="2Oq$k0">
                <node concept="1YBJjd" id="1CDfzOrSjfH" role="2Oq$k0">
                  <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1CDfzOrSjVU" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="3TrcHB" id="1CDfzOrSkzI" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="1CDfzOrSj5z" role="3eOfB_">
            <node concept="3clFbJ" id="1CDfzOrSmvN" role="3cqZAp">
              <node concept="3clFbC" id="1CDfzOrSnFN" role="3clFbw">
                <node concept="10Nm6u" id="1CDfzOrSnNT" role="3uHU7w" />
                <node concept="2OqwBi" id="1CDfzOrSmE4" role="3uHU7B">
                  <node concept="1YBJjd" id="1CDfzOrSmvW" role="2Oq$k0">
                    <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrEf2" id="1CDfzOrSn39" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="1CDfzOrSmvP" role="3clFbx">
                <node concept="2MkqsV" id="1CDfzOrSnSD" role="3cqZAp">
                  <node concept="Xl_RD" id="1CDfzOrSnSM" role="2MkJ7o">
                    <property role="Xl_RC" value="FeedbackDefinition with FEEDBACK_ONLY scope must have subjectFeedback" />
                  </node>
                  <node concept="1YBJjd" id="1CDfzOrSnV3" role="1urrMF">
                    <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="1CDfzOrSnWs" role="3cqZAp">
              <node concept="3clFbS" id="1CDfzOrSnWu" role="3clFbx">
                <node concept="2MkqsV" id="1CDfzOrSpHu" role="3cqZAp">
                  <node concept="Xl_RD" id="1CDfzOrSpHE" role="2MkJ7o">
                    <property role="Xl_RC" value="FeedbackDefinition with FEEDBACK_ONLY scope cannot have subjectResource." />
                  </node>
                  <node concept="1YBJjd" id="1CDfzOrSpI7" role="1urrMF">
                    <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                  </node>
                </node>
              </node>
              <node concept="3y3z36" id="1CDfzOrSpwM" role="3clFbw">
                <node concept="10Nm6u" id="1CDfzOrSpDl" role="3uHU7w" />
                <node concept="2OqwBi" id="1CDfzOrSo6J" role="3uHU7B">
                  <node concept="1YBJjd" id="1CDfzOrSnWB" role="2Oq$k0">
                    <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrEf2" id="1CDfzOrSoDO" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3eNFk2" id="1CDfzOrSpIH" role="3eNLev">
          <node concept="3clFbC" id="1CDfzOrSrwJ" role="3eO9$A">
            <node concept="2OqwBi" id="1CDfzOrSsEc" role="3uHU7w">
              <node concept="1XH99k" id="1CDfzOrSr$f" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
              </node>
              <node concept="2ViDtV" id="1CDfzOrStie" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656re" resolve="RESOURCE_OR_FEEDBACK" />
              </node>
            </node>
            <node concept="2OqwBi" id="1CDfzOrSqQv" role="3uHU7B">
              <node concept="2OqwBi" id="1CDfzOrSq4u" role="2Oq$k0">
                <node concept="1YBJjd" id="1CDfzOrSpUm" role="2Oq$k0">
                  <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1CDfzOrSqCD" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="3TrcHB" id="1CDfzOrSrjI" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="1CDfzOrSpIJ" role="3eOfB_">
            <node concept="3clFbJ" id="1CDfzOrStmz" role="3cqZAp">
              <node concept="3clFbC" id="1CDfzOrSywM" role="3clFbw">
                <node concept="3clFbT" id="1CDfzOrSy_i" role="3uHU7w">
                  <property role="3clFbU" value="true" />
                </node>
                <node concept="1eOMI4" id="1CDfzOrSxKg" role="3uHU7B">
                  <node concept="1Wc70l" id="1CDfzOrSwF0" role="1eOMHV">
                    <node concept="3clFbC" id="1CDfzOrSwi3" role="3uHU7B">
                      <node concept="10Nm6u" id="1CDfzOrSwAM" role="3uHU7w" />
                      <node concept="2OqwBi" id="1CDfzOrStwO" role="3uHU7B">
                        <node concept="1YBJjd" id="1CDfzOrStmG" role="2Oq$k0">
                          <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                        </node>
                        <node concept="3TrEf2" id="1CDfzOrStVm" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbC" id="1CDfzOrSx32" role="3uHU7w">
                      <node concept="10Nm6u" id="1CDfzOrSxd7" role="3uHU7w" />
                      <node concept="2OqwBi" id="1CDfzOrSuCY" role="3uHU7B">
                        <node concept="1YBJjd" id="1CDfzOrSu_0" role="2Oq$k0">
                          <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                        </node>
                        <node concept="3TrEf2" id="1CDfzOrSuTJ" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="1CDfzOrStm_" role="3clFbx">
                <node concept="2MkqsV" id="1CDfzOrSz17" role="3cqZAp">
                  <node concept="Xl_RD" id="1CDfzOrSz1g" role="2MkJ7o">
                    <property role="Xl_RC" value="FeedbackDefinition must have at least one target." />
                  </node>
                  <node concept="1YBJjd" id="1CDfzOrSz1H" role="1urrMF">
                    <ref role="1YBMHb" node="1CDfzOrScIe" resolve="feedbackDefinition" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1CDfzOrScIe" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="1CDfzOrSz2i">
    <property role="TrG5h" value="checkFeedbackDefinitionNameUnique" />
    <node concept="3clFbS" id="1CDfzOrSz2j" role="18ibNy">
      <node concept="3cpWs8" id="1CDfzOrSz3l" role="3cqZAp">
        <node concept="3cpWsn" id="1CDfzOrSz3o" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="1CDfzOrSz3j" role="1tU5fm">
            <node concept="17QB3L" id="1CDfzOrSz4B" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="1CDfzOrSz5j" role="33vP2m">
            <node concept="2i4dXS" id="1CDfzOrSzl5" role="2ShVmc">
              <node concept="17QB3L" id="1CDfzOrSzo_" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="1CDfzOrSAyh" role="3cqZAp">
        <node concept="2GrKxI" id="1CDfzOrSAyj" role="2Gsz3X">
          <property role="TrG5h" value="feedbackDefinition" />
        </node>
        <node concept="2OqwBi" id="1CDfzOrSAIe" role="2GsD0m">
          <node concept="1YBJjd" id="1CDfzOrSAzV" role="2Oq$k0">
            <ref role="1YBMHb" node="1CDfzOrSz2l" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="1CDfzOrSB7Q" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:47EFX_njBj5" resolve="feedbackDefinition" />
          </node>
        </node>
        <node concept="3clFbS" id="1CDfzOrSAyn" role="2LFqv$">
          <node concept="3clFbJ" id="1CDfzOrSBcO" role="3cqZAp">
            <node concept="2OqwBi" id="1CDfzOrSBTt" role="3clFbw">
              <node concept="37vLTw" id="1CDfzOrSBcX" role="2Oq$k0">
                <ref role="3cqZAo" node="1CDfzOrSz3o" resolve="names" />
              </node>
              <node concept="3JPx81" id="1CDfzOrSDrC" role="2OqNvi">
                <node concept="2OqwBi" id="1CDfzOrSDBS" role="25WWJ7">
                  <node concept="2GrUjf" id="1CDfzOrSDt0" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="1CDfzOrSAyj" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrcHB" id="1CDfzOrSEpt" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1CDfzOrSBcQ" role="3clFbx">
              <node concept="2MkqsV" id="1CDfzOrSEvT" role="3cqZAp">
                <node concept="Xl_RD" id="1CDfzOrSEw2" role="2MkJ7o">
                  <property role="Xl_RC" value="FeedbackType names must be unique." />
                </node>
                <node concept="2GrUjf" id="1CDfzOrSEwu" role="1urrMF">
                  <ref role="2Gs0qQ" node="1CDfzOrSAyj" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="1CDfzOrSFDC" role="9aQIa">
              <node concept="3clFbS" id="1CDfzOrSFDD" role="9aQI4">
                <node concept="3clFbF" id="1CDfzOrSFIe" role="3cqZAp">
                  <node concept="2OqwBi" id="1CDfzOrSGq3" role="3clFbG">
                    <node concept="37vLTw" id="1CDfzOrSFId" role="2Oq$k0">
                      <ref role="3cqZAo" node="1CDfzOrSz3o" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="1CDfzOrSI1V" role="2OqNvi">
                      <node concept="2OqwBi" id="1CDfzOrSImE" role="25WWJ7">
                        <node concept="2GrUjf" id="1CDfzOrSI3$" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="1CDfzOrSAyj" resolve="feedbackDefinition" />
                        </node>
                        <node concept="3TrcHB" id="1CDfzOrSJ9U" role="2OqNvi">
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
    <node concept="1YaCAy" id="1CDfzOrSz2l" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="1CDfzOrSJe4">
    <property role="TrG5h" value="checkNameUppercase" />
    <node concept="3clFbS" id="1CDfzOrSJe5" role="18ibNy">
      <node concept="3clFbJ" id="1CDfzOrSJf8" role="3cqZAp">
        <node concept="3clFbS" id="1CDfzOrSJfa" role="3clFbx">
          <node concept="2MkqsV" id="1CDfzOrSNOU" role="3cqZAp">
            <node concept="3cpWs3" id="1CDfzOrU$_x" role="2MkJ7o">
              <node concept="Xl_RD" id="1CDfzOrU$KD" role="3uHU7w">
                <property role="Xl_RC" value=" should start with uppercase letter." />
              </node>
              <node concept="2OqwBi" id="1CDfzOrUp8F" role="3uHU7B">
                <node concept="2OqwBi" id="1CDfzOrTTpR" role="2Oq$k0">
                  <node concept="1YBJjd" id="1CDfzOrT5vl" role="2Oq$k0">
                    <ref role="1YBMHb" node="1CDfzOrSJe7" resolve="iNamedConcept" />
                  </node>
                  <node concept="2yIwOk" id="1CDfzOrUeU9" role="2OqNvi" />
                </node>
                <node concept="liA8E" id="1CDfzOrUptP" role="2OqNvi">
                  <ref role="37wK5l" to="c17a:~SAbstractConcept.getName()" resolve="getName" />
                </node>
              </node>
            </node>
            <node concept="1YBJjd" id="1CDfzOrSReJ" role="1urrMF">
              <ref role="1YBMHb" node="1CDfzOrSJe7" resolve="iNamedConcept" />
            </node>
            <node concept="3Cnw8n" id="or9vidJY$h" role="1urrFz">
              <property role="ARO6o" value="true" />
              <ref role="QpYPw" node="or9vidJaki" resolve="fixCapitalizeName" />
              <node concept="3CnSsL" id="or9vidJYAB" role="3Coj4f">
                <ref role="QkamJ" node="or9vidJakH" resolve="name" />
                <node concept="1YBJjd" id="or9vidJYAM" role="3CoRuB">
                  <ref role="1YBMHb" node="1CDfzOrSJe7" resolve="iNamedConcept" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3fqX7Q" id="1CDfzOrSLbt" role="3clFbw">
          <node concept="2YIFZM" id="1CDfzOrSLcn" role="3fr31v">
            <ref role="37wK5l" to="wyt6:~Character.isUpperCase(char)" resolve="isUpperCase" />
            <ref role="1Pybhc" to="wyt6:~Character" resolve="Character" />
            <node concept="2OqwBi" id="1CDfzOrSMxa" role="37wK5m">
              <node concept="2OqwBi" id="1CDfzOrSLtH" role="2Oq$k0">
                <node concept="1YBJjd" id="1CDfzOrSLcG" role="2Oq$k0">
                  <ref role="1YBMHb" node="1CDfzOrSJe7" resolve="iNamedConcept" />
                </node>
                <node concept="3TrcHB" id="1CDfzOrSLOc" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
              <node concept="liA8E" id="1CDfzOrSNps" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.charAt(int)" resolve="charAt" />
                <node concept="3cmrfG" id="1CDfzOrSNrN" role="37wK5m">
                  <property role="3cmrfH" value="0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1CDfzOrSJe7" role="1YuTPh">
      <property role="TrG5h" value="iNamedConcept" />
      <ref role="1YaFvo" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="18kY7G" id="1CDfzOrUJdb">
    <property role="TrG5h" value="checkFeedbackDefinitionAuthor" />
    <node concept="3clFbS" id="1CDfzOrUJdc" role="18ibNy">
      <node concept="3clFbJ" id="1CDfzOrUJea" role="3cqZAp">
        <node concept="22lmx$" id="1CDfzOrUKdf" role="3clFbw">
          <node concept="2OqwBi" id="1CDfzOrUNwG" role="3uHU7w">
            <node concept="2OqwBi" id="1CDfzOrUKop" role="2Oq$k0">
              <node concept="1YBJjd" id="1CDfzOrUKdQ" role="2Oq$k0">
                <ref role="1YBMHb" node="1CDfzOrUJde" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1CDfzOrUK_H" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:DrEcBK1he2" resolve="author" />
              </node>
            </node>
            <node concept="3w_OXm" id="1CDfzOrUPCV" role="2OqNvi" />
          </node>
          <node concept="3clFbC" id="1CDfzOrUK6H" role="3uHU7B">
            <node concept="2OqwBi" id="1CDfzOrUJor" role="3uHU7B">
              <node concept="1YBJjd" id="1CDfzOrUJej" role="2Oq$k0">
                <ref role="1YBMHb" node="1CDfzOrUJde" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1CDfzOrUJIR" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:DrEcBK1he2" resolve="author" />
              </node>
            </node>
            <node concept="10Nm6u" id="1CDfzOrUKcN" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="1CDfzOrUJec" role="3clFbx">
          <node concept="2MkqsV" id="1CDfzOrUOu2" role="3cqZAp">
            <node concept="Xl_RD" id="1CDfzOrUPJK" role="2MkJ7o">
              <property role="Xl_RC" value="FeedbackDefinition must have an author" />
            </node>
            <node concept="1YBJjd" id="1CDfzOrUPK3" role="1urrMF">
              <ref role="1YBMHb" node="1CDfzOrUJde" resolve="feedbackDefinition" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1CDfzOrUJde" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="1CDfzOrUY9L">
    <property role="TrG5h" value="checkRatingPolicyWhenFeedbackTypeHasRatingTrue" />
    <node concept="3clFbS" id="1CDfzOrUY9M" role="18ibNy">
      <node concept="3clFbJ" id="or9vidzF2N" role="3cqZAp">
        <node concept="3y3z36" id="or9vidzJd1" role="3clFbw">
          <node concept="10Nm6u" id="or9vidzJld" role="3uHU7w" />
          <node concept="2OqwBi" id="or9vidzFGI" role="3uHU7B">
            <node concept="1YBJjd" id="or9vidzF2W" role="2Oq$k0">
              <ref role="1YBMHb" node="or9vidzF1P" resolve="feedbackDefinition" />
            </node>
            <node concept="3TrEf2" id="or9vidzINy" role="2OqNvi">
              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="or9vidzF2P" role="3clFbx">
          <node concept="3clFbJ" id="or9vidzJmq" role="3cqZAp">
            <node concept="3clFbC" id="or9vidzNgV" role="3clFbw">
              <node concept="3clFbT" id="or9vidzNzn" role="3uHU7w" />
              <node concept="2OqwBi" id="or9vidzKgN" role="3uHU7B">
                <node concept="2OqwBi" id="or9vidzJwF" role="2Oq$k0">
                  <node concept="1YBJjd" id="or9vidzJmz" role="2Oq$k0">
                    <ref role="1YBMHb" node="or9vidzF1P" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrEf2" id="or9vidzJSF" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                  </node>
                </node>
                <node concept="3TrcHB" id="or9vidzKFK" role="2OqNvi">
                  <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="or9vidzJms" role="3clFbx">
              <node concept="2MkqsV" id="or9vidzN_i" role="3cqZAp">
                <node concept="Xl_RD" id="or9vidzN_r" role="2MkJ7o">
                  <property role="Xl_RC" value="RatingPolicy can only be set when FeedbackType.hasRating is true." />
                </node>
                <node concept="1YBJjd" id="or9vidzN_S" role="1urrMF">
                  <ref role="1YBMHb" node="or9vidzF1P" resolve="feedbackDefinition" />
                </node>
                <node concept="3Cnw8n" id="or9vidIJzQ" role="1urrFz">
                  <ref role="QpYPw" node="or9vidIkQ7" resolve="removeRatingPolicy" />
                  <node concept="3CnSsL" id="or9vidIKsu" role="3Coj4f">
                    <ref role="QkamJ" node="or9vidIkQy" resolve="feedbackDefinition" />
                    <node concept="1YBJjd" id="or9vidIKsD" role="3CoRuB">
                      <ref role="1YBMHb" node="or9vidzF1P" resolve="feedbackDefinition" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="or9vidzF1P" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="or9vidzNSL">
    <property role="TrG5h" value="checkRatingPolicyMinMaxValue" />
    <node concept="3clFbS" id="or9vidzNSM" role="18ibNy">
      <node concept="3clFbJ" id="or9vidzNTQ" role="3cqZAp">
        <node concept="2d3UOw" id="or9vid$2g2" role="3clFbw">
          <node concept="2OqwBi" id="or9vid$2S3" role="3uHU7w">
            <node concept="1YBJjd" id="or9vid$2qY" role="2Oq$k0">
              <ref role="1YBMHb" node="or9vidzNSO" resolve="ratingPolicy" />
            </node>
            <node concept="3TrcHB" id="or9vid$3gL" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
            </node>
          </node>
          <node concept="2OqwBi" id="or9vidzWK2" role="3uHU7B">
            <node concept="1YBJjd" id="or9vidzNTZ" role="2Oq$k0">
              <ref role="1YBMHb" node="or9vidzNSO" resolve="ratingPolicy" />
            </node>
            <node concept="3TrcHB" id="or9vidzX77" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="or9vidzNTS" role="3clFbx">
          <node concept="2MkqsV" id="or9vid$3oY" role="3cqZAp">
            <node concept="Xl_RD" id="or9vid$3p7" role="2MkJ7o">
              <property role="Xl_RC" value="RatingPolicy minValue must be less than maxValue." />
            </node>
            <node concept="1YBJjd" id="or9vid$3p$" role="1urrMF">
              <ref role="1YBMHb" node="or9vidzNSO" resolve="ratingPolicy" />
            </node>
            <node concept="3Cnw8n" id="or9vidEvmh" role="1urrFz">
              <ref role="QpYPw" node="or9vidErfx" resolve="swapRatingPolicyMinMaxIfMinBiggerMax" />
              <node concept="3CnSsL" id="or9vidEvmX" role="3Coj4f">
                <ref role="QkamJ" node="or9vidErfW" resolve="ratingPolicy" />
                <node concept="1YBJjd" id="or9vidEvn8" role="3CoRuB">
                  <ref role="1YBMHb" node="or9vidzNSO" resolve="ratingPolicy" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="or9vidzNSO" role="1YuTPh">
      <property role="TrG5h" value="ratingPolicy" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
    </node>
  </node>
  <node concept="18kY7G" id="or9vid$BsH">
    <property role="TrG5h" value="checkFeedbackDefinitionForPolicyDisabled" />
    <node concept="3clFbS" id="or9vid$BsI" role="18ibNy">
      <node concept="3clFbJ" id="or9vid$BtR" role="3cqZAp">
        <node concept="1Wc70l" id="or9vid$Crq" role="3clFbw">
          <node concept="3clFbC" id="or9vid$DcH" role="3uHU7w">
            <node concept="2OqwBi" id="or9vid$EUg" role="3uHU7w">
              <node concept="1XH99k" id="or9vid$Djb" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:DrEcBK18vV" resolve="FeedbackStatus" />
              </node>
              <node concept="2ViDtV" id="or9vid$FuB" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:DrEcBK18vW" resolve="DISABLED" />
              </node>
            </node>
            <node concept="2OqwBi" id="or9vid$DUy" role="3uHU7B">
              <node concept="2OqwBi" id="or9vid$CCE" role="2Oq$k0">
                <node concept="1YBJjd" id="or9vid$Cu7" role="2Oq$k0">
                  <ref role="1YBMHb" node="or9vid$BsK" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="or9vid$D1p" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsh" resolve="feedbackPolicy" />
                </node>
              </node>
              <node concept="3TrcHB" id="or9vid$EmO" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:DrEcBK18vS" resolve="status" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="or9vid$CkS" role="3uHU7B">
            <node concept="2OqwBi" id="or9vid$BC8" role="3uHU7B">
              <node concept="1YBJjd" id="or9vid$Bu0" role="2Oq$k0">
                <ref role="1YBMHb" node="or9vid$BsK" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="or9vid$BZQ" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsh" resolve="feedbackPolicy" />
              </node>
            </node>
            <node concept="10Nm6u" id="or9vid$CqY" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="or9vid$BtT" role="3clFbx">
          <node concept="2MkqsV" id="or9vid$FE8" role="3cqZAp">
            <node concept="Xl_RD" id="or9vid$FEh" role="2MkJ7o">
              <property role="Xl_RC" value="FeedbackDefinition cannot exist when FeedbackPolicy is DISABLED" />
            </node>
            <node concept="1YBJjd" id="or9vid$FFP" role="1urrMF">
              <ref role="1YBMHb" node="or9vid$BsK" resolve="feedbackDefinition" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="or9vid$BsK" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="or9vid$TkZ">
    <property role="TrG5h" value="checkFeedbackDefinitionSubjectFeedbackSameFeedbackType" />
    <node concept="3clFbS" id="or9vid$Tl0" role="18ibNy">
      <node concept="3clFbJ" id="or9vid$Tmc" role="3cqZAp">
        <node concept="3y3z36" id="or9vid$Ubl" role="3clFbw">
          <node concept="10Nm6u" id="or9vid$Uhr" role="3uHU7w" />
          <node concept="2OqwBi" id="or9vid$Twt" role="3uHU7B">
            <node concept="1YBJjd" id="or9vid$Tml" role="2Oq$k0">
              <ref role="1YBMHb" node="or9vid$Tl2" resolve="feedbackDefinition" />
            </node>
            <node concept="3TrEf2" id="or9vid$TSb" role="2OqNvi">
              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="or9vid$Tme" role="3clFbx">
          <node concept="3clFbJ" id="or9vid$UkU" role="3cqZAp">
            <node concept="3y3z36" id="or9vid$VHU" role="3clFbw">
              <node concept="2OqwBi" id="or9vid$W6t" role="3uHU7w">
                <node concept="1YBJjd" id="or9vid$VOq" role="2Oq$k0">
                  <ref role="1YBMHb" node="or9vid$Tl2" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="or9vid$W9W" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="2OqwBi" id="or9vid$USv" role="3uHU7B">
                <node concept="2OqwBi" id="or9vid$Uvb" role="2Oq$k0">
                  <node concept="1YBJjd" id="or9vid$Ul3" role="2Oq$k0">
                    <ref role="1YBMHb" node="or9vid$Tl2" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrEf2" id="or9vid$URb" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                  </node>
                </node>
                <node concept="3TrEf2" id="or9vid$Vyz" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="or9vid$UkW" role="3clFbx" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="or9vid$Tl2" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="or9vid_m6i">
    <property role="TrG5h" value="checkFeedbackDefinitionCannotTargetItself" />
    <node concept="3clFbS" id="or9vid_m6j" role="18ibNy">
      <node concept="3clFbJ" id="or9vidA4sd" role="3cqZAp">
        <node concept="3clFbC" id="or9vidA54B" role="3clFbw">
          <node concept="1YBJjd" id="or9vidA5aH" role="3uHU7w">
            <ref role="1YBMHb" node="or9vid_m6l" resolve="feedbackDefinition" />
          </node>
          <node concept="2OqwBi" id="or9vidA4Au" role="3uHU7B">
            <node concept="1YBJjd" id="or9vidA4sm" role="2Oq$k0">
              <ref role="1YBMHb" node="or9vid_m6l" resolve="feedbackDefinition" />
            </node>
            <node concept="3TrEf2" id="or9vidA4Lt" role="2OqNvi">
              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="or9vidA4sf" role="3clFbx">
          <node concept="2MkqsV" id="or9vidA5kr" role="3cqZAp">
            <node concept="Xl_RD" id="or9vidA5k$" role="2MkJ7o">
              <property role="Xl_RC" value="FeedbackDefinition cannot target itself." />
            </node>
            <node concept="2OqwBi" id="or9vidA5vy" role="1urrMF">
              <node concept="1YBJjd" id="or9vidA5mP" role="2Oq$k0">
                <ref role="1YBMHb" node="or9vid_m6l" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="or9vidA5Y6" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
              </node>
            </node>
            <node concept="3Cnw8n" id="or9vidA5YQ" role="1urrFz">
              <ref role="QpYPw" node="or9vidA1qo" resolve="removeFeedbackDefinitionSubjectFeedbackWhenPointingToItself" />
              <node concept="3CnSsL" id="or9vidA67B" role="3Coj4f">
                <ref role="QkamJ" node="or9vidA3st" resolve="nodeF" />
                <node concept="1YBJjd" id="or9vidA67M" role="3CoRuB">
                  <ref role="1YBMHb" node="or9vid_m6l" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="or9vid_m6l" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="Q5z_Y" id="or9vidA1qo">
    <property role="TrG5h" value="removeFeedbackDefinitionSubjectFeedbackWhenPointingToItself" />
    <node concept="Q5ZZ6" id="or9vidA1qp" role="Q6x$H">
      <node concept="3clFbS" id="or9vidA1qq" role="2VODD2">
        <node concept="3clFbF" id="or9vidCcbc" role="3cqZAp">
          <node concept="2OqwBi" id="or9vidCdlx" role="3clFbG">
            <node concept="2OqwBi" id="or9vidCckP" role="2Oq$k0">
              <node concept="QwW4i" id="or9vidCcba" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidA3st" resolve="nodeF" />
              </node>
              <node concept="3TrEf2" id="or9vidCcDN" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
              </node>
            </node>
            <node concept="2oxUTD" id="or9vidCdoT" role="2OqNvi">
              <node concept="10Nm6u" id="or9vidCdqa" role="2oxUTC" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="or9vidA3st" role="Q6Id_">
      <property role="TrG5h" value="nodeF" />
      <node concept="3Tqbb2" id="or9vidA3uV" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="or9vidA3$$" role="QzAvj">
      <node concept="3clFbS" id="or9vidA3$_" role="2VODD2">
        <node concept="3clFbF" id="or9vidA3F$" role="3cqZAp">
          <node concept="Xl_RD" id="or9vidA3Fz" role="3clFbG">
            <property role="Xl_RC" value="Remove subjectFeedback." />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="or9vid$3q8">
    <property role="TrG5h" value="checkRatingPolicyPositiveEven" />
    <node concept="3clFbS" id="or9vid$3q9" role="18ibNy">
      <node concept="3clFbJ" id="or9vid$3rf" role="3cqZAp">
        <node concept="2dkUwp" id="or9vid$50u" role="3clFbw">
          <node concept="3cmrfG" id="or9vid$50Q" role="3uHU7w">
            <property role="3cmrfH" value="0" />
          </node>
          <node concept="2OqwBi" id="or9vid$3Bo" role="3uHU7B">
            <node concept="1YBJjd" id="or9vid$3ro" role="2Oq$k0">
              <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
            </node>
            <node concept="3TrcHB" id="or9vid$3XO" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="or9vid$3rh" role="3clFbx">
          <node concept="2MkqsV" id="or9vid$58G" role="3cqZAp">
            <node concept="Xl_RD" id="or9vid$58P" role="2MkJ7o">
              <property role="Xl_RC" value="RatingPolicy step must be positive." />
            </node>
            <node concept="1YBJjd" id="or9vid$59i" role="1urrMF">
              <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
            </node>
            <node concept="3Cnw8n" id="or9vidHd$z" role="1urrFz">
              <ref role="QpYPw" node="or9vidGXJv" resolve="fixRatingPolicyStepInvalidOrUneven" />
              <node concept="3CnSsL" id="or9vidHdAJ" role="3Coj4f">
                <ref role="QkamJ" node="or9vidGXJV" resolve="ratingPolicy" />
                <node concept="1YBJjd" id="or9vidHdAU" role="3CoRuB">
                  <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="or9vid$5aO" role="3cqZAp">
        <node concept="3clFbS" id="or9vid$5aQ" role="3clFbx">
          <node concept="2MkqsV" id="or9vidHesN" role="3cqZAp">
            <node concept="Xl_RD" id="or9vidHesW" role="2MkJ7o">
              <property role="Xl_RC" value="RatingPolicy step should divide the range evenly." />
            </node>
            <node concept="1YBJjd" id="or9vidHetf" role="1urrMF">
              <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
            </node>
            <node concept="3Cnw8n" id="or9vidHV5$" role="1urrFz">
              <ref role="QpYPw" node="or9vidGXJv" resolve="fixRatingPolicyStepInvalidOrUneven" />
              <node concept="3CnSsL" id="or9vidHV7S" role="3Coj4f">
                <ref role="QkamJ" node="or9vidGXJV" resolve="ratingPolicy" />
                <node concept="1YBJjd" id="or9vidHV81" role="3CoRuB">
                  <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1Wc70l" id="or9vidDbUC" role="3clFbw">
          <node concept="3eOSWO" id="or9vidD8uR" role="3uHU7B">
            <node concept="2OqwBi" id="or9vidD5gp" role="3uHU7B">
              <node concept="1YBJjd" id="or9vid$5aZ" role="2Oq$k0">
                <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
              </node>
              <node concept="3TrcHB" id="or9vidD5D6" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
              </node>
            </node>
            <node concept="3cmrfG" id="or9vidD8Qe" role="3uHU7w">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
          <node concept="3y3z36" id="or9vid$8Kb" role="3uHU7w">
            <node concept="3cmrfG" id="or9vid$9hr" role="3uHU7w">
              <property role="3cmrfH" value="0" />
            </node>
            <node concept="2dk9JS" id="or9vid$8jP" role="3uHU7B">
              <node concept="2OqwBi" id="or9vid$8w3" role="3uHU7w">
                <node concept="1YBJjd" id="or9vid$8l3" role="2Oq$k0">
                  <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
                </node>
                <node concept="3TrcHB" id="or9vid$8I6" role="2OqNvi">
                  <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
                </node>
              </node>
              <node concept="1eOMI4" id="or9vidDcNr" role="3uHU7B">
                <node concept="3cpWsd" id="or9vid$6Qu" role="1eOMHV">
                  <node concept="2OqwBi" id="or9vidDcXH" role="3uHU7B">
                    <node concept="1YBJjd" id="or9vidDc03" role="2Oq$k0">
                      <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vidDdmE" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="or9vid$6Uq" role="3uHU7w">
                    <node concept="1YBJjd" id="or9vid$6Rq" role="2Oq$k0">
                      <ref role="1YBMHb" node="or9vid$3qb" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vid$6WL" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbH" id="or9vidDcIg" role="3cqZAp" />
    </node>
    <node concept="1YaCAy" id="or9vid$3qb" role="1YuTPh">
      <property role="TrG5h" value="ratingPolicy" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
    </node>
  </node>
  <node concept="Q5z_Y" id="or9vidErfx">
    <property role="TrG5h" value="swapRatingPolicyMinMaxIfMinBiggerMax" />
    <node concept="Q5ZZ6" id="or9vidErfy" role="Q6x$H">
      <node concept="3clFbS" id="or9vidErfz" role="2VODD2">
        <node concept="3clFbJ" id="or9vidFEWd" role="3cqZAp">
          <node concept="3clFbC" id="or9vidFEWe" role="3clFbw">
            <node concept="Xl_RD" id="or9vidFEWh" role="3uHU7w">
              <property role="Xl_RC" value="EXPAND_BY_STEP" />
            </node>
            <node concept="2OqwBi" id="or9vidFGek" role="3uHU7B">
              <node concept="2WthIp" id="or9vidFGen" role="2Oq$k0" />
              <node concept="2XshWL" id="or9vidFGep" role="2OqNvi">
                <ref role="2WH_rO" node="or9vidF1XA" resolve="getActionType" />
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="or9vidFEWq" role="9aQIa">
            <node concept="3clFbC" id="or9vidFEWr" role="3clFbw">
              <node concept="Xl_RD" id="or9vidFEWu" role="3uHU7w">
                <property role="Xl_RC" value="EXPAND_BY_ONE" />
              </node>
              <node concept="2OqwBi" id="or9vidG4lt" role="3uHU7B">
                <node concept="2WthIp" id="or9vidG4lw" role="2Oq$k0" />
                <node concept="2XshWL" id="or9vidG4ly" role="2OqNvi">
                  <ref role="2WH_rO" node="or9vidF1XA" resolve="getActionType" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="or9vidFEWB" role="9aQIa">
              <node concept="3clFbS" id="or9vidFEWC" role="9aQI4">
                <node concept="3cpWs8" id="or9vidFEWE" role="3cqZAp">
                  <node concept="3cpWsn" id="or9vidFEWD" role="3cpWs9">
                    <property role="TrG5h" value="temp" />
                    <node concept="10Oyi0" id="or9vidGxKR" role="1tU5fm" />
                    <node concept="2OqwBi" id="or9vidG7Lk" role="33vP2m">
                      <node concept="QwW4i" id="or9vidG7C2" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidG9to" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="or9vidFEWH" role="3cqZAp">
                  <node concept="37vLTI" id="or9vidFEWI" role="3clFbG">
                    <node concept="2OqwBi" id="or9vidGa1w" role="37vLTJ">
                      <node concept="QwW4i" id="or9vidG9RP" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidGbHM" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="or9vidGdYd" role="37vLTx">
                      <node concept="QwW4i" id="or9vidGcpY" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidGeqv" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="or9vidFEWL" role="3cqZAp">
                  <node concept="37vLTI" id="or9vidFEWM" role="3clFbG">
                    <node concept="37vLTw" id="or9vidFEWO" role="37vLTx">
                      <ref role="3cqZAo" node="or9vidFEWD" resolve="temp" />
                    </node>
                    <node concept="2OqwBi" id="or9vidGeHq" role="37vLTJ">
                      <node concept="QwW4i" id="or9vidGezP" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidGglj" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="or9vidFEWw" role="3clFbx">
              <node concept="3clFbF" id="or9vidFEWx" role="3cqZAp">
                <node concept="37vLTI" id="or9vidFEWy" role="3clFbG">
                  <node concept="3cpWs3" id="or9vidFEW$" role="37vLTx">
                    <node concept="3cmrfG" id="or9vidFEWA" role="3uHU7w">
                      <property role="3cmrfH" value="1" />
                    </node>
                    <node concept="2OqwBi" id="or9vidG7rh" role="3uHU7B">
                      <node concept="QwW4i" id="or9vidG7aL" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidG7xV" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="or9vidG4yn" role="37vLTJ">
                    <node concept="QwW4i" id="or9vidG4oR" role="2Oq$k0">
                      <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vidG68n" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="or9vidFEWj" role="3clFbx">
            <node concept="3clFbF" id="or9vidFEWk" role="3cqZAp">
              <node concept="37vLTI" id="or9vidFEWl" role="3clFbG">
                <node concept="3cpWs3" id="or9vidFEWn" role="37vLTx">
                  <node concept="2OqwBi" id="or9vidFZQp" role="3uHU7B">
                    <node concept="QwW4i" id="or9vidFZ$i" role="2Oq$k0">
                      <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vidG1ed" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="or9vidG2EJ" role="3uHU7w">
                    <node concept="QwW4i" id="or9vidG2nZ" role="2Oq$k0">
                      <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vidG35N" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
                    </node>
                  </node>
                </node>
                <node concept="2OqwBi" id="or9vidFXH0" role="37vLTJ">
                  <node concept="QwW4i" id="or9vidFXxk" role="2Oq$k0">
                    <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                  </node>
                  <node concept="3TrcHB" id="or9vidFZ6T" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="or9vidErfW" role="Q6Id_">
      <property role="TrG5h" value="ratingPolicy" />
      <node concept="3Tqbb2" id="or9vidErjK" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
      </node>
    </node>
    <node concept="2XrIbr" id="or9vidF1XA" role="32lrUH">
      <property role="TrG5h" value="getActionType" />
      <node concept="17QB3L" id="or9vidFuTM" role="3clF45" />
      <node concept="3clFbS" id="or9vidF1XC" role="3clF47">
        <node concept="3clFbJ" id="or9vidFu_i" role="3cqZAp">
          <node concept="3clFbC" id="or9vidFu_j" role="3clFbw">
            <node concept="2OqwBi" id="or9vidFxi9" role="3uHU7B">
              <node concept="QwW4i" id="or9vidFx0W" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
              </node>
              <node concept="3TrcHB" id="or9vidFywc" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
              </node>
            </node>
            <node concept="2OqwBi" id="or9vidFz4R" role="3uHU7w">
              <node concept="QwW4i" id="or9vidFyNX" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
              </node>
              <node concept="3TrcHB" id="or9vidFzrM" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
              </node>
            </node>
          </node>
          <node concept="9aQIb" id="or9vidFu_$" role="9aQIa">
            <node concept="3clFbS" id="or9vidFu__" role="9aQI4">
              <node concept="3cpWs6" id="or9vidFu_A" role="3cqZAp">
                <node concept="Xl_RD" id="or9vidFu_B" role="3cqZAk">
                  <property role="Xl_RC" value="SWAP" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="or9vidFu_n" role="3clFbx">
            <node concept="3clFbJ" id="or9vidFu_o" role="3cqZAp">
              <node concept="3eOSWO" id="or9vidFu_p" role="3clFbw">
                <node concept="3cmrfG" id="or9vidFu_r" role="3uHU7w">
                  <property role="3cmrfH" value="0" />
                </node>
                <node concept="2OqwBi" id="or9vidFzT8" role="3uHU7B">
                  <node concept="QwW4i" id="or9vidFzxm" role="2Oq$k0">
                    <ref role="QwW4h" node="or9vidErfW" resolve="ratingPolicy" />
                  </node>
                  <node concept="3TrcHB" id="or9vidF_7x" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
                  </node>
                </node>
              </node>
              <node concept="9aQIb" id="or9vidFu_w" role="9aQIa">
                <node concept="3clFbS" id="or9vidFu_x" role="9aQI4">
                  <node concept="3cpWs6" id="or9vidFu_y" role="3cqZAp">
                    <node concept="Xl_RD" id="or9vidFu_z" role="3cqZAk">
                      <property role="Xl_RC" value="EXPAND_BY_ONE" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="or9vidFu_t" role="3clFbx">
                <node concept="3cpWs6" id="or9vidFu_u" role="3cqZAp">
                  <node concept="Xl_RD" id="or9vidFu_v" role="3cqZAk">
                    <property role="Xl_RC" value="EXPAND_BY_STEP" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="or9vidF1XD" role="1B3o_S" />
    </node>
    <node concept="QznSV" id="or9vidF_t4" role="QzAvj">
      <node concept="3clFbS" id="or9vidF_t5" role="2VODD2">
        <node concept="3clFbJ" id="or9vidF_zq" role="3cqZAp">
          <node concept="9aQIb" id="or9vidF_z_" role="9aQIa">
            <node concept="3clFbS" id="or9vidF_zA" role="9aQI4">
              <node concept="3cpWs6" id="or9vidFDsW" role="3cqZAp">
                <node concept="Xl_RD" id="or9vidF_zD" role="3cqZAk">
                  <property role="Xl_RC" value="Fix RatingPolicy range" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="or9vidF_zw" role="3clFbx">
            <node concept="3cpWs6" id="or9vidFDpo" role="3cqZAp">
              <node concept="Xl_RD" id="or9vidF_zz" role="3cqZAk">
                <property role="Xl_RC" value="Swap RatingPolicy min/max values" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="or9vidFBmH" role="3clFbw">
            <node concept="Xl_RD" id="or9vidFCAv" role="3uHU7w">
              <property role="Xl_RC" value="SWAP" />
            </node>
            <node concept="2OqwBi" id="or9vidF_ZS" role="3uHU7B">
              <node concept="2WthIp" id="or9vidF_ZV" role="2Oq$k0" />
              <node concept="2XshWL" id="or9vidF_ZX" role="2OqNvi">
                <ref role="2WH_rO" node="or9vidF1XA" resolve="getActionType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="or9vidGXJv">
    <property role="TrG5h" value="fixRatingPolicyStepInvalidOrUneven" />
    <node concept="Q5ZZ6" id="or9vidGXJw" role="Q6x$H">
      <node concept="3clFbS" id="or9vidGXJx" role="2VODD2">
        <node concept="3clFbJ" id="or9vidGZc0" role="3cqZAp">
          <node concept="2dkUwp" id="or9vidGZc1" role="3clFbw">
            <node concept="3cmrfG" id="or9vidGZc3" role="3uHU7w">
              <property role="3cmrfH" value="0" />
            </node>
            <node concept="2OqwBi" id="or9vidGZTk" role="3uHU7B">
              <node concept="QwW4i" id="or9vidGZKa" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
              </node>
              <node concept="3TrcHB" id="or9vidH0_E" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
              </node>
            </node>
          </node>
          <node concept="9aQIb" id="or9vidGZc9" role="9aQIa">
            <node concept="3clFbS" id="or9vidGZca" role="9aQI4">
              <node concept="3cpWs8" id="or9vidGZcc" role="3cqZAp">
                <node concept="3cpWsn" id="or9vidGZcb" role="3cpWs9">
                  <property role="TrG5h" value="range" />
                  <node concept="10Oyi0" id="or9vidGZcd" role="1tU5fm" />
                  <node concept="3cpWsd" id="or9vidH73i" role="33vP2m">
                    <node concept="2OqwBi" id="or9vidH7bZ" role="3uHU7w">
                      <node concept="QwW4i" id="or9vidH76A" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidH7tH" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="or9vidH58k" role="3uHU7B">
                      <node concept="QwW4i" id="or9vidH4UO" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
                      </node>
                      <node concept="3TrcHB" id="or9vidH6ak" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWs8" id="or9vidGZci" role="3cqZAp">
                <node concept="3cpWsn" id="or9vidGZch" role="3cpWs9">
                  <property role="TrG5h" value="step" />
                  <node concept="10Oyi0" id="or9vidGZcj" role="1tU5fm" />
                  <node concept="2OqwBi" id="or9vidH8jz" role="33vP2m">
                    <node concept="QwW4i" id="or9vidH876" role="2Oq$k0">
                      <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vidH8R9" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2$JKZl" id="or9vidGZcA" role="3cqZAp">
                <node concept="1Wc70l" id="or9vidGZcl" role="2$JKZa">
                  <node concept="3eOSWO" id="or9vidGZcm" role="3uHU7B">
                    <node concept="37vLTw" id="or9vidGZcn" role="3uHU7B">
                      <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                    </node>
                    <node concept="3cmrfG" id="or9vidGZco" role="3uHU7w">
                      <property role="3cmrfH" value="0" />
                    </node>
                  </node>
                  <node concept="3y3z36" id="or9vidGZcp" role="3uHU7w">
                    <node concept="2dk9JS" id="or9vidGZcq" role="3uHU7B">
                      <node concept="37vLTw" id="or9vidGZcr" role="3uHU7B">
                        <ref role="3cqZAo" node="or9vidGZcb" resolve="range" />
                      </node>
                      <node concept="37vLTw" id="or9vidGZcs" role="3uHU7w">
                        <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                      </node>
                    </node>
                    <node concept="3cmrfG" id="or9vidGZct" role="3uHU7w">
                      <property role="3cmrfH" value="0" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbS" id="or9vidGZcv" role="2LFqv$">
                  <node concept="3clFbF" id="or9vidGZcw" role="3cqZAp">
                    <node concept="37vLTI" id="or9vidGZcx" role="3clFbG">
                      <node concept="37vLTw" id="or9vidGZcy" role="37vLTJ">
                        <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                      </node>
                      <node concept="3cpWsd" id="or9vidGZcz" role="37vLTx">
                        <node concept="37vLTw" id="or9vidGZc$" role="3uHU7B">
                          <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                        </node>
                        <node concept="3cmrfG" id="or9vidGZc_" role="3uHU7w">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbJ" id="or9vidGZcB" role="3cqZAp">
                <node concept="2dkUwp" id="or9vidGZcC" role="3clFbw">
                  <node concept="37vLTw" id="or9vidGZcD" role="3uHU7B">
                    <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                  </node>
                  <node concept="3cmrfG" id="or9vidGZcE" role="3uHU7w">
                    <property role="3cmrfH" value="0" />
                  </node>
                </node>
                <node concept="3clFbS" id="or9vidGZcG" role="3clFbx">
                  <node concept="3clFbF" id="or9vidGZcH" role="3cqZAp">
                    <node concept="37vLTI" id="or9vidGZcI" role="3clFbG">
                      <node concept="37vLTw" id="or9vidGZcJ" role="37vLTJ">
                        <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                      </node>
                      <node concept="3cmrfG" id="or9vidGZcK" role="37vLTx">
                        <property role="3cmrfH" value="1" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="or9vidGZcL" role="3cqZAp">
                <node concept="2OqwBi" id="or9vidHb41" role="3clFbG">
                  <node concept="2OqwBi" id="or9vidH8YY" role="2Oq$k0">
                    <node concept="QwW4i" id="or9vidH8Wa" role="2Oq$k0">
                      <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
                    </node>
                    <node concept="3TrcHB" id="or9vidHa3b" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
                    </node>
                  </node>
                  <node concept="tyxLq" id="or9vidHcIk" role="2OqNvi">
                    <node concept="37vLTw" id="or9vidHcIV" role="tz02z">
                      <ref role="3cqZAo" node="or9vidGZch" resolve="step" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="or9vidGZc5" role="3clFbx">
            <node concept="3clFbF" id="or9vidGZc6" role="3cqZAp">
              <node concept="2OqwBi" id="or9vidH2nU" role="3clFbG">
                <node concept="2OqwBi" id="or9vidH0PR" role="2Oq$k0">
                  <node concept="QwW4i" id="or9vidH0F1" role="2Oq$k0">
                    <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
                  </node>
                  <node concept="3TrcHB" id="or9vidH1n4" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
                  </node>
                </node>
                <node concept="tyxLq" id="or9vidH3NJ" role="2OqNvi">
                  <node concept="3cmrfG" id="or9vidH3Om" role="tz02z">
                    <property role="3cmrfH" value="1" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="or9vidGXJV" role="Q6Id_">
      <property role="TrG5h" value="ratingPolicy" />
      <node concept="3Tqbb2" id="or9vidGXN9" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
      </node>
    </node>
    <node concept="QznSV" id="or9vidGXNj" role="QzAvj">
      <node concept="3clFbS" id="or9vidGXNk" role="2VODD2">
        <node concept="3clFbJ" id="or9vidGXTA" role="3cqZAp">
          <node concept="2dkUwp" id="or9vidGXTB" role="3clFbw">
            <node concept="3cmrfG" id="or9vidGXTD" role="3uHU7w">
              <property role="3cmrfH" value="0" />
            </node>
            <node concept="2OqwBi" id="or9vidGY$M" role="3uHU7B">
              <node concept="QwW4i" id="or9vidGY7q" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidGXJV" resolve="ratingPolicy" />
              </node>
              <node concept="3TrcHB" id="or9vidGZ1J" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:DrEcBK18w6" resolve="step" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="or9vidGXTF" role="3clFbx">
            <node concept="3clFbH" id="or9vidGZbc" role="3cqZAp" />
            <node concept="3cpWs6" id="or9vidGXTG" role="3cqZAp">
              <node concept="Xl_RD" id="or9vidGXTH" role="3cqZAk">
                <property role="Xl_RC" value="Set step to a positive value." />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="or9vidGXTI" role="3cqZAp">
          <node concept="Xl_RD" id="or9vidGXTJ" role="3cqZAk">
            <property role="Xl_RC" value="Adjust step so it divides the range evenly." />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="or9vidIkQ7">
    <property role="TrG5h" value="removeRatingPolicy" />
    <node concept="Q5ZZ6" id="or9vidIkQ8" role="Q6x$H">
      <node concept="3clFbS" id="or9vidIkQ9" role="2VODD2">
        <node concept="3clFbF" id="or9vidIl9b" role="3cqZAp">
          <node concept="2OqwBi" id="or9vidIK0$" role="3clFbG">
            <node concept="2OqwBi" id="or9vidIljJ" role="2Oq$k0">
              <node concept="QwW4i" id="or9vidIl9a" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidIkQy" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="or9vidIJDZ" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
              </node>
            </node>
            <node concept="3YRAZt" id="or9vidIKim" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="or9vidIkQy" role="Q6Id_">
      <property role="TrG5h" value="feedbackDefinition" />
      <node concept="3Tqbb2" id="or9vidIkSH" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="or9vidIkST" role="QzAvj">
      <node concept="3clFbS" id="or9vidIkSU" role="2VODD2">
        <node concept="3clFbF" id="or9vidIkZA" role="3cqZAp">
          <node concept="Xl_RD" id="or9vidIkZ_" role="3clFbG">
            <property role="Xl_RC" value="Remove RatingPolicy" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="or9vidJaki">
    <property role="TrG5h" value="fixCapitalizeName" />
    <node concept="Q5ZZ6" id="or9vidJakj" role="Q6x$H">
      <node concept="3clFbS" id="or9vidJakk" role="2VODD2">
        <node concept="3cpWs8" id="or9vidJlqu" role="3cqZAp">
          <node concept="3cpWsn" id="or9vidJlqx" role="3cpWs9">
            <property role="TrG5h" value="current" />
            <node concept="17QB3L" id="or9vidJlqt" role="1tU5fm" />
            <node concept="2OqwBi" id="or9vidJlB1" role="33vP2m">
              <node concept="QwW4i" id="or9vidJlt3" role="2Oq$k0">
                <ref role="QwW4h" node="or9vidJakH" resolve="name" />
              </node>
              <node concept="3TrcHB" id="or9vidJlNf" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="or9vidJlTZ" role="3cqZAp">
          <node concept="3clFbS" id="or9vidJlU1" role="3clFbx">
            <node concept="3cpWs8" id="or9vidJpQa" role="3cqZAp">
              <node concept="3cpWsn" id="or9vidJpQd" role="3cpWs9">
                <property role="TrG5h" value="updated" />
                <node concept="17QB3L" id="or9vidJpQ8" role="1tU5fm" />
                <node concept="3cpWs3" id="or9vidJugJ" role="33vP2m">
                  <node concept="2OqwBi" id="or9vidJuAH" role="3uHU7w">
                    <node concept="37vLTw" id="or9vidJuoF" role="2Oq$k0">
                      <ref role="3cqZAo" node="or9vidJlqx" resolve="current" />
                    </node>
                    <node concept="liA8E" id="or9vidJv5G" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~String.substring(int)" resolve="substring" />
                      <node concept="3cmrfG" id="or9vidJv7C" role="37wK5m">
                        <property role="3cmrfH" value="1" />
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="or9vidJsn$" role="3uHU7B">
                    <node concept="2OqwBi" id="or9vidJqgI" role="2Oq$k0">
                      <node concept="37vLTw" id="or9vidJpRW" role="2Oq$k0">
                        <ref role="3cqZAo" node="or9vidJlqx" resolve="current" />
                      </node>
                      <node concept="liA8E" id="or9vidJqOs" role="2OqNvi">
                        <ref role="37wK5l" to="wyt6:~String.substring(int,int)" resolve="substring" />
                        <node concept="3cmrfG" id="or9vidJqVm" role="37wK5m">
                          <property role="3cmrfH" value="0" />
                        </node>
                        <node concept="3cmrfG" id="or9vidJrRg" role="37wK5m">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="or9vidJtuh" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~String.toUpperCase()" resolve="toUpperCase" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="or9vidJv_z" role="3cqZAp">
              <node concept="2OqwBi" id="or9vidJx4w" role="3clFbG">
                <node concept="2OqwBi" id="or9vidJvLY" role="2Oq$k0">
                  <node concept="QwW4i" id="or9vidJv_x" role="2Oq$k0">
                    <ref role="QwW4h" node="or9vidJakH" resolve="name" />
                  </node>
                  <node concept="3TrcHB" id="or9vidJwt0" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
                <node concept="tyxLq" id="or9vidJyaQ" role="2OqNvi">
                  <node concept="37vLTw" id="or9vidJybt" role="tz02z">
                    <ref role="3cqZAo" node="or9vidJpQd" resolve="updated" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1Wc70l" id="or9vidJnoB" role="3clFbw">
            <node concept="3eOSWO" id="or9vidJpEX" role="3uHU7w">
              <node concept="3cmrfG" id="or9vidJpF1" role="3uHU7w">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="2OqwBi" id="or9vidJnMp" role="3uHU7B">
                <node concept="37vLTw" id="or9vidJnpp" role="2Oq$k0">
                  <ref role="3cqZAo" node="or9vidJlqx" resolve="current" />
                </node>
                <node concept="liA8E" id="or9vidJoDW" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~String.length()" resolve="length" />
                </node>
              </node>
            </node>
            <node concept="3y3z36" id="or9vidJn03" role="3uHU7B">
              <node concept="37vLTw" id="or9vidJm9s" role="3uHU7B">
                <ref role="3cqZAo" node="or9vidJlqx" resolve="current" />
              </node>
              <node concept="10Nm6u" id="or9vidJnnW" role="3uHU7w" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="or9vidJakH" role="Q6Id_">
      <property role="TrG5h" value="name" />
      <node concept="3Tqbb2" id="or9vidJamX" role="Q6QK4">
        <ref role="ehGHo" to="tpck:h0TrEE$" resolve="INamedConcept" />
      </node>
    </node>
    <node concept="QznSV" id="or9vidJan5" role="QzAvj">
      <node concept="3clFbS" id="or9vidJan6" role="2VODD2">
        <node concept="3clFbF" id="or9vidJatN" role="3cqZAp">
          <node concept="3cpWs3" id="or9vidJc0d" role="3clFbG">
            <node concept="2OqwBi" id="or9vidJdDH" role="3uHU7w">
              <node concept="2OqwBi" id="or9vidJckN" role="2Oq$k0">
                <node concept="QwW4i" id="or9vidJc6G" role="2Oq$k0">
                  <ref role="QwW4h" node="or9vidJakH" resolve="name" />
                </node>
                <node concept="2yIwOk" id="or9vidJdaR" role="2OqNvi" />
              </node>
              <node concept="liA8E" id="or9vidJekB" role="2OqNvi">
                <ref role="37wK5l" to="c17a:~SAbstractConcept.getName()" resolve="getName" />
              </node>
            </node>
            <node concept="Xl_RD" id="or9vidJatM" role="3uHU7B">
              <property role="Xl_RC" value="Capitalize " />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="or9vidKqCZ">
    <property role="TrG5h" value="removeResourceTypeSuperTypeWhenContainSelf" />
    <node concept="Q5ZZ6" id="or9vidKqD0" role="Q6x$H">
      <node concept="3clFbS" id="or9vidKqD1" role="2VODD2">
        <node concept="2Gpval" id="or9vidL5pQ" role="3cqZAp">
          <node concept="2GrKxI" id="or9vidL5pR" role="2Gsz3X">
            <property role="TrG5h" value="st" />
          </node>
          <node concept="2OqwBi" id="or9vidL5_J" role="2GsD0m">
            <node concept="QwW4i" id="or9vidL5r6" role="2Oq$k0">
              <ref role="QwW4h" node="or9vidKqDq" resolve="resourceType" />
            </node>
            <node concept="3Tsc0h" id="or9vidL5Wm" role="2OqNvi">
              <ref role="3TtcxE" to="2rvu:DrEcBK1hdW" resolve="superType" />
            </node>
          </node>
          <node concept="3clFbS" id="or9vidL5pT" role="2LFqv$">
            <node concept="3clFbJ" id="or9vidL622" role="3cqZAp">
              <node concept="3clFbC" id="or9vidL7kk" role="3clFbw">
                <node concept="QwW4i" id="or9vidL7ww" role="3uHU7w">
                  <ref role="QwW4h" node="or9vidKqDq" resolve="resourceType" />
                </node>
                <node concept="2OqwBi" id="or9vidL6cc" role="3uHU7B">
                  <node concept="2GrUjf" id="or9vidL62w" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="or9vidL5pR" resolve="st" />
                  </node>
                  <node concept="3TrEf2" id="or9vidL6Qv" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:DrEcBK1hdS" resolve="superType" />
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="or9vidL624" role="3clFbx">
                <node concept="3clFbF" id="or9vidL7$S" role="3cqZAp">
                  <node concept="2OqwBi" id="or9vidLajw" role="3clFbG">
                    <node concept="2OqwBi" id="or9vidL7Dg" role="2Oq$k0">
                      <node concept="QwW4i" id="or9vidL7$R" role="2Oq$k0">
                        <ref role="QwW4h" node="or9vidKqDq" resolve="resourceType" />
                      </node>
                      <node concept="3Tsc0h" id="or9vidL82z" role="2OqNvi">
                        <ref role="3TtcxE" to="2rvu:DrEcBK1hdW" resolve="superType" />
                      </node>
                    </node>
                    <node concept="3dhRuq" id="or9vidLeEr" role="2OqNvi">
                      <node concept="2GrUjf" id="or9vidLeOG" role="25WWJ7">
                        <ref role="2Gs0qQ" node="or9vidL5pR" resolve="st" />
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
    <node concept="Q6JDH" id="or9vidKqDq" role="Q6Id_">
      <property role="TrG5h" value="resourceType" />
      <node concept="3Tqbb2" id="or9vidKqFJ" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
      </node>
    </node>
    <node concept="QznSV" id="or9vidKqFV" role="QzAvj">
      <node concept="3clFbS" id="or9vidKqFW" role="2VODD2">
        <node concept="3clFbF" id="or9vidKqME" role="3cqZAp">
          <node concept="Xl_RD" id="or9vidKqMD" role="3clFbG">
            <property role="Xl_RC" value="Remove ResourceType superType" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg15$x">
    <property role="TrG5h" value="checkValidationRuleTarget" />
    <node concept="3clFbS" id="42rXvlg15$y" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg15A6" role="3cqZAp">
        <node concept="1Wc70l" id="42rXvlg18f_" role="3clFbw">
          <node concept="3clFbC" id="42rXvlg1907" role="3uHU7w">
            <node concept="10Nm6u" id="42rXvlg196_" role="3uHU7w" />
            <node concept="2OqwBi" id="42rXvlg18sH" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg18gc" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg15$$" resolve="validationRule" />
              </node>
              <node concept="3TrEf2" id="42rXvlg18ON" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsc" resolve="feedbackDefinition" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="42rXvlg188S" role="3uHU7B">
            <node concept="2OqwBi" id="42rXvlg15Kn" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg15Af" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg15$$" resolve="validationRule" />
              </node>
              <node concept="3TrEf2" id="42rXvlg17VY" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsc" resolve="feedbackDefinition" />
              </node>
            </node>
            <node concept="10Nm6u" id="42rXvlg18eY" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg15A8" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg19bC" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg19bL" role="2MkJ7o">
              <property role="Xl_RC" value="ValidationRule must target at least one element." />
            </node>
            <node concept="1YBJjd" id="42rXvlg19c5" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg15$$" resolve="validationRule" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg15$$" role="1YuTPh">
      <property role="TrG5h" value="validationRule" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UM" resolve="ValidationRule" />
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg19cr">
    <property role="TrG5h" value="checkValidationRuleNameUnique" />
    <node concept="3clFbS" id="42rXvlg19cs" role="18ibNy">
      <node concept="3cpWs8" id="42rXvlg19fI" role="3cqZAp">
        <node concept="3cpWsn" id="42rXvlg19fL" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="42rXvlg19fG" role="1tU5fm">
            <node concept="17QB3L" id="42rXvlg19kf" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="42rXvlg19kT" role="33vP2m">
            <node concept="2i4dXS" id="42rXvlg1aGx" role="2ShVmc">
              <node concept="17QB3L" id="42rXvlg1aLf" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="42rXvlg1jUQ" role="3cqZAp">
        <node concept="2GrKxI" id="42rXvlg1jUS" role="2Gsz3X">
          <property role="TrG5h" value="validationRule" />
        </node>
        <node concept="2OqwBi" id="42rXvlg1k6s" role="2GsD0m">
          <node concept="1YBJjd" id="42rXvlg1jW9" role="2Oq$k0">
            <ref role="1YBMHb" node="42rXvlg19cu" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="42rXvlg1kvr" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:47EFX_njBjs" resolve="validationRule" />
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg1jUW" role="2LFqv$">
          <node concept="3clFbJ" id="42rXvlg1k$S" role="3cqZAp">
            <node concept="3clFbS" id="42rXvlg1k$U" role="3clFbx">
              <node concept="2MkqsV" id="42rXvlg1pLj" role="3cqZAp">
                <node concept="Xl_RD" id="42rXvlg1pLs" role="2MkJ7o">
                  <property role="Xl_RC" value="ValidationRule names must be unique." />
                </node>
                <node concept="2GrUjf" id="42rXvlg1pM_" role="1urrMF">
                  <ref role="2Gs0qQ" node="42rXvlg1jUS" resolve="validationRule" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="42rXvlg1mCA" role="3clFbw">
              <node concept="37vLTw" id="42rXvlg1lMQ" role="2Oq$k0">
                <ref role="3cqZAo" node="42rXvlg19fL" resolve="names" />
              </node>
              <node concept="3JPx81" id="42rXvlg1ovZ" role="2OqNvi">
                <node concept="2OqwBi" id="42rXvlg1oKa" role="25WWJ7">
                  <node concept="2GrUjf" id="42rXvlg1ozk" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="42rXvlg1jUS" resolve="validationRule" />
                  </node>
                  <node concept="3TrcHB" id="42rXvlg1pBy" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="42rXvlg2MEP" role="9aQIa">
              <node concept="3clFbS" id="42rXvlg2MEQ" role="9aQI4">
                <node concept="3clFbF" id="42rXvlg2MIA" role="3cqZAp">
                  <node concept="2OqwBi" id="42rXvlg2Nqr" role="3clFbG">
                    <node concept="37vLTw" id="42rXvlg2MI_" role="2Oq$k0">
                      <ref role="3cqZAo" node="42rXvlg19fL" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="42rXvlg2P2j" role="2OqNvi">
                      <node concept="2OqwBi" id="42rXvlg2PkQ" role="25WWJ7">
                        <node concept="2GrUjf" id="42rXvlg2P3u" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="42rXvlg1jUS" resolve="validationRule" />
                        </node>
                        <node concept="3TrcHB" id="42rXvlg2QLZ" role="2OqNvi">
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
    <node concept="1YaCAy" id="42rXvlg19cu" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg1pMV">
    <property role="TrG5h" value="checkValidationRuleLength" />
    <node concept="3clFbS" id="42rXvlg1pMW" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg1pO6" role="3cqZAp">
        <node concept="3eOVzh" id="42rXvlg1tYr" role="3clFbw">
          <node concept="3cmrfG" id="42rXvlg1tYu" role="3uHU7w">
            <property role="3cmrfH" value="3" />
          </node>
          <node concept="2OqwBi" id="42rXvlg1qQo" role="3uHU7B">
            <node concept="2OqwBi" id="42rXvlg1pYn" role="2Oq$k0">
              <node concept="1YBJjd" id="42rXvlg1pOf" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg1pMY" resolve="validationRule" />
              </node>
              <node concept="3TrcHB" id="42rXvlg1qls" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pGwnG" resolve="implementationId" />
              </node>
            </node>
            <node concept="liA8E" id="42rXvlg1sVQ" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~String.length()" resolve="length" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg1pO8" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg1u92" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg1u9b" role="2MkJ7o">
              <property role="Xl_RC" value="ValidationRule implementationId must have at least 3 characters." />
            </node>
            <node concept="1YBJjd" id="42rXvlg1uaJ" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg1pMY" resolve="validationRule" />
            </node>
            <node concept="3Cnw8n" id="42rXvlg287Y" role="1urrFz">
              <ref role="QpYPw" node="42rXvlg1ub5" resolve="fixValidationRuleImplementationIdLength" />
              <node concept="3CnSsL" id="42rXvlg28i$" role="3Coj4f">
                <ref role="QkamJ" node="42rXvlg1ubw" resolve="validationRule" />
                <node concept="1YBJjd" id="42rXvlg28iJ" role="3CoRuB">
                  <ref role="1YBMHb" node="42rXvlg1pMY" resolve="validationRule" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg1pMY" role="1YuTPh">
      <property role="TrG5h" value="validationRule" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UM" resolve="ValidationRule" />
    </node>
  </node>
  <node concept="Q5z_Y" id="42rXvlg1ub5">
    <property role="TrG5h" value="fixValidationRuleImplementationIdLength" />
    <node concept="Q5ZZ6" id="42rXvlg1ub6" role="Q6x$H">
      <node concept="3clFbS" id="42rXvlg1ub7" role="2VODD2">
        <node concept="3clFbF" id="42rXvlg1uAy" role="3cqZAp">
          <node concept="2OqwBi" id="42rXvlg1vE4" role="3clFbG">
            <node concept="2OqwBi" id="42rXvlg1uL6" role="2Oq$k0">
              <node concept="QwW4i" id="42rXvlg1uAx" role="2Oq$k0">
                <ref role="QwW4h" node="42rXvlg1ubw" resolve="validationRule" />
              </node>
              <node concept="3TrcHB" id="42rXvlg1v8Q" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pGwnG" resolve="implementationId" />
              </node>
            </node>
            <node concept="tyxLq" id="42rXvlg1w8M" role="2OqNvi">
              <node concept="3cpWs3" id="42rXvlg1w$o" role="tz02z">
                <node concept="2OqwBi" id="42rXvlg1wNP" role="3uHU7w">
                  <node concept="QwW4i" id="42rXvlg1w_3" role="2Oq$k0">
                    <ref role="QwW4h" node="42rXvlg1ubw" resolve="validationRule" />
                  </node>
                  <node concept="3TrcHB" id="42rXvlg1xdk" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:7vG6G7pGwnG" resolve="implementationId" />
                  </node>
                </node>
                <node concept="Xl_RD" id="42rXvlg1w9p" role="3uHU7B">
                  <property role="Xl_RC" value="impl_" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="42rXvlg1ubw" role="Q6Id_">
      <property role="TrG5h" value="validationRule" />
      <node concept="3Tqbb2" id="42rXvlg1ueK" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UM" resolve="ValidationRule" />
      </node>
    </node>
    <node concept="QznSV" id="42rXvlg1ueW" role="QzAvj">
      <node concept="3clFbS" id="42rXvlg1ueX" role="2VODD2">
        <node concept="3clFbF" id="42rXvlg1ulJ" role="3cqZAp">
          <node concept="Xl_RD" id="42rXvlg1ulI" role="3clFbG">
            <property role="Xl_RC" value="Fix ValidationRule length" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg2CQO">
    <property role="TrG5h" value="checkValidationRuleExpressionWhenKindAutomatic" />
    <node concept="3clFbS" id="42rXvlg2CQP" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg2CS_" role="3cqZAp">
        <node concept="1Wc70l" id="42rXvlg2GfP" role="3clFbw">
          <node concept="3clFbC" id="42rXvlg2GXr" role="3uHU7w">
            <node concept="2OqwBi" id="42rXvlg2HJu" role="3uHU7w">
              <node concept="1XH99k" id="42rXvlg2H4A" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:7vG6G7pGwnB" resolve="ValidationKind" />
              </node>
              <node concept="2ViDtV" id="42rXvlg2I25" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:7vG6G7pGwnC" resolve="AUTOMATIC" />
              </node>
            </node>
            <node concept="2OqwBi" id="42rXvlg2GqZ" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg2Ggs" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg2CQR" resolve="validationRule" />
              </node>
              <node concept="3TrcHB" id="42rXvlg2GCh" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pGwn_" resolve="kind" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="42rXvlg2FXv" role="3uHU7B">
            <node concept="2OqwBi" id="42rXvlg2F2U" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg2CSI" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg2CQR" resolve="validationRule" />
              </node>
              <node concept="3TrcHB" id="42rXvlg2Fsz" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pGwnF" resolve="expression" />
              </node>
            </node>
            <node concept="10Nm6u" id="42rXvlg2Gfp" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg2CSB" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg2I5W" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg2I65" role="2MkJ7o">
              <property role="Xl_RC" value="ValidationRule expression must not be empty when kind is AUTOMATIC." />
            </node>
            <node concept="1YBJjd" id="42rXvlg2I6o" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg2CQR" resolve="validationRule" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg2CQR" role="1YuTPh">
      <property role="TrG5h" value="validationRule" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UM" resolve="ValidationRule" />
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg2I6I">
    <property role="TrG5h" value="checkModerationPolicyNameUnique" />
    <node concept="3clFbS" id="42rXvlg2I6J" role="18ibNy">
      <node concept="3cpWs8" id="42rXvlg2I8$" role="3cqZAp">
        <node concept="3cpWsn" id="42rXvlg2I8B" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="42rXvlg2I8y" role="1tU5fm">
            <node concept="17QB3L" id="42rXvlg2IeJ" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="42rXvlg2Ifw" role="33vP2m">
            <node concept="2i4dXS" id="42rXvlg2Iwm" role="2ShVmc">
              <node concept="17QB3L" id="42rXvlg2I_s" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="42rXvlg2ICc" role="3cqZAp">
        <node concept="2GrKxI" id="42rXvlg2ICe" role="2Gsz3X">
          <property role="TrG5h" value="moderationPolicy" />
        </node>
        <node concept="2OqwBi" id="42rXvlg2IO1" role="2GsD0m">
          <node concept="1YBJjd" id="42rXvlg2IDI" role="2Oq$k0">
            <ref role="1YBMHb" node="42rXvlg2I6L" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="42rXvlg2Jb5" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:3nWBi3h36Vg" resolve="moderationPolicy" />
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg2ICi" role="2LFqv$">
          <node concept="3clFbJ" id="42rXvlg2JgI" role="3cqZAp">
            <node concept="2OqwBi" id="42rXvlg2JXn" role="3clFbw">
              <node concept="37vLTw" id="42rXvlg2JgR" role="2Oq$k0">
                <ref role="3cqZAo" node="42rXvlg2I8B" resolve="names" />
              </node>
              <node concept="3JPx81" id="42rXvlg2Lvy" role="2OqNvi">
                <node concept="2OqwBi" id="42rXvlg2LFM" role="25WWJ7">
                  <node concept="2GrUjf" id="42rXvlg2LwU" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="42rXvlg2ICe" resolve="moderationPolicy" />
                  </node>
                  <node concept="3TrcHB" id="42rXvlg2Mrh" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="42rXvlg2JgK" role="3clFbx">
              <node concept="2MkqsV" id="42rXvlg2QSH" role="3cqZAp">
                <node concept="Xl_RD" id="42rXvlg2QSQ" role="2MkJ7o">
                  <property role="Xl_RC" value="ModerationPOlicy names must be unique." />
                </node>
                <node concept="2GrUjf" id="42rXvlg2QTQ" role="1urrMF">
                  <ref role="2Gs0qQ" node="42rXvlg2ICe" resolve="moderationPolicy" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="42rXvlg2QUd" role="9aQIa">
              <node concept="3clFbS" id="42rXvlg2QUe" role="9aQI4">
                <node concept="3clFbF" id="42rXvlg2R6D" role="3cqZAp">
                  <node concept="2OqwBi" id="42rXvlg2RNB" role="3clFbG">
                    <node concept="37vLTw" id="42rXvlg2R6B" role="2Oq$k0">
                      <ref role="3cqZAo" node="42rXvlg2I8B" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="42rXvlg2Trv" role="2OqNvi">
                      <node concept="2OqwBi" id="42rXvlg2TPr" role="25WWJ7">
                        <node concept="2GrUjf" id="42rXvlg2Tss" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="42rXvlg2ICe" resolve="moderationPolicy" />
                        </node>
                        <node concept="3TrcHB" id="42rXvlg2Uz2" role="2OqNvi">
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
    <node concept="1YaCAy" id="42rXvlg2I6L" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg2UAX">
    <property role="TrG5h" value="checkModerationPolicyMandatoryExecutedBy" />
    <node concept="3clFbS" id="42rXvlg2UAY" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg2UCO" role="3cqZAp">
        <node concept="3clFbC" id="42rXvlg2Wko" role="3clFbw">
          <node concept="10Nm6u" id="42rXvlg2Wqu" role="3uHU7w" />
          <node concept="2OqwBi" id="42rXvlg2VCp" role="3uHU7B">
            <node concept="1YBJjd" id="42rXvlg2UCX" role="2Oq$k0">
              <ref role="1YBMHb" node="42rXvlg2UB0" resolve="moderationPolicy" />
            </node>
            <node concept="3TrEf2" id="42rXvlg2VZu" role="2OqNvi">
              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsm" resolve="executedBy" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg2UCQ" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg2WtD" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg2WtM" role="2MkJ7o">
              <property role="Xl_RC" value="ModerationPolicy must have executedBy." />
            </node>
            <node concept="1YBJjd" id="42rXvlg2WuM" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg2UB0" resolve="moderationPolicy" />
            </node>
            <node concept="3Cnw8n" id="42rXvlg3t35" role="1urrFz">
              <ref role="QpYPw" node="42rXvlg2Wv8" resolve="fixAssignModeratorToModerationPolicyWhenExecutedByEmpty" />
              <node concept="3CnSsL" id="42rXvlg3t5H" role="3Coj4f">
                <ref role="QkamJ" node="42rXvlg2Wvz" resolve="moderationPolicy" />
                <node concept="1YBJjd" id="42rXvlg43Ac" role="3CoRuB">
                  <ref role="1YBMHb" node="42rXvlg2UB0" resolve="moderationPolicy" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg2UB0" role="1YuTPh">
      <property role="TrG5h" value="moderationPolicy" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ut" resolve="ModerationPolicy" />
    </node>
  </node>
  <node concept="Q5z_Y" id="42rXvlg2Wv8">
    <property role="TrG5h" value="fixAssignModeratorToModerationPolicyWhenExecutedByEmpty" />
    <node concept="Q5ZZ6" id="42rXvlg2Wv9" role="Q6x$H">
      <node concept="3clFbS" id="42rXvlg2Wva" role="2VODD2">
        <node concept="3clFbF" id="42rXvlg42l8" role="3cqZAp">
          <node concept="37vLTI" id="42rXvlg42$Q" role="3clFbG">
            <node concept="2OqwBi" id="42rXvlg42X$" role="37vLTx">
              <node concept="QwW4i" id="42rXvlg42HF" role="2Oq$k0">
                <ref role="QwW4h" node="42rXvlg2Wvz" resolve="moderationPolicy" />
              </node>
              <node concept="2Xjw5R" id="42rXvlg43pm" role="2OqNvi">
                <node concept="1xMEDy" id="42rXvlg43po" role="1xVPHs">
                  <node concept="chp4Y" id="42rXvlg43v8" role="ri$Ld">
                    <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3OciIN" id="42rXvlg42l6" role="37vLTJ">
              <ref role="3OciIK" node="42rXvlg41Kx" resolve="refModel" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="42rXvlg39c0" role="3cqZAp">
          <node concept="37vLTI" id="42rXvlg3rPo" role="3clFbG">
            <node concept="3OciIN" id="42rXvlg39bY" role="37vLTJ">
              <ref role="3OciIK" node="42rXvlg38Ok" resolve="userType" />
            </node>
            <node concept="2OqwBi" id="42rXvlg3elJ" role="37vLTx">
              <node concept="2OqwBi" id="42rXvlg3a14" role="2Oq$k0">
                <node concept="3OciIN" id="42rXvlg42b_" role="2Oq$k0">
                  <ref role="3OciIK" node="42rXvlg41Kx" resolve="refModel" />
                </node>
                <node concept="3Tsc0h" id="42rXvlg3aB_" role="2OqNvi">
                  <ref role="3TtcxE" to="2rvu:47EFX_mxMIt" resolve="userType" />
                </node>
              </node>
              <node concept="1z4cxt" id="42rXvlg3m3w" role="2OqNvi">
                <node concept="1bVj0M" id="42rXvlg3m3y" role="23t8la">
                  <node concept="3clFbS" id="42rXvlg3m3z" role="1bW5cS">
                    <node concept="3clFbF" id="42rXvlg3mvW" role="3cqZAp">
                      <node concept="3clFbC" id="42rXvlg3nYm" role="3clFbG">
                        <node concept="2OqwBi" id="42rXvlg3piZ" role="3uHU7w">
                          <node concept="1XH99k" id="42rXvlg3o8H" role="2Oq$k0">
                            <ref role="1XH99l" to="2rvu:7vG6G7pGwmW" resolve="UserKind" />
                          </node>
                          <node concept="2ViDtV" id="42rXvlg3qhR" role="2OqNvi">
                            <ref role="2ViDtZ" to="2rvu:7vG6G7pGwn1" resolve="MODERATOR" />
                          </node>
                        </node>
                        <node concept="2OqwBi" id="42rXvlg3mJg" role="3uHU7B">
                          <node concept="37vLTw" id="42rXvlg3mvV" role="2Oq$k0">
                            <ref role="3cqZAo" node="42rXvlg3m3$" resolve="it" />
                          </node>
                          <node concept="3TrcHB" id="42rXvlg3n$y" role="2OqNvi">
                            <ref role="3TsBF5" to="2rvu:7vG6G7pGwn2" resolve="kind" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="gl6BB" id="42rXvlg3m3$" role="1bW2Oz">
                    <property role="TrG5h" value="it" />
                    <node concept="2jxLKc" id="42rXvlg3m3_" role="1tU5fm" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="42rXvlg3rfH" role="3cqZAp">
          <node concept="3clFbS" id="42rXvlg3rfJ" role="3clFbx">
            <node concept="3clFbF" id="42rXvlg3s8K" role="3cqZAp">
              <node concept="37vLTI" id="42rXvlg3sVQ" role="3clFbG">
                <node concept="3OciIN" id="42rXvlg3t0$" role="37vLTx">
                  <ref role="3OciIK" node="42rXvlg38Ok" resolve="userType" />
                </node>
                <node concept="2OqwBi" id="42rXvlg3sld" role="37vLTJ">
                  <node concept="QwW4i" id="42rXvlg3s8I" role="2Oq$k0">
                    <ref role="QwW4h" node="42rXvlg2Wvz" resolve="moderationPolicy" />
                  </node>
                  <node concept="3TrEf2" id="42rXvlg3sIE" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsm" resolve="executedBy" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="42rXvlg3rt$" role="3clFbw">
            <node concept="10Nm6u" id="42rXvlg3rLV" role="3uHU7w" />
            <node concept="3OciIN" id="42rXvlg3rj5" role="3uHU7B">
              <ref role="3OciIK" node="42rXvlg38Ok" resolve="userType" />
            </node>
          </node>
          <node concept="9aQIb" id="42rXvlg5eIs" role="9aQIa">
            <node concept="3clFbS" id="42rXvlg5eIt" role="9aQI4">
              <node concept="2xdQw9" id="42rXvlg5eNS" role="3cqZAp">
                <property role="2xdLsb" value="gZ5fh_4/error" />
                <node concept="Xl_RD" id="42rXvlg5eNU" role="9lYJi">
                  <property role="Xl_RC" value="No UserType with MODERATOR kind found." />
                </node>
                <node concept="3OciIN" id="42rXvlg5eP6" role="1wxasE">
                  <ref role="3OciIK" node="42rXvlg38Ok" resolve="userType" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="42rXvlg2Wvz" role="Q6Id_">
      <property role="TrG5h" value="moderationPolicy" />
      <node concept="3Tqbb2" id="42rXvlg2WzK" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Ut" resolve="ModerationPolicy" />
      </node>
    </node>
    <node concept="QznSV" id="42rXvlg2WzY" role="QzAvj">
      <node concept="3clFbS" id="42rXvlg2WzZ" role="2VODD2">
        <node concept="3clFbF" id="42rXvlg2WEP" role="3cqZAp">
          <node concept="Xl_RD" id="42rXvlg2WEO" role="3clFbG">
            <property role="Xl_RC" value="Find a UserType with MODERATOR kind" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Oc7vg" id="42rXvlg38Ok" role="3OczkL">
      <property role="TrG5h" value="userType" />
      <node concept="3Tqbb2" id="42rXvlg395E" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
      </node>
    </node>
    <node concept="3Oc7vg" id="42rXvlg41Kx" role="3OczkL">
      <property role="TrG5h" value="refModel" />
      <node concept="3Tqbb2" id="42rXvlg41R1" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg5Nez">
    <property role="TrG5h" value="checkModerationPolicyTriggerNotEmptyForAutomaticModerationMode" />
    <node concept="3clFbS" id="42rXvlg5Ne$" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg5Ngw" role="3cqZAp">
        <node concept="1Wc70l" id="42rXvlg5PA4" role="3clFbw">
          <node concept="3clFbC" id="42rXvlg5QEe" role="3uHU7w">
            <node concept="10Nm6u" id="42rXvlg5QWG" role="3uHU7w" />
            <node concept="2OqwBi" id="42rXvlg5PN3" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg5PCk" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg5NeA" resolve="moderationPolicy" />
              </node>
              <node concept="3TrcHB" id="42rXvlg5QaG" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pGwn9" resolve="trigger" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="42rXvlg5O8C" role="3uHU7B">
            <node concept="2OqwBi" id="42rXvlg5NqL" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg5NgD" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg5NeA" resolve="moderationPolicy" />
              </node>
              <node concept="3TrcHB" id="42rXvlg5NPf" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:7vG6G7pGwn8" resolve="mode" />
              </node>
            </node>
            <node concept="2OqwBi" id="42rXvlg5OXl" role="3uHU7w">
              <node concept="1XH99k" id="42rXvlg5OeU" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:7vG6G7pGwn4" resolve="ModerationMode" />
              </node>
              <node concept="2ViDtV" id="42rXvlg5PlT" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:7vG6G7pGwn5" resolve="AUTOMATIC" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg5Ngy" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg5R6U" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg5R74" role="2MkJ7o">
              <property role="Xl_RC" value="ModerationPolicy trigger must not be empty when mode is AUTOMATIC" />
            </node>
            <node concept="1YBJjd" id="42rXvlg5R7n" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg5NeA" resolve="moderationPolicy" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg5NeA" role="1YuTPh">
      <property role="TrG5h" value="moderationPolicy" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ut" resolve="ModerationPolicy" />
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg5R7H">
    <property role="TrG5h" value="checkAuthorizationRuleActorNotEmpty" />
    <node concept="3clFbS" id="42rXvlg5R7I" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg5R9H" role="3cqZAp">
        <node concept="3clFbC" id="42rXvlg5RRX" role="3clFbw">
          <node concept="10Nm6u" id="42rXvlg5RY3" role="3uHU7w" />
          <node concept="2OqwBi" id="42rXvlg5RjY" role="3uHU7B">
            <node concept="1YBJjd" id="42rXvlg5R9Q" role="2Oq$k0">
              <ref role="1YBMHb" node="42rXvlg5R7K" resolve="authorizationRule" />
            </node>
            <node concept="3TrEf2" id="42rXvlg5RF3" role="2OqNvi">
              <ref role="3Tt5mk" to="2rvu:3vc7gP65iG_" resolve="actor" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg5R9J" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg5S1t" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg5S1A" role="2MkJ7o">
              <property role="Xl_RC" value="AuthorizationRule must have an actor." />
            </node>
            <node concept="1YBJjd" id="42rXvlg5S23" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg5R7K" resolve="authorizationRule" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg5R7K" role="1YuTPh">
      <property role="TrG5h" value="authorizationRule" />
      <ref role="1YaFvo" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
    </node>
  </node>
  <node concept="Q5z_Y" id="42rXvlg5S4R">
    <property role="TrG5h" value="fixAssignUserTypeToAuthorizationRuleWhenEmpty" />
    <node concept="Q5ZZ6" id="42rXvlg5S4S" role="Q6x$H">
      <node concept="3clFbS" id="42rXvlg5S4T" role="2VODD2">
        <node concept="3clFbF" id="42rXvlg5SAQ" role="3cqZAp">
          <node concept="37vLTI" id="42rXvlg5Tt$" role="3clFbG">
            <node concept="2OqwBi" id="42rXvlg5Xf8" role="37vLTx">
              <node concept="2OqwBi" id="42rXvlg5Uoj" role="2Oq$k0">
                <node concept="2OqwBi" id="42rXvlg5TKO" role="2Oq$k0">
                  <node concept="QwW4i" id="42rXvlg5T$9" role="2Oq$k0">
                    <ref role="QwW4h" node="42rXvlg5S5i" resolve="authorizationRule" />
                  </node>
                  <node concept="2Xjw5R" id="42rXvlg5UaG" role="2OqNvi">
                    <node concept="1xMEDy" id="42rXvlg5UaI" role="1xVPHs">
                      <node concept="chp4Y" id="42rXvlg5Udg" role="ri$Ld">
                        <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3Tsc0h" id="42rXvlg5UJL" role="2OqNvi">
                  <ref role="3TtcxE" to="2rvu:47EFX_mxMIt" resolve="userType" />
                </node>
              </node>
              <node concept="1uHKPH" id="42rXvlg64uv" role="2OqNvi" />
            </node>
            <node concept="2OqwBi" id="42rXvlg5SNl" role="37vLTJ">
              <node concept="QwW4i" id="42rXvlg5SAP" role="2Oq$k0">
                <ref role="QwW4h" node="42rXvlg5S5i" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="42rXvlg5Taw" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:3vc7gP65iG_" resolve="actor" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="42rXvlg5S5i" role="Q6Id_">
      <property role="TrG5h" value="authorizationRule" />
      <node concept="3Tqbb2" id="42rXvlg5S8$" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
      </node>
    </node>
    <node concept="QznSV" id="42rXvlg5SeL" role="QzAvj">
      <node concept="3clFbS" id="42rXvlg5SeM" role="2VODD2">
        <node concept="3clFbF" id="42rXvlg5SlF" role="3cqZAp">
          <node concept="Xl_RD" id="42rXvlg5SlE" role="3clFbG">
            <property role="Xl_RC" value="Assign an Actor (UserType)" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg64_G">
    <property role="TrG5h" value="checkAuthorizationRuleHaveResourceTargetFeedbackTarget" />
    <node concept="3clFbS" id="42rXvlg64_H" role="18ibNy">
      <node concept="3clFbJ" id="42rXvlg64BM" role="3cqZAp">
        <node concept="22lmx$" id="42rXvlg65ow" role="3clFbw">
          <node concept="3clFbC" id="42rXvlg66gC" role="3uHU7w">
            <node concept="10Nm6u" id="42rXvlg66n6" role="3uHU7w" />
            <node concept="2OqwBi" id="42rXvlg65G_" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg65p7" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg64_J" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="42rXvlg665k" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsb" resolve="feedbackTarget" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="42rXvlg65hW" role="3uHU7B">
            <node concept="2OqwBi" id="42rXvlg64M3" role="3uHU7B">
              <node concept="1YBJjd" id="42rXvlg64BV" role="2Oq$k0">
                <ref role="1YBMHb" node="42rXvlg64_J" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="42rXvlg64X2" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs$" resolve="resourceTarget" />
              </node>
            </node>
            <node concept="10Nm6u" id="42rXvlg65o2" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg64BO" role="3clFbx">
          <node concept="2MkqsV" id="42rXvlg66sn" role="3cqZAp">
            <node concept="Xl_RD" id="42rXvlg66sx" role="2MkJ7o">
              <property role="Xl_RC" value="AuthorizationRule must have both targets (resourceTarget and feedbackTarget)" />
            </node>
            <node concept="1YBJjd" id="42rXvlg66sO" role="1urrMF">
              <ref role="1YBMHb" node="42rXvlg64_J" resolve="authorizationRule" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="42rXvlg64_J" role="1YuTPh">
      <property role="TrG5h" value="authorizationRule" />
      <ref role="1YaFvo" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
    </node>
  </node>
  <node concept="18kY7G" id="42rXvlg66tb">
    <property role="TrG5h" value="checkAutomationRuleNameUnique" />
    <node concept="3clFbS" id="42rXvlg66tc" role="18ibNy">
      <node concept="3cpWs8" id="42rXvlg66vm" role="3cqZAp">
        <node concept="3cpWsn" id="42rXvlg66vp" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="42rXvlg66vk" role="1tU5fm">
            <node concept="17QB3L" id="42rXvlg66AI" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="42rXvlg66Bq" role="33vP2m">
            <node concept="2i4dXS" id="42rXvlg66Bl" role="2ShVmc">
              <node concept="17QB3L" id="42rXvlg66Bm" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="42rXvlg66GG" role="3cqZAp">
        <node concept="2GrKxI" id="42rXvlg66GI" role="2Gsz3X">
          <property role="TrG5h" value="automationRule" />
        </node>
        <node concept="2OqwBi" id="42rXvlg66Si" role="2GsD0m">
          <node concept="1YBJjd" id="42rXvlg66HZ" role="2Oq$k0">
            <ref role="1YBMHb" node="42rXvlg66te" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="42rXvlg67hh" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:3nWBi3h36UY" resolve="automationRule" />
          </node>
        </node>
        <node concept="3clFbS" id="42rXvlg66GM" role="2LFqv$">
          <node concept="3clFbJ" id="42rXvlg67nf" role="3cqZAp">
            <node concept="2OqwBi" id="42rXvlg683S" role="3clFbw">
              <node concept="37vLTw" id="42rXvlg67no" role="2Oq$k0">
                <ref role="3cqZAo" node="42rXvlg66vp" resolve="names" />
              </node>
              <node concept="3JPx81" id="42rXvlg69A3" role="2OqNvi">
                <node concept="2OqwBi" id="42rXvlg69Mj" role="25WWJ7">
                  <node concept="2GrUjf" id="42rXvlg69Br" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="42rXvlg66GI" resolve="automationRule" />
                  </node>
                  <node concept="3TrcHB" id="42rXvlg6bbd" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="42rXvlg67nh" role="3clFbx">
              <node concept="2MkqsV" id="42rXvlg6bjp" role="3cqZAp">
                <node concept="Xl_RD" id="42rXvlg6bjy" role="2MkJ7o">
                  <property role="Xl_RC" value="AutomationRule name must be unique" />
                </node>
                <node concept="2GrUjf" id="42rXvlg6bjQ" role="1urrMF">
                  <ref role="2Gs0qQ" node="42rXvlg66GI" resolve="automationRule" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="42rXvlg6bkd" role="9aQIa">
              <node concept="3clFbS" id="42rXvlg6bke" role="9aQI4">
                <node concept="3clFbF" id="42rXvlg6bv5" role="3cqZAp">
                  <node concept="2OqwBi" id="42rXvlg6cif" role="3clFbG">
                    <node concept="37vLTw" id="42rXvlg6bv4" role="2Oq$k0">
                      <ref role="3cqZAo" node="42rXvlg66vp" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="42rXvlg6dU7" role="2OqNvi">
                      <node concept="2OqwBi" id="42rXvlg6ec2" role="25WWJ7">
                        <node concept="2GrUjf" id="42rXvlg6dVi" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="42rXvlg66GI" resolve="automationRule" />
                        </node>
                        <node concept="3TrcHB" id="42rXvlg6eXI" role="2OqNvi">
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
    <node concept="1YaCAy" id="42rXvlg66te" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaFZo3J">
    <property role="TrG5h" value="checkVerificationPolicyUnique" />
    <node concept="3clFbS" id="1AYOqaFZo3K" role="18ibNy">
      <node concept="3cpWs8" id="1AYOqaFZogj" role="3cqZAp">
        <node concept="3cpWsn" id="1AYOqaFZogm" role="3cpWs9">
          <property role="TrG5h" value="names" />
          <node concept="2hMVRd" id="1AYOqaFZogf" role="1tU5fm">
            <node concept="17QB3L" id="1AYOqaFZokF" role="2hN53Y" />
          </node>
          <node concept="2ShNRf" id="1AYOqaFZolv" role="33vP2m">
            <node concept="2i4dXS" id="1AYOqaFZpXb" role="2ShVmc">
              <node concept="17QB3L" id="1AYOqaFZq3d" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="1AYOqaFZq7i" role="3cqZAp">
        <node concept="2GrKxI" id="1AYOqaFZq7k" role="2Gsz3X">
          <property role="TrG5h" value="verificationPolicy" />
        </node>
        <node concept="2OqwBi" id="1AYOqaFZqjT" role="2GsD0m">
          <node concept="1YBJjd" id="1AYOqaFZq9A" role="2Oq$k0">
            <ref role="1YBMHb" node="1AYOqaFZo3M" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="1AYOqaFZslZ" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:7vG6G7pFVDH" resolve="verificationPolicy" />
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaFZq7o" role="2LFqv$">
          <node concept="3clFbJ" id="1AYOqaFZyp$" role="3cqZAp">
            <node concept="2OqwBi" id="1AYOqaFZz6d" role="3clFbw">
              <node concept="37vLTw" id="1AYOqaFZypH" role="2Oq$k0">
                <ref role="3cqZAo" node="1AYOqaFZogm" resolve="names" />
              </node>
              <node concept="3JPx81" id="1AYOqaFZAe0" role="2OqNvi">
                <node concept="2OqwBi" id="1AYOqaFZAqg" role="25WWJ7">
                  <node concept="2GrUjf" id="1AYOqaFZAfo" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="1AYOqaFZq7k" resolve="verificationPolicy" />
                  </node>
                  <node concept="3TrcHB" id="1AYOqaFZBc5" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaFZypA" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaFZBkw" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaFZBkD" role="2MkJ7o">
                  <property role="Xl_RC" value="VerificationPolicy name must be unique." />
                </node>
                <node concept="2GrUjf" id="1AYOqaFZBlf" role="1urrMF">
                  <ref role="2Gs0qQ" node="1AYOqaFZq7k" resolve="verificationPolicy" />
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="1AYOqaFZBlA" role="9aQIa">
              <node concept="3clFbS" id="1AYOqaFZBlB" role="9aQI4">
                <node concept="3clFbF" id="1AYOqaFZBwH" role="3cqZAp">
                  <node concept="2OqwBi" id="1AYOqaFZCcy" role="3clFbG">
                    <node concept="37vLTw" id="1AYOqaFZBwG" role="2Oq$k0">
                      <ref role="3cqZAo" node="1AYOqaFZogm" resolve="names" />
                    </node>
                    <node concept="TSZUe" id="1AYOqaFZDID" role="2OqNvi">
                      <node concept="2OqwBi" id="1AYOqaFZE0$" role="25WWJ7">
                        <node concept="2GrUjf" id="1AYOqaFZDJO" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="1AYOqaFZq7k" resolve="verificationPolicy" />
                        </node>
                        <node concept="3TrcHB" id="1AYOqaFZEPz" role="2OqNvi">
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
    <node concept="1YaCAy" id="1AYOqaFZo3M" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaFZEYD">
    <property role="TrG5h" value="checkVerificationPolicyVerifyFeedbackDefinition" />
    <node concept="3clFbS" id="1AYOqaFZEYE" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaFZF0Y" role="3cqZAp">
        <node concept="3clFbC" id="1AYOqaFZFPW" role="3clFbw">
          <node concept="10Nm6u" id="1AYOqaFZFW2" role="3uHU7w" />
          <node concept="2OqwBi" id="1AYOqaFZFbf" role="3uHU7B">
            <node concept="1YBJjd" id="1AYOqaFZF17" role="2Oq$k0">
              <ref role="1YBMHb" node="1AYOqaFZEYG" resolve="verificationPolicy" />
            </node>
            <node concept="3TrEf2" id="1AYOqaFZFme" role="2OqNvi">
              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs8" resolve="feedbackDefinition" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaFZF10" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaFZFZZ" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaFZG08" role="2MkJ7o">
              <property role="Xl_RC" value="VerificationPolicy must verify a FeedbackDefinition." />
            </node>
            <node concept="1YBJjd" id="1AYOqaFZG0_" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaFZEYG" resolve="verificationPolicy" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaFZEYG" role="1YuTPh">
      <property role="TrG5h" value="verificationPolicy" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36US" resolve="VerificationPolicy" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaFZG0W">
    <property role="TrG5h" value="checkRatingImpliesRatingPolicy" />
    <node concept="3clFbS" id="1AYOqaFZG0X" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaFZGHa" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaFZIKc" role="3clFbw">
          <node concept="3clFbC" id="1AYOqaFZMp6" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaFZMxD" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaFZIZ$" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaFZN0v" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaFZG10" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaFZLLg" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="1AYOqaFZIo5" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaFZHxS" role="3uHU7B">
              <node concept="2OqwBi" id="1AYOqaFZGRr" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaFZMZD" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaFZG10" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1AYOqaFZHbG" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="3TrcHB" id="1AYOqaFZHKC" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
              </node>
            </node>
            <node concept="3clFbT" id="1AYOqaFZIHE" role="3uHU7w">
              <property role="3clFbU" value="true" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaFZGHc" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaFZMBp" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaFZMBz" role="2MkJ7o">
              <property role="Xl_RC" value="FeedbackDefinition with hasRating=true must define a RatingPolicy." />
            </node>
            <node concept="1YBJjd" id="1AYOqaFZNim" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaFZG10" resolve="feedbackDefinition" />
            </node>
            <node concept="3Cnw8n" id="1rkHUYSVXMi" role="1urrFz">
              <ref role="QpYPw" node="583Ws_2Q5RD" resolve="fixFeedbackDefinitionRatingPolicyWithHasRatingTrue" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaFZG10" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaFZMCl">
    <property role="TrG5h" value="checkFeedbackKindReviewTargetResourcesOnly" />
    <node concept="3clFbS" id="1AYOqaFZMCm" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaFZNl5" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaFZPig" role="3clFbw">
          <node concept="3y3z36" id="1AYOqaFZPQL" role="3uHU7w">
            <node concept="2OqwBi" id="1AYOqaFZQLU" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaFZQ2v" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
              </node>
              <node concept="2ViDtV" id="1AYOqaFZR6i" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaFZPvf" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaFZPkw" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaFZNiG" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaFZPEM" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="1AYOqaFZNQh" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaFZNvm" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaFZNle" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaFZNiG" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaFZNEl" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaFZOJQ" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaFZNV6" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
              </node>
              <node concept="2ViDtV" id="1AYOqaFZP25" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656r4" resolve="REVIEW" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaFZNl7" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaFZRlP" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaFZRlY" role="2MkJ7o">
              <property role="Xl_RC" value="REVIEW feedback must use subjectScope = RESOURCE_ONLY" />
            </node>
            <node concept="1YBJjd" id="1AYOqaFZRmr" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaFZNiG" resolve="feedbackType" />
            </node>
            <node concept="3Cnw8n" id="1AYOqaFZTwW" role="1urrFz">
              <ref role="QpYPw" node="1AYOqaFZRmM" resolve="fixReviewSubjectScopeToResourceOnly" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaFZNiG" role="1YuTPh">
      <property role="TrG5h" value="feedbackType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaFZRmM">
    <property role="TrG5h" value="fixReviewSubjectScopeToResourceOnly" />
    <node concept="Q5ZZ6" id="1AYOqaFZRmN" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaFZRmO" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaFZRCY" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaFZSpr" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaFZRPt" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaFZRCX" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaFZRne" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaFZSdd" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaFZSGC" role="2OqNvi">
              <node concept="2OqwBi" id="1AYOqaFZTdR" role="tz02z">
                <node concept="1XH99k" id="1AYOqaFZSHf" role="2Oq$k0">
                  <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
                </node>
                <node concept="2ViDtV" id="1AYOqaFZTwh" role="2OqNvi">
                  <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaFZRne" role="Q6Id_">
      <property role="TrG5h" value="feedbackType" />
      <node concept="3Tqbb2" id="1AYOqaFZRp_" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaFZRpJ" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaFZRpK" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaFZRwN" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaFZRwM" role="3clFbG">
            <property role="Xl_RC" value="Set subjectScope to RESOURCE_ONLY for REVIEW feedback" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaFZTH3">
    <property role="TrG5h" value="checkFeedbackTypeReactionVoteDisallowRatingAndRecursion" />
    <node concept="3clFbS" id="1AYOqaFZTH4" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaFZTJ$" role="3cqZAp">
        <node concept="22lmx$" id="1AYOqaFZY11" role="3clFbw">
          <node concept="3clFbC" id="1AYOqaFZY$Q" role="3uHU7w">
            <node concept="2OqwBi" id="1AYOqaFZZma" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaFZY_S" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
              </node>
              <node concept="2ViDtV" id="1AYOqaFZZCX" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656r6" resolve="VOTE" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaFZYiS" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaFZY89" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaFZTH6" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaFZYwm" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="1AYOqaFZVmu" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaFZTTP" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaFZTJH" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaFZTH6" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaFZU4O" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaFZW0i" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaFZVrj" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
              </node>
              <node concept="2ViDtV" id="1AYOqaFZWix" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656r5" resolve="REACTION" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaFZTJA" role="3clFbx">
          <node concept="3clFbJ" id="1AYOqaFZZKJ" role="3cqZAp">
            <node concept="22lmx$" id="1AYOqaG01xA" role="3clFbw">
              <node concept="3clFbC" id="1AYOqaG02y0" role="3uHU7w">
                <node concept="3clFbT" id="1AYOqaG02zY" role="3uHU7w">
                  <property role="3clFbU" value="true" />
                </node>
                <node concept="2OqwBi" id="1AYOqaG026T" role="3uHU7B">
                  <node concept="1YBJjd" id="1AYOqaG01Ve" role="2Oq$k0">
                    <ref role="1YBMHb" node="1AYOqaFZTH6" resolve="feedbackType" />
                  </node>
                  <node concept="3TrcHB" id="1AYOqaG02vu" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
                  </node>
                </node>
              </node>
              <node concept="3clFbC" id="1AYOqaG00_q" role="3uHU7B">
                <node concept="2OqwBi" id="1AYOqaFZZV1" role="3uHU7B">
                  <node concept="1YBJjd" id="1AYOqaFZZKT" role="2Oq$k0">
                    <ref role="1YBMHb" node="1AYOqaFZTH6" resolve="feedbackType" />
                  </node>
                  <node concept="3TrcHB" id="1AYOqaG00dn" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
                  </node>
                </node>
                <node concept="3clFbT" id="1AYOqaG00O5" role="3uHU7w">
                  <property role="3clFbU" value="true" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaFZZKL" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaG02Xk" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaG02Xt" role="2MkJ7o">
                  <property role="Xl_RC" value="REACTION/VOTE must have hasRating=false and recursive=false" />
                </node>
                <node concept="1YBJjd" id="1AYOqaG02XM" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaFZTH6" resolve="feedbackType" />
                </node>
                <node concept="3Cnw8n" id="1AYOqaG11Dq" role="1urrFz">
                  <ref role="QpYPw" node="1AYOqaG0U9r" resolve="disableFeedbackTypeRatingAndRecursionForReactionVote" />
                  <node concept="3CnSsL" id="1AYOqaG11Z4" role="3Coj4f">
                    <ref role="QkamJ" node="1AYOqaG0UJh" resolve="feedbackType" />
                    <node concept="1YBJjd" id="1AYOqaG11Zf" role="3CoRuB">
                      <ref role="1YBMHb" node="1AYOqaFZTH6" resolve="feedbackType" />
                      <node concept="1KehLL" id="1AYOqaG127t" role="lGtFl">
                        <property role="1K8rM7" value="property_name" />
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
    <node concept="1YaCAy" id="1AYOqaFZTH6" role="1YuTPh">
      <property role="TrG5h" value="feedbackType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG02Y9">
    <property role="TrG5h" value="checkFeedbackDefinitionReactionVoteDisallowRating" />
    <node concept="3clFbS" id="1AYOqaG02Ya" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG030H" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaG2i$P" role="3clFbw">
          <node concept="3clFbC" id="1AYOqaG043f" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaG03yR" role="3uHU7B">
              <node concept="2OqwBi" id="1AYOqaG03aY" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaG030Q" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaG02Yc" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1AYOqaG03lX" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="3TrcHB" id="1AYOqaG03JH" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG04MC" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaG049D" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
              </node>
              <node concept="2ViDtV" id="1AYOqaG05Hw" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656r5" resolve="REACTION" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="1AYOqaG07eY" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaG07lH" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaG06F2" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaG06we" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaG02Yc" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG073p" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG030J" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaG07pT" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaG07q2" role="2MkJ7o">
              <property role="Xl_RC" value="FeedbackType.kind=REACTION/VOTE cannot define RatingPolicy" />
            </node>
            <node concept="1YBJjd" id="1AYOqaG07qL" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaG02Yc" resolve="feedbackDefinition" />
            </node>
            <node concept="3Cnw8n" id="1AYOqaG14no" role="1urrFz">
              <ref role="QpYPw" node="or9vidIkQ7" resolve="removeRatingPolicy" />
              <node concept="3CnSsL" id="1AYOqaG14wV" role="3Coj4f">
                <ref role="QkamJ" node="or9vidIkQy" resolve="feedbackDefinition" />
                <node concept="1YBJjd" id="1AYOqaG14x6" role="3CoRuB">
                  <ref role="1YBMHb" node="1AYOqaG02Yc" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG02Yc" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG0U9r">
    <property role="TrG5h" value="disableFeedbackTypeRatingAndRecursionForReactionVote" />
    <node concept="Q5ZZ6" id="1AYOqaG0U9s" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG0U9t" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG0YKG" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG0ZRq" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG0YVg" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG0YKF" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG0UJh" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG0Z7h" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaG10u8" role="2OqNvi">
              <node concept="3clFbT" id="1AYOqaG10uJ" role="tz02z" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG10yX" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG11zd" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG10Hx" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG10yV" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG0UJh" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG117y" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaG11Aq" role="2OqNvi">
              <node concept="3clFbT" id="1AYOqaG11B1" role="tz02z" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG0UJh" role="Q6Id_">
      <property role="TrG5h" value="feedbackType" />
      <node concept="3Tqbb2" id="1AYOqaG0UNp" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG0UND" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG0UNE" role="2VODD2">
        <node concept="3clFbJ" id="1AYOqaG1wT7" role="3cqZAp">
          <node concept="3clFbS" id="1AYOqaG1wT9" role="3clFbx">
            <node concept="3cpWs6" id="1AYOqaG1yQk" role="3cqZAp">
              <node concept="Xl_RD" id="1AYOqaG1yYR" role="3cqZAk">
                <property role="Xl_RC" value="Disable rating and recursion for REACTION/VOTE" />
              </node>
            </node>
          </node>
          <node concept="1Wc70l" id="1AYOqaG1xSv" role="3clFbw">
            <node concept="2OqwBi" id="1AYOqaG1yei" role="3uHU7w">
              <node concept="QwW4i" id="1AYOqaG1y2j" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG0UJh" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG1yGM" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG1x4Z" role="3uHU7B">
              <node concept="QwW4i" id="1AYOqaG1wTU" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG0UJh" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG1xvY" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="1AYOqaG1zbZ" role="3cqZAp">
          <node concept="3clFbS" id="1AYOqaG1zc1" role="3clFbx">
            <node concept="3cpWs6" id="1AYOqaG1zXI" role="3cqZAp">
              <node concept="Xl_RD" id="1AYOqaG1zZa" role="3cqZAk">
                <property role="Xl_RC" value="Disable rating for REACTION/VOTE" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="1AYOqaG1ztD" role="3clFbw">
            <node concept="QwW4i" id="1AYOqaG1zi_" role="2Oq$k0">
              <ref role="QwW4h" node="1AYOqaG0UJh" resolve="feedbackType" />
            </node>
            <node concept="3TrcHB" id="1AYOqaG1zT1" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="1AYOqaG1$9N" role="3cqZAp">
          <node concept="3clFbS" id="1AYOqaG1$9P" role="3clFbx">
            <node concept="3cpWs6" id="1AYOqaG1$Y8" role="3cqZAp">
              <node concept="Xl_RD" id="1AYOqaG1_4N" role="3cqZAk">
                <property role="Xl_RC" value="Disable recursion for REACTION/VOTE" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="1AYOqaG1$lX" role="3clFbw">
            <node concept="QwW4i" id="1AYOqaG1$aJ" role="2Oq$k0">
              <ref role="QwW4h" node="1AYOqaG0UJh" resolve="feedbackType" />
            </node>
            <node concept="3TrcHB" id="1AYOqaG1$Rt" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="1AYOqaG1_du" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG1_lm" role="3cqZAk">
            <property role="Xl_RC" value="no changes required" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG12Of">
    <property role="TrG5h" value="disableFeedbackDefinitionReactionVoteDisallowRatingPolicy" />
    <node concept="Q5ZZ6" id="1AYOqaG12Og" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG12Oh" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG139x" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG13Un" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG13m0" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG139w" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG12OE" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG13Hb" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
              </node>
            </node>
            <node concept="2oxUTD" id="1AYOqaG14lk" role="2OqNvi">
              <node concept="10Nm6u" id="1AYOqaG14mw" role="2oxUTC" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG12OE" role="Q6Id_">
      <property role="TrG5h" value="feedbackDefinition" />
      <node concept="3Tqbb2" id="1AYOqaG12Qo" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG12Qy" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG12Qz" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG12XE" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG12XD" role="3clFbG">
            <property role="Xl_RC" value="Remove the RatingPolicy from REACTION and VOTE" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG4pH5">
    <property role="TrG5h" value="checkFeedbackTypeKindSubscriptionResourceOnlyNonRecursive" />
    <node concept="3clFbS" id="1AYOqaG4pH6" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG4pJM" role="3cqZAp">
        <node concept="3clFbC" id="1AYOqaG4qBS" role="3clFbw">
          <node concept="2OqwBi" id="1AYOqaG4rr8" role="3uHU7w">
            <node concept="1XH99k" id="1AYOqaG4qGH" role="2Oq$k0">
              <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
            </node>
            <node concept="2ViDtV" id="1AYOqaG4rHn" role="2OqNvi">
              <ref role="2ViDtZ" to="2rvu:3vc7gP656r8" resolve="SUBSCRIPTION" />
            </node>
          </node>
          <node concept="2OqwBi" id="1AYOqaG4pU3" role="3uHU7B">
            <node concept="1YBJjd" id="1AYOqaG4pJV" role="2Oq$k0">
              <ref role="1YBMHb" node="1AYOqaG4pH8" resolve="feedbackType" />
            </node>
            <node concept="3TrcHB" id="1AYOqaG4qnE" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG4pJO" role="3clFbx">
          <node concept="3clFbJ" id="1AYOqaG4rKs" role="3cqZAp">
            <node concept="22lmx$" id="1AYOqaG4tqm" role="3clFbw">
              <node concept="2OqwBi" id="1AYOqaG4tAO" role="3uHU7w">
                <node concept="1YBJjd" id="1AYOqaG4trB" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaG4pH8" resolve="feedbackType" />
                </node>
                <node concept="3TrcHB" id="1AYOqaG4tYV" role="2OqNvi">
                  <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
                </node>
              </node>
              <node concept="3y3z36" id="1AYOqaG4sf6" role="3uHU7B">
                <node concept="2OqwBi" id="1AYOqaG4rUs" role="3uHU7B">
                  <node concept="1YBJjd" id="1AYOqaG4rK_" role="2Oq$k0">
                    <ref role="1YBMHb" node="1AYOqaG4pH8" resolve="feedbackType" />
                  </node>
                  <node concept="3TrcHB" id="1AYOqaG4rXa" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
                  </node>
                </node>
                <node concept="2OqwBi" id="1AYOqaG4t4v" role="3uHU7w">
                  <node concept="1XH99k" id="1AYOqaG4sqI" role="2Oq$k0">
                    <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
                  </node>
                  <node concept="2ViDtV" id="1AYOqaG4tnc" role="2OqNvi">
                    <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaG4rKu" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaG4vdY" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaG4ve7" role="2MkJ7o">
                  <property role="Xl_RC" value="SUBSCRIPTION feedback must be RESOURCE_ONLY and non-recursive" />
                </node>
                <node concept="1YBJjd" id="1AYOqaG4ver" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaG4pH8" resolve="feedbackType" />
                </node>
                <node concept="3Cnw8n" id="1AYOqaG4$2v" role="1urrFz">
                  <ref role="QpYPw" node="1AYOqaG4veL" resolve="fixFeedbackTypeKindSubscription" />
                  <node concept="3CnSsL" id="1AYOqaG4$eP" role="3Coj4f">
                    <ref role="QkamJ" node="1AYOqaG4vfc" resolve="feedbackType" />
                    <node concept="1YBJjd" id="1AYOqaG4$f0" role="3CoRuB">
                      <ref role="1YBMHb" node="1AYOqaG4pH8" resolve="feedbackType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG4pH8" role="1YuTPh">
      <property role="TrG5h" value="feedbackType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG4veL">
    <property role="TrG5h" value="fixFeedbackTypeKindSubscription" />
    <node concept="Q5ZZ6" id="1AYOqaG4veM" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG4veN" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG4vZc" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG4x6V" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG4w9K" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG4vZb" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG4vfc" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG4wwV" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaG4xq8" role="2OqNvi">
              <node concept="2OqwBi" id="1AYOqaG4xR6" role="tz02z">
                <node concept="1XH99k" id="1AYOqaG4xqJ" role="2Oq$k0">
                  <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
                </node>
                <node concept="2ViDtV" id="1AYOqaG4ytu" role="2OqNvi">
                  <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG4yyQ" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG4zoj" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG4yJ4" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG4yyO" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG4vfc" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG4yWB" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaG4$1k" role="2OqNvi">
              <node concept="3clFbT" id="1AYOqaG4$1V" role="tz02z" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG4vfc" role="Q6Id_">
      <property role="TrG5h" value="feedbackType" />
      <node concept="3Tqbb2" id="1AYOqaG4vhP" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG4vi1" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG4vi2" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG4vpa" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG4vp9" role="3clFbG">
            <property role="Xl_RC" value="Set SubjectScope=RESOURCE_ONLY and Recursive as false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG4$fb">
    <property role="TrG5h" value="checkFeedbackTypeRecursiveForSubjectScopeResourceOnly" />
    <node concept="3clFbS" id="1AYOqaG4$fc" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG4$hY" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaG4_cW" role="3clFbw">
          <node concept="3clFbC" id="1AYOqaG4_qE" role="3uHU7w">
            <node concept="2OqwBi" id="1AYOqaG4A94" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaG4_vJ" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
              </node>
              <node concept="2ViDtV" id="1AYOqaG4AHM" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG4_dW" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaG4_dr" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaG4$fe" resolve="feedbackType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG4_gs" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="1AYOqaG4$sf" role="3uHU7B">
            <node concept="1YBJjd" id="1AYOqaG4$i7" role="2Oq$k0">
              <ref role="1YBMHb" node="1AYOqaG4$fe" resolve="feedbackType" />
            </node>
            <node concept="3TrcHB" id="1AYOqaG4$NX" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:3vc7gP656rh" resolve="recursive" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG4$i0" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaG4ATi" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaG4ATr" role="2MkJ7o">
              <property role="Xl_RC" value="Recursive feedback must allow FEEDBACK subject scopes" />
            </node>
            <node concept="1YBJjd" id="1AYOqaG4AUj" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaG4$fe" resolve="feedbackType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG4$fe" role="1YuTPh">
      <property role="TrG5h" value="feedbackType" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG4AUE">
    <property role="TrG5h" value="checkFeedbackDefinitionResourceOnlyForbidsSubjectFeedback" />
    <node concept="3clFbS" id="1AYOqaG4AUF" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG4AXx" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaG4E0y" role="3clFbw">
          <node concept="3y3z36" id="1AYOqaG4EYJ" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaG4FdL" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaG4Ech" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaG4E1t" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaG4AUH" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG4E_h" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="1AYOqaG4CTq" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaG4C6o" role="3uHU7B">
              <node concept="2OqwBi" id="1AYOqaG4BTa" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaG4AXE" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaG4AUH" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1AYOqaG4BU8" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="3TrcHB" id="1AYOqaG4CuW" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG4DGU" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaG4CYn" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
              </node>
              <node concept="2ViDtV" id="1AYOqaG4DZe" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656rc" resolve="RESOURCE_ONLY" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG4AXz" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaG4Fje" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaG4Fjo" role="2MkJ7o">
              <property role="Xl_RC" value="RESOURCE_ONLY feedback cannot set subjectFeedback" />
            </node>
            <node concept="1YBJjd" id="1AYOqaG4FjF" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaG4AUH" resolve="feedbackDefinition" />
            </node>
            <node concept="3Cnw8n" id="1AYOqaG4GqZ" role="1urrFz">
              <ref role="QpYPw" node="1AYOqaG4Fk1" resolve="fixFeedbackDefinitionSubjectFeedbackWhenResourceOnly" />
              <node concept="3CnSsL" id="1AYOqaG4G$_" role="3Coj4f">
                <ref role="QkamJ" node="1AYOqaG4Fks" resolve="feedbackDefinition" />
                <node concept="1YBJjd" id="1AYOqaG4G$K" role="3CoRuB">
                  <ref role="1YBMHb" node="1AYOqaG4AUH" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG4AUH" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG4Fk1">
    <property role="TrG5h" value="fixFeedbackDefinitionSubjectFeedbackWhenResourceOnly" />
    <node concept="Q5ZZ6" id="1AYOqaG4Fk2" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG4Fk3" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG4FFu" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG4Giq" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG4FRX" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG4FFt" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG4Fks" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG4Gf8" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
              </node>
            </node>
            <node concept="2oxUTD" id="1AYOqaG4Gp4" role="2OqNvi">
              <node concept="10Nm6u" id="1AYOqaG4Gq7" role="2oxUTC" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG4Fks" role="Q6Id_">
      <property role="TrG5h" value="feedbackDefinition" />
      <node concept="3Tqbb2" id="1AYOqaG4Fne" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG4Fns" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG4Fnt" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG4FuC" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG4FuB" role="3clFbG">
            <property role="Xl_RC" value="Remove SubjectFeedback" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG4G$V">
    <property role="TrG5h" value="checkFeedbackDefinitionFeedbackOnlyForbidsSubjectResource" />
    <node concept="3clFbS" id="1AYOqaG4G$W" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG4GBR" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaG4J5Q" role="3clFbw">
          <node concept="3y3z36" id="1AYOqaG4JRj" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaG4K6l" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaG4Jh_" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaG4J6L" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaG4G$Y" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG4JFI" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="1AYOqaG4HEp" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaG4Ha1" role="3uHU7B">
              <node concept="2OqwBi" id="1AYOqaG4GM8" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaG4GC0" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaG4G$Y" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrEf2" id="1AYOqaG4GX7" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                </node>
              </node>
              <node concept="3TrcHB" id="1AYOqaG4HmR" role="2OqNvi">
                <ref role="3TsBF5" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG4Izi" role="3uHU7w">
              <node concept="1XH99k" id="1AYOqaG4HOJ" role="2Oq$k0">
                <ref role="1XH99l" to="2rvu:3vc7gP656rb" resolve="FeedbackSubjectScope" />
              </node>
              <node concept="2ViDtV" id="1AYOqaG4IPA" role="2OqNvi">
                <ref role="2ViDtZ" to="2rvu:3vc7gP656rd" resolve="FEEDBACK_ONLY" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG4GBT" role="3clFbx">
          <node concept="2MkqsV" id="1AYOqaG4KbW" role="3cqZAp">
            <node concept="Xl_RD" id="1AYOqaG4Kc5" role="2MkJ7o">
              <property role="Xl_RC" value="FEEDBACK_ONLY feedback cannot set subjectResource" />
            </node>
            <node concept="1YBJjd" id="1AYOqaG4Kcp" role="1urrMF">
              <ref role="1YBMHb" node="1AYOqaG4G$Y" resolve="feedbackDefinition" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG4G$Y" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG4Kd6">
    <property role="TrG5h" value="fixFeedbackDefinitionSubjectResourceWhenFeedbackOnly" />
    <node concept="Q5ZZ6" id="1AYOqaG4Kd7" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG4Kd8" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG4KBb" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG4LmF" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG4KLJ" role="2Oq$k0">
              <node concept="QwW4i" id="1AYOqaG4KBa" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG4Kdx" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG4L9v" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
              </node>
            </node>
            <node concept="2oxUTD" id="1AYOqaG4LLC" role="2OqNvi">
              <node concept="10Nm6u" id="1AYOqaG4LMO" role="2oxUTC" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG4Kdx" role="Q6Id_">
      <property role="TrG5h" value="feedbackDefinition" />
      <node concept="3Tqbb2" id="1AYOqaG4Kgp" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG4Kgx" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG4Kgy" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG4KnJ" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG4KnI" role="3clFbG">
            <property role="Xl_RC" value="Remove SubjectResource" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG4LNH">
    <property role="TrG5h" value="checkFeedbackDefinitionVerificationPolicy" />
    <node concept="3clFbS" id="1AYOqaG4LNI" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG4LQJ" role="3cqZAp">
        <node concept="3clFbC" id="1AYOqaG4QCt" role="3clFbw">
          <node concept="3clFbT" id="1AYOqaG4QQ6" role="3uHU7w">
            <property role="3clFbU" value="true" />
          </node>
          <node concept="2OqwBi" id="1AYOqaG4M11" role="3uHU7B">
            <node concept="1YBJjd" id="1AYOqaG4LQT" role="2Oq$k0">
              <ref role="1YBMHb" node="1AYOqaG4LNK" resolve="feedbackDefinition" />
            </node>
            <node concept="3TrcHB" id="1AYOqaG4Mo6" role="2OqNvi">
              <ref role="3TsBF5" to="2rvu:3vc7gP656rj" resolve="requiresVerifiedContext" />
            </node>
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG4LQL" role="3clFbx">
          <node concept="3cpWs8" id="1AYOqaG4R9w" role="3cqZAp">
            <node concept="3cpWsn" id="1AYOqaG4R9z" role="3cpWs9">
              <property role="TrG5h" value="hasPolicy" />
              <node concept="10P_77" id="1AYOqaG4R9v" role="1tU5fm" />
              <node concept="3clFbT" id="1AYOqaG4XVy" role="33vP2m" />
            </node>
          </node>
          <node concept="2Gpval" id="1AYOqaG4RdT" role="3cqZAp">
            <node concept="2GrKxI" id="1AYOqaG4RdV" role="2Gsz3X">
              <property role="TrG5h" value="verificationPolicy" />
            </node>
            <node concept="2OqwBi" id="1AYOqaG4Sfn" role="2GsD0m">
              <node concept="2OqwBi" id="1AYOqaG4RpN" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaG4Rfw" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaG4LNK" resolve="feedbackDefinition" />
                </node>
                <node concept="2Xjw5R" id="1AYOqaG4S11" role="2OqNvi">
                  <node concept="1xMEDy" id="1AYOqaG4S13" role="1xVPHs">
                    <node concept="chp4Y" id="1AYOqaG4S3A" role="ri$Ld">
                      <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaG4SRA" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:7vG6G7pFVDH" resolve="verificationPolicy" />
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaG4RdZ" role="2LFqv$">
              <node concept="3clFbJ" id="1AYOqaG4Te2" role="3cqZAp">
                <node concept="3clFbC" id="1AYOqaG4WZK" role="3clFbw">
                  <node concept="1YBJjd" id="1AYOqaG4X8c" role="3uHU7w">
                    <ref role="1YBMHb" node="1AYOqaG4LNK" resolve="feedbackDefinition" />
                  </node>
                  <node concept="2OqwBi" id="1AYOqaG4Toj" role="3uHU7B">
                    <node concept="2GrUjf" id="1AYOqaG4Teb" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="1AYOqaG4RdV" resolve="verificationPolicy" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaG4WfH" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs8" resolve="feedbackDefinition" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbS" id="1AYOqaG4Te4" role="3clFbx">
                  <node concept="3clFbF" id="1AYOqaG4XeN" role="3cqZAp">
                    <node concept="37vLTI" id="1AYOqaG4XRa" role="3clFbG">
                      <node concept="3clFbT" id="1AYOqaG4XRn" role="37vLTx">
                        <property role="3clFbU" value="true" />
                      </node>
                      <node concept="37vLTw" id="1AYOqaG4XeM" role="37vLTJ">
                        <ref role="3cqZAo" node="1AYOqaG4R9z" resolve="hasPolicy" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1AYOqaG4XUu" role="3cqZAp">
            <node concept="3clFbS" id="1AYOqaG4XUw" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaG4Y0P" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaG4Y11" role="2MkJ7o">
                  <property role="Xl_RC" value="FeedbackDefinition requiring verified context must have a VerificationPolicy." />
                </node>
                <node concept="1YBJjd" id="1AYOqaG4Y1l" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaG4LNK" resolve="feedbackDefinition" />
                </node>
                <node concept="3Cnw8n" id="1AYOqaG6gK2" role="1urrFz">
                  <ref role="QpYPw" node="1AYOqaG5Iks" resolve="createVerificationPolicyForFeedbackDefinition" />
                  <node concept="3CnSsL" id="1AYOqaG6gMY" role="3Coj4f">
                    <ref role="QkamJ" node="1AYOqaG5IkR" resolve="feedbackDefinition" />
                    <node concept="1YBJjd" id="1AYOqaG6gN9" role="3CoRuB">
                      <ref role="1YBMHb" node="1AYOqaG4LNK" resolve="feedbackDefinition" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="1AYOqaG4XUL" role="3clFbw">
              <node concept="37vLTw" id="1AYOqaG4XUN" role="3fr31v">
                <ref role="3cqZAo" node="1AYOqaG4R9z" resolve="hasPolicy" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG4LNK" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG5Iks">
    <property role="TrG5h" value="createVerificationPolicyForFeedbackDefinition" />
    <node concept="Q5ZZ6" id="1AYOqaG5Ikt" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG5Iku" role="2VODD2">
        <node concept="3cpWs8" id="1AYOqaG6ePf" role="3cqZAp">
          <node concept="3cpWsn" id="1AYOqaG6ePg" role="3cpWs9">
            <property role="TrG5h" value="verificationPolicy" />
            <node concept="3Tqbb2" id="1AYOqaG6ePe" role="1tU5fm">
              <ref role="ehGHo" to="2rvu:3nWBi3h36US" resolve="VerificationPolicy" />
            </node>
            <node concept="2ShNRf" id="1AYOqaG6eBt" role="33vP2m">
              <node concept="3zrR0B" id="1AYOqaG6eBr" role="2ShVmc">
                <node concept="3Tqbb2" id="1AYOqaG6eBs" role="3zrR0E">
                  <ref role="ehGHo" to="2rvu:3nWBi3h36US" resolve="VerificationPolicy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG5W4M" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaG5Xd7" role="3clFbG">
            <node concept="3cpWs3" id="1AYOqaG5XA_" role="37vLTx">
              <node concept="Xl_RD" id="1AYOqaG5XJ4" role="3uHU7w">
                <property role="Xl_RC" value="Verification" />
              </node>
              <node concept="2OqwBi" id="1AYOqaG5XVO" role="3uHU7B">
                <node concept="QwW4i" id="1AYOqaG5XjH" role="2Oq$k0">
                  <ref role="QwW4h" node="1AYOqaG5IkR" resolve="feedbackDefinition" />
                </node>
                <node concept="3TrcHB" id="1AYOqaG5YaV" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG5Whh" role="37vLTJ">
              <node concept="37vLTw" id="1AYOqaG6f_B" role="2Oq$k0">
                <ref role="3cqZAo" node="1AYOqaG6ePg" resolve="verificationPolicy" />
              </node>
              <node concept="3TrcHB" id="1AYOqaG5WHP" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG5YlB" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaG5Z2$" role="3clFbG">
            <node concept="QwW4i" id="1AYOqaG5ZbG" role="37vLTx">
              <ref role="QwW4h" node="1AYOqaG5IkR" resolve="feedbackDefinition" />
            </node>
            <node concept="2OqwBi" id="1AYOqaG5YX_" role="37vLTJ">
              <node concept="37vLTw" id="1AYOqaG6fEz" role="2Oq$k0">
                <ref role="3cqZAo" node="1AYOqaG6ePg" resolve="verificationPolicy" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG5YZm" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs8" resolve="feedbackDefinition" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG5Zlt" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG63jQ" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG60bV" role="2Oq$k0">
              <node concept="2OqwBi" id="1AYOqaG5Zw1" role="2Oq$k0">
                <node concept="QwW4i" id="1AYOqaG5Zlr" role="2Oq$k0">
                  <ref role="QwW4h" node="1AYOqaG5IkR" resolve="feedbackDefinition" />
                </node>
                <node concept="2Xjw5R" id="1AYOqaG5ZZI" role="2OqNvi">
                  <node concept="1xMEDy" id="1AYOqaG5ZZK" role="1xVPHs">
                    <node concept="chp4Y" id="1AYOqaG600n" role="ri$Ld">
                      <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaG60Fl" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:7vG6G7pFVDH" resolve="verificationPolicy" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaG68O_" role="2OqNvi">
              <node concept="37vLTw" id="1AYOqaG6fWH" role="25WWJ7">
                <ref role="3cqZAo" node="1AYOqaG6ePg" resolve="verificationPolicy" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG5IkR" role="Q6Id_">
      <property role="TrG5h" value="feedbackDefinition" />
      <node concept="3Tqbb2" id="1AYOqaG5IpM" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG5IpW" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG5IpX" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG5Ixd" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG5Ixc" role="3clFbG">
            <property role="Xl_RC" value="Create a VerificationPolicy for this FeedbackDefinition" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG73dv">
    <property role="TrG5h" value="checkFeedbackDefinitionUniqueForUniquePerAuthorTarget" />
    <node concept="3clFbS" id="1AYOqaG73dw" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG73gD" role="3cqZAp">
        <node concept="2OqwBi" id="1AYOqaG73qU" role="3clFbw">
          <node concept="1YBJjd" id="1AYOqaG73gM" role="2Oq$k0">
            <ref role="1YBMHb" node="1AYOqaG73d$" resolve="feedbackDefinition" />
          </node>
          <node concept="3TrcHB" id="1AYOqaG73MC" role="2OqNvi">
            <ref role="3TsBF5" to="2rvu:3vc7gP656rk" resolve="uniquePerAuthorTarget" />
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG73gF" role="3clFbx">
          <node concept="3clFbJ" id="1AYOqaG74tH" role="3cqZAp">
            <node concept="1Wc70l" id="1AYOqaG75j9" role="3clFbw">
              <node concept="3y3z36" id="1AYOqaG75VG" role="3uHU7w">
                <node concept="10Nm6u" id="1AYOqaG762k" role="3uHU7w" />
                <node concept="2OqwBi" id="1AYOqaG75w_" role="3uHU7B">
                  <node concept="1YBJjd" id="1AYOqaG75jU" role="2Oq$k0">
                    <ref role="1YBMHb" node="1AYOqaG73d$" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrEf2" id="1AYOqaG75U8" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                  </node>
                </node>
              </node>
              <node concept="3y3z36" id="1AYOqaG75ch" role="3uHU7B">
                <node concept="2OqwBi" id="1AYOqaG74BY" role="3uHU7B">
                  <node concept="1YBJjd" id="1AYOqaG74tQ" role="2Oq$k0">
                    <ref role="1YBMHb" node="1AYOqaG73d$" resolve="feedbackDefinition" />
                  </node>
                  <node concept="3TrEf2" id="1AYOqaG751b" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                  </node>
                </node>
                <node concept="10Nm6u" id="1AYOqaG75ix" role="3uHU7w" />
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaG74tJ" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaG7689" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaG768i" role="2MkJ7o">
                  <property role="Xl_RC" value="uniquePerAuthorTarget requires a single target to avoid ambiguity" />
                </node>
                <node concept="1YBJjd" id="1AYOqaG768A" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaG73d$" resolve="feedbackDefinition" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG73d$" role="1YuTPh">
      <property role="TrG5h" value="feedbackDefinition" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaG7aTa">
    <property role="TrG5h" value="checkAuthorizarionRuleContextIncludeResourceTarget" />
    <node concept="3clFbS" id="1AYOqaG7aTb" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaG7aXl" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaG7bM7" role="3clFbw">
          <node concept="3y3z36" id="1AYOqaG7ciH" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaG7cr9" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaG7bVp" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaG7bMI" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaG7aTd" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG7c7p" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs$" resolve="resourceTarget" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="1AYOqaG7bF_" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaG7b7A" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaG7aXu" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaG7aTd" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG7buF" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsz" resolve="context" />
              </node>
            </node>
            <node concept="10Nm6u" id="1AYOqaG7bLF" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaG7aXn" role="3clFbx">
          <node concept="3cpWs8" id="1AYOqaG7YV3" role="3cqZAp">
            <node concept="3cpWsn" id="1AYOqaG7YV6" role="3cpWs9">
              <property role="TrG5h" value="included" />
              <node concept="10P_77" id="1AYOqaG7YV2" role="1tU5fm" />
              <node concept="3clFbT" id="1AYOqaG7YVn" role="33vP2m" />
            </node>
          </node>
          <node concept="2Gpval" id="1AYOqaG7YZz" role="3cqZAp">
            <node concept="2GrKxI" id="1AYOqaG7YZ_" role="2Gsz3X">
              <property role="TrG5h" value="link" />
            </node>
            <node concept="2OqwBi" id="1AYOqaG7ZXg" role="2GsD0m">
              <node concept="2OqwBi" id="1AYOqaG7Zao" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaG7Z05" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaG7aTd" resolve="authorizationRule" />
                </node>
                <node concept="3TrEf2" id="1AYOqaG7Z$H" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsz" resolve="context" />
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaG80ph" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaG7YZD" role="2LFqv$">
              <node concept="3clFbJ" id="1AYOqaG80y0" role="3cqZAp">
                <node concept="3clFbC" id="1AYOqaG81Wj" role="3clFbw">
                  <node concept="2OqwBi" id="1AYOqaG82_a" role="3uHU7w">
                    <node concept="1YBJjd" id="1AYOqaG8252" role="2Oq$k0">
                      <ref role="1YBMHb" node="1AYOqaG7aTd" resolve="authorizationRule" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaG82ZK" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs$" resolve="resourceTarget" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="1AYOqaG80Gh" role="3uHU7B">
                    <node concept="2GrUjf" id="1AYOqaG80y9" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="1AYOqaG7YZ_" resolve="link" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaG81_8" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbS" id="1AYOqaG80y2" role="3clFbx">
                  <node concept="3clFbF" id="1AYOqaG835Y" role="3cqZAp">
                    <node concept="37vLTI" id="1AYOqaG83wD" role="3clFbG">
                      <node concept="3clFbT" id="1AYOqaG83wQ" role="37vLTx">
                        <property role="3clFbU" value="true" />
                      </node>
                      <node concept="37vLTw" id="1AYOqaG835X" role="37vLTJ">
                        <ref role="3cqZAo" node="1AYOqaG7YV6" resolve="included" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1AYOqaG83$6" role="3cqZAp">
            <node concept="3clFbS" id="1AYOqaG83$8" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaG83Co" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaG83C_" role="2MkJ7o">
                  <property role="Xl_RC" value="AuthorizationRule resourceTarget must belong to the selected context" />
                </node>
                <node concept="1YBJjd" id="1AYOqaG83CT" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaG7aTd" resolve="authorizationRule" />
                </node>
                <node concept="3Cnw8n" id="1AYOqaG9WiF" role="1urrFz">
                  <ref role="QpYPw" node="1AYOqaG9FRx" resolve="fixAuthorizarionRuleContextIncludeResourceTarget" />
                  <node concept="3CnSsL" id="1AYOqaG9WxE" role="3Coj4f">
                    <ref role="QkamJ" node="1AYOqaG9FRW" resolve="authorizationRule" />
                    <node concept="1YBJjd" id="1AYOqaG9WxP" role="3CoRuB">
                      <ref role="1YBMHb" node="1AYOqaG7aTd" resolve="authorizationRule" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="1AYOqaG8RyP" role="3clFbw">
              <node concept="37vLTw" id="1AYOqaG8RyR" role="3fr31v">
                <ref role="3cqZAo" node="1AYOqaG7YV6" resolve="included" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaG7aTd" role="1YuTPh">
      <property role="TrG5h" value="authorizationRule" />
      <ref role="1YaFvo" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG9Fqd">
    <property role="TrG5h" value="fixIncludeResourceTargetInAuthorizarionRuleContext" />
    <node concept="Q5ZZ6" id="1AYOqaG9Fqe" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG9Fqf" role="2VODD2" />
    </node>
    <node concept="Q6JDH" id="1AYOqaG9FqC" role="Q6Id_">
      <property role="TrG5h" value="authorizationRule" />
      <node concept="3Tqbb2" id="1AYOqaG9FvL" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG9FvX" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG9FvY" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG9FBg" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG9FBf" role="3clFbG">
            <property role="Xl_RC" value="Add" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaG9FRx">
    <property role="TrG5h" value="fixAuthorizarionRuleContextIncludeResourceTarget" />
    <node concept="Q5ZZ6" id="1AYOqaG9FRy" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaG9FRz" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG9KR1" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaG9LAf" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG9LNO" role="37vLTx">
              <node concept="QwW4i" id="1AYOqaG9LD0" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG9FRW" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG9MbH" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs$" resolve="resourceTarget" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaG9L1A" role="37vLTJ">
              <node concept="3OciIN" id="1AYOqaGfXup" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGfXeA" resolve="resourceTypeLink" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG9LoW" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG9Ml5" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaG9Pz$" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaG9Mzt" role="2Oq$k0">
              <node concept="3OciIN" id="1AYOqaGfWZ3" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGfWzp" resolve="contextType" />
              </node>
              <node concept="3Tsc0h" id="1AYOqaG9MVe" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaG9UWv" role="2OqNvi">
              <node concept="3OciIN" id="1AYOqaGfXx7" role="25WWJ7">
                <ref role="3OciIK" node="1AYOqaGfXeA" resolve="resourceTypeLink" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGbC8w" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGbDu2" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGbCja" role="2Oq$k0">
              <node concept="3OciIN" id="1AYOqaGfX54" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGfWzp" resolve="contextType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaGbCNS" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaGbEjn" role="2OqNvi">
              <node concept="3cpWs3" id="1AYOqaGe22l" role="tz02z">
                <node concept="2OqwBi" id="1AYOqaGe39q" role="3uHU7w">
                  <node concept="2OqwBi" id="1AYOqaGe2nE" role="2Oq$k0">
                    <node concept="QwW4i" id="1AYOqaGe28Q" role="2Oq$k0">
                      <ref role="QwW4h" node="1AYOqaG9FRW" resolve="authorizationRule" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGe2Vn" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zs$" resolve="resourceTarget" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="1AYOqaGe3CW" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
                <node concept="Xl_RD" id="1AYOqaGe0Oh" role="3uHU7B">
                  <property role="Xl_RC" value="AuthorizationContext_" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGcy8V" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGcA3F" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGcyX_" role="2Oq$k0">
              <node concept="2OqwBi" id="1AYOqaGcylw" role="2Oq$k0">
                <node concept="QwW4i" id="1AYOqaGcy8T" role="2Oq$k0">
                  <ref role="QwW4h" node="1AYOqaG9FRW" resolve="authorizationRule" />
                </node>
                <node concept="2Xjw5R" id="1AYOqaGcyLk" role="2OqNvi">
                  <node concept="1xMEDy" id="1AYOqaGcyLm" role="1xVPHs">
                    <node concept="chp4Y" id="1AYOqaGcyLZ" role="ri$Ld">
                      <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaGczr8" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:3nWBi3h36Va" resolve="contextType" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaGcF2w" role="2OqNvi">
              <node concept="3OciIN" id="1AYOqaGfX5X" role="25WWJ7">
                <ref role="3OciIK" node="1AYOqaGfWzp" resolve="contextType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaG9Vbx" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaG9W94" role="3clFbG">
            <node concept="3OciIN" id="1AYOqaGfXbZ" role="37vLTx">
              <ref role="3OciIK" node="1AYOqaGfWzp" resolve="contextType" />
            </node>
            <node concept="2OqwBi" id="1AYOqaG9Vo5" role="37vLTJ">
              <node concept="QwW4i" id="1AYOqaG9Vbv" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaG9FRW" resolve="authorizationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaG9VMZ" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsz" resolve="context" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaG9FRW" role="Q6Id_">
      <property role="TrG5h" value="authorizationRule" />
      <node concept="3Tqbb2" id="1AYOqaG9FXa" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaG9FXo" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaG9FXp" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaG9G4G" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaG9G4F" role="3clFbG">
            <property role="Xl_RC" value="Add ContextType with required ResourceType" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Oc7vg" id="1AYOqaGfWzp" role="3OczkL">
      <property role="TrG5h" value="contextType" />
      <node concept="3Tqbb2" id="1AYOqaGfWBU" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Ur" resolve="ContextType" />
      </node>
    </node>
    <node concept="3Oc7vg" id="1AYOqaGfXeA" role="3OczkL">
      <property role="TrG5h" value="resourceTypeLink" />
      <node concept="3Tqbb2" id="1AYOqaGfXka" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaGfLxr">
    <property role="TrG5h" value="checkModerationPolicyInContextShouldIncludeMonitorResource" />
    <node concept="3clFbS" id="1AYOqaGfLxs" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaGfL$J" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaGfM$l" role="3clFbw">
          <node concept="3y3z36" id="1AYOqaGfNme" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaGfNsG" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaGfMJv" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaGfM$W" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaGfLxu" resolve="moderationPolicy" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGfN8U" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsq" resolve="monitorsResource" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="1AYOqaGfMtN" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaGfLJ0" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaGfL$S" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaGfLxu" resolve="moderationPolicy" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGfM6B" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsr" resolve="inContext" />
              </node>
            </node>
            <node concept="10Nm6u" id="1AYOqaGfMzT" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaGfL$L" role="3clFbx">
          <node concept="3cpWs8" id="1AYOqaGfQEk" role="3cqZAp">
            <node concept="3cpWsn" id="1AYOqaGfQEn" role="3cpWs9">
              <property role="TrG5h" value="included" />
              <node concept="10P_77" id="1AYOqaGfQEi" role="1tU5fm" />
              <node concept="3clFbT" id="1AYOqaGfQEC" role="33vP2m" />
            </node>
          </node>
          <node concept="2Gpval" id="1AYOqaGfOYE" role="3cqZAp">
            <node concept="2GrKxI" id="1AYOqaGfOYF" role="2Gsz3X">
              <property role="TrG5h" value="contextType" />
            </node>
            <node concept="2OqwBi" id="1AYOqaGfPZ2" role="2GsD0m">
              <node concept="2OqwBi" id="1AYOqaGfPcN" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaGfP2w" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaGfLxu" resolve="moderationPolicy" />
                </node>
                <node concept="3TrEf2" id="1AYOqaGfPH1" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsr" resolve="inContext" />
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaGfQt1" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaGfOYH" role="2LFqv$">
              <node concept="3clFbJ" id="1AYOqaGfQ$T" role="3cqZAp">
                <node concept="3clFbC" id="1AYOqaGfSCQ" role="3clFbw">
                  <node concept="2OqwBi" id="1AYOqaGfQOU" role="3uHU7B">
                    <node concept="2GrUjf" id="1AYOqaGfQEM" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="1AYOqaGfOYF" resolve="contextType" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGfRe6" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="1AYOqaGfScg" role="3uHU7w">
                    <node concept="1YBJjd" id="1AYOqaGfRG8" role="2Oq$k0">
                      <ref role="1YBMHb" node="1AYOqaGfLxu" resolve="moderationPolicy" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGfS_D" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsq" resolve="monitorsResource" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbS" id="1AYOqaGfQ$V" role="3clFbx">
                  <node concept="3clFbF" id="1AYOqaGfSVV" role="3cqZAp">
                    <node concept="37vLTI" id="1AYOqaGfTmA" role="3clFbG">
                      <node concept="3clFbT" id="1AYOqaGfTmN" role="37vLTx">
                        <property role="3clFbU" value="true" />
                      </node>
                      <node concept="37vLTw" id="1AYOqaGfSVU" role="37vLTJ">
                        <ref role="3cqZAo" node="1AYOqaGfQEn" resolve="included" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1AYOqaGfTqc" role="3cqZAp">
            <node concept="3clFbS" id="1AYOqaGfTqe" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaGfTuE" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaGfTuQ" role="2MkJ7o">
                  <property role="Xl_RC" value="ModerationPolicy monitorsResource must belong to the selected context" />
                </node>
                <node concept="1YBJjd" id="1AYOqaGfTv9" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaGfLxu" resolve="moderationPolicy" />
                </node>
                <node concept="3Cnw8n" id="1AYOqaGglAN" role="1urrFz">
                  <ref role="QpYPw" node="1AYOqaGfUhc" resolve="fixModerationPolicyInContextIncludeMonitorsResource" />
                  <node concept="3CnSsL" id="1AYOqaGglPM" role="3Coj4f">
                    <ref role="QkamJ" node="1AYOqaGfUhB" resolve="moderationPolicy" />
                    <node concept="1YBJjd" id="1AYOqaGglPX" role="3CoRuB">
                      <ref role="1YBMHb" node="1AYOqaGfLxu" resolve="moderationPolicy" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="1AYOqaGfTvy" role="3clFbw">
              <node concept="37vLTw" id="1AYOqaGfTv$" role="3fr31v">
                <ref role="3cqZAo" node="1AYOqaGfQEn" resolve="included" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaGfLxu" role="1YuTPh">
      <property role="TrG5h" value="moderationPolicy" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ut" resolve="ModerationPolicy" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaGfUhc">
    <property role="TrG5h" value="fixModerationPolicyInContextIncludeMonitorsResource" />
    <node concept="3Oc7vg" id="1AYOqaGfX_7" role="3OczkL">
      <property role="TrG5h" value="contextType" />
      <node concept="3Tqbb2" id="1AYOqaGfXEy" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Ur" resolve="ContextType" />
      </node>
    </node>
    <node concept="3Oc7vg" id="1AYOqaGfXEM" role="3OczkL">
      <property role="TrG5h" value="resourceTypeLink" />
      <node concept="3Tqbb2" id="1AYOqaGfXMr" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
      </node>
    </node>
    <node concept="Q5ZZ6" id="1AYOqaGfUhd" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaGfUhe" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaGfXT0" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGfY7s" role="3clFbG">
            <node concept="2ShNRf" id="1AYOqaGfYa3" role="37vLTx">
              <node concept="3zrR0B" id="1AYOqaGfY86" role="2ShVmc">
                <node concept="3Tqbb2" id="1AYOqaGfY87" role="3zrR0E">
                  <ref role="ehGHo" to="2rvu:3nWBi3h36Ur" resolve="ContextType" />
                </node>
              </node>
            </node>
            <node concept="3OciIN" id="1AYOqaGfXSZ" role="37vLTJ">
              <ref role="3OciIK" node="1AYOqaGfX_7" resolve="contextType" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGfYkt" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGfYv3" role="3clFbG">
            <node concept="2ShNRf" id="1AYOqaGfYxE" role="37vLTx">
              <node concept="3zrR0B" id="1AYOqaGfYvH" role="2ShVmc">
                <node concept="3Tqbb2" id="1AYOqaGfYvI" role="3zrR0E">
                  <ref role="ehGHo" to="2rvu:5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
                </node>
              </node>
            </node>
            <node concept="3OciIN" id="1AYOqaGfYkr" role="37vLTJ">
              <ref role="3OciIK" node="1AYOqaGfXEM" resolve="resourceTypeLink" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGfYAX" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGfZe9" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGfZvG" role="37vLTx">
              <node concept="QwW4i" id="1AYOqaGfZj1" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaGfUhB" resolve="moderationPolicy" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGfZS9" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsq" resolve="monitorsResource" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaGfYDy" role="37vLTJ">
              <node concept="3OciIN" id="1AYOqaGfYAV" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGfXEM" resolve="resourceTypeLink" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGfZ0V" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGg02y" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGg3fk" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGg0f1" role="2Oq$k0">
              <node concept="3OciIN" id="1AYOqaGg02w" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGfX_7" resolve="contextType" />
              </node>
              <node concept="3Tsc0h" id="1AYOqaGg0AZ" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaGg7Ky" role="2OqNvi">
              <node concept="3OciIN" id="1AYOqaGg7OB" role="25WWJ7">
                <ref role="3OciIK" node="1AYOqaGfXEM" resolve="resourceTypeLink" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGg8f6" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGg9mv" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGg8rD" role="2Oq$k0">
              <node concept="3OciIN" id="1AYOqaGg8f4" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGfX_7" resolve="contextType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaGg8Rf" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaGgamj" role="2OqNvi">
              <node concept="3cpWs3" id="1AYOqaGgaqd" role="tz02z">
                <node concept="2OqwBi" id="1AYOqaGgbi0" role="3uHU7w">
                  <node concept="2OqwBi" id="1AYOqaGgaF5" role="2Oq$k0">
                    <node concept="QwW4i" id="1AYOqaGgaqS" role="2Oq$k0">
                      <ref role="QwW4h" node="1AYOqaGfUhB" resolve="moderationPolicy" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGgb7W" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsq" resolve="monitorsResource" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="1AYOqaGgbxp" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
                <node concept="Xl_RD" id="1AYOqaGgamU" role="3uHU7B">
                  <property role="Xl_RC" value="ModerationContext_" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGgbGZ" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGgfjF" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGgc6B" role="2Oq$k0">
              <node concept="2OqwBi" id="1AYOqaGgbJ_" role="2Oq$k0">
                <node concept="QwW4i" id="1AYOqaGgbGX" role="2Oq$k0">
                  <ref role="QwW4h" node="1AYOqaGfUhB" resolve="moderationPolicy" />
                </node>
                <node concept="2Xjw5R" id="1AYOqaGgbUk" role="2OqNvi">
                  <node concept="1xMEDy" id="1AYOqaGgbUm" role="1xVPHs">
                    <node concept="chp4Y" id="1AYOqaGgbUX" role="ri$Ld">
                      <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaGgcFa" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:3nWBi3h36Va" resolve="contextType" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaGgjWw" role="2OqNvi">
              <node concept="3OciIN" id="1AYOqaGgk23" role="25WWJ7">
                <ref role="3OciIK" node="1AYOqaGfX_7" resolve="contextType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGgkbQ" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGglj0" role="3clFbG">
            <node concept="3OciIN" id="1AYOqaGgl$g" role="37vLTx">
              <ref role="3OciIK" node="1AYOqaGfX_7" resolve="contextType" />
            </node>
            <node concept="2OqwBi" id="1AYOqaGgkmG" role="37vLTJ">
              <node concept="QwW4i" id="1AYOqaGgkbO" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaGfUhB" resolve="moderationPolicy" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGgl7K" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsr" resolve="inContext" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaGfUhB" role="Q6Id_">
      <property role="TrG5h" value="moderationPolicy" />
      <node concept="3Tqbb2" id="1AYOqaGfUmZ" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Ut" resolve="ModerationPolicy" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaGfUn9" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaGfUna" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaGfUBh" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaGfUBg" role="3clFbG">
            <property role="Xl_RC" value="Add ContextType with required ResourceType for ModerationPolicy" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1AYOqaGhfnE">
    <property role="TrG5h" value="checkAutomationRuleInContextShouldIncludeContext" />
    <node concept="3clFbS" id="1AYOqaGhfnF" role="18ibNy">
      <node concept="3clFbJ" id="1AYOqaGhfr8" role="3cqZAp">
        <node concept="1Wc70l" id="1AYOqaGhgkt" role="3clFbw">
          <node concept="3y3z36" id="1AYOqaGhgXf" role="3uHU7w">
            <node concept="10Nm6u" id="1AYOqaGhh5X" role="3uHU7w" />
            <node concept="2OqwBi" id="1AYOqaGhgtF" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaGhgnb" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaGhfnH" resolve="automationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGhgJO" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zss" resolve="context" />
              </node>
            </node>
          </node>
          <node concept="3y3z36" id="1AYOqaGhg9F" role="3uHU7B">
            <node concept="2OqwBi" id="1AYOqaGhf_q" role="3uHU7B">
              <node concept="1YBJjd" id="1AYOqaGhfrh" role="2Oq$k0">
                <ref role="1YBMHb" node="1AYOqaGhfnH" resolve="automationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGhfWv" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsu" resolve="inContext" />
              </node>
            </node>
            <node concept="10Nm6u" id="1AYOqaGhghS" role="3uHU7w" />
          </node>
        </node>
        <node concept="3clFbS" id="1AYOqaGhfra" role="3clFbx">
          <node concept="3cpWs8" id="1AYOqaGhhfi" role="3cqZAp">
            <node concept="3cpWsn" id="1AYOqaGhhfl" role="3cpWs9">
              <property role="TrG5h" value="include" />
              <node concept="10P_77" id="1AYOqaGhhfh" role="1tU5fm" />
              <node concept="3clFbT" id="1AYOqaGhhfA" role="33vP2m" />
            </node>
          </node>
          <node concept="2Gpval" id="1AYOqaGhhk5" role="3cqZAp">
            <node concept="2GrKxI" id="1AYOqaGhhk7" role="2Gsz3X">
              <property role="TrG5h" value="contextType" />
            </node>
            <node concept="2OqwBi" id="1AYOqaGhhH3" role="2GsD0m">
              <node concept="2OqwBi" id="1AYOqaGhhpx" role="2Oq$k0">
                <node concept="1YBJjd" id="1AYOqaGhhlo" role="2Oq$k0">
                  <ref role="1YBMHb" node="1AYOqaGhfnH" resolve="automationRule" />
                </node>
                <node concept="3TrEf2" id="1AYOqaGhhtL" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsu" resolve="inContext" />
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaGhhWD" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
              </node>
            </node>
            <node concept="3clFbS" id="1AYOqaGhhkb" role="2LFqv$">
              <node concept="3clFbJ" id="1AYOqaGhh$8" role="3cqZAp">
                <node concept="3clFbC" id="1AYOqaGhjzC" role="3clFbw">
                  <node concept="2OqwBi" id="1AYOqaGhkgl" role="3uHU7w">
                    <node concept="1YBJjd" id="1AYOqaGhjOk" role="2Oq$k0">
                      <ref role="1YBMHb" node="1AYOqaGhfnH" resolve="automationRule" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGhkJa" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zss" resolve="context" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="1AYOqaGhidB" role="3uHU7B">
                    <node concept="2GrUjf" id="1AYOqaGhi3v" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="1AYOqaGhhk7" resolve="contextType" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGhjaq" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbS" id="1AYOqaGhh$a" role="3clFbx">
                  <node concept="3clFbF" id="1AYOqaGhl1i" role="3cqZAp">
                    <node concept="37vLTI" id="1AYOqaGhlQb" role="3clFbG">
                      <node concept="37vLTw" id="1AYOqaGhl1h" role="37vLTJ">
                        <ref role="3cqZAo" node="1AYOqaGhhfl" resolve="include" />
                      </node>
                      <node concept="3clFbT" id="1AYOqaGhlDo" role="37vLTx">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1AYOqaGhlNE" role="3cqZAp">
            <node concept="3clFbS" id="1AYOqaGhlNG" role="3clFbx">
              <node concept="2MkqsV" id="1AYOqaGhlWk" role="3cqZAp">
                <node concept="Xl_RD" id="1AYOqaGhlWw" role="2MkJ7o">
                  <property role="Xl_RC" value="AutomationRule context resource must belong to the selected context" />
                </node>
                <node concept="1YBJjd" id="1AYOqaGhlWO" role="1urrMF">
                  <ref role="1YBMHb" node="1AYOqaGhfnH" resolve="automationRule" />
                </node>
                <node concept="3Cnw8n" id="1AYOqaGhQrK" role="1urrFz">
                  <ref role="QpYPw" node="1AYOqaGhn90" resolve="fixAutomationRuleInContextIncludeContext" />
                  <node concept="3CnSsL" id="1AYOqaGhQEJ" role="3Coj4f">
                    <ref role="QkamJ" node="1AYOqaGhnbn" resolve="automationRule" />
                    <node concept="1YBJjd" id="1AYOqaGhQEU" role="3CoRuB">
                      <ref role="1YBMHb" node="1AYOqaGhfnH" resolve="automationRule" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="1AYOqaGhlQw" role="3clFbw">
              <node concept="37vLTw" id="1AYOqaGhlQI" role="3fr31v">
                <ref role="3cqZAo" node="1AYOqaGhhfl" resolve="include" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1AYOqaGhfnH" role="1YuTPh">
      <property role="TrG5h" value="automationRule" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36UP" resolve="AutomationRule" />
    </node>
  </node>
  <node concept="Q5z_Y" id="1AYOqaGhn90">
    <property role="TrG5h" value="fixAutomationRuleInContextIncludeContext" />
    <node concept="Q5ZZ6" id="1AYOqaGhn91" role="Q6x$H">
      <node concept="3clFbS" id="1AYOqaGhn92" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaGhq8V" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGhqnn" role="3clFbG">
            <node concept="2ShNRf" id="1AYOqaGhqpY" role="37vLTx">
              <node concept="3zrR0B" id="1AYOqaGhqo1" role="2ShVmc">
                <node concept="3Tqbb2" id="1AYOqaGhqo2" role="3zrR0E">
                  <ref role="ehGHo" to="2rvu:3nWBi3h36Ur" resolve="ContextType" />
                </node>
              </node>
            </node>
            <node concept="3OciIN" id="1AYOqaGhq8U" role="37vLTJ">
              <ref role="3OciIK" node="1AYOqaGhpSW" resolve="contextType" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGhqBF" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGhqOc" role="3clFbG">
            <node concept="2ShNRf" id="1AYOqaGhqQN" role="37vLTx">
              <node concept="3zrR0B" id="1AYOqaGhqOQ" role="2ShVmc">
                <node concept="3Tqbb2" id="1AYOqaGhqOR" role="3zrR0E">
                  <ref role="ehGHo" to="2rvu:5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
                </node>
              </node>
            </node>
            <node concept="3OciIN" id="1AYOqaGhqBD" role="37vLTJ">
              <ref role="3OciIK" node="1AYOqaGhpYJ" resolve="resourceTypeLink" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGhqYq" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGhrzF" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGhrNy" role="37vLTx">
              <node concept="QwW4i" id="1AYOqaGhrCJ" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaGhnbn" resolve="automationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGhsag" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zss" resolve="context" />
              </node>
            </node>
            <node concept="2OqwBi" id="1AYOqaGhqZ4" role="37vLTJ">
              <node concept="3OciIN" id="1AYOqaGhqYo" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGhpYJ" resolve="resourceTypeLink" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGhrmt" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGhsjH" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGhvwv" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGhswc" role="2Oq$k0">
              <node concept="3OciIN" id="1AYOqaGhsjF" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGhpSW" resolve="contextType" />
              </node>
              <node concept="3Tsc0h" id="1AYOqaGhsSa" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaGhANs" role="2OqNvi">
              <node concept="3OciIN" id="1AYOqaGhARx" role="25WWJ7">
                <ref role="3OciIK" node="1AYOqaGhpYJ" resolve="resourceTypeLink" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGhB0G" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGhBZR" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGhBbk" role="2Oq$k0">
              <node concept="3OciIN" id="1AYOqaGhB0E" role="2Oq$k0">
                <ref role="3OciIK" node="1AYOqaGhpSW" resolve="contextType" />
              </node>
              <node concept="3TrcHB" id="1AYOqaGhBwB" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
            <node concept="tyxLq" id="1AYOqaGhCuk" role="2OqNvi">
              <node concept="3cpWs3" id="1AYOqaGhDGV" role="tz02z">
                <node concept="2OqwBi" id="1AYOqaGhEBX" role="3uHU7w">
                  <node concept="2OqwBi" id="1AYOqaGhE2c" role="2Oq$k0">
                    <node concept="QwW4i" id="1AYOqaGhDNq" role="2Oq$k0">
                      <ref role="QwW4h" node="1AYOqaGhnbn" resolve="automationRule" />
                    </node>
                    <node concept="3TrEf2" id="1AYOqaGhEtT" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zss" resolve="context" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="1AYOqaGhEVI" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
                <node concept="Xl_RD" id="1AYOqaGhCuV" role="3uHU7B">
                  <property role="Xl_RC" value="AutomationContext_" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGhFfS" role="3cqZAp">
          <node concept="2OqwBi" id="1AYOqaGhJzV" role="3clFbG">
            <node concept="2OqwBi" id="1AYOqaGhG5S" role="2Oq$k0">
              <node concept="2OqwBi" id="1AYOqaGhFsr" role="2Oq$k0">
                <node concept="QwW4i" id="1AYOqaGhFfQ" role="2Oq$k0">
                  <ref role="QwW4h" node="1AYOqaGhnbn" resolve="automationRule" />
                </node>
                <node concept="2Xjw5R" id="1AYOqaGhFTF" role="2OqNvi">
                  <node concept="1xMEDy" id="1AYOqaGhFTH" role="1xVPHs">
                    <node concept="chp4Y" id="1AYOqaGhFUk" role="ri$Ld">
                      <ref role="cht4Q" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3Tsc0h" id="1AYOqaGhGxV" role="2OqNvi">
                <ref role="3TtcxE" to="2rvu:3nWBi3h36Va" resolve="contextType" />
              </node>
            </node>
            <node concept="TSZUe" id="1AYOqaGhOK_" role="2OqNvi">
              <node concept="3OciIN" id="1AYOqaGhOQ8" role="25WWJ7">
                <ref role="3OciIK" node="1AYOqaGhpSW" resolve="contextType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1AYOqaGhP5E" role="3cqZAp">
          <node concept="37vLTI" id="1AYOqaGhPZr" role="3clFbG">
            <node concept="3OciIN" id="1AYOqaGhQpd" role="37vLTx">
              <ref role="3OciIK" node="1AYOqaGhpSW" resolve="contextType" />
            </node>
            <node concept="2OqwBi" id="1AYOqaGhPir" role="37vLTJ">
              <node concept="QwW4i" id="1AYOqaGhP5C" role="2Oq$k0">
                <ref role="QwW4h" node="1AYOqaGhnbn" resolve="automationRule" />
              </node>
              <node concept="3TrEf2" id="1AYOqaGhPOb" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsu" resolve="inContext" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="1AYOqaGhnbn" role="Q6Id_">
      <property role="TrG5h" value="automationRule" />
      <node concept="3Tqbb2" id="1AYOqaGhngT" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UP" resolve="AutomationRule" />
      </node>
    </node>
    <node concept="QznSV" id="1AYOqaGhnh1" role="QzAvj">
      <node concept="3clFbS" id="1AYOqaGhnh2" role="2VODD2">
        <node concept="3clFbF" id="1AYOqaGhnop" role="3cqZAp">
          <node concept="Xl_RD" id="1AYOqaGhnoo" role="3clFbG">
            <property role="Xl_RC" value="Add ContextType with required Context" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Oc7vg" id="1AYOqaGhpSW" role="3OczkL">
      <property role="TrG5h" value="contextType" />
      <node concept="3Tqbb2" id="1AYOqaGhpYx" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:3nWBi3h36Ur" resolve="ContextType" />
      </node>
    </node>
    <node concept="3Oc7vg" id="1AYOqaGhpYJ" role="3OczkL">
      <property role="TrG5h" value="resourceTypeLink" />
      <node concept="3Tqbb2" id="1AYOqaGhq28" role="3Oc7vh">
        <ref role="ehGHo" to="2rvu:5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
      </node>
    </node>
  </node>
  <node concept="Q5z_Y" id="583Ws_2Q5RD">
    <property role="TrG5h" value="fixFeedbackDefinitionRatingPolicyWithHasRatingTrue" />
    <node concept="Q5ZZ6" id="583Ws_2Q5RE" role="Q6x$H">
      <node concept="3clFbS" id="583Ws_2Q5RF" role="2VODD2">
        <node concept="3cpWs8" id="1rkHUYSVTBa" role="3cqZAp">
          <node concept="3cpWsn" id="1rkHUYSVTBd" role="3cpWs9">
            <property role="TrG5h" value="rating" />
            <node concept="3Tqbb2" id="1rkHUYSVTB8" role="1tU5fm">
              <ref role="ehGHo" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
            </node>
            <node concept="2ShNRf" id="1rkHUYSVTEi" role="33vP2m">
              <node concept="3zrR0B" id="1rkHUYSVTEg" role="2ShVmc">
                <node concept="3Tqbb2" id="1rkHUYSVTEh" role="3zrR0E">
                  <ref role="ehGHo" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1rkHUYSVTL5" role="3cqZAp">
          <node concept="37vLTI" id="1rkHUYSVUGO" role="3clFbG">
            <node concept="37vLTw" id="1rkHUYSVUJB" role="37vLTx">
              <ref role="3cqZAo" node="1rkHUYSVTBd" resolve="rating" />
            </node>
            <node concept="2OqwBi" id="1rkHUYSVTX_" role="37vLTJ">
              <node concept="QwW4i" id="1rkHUYSVTL3" role="2Oq$k0">
                <ref role="QwW4h" node="583Ws_2Q5S4" resolve="feedbackDefinition" />
              </node>
              <node concept="3TrEf2" id="1rkHUYSVUkL" role="2OqNvi">
                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="Q6JDH" id="583Ws_2Q5S4" role="Q6Id_">
      <property role="TrG5h" value="feedbackDefinition" />
      <node concept="3Tqbb2" id="583Ws_2Q5Xx" role="Q6QK4">
        <ref role="ehGHo" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      </node>
    </node>
    <node concept="QznSV" id="583Ws_2Q5XH" role="QzAvj">
      <node concept="3clFbS" id="583Ws_2Q5XI" role="2VODD2">
        <node concept="3clFbF" id="583Ws_2Q6cB" role="3cqZAp">
          <node concept="Xl_RD" id="583Ws_2Q6cA" role="3clFbG">
            <property role="Xl_RC" value="Add RatingPolicy" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="18kY7G" id="1rkHUYSE9NX">
    <property role="TrG5h" value="checkSortingPolicyDateCriterionRequiresResourceTypeWithDataAttribute" />
    <node concept="3clFbS" id="1rkHUYSE9NY" role="18ibNy">
      <node concept="2Gpval" id="1rkHUYSEqyn" role="3cqZAp">
        <node concept="2GrKxI" id="1rkHUYSEqyo" role="2Gsz3X">
          <property role="TrG5h" value="sortingPolicy" />
        </node>
        <node concept="2OqwBi" id="1rkHUYSEqI$" role="2GsD0m">
          <node concept="1YBJjd" id="1rkHUYSEq$h" role="2Oq$k0">
            <ref role="1YBMHb" node="1rkHUYSE9O0" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="1rkHUYSEr5C" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:47EFX_njBjf" resolve="sortingPolicy" />
          </node>
        </node>
        <node concept="3clFbS" id="1rkHUYSEqyq" role="2LFqv$">
          <node concept="3clFbJ" id="1rkHUYSErcU" role="3cqZAp">
            <node concept="3clFbC" id="1rkHUYSEs_v" role="3clFbw">
              <node concept="2OqwBi" id="1rkHUYSErnb" role="3uHU7B">
                <node concept="2GrUjf" id="1rkHUYSErd3" role="2Oq$k0">
                  <ref role="2Gs0qQ" node="1rkHUYSEqyo" resolve="sortingPolicy" />
                </node>
                <node concept="3TrcHB" id="1rkHUYSEsgh" role="2OqNvi">
                  <ref role="3TsBF5" to="2rvu:47EFX_kWWLa" resolve="criterion" />
                </node>
              </node>
              <node concept="2OqwBi" id="1rkHUYSEtJY" role="3uHU7w">
                <node concept="1XH99k" id="1rkHUYSEsXL" role="2Oq$k0">
                  <ref role="1XH99l" to="2rvu:47EFX_kWWL3" resolve="SortCriterion" />
                </node>
                <node concept="2ViDtV" id="1rkHUYSEucq" role="2OqNvi">
                  <ref role="2ViDtZ" to="2rvu:47EFX_kWWL4" resolve="DATE" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1rkHUYSErcW" role="3clFbx">
              <node concept="3clFbJ" id="1rkHUYSEuls" role="3cqZAp">
                <node concept="3clFbC" id="1rkHUYSEw7p" role="3clFbw">
                  <node concept="10Nm6u" id="1rkHUYSEwfR" role="3uHU7w" />
                  <node concept="2OqwBi" id="1rkHUYSEuvH" role="3uHU7B">
                    <node concept="2GrUjf" id="1rkHUYSEul_" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="1rkHUYSEqyo" resolve="sortingPolicy" />
                    </node>
                    <node concept="3TrEf2" id="1rkHUYSEvvA" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:47EFX_kWWLw" resolve="appliesToResource" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbS" id="1rkHUYSEulu" role="3clFbx">
                  <node concept="2MkqsV" id="1rkHUYSEwkM" role="3cqZAp">
                    <node concept="Xl_RD" id="1rkHUYSEwkV" role="2MkJ7o">
                      <property role="Xl_RC" value="SortingPolicy with criterion=DATE must define appliesToResource" />
                    </node>
                    <node concept="2GrUjf" id="1rkHUYSEwlf" role="1urrMF">
                      <ref role="2Gs0qQ" node="1rkHUYSEqyo" resolve="sortingPolicy" />
                    </node>
                  </node>
                </node>
                <node concept="9aQIb" id="1rkHUYSEwlA" role="9aQIa">
                  <node concept="3clFbS" id="1rkHUYSEwlB" role="9aQI4">
                    <node concept="3cpWs8" id="1rkHUYSMfWc" role="3cqZAp">
                      <node concept="3cpWsn" id="1rkHUYSMfWf" role="3cpWs9">
                        <property role="TrG5h" value="hasDate" />
                        <node concept="10P_77" id="1rkHUYSMfWb" role="1tU5fm" />
                        <node concept="3clFbT" id="1rkHUYSMfZq" role="33vP2m" />
                      </node>
                    </node>
                    <node concept="2Gpval" id="1rkHUYSMgfh" role="3cqZAp">
                      <node concept="2GrKxI" id="1rkHUYSMgfj" role="2Gsz3X">
                        <property role="TrG5h" value="attr" />
                      </node>
                      <node concept="2OqwBi" id="1rkHUYSMku2" role="2GsD0m">
                        <node concept="2OqwBi" id="1rkHUYSMgsX" role="2Oq$k0">
                          <node concept="2GrUjf" id="1rkHUYSMgiE" role="2Oq$k0">
                            <ref role="2Gs0qQ" node="1rkHUYSEqyo" resolve="sortingPolicy" />
                          </node>
                          <node concept="3TrEf2" id="1rkHUYSMhtr" role="2OqNvi">
                            <ref role="3Tt5mk" to="2rvu:47EFX_kWWLw" resolve="appliesToResource" />
                          </node>
                        </node>
                        <node concept="3Tsc0h" id="1rkHUYSMl4N" role="2OqNvi">
                          <ref role="3TtcxE" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
                        </node>
                      </node>
                      <node concept="3clFbS" id="1rkHUYSMgfn" role="2LFqv$">
                        <node concept="3clFbJ" id="1rkHUYSMiFX" role="3cqZAp">
                          <node concept="22lmx$" id="1rkHUYSMotF" role="3clFbw">
                            <node concept="3clFbC" id="1rkHUYSMqGP" role="3uHU7w">
                              <node concept="2OqwBi" id="1rkHUYSMrWm" role="3uHU7w">
                                <node concept="1XH99k" id="1rkHUYSMr3q" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="1rkHUYSMsBm" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="1rkHUYSMp3_" role="3uHU7B">
                                <node concept="2GrUjf" id="1rkHUYSMoO1" role="2Oq$k0">
                                  <ref role="2Gs0qQ" node="1rkHUYSMgfj" resolve="attr" />
                                </node>
                                <node concept="3TrcHB" id="1rkHUYSMqd2" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="1rkHUYSMmpv" role="3uHU7B">
                              <node concept="2OqwBi" id="1rkHUYSMlqW" role="3uHU7B">
                                <node concept="2GrUjf" id="1rkHUYSMiG6" role="2Oq$k0">
                                  <ref role="2Gs0qQ" node="1rkHUYSMgfj" resolve="attr" />
                                </node>
                                <node concept="3TrcHB" id="1rkHUYSMlTJ" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="1rkHUYSMnBs" role="3uHU7w">
                                <node concept="1XH99k" id="1rkHUYSMmJw" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="1rkHUYSMog9" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbS" id="1rkHUYSMiFZ" role="3clFbx">
                            <node concept="3clFbF" id="1rkHUYSMt2w" role="3cqZAp">
                              <node concept="37vLTI" id="1rkHUYSMttb" role="3clFbG">
                                <node concept="3clFbT" id="1rkHUYSMtto" role="37vLTx">
                                  <property role="3clFbU" value="true" />
                                </node>
                                <node concept="37vLTw" id="1rkHUYSMt2v" role="37vLTJ">
                                  <ref role="3cqZAo" node="1rkHUYSMfWf" resolve="hasDate" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbJ" id="1rkHUYSMtRy" role="3cqZAp">
                      <node concept="3clFbS" id="1rkHUYSMtR$" role="3clFbx">
                        <node concept="2MkqsV" id="1rkHUYSMu2p" role="3cqZAp">
                          <node concept="Xl_RD" id="1rkHUYSMu2A" role="2MkJ7o">
                            <property role="Xl_RC" value="SortingPolicy with criterion=DATE requires a DATE or DATETIME attribute" />
                          </node>
                          <node concept="2GrUjf" id="1rkHUYSMu2T" role="1urrMF">
                            <ref role="2Gs0qQ" node="1rkHUYSEqyo" resolve="sortingPolicy" />
                          </node>
                        </node>
                      </node>
                      <node concept="3fqX7Q" id="1rkHUYSMtXA" role="3clFbw">
                        <node concept="37vLTw" id="1rkHUYSMtXO" role="3fr31v">
                          <ref role="3cqZAo" node="1rkHUYSMfWf" resolve="hasDate" />
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
    <node concept="1YaCAy" id="1rkHUYSE9O0" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="18kY7G" id="1bC37d4ZRLm">
    <property role="TrG5h" value="checkConditionAttributeBelongsToAutomationRuleContext" />
    <node concept="3clFbS" id="1bC37d4ZRLn" role="18ibNy">
      <node concept="2Gpval" id="1bC37d4ZRPY" role="3cqZAp">
        <node concept="2GrKxI" id="1bC37d4ZRPZ" role="2Gsz3X">
          <property role="TrG5h" value="automationRule" />
        </node>
        <node concept="2OqwBi" id="1bC37d4ZS1w" role="2GsD0m">
          <node concept="1YBJjd" id="1bC37d4ZRRd" role="2Oq$k0">
            <ref role="1YBMHb" node="1bC37d4ZRLq" resolve="refModel" />
          </node>
          <node concept="3Tsc0h" id="1bC37d4ZSnV" role="2OqNvi">
            <ref role="3TtcxE" to="2rvu:3nWBi3h36UY" resolve="automationRule" />
          </node>
        </node>
        <node concept="3clFbS" id="1bC37d4ZRQ1" role="2LFqv$">
          <node concept="3clFbJ" id="1bC37d4ZSvo" role="3cqZAp">
            <node concept="3y3z36" id="1bC37d4ZTR4" role="3clFbw">
              <node concept="10Nm6u" id="1bC37d4ZU3g" role="3uHU7w" />
              <node concept="2OqwBi" id="1bC37d4ZSDD" role="3uHU7B">
                <node concept="2GrUjf" id="1bC37d4ZSvx" role="2Oq$k0">
                  <ref role="2Gs0qQ" node="1bC37d4ZRPZ" resolve="automationRule" />
                </node>
                <node concept="3TrEf2" id="1bC37d4ZToK" role="2OqNvi">
                  <ref role="3Tt5mk" to="2rvu:5fnjbJr$zss" resolve="context" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1bC37d4ZSvq" role="3clFbx">
              <node concept="2Gpval" id="1bC37d4ZVYW" role="3cqZAp">
                <node concept="2GrKxI" id="1bC37d4ZVYX" role="2Gsz3X">
                  <property role="TrG5h" value="condition" />
                </node>
                <node concept="2OqwBi" id="1bC37d4ZWa5" role="2GsD0m">
                  <node concept="2GrUjf" id="1bC37d4ZVZM" role="2Oq$k0">
                    <ref role="2Gs0qQ" node="1bC37d4ZRPZ" resolve="automationRule" />
                  </node>
                  <node concept="3Tsc0h" id="1bC37d4ZX5_" role="2OqNvi">
                    <ref role="3TtcxE" to="2rvu:77Q8YzgwKZY" resolve="conditions" />
                  </node>
                </node>
                <node concept="3clFbS" id="1bC37d4ZVYZ" role="2LFqv$">
                  <node concept="3clFbJ" id="1bC37d4ZXd3" role="3cqZAp">
                    <node concept="3clFbC" id="1bC37d500BX" role="3clFbw">
                      <node concept="10Nm6u" id="1bC37d500M4" role="3uHU7w" />
                      <node concept="2OqwBi" id="1bC37d4ZXnk" role="3uHU7B">
                        <node concept="2GrUjf" id="1bC37d4ZXdc" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="1bC37d4ZVYX" resolve="condition" />
                        </node>
                        <node concept="3TrEf2" id="1bC37d4ZZVY" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:1bC37d4A6C6" resolve="field" />
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbS" id="1bC37d4ZXd5" role="3clFbx">
                      <node concept="2MkqsV" id="1bC37d500VZ" role="3cqZAp">
                        <node concept="Xl_RD" id="1bC37d500W8" role="2MkJ7o">
                          <property role="Xl_RC" value="Condition must reference an Attribute" />
                        </node>
                        <node concept="2GrUjf" id="1bC37d500Ws" role="1urrMF">
                          <ref role="2Gs0qQ" node="1bC37d4ZVYX" resolve="condition" />
                        </node>
                      </node>
                    </node>
                    <node concept="3eNFk2" id="1bC37d502SC" role="3eNLev">
                      <node concept="3clFbS" id="1bC37d502SE" role="3eOfB_">
                        <node concept="2MkqsV" id="1bC37d50jmb" role="3cqZAp">
                          <node concept="Xl_RD" id="1bC37d50jmk" role="2MkJ7o">
                            <property role="Xl_RC" value="Condition Attribute must belong to AutomationRule Context" />
                          </node>
                          <node concept="2GrUjf" id="1bC37d50jnl" role="1urrMF">
                            <ref role="2Gs0qQ" node="1bC37d4ZVYX" resolve="condition" />
                          </node>
                        </node>
                      </node>
                      <node concept="3fqX7Q" id="1bC37d50jaa" role="3eO9$A">
                        <node concept="2OqwBi" id="1bC37d50jac" role="3fr31v">
                          <node concept="2OqwBi" id="1bC37d50jad" role="2Oq$k0">
                            <node concept="2OqwBi" id="1bC37d50jae" role="2Oq$k0">
                              <node concept="2GrUjf" id="1bC37d50jaf" role="2Oq$k0">
                                <ref role="2Gs0qQ" node="1bC37d4ZRPZ" resolve="automationRule" />
                              </node>
                              <node concept="3TrEf2" id="1bC37d50jag" role="2OqNvi">
                                <ref role="3Tt5mk" to="2rvu:5fnjbJr$zss" resolve="context" />
                              </node>
                            </node>
                            <node concept="3Tsc0h" id="1bC37d50jah" role="2OqNvi">
                              <ref role="3TtcxE" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
                            </node>
                          </node>
                          <node concept="3JPx81" id="1bC37d50jai" role="2OqNvi">
                            <node concept="2OqwBi" id="1bC37d50jaj" role="25WWJ7">
                              <node concept="2GrUjf" id="1bC37d50jak" role="2Oq$k0">
                                <ref role="2Gs0qQ" node="1bC37d4ZVYX" resolve="condition" />
                              </node>
                              <node concept="3TrEf2" id="1bC37d50jal" role="2OqNvi">
                                <ref role="3Tt5mk" to="2rvu:1bC37d4A6C6" resolve="field" />
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
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1bC37d4ZRLq" role="1YuTPh">
      <property role="TrG5h" value="refModel" />
      <ref role="1YaFvo" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
</model>

