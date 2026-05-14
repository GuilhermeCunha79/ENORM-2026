<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:322f8d2c-fa9d-4224-b267-a1958299e237(Ref.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <reference id="1075010451642646892" name="defaultMember" index="1H5jkz" />
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="3nWBi3h36Ul">
    <property role="EcuMT" value="3890156942413033109" />
    <property role="TrG5h" value="RefModel" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36Un" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="3nWBi3h36Va" role="1TKVEi">
      <property role="IQ2ns" value="3890156942413033162" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="contextType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36Ur" resolve="ContextType" />
    </node>
    <node concept="1TJgyj" id="47EFX_mxMIt" role="1TKVEi">
      <property role="IQ2ns" value="4749802105010072477" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="userType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36Uz" resolve="UserType" />
    </node>
    <node concept="1TJgyj" id="7vG6G7pFVDC" role="1TKVEi">
      <property role="IQ2ns" value="8641311204900321896" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="resourceType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="3nWBi3h36Vo" role="1TKVEi">
      <property role="IQ2ns" value="3890156942413033176" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="resourceRelation" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36Uo" resolve="ResourceRelation" />
    </node>
    <node concept="1TJgyj" id="47EFX_njBiV" role="1TKVEi">
      <property role="IQ2ns" value="4749802105023132859" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="feedbackType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36UD" resolve="FeedbackType" />
    </node>
    <node concept="1TJgyj" id="47EFX_njBj5" role="1TKVEi">
      <property role="IQ2ns" value="4749802105023132869" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="feedbackDefinition" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="47EFX_njBjf" role="1TKVEi">
      <property role="IQ2ns" value="4749802105023132879" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="sortingPolicy" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="47EFX_kWWKX" resolve="SortingPolicy" />
    </node>
    <node concept="1TJgyj" id="47EFX_njBjs" role="1TKVEi">
      <property role="IQ2ns" value="4749802105023132892" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="validationRule" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36UM" resolve="ValidationRule" />
    </node>
    <node concept="1TJgyj" id="3nWBi3h36UY" role="1TKVEi">
      <property role="IQ2ns" value="3890156942413033150" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="automationRule" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36UP" resolve="AutomationRule" />
    </node>
    <node concept="1TJgyj" id="3nWBi3h36Vg" role="1TKVEi">
      <property role="IQ2ns" value="3890156942413033168" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="moderationPolicy" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36Ut" resolve="ModerationPolicy" />
    </node>
    <node concept="1TJgyj" id="7vG6G7pFVDD" role="1TKVEi">
      <property role="IQ2ns" value="8641311204900321897" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="authorizationRule" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="7vG6G7pFVDE" resolve="AuthorizationRule" />
    </node>
    <node concept="1TJgyj" id="7vG6G7pFVDH" role="1TKVEi">
      <property role="IQ2ns" value="8641311204900321901" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="verificationPolicy" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="3nWBi3h36US" resolve="VerificationPolicy" />
    </node>
    <node concept="1TJgyi" id="3vc7gP65iGB" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182583079" />
      <property role="TrG5h" value="version" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36Uo">
    <property role="EcuMT" value="3890156942413033112" />
    <property role="TrG5h" value="ResourceRelation" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36Up" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pG76S" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900368824" />
      <property role="TrG5h" value="sourceCardinality" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pG76T" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900368825" />
      <property role="TrG5h" value="targetCardinality" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pG76U" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900368826" />
      <property role="TrG5h" value="containment" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pG76V" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900368827" />
      <property role="TrG5h" value="recursive" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyj" id="7vG6G7pG76W" role="1TKVEi">
      <property role="IQ2ns" value="8641311204900368828" />
      <property role="20kJfa" value="sourceResourceType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zse" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197710" />
      <property role="20kJfa" value="targetResourceType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36Ur">
    <property role="EcuMT" value="3890156942413033115" />
    <property role="TrG5h" value="ContextType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36Us" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwmQ" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472246" />
      <property role="TrG5h" value="contextKind" />
      <ref role="AX2Wp" node="7vG6G7pGwmL" resolve="ContextKind" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zvR" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197943" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="resourceTypeLink" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="5fnjbJr$zvM" resolve="ContextResourceTypeLink" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36Ut">
    <property role="EcuMT" value="3890156942413033117" />
    <property role="TrG5h" value="ModerationPolicy" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36Uu" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwn8" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472264" />
      <property role="TrG5h" value="mode" />
      <ref role="AX2Wp" node="7vG6G7pGwn4" resolve="ModerationMode" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwn9" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472265" />
      <property role="TrG5h" value="trigger" />
      <ref role="AX2Wp" node="77Q8YzgwKYR" resolve="TriggerEvent" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwna" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472266" />
      <property role="TrG5h" value="decision" />
      <ref role="AX2Wp" node="7vG6G7pGwnb" resolve="ModerationDecision" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsa" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197706" />
      <property role="20kJfa" value="feedbackDefinition" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsm" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197718" />
      <property role="20kJfa" value="executedBy" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36Uz" resolve="UserType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsq" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197722" />
      <property role="20kJfa" value="monitorsResource" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsr" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197723" />
      <property role="20kJfa" value="inContext" />
      <ref role="20lvS9" node="3nWBi3h36Ur" resolve="ContextType" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36Uz">
    <property role="EcuMT" value="3890156942413033123" />
    <property role="TrG5h" value="UserType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36U$" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwn2" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472258" />
      <property role="TrG5h" value="kind" />
      <ref role="AX2Wp" node="7vG6G7pGwmW" resolve="UserKind" />
    </node>
    <node concept="1TJgyj" id="DrEcBK1he0" role="1TKVEi">
      <property role="IQ2ns" value="746375748528706432" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="superType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="DrEcBK1hdX" resolve="UserTypeSuperType" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36UA">
    <property role="EcuMT" value="3890156942413033126" />
    <property role="TrG5h" value="FeedbackPolicy" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36UB" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="DrEcBK18vS" role="1TKVEl">
      <property role="IQ2nx" value="746375748528670712" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="DrEcBK18vV" resolve="FeedbackStatus" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36UD">
    <property role="EcuMT" value="3890156942413033129" />
    <property role="TrG5h" value="FeedbackType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36UE" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656r1" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532801" />
      <property role="TrG5h" value="kind" />
      <ref role="AX2Wp" node="3vc7gP656r2" resolve="FeedbackKind" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656ra" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532810" />
      <property role="TrG5h" value="subjectScope" />
      <ref role="AX2Wp" node="3vc7gP656rb" resolve="FeedbackSubjectScope" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656rf" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532815" />
      <property role="TrG5h" value="hasRating" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656rh" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532817" />
      <property role="TrG5h" value="recursive" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656ri" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532818" />
      <property role="TrG5h" value="allowsMedia" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="47EFX_kWWLl" role="1TKVEl">
      <property role="IQ2nx" value="4749802104983637077" />
      <property role="TrG5h" value="allowsText" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="47EFX_kWWLk" role="1TKVEl">
      <property role="IQ2nx" value="4749802104983637076" />
      <property role="TrG5h" value="polarity" />
      <ref role="AX2Wp" node="47EFX_kWWLf" resolve="FeedbackPolarity" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36UG">
    <property role="EcuMT" value="3890156942413033132" />
    <property role="TrG5h" value="FeedbackDefinition" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36UH" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsh" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197713" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="feedbackPolicy" />
      <ref role="20lvS9" node="3nWBi3h36UA" resolve="FeedbackPolicy" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsi" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197714" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="ratingPolicy" />
      <ref role="20lvS9" node="3nWBi3h36UJ" resolve="RatingPolicy" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsj" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197715" />
      <property role="20kJfa" value="subjectFeedback" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsB" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197735" />
      <property role="20kJfa" value="subjectResource" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsC" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197736" />
      <property role="20kJfa" value="feedbackType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UD" resolve="FeedbackType" />
    </node>
    <node concept="1TJgyj" id="DrEcBK1he2" role="1TKVEi">
      <property role="IQ2ns" value="746375748528706434" />
      <property role="20kJfa" value="author" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36Uz" resolve="UserType" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656rj" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532819" />
      <property role="TrG5h" value="requiresVerifiedContext" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="47EFX_kWWLs" role="1TKVEl">
      <property role="IQ2nx" value="4749802104983637084" />
      <property role="TrG5h" value="verificationRequirement" />
      <ref role="AX2Wp" node="47EFX_kWWLo" resolve="VerificationRequirement" />
    </node>
    <node concept="1TJgyi" id="3vc7gP656rk" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182532820" />
      <property role="TrG5h" value="uniquePerAuthorTarget" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36UJ">
    <property role="EcuMT" value="3890156942413033135" />
    <property role="TrG5h" value="RatingPolicy" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="DrEcBK18w3" role="1TKVEl">
      <property role="IQ2nx" value="746375748528670723" />
      <property role="TrG5h" value="minValue" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="DrEcBK18w5" role="1TKVEl">
      <property role="IQ2nx" value="746375748528670725" />
      <property role="TrG5h" value="maxValue" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="DrEcBK18w6" role="1TKVEl">
      <property role="IQ2nx" value="746375748528670726" />
      <property role="TrG5h" value="step" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36UM">
    <property role="EcuMT" value="3890156942413033138" />
    <property role="TrG5h" value="ValidationRule" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36UN" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwn_" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472293" />
      <property role="TrG5h" value="kind" />
      <ref role="AX2Wp" node="7vG6G7pGwnB" resolve="ValidationKind" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwnE" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472298" />
      <property role="TrG5h" value="severity" />
      <ref role="AX2Wp" node="7vG6G7pGwnw" resolve="RuleSeverity" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwnF" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472299" />
      <property role="TrG5h" value="expression" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwnG" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472300" />
      <property role="TrG5h" value="implementationId" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsc" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197708" />
      <property role="20kJfa" value="feedbackDefinition" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsw" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197728" />
      <property role="20kJfa" value="resourceType" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsx" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197729" />
      <property role="20kJfa" value="userType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36Uz" resolve="UserType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsy" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197730" />
      <property role="20kJfa" value="contextType" />
      <ref role="20lvS9" node="3nWBi3h36Ur" resolve="ContextType" />
    </node>
    <node concept="1TJgyj" id="3vc7gP65iGI" role="1TKVEi">
      <property role="IQ2ns" value="4020620510182583086" />
      <property role="20kJfa" value="invokedBy" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UP" resolve="AutomationRule" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36UP">
    <property role="EcuMT" value="3890156942413033141" />
    <property role="TrG5h" value="AutomationRule" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36UQ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwnH" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472301" />
      <property role="TrG5h" value="trigger" />
      <ref role="AX2Wp" node="77Q8YzgwKYR" resolve="TriggerEvent" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zs9" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197705" />
      <property role="20kJfa" value="feedbackDefinition" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zss" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197724" />
      <property role="20kJfa" value="context" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsu" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197726" />
      <property role="20kJfa" value="inContext" />
      <ref role="20lvS9" node="3nWBi3h36Ur" resolve="ContextType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsv" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197727" />
      <property role="20kJfa" value="uses" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UM" resolve="ValidationRule" />
    </node>
    <node concept="1TJgyj" id="77Q8YzgwKZY" role="1TKVEi">
      <property role="IQ2ns" value="8211790453394313214" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="conditions" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="77Q8YzgwKZ9" resolve="Condition" />
    </node>
    <node concept="1TJgyj" id="77Q8YzgwKZZ" role="1TKVEi">
      <property role="IQ2ns" value="8211790453394313215" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="actions" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="77Q8YzgwKZx" resolve="Action" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36US">
    <property role="EcuMT" value="3890156942413033144" />
    <property role="TrG5h" value="VerificationPolicy" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36UT" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwnK" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472304" />
      <property role="TrG5h" value="mode" />
      <ref role="AX2Wp" node="7vG6G7pGwnB" resolve="ValidationKind" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwnL" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472305" />
      <property role="TrG5h" value="appliesWhen" />
      <ref role="AX2Wp" node="77Q8YzgwKYR" resolve="TriggerEvent" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zs8" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197704" />
      <property role="20kJfa" value="feedbackDefinition" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
  </node>
  <node concept="1TIwiD" id="3nWBi3h36V4">
    <property role="EcuMT" value="3890156942413033156" />
    <property role="TrG5h" value="ResourceType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3nWBi3h36V5" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="7vG6G7pG76Q" role="1TKVEi">
      <property role="IQ2ns" value="8641311204900368822" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="attribute" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="7vG6G7pFVDW" resolve="Attribute" />
    </node>
    <node concept="1TJgyj" id="DrEcBK1hdW" role="1TKVEi">
      <property role="IQ2ns" value="746375748528706428" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="superType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="DrEcBK1hdQ" resolve="ResourceTypeSuperType" />
    </node>
    <node concept="1TJgyi" id="3vc7gP65iGE" role="1TKVEl">
      <property role="IQ2nx" value="4020620510182583082" />
      <property role="TrG5h" value="supportsMedia" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="7vG6G7pFVDE">
    <property role="EcuMT" value="8641311204900321898" />
    <property role="TrG5h" value="AuthorizationRule" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="7vG6G7pFVDF" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pGwn$" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900472292" />
      <property role="TrG5h" value="allowedAction" />
      <ref role="AX2Wp" node="7vG6G7pGwni" resolve="ActionKind" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsb" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197707" />
      <property role="20kJfa" value="feedbackTarget" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zsz" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197731" />
      <property role="20kJfa" value="context" />
      <ref role="20lvS9" node="3nWBi3h36Ur" resolve="ContextType" />
    </node>
    <node concept="1TJgyj" id="5fnjbJr$zs$" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197732" />
      <property role="20kJfa" value="resourceTarget" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="3vc7gP65iG_" role="1TKVEi">
      <property role="IQ2ns" value="4020620510182583077" />
      <property role="20kJfa" value="actor" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36Uz" resolve="UserType" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pFVDL">
    <property role="3F6X1D" value="8641311204900321905" />
    <property role="TrG5h" value="PrimitiveType" />
    <ref role="1H5jkz" node="7vG6G7pFVDM" resolve="TEXT" />
    <node concept="25R33" id="7vG6G7pFVDM" role="25R1y">
      <property role="3tVfz5" value="8641311204900321906" />
      <property role="TrG5h" value="TEXT" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDN" role="25R1y">
      <property role="3tVfz5" value="8641311204900321907" />
      <property role="TrG5h" value="NUMBER" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDO" role="25R1y">
      <property role="3tVfz5" value="8641311204900321908" />
      <property role="TrG5h" value="BOOLEAN" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDP" role="25R1y">
      <property role="3tVfz5" value="8641311204900321909" />
      <property role="TrG5h" value="DATE" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDQ" role="25R1y">
      <property role="3tVfz5" value="8641311204900321910" />
      <property role="TrG5h" value="DATETIME" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDR" role="25R1y">
      <property role="3tVfz5" value="8641311204900321911" />
      <property role="TrG5h" value="IMAGE" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDS" role="25R1y">
      <property role="3tVfz5" value="8641311204900321912" />
      <property role="TrG5h" value="VIDEO" />
    </node>
    <node concept="25R33" id="7vG6G7pFVDT" role="25R1y">
      <property role="3tVfz5" value="8641311204900321913" />
      <property role="TrG5h" value="URL" />
    </node>
  </node>
  <node concept="1TIwiD" id="7vG6G7pFVDW">
    <property role="EcuMT" value="8641311204900321916" />
    <property role="TrG5h" value="Attribute" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="7vG6G7pFVDX" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pFVDY" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900321918" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="7vG6G7pFVDL" resolve="PrimitiveType" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pFVDZ" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900321919" />
      <property role="TrG5h" value="required" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="7vG6G7pFVE0" role="1TKVEl">
      <property role="IQ2nx" value="8641311204900321920" />
      <property role="TrG5h" value="multiValued" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwmL">
    <property role="3F6X1D" value="8641311204900472241" />
    <property role="TrG5h" value="ContextKind" />
    <node concept="25R33" id="7vG6G7pGwmM" role="25R1y">
      <property role="3tVfz5" value="8641311204900472242" />
      <property role="TrG5h" value="GLOBAL" />
    </node>
    <node concept="25R33" id="7vG6G7pGwmN" role="25R1y">
      <property role="3tVfz5" value="8641311204900472243" />
      <property role="TrG5h" value="COMMUNITY" />
    </node>
    <node concept="25R33" id="7vG6G7pGwmO" role="25R1y">
      <property role="3tVfz5" value="8641311204900472244" />
      <property role="TrG5h" value="CHANNEL" />
    </node>
    <node concept="25R33" id="7vG6G7pGwmP" role="25R1y">
      <property role="3tVfz5" value="8641311204900472245" />
      <property role="TrG5h" value="CATALOG" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwmW">
    <property role="3F6X1D" value="8641311204900472252" />
    <property role="TrG5h" value="UserKind" />
    <node concept="25R33" id="7vG6G7pGwmX" role="25R1y">
      <property role="3tVfz5" value="8641311204900472253" />
      <property role="TrG5h" value="GENERIC" />
    </node>
    <node concept="25R33" id="7vG6G7pGwmY" role="25R1y">
      <property role="3tVfz5" value="8641311204900472254" />
      <property role="TrG5h" value="BUYER" />
    </node>
    <node concept="25R33" id="7vG6G7pGwmZ" role="25R1y">
      <property role="3tVfz5" value="8641311204900472255" />
      <property role="TrG5h" value="SELLER" />
    </node>
    <node concept="25R33" id="7vG6G7pGwn0" role="25R1y">
      <property role="3tVfz5" value="8641311204900472256" />
      <property role="TrG5h" value="CREATOR" />
    </node>
    <node concept="25R33" id="7vG6G7pGwn1" role="25R1y">
      <property role="3tVfz5" value="8641311204900472257" />
      <property role="TrG5h" value="MODERATOR" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwn4">
    <property role="3F6X1D" value="8641311204900472260" />
    <property role="TrG5h" value="ModerationMode" />
    <node concept="25R33" id="7vG6G7pGwn5" role="25R1y">
      <property role="3tVfz5" value="8641311204900472261" />
      <property role="TrG5h" value="AUTOMATIC" />
    </node>
    <node concept="25R33" id="7vG6G7pGwn6" role="25R1y">
      <property role="3tVfz5" value="8641311204900472262" />
      <property role="TrG5h" value="MANUAL" />
    </node>
    <node concept="25R33" id="7vG6G7pGwn7" role="25R1y">
      <property role="3tVfz5" value="8641311204900472263" />
      <property role="TrG5h" value="HYBRID" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwnb">
    <property role="3F6X1D" value="8641311204900472267" />
    <property role="TrG5h" value="ModerationDecision" />
    <ref role="1H5jkz" node="7vG6G7pGwnd" resolve="FLAGGED" />
    <node concept="25R33" id="7vG6G7pGwnc" role="25R1y">
      <property role="3tVfz5" value="8641311204900472268" />
      <property role="TrG5h" value="APPROVED" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnd" role="25R1y">
      <property role="3tVfz5" value="8641311204900472269" />
      <property role="TrG5h" value="FLAGGED" />
    </node>
    <node concept="25R33" id="7vG6G7pGwne" role="25R1y">
      <property role="3tVfz5" value="8641311204900472270" />
      <property role="TrG5h" value="HIDDEN" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnf" role="25R1y">
      <property role="3tVfz5" value="8641311204900472271" />
      <property role="TrG5h" value="REMOVED" />
    </node>
    <node concept="25R33" id="7vG6G7pGwng" role="25R1y">
      <property role="3tVfz5" value="8641311204900472272" />
      <property role="TrG5h" value="BLOCKED" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnh" role="25R1y">
      <property role="3tVfz5" value="8641311204900472273" />
      <property role="TrG5h" value="REJECTED" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwni">
    <property role="3F6X1D" value="8641311204900472274" />
    <property role="TrG5h" value="ActionKind" />
    <node concept="25R33" id="7vG6G7pGwnj" role="25R1y">
      <property role="3tVfz5" value="8641311204900472275" />
      <property role="TrG5h" value="READ" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnk" role="25R1y">
      <property role="3tVfz5" value="8641311204900472276" />
      <property role="TrG5h" value="CREATE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnl" role="25R1y">
      <property role="3tVfz5" value="8641311204900472277" />
      <property role="TrG5h" value="UPDATE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnm" role="25R1y">
      <property role="3tVfz5" value="8641311204900472278" />
      <property role="TrG5h" value="DELETE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnn" role="25R1y">
      <property role="3tVfz5" value="8641311204900472279" />
      <property role="TrG5h" value="COMMENT" />
    </node>
    <node concept="25R33" id="7vG6G7pGwno" role="25R1y">
      <property role="3tVfz5" value="8641311204900472280" />
      <property role="TrG5h" value="RATE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnp" role="25R1y">
      <property role="3tVfz5" value="8641311204900472281" />
      <property role="TrG5h" value="VOTE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnq" role="25R1y">
      <property role="3tVfz5" value="8641311204900472282" />
      <property role="TrG5h" value="REPORT" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnr" role="25R1y">
      <property role="3tVfz5" value="8641311204900472283" />
      <property role="TrG5h" value="SUBSCRIBE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnt" role="25R1y">
      <property role="3tVfz5" value="8641311204900472285" />
      <property role="TrG5h" value="MODERATE" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnu" role="25R1y">
      <property role="3tVfz5" value="8641311204900472286" />
      <property role="TrG5h" value="VALIDATE" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwnw">
    <property role="3F6X1D" value="8641311204900472288" />
    <property role="TrG5h" value="RuleSeverity" />
    <node concept="25R33" id="7vG6G7pGwnx" role="25R1y">
      <property role="3tVfz5" value="8641311204900472289" />
      <property role="TrG5h" value="INFO" />
    </node>
    <node concept="25R33" id="7vG6G7pGwny" role="25R1y">
      <property role="3tVfz5" value="8641311204900472290" />
      <property role="TrG5h" value="WARNING" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnz" role="25R1y">
      <property role="3tVfz5" value="8641311204900472291" />
      <property role="TrG5h" value="ERROR" />
    </node>
  </node>
  <node concept="25R3W" id="7vG6G7pGwnB">
    <property role="3F6X1D" value="8641311204900472295" />
    <property role="TrG5h" value="ValidationKind" />
    <node concept="25R33" id="7vG6G7pGwnC" role="25R1y">
      <property role="3tVfz5" value="8641311204900472296" />
      <property role="TrG5h" value="AUTOMATIC" />
    </node>
    <node concept="25R33" id="7vG6G7pGwnD" role="25R1y">
      <property role="3tVfz5" value="8641311204900472297" />
      <property role="TrG5h" value="MANUAL" />
    </node>
  </node>
  <node concept="1TIwiD" id="5fnjbJr$zvM">
    <property role="EcuMT" value="6041381794867197938" />
    <property role="TrG5h" value="ContextResourceTypeLink" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5fnjbJr$zvT" role="1TKVEi">
      <property role="IQ2ns" value="6041381794867197945" />
      <property role="20kJfa" value="resourceType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="25R3W" id="DrEcBK18vV">
    <property role="3F6X1D" value="746375748528670715" />
    <property role="TrG5h" value="FeedbackStatus" />
    <ref role="1H5jkz" node="DrEcBK18vX" resolve="ENABLED" />
    <node concept="25R33" id="DrEcBK18vX" role="25R1y">
      <property role="3tVfz5" value="746375748528670717" />
      <property role="TrG5h" value="ENABLED" />
    </node>
    <node concept="25R33" id="DrEcBK18vW" role="25R1y">
      <property role="3tVfz5" value="746375748528670716" />
      <property role="TrG5h" value="DISABLED" />
    </node>
  </node>
  <node concept="1TIwiD" id="DrEcBK1hdQ">
    <property role="EcuMT" value="746375748528706422" />
    <property role="TrG5h" value="ResourceTypeSuperType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="DrEcBK1hdS" role="1TKVEi">
      <property role="IQ2ns" value="746375748528706424" />
      <property role="20kJfa" value="superType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
  </node>
  <node concept="1TIwiD" id="DrEcBK1hdX">
    <property role="EcuMT" value="746375748528706429" />
    <property role="TrG5h" value="UserTypeSuperType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="DrEcBK1hdY" role="1TKVEi">
      <property role="IQ2ns" value="746375748528706430" />
      <property role="20kJfa" value="superType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3nWBi3h36Uz" resolve="UserType" />
    </node>
  </node>
  <node concept="25R3W" id="3vc7gP656r2">
    <property role="3F6X1D" value="4020620510182532802" />
    <property role="TrG5h" value="FeedbackKind" />
    <node concept="25R33" id="3vc7gP656r3" role="25R1y">
      <property role="3tVfz5" value="4020620510182532803" />
      <property role="TrG5h" value="COMMENT" />
    </node>
    <node concept="25R33" id="3vc7gP656r4" role="25R1y">
      <property role="3tVfz5" value="4020620510182532804" />
      <property role="TrG5h" value="REVIEW" />
    </node>
    <node concept="25R33" id="3vc7gP656r5" role="25R1y">
      <property role="3tVfz5" value="4020620510182532805" />
      <property role="TrG5h" value="REACTION" />
    </node>
    <node concept="25R33" id="3vc7gP656r6" role="25R1y">
      <property role="3tVfz5" value="4020620510182532806" />
      <property role="TrG5h" value="VOTE" />
    </node>
    <node concept="25R33" id="3vc7gP656r7" role="25R1y">
      <property role="3tVfz5" value="4020620510182532807" />
      <property role="TrG5h" value="REPORT" />
    </node>
    <node concept="25R33" id="3vc7gP656r8" role="25R1y">
      <property role="3tVfz5" value="4020620510182532808" />
      <property role="TrG5h" value="SUBSCRIPTION" />
    </node>
  </node>
  <node concept="25R3W" id="3vc7gP656rb">
    <property role="3F6X1D" value="4020620510182532811" />
    <property role="TrG5h" value="FeedbackSubjectScope" />
    <ref role="1H5jkz" node="3vc7gP656re" resolve="RESOURCE_OR_FEEDBACK" />
    <node concept="25R33" id="3vc7gP656rc" role="25R1y">
      <property role="3tVfz5" value="4020620510182532812" />
      <property role="TrG5h" value="RESOURCE_ONLY" />
    </node>
    <node concept="25R33" id="3vc7gP656rd" role="25R1y">
      <property role="3tVfz5" value="4020620510182532813" />
      <property role="TrG5h" value="FEEDBACK_ONLY" />
    </node>
    <node concept="25R33" id="3vc7gP656re" role="25R1y">
      <property role="3tVfz5" value="4020620510182532814" />
      <property role="TrG5h" value="RESOURCE_OR_FEEDBACK" />
    </node>
  </node>
  <node concept="1TIwiD" id="47EFX_kWWKX">
    <property role="EcuMT" value="4749802104983637053" />
    <property role="TrG5h" value="SortingPolicy" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="47EFX_kWWLw" role="1TKVEi">
      <property role="IQ2ns" value="4749802104983637088" />
      <property role="20kJfa" value="appliesToResource" />
      <ref role="20lvS9" node="3nWBi3h36V4" resolve="ResourceType" />
    </node>
    <node concept="1TJgyj" id="47EFX_kWWLx" role="1TKVEi">
      <property role="IQ2ns" value="4749802104983637089" />
      <property role="20kJfa" value="appliesToFeedback" />
      <ref role="20lvS9" node="3nWBi3h36UG" resolve="FeedbackDefinition" />
    </node>
    <node concept="1TJgyj" id="47EFX_kWWLy" role="1TKVEi">
      <property role="IQ2ns" value="4749802104983637090" />
      <property role="20kJfa" value="inContext" />
      <ref role="20lvS9" node="3nWBi3h36Ur" resolve="ContextType" />
    </node>
    <node concept="PrWs8" id="47EFX_kWWKY" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="47EFX_kWWLa" role="1TKVEl">
      <property role="IQ2nx" value="4749802104983637066" />
      <property role="TrG5h" value="criterion" />
      <ref role="AX2Wp" node="47EFX_kWWL3" resolve="SortCriterion" />
    </node>
    <node concept="1TJgyi" id="47EFX_kWWLb" role="1TKVEl">
      <property role="IQ2nx" value="4749802104983637067" />
      <property role="TrG5h" value="direction" />
      <ref role="AX2Wp" node="47EFX_kWWL7" resolve="SortDirection" />
    </node>
  </node>
  <node concept="25R3W" id="47EFX_kWWL3">
    <property role="3F6X1D" value="4749802104983637059" />
    <property role="TrG5h" value="SortCriterion" />
    <ref role="1H5jkz" node="47EFX_kWWL4" resolve="DATE" />
    <node concept="25R33" id="47EFX_kWWL4" role="25R1y">
      <property role="3tVfz5" value="4749802104983637060" />
      <property role="TrG5h" value="DATE" />
    </node>
    <node concept="25R33" id="47EFX_kWWL5" role="25R1y">
      <property role="3tVfz5" value="4749802104983637061" />
      <property role="TrG5h" value="VALUE" />
    </node>
  </node>
  <node concept="25R3W" id="47EFX_kWWL7">
    <property role="3F6X1D" value="4749802104983637063" />
    <property role="TrG5h" value="SortDirection" />
    <ref role="1H5jkz" node="47EFX_kWWL9" resolve="DESC" />
    <node concept="25R33" id="47EFX_kWWL8" role="25R1y">
      <property role="3tVfz5" value="4749802104983637064" />
      <property role="TrG5h" value="ASC" />
    </node>
    <node concept="25R33" id="47EFX_kWWL9" role="25R1y">
      <property role="3tVfz5" value="4749802104983637065" />
      <property role="TrG5h" value="DESC" />
    </node>
  </node>
  <node concept="25R3W" id="47EFX_kWWLf">
    <property role="3F6X1D" value="4749802104983637071" />
    <property role="TrG5h" value="FeedbackPolarity" />
    <node concept="25R33" id="47EFX_kWWLg" role="25R1y">
      <property role="3tVfz5" value="4749802104983637072" />
      <property role="TrG5h" value="NONE" />
    </node>
    <node concept="25R33" id="47EFX_kWWLh" role="25R1y">
      <property role="3tVfz5" value="4749802104983637073" />
      <property role="TrG5h" value="LIKE_DISLIKE" />
    </node>
    <node concept="25R33" id="47EFX_kWWLi" role="25R1y">
      <property role="3tVfz5" value="4749802104983637074" />
      <property role="TrG5h" value="UP_DOWN" />
    </node>
  </node>
  <node concept="25R3W" id="47EFX_kWWLo">
    <property role="3F6X1D" value="4749802104983637080" />
    <property role="TrG5h" value="VerificationRequirement" />
    <node concept="25R33" id="47EFX_kWWLp" role="25R1y">
      <property role="3tVfz5" value="4749802104983637081" />
      <property role="TrG5h" value="NONE" />
    </node>
    <node concept="25R33" id="47EFX_kWWLq" role="25R1y">
      <property role="3tVfz5" value="4749802104983637082" />
      <property role="TrG5h" value="OPTIONAL" />
    </node>
    <node concept="25R33" id="47EFX_kWWLr" role="25R1y">
      <property role="3tVfz5" value="4749802104983637083" />
      <property role="TrG5h" value="REQUIRED" />
    </node>
  </node>
  <node concept="25R3W" id="77Q8YzgwKYR">
    <property role="3F6X1D" value="8211790453394313143" />
    <property role="TrG5h" value="TriggerEvent" />
    <node concept="25R33" id="77Q8YzgwKYS" role="25R1y">
      <property role="3tVfz5" value="8211790453394313144" />
      <property role="TrG5h" value="ON_RESOURCE_CREATE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKYV" role="25R1y">
      <property role="3tVfz5" value="8211790453394313147" />
      <property role="TrG5h" value="ON_RESOURCE_UPDATE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKYW" role="25R1y">
      <property role="3tVfz5" value="8211790453394313148" />
      <property role="TrG5h" value="ON_RESOURCE_DELETE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKYX" role="25R1y">
      <property role="3tVfz5" value="8211790453394313149" />
      <property role="TrG5h" value="ON_FEEDBACK_CREATE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKYZ" role="25R1y">
      <property role="3tVfz5" value="8211790453394313151" />
      <property role="TrG5h" value="ON_FEEDBACK_UPDATE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZ2" role="25R1y">
      <property role="3tVfz5" value="8211790453394313154" />
      <property role="TrG5h" value="ON_FEEDBACK_DELETE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZ4" role="25R1y">
      <property role="3tVfz5" value="8211790453394313156" />
      <property role="TrG5h" value="ON_REPORT_SUBMITTED" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZ6" role="25R1y">
      <property role="3tVfz5" value="8211790453394313158" />
      <property role="TrG5h" value="ON_REPORT_THRESHOLD" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZ8" role="25R1y">
      <property role="3tVfz5" value="8211790453394313160" />
      <property role="TrG5h" value="ON_MANUAL_REQUEST" />
    </node>
  </node>
  <node concept="1TIwiD" id="77Q8YzgwKZ9">
    <property role="EcuMT" value="8211790453394313161" />
    <property role="TrG5h" value="Condition" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="77Q8YzgwKZa" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="77Q8YzgwKZc" role="1TKVEl">
      <property role="IQ2nx" value="8211790453394313164" />
      <property role="TrG5h" value="operator" />
      <ref role="AX2Wp" node="77Q8YzgwKZg" resolve="ConditionOperator" />
    </node>
    <node concept="1TJgyi" id="77Q8YzgwKZv" role="1TKVEl">
      <property role="IQ2nx" value="8211790453394313183" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="1bC37d4A6C6" role="1TKVEi">
      <property role="IQ2ns" value="1362352576491186694" />
      <property role="20kJfa" value="field" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7vG6G7pFVDW" resolve="Attribute" />
    </node>
  </node>
  <node concept="25R3W" id="77Q8YzgwKZg">
    <property role="3F6X1D" value="8211790453394313168" />
    <property role="TrG5h" value="ConditionOperator" />
    <ref role="1H5jkz" node="77Q8YzgwKZh" resolve="CONTAINS_KEYWORDS" />
    <node concept="25R33" id="77Q8YzgwKZh" role="25R1y">
      <property role="3tVfz5" value="8211790453394313169" />
      <property role="TrG5h" value="CONTAINS_KEYWORDS" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZj" role="25R1y">
      <property role="3tVfz5" value="8211790453394313171" />
      <property role="TrG5h" value="MATCH_REGEX" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZl" role="25R1y">
      <property role="3tVfz5" value="8211790453394313173" />
      <property role="TrG5h" value="NOT_MATCH_REGEX" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZn" role="25R1y">
      <property role="3tVfz5" value="8211790453394313175" />
      <property role="TrG5h" value="HAS_PROPERTY" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZp" role="25R1y">
      <property role="3tVfz5" value="8211790453394313177" />
      <property role="TrG5h" value="NOT_HAS_PROPERTY" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZr" role="25R1y">
      <property role="3tVfz5" value="8211790453394313179" />
      <property role="TrG5h" value="HAS_SPECIFIC_PROPERTY" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZt" role="25R1y">
      <property role="3tVfz5" value="8211790453394313181" />
      <property role="TrG5h" value="NOT_HAS_SPECIFIC_PROPERTY" />
    </node>
  </node>
  <node concept="1TIwiD" id="77Q8YzgwKZx">
    <property role="EcuMT" value="8211790453394313185" />
    <property role="TrG5h" value="Action" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="77Q8YzgwKZy" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="77Q8YzgwKZT" role="1TKVEl">
      <property role="IQ2nx" value="8211790453394313209" />
      <property role="TrG5h" value="kind" />
      <ref role="AX2Wp" node="77Q8YzgwKZB" resolve="ActionResultKind" />
    </node>
    <node concept="1TJgyi" id="77Q8YzgwKZU" role="1TKVEl">
      <property role="IQ2nx" value="8211790453394313210" />
      <property role="TrG5h" value="message" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="25R3W" id="77Q8YzgwKZB">
    <property role="3F6X1D" value="8211790453394313191" />
    <property role="TrG5h" value="ActionResultKind" />
    <node concept="25R33" id="77Q8YzgwKZC" role="25R1y">
      <property role="3tVfz5" value="8211790453394313192" />
      <property role="TrG5h" value="DISPLAY_MESSAGE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZF" role="25R1y">
      <property role="3tVfz5" value="8211790453394313195" />
      <property role="TrG5h" value="FLAG_CONTENT" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZH" role="25R1y">
      <property role="3tVfz5" value="8211790453394313197" />
      <property role="TrG5h" value="HIDE_CONTENT" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZJ" role="25R1y">
      <property role="3tVfz5" value="8211790453394313199" />
      <property role="TrG5h" value="REMOVE_CONTENT" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZL" role="25R1y">
      <property role="3tVfz5" value="8211790453394313201" />
      <property role="TrG5h" value="BLOCK_SUBMISSION" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZN" role="25R1y">
      <property role="3tVfz5" value="8211790453394313203" />
      <property role="TrG5h" value="NOTIFY_MODERATOR" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZP" role="25R1y">
      <property role="3tVfz5" value="8211790453394313205" />
      <property role="TrG5h" value="AUTO_APPROVE" />
    </node>
    <node concept="25R33" id="77Q8YzgwKZR" role="25R1y">
      <property role="3tVfz5" value="8211790453394313207" />
      <property role="TrG5h" value="AUTO_REJECT" />
    </node>
  </node>
</model>

