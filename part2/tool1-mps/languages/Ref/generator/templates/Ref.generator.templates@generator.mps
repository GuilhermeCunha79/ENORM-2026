<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2978d18a-fb58-4b15-a47c-80c776cb7803(Ref.generator.templates@generator)">
  <persistence version="9" />
  <languages>
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="3" />
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="4" />
    <use id="990507d3-3527-4c54-bfe9-0ca3c9c6247a" name="com.dslfoundry.plaintextgen" version="0" />
    <use id="acfc188d-d5d6-4598-b370-6f4a983f05b2" name="jetbrains.mps.baseLanguage.methodReferences" version="0" />
    <use id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures" version="0" />
    <devkit ref="a2eb3a43-fcc2-4200-80dc-c60110c4862d(jetbrains.mps.devkit.templates)" />
  </languages>
  <imports>
    <import index="yy8y" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot.autoconfigure(dependency.importer/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="mfax" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot(dependency.importer/)" />
    <import index="d5sy" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.scheduling.annotation(dependency.importer/)" />
    <import index="6etd" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.h2.tools(dependency.importer/)" />
    <import index="2rvu" ref="r:322f8d2c-fa9d-4224-b267-a1958299e237(Ref.structure)" />
    <import index="1wnp" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.context.annotation(dependency.importer/)" />
    <import index="aadr" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot.autoconfigure.condition(dependency.importer/)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="zj7m" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.sql(JDK/)" />
    <import index="m5zv" ref="r:4a4f1034-b85f-4855-876e-2beabc181650(com.dslfoundry.plaintextflow.textGen)" />
    <import index="28m1" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.time(JDK/)" />
    <import index="5ej9" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:io.jsonwebtoken(dependency.importer/)" />
    <import index="pfyx" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:javax.crypto(JDK/)" />
    <import index="meih" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.stereotype(dependency.importer/)" />
    <import index="b31h" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.beans.factory.annotation(dependency.importer/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="82uw" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util.function(JDK/)" />
    <import index="ay6n" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.core.userdetails(dependency.importer/)" />
    <import index="qrsp" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:io.jsonwebtoken.security(dependency.importer/)" />
    <import index="i3x4" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.expression.spel.standard(dependency.importer/)" />
    <import index="7x5y" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.nio.charset(JDK/)" />
    <import index="29ll" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.web.filter(dependency.importer/)" />
    <import index="9yh5" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.servlet(dependency.importer/)" />
    <import index="1ctc" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util.stream(JDK/)" />
    <import index="mwe7" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.authentication(dependency.importer/)" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" />
    <import index="j1jh" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.servlet.http(dependency.importer/)" />
    <import index="sfae" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.core(dependency.importer/)" />
    <import index="f9d3" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.core.context(dependency.importer/)" />
    <import index="qd1r" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.http(dependency.importer/)" />
    <import index="pkux" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.web.authentication(dependency.importer/)" />
    <import index="f75t" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.crypto.password(dependency.importer/)" />
    <import index="aen7" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.authentication.dao(dependency.importer/)" />
    <import index="r5bh" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.web(dependency.importer/)" />
    <import index="mgjw" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.web.builders(dependency.importer/)" />
    <import index="52y" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.authentication.configuration(dependency.importer/)" />
    <import index="jomb" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.method.configuration(dependency.importer/)" />
    <import index="fm6r" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.web.configurers(dependency.importer/)" />
    <import index="c4fr" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:com.fasterxml.jackson.annotation(dependency.importer/)" />
    <import index="60d6" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.web(dependency.importer/)" />
    <import index="zfmr" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot.context.annotation(dependency.importer/)" />
    <import index="erxu" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.web.headers(dependency.importer/)" />
    <import index="ypf6" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.crypto.bcrypt(dependency.importer/)" />
    <import index="1ipg" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation(dependency.importer/)" />
    <import index="kxsd" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.http(dependency.importer/)" />
    <import index="cn7d" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.data.web.config(dependency.importer/)" />
    <import index="bjg2" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.boot.web.server(dependency.importer/)" />
    <import index="qisj" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.annotation.security(dependency.importer/)" />
    <import index="nc2v" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.web.util.matcher(dependency.importer/)" />
    <import index="ac0y" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.config.annotation.web.configuration(dependency.importer/)" />
    <import index="mn00" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.web.servlet.util.matcher(dependency.importer/)" />
    <import index="ynm1" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.util(dependency.importer/)" />
    <import index="zwk2" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.authorization(dependency.importer/)" />
    <import index="4dsp" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.web.access.intercept(dependency.importer/)" />
    <import index="u35y" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.transaction.annotation(dependency.importer/)" />
    <import index="5qhr" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.web.header.writers.frameoptions(dependency.importer/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
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
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="2621000434129553333" name="jetbrains.mps.baseLanguage.structure.UnknownDotCall" flags="nn" index="Wc6QR">
        <property id="4872723285943177972" name="callee" index="10XrrR" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1164991038168" name="jetbrains.mps.baseLanguage.structure.ThrowStatement" flags="nn" index="YS8fn">
        <child id="1164991057263" name="throwable" index="YScLw" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
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
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1513279640883654088" name="jetbrains.mps.baseLanguage.structure.UnknownInstanceMethodCall" flags="ng" index="35GP8o">
        <child id="1513279640883656453" name="operand" index="35GOzl" />
      </concept>
      <concept id="1109279763828" name="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" flags="ng" index="16euLQ" />
      <concept id="1109279851642" name="jetbrains.mps.baseLanguage.structure.GenericDeclaration" flags="ng" index="16eOlS">
        <child id="1109279881614" name="typeVariableDeclaration" index="16eVyc" />
      </concept>
      <concept id="1109283449304" name="jetbrains.mps.baseLanguage.structure.TypeVariableReference" flags="in" index="16syzq">
        <reference id="1109283546497" name="typeVariableDeclaration" index="16sUi3" />
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
        <child id="1164879685961" name="throwsItem" index="Sfmx6" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_" />
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
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
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242867" name="jetbrains.mps.baseLanguage.structure.LongType" flags="in" index="3cpWsb" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="6050519299856556786" name="jetbrains.mps.baseLanguage.structure.JavaImports" flags="ng" index="1lrU7d">
        <child id="28358707492429991" name="entries" index="u1e2Z" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="2791683072064593257" name="packageName" index="2HnT6v" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
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
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="8473865358220097975" name="jetbrains.mps.baseLanguage.structure.UnknownNameRef" flags="nn" index="3yEOSi" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1107796713796" name="jetbrains.mps.baseLanguage.structure.Interface" flags="ig" index="3HP615">
        <child id="1107797138135" name="extendedInterface" index="3HQHJm" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
      </concept>
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167945743726" name="jetbrains.mps.lang.generator.structure.IfMacro_Condition" flags="in" index="3IZrLx" />
      <concept id="1118773211870" name="jetbrains.mps.lang.generator.structure.IfMacro" flags="ln" index="1W57fq">
        <child id="1167945861827" name="conditionFunction" index="3IZSJc" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
      <concept id="8992394414545679616" name="jetbrains.mps.baseLanguage.closures.structure.ClosureVarType" flags="ig" index="3VYd8j" />
    </language>
    <language id="acfc188d-d5d6-4598-b370-6f4a983f05b2" name="jetbrains.mps.baseLanguage.methodReferences">
      <concept id="7915009415671748557" name="jetbrains.mps.baseLanguage.methodReferences.structure.MethodReferenceTypeTargetExpression" flags="ng" index="2FaPjH">
        <child id="7915009415671751864" name="type" index="2FaQuo" />
      </concept>
      <concept id="237887375562511215" name="jetbrains.mps.baseLanguage.methodReferences.structure.MethodReference" flags="ng" index="37Ijox" />
      <concept id="3507059745126391419" name="jetbrains.mps.baseLanguage.methodReferences.structure.IMethodReference" flags="ngI" index="3UZKCU">
        <reference id="237887375562511297" name="method" index="37Ijqf" />
        <child id="962278442658307079" name="target" index="wWaWy" />
      </concept>
    </language>
    <language id="990507d3-3527-4c54-bfe9-0ca3c9c6247a" name="com.dslfoundry.plaintextgen">
      <concept id="5082088080656902716" name="com.dslfoundry.plaintextgen.structure.NewlineMarker" flags="ng" index="2EixSi" />
      <concept id="1145195647825954804" name="com.dslfoundry.plaintextgen.structure.word" flags="ng" index="356sEF" />
      <concept id="1145195647825954799" name="com.dslfoundry.plaintextgen.structure.Line" flags="ng" index="356sEK">
        <child id="5082088080656976323" name="newlineMarker" index="2EinRH" />
        <child id="1145195647825954802" name="words" index="356sEH" />
      </concept>
      <concept id="1145195647825954793" name="com.dslfoundry.plaintextgen.structure.SpaceIndentedText" flags="ng" index="356sEQ">
        <property id="5198309202558919052" name="indent" index="333NGx" />
      </concept>
      <concept id="1145195647825954788" name="com.dslfoundry.plaintextgen.structure.TextgenText" flags="ng" index="356sEV">
        <property id="5407518469085446424" name="ext" index="3Le9LX" />
        <child id="1145195647826100986" name="content" index="356KY_" />
      </concept>
      <concept id="1145195647826084325" name="com.dslfoundry.plaintextgen.structure.VerticalLines" flags="ng" index="356WMU" />
      <concept id="7214912913997260680" name="com.dslfoundry.plaintextgen.structure.IVerticalGroup" flags="ngI" index="383Yap">
        <child id="7214912913997260696" name="lines" index="383Ya9" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="name_DebugInfo" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="bUwia" id="3CgA0AXyjwl">
    <property role="TrG5h" value="main" />
    <node concept="3lhOvk" id="6O2ksCsJI3p" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="32E3qrM_VCt" resolve="ModelApplication" />
    </node>
    <node concept="3lhOvk" id="33dPD0B5kkc" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="33dPD0B4fFM" resolve="pom" />
    </node>
    <node concept="3lhOvk" id="33dPD0BfzAA" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="33dPD0BeUr0" resolve="application" />
    </node>
    <node concept="3lhOvk" id="33dPD0BOKmE" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="7tjK46p_GnO" resolve="H2ServerConfiguration" />
    </node>
    <node concept="3lhOvk" id="1s4BJy8zB2M" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="1s4BJy8oGbX" resolve="JwtService" />
    </node>
  </node>
  <node concept="312cEu" id="32E3qrM_VCt">
    <property role="TrG5h" value="ModelApplication" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref" />
    <node concept="3Tm1VV" id="32E3qrM_VCu" role="1B3o_S" />
    <node concept="2AHcQZ" id="32E3qrM_VCv" role="2AJF6D">
      <ref role="2AI5Lk" to="yy8y:~SpringBootApplication" resolve="SpringBootApplication" />
    </node>
    <node concept="2AHcQZ" id="7tjK46p_iew" role="2AJF6D">
      <ref role="2AI5Lk" to="d5sy:~EnableScheduling" resolve="EnableScheduling" />
      <node concept="1W57fq" id="7tjK46p_t54" role="lGtFl">
        <node concept="3IZrLx" id="7tjK46p_t55" role="3IZSJc">
          <node concept="3clFbS" id="7tjK46p_t56" role="2VODD2">
            <node concept="3clFbF" id="7tjK46p_ti5" role="3cqZAp">
              <node concept="2OqwBi" id="7tjK46p_BZ_" role="3clFbG">
                <node concept="2OqwBi" id="7tjK46p_tCh" role="2Oq$k0">
                  <node concept="30H73N" id="7tjK46p_ti4" role="2Oq$k0" />
                  <node concept="3Tsc0h" id="7tjK46p_vHD" role="2OqNvi">
                    <ref role="3TtcxE" to="2rvu:3nWBi3h36Vg" resolve="moderationPolicy" />
                  </node>
                </node>
                <node concept="3GX2aA" id="7tjK46p_Gg7" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
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
              <ref role="3VsUkX" node="32E3qrM_VCt" resolve="ModelApplication" />
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
    <node concept="n94m4" id="6O2ksCsJNBz" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
    <node concept="17Uvod" id="6O2ksCsJSFu" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="6O2ksCsJSFv" role="3zH0cK">
        <node concept="3clFbS" id="6O2ksCsJSFw" role="2VODD2">
          <node concept="3clFbF" id="6O2ksCsJTyj" role="3cqZAp">
            <node concept="3cpWs3" id="33dPD0BeOWe" role="3clFbG">
              <node concept="Xl_RD" id="33dPD0BeOWt" role="3uHU7w">
                <property role="Xl_RC" value="Application" />
              </node>
              <node concept="2OqwBi" id="6O2ksCsJUJj" role="3uHU7B">
                <node concept="30H73N" id="6O2ksCsJTyi" role="2Oq$k0" />
                <node concept="3TrcHB" id="6O2ksCsJXuZ" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="7tjK46p_GnO">
    <property role="TrG5h" value="H2ServerConfiguration" />
    <node concept="3Tm1VV" id="7tjK46p_GnP" role="1B3o_S" />
    <node concept="2AHcQZ" id="7tjK46p_GnQ" role="2AJF6D">
      <ref role="2AI5Lk" to="1wnp:~Configuration" resolve="Configuration" />
    </node>
    <node concept="3clFb_" id="7tjK46p_GnR" role="jymVt">
      <property role="TrG5h" value="h2TcpServer" />
      <node concept="2AHcQZ" id="7tjK46p_GnS" role="2AJF6D">
        <ref role="2AI5Lk" to="1wnp:~Bean" resolve="Bean" />
        <node concept="2B6LJw" id="7tjK46p_GnT" role="2B76xF">
          <ref role="2B6OnR" to="1wnp:~Bean.initMethod()" resolve="initMethod" />
          <node concept="Xl_RD" id="7tjK46p_GnU" role="2B70Vg">
            <property role="Xl_RC" value="start" />
          </node>
        </node>
        <node concept="2B6LJw" id="7tjK46p_GnV" role="2B76xF">
          <ref role="2B6OnR" to="1wnp:~Bean.destroyMethod()" resolve="destroyMethod" />
          <node concept="Xl_RD" id="7tjK46p_GnW" role="2B70Vg">
            <property role="Xl_RC" value="stop" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7tjK46p_GnX" role="2AJF6D">
        <ref role="2AI5Lk" to="aadr:~ConditionalOnProperty" resolve="ConditionalOnProperty" />
        <node concept="2B6LJw" id="7tjK46p_GnY" role="2B76xF">
          <ref role="2B6OnR" to="aadr:~ConditionalOnProperty.name()" resolve="name" />
          <node concept="Xl_RD" id="7tjK46p_GnZ" role="2B70Vg">
            <property role="Xl_RC" value="app.h2.tcp.enabled" />
          </node>
        </node>
        <node concept="2B6LJw" id="7tjK46p_Go0" role="2B76xF">
          <ref role="2B6OnR" to="aadr:~ConditionalOnProperty.havingValue()" resolve="havingValue" />
          <node concept="Xl_RD" id="7tjK46p_Go1" role="2B70Vg">
            <property role="Xl_RC" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="7tjK46p_Go2" role="Sfmx6">
        <ref role="3uigEE" to="zj7m:~SQLException" resolve="SQLException" />
      </node>
      <node concept="3clFbS" id="7tjK46p_Go3" role="3clF47">
        <node concept="3cpWs6" id="7tjK46p_Go4" role="3cqZAp">
          <node concept="2YIFZM" id="7tjK46p_Ohp" role="3cqZAk">
            <ref role="1Pybhc" to="6etd:~Server" resolve="Server" />
            <ref role="37wK5l" to="6etd:~Server.createTcpServer(java.lang.String...)" resolve="createTcpServer" />
            <node concept="Xl_RD" id="7tjK46p_Ohq" role="37wK5m">
              <property role="Xl_RC" value="-tcp" />
            </node>
            <node concept="Xl_RD" id="7tjK46p_Ohr" role="37wK5m">
              <property role="Xl_RC" value="-tcpAllowOthers" />
            </node>
            <node concept="Xl_RD" id="7tjK46p_Ohs" role="37wK5m">
              <property role="Xl_RC" value="-tcpPort" />
            </node>
            <node concept="Xl_RD" id="7tjK46p_Oht" role="37wK5m">
              <property role="Xl_RC" value="9092" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="7tjK46p_Goa" role="3clF45">
        <ref role="3uigEE" to="6etd:~Server" resolve="Server" />
      </node>
    </node>
    <node concept="n94m4" id="33dPD0BOLkR" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="356sEV" id="33dPD0B4fFM">
    <property role="TrG5h" value="pom" />
    <property role="3Le9LX" value=".xml" />
    <node concept="356WMU" id="33dPD0B4lNE" role="356KY_">
      <node concept="356sEK" id="33dPD0B4lNF" role="383Ya9">
        <node concept="356sEF" id="33dPD0B4lNG" role="356sEH">
          <property role="TrG5h" value="&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;" />
        </node>
        <node concept="2EixSi" id="33dPD0B4lNI" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0B4lNJ" role="383Ya9">
        <node concept="356sEF" id="33dPD0B4lNK" role="356sEH">
          <property role="TrG5h" value="&lt;project xmlns=&quot;http://maven.apache.org/POM/4.0.0&quot;" />
        </node>
        <node concept="2EixSi" id="33dPD0B4lNM" role="2EinRH" />
      </node>
      <node concept="356sEQ" id="33dPD0B4lO0" role="383Ya9">
        <property role="333NGx" value="    " />
        <node concept="356sEQ" id="33dPD0B4lNR" role="383Ya9">
          <property role="333NGx" value="     " />
          <node concept="356sEK" id="33dPD0B4lNN" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lNO" role="356sEH">
              <property role="TrG5h" value="xmlns:xsi=&quot;http://www.w3.org/2001/XMLSchema-instance&quot;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lNQ" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lNS" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lNT" role="356sEH">
              <property role="TrG5h" value="xsi:schemaLocation=&quot;http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd&quot;&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lNV" role="2EinRH" />
          </node>
        </node>
        <node concept="356sEK" id="33dPD0B4lNW" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lNX" role="356sEH">
            <property role="TrG5h" value="&lt;modelVersion&gt;4.0.0&lt;/modelVersion&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lNZ" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lO1" role="383Ya9">
          <node concept="2EixSi" id="33dPD0B4lO4" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lO5" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lO6" role="356sEH">
            <property role="TrG5h" value="&lt;parent&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lO8" role="2EinRH" />
        </node>
        <node concept="356sEQ" id="33dPD0B4lOd" role="383Ya9">
          <property role="333NGx" value="    " />
          <node concept="356sEK" id="33dPD0B4lO9" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lOa" role="356sEH">
              <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lOc" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lOe" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lOf" role="356sEH">
              <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-starter-parent&lt;/artifactId&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lOh" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lOi" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lOj" role="356sEH">
              <property role="TrG5h" value="&lt;version&gt;3.4.5&lt;/version&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lOl" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lOm" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lOn" role="356sEH">
              <property role="TrG5h" value="&lt;relativePath/&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lOp" role="2EinRH" />
          </node>
        </node>
        <node concept="356sEK" id="33dPD0B4lOq" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lOr" role="356sEH">
            <property role="TrG5h" value="&lt;/parent&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lOt" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOu" role="383Ya9">
          <node concept="2EixSi" id="33dPD0B4lOx" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOy" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lOz" role="356sEH">
            <property role="TrG5h" value="&lt;groupId&gt;pt.isep.enorm.ref&lt;/groupId&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lO_" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOA" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lOB" role="356sEH">
            <property role="TrG5h" value="&lt;artifactId&gt;amazon-backend&lt;/artifactId&gt;" />
            <node concept="17Uvod" id="33dPD0B52bW" role="lGtFl">
              <property role="2qtEX9" value="name" />
              <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
              <node concept="3zFVjK" id="33dPD0B52bX" role="3zH0cK">
                <node concept="3clFbS" id="33dPD0B52bY" role="2VODD2">
                  <node concept="3clFbF" id="33dPD0B52v5" role="3cqZAp">
                    <node concept="3cpWs3" id="33dPD0B5bCr" role="3clFbG">
                      <node concept="Xl_RD" id="33dPD0B5c2x" role="3uHU7w">
                        <property role="Xl_RC" value="-backend&lt;/artifactId&gt;" />
                      </node>
                      <node concept="3cpWs3" id="33dPD0B57XC" role="3uHU7B">
                        <node concept="Xl_RD" id="33dPD0B52v4" role="3uHU7B">
                          <property role="Xl_RC" value="&lt;artifactId&gt;" />
                        </node>
                        <node concept="2OqwBi" id="33dPD0B594F" role="3uHU7w">
                          <node concept="30H73N" id="33dPD0B58gU" role="2Oq$k0" />
                          <node concept="3TrcHB" id="33dPD0B59Lk" role="2OqNvi">
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
          <node concept="2EixSi" id="33dPD0B4lOD" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOE" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lOF" role="356sEH">
            <property role="TrG5h" value="&lt;version&gt;0.0.1-SNAPSHOT&lt;/version&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lOH" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOI" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lOJ" role="356sEH">
            <property role="TrG5h" value="&lt;name&gt;amazon-backend&lt;/name&gt;" />
            <node concept="17Uvod" id="33dPD0B4GTR" role="lGtFl">
              <property role="2qtEX9" value="name" />
              <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
              <node concept="3zFVjK" id="33dPD0B4GTS" role="3zH0cK">
                <node concept="3clFbS" id="33dPD0B4GTT" role="2VODD2">
                  <node concept="3clFbF" id="33dPD0B4HiP" role="3cqZAp">
                    <node concept="3cpWs3" id="33dPD0B4POq" role="3clFbG">
                      <node concept="Xl_RD" id="33dPD0B4Qyn" role="3uHU7w">
                        <property role="Xl_RC" value="-backend&lt;/name&gt;" />
                      </node>
                      <node concept="3cpWs3" id="33dPD0B4MuB" role="3uHU7B">
                        <node concept="Xl_RD" id="33dPD0B4HiO" role="3uHU7B">
                          <property role="Xl_RC" value="&lt;name&gt;" />
                        </node>
                        <node concept="2OqwBi" id="33dPD0B4NuF" role="3uHU7w">
                          <node concept="30H73N" id="33dPD0B4Nan" role="2Oq$k0" />
                          <node concept="3TrcHB" id="33dPD0B4O5w" role="2OqNvi">
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
          <node concept="2EixSi" id="33dPD0B4lOL" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOM" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lON" role="356sEH">
            <property role="TrG5h" value="&lt;description&gt;Amazon backend MVP for ENORM REF&lt;/description&gt;" />
            <node concept="17Uvod" id="33dPD0B4zEV" role="lGtFl">
              <property role="2qtEX9" value="name" />
              <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
              <node concept="3zFVjK" id="33dPD0B4zEW" role="3zH0cK">
                <node concept="3clFbS" id="33dPD0B4zEX" role="2VODD2">
                  <node concept="3clFbF" id="33dPD0B4$gk" role="3cqZAp">
                    <node concept="3cpWs3" id="33dPD0B4E0P" role="3clFbG">
                      <node concept="Xl_RD" id="33dPD0B4FZL" role="3uHU7w">
                        <property role="Xl_RC" value=" backend MVP for ENORM REF&lt;/description&gt;" />
                      </node>
                      <node concept="3cpWs3" id="33dPD0B4_Nt" role="3uHU7B">
                        <node concept="Xl_RD" id="33dPD0B4$gj" role="3uHU7B">
                          <property role="Xl_RC" value="&lt;description&gt;" />
                        </node>
                        <node concept="2OqwBi" id="33dPD0B4ANS" role="3uHU7w">
                          <node concept="30H73N" id="33dPD0B4A6J" role="2Oq$k0" />
                          <node concept="3TrcHB" id="33dPD0B4B_Z" role="2OqNvi">
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
          <node concept="2EixSi" id="33dPD0B4lOP" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOQ" role="383Ya9">
          <node concept="2EixSi" id="33dPD0B4lOT" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lOU" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lOV" role="356sEH">
            <property role="TrG5h" value="&lt;properties&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lOX" role="2EinRH" />
        </node>
        <node concept="356sEQ" id="33dPD0B4lP2" role="383Ya9">
          <property role="333NGx" value="    " />
          <node concept="356sEK" id="33dPD0B4lOY" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lOZ" role="356sEH">
              <property role="TrG5h" value="&lt;java.version&gt;21&lt;/java.version&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lP1" role="2EinRH" />
          </node>
        </node>
        <node concept="356sEK" id="33dPD0B4lP3" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lP4" role="356sEH">
            <property role="TrG5h" value="&lt;/properties&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lP6" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lP7" role="383Ya9">
          <node concept="2EixSi" id="33dPD0B4lPa" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lPb" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lPc" role="356sEH">
            <property role="TrG5h" value="&lt;dependencies&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lPe" role="2EinRH" />
        </node>
        <node concept="356sEQ" id="33dPD0B4lPj" role="383Ya9">
          <property role="333NGx" value="    " />
          <node concept="356sEK" id="33dPD0B4lPf" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lPg" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lPi" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lPo" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lPk" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lPl" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lPn" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lPp" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lPq" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-starter-web&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lPs" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lPt" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lPu" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lPw" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lPx" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lPy" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lP$" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lPD" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lP_" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lPA" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lPC" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lPE" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lPF" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-starter-security&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lPH" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lPI" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lPJ" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lPL" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lPM" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lPN" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lPP" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lPU" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lPQ" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lPR" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lPT" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lPV" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lPW" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-starter-data-jpa&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lPY" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lPZ" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQ0" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQ2" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lQ3" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQ4" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQ6" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lQb" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lQ7" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQ8" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQa" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lQc" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQd" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-starter-validation&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQf" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lQg" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQh" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQj" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lQk" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQl" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQn" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lQs" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lQo" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQp" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;com.h2database&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQr" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lQt" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQu" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;h2&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQw" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lQx" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQy" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQ$" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lQ_" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQA" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQC" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lQH" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lQD" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQE" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;io.jsonwebtoken&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQG" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lQI" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQJ" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;jjwt-api&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQL" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lQM" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQN" role="356sEH">
                <property role="TrG5h" value="&lt;version&gt;0.12.7&lt;/version&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lQP" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lQQ" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQR" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQT" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lQU" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lQV" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lQX" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lR2" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lQY" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lQZ" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;io.jsonwebtoken&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lR1" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lR3" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lR4" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;jjwt-impl&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lR6" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lR7" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lR8" role="356sEH">
                <property role="TrG5h" value="&lt;version&gt;0.12.7&lt;/version&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRa" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lRb" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRc" role="356sEH">
                <property role="TrG5h" value="&lt;scope&gt;runtime&lt;/scope&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRe" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lRf" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lRg" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lRi" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lRj" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lRk" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lRm" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lRr" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lRn" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRo" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;io.jsonwebtoken&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRq" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lRs" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRt" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;jjwt-jackson&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRv" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lRw" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRx" role="356sEH">
                <property role="TrG5h" value="&lt;version&gt;0.12.7&lt;/version&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRz" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lR$" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lR_" role="356sEH">
                <property role="TrG5h" value="&lt;scope&gt;runtime&lt;/scope&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRB" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lRC" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lRD" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lRF" role="2EinRH" />
          </node>
          <node concept="356sEK" id="33dPD0B4lRG" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lRH" role="356sEH">
              <property role="TrG5h" value="&lt;dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lRJ" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lRO" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lRK" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRL" role="356sEH">
                <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRN" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lRP" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRQ" role="356sEH">
                <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-starter-test&lt;/artifactId&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRS" role="2EinRH" />
            </node>
            <node concept="356sEK" id="33dPD0B4lRT" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lRU" role="356sEH">
                <property role="TrG5h" value="&lt;scope&gt;test&lt;/scope&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lRW" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lRX" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lRY" role="356sEH">
              <property role="TrG5h" value="&lt;/dependency&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lS0" role="2EinRH" />
          </node>
        </node>
        <node concept="356sEK" id="33dPD0B4lS1" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lS2" role="356sEH">
            <property role="TrG5h" value="&lt;/dependencies&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lS4" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lS5" role="383Ya9">
          <node concept="2EixSi" id="33dPD0B4lS8" role="2EinRH" />
        </node>
        <node concept="356sEK" id="33dPD0B4lS9" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lSa" role="356sEH">
            <property role="TrG5h" value="&lt;build&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lSc" role="2EinRH" />
        </node>
        <node concept="356sEQ" id="33dPD0B4lSh" role="383Ya9">
          <property role="333NGx" value="    " />
          <node concept="356sEK" id="33dPD0B4lSd" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lSe" role="356sEH">
              <property role="TrG5h" value="&lt;plugins&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lSg" role="2EinRH" />
          </node>
          <node concept="356sEQ" id="33dPD0B4lSm" role="383Ya9">
            <property role="333NGx" value="    " />
            <node concept="356sEK" id="33dPD0B4lSi" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lSj" role="356sEH">
                <property role="TrG5h" value="&lt;plugin&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lSl" role="2EinRH" />
            </node>
            <node concept="356sEQ" id="33dPD0B4lSr" role="383Ya9">
              <property role="333NGx" value="    " />
              <node concept="356sEK" id="33dPD0B4lSn" role="383Ya9">
                <node concept="356sEF" id="33dPD0B4lSo" role="356sEH">
                  <property role="TrG5h" value="&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;" />
                </node>
                <node concept="2EixSi" id="33dPD0B4lSq" role="2EinRH" />
              </node>
              <node concept="356sEK" id="33dPD0B4lSs" role="383Ya9">
                <node concept="356sEF" id="33dPD0B4lSt" role="356sEH">
                  <property role="TrG5h" value="&lt;artifactId&gt;spring-boot-maven-plugin&lt;/artifactId&gt;" />
                </node>
                <node concept="2EixSi" id="33dPD0B4lSv" role="2EinRH" />
              </node>
            </node>
            <node concept="356sEK" id="33dPD0B4lSw" role="383Ya9">
              <node concept="356sEF" id="33dPD0B4lSx" role="356sEH">
                <property role="TrG5h" value="&lt;/plugin&gt;" />
              </node>
              <node concept="2EixSi" id="33dPD0B4lSz" role="2EinRH" />
            </node>
          </node>
          <node concept="356sEK" id="33dPD0B4lS$" role="383Ya9">
            <node concept="356sEF" id="33dPD0B4lS_" role="356sEH">
              <property role="TrG5h" value="&lt;/plugins&gt;" />
            </node>
            <node concept="2EixSi" id="33dPD0B4lSB" role="2EinRH" />
          </node>
        </node>
        <node concept="356sEK" id="33dPD0B4lSC" role="383Ya9">
          <node concept="356sEF" id="33dPD0B4lSD" role="356sEH">
            <property role="TrG5h" value="&lt;/build&gt;" />
          </node>
          <node concept="2EixSi" id="33dPD0B4lSF" role="2EinRH" />
        </node>
      </node>
      <node concept="356sEK" id="33dPD0B4lSG" role="383Ya9">
        <node concept="356sEF" id="33dPD0B4lSH" role="356sEH">
          <property role="TrG5h" value="&lt;/project&gt;" />
        </node>
        <node concept="2EixSi" id="33dPD0B4lSJ" role="2EinRH" />
      </node>
    </node>
    <node concept="n94m4" id="33dPD0B4fFO" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="312cEu" id="1s4BJy8H0qq">
    <property role="TrG5h" value="JwtAuthenticationFilter" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.security" />
    <node concept="3Tm1VV" id="1s4BJy8H0qr" role="1B3o_S" />
    <node concept="2AHcQZ" id="1s4BJy8H0qs" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Component" resolve="Component" />
    </node>
    <node concept="3uibUv" id="1s4BJy8H0qt" role="1zkMxy">
      <ref role="3uigEE" to="29ll:~OncePerRequestFilter" resolve="OncePerRequestFilter" />
    </node>
    <node concept="312cEg" id="1s4BJy8H0qu" role="jymVt">
      <property role="TrG5h" value="jwtService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="1s4BJy8H0qw" role="1tU5fm">
        <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
      </node>
      <node concept="3Tm6S6" id="1s4BJy8H0qx" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="1s4BJy8H0qy" role="jymVt">
      <property role="TrG5h" value="userDetailsService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="1s4BJy8H0q$" role="1tU5fm">
        <ref role="3uigEE" to="ay6n:~UserDetailsService" resolve="UserDetailsService" />
      </node>
      <node concept="3Tm6S6" id="1s4BJy8H0q_" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="1s4BJy8H0qA" role="jymVt">
      <node concept="3cqZAl" id="1s4BJy8H0qB" role="3clF45" />
      <node concept="37vLTG" id="1s4BJy8H0qC" role="3clF46">
        <property role="TrG5h" value="jwtService" />
        <node concept="3uibUv" id="1s4BJy8H0qD" role="1tU5fm">
          <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
        </node>
      </node>
      <node concept="37vLTG" id="1s4BJy8H0qE" role="3clF46">
        <property role="TrG5h" value="userDetailsService" />
        <node concept="3uibUv" id="1s4BJy8H0qF" role="1tU5fm">
          <ref role="3uigEE" to="ay6n:~UserDetailsService" resolve="UserDetailsService" />
        </node>
      </node>
      <node concept="3clFbS" id="1s4BJy8H0qG" role="3clF47">
        <node concept="3clFbF" id="1s4BJy8H0qH" role="3cqZAp">
          <node concept="37vLTI" id="1s4BJy8H0qI" role="3clFbG">
            <node concept="2OqwBi" id="1s4BJy8H0qJ" role="37vLTJ">
              <node concept="Xjq3P" id="1s4BJy8H0qK" role="2Oq$k0" />
              <node concept="2OwXpG" id="1s4BJy8H0qL" role="2OqNvi">
                <ref role="2Oxat5" node="1s4BJy8H0qu" resolve="jwtService" />
              </node>
            </node>
            <node concept="37vLTw" id="1s4BJy8H0qM" role="37vLTx">
              <ref role="3cqZAo" node="1s4BJy8H0qC" resolve="jwtService" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1s4BJy8H0qN" role="3cqZAp">
          <node concept="37vLTI" id="1s4BJy8H0qO" role="3clFbG">
            <node concept="2OqwBi" id="1s4BJy8H0qP" role="37vLTJ">
              <node concept="Xjq3P" id="1s4BJy8H0qQ" role="2Oq$k0" />
              <node concept="2OwXpG" id="1s4BJy8H0qR" role="2OqNvi">
                <ref role="2Oxat5" node="1s4BJy8H0qy" resolve="userDetailsService" />
              </node>
            </node>
            <node concept="37vLTw" id="1s4BJy8H0qS" role="37vLTx">
              <ref role="3cqZAo" node="1s4BJy8H0qE" resolve="userDetailsService" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1s4BJy8H0qT" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="1s4BJy8H0qU" role="jymVt">
      <property role="TrG5h" value="doFilterInternal" />
      <node concept="2AHcQZ" id="1s4BJy8H0qV" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="37vLTG" id="1s4BJy8H0qW" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="1s4BJy8H0qX" role="1tU5fm">
          <ref role="3uigEE" to="j1jh:~HttpServletRequest" resolve="HttpServletRequest" />
        </node>
      </node>
      <node concept="37vLTG" id="1s4BJy8H0qY" role="3clF46">
        <property role="TrG5h" value="response" />
        <node concept="3uibUv" id="1s4BJy8H0qZ" role="1tU5fm">
          <ref role="3uigEE" to="j1jh:~HttpServletResponse" resolve="HttpServletResponse" />
        </node>
      </node>
      <node concept="37vLTG" id="1s4BJy8H0r0" role="3clF46">
        <property role="TrG5h" value="filterChain" />
        <node concept="3uibUv" id="1s4BJy8H0r1" role="1tU5fm">
          <ref role="3uigEE" to="9yh5:~FilterChain" resolve="FilterChain" />
        </node>
      </node>
      <node concept="3uibUv" id="1s4BJy8H0r2" role="Sfmx6">
        <ref role="3uigEE" to="9yh5:~ServletException" resolve="ServletException" />
      </node>
      <node concept="3uibUv" id="1s4BJy8H0r3" role="Sfmx6">
        <ref role="3uigEE" to="guwi:~IOException" resolve="IOException" />
      </node>
      <node concept="3clFbS" id="1s4BJy8H0r4" role="3clF47">
        <node concept="3cpWs8" id="1s4BJy8H0r6" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8H0r5" role="3cpWs9">
            <property role="TrG5h" value="authorizationHeader" />
            <node concept="3uibUv" id="1s4BJy8H0r7" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="1s4BJy8H6Vi" role="33vP2m">
              <node concept="37vLTw" id="1s4BJy8H5Po" role="2Oq$k0">
                <ref role="3cqZAo" node="1s4BJy8H0qW" resolve="request" />
              </node>
              <node concept="liA8E" id="1s4BJy8H6Vj" role="2OqNvi">
                <ref role="37wK5l" to="j1jh:~HttpServletRequest.getHeader(java.lang.String)" resolve="getHeader" />
                <node concept="10M0yZ" id="1s4BJy8H8jR" role="37wK5m">
                  <ref role="1PxDUh" to="qd1r:~HttpHeaders" resolve="HttpHeaders" />
                  <ref role="3cqZAo" to="qd1r:~HttpHeaders.AUTHORIZATION" resolve="AUTHORIZATION" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="1s4BJy8H0ra" role="3cqZAp">
          <node concept="22lmx$" id="1s4BJy8H0rb" role="3clFbw">
            <node concept="3clFbC" id="1s4BJy8H0rc" role="3uHU7B">
              <node concept="37vLTw" id="1s4BJy8H0rd" role="3uHU7B">
                <ref role="3cqZAo" node="1s4BJy8H0r5" resolve="authorizationHeader" />
              </node>
              <node concept="10Nm6u" id="1s4BJy8H0re" role="3uHU7w" />
            </node>
            <node concept="3fqX7Q" id="1s4BJy8H0rf" role="3uHU7w">
              <node concept="2OqwBi" id="1s4BJy8H6x1" role="3fr31v">
                <node concept="37vLTw" id="1s4BJy8H5Sr" role="2Oq$k0">
                  <ref role="3cqZAo" node="1s4BJy8H0r5" resolve="authorizationHeader" />
                </node>
                <node concept="liA8E" id="1s4BJy8H6x2" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~String.startsWith(java.lang.String)" resolve="startsWith" />
                  <node concept="Xl_RD" id="1s4BJy8H6x3" role="37wK5m">
                    <property role="Xl_RC" value="Bearer " />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="1s4BJy8H0rj" role="3clFbx">
            <node concept="3clFbF" id="1s4BJy8H0rk" role="3cqZAp">
              <node concept="2OqwBi" id="1s4BJy8H7p_" role="3clFbG">
                <node concept="37vLTw" id="1s4BJy8H5PR" role="2Oq$k0">
                  <ref role="3cqZAo" node="1s4BJy8H0r0" resolve="filterChain" />
                </node>
                <node concept="liA8E" id="1s4BJy8H7pA" role="2OqNvi">
                  <ref role="37wK5l" to="9yh5:~FilterChain.doFilter(jakarta.servlet.ServletRequest,jakarta.servlet.ServletResponse)" resolve="doFilter" />
                  <node concept="37vLTw" id="1s4BJy8H7pB" role="37wK5m">
                    <ref role="3cqZAo" node="1s4BJy8H0qW" resolve="request" />
                  </node>
                  <node concept="37vLTw" id="1s4BJy8H7pC" role="37wK5m">
                    <ref role="3cqZAo" node="1s4BJy8H0qY" resolve="response" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs6" id="1s4BJy8H0ro" role="3cqZAp" />
          </node>
        </node>
        <node concept="3cpWs8" id="1s4BJy8H0rq" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8H0rp" role="3cpWs9">
            <property role="TrG5h" value="token" />
            <node concept="3uibUv" id="1s4BJy8H0rr" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="1s4BJy8H6Lm" role="33vP2m">
              <node concept="37vLTw" id="1s4BJy8H5Pt" role="2Oq$k0">
                <ref role="3cqZAo" node="1s4BJy8H0r5" resolve="authorizationHeader" />
              </node>
              <node concept="liA8E" id="1s4BJy8H6Ln" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.substring(int)" resolve="substring" />
                <node concept="3cmrfG" id="1s4BJy8H6Lo" role="37wK5m">
                  <property role="3cmrfH" value="7" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="1s4BJy8H0rv" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8H0ru" role="3cpWs9">
            <property role="TrG5h" value="username" />
            <node concept="3uibUv" id="1s4BJy8H0rw" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="1s4BJy8H79g" role="33vP2m">
              <node concept="37vLTw" id="1s4BJy8H5Pg" role="2Oq$k0">
                <ref role="3cqZAo" node="1s4BJy8H0qu" resolve="jwtService" />
              </node>
              <node concept="liA8E" id="1s4BJy8H79h" role="2OqNvi">
                <ref role="37wK5l" node="1s4BJy8oGdg" resolve="extractUsername" />
                <node concept="37vLTw" id="1s4BJy8H79i" role="37wK5m">
                  <ref role="3cqZAo" node="1s4BJy8H0rp" resolve="token" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="1s4BJy8H0rz" role="3cqZAp">
          <node concept="1Wc70l" id="1s4BJy8H0r$" role="3clFbw">
            <node concept="3y3z36" id="1s4BJy8H0r_" role="3uHU7B">
              <node concept="37vLTw" id="1s4BJy8H0rA" role="3uHU7B">
                <ref role="3cqZAo" node="1s4BJy8H0ru" resolve="username" />
              </node>
              <node concept="10Nm6u" id="1s4BJy8H0rB" role="3uHU7w" />
            </node>
            <node concept="3clFbC" id="1s4BJy8H0rC" role="3uHU7w">
              <node concept="2OqwBi" id="1s4BJy8H7Ea" role="3uHU7B">
                <node concept="2YIFZM" id="1s4BJy8H5P_" role="2Oq$k0">
                  <ref role="1Pybhc" to="f9d3:~SecurityContextHolder" resolve="SecurityContextHolder" />
                  <ref role="37wK5l" to="f9d3:~SecurityContextHolder.getContext()" resolve="getContext" />
                </node>
                <node concept="liA8E" id="1s4BJy8H7Eb" role="2OqNvi">
                  <ref role="37wK5l" to="f9d3:~SecurityContext.getAuthentication()" resolve="getAuthentication" />
                </node>
              </node>
              <node concept="10Nm6u" id="1s4BJy8H0rF" role="3uHU7w" />
            </node>
          </node>
          <node concept="3clFbS" id="1s4BJy8H0rH" role="3clFbx">
            <node concept="3cpWs8" id="1s4BJy8H0rJ" role="3cqZAp">
              <node concept="3cpWsn" id="1s4BJy8H0rI" role="3cpWs9">
                <property role="TrG5h" value="userDetails" />
                <node concept="3uibUv" id="1s4BJy8H0rK" role="1tU5fm">
                  <ref role="3uigEE" to="ay6n:~UserDetails" resolve="UserDetails" />
                </node>
                <node concept="2OqwBi" id="1s4BJy8H6Q6" role="33vP2m">
                  <node concept="37vLTw" id="1s4BJy8H5PF" role="2Oq$k0">
                    <ref role="3cqZAo" node="1s4BJy8H0qy" resolve="userDetailsService" />
                  </node>
                  <node concept="liA8E" id="1s4BJy8H6Q7" role="2OqNvi">
                    <ref role="37wK5l" to="ay6n:~UserDetailsService.loadUserByUsername(java.lang.String)" resolve="loadUserByUsername" />
                    <node concept="37vLTw" id="1s4BJy8H6Q8" role="37wK5m">
                      <ref role="3cqZAo" node="1s4BJy8H0ru" resolve="username" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="1s4BJy8H0rN" role="3cqZAp">
              <node concept="2OqwBi" id="1s4BJy8H7xE" role="3clFbw">
                <node concept="37vLTw" id="1s4BJy8H5Sl" role="2Oq$k0">
                  <ref role="3cqZAo" node="1s4BJy8H0qu" resolve="jwtService" />
                </node>
                <node concept="liA8E" id="1s4BJy8H7xF" role="2OqNvi">
                  <ref role="37wK5l" node="1s4BJy8oGdq" resolve="isTokenValid" />
                  <node concept="37vLTw" id="1s4BJy8H7xG" role="37wK5m">
                    <ref role="3cqZAo" node="1s4BJy8H0rp" resolve="token" />
                  </node>
                  <node concept="37vLTw" id="1s4BJy8H7xH" role="37wK5m">
                    <ref role="3cqZAo" node="1s4BJy8H0rI" resolve="userDetails" />
                  </node>
                </node>
              </node>
              <node concept="3clFbS" id="1s4BJy8H0rS" role="3clFbx">
                <node concept="3cpWs8" id="1s4BJy8H0rU" role="3cqZAp">
                  <node concept="3cpWsn" id="1s4BJy8H0rT" role="3cpWs9">
                    <property role="TrG5h" value="authentication" />
                    <node concept="3uibUv" id="1s4BJy8H0rV" role="1tU5fm">
                      <ref role="3uigEE" to="mwe7:~UsernamePasswordAuthenticationToken" resolve="UsernamePasswordAuthenticationToken" />
                    </node>
                    <node concept="2ShNRf" id="1s4BJy8H5PV" role="33vP2m">
                      <node concept="1pGfFk" id="1s4BJy8H5Sa" role="2ShVmc">
                        <ref role="37wK5l" to="mwe7:~UsernamePasswordAuthenticationToken.&lt;init&gt;(java.lang.Object,java.lang.Object,java.util.Collection)" resolve="UsernamePasswordAuthenticationToken" />
                        <node concept="37vLTw" id="1s4BJy8H5Sb" role="37wK5m">
                          <ref role="3cqZAo" node="1s4BJy8H0rI" resolve="userDetails" />
                        </node>
                        <node concept="10Nm6u" id="1s4BJy8H5Sc" role="37wK5m" />
                        <node concept="2OqwBi" id="1s4BJy8H6BL" role="37wK5m">
                          <node concept="37vLTw" id="1s4BJy8H5Se" role="2Oq$k0">
                            <ref role="3cqZAo" node="1s4BJy8H0rI" resolve="userDetails" />
                          </node>
                          <node concept="liA8E" id="1s4BJy8H6BM" role="2OqNvi">
                            <ref role="37wK5l" to="ay6n:~UserDetails.getAuthorities()" resolve="getAuthorities" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="1s4BJy8H0s0" role="3cqZAp">
                  <node concept="2OqwBi" id="1s4BJy8H6GY" role="3clFbG">
                    <node concept="37vLTw" id="1s4BJy8H5PK" role="2Oq$k0">
                      <ref role="3cqZAo" node="1s4BJy8H0rT" resolve="authentication" />
                    </node>
                    <node concept="liA8E" id="1s4BJy8H6GZ" role="2OqNvi">
                      <ref role="37wK5l" to="mwe7:~AbstractAuthenticationToken.setDetails(java.lang.Object)" resolve="setDetails" />
                      <node concept="2OqwBi" id="1s4BJy8H8jN" role="37wK5m">
                        <node concept="2ShNRf" id="1s4BJy8H6H1" role="2Oq$k0">
                          <node concept="1pGfFk" id="1s4BJy8H6H2" role="2ShVmc">
                            <ref role="37wK5l" to="pkux:~WebAuthenticationDetailsSource.&lt;init&gt;()" resolve="WebAuthenticationDetailsSource" />
                          </node>
                        </node>
                        <node concept="liA8E" id="1s4BJy8H8jO" role="2OqNvi">
                          <ref role="37wK5l" to="pkux:~WebAuthenticationDetailsSource.buildDetails(jakarta.servlet.http.HttpServletRequest)" resolve="buildDetails" />
                          <node concept="37vLTw" id="1s4BJy8H8jP" role="37wK5m">
                            <ref role="3cqZAo" node="1s4BJy8H0qW" resolve="request" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="1s4BJy8H0s5" role="3cqZAp">
                  <node concept="2OqwBi" id="1s4BJy8H70J" role="3clFbG">
                    <node concept="2YIFZM" id="1s4BJy8H5Sv" role="2Oq$k0">
                      <ref role="1Pybhc" to="f9d3:~SecurityContextHolder" resolve="SecurityContextHolder" />
                      <ref role="37wK5l" to="f9d3:~SecurityContextHolder.getContext()" resolve="getContext" />
                    </node>
                    <node concept="liA8E" id="1s4BJy8H70K" role="2OqNvi">
                      <ref role="37wK5l" to="f9d3:~SecurityContext.setAuthentication(org.springframework.security.core.Authentication)" resolve="setAuthentication" />
                      <node concept="37vLTw" id="1s4BJy8H70L" role="37wK5m">
                        <ref role="3cqZAo" node="1s4BJy8H0rT" resolve="authentication" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1s4BJy8H0s9" role="3cqZAp">
          <node concept="2OqwBi" id="1s4BJy8H7gw" role="3clFbG">
            <node concept="37vLTw" id="1s4BJy8H5Sg" role="2Oq$k0">
              <ref role="3cqZAo" node="1s4BJy8H0r0" resolve="filterChain" />
            </node>
            <node concept="liA8E" id="1s4BJy8H7gx" role="2OqNvi">
              <ref role="37wK5l" to="9yh5:~FilterChain.doFilter(jakarta.servlet.ServletRequest,jakarta.servlet.ServletResponse)" resolve="doFilter" />
              <node concept="37vLTw" id="1s4BJy8H7gy" role="37wK5m">
                <ref role="3cqZAo" node="1s4BJy8H0qW" resolve="request" />
              </node>
              <node concept="37vLTw" id="1s4BJy8H7gz" role="37wK5m">
                <ref role="3cqZAo" node="1s4BJy8H0qY" resolve="response" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="1s4BJy8H0sd" role="1B3o_S" />
      <node concept="3cqZAl" id="1s4BJy8H0se" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="1s4BJy8oGbX">
    <property role="TrG5h" value="JwtService" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.security" />
    <node concept="3Tm1VV" id="1s4BJy8oGbY" role="1B3o_S" />
    <node concept="2AHcQZ" id="1s4BJy8oGbZ" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Service" resolve="Service" />
    </node>
    <node concept="312cEg" id="1s4BJy8oGc0" role="jymVt">
      <property role="TrG5h" value="secret" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="1s4BJy8oGc2" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="1s4BJy8oGc3" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="1s4BJy8oGc4" role="jymVt">
      <property role="TrG5h" value="expirationMs" />
      <property role="3TUv4t" value="true" />
      <node concept="3cpWsb" id="1s4BJy8oGc6" role="1tU5fm" />
      <node concept="3Tm6S6" id="1s4BJy8oGc7" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="1s4BJy8oGc8" role="jymVt">
      <node concept="3cqZAl" id="1s4BJy8oGc9" role="3clF45" />
      <node concept="37vLTG" id="1s4BJy8oGca" role="3clF46">
        <property role="TrG5h" value="secret" />
        <node concept="2AHcQZ" id="1s4BJy8oGcb" role="2AJF6D">
          <ref role="2AI5Lk" to="b31h:~Value" resolve="Value" />
          <node concept="2B6LJw" id="1s4BJy8oGcc" role="2B76xF">
            <ref role="2B6OnR" to="b31h:~Value.value()" resolve="value" />
            <node concept="Xl_RD" id="1s4BJy8oGcd" role="2B70Vg">
              <property role="Xl_RC" value="${app.security.jwt.secret}" />
            </node>
          </node>
        </node>
        <node concept="3uibUv" id="1s4BJy8oGce" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="1s4BJy8oGcf" role="3clF46">
        <property role="TrG5h" value="expirationMs" />
        <node concept="2AHcQZ" id="1s4BJy8oGcg" role="2AJF6D">
          <ref role="2AI5Lk" to="b31h:~Value" resolve="Value" />
          <node concept="2B6LJw" id="1s4BJy8oGch" role="2B76xF">
            <ref role="2B6OnR" to="b31h:~Value.value()" resolve="value" />
            <node concept="Xl_RD" id="1s4BJy8oGci" role="2B70Vg">
              <property role="Xl_RC" value="${app.security.jwt.expiration-ms}" />
            </node>
          </node>
        </node>
        <node concept="3cpWsb" id="1s4BJy8oGcj" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="1s4BJy8oGck" role="3clF47">
        <node concept="3clFbF" id="1s4BJy8oGcl" role="3cqZAp">
          <node concept="37vLTI" id="1s4BJy8oGcm" role="3clFbG">
            <node concept="2OqwBi" id="1s4BJy8oGcn" role="37vLTJ">
              <node concept="Xjq3P" id="1s4BJy8oGco" role="2Oq$k0" />
              <node concept="2OwXpG" id="1s4BJy8oGcp" role="2OqNvi">
                <ref role="2Oxat5" node="1s4BJy8oGc0" resolve="secret" />
              </node>
            </node>
            <node concept="37vLTw" id="1s4BJy8oGcq" role="37vLTx">
              <ref role="3cqZAo" node="1s4BJy8oGca" resolve="secret" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1s4BJy8oGcr" role="3cqZAp">
          <node concept="37vLTI" id="1s4BJy8oGcs" role="3clFbG">
            <node concept="2OqwBi" id="1s4BJy8oGct" role="37vLTJ">
              <node concept="Xjq3P" id="1s4BJy8oGcu" role="2Oq$k0" />
              <node concept="2OwXpG" id="1s4BJy8oGcv" role="2OqNvi">
                <ref role="2Oxat5" node="1s4BJy8oGc4" resolve="expirationMs" />
              </node>
            </node>
            <node concept="37vLTw" id="1s4BJy8oGcw" role="37vLTx">
              <ref role="3cqZAo" node="1s4BJy8oGcf" resolve="expirationMs" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1s4BJy8oGcx" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="1s4BJy8oGcy" role="jymVt">
      <property role="TrG5h" value="generateToken" />
      <node concept="37vLTG" id="1s4BJy8oGcz" role="3clF46">
        <property role="TrG5h" value="userDetails" />
        <node concept="3uibUv" id="1s4BJy8oGc$" role="1tU5fm">
          <ref role="3uigEE" to="ay6n:~UserDetails" resolve="UserDetails" />
        </node>
      </node>
      <node concept="3clFbS" id="1s4BJy8oGc_" role="3clF47">
        <node concept="3cpWs8" id="1s4BJy8oGcB" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8oGcA" role="3cpWs9">
            <property role="TrG5h" value="now" />
            <node concept="3uibUv" id="1s4BJy8oGcC" role="1tU5fm">
              <ref role="3uigEE" to="28m1:~Instant" resolve="Instant" />
            </node>
            <node concept="2YIFZM" id="1s4BJy8oPvG" role="33vP2m">
              <ref role="1Pybhc" to="28m1:~Instant" resolve="Instant" />
              <ref role="37wK5l" to="28m1:~Instant.now()" resolve="now" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="1s4BJy8oGcF" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8oGcE" role="3cpWs9">
            <property role="TrG5h" value="roles" />
            <node concept="3uibUv" id="1s4BJy8oGcG" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~List" resolve="List" />
              <node concept="3uibUv" id="1s4BJy8oGcH" role="11_B2D">
                <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
                <node concept="3uibUv" id="1s4BJy8oGcI" role="11_B2D">
                  <ref role="3uigEE" to="wyt6:~String" resolve="String" />
                </node>
                <node concept="3uibUv" id="1s4BJy8oGcJ" role="11_B2D">
                  <ref role="3uigEE" to="wyt6:~String" resolve="String" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="1s4BJy8oZyx" role="33vP2m">
              <node concept="2OqwBi" id="1s4BJy8oX3t" role="2Oq$k0">
                <node concept="2OqwBi" id="1s4BJy8oUhd" role="2Oq$k0">
                  <node concept="2OqwBi" id="1s4BJy8oRPZ" role="2Oq$k0">
                    <node concept="37vLTw" id="1s4BJy8oPGE" role="2Oq$k0">
                      <ref role="3cqZAo" node="1s4BJy8oGcz" resolve="userDetails" />
                    </node>
                    <node concept="liA8E" id="1s4BJy8oRQ0" role="2OqNvi">
                      <ref role="37wK5l" to="ay6n:~UserDetails.getAuthorities()" resolve="getAuthorities" />
                    </node>
                  </node>
                  <node concept="liA8E" id="1s4BJy8oUhe" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Collection.stream()" resolve="stream" />
                  </node>
                </node>
                <node concept="liA8E" id="1s4BJy8oX3u" role="2OqNvi">
                  <ref role="37wK5l" to="1ctc:~Stream.map(java.util.function.Function)" resolve="map" />
                  <node concept="1bVj0M" id="1s4BJy8oX3v" role="37wK5m">
                    <node concept="37vLTG" id="1s4BJy8oX3w" role="1bW2Oz">
                      <property role="TrG5h" value="authority" />
                      <node concept="3VYd8j" id="1s4BJy8oX3x" role="1tU5fm" />
                    </node>
                    <node concept="3clFbS" id="1s4BJy8oX3y" role="1bW5cS">
                      <node concept="3clFbF" id="1s4BJy8oX3z" role="3cqZAp">
                        <node concept="2YIFZM" id="1s4BJy8puzT" role="3clFbG">
                          <ref role="37wK5l" to="33ny:~Map.of(java.lang.Object,java.lang.Object)" resolve="of" />
                          <ref role="1Pybhc" to="33ny:~Map" resolve="Map" />
                          <node concept="Xl_RD" id="1s4BJy8pwIU" role="37wK5m">
                            <property role="Xl_RC" value="authority" />
                          </node>
                          <node concept="2OqwBi" id="1s4BJy8pK6f" role="37wK5m">
                            <node concept="37vLTw" id="1s4BJy8pFUm" role="2Oq$k0">
                              <ref role="3cqZAo" node="1s4BJy8oX3w" resolve="authority" />
                            </node>
                            <node concept="liA8E" id="1s4BJy8pNu5" role="2OqNvi">
                              <ref role="37wK5l" to="sfae:~GrantedAuthority.getAuthority()" resolve="getAuthority" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="1s4BJy8oZyy" role="2OqNvi">
                <ref role="37wK5l" to="1ctc:~Stream.toList()" resolve="toList" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="1s4BJy8oGcW" role="3cqZAp">
          <node concept="2OqwBi" id="1s4BJy8p2xU" role="3cqZAk">
            <node concept="2OqwBi" id="1s4BJy8p1gp" role="2Oq$k0">
              <node concept="2OqwBi" id="1s4BJy8oZYu" role="2Oq$k0">
                <node concept="2OqwBi" id="1s4BJy8oXLZ" role="2Oq$k0">
                  <node concept="2OqwBi" id="1s4BJy8oTSA" role="2Oq$k0">
                    <node concept="2OqwBi" id="1s4BJy8oR2Y" role="2Oq$k0">
                      <node concept="2YIFZM" id="1s4BJy8oPvw" role="2Oq$k0">
                        <ref role="1Pybhc" to="5ej9:~Jwts" resolve="Jwts" />
                        <ref role="37wK5l" to="5ej9:~Jwts.builder()" resolve="builder" />
                      </node>
                      <node concept="liA8E" id="1s4BJy8oR2Z" role="2OqNvi">
                        <ref role="37wK5l" to="5ej9:~JwtBuilder.subject(java.lang.String)" resolve="subject" />
                        <node concept="2OqwBi" id="1s4BJy8oTdE" role="37wK5m">
                          <node concept="37vLTw" id="1s4BJy8oR31" role="2Oq$k0">
                            <ref role="3cqZAo" node="1s4BJy8oGcz" resolve="userDetails" />
                          </node>
                          <node concept="liA8E" id="1s4BJy8oTdF" role="2OqNvi">
                            <ref role="37wK5l" to="ay6n:~UserDetails.getUsername()" resolve="getUsername" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="1s4BJy8oTSB" role="2OqNvi">
                      <ref role="37wK5l" to="5ej9:~JwtBuilder.claim(java.lang.String,java.lang.Object)" resolve="claim" />
                      <node concept="Xl_RD" id="1s4BJy8oTSC" role="37wK5m">
                        <property role="Xl_RC" value="roles" />
                      </node>
                      <node concept="37vLTw" id="1s4BJy8oTSD" role="37wK5m">
                        <ref role="3cqZAo" node="1s4BJy8oGcE" resolve="roles" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="1s4BJy8oXM0" role="2OqNvi">
                    <ref role="37wK5l" to="5ej9:~JwtBuilder.issuedAt(java.util.Date)" resolve="issuedAt" />
                    <node concept="2YIFZM" id="1s4BJy8oXM1" role="37wK5m">
                      <ref role="1Pybhc" to="33ny:~Date" resolve="Date" />
                      <ref role="37wK5l" to="33ny:~Date.from(java.time.Instant)" resolve="from" />
                      <node concept="37vLTw" id="1s4BJy8oXM2" role="37wK5m">
                        <ref role="3cqZAo" node="1s4BJy8oGcA" resolve="now" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="1s4BJy8oZYv" role="2OqNvi">
                  <ref role="37wK5l" to="5ej9:~JwtBuilder.expiration(java.util.Date)" resolve="expiration" />
                  <node concept="2YIFZM" id="1s4BJy8oZYw" role="37wK5m">
                    <ref role="1Pybhc" to="33ny:~Date" resolve="Date" />
                    <ref role="37wK5l" to="33ny:~Date.from(java.time.Instant)" resolve="from" />
                    <node concept="2OqwBi" id="1s4BJy8oZYx" role="37wK5m">
                      <node concept="37vLTw" id="1s4BJy8oZYy" role="2Oq$k0">
                        <ref role="3cqZAo" node="1s4BJy8oGcA" resolve="now" />
                      </node>
                      <node concept="liA8E" id="1s4BJy8oZYz" role="2OqNvi">
                        <ref role="37wK5l" to="28m1:~Instant.plusMillis(long)" resolve="plusMillis" />
                        <node concept="37vLTw" id="1s4BJy8oZY$" role="37wK5m">
                          <ref role="3cqZAo" node="1s4BJy8oGc4" resolve="expirationMs" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="1s4BJy8p1gq" role="2OqNvi">
                <ref role="37wK5l" to="5ej9:~JwtBuilder.signWith(java.security.Key,io.jsonwebtoken.SignatureAlgorithm)" resolve="signWith" />
                <node concept="1rXfSq" id="1s4BJy8p1gr" role="37wK5m">
                  <ref role="37wK5l" node="1s4BJy8oGei" resolve="getSigningKey" />
                </node>
                <node concept="Rm8GO" id="1s4BJy8p1gs" role="37wK5m">
                  <ref role="1Px2BO" to="5ej9:~SignatureAlgorithm" resolve="SignatureAlgorithm" />
                  <ref role="Rm8GQ" to="5ej9:~SignatureAlgorithm.HS384" resolve="HS384" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="1s4BJy8p2xV" role="2OqNvi">
              <ref role="37wK5l" to="5ej9:~JwtBuilder.compact()" resolve="compact" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1s4BJy8oGde" role="1B3o_S" />
      <node concept="3uibUv" id="1s4BJy8oGdf" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="1s4BJy8oGdg" role="jymVt">
      <property role="TrG5h" value="extractUsername" />
      <node concept="37vLTG" id="1s4BJy8oGdh" role="3clF46">
        <property role="TrG5h" value="token" />
        <node concept="3uibUv" id="1s4BJy8oGdi" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="1s4BJy8oGdj" role="3clF47">
        <node concept="3clFbF" id="1s4BJy8pklt" role="3cqZAp">
          <node concept="2YIFZM" id="1s4BJy8pmlm" role="3clFbG">
            <ref role="37wK5l" to="33ny:~Map.of()" resolve="of" />
            <ref role="1Pybhc" to="33ny:~Map" resolve="Map" />
          </node>
        </node>
        <node concept="3cpWs6" id="1s4BJy8oGdk" role="3cqZAp">
          <node concept="1rXfSq" id="1s4BJy8oGdl" role="3cqZAk">
            <ref role="37wK5l" node="1s4BJy8oGdU" resolve="extractClaim" />
            <node concept="37vLTw" id="1s4BJy8oGdm" role="37wK5m">
              <ref role="3cqZAo" node="1s4BJy8oGdh" resolve="token" />
            </node>
            <node concept="37Ijox" id="1s4BJy8oRxZ" role="37wK5m">
              <ref role="37Ijqf" to="5ej9:~Claims.getSubject()" resolve="getSubject" />
              <node concept="2FaPjH" id="1s4BJy8oPvD" role="wWaWy">
                <node concept="3uibUv" id="1s4BJy8oPvC" role="2FaQuo">
                  <ref role="3uigEE" to="5ej9:~Claims" resolve="Claims" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1s4BJy8oGdo" role="1B3o_S" />
      <node concept="3uibUv" id="1s4BJy8oGdp" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="1s4BJy8oGdq" role="jymVt">
      <property role="TrG5h" value="isTokenValid" />
      <node concept="37vLTG" id="1s4BJy8oGdr" role="3clF46">
        <property role="TrG5h" value="token" />
        <node concept="3uibUv" id="1s4BJy8oGds" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="1s4BJy8oGdt" role="3clF46">
        <property role="TrG5h" value="userDetails" />
        <node concept="3uibUv" id="1s4BJy8oGdu" role="1tU5fm">
          <ref role="3uigEE" to="ay6n:~UserDetails" resolve="UserDetails" />
        </node>
      </node>
      <node concept="3clFbS" id="1s4BJy8oGdv" role="3clF47">
        <node concept="3cpWs8" id="1s4BJy8oGdx" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8oGdw" role="3cpWs9">
            <property role="TrG5h" value="username" />
            <node concept="3uibUv" id="1s4BJy8oGdy" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="1rXfSq" id="1s4BJy8oGdz" role="33vP2m">
              <ref role="37wK5l" node="1s4BJy8oGdg" resolve="extractUsername" />
              <node concept="37vLTw" id="1s4BJy8oGd$" role="37wK5m">
                <ref role="3cqZAo" node="1s4BJy8oGdr" resolve="token" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="1s4BJy8oGd_" role="3cqZAp">
          <node concept="1Wc70l" id="1s4BJy8oGdA" role="3cqZAk">
            <node concept="2OqwBi" id="1s4BJy8oSbA" role="3uHU7B">
              <node concept="37vLTw" id="1s4BJy8oPGe" role="2Oq$k0">
                <ref role="3cqZAo" node="1s4BJy8oGdw" resolve="username" />
              </node>
              <node concept="liA8E" id="1s4BJy8oSbB" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object)" resolve="equals" />
                <node concept="2OqwBi" id="1s4BJy8oTen" role="37wK5m">
                  <node concept="37vLTw" id="1s4BJy8oSbD" role="2Oq$k0">
                    <ref role="3cqZAo" node="1s4BJy8oGdt" resolve="userDetails" />
                  </node>
                  <node concept="liA8E" id="1s4BJy8oTeo" role="2OqNvi">
                    <ref role="37wK5l" to="ay6n:~UserDetails.getUsername()" resolve="getUsername" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3fqX7Q" id="1s4BJy8oGdD" role="3uHU7w">
              <node concept="1rXfSq" id="1s4BJy8oGdE" role="3fr31v">
                <ref role="37wK5l" node="1s4BJy8oGdI" resolve="isTokenExpired" />
                <node concept="37vLTw" id="1s4BJy8oGdF" role="37wK5m">
                  <ref role="3cqZAo" node="1s4BJy8oGdr" resolve="token" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1s4BJy8oGdG" role="1B3o_S" />
      <node concept="10P_77" id="1s4BJy8oGdH" role="3clF45" />
    </node>
    <node concept="3clFb_" id="1s4BJy8oGdI" role="jymVt">
      <property role="TrG5h" value="isTokenExpired" />
      <node concept="37vLTG" id="1s4BJy8oGdJ" role="3clF46">
        <property role="TrG5h" value="token" />
        <node concept="3uibUv" id="1s4BJy8oGdK" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="1s4BJy8oGdL" role="3clF47">
        <node concept="3cpWs6" id="1s4BJy8oGdM" role="3cqZAp">
          <node concept="2OqwBi" id="1s4BJy8oTE6" role="3cqZAk">
            <node concept="1rXfSq" id="1s4BJy8oGdO" role="2Oq$k0">
              <ref role="37wK5l" node="1s4BJy8oGdU" resolve="extractClaim" />
              <node concept="37vLTw" id="1s4BJy8oGdP" role="37wK5m">
                <ref role="3cqZAo" node="1s4BJy8oGdJ" resolve="token" />
              </node>
              <node concept="37Ijox" id="1s4BJy8oSpT" role="37wK5m">
                <ref role="37Ijqf" to="5ej9:~Claims.getExpiration()" resolve="getExpiration" />
                <node concept="2FaPjH" id="1s4BJy8oPvb" role="wWaWy">
                  <node concept="3uibUv" id="1s4BJy8oPva" role="2FaQuo">
                    <ref role="3uigEE" to="5ej9:~Claims" resolve="Claims" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="liA8E" id="1s4BJy8oTE7" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Date.before(java.util.Date)" resolve="before" />
              <node concept="2ShNRf" id="1s4BJy8oTE8" role="37wK5m">
                <node concept="1pGfFk" id="1s4BJy8oTE9" role="2ShVmc">
                  <ref role="37wK5l" to="33ny:~Date.&lt;init&gt;()" resolve="Date" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="1s4BJy8oGdS" role="1B3o_S" />
      <node concept="10P_77" id="1s4BJy8oGdT" role="3clF45" />
    </node>
    <node concept="3clFb_" id="1s4BJy8oGdU" role="jymVt">
      <property role="TrG5h" value="extractClaim" />
      <node concept="16euLQ" id="1s4BJy8oGdV" role="16eVyc">
        <property role="TrG5h" value="T" />
      </node>
      <node concept="37vLTG" id="1s4BJy8oGdW" role="3clF46">
        <property role="TrG5h" value="token" />
        <node concept="3uibUv" id="1s4BJy8oGdX" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="1s4BJy8oGdY" role="3clF46">
        <property role="TrG5h" value="claimsResolver" />
        <node concept="3uibUv" id="1s4BJy8oGdZ" role="1tU5fm">
          <ref role="3uigEE" to="82uw:~Function" resolve="Function" />
          <node concept="3uibUv" id="1s4BJy8oGe0" role="11_B2D">
            <ref role="3uigEE" to="5ej9:~Claims" resolve="Claims" />
          </node>
          <node concept="16syzq" id="1s4BJy8oGe1" role="11_B2D">
            <ref role="16sUi3" node="1s4BJy8oGdV" resolve="T" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="1s4BJy8oGe2" role="3clF47">
        <node concept="3cpWs8" id="1s4BJy8oGe4" role="3cqZAp">
          <node concept="3cpWsn" id="1s4BJy8oGe3" role="3cpWs9">
            <property role="TrG5h" value="claims" />
            <node concept="3uibUv" id="1s4BJy8oGe5" role="1tU5fm">
              <ref role="3uigEE" to="5ej9:~Claims" resolve="Claims" />
            </node>
            <node concept="2OqwBi" id="1s4BJy8p02n" role="33vP2m">
              <node concept="2OqwBi" id="1s4BJy8oXpa" role="2Oq$k0">
                <node concept="2OqwBi" id="1s4BJy8oTrM" role="2Oq$k0">
                  <node concept="2OqwBi" id="1s4BJy8oRFF" role="2Oq$k0">
                    <node concept="2YIFZM" id="1s4BJy8oPG3" role="2Oq$k0">
                      <ref role="1Pybhc" to="5ej9:~Jwts" resolve="Jwts" />
                      <ref role="37wK5l" to="5ej9:~Jwts.parser()" resolve="parser" />
                    </node>
                    <node concept="liA8E" id="1s4BJy8oRFG" role="2OqNvi">
                      <ref role="37wK5l" to="5ej9:~JwtParserBuilder.verifyWith(javax.crypto.SecretKey)" resolve="verifyWith" />
                      <node concept="1rXfSq" id="1s4BJy8oRFH" role="37wK5m">
                        <ref role="37wK5l" node="1s4BJy8oGei" resolve="getSigningKey" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="1s4BJy8oTrN" role="2OqNvi">
                    <ref role="37wK5l" to="5ej9:~JwtParserBuilder.build()" resolve="build" />
                  </node>
                </node>
                <node concept="liA8E" id="1s4BJy8oXpb" role="2OqNvi">
                  <ref role="37wK5l" to="5ej9:~JwtParser.parseSignedClaims(java.lang.CharSequence)" resolve="parseSignedClaims" />
                  <node concept="37vLTw" id="1s4BJy8oXpc" role="37wK5m">
                    <ref role="3cqZAo" node="1s4BJy8oGdW" resolve="token" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="1s4BJy8p02o" role="2OqNvi">
                <ref role="37wK5l" to="5ej9:~Jwt.getPayload()" resolve="getPayload" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="1s4BJy8oGed" role="3cqZAp">
          <node concept="2OqwBi" id="1s4BJy8oRn0" role="3cqZAk">
            <node concept="37vLTw" id="1s4BJy8oPvn" role="2Oq$k0">
              <ref role="3cqZAo" node="1s4BJy8oGdY" resolve="claimsResolver" />
            </node>
            <node concept="liA8E" id="1s4BJy8oRn1" role="2OqNvi">
              <ref role="37wK5l" to="82uw:~Function.apply(java.lang.Object)" resolve="apply" />
              <node concept="37vLTw" id="1s4BJy8oRn2" role="37wK5m">
                <ref role="3cqZAo" node="1s4BJy8oGe3" resolve="claims" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="1s4BJy8oGeg" role="1B3o_S" />
      <node concept="16syzq" id="1s4BJy8oGeh" role="3clF45">
        <ref role="16sUi3" node="1s4BJy8oGdV" resolve="T" />
      </node>
    </node>
    <node concept="3clFb_" id="1s4BJy8oGei" role="jymVt">
      <property role="TrG5h" value="getSigningKey" />
      <node concept="3clFbS" id="1s4BJy8oGej" role="3clF47">
        <node concept="3cpWs6" id="1s4BJy8oGek" role="3cqZAp">
          <node concept="2YIFZM" id="1s4BJy8oPGU" role="3cqZAk">
            <ref role="1Pybhc" to="qrsp:~Keys" resolve="Keys" />
            <ref role="37wK5l" to="qrsp:~Keys.hmacShaKeyFor(byte[])" resolve="hmacShaKeyFor" />
            <node concept="2OqwBi" id="1s4BJy8oRb4" role="37wK5m">
              <node concept="37vLTw" id="1s4BJy8oPGW" role="2Oq$k0">
                <ref role="3cqZAo" node="1s4BJy8oGc0" resolve="secret" />
              </node>
              <node concept="liA8E" id="1s4BJy8oRb5" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.getBytes(java.nio.charset.Charset)" resolve="getBytes" />
                <node concept="10M0yZ" id="1s4BJy8qbOR" role="37wK5m">
                  <ref role="3cqZAo" to="7x5y:~StandardCharsets.UTF_8" resolve="UTF_8" />
                  <ref role="1PxDUh" to="7x5y:~StandardCharsets" resolve="StandardCharsets" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="1s4BJy8oGeo" role="1B3o_S" />
      <node concept="3uibUv" id="1s4BJy8oGep" role="3clF45">
        <ref role="3uigEE" to="pfyx:~SecretKey" resolve="SecretKey" />
      </node>
    </node>
    <node concept="n94m4" id="1s4BJy8zCdr" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="356sEV" id="33dPD0BeUr0">
    <property role="TrG5h" value="application" />
    <property role="3Le9LX" value=".properties" />
    <property role="3GE5qa" value="" />
    <node concept="356WMU" id="33dPD0BeZhZ" role="356KY_">
      <node concept="356sEK" id="33dPD0BeZi0" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZi1" role="356sEH">
          <property role="TrG5h" value="spring.application.name=amazon-backend" />
          <node concept="17Uvod" id="33dPD0BeZvW" role="lGtFl">
            <property role="2qtEX9" value="name" />
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <node concept="3zFVjK" id="33dPD0BeZvX" role="3zH0cK">
              <node concept="3clFbS" id="33dPD0BeZvY" role="2VODD2">
                <node concept="3clFbF" id="33dPD0BeZMG" role="3cqZAp">
                  <node concept="3cpWs3" id="33dPD0Bff9g" role="3clFbG">
                    <node concept="Xl_RD" id="33dPD0BffDh" role="3uHU7w">
                      <property role="Xl_RC" value="-backend" />
                    </node>
                    <node concept="3cpWs3" id="33dPD0Bf4YR" role="3uHU7B">
                      <node concept="Xl_RD" id="33dPD0Bf1bZ" role="3uHU7B">
                        <property role="Xl_RC" value="spring.application.name=" />
                      </node>
                      <node concept="2OqwBi" id="33dPD0Bf5Lb" role="3uHU7w">
                        <node concept="30H73N" id="33dPD0Bf5bV" role="2Oq$k0" />
                        <node concept="3TrcHB" id="33dPD0Bf6W_" role="2OqNvi">
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
        <node concept="2EixSi" id="33dPD0BeZi3" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZi4" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZi5" role="356sEH">
          <property role="TrG5h" value="server.port=8081" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZi7" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZi8" role="383Ya9">
        <node concept="2EixSi" id="33dPD0BeZib" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZic" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZid" role="356sEH">
          <property role="TrG5h" value="spring.datasource.url=jdbc:h2:file:./data/amazonappdb" />
          <node concept="17Uvod" id="33dPD0Bfikm" role="lGtFl">
            <property role="2qtEX9" value="name" />
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <node concept="3zFVjK" id="33dPD0Bfikn" role="3zH0cK">
              <node concept="3clFbS" id="33dPD0Bfiko" role="2VODD2">
                <node concept="3clFbF" id="33dPD0BfiBv" role="3cqZAp">
                  <node concept="3cpWs3" id="33dPD0Bfru3" role="3clFbG">
                    <node concept="Xl_RD" id="33dPD0Bfru7" role="3uHU7w">
                      <property role="Xl_RC" value="appdb" />
                    </node>
                    <node concept="3cpWs3" id="33dPD0BfnAr" role="3uHU7B">
                      <node concept="Xl_RD" id="33dPD0BfiBu" role="3uHU7B">
                        <property role="Xl_RC" value="spring.datasource.url=jdbc:h2:file:./data/" />
                      </node>
                      <node concept="2OqwBi" id="33dPD0BfowF" role="3uHU7w">
                        <node concept="30H73N" id="33dPD0BfnTH" role="2Oq$k0" />
                        <node concept="3TrcHB" id="33dPD0BfprF" role="2OqNvi">
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
        <node concept="2EixSi" id="33dPD0BeZif" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZig" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZih" role="356sEH">
          <property role="TrG5h" value="spring.datasource.driver-class-name=org.h2.Driver" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZij" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZik" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZil" role="356sEH">
          <property role="TrG5h" value="spring.datasource.username=sa" />
          <node concept="17Uvod" id="33dPD0BfE3q" role="lGtFl">
            <property role="2qtEX9" value="name" />
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <node concept="3zFVjK" id="33dPD0BfE3r" role="3zH0cK">
              <node concept="3clFbS" id="33dPD0BfE3s" role="2VODD2">
                <node concept="3clFbF" id="33dPD0BfEyA" role="3cqZAp">
                  <node concept="3cpWs3" id="33dPD0BfIxW" role="3clFbG">
                    <node concept="2OqwBi" id="33dPD0BfJyn" role="3uHU7w">
                      <node concept="30H73N" id="33dPD0BfIVs" role="2Oq$k0" />
                      <node concept="3TrcHB" id="33dPD0BfJU2" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                    <node concept="Xl_RD" id="33dPD0BfEy_" role="3uHU7B">
                      <property role="Xl_RC" value="spring.datasource.username=" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2EixSi" id="33dPD0BeZin" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZio" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZip" role="356sEH">
          <property role="TrG5h" value="spring.datasource.password=" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZir" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZis" role="383Ya9">
        <node concept="2EixSi" id="33dPD0BeZiv" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiw" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZix" role="356sEH">
          <property role="TrG5h" value="spring.h2.console.enabled=true" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZiz" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZi$" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZi_" role="356sEH">
          <property role="TrG5h" value="spring.h2.console.path=/h2-console" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZiB" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiC" role="383Ya9">
        <node concept="2EixSi" id="33dPD0BeZiF" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiG" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZiH" role="356sEH">
          <property role="TrG5h" value="spring.jpa.hibernate.ddl-auto=update" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZiJ" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiK" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZiL" role="356sEH">
          <property role="TrG5h" value="spring.jpa.open-in-view=false" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZiN" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiO" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZiP" role="356sEH">
          <property role="TrG5h" value="spring.jpa.properties.hibernate.format_sql=true" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZiR" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiS" role="383Ya9">
        <node concept="2EixSi" id="33dPD0BeZiV" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZiW" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZiX" role="356sEH">
          <property role="TrG5h" value="spring.sql.init.mode=never" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZiZ" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZj0" role="383Ya9">
        <node concept="2EixSi" id="33dPD0BeZj3" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZj4" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZj5" role="356sEH">
          <property role="TrG5h" value="app.h2.tcp.enabled=true" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZj7" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZj8" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZj9" role="356sEH">
          <property role="TrG5h" value="app.security.jwt.secret=amazon-ref-jwt-secret-key-that-is-long-enough-for-hs384-signing-2026" />
          <node concept="17Uvod" id="33dPD0BfszV" role="lGtFl">
            <property role="2qtEX9" value="name" />
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <node concept="3zFVjK" id="33dPD0BfszW" role="3zH0cK">
              <node concept="3clFbS" id="33dPD0BfszX" role="2VODD2">
                <node concept="3clFbF" id="33dPD0Bft3w" role="3cqZAp">
                  <node concept="3cpWs3" id="33dPD0Bfy_4" role="3clFbG">
                    <node concept="Xl_RD" id="33dPD0BfyZa" role="3uHU7w">
                      <property role="Xl_RC" value="-jwt-secret-key-that-is-long-enough-for-hs384-signing-2026" />
                    </node>
                    <node concept="3cpWs3" id="33dPD0BfuO0" role="3uHU7B">
                      <node concept="Xl_RD" id="33dPD0Bft3v" role="3uHU7B">
                        <property role="Xl_RC" value="app.security.jwt.secret=" />
                      </node>
                      <node concept="2OqwBi" id="33dPD0BfvO4" role="3uHU7w">
                        <node concept="30H73N" id="33dPD0Bfv7i" role="2Oq$k0" />
                        <node concept="3TrcHB" id="33dPD0BfwH9" role="2OqNvi">
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
        <node concept="2EixSi" id="33dPD0BeZjb" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZjc" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZjd" role="356sEH">
          <property role="TrG5h" value="app.security.jwt.expiration-ms=86400000" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZjf" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZjg" role="383Ya9">
        <node concept="2EixSi" id="33dPD0BeZjj" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZjk" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZjl" role="356sEH">
          <property role="TrG5h" value="app.moderation.scheduler.enabled=true" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZjn" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZjo" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZjp" role="356sEH">
          <property role="TrG5h" value="app.moderation.scheduler.fixed-delay-ms=60000" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZjr" role="2EinRH" />
      </node>
      <node concept="356sEK" id="33dPD0BeZjs" role="383Ya9">
        <node concept="356sEF" id="33dPD0BeZjt" role="356sEH">
          <property role="TrG5h" value="app.moderation.scheduler.initial-delay-ms=10000" />
        </node>
        <node concept="2EixSi" id="33dPD0BeZjv" role="2EinRH" />
      </node>
    </node>
    <node concept="n94m4" id="33dPD0BeUr2" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="312cEu" id="2BbHItUQICK">
    <property role="TrG5h" value="AuthenticationService" />
    <node concept="3Tm1VV" id="2BbHItUQICL" role="1B3o_S" />
    <node concept="2AHcQZ" id="2BbHItUQICM" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Service" resolve="Service" />
    </node>
    <node concept="3uibUv" id="2BbHItUQNrT" role="1zkMxy">
      <ref role="3uigEE" node="2BbHItUQNaI" resolve="GeneratedAuthenticationService" />
    </node>
    <node concept="3clFbW" id="2BbHItUQICO" role="jymVt">
      <node concept="3cqZAl" id="2BbHItUQICP" role="3clF45" />
      <node concept="37vLTG" id="2BbHItUQICQ" role="3clF46">
        <property role="TrG5h" value="amazonUserRepository" />
        <node concept="3uibUv" id="2BbHItUQICR" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItUQNKJ" resolve="AmazonUserRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQICS" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="2BbHItUQICT" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQICU" role="3clF46">
        <property role="TrG5h" value="authenticationManager" />
        <node concept="3uibUv" id="2BbHItUQICV" role="1tU5fm">
          <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQICW" role="3clF46">
        <property role="TrG5h" value="jwtService" />
        <node concept="3uibUv" id="2BbHItUQICX" role="1tU5fm">
          <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQICY" role="3clF47">
        <node concept="XkiVB" id="2BbHItUQNr2" role="3cqZAp">
          <ref role="37wK5l" node="2BbHItUQNb3" resolve="GeneratedAuthenticationService" />
          <node concept="37vLTw" id="2BbHItUQNr3" role="37wK5m">
            <ref role="3cqZAo" node="2BbHItUQICQ" resolve="amazonUserRepository" />
          </node>
          <node concept="37vLTw" id="2BbHItUQNr4" role="37wK5m">
            <ref role="3cqZAo" node="2BbHItUQICS" resolve="passwordEncoder" />
          </node>
          <node concept="37vLTw" id="2BbHItUQNr5" role="37wK5m">
            <ref role="3cqZAo" node="2BbHItUQICU" resolve="authenticationManager" />
          </node>
          <node concept="37vLTw" id="2BbHItUQNr6" role="37wK5m">
            <ref role="3cqZAo" node="2BbHItUQICW" resolve="jwtService" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItUQID4" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="2BbHItUQNaI">
    <property role="TrG5h" value="GeneratedAuthenticationService" />
    <property role="1sVAO0" value="true" />
    <node concept="3Tm1VV" id="2BbHItUQNaJ" role="1B3o_S" />
    <node concept="2AHcQZ" id="2BbHItUQNaK" role="2AJF6D">
      <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      <node concept="2B6LJw" id="2BbHItUQNaL" role="2B76xF">
        <ref role="2B6OnR" to="u35y:~Transactional.readOnly()" resolve="readOnly" />
        <node concept="3clFbT" id="2BbHItUQNaM" role="2B70Vg">
          <property role="3clFbU" value="true" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="2BbHItUQNaN" role="jymVt">
      <property role="TrG5h" value="amazonUserRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2BbHItUQNaP" role="1tU5fm">
        <ref role="3uigEE" to=":^" resolve="AmazonUserRepository" />
      </node>
      <node concept="3Tm6S6" id="2BbHItUQNaQ" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="2BbHItUQNaR" role="jymVt">
      <property role="TrG5h" value="passwordEncoder" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2BbHItUQNaT" role="1tU5fm">
        <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
      </node>
      <node concept="3Tm6S6" id="2BbHItUQNaU" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="2BbHItUQNaV" role="jymVt">
      <property role="TrG5h" value="authenticationManager" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2BbHItUQNaX" role="1tU5fm">
        <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
      </node>
      <node concept="3Tm6S6" id="2BbHItUQNaY" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="2BbHItUQNaZ" role="jymVt">
      <property role="TrG5h" value="jwtService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2BbHItUQNb1" role="1tU5fm">
        <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
      </node>
      <node concept="3Tm6S6" id="2BbHItUQNb2" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2BbHItUQNb3" role="jymVt">
      <node concept="3cqZAl" id="2BbHItUQNb4" role="3clF45" />
      <node concept="37vLTG" id="2BbHItUQNb5" role="3clF46">
        <property role="TrG5h" value="amazonUserRepository" />
        <node concept="3uibUv" id="2BbHItUQNb6" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUserRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQNb7" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="2BbHItUQNb8" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQNb9" role="3clF46">
        <property role="TrG5h" value="authenticationManager" />
        <node concept="3uibUv" id="2BbHItUQNba" role="1tU5fm">
          <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQNbb" role="3clF46">
        <property role="TrG5h" value="jwtService" />
        <node concept="3uibUv" id="2BbHItUQNbc" role="1tU5fm">
          <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNbd" role="3clF47">
        <node concept="3clFbF" id="2BbHItUQNbe" role="3cqZAp">
          <node concept="37vLTI" id="2BbHItUQNbf" role="3clFbG">
            <node concept="2OqwBi" id="2BbHItUQNbg" role="37vLTJ">
              <node concept="Xjq3P" id="2BbHItUQNbh" role="2Oq$k0" />
              <node concept="2OwXpG" id="2BbHItUQNbi" role="2OqNvi">
                <ref role="2Oxat5" node="2BbHItUQNaN" resolve="amazonUserRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="2BbHItUQNbj" role="37vLTx">
              <ref role="3cqZAo" node="2BbHItUQNb5" resolve="amazonUserRepository" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNbk" role="3cqZAp">
          <node concept="37vLTI" id="2BbHItUQNbl" role="3clFbG">
            <node concept="2OqwBi" id="2BbHItUQNbm" role="37vLTJ">
              <node concept="Xjq3P" id="2BbHItUQNbn" role="2Oq$k0" />
              <node concept="2OwXpG" id="2BbHItUQNbo" role="2OqNvi">
                <ref role="2Oxat5" node="2BbHItUQNaR" resolve="passwordEncoder" />
              </node>
            </node>
            <node concept="37vLTw" id="2BbHItUQNbp" role="37vLTx">
              <ref role="3cqZAo" node="2BbHItUQNb7" resolve="passwordEncoder" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNbq" role="3cqZAp">
          <node concept="37vLTI" id="2BbHItUQNbr" role="3clFbG">
            <node concept="2OqwBi" id="2BbHItUQNbs" role="37vLTJ">
              <node concept="Xjq3P" id="2BbHItUQNbt" role="2Oq$k0" />
              <node concept="2OwXpG" id="2BbHItUQNbu" role="2OqNvi">
                <ref role="2Oxat5" node="2BbHItUQNaV" resolve="authenticationManager" />
              </node>
            </node>
            <node concept="37vLTw" id="2BbHItUQNbv" role="37vLTx">
              <ref role="3cqZAo" node="2BbHItUQNb9" resolve="authenticationManager" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNbw" role="3cqZAp">
          <node concept="37vLTI" id="2BbHItUQNbx" role="3clFbG">
            <node concept="2OqwBi" id="2BbHItUQNby" role="37vLTJ">
              <node concept="Xjq3P" id="2BbHItUQNbz" role="2Oq$k0" />
              <node concept="2OwXpG" id="2BbHItUQNb$" role="2OqNvi">
                <ref role="2Oxat5" node="2BbHItUQNaZ" resolve="jwtService" />
              </node>
            </node>
            <node concept="37vLTw" id="2BbHItUQNb_" role="37vLTx">
              <ref role="3cqZAo" node="2BbHItUQNbb" resolve="jwtService" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2BbHItUQNbA" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2BbHItUQNbB" role="jymVt">
      <property role="TrG5h" value="register" />
      <node concept="2AHcQZ" id="2BbHItUQNbC" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2BbHItUQNbD" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="2BbHItUQNbE" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUser" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNbF" role="3clF47">
        <node concept="3cpWs8" id="2BbHItUQNbH" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNbG" role="3cpWs9">
            <property role="TrG5h" value="credentials" />
            <node concept="3uibUv" id="2BbHItUQNbI" role="1tU5fm">
              <ref role="3uigEE" to=":^" resolve="Credentials" />
            </node>
            <node concept="1rXfSq" id="2BbHItUQNbJ" role="33vP2m">
              <ref role="37wK5l" node="2BbHItUQNcX" resolve="validateRequest" />
              <node concept="37vLTw" id="2BbHItUQNbK" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItUQNbD" resolve="request" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="2BbHItUQNbL" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNbM" role="3clFbw">
            <property role="10XrrR" value="existsByUsername" />
            <property role="1CJj6V" value="amazonUserRepository" />
            <node concept="Wc6QR" id="2BbHItUQNbN" role="37wK5m">
              <property role="10XrrR" value="username" />
              <property role="1CJj6V" value="credentials" />
            </node>
          </node>
          <node concept="3clFbS" id="2BbHItUQNbP" role="3clFbx">
            <node concept="YS8fn" id="2BbHItUQNbS" role="3cqZAp">
              <node concept="31S9pk" id="2BbHItUQNbQ" role="YScLw">
                <property role="31Ss8R" value="IllegalStateException" />
                <node concept="Xl_RD" id="2BbHItUQNbR" role="37wK5m">
                  <property role="Xl_RC" value="Username already exists." />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="2BbHItUQNbU" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNbT" role="3cpWs9">
            <property role="TrG5h" value="user" />
            <node concept="3uibUv" id="2BbHItUQNbV" role="1tU5fm">
              <ref role="3uigEE" to=":^" resolve="AmazonUser" />
            </node>
            <node concept="31S9pk" id="2BbHItUQNbW" role="33vP2m">
              <property role="31Ss8R" value="AmazonUser" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNbX" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNbY" role="3clFbG">
            <property role="10XrrR" value="setUsername" />
            <property role="1CJj6V" value="user" />
            <node concept="Wc6QR" id="2BbHItUQNbZ" role="37wK5m">
              <property role="10XrrR" value="username" />
              <property role="1CJj6V" value="credentials" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNc0" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNc1" role="3clFbG">
            <property role="10XrrR" value="setPassword" />
            <property role="1CJj6V" value="user" />
            <node concept="Wc6QR" id="2BbHItUQNc2" role="37wK5m">
              <property role="10XrrR" value="encode" />
              <property role="1CJj6V" value="passwordEncoder" />
              <node concept="Wc6QR" id="2BbHItUQNc3" role="37wK5m">
                <property role="10XrrR" value="password" />
                <property role="1CJj6V" value="credentials" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNc4" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNc5" role="3clFbG">
            <property role="10XrrR" value="setRole" />
            <property role="1CJj6V" value="user" />
            <node concept="3yEOSi" id="2BbHItUQNc6" role="37wK5m">
              <property role="1CJj6V" value="Role.BUYER" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNc7" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNc8" role="3clFbG">
            <property role="10XrrR" value="setVerifiedBuyer" />
            <property role="1CJj6V" value="user" />
            <node concept="3clFbT" id="2BbHItUQNc9" role="37wK5m" />
          </node>
        </node>
        <node concept="3cpWs8" id="2BbHItUQNcb" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNca" role="3cpWs9">
            <property role="TrG5h" value="savedUser" />
            <node concept="3uibUv" id="2BbHItUQNcc" role="1tU5fm">
              <ref role="3uigEE" to=":^" resolve="AmazonUser" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNcd" role="33vP2m">
              <property role="10XrrR" value="save" />
              <property role="1CJj6V" value="amazonUserRepository" />
              <node concept="37vLTw" id="2BbHItUQNce" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItUQNbT" resolve="user" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNcf" role="3cqZAp">
          <node concept="1rXfSq" id="2BbHItUQNcg" role="3clFbG">
            <ref role="37wK5l" node="2BbHItUQNcR" resolve="afterRegister" />
            <node concept="37vLTw" id="2BbHItUQNch" role="37wK5m">
              <ref role="3cqZAo" node="2BbHItUQNca" resolve="savedUser" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2BbHItUQNci" role="3cqZAp">
          <node concept="1rXfSq" id="2BbHItUQNcj" role="3cqZAk">
            <ref role="37wK5l" node="2BbHItUQNdL" resolve="toAuthenticationResult" />
            <node concept="37vLTw" id="2BbHItUQNck" role="37wK5m">
              <ref role="3cqZAo" node="2BbHItUQNca" resolve="savedUser" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItUQNcl" role="1B3o_S" />
      <node concept="3uibUv" id="2BbHItUQNcm" role="3clF45">
        <ref role="3uigEE" to=":^" resolve="AuthenticationResult" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItUQNcn" role="jymVt">
      <property role="TrG5h" value="login" />
      <node concept="37vLTG" id="2BbHItUQNco" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="2BbHItUQNcp" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUser" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNcq" role="3clF47">
        <node concept="3cpWs8" id="2BbHItUQNcs" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNcr" role="3cpWs9">
            <property role="TrG5h" value="credentials" />
            <node concept="3uibUv" id="2BbHItUQNct" role="1tU5fm">
              <ref role="3uigEE" to=":^" resolve="Credentials" />
            </node>
            <node concept="1rXfSq" id="2BbHItUQNcu" role="33vP2m">
              <ref role="37wK5l" node="2BbHItUQNcX" resolve="validateRequest" />
              <node concept="37vLTw" id="2BbHItUQNcv" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItUQNco" resolve="request" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItUQNcw" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNcx" role="3clFbG">
            <property role="10XrrR" value="authenticate" />
            <property role="1CJj6V" value="authenticationManager" />
            <node concept="31S9pk" id="2BbHItUQNcy" role="37wK5m">
              <property role="31Ss8R" value="UsernamePasswordAuthenticationToken" />
              <node concept="Wc6QR" id="2BbHItUQNcz" role="37wK5m">
                <property role="10XrrR" value="username" />
                <property role="1CJj6V" value="credentials" />
              </node>
              <node concept="Wc6QR" id="2BbHItUQNc$" role="37wK5m">
                <property role="10XrrR" value="password" />
                <property role="1CJj6V" value="credentials" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="2BbHItUQNcA" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNc_" role="3cpWs9">
            <property role="TrG5h" value="user" />
            <node concept="3uibUv" id="2BbHItUQNcB" role="1tU5fm">
              <ref role="3uigEE" to=":^" resolve="AmazonUser" />
            </node>
            <node concept="35GP8o" id="2BbHItUQNcC" role="33vP2m">
              <property role="10XrrR" value="orElseThrow" />
              <node concept="Wc6QR" id="2BbHItUQNcD" role="35GOzl">
                <property role="10XrrR" value="findByUsername" />
                <property role="1CJj6V" value="amazonUserRepository" />
                <node concept="Wc6QR" id="2BbHItUQNcE" role="37wK5m">
                  <property role="10XrrR" value="username" />
                  <property role="1CJj6V" value="credentials" />
                </node>
              </node>
              <node concept="1bVj0M" id="2BbHItUQNcF" role="37wK5m">
                <node concept="3clFbS" id="2BbHItUQNcL" role="1bW5cS">
                  <node concept="3clFbF" id="2BbHItUQNcG" role="3cqZAp">
                    <node concept="31S9pk" id="2BbHItUQNcH" role="3clFbG">
                      <property role="31Ss8R" value="ResourceNotFoundException" />
                      <node concept="35GP8o" id="2BbHItUQNcI" role="37wK5m">
                        <property role="10XrrR" value="formatted" />
                        <node concept="Xl_RD" id="2BbHItUQNcJ" role="35GOzl">
                          <property role="Xl_RC" value="User '%s' was not found." />
                        </node>
                        <node concept="Wc6QR" id="2BbHItUQNcK" role="37wK5m">
                          <property role="10XrrR" value="username" />
                          <property role="1CJj6V" value="credentials" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2BbHItUQNcM" role="3cqZAp">
          <node concept="1rXfSq" id="2BbHItUQNcN" role="3cqZAk">
            <ref role="37wK5l" node="2BbHItUQNdL" resolve="toAuthenticationResult" />
            <node concept="37vLTw" id="2BbHItUQNcO" role="37wK5m">
              <ref role="3cqZAo" node="2BbHItUQNc_" resolve="user" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItUQNcP" role="1B3o_S" />
      <node concept="3uibUv" id="2BbHItUQNcQ" role="3clF45">
        <ref role="3uigEE" to=":^" resolve="AuthenticationResult" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItUQNcR" role="jymVt">
      <property role="TrG5h" value="afterRegister" />
      <node concept="37vLTG" id="2BbHItUQNcS" role="3clF46">
        <property role="TrG5h" value="savedUser" />
        <node concept="3uibUv" id="2BbHItUQNcT" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUser" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNcU" role="3clF47" />
      <node concept="3Tmbuc" id="2BbHItUQNcV" role="1B3o_S" />
      <node concept="3cqZAl" id="2BbHItUQNcW" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2BbHItUQNcX" role="jymVt">
      <property role="TrG5h" value="validateRequest" />
      <node concept="37vLTG" id="2BbHItUQNcY" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="2BbHItUQNcZ" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUser" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNd0" role="3clF47">
        <node concept="3clFbF" id="2BbHItUQNd1" role="3cqZAp">
          <node concept="Wc6QR" id="2BbHItUQNd2" role="3clFbG">
            <property role="10XrrR" value="requireNonNull" />
            <property role="1CJj6V" value="Objects" />
            <node concept="37vLTw" id="2BbHItUQNd3" role="37wK5m">
              <ref role="3cqZAo" node="2BbHItUQNcY" resolve="request" />
            </node>
            <node concept="Xl_RD" id="2BbHItUQNd4" role="37wK5m">
              <property role="Xl_RC" value="request is required" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="2BbHItUQNd6" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNd5" role="3cpWs9">
            <property role="TrG5h" value="username" />
            <node concept="3uibUv" id="2BbHItUQNd7" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNd8" role="33vP2m">
              <property role="10XrrR" value="getUsername" />
              <property role="1CJj6V" value="request" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="2BbHItUQNda" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNd9" role="3cpWs9">
            <property role="TrG5h" value="password" />
            <node concept="3uibUv" id="2BbHItUQNdb" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNdc" role="33vP2m">
              <property role="10XrrR" value="getPassword" />
              <property role="1CJj6V" value="request" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="2BbHItUQNdd" role="3cqZAp">
          <node concept="22lmx$" id="2BbHItUQNde" role="3clFbw">
            <node concept="3clFbC" id="2BbHItUQNdf" role="3uHU7B">
              <node concept="37vLTw" id="2BbHItUQNdg" role="3uHU7B">
                <ref role="3cqZAo" node="2BbHItUQNd5" resolve="username" />
              </node>
              <node concept="10Nm6u" id="2BbHItUQNdh" role="3uHU7w" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNdi" role="3uHU7w">
              <property role="10XrrR" value="isBlank" />
              <property role="1CJj6V" value="username" />
            </node>
          </node>
          <node concept="3clFbS" id="2BbHItUQNdk" role="3clFbx">
            <node concept="YS8fn" id="2BbHItUQNdn" role="3cqZAp">
              <node concept="31S9pk" id="2BbHItUQNdl" role="YScLw">
                <property role="31Ss8R" value="IllegalArgumentException" />
                <node concept="Xl_RD" id="2BbHItUQNdm" role="37wK5m">
                  <property role="Xl_RC" value="Username is required." />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="2BbHItUQNdo" role="3cqZAp">
          <node concept="22lmx$" id="2BbHItUQNdp" role="3clFbw">
            <node concept="3clFbC" id="2BbHItUQNdq" role="3uHU7B">
              <node concept="37vLTw" id="2BbHItUQNdr" role="3uHU7B">
                <ref role="3cqZAo" node="2BbHItUQNd9" resolve="password" />
              </node>
              <node concept="10Nm6u" id="2BbHItUQNds" role="3uHU7w" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNdt" role="3uHU7w">
              <property role="10XrrR" value="isBlank" />
              <property role="1CJj6V" value="password" />
            </node>
          </node>
          <node concept="3clFbS" id="2BbHItUQNdv" role="3clFbx">
            <node concept="YS8fn" id="2BbHItUQNdy" role="3cqZAp">
              <node concept="31S9pk" id="2BbHItUQNdw" role="YScLw">
                <property role="31Ss8R" value="IllegalArgumentException" />
                <node concept="Xl_RD" id="2BbHItUQNdx" role="37wK5m">
                  <property role="Xl_RC" value="Password is required." />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2BbHItUQNdz" role="3cqZAp">
          <node concept="31S9pk" id="2BbHItUQNd$" role="3cqZAk">
            <property role="31Ss8R" value="Credentials" />
            <node concept="Wc6QR" id="2BbHItUQNd_" role="37wK5m">
              <property role="10XrrR" value="trim" />
              <property role="1CJj6V" value="username" />
            </node>
            <node concept="37vLTw" id="2BbHItUQNdA" role="37wK5m">
              <ref role="3cqZAo" node="2BbHItUQNd9" resolve="password" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2BbHItUQNdB" role="1B3o_S" />
      <node concept="3uibUv" id="2BbHItUQNdC" role="3clF45">
        <ref role="3uigEE" to=":^" resolve="Credentials" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItUQNdD" role="jymVt">
      <property role="TrG5h" value="Credentials" />
      <node concept="37vLTG" id="2BbHItUQNdE" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="2BbHItUQNdF" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItUQNdG" role="3clF46">
        <property role="TrG5h" value="password" />
        <node concept="3uibUv" id="2BbHItUQNdH" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNdI" role="3clF47" />
      <node concept="3Tm6S6" id="2BbHItUQNdJ" role="1B3o_S" />
      <node concept="3uibUv" id="2BbHItUQNdK" role="3clF45">
        <ref role="3uigEE" to=":^" resolve="record" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItUQNdL" role="jymVt">
      <property role="TrG5h" value="toAuthenticationResult" />
      <node concept="37vLTG" id="2BbHItUQNdM" role="3clF46">
        <property role="TrG5h" value="user" />
        <node concept="3uibUv" id="2BbHItUQNdN" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AmazonUser" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItUQNdO" role="3clF47">
        <node concept="3cpWs8" id="2BbHItUQNdQ" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItUQNdP" role="3cpWs9">
            <property role="TrG5h" value="token" />
            <node concept="3uibUv" id="2BbHItUQNdR" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNdS" role="33vP2m">
              <property role="10XrrR" value="generateToken" />
              <property role="1CJj6V" value="jwtService" />
              <node concept="37vLTw" id="2BbHItUQNdT" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItUQNdM" resolve="user" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2BbHItUQNdU" role="3cqZAp">
          <node concept="31S9pk" id="2BbHItUQNdV" role="3cqZAk">
            <property role="31Ss8R" value="AuthenticationResult" />
            <node concept="37vLTw" id="2BbHItUQNdW" role="37wK5m">
              <ref role="3cqZAo" node="2BbHItUQNdP" resolve="token" />
            </node>
            <node concept="Wc6QR" id="2BbHItUQNdX" role="37wK5m">
              <property role="10XrrR" value="getUsername" />
              <property role="1CJj6V" value="user" />
            </node>
            <node concept="35GP8o" id="2BbHItUQNdY" role="37wK5m">
              <property role="10XrrR" value="name" />
              <node concept="Wc6QR" id="2BbHItUQNdZ" role="35GOzl">
                <property role="10XrrR" value="getRole" />
                <property role="1CJj6V" value="user" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2BbHItUQNe0" role="1B3o_S" />
      <node concept="3uibUv" id="2BbHItUQNe1" role="3clF45">
        <ref role="3uigEE" to=":^" resolve="AuthenticationResult" />
      </node>
    </node>
    <node concept="1lrU7d" id="2BbHItUQNe2" role="lGtFl">
      <node concept="u1fJn" id="2BbHItUQNe3" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.service.generated" />
        <property role="u1fJ8" value="true" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNe4" role="u1e2Z">
        <property role="1CJj6V" value="java.util.Objects" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNe5" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.security.authentication.AuthenticationManager" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNe6" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.security.authentication.UsernamePasswordAuthenticationToken" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNe7" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.security.crypto.password.PasswordEncoder" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNe8" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.transaction.annotation.Transactional" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNe9" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.AmazonUser" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNea" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.domain.enums.Role" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNeb" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.repository.AmazonUserRepository" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNec" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.security.JwtService" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNed" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.service.projection.AuthenticationResult" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNee" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException" />
      </node>
    </node>
  </node>
  <node concept="3HP615" id="2BbHItUQNKJ">
    <property role="TrG5h" value="AmazonUserRepository" />
    <node concept="3Tm1VV" id="2BbHItUQNKK" role="1B3o_S" />
    <node concept="2AHcQZ" id="2BbHItUQNKL" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Repository" resolve="Repository" />
    </node>
    <node concept="3uibUv" id="2BbHItUQNKM" role="3HQHJm">
      <ref role="3uigEE" to=":^" resolve="GeneratedAmazonUserRepository" />
    </node>
    <node concept="1lrU7d" id="2BbHItUQNKN" role="lGtFl">
      <node concept="u1fJn" id="2BbHItUQNKO" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.repository" />
        <property role="u1fJ8" value="true" />
      </node>
      <node concept="u1fJn" id="2BbHItUQNKQ" role="u1e2Z">
        <property role="1CJj6V" value="pt.isep.enorm.ref.amazon.repository.generated.GeneratedAmazonUserRepository" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2BbHItURztg">
    <property role="TrG5h" value="SecurityConfiguration" />
    <node concept="3Tm1VV" id="2BbHItURzth" role="1B3o_S" />
    <node concept="2AHcQZ" id="2BbHItURzti" role="2AJF6D">
      <ref role="2AI5Lk" to="1wnp:~Configuration" resolve="Configuration" />
    </node>
    <node concept="3clFb_" id="2BbHItURztj" role="jymVt">
      <property role="TrG5h" value="securityFilterChain" />
      <node concept="2AHcQZ" id="2BbHItURztk" role="2AJF6D">
        <ref role="2AI5Lk" to="1wnp:~Bean" resolve="Bean" />
      </node>
      <node concept="37vLTG" id="2BbHItURztl" role="3clF46">
        <property role="TrG5h" value="http" />
        <node concept="3uibUv" id="2BbHItURztm" role="1tU5fm">
          <ref role="3uigEE" to="mgjw:~HttpSecurity" resolve="HttpSecurity" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItURztn" role="3clF46">
        <property role="TrG5h" value="jwtAuthenticationFilter" />
        <node concept="3uibUv" id="2BbHItURzto" role="1tU5fm">
          <ref role="3uigEE" node="1s4BJy8H0qq" resolve="JwtAuthenticationFilter" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItURztp" role="3clF46">
        <property role="TrG5h" value="authenticationProvider" />
        <node concept="3uibUv" id="2BbHItURztq" role="1tU5fm">
          <ref role="3uigEE" to="mwe7:~AuthenticationProvider" resolve="AuthenticationProvider" />
        </node>
      </node>
      <node concept="3uibUv" id="2BbHItURztr" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3clFbS" id="2BbHItURzts" role="3clF47">
        <node concept="3clFbF" id="2BbHItURztt" role="3cqZAp">
          <node concept="2OqwBi" id="2BbHItURCpF" role="3clFbG">
            <node concept="2OqwBi" id="2BbHItURBcm" role="2Oq$k0">
              <node concept="2OqwBi" id="2BbHItUR_Pr" role="2Oq$k0">
                <node concept="2OqwBi" id="2BbHItUR_8q" role="2Oq$k0">
                  <node concept="2OqwBi" id="2BbHItUR$nF" role="2Oq$k0">
                    <node concept="37vLTw" id="2BbHItURzKP" role="2Oq$k0">
                      <ref role="3cqZAo" node="2BbHItURztl" resolve="http" />
                    </node>
                    <node concept="liA8E" id="2BbHItUR$nG" role="2OqNvi">
                      <ref role="37wK5l" to="mgjw:~HttpSecurity.csrf(org.springframework.security.config.Customizer)" resolve="csrf" />
                      <node concept="1bVj0M" id="2BbHItUR$nH" role="37wK5m">
                        <node concept="37vLTG" id="2BbHItUR$nI" role="1bW2Oz">
                          <property role="TrG5h" value="csrf" />
                          <node concept="3VYd8j" id="2BbHItUR$nJ" role="1tU5fm" />
                        </node>
                        <node concept="3clFbS" id="2BbHItUR$nK" role="1bW5cS">
                          <node concept="3clFbF" id="2BbHItUR$nL" role="3cqZAp">
                            <node concept="2OqwBi" id="2BbHItUR_0x" role="3clFbG">
                              <node concept="37vLTw" id="2BbHItUR$nN" role="2Oq$k0">
                                <ref role="3cqZAo" node="2BbHItUR$nI" resolve="csrf" />
                              </node>
                              <node concept="liA8E" id="2BbHItUR_0y" role="2OqNvi">
                                <ref role="37wK5l" to="fm6r:~AbstractHttpConfigurer.disable()" resolve="disable" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="2BbHItUR_8r" role="2OqNvi">
                    <ref role="37wK5l" to="mgjw:~HttpSecurity.headers(org.springframework.security.config.Customizer)" resolve="headers" />
                    <node concept="1bVj0M" id="2BbHItUR_8s" role="37wK5m">
                      <node concept="37vLTG" id="2BbHItUR_8t" role="1bW2Oz">
                        <property role="TrG5h" value="headers" />
                        <node concept="3VYd8j" id="2BbHItUR_8u" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="2BbHItUR_8v" role="1bW5cS">
                        <node concept="3clFbF" id="2BbHItUR_8w" role="3cqZAp">
                          <node concept="2OqwBi" id="2BbHItURACV" role="3clFbG">
                            <node concept="2OqwBi" id="2BbHItURA0e" role="2Oq$k0">
                              <node concept="37vLTw" id="2BbHItUR_8z" role="2Oq$k0">
                                <ref role="3cqZAo" node="2BbHItUR_8t" resolve="headers" />
                              </node>
                              <node concept="liA8E" id="2BbHItURA0f" role="2OqNvi">
                                <ref role="37wK5l" to="fm6r:~HeadersConfigurer.frameOptions(org.springframework.security.config.Customizer)" resolve="frameOptions" />
                                <node concept="1bVj0M" id="2BbHItURA0g" role="37wK5m">
                                  <node concept="37vLTG" id="2BbHItURA0h" role="1bW2Oz">
                                    <property role="TrG5h" value="frameOptions" />
                                    <node concept="3VYd8j" id="2BbHItURA0i" role="1tU5fm" />
                                  </node>
                                  <node concept="3clFbS" id="2BbHItURA0j" role="1bW5cS">
                                    <node concept="3clFbF" id="2BbHItURA0k" role="3cqZAp">
                                      <node concept="2OqwBi" id="2BbHItURBu1" role="3clFbG">
                                        <node concept="37vLTw" id="2BbHItURA0m" role="2Oq$k0">
                                          <ref role="3cqZAo" node="2BbHItURA0h" resolve="frameOptions" />
                                        </node>
                                        <node concept="liA8E" id="2BbHItURBu2" role="2OqNvi">
                                          <ref role="37wK5l" to="fm6r:~AbstractHttpConfigurer.disable()" resolve="disable" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="liA8E" id="2BbHItURACW" role="2OqNvi">
                              <ref role="37wK5l" to="fm6r:~HeadersConfigurer.addHeaderWriter(org.springframework.security.web.header.HeaderWriter)" resolve="addHeaderWriter" />
                              <node concept="2ShNRf" id="2BbHItURACX" role="37wK5m">
                                <node concept="1pGfFk" id="2BbHItURACY" role="2ShVmc">
                                  <ref role="37wK5l" to="5qhr:~XFrameOptionsHeaderWriter.&lt;init&gt;(org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter$XFrameOptionsMode)" resolve="XFrameOptionsHeaderWriter" />
                                  <node concept="Rm8GO" id="2BbHItURACZ" role="37wK5m">
                                    <ref role="1Px2BO" to="5qhr:~XFrameOptionsHeaderWriter$XFrameOptionsMode" resolve="XFrameOptionsHeaderWriter.XFrameOptionsMode" />
                                    <ref role="Rm8GQ" to="5qhr:~XFrameOptionsHeaderWriter$XFrameOptionsMode.SAMEORIGIN" resolve="SAMEORIGIN" />
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
                <node concept="liA8E" id="2BbHItUR_Ps" role="2OqNvi">
                  <ref role="37wK5l" to="mgjw:~HttpSecurity.sessionManagement(org.springframework.security.config.Customizer)" resolve="sessionManagement" />
                  <node concept="1bVj0M" id="2BbHItUR_Pt" role="37wK5m">
                    <node concept="37vLTG" id="2BbHItUR_Pu" role="1bW2Oz">
                      <property role="TrG5h" value="session" />
                      <node concept="3VYd8j" id="2BbHItUR_Pv" role="1tU5fm" />
                    </node>
                    <node concept="3clFbS" id="2BbHItUR_Pw" role="1bW5cS">
                      <node concept="3clFbF" id="2BbHItUR_Px" role="3cqZAp">
                        <node concept="2OqwBi" id="2BbHItURBIt" role="3clFbG">
                          <node concept="37vLTw" id="2BbHItUR_Pz" role="2Oq$k0">
                            <ref role="3cqZAo" node="2BbHItUR_Pu" resolve="session" />
                          </node>
                          <node concept="liA8E" id="2BbHItURBIu" role="2OqNvi">
                            <ref role="37wK5l" to="fm6r:~SessionManagementConfigurer.sessionCreationPolicy(org.springframework.security.config.http.SessionCreationPolicy)" resolve="sessionCreationPolicy" />
                            <node concept="Rm8GO" id="2BbHItURBIv" role="37wK5m">
                              <ref role="1Px2BO" to="kxsd:~SessionCreationPolicy" resolve="SessionCreationPolicy" />
                              <ref role="Rm8GQ" to="kxsd:~SessionCreationPolicy.STATELESS" resolve="STATELESS" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="2BbHItURBcn" role="2OqNvi">
                <ref role="37wK5l" to="mgjw:~HttpSecurity.authenticationProvider(org.springframework.security.authentication.AuthenticationProvider)" resolve="authenticationProvider" />
                <node concept="37vLTw" id="2BbHItURBco" role="37wK5m">
                  <ref role="3cqZAo" node="2BbHItURztp" resolve="authenticationProvider" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="2BbHItURCpG" role="2OqNvi">
              <ref role="37wK5l" to="mgjw:~HttpSecurity.addFilterBefore(jakarta.servlet.Filter,java.lang.Class)" resolve="addFilterBefore" />
              <node concept="37vLTw" id="2BbHItURCpH" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItURztn" resolve="jwtAuthenticationFilter" />
              </node>
              <node concept="3VsKOn" id="2BbHItURCpI" role="37wK5m">
                <ref role="3VsUkX" to="pkux:~UsernamePasswordAuthenticationFilter" resolve="UsernamePasswordAuthenticationFilter" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2BbHItURzu3" role="3cqZAp">
          <node concept="2OqwBi" id="2BbHItUR$cT" role="3cqZAk">
            <node concept="37vLTw" id="2BbHItURzL9" role="2Oq$k0">
              <ref role="3cqZAo" node="2BbHItURztl" resolve="http" />
            </node>
            <node concept="liA8E" id="2BbHItUR$cU" role="2OqNvi">
              <ref role="37wK5l" to="1ipg:~AbstractSecurityBuilder.build()" resolve="build" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2BbHItURzu5" role="3clF45">
        <ref role="3uigEE" to="r5bh:~SecurityFilterChain" resolve="SecurityFilterChain" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItURzu6" role="jymVt">
      <property role="TrG5h" value="authenticationProvider" />
      <node concept="2AHcQZ" id="2BbHItURzu7" role="2AJF6D">
        <ref role="2AI5Lk" to="1wnp:~Bean" resolve="Bean" />
      </node>
      <node concept="37vLTG" id="2BbHItURzu8" role="3clF46">
        <property role="TrG5h" value="userDetailsService" />
        <node concept="3uibUv" id="2BbHItURzu9" role="1tU5fm">
          <ref role="3uigEE" to="ay6n:~UserDetailsService" resolve="UserDetailsService" />
        </node>
      </node>
      <node concept="37vLTG" id="2BbHItURzua" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="2BbHItURzub" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="3clFbS" id="2BbHItURzuc" role="3clF47">
        <node concept="3cpWs8" id="2BbHItURzue" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItURzud" role="3cpWs9">
            <property role="TrG5h" value="provider" />
            <node concept="3uibUv" id="2BbHItURzuf" role="1tU5fm">
              <ref role="3uigEE" to="aen7:~DaoAuthenticationProvider" resolve="DaoAuthenticationProvider" />
            </node>
            <node concept="2ShNRf" id="2BbHItURzLz" role="33vP2m">
              <node concept="1pGfFk" id="2BbHItURzLB" role="2ShVmc">
                <ref role="37wK5l" to="aen7:~DaoAuthenticationProvider.&lt;init&gt;()" resolve="DaoAuthenticationProvider" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItURzuh" role="3cqZAp">
          <node concept="2OqwBi" id="2BbHItUR$sq" role="3clFbG">
            <node concept="37vLTw" id="2BbHItURzLd" role="2Oq$k0">
              <ref role="3cqZAo" node="2BbHItURzud" resolve="provider" />
            </node>
            <node concept="liA8E" id="2BbHItUR$sr" role="2OqNvi">
              <ref role="37wK5l" to="aen7:~DaoAuthenticationProvider.setUserDetailsService(org.springframework.security.core.userdetails.UserDetailsService)" resolve="setUserDetailsService" />
              <node concept="37vLTw" id="2BbHItUR$ss" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItURzu8" resolve="userDetailsService" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2BbHItURzuk" role="3cqZAp">
          <node concept="2OqwBi" id="2BbHItUR$iV" role="3clFbG">
            <node concept="37vLTw" id="2BbHItURzKF" role="2Oq$k0">
              <ref role="3cqZAo" node="2BbHItURzud" resolve="provider" />
            </node>
            <node concept="liA8E" id="2BbHItUR$iW" role="2OqNvi">
              <ref role="37wK5l" to="aen7:~DaoAuthenticationProvider.setPasswordEncoder(org.springframework.security.crypto.password.PasswordEncoder)" resolve="setPasswordEncoder" />
              <node concept="37vLTw" id="2BbHItUR$iX" role="37wK5m">
                <ref role="3cqZAo" node="2BbHItURzua" resolve="passwordEncoder" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2BbHItURzun" role="3cqZAp">
          <node concept="37vLTw" id="2BbHItURzuo" role="3cqZAk">
            <ref role="3cqZAo" node="2BbHItURzud" resolve="provider" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2BbHItURzup" role="3clF45">
        <ref role="3uigEE" to="mwe7:~AuthenticationProvider" resolve="AuthenticationProvider" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItURzuq" role="jymVt">
      <property role="TrG5h" value="authenticationManager" />
      <node concept="2AHcQZ" id="2BbHItURzur" role="2AJF6D">
        <ref role="2AI5Lk" to="1wnp:~Bean" resolve="Bean" />
      </node>
      <node concept="37vLTG" id="2BbHItURzus" role="3clF46">
        <property role="TrG5h" value="authenticationConfiguration" />
        <node concept="3uibUv" id="2BbHItURzut" role="1tU5fm">
          <ref role="3uigEE" to="52y:~AuthenticationConfiguration" resolve="AuthenticationConfiguration" />
        </node>
      </node>
      <node concept="3uibUv" id="2BbHItURzuu" role="Sfmx6">
        <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
      </node>
      <node concept="3clFbS" id="2BbHItURzuv" role="3clF47">
        <node concept="3cpWs6" id="2BbHItURzuw" role="3cqZAp">
          <node concept="2OqwBi" id="2BbHItUR$8w" role="3cqZAk">
            <node concept="37vLTw" id="2BbHItURzL5" role="2Oq$k0">
              <ref role="3cqZAo" node="2BbHItURzus" resolve="authenticationConfiguration" />
            </node>
            <node concept="liA8E" id="2BbHItUR$8x" role="2OqNvi">
              <ref role="37wK5l" to="52y:~AuthenticationConfiguration.getAuthenticationManager()" resolve="getAuthenticationManager" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2BbHItURzuy" role="3clF45">
        <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItURzuz" role="jymVt">
      <property role="TrG5h" value="passwordEncoder" />
      <node concept="2AHcQZ" id="2BbHItURzu$" role="2AJF6D">
        <ref role="2AI5Lk" to="1wnp:~Bean" resolve="Bean" />
      </node>
      <node concept="3clFbS" id="2BbHItURzu_" role="3clF47">
        <node concept="3cpWs6" id="2BbHItURzuA" role="3cqZAp">
          <node concept="2ShNRf" id="2BbHItURzL0" role="3cqZAk">
            <node concept="1pGfFk" id="2BbHItURzL2" role="2ShVmc">
              <ref role="37wK5l" to="ypf6:~BCryptPasswordEncoder.&lt;init&gt;()" resolve="BCryptPasswordEncoder" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2BbHItURzuC" role="3clF45">
        <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
      </node>
    </node>
  </node>
</model>

