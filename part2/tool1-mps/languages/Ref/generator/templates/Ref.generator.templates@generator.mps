<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2978d18a-fb58-4b15-a47c-80c776cb7803(Ref.generator.templates@generator)">
  <persistence version="9" />
  <languages>
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="3" />
    <devkit ref="a2eb3a43-fcc2-4200-80dc-c60110c4862d(jetbrains.mps.devkit.templates)" />
  </languages>
  <imports>
    <import index="yy8y" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot.autoconfigure(dependency.importer/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="mfax" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot(dependency.importer/)" />
    <import index="p99f" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.persistence(dependency.importer/)" />
    <import index="28m1" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.time(JDK/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="28358707492436943" name="jetbrains.mps.baseLanguage.structure.JavaImport" flags="ng" index="u1fJn">
        <property id="28358707492436944" name="onDemand" index="u1fJ8" />
      </concept>
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
        <child id="1188214630783" name="value" index="2B76xF" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ngI" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1188214545140" name="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" flags="ng" index="2B6LJw">
        <reference id="1188214555875" name="key" index="2B6OnR" />
        <child id="1188214607812" name="value" index="2B70Vg" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1197029447546" name="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" flags="nn" index="2OwXpG">
        <reference id="1197029500499" name="fieldDeclaration" index="2Oxat5" />
      </concept>
      <concept id="1083260308424" name="jetbrains.mps.baseLanguage.structure.EnumConstantReference" flags="nn" index="Rm8GO">
        <reference id="1083260308426" name="enumConstantDeclaration" index="Rm8GQ" />
        <reference id="1144432896254" name="enumClass" index="1Px2BO" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="2621000434129553333" name="jetbrains.mps.baseLanguage.structure.UnknownDotCall" flags="nn" index="Wc6QR">
        <property id="4872723285943177972" name="callee" index="10XrrR" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1075300953594" name="abstractClass" index="1sVAO0" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="3304084122476667220" name="jetbrains.mps.baseLanguage.structure.UnknownNew" flags="nn" index="31S9pk">
        <property id="3304084122476721463" name="className" index="31Ss8R" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1513279640883654088" name="jetbrains.mps.baseLanguage.structure.UnknownInstanceMethodCall" flags="ng" index="35GP8o">
        <child id="1513279640883656453" name="operand" index="35GOzl" />
      </concept>
      <concept id="1513279640923991009" name="jetbrains.mps.baseLanguage.structure.IGenericClassCreator" flags="ngI" index="366HgL">
        <property id="1513279640906337053" name="inferTypeParams" index="373rjd" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_" />
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="6050519299856556786" name="jetbrains.mps.baseLanguage.structure.JavaImports" flags="ng" index="1lrU7d">
        <child id="28358707492429991" name="entries" index="u1e2Z" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="6528213125912070246" name="jetbrains.mps.baseLanguage.structure.Tokens" flags="ngI" index="1u$dsA">
        <property id="1843920760191311250" name="tokens" index="1CJj6V" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="bUwia" id="3CgA0AXyjwl">
    <property role="TrG5h" value="main" />
  </node>
  <node concept="312cEu" id="32E3qrM_VCt">
    <property role="TrG5h" value="AmazonBackendApplication" />
    <node concept="3Tm1VV" id="32E3qrM_VCu" role="1B3o_S" />
    <node concept="2AHcQZ" id="32E3qrM_VCv" role="2AJF6D">
      <ref role="2AI5Lk" to="yy8y:~SpringBootApplication" resolve="SpringBootApplication" />
    </node>
    <node concept="2YIFZL" id="32E3qrM_VCw" role="jymVt">
      <property role="TrG5h" value="main" />
      <node concept="37vLTG" id="32E3qrM_VCx" role="3clF46">
        <property role="TrG5h" value="args" />
        <node concept="10Q1$e" id="32E3qrM_VCz" role="1tU5fm">
          <node concept="3uibUv" id="32E3qrM_VCy" role="10Q1$1">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrM_VC$" role="3clF47">
        <node concept="3clFbF" id="32E3qrM_VC_" role="3cqZAp">
          <node concept="2YIFZM" id="32E3qrM_VNL" role="3clFbG">
            <ref role="1Pybhc" to="mfax:~SpringApplication" resolve="SpringApplication" />
            <ref role="37wK5l" to="mfax:~SpringApplication.run(java.lang.Class,java.lang.String...)" resolve="run" />
            <node concept="3VsKOn" id="32E3qrM_VNM" role="37wK5m">
              <ref role="3VsUkX" node="32E3qrM_VCt" resolve="AmazonBackendApplication" />
            </node>
            <node concept="37vLTw" id="32E3qrM_VNN" role="37wK5m">
              <ref role="3cqZAo" node="32E3qrM_VCx" resolve="args" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_VCE" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrM_VCF" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="32E3qrM_WQr">
    <property role="TrG5h" value="Order" />
    <node concept="3Tm1VV" id="32E3qrM_WQs" role="1B3o_S" />
    <node concept="2AHcQZ" id="32E3qrM_WQt" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="32E3qrM_WQu" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="32E3qrM_WQv" role="2B70Vg">
          <property role="Xl_RC" value="Order" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="32E3qrM_WQw" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="32E3qrM_WQx" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="32E3qrM_WQy" role="2B70Vg">
          <property role="Xl_RC" value="orders" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="32E3qrM_X59" role="1zkMxy">
      <ref role="3uigEE" node="32E3qrM_WWg" resolve="GeneratedOrder" />
    </node>
  </node>
  <node concept="312cEu" id="32E3qrM_WWg">
    <property role="TrG5h" value="GeneratedOrder" />
    <property role="1sVAO0" value="true" />
    <node concept="3Tm1VV" id="32E3qrM_WWh" role="1B3o_S" />
    <node concept="2AHcQZ" id="32E3qrM_WWi" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="32E3qrM_WWj" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="32E3qrM_WWl" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="32E3qrM_WWm" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="32E3qrM_WWn" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="32E3qrMA1vH" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="32E3qrM_WWp" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="32E3qrM_WWq" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="32E3qrM_WWr" role="jymVt">
      <property role="TrG5h" value="orderCode" />
      <node concept="2AHcQZ" id="32E3qrM_WWt" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Embedded" resolve="Embedded" />
      </node>
      <node concept="3uibUv" id="32E3qrM_WWu" role="1tU5fm">
        <ref role="3uigEE" node="32E3qrMA2dC" resolve="OrderCode" />
      </node>
      <node concept="3Tm6S6" id="32E3qrM_WWv" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="32E3qrM_WWw" role="jymVt">
      <property role="TrG5h" value="orderDate" />
      <node concept="2AHcQZ" id="32E3qrM_WWy" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Embedded" resolve="Embedded" />
      </node>
      <node concept="3uibUv" id="32E3qrM_WWz" role="1tU5fm">
        <ref role="3uigEE" to=":^" resolve="OrderDate" />
      </node>
      <node concept="3Tm6S6" id="32E3qrM_WW$" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="32E3qrM_WW_" role="jymVt">
      <property role="TrG5h" value="buyer" />
      <node concept="2AHcQZ" id="32E3qrM_WWB" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="32E3qrM_WWC" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="32E3qrMA1vW" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="32E3qrM_WWE" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="32E3qrM_WWF" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="32E3qrM_WWG" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="32E3qrM_WWH" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="32E3qrM_WWI" role="2B70Vg">
            <property role="Xl_RC" value="buyer_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="32E3qrM_WWJ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="32E3qrM_WWK" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="32E3qrM_WWL" role="1tU5fm">
        <ref role="3uigEE" to=":^" resolve="AmazonUser" />
      </node>
      <node concept="3Tm6S6" id="32E3qrM_WWM" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="32E3qrM_WWN" role="jymVt">
      <property role="TrG5h" value="items" />
      <node concept="2AHcQZ" id="32E3qrM_WWP" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~OneToMany" resolve="OneToMany" />
        <node concept="2B6LJw" id="32E3qrM_WWQ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.mappedBy()" resolve="mappedBy" />
          <node concept="Xl_RD" id="32E3qrM_WWR" role="2B70Vg">
            <property role="Xl_RC" value="order" />
          </node>
        </node>
        <node concept="2B6LJw" id="32E3qrM_WWS" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.cascade()" resolve="cascade" />
          <node concept="Rm8GO" id="32E3qrMA1vu" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~CascadeType" resolve="CascadeType" />
            <ref role="Rm8GQ" to="p99f:~CascadeType.ALL" resolve="ALL" />
          </node>
        </node>
        <node concept="2B6LJw" id="32E3qrM_WWU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.orphanRemoval()" resolve="orphanRemoval" />
          <node concept="3clFbT" id="32E3qrM_WWV" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="32E3qrM_WWW" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="32E3qrM_WWX" role="11_B2D">
          <ref role="3uigEE" to=":^" resolve="OrderItem" />
        </node>
      </node>
      <node concept="2ShNRf" id="32E3qrMA1vI" role="33vP2m">
        <node concept="1pGfFk" id="32E3qrMA1vN" role="2ShVmc">
          <property role="373rjd" value="true" />
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
        </node>
      </node>
      <node concept="3Tm6S6" id="32E3qrM_WWZ" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="32E3qrM_WX0" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="32E3qrM_WX1" role="3clF47">
        <node concept="3cpWs6" id="32E3qrM_WX2" role="3cqZAp">
          <node concept="37vLTw" id="32E3qrM_WX3" role="3cqZAk">
            <ref role="3cqZAo" node="32E3qrM_WWj" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WX4" role="1B3o_S" />
      <node concept="3uibUv" id="32E3qrM_WX5" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="32E3qrM_WX6" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="32E3qrM_WX7" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="32E3qrM_WX8" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrM_WX9" role="3clF47">
        <node concept="3clFbF" id="32E3qrM_WXa" role="3cqZAp">
          <node concept="37vLTI" id="32E3qrM_WXb" role="3clFbG">
            <node concept="2OqwBi" id="32E3qrM_WXc" role="37vLTJ">
              <node concept="Xjq3P" id="32E3qrM_WXd" role="2Oq$k0" />
              <node concept="2OwXpG" id="32E3qrM_WXe" role="2OqNvi">
                <ref role="2Oxat5" node="32E3qrM_WWj" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="32E3qrM_WXf" role="37vLTx">
              <ref role="3cqZAo" node="32E3qrM_WX7" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WXg" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrM_WXh" role="3clF45" />
    </node>
    <node concept="3clFb_" id="32E3qrM_WXi" role="jymVt">
      <property role="TrG5h" value="getOrderCode" />
      <node concept="3clFbS" id="32E3qrM_WXj" role="3clF47">
        <node concept="3cpWs6" id="32E3qrM_WXk" role="3cqZAp">
          <node concept="3K4zz7" id="32E3qrM_WXq" role="3cqZAk">
            <node concept="3clFbC" id="32E3qrM_WXl" role="3K4Cdx">
              <node concept="37vLTw" id="32E3qrM_WXm" role="3uHU7B">
                <ref role="3cqZAo" node="32E3qrM_WWr" resolve="orderCode" />
              </node>
              <node concept="10Nm6u" id="32E3qrM_WXn" role="3uHU7w" />
            </node>
            <node concept="10Nm6u" id="32E3qrM_WXo" role="3K4E3e" />
            <node concept="2OqwBi" id="32E3qrMA38m" role="3K4GZi">
              <node concept="37vLTw" id="32E3qrMA1vx" role="2Oq$k0">
                <ref role="3cqZAo" node="32E3qrM_WWr" resolve="orderCode" />
              </node>
              <node concept="liA8E" id="32E3qrMA38n" role="2OqNvi">
                <ref role="37wK5l" node="32E3qrMA2e6" resolve="getValue" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WXr" role="1B3o_S" />
      <node concept="3uibUv" id="32E3qrM_WXs" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="32E3qrM_WXt" role="jymVt">
      <property role="TrG5h" value="setOrderCode" />
      <node concept="37vLTG" id="32E3qrM_WXu" role="3clF46">
        <property role="TrG5h" value="orderCode" />
        <node concept="3uibUv" id="32E3qrM_WXv" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrM_WXw" role="3clF47">
        <node concept="3clFbF" id="32E3qrM_WXx" role="3cqZAp">
          <node concept="37vLTI" id="32E3qrM_WXy" role="3clFbG">
            <node concept="2OqwBi" id="32E3qrM_WXz" role="37vLTJ">
              <node concept="Xjq3P" id="32E3qrM_WX$" role="2Oq$k0" />
              <node concept="2OwXpG" id="32E3qrM_WX_" role="2OqNvi">
                <ref role="2Oxat5" node="32E3qrM_WWr" resolve="orderCode" />
              </node>
            </node>
            <node concept="3K4zz7" id="32E3qrM_WXG" role="37vLTx">
              <node concept="3clFbC" id="32E3qrM_WXA" role="3K4Cdx">
                <node concept="37vLTw" id="32E3qrM_WXB" role="3uHU7B">
                  <ref role="3cqZAo" node="32E3qrM_WXu" resolve="orderCode" />
                </node>
                <node concept="10Nm6u" id="32E3qrM_WXC" role="3uHU7w" />
              </node>
              <node concept="10Nm6u" id="32E3qrM_WXD" role="3K4E3e" />
              <node concept="2ShNRf" id="32E3qrMA2Me" role="3K4GZi">
                <node concept="1pGfFk" id="32E3qrMA2Mp" role="2ShVmc">
                  <ref role="37wK5l" node="32E3qrMA2dU" resolve="OrderCode" />
                  <node concept="37vLTw" id="32E3qrMA2Mq" role="37wK5m">
                    <ref role="3cqZAo" node="32E3qrM_WXu" resolve="orderCode" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WXH" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrM_WXI" role="3clF45" />
    </node>
    <node concept="3clFb_" id="32E3qrM_WXJ" role="jymVt">
      <property role="TrG5h" value="getOrderDate" />
      <node concept="3clFbS" id="32E3qrM_WXK" role="3clF47">
        <node concept="3cpWs6" id="32E3qrM_WXL" role="3cqZAp">
          <node concept="3K4zz7" id="32E3qrM_WXR" role="3cqZAk">
            <node concept="3clFbC" id="32E3qrM_WXM" role="3K4Cdx">
              <node concept="37vLTw" id="32E3qrM_WXN" role="3uHU7B">
                <ref role="3cqZAo" node="32E3qrM_WWw" resolve="orderDate" />
              </node>
              <node concept="10Nm6u" id="32E3qrM_WXO" role="3uHU7w" />
            </node>
            <node concept="10Nm6u" id="32E3qrM_WXP" role="3K4E3e" />
            <node concept="35GP8o" id="32E3qrMA1vC" role="3K4GZi">
              <property role="10XrrR" value="getValue" />
              <node concept="37vLTw" id="32E3qrMA1vB" role="35GOzl">
                <ref role="3cqZAo" node="32E3qrM_WWw" resolve="orderDate" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WXS" role="1B3o_S" />
      <node concept="3uibUv" id="32E3qrM_WXT" role="3clF45">
        <ref role="3uigEE" to="28m1:~LocalDate" resolve="LocalDate" />
      </node>
    </node>
    <node concept="3clFb_" id="32E3qrM_WXU" role="jymVt">
      <property role="TrG5h" value="setOrderDate" />
      <node concept="37vLTG" id="32E3qrM_WXV" role="3clF46">
        <property role="TrG5h" value="orderDate" />
        <node concept="3uibUv" id="32E3qrM_WXW" role="1tU5fm">
          <ref role="3uigEE" to="28m1:~LocalDate" resolve="LocalDate" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrM_WXX" role="3clF47">
        <node concept="3clFbF" id="32E3qrM_WXY" role="3cqZAp">
          <node concept="37vLTI" id="32E3qrM_WXZ" role="3clFbG">
            <node concept="2OqwBi" id="32E3qrM_WY0" role="37vLTJ">
              <node concept="Xjq3P" id="32E3qrM_WY1" role="2Oq$k0" />
              <node concept="2OwXpG" id="32E3qrM_WY2" role="2OqNvi">
                <ref role="2Oxat5" node="32E3qrM_WWw" resolve="orderDate" />
              </node>
            </node>
            <node concept="3K4zz7" id="32E3qrM_WY9" role="37vLTx">
              <node concept="3clFbC" id="32E3qrM_WY3" role="3K4Cdx">
                <node concept="37vLTw" id="32E3qrM_WY4" role="3uHU7B">
                  <ref role="3cqZAo" node="32E3qrM_WXV" resolve="orderDate" />
                </node>
                <node concept="10Nm6u" id="32E3qrM_WY5" role="3uHU7w" />
              </node>
              <node concept="10Nm6u" id="32E3qrM_WY6" role="3K4E3e" />
              <node concept="31S9pk" id="32E3qrM_WY7" role="3K4GZi">
                <property role="31Ss8R" value="OrderDate" />
                <node concept="37vLTw" id="32E3qrM_WY8" role="37wK5m">
                  <ref role="3cqZAo" node="32E3qrM_WXV" resolve="orderDate" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WYa" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrM_WYb" role="3clF45" />
    </node>
    <node concept="3clFb_" id="32E3qrM_WYc" role="jymVt">
      <property role="TrG5h" value="getBuyer" />
      <node concept="3clFbS" id="32E3qrM_WYd" role="3clF47">
        <node concept="3cpWs6" id="32E3qrM_WYe" role="3cqZAp">
          <node concept="37vLTw" id="32E3qrM_WYf" role="3cqZAk">
            <ref role="3cqZAo" node="32E3qrM_WW_" resolve="buyer" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WYg" role="1B3o_S" />
      <node concept="3uibUv" id="32E3qrM_WYh" role="3clF45">
        <ref role="3uigEE" to=":^" resolve="AmazonUser" />
      </node>
    </node>
    <node concept="3clFb_" id="32E3qrM_WYi" role="jymVt">
      <property role="TrG5h" value="setBuyer" />
      <node concept="37vLTG" id="32E3qrM_WYj" role="3clF46">
        <property role="TrG5h" value="buyer" />
        <node concept="3uibUv" id="32E3qrM_WYk" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUser" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrM_WYl" role="3clF47">
        <node concept="3clFbF" id="32E3qrM_WYm" role="3cqZAp">
          <node concept="37vLTI" id="32E3qrM_WYn" role="3clFbG">
            <node concept="2OqwBi" id="32E3qrM_WYo" role="37vLTJ">
              <node concept="Xjq3P" id="32E3qrM_WYp" role="2Oq$k0" />
              <node concept="2OwXpG" id="32E3qrM_WYq" role="2OqNvi">
                <ref role="2Oxat5" node="32E3qrM_WW_" resolve="buyer" />
              </node>
            </node>
            <node concept="37vLTw" id="32E3qrM_WYr" role="37vLTx">
              <ref role="3cqZAo" node="32E3qrM_WYj" resolve="buyer" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WYs" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrM_WYt" role="3clF45" />
    </node>
    <node concept="3clFb_" id="32E3qrM_WYu" role="jymVt">
      <property role="TrG5h" value="getItems" />
      <node concept="3clFbS" id="32E3qrM_WYv" role="3clF47">
        <node concept="3cpWs6" id="32E3qrM_WYw" role="3cqZAp">
          <node concept="37vLTw" id="32E3qrM_WYx" role="3cqZAk">
            <ref role="3cqZAo" node="32E3qrM_WWN" resolve="items" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WYy" role="1B3o_S" />
      <node concept="3uibUv" id="32E3qrM_WYz" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="32E3qrM_WY$" role="11_B2D">
          <ref role="3uigEE" to=":^" resolve="OrderItem" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="32E3qrM_WY_" role="jymVt">
      <property role="TrG5h" value="addItem" />
      <node concept="37vLTG" id="32E3qrM_WYA" role="3clF46">
        <property role="TrG5h" value="orderItem" />
        <node concept="3uibUv" id="32E3qrM_WYB" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="OrderItem" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrM_WYC" role="3clF47">
        <node concept="3clFbF" id="32E3qrM_WYD" role="3cqZAp">
          <node concept="35GP8o" id="32E3qrMA1vm" role="3clFbG">
            <property role="10XrrR" value="setOrder" />
            <node concept="37vLTw" id="32E3qrMA1vl" role="35GOzl">
              <ref role="3cqZAo" node="32E3qrM_WYA" resolve="orderItem" />
            </node>
            <node concept="10QFUN" id="32E3qrMA1vn" role="37wK5m">
              <node concept="Xjq3P" id="32E3qrMA1vo" role="10QFUP" />
              <node concept="3uibUv" id="32E3qrMA1vp" role="10QFUM">
                <ref role="3uigEE" node="32E3qrM_WQr" resolve="Order" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="32E3qrM_WYI" role="3cqZAp">
          <node concept="2OqwBi" id="32E3qrMA1Pp" role="3clFbG">
            <node concept="37vLTw" id="32E3qrMA1vc" role="2Oq$k0">
              <ref role="3cqZAo" node="32E3qrM_WWN" resolve="items" />
            </node>
            <node concept="liA8E" id="32E3qrMA1Pq" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object)" resolve="add" />
              <node concept="37vLTw" id="32E3qrMA1Pr" role="37wK5m">
                <ref role="3cqZAo" node="32E3qrM_WYA" resolve="orderItem" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrM_WYL" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrM_WYM" role="3clF45" />
    </node>
    <node concept="1lrU7d" id="32E3qrM_WYN" role="lGtFl">
      <node concept="u1fJn" id="32E3qrM_WYO" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.generated" />
        <property role="u1fJ8" value="true" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYP" role="u1e2Z">
        <property role="1CJj6V" value="java.time.LocalDate" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYQ" role="u1e2Z">
        <property role="1CJj6V" value="java.util.ArrayList" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYR" role="u1e2Z">
        <property role="1CJj6V" value="java.util.List" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYS" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.CascadeType" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYT" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.Embedded" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYU" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.FetchType" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYV" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.GeneratedValue" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYW" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.GenerationType" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYX" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.Id" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYY" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.JoinColumn" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WYZ" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.ManyToOne" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ0" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.MappedSuperclass" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ1" role="u1e2Z">
        <property role="1CJj6V" value="jakarta.persistence.OneToMany" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ2" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.AmazonUser" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ3" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.Order" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ4" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.OrderItem" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ5" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.value.OrderCode" />
      </node>
      <node concept="u1fJn" id="32E3qrM_WZ6" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.value.OrderDate" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="32E3qrMA2dC">
    <property role="TrG5h" value="OrderCode" />
    <node concept="3Tm1VV" id="32E3qrMA2dD" role="1B3o_S" />
    <node concept="2AHcQZ" id="32E3qrMA2dE" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Embeddable" resolve="Embeddable" />
    </node>
    <node concept="312cEg" id="32E3qrMA2dF" role="jymVt">
      <property role="TrG5h" value="value" />
      <node concept="2AHcQZ" id="32E3qrMA2dH" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="32E3qrMA2dI" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="32E3qrMA2dJ" role="2B70Vg">
            <property role="Xl_RC" value="order_code" />
          </node>
        </node>
        <node concept="2B6LJw" id="32E3qrMA2dK" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="32E3qrMA2dL" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="32E3qrMA2dM" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="32E3qrMA2dN" role="2B70Vg">
            <property role="3cmrfH" value="80" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="32E3qrMA2dO" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="32E3qrMA2dP" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="32E3qrMA2dQ" role="jymVt">
      <node concept="3cqZAl" id="32E3qrMA2dR" role="3clF45" />
      <node concept="3clFbS" id="32E3qrMA2dS" role="3clF47" />
      <node concept="3Tmbuc" id="32E3qrMA2dT" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="32E3qrMA2dU" role="jymVt">
      <node concept="3cqZAl" id="32E3qrMA2dV" role="3clF45" />
      <node concept="37vLTG" id="32E3qrMA2dW" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="3uibUv" id="32E3qrMA2dX" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrMA2dY" role="3clF47">
        <node concept="3clFbF" id="32E3qrMA2dZ" role="3cqZAp">
          <node concept="37vLTI" id="32E3qrMA2e0" role="3clFbG">
            <node concept="2OqwBi" id="32E3qrMA2e1" role="37vLTJ">
              <node concept="Xjq3P" id="32E3qrMA2e2" role="2Oq$k0" />
              <node concept="2OwXpG" id="32E3qrMA2e3" role="2OqNvi">
                <ref role="2Oxat5" node="32E3qrMA2dF" resolve="value" />
              </node>
            </node>
            <node concept="37vLTw" id="32E3qrMA2e4" role="37vLTx">
              <ref role="3cqZAo" node="32E3qrMA2dW" resolve="value" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrMA2e5" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="32E3qrMA2e6" role="jymVt">
      <property role="TrG5h" value="getValue" />
      <node concept="3clFbS" id="32E3qrMA2e7" role="3clF47">
        <node concept="3cpWs6" id="32E3qrMA2e8" role="3cqZAp">
          <node concept="37vLTw" id="32E3qrMA2e9" role="3cqZAk">
            <ref role="3cqZAo" node="32E3qrMA2dF" resolve="value" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrMA2ea" role="1B3o_S" />
      <node concept="3uibUv" id="32E3qrMA2eb" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="32E3qrMA2ec" role="jymVt">
      <property role="TrG5h" value="setValue" />
      <node concept="37vLTG" id="32E3qrMA2ed" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="3uibUv" id="32E3qrMA2ee" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="32E3qrMA2ef" role="3clF47">
        <node concept="3clFbF" id="32E3qrMA2eg" role="3cqZAp">
          <node concept="37vLTI" id="32E3qrMA2eh" role="3clFbG">
            <node concept="2OqwBi" id="32E3qrMA2ei" role="37vLTJ">
              <node concept="Xjq3P" id="32E3qrMA2ej" role="2Oq$k0" />
              <node concept="2OwXpG" id="32E3qrMA2ek" role="2OqNvi">
                <ref role="2Oxat5" node="32E3qrMA2dF" resolve="value" />
              </node>
            </node>
            <node concept="37vLTw" id="32E3qrMA2el" role="37vLTx">
              <ref role="3cqZAo" node="32E3qrMA2ed" resolve="value" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="32E3qrMA2em" role="1B3o_S" />
      <node concept="3cqZAl" id="32E3qrMA2en" role="3clF45" />
    </node>
  </node>
</model>

