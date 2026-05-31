<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:aad63325-5023-4436-86fd-5be03fd73c94(Ref.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="15" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="2rvu" ref="r:322f8d2c-fa9d-4224-b267-a1958299e237(Ref.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <property id="1140524450557" name="separatorText" index="2czwfO" />
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1237385578942" name="jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem" flags="ln" index="pVoyu" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1233759184865" name="jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem" flags="ln" index="11LMrY" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ngI" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="625126330682908270" name="jetbrains.mps.lang.editor.structure.CellModel_ReferencePresentation" flags="sg" stub="730538219795961225" index="3SHvHV" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="12pq0ddX3Tr">
    <ref role="1XX52x" to="2rvu:3nWBi3h36Ul" resolve="RefModel" />
    <node concept="3EZMnI" id="12pq0decKyI" role="2wV5jI">
      <node concept="l2Vlx" id="12pq0decKyJ" role="2iSdaV" />
      <node concept="3F0ifn" id="12pq0decKyK" role="3EZMnx">
        <property role="3F0ifm" value="ref" />
      </node>
      <node concept="3F0A7n" id="12pq0decKyL" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="12pq0decK_a" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK_c" role="3EZMnx">
        <property role="3F0ifm" value="version" />
        <node concept="lj46D" id="12pq0decK_g" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="12pq0decKyV" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP65iGB" resolve="version" />
        <node concept="ljvvj" id="12pq0decKyW" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKyX" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decKyY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKyZ" role="3EZMnx">
        <property role="3F0ifm" value="users" />
        <node concept="lj46D" id="12pq0dfRUPB" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKz0" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decKz1" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKz2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0dezS8e" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_mxMIt" resolve="userType" />
        <node concept="l2Vlx" id="12pq0dezS8g" role="2czzBx" />
        <node concept="ljvvj" id="12pq0dezS8i" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0dezS8j" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="pj6Ft" id="12pq0deGcGY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKz8" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decKz9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKza" role="3EZMnx">
        <property role="3F0ifm" value="resources" />
        <node concept="lj46D" id="12pq0decK_i" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzb" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decKzc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzd" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decKze" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pFVDC" resolve="resourceType" />
        <node concept="l2Vlx" id="12pq0decKzf" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decKzg" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decKzh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzi" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzj" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decKzk" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0dektx0" role="3EZMnx">
        <property role="3F0ifm" value="contexts" />
        <node concept="lj46D" id="12pq0dektx2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzm" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decKzn" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzo" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decKzp" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3nWBi3h36Va" resolve="contextType" />
        <node concept="l2Vlx" id="12pq0decKzq" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decKzr" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decKzs" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzt" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzu" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decKzv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzw" role="3EZMnx">
        <property role="3F0ifm" value="relations" />
        <node concept="lj46D" id="12pq0dektR9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzx" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decKzy" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzz" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decKz$" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3nWBi3h36Vo" resolve="resourceRelation" />
        <node concept="l2Vlx" id="12pq0decKz_" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decKzA" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decKzB" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzD" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decKzE" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzF" role="3EZMnx">
        <property role="3F0ifm" value="feedback types" />
        <node concept="lj46D" id="12pq0dektRa" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzG" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decKzH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzI" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decKzJ" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_njBiV" resolve="feedbackType" />
        <node concept="l2Vlx" id="12pq0decKzK" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decKzL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decKzM" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzO" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decKzP" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzQ" role="3EZMnx">
        <property role="3F0ifm" value="feedback definitions" />
        <node concept="lj46D" id="12pq0dektRb" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzR" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decKzS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzT" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decKzU" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_njBj5" resolve="feedbackDefinition" />
        <node concept="l2Vlx" id="12pq0decKzV" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decKzW" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decKzX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decKzY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decKzZ" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decK$0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$1" role="3EZMnx">
        <property role="3F0ifm" value="sorting policies" />
        <node concept="lj46D" id="12pq0dektRc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$2" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decK$3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$4" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0dektRd" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decK$5" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_njBjf" resolve="sortingPolicy" />
        <node concept="l2Vlx" id="12pq0decK$6" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decK$7" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decK$8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$a" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decK$b" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$c" role="3EZMnx">
        <property role="3F0ifm" value="authorizations" />
        <node concept="lj46D" id="12pq0dektRe" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$d" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decK$e" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$f" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decK$g" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pFVDD" resolve="authorizationRule" />
        <node concept="l2Vlx" id="12pq0decK$h" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decK$i" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decK$j" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$k" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$l" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decK$m" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$n" role="3EZMnx">
        <property role="3F0ifm" value="validations" />
        <node concept="lj46D" id="12pq0dektRf" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$o" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decK$p" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$q" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decK$r" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_njBjs" resolve="validationRule" />
        <node concept="l2Vlx" id="12pq0decK$s" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decK$t" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decK$u" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$v" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$w" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decK$x" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$y" role="3EZMnx">
        <property role="3F0ifm" value="moderations" />
        <node concept="lj46D" id="12pq0dektRg" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$z" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decK$$" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decK$A" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3nWBi3h36Vg" resolve="moderationPolicy" />
        <node concept="l2Vlx" id="12pq0decK$B" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decK$C" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decK$D" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$E" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$F" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decK$G" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$H" role="3EZMnx">
        <property role="3F0ifm" value="automations" />
        <node concept="lj46D" id="12pq0dektRh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$I" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decK$J" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$K" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decK$L" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3nWBi3h36UY" resolve="automationRule" />
        <node concept="l2Vlx" id="12pq0decK$M" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decK$N" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decK$O" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$P" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$Q" role="3EZMnx">
        <node concept="ljvvj" id="12pq0decK$R" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$S" role="3EZMnx">
        <property role="3F0ifm" value="verifications" />
        <node concept="lj46D" id="12pq0dektRi" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK$T" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0decK$U" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK$V" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0decK$W" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pFVDH" resolve="verificationPolicy" />
        <node concept="l2Vlx" id="12pq0decK$X" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0decK$Y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0decK$Z" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0decK_0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0decK_1" role="3EZMnx">
        <node concept="3mYdg7" id="12pq0decK_2" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="12pq0dezS7c">
    <ref role="1XX52x" to="2rvu:3nWBi3h36Uz" resolve="UserType" />
    <node concept="3EZMnI" id="12pq0deNVop" role="2wV5jI">
      <node concept="3F0ifn" id="12pq0deNVor" role="3EZMnx">
        <property role="3F0ifm" value="user" />
        <node concept="lj46D" id="12pq0dfS6MA" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="12pq0deNVos" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="12pq0deNVox" role="3EZMnx">
        <property role="3F0ifm" value="with" />
      </node>
      <node concept="3F0A7n" id="12pq0deNVo$" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwn2" resolve="kind" />
      </node>
      <node concept="3F0ifn" id="1C9VCjywm6F" role="3EZMnx">
        <property role="3F0ifm" value="kind" />
      </node>
      <node concept="3F0ifn" id="12pq0dfzQef" role="3EZMnx" />
      <node concept="3F0ifn" id="12pq0deNVoB" role="3EZMnx">
        <property role="3F0ifm" value="extends" />
      </node>
      <node concept="3F2HdR" id="12pq0deNVoG" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="2rvu:DrEcBK1he0" resolve="superType" />
        <node concept="l2Vlx" id="12pq0deNVoH" role="2czzBx" />
        <node concept="lj46D" id="4b31TA50mSb" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="12pq0dfRIXn" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="12pq0deNVni">
    <ref role="1XX52x" to="2rvu:3nWBi3h36V4" resolve="ResourceType" />
    <node concept="3EZMnI" id="12pq0deNVnk" role="2wV5jI">
      <node concept="l2Vlx" id="12pq0deNVnl" role="2iSdaV" />
      <node concept="3F0A7n" id="12pq0deNVnn" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="12pq0dfRIXm" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0dfrvW0" role="3EZMnx">
        <property role="3F0ifm" value="[" />
      </node>
      <node concept="3F0ifn" id="12pq0dfrvW5" role="3EZMnx">
        <property role="3F0ifm" value="supports media" />
      </node>
      <node concept="3F0A7n" id="12pq0dfrvWa" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP65iGE" resolve="supportsMedia" />
      </node>
      <node concept="3F0ifn" id="12pq0dfrvWd" role="3EZMnx">
        <property role="3F0ifm" value="]" />
      </node>
      <node concept="3F0ifn" id="12pq0dfrvWg" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="12pq0dfby06" role="3EZMnx">
        <property role="3F0ifm" value="extends" />
      </node>
      <node concept="3F2HdR" id="12pq0dfbIQG" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK1hdW" resolve="superType" />
        <node concept="l2Vlx" id="12pq0dfbIQI" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="12pq0dfjGt0" role="3EZMnx" />
      <node concept="3F0ifn" id="12pq0deNVnz" role="3EZMnx">
        <property role="3F0ifm" value="with fields:" />
        <node concept="11L4FC" id="12pq0deNVn$" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="12pq0deNVn_" role="3F10Kt">
          <property role="1413C4" value="paren-attribute" />
        </node>
        <node concept="11LMrY" id="12pq0deNVnA" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="12pq0dfTekw" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="12pq0deVJ0G" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pG76Q" resolve="attribute" />
        <node concept="l2Vlx" id="12pq0deVJ0K" role="2czzBx" />
        <node concept="pj6Ft" id="12pq0dfb$tE" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="pVoyu" id="12pq0dfbIQK" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="12pq0dfbTp9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="12pq0deNVoY">
    <ref role="1XX52x" to="2rvu:7vG6G7pFVDW" resolve="Attribute" />
    <node concept="3EZMnI" id="12pq0deNVp0" role="2wV5jI">
      <node concept="l2Vlx" id="12pq0deNVp1" role="2iSdaV" />
      <node concept="3F0ifn" id="12pq0dfTY11" role="3EZMnx">
        <property role="3F0ifm" value="-" />
        <node concept="lj46D" id="4b31TA51suj" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="12pq0deNVp3" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="12pq0dfTM7O" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA48UET" role="3EZMnx" />
      <node concept="3F0ifn" id="12pq0deNVpc" role="3EZMnx">
        <property role="3F0ifm" value="is a" />
        <node concept="11L4FC" id="12pq0deNVpd" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="12pq0deNVpe" role="3EZMnx">
        <property role="3F0ifm" value="required" />
      </node>
      <node concept="3F0ifn" id="12pq0deNVpf" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="12pq0deNVpg" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="12pq0deNVph" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pFVDZ" resolve="required" />
      </node>
      <node concept="3F0ifn" id="4b31TA49rhx" role="3EZMnx">
        <property role="3F0ifm" value="and multi valued" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$tGdy" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F0A7n" id="4b31TA47AwK" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pFVE0" resolve="multiValued" />
      </node>
      <node concept="3F0ifn" id="1C9VCjy_L3s" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0A7n" id="12pq0deNVpn" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pFVDY" resolve="type" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="12pq0dezXGt">
    <ref role="1XX52x" to="2rvu:DrEcBK1hdX" resolve="UserTypeSuperType" />
    <node concept="3EZMnI" id="4b31TA50THN" role="2wV5jI">
      <node concept="2iRfu4" id="4b31TA50THO" role="2iSdaV" />
      <node concept="1iCGBv" id="12pq0dfzDuB" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK1hdY" resolve="superType" />
        <node concept="ljvvj" id="12pq0dfzDuC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="1sVBvm" id="12pq0dfzDuE" role="1sWHZn">
          <node concept="3SHvHV" id="12pq0dfDOvJ" role="2wV5jI" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="12pq0dfJ3d5">
    <ref role="1XX52x" to="2rvu:DrEcBK1hdQ" resolve="ResourceTypeSuperType" />
    <node concept="1iCGBv" id="12pq0dfJ3dI" role="2wV5jI">
      <ref role="1NtTu8" to="2rvu:DrEcBK1hdS" resolve="superType" />
      <node concept="1sVBvm" id="12pq0dfJ3dK" role="1sWHZn">
        <node concept="3SHvHV" id="12pq0dfJ3dO" role="2wV5jI" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="hTYUaEQAe0">
    <ref role="1XX52x" to="2rvu:3nWBi3h36Ur" resolve="ContextType" />
    <node concept="3EZMnI" id="hTYUaEQAgT" role="2wV5jI">
      <node concept="l2Vlx" id="hTYUaEQAgU" role="2iSdaV" />
      <node concept="3F0A7n" id="hTYUaEQAgW" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="hTYUaERth7" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEQAh4" role="3EZMnx">
        <property role="3F0ifm" value="with" />
      </node>
      <node concept="3F0A7n" id="hTYUaEQAh7" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwmQ" resolve="contextKind" />
      </node>
      <node concept="3F0ifn" id="4b31TA51Zkc" role="3EZMnx">
        <property role="3F0ifm" value="kind," />
      </node>
      <node concept="3F0ifn" id="hTYUaEQAhf" role="3EZMnx">
        <property role="3F0ifm" value="contains" />
      </node>
      <node concept="3F2HdR" id="hTYUaEQAhi" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zvR" resolve="resourceTypeLink" />
        <node concept="l2Vlx" id="hTYUaEQAhk" role="2czzBx" />
        <node concept="lj46D" id="hTYUaERth9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="hTYUaEQAhl">
    <ref role="1XX52x" to="2rvu:5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
    <node concept="1iCGBv" id="hTYUaEQAhr" role="2wV5jI">
      <ref role="1NtTu8" to="2rvu:5fnjbJr$zvT" resolve="resourceType" />
      <node concept="1sVBvm" id="hTYUaEQAhu" role="1sWHZn">
        <node concept="3SHvHV" id="hTYUaESaPX" role="2wV5jI" />
      </node>
      <node concept="lj46D" id="hTYUaERGtr" role="3F10Kt">
        <property role="VOm3f" value="true" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="hTYUaESpjZ">
    <ref role="1XX52x" to="2rvu:3nWBi3h36Uo" resolve="ResourceRelation" />
    <node concept="3EZMnI" id="hTYUaESpk1" role="2wV5jI">
      <node concept="l2Vlx" id="hTYUaESpk2" role="2iSdaV" />
      <node concept="3F0A7n" id="hTYUaESpk4" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="hTYUaETEXX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaESpkK" role="3EZMnx">
        <property role="3F0ifm" value="from" />
      </node>
      <node concept="1iCGBv" id="hTYUaESpk6" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pG76W" resolve="sourceResourceType" />
        <node concept="1sVBvm" id="hTYUaESpk9" role="1sWHZn">
          <node concept="3SHvHV" id="hTYUaESpkM" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaET0Rm" role="3EZMnx" />
      <node concept="3F0ifn" id="hTYUaESpkP" role="3EZMnx">
        <property role="3F0ifm" value="[" />
        <node concept="11L4FC" id="hTYUaESH5T" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="hTYUaESH5V" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="hTYUaESH5Y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaESpkU" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pG76S" resolve="sourceCardinality" />
      </node>
      <node concept="3F0ifn" id="hTYUaESpkX" role="3EZMnx">
        <property role="3F0ifm" value="]" />
        <node concept="11L4FC" id="hTYUaET0Rj" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaESpkc" role="3EZMnx">
        <property role="3F0ifm" value="to" />
      </node>
      <node concept="1iCGBv" id="hTYUaESpkd" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zse" resolve="targetResourceType" />
        <node concept="1sVBvm" id="hTYUaESpkg" role="1sWHZn">
          <node concept="3SHvHV" id="hTYUaESpkN" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaETkHT" role="3EZMnx">
        <property role="3F0ifm" value="" />
      </node>
      <node concept="3F0ifn" id="hTYUaESpkj" role="3EZMnx">
        <property role="3F0ifm" value="[" />
        <node concept="11L4FC" id="hTYUaESpkk" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="hTYUaESpkl" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="hTYUaESpkm" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaESpl2" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pG76T" resolve="targetCardinality" />
      </node>
      <node concept="3F0ifn" id="hTYUaESpkr" role="3EZMnx">
        <property role="3F0ifm" value="]" />
        <node concept="11L4FC" id="hTYUaESpks" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaESpkx" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaESpky" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaESpkz" role="3EZMnx">
        <property role="3F0ifm" value="containment" />
      </node>
      <node concept="3F0ifn" id="hTYUaESpk$" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaESpk_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaESpkA" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pG76U" resolve="containment" />
      </node>
      <node concept="3F0ifn" id="hTYUaESpkB" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaESpkC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaESpkD" role="3EZMnx">
        <property role="3F0ifm" value="recursive" />
      </node>
      <node concept="3F0ifn" id="hTYUaESpkE" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaESpkF" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaESpkG" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pG76V" resolve="recursive" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="hTYUaETYPk">
    <ref role="1XX52x" to="2rvu:3nWBi3h36UD" resolve="FeedbackType" />
    <node concept="3EZMnI" id="hTYUaETYPm" role="2wV5jI">
      <node concept="l2Vlx" id="hTYUaETYPn" role="2iSdaV" />
      <node concept="3F0A7n" id="hTYUaETYPp" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="hTYUaETYQ9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaETYPu" role="3EZMnx">
        <property role="3F0ifm" value="kind" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPv" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaETYPw" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaETYPx" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656r1" resolve="kind" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYQa" role="3EZMnx">
        <property role="3F0ifm" value="applies on" />
      </node>
      <node concept="3F0A7n" id="hTYUaETYPB" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656ra" resolve="subjectScope" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYQd" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPE" role="3EZMnx">
        <property role="3F0ifm" value="has rating" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPF" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaETYPG" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaETYPH" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656rf" resolve="hasRating" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPI" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaETYPJ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaETYPK" role="3EZMnx">
        <property role="3F0ifm" value="recursive" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPL" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaETYPM" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaETYPN" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656rh" resolve="recursive" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPO" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaETYPP" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaETYPQ" role="3EZMnx">
        <property role="3F0ifm" value="allows media" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPR" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaETYPS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaETYPT" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656ri" resolve="allowsMedia" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPU" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaETYPV" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaETYPW" role="3EZMnx">
        <property role="3F0ifm" value="allows text" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYPX" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaETYPY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaETYPZ" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLl" resolve="allowsText" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYQ0" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaETYQ1" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaETYQ2" role="3EZMnx">
        <property role="3F0ifm" value="with polarity" />
      </node>
      <node concept="3F0ifn" id="hTYUaETYQ3" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaETYQ4" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaETYQ5" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLk" resolve="polarity" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="hTYUaEUMuw">
    <ref role="1XX52x" to="2rvu:3nWBi3h36UG" resolve="FeedbackDefinition" />
    <node concept="3EZMnI" id="hTYUaEUMuy" role="2wV5jI">
      <node concept="l2Vlx" id="hTYUaEUMuz" role="2iSdaV" />
      <node concept="3F0A7n" id="hTYUaEUMu_" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCjyz3sZ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA49VRl" role="3EZMnx">
        <property role="3F0ifm" value="authored by" />
      </node>
      <node concept="1iCGBv" id="hTYUaEUMuW" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK1he2" resolve="author" />
        <node concept="1sVBvm" id="hTYUaEUMuZ" role="1sWHZn">
          <node concept="3SHvHV" id="hTYUaEUMvA" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvG" role="3EZMnx">
        <property role="3F0ifm" value="on" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvL" role="3EZMnx">
        <property role="3F0ifm" value="resource" />
      </node>
      <node concept="1iCGBv" id="hTYUaEUMvQ" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsB" resolve="subjectResource" />
        <node concept="1sVBvm" id="hTYUaEUMvS" role="1sWHZn">
          <node concept="3SHvHV" id="hTYUaEUMvW" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEUMw1" role="3EZMnx">
        <property role="3F0ifm" value="or" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMw6" role="3EZMnx">
        <property role="3F0ifm" value="feedback" />
      </node>
      <node concept="1iCGBv" id="hTYUaEUMwb" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsj" resolve="subjectFeedback" />
        <node concept="1sVBvm" id="hTYUaEUMwd" role="1sWHZn">
          <node concept="3SHvHV" id="hTYUaEUMwh" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="5thN_URtTw9" role="3EZMnx">
        <property role="3F0ifm" value="with" />
      </node>
      <node concept="3F0ifn" id="5thN_URtVsL" role="3EZMnx">
        <property role="3F0ifm" value="type" />
      </node>
      <node concept="1iCGBv" id="5thN_URtU5y" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsC" resolve="feedbackType" />
        <node concept="1sVBvm" id="5thN_URtU5$" role="1sWHZn">
          <node concept="3SHvHV" id="5thN_URtUuw" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEUMv6" role="3EZMnx">
        <property role="3F0ifm" value="requires a verified context" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMv7" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaEUMv8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaEUMv9" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656rj" resolve="requiresVerifiedContext" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMva" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaEUMvb" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvc" role="3EZMnx">
        <property role="3F0ifm" value="verification requirement" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvd" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaEUMve" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaEUMvf" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLs" resolve="verificationRequirement" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvg" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaEUMvh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvi" role="3EZMnx">
        <property role="3F0ifm" value="unique per author target" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvj" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaEUMvk" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="hTYUaEUMvl" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP656rk" resolve="uniquePerAuthorTarget" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvm" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="hTYUaEUMvn" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvo" role="3EZMnx">
        <property role="3F0ifm" value="feedback policy" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvp" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="hTYUaEUMvq" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="hTYUaEUMvr" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsh" resolve="feedbackPolicy" />
      </node>
      <node concept="3F0ifn" id="hTYUaEUMvs" role="3EZMnx">
        <property role="3F0ifm" value=", " />
        <node concept="11L4FC" id="hTYUaEUMvt" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="hTYUaEUMvx" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsi" resolve="ratingPolicy" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4b31TA47Awp">
    <ref role="1XX52x" to="2rvu:3nWBi3h36UA" resolve="FeedbackPolicy" />
    <node concept="3EZMnI" id="4b31TA47Awr" role="2wV5jI">
      <node concept="l2Vlx" id="4b31TA47Aws" role="2iSdaV" />
      <node concept="3F0A7n" id="4b31TA47Awu" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="4b31TA47AwE" role="3EZMnx">
        <property role="3F0ifm" value="policy status" />
      </node>
      <node concept="3F0A7n" id="4b31TA47AwA" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK18vS" resolve="status" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4b31TA4jggo">
    <ref role="1XX52x" to="2rvu:3nWBi3h36UJ" resolve="RatingPolicy" />
    <node concept="3EZMnI" id="4b31TA4jggq" role="2wV5jI">
      <node concept="l2Vlx" id="4b31TA4jggr" role="2iSdaV" />
      <node concept="3F0ifn" id="4b31TA4jggu" role="3EZMnx">
        <property role="3F0ifm" value="rated between" />
        <node concept="11L4FC" id="4b31TA4jggv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="4b31TA4jggw" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="4b31TA4jggx" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="4b31TA55D4N" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA556jD" role="3EZMnx" />
      <node concept="3F0A7n" id="4b31TA4jgg_" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK18w3" resolve="minValue" />
      </node>
      <node concept="3F0ifn" id="4b31TA4jggP" role="3EZMnx">
        <property role="3F0ifm" value="and" />
      </node>
      <node concept="3F0A7n" id="4b31TA4jggF" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK18w5" resolve="maxValue" />
      </node>
      <node concept="3F0ifn" id="4b31TA556jG" role="3EZMnx" />
      <node concept="3F0ifn" id="4b31TA4jggG" role="3EZMnx">
        <property role="3F0ifm" value="with" />
        <node concept="11L4FC" id="4b31TA4jggH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="4b31TA4jggL" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:DrEcBK18w6" resolve="step" />
      </node>
      <node concept="3F0ifn" id="4b31TA556jJ" role="3EZMnx" />
      <node concept="3F0ifn" id="4b31TA4jggM" role="3EZMnx">
        <property role="3F0ifm" value="step" />
        <node concept="11L4FC" id="4b31TA4jggN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="4b31TA4jggO" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4b31TA56IB4">
    <ref role="1XX52x" to="2rvu:47EFX_kWWKX" resolve="SortingPolicy" />
    <node concept="3EZMnI" id="4b31TA56IB6" role="2wV5jI">
      <node concept="l2Vlx" id="4b31TA56IB7" role="2iSdaV" />
      <node concept="3F0A7n" id="4b31TA56IB9" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="4b31TA57X5A" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA56IBa" role="3EZMnx">
        <property role="3F0ifm" value="applies to resource" />
      </node>
      <node concept="1iCGBv" id="4b31TA56IBb" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLw" resolve="appliesToResource" />
        <node concept="1sVBvm" id="4b31TA56IBe" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA56IBQ" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyxfWl" role="3EZMnx">
        <property role="3F0ifm" value="|" />
      </node>
      <node concept="3F0ifn" id="4b31TA56IBh" role="3EZMnx">
        <property role="3F0ifm" value="applies to feedback" />
      </node>
      <node concept="1iCGBv" id="4b31TA56IBi" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLx" resolve="appliesToFeedback" />
        <node concept="1sVBvm" id="4b31TA56IBl" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA56IBR" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA56IBo" role="3EZMnx">
        <property role="3F0ifm" value="in" />
      </node>
      <node concept="1iCGBv" id="4b31TA56IBp" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLy" resolve="inContext" />
        <node concept="1sVBvm" id="4b31TA56IBs" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA56IBT" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA57lQy" role="3EZMnx">
        <property role="3F0ifm" value="context" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyy9FU" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="1C9VCjyy9FX" role="3EZMnx" />
      <node concept="3F0ifn" id="4b31TA56IBv" role="3EZMnx">
        <property role="3F0ifm" value="sorted by" />
        <node concept="11L4FC" id="4b31TA56IBw" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="4b31TA56IBx" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="4b31TA56IBy" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyy9FS" role="3EZMnx" />
      <node concept="3F0A7n" id="4b31TA56IBA" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLa" resolve="criterion" />
      </node>
      <node concept="3F0ifn" id="4b31TA56IBD" role="3EZMnx">
        <property role="3F0ifm" value="with" />
      </node>
      <node concept="3F0A7n" id="4b31TA56IBG" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:47EFX_kWWLb" resolve="direction" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$tGd_" role="3EZMnx">
        <property role="3F0ifm" value="direction" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4b31TA58$kP">
    <ref role="1XX52x" to="2rvu:7vG6G7pFVDE" resolve="AuthorizationRule" />
    <node concept="3EZMnI" id="4b31TA58$kS" role="2wV5jI">
      <node concept="l2Vlx" id="4b31TA58$kT" role="2iSdaV" />
      <node concept="3F0A7n" id="4b31TA58$kV" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="4b31TA59g3d" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA58$kW" role="3EZMnx">
        <property role="3F0ifm" value="for" />
      </node>
      <node concept="3F0A7n" id="4b31TA58$l$" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwn$" resolve="allowedAction" />
      </node>
      <node concept="3F0ifn" id="4b31TA58$lC" role="3EZMnx">
        <property role="3F0ifm" value="performed by" />
      </node>
      <node concept="1iCGBv" id="4b31TA58$kX" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:3vc7gP65iG_" resolve="actor" />
        <node concept="1sVBvm" id="4b31TA58$l0" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA58$lE" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA58$l3" role="3EZMnx">
        <property role="3F0ifm" value="in" />
      </node>
      <node concept="1iCGBv" id="4b31TA58$l4" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsz" resolve="context" />
        <node concept="1sVBvm" id="4b31TA58$l7" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA58$lG" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyzX$p" role="3EZMnx">
        <property role="3F0ifm" value="context" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyzX$s" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="4b31TA58$lI" role="3EZMnx">
        <property role="3F0ifm" value="on resource" />
      </node>
      <node concept="1iCGBv" id="4b31TA58$lb" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zs$" resolve="resourceTarget" />
        <node concept="1sVBvm" id="4b31TA58$le" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA58$lL" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="4b31TA58$lN" role="3EZMnx">
        <property role="3F0ifm" value="|" />
      </node>
      <node concept="3F0ifn" id="4b31TA58$lS" role="3EZMnx">
        <property role="3F0ifm" value="on feedback" />
      </node>
      <node concept="1iCGBv" id="4b31TA58$lY" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsb" resolve="feedbackTarget" />
        <node concept="1sVBvm" id="4b31TA58$m0" role="1sWHZn">
          <node concept="3SHvHV" id="4b31TA58$m4" role="2wV5jI" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCjysXMa">
    <ref role="1XX52x" to="2rvu:3nWBi3h36UM" resolve="ValidationRule" />
    <node concept="3EZMnI" id="1C9VCjysXMc" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCjysXMd" role="2iSdaV" />
      <node concept="3F0A7n" id="1C9VCjysXMf" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCjyuzSh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjysXNh" role="3EZMnx">
        <property role="3F0ifm" value="with" />
      </node>
      <node concept="3F0A7n" id="1C9VCjysXNm" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwn_" resolve="kind" />
      </node>
      <node concept="3F0ifn" id="1C9VCjywm6R" role="3EZMnx">
        <property role="3F0ifm" value="and" />
      </node>
      <node concept="3F0ifn" id="1C9VCjysXNr" role="3EZMnx">
        <property role="3F0ifm" value="severity" />
      </node>
      <node concept="3F0A7n" id="1C9VCjysXNw" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwnE" resolve="severity" />
      </node>
      <node concept="3F0ifn" id="1C9VCjysXN_" role="3EZMnx">
        <property role="3F0ifm" value="for expression" />
      </node>
      <node concept="3F0A7n" id="1C9VCjysXNE" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwnF" resolve="expression" />
      </node>
      <node concept="3F0ifn" id="1C9VCjysXNH" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="1C9VCjysXOo" role="3EZMnx">
        <property role="3F0ifm" value="was invoked by" />
      </node>
      <node concept="1iCGBv" id="1C9VCjysXOt" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsx" resolve="userType" />
        <node concept="1sVBvm" id="1C9VCjysXOv" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjysXO_" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjysXOF" role="3EZMnx">
        <property role="3F0ifm" value="in context of" />
      </node>
      <node concept="1iCGBv" id="1C9VCjysXOI" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsy" resolve="contextType" />
        <node concept="1sVBvm" id="1C9VCjysXOK" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjysXOO" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjysXNM" role="3EZMnx">
        <property role="3F0ifm" value="with implementation id" />
      </node>
      <node concept="3F0A7n" id="1C9VCjysXNR" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwnG" resolve="implementationId" />
      </node>
      <node concept="3F0ifn" id="1C9VCjytKPX" role="3EZMnx">
        <property role="3F0ifm" value="and" />
      </node>
      <node concept="3F0ifn" id="1C9VCjysXNW" role="3EZMnx">
        <property role="3F0ifm" value="applies to resource" />
      </node>
      <node concept="1iCGBv" id="1C9VCjysXMo" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsw" resolve="resourceType" />
        <node concept="1sVBvm" id="1C9VCjysXMr" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjysXNY" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjysXO0" role="3EZMnx">
        <property role="3F0ifm" value="|" />
      </node>
      <node concept="3F0ifn" id="1C9VCjysXO5" role="3EZMnx">
        <property role="3F0ifm" value="applies to feedback" />
      </node>
      <node concept="1iCGBv" id="1C9VCjysXOa" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsc" resolve="feedbackDefinition" />
        <node concept="1sVBvm" id="1C9VCjysXOc" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjysXOi" role="2wV5jI" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCjyuzSj">
    <ref role="1XX52x" to="2rvu:3nWBi3h36Ut" resolve="ModerationPolicy" />
    <node concept="3EZMnI" id="1C9VCjyuzSl" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCjyuzSm" role="2iSdaV" />
      <node concept="3F0A7n" id="1C9VCjyuzSo" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCjyuzTc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzTd" role="3EZMnx">
        <property role="3F0ifm" value="in" />
      </node>
      <node concept="3F0A7n" id="1C9VCjyuzTg" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwn8" resolve="mode" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzTj" role="3EZMnx">
        <property role="3F0ifm" value="mode" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzTw" role="3EZMnx">
        <property role="3F0ifm" value="set to" />
      </node>
      <node concept="3F0A7n" id="1C9VCjyuzT_" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwna" resolve="decision" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzTL" role="3EZMnx">
        <property role="3F0ifm" value="when trigger" />
      </node>
      <node concept="3F0A7n" id="1C9VCjyuzTQ" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwn9" resolve="trigger" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyxfWj" role="3EZMnx">
        <property role="3F0ifm" value="on" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzU0" role="3EZMnx">
        <property role="3F0ifm" value="resource" />
      </node>
      <node concept="1iCGBv" id="1C9VCjyuzU5" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsq" resolve="monitorsResource" />
        <node concept="1sVBvm" id="1C9VCjyuzU7" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjyuzUb" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzUg" role="3EZMnx">
        <property role="3F0ifm" value="|" />
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzUj" role="3EZMnx">
        <property role="3F0ifm" value="feedback" />
      </node>
      <node concept="1iCGBv" id="1C9VCjyuzSq" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsa" resolve="monitorsFeedback" />
        <node concept="1sVBvm" id="1C9VCjyuzSt" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjyuzUl" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzSw" role="3EZMnx">
        <property role="3F0ifm" value="executed by" />
      </node>
      <node concept="1iCGBv" id="1C9VCjyuzSx" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsm" resolve="executedBy" />
        <node concept="1sVBvm" id="1C9VCjyuzS$" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjyuzUm" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjyuzSI" role="3EZMnx">
        <property role="3F0ifm" value="in" />
      </node>
      <node concept="1iCGBv" id="1C9VCjyuzSJ" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsr" resolve="inContext" />
        <node concept="1sVBvm" id="1C9VCjyuzSM" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjyuzUo" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$vRkt" role="3EZMnx" />
      <node concept="3F0ifn" id="1C9VCjyuzT9" role="3EZMnx">
        <property role="3F0ifm" value="context" />
        <node concept="11L4FC" id="1C9VCjyuzTa" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="1C9VCjyuzTb" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCjy_L3v">
    <ref role="1XX52x" to="2rvu:77Q8YzgwKZ9" resolve="AutomationCondition" />
    <node concept="3EZMnI" id="1C9VCjy_L3x" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCjy_L3y" role="2iSdaV" />
      <node concept="3F0ifn" id="1C9VCj$pj6M" role="3EZMnx">
        <property role="3F0ifm" value="-" />
        <node concept="lj46D" id="1C9VCj$pj6O" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="1C9VCjy_L3$" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCjyAHQC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjy_L41" role="3EZMnx">
        <property role="3F0ifm" value="should check if" />
      </node>
      <node concept="1iCGBv" id="1C9VCjy_L3A" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:1bC37d4A6C6" resolve="field" />
        <node concept="1sVBvm" id="1C9VCjy_L3D" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCjy_L43" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCjy_L48" role="3EZMnx">
        <property role="3F0ifm" value="field" />
      </node>
      <node concept="3F0A7n" id="1C9VCjy_L3N" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:77Q8YzgwKZc" resolve="operator" />
      </node>
      <node concept="3F0ifn" id="1C9VCjzUwcI" role="3EZMnx">
        <property role="3F0ifm" value="as" />
      </node>
      <node concept="3F0ifn" id="1C9VCjzM6Ga" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="ljvvj" id="1C9VCjzM6Gc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="1C9VCjzKcv$" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:1C9VCjyCBvX" resolve="keywords" />
        <node concept="l2Vlx" id="1C9VCjzKcvA" role="2czzBx" />
        <node concept="pj6Ft" id="1C9VCjzKcvB" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="1C9VCjzL9r2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="1C9VCjzM6Gd" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCjzvnqR">
    <ref role="1XX52x" to="2rvu:1C9VCjyCBvV" resolve="ConditionValue" />
    <node concept="3EZMnI" id="1C9VCjzvnqT" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCjzvnqU" role="2iSdaV" />
      <node concept="3F0ifn" id="1C9VCjzvnr7" role="3EZMnx">
        <property role="3F0ifm" value="-" />
        <node concept="lj46D" id="1C9VCj$qpmL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="1C9VCjzvnr3" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:1C9VCjyCBvW" resolve="word" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCj$iZMx">
    <ref role="1XX52x" to="2rvu:77Q8YzgwKZx" resolve="AutomationAction" />
    <node concept="3EZMnI" id="1C9VCj$iZMz" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCj$iZM$" role="2iSdaV" />
      <node concept="3F0ifn" id="1C9VCj$pj6Q" role="3EZMnx">
        <property role="3F0ifm" value="-" />
        <node concept="lj46D" id="1C9VCj$pj6S" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="1C9VCj$iZMA" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCj$n6_T" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$jZls" role="3EZMnx">
        <property role="3F0ifm" value="should" />
      </node>
      <node concept="3F0A7n" id="1C9VCj$iZMI" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:77Q8YzgwKZT" resolve="kind" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$iZML" role="3EZMnx">
        <property role="3F0ifm" value="with message" />
      </node>
      <node concept="3F0A7n" id="1C9VCj$iZMO" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:77Q8YzgwKZU" resolve="message" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCj$kYwt">
    <ref role="1XX52x" to="2rvu:3nWBi3h36US" resolve="VerificationPolicy" />
    <node concept="3EZMnI" id="1C9VCj$kYww" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCj$kYwx" role="2iSdaV" />
      <node concept="3F0A7n" id="1C9VCj$kYwz" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCj$kYwX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$kYwJ" role="3EZMnx">
        <property role="3F0ifm" value="in" />
      </node>
      <node concept="3F0A7n" id="1C9VCj$kYwM" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwnK" resolve="mode" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$kYwZ" role="3EZMnx">
        <property role="3F0ifm" value="mode" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$rvFm" role="3EZMnx">
        <property role="3F0ifm" value="is applied on" />
      </node>
      <node concept="3F0A7n" id="1C9VCj$kYwS" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwnL" resolve="appliesWhen" />
      </node>
      <node concept="3F0ifn" id="4AWrYK6AN5" role="3EZMnx">
        <property role="3F0ifm" value="to" />
      </node>
      <node concept="1iCGBv" id="4AWrYK6ASc" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zs8" resolve="feedbackDefinition" />
        <node concept="1sVBvm" id="4AWrYK6ASe" role="1sWHZn">
          <node concept="3SHvHV" id="4AWrYK6AXm" role="2wV5jI" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1C9VCj$lZWP">
    <ref role="1XX52x" to="2rvu:3nWBi3h36UP" resolve="AutomationRule" />
    <node concept="3EZMnI" id="1C9VCj$lZWR" role="2wV5jI">
      <node concept="l2Vlx" id="1C9VCj$lZWS" role="2iSdaV" />
      <node concept="3F0A7n" id="1C9VCj$lZWU" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="lj46D" id="1C9VCj$n6_S" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZXX" role="3EZMnx">
        <property role="3F0ifm" value="trigger" />
      </node>
      <node concept="3F0A7n" id="1C9VCj$lZY2" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:7vG6G7pGwnH" resolve="trigger" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZYk" role="3EZMnx">
        <property role="3F0ifm" value="in" />
      </node>
      <node concept="1iCGBv" id="1C9VCj$lZYp" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsu" resolve="inContext" />
        <node concept="1sVBvm" id="1C9VCj$lZYr" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCj$lZYx" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZY$" role="3EZMnx">
        <property role="3F0ifm" value="context " />
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZY8" role="3EZMnx">
        <property role="3F0ifm" value="on" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZWV" role="3EZMnx">
        <property role="3F0ifm" value="feedback" />
      </node>
      <node concept="1iCGBv" id="1C9VCj$lZWW" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zs9" resolve="feedbackDefinition" />
        <node concept="1sVBvm" id="1C9VCj$lZWZ" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCj$lZYa" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZYb" role="3EZMnx">
        <property role="3F0ifm" value="|" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZYg" role="3EZMnx">
        <property role="3F0ifm" value="resource" />
      </node>
      <node concept="1iCGBv" id="1C9VCj$lZX3" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zss" resolve="context" />
        <node concept="1sVBvm" id="1C9VCj$lZX6" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCj$lZYi" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZXg" role="3EZMnx">
        <property role="3F0ifm" value="using" />
      </node>
      <node concept="1iCGBv" id="1C9VCj$lZXh" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:5fnjbJr$zsv" resolve="uses" />
        <node concept="1sVBvm" id="1C9VCj$lZXk" role="1sWHZn">
          <node concept="3SHvHV" id="1C9VCj$lZYG" role="2wV5jI" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZYI" role="3EZMnx">
        <property role="3F0ifm" value="when" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZXx" role="3EZMnx">
        <property role="3F0ifm" value="condition(s)" />
      </node>
      <node concept="3F0ifn" id="1C9VCj$ocNZ" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F2HdR" id="1C9VCj$lZXA" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:77Q8YzgwKZY" resolve="conditions" />
        <node concept="l2Vlx" id="1C9VCj$lZXB" role="2czzBx" />
        <node concept="pVoyu" id="1C9VCj$n6_X" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="1C9VCj$n6_Z" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$lZYO" role="3EZMnx">
        <property role="3F0ifm" value="then" />
        <node concept="pVoyu" id="1C9VCj$n6_Y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="1C9VCj$ocNX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1C9VCj$ocO2" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F2HdR" id="1C9VCj$lZXM" role="3EZMnx">
        <ref role="1NtTu8" to="2rvu:77Q8YzgwKZZ" resolve="actions" />
        <node concept="l2Vlx" id="1C9VCj$lZXN" role="2czzBx" />
        <node concept="pVoyu" id="1C9VCj$n6_V" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="1C9VCj$n6_W" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
</model>

