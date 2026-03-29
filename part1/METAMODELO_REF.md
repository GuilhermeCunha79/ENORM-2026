# Metamodelo REF v2 (Resource Evaluation and Feedback)

Este documento descreve o [metamodelo REF](../diagrams/metamodel/ref-metamodel-v2.png), construído a partir dos modelos de domínio dos contextos considerados (Amazon, Reddit e YouTube).

Os modelos de domínio específicos desses contextos podem ser encontrados em:

- [Modelo de Domínio - Amazon](../diagrams/Scenario%20Amazon/Amazon_DomainModel.png)
- [Modelo de Domínio - Reddit](../diagrams/Scenario%20Reddit/Reddit_DomainModel.png)
- [Modelo de Domínio - YouTube](../diagrams/Scenario%20Youtube/Youtube_DomainModel.png)

## 1. Objetivo

O REF v2 foi desenhado para manter a ideia de união e generalização dos cenários Amazon, YouTube e Reddit, mas com maior capacidade para:

- modelar contexto (global, comunidade, canal, catálogo)
- separar tipo de feedback de definição de feedback
- representar políticas de moderação e verificação explicitamente
- suportar evolução/refatoração do próprio modelo

## 2. Visão global do REF v2

O elemento raiz `RefModel` agrega blocos conceptuais organizados em seis áreas:

- Core: `RefModel`
- Actors & Context: `UserType`, `ContextType`
- Structure: `ResourceType`, `Attribute`, `ResourceRelation`
- Feedback: `FeedbackType`, `FeedbackDefinition`, `FeedbackPolicy`, `RatingPolicy`
- Governance & Behavior: `ValidationRule`, `ModerationPolicy`, `AuthorizationRule`, `AutomationRule`, `VerificationPolicy`
- Evolution: `EvolutionRule`, `RefactoringOperation`

Isto permite cobrir, no mesmo metamodelo, estrutura de dados, regras de negócio, moderação/automação e manutenção evolutiva da DSL.

## 2.1 Resumo sucinto dos conceitos

### Classes principais

- RefModel: raiz da especificação, agrega todos os elementos do metamodelo.
- UserType: papel de utilizador e respetiva especialização por herança.
- ContextType: âmbito onde recursos e regras se aplicam.
- ResourceType: tipo de recurso do domínio (ex.: produto, video, post).
- Attribute: propriedade tipada de um recurso.
- ResourceRelation: ligação estrutural entre tipos de recurso.
- FeedbackType: tipo abstrato de feedback (comment, review, vote, report, etc.).
- FeedbackDefinition: configuração concreta de feedback (autor, tipo e alvo).
- FeedbackPolicy: estado de disponibilidade de um feedback (ativo/inativo).
- RatingPolicy: definição da escala de avaliação.
- ValidationRule: regra de validação do domínio.
- ModerationPolicy: política de moderação (modo, trigger e decisão).
- AuthorizationRule: permissão de ação para um ator sobre um alvo.
- AutomationRule: regra automática acionada por trigger/condição.
- VerificationPolicy: política para verificar contexto do feedback (ex.: compra verificada).
- EvolutionRule: regra de migração/evolução entre versões.
- RefactoringOperation: operação concreta usada na evolução do modelo.

### Enumerações

- UserKind: categorias de utilizador.
- ContextKind: categorias de contexto.
- PrimitiveType: tipos primitivos de dados.
- FeedbackKind: categorias de feedback.
- FeedbackSubjectScope: define se o alvo do feedback é recurso, feedback ou ambos.
- FeedbackStatus: estado operacional do feedback.
- RatingScaleKind: formato da escala de rating.
- ValidationKind: validação automática ou manual.
- RuleSeverity: impacto da regra de validação.
- ModerationMode: modo de moderação.
- ModerationDecision: resultado da moderação.
- ActionKind: ações que podem ser autorizadas.
- RefactoringKind: tipos de operações de refatoração.

## 3. Mapeamento dos novos cenários para o metamodelo

### 3.1 Amazon

- `Product`, `Order`, `OrderItem` e `ProductReview` mapeiam para `ResourceType` e `FeedbackDefinition`.
- Regras de compra verificada e unicidade de review por autor/alvo mapeiam para `FeedbackDefinition.requiresVerifiedContext` e `FeedbackDefinition.uniquePerAuthorTarget`.
- Escala 1..5 mapeia para `RatingPolicy` (`minValue`, `maxValue`, `step`, `scaleKind`).
- Moderação de reviews mapeia para `ModerationPolicy` e `ValidationRule`.

### 3.2 YouTube

- `Video` e `Comment` mapeiam para `ResourceType`. As relações de resposta em comentário mapeiam para `ResourceRelation` recursiva e/ou `FeedbackDefinition.parent`.
- `Like`, `Report`, `Subscription` mapeiam para `FeedbackType.kind` (`REACTION`, `REPORT`, `SUBSCRIPTION`) e respetivas `FeedbackDefinition`.
- Regras de moderação de conteúdo mapeiam para `ModerationPolicy` e `ValidationRule` com severidade.

### 3.3 Reddit

- `Post` e `Comment` seguem o mesmo padrão estrutural de `ResourceType` + `ResourceRelation`.
- `Vote` e `Report` encaixam naturalmente em `FeedbackKind.VOTE` e `FeedbackKind.REPORT`.
- Automações por trigger/condition mapeiam diretamente para `AutomationRule`.
- Políticas da comunidade e moderação por contexto mapeiam para `ContextType` + `AuthorizationRule` + `ModerationPolicy`.

## 4. Elementos do metamodelo

### 4.1 Core

#### RefModel

- `name: String`
- `version: String`

Função: raiz da especificação. Contém todos os elementos do domínio REF.

### 4.2 Actors & Context

#### UserType

- `name: String`
- `kind: UserKind`
- relação `superTypes` (0..* para 0..*)

`UserKind`: `GENERIC`, `BUYER`, `SELLER`, `CREATOR`, `MODERATOR`.

#### ContextType

- `name: String`
- `kind: ContextKind`
- composição para `ResourceType` (`contains`)

`ContextKind`: `GLOBAL`, `COMMUNITY`, `CHANNEL`, `CATALOG`.

### 4.3 Structure

#### ResourceType

- `name: String`
- `supportsMedia: boolean`
- composição de `Attribute`
- relação `superTypes` com outros `ResourceType`

#### Attribute

- `name: String`
- `type: PrimitiveType`
- `required: boolean`
- `multiValued: boolean`

`PrimitiveType`: `TEXT`, `NUMBER`, `BOOLEAN`, `DATE`, `DATETIME`, `IMAGE`, `VIDEO`, `URL`.

#### ResourceRelation

- `name: String`
- `sourceCardinality: String`
- `targetCardinality: String`
- `containment: boolean`
- `recursive: boolean`

Permite representar associações entre recursos (incluindo hierarquias e auto-relações).

### 4.4 Feedback

#### FeedbackType

- `name: String`
- `kind: FeedbackKind`
- `subjectScope: FeedbackSubjectScope`
- `hasRating: boolean`
- `recursive: boolean`
- `allowsMedia: boolean`

`FeedbackKind`: `COMMENT`, `REVIEW`, `REACTION`, `VOTE`, `REPORT`, `SUBSCRIPTION`.

`FeedbackSubjectScope`: `RESOURCE_ONLY`, `FEEDBACK_ONLY`, `RESOURCE_OR_FEEDBACK`.

#### FeedbackDefinition

- `name: String`
- `requiresVerifiedContext: boolean`
- `uniquePerAuthorTarget: boolean`
- referência para `FeedbackType` (`type`)
- referência para `ResourceType` (`subjectResource`, opcional)
- referência para `UserType` (`author`)
- referências opcionais para outras `FeedbackDefinition` (`subjectFeedback`, `parent`)
- composição opcional de `FeedbackPolicy` e `RatingPolicy`

#### FeedbackPolicy

- `status: FeedbackStatus`

`FeedbackStatus`: `ENABLED`, `DISABLED`.

#### RatingPolicy

- `minValue: Number`
- `maxValue: Number`
- `step: Number`
- `scaleKind: RatingScaleKind`

`RatingScaleKind`: `NUMERIC`, `ORDINAL`, `PERCENTAGE`.

### 4.5 Governance & Behavior

#### ValidationRule

- `name: String`
- `kind: ValidationKind`
- `severity: RuleSeverity`
- `expression: String`
- `implementationId: String`
- alvo opcional: `appliesToResource` e/ou `appliesToFeedback`
- pode ser invocada por `AutomationRule`

`ValidationKind`: `AUTOMATIC`, `MANUAL`.

`RuleSeverity`: `INFO`, `WARNING`, `ERROR`.

#### ModerationPolicy

- `name: String`
- `mode: ModerationMode`
- `trigger: String`
- `decision: ModerationDecision`
- monitoriza recurso e/ou feedback
- pode ser executada por um `UserType`
- pode estar associada a um `ContextType`

`ModerationMode`: `AUTOMATIC`, `MANUAL`, `HYBRID`.

`ModerationDecision`: `APPROVED`, `FLAGGED`, `HIDDEN`, `REMOVED`, `BLOCKED`, `REJECTED`.

#### AuthorizationRule

- `allowedAction: ActionKind`
- referência para `UserType` (`actor`)
- contexto opcional (`ContextType`)
- alvo em `ResourceType` ou `FeedbackDefinition`

`ActionKind`: `READ`, `CREATE`, `UPDATE`, `DELETE`, `COMMENT`, `RATE`, `VOTE`, `REPORT`, `SUBSCRIBE`, `MODERATE`, `VALIDATE`.

#### AutomationRule

- `name: String`
- `trigger: String`
- `condition: String`
- `actionDescription: String`
- contexto opcional em `ResourceType`/`ContextType`
- atua sobre `FeedbackDefinition`
- reutiliza `ValidationRule` por referência

#### VerificationPolicy

- `name: String`
- `mode: ValidationKind`
- `appliesWhen: String`
- ligada a `FeedbackDefinition` (`verifies`)

Representa explicitamente políticas de verificação do contexto do feedback (ex.: compra verificada no caso Amazon).

### 4.6 Evolution

#### EvolutionRule

- `name: String`
- `fromVersion: String`
- `toVersion: String`
- `transformationId: String`
- composição de uma ou mais `RefactoringOperation`

#### RefactoringOperation

- `name: String`
- `kind: RefactoringKind`
- `scriptId: String`

`RefactoringKind`: `RENAME_ELEMENT`, `MOVE_ELEMENT`, `SPLIT_ELEMENT`, `MERGE_ELEMENT`, `CHANGE_TYPE`.

## 5. Relações estruturais principais

As relações mais relevantes do v2 são:

- `RefModel` contém todas as definições centrais (`UserType`, `ResourceType`, `FeedbackType`, `FeedbackDefinition`, políticas, regras e elementos de evolução).
- `FeedbackDefinition` é o ponto de ligação entre autor, tipo de feedback e alvo (recurso ou feedback).
- `AuthorizationRule`, `ModerationPolicy` e `AutomationRule` aplicam comportamento por contexto e por alvo.
- `ValidationRule` concentra restrições formais reutilizáveis por feedback e automação.
- `VerificationPolicy` separa a verificação de contexto do resto das regras de validação.

## 6. Restrições explícitas no diagrama v2

O diagrama [diagrams/metamodel/ref-metamodel-v2.puml](diagrams/metamodel/ref-metamodel-v2.puml) define notas com restrições importantes:

1. `ValidationRule` deve ter pelo menos um alvo (`ResourceType` ou `FeedbackDefinition`).
2. Se `FeedbackPolicy.status = DISABLED`, não é permitida criação de novas instâncias para a `FeedbackDefinition` associada.
3. `RatingPolicy` só pode existir quando `FeedbackType.hasRating = true`.
4. O alvo em `FeedbackDefinition` deve respeitar `FeedbackType.subjectScope` e ter sempre pelo menos um alvo válido.

## 7. Justificação das principais evoluções face ao modelo anterior

As mudanças do v2 respondem diretamente a necessidades que ficaram mais claras nos novos cenários:

- Introdução de `ContextType` para distinguir regras globais, por comunidade, por canal e por catálogo.
- Introdução de `FeedbackKind` e `FeedbackSubjectScope` para tipar melhor variações de feedback.
- Separação entre `ValidationRule`, `ModerationPolicy` e `VerificationPolicy` para reduzir ambiguidades de responsabilidade.
- Expansão de `ActionKind` para incluir operações específicas de plataformas sociais (`VOTE`, `SUBSCRIBE`, `REPORT`, etc.).
- Inclusão de bloco de evolução (`EvolutionRule`, `RefactoringOperation`) para gerir mudanças da DSL entre versões.