<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2978d18a-fb58-4b15-a47c-80c776cb7803(Ref.generator.templates@generator)">
  <persistence version="9" />
  <languages>
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="4" />
    <use id="990507d3-3527-4c54-bfe9-0ca3c9c6247a" name="com.dslfoundry.plaintextgen" version="0" />
    <use id="acfc188d-d5d6-4598-b370-6f4a983f05b2" name="jetbrains.mps.baseLanguage.methodReferences" version="0" />
    <use id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures" version="0" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="2" />
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="3" />
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
    <import index="4pwa" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.data.jpa.repository(dependency.importer/)" />
    <import index="5okn" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.data.repository(dependency.importer/)" />
    <import index="p99f" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.persistence(dependency.importer/)" />
    <import index="john" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.core.authority(dependency.importer/)" />
    <import index="wq9u" ref="deb8a535-7971-4dfb-9bfb-85881ffecb8c/i:f020202(Ref.generator/Ref.generator@descriptor)" />
    <import index="uepr" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.web.bind.annotation(dependency.importer/)" />
    <import index="c5f9" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.validation(dependency.importer/)" />
    <import index="l6lz" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:org.springframework.security.core.annotation(dependency.importer/)" />
    <import index="nmm5" ref="b9fad875-c709-47c4-8c1f-a544f3be33fc/java:jakarta.validation.constraints(dependency.importer/)" />
    <import index="zlut" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.packageDependencies(MPS.IDEA/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
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
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="28358707492436943" name="jetbrains.mps.baseLanguage.structure.JavaImport" flags="ng" index="u1fJn" />
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
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1197029447546" name="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" flags="nn" index="2OwXpG">
        <reference id="1197029500499" name="fieldDeclaration" index="2Oxat5" />
      </concept>
      <concept id="1083245097125" name="jetbrains.mps.baseLanguage.structure.EnumClass" flags="ig" index="Qs71p">
        <child id="1083245396908" name="enumConstant" index="Qtgdg" />
      </concept>
      <concept id="1083245299891" name="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" flags="ig" index="QsSxf" />
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
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
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
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
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
      <concept id="1513279640923991009" name="jetbrains.mps.baseLanguage.structure.IGenericClassCreator" flags="ngI" index="366HgL">
        <property id="1513279640906337053" name="inferTypeParams" index="373rjd" />
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
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
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
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
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
      <concept id="1171903916106" name="jetbrains.mps.baseLanguage.structure.UpperBoundType" flags="in" index="3qUE_q">
        <child id="1171903916107" name="bound" index="3qUE_r" />
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
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="8356039341262087992" name="line" index="1aUNEU" />
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
      <concept id="1177093525992" name="jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence" flags="lg" index="gft3U">
        <child id="1177093586806" name="templateNode" index="gfFT$" />
      </concept>
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1167168920554" name="jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition" flags="in" index="30G5F_" />
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
        <child id="1167169362365" name="conditionFunction" index="30HLyM" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167770111131" name="jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent" flags="in" index="3$xsQk" />
      <concept id="1167945743726" name="jetbrains.mps.lang.generator.structure.IfMacro_Condition" flags="in" index="3IZrLx" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="1118773211870" name="jetbrains.mps.lang.generator.structure.IfMacro" flags="ln" index="1W57fq">
        <child id="1194989344771" name="alternativeConsequence" index="UU_$l" />
        <child id="1167945861827" name="conditionFunction" index="3IZSJc" />
      </concept>
      <concept id="1118786554307" name="jetbrains.mps.lang.generator.structure.LoopMacro" flags="ln" index="1WS0z7">
        <child id="1167952069335" name="sourceNodesQuery" index="3Jn$fo" />
      </concept>
      <concept id="1088761943574" name="jetbrains.mps.lang.generator.structure.ReferenceMacro" flags="ln" index="1ZhdrF">
        <child id="1167770376702" name="referentFunction" index="3$ytzL" />
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
      <concept id="5419065806664196078" name="jetbrains.mps.baseLanguage.methodReferences.structure.UnknownMethodReference" flags="ng" index="2fANLd">
        <property id="5419065806664197507" name="methodName" index="2fAKow" />
        <property id="962278442660558840" name="targetResolved" index="w_Gjt" />
      </concept>
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
      <concept id="7453996997717780434" name="jetbrains.mps.lang.smodel.structure.Node_GetSConceptOperation" flags="nn" index="2yIwOk" />
      <concept id="1966870290088668512" name="jetbrains.mps.lang.smodel.structure.Enum_MemberLiteral" flags="ng" index="2ViDtV">
        <reference id="1966870290088668516" name="memberDeclaration" index="2ViDtZ" />
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
      <concept id="3364660638048049745" name="jetbrains.mps.lang.core.structure.LinkAttribute" flags="ng" index="A9Btn">
        <property id="1757699476691236116" name="role_DebugInfo" index="2qtEX8" />
        <property id="1341860900488019036" name="linkId" index="P3scX" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="4222318806802425298" name="jetbrains.mps.lang.core.structure.SuppressErrorsAnnotation" flags="ng" index="15s5l7">
        <property id="8575328350543493365" name="message" index="huDt6" />
        <property id="2423417345669755629" name="filter" index="1eyWvh" />
      </concept>
    </language>
    <language id="c7fb639f-be78-4307-89b0-b5959c3fa8c8" name="jetbrains.mps.lang.text">
      <concept id="155656958578482948" name="jetbrains.mps.lang.text.structure.Word" flags="nn" index="3oM_SD">
        <property id="155656958578482949" name="value" index="3oM_SC" />
      </concept>
      <concept id="2535923850359271782" name="jetbrains.mps.lang.text.structure.Line" flags="nn" index="1PaTwC">
        <child id="2535923850359271783" name="elements" index="1PaTwD" />
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
    <node concept="3lhOvk" id="2VtRX2IQXGT" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="6Hrz6izDHbO" resolve="GeneratedAuthenticationService" />
    </node>
    <node concept="3lhOvk" id="2VtRX2IQY8K" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="6Hrz6izDtmU" resolve="AuthenticationService" />
    </node>
    <node concept="3lhOvk" id="1s4BJy8zB2M" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="1s4BJy8oGbX" resolve="JwtService" />
    </node>
    <node concept="3lhOvk" id="2VtRX2ISeme" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
      <ref role="3lhOvi" node="2VtRX2IS3j8" resolve="InitialDataConfiguration" />
      <node concept="30G5F_" id="2VtRX2ISeKO" role="30HLyM">
        <node concept="3clFbS" id="2VtRX2ISeKP" role="2VODD2">
          <node concept="3clFbF" id="2VtRX2ISf3b" role="3cqZAp">
            <node concept="2OqwBi" id="2VtRX2ISiTT" role="3clFbG">
              <node concept="2OqwBi" id="2VtRX2ISfjR" role="2Oq$k0">
                <node concept="30H73N" id="2VtRX2ISf3a" role="2Oq$k0" />
                <node concept="3Tsc0h" id="2VtRX2ISfML" role="2OqNvi">
                  <ref role="3TtcxE" to="2rvu:47EFX_mxMIt" resolve="userType" />
                </node>
              </node>
              <node concept="3GX2aA" id="2VtRX2ISne5" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3lhOvk" id="6Hrz6iyYJlh" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
      <ref role="3lhOvi" node="6Hrz6iyYHYZ" resolve="GeneratedUser" />
    </node>
    <node concept="3lhOvk" id="6Hrz6iyYJHl" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
      <ref role="3lhOvi" node="2BbHItVhBaX" resolve="User" />
    </node>
    <node concept="3lhOvk" id="6Hrz6izcRB6" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:7vG6G7pFVDW" resolve="Attribute" />
      <ref role="3lhOvi" node="6Hrz6izcjQG" resolve="Attribute" />
    </node>
    <node concept="3lhOvk" id="5thN_UOEGRk" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
      <ref role="3lhOvi" node="5thN_UOEhiK" resolve="GeneratedResource" />
    </node>
    <node concept="3lhOvk" id="5thN_URW4VW" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
      <ref role="3lhOvi" node="5thN_URVYm4" resolve="GeneratedResourceRepository" />
    </node>
    <node concept="3lhOvk" id="5thN_URWkp3" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
      <ref role="3lhOvi" node="5thN_URW39J" resolve="VerificationPolicyRepository" />
    </node>
    <node concept="3lhOvk" id="5thN_URsv8M" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      <ref role="3lhOvi" node="5thN_URrZ2g" resolve="GeneratedFeedback" />
    </node>
    <node concept="3lhOvk" id="5thN_URzXOe" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      <ref role="3lhOvi" node="5thN_URzPLj" resolve="MediaReference" />
    </node>
    <node concept="3lhOvk" id="5thN_UR$mpU" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      <ref role="3lhOvi" node="5thN_UR$omj" resolve="GeneratedMediaReference" />
    </node>
    <node concept="3lhOvk" id="5thN_URWpxk" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      <ref role="3lhOvi" node="5thN_URVW9K" resolve="GeneratedFeedbackRepository" />
    </node>
    <node concept="3lhOvk" id="5thN_URWrhh" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
      <ref role="3lhOvi" node="5thN_URW14N" resolve="FeedbackRepository" />
    </node>
    <node concept="3lhOvk" id="5thN_URX8or" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:47EFX_kWWKX" resolve="SortingPolicy" />
      <ref role="3lhOvi" node="5thN_UREnNc" resolve="GeneratedSortingPolicy" />
    </node>
    <node concept="3lhOvk" id="5thN_URXdmI" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
      <ref role="3lhOvi" node="6Hrz6iyZ1P6" resolve="GeneratedUserRepository" />
    </node>
    <node concept="3lhOvk" id="5thN_URXu6r" role="3lj3bC">
      <ref role="30HIoZ" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
      <ref role="3lhOvi" node="5thN_URVYm4" resolve="GeneratedResourceRepository" />
    </node>
  </node>
  <node concept="312cEu" id="32E3qrM_VCt">
    <property role="TrG5h" value="ModelApplication" />
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
    <property role="3GE5qa" value="config" />
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
    <property role="3GE5qa" value="security" />
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
    <property role="3GE5qa" value="security" />
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
    <property role="3GE5qa" value="resources" />
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
  <node concept="312cEu" id="2BbHItURztg">
    <property role="TrG5h" value="SecurityConfiguration" />
    <property role="3GE5qa" value="security" />
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
  <node concept="312cEu" id="2BbHItVhBaX">
    <property role="TrG5h" value="User" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="2BbHItVhBaY" role="1B3o_S" />
    <node concept="2AHcQZ" id="2BbHItVhBaZ" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="2BbHItVhBb0" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="2BbHItVhBb1" role="2B70Vg">
          <property role="Xl_RC" value="User" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="2BbHItVhBb2" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="2BbHItVhBb3" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="2BbHItVhBb4" role="2B70Vg">
          <property role="Xl_RC" value="users" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="6Hrz6iyYUQe" role="1zkMxy">
      <ref role="3uigEE" node="6Hrz6iyYHYZ" resolve="GeneratedUser" />
    </node>
    <node concept="3uibUv" id="2BbHItVhBb6" role="EKbjA">
      <ref role="3uigEE" to="ay6n:~UserDetails" resolve="UserDetails" />
    </node>
    <node concept="3clFb_" id="2BbHItVhBb7" role="jymVt">
      <property role="TrG5h" value="getAuthorities" />
      <node concept="2AHcQZ" id="2BbHItVhBb8" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="2BbHItVhBb9" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3clFbS" id="2BbHItVhBba" role="3clF47">
        <node concept="3cpWs8" id="2BbHItVhBbc" role="3cqZAp">
          <node concept="3cpWsn" id="2BbHItVhBbb" role="3cpWs9">
            <property role="TrG5h" value="role" />
            <node concept="3uibUv" id="2BbHItVhBbd" role="1tU5fm">
              <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
            </node>
            <node concept="1rXfSq" id="2BbHItVhBbe" role="33vP2m">
              <ref role="37wK5l" node="6Hrz6iyYXOQ" resolve="getRole" />
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="2BbHItVhBbf" role="3cqZAp">
          <node concept="3clFbC" id="2BbHItVhBbg" role="3clFbw">
            <node concept="37vLTw" id="2BbHItVhBbh" role="3uHU7B">
              <ref role="3cqZAo" node="2BbHItVhBbb" resolve="role" />
            </node>
            <node concept="Rm8GO" id="2BbHItVhC8d" role="3uHU7w">
              <ref role="1Px2BO" node="6Hrz6iyYgbn" resolve="UserKind" />
              <ref role="Rm8GQ" node="6Hrz6iyYgbs" resolve="BUYER" />
            </node>
          </node>
          <node concept="3clFbS" id="2BbHItVhBbk" role="3clFbx">
            <node concept="3cpWs6" id="2BbHItVhBbl" role="3cqZAp">
              <node concept="2YIFZM" id="6Hrz6iyZlmY" role="3cqZAk">
                <ref role="37wK5l" to="33ny:~List.of(java.lang.Object,java.lang.Object)" resolve="of" />
                <ref role="1Pybhc" to="33ny:~List" resolve="List" />
                <node concept="2ShNRf" id="6Hrz6iyZlmZ" role="37wK5m">
                  <node concept="1pGfFk" id="6Hrz6iyZln0" role="2ShVmc">
                    <ref role="37wK5l" to="john:~SimpleGrantedAuthority.&lt;init&gt;(java.lang.String)" resolve="SimpleGrantedAuthority" />
                    <node concept="3cpWs3" id="6Hrz6iyZln1" role="37wK5m">
                      <node concept="Xl_RD" id="6Hrz6iyZln2" role="3uHU7B">
                        <property role="Xl_RC" value="ROLE_" />
                      </node>
                      <node concept="2OqwBi" id="6Hrz6iyZln3" role="3uHU7w">
                        <node concept="37vLTw" id="6Hrz6iyZln4" role="2Oq$k0">
                          <ref role="3cqZAo" node="2BbHItVhBbb" resolve="role" />
                        </node>
                        <node concept="liA8E" id="6Hrz6iyZln5" role="2OqNvi">
                          <ref role="37wK5l" to="wyt6:~Enum.name()" resolve="name" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2ShNRf" id="6Hrz6iyZln6" role="37wK5m">
                  <node concept="1pGfFk" id="6Hrz6iyZln7" role="2ShVmc">
                    <ref role="37wK5l" to="john:~SimpleGrantedAuthority.&lt;init&gt;(java.lang.String)" resolve="SimpleGrantedAuthority" />
                    <node concept="3cpWs3" id="6Hrz6iyZln8" role="37wK5m">
                      <node concept="Xl_RD" id="6Hrz6iyZln9" role="3uHU7B">
                        <property role="Xl_RC" value="ROLE_" />
                      </node>
                      <node concept="2OqwBi" id="6Hrz6iyZlna" role="3uHU7w">
                        <node concept="Rm8GO" id="6Hrz6iyZlnb" role="2Oq$k0">
                          <ref role="1Px2BO" node="6Hrz6iyYgbn" resolve="UserKind" />
                          <ref role="Rm8GQ" node="6Hrz6iyYgbq" resolve="GENERIC" />
                        </node>
                        <node concept="liA8E" id="6Hrz6iyZlnc" role="2OqNvi">
                          <ref role="37wK5l" to="wyt6:~Enum.name()" resolve="name" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6Hrz6iz627v" role="3cqZAp">
          <node concept="2YIFZM" id="6Hrz6iz652H" role="3cqZAk">
            <ref role="37wK5l" to="33ny:~List.of(java.lang.Object)" resolve="of" />
            <ref role="1Pybhc" to="33ny:~List" resolve="List" />
            <node concept="2ShNRf" id="2BbHItVhBVJ" role="37wK5m">
              <node concept="1pGfFk" id="2BbHItVhC1Q" role="2ShVmc">
                <ref role="37wK5l" to="john:~SimpleGrantedAuthority.&lt;init&gt;(java.lang.String)" resolve="SimpleGrantedAuthority" />
                <node concept="3cpWs3" id="2BbHItVhC1R" role="37wK5m">
                  <node concept="Xl_RD" id="2BbHItVhC1S" role="3uHU7B">
                    <property role="Xl_RC" value="ROLE_" />
                  </node>
                  <node concept="2OqwBi" id="2BbHItVhCvN" role="3uHU7w">
                    <node concept="37vLTw" id="2BbHItVhC1U" role="2Oq$k0">
                      <ref role="3cqZAo" node="2BbHItVhBbb" resolve="role" />
                    </node>
                    <node concept="liA8E" id="2BbHItVhCvO" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~Enum.name()" resolve="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItVhBb_" role="1B3o_S" />
      <node concept="3uibUv" id="2BbHItVhBbA" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3qUE_q" id="2BbHItVhBbC" role="11_B2D">
          <node concept="3uibUv" id="2BbHItVhBbB" role="3qUE_r">
            <ref role="3uigEE" to="sfae:~GrantedAuthority" resolve="GrantedAuthority" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2BbHItVhBbD" role="jymVt">
      <property role="TrG5h" value="isAccountNonExpired" />
      <node concept="2AHcQZ" id="2BbHItVhBbE" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="2BbHItVhBbF" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3clFbS" id="2BbHItVhBbG" role="3clF47">
        <node concept="3cpWs6" id="2BbHItVhBbH" role="3cqZAp">
          <node concept="3clFbT" id="2BbHItVhBbI" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItVhBbJ" role="1B3o_S" />
      <node concept="10P_77" id="2BbHItVhBbK" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2BbHItVhBbL" role="jymVt">
      <property role="TrG5h" value="isAccountNonLocked" />
      <node concept="2AHcQZ" id="2BbHItVhBbM" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="2BbHItVhBbN" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3clFbS" id="2BbHItVhBbO" role="3clF47">
        <node concept="3cpWs6" id="2BbHItVhBbP" role="3cqZAp">
          <node concept="3clFbT" id="2BbHItVhBbQ" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItVhBbR" role="1B3o_S" />
      <node concept="10P_77" id="2BbHItVhBbS" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2BbHItVhBbT" role="jymVt">
      <property role="TrG5h" value="isCredentialsNonExpired" />
      <node concept="2AHcQZ" id="2BbHItVhBbU" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="2BbHItVhBbV" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3clFbS" id="2BbHItVhBbW" role="3clF47">
        <node concept="3cpWs6" id="2BbHItVhBbX" role="3cqZAp">
          <node concept="3clFbT" id="2BbHItVhBbY" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItVhBbZ" role="1B3o_S" />
      <node concept="10P_77" id="2BbHItVhBc0" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2BbHItVhBc1" role="jymVt">
      <property role="TrG5h" value="isEnabled" />
      <node concept="2AHcQZ" id="2BbHItVhBc2" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="2BbHItVhBc3" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3clFbS" id="2BbHItVhBc4" role="3clF47">
        <node concept="3cpWs6" id="2BbHItVhBc5" role="3cqZAp">
          <node concept="3clFbT" id="2BbHItVhBc6" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2BbHItVhBc7" role="1B3o_S" />
      <node concept="10P_77" id="2BbHItVhBc8" role="3clF45" />
    </node>
    <node concept="n94m4" id="6Hrz6iyYKat" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYCfe">
    <property role="TrG5h" value="ActionKind" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYCff" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYCfh" role="Qtgdg">
      <property role="TrG5h" value="READ" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfj" role="Qtgdg">
      <property role="TrG5h" value="CREATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfl" role="Qtgdg">
      <property role="TrG5h" value="UPDATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfn" role="Qtgdg">
      <property role="TrG5h" value="DELETE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfp" role="Qtgdg">
      <property role="TrG5h" value="COMMENT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfr" role="Qtgdg">
      <property role="TrG5h" value="RATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCft" role="Qtgdg">
      <property role="TrG5h" value="VOTE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfv" role="Qtgdg">
      <property role="TrG5h" value="REPORT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfx" role="Qtgdg">
      <property role="TrG5h" value="SUBSCRIBE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCfz" role="Qtgdg">
      <property role="TrG5h" value="MODERATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCf_" role="Qtgdg">
      <property role="TrG5h" value="VALIDATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYCsr">
    <property role="TrG5h" value="ActionResultKind" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYCss" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYCsu" role="Qtgdg">
      <property role="TrG5h" value="DISPLAY_MESSAGE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCsw" role="Qtgdg">
      <property role="TrG5h" value="FLAG_CONTENT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCsy" role="Qtgdg">
      <property role="TrG5h" value="HIDE_CONTENT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCs$" role="Qtgdg">
      <property role="TrG5h" value="REMOVE_CONTENT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCsA" role="Qtgdg">
      <property role="TrG5h" value="BLOCK_SUBMISSION" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCsC" role="Qtgdg">
      <property role="TrG5h" value="NOTIFY_MODERATOR" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCsE" role="Qtgdg">
      <property role="TrG5h" value="AUTO_APPROVE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYCsG" role="Qtgdg">
      <property role="TrG5h" value="AUTO_REJECT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYC$u">
    <property role="TrG5h" value="ConditionOperator" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.amazon.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYC$v" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYC$x" role="Qtgdg">
      <property role="TrG5h" value="CONTAINS_KEYWORDS" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$z" role="Qtgdg">
      <property role="TrG5h" value="NOT_CONTAINS_KEYWORDS" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$_" role="Qtgdg">
      <property role="TrG5h" value="MATCH_REGEX" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$B" role="Qtgdg">
      <property role="TrG5h" value="NOT_MATCH_REGEX" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$D" role="Qtgdg">
      <property role="TrG5h" value="HAS_PROPERTY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$F" role="Qtgdg">
      <property role="TrG5h" value="NOT_HAS_PROPERTY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$H" role="Qtgdg">
      <property role="TrG5h" value="HAS_SPECIFIC_PROPERTY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYC$J" role="Qtgdg">
      <property role="TrG5h" value="NOT_HAS_SPECIFIC_PROPERTY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYDMR">
    <property role="TrG5h" value="ContextKind" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYDMS" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYDMU" role="Qtgdg">
      <property role="TrG5h" value="GLOBAL" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDMW" role="Qtgdg">
      <property role="TrG5h" value="COMMUNITY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDMY" role="Qtgdg">
      <property role="TrG5h" value="CHANNEL" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDN0" role="Qtgdg">
      <property role="TrG5h" value="CATALOG" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYDS6">
    <property role="TrG5h" value="FeedbackKind" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYDS7" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYDS9" role="Qtgdg">
      <property role="TrG5h" value="COMMENT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDSb" role="Qtgdg">
      <property role="TrG5h" value="REVIEW" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDSd" role="Qtgdg">
      <property role="TrG5h" value="REACTION" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDSf" role="Qtgdg">
      <property role="TrG5h" value="VOTE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDSh" role="Qtgdg">
      <property role="TrG5h" value="REPORT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDSj" role="Qtgdg">
      <property role="TrG5h" value="SUBSCRIPTION" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYDXp">
    <property role="TrG5h" value="FeedbackPolarity" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYDXq" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYDXs" role="Qtgdg">
      <property role="TrG5h" value="NONE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDXu" role="Qtgdg">
      <property role="TrG5h" value="LIKE_DISLIKE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYDXw" role="Qtgdg">
      <property role="TrG5h" value="UP_DOWN" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYE2A">
    <property role="TrG5h" value="FeedbackStatus" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYE2B" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYE2D" role="Qtgdg">
      <property role="TrG5h" value="ENABLED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYE2F" role="Qtgdg">
      <property role="TrG5h" value="DISABLED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYE7L">
    <property role="TrG5h" value="FeedbackSubjectScope" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYE7M" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYE7O" role="Qtgdg">
      <property role="TrG5h" value="RESOURCE_ONLY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYE7Q" role="Qtgdg">
      <property role="TrG5h" value="FEEDBACK_ONLY" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYE7S" role="Qtgdg">
      <property role="TrG5h" value="RESOURCE_OR_FEEDBACK" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEcY">
    <property role="TrG5h" value="ModerationDecision" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEcZ" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEd1" role="Qtgdg">
      <property role="TrG5h" value="APPROVED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEd3" role="Qtgdg">
      <property role="TrG5h" value="FLAGGED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEd5" role="Qtgdg">
      <property role="TrG5h" value="HIDDEN" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEd7" role="Qtgdg">
      <property role="TrG5h" value="REMOVED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEd9" role="Qtgdg">
      <property role="TrG5h" value="BLOCKED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEdb" role="Qtgdg">
      <property role="TrG5h" value="REJECTED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEih">
    <property role="TrG5h" value="ModerationMode" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEii" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEik" role="Qtgdg">
      <property role="TrG5h" value="AUTOMATIC" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEim" role="Qtgdg">
      <property role="TrG5h" value="MANUAL" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEio" role="Qtgdg">
      <property role="TrG5h" value="HYBRID" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEq0">
    <property role="TrG5h" value="PrimitiveType" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEq1" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEq3" role="Qtgdg">
      <property role="TrG5h" value="TEXT" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEq5" role="Qtgdg">
      <property role="TrG5h" value="NUMBER" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEq7" role="Qtgdg">
      <property role="TrG5h" value="BOOLEAN" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEq9" role="Qtgdg">
      <property role="TrG5h" value="DATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEqb" role="Qtgdg">
      <property role="TrG5h" value="DATETIME" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEqd" role="Qtgdg">
      <property role="TrG5h" value="IMAGE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEqf" role="Qtgdg">
      <property role="TrG5h" value="VIDEO" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEqh" role="Qtgdg">
      <property role="TrG5h" value="URL" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEvn">
    <property role="TrG5h" value="RuleSeverity" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEvo" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEvq" role="Qtgdg">
      <property role="TrG5h" value="INFO" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEvs" role="Qtgdg">
      <property role="TrG5h" value="WARNING" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEvu" role="Qtgdg">
      <property role="TrG5h" value="ERROR" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYE$$">
    <property role="TrG5h" value="SortCriterion" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYE$_" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYE$B" role="Qtgdg">
      <property role="TrG5h" value="DATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYE$D" role="Qtgdg">
      <property role="TrG5h" value="VALUE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYE$F" role="Qtgdg">
      <property role="TrG5h" value="RELEVANCE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEGj">
    <property role="TrG5h" value="SortDirection" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEGk" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEGm" role="Qtgdg">
      <property role="TrG5h" value="ASC" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEGo" role="Qtgdg">
      <property role="TrG5h" value="DESC" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEQy">
    <property role="TrG5h" value="TriggerEvent" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEQz" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEQ_" role="Qtgdg">
      <property role="TrG5h" value="ON_RESOURCE_CREATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQB" role="Qtgdg">
      <property role="TrG5h" value="ON_RESOURCE_UPDATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQD" role="Qtgdg">
      <property role="TrG5h" value="ON_RESOURCE_DELETE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQF" role="Qtgdg">
      <property role="TrG5h" value="ON_FEEDBACK_CREATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQH" role="Qtgdg">
      <property role="TrG5h" value="ON_FEEDBACK_UPDATE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQJ" role="Qtgdg">
      <property role="TrG5h" value="ON_FEEDBACK_DELETE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQL" role="Qtgdg">
      <property role="TrG5h" value="ON_REPORT_SUBMITTED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQN" role="Qtgdg">
      <property role="TrG5h" value="ON_REPORT_THRESHOLD" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEQP" role="Qtgdg">
      <property role="TrG5h" value="ON_MANUAL_REQUEST" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYEYt">
    <property role="TrG5h" value="ValidationKind" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYEYu" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYEYw" role="Qtgdg">
      <property role="TrG5h" value="AUTOMATIC" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYEYy" role="Qtgdg">
      <property role="TrG5h" value="MANUAL" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYF3C">
    <property role="TrG5h" value="VerificationRequirement" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYF3D" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYF3F" role="Qtgdg">
      <property role="TrG5h" value="NONE" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYF3H" role="Qtgdg">
      <property role="TrG5h" value="OPTIONAL" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYF3J" role="Qtgdg">
      <property role="TrG5h" value="REQUIRED" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6iyYHYZ">
    <property role="TrG5h" value="GeneratedUser" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="6Hrz6iyYHZ0" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyYHZ1" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="6Hrz6iyYHZ2" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="6Hrz6iyYHZ4" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyYHZ5" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="6Hrz6iyYHZ6" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="6Hrz6iyYIwP" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyYHZ8" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyYHZ9" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyYHZa" role="jymVt">
      <property role="TrG5h" value="username" />
      <node concept="2AHcQZ" id="6Hrz6iyYHZc" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyYHZd" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyYHZe" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyYHZf" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="6Hrz6iyYHZg" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyYHZh" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyYHZi" role="2B70Vg">
            <property role="3cmrfH" value="80" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyYHZj" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyYHZk" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyYHZl" role="jymVt">
      <property role="TrG5h" value="password" />
      <node concept="2AHcQZ" id="6Hrz6iyYHZn" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonProperty" resolve="JsonProperty" />
        <node concept="2B6LJw" id="6Hrz6iyYHZo" role="2B76xF">
          <ref role="2B6OnR" to="c4fr:~JsonProperty.access()" resolve="access" />
          <node concept="Rm8GO" id="6Hrz6iyYIwS" role="2B70Vg">
            <ref role="1Px2BO" to="c4fr:~JsonProperty$Access" resolve="JsonProperty.Access" />
            <ref role="Rm8GQ" to="c4fr:~JsonProperty$Access.WRITE_ONLY" resolve="WRITE_ONLY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyYHZq" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyYHZr" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyYHZs" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyYHZt" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyYHZu" role="2B70Vg">
            <property role="3cmrfH" value="200" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyYHZv" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyYHZw" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZnkA" role="jymVt">
      <property role="TrG5h" value="kind" />
      <node concept="2AHcQZ" id="6Hrz6iyZnkC" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="6Hrz6iyZnkD" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="6Hrz6iyZnxe" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZnkF" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZnkG" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZnkH" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZnkI" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZnkJ" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZnkK" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZnkL" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="6Hrz6iyZmFn" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6iyYHZx" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="6Hrz6iyYHZy" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyYHZz" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyYHZ$" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyYHZ2" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYHZ_" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyYHZA" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyYHZB" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="6Hrz6iyYHZC" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="6Hrz6iyYHZD" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyYHZE" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyYHZF" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyYHZG" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyYHZH" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyYHZI" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyYHZJ" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyYHZ2" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyYHZK" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyYHZC" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYHZL" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyYHZM" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyYHZN" role="jymVt">
      <property role="TrG5h" value="getUsername" />
      <node concept="3clFbS" id="6Hrz6iyYHZO" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyYHZP" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyYHZQ" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyYHZa" resolve="username" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYHZR" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyYHZS" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyYHZT" role="jymVt">
      <property role="TrG5h" value="setUsername" />
      <node concept="37vLTG" id="6Hrz6iyYHZU" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="6Hrz6iyYHZV" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyYHZW" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyYHZX" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyYHZY" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyYHZZ" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyYI00" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyYI01" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyYHZa" resolve="username" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyYI02" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyYHZU" resolve="username" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYI03" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyYI04" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyYI05" role="jymVt">
      <property role="TrG5h" value="getPassword" />
      <node concept="3clFbS" id="6Hrz6iyYI06" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyYI07" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyYI08" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyYHZl" resolve="password" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYI09" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyYI0a" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyYI0b" role="jymVt">
      <property role="TrG5h" value="setPassword" />
      <node concept="37vLTG" id="6Hrz6iyYI0c" role="3clF46">
        <property role="TrG5h" value="password" />
        <node concept="3uibUv" id="6Hrz6iyYI0d" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyYI0e" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyYI0f" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyYI0g" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyYI0h" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyYI0i" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyYI0j" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyYHZl" resolve="password" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyYI0k" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyYI0c" resolve="password" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYI0l" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyYI0m" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyYXOQ" role="jymVt">
      <property role="TrG5h" value="getRole" />
      <node concept="3clFbS" id="6Hrz6iyYXOR" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyYXOS" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyYXOT" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZnkA" resolve="kind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYXOU" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyYXOV" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyYXOW" role="jymVt">
      <property role="TrG5h" value="setRole" />
      <node concept="37vLTG" id="6Hrz6iyYXOX" role="3clF46">
        <property role="TrG5h" value="role" />
        <node concept="3uibUv" id="6Hrz6iyYXOY" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyYXOZ" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyYXP0" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyYXP1" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyYXP2" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyYXP3" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyYXP4" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZnkA" resolve="kind" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyYXP5" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyYXOX" resolve="role" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyYXP6" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyYXP7" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="6Hrz6iyYXpI" role="jymVt" />
    <node concept="n94m4" id="6Hrz6iyYKfy" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
    </node>
    <node concept="17Uvod" id="6Hrz6iyYKCG" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="6Hrz6iyYKCH" role="3zH0cK">
        <node concept="3clFbS" id="6Hrz6iyYKCI" role="2VODD2">
          <node concept="3clFbF" id="6Hrz6iyYMme" role="3cqZAp">
            <node concept="3cpWs3" id="6Hrz6iyYPqq" role="3clFbG">
              <node concept="Xl_RD" id="6Hrz6iyYP_G" role="3uHU7w">
                <property role="Xl_RC" value="User" />
              </node>
              <node concept="3cpWs3" id="6Hrz6iyYNva" role="3uHU7B">
                <node concept="Xl_RD" id="6Hrz6iyYMmd" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="6Hrz6iyYOl5" role="3uHU7w">
                  <node concept="30H73N" id="6Hrz6iyYNPi" role="2Oq$k0" />
                  <node concept="3TrcHB" id="6Hrz6iyYOHJ" role="2OqNvi">
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
  <node concept="312cEu" id="6Hrz6iyZ0Js">
    <property role="TrG5h" value="UserDetailsService" />
    <node concept="3Tm1VV" id="6Hrz6iyZ0Jt" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZ0Ju" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Service" resolve="Service" />
    </node>
    <node concept="3uibUv" id="6Hrz6iyZ0Jv" role="EKbjA">
      <ref role="3uigEE" to="ay6n:~UserDetailsService" resolve="UserDetailsService" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZ0Jw" role="jymVt">
      <property role="TrG5h" value="amazonUserRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6iyZ0Jy" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZ0Jz" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="6Hrz6iyZ0J$" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6iyZ0J_" role="3clF45" />
      <node concept="37vLTG" id="6Hrz6iyZ0JA" role="3clF46">
        <property role="TrG5h" value="amazonUserRepository" />
        <node concept="3uibUv" id="6Hrz6iyZ0JB" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZ0JC" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZ0JD" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZ0JE" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZ0JF" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZ0JG" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZ0JH" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZ0Jw" resolve="amazonUserRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZ0JI" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZ0JA" resolve="amazonUserRepository" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZ0JJ" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZ0JK" role="jymVt">
      <property role="TrG5h" value="loadUserByUsername" />
      <node concept="2AHcQZ" id="6Hrz6iyZ0JL" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="37vLTG" id="6Hrz6iyZ0JM" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="6Hrz6iyZ0JN" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZ0JO" role="Sfmx6">
        <ref role="3uigEE" to="ay6n:~UsernameNotFoundException" resolve="UsernameNotFoundException" />
      </node>
      <node concept="3clFbS" id="6Hrz6iyZ0JP" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZ0JQ" role="3cqZAp">
          <node concept="15s5l7" id="6Hrz6iyZ9$3" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: uncaught exceptions: @orElseThrow.X extends Throwable&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/4460871289557453850]&quot;;" />
            <property role="huDt6" value="Error: uncaught exceptions: @orElseThrow.X extends Throwable" />
          </node>
          <node concept="2OqwBi" id="6Hrz6iyZ3W2" role="3cqZAk">
            <node concept="2OqwBi" id="6Hrz6iyZ3Hj" role="2Oq$k0">
              <node concept="37vLTw" id="6Hrz6iyZ1jA" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6iyZ0Jw" resolve="amazonUserRepository" />
              </node>
              <node concept="liA8E" id="6Hrz6iyZ3Hk" role="2OqNvi">
                <ref role="37wK5l" node="6Hrz6iyZ1Pc" resolve="findByUsername" />
                <node concept="37vLTw" id="6Hrz6iyZ3Hl" role="37wK5m">
                  <ref role="3cqZAo" node="6Hrz6iyZ0JM" resolve="username" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="6Hrz6iyZ3W3" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Optional.orElseThrow(java.util.function.Supplier)" resolve="orElseThrow" />
              <node concept="1bVj0M" id="6Hrz6iyZ3W4" role="37wK5m">
                <node concept="3clFbS" id="6Hrz6iyZ3W5" role="1bW5cS">
                  <node concept="3clFbF" id="6Hrz6iyZ3W6" role="3cqZAp">
                    <node concept="2ShNRf" id="6Hrz6iyZ3W7" role="3clFbG">
                      <node concept="1pGfFk" id="6Hrz6iyZ3W8" role="2ShVmc">
                        <ref role="37wK5l" to="ay6n:~UsernameNotFoundException.&lt;init&gt;(java.lang.String)" resolve="UsernameNotFoundException" />
                        <node concept="2OqwBi" id="6Hrz6iyZ3W9" role="37wK5m">
                          <node concept="Xl_RD" id="6Hrz6iyZ3Wa" role="2Oq$k0">
                            <property role="Xl_RC" value="User '%s' was not found." />
                          </node>
                          <node concept="liA8E" id="6Hrz6iyZ3Wb" role="2OqNvi">
                            <ref role="37wK5l" to="wyt6:~String.formatted(java.lang.Object...)" resolve="formatted" />
                            <node concept="37vLTw" id="6Hrz6iyZ3Wc" role="37wK5m">
                              <ref role="3cqZAo" node="6Hrz6iyZ0JM" resolve="username" />
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
      <node concept="3Tm1VV" id="6Hrz6iyZ0K1" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZ0K2" role="3clF45">
        <ref role="3uigEE" to="ay6n:~UserDetails" resolve="UserDetails" />
      </node>
    </node>
  </node>
  <node concept="3HP615" id="6Hrz6iyZ1eh">
    <property role="TrG5h" value="UserRepository" />
    <property role="3GE5qa" value="repository" />
    <node concept="3Tm1VV" id="6Hrz6iyZ1ei" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZ1ej" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Repository" resolve="Repository" />
    </node>
    <node concept="3uibUv" id="6Hrz6iyZ1X7" role="3HQHJm">
      <ref role="3uigEE" node="6Hrz6iyZ1P6" resolve="GeneratedUserRepository" />
    </node>
  </node>
  <node concept="Qs71p" id="6Hrz6iyYgbn">
    <property role="TrG5h" value="UserKind" />
    <property role="3GE5qa" value="domain.enums" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.enums" />
    <node concept="3Tm1VV" id="6Hrz6iyYgbo" role="1B3o_S" />
    <node concept="QsSxf" id="6Hrz6iyYgbq" role="Qtgdg">
      <property role="TrG5h" value="GENERIC" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYgbs" role="Qtgdg">
      <property role="TrG5h" value="BUYER" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYgbu" role="Qtgdg">
      <property role="TrG5h" value="SELLER" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYgbw" role="Qtgdg">
      <property role="TrG5h" value="CREATOR" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
    <node concept="QsSxf" id="6Hrz6iyYgby" role="Qtgdg">
      <property role="TrG5h" value="MODERATOR" />
      <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6iyZqa4">
    <property role="TrG5h" value="GeneratedAuthorizationRule" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="6Hrz6iyZqa5" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZqa6" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqa7" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="6Hrz6iyZqa9" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZqaa" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="6Hrz6iyZqab" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="6Hrz6iyZsoX" role="2B70Vg">
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqad" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqae" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqaf" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="6Hrz6iyZqah" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZqai" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZqaj" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqak" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="6Hrz6iyZqal" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqam" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZqan" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqao" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqap" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqaq" role="jymVt">
      <property role="TrG5h" value="allowedAction" />
      <node concept="2AHcQZ" id="6Hrz6iyZqas" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="6Hrz6iyZqat" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="6Hrz6iyZqYI" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZqav" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZqaw" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZqax" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqay" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZqaz" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqa$" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYCfe" resolve="ActionKind" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqa_" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqaA" role="jymVt">
      <property role="TrG5h" value="actorKind" />
      <node concept="2AHcQZ" id="6Hrz6iyZqaC" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="6Hrz6iyZqaD" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="6Hrz6iyZqYL" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZqaF" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZqaG" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6iyZqaH" role="2B70Vg">
            <property role="Xl_RC" value="actor_kind" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqaI" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZqaJ" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqaK" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZqaL" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqaM" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqaN" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqaO" role="jymVt">
      <property role="TrG5h" value="resourceTarget" />
      <node concept="2AHcQZ" id="6Hrz6iyZqaQ" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZqaR" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6iyZqaS" role="2B70Vg">
            <property role="Xl_RC" value="resource_target" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqaT" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZqaU" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqaV" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqaW" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqaX" role="jymVt">
      <property role="TrG5h" value="feedbackTarget" />
      <node concept="2AHcQZ" id="6Hrz6iyZqaZ" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZqb0" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6iyZqb1" role="2B70Vg">
            <property role="Xl_RC" value="feedback_target" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZqb2" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZqb3" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqb4" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqb5" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZqb6" role="jymVt">
      <property role="TrG5h" value="context" />
      <node concept="2AHcQZ" id="6Hrz6iyZqb8" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="6Hrz6iyZqb9" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="6Hrz6iyZqYO" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZqbb" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="6Hrz6iyZqbc" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6iyZqbd" role="2B70Vg">
            <property role="Xl_RC" value="context_id" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZqbe" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZqbf" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqbg" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="6Hrz6iyZqbh" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqbi" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqbj" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqa7" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqbk" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqbl" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqbm" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="6Hrz6iyZqbn" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="6Hrz6iyZqbo" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqbp" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqbq" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqbr" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqbs" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqbt" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqbu" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqa7" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqbv" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqbn" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqbw" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqbx" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqby" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="6Hrz6iyZqbz" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqb$" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqb_" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqaf" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqbA" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqbB" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqbC" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="6Hrz6iyZqbD" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="6Hrz6iyZqbE" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqbF" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqbG" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqbH" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqbI" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqbJ" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqbK" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqaf" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqbL" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqbD" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqbM" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqbN" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqbO" role="jymVt">
      <property role="TrG5h" value="getAllowedAction" />
      <node concept="3clFbS" id="6Hrz6iyZqbP" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqbQ" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqbR" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqaq" resolve="allowedAction" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqbS" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqbT" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYCfe" resolve="ActionKind" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqbU" role="jymVt">
      <property role="TrG5h" value="setAllowedAction" />
      <node concept="37vLTG" id="6Hrz6iyZqbV" role="3clF46">
        <property role="TrG5h" value="allowedAction" />
        <node concept="3uibUv" id="6Hrz6iyZqbW" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYCfe" resolve="ActionKind" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqbX" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqbY" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqbZ" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqc0" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqc1" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqc2" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqaq" resolve="allowedAction" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqc3" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqbV" resolve="allowedAction" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqc4" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqc5" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqc6" role="jymVt">
      <property role="TrG5h" value="getActorKind" />
      <node concept="3clFbS" id="6Hrz6iyZqc7" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqc8" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqc9" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqaA" resolve="actorKind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqca" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqcb" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqcc" role="jymVt">
      <property role="TrG5h" value="setActorKind" />
      <node concept="37vLTG" id="6Hrz6iyZqcd" role="3clF46">
        <property role="TrG5h" value="actorKind" />
        <node concept="3uibUv" id="6Hrz6iyZqce" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqcf" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqcg" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqch" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqci" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqcj" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqck" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqaA" resolve="actorKind" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqcl" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqcd" resolve="actorKind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqcm" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqcn" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqco" role="jymVt">
      <property role="TrG5h" value="getResourceTarget" />
      <node concept="3clFbS" id="6Hrz6iyZqcp" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqcq" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqcr" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqaO" resolve="resourceTarget" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqcs" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqct" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqcu" role="jymVt">
      <property role="TrG5h" value="setResourceTarget" />
      <node concept="37vLTG" id="6Hrz6iyZqcv" role="3clF46">
        <property role="TrG5h" value="resourceTarget" />
        <node concept="3uibUv" id="6Hrz6iyZqcw" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqcx" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqcy" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqcz" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqc$" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqc_" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqcA" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqaO" resolve="resourceTarget" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqcB" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqcv" resolve="resourceTarget" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqcC" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqcD" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqcE" role="jymVt">
      <property role="TrG5h" value="getFeedbackTarget" />
      <node concept="3clFbS" id="6Hrz6iyZqcF" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqcG" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqcH" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqaX" resolve="feedbackTarget" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqcI" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqcJ" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqcK" role="jymVt">
      <property role="TrG5h" value="setFeedbackTarget" />
      <node concept="37vLTG" id="6Hrz6iyZqcL" role="3clF46">
        <property role="TrG5h" value="feedbackTarget" />
        <node concept="3uibUv" id="6Hrz6iyZqcM" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqcN" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqcO" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqcP" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqcQ" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqcR" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqcS" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqaX" resolve="feedbackTarget" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqcT" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqcL" resolve="feedbackTarget" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqcU" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqcV" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqcW" role="jymVt">
      <property role="TrG5h" value="getContext" />
      <node concept="3clFbS" id="6Hrz6iyZqcX" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZqcY" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZqcZ" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZqb6" resolve="context" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqd0" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZqd1" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZqd2" role="jymVt">
      <property role="TrG5h" value="setContext" />
      <node concept="37vLTG" id="6Hrz6iyZqd3" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="6Hrz6iyZqd4" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZqd5" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZqd6" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZqd7" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZqd8" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZqd9" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZqda" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZqb6" resolve="context" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZqdb" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZqd3" resolve="context" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZqdc" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZqdd" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6iyZsBr">
    <property role="TrG5h" value="ContextType" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="6Hrz6iyZsBs" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZsBt" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="6Hrz6iyZsBu" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="6Hrz6iyZsBv" role="2B70Vg">
          <property role="Xl_RC" value="ContextType" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="6Hrz6iyZsBw" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="6Hrz6iyZsBx" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="6Hrz6iyZsBy" role="2B70Vg">
          <property role="Xl_RC" value="context_types" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="6Hrz6iyZtnb" role="1zkMxy">
      <ref role="3uigEE" node="6Hrz6iyZteV" resolve="GeneratedContextType" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6iyZteV">
    <property role="TrG5h" value="GeneratedContextType" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="6Hrz6iyZteW" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZteX" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZteY" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="6Hrz6iyZtf0" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZtf1" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="6Hrz6iyZtf2" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="6Hrz6iyZvEc" role="2B70Vg">
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZtf4" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZtf5" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZtf6" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="6Hrz6iyZtf8" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZtf9" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZtfa" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZtfb" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="6Hrz6iyZtfc" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZtfd" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZtfe" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZtff" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZtfg" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZtfh" role="jymVt">
      <property role="TrG5h" value="kind" />
      <node concept="2AHcQZ" id="6Hrz6iyZtfj" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="6Hrz6iyZtfk" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="6Hrz6iyZtY3" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZtfm" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZtfn" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZtfo" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZtfp" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZtfq" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZtfr" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYDMR" resolve="ContextKind" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZtfs" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZtft" role="jymVt">
      <property role="TrG5h" value="resources" />
      <node concept="2AHcQZ" id="6Hrz6iyZtfv" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~OneToMany" resolve="OneToMany" />
        <node concept="2B6LJw" id="6Hrz6iyZtfw" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.mappedBy()" resolve="mappedBy" />
          <node concept="Xl_RD" id="6Hrz6iyZtfx" role="2B70Vg">
            <property role="Xl_RC" value="context" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZtfy" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.cascade()" resolve="cascade" />
          <node concept="Rm8GO" id="6Hrz6iyZtXJ" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~CascadeType" resolve="CascadeType" />
            <ref role="Rm8GQ" to="p99f:~CascadeType.ALL" resolve="ALL" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZtf$" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.orphanRemoval()" resolve="orphanRemoval" />
          <node concept="3clFbT" id="6Hrz6iyZtf_" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZtfA" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="6Hrz6iyZtfB" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4LPp" resolve="ContextResource" />
        </node>
      </node>
      <node concept="2ShNRf" id="6Hrz6iyZtXB" role="33vP2m">
        <node concept="1pGfFk" id="6Hrz6iyZtXG" role="2ShVmc">
          <property role="373rjd" value="true" />
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
        </node>
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZtfD" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtfE" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="6Hrz6iyZtfF" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZtfG" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZtfH" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZteY" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtfI" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZtfJ" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtfK" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="6Hrz6iyZtfL" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="6Hrz6iyZtfM" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZtfN" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZtfO" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZtfP" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZtfQ" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZtfR" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZtfS" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZteY" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZtfT" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZtfL" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtfU" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZtfV" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtfW" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="6Hrz6iyZtfX" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZtfY" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZtfZ" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZtf6" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtg0" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZtg1" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtg2" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="6Hrz6iyZtg3" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="6Hrz6iyZtg4" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZtg5" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZtg6" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZtg7" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZtg8" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZtg9" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZtga" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZtf6" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZtgb" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZtg3" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtgc" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZtgd" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtge" role="jymVt">
      <property role="TrG5h" value="getKind" />
      <node concept="3clFbS" id="6Hrz6iyZtgf" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZtgg" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZtgh" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZtfh" resolve="kind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtgi" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZtgj" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYDMR" resolve="ContextKind" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtgk" role="jymVt">
      <property role="TrG5h" value="setKind" />
      <node concept="37vLTG" id="6Hrz6iyZtgl" role="3clF46">
        <property role="TrG5h" value="kind" />
        <node concept="3uibUv" id="6Hrz6iyZtgm" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYDMR" resolve="ContextKind" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZtgn" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZtgo" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZtgp" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZtgq" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZtgr" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZtgs" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZtfh" resolve="kind" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZtgt" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZtgl" resolve="kind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtgu" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZtgv" role="3clF45" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtgw" role="jymVt">
      <property role="TrG5h" value="getResources" />
      <node concept="3clFbS" id="6Hrz6iyZtgx" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZtgy" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZtgz" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZtft" resolve="resources" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtg$" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZtg_" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="6Hrz6iyZtgA" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4LPp" resolve="ContextResource" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZtgB" role="jymVt">
      <property role="TrG5h" value="addResource" />
      <node concept="37vLTG" id="6Hrz6iyZtgC" role="3clF46">
        <property role="TrG5h" value="resource" />
        <node concept="3uibUv" id="6Hrz6iyZtgD" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4LPp" resolve="ContextResource" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZtgE" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZtgF" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6iyZyTB" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6iyZtY6" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6iyZtgC" resolve="resource" />
            </node>
            <node concept="liA8E" id="6Hrz6iyZyTC" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyZxMC" resolve="setContext" />
              <node concept="10QFUN" id="6Hrz6iyZyTD" role="37wK5m">
                <node concept="Xjq3P" id="6Hrz6iyZyTE" role="10QFUP" />
                <node concept="3uibUv" id="6Hrz6iyZyTF" role="10QFUM">
                  <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6iyZtgK" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6iyZuGI" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6iyZtYd" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6iyZtft" resolve="resources" />
            </node>
            <node concept="liA8E" id="6Hrz6iyZuGJ" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object)" resolve="add" />
              <node concept="37vLTw" id="6Hrz6iyZuGK" role="37wK5m">
                <ref role="3cqZAo" node="6Hrz6iyZtgC" resolve="resource" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZtgN" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZtgO" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6iyZxLF">
    <property role="TrG5h" value="GeneratedContextResource" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="6Hrz6iyZxLG" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZxLH" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZxLI" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="6Hrz6iyZxLK" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZxLL" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="6Hrz6iyZxLM" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="6Hrz6iyZyhS" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZxLO" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZxLP" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZxLQ" role="jymVt">
      <property role="TrG5h" value="context" />
      <node concept="2AHcQZ" id="6Hrz6iyZxLS" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZxLT" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="6Hrz6iyZxLU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="6Hrz6iyZyhP" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZxLW" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="6Hrz6iyZxLX" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="6Hrz6iyZxLY" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="6Hrz6iyZxLZ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6iyZxM0" role="2B70Vg">
            <property role="Xl_RC" value="context_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZxM1" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZxM2" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZxM3" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZxM4" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6iyZxM5" role="jymVt">
      <property role="TrG5h" value="resourceName" />
      <node concept="2AHcQZ" id="6Hrz6iyZxM7" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6iyZxM8" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6iyZxM9" role="2B70Vg">
            <property role="Xl_RC" value="resource_name" />
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZxMa" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6iyZxMb" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6iyZxMc" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6iyZxMd" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6Hrz6iyZxMe" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6iyZxMf" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="6Hrz6iyZxMg" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="6Hrz6iyZxMh" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZxMi" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZxMj" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZxLI" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZxMk" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZxMl" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRYqd" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6iyZxMm" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="6Hrz6iyZxMn" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="6Hrz6iyZxMo" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZxMp" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZxMq" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZxMr" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZxMs" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZxMt" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZxMu" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZxLI" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZxMv" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZxMn" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZxMw" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZxMx" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRYqe" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6iyZxMy" role="jymVt">
      <property role="TrG5h" value="getContext" />
      <node concept="3clFbS" id="6Hrz6iyZxMz" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZxM$" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZxM_" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZxLQ" resolve="context" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZxMA" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZxMB" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRYqf" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6iyZxMC" role="jymVt">
      <property role="TrG5h" value="setContext" />
      <node concept="37vLTG" id="6Hrz6iyZxMD" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="6Hrz6iyZxME" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZxMF" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZxMG" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZxMH" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZxMI" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZxMJ" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZxMK" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZxLQ" resolve="context" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZxML" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZxMD" resolve="context" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZxMM" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZxMN" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRYqg" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6iyZxMO" role="jymVt">
      <property role="TrG5h" value="getResourceName" />
      <node concept="3clFbS" id="6Hrz6iyZxMP" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6iyZxMQ" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6iyZxMR" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6iyZxM5" resolve="resourceName" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZxMS" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6iyZxMT" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRYqh" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6iyZxMU" role="jymVt">
      <property role="TrG5h" value="setResourceName" />
      <node concept="37vLTG" id="6Hrz6iyZxMV" role="3clF46">
        <property role="TrG5h" value="resourceName" />
        <node concept="3uibUv" id="6Hrz6iyZxMW" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZxMX" role="3clF47">
        <node concept="3clFbF" id="6Hrz6iyZxMY" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6iyZxMZ" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6iyZxN0" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6iyZxN1" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6iyZxN2" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6iyZxM5" resolve="resourceName" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6iyZxN3" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6iyZxMV" resolve="resourceName" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6iyZxN4" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6iyZxN5" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6izcjQG">
    <property role="TrG5h" value="Attribute" />
    <property role="3GE5qa" value="domain.value" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.value" />
    <node concept="3Tm1VV" id="6Hrz6izcjQH" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6izcjQI" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Embeddable" resolve="Embeddable" />
    </node>
    <node concept="312cEg" id="6Hrz6izcjQJ" role="jymVt">
      <property role="TrG5h" value="value" />
      <node concept="2AHcQZ" id="6Hrz6izcjQK" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="6Hrz6izcjQL" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="6Hrz6izcjQM" role="2B70Vg">
            <property role="Xl_RC" value="value" />
            <node concept="17Uvod" id="6Hrz6izcjQN" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="6Hrz6izcjQO" role="3zH0cK">
                <node concept="3clFbS" id="6Hrz6izcjQP" role="2VODD2">
                  <node concept="3clFbF" id="6Hrz6izcjQQ" role="3cqZAp">
                    <node concept="2OqwBi" id="6Hrz6izcjQR" role="3clFbG">
                      <node concept="30H73N" id="6Hrz6izcjQS" role="2Oq$k0" />
                      <node concept="3TrcHB" id="6Hrz6izcjQT" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2B6LJw" id="6Hrz6izcjQU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="6Hrz6izcjQV" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="6Hrz6izD8AV" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="6Hrz6izD8Ra" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6Hrz6izcjQX" role="1B3o_S" />
      <node concept="10P_77" id="5thN_UQUdvz" role="1tU5fm">
        <node concept="1W57fq" id="5thN_UQUdv$" role="lGtFl">
          <node concept="3IZrLx" id="5thN_UQUdv_" role="3IZSJc">
            <node concept="3clFbS" id="5thN_UQUdvA" role="2VODD2">
              <node concept="3clFbF" id="5thN_UQUdvB" role="3cqZAp">
                <node concept="3clFbC" id="5thN_UQUdvC" role="3clFbG">
                  <node concept="2OqwBi" id="5thN_UQUdvD" role="3uHU7B">
                    <node concept="30H73N" id="5thN_UQUdvE" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQUdvF" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5thN_UQUdvG" role="3uHU7w">
                    <node concept="1XH99k" id="5thN_UQUdvH" role="2Oq$k0">
                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                    </node>
                    <node concept="2ViDtV" id="5thN_UQUdvI" role="2OqNvi">
                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="5thN_UQUdvJ" role="UU_$l">
            <node concept="17QB3L" id="5thN_UQUdvK" role="gfFT$">
              <node concept="1W57fq" id="5thN_UQUdvL" role="lGtFl">
                <node concept="3IZrLx" id="5thN_UQUdvM" role="3IZSJc">
                  <node concept="3clFbS" id="5thN_UQUdvN" role="2VODD2">
                    <node concept="3clFbF" id="5thN_UQUdvO" role="3cqZAp">
                      <node concept="22lmx$" id="5thN_UQUdvP" role="3clFbG">
                        <node concept="22lmx$" id="5thN_UQUdvQ" role="3uHU7B">
                          <node concept="22lmx$" id="5thN_UQUdvR" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQUdvS" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQUdvT" role="3uHU7B">
                                <node concept="3clFbC" id="5thN_UQUdvU" role="3uHU7B">
                                  <node concept="2OqwBi" id="5thN_UQUdvV" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQUdvW" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQUdvX" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQUdvY" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQUdvZ" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQUdw0" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQUdw1" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQUdw2" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQUdw3" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQUdw4" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQUdw5" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQUdw6" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQUdw7" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQUdw8" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQUdw9" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQUdwa" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQUdwb" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQUdwc" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQUdwd" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQUdwe" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQUdwf" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQUdwg" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQUdwh" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQUdwi" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQUdwj" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQUdwk" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQUdwl" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQUdwm" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQUdwn" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQUdwo" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQUdwp" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQUdwq" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQUdwr" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQUdws" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbC" id="5thN_UQUdwt" role="3uHU7w">
                          <node concept="2OqwBi" id="5thN_UQUdwu" role="3uHU7B">
                            <node concept="30H73N" id="5thN_UQUdwv" role="2Oq$k0" />
                            <node concept="3TrcHB" id="5thN_UQUdww" role="2OqNvi">
                              <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5thN_UQUdwx" role="3uHU7w">
                            <node concept="1XH99k" id="5thN_UQUdwy" role="2Oq$k0">
                              <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                            </node>
                            <node concept="2ViDtV" id="5thN_UQUdwz" role="2OqNvi">
                              <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="gft3U" id="5thN_UQUdw$" role="UU_$l">
                  <node concept="10Oyi0" id="5thN_UQUdw_" role="gfFT$" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6Hrz6izcjQY" role="jymVt" />
    <node concept="2tJIrI" id="6Hrz6izcjQZ" role="jymVt" />
    <node concept="3clFbW" id="6Hrz6izcjR0" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6izcjR1" role="3clF45" />
      <node concept="3clFbS" id="6Hrz6izcjR2" role="3clF47" />
      <node concept="3Tmbuc" id="6Hrz6izcjR3" role="1B3o_S" />
      <node concept="17Uvod" id="6Hrz6izD3yY" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="6Hrz6izD3yZ" role="3zH0cK">
          <node concept="3clFbS" id="6Hrz6izD3z0" role="2VODD2">
            <node concept="3clFbF" id="6Hrz6izD4f4" role="3cqZAp">
              <node concept="2OqwBi" id="6Hrz6izD4xb" role="3clFbG">
                <node concept="30H73N" id="6Hrz6izD4f3" role="2Oq$k0" />
                <node concept="3TrcHB" id="6Hrz6izD4ZN" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6Hrz6izcjR4" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izcjR5" role="jymVt">
      <property role="TrG5h" value="Attribute" />
      <node concept="3clFbS" id="6Hrz6izcjR6" role="3clF47">
        <node concept="3clFbF" id="6Hrz6izcjR7" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izcjR8" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6izcjR9" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izcjRf" resolve="value" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izcjRa" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izcjRb" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izcjRc" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izcjQJ" resolve="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izcjRd" role="1B3o_S" />
      <node concept="37vLTG" id="6Hrz6izcjRf" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="10P_77" id="5thN_UR1O7Z" role="1tU5fm">
          <node concept="1W57fq" id="5thN_UR1O80" role="lGtFl">
            <node concept="3IZrLx" id="5thN_UR1O81" role="3IZSJc">
              <node concept="3clFbS" id="5thN_UR1O82" role="2VODD2">
                <node concept="3clFbF" id="5thN_UR1O83" role="3cqZAp">
                  <node concept="3clFbC" id="5thN_UR1O84" role="3clFbG">
                    <node concept="2OqwBi" id="5thN_UR1O85" role="3uHU7B">
                      <node concept="30H73N" id="5thN_UR1O86" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_UR1O87" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="5thN_UR1O88" role="3uHU7w">
                      <node concept="1XH99k" id="5thN_UR1O89" role="2Oq$k0">
                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                      </node>
                      <node concept="2ViDtV" id="5thN_UR1O8a" role="2OqNvi">
                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="gft3U" id="5thN_UR1O8b" role="UU_$l">
              <node concept="17QB3L" id="5thN_UR1O8c" role="gfFT$">
                <node concept="1W57fq" id="5thN_UR1O8d" role="lGtFl">
                  <node concept="3IZrLx" id="5thN_UR1O8e" role="3IZSJc">
                    <node concept="3clFbS" id="5thN_UR1O8f" role="2VODD2">
                      <node concept="3clFbF" id="5thN_UR1O8g" role="3cqZAp">
                        <node concept="22lmx$" id="5thN_UR1O8h" role="3clFbG">
                          <node concept="22lmx$" id="5thN_UR1O8i" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UR1O8j" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UR1O8k" role="3uHU7B">
                                <node concept="22lmx$" id="5thN_UR1O8l" role="3uHU7B">
                                  <node concept="3clFbC" id="5thN_UR1O8m" role="3uHU7B">
                                    <node concept="2OqwBi" id="5thN_UR1O8n" role="3uHU7B">
                                      <node concept="30H73N" id="5thN_UR1O8o" role="2Oq$k0" />
                                      <node concept="3TrcHB" id="5thN_UR1O8p" role="2OqNvi">
                                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                      </node>
                                    </node>
                                    <node concept="2OqwBi" id="5thN_UR1O8q" role="3uHU7w">
                                      <node concept="1XH99k" id="5thN_UR1O8r" role="2Oq$k0">
                                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                      </node>
                                      <node concept="2ViDtV" id="5thN_UR1O8s" role="2OqNvi">
                                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3clFbC" id="5thN_UR1O8t" role="3uHU7w">
                                    <node concept="2OqwBi" id="5thN_UR1O8u" role="3uHU7B">
                                      <node concept="30H73N" id="5thN_UR1O8v" role="2Oq$k0" />
                                      <node concept="3TrcHB" id="5thN_UR1O8w" role="2OqNvi">
                                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                      </node>
                                    </node>
                                    <node concept="2OqwBi" id="5thN_UR1O8x" role="3uHU7w">
                                      <node concept="1XH99k" id="5thN_UR1O8y" role="2Oq$k0">
                                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                      </node>
                                      <node concept="2ViDtV" id="5thN_UR1O8z" role="2OqNvi">
                                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UR1O8$" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UR1O8_" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UR1O8A" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UR1O8B" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UR1O8C" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UR1O8D" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UR1O8E" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UR1O8F" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UR1O8G" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UR1O8H" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UR1O8I" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UR1O8J" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UR1O8K" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UR1O8L" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UR1O8M" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UR1O8N" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UR1O8O" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UR1O8P" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UR1O8Q" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UR1O8R" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UR1O8S" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UR1O8T" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UR1O8U" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UR1O8V" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UR1O8W" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UR1O8X" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UR1O8Y" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UR1O8Z" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="gft3U" id="5thN_UR1O90" role="UU_$l">
                    <node concept="10Oyi0" id="5thN_UR1O91" role="gfFT$" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="6Hrz6izD9ka" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="6Hrz6izD9kb" role="3zH0cK">
          <node concept="3clFbS" id="6Hrz6izD9kc" role="2VODD2">
            <node concept="3clFbF" id="6Hrz6izD9Sy" role="3cqZAp">
              <node concept="2OqwBi" id="6Hrz6izDaaD" role="3clFbG">
                <node concept="30H73N" id="6Hrz6izD9Sx" role="2Oq$k0" />
                <node concept="3TrcHB" id="6Hrz6izDawV" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="10P_77" id="5thN_UQWMMQ" role="3clF45">
        <node concept="1W57fq" id="5thN_UQWMMR" role="lGtFl">
          <node concept="3IZrLx" id="5thN_UQWMMS" role="3IZSJc">
            <node concept="3clFbS" id="5thN_UQWMMT" role="2VODD2">
              <node concept="3clFbF" id="5thN_UQWMMU" role="3cqZAp">
                <node concept="3clFbC" id="5thN_UQWMMV" role="3clFbG">
                  <node concept="2OqwBi" id="5thN_UQWMMW" role="3uHU7B">
                    <node concept="30H73N" id="5thN_UQWMMX" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQWMMY" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5thN_UQWMMZ" role="3uHU7w">
                    <node concept="1XH99k" id="5thN_UQWMN0" role="2Oq$k0">
                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                    </node>
                    <node concept="2ViDtV" id="5thN_UQWMN1" role="2OqNvi">
                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="5thN_UQWMN2" role="UU_$l">
            <node concept="17QB3L" id="5thN_UQWMN3" role="gfFT$">
              <node concept="1W57fq" id="5thN_UQWMN4" role="lGtFl">
                <node concept="3IZrLx" id="5thN_UQWMN5" role="3IZSJc">
                  <node concept="3clFbS" id="5thN_UQWMN6" role="2VODD2">
                    <node concept="3clFbF" id="5thN_UQWMN7" role="3cqZAp">
                      <node concept="22lmx$" id="5thN_UQWMN8" role="3clFbG">
                        <node concept="22lmx$" id="5thN_UQWMN9" role="3uHU7B">
                          <node concept="22lmx$" id="5thN_UQWMNa" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQWMNb" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQWMNc" role="3uHU7B">
                                <node concept="3clFbC" id="5thN_UQWMNd" role="3uHU7B">
                                  <node concept="2OqwBi" id="5thN_UQWMNe" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQWMNf" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQWMNg" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQWMNh" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQWMNi" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQWMNj" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQWMNk" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQWMNl" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQWMNm" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQWMNn" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQWMNo" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQWMNp" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQWMNq" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQWMNr" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQWMNs" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQWMNt" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQWMNu" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQWMNv" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQWMNw" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQWMNx" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQWMNy" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQWMNz" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQWMN$" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQWMN_" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQWMNA" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQWMNB" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQWMNC" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQWMND" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQWMNE" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQWMNF" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQWMNG" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQWMNH" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQWMNI" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQWMNJ" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbC" id="5thN_UQWMNK" role="3uHU7w">
                          <node concept="2OqwBi" id="5thN_UQWMNL" role="3uHU7B">
                            <node concept="30H73N" id="5thN_UQWMNM" role="2Oq$k0" />
                            <node concept="3TrcHB" id="5thN_UQWMNN" role="2OqNvi">
                              <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5thN_UQWMNO" role="3uHU7w">
                            <node concept="1XH99k" id="5thN_UQWMNP" role="2Oq$k0">
                              <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                            </node>
                            <node concept="2ViDtV" id="5thN_UQWMNQ" role="2OqNvi">
                              <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="gft3U" id="5thN_UQWMNR" role="UU_$l">
                  <node concept="10Oyi0" id="5thN_UQWMNS" role="gfFT$" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6Hrz6izcjRh" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izcjRi" role="jymVt">
      <property role="TrG5h" value="getValue" />
      <node concept="3clFbS" id="6Hrz6izcjRj" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6izcjRk" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6izcjRl" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6izcjQJ" resolve="value" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izcjRm" role="1B3o_S" />
      <node concept="10P_77" id="5thN_UQVC$P" role="3clF45">
        <node concept="1W57fq" id="5thN_UQVC$Q" role="lGtFl">
          <node concept="3IZrLx" id="5thN_UQVC$R" role="3IZSJc">
            <node concept="3clFbS" id="5thN_UQVC$S" role="2VODD2">
              <node concept="3clFbF" id="5thN_UQVC$T" role="3cqZAp">
                <node concept="3clFbC" id="5thN_UQVC$U" role="3clFbG">
                  <node concept="2OqwBi" id="5thN_UQVC$V" role="3uHU7B">
                    <node concept="30H73N" id="5thN_UQVC$W" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQVC$X" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5thN_UQVC$Y" role="3uHU7w">
                    <node concept="1XH99k" id="5thN_UQVC$Z" role="2Oq$k0">
                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                    </node>
                    <node concept="2ViDtV" id="5thN_UQVC_0" role="2OqNvi">
                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="5thN_UQVC_1" role="UU_$l">
            <node concept="17QB3L" id="5thN_UQVC_2" role="gfFT$">
              <node concept="1W57fq" id="5thN_UQVC_3" role="lGtFl">
                <node concept="3IZrLx" id="5thN_UQVC_4" role="3IZSJc">
                  <node concept="3clFbS" id="5thN_UQVC_5" role="2VODD2">
                    <node concept="3clFbF" id="5thN_UQVC_6" role="3cqZAp">
                      <node concept="22lmx$" id="5thN_UQVC_7" role="3clFbG">
                        <node concept="22lmx$" id="5thN_UQVC_8" role="3uHU7B">
                          <node concept="22lmx$" id="5thN_UQVC_9" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQVC_a" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQVC_b" role="3uHU7B">
                                <node concept="3clFbC" id="5thN_UQVC_c" role="3uHU7B">
                                  <node concept="2OqwBi" id="5thN_UQVC_d" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQVC_e" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQVC_f" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQVC_g" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQVC_h" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQVC_i" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQVC_j" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQVC_k" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQVC_l" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQVC_m" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQVC_n" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQVC_o" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQVC_p" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQVC_q" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQVC_r" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQVC_s" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQVC_t" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQVC_u" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQVC_v" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQVC_w" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQVC_x" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQVC_y" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQVC_z" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQVC_$" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQVC__" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQVC_A" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQVC_B" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQVC_C" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQVC_D" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQVC_E" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQVC_F" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQVC_G" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQVC_H" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQVC_I" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbC" id="5thN_UQVC_J" role="3uHU7w">
                          <node concept="2OqwBi" id="5thN_UQVC_K" role="3uHU7B">
                            <node concept="30H73N" id="5thN_UQVC_L" role="2Oq$k0" />
                            <node concept="3TrcHB" id="5thN_UQVC_M" role="2OqNvi">
                              <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5thN_UQVC_N" role="3uHU7w">
                            <node concept="1XH99k" id="5thN_UQVC_O" role="2Oq$k0">
                              <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                            </node>
                            <node concept="2ViDtV" id="5thN_UQVC_P" role="2OqNvi">
                              <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="gft3U" id="5thN_UQVC_Q" role="UU_$l">
                  <node concept="10Oyi0" id="5thN_UQVC_R" role="gfFT$" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_UQZscj" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izcjRo" role="jymVt">
      <property role="TrG5h" value="setValue" />
      <node concept="37vLTG" id="6Hrz6izcjRp" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="10P_77" id="5thN_UQY01h" role="1tU5fm">
          <node concept="1W57fq" id="5thN_UQY01i" role="lGtFl">
            <node concept="3IZrLx" id="5thN_UQY01j" role="3IZSJc">
              <node concept="3clFbS" id="5thN_UQY01k" role="2VODD2">
                <node concept="3clFbF" id="5thN_UQY01l" role="3cqZAp">
                  <node concept="3clFbC" id="5thN_UQY01m" role="3clFbG">
                    <node concept="2OqwBi" id="5thN_UQY01n" role="3uHU7B">
                      <node concept="30H73N" id="5thN_UQY01o" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_UQY01p" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="5thN_UQY01q" role="3uHU7w">
                      <node concept="1XH99k" id="5thN_UQY01r" role="2Oq$k0">
                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                      </node>
                      <node concept="2ViDtV" id="5thN_UQY01s" role="2OqNvi">
                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="gft3U" id="5thN_UQY01t" role="UU_$l">
              <node concept="17QB3L" id="5thN_UQY01u" role="gfFT$">
                <node concept="1W57fq" id="5thN_UQY01v" role="lGtFl">
                  <node concept="3IZrLx" id="5thN_UQY01w" role="3IZSJc">
                    <node concept="3clFbS" id="5thN_UQY01x" role="2VODD2">
                      <node concept="3clFbF" id="5thN_UQY01y" role="3cqZAp">
                        <node concept="22lmx$" id="5thN_UQY01z" role="3clFbG">
                          <node concept="22lmx$" id="5thN_UQY01$" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQY01_" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQY01A" role="3uHU7B">
                                <node concept="22lmx$" id="5thN_UQY01B" role="3uHU7B">
                                  <node concept="3clFbC" id="5thN_UQY01C" role="3uHU7B">
                                    <node concept="2OqwBi" id="5thN_UQY01D" role="3uHU7B">
                                      <node concept="30H73N" id="5thN_UQY01E" role="2Oq$k0" />
                                      <node concept="3TrcHB" id="5thN_UQY01F" role="2OqNvi">
                                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                      </node>
                                    </node>
                                    <node concept="2OqwBi" id="5thN_UQY01G" role="3uHU7w">
                                      <node concept="1XH99k" id="5thN_UQY01H" role="2Oq$k0">
                                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                      </node>
                                      <node concept="2ViDtV" id="5thN_UQY01I" role="2OqNvi">
                                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3clFbC" id="5thN_UQY01J" role="3uHU7w">
                                    <node concept="2OqwBi" id="5thN_UQY01K" role="3uHU7B">
                                      <node concept="30H73N" id="5thN_UQY01L" role="2Oq$k0" />
                                      <node concept="3TrcHB" id="5thN_UQY01M" role="2OqNvi">
                                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                      </node>
                                    </node>
                                    <node concept="2OqwBi" id="5thN_UQY01N" role="3uHU7w">
                                      <node concept="1XH99k" id="5thN_UQY01O" role="2Oq$k0">
                                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                      </node>
                                      <node concept="2ViDtV" id="5thN_UQY01P" role="2OqNvi">
                                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQY01Q" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQY01R" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQY01S" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQY01T" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQY01U" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQY01V" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQY01W" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQY01X" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQY01Y" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQY01Z" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQY020" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQY021" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQY022" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQY023" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQY024" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQY025" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQY026" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQY027" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQY028" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQY029" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQY02a" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQY02b" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQY02c" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQY02d" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQY02e" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQY02f" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQY02g" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQY02h" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="gft3U" id="5thN_UQY02i" role="UU_$l">
                    <node concept="10Oyi0" id="5thN_UQY02j" role="gfFT$" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izcjRr" role="3clF47">
        <node concept="3clFbF" id="6Hrz6izcjRs" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izcjRt" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izcjRu" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izcjRv" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izcjRw" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izcjQJ" resolve="value" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izcjRx" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izcjRp" resolve="value" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izcjRy" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6izcjRz" role="3clF45" />
    </node>
    <node concept="17Uvod" id="6Hrz6izcjR_" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="6Hrz6izcjRA" role="3zH0cK">
        <node concept="3clFbS" id="6Hrz6izcjRB" role="2VODD2">
          <node concept="3clFbF" id="6Hrz6izcjRC" role="3cqZAp">
            <node concept="2OqwBi" id="6Hrz6izcjRD" role="3clFbG">
              <node concept="30H73N" id="6Hrz6izcjRE" role="2Oq$k0" />
              <node concept="3TrcHB" id="6Hrz6izcjRF" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="n94m4" id="6Hrz6izcVI5" role="lGtFl">
      <ref role="n9lRv" to="2rvu:7vG6G7pFVDW" resolve="Attribute" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6izDtmU">
    <property role="TrG5h" value="AuthenticationService" />
    <property role="3GE5qa" value="service" />
    <node concept="3Tm1VV" id="6Hrz6izDtmV" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6izDtmW" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Service" resolve="Service" />
    </node>
    <node concept="3uibUv" id="6Hrz6izDtZv" role="1zkMxy">
      <ref role="3uigEE" node="6Hrz6izDHbO" resolve="GeneratedAuthenticationService" />
    </node>
    <node concept="3clFbW" id="6Hrz6izDtmY" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6izDtmZ" role="3clF45" />
      <node concept="37vLTG" id="6Hrz6izDtn0" role="3clF46">
        <property role="TrG5h" value="userRepository" />
        <node concept="3uibUv" id="6Hrz6izDtn1" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDtn2" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="6Hrz6izDtn3" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDtn4" role="3clF46">
        <property role="TrG5h" value="authenticationManager" />
        <node concept="3uibUv" id="6Hrz6izDtn5" role="1tU5fm">
          <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDtn6" role="3clF46">
        <property role="TrG5h" value="jwtService" />
        <node concept="3uibUv" id="6Hrz6izDtn7" role="1tU5fm">
          <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDtn8" role="3clF47">
        <node concept="XkiVB" id="6Hrz6izDtYC" role="3cqZAp">
          <ref role="37wK5l" node="6Hrz6izDHcN" resolve="GeneratedAuthenticationService" />
          <node concept="37vLTw" id="6Hrz6izDtYD" role="37wK5m">
            <ref role="3cqZAo" node="6Hrz6izDtn0" resolve="userRepository" />
          </node>
          <node concept="37vLTw" id="6Hrz6izDtYE" role="37wK5m">
            <ref role="3cqZAo" node="6Hrz6izDtn2" resolve="passwordEncoder" />
          </node>
          <node concept="37vLTw" id="6Hrz6izDtYF" role="37wK5m">
            <ref role="3cqZAo" node="6Hrz6izDtn4" resolve="authenticationManager" />
          </node>
          <node concept="37vLTw" id="6Hrz6izDtYG" role="37wK5m">
            <ref role="3cqZAo" node="6Hrz6izDtn6" resolve="jwtService" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDtne" role="1B3o_S" />
    </node>
    <node concept="n94m4" id="2VtRX2ISdZq" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6izDHbO">
    <property role="TrG5h" value="GeneratedAuthenticationService" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="service.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.amazon.domain.generated" />
    <node concept="3Tm1VV" id="6Hrz6izDHbP" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6izDHcw" role="2AJF6D">
      <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      <node concept="2B6LJw" id="6Hrz6izDHcx" role="2B76xF">
        <ref role="2B6OnR" to="u35y:~Transactional.readOnly()" resolve="readOnly" />
        <node concept="3clFbT" id="6Hrz6izDHcy" role="2B70Vg">
          <property role="3clFbU" value="true" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6Hrz6izDHcz" role="jymVt">
      <property role="TrG5h" value="userRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDHc_" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDHcA" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6izDHcB" role="jymVt">
      <property role="TrG5h" value="passwordEncoder" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDHcD" role="1tU5fm">
        <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDHcE" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6izDHcF" role="jymVt">
      <property role="TrG5h" value="authenticationManager" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDHcH" role="1tU5fm">
        <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDHcI" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6izDHcJ" role="jymVt">
      <property role="TrG5h" value="jwtService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDHcL" role="1tU5fm">
        <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDHcM" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="6Hrz6izDHcN" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6izDHcO" role="3clF45" />
      <node concept="37vLTG" id="6Hrz6izDHcP" role="3clF46">
        <property role="TrG5h" value="userRepository" />
        <node concept="3uibUv" id="6Hrz6izDHcQ" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDHcR" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="6Hrz6izDHcS" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDHcT" role="3clF46">
        <property role="TrG5h" value="authenticationManager" />
        <node concept="3uibUv" id="6Hrz6izDHcU" role="1tU5fm">
          <ref role="3uigEE" to="mwe7:~AuthenticationManager" resolve="AuthenticationManager" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDHcV" role="3clF46">
        <property role="TrG5h" value="jwtService" />
        <node concept="3uibUv" id="6Hrz6izDHcW" role="1tU5fm">
          <ref role="3uigEE" node="1s4BJy8oGbX" resolve="JwtService" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDHcX" role="3clF47">
        <node concept="3clFbF" id="6Hrz6izDHcY" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDHcZ" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDHd0" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDHd1" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDHd2" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDHcz" resolve="userRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDHd3" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDHcP" resolve="userRepository" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHd4" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDHd5" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDHd6" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDHd7" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDHd8" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDHcB" resolve="passwordEncoder" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDHd9" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDHcR" resolve="passwordEncoder" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHda" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDHdb" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDHdc" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDHdd" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDHde" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDHcF" resolve="authenticationManager" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDHdf" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDHcT" resolve="authenticationManager" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHdg" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDHdh" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDHdi" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDHdj" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDHdk" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDHcJ" resolve="jwtService" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDHdl" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDHcV" resolve="jwtService" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="6Hrz6izDHdm" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IS10h" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izDHdn" role="jymVt">
      <property role="TrG5h" value="register" />
      <node concept="2AHcQZ" id="6Hrz6izDHdo" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="6Hrz6izDHdp" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="6Hrz6izE8YU" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDHdr" role="3clF47">
        <node concept="3cpWs8" id="6Hrz6izDHdt" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHds" role="3cpWs9">
            <property role="TrG5h" value="credentials" />
            <node concept="3uibUv" id="6Hrz6izDHdu" role="1tU5fm">
              <ref role="3uigEE" node="6Hrz6izDHbQ" resolve="GeneratedAuthenticationService.Credentials" />
            </node>
            <node concept="1rXfSq" id="6Hrz6izDHdv" role="33vP2m">
              <ref role="37wK5l" node="6Hrz6izDHeH" resolve="validateRequest" />
              <node concept="37vLTw" id="6Hrz6izDHdw" role="37wK5m">
                <ref role="3cqZAo" node="6Hrz6izDHdp" resolve="request" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6Hrz6izDHdx" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6izDY1u" role="3clFbw">
            <node concept="37vLTw" id="6Hrz6izDNtP" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6izDHcz" resolve="userRepository" />
            </node>
            <node concept="liA8E" id="6Hrz6izDY1v" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyZ1Pj" resolve="existsByUsername" />
              <node concept="2OqwBi" id="6Hrz6izDY1w" role="37wK5m">
                <node concept="37vLTw" id="6Hrz6izDY1x" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Hrz6izDHds" resolve="credentials" />
                </node>
                <node concept="liA8E" id="6Hrz6izDY1y" role="2OqNvi">
                  <ref role="37wK5l" node="6Hrz6izDHck" resolve="getUsername" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="6Hrz6izDHd_" role="3clFbx">
            <node concept="YS8fn" id="6Hrz6izDHdC" role="3cqZAp">
              <node concept="2ShNRf" id="6Hrz6izDMRH" role="YScLw">
                <node concept="1pGfFk" id="6Hrz6izDMXL" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalStateException.&lt;init&gt;(java.lang.String)" resolve="IllegalStateException" />
                  <node concept="Xl_RD" id="6Hrz6izDMXM" role="37wK5m">
                    <property role="Xl_RC" value="Username already exists." />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6Hrz6izDHdE" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHdD" role="3cpWs9">
            <property role="TrG5h" value="user" />
            <node concept="3uibUv" id="6Hrz6izDHdF" role="1tU5fm">
              <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
            </node>
            <node concept="2ShNRf" id="6Hrz6izEezd" role="33vP2m">
              <node concept="HV5vD" id="6Hrz6izEezg" role="2ShVmc">
                <ref role="HV5vE" node="2BbHItVhBaX" resolve="User" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHdH" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6izEb_c" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6izDMZ3" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6izDHdD" resolve="user" />
            </node>
            <node concept="liA8E" id="6Hrz6izEb_d" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyYHZT" resolve="setUsername" />
              <node concept="2OqwBi" id="6Hrz6izEb_e" role="37wK5m">
                <node concept="37vLTw" id="6Hrz6izEb_f" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Hrz6izDHds" resolve="credentials" />
                </node>
                <node concept="liA8E" id="6Hrz6izEb_g" role="2OqNvi">
                  <ref role="37wK5l" node="6Hrz6izDHck" resolve="getUsername" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHdK" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6izEdbp" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6izDMZp" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6izDHdD" resolve="user" />
            </node>
            <node concept="liA8E" id="6Hrz6izEdbq" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyYI0b" resolve="setPassword" />
              <node concept="2OqwBi" id="6Hrz6izEdbr" role="37wK5m">
                <node concept="37vLTw" id="6Hrz6izEdbs" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Hrz6izDHcB" resolve="passwordEncoder" />
                </node>
                <node concept="liA8E" id="6Hrz6izEdbt" role="2OqNvi">
                  <ref role="37wK5l" to="f75t:~PasswordEncoder.encode(java.lang.CharSequence)" resolve="encode" />
                  <node concept="2OqwBi" id="6Hrz6izEdbu" role="37wK5m">
                    <node concept="37vLTw" id="6Hrz6izEdbv" role="2Oq$k0">
                      <ref role="3cqZAo" node="6Hrz6izDHds" resolve="credentials" />
                    </node>
                    <node concept="liA8E" id="6Hrz6izEdbw" role="2OqNvi">
                      <ref role="37wK5l" node="6Hrz6izDHcq" resolve="getPassword" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHdO" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6izEco7" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6izDNtZ" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6izDHdD" resolve="user" />
            </node>
            <node concept="liA8E" id="6Hrz6izEco8" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyYXOW" resolve="setRole" />
              <node concept="Rm8GO" id="6Hrz6izEjsm" role="37wK5m">
                <ref role="Rm8GQ" node="6Hrz6iyYgbs" resolve="BUYER" />
                <ref role="1Px2BO" node="6Hrz6iyYgbn" resolve="UserKind" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6Hrz6izDHdV" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHdU" role="3cpWs9">
            <property role="TrG5h" value="savedUser" />
            <node concept="3uibUv" id="6Hrz6izDHdW" role="1tU5fm">
              <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izDYX0" role="33vP2m">
              <node concept="37vLTw" id="6Hrz6izDMYb" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6izDHcz" resolve="userRepository" />
              </node>
              <node concept="liA8E" id="6Hrz6izDYX1" role="2OqNvi">
                <ref role="37wK5l" to="5okn:~CrudRepository.save(java.lang.Object)" resolve="save" />
                <node concept="37vLTw" id="6Hrz6izDYX2" role="37wK5m">
                  <ref role="3cqZAo" node="6Hrz6izDHdD" resolve="user" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHdZ" role="3cqZAp">
          <node concept="1rXfSq" id="6Hrz6izDHe0" role="3clFbG">
            <ref role="37wK5l" node="6Hrz6izDHeB" resolve="afterRegister" />
            <node concept="37vLTw" id="6Hrz6izDHe1" role="37wK5m">
              <ref role="3cqZAo" node="6Hrz6izDHdU" resolve="savedUser" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6Hrz6izDHe2" role="3cqZAp">
          <node concept="1rXfSq" id="6Hrz6izDHe3" role="3cqZAk">
            <ref role="37wK5l" node="6Hrz6izDHfp" resolve="toAuthenticationResult" />
            <node concept="37vLTw" id="6Hrz6izDHe4" role="37wK5m">
              <ref role="3cqZAo" node="6Hrz6izDHdU" resolve="savedUser" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDHe5" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDHe6" role="3clF45">
        <ref role="3uigEE" node="6Hrz6izDJA7" resolve="AuthenticationResult" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IS10i" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izDHe7" role="jymVt">
      <property role="TrG5h" value="login" />
      <node concept="37vLTG" id="6Hrz6izDHe8" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="6Hrz6izDHe9" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDHea" role="3clF47">
        <node concept="3cpWs8" id="6Hrz6izDHec" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHeb" role="3cpWs9">
            <property role="TrG5h" value="credentials" />
            <node concept="3uibUv" id="6Hrz6izDHed" role="1tU5fm">
              <ref role="3uigEE" node="6Hrz6izDHbQ" resolve="GeneratedAuthenticationService.Credentials" />
            </node>
            <node concept="1rXfSq" id="6Hrz6izDHee" role="33vP2m">
              <ref role="37wK5l" node="6Hrz6izDHeH" resolve="validateRequest" />
              <node concept="37vLTw" id="6Hrz6izDHef" role="37wK5m">
                <ref role="3cqZAo" node="6Hrz6izDHe8" resolve="request" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDHeg" role="3cqZAp">
          <node concept="2OqwBi" id="6Hrz6izDOyj" role="3clFbG">
            <node concept="37vLTw" id="6Hrz6izDMYE" role="2Oq$k0">
              <ref role="3cqZAo" node="6Hrz6izDHcF" resolve="authenticationManager" />
            </node>
            <node concept="liA8E" id="6Hrz6izDOyk" role="2OqNvi">
              <ref role="37wK5l" to="mwe7:~AuthenticationManager.authenticate(org.springframework.security.core.Authentication)" resolve="authenticate" />
              <node concept="2ShNRf" id="6Hrz6izDOyl" role="37wK5m">
                <node concept="1pGfFk" id="6Hrz6izDOym" role="2ShVmc">
                  <ref role="37wK5l" to="mwe7:~UsernamePasswordAuthenticationToken.&lt;init&gt;(java.lang.Object,java.lang.Object)" resolve="UsernamePasswordAuthenticationToken" />
                  <node concept="2OqwBi" id="6Hrz6izDVTS" role="37wK5m">
                    <node concept="37vLTw" id="6Hrz6izDOyo" role="2Oq$k0">
                      <ref role="3cqZAo" node="6Hrz6izDHeb" resolve="credentials" />
                    </node>
                    <node concept="liA8E" id="6Hrz6izDVTT" role="2OqNvi">
                      <ref role="37wK5l" node="6Hrz6izDHck" resolve="getUsername" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="6Hrz6izDVoB" role="37wK5m">
                    <node concept="37vLTw" id="6Hrz6izDOyq" role="2Oq$k0">
                      <ref role="3cqZAo" node="6Hrz6izDHeb" resolve="credentials" />
                    </node>
                    <node concept="liA8E" id="6Hrz6izDVoC" role="2OqNvi">
                      <ref role="37wK5l" node="6Hrz6izDHcq" resolve="getPassword" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6Hrz6izDHem" role="3cqZAp">
          <node concept="15s5l7" id="6Hrz6izEHi8" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: uncaught exceptions: @orElseThrow.X extends Throwable&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/4460871289557453850]&quot;;" />
            <property role="huDt6" value="Error: uncaught exceptions: @orElseThrow.X extends Throwable" />
          </node>
          <node concept="3cpWsn" id="6Hrz6izDHel" role="3cpWs9">
            <property role="TrG5h" value="user" />
            <node concept="3uibUv" id="6Hrz6izDHen" role="1tU5fm">
              <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izE0W_" role="33vP2m">
              <node concept="2OqwBi" id="6Hrz6izDZIs" role="2Oq$k0">
                <node concept="37vLTw" id="6Hrz6izDN5N" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Hrz6izDHcz" resolve="userRepository" />
                </node>
                <node concept="liA8E" id="6Hrz6izDZIt" role="2OqNvi">
                  <ref role="37wK5l" node="6Hrz6iyZ1Pc" resolve="findByUsername" />
                  <node concept="2OqwBi" id="6Hrz6izDZIu" role="37wK5m">
                    <node concept="37vLTw" id="6Hrz6izDZIv" role="2Oq$k0">
                      <ref role="3cqZAo" node="6Hrz6izDHeb" resolve="credentials" />
                    </node>
                    <node concept="liA8E" id="6Hrz6izDZIw" role="2OqNvi">
                      <ref role="37wK5l" node="6Hrz6izDHck" resolve="getUsername" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="6Hrz6izE0WA" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~Optional.orElseThrow(java.util.function.Supplier)" resolve="orElseThrow" />
                <node concept="1bVj0M" id="6Hrz6izE0WB" role="37wK5m">
                  <node concept="3clFbS" id="6Hrz6izE0WC" role="1bW5cS">
                    <node concept="3clFbF" id="6Hrz6izE0WD" role="3cqZAp">
                      <node concept="15s5l7" id="6Hrz6izEvT6" role="lGtFl">
                        <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: uncaught exceptions: @orElseThrow.X extends Throwable&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/4460871289557453850]&quot;;" />
                        <property role="huDt6" value="Error: uncaught exceptions: @orElseThrow.X extends Throwable" />
                      </node>
                      <node concept="2ShNRf" id="6Hrz6izEvaa" role="3clFbG">
                        <node concept="1pGfFk" id="6Hrz6izEvbl" role="2ShVmc">
                          <ref role="37wK5l" node="6Hrz6izEswb" resolve="ResourceNotFoundException" />
                          <node concept="2OqwBi" id="6Hrz6izEvbm" role="37wK5m">
                            <node concept="Xl_RD" id="6Hrz6izEvbn" role="2Oq$k0">
                              <property role="Xl_RC" value="User '%s' was not found." />
                            </node>
                            <node concept="liA8E" id="6Hrz6izEvbo" role="2OqNvi">
                              <ref role="37wK5l" to="wyt6:~String.formatted(java.lang.Object...)" resolve="formatted" />
                              <node concept="2OqwBi" id="6Hrz6izEvbp" role="37wK5m">
                                <node concept="37vLTw" id="6Hrz6izEvbq" role="2Oq$k0">
                                  <ref role="3cqZAo" node="6Hrz6izDHeb" resolve="credentials" />
                                </node>
                                <node concept="liA8E" id="6Hrz6izEvbr" role="2OqNvi">
                                  <ref role="37wK5l" node="6Hrz6izDHck" resolve="getUsername" />
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
        <node concept="3cpWs6" id="6Hrz6izDHey" role="3cqZAp">
          <node concept="1rXfSq" id="6Hrz6izDHez" role="3cqZAk">
            <ref role="37wK5l" node="6Hrz6izDHfp" resolve="toAuthenticationResult" />
            <node concept="37vLTw" id="6Hrz6izDHe$" role="37wK5m">
              <ref role="3cqZAo" node="6Hrz6izDHel" resolve="user" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDHe_" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDHeA" role="3clF45">
        <ref role="3uigEE" node="6Hrz6izDJA7" resolve="AuthenticationResult" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IS10j" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izDHeB" role="jymVt">
      <property role="TrG5h" value="afterRegister" />
      <node concept="37vLTG" id="6Hrz6izDHeC" role="3clF46">
        <property role="TrG5h" value="savedUser" />
        <node concept="3uibUv" id="6Hrz6izDHeD" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDHeE" role="3clF47" />
      <node concept="3Tmbuc" id="6Hrz6izDHeF" role="1B3o_S" />
      <node concept="3cqZAl" id="6Hrz6izDHeG" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IS10k" role="jymVt" />
    <node concept="3clFb_" id="6Hrz6izDHeH" role="jymVt">
      <property role="TrG5h" value="validateRequest" />
      <node concept="37vLTG" id="6Hrz6izDHeI" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="6Hrz6izDHeJ" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDHeK" role="3clF47">
        <node concept="3clFbF" id="6Hrz6izDHeL" role="3cqZAp">
          <node concept="2YIFZM" id="6Hrz6izE$ra" role="3clFbG">
            <ref role="37wK5l" to="33ny:~Objects.requireNonNull(java.lang.Object,java.lang.String)" resolve="requireNonNull" />
            <ref role="1Pybhc" to="33ny:~Objects" resolve="Objects" />
            <node concept="37vLTw" id="6Hrz6izE$rb" role="37wK5m">
              <ref role="3cqZAo" node="6Hrz6izDHeI" resolve="request" />
            </node>
            <node concept="Xl_RD" id="6Hrz6izE$rc" role="37wK5m">
              <property role="Xl_RC" value="request is required" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6Hrz6izDHeQ" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHeP" role="3cpWs9">
            <property role="TrG5h" value="username" />
            <node concept="3uibUv" id="6Hrz6izDHeR" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izErxd" role="33vP2m">
              <node concept="37vLTw" id="6Hrz6izDMZb" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6izDHeI" resolve="request" />
              </node>
              <node concept="liA8E" id="6Hrz6izErxe" role="2OqNvi">
                <ref role="37wK5l" node="6Hrz6iyYHZN" resolve="getUsername" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="6Hrz6izDHeU" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHeT" role="3cpWs9">
            <property role="TrG5h" value="password" />
            <node concept="3uibUv" id="6Hrz6izDHeV" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izErQy" role="33vP2m">
              <node concept="37vLTw" id="6Hrz6izDN8O" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6izDHeI" resolve="request" />
              </node>
              <node concept="liA8E" id="6Hrz6izErQz" role="2OqNvi">
                <ref role="37wK5l" node="6Hrz6iyYI05" resolve="getPassword" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6Hrz6izDHeX" role="3cqZAp">
          <node concept="22lmx$" id="6Hrz6izDHeY" role="3clFbw">
            <node concept="3clFbC" id="6Hrz6izDHeZ" role="3uHU7B">
              <node concept="37vLTw" id="6Hrz6izDHf0" role="3uHU7B">
                <ref role="3cqZAo" node="6Hrz6izDHeP" resolve="username" />
              </node>
              <node concept="10Nm6u" id="6Hrz6izDHf1" role="3uHU7w" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izDPGV" role="3uHU7w">
              <node concept="37vLTw" id="6Hrz6izDMRF" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6izDHeP" resolve="username" />
              </node>
              <node concept="liA8E" id="6Hrz6izDPGW" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.isBlank()" resolve="isBlank" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="6Hrz6izDHf4" role="3clFbx">
            <node concept="YS8fn" id="6Hrz6izDHf7" role="3cqZAp">
              <node concept="2ShNRf" id="6Hrz6izDMZz" role="YScLw">
                <node concept="1pGfFk" id="6Hrz6izDN5B" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalArgumentException.&lt;init&gt;(java.lang.String)" resolve="IllegalArgumentException" />
                  <node concept="Xl_RD" id="6Hrz6izDN5C" role="37wK5m">
                    <property role="Xl_RC" value="Username is required." />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6Hrz6izDHf8" role="3cqZAp">
          <node concept="22lmx$" id="6Hrz6izDHf9" role="3clFbw">
            <node concept="3clFbC" id="6Hrz6izDHfa" role="3uHU7B">
              <node concept="37vLTw" id="6Hrz6izDHfb" role="3uHU7B">
                <ref role="3cqZAo" node="6Hrz6izDHeT" resolve="password" />
              </node>
              <node concept="10Nm6u" id="6Hrz6izDHfc" role="3uHU7w" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izDRcx" role="3uHU7w">
              <node concept="37vLTw" id="6Hrz6izDNrf" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6izDHeT" resolve="password" />
              </node>
              <node concept="liA8E" id="6Hrz6izDRcy" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.isBlank()" resolve="isBlank" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="6Hrz6izDHff" role="3clFbx">
            <node concept="YS8fn" id="6Hrz6izDHfi" role="3cqZAp">
              <node concept="2ShNRf" id="6Hrz6izDNu8" role="YScLw">
                <node concept="1pGfFk" id="6Hrz6izDN$c" role="2ShVmc">
                  <ref role="37wK5l" to="wyt6:~IllegalArgumentException.&lt;init&gt;(java.lang.String)" resolve="IllegalArgumentException" />
                  <node concept="Xl_RD" id="6Hrz6izDN$d" role="37wK5m">
                    <property role="Xl_RC" value="Password is required." />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6Hrz6izDHfj" role="3cqZAp">
          <node concept="2ShNRf" id="6Hrz6izDMXR" role="3cqZAk">
            <node concept="1pGfFk" id="6Hrz6izDMY5" role="2ShVmc">
              <ref role="37wK5l" node="6Hrz6izDHc0" resolve="GeneratedAuthenticationService.Credentials" />
              <node concept="2OqwBi" id="6Hrz6izDQKN" role="37wK5m">
                <node concept="37vLTw" id="6Hrz6izDMY7" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Hrz6izDHeP" resolve="username" />
                </node>
                <node concept="liA8E" id="6Hrz6izDQKO" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~String.trim()" resolve="trim" />
                </node>
              </node>
              <node concept="37vLTw" id="6Hrz6izDMY8" role="37wK5m">
                <ref role="3cqZAo" node="6Hrz6izDHeT" resolve="password" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDHfn" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDHfo" role="3clF45">
        <ref role="3uigEE" node="6Hrz6izDHbQ" resolve="GeneratedAuthenticationService.Credentials" />
      </node>
    </node>
    <node concept="312cEu" id="6Hrz6izDHbQ" role="jymVt">
      <property role="TrG5h" value="Credentials" />
      <property role="1EXbeo" value="true" />
      <node concept="3Tm6S6" id="6Hrz6izDHbR" role="1B3o_S" />
      <node concept="312cEg" id="6Hrz6izDHbS" role="jymVt">
        <property role="TrG5h" value="username" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="6Hrz6izDHbU" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
        <node concept="3Tm6S6" id="6Hrz6izDHbV" role="1B3o_S" />
      </node>
      <node concept="312cEg" id="6Hrz6izDHbW" role="jymVt">
        <property role="TrG5h" value="password" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="6Hrz6izDHbY" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
        <node concept="3Tm6S6" id="6Hrz6izDHbZ" role="1B3o_S" />
      </node>
      <node concept="3clFbW" id="6Hrz6izDHc0" role="jymVt">
        <node concept="3cqZAl" id="6Hrz6izDHc1" role="3clF45" />
        <node concept="37vLTG" id="6Hrz6izDHc2" role="3clF46">
          <property role="TrG5h" value="username" />
          <node concept="3uibUv" id="6Hrz6izDHc3" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          </node>
        </node>
        <node concept="37vLTG" id="6Hrz6izDHc4" role="3clF46">
          <property role="TrG5h" value="password" />
          <node concept="3uibUv" id="6Hrz6izDHc5" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          </node>
        </node>
        <node concept="3clFbS" id="6Hrz6izDHc6" role="3clF47">
          <node concept="3clFbF" id="6Hrz6izDHc7" role="3cqZAp">
            <node concept="37vLTI" id="6Hrz6izDHc8" role="3clFbG">
              <node concept="2OqwBi" id="6Hrz6izDHc9" role="37vLTJ">
                <node concept="Xjq3P" id="6Hrz6izDHca" role="2Oq$k0" />
                <node concept="2OwXpG" id="6Hrz6izDHcb" role="2OqNvi">
                  <ref role="2Oxat5" node="6Hrz6izDHbS" resolve="username" />
                </node>
              </node>
              <node concept="37vLTw" id="6Hrz6izDHcc" role="37vLTx">
                <ref role="3cqZAo" node="6Hrz6izDHc2" resolve="username" />
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="6Hrz6izDHcd" role="3cqZAp">
            <node concept="37vLTI" id="6Hrz6izDHce" role="3clFbG">
              <node concept="2OqwBi" id="6Hrz6izDHcf" role="37vLTJ">
                <node concept="Xjq3P" id="6Hrz6izDHcg" role="2Oq$k0" />
                <node concept="2OwXpG" id="6Hrz6izDHch" role="2OqNvi">
                  <ref role="2Oxat5" node="6Hrz6izDHbW" resolve="password" />
                </node>
              </node>
              <node concept="37vLTw" id="6Hrz6izDHci" role="37vLTx">
                <ref role="3cqZAo" node="6Hrz6izDHc4" resolve="password" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3Tm6S6" id="6Hrz6izDHcj" role="1B3o_S" />
      </node>
      <node concept="3clFb_" id="6Hrz6izDHck" role="jymVt">
        <property role="TrG5h" value="getUsername" />
        <node concept="3clFbS" id="6Hrz6izDHcl" role="3clF47">
          <node concept="3cpWs6" id="6Hrz6izDHcm" role="3cqZAp">
            <node concept="37vLTw" id="6Hrz6izDHcn" role="3cqZAk">
              <ref role="3cqZAo" node="6Hrz6izDHbS" resolve="username" />
            </node>
          </node>
        </node>
        <node concept="3Tm6S6" id="6Hrz6izDHco" role="1B3o_S" />
        <node concept="3uibUv" id="6Hrz6izDHcp" role="3clF45">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFb_" id="6Hrz6izDHcq" role="jymVt">
        <property role="TrG5h" value="getPassword" />
        <node concept="3clFbS" id="6Hrz6izDHcr" role="3clF47">
          <node concept="3cpWs6" id="6Hrz6izDHcs" role="3cqZAp">
            <node concept="37vLTw" id="6Hrz6izDHct" role="3cqZAk">
              <ref role="3cqZAo" node="6Hrz6izDHbW" resolve="password" />
            </node>
          </node>
        </node>
        <node concept="3Tm6S6" id="6Hrz6izDHcu" role="1B3o_S" />
        <node concept="3uibUv" id="6Hrz6izDHcv" role="3clF45">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6izDHfp" role="jymVt">
      <property role="TrG5h" value="toAuthenticationResult" />
      <node concept="37vLTG" id="6Hrz6izDHfq" role="3clF46">
        <property role="TrG5h" value="user" />
        <node concept="3uibUv" id="6Hrz6izDHfr" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDHfs" role="3clF47">
        <node concept="3cpWs8" id="6Hrz6izDHfu" role="3cqZAp">
          <node concept="3cpWsn" id="6Hrz6izDHft" role="3cpWs9">
            <property role="TrG5h" value="token" />
            <node concept="3uibUv" id="6Hrz6izDHfv" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            </node>
            <node concept="2OqwBi" id="6Hrz6izDRYy" role="33vP2m">
              <node concept="37vLTw" id="6Hrz6izDNCr" role="2Oq$k0">
                <ref role="3cqZAo" node="6Hrz6izDHcJ" resolve="jwtService" />
              </node>
              <node concept="liA8E" id="6Hrz6izDRYz" role="2OqNvi">
                <ref role="37wK5l" node="1s4BJy8oGcy" resolve="generateToken" />
                <node concept="37vLTw" id="6Hrz6izDRY$" role="37wK5m">
                  <ref role="3cqZAo" node="6Hrz6izDHfq" resolve="user" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6Hrz6izDHfy" role="3cqZAp">
          <node concept="2ShNRf" id="6Hrz6izDN5T" role="3cqZAk">
            <node concept="1pGfFk" id="6Hrz6izDN65" role="2ShVmc">
              <ref role="37wK5l" node="6Hrz6izDJAl" resolve="AuthenticationResult" />
              <node concept="37vLTw" id="6Hrz6izDN66" role="37wK5m">
                <ref role="3cqZAo" node="6Hrz6izDHft" resolve="token" />
              </node>
              <node concept="2OqwBi" id="6Hrz6izEoSB" role="37wK5m">
                <node concept="37vLTw" id="6Hrz6izDN68" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Hrz6izDHfq" resolve="user" />
                </node>
                <node concept="liA8E" id="6Hrz6izEoSC" role="2OqNvi">
                  <ref role="37wK5l" node="6Hrz6iyYHZN" resolve="getUsername" />
                </node>
              </node>
              <node concept="2OqwBi" id="6Hrz6izEqm5" role="37wK5m">
                <node concept="2OqwBi" id="6Hrz6izEnPA" role="2Oq$k0">
                  <node concept="37vLTw" id="6Hrz6izDN6b" role="2Oq$k0">
                    <ref role="3cqZAo" node="6Hrz6izDHfq" resolve="user" />
                  </node>
                  <node concept="liA8E" id="6Hrz6izEnPB" role="2OqNvi">
                    <ref role="37wK5l" node="6Hrz6iyYXOQ" resolve="getRole" />
                  </node>
                </node>
                <node concept="liA8E" id="6Hrz6izEqm6" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~Enum.name()" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDHfC" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDHfD" role="3clF45">
        <ref role="3uigEE" node="6Hrz6izDJA7" resolve="AuthenticationResult" />
      </node>
    </node>
    <node concept="n94m4" id="2VtRX2ISedm" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6izDJA7">
    <property role="TrG5h" value="AuthenticationResult" />
    <property role="3GE5qa" value="service.projection" />
    <node concept="3Tm1VV" id="6Hrz6izDJA8" role="1B3o_S" />
    <node concept="312cEg" id="6Hrz6izDJA9" role="jymVt">
      <property role="TrG5h" value="token" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDJAb" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDJAc" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6izDJAd" role="jymVt">
      <property role="TrG5h" value="username" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDJAf" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDJAg" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6Hrz6izDJAh" role="jymVt">
      <property role="TrG5h" value="role" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="6Hrz6izDJAj" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="6Hrz6izDJAk" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="6Hrz6izDJAl" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6izDJAm" role="3clF45" />
      <node concept="37vLTG" id="6Hrz6izDJAn" role="3clF46">
        <property role="TrG5h" value="token" />
        <node concept="3uibUv" id="6Hrz6izDJAo" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDJAp" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="6Hrz6izDJAq" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="6Hrz6izDJAr" role="3clF46">
        <property role="TrG5h" value="role" />
        <node concept="3uibUv" id="6Hrz6izDJAs" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izDJAt" role="3clF47">
        <node concept="3clFbF" id="6Hrz6izDJAu" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDJAv" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDJAw" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDJAx" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDJAy" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDJA9" resolve="token" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDJAz" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDJAn" resolve="token" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDJA$" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDJA_" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDJAA" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDJAB" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDJAC" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDJAd" resolve="username" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDJAD" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDJAp" resolve="username" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Hrz6izDJAE" role="3cqZAp">
          <node concept="37vLTI" id="6Hrz6izDJAF" role="3clFbG">
            <node concept="2OqwBi" id="6Hrz6izDJAG" role="37vLTJ">
              <node concept="Xjq3P" id="6Hrz6izDJAH" role="2Oq$k0" />
              <node concept="2OwXpG" id="6Hrz6izDJAI" role="2OqNvi">
                <ref role="2Oxat5" node="6Hrz6izDJAh" resolve="role" />
              </node>
            </node>
            <node concept="37vLTw" id="6Hrz6izDJAJ" role="37vLTx">
              <ref role="3cqZAo" node="6Hrz6izDJAr" resolve="role" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDJAK" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="6Hrz6izDJAL" role="jymVt">
      <property role="TrG5h" value="getToken" />
      <node concept="3clFbS" id="6Hrz6izDJAM" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6izDJAN" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6izDJAO" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6izDJA9" resolve="token" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDJAP" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDJAQ" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6izDJAR" role="jymVt">
      <property role="TrG5h" value="getUsername" />
      <node concept="3clFbS" id="6Hrz6izDJAS" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6izDJAT" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6izDJAU" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6izDJAd" resolve="username" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDJAV" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDJAW" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6izDJAX" role="jymVt">
      <property role="TrG5h" value="getRole" />
      <node concept="3clFbS" id="6Hrz6izDJAY" role="3clF47">
        <node concept="3cpWs6" id="6Hrz6izDJAZ" role="3cqZAp">
          <node concept="37vLTw" id="6Hrz6izDJB0" role="3cqZAk">
            <ref role="3cqZAo" node="6Hrz6izDJAh" resolve="role" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izDJB1" role="1B3o_S" />
      <node concept="3uibUv" id="6Hrz6izDJB2" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="6dJWUfKNAig" role="jymVt" />
  </node>
  <node concept="312cEu" id="6Hrz6izEsw8">
    <property role="TrG5h" value="ResourceNotFoundException" />
    <property role="3GE5qa" value="web.error" />
    <node concept="3Tm1VV" id="6Hrz6izEsw9" role="1B3o_S" />
    <node concept="3uibUv" id="6Hrz6izEswa" role="1zkMxy">
      <ref role="3uigEE" to="wyt6:~RuntimeException" resolve="RuntimeException" />
    </node>
    <node concept="3clFbW" id="6Hrz6izEswb" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6izEswc" role="3clF45" />
      <node concept="37vLTG" id="6Hrz6izEswd" role="3clF46">
        <property role="TrG5h" value="message" />
        <node concept="3uibUv" id="6Hrz6izEswe" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izEswf" role="3clF47">
        <node concept="XkiVB" id="6Hrz6izMSED" role="3cqZAp">
          <ref role="37wK5l" to="wyt6:~RuntimeException.&lt;init&gt;(java.lang.String)" resolve="RuntimeException" />
          <node concept="37vLTw" id="6Hrz6izMSEE" role="37wK5m">
            <ref role="3cqZAo" node="6Hrz6izEswd" resolve="message" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izEswi" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="6Hrz6izWtiD">
    <property role="TrG5h" value="AuthenticationController" />
    <property role="3GE5qa" value="web" />
    <node concept="3Tm1VV" id="6Hrz6izWtiE" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6izWtiF" role="2AJF6D">
      <ref role="2AI5Lk" to="uepr:~RestController" resolve="RestController" />
    </node>
    <node concept="2AHcQZ" id="6Hrz6izWtiG" role="2AJF6D">
      <ref role="2AI5Lk" to="uepr:~RequestMapping" resolve="RequestMapping" />
      <node concept="2B6LJw" id="6Hrz6izWtiH" role="2B76xF">
        <ref role="2B6OnR" to="uepr:~RequestMapping.value()" resolve="value" />
        <node concept="Xl_RD" id="6Hrz6izWtiI" role="2B70Vg">
          <property role="Xl_RC" value="/api/auth" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="6Hrz6izWtiJ" role="1zkMxy">
      <ref role="3uigEE" node="2VtRX2IRBGj" resolve="GeneratedAuthenticationController" />
    </node>
    <node concept="3clFbW" id="6Hrz6izWtiK" role="jymVt">
      <node concept="3cqZAl" id="6Hrz6izWtiL" role="3clF45" />
      <node concept="37vLTG" id="6Hrz6izWtiM" role="3clF46">
        <property role="TrG5h" value="authenticationService" />
        <node concept="3uibUv" id="6Hrz6izWtiN" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6izDtmU" resolve="AuthenticationService" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6izWtiO" role="3clF47">
        <node concept="XkiVB" id="6Hrz6izWu0c" role="3cqZAp">
          <ref role="37wK5l" node="2VtRX2IRBGp" resolve="GeneratedAuthenticationController" />
          <node concept="37vLTw" id="6Hrz6izWu0d" role="37wK5m">
            <ref role="3cqZAo" node="6Hrz6izWtiM" resolve="authenticationService" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6Hrz6izWtiR" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UOOmch">
    <property role="TrG5h" value="Resource" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UOOmci" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UOOmcj" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UOOmck" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UOOmcl" role="2B70Vg">
          <property role="Xl_RC" value="Resource" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UOOmcm" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UOOmcn" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UOOmco" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UOOmcp" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UOEhiK" resolve="GeneratedResource" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UOEhiK">
    <property role="TrG5h" value="GeneratedResource" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UOEhiL" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UOEhiM" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UOEhiN" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UOEhiP" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UOEhiQ" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UOEhiR" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_UOEkaQ" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UOEhiT" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UOEhiU" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_UPYug$" role="jymVt" />
    <node concept="312cEg" id="5thN_UPWRLp" role="jymVt">
      <property role="TrG5h" value="attributeName" />
      <node concept="3Tm6S6" id="5thN_UPWPNy" role="1B3o_S" />
      <node concept="10P_77" id="5thN_UPWQAt" role="1tU5fm">
        <node concept="1W57fq" id="5thN_UQq9_a" role="lGtFl">
          <node concept="3IZrLx" id="5thN_UQq9_b" role="3IZSJc">
            <node concept="3clFbS" id="5thN_UQq9_c" role="2VODD2">
              <node concept="3clFbF" id="5thN_UQqfjM" role="3cqZAp">
                <node concept="3clFbC" id="5thN_UQqfjO" role="3clFbG">
                  <node concept="2OqwBi" id="5thN_UQqfjP" role="3uHU7B">
                    <node concept="30H73N" id="5thN_UQqfjQ" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQqfjR" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5thN_UQqfjS" role="3uHU7w">
                    <node concept="1XH99k" id="5thN_UQqfjT" role="2Oq$k0">
                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                    </node>
                    <node concept="2ViDtV" id="5thN_UQqfjU" role="2OqNvi">
                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="5thN_UQqvOE" role="UU_$l">
            <node concept="17QB3L" id="5thN_UQq_oL" role="gfFT$">
              <node concept="1W57fq" id="5thN_UQD7o_" role="lGtFl">
                <node concept="3IZrLx" id="5thN_UQD7oA" role="3IZSJc">
                  <node concept="3clFbS" id="5thN_UQD7oB" role="2VODD2">
                    <node concept="3clFbF" id="5thN_UQDa2C" role="3cqZAp">
                      <node concept="22lmx$" id="5thN_UQFWrC" role="3clFbG">
                        <node concept="22lmx$" id="5thN_UQF_0S" role="3uHU7B">
                          <node concept="22lmx$" id="5thN_UQ15VD" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQ15VE" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQ15VF" role="3uHU7B">
                                <node concept="3clFbC" id="5thN_UQ15VG" role="3uHU7B">
                                  <node concept="2OqwBi" id="5thN_UQ15VH" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQ15VI" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQ15VJ" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQ15VK" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQ15VL" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQ15VM" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQ15VN" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQ15VO" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQ15VP" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQ15VQ" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQ15VR" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQ15VS" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQ15VT" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQ15VU" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQ15VV" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQ15VW" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQ15VX" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQ15VY" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQ15VZ" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQ15W0" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQ15W1" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQ15W2" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQ15W3" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQ15W4" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQ15W5" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQ15W6" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQ15W7" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQFELq" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQFELr" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQFELs" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQFELt" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQFELu" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQFELv" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQFELw" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbC" id="5thN_UQG1TA" role="3uHU7w">
                          <node concept="2OqwBi" id="5thN_UQG1TB" role="3uHU7B">
                            <node concept="30H73N" id="5thN_UQG1TC" role="2Oq$k0" />
                            <node concept="3TrcHB" id="5thN_UQG1TD" role="2OqNvi">
                              <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5thN_UQG1TE" role="3uHU7w">
                            <node concept="1XH99k" id="5thN_UQG1TF" role="2Oq$k0">
                              <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                            </node>
                            <node concept="2ViDtV" id="5thN_UQGkIj" role="2OqNvi">
                              <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="gft3U" id="5thN_UQFrj0" role="UU_$l">
                  <node concept="10Oyi0" id="5thN_UQFvXd" role="gfFT$" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UPWT7Q" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UQnfPt" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UQngRi" role="2B70Vg">
            <property role="Xl_RC" value="name" />
            <node concept="17Uvod" id="5thN_UQniBs" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="5thN_UQniBt" role="3zH0cK">
                <node concept="3clFbS" id="5thN_UQniBu" role="2VODD2">
                  <node concept="3clFbF" id="5thN_UQnjx2" role="3cqZAp">
                    <node concept="2OqwBi" id="5thN_UQnjS8" role="3clFbG">
                      <node concept="30H73N" id="5thN_UQnjx1" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_UQnog3" role="2OqNvi">
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
      <node concept="1WS0z7" id="5thN_UPZv$H" role="lGtFl">
        <node concept="3JmXsc" id="5thN_UPZv$K" role="3Jn$fo">
          <node concept="3clFbS" id="5thN_UPZv$L" role="2VODD2">
            <node concept="3clFbF" id="5thN_UPZv$R" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_UPZv$M" role="3clFbG">
                <node concept="3Tsc0h" id="5thN_UPZv$P" role="2OqNvi">
                  <ref role="3TtcxE" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
                </node>
                <node concept="30H73N" id="5thN_UPZv$Q" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="5thN_UPZIHU" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="5thN_UPZIHV" role="3zH0cK">
          <node concept="3clFbS" id="5thN_UPZIHW" role="2VODD2">
            <node concept="3clFbF" id="5thN_UPZLf6" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_UPZLAc" role="3clFbG">
                <node concept="30H73N" id="5thN_UPZLf5" role="2Oq$k0" />
                <node concept="3TrcHB" id="5thN_UPZOrs" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_UQmUPh" role="jymVt" />
    <node concept="3clFb_" id="5thN_UOEhiV" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UOEhiW" role="3clF47">
        <node concept="3cpWs6" id="5thN_UOEhiX" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UOEhiY" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UOEhiN" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UOEhiZ" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UOEhj0" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_UOEVRt" role="jymVt" />
    <node concept="3clFb_" id="5thN_UOEhj1" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UOEhj2" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UOEhj3" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UOEhj4" role="3clF47">
        <node concept="3clFbF" id="5thN_UOEhj5" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UOEhj6" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UOEhj7" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UOEhj8" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UOEhj9" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UOEhiN" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UOEhja" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UOEhj2" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UOEhjb" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UOEhjc" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_UQ0im7" role="jymVt" />
    <node concept="3clFb_" id="5thN_UPWY$H" role="jymVt">
      <property role="TrG5h" value="getAttributeName" />
      <node concept="3clFbS" id="5thN_UPWY$I" role="3clF47">
        <node concept="3cpWs6" id="5thN_UPWY$J" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UPWY$K" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UPWRLp" resolve="attributeName" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UPWY$L" role="1B3o_S" />
      <node concept="1WS0z7" id="5thN_UPZQku" role="lGtFl">
        <node concept="3JmXsc" id="5thN_UPZQkx" role="3Jn$fo">
          <node concept="3clFbS" id="5thN_UPZQky" role="2VODD2">
            <node concept="3clFbF" id="5thN_UPZQkC" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_UPZQkz" role="3clFbG">
                <node concept="3Tsc0h" id="5thN_UPZQkA" role="2OqNvi">
                  <ref role="3TtcxE" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
                </node>
                <node concept="30H73N" id="5thN_UPZQkB" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="5thN_UQ0$Tl" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="5thN_UQ0$Tm" role="3zH0cK">
          <node concept="3clFbS" id="5thN_UQ0$Tn" role="2VODD2">
            <node concept="3clFbF" id="5thN_UQ0ASO" role="3cqZAp">
              <node concept="3cpWs3" id="5thN_UQ0MHj" role="3clFbG">
                <node concept="Xl_RD" id="5thN_UQ0NsW" role="3uHU7w">
                  <property role="Xl_RC" value="Name" />
                </node>
                <node concept="3cpWs3" id="5thN_UQ0Cbh" role="3uHU7B">
                  <node concept="Xl_RD" id="5thN_UQ0ASN" role="3uHU7B">
                    <property role="Xl_RC" value="get" />
                  </node>
                  <node concept="2OqwBi" id="5thN_UQ0Di2" role="3uHU7w">
                    <node concept="30H73N" id="5thN_UQ0CMV" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQ0GG9" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="10P_77" id="5thN_UQQqmx" role="3clF45">
        <node concept="1W57fq" id="5thN_UQQqmy" role="lGtFl">
          <node concept="3IZrLx" id="5thN_UQQqmz" role="3IZSJc">
            <node concept="3clFbS" id="5thN_UQQqm$" role="2VODD2">
              <node concept="3clFbF" id="5thN_UQQqm_" role="3cqZAp">
                <node concept="3clFbC" id="5thN_UQQqmA" role="3clFbG">
                  <node concept="2OqwBi" id="5thN_UQQqmB" role="3uHU7B">
                    <node concept="30H73N" id="5thN_UQQqmC" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQQqmD" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5thN_UQQqmE" role="3uHU7w">
                    <node concept="1XH99k" id="5thN_UQQqmF" role="2Oq$k0">
                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                    </node>
                    <node concept="2ViDtV" id="5thN_UQQqmG" role="2OqNvi">
                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="5thN_UQQqmH" role="UU_$l">
            <node concept="17QB3L" id="5thN_UQQqmI" role="gfFT$">
              <node concept="1W57fq" id="5thN_UQQqmJ" role="lGtFl">
                <node concept="3IZrLx" id="5thN_UQQqmK" role="3IZSJc">
                  <node concept="3clFbS" id="5thN_UQQqmL" role="2VODD2">
                    <node concept="3clFbF" id="5thN_UQQqmM" role="3cqZAp">
                      <node concept="22lmx$" id="5thN_UQQqmN" role="3clFbG">
                        <node concept="22lmx$" id="5thN_UQQqmO" role="3uHU7B">
                          <node concept="22lmx$" id="5thN_UQQqmP" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQQqmQ" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQQqmR" role="3uHU7B">
                                <node concept="3clFbC" id="5thN_UQQqmS" role="3uHU7B">
                                  <node concept="2OqwBi" id="5thN_UQQqmT" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQQqmU" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQQqmV" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQQqmW" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQQqmX" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQQqmY" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQQqmZ" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQQqn0" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQQqn1" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQQqn2" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQQqn3" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQQqn4" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQQqn5" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQQqn6" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQQqn7" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQQqn8" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQQqn9" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQQqna" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQQqnb" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQQqnc" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQQqnd" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQQqne" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQQqnf" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQQqng" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQQqnh" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQQqni" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQQqnj" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQQqnk" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQQqnl" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQQqnm" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQQqnn" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQQqno" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQQqnp" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQQqnq" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbC" id="5thN_UQQqnr" role="3uHU7w">
                          <node concept="2OqwBi" id="5thN_UQQqns" role="3uHU7B">
                            <node concept="30H73N" id="5thN_UQQqnt" role="2Oq$k0" />
                            <node concept="3TrcHB" id="5thN_UQQqnu" role="2OqNvi">
                              <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5thN_UQQqnv" role="3uHU7w">
                            <node concept="1XH99k" id="5thN_UQQqnw" role="2Oq$k0">
                              <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                            </node>
                            <node concept="2ViDtV" id="5thN_UQQqnx" role="2OqNvi">
                              <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="gft3U" id="5thN_UQQqny" role="UU_$l">
                  <node concept="10Oyi0" id="5thN_UQQqnz" role="gfFT$" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_UQSq8d" role="jymVt" />
    <node concept="3clFb_" id="5thN_UQoq_u" role="jymVt">
      <property role="TrG5h" value="setAttributeName" />
      <node concept="3clFbS" id="5thN_UQoq_v" role="3clF47">
        <node concept="3clFbF" id="5thN_UQoq_w" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UQoq_x" role="3clFbG">
            <node concept="37vLTw" id="5thN_UQoq_y" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UQoq_A" resolve="name" />
            </node>
            <node concept="37vLTw" id="5thN_UQoq_z" role="37vLTJ">
              <ref role="3cqZAo" node="5thN_UPWRLp" resolve="attributeName" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UQoq_$" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UQoq__" role="3clF45" />
      <node concept="37vLTG" id="5thN_UQoq_A" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="10P_77" id="5thN_UQRh4K" role="1tU5fm">
          <node concept="1W57fq" id="5thN_UQRh4L" role="lGtFl">
            <node concept="3IZrLx" id="5thN_UQRh4M" role="3IZSJc">
              <node concept="3clFbS" id="5thN_UQRh4N" role="2VODD2">
                <node concept="3clFbF" id="5thN_UQRh4O" role="3cqZAp">
                  <node concept="3clFbC" id="5thN_UQRh4P" role="3clFbG">
                    <node concept="2OqwBi" id="5thN_UQRh4Q" role="3uHU7B">
                      <node concept="30H73N" id="5thN_UQRh4R" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_UQRh4S" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="5thN_UQRh4T" role="3uHU7w">
                      <node concept="1XH99k" id="5thN_UQRh4U" role="2Oq$k0">
                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                      </node>
                      <node concept="2ViDtV" id="5thN_UQRh4V" role="2OqNvi">
                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDO" resolve="BOOLEAN" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="gft3U" id="5thN_UQRh4W" role="UU_$l">
              <node concept="17QB3L" id="5thN_UQRh4X" role="gfFT$">
                <node concept="1W57fq" id="5thN_UQRh4Y" role="lGtFl">
                  <node concept="3IZrLx" id="5thN_UQRh4Z" role="3IZSJc">
                    <node concept="3clFbS" id="5thN_UQRh50" role="2VODD2">
                      <node concept="3clFbF" id="5thN_UQRh51" role="3cqZAp">
                        <node concept="22lmx$" id="5thN_UQRh52" role="3clFbG">
                          <node concept="22lmx$" id="5thN_UQRh53" role="3uHU7B">
                            <node concept="22lmx$" id="5thN_UQRh54" role="3uHU7B">
                              <node concept="22lmx$" id="5thN_UQRh55" role="3uHU7B">
                                <node concept="22lmx$" id="5thN_UQRh56" role="3uHU7B">
                                  <node concept="3clFbC" id="5thN_UQRh57" role="3uHU7B">
                                    <node concept="2OqwBi" id="5thN_UQRh58" role="3uHU7B">
                                      <node concept="30H73N" id="5thN_UQRh59" role="2Oq$k0" />
                                      <node concept="3TrcHB" id="5thN_UQRh5a" role="2OqNvi">
                                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                      </node>
                                    </node>
                                    <node concept="2OqwBi" id="5thN_UQRh5b" role="3uHU7w">
                                      <node concept="1XH99k" id="5thN_UQRh5c" role="2Oq$k0">
                                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                      </node>
                                      <node concept="2ViDtV" id="5thN_UQRh5d" role="2OqNvi">
                                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDM" resolve="TEXT" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3clFbC" id="5thN_UQRh5e" role="3uHU7w">
                                    <node concept="2OqwBi" id="5thN_UQRh5f" role="3uHU7B">
                                      <node concept="30H73N" id="5thN_UQRh5g" role="2Oq$k0" />
                                      <node concept="3TrcHB" id="5thN_UQRh5h" role="2OqNvi">
                                        <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                      </node>
                                    </node>
                                    <node concept="2OqwBi" id="5thN_UQRh5i" role="3uHU7w">
                                      <node concept="1XH99k" id="5thN_UQRh5j" role="2Oq$k0">
                                        <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                      </node>
                                      <node concept="2ViDtV" id="5thN_UQRh5k" role="2OqNvi">
                                        <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDR" resolve="IMAGE" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbC" id="5thN_UQRh5l" role="3uHU7w">
                                  <node concept="2OqwBi" id="5thN_UQRh5m" role="3uHU7B">
                                    <node concept="30H73N" id="5thN_UQRh5n" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="5thN_UQRh5o" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                    </node>
                                  </node>
                                  <node concept="2OqwBi" id="5thN_UQRh5p" role="3uHU7w">
                                    <node concept="1XH99k" id="5thN_UQRh5q" role="2Oq$k0">
                                      <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                    </node>
                                    <node concept="2ViDtV" id="5thN_UQRh5r" role="2OqNvi">
                                      <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDS" resolve="VIDEO" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbC" id="5thN_UQRh5s" role="3uHU7w">
                                <node concept="2OqwBi" id="5thN_UQRh5t" role="3uHU7B">
                                  <node concept="30H73N" id="5thN_UQRh5u" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="5thN_UQRh5v" role="2OqNvi">
                                    <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="5thN_UQRh5w" role="3uHU7w">
                                  <node concept="1XH99k" id="5thN_UQRh5x" role="2Oq$k0">
                                    <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                  </node>
                                  <node concept="2ViDtV" id="5thN_UQRh5y" role="2OqNvi">
                                    <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDT" resolve="URL" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbC" id="5thN_UQRh5z" role="3uHU7w">
                              <node concept="2OqwBi" id="5thN_UQRh5$" role="3uHU7B">
                                <node concept="30H73N" id="5thN_UQRh5_" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5thN_UQRh5A" role="2OqNvi">
                                  <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                                </node>
                              </node>
                              <node concept="2OqwBi" id="5thN_UQRh5B" role="3uHU7w">
                                <node concept="1XH99k" id="5thN_UQRh5C" role="2Oq$k0">
                                  <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                                </node>
                                <node concept="2ViDtV" id="5thN_UQRh5D" role="2OqNvi">
                                  <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDP" resolve="DATE" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbC" id="5thN_UQRh5E" role="3uHU7w">
                            <node concept="2OqwBi" id="5thN_UQRh5F" role="3uHU7B">
                              <node concept="30H73N" id="5thN_UQRh5G" role="2Oq$k0" />
                              <node concept="3TrcHB" id="5thN_UQRh5H" role="2OqNvi">
                                <ref role="3TsBF5" to="2rvu:7vG6G7pFVDY" resolve="type" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="5thN_UQRh5I" role="3uHU7w">
                              <node concept="1XH99k" id="5thN_UQRh5J" role="2Oq$k0">
                                <ref role="1XH99l" to="2rvu:7vG6G7pFVDL" resolve="PrimitiveType" />
                              </node>
                              <node concept="2ViDtV" id="5thN_UQRh5K" role="2OqNvi">
                                <ref role="2ViDtZ" to="2rvu:7vG6G7pFVDQ" resolve="DATETIME" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="gft3U" id="5thN_UQRh5L" role="UU_$l">
                    <node concept="10Oyi0" id="5thN_UQRh5M" role="gfFT$" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1WS0z7" id="5thN_UQoq_C" role="lGtFl">
        <node concept="3JmXsc" id="5thN_UQoq_D" role="3Jn$fo">
          <node concept="3clFbS" id="5thN_UQoq_E" role="2VODD2">
            <node concept="3clFbF" id="5thN_UQoq_F" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_UQoq_G" role="3clFbG">
                <node concept="3Tsc0h" id="5thN_UQoq_H" role="2OqNvi">
                  <ref role="3TtcxE" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
                </node>
                <node concept="30H73N" id="5thN_UQoq_I" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="5thN_UQoq_U" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="5thN_UQoq_V" role="3zH0cK">
          <node concept="3clFbS" id="5thN_UQoq_W" role="2VODD2">
            <node concept="3clFbF" id="5thN_UQoq_X" role="3cqZAp">
              <node concept="3cpWs3" id="5thN_UQoq_Y" role="3clFbG">
                <node concept="Xl_RD" id="5thN_UQoq_Z" role="3uHU7w">
                  <property role="Xl_RC" value="Name" />
                </node>
                <node concept="3cpWs3" id="5thN_UQoqA0" role="3uHU7B">
                  <node concept="Xl_RD" id="5thN_UQoqA1" role="3uHU7B">
                    <property role="Xl_RC" value="set" />
                  </node>
                  <node concept="2OqwBi" id="5thN_UQoqA2" role="3uHU7w">
                    <node concept="30H73N" id="5thN_UQoqA3" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_UQoqA4" role="2OqNvi">
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
    <node concept="2tJIrI" id="5thN_UQ0d5P" role="jymVt" />
    <node concept="n94m4" id="5thN_UOEJBp" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="17Uvod" id="5thN_UPz$XK" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="5thN_UPz$XL" role="3zH0cK">
        <node concept="3clFbS" id="5thN_UPz$XM" role="2VODD2">
          <node concept="3clFbF" id="5thN_UPzARd" role="3cqZAp">
            <node concept="3cpWs3" id="5thN_UQlb8A" role="3clFbG">
              <node concept="Xl_RD" id="5thN_UQlc78" role="3uHU7w">
                <property role="Xl_RC" value="Resource" />
              </node>
              <node concept="3cpWs3" id="5thN_UPzEbO" role="3uHU7B">
                <node concept="Xl_RD" id="5thN_UPzARc" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="5thN_UPzFAe" role="3uHU7w">
                  <node concept="30H73N" id="5thN_UPzFc6" role="2Oq$k0" />
                  <node concept="3TrcHB" id="5thN_UPzGgW" role="2OqNvi">
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
  <node concept="312cEu" id="5thN_UR4qaS">
    <property role="TrG5h" value="AuthorizationRule" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4qaT" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4qaU" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4qaV" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4qaW" role="2B70Vg">
          <property role="Xl_RC" value="AuthorizationRule" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4qaX" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4qaY" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4qaZ" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR4qb0" role="1zkMxy">
      <ref role="3uigEE" node="6Hrz6iyZqa4" resolve="GeneratedAuthorizationRule" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4Eu$">
    <property role="TrG5h" value="AutomationAction" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4Eu_" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4EuA" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4EuB" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4EuC" role="2B70Vg">
          <property role="Xl_RC" value="AutomationAction" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4EuD" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4EuE" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4EuF" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR4EuG" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UR5Ux8" resolve="GeneratedAutomationAction" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4GVl">
    <property role="TrG5h" value="AutomationCondition" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4GVm" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4GVn" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4GVo" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4GVp" role="2B70Vg">
          <property role="Xl_RC" value="AutomationCondition" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4GVq" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4GVr" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4GVs" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR4GVt" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UR5WIg" resolve="GeneratedAutomationCondition" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4IN1">
    <property role="TrG5h" value="AutomationRule" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4IN2" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4IN3" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4IN4" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4IN5" role="2B70Vg">
          <property role="Xl_RC" value="AutomationRule" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4IN6" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4IN7" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4IN8" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR4IN9" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UR62cx" resolve="GeneratedAutomationRule" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4Knk">
    <property role="TrG5h" value="ConditionValue" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4Knl" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4Knm" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4Knn" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4Kno" role="2B70Vg">
          <property role="Xl_RC" value="ConditionValue" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4Knp" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4Knq" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4Knr" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_URBK5A" role="1zkMxy">
      <ref role="3uigEE" node="5thN_URBH9k" resolve="GeneratedConditionValue" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4LPp">
    <property role="TrG5h" value="ContextResource" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4LPq" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4LPr" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4LPs" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4LPt" role="2B70Vg">
          <property role="Xl_RC" value="ContextResource" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4LPu" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4LPv" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4LPw" role="2B70Vg">
          <property role="Xl_RC" value="context_resources" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR4LPx" role="1zkMxy">
      <ref role="3uigEE" node="6Hrz6iyZxLF" resolve="GeneratedContextResource" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4QEw">
    <property role="TrG5h" value="Feedback" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4QEx" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4QEy" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4QEz" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4QE$" role="2B70Vg">
          <property role="Xl_RC" value="Feedback" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4QE_" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4QEA" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4QEB" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR4QEC" role="1zkMxy">
      <ref role="3uigEE" node="5thN_URrZ2g" resolve="GeneratedFeedback" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4TUw">
    <property role="TrG5h" value="ModerationPolicy" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4TUx" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4TUy" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4TUz" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4TU$" role="2B70Vg">
          <property role="Xl_RC" value="ModerationPolicy" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4TU_" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4TUA" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4TUB" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_URrT29" role="1zkMxy">
      <ref role="3uigEE" node="5thN_URrSJA" resolve="GeneratedModerationPolicy" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR4WiI">
    <property role="TrG5h" value="SortingPolicy" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR4WiJ" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR4WiK" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR4WiL" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4WiM" role="2B70Vg">
          <property role="Xl_RC" value="SortingPolicy" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR4WiN" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR4WiO" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR4WiP" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UREo4r" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UREnNc" resolve="GeneratedSortingPolicy" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR5PQl">
    <property role="TrG5h" value="ValidationRule" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR5PQm" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR5PQn" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR5PQo" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR5PQp" role="2B70Vg">
          <property role="Xl_RC" value="ValidationRule" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR5PQq" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR5PQr" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR5PQs" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UREr2N" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UREqJa" resolve="GeneratedValidationRule" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR5RPC">
    <property role="TrG5h" value="VerificationPolicy" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_UR5RPD" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR5RPE" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_UR5RPF" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR5RPG" role="2B70Vg">
          <property role="Xl_RC" value="VerificationPolicy" />
        </node>
      </node>
    </node>
    <node concept="2AHcQZ" id="5thN_UR5RPH" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_UR5RPI" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_UR5RPJ" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="5thN_UR5RPK" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UREuLg" resolve="GeneratedVerificationPolicy" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR5Ux8">
    <property role="TrG5h" value="GeneratedAutomationAction" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UR5Ux9" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR5Uxa" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UR5Uxb" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UR5Uxd" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR5Uxe" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UR5Uxf" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URi1AD" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5Uxh" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5Uxi" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRTHV" role="jymVt" />
    <node concept="312cEg" id="5thN_UR5Uxj" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_UR5Uxl" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR5Uxm" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR5Uxn" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR5Uxo" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR5Uxp" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5Uxq" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5Uxr" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRTUf" role="jymVt" />
    <node concept="312cEg" id="5thN_UR5Uxs" role="jymVt">
      <property role="TrG5h" value="kind" />
      <node concept="2AHcQZ" id="5thN_UR5Uxu" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UR5Uxv" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URi1AG" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR5Uxx" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR5Uxy" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR5Uxz" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR5Ux$" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR5Ux_" role="2B70Vg">
            <property role="3cmrfH" value="30" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5UxA" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYCsr" resolve="ActionResultKind" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5UxB" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRU6z" role="jymVt" />
    <node concept="312cEg" id="5thN_UR5UxC" role="jymVt">
      <property role="TrG5h" value="message" />
      <node concept="2AHcQZ" id="5thN_UR5UxE" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR5UxF" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR5UxG" role="2B70Vg">
            <property role="3cmrfH" value="500" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5UxH" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5UxI" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRUiR" role="jymVt" />
    <node concept="312cEg" id="5thN_UR5UxJ" role="jymVt">
      <property role="TrG5h" value="automationRule" />
      <node concept="2AHcQZ" id="5thN_UR5UxL" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR5UxM" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UR5UxN" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URi1AA" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5UxP" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_UR5UxQ" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR5UxR" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UR5UxS" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR5UxT" role="2B70Vg">
            <property role="Xl_RC" value="automation_rule_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5UxU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR5UxV" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5UxW" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5UxX" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRUvb" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5UxY" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UR5UxZ" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5Uy0" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5Uy1" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5Uxb" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uy2" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5Uy3" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRUQi" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5Uy4" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UR5Uy5" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UR5Uy6" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5Uy7" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5Uy8" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5Uy9" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5Uya" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5Uyb" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5Uyc" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5Uxb" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5Uyd" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5Uy5" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uye" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5Uyf" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2H" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5Uyg" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_UR5Uyh" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5Uyi" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5Uyj" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5Uxj" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uyk" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5Uyl" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2I" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5Uym" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_UR5Uyn" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_UR5Uyo" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5Uyp" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5Uyq" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5Uyr" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5Uys" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5Uyt" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5Uyu" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5Uxj" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5Uyv" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5Uyn" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uyw" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5Uyx" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2J" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5Uyy" role="jymVt">
      <property role="TrG5h" value="getKind" />
      <node concept="3clFbS" id="5thN_UR5Uyz" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5Uy$" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5Uy_" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5Uxs" resolve="kind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5UyA" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5UyB" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYCsr" resolve="ActionResultKind" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2K" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5UyC" role="jymVt">
      <property role="TrG5h" value="setKind" />
      <node concept="37vLTG" id="5thN_UR5UyD" role="3clF46">
        <property role="TrG5h" value="kind" />
        <node concept="3uibUv" id="5thN_UR5UyE" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYCsr" resolve="ActionResultKind" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5UyF" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5UyG" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5UyH" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5UyI" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5UyJ" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5UyK" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5Uxs" resolve="kind" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5UyL" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5UyD" resolve="kind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5UyM" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5UyN" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2L" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5UyO" role="jymVt">
      <property role="TrG5h" value="getMessage" />
      <node concept="3clFbS" id="5thN_UR5UyP" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5UyQ" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5UyR" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5UxC" resolve="message" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5UyS" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5UyT" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2M" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5UyU" role="jymVt">
      <property role="TrG5h" value="setMessage" />
      <node concept="37vLTG" id="5thN_UR5UyV" role="3clF46">
        <property role="TrG5h" value="message" />
        <node concept="3uibUv" id="5thN_UR5UyW" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5UyX" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5UyY" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5UyZ" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5Uz0" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5Uz1" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5Uz2" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5UxC" resolve="message" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5Uz3" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5UyV" resolve="message" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uz4" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5Uz5" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2N" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5Uz6" role="jymVt">
      <property role="TrG5h" value="getAutomationRule" />
      <node concept="3clFbS" id="5thN_UR5Uz7" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5Uz8" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5Uz9" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5UxJ" resolve="automationRule" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uza" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5Uzb" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRV2O" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5Uzc" role="jymVt">
      <property role="TrG5h" value="setAutomationRule" />
      <node concept="37vLTG" id="5thN_UR5Uzd" role="3clF46">
        <property role="TrG5h" value="automationRule" />
        <node concept="3uibUv" id="5thN_UR5Uze" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5Uzf" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5Uzg" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5Uzh" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5Uzi" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5Uzj" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5Uzk" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5UxJ" resolve="automationRule" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5Uzl" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5Uzd" resolve="automationRule" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5Uzm" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5Uzn" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR5WIg">
    <property role="TrG5h" value="GeneratedAutomationCondition" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UR5WIh" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR5WIi" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UR5WIj" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UR5WIl" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR5WIm" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UR5WIn" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URhYGE" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5WIp" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5WIq" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR5WIr" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_UR5WIt" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR5WIu" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR5WIv" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR5WIw" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR5WIx" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5WIy" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5WIz" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR5WI$" role="jymVt">
      <property role="TrG5h" value="attributeName" />
      <node concept="2AHcQZ" id="5thN_UR5WIA" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR5WIB" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR5WIC" role="2B70Vg">
            <property role="Xl_RC" value="attribute_name" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5WID" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR5WIE" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5WIF" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5WIG" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR5WIH" role="jymVt">
      <property role="TrG5h" value="operator" />
      <node concept="2AHcQZ" id="5thN_UR5WIJ" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UR5WIK" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URhYGX" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR5WIM" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR5WIN" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR5WIO" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR5WIP" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR5WIQ" role="2B70Vg">
            <property role="3cmrfH" value="30" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5WIR" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYC$u" resolve="ConditionOperator" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5WIS" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR5WIT" role="jymVt">
      <property role="TrG5h" value="automationRule" />
      <node concept="2AHcQZ" id="5thN_UR5WIV" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR5WIW" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UR5WIX" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URhYGB" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5WIZ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_UR5WJ0" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR5WJ1" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UR5WJ2" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR5WJ3" role="2B70Vg">
            <property role="Xl_RC" value="automation_rule_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5WJ4" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR5WJ5" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5WJ6" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR5WJ7" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR5WJ8" role="jymVt">
      <property role="TrG5h" value="values" />
      <node concept="2AHcQZ" id="5thN_UR5WJa" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~OneToMany" resolve="OneToMany" />
        <node concept="2B6LJw" id="5thN_UR5WJb" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.mappedBy()" resolve="mappedBy" />
          <node concept="Xl_RD" id="5thN_UR5WJc" role="2B70Vg">
            <property role="Xl_RC" value="condition" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5WJd" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.cascade()" resolve="cascade" />
          <node concept="Rm8GO" id="5thN_URhYGO" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~CascadeType" resolve="CascadeType" />
            <ref role="Rm8GQ" to="p99f:~CascadeType.ALL" resolve="ALL" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR5WJf" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.orphanRemoval()" resolve="orphanRemoval" />
          <node concept="3clFbT" id="5thN_UR5WJg" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR5WJh" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_UR5WJi" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4Knk" resolve="ConditionValue" />
        </node>
      </node>
      <node concept="2ShNRf" id="5thN_URhYGP" role="33vP2m">
        <node concept="1pGfFk" id="5thN_URhYGU" role="2ShVmc">
          <property role="373rjd" value="true" />
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
        </node>
      </node>
      <node concept="3Tm6S6" id="5thN_UR5WJk" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_UR5WJl" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UR5WJm" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5WJn" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5WJo" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5WIj" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WJp" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5WJq" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQP" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WJr" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UR5WJs" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UR5WJt" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5WJu" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5WJv" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5WJw" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5WJx" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5WJy" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5WJz" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5WIj" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5WJ$" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5WJs" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WJ_" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5WJA" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQQ" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WJB" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_UR5WJC" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5WJD" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5WJE" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5WIr" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WJF" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5WJG" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQR" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WJH" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_UR5WJI" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_UR5WJJ" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5WJK" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5WJL" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5WJM" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5WJN" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5WJO" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5WJP" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5WIr" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5WJQ" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5WJI" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WJR" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5WJS" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQS" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WJT" role="jymVt">
      <property role="TrG5h" value="getAttributeName" />
      <node concept="3clFbS" id="5thN_UR5WJU" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5WJV" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5WJW" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5WI$" resolve="attributeName" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WJX" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5WJY" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQT" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WJZ" role="jymVt">
      <property role="TrG5h" value="setAttributeName" />
      <node concept="37vLTG" id="5thN_UR5WK0" role="3clF46">
        <property role="TrG5h" value="attributeName" />
        <node concept="3uibUv" id="5thN_UR5WK1" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5WK2" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5WK3" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5WK4" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5WK5" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5WK6" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5WK7" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5WI$" resolve="attributeName" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5WK8" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5WK0" resolve="attributeName" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WK9" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5WKa" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQU" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WKb" role="jymVt">
      <property role="TrG5h" value="getOperator" />
      <node concept="3clFbS" id="5thN_UR5WKc" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5WKd" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5WKe" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5WIH" resolve="operator" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WKf" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5WKg" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYC$u" resolve="ConditionOperator" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQV" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WKh" role="jymVt">
      <property role="TrG5h" value="setOperator" />
      <node concept="37vLTG" id="5thN_UR5WKi" role="3clF46">
        <property role="TrG5h" value="operator" />
        <node concept="3uibUv" id="5thN_UR5WKj" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYC$u" resolve="ConditionOperator" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5WKk" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5WKl" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5WKm" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5WKn" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5WKo" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5WKp" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5WIH" resolve="operator" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5WKq" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5WKi" resolve="operator" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WKr" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5WKs" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQW" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WKt" role="jymVt">
      <property role="TrG5h" value="getAutomationRule" />
      <node concept="3clFbS" id="5thN_UR5WKu" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5WKv" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5WKw" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5WIT" resolve="automationRule" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WKx" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5WKy" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQX" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WKz" role="jymVt">
      <property role="TrG5h" value="setAutomationRule" />
      <node concept="37vLTG" id="5thN_UR5WK$" role="3clF46">
        <property role="TrG5h" value="automationRule" />
        <node concept="3uibUv" id="5thN_UR5WK_" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5WKA" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5WKB" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR5WKC" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR5WKD" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR5WKE" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR5WKF" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR5WIT" resolve="automationRule" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR5WKG" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR5WK$" resolve="automationRule" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WKH" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5WKI" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQY" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WKJ" role="jymVt">
      <property role="TrG5h" value="getValues" />
      <node concept="3clFbS" id="5thN_UR5WKK" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR5WKL" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR5WKM" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR5WJ8" resolve="values" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WKN" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR5WKO" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_UR5WKP" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4Knk" resolve="ConditionValue" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRVQZ" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR5WKQ" role="jymVt">
      <property role="TrG5h" value="addValue" />
      <node concept="37vLTG" id="5thN_UR5WKR" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="3uibUv" id="5thN_UR5WKS" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4Knk" resolve="ConditionValue" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR5WKT" role="3clF47">
        <node concept="3clFbF" id="5thN_UR5WKU" role="3cqZAp">
          <node concept="2OqwBi" id="5thN_UREj4I" role="3clFbG">
            <node concept="37vLTw" id="5thN_URhYGH" role="2Oq$k0">
              <ref role="3cqZAo" node="5thN_UR5WKR" resolve="value" />
            </node>
            <node concept="liA8E" id="5thN_UREj4J" role="2OqNvi">
              <ref role="37wK5l" node="5thN_URBHah" resolve="setCondition" />
              <node concept="10QFUN" id="5thN_UREj4K" role="37wK5m">
                <node concept="Xjq3P" id="5thN_UREj4L" role="10QFUP" />
                <node concept="3uibUv" id="5thN_UREj4M" role="10QFUM">
                  <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5thN_UR5WKZ" role="3cqZAp">
          <node concept="2OqwBi" id="5thN_URi0le" role="3clFbG">
            <node concept="37vLTw" id="5thN_URhYH0" role="2Oq$k0">
              <ref role="3cqZAo" node="5thN_UR5WJ8" resolve="values" />
            </node>
            <node concept="liA8E" id="5thN_URi0lf" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object)" resolve="add" />
              <node concept="37vLTw" id="5thN_URi0lg" role="37wK5m">
                <ref role="3cqZAo" node="5thN_UR5WKR" resolve="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR5WL2" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR5WL3" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR62cx">
    <property role="TrG5h" value="GeneratedAutomationRule" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UR62cy" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR62cz" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UR62c$" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UR62cA" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR62cB" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UR62cC" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URi4ER" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62cE" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62cF" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62cG" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_UR62cI" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR62cJ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR62cK" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR62cL" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="5thN_UR62cM" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62cN" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR62cO" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62cP" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62cQ" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62cR" role="jymVt">
      <property role="TrG5h" value="trigger" />
      <node concept="2AHcQZ" id="5thN_UR62cT" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UR62cU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URi4uh" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR62cW" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR62cX" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR62cY" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR62cZ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR62d0" role="2B70Vg">
            <property role="3cmrfH" value="32" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62d1" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62d2" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62d3" role="jymVt">
      <property role="TrG5h" value="contextResource" />
      <node concept="2AHcQZ" id="5thN_UR62d5" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR62d6" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR62d7" role="2B70Vg">
            <property role="Xl_RC" value="context_resource" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62d8" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR62d9" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62da" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62db" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62dc" role="jymVt">
      <property role="TrG5h" value="onFeedback" />
      <node concept="2AHcQZ" id="5thN_UR62de" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR62df" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR62dg" role="2B70Vg">
            <property role="Xl_RC" value="on_feedback" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62dh" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR62di" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62dj" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62dk" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62dl" role="jymVt">
      <property role="TrG5h" value="context" />
      <node concept="2AHcQZ" id="5thN_UR62dn" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UR62do" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URi4tS" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR62dq" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UR62dr" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR62ds" role="2B70Vg">
            <property role="Xl_RC" value="context_id" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62dt" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62du" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62dv" role="jymVt">
      <property role="TrG5h" value="usesValidation" />
      <node concept="2AHcQZ" id="5thN_UR62dx" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UR62dy" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URi4EU" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR62d$" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UR62d_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR62dA" role="2B70Vg">
            <property role="Xl_RC" value="uses_validation_id" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62dB" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UR5PQl" resolve="ValidationRule" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR62dC" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62dD" role="jymVt">
      <property role="TrG5h" value="conditions" />
      <node concept="2AHcQZ" id="5thN_UR62dF" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~OneToMany" resolve="OneToMany" />
        <node concept="2B6LJw" id="5thN_UR62dG" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.mappedBy()" resolve="mappedBy" />
          <node concept="Xl_RD" id="5thN_UR62dH" role="2B70Vg">
            <property role="Xl_RC" value="automationRule" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62dI" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.cascade()" resolve="cascade" />
          <node concept="Rm8GO" id="5thN_URi4u3" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~CascadeType" resolve="CascadeType" />
            <ref role="Rm8GQ" to="p99f:~CascadeType.ALL" resolve="ALL" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62dK" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.orphanRemoval()" resolve="orphanRemoval" />
          <node concept="3clFbT" id="5thN_UR62dL" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62dM" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_UR62dN" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
        </node>
      </node>
      <node concept="2ShNRf" id="5thN_URi4tT" role="33vP2m">
        <node concept="1pGfFk" id="5thN_URi4tY" role="2ShVmc">
          <property role="373rjd" value="true" />
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
        </node>
      </node>
      <node concept="3Tm6S6" id="5thN_UR62dP" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UR62dQ" role="jymVt">
      <property role="TrG5h" value="actions" />
      <node concept="2AHcQZ" id="5thN_UR62dS" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~OneToMany" resolve="OneToMany" />
        <node concept="2B6LJw" id="5thN_UR62dT" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.mappedBy()" resolve="mappedBy" />
          <node concept="Xl_RD" id="5thN_UR62dU" role="2B70Vg">
            <property role="Xl_RC" value="automationRule" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62dV" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.cascade()" resolve="cascade" />
          <node concept="Rm8GO" id="5thN_URi4ue" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~CascadeType" resolve="CascadeType" />
            <ref role="Rm8GQ" to="p99f:~CascadeType.ALL" resolve="ALL" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR62dX" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.orphanRemoval()" resolve="orphanRemoval" />
          <node concept="3clFbT" id="5thN_UR62dY" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR62dZ" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_UR62e0" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4Eu$" resolve="AutomationAction" />
        </node>
      </node>
      <node concept="2ShNRf" id="5thN_URi4u4" role="33vP2m">
        <node concept="1pGfFk" id="5thN_URi4u9" role="2ShVmc">
          <property role="373rjd" value="true" />
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
        </node>
      </node>
      <node concept="3Tm6S6" id="5thN_UR62e2" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_UR62e3" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UR62e4" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62e5" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62e6" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62c$" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62e7" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62e8" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXke" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62e9" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UR62ea" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UR62eb" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62ec" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62ed" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62ee" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62ef" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62eg" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62eh" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62c$" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62ei" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62ea" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62ej" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62ek" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkf" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62el" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_UR62em" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62en" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62eo" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62cG" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62ep" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62eq" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkg" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62er" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_UR62es" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_UR62et" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62eu" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62ev" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62ew" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62ex" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62ey" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62ez" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62cG" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62e$" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62es" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62e_" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62eA" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkh" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62eB" role="jymVt">
      <property role="TrG5h" value="getTrigger" />
      <node concept="3clFbS" id="5thN_UR62eC" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62eD" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62eE" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62cR" resolve="trigger" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62eF" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62eG" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXki" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62eH" role="jymVt">
      <property role="TrG5h" value="setTrigger" />
      <node concept="37vLTG" id="5thN_UR62eI" role="3clF46">
        <property role="TrG5h" value="trigger" />
        <node concept="3uibUv" id="5thN_UR62eJ" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62eK" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62eL" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62eM" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62eN" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62eO" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62eP" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62cR" resolve="trigger" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62eQ" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62eI" resolve="trigger" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62eR" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62eS" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkj" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62eT" role="jymVt">
      <property role="TrG5h" value="getContextResource" />
      <node concept="3clFbS" id="5thN_UR62eU" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62eV" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62eW" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62d3" resolve="contextResource" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62eX" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62eY" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkk" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62eZ" role="jymVt">
      <property role="TrG5h" value="setContextResource" />
      <node concept="37vLTG" id="5thN_UR62f0" role="3clF46">
        <property role="TrG5h" value="contextResource" />
        <node concept="3uibUv" id="5thN_UR62f1" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62f2" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62f3" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62f4" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62f5" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62f6" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62f7" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62d3" resolve="contextResource" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62f8" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62f0" resolve="contextResource" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62f9" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62fa" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkl" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62fb" role="jymVt">
      <property role="TrG5h" value="getOnFeedback" />
      <node concept="3clFbS" id="5thN_UR62fc" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62fd" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62fe" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62dc" resolve="onFeedback" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62ff" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62fg" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkm" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62fh" role="jymVt">
      <property role="TrG5h" value="setOnFeedback" />
      <node concept="37vLTG" id="5thN_UR62fi" role="3clF46">
        <property role="TrG5h" value="onFeedback" />
        <node concept="3uibUv" id="5thN_UR62fj" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62fk" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62fl" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62fm" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62fn" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62fo" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62fp" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62dc" resolve="onFeedback" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62fq" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62fi" resolve="onFeedback" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62fr" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62fs" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkn" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62ft" role="jymVt">
      <property role="TrG5h" value="getContext" />
      <node concept="3clFbS" id="5thN_UR62fu" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62fv" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62fw" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62dl" resolve="context" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62fx" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62fy" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXko" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62fz" role="jymVt">
      <property role="TrG5h" value="setContext" />
      <node concept="37vLTG" id="5thN_UR62f$" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="5thN_UR62f_" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62fA" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62fB" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62fC" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62fD" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62fE" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62fF" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62dl" resolve="context" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62fG" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62f$" resolve="context" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62fH" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62fI" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkp" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62fJ" role="jymVt">
      <property role="TrG5h" value="getUsesValidation" />
      <node concept="3clFbS" id="5thN_UR62fK" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62fL" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62fM" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62dv" resolve="usesValidation" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62fN" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62fO" role="3clF45">
        <ref role="3uigEE" node="5thN_UR5PQl" resolve="ValidationRule" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkq" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62fP" role="jymVt">
      <property role="TrG5h" value="setUsesValidation" />
      <node concept="37vLTG" id="5thN_UR62fQ" role="3clF46">
        <property role="TrG5h" value="usesValidation" />
        <node concept="3uibUv" id="5thN_UR62fR" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR5PQl" resolve="ValidationRule" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62fS" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62fT" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR62fU" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR62fV" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR62fW" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR62fX" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR62dv" resolve="usesValidation" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR62fY" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR62fQ" resolve="usesValidation" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62fZ" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62g0" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkr" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62g1" role="jymVt">
      <property role="TrG5h" value="getConditions" />
      <node concept="3clFbS" id="5thN_UR62g2" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62g3" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62g4" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62dD" resolve="conditions" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62g5" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62g6" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_UR62g7" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXks" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62g8" role="jymVt">
      <property role="TrG5h" value="addCondition" />
      <node concept="37vLTG" id="5thN_UR62g9" role="3clF46">
        <property role="TrG5h" value="condition" />
        <node concept="3uibUv" id="5thN_UR62ga" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62gb" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62gc" role="3cqZAp">
          <node concept="2OqwBi" id="5thN_URi6UE" role="3clFbG">
            <node concept="37vLTw" id="5thN_URi4tx" role="2Oq$k0">
              <ref role="3cqZAo" node="5thN_UR62g9" resolve="condition" />
            </node>
            <node concept="liA8E" id="5thN_URi6UF" role="2OqNvi">
              <ref role="37wK5l" node="5thN_UR5WKz" resolve="setAutomationRule" />
              <node concept="10QFUN" id="5thN_URi6UG" role="37wK5m">
                <node concept="Xjq3P" id="5thN_URi6UH" role="10QFUP" />
                <node concept="3uibUv" id="5thN_URi6UI" role="10QFUM">
                  <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5thN_UR62gh" role="3cqZAp">
          <node concept="2OqwBi" id="5thN_URi6hx" role="3clFbG">
            <node concept="37vLTw" id="5thN_URi4uk" role="2Oq$k0">
              <ref role="3cqZAo" node="5thN_UR62dD" resolve="conditions" />
            </node>
            <node concept="liA8E" id="5thN_URi6hy" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object)" resolve="add" />
              <node concept="37vLTw" id="5thN_URi6hz" role="37wK5m">
                <ref role="3cqZAo" node="5thN_UR62g9" resolve="condition" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62gk" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62gl" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXkt" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62gm" role="jymVt">
      <property role="TrG5h" value="getActions" />
      <node concept="3clFbS" id="5thN_UR62gn" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR62go" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR62gp" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR62dQ" resolve="actions" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62gq" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR62gr" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_UR62gs" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4Eu$" resolve="AutomationAction" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRXku" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR62gt" role="jymVt">
      <property role="TrG5h" value="addAction" />
      <node concept="37vLTG" id="5thN_UR62gu" role="3clF46">
        <property role="TrG5h" value="action" />
        <node concept="3uibUv" id="5thN_UR62gv" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4Eu$" resolve="AutomationAction" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR62gw" role="3clF47">
        <node concept="3clFbF" id="5thN_UR62gx" role="3cqZAp">
          <node concept="2OqwBi" id="5thN_URi6um" role="3clFbG">
            <node concept="37vLTw" id="5thN_URi4tJ" role="2Oq$k0">
              <ref role="3cqZAo" node="5thN_UR62gu" resolve="action" />
            </node>
            <node concept="liA8E" id="5thN_URi6un" role="2OqNvi">
              <ref role="37wK5l" node="5thN_UR5Uzc" resolve="setAutomationRule" />
              <node concept="10QFUN" id="5thN_URi6uo" role="37wK5m">
                <node concept="Xjq3P" id="5thN_URi6up" role="10QFUP" />
                <node concept="3uibUv" id="5thN_URi6uq" role="10QFUM">
                  <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5thN_UR62gA" role="3cqZAp">
          <node concept="2OqwBi" id="5thN_URi6H2" role="3clFbG">
            <node concept="37vLTw" id="5thN_URi4tC" role="2Oq$k0">
              <ref role="3cqZAo" node="5thN_UR62dQ" resolve="actions" />
            </node>
            <node concept="liA8E" id="5thN_URi6H3" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object)" resolve="add" />
              <node concept="37vLTw" id="5thN_URi6H4" role="37wK5m">
                <ref role="3cqZAo" node="5thN_UR62gu" resolve="action" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR62gD" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR62gE" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_URrSJA">
    <property role="TrG5h" value="GeneratedModerationPolicy" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_URrSJB" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URrSJC" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_URrSJD" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_URrSJF" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_URrSJG" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_URrSJH" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_UREmke" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSJJ" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSJK" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSJL" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_URrSJN" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSJO" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrSJP" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrSJQ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="5thN_URrSJR" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrSJS" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSJT" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSJU" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSJV" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSJW" role="jymVt">
      <property role="TrG5h" value="mode" />
      <node concept="2AHcQZ" id="5thN_URrSJY" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrSJZ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREmk5" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrSK1" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSK2" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrSK3" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrSK4" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSK5" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSK6" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEih" resolve="ModerationMode" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSK7" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSK8" role="jymVt">
      <property role="TrG5h" value="trigger" />
      <node concept="2AHcQZ" id="5thN_URrSKa" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrSKb" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREmk8" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrSKd" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSKe" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrSKf" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrSKg" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSKh" role="2B70Vg">
            <property role="3cmrfH" value="32" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSKi" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSKj" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSKk" role="jymVt">
      <property role="TrG5h" value="decision" />
      <node concept="2AHcQZ" id="5thN_URrSKm" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrSKn" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREmkk" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrSKp" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSKq" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrSKr" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrSKs" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSKt" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSKu" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEcY" resolve="ModerationDecision" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSKv" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSKw" role="jymVt">
      <property role="TrG5h" value="monitorsResource" />
      <node concept="2AHcQZ" id="5thN_URrSKy" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSKz" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrSK$" role="2B70Vg">
            <property role="Xl_RC" value="monitors_resource" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrSK_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSKA" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSKB" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSKC" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSKD" role="jymVt">
      <property role="TrG5h" value="monitorsFeedback" />
      <node concept="2AHcQZ" id="5thN_URrSKF" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSKG" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrSKH" role="2B70Vg">
            <property role="Xl_RC" value="monitors_feedback" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrSKI" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSKJ" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSKK" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSKL" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSKM" role="jymVt">
      <property role="TrG5h" value="executedByKind" />
      <node concept="2AHcQZ" id="5thN_URrSKO" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrSKP" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREmkh" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrSKR" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrSKS" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrSKT" role="2B70Vg">
            <property role="Xl_RC" value="executed_by_kind" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrSKU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrSKV" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSKW" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSKX" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URrSKY" role="jymVt">
      <property role="TrG5h" value="context" />
      <node concept="2AHcQZ" id="5thN_URrSL0" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_URrSL1" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_UREmkb" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrSL3" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_URrSL4" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrSL5" role="2B70Vg">
            <property role="Xl_RC" value="context_id" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrSL6" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrSL7" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_URrSL8" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_URrSL9" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSLa" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSLb" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSJD" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSLc" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSLd" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSLe" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_URrSLf" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_URrSLg" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSLh" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSLi" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSLj" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSLk" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSLl" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSLm" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSJD" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSLn" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSLf" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSLo" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSLp" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSLq" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_URrSLr" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSLs" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSLt" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSJL" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSLu" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSLv" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSLw" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_URrSLx" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_URrSLy" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSLz" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSL$" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSL_" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSLA" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSLB" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSLC" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSJL" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSLD" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSLx" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSLE" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSLF" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSLG" role="jymVt">
      <property role="TrG5h" value="getMode" />
      <node concept="3clFbS" id="5thN_URrSLH" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSLI" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSLJ" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSJW" resolve="mode" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSLK" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSLL" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEih" resolve="ModerationMode" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSLM" role="jymVt">
      <property role="TrG5h" value="setMode" />
      <node concept="37vLTG" id="5thN_URrSLN" role="3clF46">
        <property role="TrG5h" value="mode" />
        <node concept="3uibUv" id="5thN_URrSLO" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEih" resolve="ModerationMode" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSLP" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSLQ" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSLR" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSLS" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSLT" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSLU" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSJW" resolve="mode" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSLV" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSLN" resolve="mode" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSLW" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSLX" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSLY" role="jymVt">
      <property role="TrG5h" value="getTrigger" />
      <node concept="3clFbS" id="5thN_URrSLZ" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSM0" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSM1" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSK8" resolve="trigger" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSM2" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSM3" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSM4" role="jymVt">
      <property role="TrG5h" value="setTrigger" />
      <node concept="37vLTG" id="5thN_URrSM5" role="3clF46">
        <property role="TrG5h" value="trigger" />
        <node concept="3uibUv" id="5thN_URrSM6" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSM7" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSM8" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSM9" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSMa" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSMb" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSMc" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSK8" resolve="trigger" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSMd" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSM5" resolve="trigger" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSMe" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSMf" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSMg" role="jymVt">
      <property role="TrG5h" value="getDecision" />
      <node concept="3clFbS" id="5thN_URrSMh" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSMi" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSMj" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSKk" resolve="decision" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSMk" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSMl" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEcY" resolve="ModerationDecision" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSMm" role="jymVt">
      <property role="TrG5h" value="setDecision" />
      <node concept="37vLTG" id="5thN_URrSMn" role="3clF46">
        <property role="TrG5h" value="decision" />
        <node concept="3uibUv" id="5thN_URrSMo" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEcY" resolve="ModerationDecision" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSMp" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSMq" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSMr" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSMs" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSMt" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSMu" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSKk" resolve="decision" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSMv" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSMn" resolve="decision" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSMw" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSMx" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSMy" role="jymVt">
      <property role="TrG5h" value="getMonitorsResource" />
      <node concept="3clFbS" id="5thN_URrSMz" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSM$" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSM_" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSKw" resolve="monitorsResource" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSMA" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSMB" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSMC" role="jymVt">
      <property role="TrG5h" value="setMonitorsResource" />
      <node concept="37vLTG" id="5thN_URrSMD" role="3clF46">
        <property role="TrG5h" value="monitorsResource" />
        <node concept="3uibUv" id="5thN_URrSME" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSMF" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSMG" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSMH" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSMI" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSMJ" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSMK" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSKw" resolve="monitorsResource" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSML" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSMD" resolve="monitorsResource" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSMM" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSMN" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSMO" role="jymVt">
      <property role="TrG5h" value="getMonitorsFeedback" />
      <node concept="3clFbS" id="5thN_URrSMP" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSMQ" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSMR" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSKD" resolve="monitorsFeedback" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSMS" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSMT" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSMU" role="jymVt">
      <property role="TrG5h" value="setMonitorsFeedback" />
      <node concept="37vLTG" id="5thN_URrSMV" role="3clF46">
        <property role="TrG5h" value="monitorsFeedback" />
        <node concept="3uibUv" id="5thN_URrSMW" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSMX" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSMY" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSMZ" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSN0" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSN1" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSN2" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSKD" resolve="monitorsFeedback" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSN3" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSMV" resolve="monitorsFeedback" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSN4" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSN5" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSN6" role="jymVt">
      <property role="TrG5h" value="getExecutedByKind" />
      <node concept="3clFbS" id="5thN_URrSN7" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSN8" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSN9" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSKM" resolve="executedByKind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSNa" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSNb" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSNc" role="jymVt">
      <property role="TrG5h" value="setExecutedByKind" />
      <node concept="37vLTG" id="5thN_URrSNd" role="3clF46">
        <property role="TrG5h" value="executedByKind" />
        <node concept="3uibUv" id="5thN_URrSNe" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSNf" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSNg" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSNh" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSNi" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSNj" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSNk" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSKM" resolve="executedByKind" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSNl" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSNd" resolve="executedByKind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSNm" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSNn" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_URrSNo" role="jymVt">
      <property role="TrG5h" value="getContext" />
      <node concept="3clFbS" id="5thN_URrSNp" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrSNq" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrSNr" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrSKY" resolve="context" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSNs" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrSNt" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_URrSNu" role="jymVt">
      <property role="TrG5h" value="setContext" />
      <node concept="37vLTG" id="5thN_URrSNv" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="5thN_URrSNw" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrSNx" role="3clF47">
        <node concept="3clFbF" id="5thN_URrSNy" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrSNz" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrSN$" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrSN_" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrSNA" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrSKY" resolve="context" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrSNB" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrSNv" resolve="context" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrSNC" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrSND" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_URrZ2g">
    <property role="TrG5h" value="GeneratedFeedback" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_URrZ2h" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URrZ2i" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_URrZ2j" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_URrZ2l" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ2m" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_URrZ2n" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URs8iS" role="2B70Vg">
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ2p" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ2q" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsfMR" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ2r" role="jymVt">
      <property role="TrG5h" value="subjectResourceFieldName" />
      <node concept="2AHcQZ" id="5thN_URrZ2t" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_URrZ2u" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URs3Gs" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ2w" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_URrZ2x" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ2y" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_URrZ2z" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ2$" role="2B70Vg">
            <property role="Xl_RC" value="subjectResourceFieldName_id" />
            <node concept="17Uvod" id="5thN_URths3" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="5thN_URths4" role="3zH0cK">
                <node concept="3clFbS" id="5thN_URths5" role="2VODD2">
                  <node concept="3clFbF" id="5thN_URtih$" role="3cqZAp">
                    <node concept="3cpWs3" id="5thN_URtqqS" role="3clFbG">
                      <node concept="Xl_RD" id="5thN_URtqtI" role="3uHU7w">
                        <property role="Xl_RC" value="_id" />
                      </node>
                      <node concept="2OqwBi" id="5thN_URtmGR" role="3uHU7B">
                        <node concept="2OqwBi" id="5thN_URtkDb" role="2Oq$k0">
                          <node concept="30H73N" id="5thN_URtjVp" role="2Oq$k0" />
                          <node concept="3TrEf2" id="5thN_URtlIR" role="2OqNvi">
                            <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="5thN_URtnFa" role="2OqNvi">
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
        <node concept="2B6LJw" id="5thN_URrZ2_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ2A" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ2B" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ2C" role="1B3o_S" />
      <node concept="1W57fq" id="5thN_URsIpl" role="lGtFl">
        <node concept="3IZrLx" id="5thN_URsIpo" role="3IZSJc">
          <node concept="3clFbS" id="5thN_URsIpp" role="2VODD2">
            <node concept="3clFbF" id="5thN_URsIpv" role="3cqZAp">
              <node concept="3y3z36" id="5thN_URsPgP" role="3clFbG">
                <node concept="10Nm6u" id="5thN_URsPTL" role="3uHU7w" />
                <node concept="2OqwBi" id="5thN_URsIpq" role="3uHU7B">
                  <node concept="3TrEf2" id="5thN_URsJRP" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                  </node>
                  <node concept="30H73N" id="5thN_URsIpu" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="5thN_URttcS" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="5thN_URttcT" role="3zH0cK">
          <node concept="3clFbS" id="5thN_URttcU" role="2VODD2">
            <node concept="3clFbF" id="5thN_URtu8t" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_URtu8v" role="3clFbG">
                <node concept="2OqwBi" id="5thN_URtu8w" role="2Oq$k0">
                  <node concept="30H73N" id="5thN_URtu8x" role="2Oq$k0" />
                  <node concept="3TrEf2" id="5thN_URtu8y" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
                  </node>
                </node>
                <node concept="3TrcHB" id="5thN_URtu8z" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsgO2" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ2D" role="jymVt">
      <property role="TrG5h" value="subjectFeedbackFieldName" />
      <node concept="2AHcQZ" id="5thN_URrZ2F" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_URrZ2G" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URs3GD" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ2I" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_URt2Ej" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ2K" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_URrZ2L" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ2M" role="2B70Vg">
            <property role="Xl_RC" value="subjectFeedbackFieldName_id" />
            <node concept="17Uvod" id="5thN_URtv5X" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="5thN_URtv5Y" role="3zH0cK">
                <node concept="3clFbS" id="5thN_URtv5Z" role="2VODD2">
                  <node concept="3clFbF" id="5thN_URtw7Y" role="3cqZAp">
                    <node concept="2OqwBi" id="5thN_URt_yA" role="3clFbG">
                      <node concept="2OqwBi" id="5thN_URtxyn" role="2Oq$k0">
                        <node concept="30H73N" id="5thN_URtxgh" role="2Oq$k0" />
                        <node concept="3TrEf2" id="5thN_URt$$R" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="5thN_URtAsi" role="2OqNvi">
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
      <node concept="3uibUv" id="5thN_URrZ2N" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYE7L" resolve="FeedbackSubjectScope" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ2O" role="1B3o_S" />
      <node concept="1W57fq" id="5thN_URsWhQ" role="lGtFl">
        <node concept="3IZrLx" id="5thN_URsWhT" role="3IZSJc">
          <node concept="3clFbS" id="5thN_URsWhU" role="2VODD2">
            <node concept="3clFbF" id="5thN_URsWi0" role="3cqZAp">
              <node concept="3y3z36" id="5thN_URsYVI" role="3clFbG">
                <node concept="10Nm6u" id="5thN_URsZNJ" role="3uHU7w" />
                <node concept="2OqwBi" id="5thN_URsWhV" role="3uHU7B">
                  <node concept="3TrEf2" id="5thN_URsXSa" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                  </node>
                  <node concept="30H73N" id="5thN_URsWhZ" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="5thN_URtBR6" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="5thN_URtBR7" role="3zH0cK">
          <node concept="3clFbS" id="5thN_URtBR8" role="2VODD2">
            <node concept="3clFbF" id="5thN_URtCBH" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_URtCBJ" role="3clFbG">
                <node concept="2OqwBi" id="5thN_URtCBK" role="2Oq$k0">
                  <node concept="30H73N" id="5thN_URtCBL" role="2Oq$k0" />
                  <node concept="3TrEf2" id="5thN_URtCBM" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
                  </node>
                </node>
                <node concept="3TrcHB" id="5thN_URtCBN" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URshCO" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ2P" role="jymVt">
      <property role="TrG5h" value="author" />
      <node concept="2AHcQZ" id="5thN_URrZ2R" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_URrZ2S" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URs3GM" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ2U" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_URrZ2V" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ2W" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_URrZ2X" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ2Y" role="2B70Vg">
            <property role="Xl_RC" value="author_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ2Z" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ30" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ31" role="1tU5fm">
        <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ32" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsjFA" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ33" role="jymVt">
      <property role="TrG5h" value="kind" />
      <node concept="2AHcQZ" id="5thN_URrZ35" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrZ36" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URs3GG" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ38" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ39" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ3a" role="2B70Vg">
            <property role="Xl_RC" value="feedback_kind" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ3b" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ3c" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ3d" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ3e" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ3f" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYDS6" resolve="FeedbackKind" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ3g" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URskGM" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ3h" role="jymVt">
      <property role="TrG5h" value="subjectScope" />
      <node concept="2AHcQZ" id="5thN_URrZ3j" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrZ3k" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URs3H9" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ3m" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ3n" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ3o" role="2B70Vg">
            <property role="Xl_RC" value="subject_scope" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ3p" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ3q" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ3r" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ3s" role="2B70Vg">
            <property role="3cmrfH" value="24" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ3t" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYE7L" resolve="FeedbackSubjectScope" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ3u" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URslHY" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ3v" role="jymVt">
      <property role="TrG5h" value="status" />
      <node concept="2AHcQZ" id="5thN_URrZ3x" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrZ3y" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URs3Hi" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ3$" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ3_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ3A" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ3B" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ3C" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ3D" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYE2A" resolve="FeedbackStatus" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ3E" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsmVA" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ3F" role="jymVt">
      <property role="TrG5h" value="polarity" />
      <node concept="2AHcQZ" id="5thN_URrZ3H" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrZ3I" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URs3Hc" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ3K" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ3L" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ3M" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ3N" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYDXp" resolve="FeedbackPolarity" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ3O" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsnKm" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ3P" role="jymVt">
      <property role="TrG5h" value="requiresVerifiedContext" />
      <node concept="2AHcQZ" id="5thN_URrZ3R" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ3S" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ3T" role="2B70Vg">
            <property role="Xl_RC" value="requires_verified_context" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ3U" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ3V" role="2B70Vg" />
        </node>
      </node>
      <node concept="10P_77" id="5thN_URrZ3W" role="1tU5fm" />
      <node concept="3Tm6S6" id="5thN_URrZ3X" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsoLA" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ3Y" role="jymVt">
      <property role="TrG5h" value="verificationRequirement" />
      <node concept="2AHcQZ" id="5thN_URrZ40" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrZ41" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URs3GJ" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ43" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ44" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ45" role="2B70Vg">
            <property role="Xl_RC" value="verification_requirement" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ46" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ47" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ48" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ49" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ4a" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYF3C" resolve="VerificationRequirement" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ4b" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URspMQ" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ4c" role="jymVt">
      <property role="TrG5h" value="uniquePerAuthorTarget" />
      <node concept="2AHcQZ" id="5thN_URrZ4e" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ4f" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ4g" role="2B70Vg">
            <property role="Xl_RC" value="unique_per_author_target" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ4h" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ4i" role="2B70Vg" />
        </node>
      </node>
      <node concept="10P_77" id="5thN_URrZ4j" role="1tU5fm" />
      <node concept="3Tm6S6" id="5thN_URrZ4k" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsr0A" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ4l" role="jymVt">
      <property role="TrG5h" value="submittedAt" />
      <node concept="2AHcQZ" id="5thN_URrZ4n" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ4o" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ4p" role="2B70Vg">
            <property role="Xl_RC" value="submitted_at" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ4q" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ4r" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ4s" role="1tU5fm">
        <ref role="3uigEE" to="28m1:~Instant" resolve="Instant" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ4t" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URsrPq" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ4u" role="jymVt">
      <property role="TrG5h" value="textField" />
      <node concept="2AHcQZ" id="5thN_URrZ4w" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ4x" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ4y" role="2B70Vg">
            <property role="Xl_RC" value="textColumn" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ4z" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ4$" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ4_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URxSJk" role="2B70Vg">
            <property role="3cmrfH" value="1000" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ4B" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ4C" role="1B3o_S" />
      <node concept="1W57fq" id="5thN_URtGTy" role="lGtFl">
        <node concept="3IZrLx" id="5thN_URtGT_" role="3IZSJc">
          <node concept="3clFbS" id="5thN_URtGTA" role="2VODD2">
            <node concept="3clFbF" id="5thN_URtGTG" role="3cqZAp">
              <node concept="2OqwBi" id="5thN_URtJ_D" role="3clFbG">
                <node concept="2OqwBi" id="5thN_URtGTB" role="2Oq$k0">
                  <node concept="3TrEf2" id="5thN_URtIYs" role="2OqNvi">
                    <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                  </node>
                  <node concept="30H73N" id="5thN_URtGTF" role="2Oq$k0" />
                </node>
                <node concept="3TrcHB" id="5thN_URtL4M" role="2OqNvi">
                  <ref role="3TsBF5" to="2rvu:47EFX_kWWLl" resolve="allowsText" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URssWC" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ4D" role="jymVt">
      <property role="TrG5h" value="ratingField" />
      <node concept="2AHcQZ" id="5thN_URrZ4F" role="2AJF6D">
        <ref role="2AI5Lk" to="nmm5:~Min" resolve="Min" />
        <node concept="2B6LJw" id="5thN_URwxB3" role="2B76xF">
          <ref role="2B6OnR" to="nmm5:~Min.value()" resolve="value" />
          <node concept="3cmrfG" id="5thN_URw_9v" role="2B70Vg">
            <property role="3cmrfH" value="0" />
            <node concept="17Uvod" id="5thN_URwBEY" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
              <node concept="3zFVjK" id="5thN_URwBEZ" role="3zH0cK">
                <node concept="3clFbS" id="5thN_URwBF0" role="2VODD2">
                  <node concept="3clFbF" id="5thN_URwCKo" role="3cqZAp">
                    <node concept="2OqwBi" id="5thN_URwFmG" role="3clFbG">
                      <node concept="2OqwBi" id="5thN_URwD97" role="2Oq$k0">
                        <node concept="30H73N" id="5thN_URwCKn" role="2Oq$k0" />
                        <node concept="3TrEf2" id="5thN_URwEue" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="5thN_URwGn3" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w3" resolve="minValue" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ4I" role="2AJF6D">
        <ref role="2AI5Lk" to="nmm5:~Max" resolve="Max" />
        <node concept="2B6LJw" id="5thN_URwL$V" role="2B76xF">
          <ref role="2B6OnR" to="nmm5:~Max.value()" resolve="value" />
          <node concept="3cmrfG" id="5thN_URwMRy" role="2B70Vg">
            <property role="3cmrfH" value="5" />
            <node concept="17Uvod" id="5thN_URwNRw" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
              <node concept="3zFVjK" id="5thN_URwNRx" role="3zH0cK">
                <node concept="3clFbS" id="5thN_URwNRy" role="2VODD2">
                  <node concept="3clFbF" id="5thN_URwOWY" role="3cqZAp">
                    <node concept="2OqwBi" id="5thN_URwRHn" role="3clFbG">
                      <node concept="2OqwBi" id="5thN_URwPz5" role="2Oq$k0">
                        <node concept="30H73N" id="5thN_URwOWX" role="2Oq$k0" />
                        <node concept="3TrEf2" id="5thN_URwQXP" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="5thN_URwSRd" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:DrEcBK18w5" resolve="maxValue" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ4L" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ4M" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ4N" role="2B70Vg">
            <property role="Xl_RC" value="ratingColumn" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ4O" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ4P" role="2B70Vg" />
        </node>
      </node>
      <node concept="10Oyi0" id="5thN_URrZ4Q" role="1tU5fm" />
      <node concept="3Tm6S6" id="5thN_URrZ4R" role="1B3o_S" />
      <node concept="1W57fq" id="5thN_URwTZj" role="lGtFl">
        <node concept="3IZrLx" id="5thN_URwTZm" role="3IZSJc">
          <node concept="3clFbS" id="5thN_URwTZn" role="2VODD2">
            <node concept="3clFbF" id="5thN_URwTZt" role="3cqZAp">
              <node concept="1Wc70l" id="5thN_URx0i2" role="3clFbG">
                <node concept="3y3z36" id="5thN_URx4EB" role="3uHU7w">
                  <node concept="10Nm6u" id="5thN_URx52h" role="3uHU7w" />
                  <node concept="2OqwBi" id="5thN_URx27D" role="3uHU7B">
                    <node concept="30H73N" id="5thN_URx1Ob" role="2Oq$k0" />
                    <node concept="3TrEf2" id="5thN_URx3uO" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
                    </node>
                  </node>
                </node>
                <node concept="2OqwBi" id="5thN_URwXCd" role="3uHU7B">
                  <node concept="2OqwBi" id="5thN_URwTZo" role="2Oq$k0">
                    <node concept="30H73N" id="5thN_URwTZs" role="2Oq$k0" />
                    <node concept="3TrEf2" id="5thN_URwWP0" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="5thN_URwYMe" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:3vc7gP656rf" resolve="hasRating" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URx9zC" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ4S" role="jymVt">
      <property role="TrG5h" value="polarityValueFieldName" />
      <node concept="2AHcQZ" id="5thN_URrZ4U" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_URrZ4V" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URs3Hf" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URrZ4X" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ4Y" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URrZ4Z" role="2B70Vg">
            <property role="Xl_RC" value="polarityValueColumnName" />
            <node concept="17Uvod" id="5thN_URyYmS" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="5thN_URyYmT" role="3zH0cK">
                <node concept="3clFbS" id="5thN_URyYmU" role="2VODD2">
                  <node concept="3clFbF" id="5thN_URyYH1" role="3cqZAp">
                    <node concept="3cpWs3" id="5thN_URzcl8" role="3clFbG">
                      <node concept="Xl_RD" id="5thN_URzcnY" role="3uHU7w">
                        <property role="Xl_RC" value="Polarity" />
                      </node>
                      <node concept="2OqwBi" id="5thN_URz9Fa" role="3uHU7B">
                        <node concept="2OqwBi" id="5thN_URz3xG" role="2Oq$k0">
                          <node concept="30H73N" id="5thN_URz3fA" role="2Oq$k0" />
                          <node concept="3TrEf2" id="5thN_URz4J1" role="2OqNvi">
                            <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="5thN_URzaW1" role="2OqNvi">
                          <ref role="3TsBF5" to="2rvu:47EFX_kWWLk" resolve="polarity" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ50" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ51" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ52" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ53" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ54" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYDXp" resolve="FeedbackPolarity" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ55" role="1B3o_S" />
      <node concept="1W57fq" id="5thN_URxjf6" role="lGtFl">
        <node concept="3IZrLx" id="5thN_URxjf9" role="3IZSJc">
          <node concept="3clFbS" id="5thN_URxjfa" role="2VODD2">
            <node concept="3clFbF" id="5thN_URxjfg" role="3cqZAp">
              <node concept="1Wc70l" id="5thN_URzoA_" role="3clFbG">
                <node concept="3y3z36" id="5thN_URzuAK" role="3uHU7w">
                  <node concept="2OqwBi" id="5thN_URzsHH" role="3uHU7B">
                    <node concept="2OqwBi" id="5thN_URzqzy" role="2Oq$k0">
                      <node concept="30H73N" id="5thN_URzpDM" role="2Oq$k0" />
                      <node concept="3TrEf2" id="5thN_URz_3h" role="2OqNvi">
                        <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                      </node>
                    </node>
                    <node concept="3TrcHB" id="5thN_URztJy" role="2OqNvi">
                      <ref role="3TsBF5" to="2rvu:47EFX_kWWLk" resolve="polarity" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5thN_URzHMs" role="3uHU7w">
                    <node concept="1XH99k" id="5thN_URzFSe" role="2Oq$k0">
                      <ref role="1XH99l" to="2rvu:47EFX_kWWLf" resolve="FeedbackPolarity" />
                    </node>
                    <node concept="2ViDtV" id="5thN_URzIPW" role="2OqNvi">
                      <ref role="2ViDtZ" to="2rvu:47EFX_kWWLg" resolve="NONE" />
                    </node>
                  </node>
                </node>
                <node concept="1Wc70l" id="5thN_URx$zy" role="3uHU7B">
                  <node concept="1eOMI4" id="5thN_URxzqf" role="3uHU7B">
                    <node concept="22lmx$" id="5thN_URxu1y" role="1eOMHV">
                      <node concept="3clFbC" id="5thN_URxnPP" role="3uHU7B">
                        <node concept="2OqwBi" id="5thN_URxlIO" role="3uHU7B">
                          <node concept="2OqwBi" id="5thN_URxjfb" role="2Oq$k0">
                            <node concept="3TrEf2" id="5thN_URxl6W" role="2OqNvi">
                              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                            </node>
                            <node concept="30H73N" id="5thN_URxjff" role="2Oq$k0" />
                          </node>
                          <node concept="3TrcHB" id="5thN_URxmEp" role="2OqNvi">
                            <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
                          </node>
                        </node>
                        <node concept="2OqwBi" id="5thN_URxr5V" role="3uHU7w">
                          <node concept="1XH99k" id="5thN_URxoP$" role="2Oq$k0">
                            <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
                          </node>
                          <node concept="2ViDtV" id="5thN_URxsPS" role="2OqNvi">
                            <ref role="2ViDtZ" to="2rvu:3vc7gP656r5" resolve="REACTION" />
                          </node>
                        </node>
                      </node>
                      <node concept="3clFbC" id="5thN_URxv8o" role="3uHU7w">
                        <node concept="2OqwBi" id="5thN_URxv8p" role="3uHU7B">
                          <node concept="2OqwBi" id="5thN_URxv8q" role="2Oq$k0">
                            <node concept="3TrEf2" id="5thN_URxv8r" role="2OqNvi">
                              <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                            </node>
                            <node concept="30H73N" id="5thN_URxv8s" role="2Oq$k0" />
                          </node>
                          <node concept="3TrcHB" id="5thN_URxv8t" role="2OqNvi">
                            <ref role="3TsBF5" to="2rvu:3vc7gP656r1" resolve="kind" />
                          </node>
                        </node>
                        <node concept="2OqwBi" id="5thN_URxv8u" role="3uHU7w">
                          <node concept="1XH99k" id="5thN_URxv8v" role="2Oq$k0">
                            <ref role="1XH99l" to="2rvu:3vc7gP656r2" resolve="FeedbackKind" />
                          </node>
                          <node concept="2ViDtV" id="5thN_URxv8w" role="2OqNvi">
                            <ref role="2ViDtZ" to="2rvu:3vc7gP656r6" resolve="VOTE" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3y3z36" id="5thN_URxFJx" role="3uHU7w">
                    <node concept="2OqwBi" id="5thN_URxCZI" role="3uHU7B">
                      <node concept="2OqwBi" id="5thN_URxAQS" role="2Oq$k0">
                        <node concept="30H73N" id="5thN_URxAyH" role="2Oq$k0" />
                        <node concept="3TrEf2" id="5thN_URxBT1" role="2OqNvi">
                          <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="5thN_URxEkt" role="2OqNvi">
                        <ref role="3TsBF5" to="2rvu:47EFX_kWWLk" resolve="polarity" />
                      </node>
                    </node>
                    <node concept="10Nm6u" id="5thN_URxGdp" role="3uHU7w" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="5thN_URzfN3" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="5thN_URzfN4" role="3zH0cK">
          <node concept="3clFbS" id="5thN_URzfN5" role="2VODD2">
            <node concept="3clFbF" id="5thN_URzhg4" role="3cqZAp">
              <node concept="3cpWs3" id="5thN_URzm7S" role="3clFbG">
                <node concept="Xl_RD" id="5thN_URzmaI" role="3uHU7w">
                  <property role="Xl_RC" value="" />
                </node>
                <node concept="2OqwBi" id="5thN_URzjQ7" role="3uHU7B">
                  <node concept="2OqwBi" id="5thN_URzhYL" role="2Oq$k0">
                    <node concept="30H73N" id="5thN_URzhg3" role="2Oq$k0" />
                    <node concept="3TrEf2" id="5thN_URzjbx" role="2OqNvi">
                      <ref role="3Tt5mk" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="5thN_URzl1C" role="2OqNvi">
                    <ref role="3TsBF5" to="2rvu:47EFX_kWWLk" resolve="polarity" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URxb94" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ56" role="jymVt">
      <property role="TrG5h" value="reason" />
      <node concept="2AHcQZ" id="5thN_URrZ58" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URrZ59" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URrZ5a" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URrZ5b" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URrZ5c" role="2B70Vg">
            <property role="3cmrfH" value="500" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ5d" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ5e" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URzKd2" role="jymVt" />
    <node concept="312cEg" id="5thN_URrZ5f" role="jymVt">
      <property role="TrG5h" value="mediaReferences" />
      <node concept="2AHcQZ" id="5thN_URrZ5h" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~OneToMany" resolve="OneToMany" />
        <node concept="2B6LJw" id="5thN_URrZ5i" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.mappedBy()" resolve="mappedBy" />
          <node concept="Xl_RD" id="5thN_URrZ5j" role="2B70Vg">
            <property role="Xl_RC" value="feedbackBackReference" />
            <node concept="17Uvod" id="5thN_URzMRP" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="5thN_URzMRQ" role="3zH0cK">
                <node concept="3clFbS" id="5thN_URzMRR" role="2VODD2">
                  <node concept="3clFbF" id="5thN_URzN_y" role="3cqZAp">
                    <node concept="2OqwBi" id="5thN_URzNRD" role="3clFbG">
                      <node concept="30H73N" id="5thN_URzN_x" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_URzOl$" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ5k" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.cascade()" resolve="cascade" />
          <node concept="Rm8GO" id="5thN_URs3H6" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~CascadeType" resolve="CascadeType" />
            <ref role="Rm8GQ" to="p99f:~CascadeType.ALL" resolve="ALL" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URrZ5m" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~OneToMany.orphanRemoval()" resolve="orphanRemoval" />
          <node concept="3clFbT" id="5thN_URrZ5n" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URrZ5o" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="5thN_URrZ5p" role="11_B2D">
          <ref role="3uigEE" node="5thN_URzPLj" resolve="MediaReference" />
        </node>
      </node>
      <node concept="2ShNRf" id="5thN_URs3Gt" role="33vP2m">
        <node concept="1pGfFk" id="5thN_URs3Gy" role="2ShVmc">
          <property role="373rjd" value="true" />
          <ref role="37wK5l" to="33ny:~ArrayList.&lt;init&gt;()" resolve="ArrayList" />
        </node>
      </node>
      <node concept="3Tm6S6" id="5thN_URrZ5r" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_URtEf4" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ5s" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_URrZ5t" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ5u" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ5v" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ2j" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ5w" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ5x" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsebV" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ5y" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_URrZ5z" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_URrZ5$" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ5_" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ5A" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ5B" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ5C" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ5D" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ5E" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ2j" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ5F" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ5z" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ5G" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ5H" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsebW" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ5I" role="jymVt">
      <property role="TrG5h" value="getKind" />
      <node concept="3clFbS" id="5thN_URrZ5J" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ5K" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ5L" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ33" resolve="kind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ5M" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ5N" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYDS6" resolve="FeedbackKind" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsebX" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ5O" role="jymVt">
      <property role="TrG5h" value="setKind" />
      <node concept="37vLTG" id="5thN_URrZ5P" role="3clF46">
        <property role="TrG5h" value="kind" />
        <node concept="3uibUv" id="5thN_URrZ5Q" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYDS6" resolve="FeedbackKind" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ5R" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ5S" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ5T" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ5U" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ5V" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ5W" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ33" resolve="kind" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ5X" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ5P" resolve="kind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ5Y" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ5Z" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsebY" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ60" role="jymVt">
      <property role="TrG5h" value="getSubjectScope" />
      <node concept="3clFbS" id="5thN_URrZ61" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ62" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ63" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ3h" resolve="subjectScope" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ64" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ65" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYE7L" resolve="FeedbackSubjectScope" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsebZ" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ66" role="jymVt">
      <property role="TrG5h" value="setSubjectScope" />
      <node concept="37vLTG" id="5thN_URrZ67" role="3clF46">
        <property role="TrG5h" value="subjectScope" />
        <node concept="3uibUv" id="5thN_URrZ68" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYE7L" resolve="FeedbackSubjectScope" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ69" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ6a" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ6b" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ6c" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ6d" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ6e" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ3h" resolve="subjectScope" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ6f" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ67" resolve="subjectScope" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ6g" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ6h" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec0" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ6i" role="jymVt">
      <property role="TrG5h" value="getStatus" />
      <node concept="3clFbS" id="5thN_URrZ6j" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ6k" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ6l" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ3v" resolve="status" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ6m" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ6n" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYE2A" resolve="FeedbackStatus" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsec1" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ6o" role="jymVt">
      <property role="TrG5h" value="setStatus" />
      <node concept="37vLTG" id="5thN_URrZ6p" role="3clF46">
        <property role="TrG5h" value="status" />
        <node concept="3uibUv" id="5thN_URrZ6q" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYE2A" resolve="FeedbackStatus" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ6r" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ6s" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ6t" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ6u" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ6v" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ6w" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ3v" resolve="status" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ6x" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ6p" resolve="status" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ6y" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ6z" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec2" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ6$" role="jymVt">
      <property role="TrG5h" value="getPolarity" />
      <node concept="3clFbS" id="5thN_URrZ6_" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ6A" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ6B" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ3F" resolve="polarity" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ6C" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ6D" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYDXp" resolve="FeedbackPolarity" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsec3" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ6E" role="jymVt">
      <property role="TrG5h" value="setPolarity" />
      <node concept="37vLTG" id="5thN_URrZ6F" role="3clF46">
        <property role="TrG5h" value="polarity" />
        <node concept="3uibUv" id="5thN_URrZ6G" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYDXp" resolve="FeedbackPolarity" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ6H" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ6I" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ6J" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ6K" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ6L" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ6M" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ3F" resolve="polarity" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ6N" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ6F" resolve="polarity" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ6O" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ6P" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec4" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ6Q" role="jymVt">
      <property role="TrG5h" value="isRequiresVerifiedContext" />
      <node concept="3clFbS" id="5thN_URrZ6R" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ6S" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ6T" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ3P" resolve="requiresVerifiedContext" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ6U" role="1B3o_S" />
      <node concept="10P_77" id="5thN_URrZ6V" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec5" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ6W" role="jymVt">
      <property role="TrG5h" value="setRequiresVerifiedContext" />
      <node concept="37vLTG" id="5thN_URrZ6X" role="3clF46">
        <property role="TrG5h" value="requiresVerifiedContext" />
        <node concept="10P_77" id="5thN_URrZ6Y" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="5thN_URrZ6Z" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ70" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ71" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ72" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ73" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ74" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ3P" resolve="requiresVerifiedContext" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ75" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ6X" resolve="requiresVerifiedContext" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ76" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ77" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec6" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ78" role="jymVt">
      <property role="TrG5h" value="getVerificationRequirement" />
      <node concept="3clFbS" id="5thN_URrZ79" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ7a" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ7b" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ3Y" resolve="verificationRequirement" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ7c" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ7d" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYF3C" resolve="VerificationRequirement" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsec7" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ7e" role="jymVt">
      <property role="TrG5h" value="setVerificationRequirement" />
      <node concept="37vLTG" id="5thN_URrZ7f" role="3clF46">
        <property role="TrG5h" value="verificationRequirement" />
        <node concept="3uibUv" id="5thN_URrZ7g" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYF3C" resolve="VerificationRequirement" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ7h" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ7i" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ7j" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ7k" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ7l" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ7m" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ3Y" resolve="verificationRequirement" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ7n" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ7f" resolve="verificationRequirement" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ7o" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ7p" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec8" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ7q" role="jymVt">
      <property role="TrG5h" value="isUniquePerAuthorTarget" />
      <node concept="3clFbS" id="5thN_URrZ7r" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ7s" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ7t" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ4c" resolve="uniquePerAuthorTarget" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ7u" role="1B3o_S" />
      <node concept="10P_77" id="5thN_URrZ7v" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URsec9" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ7w" role="jymVt">
      <property role="TrG5h" value="setUniquePerAuthorTarget" />
      <node concept="37vLTG" id="5thN_URrZ7x" role="3clF46">
        <property role="TrG5h" value="uniquePerAuthorTarget" />
        <node concept="10P_77" id="5thN_URrZ7y" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="5thN_URrZ7z" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ7$" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ7_" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ7A" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ7B" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ7C" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ4c" resolve="uniquePerAuthorTarget" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ7D" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ7x" resolve="uniquePerAuthorTarget" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ7E" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ7F" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="5thN_URseca" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ7G" role="jymVt">
      <property role="TrG5h" value="getSubmittedAt" />
      <node concept="3clFbS" id="5thN_URrZ7H" role="3clF47">
        <node concept="3cpWs6" id="5thN_URrZ7I" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URrZ7J" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URrZ4l" resolve="submittedAt" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ7K" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URrZ7L" role="3clF45">
        <ref role="3uigEE" to="28m1:~Instant" resolve="Instant" />
      </node>
    </node>
    <node concept="2tJIrI" id="5thN_URsecb" role="jymVt" />
    <node concept="3clFb_" id="5thN_URrZ7M" role="jymVt">
      <property role="TrG5h" value="setSubmittedAt" />
      <node concept="37vLTG" id="5thN_URrZ7N" role="3clF46">
        <property role="TrG5h" value="submittedAt" />
        <node concept="3uibUv" id="5thN_URrZ7O" role="1tU5fm">
          <ref role="3uigEE" to="28m1:~Instant" resolve="Instant" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URrZ7P" role="3clF47">
        <node concept="3clFbF" id="5thN_URrZ7Q" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URrZ7R" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URrZ7S" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URrZ7T" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URrZ7U" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URrZ4l" resolve="submittedAt" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URrZ7V" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URrZ7N" resolve="submittedAt" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URrZ7W" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URrZ7X" role="3clF45" />
    </node>
    <node concept="n94m4" id="5thN_URsBc6" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="17Uvod" id="5thN_URxJAL" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="5thN_URxJAM" role="3zH0cK">
        <node concept="3clFbS" id="5thN_URxJAN" role="2VODD2">
          <node concept="3clFbF" id="5thN_URxLlY" role="3cqZAp">
            <node concept="3cpWs3" id="5thN_URxOY2" role="3clFbG">
              <node concept="2OqwBi" id="5thN_URxR8n" role="3uHU7w">
                <node concept="30H73N" id="5thN_URxQba" role="2Oq$k0" />
                <node concept="3TrcHB" id="5thN_URxRTm" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
              <node concept="Xl_RD" id="5thN_URxLlX" role="3uHU7B">
                <property role="Xl_RC" value="Generated" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="5thN_URzPLj">
    <property role="TrG5h" value="MediaReference" />
    <property role="3GE5qa" value="domain" />
    <node concept="3Tm1VV" id="5thN_URzPLk" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URzPLl" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="5thN_URzPLm" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_URzPLn" role="2B70Vg">
          <property role="Xl_RC" value="MediaReference" />
          <node concept="17Uvod" id="5thN_UR$2jb" role="lGtFl">
            <property role="2qtEX9" value="value" />
            <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
            <node concept="3zFVjK" id="5thN_UR$2jc" role="3zH0cK">
              <node concept="3clFbS" id="5thN_UR$2jd" role="2VODD2">
                <node concept="3clFbF" id="5thN_UR$30P" role="3cqZAp">
                  <node concept="3cpWs3" id="5thN_UR$5XW" role="3clFbG">
                    <node concept="Xl_RD" id="5thN_UR$60M" role="3uHU7w">
                      <property role="Xl_RC" value="MediaReference" />
                    </node>
                    <node concept="2OqwBi" id="5thN_UR$3iW" role="3uHU7B">
                      <node concept="30H73N" id="5thN_UR$30O" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_UR$4El" role="2OqNvi">
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
    <node concept="2AHcQZ" id="5thN_URzPLo" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="5thN_URzPLp" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="5thN_URzPLq" role="2B70Vg">
          <property role="Xl_RC" value="media_references" />
          <node concept="17Uvod" id="5thN_UR$DE2" role="lGtFl">
            <property role="2qtEX9" value="value" />
            <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
            <node concept="3zFVjK" id="5thN_UR$DE3" role="3zH0cK">
              <node concept="3clFbS" id="5thN_UR$DE4" role="2VODD2">
                <node concept="3clFbF" id="5thN_UR$End" role="3cqZAp">
                  <node concept="3cpWs3" id="5thN_UR$I3D" role="3clFbG">
                    <node concept="Xl_RD" id="5thN_UR$I6v" role="3uHU7w">
                      <property role="Xl_RC" value="_media_references" />
                    </node>
                    <node concept="2OqwBi" id="5thN_UR$F5l" role="3uHU7B">
                      <node concept="30H73N" id="5thN_UR$Enc" role="2Oq$k0" />
                      <node concept="3TrcHB" id="5thN_UR$FYk" role="2OqNvi">
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
    <node concept="3uibUv" id="5thN_URzPLr" role="1zkMxy">
      <ref role="3uigEE" node="5thN_UR$omj" resolve="GeneratedMediaReference" />
      <node concept="1ZhdrF" id="5thN_URSDaE" role="lGtFl">
        <property role="2qtEX8" value="classifier" />
        <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
        <node concept="3$xsQk" id="5thN_URSDaF" role="3$ytzL">
          <node concept="3clFbS" id="5thN_URSDaG" role="2VODD2">
            <node concept="3cpWs6" id="5thN_URSENj" role="3cqZAp">
              <node concept="3cpWs3" id="5thN_URT7K9" role="3cqZAk">
                <node concept="Xl_RD" id="5thN_URT7Ka" role="3uHU7w">
                  <property role="Xl_RC" value="MediaReference" />
                </node>
                <node concept="3cpWs3" id="5thN_URT7Kb" role="3uHU7B">
                  <node concept="Xl_RD" id="5thN_URT7Kc" role="3uHU7B">
                    <property role="Xl_RC" value="Generated" />
                  </node>
                  <node concept="2OqwBi" id="5thN_URT7Kd" role="3uHU7w">
                    <node concept="30H73N" id="5thN_URT7Ke" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_URT7Kf" role="2OqNvi">
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
    <node concept="n94m4" id="5thN_URzZKB" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="17Uvod" id="5thN_UR$aFX" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="5thN_UR$aFY" role="3zH0cK">
        <node concept="3clFbS" id="5thN_UR$aFZ" role="2VODD2">
          <node concept="3clFbF" id="5thN_UR$bys" role="3cqZAp">
            <node concept="3cpWs3" id="5thN_UR$edN" role="3clFbG">
              <node concept="Xl_RD" id="5thN_UR$eYV" role="3uHU7w">
                <property role="Xl_RC" value="MediaReference" />
              </node>
              <node concept="2OqwBi" id="5thN_UR$bOz" role="3uHU7B">
                <node concept="30H73N" id="5thN_UR$byr" role="2Oq$k0" />
                <node concept="3TrcHB" id="5thN_UR$cZw" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="5thN_UR$omj">
    <property role="TrG5h" value="GeneratedMediaReference" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UR$omk" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UR$oml" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UR$omm" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UR$omo" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR$omp" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UR$omq" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_UR$sMR" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR$oms" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR$omt" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_UR$Qqu" role="jymVt" />
    <node concept="312cEg" id="5thN_UR$omu" role="jymVt">
      <property role="TrG5h" value="feedback" />
      <node concept="2AHcQZ" id="5thN_UR$omw" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="5thN_UR$omx" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UR$omy" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_UR$sMO" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR$om$" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_UR$om_" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR$omA" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UR$omB" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UR$omC" role="2B70Vg">
            <property role="Xl_RC" value="feedback_id" />
            <node concept="17Uvod" id="5thN_UR_7D1" role="lGtFl">
              <property role="2qtEX9" value="value" />
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <node concept="3zFVjK" id="5thN_UR_7D2" role="3zH0cK">
                <node concept="3clFbS" id="5thN_UR_7D3" role="2VODD2">
                  <node concept="3clFbF" id="5thN_UR_8Vw" role="3cqZAp">
                    <node concept="3cpWs3" id="5thN_UR_f_T" role="3clFbG">
                      <node concept="Xl_RD" id="5thN_UR_fYi" role="3uHU7w">
                        <property role="Xl_RC" value="_id" />
                      </node>
                      <node concept="2OqwBi" id="5thN_UR_bD8" role="3uHU7B">
                        <node concept="2OqwBi" id="5thN_UR_9Of" role="2Oq$k0">
                          <node concept="30H73N" id="5thN_UR_8Vv" role="2Oq$k0" />
                          <node concept="3TrcHB" id="5thN_UR_aw2" role="2OqNvi">
                            <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                          </node>
                        </node>
                        <node concept="liA8E" id="5thN_UR_cTH" role="2OqNvi">
                          <ref role="37wK5l" to="wyt6:~String.toLowerCase()" resolve="toLowerCase" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UR$omD" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR$omE" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR$omF" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR$omG" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_UR$R2M" role="jymVt" />
    <node concept="312cEg" id="5thN_UR$omH" role="jymVt">
      <property role="TrG5h" value="mediaType" />
      <node concept="2AHcQZ" id="5thN_UR$omJ" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UR$omK" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UR$sMU" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UR$omM" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR$omN" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR$omO" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR$omP" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR$omQ" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR$omR" role="1tU5fm">
        <ref role="3uigEE" to="qd1r:~MediaType" resolve="MediaType" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR$omS" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_UR$RuE" role="jymVt" />
    <node concept="312cEg" id="5thN_UR$omT" role="jymVt">
      <property role="TrG5h" value="url" />
      <node concept="2AHcQZ" id="5thN_UR$omV" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UR$omW" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UR$omX" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UR$omY" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UR$omZ" role="2B70Vg">
            <property role="3cmrfH" value="1000" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UR$on0" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UR$on1" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5thN_UR$S6Y" role="jymVt" />
    <node concept="3clFb_" id="5thN_UR$on2" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UR$on3" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR$on4" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR$on5" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR$omm" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$on6" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR$on7" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UR$on8" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UR$on9" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UR$ona" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR$onb" role="3clF47">
        <node concept="3clFbF" id="5thN_UR$onc" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR$ond" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR$one" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR$onf" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR$ong" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR$omm" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR$onh" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR$on9" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$oni" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR$onj" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UR$onk" role="jymVt">
      <property role="TrG5h" value="getComment" />
      <node concept="3clFbS" id="5thN_UR$onl" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR$onm" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR$onn" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR$omu" resolve="feedback" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$ono" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR$onp" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UR$onq" role="jymVt">
      <property role="TrG5h" value="setComment" />
      <node concept="37vLTG" id="5thN_UR$onr" role="3clF46">
        <property role="TrG5h" value="comment" />
        <node concept="3uibUv" id="5thN_UR$ons" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR$ont" role="3clF47">
        <node concept="3clFbF" id="5thN_UR$onu" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR$onv" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR$onw" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR$onx" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR$ony" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR$omu" resolve="feedback" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR$onz" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR$onr" resolve="comment" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$on$" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR$on_" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UR$onA" role="jymVt">
      <property role="TrG5h" value="getMediaType" />
      <node concept="3clFbS" id="5thN_UR$onB" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR$onC" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR$onD" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR$omH" resolve="mediaType" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$onE" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR$onF" role="3clF45">
        <ref role="3uigEE" to="qd1r:~MediaType" resolve="MediaType" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UR$onG" role="jymVt">
      <property role="TrG5h" value="setMediaType" />
      <node concept="37vLTG" id="5thN_UR$onH" role="3clF46">
        <property role="TrG5h" value="mediaType" />
        <node concept="3uibUv" id="5thN_UR$onI" role="1tU5fm">
          <ref role="3uigEE" to="qd1r:~MediaType" resolve="MediaType" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR$onJ" role="3clF47">
        <node concept="3clFbF" id="5thN_UR$onK" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR$onL" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR$onM" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR$onN" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR$onO" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR$omH" resolve="mediaType" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR$onP" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR$onH" resolve="mediaType" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$onQ" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR$onR" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UR$onS" role="jymVt">
      <property role="TrG5h" value="getUrl" />
      <node concept="3clFbS" id="5thN_UR$onT" role="3clF47">
        <node concept="3cpWs6" id="5thN_UR$onU" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UR$onV" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UR$omT" resolve="url" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$onW" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UR$onX" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UR$onY" role="jymVt">
      <property role="TrG5h" value="setUrl" />
      <node concept="37vLTG" id="5thN_UR$onZ" role="3clF46">
        <property role="TrG5h" value="url" />
        <node concept="3uibUv" id="5thN_UR$oo0" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UR$oo1" role="3clF47">
        <node concept="3clFbF" id="5thN_UR$oo2" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UR$oo3" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UR$oo4" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UR$oo5" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UR$oo6" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UR$omT" resolve="url" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UR$oo7" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UR$onZ" resolve="url" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UR$oo8" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UR$oo9" role="3clF45" />
    </node>
    <node concept="n94m4" id="5thN_UR$qBe" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="17Uvod" id="5thN_URSQm5" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="5thN_URSQm6" role="3zH0cK">
        <node concept="3clFbS" id="5thN_URSQm7" role="2VODD2">
          <node concept="3clFbF" id="5thN_URSRiw" role="3cqZAp">
            <node concept="3cpWs3" id="5thN_URSZlJ" role="3clFbG">
              <node concept="Xl_RD" id="5thN_URSZo_" role="3uHU7w">
                <property role="Xl_RC" value="MediaReference" />
              </node>
              <node concept="3cpWs3" id="5thN_URSUAw" role="3uHU7B">
                <node concept="Xl_RD" id="5thN_URSRiv" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="5thN_URSWsV" role="3uHU7w">
                  <node concept="30H73N" id="5thN_URSVqm" role="2Oq$k0" />
                  <node concept="3TrcHB" id="5thN_URSXse" role="2OqNvi">
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
  <node concept="312cEu" id="5thN_URBH9k">
    <property role="TrG5h" value="GeneratedConditionValue" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_URBH9l" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URBH9m" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_URBH9n" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_URBH9p" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_URBH9q" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_URBH9r" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URBJqU" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URBH9t" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_URBH9u" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URBH9v" role="jymVt">
      <property role="TrG5h" value="condition" />
      <node concept="2AHcQZ" id="5thN_URBH9x" role="2AJF6D">
        <ref role="2AI5Lk" to="c4fr:~JsonIgnore" resolve="JsonIgnore" />
      </node>
      <node concept="2AHcQZ" id="5thN_URBH9y" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_URBH9z" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URBJqR" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URBH9_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.optional()" resolve="optional" />
          <node concept="3clFbT" id="5thN_URBH9A" role="2B70Vg" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_URBH9B" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_URBH9C" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URBH9D" role="2B70Vg">
            <property role="Xl_RC" value="condition_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URBH9E" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URBH9F" role="2B70Vg" />
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URBH9G" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
      </node>
      <node concept="3Tm6S6" id="5thN_URBH9H" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_URBH9I" role="jymVt">
      <property role="TrG5h" value="value" />
      <node concept="2AHcQZ" id="5thN_URBH9K" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_URBH9L" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_URBH9M" role="2B70Vg">
            <property role="Xl_RC" value="condition_value" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_URBH9N" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_URBH9O" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_URBH9P" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_URBH9Q" role="2B70Vg">
            <property role="3cmrfH" value="500" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URBH9R" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_URBH9S" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_URBH9T" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_URBH9U" role="3clF47">
        <node concept="3cpWs6" id="5thN_URBH9V" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URBH9W" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URBH9n" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URBH9X" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URBH9Y" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRY2I" role="jymVt" />
    <node concept="3clFb_" id="5thN_URBH9Z" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_URBHa0" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_URBHa1" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URBHa2" role="3clF47">
        <node concept="3clFbF" id="5thN_URBHa3" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URBHa4" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URBHa5" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URBHa6" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URBHa7" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URBH9n" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URBHa8" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URBHa0" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URBHa9" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URBHaa" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRY2J" role="jymVt" />
    <node concept="3clFb_" id="5thN_URBHab" role="jymVt">
      <property role="TrG5h" value="getCondition" />
      <node concept="3clFbS" id="5thN_URBHac" role="3clF47">
        <node concept="3cpWs6" id="5thN_URBHad" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URBHae" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URBH9v" resolve="condition" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URBHaf" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URBHag" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRY2K" role="jymVt" />
    <node concept="3clFb_" id="5thN_URBHah" role="jymVt">
      <property role="TrG5h" value="setCondition" />
      <node concept="37vLTG" id="5thN_URBHai" role="3clF46">
        <property role="TrG5h" value="condition" />
        <node concept="3uibUv" id="5thN_URBHaj" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4GVl" resolve="AutomationCondition" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URBHak" role="3clF47">
        <node concept="3clFbF" id="5thN_URBHal" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URBHam" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URBHan" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URBHao" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URBHap" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URBH9v" resolve="condition" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URBHaq" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URBHai" resolve="condition" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URBHar" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URBHas" role="3clF45" />
    </node>
    <node concept="2tJIrI" id="2VtRX2IRY2L" role="jymVt" />
    <node concept="3clFb_" id="5thN_URBHat" role="jymVt">
      <property role="TrG5h" value="getValue" />
      <node concept="3clFbS" id="5thN_URBHau" role="3clF47">
        <node concept="3cpWs6" id="5thN_URBHav" role="3cqZAp">
          <node concept="37vLTw" id="5thN_URBHaw" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_URBH9I" resolve="value" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URBHax" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_URBHay" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="2tJIrI" id="2VtRX2IRY2M" role="jymVt" />
    <node concept="3clFb_" id="5thN_URBHaz" role="jymVt">
      <property role="TrG5h" value="setValue" />
      <node concept="37vLTG" id="5thN_URBHa$" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="3uibUv" id="5thN_URBHa_" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_URBHaA" role="3clF47">
        <node concept="3clFbF" id="5thN_URBHaB" role="3cqZAp">
          <node concept="37vLTI" id="5thN_URBHaC" role="3clFbG">
            <node concept="2OqwBi" id="5thN_URBHaD" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_URBHaE" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_URBHaF" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_URBH9I" resolve="value" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_URBHaG" role="37vLTx">
              <ref role="3cqZAo" node="5thN_URBHa$" resolve="value" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_URBHaH" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_URBHaI" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UREnNc">
    <property role="TrG5h" value="GeneratedSortingPolicy" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UREnNd" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UREnNe" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UREnNf" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UREnNh" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UREnNi" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UREnNj" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URGYKb" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnNl" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnNm" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREnNn" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_UREnNp" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREnNq" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREnNr" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREnNs" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="5thN_UREnNt" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREnNu" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREnNv" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnNw" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnNx" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREnNy" role="jymVt">
      <property role="TrG5h" value="criterion" />
      <node concept="2AHcQZ" id="5thN_UREnN$" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREnN_" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URGYK5" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREnNB" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREnNC" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREnND" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREnNE" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREnNF" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnNG" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYE$$" resolve="SortCriterion" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnNH" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREnNI" role="jymVt">
      <property role="TrG5h" value="direction" />
      <node concept="2AHcQZ" id="5thN_UREnNK" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREnNL" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URGYK8" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREnNN" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREnNO" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREnNP" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREnNQ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREnNR" role="2B70Vg">
            <property role="3cmrfH" value="10" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnNS" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEGj" resolve="SortDirection" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnNT" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREnNU" role="jymVt">
      <property role="TrG5h" value="appliesToResource" />
      <node concept="2AHcQZ" id="5thN_UREnNW" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREnNX" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREnNY" role="2B70Vg">
            <property role="Xl_RC" value="applies_to_resource" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREnNZ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREnO0" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnO1" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnO2" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREnO3" role="jymVt">
      <property role="TrG5h" value="appliesToFeedback" />
      <node concept="2AHcQZ" id="5thN_UREnO5" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREnO6" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREnO7" role="2B70Vg">
            <property role="Xl_RC" value="applies_to_feedback" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREnO8" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREnO9" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnOa" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnOb" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREnOc" role="jymVt">
      <property role="TrG5h" value="context" />
      <node concept="2AHcQZ" id="5thN_UREnOe" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UREnOf" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_URGYK2" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREnOh" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UREnOi" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREnOj" role="2B70Vg">
            <property role="Xl_RC" value="context_id" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREnOk" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREnOl" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_UREnOm" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UREnOn" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnOo" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnOp" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnNf" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnOq" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnOr" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnOs" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UREnOt" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UREnOu" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnOv" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnOw" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnOx" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnOy" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnOz" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnO$" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnNf" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnO_" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnOt" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnOA" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnOB" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREnOC" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_UREnOD" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnOE" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnOF" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnNn" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnOG" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnOH" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnOI" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_UREnOJ" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_UREnOK" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnOL" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnOM" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnON" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnOO" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnOP" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnOQ" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnNn" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnOR" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnOJ" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnOS" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnOT" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREnOU" role="jymVt">
      <property role="TrG5h" value="getCriterion" />
      <node concept="3clFbS" id="5thN_UREnOV" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnOW" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnOX" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnNy" resolve="criterion" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnOY" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnOZ" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYE$$" resolve="SortCriterion" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnP0" role="jymVt">
      <property role="TrG5h" value="setCriterion" />
      <node concept="37vLTG" id="5thN_UREnP1" role="3clF46">
        <property role="TrG5h" value="criterion" />
        <node concept="3uibUv" id="5thN_UREnP2" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYE$$" resolve="SortCriterion" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnP3" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnP4" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnP5" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnP6" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnP7" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnP8" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnNy" resolve="criterion" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnP9" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnP1" resolve="criterion" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnPa" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnPb" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREnPc" role="jymVt">
      <property role="TrG5h" value="getDirection" />
      <node concept="3clFbS" id="5thN_UREnPd" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnPe" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnPf" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnNI" resolve="direction" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnPg" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnPh" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEGj" resolve="SortDirection" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnPi" role="jymVt">
      <property role="TrG5h" value="setDirection" />
      <node concept="37vLTG" id="5thN_UREnPj" role="3clF46">
        <property role="TrG5h" value="direction" />
        <node concept="3uibUv" id="5thN_UREnPk" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEGj" resolve="SortDirection" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnPl" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnPm" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnPn" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnPo" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnPp" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnPq" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnNI" resolve="direction" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnPr" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnPj" resolve="direction" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnPs" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnPt" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREnPu" role="jymVt">
      <property role="TrG5h" value="getAppliesToResource" />
      <node concept="3clFbS" id="5thN_UREnPv" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnPw" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnPx" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnNU" resolve="appliesToResource" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnPy" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnPz" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnP$" role="jymVt">
      <property role="TrG5h" value="setAppliesToResource" />
      <node concept="37vLTG" id="5thN_UREnP_" role="3clF46">
        <property role="TrG5h" value="appliesToResource" />
        <node concept="3uibUv" id="5thN_UREnPA" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnPB" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnPC" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnPD" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnPE" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnPF" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnPG" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnNU" resolve="appliesToResource" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnPH" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnP_" resolve="appliesToResource" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnPI" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnPJ" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREnPK" role="jymVt">
      <property role="TrG5h" value="getAppliesToFeedback" />
      <node concept="3clFbS" id="5thN_UREnPL" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnPM" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnPN" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnO3" resolve="appliesToFeedback" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnPO" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnPP" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnPQ" role="jymVt">
      <property role="TrG5h" value="setAppliesToFeedback" />
      <node concept="37vLTG" id="5thN_UREnPR" role="3clF46">
        <property role="TrG5h" value="appliesToFeedback" />
        <node concept="3uibUv" id="5thN_UREnPS" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnPT" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnPU" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnPV" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnPW" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnPX" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnPY" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnO3" resolve="appliesToFeedback" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnPZ" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnPR" resolve="appliesToFeedback" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnQ0" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnQ1" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREnQ2" role="jymVt">
      <property role="TrG5h" value="getContext" />
      <node concept="3clFbS" id="5thN_UREnQ3" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREnQ4" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREnQ5" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREnOc" resolve="context" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnQ6" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREnQ7" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREnQ8" role="jymVt">
      <property role="TrG5h" value="setContext" />
      <node concept="37vLTG" id="5thN_UREnQ9" role="3clF46">
        <property role="TrG5h" value="context" />
        <node concept="3uibUv" id="5thN_UREnQa" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZsBr" resolve="ContextType" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREnQb" role="3clF47">
        <node concept="3clFbF" id="5thN_UREnQc" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREnQd" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREnQe" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREnQf" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREnQg" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREnOc" resolve="context" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREnQh" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREnQ9" resolve="context" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREnQi" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREnQj" role="3clF45" />
    </node>
    <node concept="n94m4" id="2VtRX2Irar5" role="lGtFl">
      <ref role="n9lRv" to="2rvu:47EFX_kWWKX" resolve="SortingPolicy" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UREqJa">
    <property role="TrG5h" value="GeneratedValidationRule" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UREqJb" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UREqJc" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UREqJd" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UREqJf" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UREqJg" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UREqJh" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_UREtmB" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqJj" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqJk" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqJl" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_UREqJn" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqJo" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREqJp" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREqJq" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="5thN_UREqJr" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREqJs" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqJt" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqJu" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqJv" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqJw" role="jymVt">
      <property role="TrG5h" value="kind" />
      <node concept="2AHcQZ" id="5thN_UREqJy" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREqJz" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREtm$" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREqJ_" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqJA" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREqJB" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREqJC" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqJD" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqJE" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEYt" resolve="ValidationKind" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqJF" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqJG" role="jymVt">
      <property role="TrG5h" value="severity" />
      <node concept="2AHcQZ" id="5thN_UREqJI" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREqJJ" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREtmu" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREqJL" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqJM" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREqJN" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREqJO" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqJP" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqJQ" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEvn" resolve="RuleSeverity" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqJR" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqJS" role="jymVt">
      <property role="TrG5h" value="expression" />
      <node concept="2AHcQZ" id="5thN_UREqJU" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqJV" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqJW" role="2B70Vg">
            <property role="3cmrfH" value="2000" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqJX" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqJY" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqJZ" role="jymVt">
      <property role="TrG5h" value="implementationId" />
      <node concept="2AHcQZ" id="5thN_UREqK1" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqK2" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREqK3" role="2B70Vg">
            <property role="Xl_RC" value="implementation_id" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREqK4" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqK5" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqK6" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqK7" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqK8" role="jymVt">
      <property role="TrG5h" value="appliesToResource" />
      <node concept="2AHcQZ" id="5thN_UREqKa" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqKb" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREqKc" role="2B70Vg">
            <property role="Xl_RC" value="applies_to_resource" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREqKd" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqKe" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqKf" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqKg" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqKh" role="jymVt">
      <property role="TrG5h" value="appliesToFeedback" />
      <node concept="2AHcQZ" id="5thN_UREqKj" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqKk" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREqKl" role="2B70Vg">
            <property role="Xl_RC" value="applies_to_feedback" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREqKm" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqKn" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqKo" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqKp" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqKq" role="jymVt">
      <property role="TrG5h" value="appliesToKind" />
      <node concept="2AHcQZ" id="5thN_UREqKs" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREqKt" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_UREtmx" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREqKv" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqKw" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREqKx" role="2B70Vg">
            <property role="Xl_RC" value="applies_to_kind" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREqKy" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqKz" role="2B70Vg">
            <property role="3cmrfH" value="20" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqK$" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqK_" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqKA" role="jymVt">
      <property role="TrG5h" value="appliesInContext" />
      <node concept="2AHcQZ" id="5thN_UREqKC" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREqKD" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREqKE" role="2B70Vg">
            <property role="Xl_RC" value="applies_in_context" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREqKF" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREqKG" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqKH" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqKI" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREqKJ" role="jymVt">
      <property role="TrG5h" value="invokedBy" />
      <node concept="2AHcQZ" id="5thN_UREqKL" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~ManyToOne" resolve="ManyToOne" />
        <node concept="2B6LJw" id="5thN_UREqKM" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~ManyToOne.fetch()" resolve="fetch" />
          <node concept="Rm8GO" id="5thN_UREtmr" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~FetchType" resolve="FetchType" />
            <ref role="Rm8GQ" to="p99f:~FetchType.LAZY" resolve="LAZY" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREqKO" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~JoinColumn" resolve="JoinColumn" />
        <node concept="2B6LJw" id="5thN_UREqKP" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~JoinColumn.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREqKQ" role="2B70Vg">
            <property role="Xl_RC" value="invoked_by_rule_id" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREqKR" role="1tU5fm">
        <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREqKS" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_UREqKT" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UREqKU" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqKV" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqKW" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqJd" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqKX" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqKY" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqKZ" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UREqL0" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UREqL1" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqL2" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqL3" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqL4" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqL5" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqL6" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqL7" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqJd" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqL8" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqL0" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqL9" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqLa" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqLb" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_UREqLc" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqLd" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqLe" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqJl" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqLf" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqLg" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqLh" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_UREqLi" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_UREqLj" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqLk" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqLl" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqLm" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqLn" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqLo" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqLp" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqJl" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqLq" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqLi" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqLr" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqLs" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqLt" role="jymVt">
      <property role="TrG5h" value="getKind" />
      <node concept="3clFbS" id="5thN_UREqLu" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqLv" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqLw" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqJw" resolve="kind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqLx" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqLy" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEYt" resolve="ValidationKind" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqLz" role="jymVt">
      <property role="TrG5h" value="setKind" />
      <node concept="37vLTG" id="5thN_UREqL$" role="3clF46">
        <property role="TrG5h" value="kind" />
        <node concept="3uibUv" id="5thN_UREqL_" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEYt" resolve="ValidationKind" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqLA" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqLB" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqLC" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqLD" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqLE" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqLF" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqJw" resolve="kind" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqLG" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqL$" resolve="kind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqLH" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqLI" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqLJ" role="jymVt">
      <property role="TrG5h" value="getSeverity" />
      <node concept="3clFbS" id="5thN_UREqLK" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqLL" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqLM" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqJG" resolve="severity" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqLN" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqLO" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEvn" resolve="RuleSeverity" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqLP" role="jymVt">
      <property role="TrG5h" value="setSeverity" />
      <node concept="37vLTG" id="5thN_UREqLQ" role="3clF46">
        <property role="TrG5h" value="severity" />
        <node concept="3uibUv" id="5thN_UREqLR" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEvn" resolve="RuleSeverity" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqLS" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqLT" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqLU" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqLV" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqLW" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqLX" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqJG" resolve="severity" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqLY" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqLQ" resolve="severity" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqLZ" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqM0" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqM1" role="jymVt">
      <property role="TrG5h" value="getExpression" />
      <node concept="3clFbS" id="5thN_UREqM2" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqM3" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqM4" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqJS" resolve="expression" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqM5" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqM6" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqM7" role="jymVt">
      <property role="TrG5h" value="setExpression" />
      <node concept="37vLTG" id="5thN_UREqM8" role="3clF46">
        <property role="TrG5h" value="expression" />
        <node concept="3uibUv" id="5thN_UREqM9" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqMa" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqMb" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqMc" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqMd" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqMe" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqMf" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqJS" resolve="expression" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqMg" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqM8" resolve="expression" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqMh" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqMi" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqMj" role="jymVt">
      <property role="TrG5h" value="getImplementationId" />
      <node concept="3clFbS" id="5thN_UREqMk" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqMl" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqMm" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqJZ" resolve="implementationId" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqMn" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqMo" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqMp" role="jymVt">
      <property role="TrG5h" value="setImplementationId" />
      <node concept="37vLTG" id="5thN_UREqMq" role="3clF46">
        <property role="TrG5h" value="implementationId" />
        <node concept="3uibUv" id="5thN_UREqMr" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqMs" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqMt" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqMu" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqMv" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqMw" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqMx" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqJZ" resolve="implementationId" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqMy" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqMq" resolve="implementationId" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqMz" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqM$" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqM_" role="jymVt">
      <property role="TrG5h" value="getAppliesToResource" />
      <node concept="3clFbS" id="5thN_UREqMA" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqMB" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqMC" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqK8" resolve="appliesToResource" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqMD" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqME" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqMF" role="jymVt">
      <property role="TrG5h" value="setAppliesToResource" />
      <node concept="37vLTG" id="5thN_UREqMG" role="3clF46">
        <property role="TrG5h" value="appliesToResource" />
        <node concept="3uibUv" id="5thN_UREqMH" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqMI" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqMJ" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqMK" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqML" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqMM" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqMN" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqK8" resolve="appliesToResource" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqMO" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqMG" resolve="appliesToResource" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqMP" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqMQ" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqMR" role="jymVt">
      <property role="TrG5h" value="getAppliesToFeedback" />
      <node concept="3clFbS" id="5thN_UREqMS" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqMT" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqMU" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqKh" resolve="appliesToFeedback" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqMV" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqMW" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqMX" role="jymVt">
      <property role="TrG5h" value="setAppliesToFeedback" />
      <node concept="37vLTG" id="5thN_UREqMY" role="3clF46">
        <property role="TrG5h" value="appliesToFeedback" />
        <node concept="3uibUv" id="5thN_UREqMZ" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqN0" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqN1" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqN2" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqN3" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqN4" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqN5" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqKh" resolve="appliesToFeedback" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqN6" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqMY" resolve="appliesToFeedback" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqN7" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqN8" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqN9" role="jymVt">
      <property role="TrG5h" value="getAppliesToKind" />
      <node concept="3clFbS" id="5thN_UREqNa" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqNb" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqNc" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqKq" resolve="appliesToKind" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqNd" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqNe" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqNf" role="jymVt">
      <property role="TrG5h" value="setAppliesToKind" />
      <node concept="37vLTG" id="5thN_UREqNg" role="3clF46">
        <property role="TrG5h" value="appliesToKind" />
        <node concept="3uibUv" id="5thN_UREqNh" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqNi" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqNj" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqNk" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqNl" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqNm" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqNn" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqKq" resolve="appliesToKind" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqNo" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqNg" resolve="appliesToKind" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqNp" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqNq" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqNr" role="jymVt">
      <property role="TrG5h" value="getAppliesInContext" />
      <node concept="3clFbS" id="5thN_UREqNs" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqNt" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqNu" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqKA" resolve="appliesInContext" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqNv" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqNw" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqNx" role="jymVt">
      <property role="TrG5h" value="setAppliesInContext" />
      <node concept="37vLTG" id="5thN_UREqNy" role="3clF46">
        <property role="TrG5h" value="appliesInContext" />
        <node concept="3uibUv" id="5thN_UREqNz" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqN$" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqN_" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqNA" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqNB" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqNC" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqND" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqKA" resolve="appliesInContext" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqNE" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqNy" resolve="appliesInContext" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqNF" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqNG" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREqNH" role="jymVt">
      <property role="TrG5h" value="getInvokedBy" />
      <node concept="3clFbS" id="5thN_UREqNI" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREqNJ" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREqNK" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREqKJ" resolve="invokedBy" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqNL" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREqNM" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREqNN" role="jymVt">
      <property role="TrG5h" value="setInvokedBy" />
      <node concept="37vLTG" id="5thN_UREqNO" role="3clF46">
        <property role="TrG5h" value="invokedBy" />
        <node concept="3uibUv" id="5thN_UREqNP" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4IN1" resolve="AutomationRule" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREqNQ" role="3clF47">
        <node concept="3clFbF" id="5thN_UREqNR" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREqNS" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREqNT" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREqNU" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREqNV" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREqKJ" resolve="invokedBy" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREqNW" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREqNO" resolve="invokedBy" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREqNX" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREqNY" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="5thN_UREuLg">
    <property role="TrG5h" value="GeneratedVerificationPolicy" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="domain.generated" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.domain.generated" />
    <node concept="3Tm1VV" id="5thN_UREuLh" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_UREuLi" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~MappedSuperclass" resolve="MappedSuperclass" />
    </node>
    <node concept="312cEg" id="5thN_UREuLj" role="jymVt">
      <property role="TrG5h" value="id" />
      <node concept="2AHcQZ" id="5thN_UREuLl" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Id" resolve="Id" />
      </node>
      <node concept="2AHcQZ" id="5thN_UREuLm" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~GeneratedValue" resolve="GeneratedValue" />
        <node concept="2B6LJw" id="5thN_UREuLn" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~GeneratedValue.strategy()" resolve="strategy" />
          <node concept="Rm8GO" id="5thN_URH04W" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~GenerationType" resolve="GenerationType" />
            <ref role="Rm8GQ" to="p99f:~GenerationType.IDENTITY" resolve="IDENTITY" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREuLp" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREuLq" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREuLr" role="jymVt">
      <property role="TrG5h" value="name" />
      <node concept="2AHcQZ" id="5thN_UREuLt" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREuLu" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREuLv" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREuLw" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.unique()" resolve="unique" />
          <node concept="3clFbT" id="5thN_UREuLx" role="2B70Vg">
            <property role="3clFbU" value="true" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREuLy" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREuLz" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREuL$" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREuL_" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREuLA" role="jymVt">
      <property role="TrG5h" value="mode" />
      <node concept="2AHcQZ" id="5thN_UREuLC" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREuLD" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URH04T" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREuLF" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREuLG" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREuLH" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREuLI" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREuLJ" role="2B70Vg">
            <property role="3cmrfH" value="16" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREuLK" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEYt" resolve="ValidationKind" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREuLL" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREuLM" role="jymVt">
      <property role="TrG5h" value="appliesWhen" />
      <node concept="2AHcQZ" id="5thN_UREuLO" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Enumerated" resolve="Enumerated" />
        <node concept="2B6LJw" id="5thN_UREuLP" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Enumerated.value()" resolve="value" />
          <node concept="Rm8GO" id="5thN_URH04Q" role="2B70Vg">
            <ref role="1Px2BO" to="p99f:~EnumType" resolve="EnumType" />
            <ref role="Rm8GQ" to="p99f:~EnumType.STRING" resolve="STRING" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5thN_UREuLR" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREuLS" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREuLT" role="2B70Vg">
            <property role="Xl_RC" value="applies_when" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREuLU" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.nullable()" resolve="nullable" />
          <node concept="3clFbT" id="5thN_UREuLV" role="2B70Vg" />
        </node>
        <node concept="2B6LJw" id="5thN_UREuLW" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREuLX" role="2B70Vg">
            <property role="3cmrfH" value="32" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREuLY" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREuLZ" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5thN_UREuM0" role="jymVt">
      <property role="TrG5h" value="verifiesFeedback" />
      <node concept="2AHcQZ" id="5thN_UREuM2" role="2AJF6D">
        <ref role="2AI5Lk" to="p99f:~Column" resolve="Column" />
        <node concept="2B6LJw" id="5thN_UREuM3" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.name()" resolve="name" />
          <node concept="Xl_RD" id="5thN_UREuM4" role="2B70Vg">
            <property role="Xl_RC" value="verifies_feedback" />
          </node>
        </node>
        <node concept="2B6LJw" id="5thN_UREuM5" role="2B76xF">
          <ref role="2B6OnR" to="p99f:~Column.length()" resolve="length" />
          <node concept="3cmrfG" id="5thN_UREuM6" role="2B70Vg">
            <property role="3cmrfH" value="120" />
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_UREuM7" role="1tU5fm">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3Tm6S6" id="5thN_UREuM8" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="5thN_UREuM9" role="jymVt">
      <property role="TrG5h" value="getId" />
      <node concept="3clFbS" id="5thN_UREuMa" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREuMb" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREuMc" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREuLj" resolve="id" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuMd" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREuMe" role="3clF45">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREuMf" role="jymVt">
      <property role="TrG5h" value="setId" />
      <node concept="37vLTG" id="5thN_UREuMg" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5thN_UREuMh" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREuMi" role="3clF47">
        <node concept="3clFbF" id="5thN_UREuMj" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREuMk" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREuMl" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREuMm" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREuMn" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREuLj" resolve="id" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREuMo" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREuMg" resolve="id" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuMp" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREuMq" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREuMr" role="jymVt">
      <property role="TrG5h" value="getName" />
      <node concept="3clFbS" id="5thN_UREuMs" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREuMt" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREuMu" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREuLr" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuMv" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREuMw" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREuMx" role="jymVt">
      <property role="TrG5h" value="setName" />
      <node concept="37vLTG" id="5thN_UREuMy" role="3clF46">
        <property role="TrG5h" value="name" />
        <node concept="3uibUv" id="5thN_UREuMz" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREuM$" role="3clF47">
        <node concept="3clFbF" id="5thN_UREuM_" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREuMA" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREuMB" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREuMC" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREuMD" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREuLr" resolve="name" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREuME" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREuMy" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuMF" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREuMG" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREuMH" role="jymVt">
      <property role="TrG5h" value="getMode" />
      <node concept="3clFbS" id="5thN_UREuMI" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREuMJ" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREuMK" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREuLA" resolve="mode" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuML" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREuMM" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEYt" resolve="ValidationKind" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREuMN" role="jymVt">
      <property role="TrG5h" value="setMode" />
      <node concept="37vLTG" id="5thN_UREuMO" role="3clF46">
        <property role="TrG5h" value="mode" />
        <node concept="3uibUv" id="5thN_UREuMP" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEYt" resolve="ValidationKind" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREuMQ" role="3clF47">
        <node concept="3clFbF" id="5thN_UREuMR" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREuMS" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREuMT" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREuMU" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREuMV" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREuLA" resolve="mode" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREuMW" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREuMO" resolve="mode" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuMX" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREuMY" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREuMZ" role="jymVt">
      <property role="TrG5h" value="getAppliesWhen" />
      <node concept="3clFbS" id="5thN_UREuN0" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREuN1" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREuN2" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREuLM" resolve="appliesWhen" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuN3" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREuN4" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREuN5" role="jymVt">
      <property role="TrG5h" value="setAppliesWhen" />
      <node concept="37vLTG" id="5thN_UREuN6" role="3clF46">
        <property role="TrG5h" value="appliesWhen" />
        <node concept="3uibUv" id="5thN_UREuN7" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEQy" resolve="TriggerEvent" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREuN8" role="3clF47">
        <node concept="3clFbF" id="5thN_UREuN9" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREuNa" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREuNb" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREuNc" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREuNd" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREuLM" resolve="appliesWhen" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREuNe" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREuN6" resolve="appliesWhen" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuNf" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREuNg" role="3clF45" />
    </node>
    <node concept="3clFb_" id="5thN_UREuNh" role="jymVt">
      <property role="TrG5h" value="getVerifiesFeedback" />
      <node concept="3clFbS" id="5thN_UREuNi" role="3clF47">
        <node concept="3cpWs6" id="5thN_UREuNj" role="3cqZAp">
          <node concept="37vLTw" id="5thN_UREuNk" role="3cqZAk">
            <ref role="3cqZAo" node="5thN_UREuM0" resolve="verifiesFeedback" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuNl" role="1B3o_S" />
      <node concept="3uibUv" id="5thN_UREuNm" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
    </node>
    <node concept="3clFb_" id="5thN_UREuNn" role="jymVt">
      <property role="TrG5h" value="setVerifiesFeedback" />
      <node concept="37vLTG" id="5thN_UREuNo" role="3clF46">
        <property role="TrG5h" value="verifiesFeedback" />
        <node concept="3uibUv" id="5thN_UREuNp" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="5thN_UREuNq" role="3clF47">
        <node concept="3clFbF" id="5thN_UREuNr" role="3cqZAp">
          <node concept="37vLTI" id="5thN_UREuNs" role="3clFbG">
            <node concept="2OqwBi" id="5thN_UREuNt" role="37vLTJ">
              <node concept="Xjq3P" id="5thN_UREuNu" role="2Oq$k0" />
              <node concept="2OwXpG" id="5thN_UREuNv" role="2OqNvi">
                <ref role="2Oxat5" node="5thN_UREuM0" resolve="verifiesFeedback" />
              </node>
            </node>
            <node concept="37vLTw" id="5thN_UREuNw" role="37vLTx">
              <ref role="3cqZAo" node="5thN_UREuNo" resolve="verifiesFeedback" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5thN_UREuNx" role="1B3o_S" />
      <node concept="3cqZAl" id="5thN_UREuNy" role="3clF45" />
    </node>
  </node>
  <node concept="3HP615" id="5thN_URVW9K">
    <property role="TrG5h" value="GeneratedFeedbackRepository" />
    <property role="3GE5qa" value="repository.generated" />
    <node concept="3Tm1VV" id="5thN_URVW9L" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URVW9M" role="2AJF6D">
      <ref role="2AI5Lk" to="5okn:~NoRepositoryBean" resolve="NoRepositoryBean" />
    </node>
    <node concept="3uibUv" id="5thN_URVW9N" role="3HQHJm">
      <ref role="3uigEE" to="4pwa:~JpaRepository" resolve="JpaRepository" />
      <node concept="3uibUv" id="5thN_URVW9O" role="11_B2D">
        <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        <node concept="1ZhdrF" id="5thN_URX1_9" role="lGtFl">
          <property role="2qtEX8" value="classifier" />
          <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
          <node concept="3$xsQk" id="5thN_URX1_a" role="3$ytzL">
            <node concept="3clFbS" id="5thN_URX1_b" role="2VODD2">
              <node concept="3cpWs6" id="5thN_URX2SK" role="3cqZAp">
                <node concept="2OqwBi" id="5thN_URX4cB" role="3cqZAk">
                  <node concept="30H73N" id="5thN_URX3XZ" role="2Oq$k0" />
                  <node concept="3TrcHB" id="5thN_URX$QY" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URVW9P" role="11_B2D">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="n94m4" id="5thN_URWtMZ" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="17Uvod" id="5thN_URWMdS" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="5thN_URWMdT" role="3zH0cK">
        <node concept="3clFbS" id="5thN_URWMdU" role="2VODD2">
          <node concept="3clFbF" id="5thN_URWN0o" role="3cqZAp">
            <node concept="3cpWs3" id="5thN_URWX8k" role="3clFbG">
              <node concept="Xl_RD" id="5thN_URWXMw" role="3uHU7w">
                <property role="Xl_RC" value="Repository" />
              </node>
              <node concept="3cpWs3" id="5thN_URWSs6" role="3uHU7B">
                <node concept="Xl_RD" id="5thN_URWN0n" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="5thN_URWTZG" role="3uHU7w">
                  <node concept="30H73N" id="5thN_URWT_$" role="2Oq$k0" />
                  <node concept="3TrcHB" id="5thN_URWUYZ" role="2OqNvi">
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
  <node concept="3HP615" id="5thN_URW14N">
    <property role="TrG5h" value="FeedbackRepository" />
    <property role="3GE5qa" value="repository" />
    <node concept="3Tm1VV" id="5thN_URW14O" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URW14P" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Repository" resolve="Repository" />
    </node>
    <node concept="3uibUv" id="5thN_URW14Q" role="3HQHJm">
      <ref role="3uigEE" node="5thN_URVW9K" resolve="GeneratedFeedbackRepository" />
      <node concept="1ZhdrF" id="5thN_URWAd7" role="lGtFl">
        <property role="2qtEX8" value="classifier" />
        <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
        <node concept="3$xsQk" id="5thN_URWAd8" role="3$ytzL">
          <node concept="3clFbS" id="5thN_URWAd9" role="2VODD2">
            <node concept="3cpWs6" id="5thN_URWBhV" role="3cqZAp">
              <node concept="3cpWs3" id="5thN_URWI1z" role="3cqZAk">
                <node concept="Xl_RD" id="5thN_URWIO9" role="3uHU7w">
                  <property role="Xl_RC" value="Repository" />
                </node>
                <node concept="3cpWs3" id="5thN_URWEUx" role="3uHU7B">
                  <node concept="Xl_RD" id="5thN_URWBKw" role="3uHU7B">
                    <property role="Xl_RC" value="Generated" />
                  </node>
                  <node concept="2OqwBi" id="5thN_URWFVa" role="3uHU7w">
                    <node concept="30H73N" id="5thN_URWFGc" role="2Oq$k0" />
                    <node concept="3TrcHB" id="5thN_URWGBT" role="2OqNvi">
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
    <node concept="n94m4" id="5thN_URWtdE" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="17Uvod" id="5thN_URWuun" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="5thN_URWuuo" role="3zH0cK">
        <node concept="3clFbS" id="5thN_URWuup" role="2VODD2">
          <node concept="3clFbF" id="5thN_URWvEd" role="3cqZAp">
            <node concept="3cpWs3" id="5thN_URWyfA" role="3clFbG">
              <node concept="Xl_RD" id="5thN_URWz0g" role="3uHU7w">
                <property role="Xl_RC" value="Repository" />
              </node>
              <node concept="2OqwBi" id="5thN_URWwql" role="3uHU7B">
                <node concept="30H73N" id="5thN_URWvEc" role="2Oq$k0" />
                <node concept="3TrcHB" id="5thN_URWwRo" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3HP615" id="5thN_URW39J">
    <property role="TrG5h" value="VerificationPolicyRepository" />
    <property role="3GE5qa" value="repository" />
    <node concept="3Tm1VV" id="5thN_URW39K" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URW39L" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Repository" resolve="Repository" />
    </node>
    <node concept="3uibUv" id="2VtRX2IrOPN" role="3HQHJm">
      <ref role="3uigEE" node="2VtRX2IrvuZ" resolve="GeneratedVerificationPolicyRepository" />
    </node>
    <node concept="n94m4" id="5thN_URWn7c" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="3HP615" id="5thN_URVZRS">
    <property role="TrG5h" value="GeneratedSortingPolicyRepository" />
    <property role="3GE5qa" value="repository.generated" />
    <node concept="3Tm1VV" id="5thN_URVZRT" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URVZRU" role="2AJF6D">
      <ref role="2AI5Lk" to="5okn:~NoRepositoryBean" resolve="NoRepositoryBean" />
    </node>
    <node concept="3uibUv" id="5thN_URVZRV" role="3HQHJm">
      <ref role="3uigEE" to="4pwa:~JpaRepository" resolve="JpaRepository" />
      <node concept="3uibUv" id="5thN_URVZRW" role="11_B2D">
        <ref role="3uigEE" node="5thN_UR4WiI" resolve="SortingPolicy" />
        <node concept="1ZhdrF" id="2VtRX2IrnWu" role="lGtFl">
          <property role="2qtEX8" value="classifier" />
          <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
          <node concept="3$xsQk" id="2VtRX2IrnWv" role="3$ytzL">
            <node concept="3clFbS" id="2VtRX2IrnWw" role="2VODD2">
              <node concept="3clFbF" id="2VtRX2IrpIX" role="3cqZAp">
                <node concept="2OqwBi" id="2VtRX2IrpZy" role="3clFbG">
                  <node concept="30H73N" id="2VtRX2IrpIW" role="2Oq$k0" />
                  <node concept="3TrcHB" id="2VtRX2Irqfy" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URVZRX" role="11_B2D">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="n94m4" id="5thN_URXe8v" role="lGtFl">
      <ref role="n9lRv" to="2rvu:47EFX_kWWKX" resolve="SortingPolicy" />
    </node>
    <node concept="17Uvod" id="2VtRX2Irq_7" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="2VtRX2Irq_8" role="3zH0cK">
        <node concept="3clFbS" id="2VtRX2Irq_9" role="2VODD2">
          <node concept="3clFbF" id="2VtRX2IrqUZ" role="3cqZAp">
            <node concept="3cpWs3" id="2VtRX2IrtZK" role="3clFbG">
              <node concept="Xl_RD" id="2VtRX2Irug5" role="3uHU7w">
                <property role="Xl_RC" value="Repository" />
              </node>
              <node concept="3cpWs3" id="2VtRX2Irs9n" role="3uHU7B">
                <node concept="Xl_RD" id="2VtRX2IrqUY" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="2VtRX2Irt0c" role="3uHU7w">
                  <node concept="30H73N" id="2VtRX2IrsA4" role="2Oq$k0" />
                  <node concept="3TrcHB" id="2VtRX2Irtmj" role="2OqNvi">
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
  <node concept="3HP615" id="6Hrz6iyZ1P6">
    <property role="TrG5h" value="GeneratedUserRepository" />
    <property role="3GE5qa" value="repository.generated" />
    <node concept="3Tm1VV" id="6Hrz6iyZ1P7" role="1B3o_S" />
    <node concept="2AHcQZ" id="6Hrz6iyZ1P8" role="2AJF6D">
      <ref role="2AI5Lk" to="5okn:~NoRepositoryBean" resolve="NoRepositoryBean" />
    </node>
    <node concept="3uibUv" id="6Hrz6iyZ1P9" role="3HQHJm">
      <ref role="3uigEE" to="4pwa:~JpaRepository" resolve="JpaRepository" />
      <node concept="3uibUv" id="6Hrz6iyZ1Pa" role="11_B2D">
        <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
      </node>
      <node concept="3uibUv" id="6Hrz6iyZ1Pb" role="11_B2D">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZ1Pc" role="jymVt">
      <property role="TrG5h" value="findByUsername" />
      <node concept="3Tm1VV" id="6Hrz6iyZ1Pd" role="1B3o_S" />
      <node concept="37vLTG" id="6Hrz6iyZ1Pe" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="6Hrz6iyZ1Pf" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZ1Pg" role="3clF47" />
      <node concept="3uibUv" id="6Hrz6iyZ1Ph" role="3clF45">
        <ref role="3uigEE" to="33ny:~Optional" resolve="Optional" />
        <node concept="3uibUv" id="6Hrz6iyZ1Pi" role="11_B2D">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="6Hrz6iyZ1Pj" role="jymVt">
      <property role="TrG5h" value="existsByUsername" />
      <node concept="3Tm1VV" id="6Hrz6iyZ1Pk" role="1B3o_S" />
      <node concept="37vLTG" id="6Hrz6iyZ1Pl" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="6Hrz6iyZ1Pm" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="6Hrz6iyZ1Pn" role="3clF47" />
      <node concept="10P_77" id="6Hrz6iyZ1Po" role="3clF45" />
    </node>
    <node concept="n94m4" id="2VtRX2Irawa" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
    </node>
  </node>
  <node concept="3HP615" id="5thN_URVYm4">
    <property role="TrG5h" value="GeneratedResourceRepository" />
    <property role="3GE5qa" value="repository.generated" />
    <node concept="3Tm1VV" id="5thN_URVYm5" role="1B3o_S" />
    <node concept="2AHcQZ" id="5thN_URVYm6" role="2AJF6D">
      <ref role="2AI5Lk" to="5okn:~NoRepositoryBean" resolve="NoRepositoryBean" />
    </node>
    <node concept="3uibUv" id="5thN_URVYm7" role="3HQHJm">
      <ref role="3uigEE" to="4pwa:~JpaRepository" resolve="JpaRepository" />
      <node concept="3uibUv" id="5thN_URVYm8" role="11_B2D">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        <node concept="1ZhdrF" id="2VtRX2Irl$S" role="lGtFl">
          <property role="2qtEX8" value="classifier" />
          <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
          <node concept="3$xsQk" id="2VtRX2Irl$T" role="3$ytzL">
            <node concept="3clFbS" id="2VtRX2Irl$U" role="2VODD2">
              <node concept="3cpWs6" id="2VtRX2Irmd8" role="3cqZAp">
                <node concept="2OqwBi" id="2VtRX2Irn0a" role="3cqZAk">
                  <node concept="30H73N" id="2VtRX2IrmLy" role="2Oq$k0" />
                  <node concept="3TrcHB" id="2VtRX2Irnsl" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="5thN_URVYm9" role="11_B2D">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="n94m4" id="5thN_URWnSX" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="17Uvod" id="2VtRX2IraX7" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="2VtRX2IraX8" role="3zH0cK">
        <node concept="3clFbS" id="2VtRX2IraX9" role="2VODD2">
          <node concept="3clFbF" id="2VtRX2IrbE5" role="3cqZAp">
            <node concept="3cpWs3" id="2VtRX2IrkrN" role="3clFbG">
              <node concept="Xl_RD" id="2VtRX2IrkF6" role="3uHU7w">
                <property role="Xl_RC" value="Repository" />
              </node>
              <node concept="3cpWs3" id="2VtRX2IrhcR" role="3uHU7B">
                <node concept="Xl_RD" id="2VtRX2Irg9f" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="2VtRX2IriVj" role="3uHU7w">
                  <node concept="30H73N" id="2VtRX2IrhEt" role="2Oq$k0" />
                  <node concept="3TrcHB" id="2VtRX2IrjeS" role="2OqNvi">
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
  <node concept="3HP615" id="2VtRX2IrvuZ">
    <property role="3GE5qa" value="repository.generated" />
    <property role="TrG5h" value="GeneratedVerificationPolicyRepository" />
    <node concept="3Tm1VV" id="2VtRX2Irvv0" role="1B3o_S" />
    <node concept="n94m4" id="2VtRX2Irvv1" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36US" resolve="VerificationPolicy" />
    </node>
    <node concept="3uibUv" id="2VtRX2Iryps" role="3HQHJm">
      <ref role="3uigEE" to="4pwa:~JpaRepository" resolve="JpaRepository" />
      <node concept="3uibUv" id="2VtRX2IryGV" role="11_B2D">
        <ref role="3uigEE" node="5thN_UR5RPC" resolve="VerificationPolicy" />
        <node concept="1ZhdrF" id="2VtRX2Irzaa" role="lGtFl">
          <property role="2qtEX8" value="classifier" />
          <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
          <node concept="3$xsQk" id="2VtRX2Irzab" role="3$ytzL">
            <node concept="3clFbS" id="2VtRX2Irzac" role="2VODD2">
              <node concept="3cpWs6" id="2VtRX2IrzJS" role="3cqZAp">
                <node concept="2OqwBi" id="2VtRX2Ir$wo" role="3cqZAk">
                  <node concept="30H73N" id="2VtRX2Ir$hK" role="2Oq$k0" />
                  <node concept="3TrcHB" id="2VtRX2Ir$Kq" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2VtRX2IryY3" role="11_B2D">
        <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
      </node>
    </node>
    <node concept="17Uvod" id="2VtRX2IrHAS" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="2VtRX2IrHAT" role="3zH0cK">
        <node concept="3clFbS" id="2VtRX2IrHAU" role="2VODD2">
          <node concept="3clFbF" id="2VtRX2IrHVm" role="3cqZAp">
            <node concept="3cpWs3" id="2VtRX2IrLup" role="3clFbG">
              <node concept="Xl_RD" id="2VtRX2IrLGc" role="3uHU7w">
                <property role="Xl_RC" value="Repository" />
              </node>
              <node concept="3cpWs3" id="2VtRX2IrJ_u" role="3uHU7B">
                <node concept="Xl_RD" id="2VtRX2IrHVl" role="3uHU7B">
                  <property role="Xl_RC" value="Generated" />
                </node>
                <node concept="2OqwBi" id="2VtRX2IrKuP" role="3uHU7w">
                  <node concept="30H73N" id="2VtRX2IrK4H" role="2Oq$k0" />
                  <node concept="3TrcHB" id="2VtRX2IrKOW" role="2OqNvi">
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
  <node concept="3HP615" id="2VtRX2IrMEN">
    <property role="TrG5h" value="PolicyRepository" />
    <property role="3GE5qa" value="repository" />
    <node concept="3Tm1VV" id="2VtRX2IrMEO" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IrMEP" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Repository" resolve="Repository" />
    </node>
    <node concept="3uibUv" id="2VtRX2IrMEQ" role="3HQHJm">
      <ref role="3uigEE" node="5thN_URVZRS" resolve="GeneratedSortingPolicyRepository" />
    </node>
  </node>
  <node concept="3HP615" id="2VtRX2IrS2f">
    <property role="TrG5h" value="ResourceRepository" />
    <property role="3GE5qa" value="repository" />
    <node concept="3Tm1VV" id="2VtRX2IrS2g" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IrS2h" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Repository" resolve="Repository" />
    </node>
    <node concept="3uibUv" id="2VtRX2IrS2i" role="3HQHJm">
      <ref role="3uigEE" node="5thN_URVYm4" resolve="GeneratedResourceRepository" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IwXCF">
    <property role="3GE5qa" value="domain" />
    <property role="TrG5h" value="DomainTemplate" />
    <property role="2HnT6v" value="src.main.java.pt.isep.enorm.ref.amazon.domain" />
    <node concept="3Tm1VV" id="2VtRX2IwXCG" role="1B3o_S" />
    <node concept="n94m4" id="2VtRX2IwXCH" role="lGtFl">
      <ref role="n9lRv" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="2AHcQZ" id="2VtRX2IwYUw" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Entity" resolve="Entity" />
      <node concept="2B6LJw" id="2VtRX2IwZoE" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Entity.name()" resolve="name" />
        <node concept="Xl_RD" id="2VtRX2IwZwP" role="2B70Vg">
          <property role="Xl_RC" value="Domain" />
          <node concept="17Uvod" id="2VtRX2Ix13w" role="lGtFl">
            <property role="2qtEX9" value="value" />
            <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
            <node concept="3zFVjK" id="2VtRX2Ix13x" role="3zH0cK">
              <node concept="3clFbS" id="2VtRX2Ix13y" role="2VODD2">
                <node concept="3clFbF" id="2VtRX2Ix1qk" role="3cqZAp">
                  <node concept="2OqwBi" id="2VtRX2Ix1Fp" role="3clFbG">
                    <node concept="30H73N" id="2VtRX2Ix1qj" role="2Oq$k0" />
                    <node concept="3TrcHB" id="2VtRX2Ix207" role="2OqNvi">
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
    <node concept="2AHcQZ" id="2VtRX2IwZZM" role="2AJF6D">
      <ref role="2AI5Lk" to="p99f:~Table" resolve="Table" />
      <node concept="2B6LJw" id="2VtRX2Ix0cY" role="2B76xF">
        <ref role="2B6OnR" to="p99f:~Table.name()" resolve="name" />
        <node concept="Xl_RD" id="2VtRX2Ix0nF" role="2B70Vg">
          <property role="Xl_RC" value="tableName" />
          <node concept="17Uvod" id="2VtRX2Ix2g7" role="lGtFl">
            <property role="2qtEX9" value="value" />
            <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
            <node concept="3zFVjK" id="2VtRX2Ix2g8" role="3zH0cK">
              <node concept="3clFbS" id="2VtRX2Ix2g9" role="2VODD2">
                <node concept="3clFbF" id="2VtRX2Ix2zE" role="3cqZAp">
                  <node concept="2OqwBi" id="2VtRX2Ix2OJ" role="3clFbG">
                    <node concept="30H73N" id="2VtRX2Ix2zD" role="2Oq$k0" />
                    <node concept="3TrcHB" id="2VtRX2Ix37F" role="2OqNvi">
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
    <node concept="17Uvod" id="2VtRX2Ix3i3" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="2VtRX2Ix3i4" role="3zH0cK">
        <node concept="3clFbS" id="2VtRX2Ix3i5" role="2VODD2">
          <node concept="3clFbF" id="2VtRX2Ix3$3" role="3cqZAp">
            <node concept="2OqwBi" id="2VtRX2IzXub" role="3clFbG">
              <node concept="2OqwBi" id="2VtRX2IzWto" role="2Oq$k0">
                <node concept="30H73N" id="2VtRX2IzWck" role="2Oq$k0" />
                <node concept="2yIwOk" id="2VtRX2IzX2l" role="2OqNvi" />
              </node>
              <node concept="liA8E" id="2VtRX2IzYaT" role="2OqNvi">
                <ref role="37wK5l" to="c17a:~SAbstractConcept.getName()" resolve="getName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="2VtRX2Ix5J3" role="1zkMxy">
      <ref role="3uigEE" node="5thN_URrZ2g" resolve="GeneratedFeedback" />
      <node concept="1ZhdrF" id="2VtRX2Ix5SW" role="lGtFl">
        <property role="2qtEX8" value="classifier" />
        <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107535904670/1107535924139" />
        <node concept="3$xsQk" id="2VtRX2Ix5SX" role="3$ytzL">
          <node concept="3clFbS" id="2VtRX2Ix5SY" role="2VODD2">
            <node concept="3cpWs6" id="2VtRX2Ix6fl" role="3cqZAp">
              <node concept="2OqwBi" id="2VtRX2Ix7N$" role="3cqZAk">
                <node concept="2OqwBi" id="2VtRX2Ix6Xz" role="2Oq$k0">
                  <node concept="30H73N" id="2VtRX2Ix6Cy" role="2Oq$k0" />
                  <node concept="2yIwOk" id="2VtRX2Ix7l1" role="2OqNvi" />
                </node>
                <node concept="liA8E" id="2VtRX2Ix8tc" role="2OqNvi">
                  <ref role="37wK5l" to="c17a:~SAbstractConcept.getName()" resolve="getName" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IQYXX">
    <property role="TrG5h" value="ResourceService" />
    <property role="3GE5qa" value="service" />
    <node concept="3Tm1VV" id="2VtRX2IQYXY" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IQYXZ" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Service" resolve="Service" />
    </node>
    <node concept="3uibUv" id="2VtRX2IQYY0" role="1zkMxy">
      <ref role="3uigEE" node="2VtRX2IRiA2" resolve="GeneratedResourceService" />
    </node>
    <node concept="3clFbW" id="2VtRX2IQYY1" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IQYY2" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IQYY3" role="3clF46">
        <property role="TrG5h" value="resourceRepository" />
        <node concept="3uibUv" id="2VtRX2IQYY4" role="1tU5fm">
          <ref role="3uigEE" node="2VtRX2IrS2f" resolve="ResourceRepository" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IQYY5" role="3clF47">
        <node concept="XkiVB" id="2VtRX2IWsw5" role="3cqZAp">
          <ref role="37wK5l" node="2VtRX2IRiAb" resolve="GeneratedResourceService" />
          <node concept="37vLTw" id="2VtRX2IWsw6" role="37wK5m">
            <ref role="3cqZAo" node="2VtRX2IQYY3" resolve="resourceRepository" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IQYY8" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IR202">
    <property role="TrG5h" value="FeedbackService" />
    <property role="3GE5qa" value="service" />
    <node concept="3Tm1VV" id="2VtRX2IR203" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IR204" role="2AJF6D">
      <ref role="2AI5Lk" to="meih:~Service" resolve="Service" />
    </node>
    <node concept="3uibUv" id="2VtRX2IR205" role="1zkMxy">
      <ref role="3uigEE" node="2VtRX2IR31A" resolve="GeneratedFeedbackService" />
    </node>
    <node concept="3clFbW" id="2VtRX2IR206" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IR207" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IR208" role="3clF46">
        <property role="TrG5h" value="feedbackRepository" />
        <node concept="3uibUv" id="2VtRX2IR209" role="1tU5fm">
          <ref role="3uigEE" node="5thN_URW14N" resolve="FeedbackRepository" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IR20a" role="3clF47">
        <node concept="XkiVB" id="2VtRX2IWpzS" role="3cqZAp">
          <ref role="37wK5l" node="2VtRX2IR31J" resolve="GeneratedFeedbackService" />
          <node concept="37vLTw" id="2VtRX2IWpzT" role="37wK5m">
            <ref role="3cqZAo" node="2VtRX2IR208" resolve="feedbackRepository" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IR20d" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IR31A">
    <property role="TrG5h" value="GeneratedFeedbackService" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="service.generated" />
    <node concept="3Tm1VV" id="2VtRX2IR31B" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IR31C" role="2AJF6D">
      <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      <node concept="2B6LJw" id="2VtRX2IR31D" role="2B76xF">
        <ref role="2B6OnR" to="u35y:~Transactional.readOnly()" resolve="readOnly" />
        <node concept="3clFbT" id="2VtRX2IR31E" role="2B70Vg">
          <property role="3clFbU" value="true" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="2VtRX2IR31F" role="jymVt">
      <property role="TrG5h" value="feedbackRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IR31H" role="1tU5fm">
        <ref role="3uigEE" node="5thN_URW14N" resolve="FeedbackRepository" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IR31I" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2VtRX2IR31J" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IR31K" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IR31L" role="3clF46">
        <property role="TrG5h" value="feedbackRepository" />
        <node concept="3uibUv" id="2VtRX2IR31M" role="1tU5fm">
          <ref role="3uigEE" node="5thN_URW14N" resolve="FeedbackRepository" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IR31N" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IR31O" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IR31P" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IR31Q" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IR31R" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IR31S" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IR31F" resolve="feedbackRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IR31T" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IR31L" resolve="feedbackRepository" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2IR31U" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2VtRX2IR31V" role="jymVt">
      <property role="TrG5h" value="listFeedbacks" />
      <node concept="3clFbS" id="2VtRX2IR31W" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IR31X" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRc2H" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IRbNz" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IR31F" resolve="feedbackRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRc2I" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~ListCrudRepository.findAll()" resolve="findAll" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IR31Z" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IR320" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="2VtRX2IR321" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IR322" role="jymVt">
      <property role="TrG5h" value="getFeedback" />
      <node concept="37vLTG" id="2VtRX2IR323" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="2VtRX2IR324" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IR325" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IR326" role="3cqZAp">
          <node concept="15s5l7" id="2VtRX2IRhpS" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: uncaught exceptions: @orElseThrow.X extends Throwable&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/4460871289557453850]&quot;;" />
            <property role="huDt6" value="Error: uncaught exceptions: @orElseThrow.X extends Throwable" />
          </node>
          <node concept="2OqwBi" id="2VtRX2IReIT" role="3cqZAk">
            <node concept="2OqwBi" id="2VtRX2IRdLi" role="2Oq$k0">
              <node concept="37vLTw" id="2VtRX2IRbND" role="2Oq$k0">
                <ref role="3cqZAo" node="2VtRX2IR31F" resolve="feedbackRepository" />
              </node>
              <node concept="liA8E" id="2VtRX2IRdLj" role="2OqNvi">
                <ref role="37wK5l" to="5okn:~CrudRepository.findById(java.lang.Object)" resolve="findById" />
                <node concept="37vLTw" id="2VtRX2IRdLk" role="37wK5m">
                  <ref role="3cqZAo" node="2VtRX2IR323" resolve="id" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="2VtRX2IReIU" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Optional.orElseThrow(java.util.function.Supplier)" resolve="orElseThrow" />
              <node concept="1bVj0M" id="2VtRX2IReIV" role="37wK5m">
                <node concept="3clFbS" id="2VtRX2IReIW" role="1bW5cS">
                  <node concept="3clFbF" id="2VtRX2IReIX" role="3cqZAp">
                    <node concept="2ShNRf" id="2VtRX2IReIY" role="3clFbG">
                      <node concept="1pGfFk" id="2VtRX2IReIZ" role="2ShVmc">
                        <ref role="37wK5l" node="6Hrz6izEswb" resolve="ResourceNotFoundException" />
                        <node concept="2OqwBi" id="2VtRX2IReJ0" role="37wK5m">
                          <node concept="Xl_RD" id="2VtRX2IReJ1" role="2Oq$k0">
                            <property role="Xl_RC" value="Feedback '%s' was not found." />
                          </node>
                          <node concept="liA8E" id="2VtRX2IReJ2" role="2OqNvi">
                            <ref role="37wK5l" to="wyt6:~String.formatted(java.lang.Object...)" resolve="formatted" />
                            <node concept="37vLTw" id="2VtRX2IReJ3" role="37wK5m">
                              <ref role="3cqZAo" node="2VtRX2IR323" resolve="id" />
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
      <node concept="3Tm1VV" id="2VtRX2IR32h" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IR32i" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IR32j" role="jymVt">
      <property role="TrG5h" value="createFeedback" />
      <node concept="2AHcQZ" id="2VtRX2IR32k" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2VtRX2IR32l" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="2VtRX2IR32m" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IR32n" role="3clF47">
        <node concept="3SKdUt" id="2VtRX2IR32I" role="3cqZAp">
          <node concept="1PaTwC" id="2VtRX2IR32J" role="1aUNEU">
            <node concept="3oM_SD" id="2VtRX2IR32L" role="1PaTwD">
              <property role="3oM_SC" value="TODO:" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32M" role="1PaTwD">
              <property role="3oM_SC" value="load" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32N" role="1PaTwD">
              <property role="3oM_SC" value="subject/author," />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32O" role="1PaTwD">
              <property role="3oM_SC" value="validate" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32P" role="1PaTwD">
              <property role="3oM_SC" value="policies," />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32Q" role="1PaTwD">
              <property role="3oM_SC" value="copy" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32R" role="1PaTwD">
              <property role="3oM_SC" value="generated" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IR32S" role="1PaTwD">
              <property role="3oM_SC" value="fields." />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2IR32o" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRcy9" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IRbNa" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IR31F" resolve="feedbackRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRcya" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~CrudRepository.save(java.lang.Object)" resolve="save" />
              <node concept="37vLTw" id="2VtRX2IRcyb" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IR32l" resolve="request" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IR32r" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IR32s" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IR32t" role="jymVt">
      <property role="TrG5h" value="deleteFeedback" />
      <node concept="2AHcQZ" id="2VtRX2IR32u" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2VtRX2IR32v" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="2VtRX2IR32w" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IR32x" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IR32y" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRdr_" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IRbN2" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IR31F" resolve="feedbackRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRdrA" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~CrudRepository.delete(java.lang.Object)" resolve="delete" />
              <node concept="1rXfSq" id="2VtRX2IRdrB" role="37wK5m">
                <ref role="37wK5l" node="2VtRX2IR322" resolve="getFeedback" />
                <node concept="37vLTw" id="2VtRX2IRdrC" role="37wK5m">
                  <ref role="3cqZAo" node="2VtRX2IR32v" resolve="id" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IR32A" role="1B3o_S" />
      <node concept="3cqZAl" id="2VtRX2IR32B" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IRiA2">
    <property role="TrG5h" value="GeneratedResourceService" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="service.generated" />
    <node concept="3Tm1VV" id="2VtRX2IRiA3" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IRiA4" role="2AJF6D">
      <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      <node concept="2B6LJw" id="2VtRX2IRiA5" role="2B76xF">
        <ref role="2B6OnR" to="u35y:~Transactional.readOnly()" resolve="readOnly" />
        <node concept="3clFbT" id="2VtRX2IRiA6" role="2B70Vg">
          <property role="3clFbU" value="true" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="2VtRX2IRiA7" role="jymVt">
      <property role="TrG5h" value="resourceRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IRiA9" role="1tU5fm">
        <ref role="3uigEE" node="2VtRX2IrS2f" resolve="ResourceRepository" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IRiAa" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2VtRX2IRiAb" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IRiAc" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IRiAd" role="3clF46">
        <property role="TrG5h" value="resourceRepository" />
        <node concept="3uibUv" id="2VtRX2IRiAe" role="1tU5fm">
          <ref role="3uigEE" node="2VtRX2IrS2f" resolve="ResourceRepository" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRiAf" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRiAg" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IRiAh" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IRiAi" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IRiAj" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IRiAk" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IRiA7" resolve="resourceRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IRiAl" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IRiAd" resolve="resourceRepository" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2IRiAm" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2VtRX2IRiAn" role="jymVt">
      <property role="TrG5h" value="listResources" />
      <node concept="3clFbS" id="2VtRX2IRiAo" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRiAp" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRkhp" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IRjc9" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRiA7" resolve="resourceRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRkhq" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~ListCrudRepository.findAll()" resolve="findAll" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRiAr" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRiAs" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="2VtRX2IRiAt" role="11_B2D">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRiAu" role="jymVt">
      <property role="TrG5h" value="getResource" />
      <node concept="37vLTG" id="2VtRX2IRiAv" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="2VtRX2IRiAw" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRiAx" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRiAy" role="3cqZAp">
          <node concept="15s5l7" id="2VtRX2IRqd5" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: uncaught exceptions: @orElseThrow.X extends Throwable&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/4460871289557453850]&quot;;" />
            <property role="huDt6" value="Error: uncaught exceptions: @orElseThrow.X extends Throwable" />
          </node>
          <node concept="2OqwBi" id="2VtRX2IRnvg" role="3cqZAk">
            <node concept="2OqwBi" id="2VtRX2IRjMf" role="2Oq$k0">
              <node concept="37vLTw" id="2VtRX2IRjc2" role="2Oq$k0">
                <ref role="3cqZAo" node="2VtRX2IRiA7" resolve="resourceRepository" />
              </node>
              <node concept="liA8E" id="2VtRX2IRjMg" role="2OqNvi">
                <ref role="37wK5l" to="5okn:~CrudRepository.findById(java.lang.Object)" resolve="findById" />
                <node concept="37vLTw" id="2VtRX2IRjMh" role="37wK5m">
                  <ref role="3cqZAo" node="2VtRX2IRiAv" resolve="id" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="2VtRX2IRnvh" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Optional.orElseThrow(java.util.function.Supplier)" resolve="orElseThrow" />
              <node concept="1bVj0M" id="2VtRX2IRnvi" role="37wK5m">
                <node concept="3clFbS" id="2VtRX2IRnvj" role="1bW5cS">
                  <node concept="3clFbF" id="2VtRX2IRnvk" role="3cqZAp">
                    <node concept="2ShNRf" id="2VtRX2IRnvl" role="3clFbG">
                      <node concept="1pGfFk" id="2VtRX2IRnvm" role="2ShVmc">
                        <ref role="37wK5l" node="6Hrz6izEswb" resolve="ResourceNotFoundException" />
                        <node concept="2OqwBi" id="2VtRX2IRnvn" role="37wK5m">
                          <node concept="Xl_RD" id="2VtRX2IRnvo" role="2Oq$k0">
                            <property role="Xl_RC" value="Resource '%s' was not found." />
                          </node>
                          <node concept="liA8E" id="2VtRX2IRnvp" role="2OqNvi">
                            <ref role="37wK5l" to="wyt6:~String.formatted(java.lang.Object...)" resolve="formatted" />
                            <node concept="37vLTw" id="2VtRX2IRnvq" role="37wK5m">
                              <ref role="3cqZAo" node="2VtRX2IRiAv" resolve="id" />
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
      <node concept="3Tm1VV" id="2VtRX2IRiAH" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRiAI" role="3clF45">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRiAJ" role="jymVt">
      <property role="TrG5h" value="createResource" />
      <node concept="2AHcQZ" id="2VtRX2IRiAK" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2VtRX2IRiAL" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="2VtRX2IRiAM" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRiAN" role="3clF47">
        <node concept="3SKdUt" id="2VtRX2IRiBr" role="3cqZAp">
          <node concept="1PaTwC" id="2VtRX2IRiBs" role="1aUNEU">
            <node concept="3oM_SD" id="2VtRX2IRiBu" role="1PaTwD">
              <property role="3oM_SC" value="TODO:" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBv" role="1PaTwD">
              <property role="3oM_SC" value="copy" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBw" role="1PaTwD">
              <property role="3oM_SC" value="generated" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBx" role="1PaTwD">
              <property role="3oM_SC" value="scalar" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBy" role="1PaTwD">
              <property role="3oM_SC" value="fields." />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2IRiAO" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRlGd" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IRjbV" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRiA7" resolve="resourceRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRlGe" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~CrudRepository.save(java.lang.Object)" resolve="save" />
              <node concept="37vLTw" id="2VtRX2IRlGf" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRiAL" resolve="request" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRiAR" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRiAS" role="3clF45">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRiAT" role="jymVt">
      <property role="TrG5h" value="updateResource" />
      <node concept="2AHcQZ" id="2VtRX2IRiAU" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2VtRX2IRiAV" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="2VtRX2IRiAW" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRiAX" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="3uibUv" id="2VtRX2IRiAY" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRiAZ" role="3clF47">
        <node concept="3cpWs8" id="2VtRX2IRiB1" role="3cqZAp">
          <node concept="3cpWsn" id="2VtRX2IRiB0" role="3cpWs9">
            <property role="TrG5h" value="entity" />
            <node concept="3uibUv" id="2VtRX2IRiB2" role="1tU5fm">
              <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
            </node>
            <node concept="1rXfSq" id="2VtRX2IRiB3" role="33vP2m">
              <ref role="37wK5l" node="2VtRX2IRiAu" resolve="getResource" />
              <node concept="37vLTw" id="2VtRX2IRiB4" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRiAV" resolve="id" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="2VtRX2IRiBz" role="3cqZAp">
          <node concept="1PaTwC" id="2VtRX2IRiB$" role="1aUNEU">
            <node concept="3oM_SD" id="2VtRX2IRiBA" role="1PaTwD">
              <property role="3oM_SC" value="TODO:" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBB" role="1PaTwD">
              <property role="3oM_SC" value="copy" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBC" role="1PaTwD">
              <property role="3oM_SC" value="non-null" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBD" role="1PaTwD">
              <property role="3oM_SC" value="mutable" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBE" role="1PaTwD">
              <property role="3oM_SC" value="fields" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBF" role="1PaTwD">
              <property role="3oM_SC" value="from" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBG" role="1PaTwD">
              <property role="3oM_SC" value="request" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBH" role="1PaTwD">
              <property role="3oM_SC" value="into" />
            </node>
            <node concept="3oM_SD" id="2VtRX2IRiBI" role="1PaTwD">
              <property role="3oM_SC" value="entity." />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2IRiB5" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRk1E" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IRjcn" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRiA7" resolve="resourceRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRk1F" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~CrudRepository.save(java.lang.Object)" resolve="save" />
              <node concept="37vLTw" id="2VtRX2IRk1G" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRiB0" resolve="entity" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRiB8" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRiB9" role="3clF45">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRiBa" role="jymVt">
      <property role="TrG5h" value="deleteResource" />
      <node concept="2AHcQZ" id="2VtRX2IRiBb" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2VtRX2IRiBc" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="2VtRX2IRiBd" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRiBe" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRiBf" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRkVC" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IRjcf" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRiA7" resolve="resourceRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IRkVD" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~CrudRepository.delete(java.lang.Object)" resolve="delete" />
              <node concept="1rXfSq" id="2VtRX2IRkVE" role="37wK5m">
                <ref role="37wK5l" node="2VtRX2IRiAu" resolve="getResource" />
                <node concept="37vLTw" id="2VtRX2IRkVF" role="37wK5m">
                  <ref role="3cqZAo" node="2VtRX2IRiBc" resolve="id" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRiBj" role="1B3o_S" />
      <node concept="3cqZAl" id="2VtRX2IRiBk" role="3clF45" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IRxBw">
    <property role="TrG5h" value="ResourceController" />
    <property role="3GE5qa" value="web" />
    <node concept="3Tm1VV" id="2VtRX2IRxBx" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IRxBy" role="2AJF6D">
      <ref role="2AI5Lk" to="uepr:~RestController" resolve="RestController" />
    </node>
    <node concept="2AHcQZ" id="2VtRX2IRxBz" role="2AJF6D">
      <ref role="2AI5Lk" to="uepr:~RequestMapping" resolve="RequestMapping" />
      <node concept="2B6LJw" id="2VtRX2IRxB$" role="2B76xF">
        <ref role="2B6OnR" to="uepr:~RequestMapping.value()" resolve="value" />
        <node concept="Xl_RD" id="2VtRX2IRxB_" role="2B70Vg">
          <property role="Xl_RC" value="/api" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="2VtRX2IRxBA" role="1zkMxy">
      <ref role="3uigEE" node="2VtRX2IRyU8" resolve="GeneratedResourceController" />
    </node>
    <node concept="3clFbW" id="2VtRX2IRxBB" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IRxBC" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IRxBD" role="3clF46">
        <property role="TrG5h" value="resourceService" />
        <node concept="3uibUv" id="2VtRX2IRxBE" role="1tU5fm">
          <ref role="3uigEE" node="2VtRX2IQYXX" resolve="ResourceService" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRxBF" role="3clF47">
        <node concept="XkiVB" id="2VtRX2IWsiH" role="3cqZAp">
          <ref role="37wK5l" node="2VtRX2IRyUe" resolve="GeneratedResourceController" />
          <node concept="37vLTw" id="2VtRX2IWsiI" role="37wK5m">
            <ref role="3cqZAo" node="2VtRX2IRxBD" resolve="resourceService" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRxBI" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IRyww">
    <property role="TrG5h" value="FeedbackController" />
    <property role="3GE5qa" value="web" />
    <node concept="3Tm1VV" id="2VtRX2IRywx" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IRywy" role="2AJF6D">
      <ref role="2AI5Lk" to="uepr:~RestController" resolve="RestController" />
    </node>
    <node concept="2AHcQZ" id="2VtRX2IRywz" role="2AJF6D">
      <ref role="2AI5Lk" to="uepr:~RequestMapping" resolve="RequestMapping" />
      <node concept="2B6LJw" id="2VtRX2IRyw$" role="2B76xF">
        <ref role="2B6OnR" to="uepr:~RequestMapping.value()" resolve="value" />
        <node concept="Xl_RD" id="2VtRX2IRyw_" role="2B70Vg">
          <property role="Xl_RC" value="/api" />
        </node>
      </node>
    </node>
    <node concept="3uibUv" id="2VtRX2IRywA" role="1zkMxy">
      <ref role="3uigEE" node="2VtRX2IRzox" resolve="GeneratedFeedbackController" />
    </node>
    <node concept="3clFbW" id="2VtRX2IRywB" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IRywC" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IRywD" role="3clF46">
        <property role="TrG5h" value="feedbackService" />
        <node concept="3uibUv" id="2VtRX2IRywE" role="1tU5fm">
          <ref role="3uigEE" node="2VtRX2IR202" resolve="FeedbackService" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRywF" role="3clF47">
        <node concept="XkiVB" id="2VtRX2IWpmw" role="3cqZAp">
          <ref role="37wK5l" node="2VtRX2IRzoB" resolve="GeneratedFeedbackController" />
          <node concept="37vLTw" id="2VtRX2IWpmx" role="37wK5m">
            <ref role="3cqZAo" node="2VtRX2IRywD" resolve="feedbackService" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRywI" role="1B3o_S" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IRyU8">
    <property role="TrG5h" value="GeneratedResourceController" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="web.generated" />
    <node concept="3Tm1VV" id="2VtRX2IRyU9" role="1B3o_S" />
    <node concept="312cEg" id="2VtRX2IRyUa" role="jymVt">
      <property role="TrG5h" value="resourceService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IRyUc" role="1tU5fm">
        <ref role="3uigEE" node="2VtRX2IQYXX" resolve="ResourceService" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IRyUd" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2VtRX2IRyUe" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IRyUf" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IRyUg" role="3clF46">
        <property role="TrG5h" value="resourceService" />
        <node concept="3uibUv" id="2VtRX2IRyUh" role="1tU5fm">
          <ref role="3uigEE" node="2VtRX2IQYXX" resolve="ResourceService" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRyUi" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRyUj" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IRyUk" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IRyUl" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IRyUm" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IRyUn" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IRyUa" resolve="resourceService" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IRyUo" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IRyUg" resolve="resourceService" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2IRyUp" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2VtRX2IRyUq" role="jymVt">
      <property role="TrG5h" value="listResources" />
      <node concept="2AHcQZ" id="2VtRX2IRyUr" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~GetMapping" resolve="GetMapping" />
        <node concept="2B6LJw" id="2VtRX2IRyUs" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~GetMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRyUt" role="2B70Vg">
            <property role="Xl_RC" value="route" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRyUu" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRyUv" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IWr08" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IWqit" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRyUa" resolve="resourceService" />
            </node>
            <node concept="liA8E" id="2VtRX2IWr09" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IRiAn" resolve="listResources" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRyUx" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRyUy" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="2VtRX2IRyUz" role="11_B2D">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRyU$" role="jymVt">
      <property role="TrG5h" value="getResource" />
      <node concept="2AHcQZ" id="2VtRX2IRyU_" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~GetMapping" resolve="GetMapping" />
        <node concept="2B6LJw" id="2VtRX2IRyUA" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~GetMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRyUB" role="2B70Vg">
            <property role="Xl_RC" value="route/{id}" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRyUC" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="2AHcQZ" id="2VtRX2IRyUD" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~PathVariable" resolve="PathVariable" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRyUE" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRyUF" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRyUG" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IWqOe" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IWqim" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRyUa" resolve="resourceService" />
            </node>
            <node concept="liA8E" id="2VtRX2IWqOf" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IRiAu" resolve="getResource" />
              <node concept="37vLTw" id="2VtRX2IWqOg" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRyUC" resolve="id" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRyUJ" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRyUK" role="3clF45">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRyUL" role="jymVt">
      <property role="TrG5h" value="createResource" />
      <node concept="2AHcQZ" id="2VtRX2IRyUM" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~PostMapping" resolve="PostMapping" />
        <node concept="2B6LJw" id="2VtRX2IRyUN" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~PostMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRyUO" role="2B70Vg">
            <property role="Xl_RC" value="route" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRyUP" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="2AHcQZ" id="2VtRX2IRyUQ" role="2AJF6D">
          <ref role="2AI5Lk" to="c5f9:~Valid" resolve="Valid" />
        </node>
        <node concept="2AHcQZ" id="2VtRX2IRyUR" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~RequestBody" resolve="RequestBody" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRyUS" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRyUT" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRyUU" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IWr8t" role="3cqZAk">
            <node concept="2YIFZM" id="2VtRX2IWqiF" role="2Oq$k0">
              <ref role="1Pybhc" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
              <ref role="37wK5l" to="qd1r:~ResponseEntity.status(org.springframework.http.HttpStatusCode)" resolve="status" />
              <node concept="Rm8GO" id="2VtRX2IWqiG" role="37wK5m">
                <ref role="1Px2BO" to="qd1r:~HttpStatus" resolve="HttpStatus" />
                <ref role="Rm8GQ" to="qd1r:~HttpStatus.CREATED" resolve="CREATED" />
              </node>
            </node>
            <node concept="liA8E" id="2VtRX2IWr8u" role="2OqNvi">
              <ref role="37wK5l" to="qd1r:~ResponseEntity$BodyBuilder.body(java.lang.Object)" resolve="body" />
              <node concept="2OqwBi" id="2VtRX2IWr_H" role="37wK5m">
                <node concept="37vLTw" id="2VtRX2IWr8w" role="2Oq$k0">
                  <ref role="3cqZAo" node="2VtRX2IRyUa" resolve="resourceService" />
                </node>
                <node concept="liA8E" id="2VtRX2IWr_I" role="2OqNvi">
                  <ref role="37wK5l" node="2VtRX2IRiAJ" resolve="createResource" />
                  <node concept="37vLTw" id="2VtRX2IWr_J" role="37wK5m">
                    <ref role="3cqZAo" node="2VtRX2IRyUP" resolve="request" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRyV0" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRyV1" role="3clF45">
        <ref role="3uigEE" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
        <node concept="3uibUv" id="2VtRX2IRyV2" role="11_B2D">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRyV3" role="jymVt">
      <property role="TrG5h" value="updateResource" />
      <node concept="2AHcQZ" id="2VtRX2IRyV4" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~PutMapping" resolve="PutMapping" />
        <node concept="2B6LJw" id="2VtRX2IRyV5" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~PutMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRyV6" role="2B70Vg">
            <property role="Xl_RC" value="route/{id}" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRyV7" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="2AHcQZ" id="2VtRX2IRyV8" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~PathVariable" resolve="PathVariable" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRyV9" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRyVa" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="2AHcQZ" id="2VtRX2IRyVb" role="2AJF6D">
          <ref role="2AI5Lk" to="c5f9:~Valid" resolve="Valid" />
        </node>
        <node concept="2AHcQZ" id="2VtRX2IRyVc" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~RequestBody" resolve="RequestBody" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRyVd" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRyVe" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRyVf" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IWrgH" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IWqiz" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRyUa" resolve="resourceService" />
            </node>
            <node concept="liA8E" id="2VtRX2IWrgI" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IRiAT" resolve="updateResource" />
              <node concept="37vLTw" id="2VtRX2IWrgJ" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRyV7" resolve="id" />
              </node>
              <node concept="37vLTw" id="2VtRX2IWrgK" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRyVa" resolve="request" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRyVj" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRyVk" role="3clF45">
        <ref role="3uigEE" node="5thN_UOOmch" resolve="Resource" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRyVl" role="jymVt">
      <property role="TrG5h" value="deleteResource" />
      <node concept="2AHcQZ" id="2VtRX2IRyVm" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~DeleteMapping" resolve="DeleteMapping" />
        <node concept="2B6LJw" id="2VtRX2IRyVn" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~DeleteMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRyVo" role="2B70Vg">
            <property role="Xl_RC" value="route/{id}" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRyVp" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="2AHcQZ" id="2VtRX2IRyVq" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~PathVariable" resolve="PathVariable" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRyVr" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRyVs" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRyVt" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IWqRR" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IWqi5" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRyUa" resolve="resourceService" />
            </node>
            <node concept="liA8E" id="2VtRX2IWqRS" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IRiBa" resolve="deleteResource" />
              <node concept="37vLTw" id="2VtRX2IWqRT" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRyVp" resolve="id" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2IRyVw" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IWqVM" role="3cqZAk">
            <node concept="2YIFZM" id="2VtRX2IWqhi" role="2Oq$k0">
              <ref role="1Pybhc" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
              <ref role="37wK5l" to="qd1r:~ResponseEntity.noContent()" resolve="noContent" />
            </node>
            <node concept="liA8E" id="2VtRX2IWqVN" role="2OqNvi">
              <ref role="37wK5l" to="qd1r:~ResponseEntity$HeadersBuilder.build()" resolve="build" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRyVz" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRyV$" role="3clF45">
        <ref role="3uigEE" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
        <node concept="3uibUv" id="2VtRX2IRyV_" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Void" resolve="Void" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IRzox">
    <property role="TrG5h" value="GeneratedFeedbackController" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="web.generated" />
    <node concept="3Tm1VV" id="2VtRX2IRzoy" role="1B3o_S" />
    <node concept="312cEg" id="2VtRX2IRzoz" role="jymVt">
      <property role="TrG5h" value="feedbackService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IRzo_" role="1tU5fm">
        <ref role="3uigEE" node="2VtRX2IR202" resolve="FeedbackService" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IRzoA" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2VtRX2IRzoB" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IRzoC" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IRzoD" role="3clF46">
        <property role="TrG5h" value="feedbackService" />
        <node concept="3uibUv" id="2VtRX2IRzoE" role="1tU5fm">
          <ref role="3uigEE" node="2VtRX2IR202" resolve="FeedbackService" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRzoF" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRzoG" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IRzoH" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IRzoI" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IRzoJ" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IRzoK" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IRzoz" resolve="feedbackService" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IRzoL" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IRzoD" resolve="feedbackService" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2IRzoM" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2VtRX2IRzoN" role="jymVt">
      <property role="TrG5h" value="listFeedbacks" />
      <node concept="2AHcQZ" id="2VtRX2IRzoO" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~GetMapping" resolve="GetMapping" />
        <node concept="2B6LJw" id="2VtRX2IRzoP" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~GetMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRzoQ" role="2B70Vg">
            <property role="Xl_RC" value="route" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRzoR" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRzoS" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IR$Pn" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IR$fo" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRzoz" resolve="feedbackService" />
            </node>
            <node concept="liA8E" id="2VtRX2IR$Po" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IR31V" resolve="listFeedbacks" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRzoU" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRzoV" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="2VtRX2IRzoW" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRzoX" role="jymVt">
      <property role="TrG5h" value="getFeedback" />
      <node concept="2AHcQZ" id="2VtRX2IRzoY" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~GetMapping" resolve="GetMapping" />
        <node concept="2B6LJw" id="2VtRX2IRzoZ" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~GetMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRzp0" role="2B70Vg">
            <property role="Xl_RC" value="route/{id}" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRzp1" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="2AHcQZ" id="2VtRX2IRzp2" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~PathVariable" resolve="PathVariable" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRzp3" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRzp4" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRzp5" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IR_CO" role="3cqZAk">
            <node concept="37vLTw" id="2VtRX2IR$dT" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRzoz" resolve="feedbackService" />
            </node>
            <node concept="liA8E" id="2VtRX2IR_CP" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IR322" resolve="getFeedback" />
              <node concept="37vLTw" id="2VtRX2IR_CQ" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRzp1" resolve="id" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRzp8" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRzp9" role="3clF45">
        <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRzpa" role="jymVt">
      <property role="TrG5h" value="createFeedback" />
      <node concept="2AHcQZ" id="2VtRX2IRzpb" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~PostMapping" resolve="PostMapping" />
        <node concept="2B6LJw" id="2VtRX2IRzpc" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~PostMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRzpd" role="2B70Vg">
            <property role="Xl_RC" value="route" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRzpe" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="2AHcQZ" id="2VtRX2IRzpf" role="2AJF6D">
          <ref role="2AI5Lk" to="c5f9:~Valid" resolve="Valid" />
        </node>
        <node concept="2AHcQZ" id="2VtRX2IRzpg" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~RequestBody" resolve="RequestBody" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRzph" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRzpi" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRzpj" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRAqJ" role="3cqZAk">
            <node concept="2YIFZM" id="2VtRX2IR$e0" role="2Oq$k0">
              <ref role="1Pybhc" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
              <ref role="37wK5l" to="qd1r:~ResponseEntity.status(org.springframework.http.HttpStatusCode)" resolve="status" />
              <node concept="Rm8GO" id="2VtRX2IR$VL" role="37wK5m">
                <ref role="1Px2BO" to="qd1r:~HttpStatus" resolve="HttpStatus" />
                <ref role="Rm8GQ" to="qd1r:~HttpStatus.CREATED" resolve="CREATED" />
              </node>
            </node>
            <node concept="liA8E" id="2VtRX2IRAqK" role="2OqNvi">
              <ref role="37wK5l" to="qd1r:~ResponseEntity$BodyBuilder.body(java.lang.Object)" resolve="body" />
              <node concept="2OqwBi" id="2VtRX2IRAqL" role="37wK5m">
                <node concept="37vLTw" id="2VtRX2IRAqM" role="2Oq$k0">
                  <ref role="3cqZAo" node="2VtRX2IRzoz" resolve="feedbackService" />
                </node>
                <node concept="liA8E" id="2VtRX2IRAqN" role="2OqNvi">
                  <ref role="37wK5l" node="2VtRX2IR32j" resolve="createFeedback" />
                  <node concept="37vLTw" id="2VtRX2IRAqO" role="37wK5m">
                    <ref role="3cqZAo" node="2VtRX2IRzpe" resolve="request" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRzpp" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRzpq" role="3clF45">
        <ref role="3uigEE" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
        <node concept="3uibUv" id="2VtRX2IRzpr" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4QEw" resolve="Feedback" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRzps" role="jymVt">
      <property role="TrG5h" value="deleteFeedback" />
      <node concept="2AHcQZ" id="2VtRX2IRzpt" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~DeleteMapping" resolve="DeleteMapping" />
        <node concept="2B6LJw" id="2VtRX2IRzpu" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~DeleteMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRzpv" role="2B70Vg">
            <property role="Xl_RC" value="route/{id}" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRzpw" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="2AHcQZ" id="2VtRX2IRzpx" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~PathVariable" resolve="PathVariable" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRzpy" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~Long" resolve="Long" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRzpz" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRzp$" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IR_Jh" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IR$fu" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IRzoz" resolve="feedbackService" />
            </node>
            <node concept="liA8E" id="2VtRX2IR_Ji" role="2OqNvi">
              <ref role="37wK5l" node="2VtRX2IR32t" resolve="deleteFeedback" />
              <node concept="37vLTw" id="2VtRX2IR_Jj" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IRzpw" resolve="id" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2IRzpB" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IR$UX" role="3cqZAk">
            <node concept="2YIFZM" id="2VtRX2IR$d6" role="2Oq$k0">
              <ref role="1Pybhc" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
              <ref role="37wK5l" to="qd1r:~ResponseEntity.noContent()" resolve="noContent" />
            </node>
            <node concept="liA8E" id="2VtRX2IR$UY" role="2OqNvi">
              <ref role="37wK5l" to="qd1r:~ResponseEntity$HeadersBuilder.build()" resolve="build" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRzpE" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRzpF" role="3clF45">
        <ref role="3uigEE" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
        <node concept="3uibUv" id="2VtRX2IRzpG" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Void" resolve="Void" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IRBGj">
    <property role="TrG5h" value="GeneratedAuthenticationController" />
    <property role="1sVAO0" value="true" />
    <property role="3GE5qa" value="web.generated" />
    <node concept="3Tm1VV" id="2VtRX2IRBGk" role="1B3o_S" />
    <node concept="312cEg" id="2VtRX2IRBGl" role="jymVt">
      <property role="TrG5h" value="authenticationService" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IRBGn" role="1tU5fm">
        <ref role="3uigEE" node="6Hrz6izDtmU" resolve="AuthenticationService" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IRBGo" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2VtRX2IRBGp" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IRBGq" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IRBGr" role="3clF46">
        <property role="TrG5h" value="authenticationService" />
        <node concept="3uibUv" id="2VtRX2IRBGs" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6izDtmU" resolve="AuthenticationService" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRBGt" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IRBGu" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IRBGv" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IRBGw" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IRBGx" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IRBGy" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IRBGl" resolve="authenticationService" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IRBGz" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IRBGr" resolve="authenticationService" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2IRBG$" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2VtRX2IRBG_" role="jymVt">
      <property role="TrG5h" value="register" />
      <node concept="2AHcQZ" id="2VtRX2IRBGA" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~PostMapping" resolve="PostMapping" />
        <node concept="2B6LJw" id="2VtRX2IRBGB" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~PostMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRBGC" role="2B70Vg">
            <property role="Xl_RC" value="/register" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRBGD" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="2AHcQZ" id="2VtRX2IRBGE" role="2AJF6D">
          <ref role="2AI5Lk" to="c5f9:~Valid" resolve="Valid" />
        </node>
        <node concept="2AHcQZ" id="2VtRX2IRBGF" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~RequestBody" resolve="RequestBody" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRBGG" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRBGH" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRBGI" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IRD7x" role="3cqZAk">
            <node concept="2YIFZM" id="2VtRX2IRC9E" role="2Oq$k0">
              <ref role="1Pybhc" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
              <ref role="37wK5l" to="qd1r:~ResponseEntity.status(org.springframework.http.HttpStatusCode)" resolve="status" />
              <node concept="Rm8GO" id="2VtRX2IRCub" role="37wK5m">
                <ref role="1Px2BO" to="qd1r:~HttpStatus" resolve="HttpStatus" />
                <ref role="Rm8GQ" to="qd1r:~HttpStatus.CREATED" resolve="CREATED" />
              </node>
            </node>
            <node concept="liA8E" id="2VtRX2IRD7y" role="2OqNvi">
              <ref role="37wK5l" to="qd1r:~ResponseEntity$BodyBuilder.body(java.lang.Object)" resolve="body" />
              <node concept="2OqwBi" id="2VtRX2IRD7z" role="37wK5m">
                <node concept="37vLTw" id="2VtRX2IRD7$" role="2Oq$k0">
                  <ref role="3cqZAo" node="2VtRX2IRBGl" resolve="authenticationService" />
                </node>
                <node concept="liA8E" id="2VtRX2IRD7_" role="2OqNvi">
                  <ref role="37wK5l" node="6Hrz6izDHdn" resolve="register" />
                  <node concept="37vLTw" id="2VtRX2IRD7A" role="37wK5m">
                    <ref role="3cqZAo" node="2VtRX2IRBGD" resolve="request" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRBGO" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRBGP" role="3clF45">
        <ref role="3uigEE" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
        <node concept="3uibUv" id="2VtRX2IRBGQ" role="11_B2D">
          <ref role="3uigEE" node="6Hrz6izDJA7" resolve="AuthenticationResult" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IRBGR" role="jymVt">
      <property role="TrG5h" value="login" />
      <node concept="2AHcQZ" id="2VtRX2IRBGS" role="2AJF6D">
        <ref role="2AI5Lk" to="uepr:~PostMapping" resolve="PostMapping" />
        <node concept="2B6LJw" id="2VtRX2IRBGT" role="2B76xF">
          <ref role="2B6OnR" to="uepr:~PostMapping.value()" resolve="value" />
          <node concept="Xl_RD" id="2VtRX2IRBGU" role="2B70Vg">
            <property role="Xl_RC" value="/login" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IRBGV" role="3clF46">
        <property role="TrG5h" value="request" />
        <node concept="2AHcQZ" id="2VtRX2IRBGW" role="2AJF6D">
          <ref role="2AI5Lk" to="c5f9:~Valid" resolve="Valid" />
        </node>
        <node concept="2AHcQZ" id="2VtRX2IRBGX" role="2AJF6D">
          <ref role="2AI5Lk" to="uepr:~RequestBody" resolve="RequestBody" />
        </node>
        <node concept="3uibUv" id="2VtRX2IRBGY" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IRBGZ" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IRBH0" role="3cqZAp">
          <node concept="2YIFZM" id="2VtRX2IRCb2" role="3cqZAk">
            <ref role="1Pybhc" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
            <ref role="37wK5l" to="qd1r:~ResponseEntity.ok(java.lang.Object)" resolve="ok" />
            <node concept="2OqwBi" id="2VtRX2IRD4s" role="37wK5m">
              <node concept="37vLTw" id="2VtRX2IRCsQ" role="2Oq$k0">
                <ref role="3cqZAo" node="2VtRX2IRBGl" resolve="authenticationService" />
              </node>
              <node concept="liA8E" id="2VtRX2IRD4t" role="2OqNvi">
                <ref role="37wK5l" node="6Hrz6izDHe7" resolve="login" />
                <node concept="37vLTw" id="2VtRX2IRD4u" role="37wK5m">
                  <ref role="3cqZAo" node="2VtRX2IRBGV" resolve="request" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2IRBH4" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2IRBH5" role="3clF45">
        <ref role="3uigEE" to="qd1r:~ResponseEntity" resolve="ResponseEntity" />
        <node concept="3uibUv" id="2VtRX2IRBH6" role="11_B2D">
          <ref role="3uigEE" node="6Hrz6izDJA7" resolve="AuthenticationResult" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IS3j8">
    <property role="TrG5h" value="InitialDataConfiguration" />
    <property role="3GE5qa" value="config" />
    <node concept="3Tm1VV" id="2VtRX2IS3j9" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IS3ja" role="2AJF6D">
      <ref role="2AI5Lk" to="1wnp:~Configuration" resolve="Configuration" />
    </node>
    <node concept="3clFb_" id="2VtRX2IS3jb" role="jymVt">
      <property role="TrG5h" value="seedDslUsers" />
      <node concept="2AHcQZ" id="2VtRX2IS3jc" role="2AJF6D">
        <ref role="2AI5Lk" to="1wnp:~Bean" resolve="Bean" />
      </node>
      <node concept="37vLTG" id="2VtRX2IS3jd" role="3clF46">
        <property role="TrG5h" value="userRepository" />
        <node concept="3uibUv" id="2VtRX2IS3je" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IS3jf" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="2VtRX2IS3jg" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IS3jh" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2IS3ji" role="3cqZAp">
          <node concept="1bVj0M" id="2VtRX2IS3jj" role="3cqZAk">
            <node concept="37vLTG" id="2VtRX2IS3jk" role="1bW2Oz">
              <property role="TrG5h" value="args" />
              <node concept="3VYd8j" id="2VtRX2IS3jl" role="1tU5fm" />
            </node>
            <node concept="3clFbS" id="2VtRX2IS3jo" role="1bW5cS">
              <node concept="9aQIb" id="2VtRX2IS3jm" role="3cqZAp">
                <node concept="3clFbS" id="2VtRX2IS3jn" role="9aQI4">
                  <node concept="3clFbF" id="2VtRX2IS8o_" role="3cqZAp">
                    <node concept="1rXfSq" id="2VtRX2IS8oz" role="3clFbG">
                      <ref role="37wK5l" node="2VtRX2IS3jq" resolve="seedUser" />
                      <node concept="37vLTw" id="2VtRX2IS8V1" role="37wK5m">
                        <ref role="3cqZAo" node="2VtRX2IS3jd" resolve="userRepository" />
                      </node>
                      <node concept="37vLTw" id="2VtRX2IS9zl" role="37wK5m">
                        <ref role="3cqZAo" node="2VtRX2IS3jf" resolve="passwordEncoder" />
                      </node>
                      <node concept="Xl_RD" id="2VtRX2ISa8V" role="37wK5m">
                        <property role="Xl_RC" value="seedUsername" />
                        <node concept="17Uvod" id="2VtRX2ISoL6" role="lGtFl">
                          <property role="2qtEX9" value="value" />
                          <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
                          <node concept="3zFVjK" id="2VtRX2ISoL7" role="3zH0cK">
                            <node concept="3clFbS" id="2VtRX2ISoL8" role="2VODD2">
                              <node concept="3clFbF" id="2VtRX2ISpzj" role="3cqZAp">
                                <node concept="2OqwBi" id="2VtRX2ISq9H" role="3clFbG">
                                  <node concept="30H73N" id="2VtRX2ISpzi" role="2Oq$k0" />
                                  <node concept="3TrcHB" id="2VtRX2ISuZ4" role="2OqNvi">
                                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rm8GO" id="2VtRX2ISd0b" role="37wK5m">
                        <ref role="Rm8GQ" node="6Hrz6iyYgbq" resolve="GENERIC" />
                        <ref role="1Px2BO" node="6Hrz6iyYgbn" resolve="UserKind" />
                        <node concept="1ZhdrF" id="2VtRX2ISYYF" role="lGtFl">
                          <property role="2qtEX8" value="enumConstantDeclaration" />
                          <property role="P3scX" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1083260308424/1083260308426" />
                          <node concept="3$xsQk" id="2VtRX2ISYYG" role="3$ytzL">
                            <node concept="3clFbS" id="2VtRX2ISYYH" role="2VODD2">
                              <node concept="3cpWs6" id="2VtRX2ISZLx" role="3cqZAp">
                                <node concept="2OqwBi" id="2VtRX2ITclC" role="3cqZAk">
                                  <node concept="2OqwBi" id="2VtRX2IT1Nd" role="2Oq$k0">
                                    <node concept="30H73N" id="2VtRX2IT13v" role="2Oq$k0" />
                                    <node concept="3TrcHB" id="2VtRX2IT50x" role="2OqNvi">
                                      <ref role="3TsBF5" to="2rvu:7vG6G7pGwn2" resolve="kind" />
                                    </node>
                                  </node>
                                  <node concept="liA8E" id="2VtRX2ITdFf" role="2OqNvi">
                                    <ref role="37wK5l" to="wyt6:~Object.toString()" resolve="toString" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="1WS0z7" id="2VtRX2ISo0R" role="lGtFl">
                      <node concept="3JmXsc" id="2VtRX2ISo0U" role="3Jn$fo">
                        <node concept="3clFbS" id="2VtRX2ISo0V" role="2VODD2">
                          <node concept="3clFbF" id="2VtRX2ISo11" role="3cqZAp">
                            <node concept="2OqwBi" id="2VtRX2ISo0W" role="3clFbG">
                              <node concept="3Tsc0h" id="2VtRX2ISo0Z" role="2OqNvi">
                                <ref role="3TtcxE" to="2rvu:47EFX_mxMIt" resolve="userType" />
                              </node>
                              <node concept="30H73N" id="2VtRX2ISo10" role="2Oq$k0" />
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
      <node concept="3uibUv" id="2VtRX2IS3jp" role="3clF45">
        <ref role="3uigEE" to="mfax:~ApplicationRunner" resolve="ApplicationRunner" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2IS3jq" role="jymVt">
      <property role="TrG5h" value="seedUser" />
      <node concept="37vLTG" id="2VtRX2IS3jr" role="3clF46">
        <property role="TrG5h" value="userRepository" />
        <node concept="3uibUv" id="2VtRX2IS3js" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyZ1eh" resolve="UserRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IS3jt" role="3clF46">
        <property role="TrG5h" value="passwordEncoder" />
        <node concept="3uibUv" id="2VtRX2IS3ju" role="1tU5fm">
          <ref role="3uigEE" to="f75t:~PasswordEncoder" resolve="PasswordEncoder" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IS3jv" role="3clF46">
        <property role="TrG5h" value="username" />
        <node concept="3uibUv" id="2VtRX2IS3jw" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IS3jx" role="3clF46">
        <property role="TrG5h" value="kind" />
        <node concept="3uibUv" id="2VtRX2IS3jy" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYgbn" resolve="UserKind" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IS3jz" role="3clF47">
        <node concept="3clFbJ" id="2VtRX2IS3j$" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IS41O" role="3clFbw">
            <node concept="37vLTw" id="2VtRX2IS3QT" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IS3jr" resolve="userRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IS41P" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyZ1Pj" resolve="existsByUsername" />
              <node concept="37vLTw" id="2VtRX2IS41Q" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IS3jv" resolve="username" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="2VtRX2IS3jC" role="3clFbx">
            <node concept="3cpWs6" id="2VtRX2IS3jD" role="3cqZAp" />
          </node>
        </node>
        <node concept="3cpWs8" id="2VtRX2IS3jF" role="3cqZAp">
          <node concept="3cpWsn" id="2VtRX2IS3jE" role="3cpWs9">
            <property role="TrG5h" value="user" />
            <node concept="3uibUv" id="2VtRX2IS3jG" role="1tU5fm">
              <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
            </node>
            <node concept="2ShNRf" id="2VtRX2IS3R7" role="33vP2m">
              <node concept="HV5vD" id="2VtRX2IS3Ra" role="2ShVmc">
                <ref role="HV5vE" node="2BbHItVhBaX" resolve="User" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2VtRX2IS3jI" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IS3Z0" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IS3QY" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IS3jE" resolve="user" />
            </node>
            <node concept="liA8E" id="2VtRX2IS3Z1" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyYHZT" resolve="setUsername" />
              <node concept="37vLTw" id="2VtRX2IS3Z2" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IS3jv" resolve="username" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2VtRX2IS3jL" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IS44a" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IS3R3" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IS3jE" resolve="user" />
            </node>
            <node concept="liA8E" id="2VtRX2IS44b" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyYI0b" resolve="setPassword" />
              <node concept="2OqwBi" id="2VtRX2IS4oE" role="37wK5m">
                <node concept="37vLTw" id="2VtRX2IS44d" role="2Oq$k0">
                  <ref role="3cqZAo" node="2VtRX2IS3jt" resolve="passwordEncoder" />
                </node>
                <node concept="liA8E" id="2VtRX2IS4oF" role="2OqNvi">
                  <ref role="37wK5l" to="f75t:~PasswordEncoder.encode(java.lang.CharSequence)" resolve="encode" />
                  <node concept="37vLTw" id="2VtRX2IS4oG" role="37wK5m">
                    <ref role="3cqZAo" node="2VtRX2IS3jv" resolve="username" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2VtRX2IS3jP" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IS7hT" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IS3Rd" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IS3jE" resolve="user" />
            </node>
            <node concept="liA8E" id="2VtRX2IS7hU" role="2OqNvi">
              <ref role="37wK5l" node="6Hrz6iyYXOW" resolve="setRole" />
              <node concept="37vLTw" id="2VtRX2IS7hV" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IS3jx" resolve="kind" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2VtRX2IS3jS" role="3cqZAp">
          <node concept="2OqwBi" id="2VtRX2IS47L" role="3clFbG">
            <node concept="37vLTw" id="2VtRX2IS3Ri" role="2Oq$k0">
              <ref role="3cqZAo" node="2VtRX2IS3jr" resolve="userRepository" />
            </node>
            <node concept="liA8E" id="2VtRX2IS47M" role="2OqNvi">
              <ref role="37wK5l" to="5okn:~CrudRepository.save(java.lang.Object)" resolve="save" />
              <node concept="37vLTw" id="2VtRX2IS47N" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2IS3jE" resolve="user" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2VtRX2IS3jV" role="1B3o_S" />
      <node concept="3cqZAl" id="2VtRX2IS3jW" role="3clF45" />
    </node>
    <node concept="n94m4" id="2VtRX2ISnp_" role="lGtFl">
      <ref role="n9lRv" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    </node>
  </node>
  <node concept="312cEu" id="2VtRX2IThZ6">
    <property role="TrG5h" value="GeneratedModerationService" />
    <property role="1sVAO0" value="true" />
    <node concept="3Tm1VV" id="2VtRX2IThZ7" role="1B3o_S" />
    <node concept="2AHcQZ" id="2VtRX2IThZ8" role="2AJF6D">
      <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      <node concept="2B6LJw" id="2VtRX2IThZ9" role="2B76xF">
        <ref role="2B6OnR" to="u35y:~Transactional.readOnly()" resolve="readOnly" />
        <node concept="3clFbT" id="2VtRX2IThZa" role="2B70Vg">
          <property role="3clFbU" value="true" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="2VtRX2IThZb" role="jymVt">
      <property role="TrG5h" value="moderationPolicyRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IThZd" role="1tU5fm">
        <ref role="3uigEE" to=":^" resolve="ModerationPolicyRepository" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IThZe" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="2VtRX2IThZf" role="jymVt">
      <property role="TrG5h" value="authorizationRuleRepository" />
      <property role="3TUv4t" value="true" />
      <node concept="3uibUv" id="2VtRX2IThZh" role="1tU5fm">
        <ref role="3uigEE" to=":^" resolve="AuthorizationRuleRepository" />
      </node>
      <node concept="3Tm6S6" id="2VtRX2IThZi" role="1B3o_S" />
    </node>
    <node concept="3clFbW" id="2VtRX2IThZj" role="jymVt">
      <node concept="3cqZAl" id="2VtRX2IThZk" role="3clF45" />
      <node concept="37vLTG" id="2VtRX2IThZl" role="3clF46">
        <property role="TrG5h" value="moderationPolicyRepository" />
        <node concept="3uibUv" id="2VtRX2IThZm" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="ModerationPolicyRepository" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IThZn" role="3clF46">
        <property role="TrG5h" value="authorizationRuleRepository" />
        <node concept="3uibUv" id="2VtRX2IThZo" role="1tU5fm">
          <ref role="3uigEE" to=":^" resolve="AuthorizationRuleRepository" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IThZp" role="3clF47">
        <node concept="3clFbF" id="2VtRX2IThZq" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IThZr" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IThZs" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IThZt" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IThZu" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IThZb" resolve="moderationPolicyRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IThZv" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IThZl" resolve="moderationPolicyRepository" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2VtRX2IThZw" role="3cqZAp">
          <node concept="37vLTI" id="2VtRX2IThZx" role="3clFbG">
            <node concept="2OqwBi" id="2VtRX2IThZy" role="37vLTJ">
              <node concept="Xjq3P" id="2VtRX2IThZz" role="2Oq$k0" />
              <node concept="2OwXpG" id="2VtRX2IThZ$" role="2OqNvi">
                <ref role="2Oxat5" node="2VtRX2IThZf" resolve="authorizationRuleRepository" />
              </node>
            </node>
            <node concept="37vLTw" id="2VtRX2IThZ_" role="37vLTx">
              <ref role="3cqZAo" node="2VtRX2IThZn" resolve="authorizationRuleRepository" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2IThZA" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2VtRX2IThZB" role="jymVt">
      <property role="TrG5h" value="canModerate" />
      <node concept="37vLTG" id="2VtRX2IThZC" role="3clF46">
        <property role="TrG5h" value="user" />
        <node concept="3uibUv" id="2VtRX2IThZD" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IThZE" role="3clF46">
        <property role="TrG5h" value="resourceTarget" />
        <node concept="3uibUv" id="2VtRX2IThZF" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2IThZG" role="3clF46">
        <property role="TrG5h" value="feedbackTarget" />
        <node concept="3uibUv" id="2VtRX2IThZH" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2IThZI" role="3clF47">
        <node concept="3clFbJ" id="2VtRX2IThZJ" role="3cqZAp">
          <node concept="22lmx$" id="2VtRX2IThZK" role="3clFbw">
            <node concept="3clFbC" id="2VtRX2IThZL" role="3uHU7B">
              <node concept="37vLTw" id="2VtRX2IThZM" role="3uHU7B">
                <ref role="3cqZAo" node="2VtRX2IThZC" resolve="user" />
              </node>
              <node concept="10Nm6u" id="2VtRX2IThZN" role="3uHU7w" />
            </node>
            <node concept="3clFbC" id="2VtRX2IThZO" role="3uHU7w">
              <node concept="Wc6QR" id="2VtRX2IThZP" role="3uHU7B">
                <property role="10XrrR" value="getKind" />
                <property role="1CJj6V" value="user" />
              </node>
              <node concept="10Nm6u" id="2VtRX2IThZQ" role="3uHU7w" />
            </node>
          </node>
          <node concept="3clFbS" id="2VtRX2IThZS" role="3clFbx">
            <node concept="3cpWs6" id="2VtRX2IThZT" role="3cqZAp">
              <node concept="3clFbT" id="2VtRX2IThZU" role="3cqZAk" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2IThZV" role="3cqZAp">
          <node concept="35GP8o" id="2VtRX2IThZW" role="3cqZAk">
            <property role="10XrrR" value="anyMatch" />
            <node concept="35GP8o" id="2VtRX2IThZX" role="35GOzl">
              <property role="10XrrR" value="stream" />
              <node concept="Wc6QR" id="2VtRX2IThZY" role="35GOzl">
                <property role="10XrrR" value="findAll" />
                <property role="1CJj6V" value="authorizationRuleRepository" />
              </node>
            </node>
            <node concept="1bVj0M" id="2VtRX2IThZZ" role="37wK5m">
              <node concept="37vLTG" id="2VtRX2ITi00" role="1bW2Oz">
                <property role="TrG5h" value="rule" />
                <node concept="3VYd8j" id="2VtRX2ITi01" role="1tU5fm" />
              </node>
              <node concept="3clFbS" id="2VtRX2ITi08" role="1bW5cS">
                <node concept="3clFbF" id="2VtRX2ITi02" role="3cqZAp">
                  <node concept="1rXfSq" id="2VtRX2ITi03" role="3clFbG">
                    <ref role="37wK5l" node="2VtRX2ITi13" resolve="grantsModeration" />
                    <node concept="37vLTw" id="2VtRX2ITi04" role="37wK5m">
                      <ref role="3cqZAo" node="2VtRX2ITi00" resolve="rule" />
                    </node>
                    <node concept="37vLTw" id="2VtRX2ITi05" role="37wK5m">
                      <ref role="3cqZAo" node="2VtRX2IThZC" resolve="user" />
                    </node>
                    <node concept="37vLTw" id="2VtRX2ITi06" role="37wK5m">
                      <ref role="3cqZAo" node="2VtRX2IThZE" resolve="resourceTarget" />
                    </node>
                    <node concept="37vLTw" id="2VtRX2ITi07" role="37wK5m">
                      <ref role="3cqZAo" node="2VtRX2IThZG" resolve="feedbackTarget" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2ITi09" role="1B3o_S" />
      <node concept="10P_77" id="2VtRX2ITi0a" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi0b" role="jymVt">
      <property role="TrG5h" value="moderate" />
      <node concept="2AHcQZ" id="2VtRX2ITi0c" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="37vLTG" id="2VtRX2ITi0d" role="3clF46">
        <property role="TrG5h" value="moderator" />
        <node concept="3uibUv" id="2VtRX2ITi0e" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi0f" role="3clF46">
        <property role="TrG5h" value="resourceTarget" />
        <node concept="3uibUv" id="2VtRX2ITi0g" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi0h" role="3clF46">
        <property role="TrG5h" value="feedbackTarget" />
        <node concept="3uibUv" id="2VtRX2ITi0i" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi0j" role="3clF46">
        <property role="TrG5h" value="decision" />
        <node concept="3uibUv" id="2VtRX2ITi0k" role="1tU5fm">
          <ref role="3uigEE" node="6Hrz6iyYEcY" resolve="ModerationDecision" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi0l" role="3clF47">
        <node concept="3clFbF" id="2VtRX2ITi0m" role="3cqZAp">
          <node concept="1rXfSq" id="2VtRX2ITi0n" role="3clFbG">
            <ref role="37wK5l" node="2VtRX2ITi1v" resolve="ensureCanModerate" />
            <node concept="37vLTw" id="2VtRX2ITi0o" role="37wK5m">
              <ref role="3cqZAo" node="2VtRX2ITi0d" resolve="moderator" />
            </node>
            <node concept="37vLTw" id="2VtRX2ITi0p" role="37wK5m">
              <ref role="3cqZAo" node="2VtRX2ITi0f" resolve="resourceTarget" />
            </node>
            <node concept="37vLTw" id="2VtRX2ITi0q" role="37wK5m">
              <ref role="3cqZAo" node="2VtRX2ITi0h" resolve="feedbackTarget" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2VtRX2ITi0r" role="3cqZAp">
          <node concept="3K4zz7" id="2VtRX2ITi0x" role="3cqZAk">
            <node concept="3clFbC" id="2VtRX2ITi0s" role="3K4Cdx">
              <node concept="37vLTw" id="2VtRX2ITi0t" role="3uHU7B">
                <ref role="3cqZAo" node="2VtRX2ITi0j" resolve="decision" />
              </node>
              <node concept="10Nm6u" id="2VtRX2ITi0u" role="3uHU7w" />
            </node>
            <node concept="3yEOSi" id="2VtRX2ITi0v" role="3K4E3e">
              <property role="1CJj6V" value="ModerationDecision.APPROVED" />
            </node>
            <node concept="37vLTw" id="2VtRX2ITi0w" role="3K4GZi">
              <ref role="3cqZAo" node="2VtRX2ITi0j" resolve="decision" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2ITi0y" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2ITi0z" role="3clF45">
        <ref role="3uigEE" node="6Hrz6iyYEcY" resolve="ModerationDecision" />
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2ITi0$" role="jymVt">
      <property role="TrG5h" value="listBackgroundPolicies" />
      <node concept="3clFbS" id="2VtRX2ITi0_" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2ITi0A" role="3cqZAp">
          <node concept="35GP8o" id="2VtRX2ITi0B" role="3cqZAk">
            <property role="10XrrR" value="toList" />
            <node concept="35GP8o" id="2VtRX2ITi0C" role="35GOzl">
              <property role="10XrrR" value="filter" />
              <node concept="35GP8o" id="2VtRX2ITi0D" role="35GOzl">
                <property role="10XrrR" value="stream" />
                <node concept="Wc6QR" id="2VtRX2ITi0E" role="35GOzl">
                  <property role="10XrrR" value="findAll" />
                  <property role="1CJj6V" value="moderationPolicyRepository" />
                </node>
              </node>
              <node concept="2fANLd" id="2VtRX2ITi0F" role="37wK5m">
                <property role="w_Gjt" value="true" />
                <property role="2fAKow" value="isBackgroundPolicy" />
                <node concept="Xjq3P" id="2VtRX2ITi0G" role="wWaWy" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2ITi0H" role="1B3o_S" />
      <node concept="3uibUv" id="2VtRX2ITi0I" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <node concept="3uibUv" id="2VtRX2ITi0J" role="11_B2D">
          <ref role="3uigEE" node="5thN_UR4TUw" resolve="ModerationPolicy" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2VtRX2ITi0K" role="jymVt">
      <property role="TrG5h" value="processModerationPolicies" />
      <node concept="2AHcQZ" id="2VtRX2ITi0L" role="2AJF6D">
        <ref role="2AI5Lk" to="d5sy:~Scheduled" resolve="Scheduled" />
        <node concept="2B6LJw" id="2VtRX2ITi0M" role="2B76xF">
          <ref role="2B6OnR" to="d5sy:~Scheduled.fixedDelayString()" resolve="fixedDelayString" />
          <node concept="Xl_RD" id="2VtRX2ITi0N" role="2B70Vg">
            <property role="Xl_RC" value="${app.moderation.fixed-delay:60000}" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2VtRX2ITi0O" role="2AJF6D">
        <ref role="2AI5Lk" to="u35y:~Transactional" resolve="Transactional" />
      </node>
      <node concept="3clFbS" id="2VtRX2ITi0P" role="3clF47">
        <node concept="3clFbF" id="2VtRX2ITi0Q" role="3cqZAp">
          <node concept="35GP8o" id="2VtRX2ITi0R" role="3clFbG">
            <property role="10XrrR" value="forEach" />
            <node concept="1rXfSq" id="2VtRX2ITi0S" role="35GOzl">
              <ref role="37wK5l" node="2VtRX2ITi0$" resolve="listBackgroundPolicies" />
            </node>
            <node concept="2fANLd" id="2VtRX2ITi0T" role="37wK5m">
              <property role="w_Gjt" value="true" />
              <property role="2fAKow" value="processPolicy" />
              <node concept="Xjq3P" id="2VtRX2ITi0U" role="wWaWy" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2VtRX2ITi0V" role="1B3o_S" />
      <node concept="3cqZAl" id="2VtRX2ITi0W" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi0X" role="jymVt">
      <property role="TrG5h" value="processPolicy" />
      <node concept="37vLTG" id="2VtRX2ITi0Y" role="3clF46">
        <property role="TrG5h" value="policy" />
        <node concept="3uibUv" id="2VtRX2ITi0Z" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4TUw" resolve="ModerationPolicy" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi10" role="3clF47">
        <node concept="3SKdUt" id="2VtRX2ITi2R" role="3cqZAp">
          <node concept="1PaTwC" id="2VtRX2ITi2S" role="1aUNEU">
            <node concept="3oM_SD" id="2VtRX2ITi2U" role="1PaTwD">
              <property role="3oM_SC" value="Extension" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi2V" role="1PaTwD">
              <property role="3oM_SC" value="hook:" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi2W" role="1PaTwD">
              <property role="3oM_SC" value="backend-specific" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi2X" role="1PaTwD">
              <property role="3oM_SC" value="generated/manual" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi2Y" role="1PaTwD">
              <property role="3oM_SC" value="code" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi2Z" role="1PaTwD">
              <property role="3oM_SC" value="can" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi30" role="1PaTwD">
              <property role="3oM_SC" value="apply" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi31" role="1PaTwD">
              <property role="3oM_SC" value="the" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi32" role="1PaTwD">
              <property role="3oM_SC" value="policy" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi33" role="1PaTwD">
              <property role="3oM_SC" value="to" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi34" role="1PaTwD">
              <property role="3oM_SC" value="concrete" />
            </node>
            <node concept="3oM_SD" id="2VtRX2ITi35" role="1PaTwD">
              <property role="3oM_SC" value="resources." />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tmbuc" id="2VtRX2ITi11" role="1B3o_S" />
      <node concept="3cqZAl" id="2VtRX2ITi12" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi13" role="jymVt">
      <property role="TrG5h" value="grantsModeration" />
      <node concept="37vLTG" id="2VtRX2ITi14" role="3clF46">
        <property role="TrG5h" value="rule" />
        <node concept="3uibUv" id="2VtRX2ITi15" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4qaS" resolve="AuthorizationRule" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi16" role="3clF46">
        <property role="TrG5h" value="user" />
        <node concept="3uibUv" id="2VtRX2ITi17" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi18" role="3clF46">
        <property role="TrG5h" value="resourceTarget" />
        <node concept="3uibUv" id="2VtRX2ITi19" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi1a" role="3clF46">
        <property role="TrG5h" value="feedbackTarget" />
        <node concept="3uibUv" id="2VtRX2ITi1b" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi1c" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2ITi1d" role="3cqZAp">
          <node concept="1Wc70l" id="2VtRX2ITi1e" role="3cqZAk">
            <node concept="1Wc70l" id="2VtRX2ITi1f" role="3uHU7B">
              <node concept="1Wc70l" id="2VtRX2ITi1g" role="3uHU7B">
                <node concept="3clFbC" id="2VtRX2ITi1h" role="3uHU7B">
                  <node concept="Wc6QR" id="2VtRX2ITi1i" role="3uHU7B">
                    <property role="10XrrR" value="getAllowedAction" />
                    <property role="1CJj6V" value="rule" />
                  </node>
                  <node concept="3yEOSi" id="2VtRX2ITi1j" role="3uHU7w">
                    <property role="1CJj6V" value="ActionKind.MODERATE" />
                  </node>
                </node>
                <node concept="3clFbC" id="2VtRX2ITi1k" role="3uHU7w">
                  <node concept="Wc6QR" id="2VtRX2ITi1l" role="3uHU7B">
                    <property role="10XrrR" value="getActorKind" />
                    <property role="1CJj6V" value="rule" />
                  </node>
                  <node concept="Wc6QR" id="2VtRX2ITi1m" role="3uHU7w">
                    <property role="10XrrR" value="getKind" />
                    <property role="1CJj6V" value="user" />
                  </node>
                </node>
              </node>
              <node concept="1rXfSq" id="2VtRX2ITi1n" role="3uHU7w">
                <ref role="37wK5l" node="2VtRX2ITi2b" resolve="matches" />
                <node concept="Wc6QR" id="2VtRX2ITi1o" role="37wK5m">
                  <property role="10XrrR" value="getResourceTarget" />
                  <property role="1CJj6V" value="rule" />
                </node>
                <node concept="37vLTw" id="2VtRX2ITi1p" role="37wK5m">
                  <ref role="3cqZAo" node="2VtRX2ITi18" resolve="resourceTarget" />
                </node>
              </node>
            </node>
            <node concept="1rXfSq" id="2VtRX2ITi1q" role="3uHU7w">
              <ref role="37wK5l" node="2VtRX2ITi2b" resolve="matches" />
              <node concept="Wc6QR" id="2VtRX2ITi1r" role="37wK5m">
                <property role="10XrrR" value="getFeedbackTarget" />
                <property role="1CJj6V" value="rule" />
              </node>
              <node concept="37vLTw" id="2VtRX2ITi1s" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2ITi1a" resolve="feedbackTarget" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2VtRX2ITi1t" role="1B3o_S" />
      <node concept="10P_77" id="2VtRX2ITi1u" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi1v" role="jymVt">
      <property role="TrG5h" value="ensureCanModerate" />
      <node concept="37vLTG" id="2VtRX2ITi1w" role="3clF46">
        <property role="TrG5h" value="moderator" />
        <node concept="3uibUv" id="2VtRX2ITi1x" role="1tU5fm">
          <ref role="3uigEE" node="2BbHItVhBaX" resolve="User" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi1y" role="3clF46">
        <property role="TrG5h" value="resourceTarget" />
        <node concept="3uibUv" id="2VtRX2ITi1z" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi1$" role="3clF46">
        <property role="TrG5h" value="feedbackTarget" />
        <node concept="3uibUv" id="2VtRX2ITi1_" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi1A" role="3clF47">
        <node concept="3clFbJ" id="2VtRX2ITi1B" role="3cqZAp">
          <node concept="3clFbC" id="2VtRX2ITi1C" role="3clFbw">
            <node concept="37vLTw" id="2VtRX2ITi1D" role="3uHU7B">
              <ref role="3cqZAo" node="2VtRX2ITi1w" resolve="moderator" />
            </node>
            <node concept="10Nm6u" id="2VtRX2ITi1E" role="3uHU7w" />
          </node>
          <node concept="3clFbS" id="2VtRX2ITi1G" role="3clFbx">
            <node concept="YS8fn" id="2VtRX2ITi1J" role="3cqZAp">
              <node concept="31S9pk" id="2VtRX2ITi1H" role="YScLw">
                <property role="31Ss8R" value="IllegalArgumentException" />
                <node concept="Xl_RD" id="2VtRX2ITi1I" role="37wK5m">
                  <property role="Xl_RC" value="Moderator is required." />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="2VtRX2ITi1K" role="3cqZAp">
          <node concept="3fqX7Q" id="2VtRX2ITi1L" role="3clFbw">
            <node concept="1rXfSq" id="2VtRX2ITi1M" role="3fr31v">
              <ref role="37wK5l" node="2VtRX2IThZB" resolve="canModerate" />
              <node concept="37vLTw" id="2VtRX2ITi1N" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2ITi1w" resolve="moderator" />
              </node>
              <node concept="37vLTw" id="2VtRX2ITi1O" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2ITi1y" resolve="resourceTarget" />
              </node>
              <node concept="37vLTw" id="2VtRX2ITi1P" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2ITi1$" resolve="feedbackTarget" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="2VtRX2ITi1R" role="3clFbx">
            <node concept="YS8fn" id="2VtRX2ITi1U" role="3cqZAp">
              <node concept="31S9pk" id="2VtRX2ITi1S" role="YScLw">
                <property role="31Ss8R" value="AccessDeniedException" />
                <node concept="Xl_RD" id="2VtRX2ITi1T" role="37wK5m">
                  <property role="Xl_RC" value="User is not allowed to moderate this target." />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2VtRX2ITi1V" role="1B3o_S" />
      <node concept="3cqZAl" id="2VtRX2ITi1W" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi1X" role="jymVt">
      <property role="TrG5h" value="isBackgroundPolicy" />
      <node concept="37vLTG" id="2VtRX2ITi1Y" role="3clF46">
        <property role="TrG5h" value="policy" />
        <node concept="3uibUv" id="2VtRX2ITi1Z" role="1tU5fm">
          <ref role="3uigEE" node="5thN_UR4TUw" resolve="ModerationPolicy" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi20" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2ITi21" role="3cqZAp">
          <node concept="22lmx$" id="2VtRX2ITi22" role="3cqZAk">
            <node concept="3clFbC" id="2VtRX2ITi23" role="3uHU7B">
              <node concept="Wc6QR" id="2VtRX2ITi24" role="3uHU7B">
                <property role="10XrrR" value="getMode" />
                <property role="1CJj6V" value="policy" />
              </node>
              <node concept="3yEOSi" id="2VtRX2ITi25" role="3uHU7w">
                <property role="1CJj6V" value="ModerationMode.AUTOMATIC" />
              </node>
            </node>
            <node concept="3clFbC" id="2VtRX2ITi26" role="3uHU7w">
              <node concept="Wc6QR" id="2VtRX2ITi27" role="3uHU7B">
                <property role="10XrrR" value="getMode" />
                <property role="1CJj6V" value="policy" />
              </node>
              <node concept="3yEOSi" id="2VtRX2ITi28" role="3uHU7w">
                <property role="1CJj6V" value="ModerationMode.HYBRID" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2VtRX2ITi29" role="1B3o_S" />
      <node concept="10P_77" id="2VtRX2ITi2a" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi2b" role="jymVt">
      <property role="TrG5h" value="matches" />
      <node concept="37vLTG" id="2VtRX2ITi2c" role="3clF46">
        <property role="TrG5h" value="ruleValue" />
        <node concept="3uibUv" id="2VtRX2ITi2d" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="37vLTG" id="2VtRX2ITi2e" role="3clF46">
        <property role="TrG5h" value="requestValue" />
        <node concept="3uibUv" id="2VtRX2ITi2f" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi2g" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2ITi2h" role="3cqZAp">
          <node concept="22lmx$" id="2VtRX2ITi2i" role="3cqZAk">
            <node concept="1rXfSq" id="2VtRX2ITi2j" role="3uHU7B">
              <ref role="37wK5l" node="2VtRX2ITi2u" resolve="isBlank" />
              <node concept="37vLTw" id="2VtRX2ITi2k" role="37wK5m">
                <ref role="3cqZAo" node="2VtRX2ITi2c" resolve="ruleValue" />
              </node>
            </node>
            <node concept="1eOMI4" id="2VtRX2ITi2r" role="3uHU7w">
              <node concept="1Wc70l" id="2VtRX2ITi2l" role="1eOMHV">
                <node concept="3y3z36" id="2VtRX2ITi2m" role="3uHU7B">
                  <node concept="37vLTw" id="2VtRX2ITi2n" role="3uHU7B">
                    <ref role="3cqZAo" node="2VtRX2ITi2e" resolve="requestValue" />
                  </node>
                  <node concept="10Nm6u" id="2VtRX2ITi2o" role="3uHU7w" />
                </node>
                <node concept="Wc6QR" id="2VtRX2ITi2p" role="3uHU7w">
                  <property role="10XrrR" value="equalsIgnoreCase" />
                  <property role="1CJj6V" value="ruleValue" />
                  <node concept="37vLTw" id="2VtRX2ITi2q" role="37wK5m">
                    <ref role="3cqZAo" node="2VtRX2ITi2e" resolve="requestValue" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2VtRX2ITi2s" role="1B3o_S" />
      <node concept="10P_77" id="2VtRX2ITi2t" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2VtRX2ITi2u" role="jymVt">
      <property role="TrG5h" value="isBlank" />
      <node concept="37vLTG" id="2VtRX2ITi2v" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="3uibUv" id="2VtRX2ITi2w" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
        </node>
      </node>
      <node concept="3clFbS" id="2VtRX2ITi2x" role="3clF47">
        <node concept="3cpWs6" id="2VtRX2ITi2y" role="3cqZAp">
          <node concept="22lmx$" id="2VtRX2ITi2z" role="3cqZAk">
            <node concept="3clFbC" id="2VtRX2ITi2$" role="3uHU7B">
              <node concept="37vLTw" id="2VtRX2ITi2_" role="3uHU7B">
                <ref role="3cqZAo" node="2VtRX2ITi2v" resolve="value" />
              </node>
              <node concept="10Nm6u" id="2VtRX2ITi2A" role="3uHU7w" />
            </node>
            <node concept="Wc6QR" id="2VtRX2ITi2B" role="3uHU7w">
              <property role="10XrrR" value="isBlank" />
              <property role="1CJj6V" value="value" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="2VtRX2ITi2C" role="1B3o_S" />
      <node concept="10P_77" id="2VtRX2ITi2D" role="3clF45" />
    </node>
    <node concept="1lrU7d" id="2VtRX2ITi2E" role="lGtFl">
      <node concept="u1fJn" id="2VtRX2ITi2F" role="u1e2Z">
        <property role="1CJj6V" value="java.util.List" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2G" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.scheduling.annotation.Scheduled" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2H" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.security.access.AccessDeniedException" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2I" role="u1e2Z">
        <property role="1CJj6V" value="org.springframework.transaction.annotation.Transactional" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2J" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.domain.AuthorizationRule" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2K" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.domain.ModerationPolicy" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2L" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.domain.User" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2M" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.domain.enums.ActionKind" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2N" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.domain.enums.ModerationDecision" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2O" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.domain.enums.ModerationMode" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2P" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.repository.AuthorizationRuleRepository" />
      </node>
      <node concept="u1fJn" id="2VtRX2ITi2Q" role="u1e2Z">
        <property role="1CJj6V" value="BasePackage.repository.ModerationPolicyRepository" />
      </node>
    </node>
  </node>
</model>

