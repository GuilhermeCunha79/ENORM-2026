# Metamodelo REF (Resource Evaluation and Feedback) — Documentação Detalhada

Este documento descreve em pormenor o metamodelo da linguagem REF DSL, criado no âmbito do projeto ENORM (Parte 1), e as justificações baseadas no **enunciado do projeto** e nos cenários de aplicação (YouTube, Amazon, Reddit).

---

## 1. Objetivo e fundamentação

O enunciado do projeto ENORM prevê a conceção de uma linguagem de domínio para **avaliação e feedback sobre recursos** (REF — *Resource Evaluation and Feedback*), aplicável a vários cenários reais. Em vez de modelar cada cenário à parte, o metamodelo foi desenhado como **união e generalização** dos três cenários-alvo referidos no enunciado:

- **YouTube** (vídeos, comentários, likes, canais)
- **Amazon** (produtos, reviews, compra verificada)
- **Reddit** (posts, votos, comentários em thread, automations)

> *«The metamodel for the REF DSL was designed as the **union and generalization** of the three target scenarios described in the **assignment**: YouTube, Amazon and Reddit.»* — Relatório da equipa (Part 1, Design of the Metamodel).

Os três cenários partilham conceitos comuns que o metamodelo unifica:

- Existem **recursos** que são avaliados (vídeos, produtos, publicações).
- Existem **tipos de utilizador / papéis** (espetadores, compradores, vendedores, moderadores) com permissões distintas.
- Existem várias formas de **feedback** (ratings, comentários, votos, denúncias).
- Existem **comportamentos e processos** em torno do feedback (verificação de reviews, moderação, automações).

O enunciado fornece ainda uma **projeção textual de exemplo** (USER TYPES, RESOURCE TYPE, FEEDBACK TYPE, FEEDBACK, VALIDATION, AUTOMATION, etc.), com a qual o metamodelo foi alinhado para suportar essa representação.

---

## 2. Visão geral do metamodelo

O metamodelo REF tem um elemento raiz (**RefModel**) que agrega todos os tipos de utilizador, tipos de recurso, tipos e definições de feedback, regras de validação e autorização e regras de automação. A representação gráfica está no diagrama PlantUML em `../diagrams/ref-metamodel.puml`.

Abaixo descreve-se cada conceito, as **ligações entre eles**, os **atributos** e a **justificação** de cada escolha (com citações do enunciado quando aplicável).

---

## 3. Ligações entre conceitos (relações)

As ligações definem **quem contém quem** (composição) e **quem referencia quem** (associação). A escolha entre contenção e referência segue o princípio: elementos que só existem no contexto de outro são **contidos**; elementos que podem ser partilhados ou reutilizados são **referenciados**.

### 3.1 RefModel como raiz (contenção)

| Ligação | Tipo | Cardinalidade | Porquê |
|--------|------|----------------|--------|
| RefModel → UserType | **contenção** (o–) | 1 → * | Os tipos de utilizador pertencem a uma única especificação REF; sem o modelo não fazem sentido isolados. O enunciado agrupa tudo num único bloco (ex.: «REF MODEL MyApp»). |
| RefModel → ResourceType | **contenção** | 1 → * | Os tipos de recurso (vídeo, produto, post) são definidos no âmbito da aplicação; mesma justificação. |
| RefModel → FeedbackType | **contenção** | 1 → * | Os tipos de feedback (rating, comentário, voto) são definidos no modelo; podem ser reutilizados em várias FeedbackDefinitions. |
| RefModel → FeedbackDefinition | **contenção** | 1 → * | Cada definição (ex.: «reviews sobre produtos») pertence a uma aplicação; liga tipo de feedback, recurso e writers. |
| RefModel → AutomationRule | **contenção** | 1 → * | As automações (ex.: Reddit) são regras da aplicação; o enunciado inclui-as como bloco próprio. |

**Porquê contenção e não referência:** Todos estes elementos são **definidos** no modelo REF; não são entidades externas. Guardá-los dentro do RefModel permite um ficheiro de especificação autocontido e evita referências a modelos externos.

### 3.2 UserType → UserType (superTypes)

| Ligação | Tipo | Cardinalidade | Porquê |
|--------|------|----------------|--------|
| UserType → UserType : **superTypes** | **referência** (––) | 0..* → 0..* | Um papel pode estender vários outros (ex.: Buyer é User); vários papéis podem ter o mesmo supertipo. É **referência** porque o UserType referenciado já existe no RefModel; não o duplicamos. Evita ciclos e self-reference (garantido por restrições). Base: cenário Amazon «Buyer is a user», projeção «buyer IS user». |

### 3.3 ResourceType (contenção de atributos e regras de autorização)

| Ligação | Tipo | Cardinalidade | Porquê |
|--------|------|----------------|--------|
| ResourceType → Attribute | **contenção** | 1 → * | Os atributos (nome, descrição, preço, imagem) são a **estrutura** do recurso; não são partilhados entre recursos. Projeção «RESOURCE TYPE product : name AS TEXT, …». |
| ResourceType → AuthorizationRule | **contenção** | 1 → * | Cada recurso pode ter regras próprias de quem pode READ/WRITE/MODERATE/etc. sobre ele; as regras são específicas desse ResourceType. |

### 3.4 FeedbackType (sem filhos obrigatórios no diagrama)

FeedbackType é referenciado por **FeedbackDefinition**; não contém outros elementos do metamodelo além de **attributes** (contenção opcional de Attribute para campos do feedback, ex.: texto, rating). No diagrama principal, FeedbackType tem apenas atributos primitivos (name, hasRating, recursive); em implementações pode ter `attributes : Attribute [*]` para campos adicionais (como na gramática Xtext).

### 3.5 FeedbackDefinition (referências + contenção)

| Ligação | Tipo | Cardinalidade | Porquê |
|--------|------|----------------|--------|
| FeedbackDefinition → FeedbackType : **type** | **referência** | 1 → 1 | A definição **usa** um tipo de feedback já definido no RefModel (ex.: «ProductReview usa o tipo ReviewType»). Referência para reutilizar o mesmo FeedbackType em várias definições se necessário. |
| FeedbackDefinition → ResourceType : **subject** | **referência** | 1 → 1 | O feedback aplica-se a um **recurso** (ex.: reviews sobre Product). Referência porque o ResourceType já existe no modelo. Enunciado: «evaluation of a product». |
| FeedbackDefinition → UserType : **writers** | **referência** | 1 → * | Quem **pode criar** este feedback (ex.: Buyer para reviews). Referência porque os UserTypes estão definidos no RefModel. Projeção «WRITE buyer». |
| FeedbackDefinition → ValidationRule | **contenção** | 1 → * | As regras de validação (ex.: compra verificada, texto não vazio) são **específicas desta** definição de feedback; por isso contidas. R1–R6 do cenário Amazon aplicam-se a ProductReview. |

### 3.6 AutomationRule → ValidationRule (uso opcional)

| Ligação | Tipo | Cardinalidade | Porquê |
|--------|------|----------------|--------|
| AutomationRule → ValidationRule : **uses** | **referência** | 0..* → * | Uma automação pode **reutilizar** regras de validação já definidas (ex.: numa FeedbackDefinition) para expressar condições. Referência para não duplicar regras. No diagrama aparece como «uses»; em algumas implementações pode ser opcional. |

### 3.7 AuthorizationRule → UserType : role

| Ligação | Tipo | Cardinalidade | Porquê |
|--------|------|----------------|--------|
| AuthorizationRule → UserType : **role** | **referência** | 1 → 1 | A regra diz «este **papel** (UserType) pode executar esta ação». O UserType já existe no RefModel; referência evita duplicação. |

---

## 4. Atributos: resumo e justificação

Cada atributo existe para cobrir os cenários ou a projeção textual do enunciado.

| Classe | Atributo | Tipo | Porquê |
|--------|----------|------|--------|
| **RefModel** | name | String | Identifica a aplicação/modelo (ex.: «MyApp»); necessário para a projeção «REF MODEL MyApp» e para mensagens de validação. |
| **UserType** | name | String | Nome do papel (User, Buyer, Seller, Moderator); obrigatório para referências (superTypes, writers, role) e para a projeção «USER TYPES user, buyer». |
| **ResourceType** | name | String | Nome do recurso (Video, Product, Post); obrigatório para referências (subject em FeedbackDefinition) e projeção «RESOURCE TYPE product». |
| **Attribute** | name | String | Nome do campo (title, description, rating); necessário para leitura/geração de código. |
| **Attribute** | type | PrimitiveType | Tipo do valor (TEXT, NUMBER, etc.); os cenários precisam de texto, números (rating 1–5), booleanos (verified), datas, imagem, vídeo. |
| **FeedbackType** | name | String | Nome do tipo de feedback (ReviewType, CommentType); usado em FeedbackDefinition.type. |
| **FeedbackType** | hasRating | Boolean | Diferencia feedback com **estrelas/número** (Amazon 1–5) de feedback só textual (comentário). Cenário Amazon: «rating based on a five-star scale». |
| **FeedbackType** | recursive | Boolean | Indica se o feedback pode ter **respostas em thread** (comentários a comentários, Reddit/YouTube). Um único booleano evita modelar recursão explícita no metamodelo. |
| **FeedbackType** | attributes | Attribute [*] | Campos adicionais do feedback (texto do comentário, anexos); Amazon «text comment», «media attachments». |
| **FeedbackDefinition** | name | String | Nome da definição (ex.: productReview); identifica esta ligação tipo–recurso–writers–validações. |
| **ValidationRule** | name | String | Nome opcional da regra; útil para mensagens e documentação. |
| **ValidationRule** | kind | ValidationKind | AUTOMATIC vs. MANUAL; cenário Amazon «verification can be automatic (system rules) or manual (performed by moderators)». |
| **ValidationRule** | implementationId | String | Identificador para **ligar** a regra a código (validadores, geradores); enunciado e Activity 3 referem regras com lógica concreta (R1–R6). |
| **AuthorizationRule** | allowedAction | ActionKind | Que ação está permitida (READ, WRITE, MODERATE, etc.); projeção «WRITE buyer», «MODERATE moderator». |
| **AutomationRule** | name | String | Nome da automação; necessário para identificação e projeção. |
| **AutomationRule** | trigger | String | **Evento ou condição** que dispara a automação; Reddit e enunciado «AUTOMATION onNewReport(...)». |
| **AutomationRule** | condition | String | Condição opcional (expressão ou descrição); permite regras mais ricas. |
| **AutomationRule** | actionDescription | String | Descrição do que acontece quando a regra dispara; suporta documentação e geração. |

Os **enumerados** (**PrimitiveType**, **ValidationKind**, **ActionKind**) fixam os valores permitidos para que a linguagem seja precisa e os três cenários (YouTube, Amazon, Reddit) fiquem cobertos sem precisar de tipos ou ações indefinidas.

---

## 5. Elemento raiz: RefModel

**RefModel** é a raiz de uma especificação REF. Contém:

- `name : String` — nome do modelo (ex.: da aplicação).
- Listas de: **UserType**, **ResourceType**, **FeedbackType**, **FeedbackDefinition**, **AutomationRule**.

**Base no enunciado:** O enunciado estrutura a especificação em blocos (tipos de utilizador, tipos de recurso, tipos de feedback, definições de feedback, validações, automações). O RefModel corresponde a esse **contentor único** que agrupa todos esses blocos para uma dada aplicação, tal como na projeção textual de exemplo (ex.: «REF MODEL MyApp»). As **ligações** RefModel → * (secção 3.1) justificam que todos estes elementos sejam **contidos** no modelo.

---

## 6. UserType (papéis / tipos de utilizador)

**UserType** modela um **papel ou tipo de utilizador** na aplicação.

- `name : String` — nome do tipo (ex.: `User`, `Buyer`, `Seller`, `Moderator`).
- `superTypes : UserType [*]` — referência a outros UserTypes, permitindo uma **hierarquia de papéis** (ex.: Buyer *é um* User).

**Base no enunciado e cenários:**

- No cenário **Amazon** (Activity 3): «A generic **User** represents anyone registered in the system. A **Buyer** is a user who has purchased products… A **Seller** is a user (or organization) that offers products for sale.» Isto justifica a necessidade de **tipos de utilizador** e de **herança** (Buyer/Seller como subtipos de User).
- A projeção textual de exemplo no enunciado inclui construções do tipo «USER TYPES user, buyer IS user, seller», que correspondem a UserType e à relação **superTypes**.

---

## 7. ResourceType e Attribute (recursos avaliáveis)

**ResourceType** representa um **tipo de recurso** que pode ser avaliado (vídeo, produto, publicação, comentário, etc.).

- `name : String` — nome do tipo (ex.: `Video`, `Product`, `Post`).
- `attributes : Attribute [*]` — propriedades do recurso (nome, descrição, preço, imagem, etc.).
- `authorizationRules : AuthorizationRule [*]` — que ações cada UserType pode executar sobre este recurso.

**Attribute** descreve uma propriedade nomeada de um recurso (ou de um tipo de feedback):

- `name : String`
- `type : PrimitiveType` — tipo primitivo (TEXT, NUMBER, BOOLEAN, DATE, IMAGE, VIDEO).

**Base no enunciado:**

- O enunciado fala em **recursos** que são avaliados; nos cenários aparecem **vídeos** (YouTube), **produtos** (Amazon), **posts/comentários** (Reddit), cada um com **atributos** (título, descrição, rating, texto, etc.).
- A projeção textual de exemplo inclui «RESOURCE TYPE product : name AS TEXT, description AS TEXT, image AS IMAGE», alinhada com ResourceType e Attribute e com o **PrimitiveType** para cobrir os campos típicos dos três cenários.

---

## 8. PrimitiveType (tipos de dados)

**PrimitiveType** é um enumerado: **TEXT**, **NUMBER**, **BOOLEAN**, **DATE**, **IMAGE**, **VIDEO**.

**Base no enunciado e cenários:** Os cenários exigem texto (comentários, descrições), números (ratings 1–5, preços), booleanos (compra verificada), datas, e media (imagem, vídeo). O enunciado e as regras de domínio (ex.: R1 — rating entre 1 e 5) justificam estes tipos para cobrir os três cenários de forma uniforme.

---

## 9. FeedbackType (estrutura do feedback)

**FeedbackType** define a **estrutura de um tipo de feedback** (rating com estrelas, comentário, voto, etc.).

- `name : String`
- `hasRating : Boolean` — indica se o feedback inclui uma **avaliação numérica** (ex.: 1–5 estrelas).
- `recursive : Boolean` — indica se o feedback pode ter **respostas em thread** (ex.: comentários que respondem a comentários).
- `attributes : Attribute [*]` — campos adicionais (texto, anexos, etc.).

**Base no enunciado e cenários:**

- **Amazon (Activity 3):** «A **ProductReview** represents a user's evaluation of a product. Each review contains a **rating** based on a five-star scale (1 to 5) and a **text** comment. Reviews may include **media attachments**.» Isto justifica **hasRating** (rating 1–5) e **attributes** (texto, media).
- **Reddit/YouTube:** comentários em thread justificam **recursive** (comentários que podem ter respostas).
- O enunciado referencia tipos de feedback distintos (ratings, comentários, votos), cobertos por FeedbackType com estes flags e atributos.

---

## 10. FeedbackDefinition (ligação feedback–recurso–utilizadores)

**FeedbackDefinition** liga um **FeedbackType** a um **ResourceType** (recurso ao qual o feedback se aplica) e define **quem pode criar** esse feedback e **que regras de validação** se aplicam.

- `name : String`
- `type : FeedbackType [1]` — referência ao tipo de feedback.
- `subject : ResourceType [1]` — recurso alvo (ex.: Product para ProductReview).
- `writers : UserType [*]` — tipos de utilizador que podem escrever este feedback (ex.: Buyer para reviews de produto).
- `validationRules : ValidationRule [*]` — regras que o feedback deve satisfazer (ex.: compra verificada, texto não vazio).

**Base no enunciado:**

- **Amazon:** «A Buyer is a user who… can create reviews that can be marked as "verified purchase".» Isto implica uma **definição de feedback** (ProductReview) sobre o recurso Product, com writers = Buyer e regras de validação (verified purchase).
- A projeção textual de exemplo no enunciado inclui construções do tipo «FEEDBACK productReview : rateType, product, WRITE buyer, VALIDATION: …», correspondentes a FeedbackDefinition (type, subject, writers, validationRules).

---

## 11. ValidationRule (regras de domínio)

**ValidationRule** representa uma **regra de domínio** que as instâncias (ou o feedback) devem cumprir.

- `name : String` (opcional)
- `kind : ValidationKind` — **AUTOMATIC** (aplicada pelo sistema) ou **MANUAL** (aplicada por moderadores/humanos).
- `implementationId : String` — identificador para ligar a lógica concreta em validadores ou geradores de código.

**Base no enunciado e Activity 3 (Amazon):**

- As regras R1–R6 do cenário Amazon (rating 1–5, compra verificada, verificação única por review, atributos obrigatórios da verificação, moderador em verificação manual, texto não vazio) são exemplos de **ValidationRule**.
- «Verification can be **automatic** (system rules) or **manual** (performed by moderators/support staff)» — citado no relatório de domínio (Activity 3) — justifica o enumerado **ValidationKind** (AUTOMATIC, MANUAL) e a presença de ValidationRule no metamodelo.

---

## 12. ValidationKind (tipo de validação)

**ValidationKind**: **AUTOMATIC** | **MANUAL**.

**Base no enunciado:** Conforme descrito para ValidationRule e no cenário Amazon (verificação automática vs. manual).

---

## 13. AuthorizationRule (permissões)

**AuthorizationRule** modela a **permissão** de um tipo de utilizador para executar uma **ação** sobre um recurso ou sobre feedback.

- `allowedAction : ActionKind` — ação permitida.
- `role : UserType [1]` — tipo de utilizador ao qual a permissão se aplica.

**ActionKind** (enumerado): **READ**, **WRITE**, **CREATE**, **UPDATE**, **DELETE**, **MODERATE**, **REPORT**, **VALIDATE**.

**Base no enunciado:**

- O enunciado e os cenários exigem controlo de **quem pode fazer o quê** (criar feedback, moderar, reportar, validar). A projeção textual de exemplo inclui «WRITE buyer», «MODERATE moderator», alinhadas com AuthorizationRule e ActionKind.
- **AuthorizationRule** aparece tanto em **ResourceType** (permissões sobre o recurso) como indiretamente em **FeedbackDefinition** através de **writers** (quem pode escrever esse feedback), cobrindo os aspetos de autorização referidos no enunciado.

---

## 14. AutomationRule (automações)

**AutomationRule** abstrai **mecanismos de automação** (ex.: automations do Reddit, processos automáticos de moderação ou verificação).

- `name : String`
- `trigger : String` — evento ou condição que dispara a automação.
- `condition : String` (opcional)
- `actionDescription : String` (opcional) — descrição do que acontece quando a regra é acionada.

**Base no enunciado:**

- O enunciado refere **automações** (ex.: Reddit) e processos automáticos (verificação, moderação). «**AutomationRule** – abstracts automation mechanisms like **Reddit's automations** and other automatic processes (e.g. auto-moderation, automatic verification).» — Relatório da equipa.
- A projeção textual de exemplo inclui «AUTOMATION onNewReport(...) DO ...», correspondente a AutomationRule com trigger/condição e ação.

---

## 15. Resumo das citações e alinhamento com o enunciado

| Conceito do metamodelo | Base / citação no enunciado e relatórios |
|------------------------|------------------------------------------|
| **RefModel** | Contentor único que agrupa todos os blocos da especificação REF, conforme a estrutura e projeção textual do enunciado. |
| **UserType** + **superTypes** | Cenário Amazon: User, Buyer, Seller; projeção «USER TYPES user, buyer IS user, seller». |
| **ResourceType** + **Attribute** | Recursos avaliáveis (vídeo, produto, post) com atributos; projeção «RESOURCE TYPE … name AS TEXT, …». |
| **PrimitiveType** | Tipos necessários para os três cenários (texto, número, rating, boolean, data, imagem, vídeo). |
| **FeedbackType** (hasRating, recursive, attributes) | Amazon: rating 1–5 e texto; Reddit/YouTube: comentários em thread; media attachments. |
| **FeedbackDefinition** (type, subject, writers, validationRules) | Amazon: ProductReview sobre Product, writers = Buyer; projeção «FEEDBACK … WRITE buyer, VALIDATION». |
| **ValidationRule** + **ValidationKind** | Regras R1–R6 (Amazon); verificação automática vs. manual. |
| **AuthorizationRule** + **ActionKind** | Quem pode criar, ler, moderar, reportar, validar; projeção «WRITE buyer», «MODERATE moderator». |
| **AutomationRule** | Reddit automations; processos automáticos de moderação/verificação; projeção «AUTOMATION … DO …». |

---

## 16. Conclusão

O metamodelo REF foi desenhado para ser a **união e generalização** dos três cenários-alvo do enunciado (YouTube, Amazon, Reddit), cobrindo:

- **Estrutura:** ResourceType, Attribute, UserType, FeedbackType, FeedbackDefinition.
- **Autorização:** AuthorizationRule e ActionKind.
- **Comportamento:** ValidationRule (incl. AUTOMATIC/MANUAL) e AutomationRule.

As **ligações** entre conceitos (secção 3) seguem o critério contenção vs. referência: elementos definidos no modelo são contidos no RefModel ou no respetivo pai; elementos reutilizados (UserType, ResourceType, FeedbackType) são referenciados. Os **atributos** (secção 4) foram escolhidos para cobrir a projeção textual do enunciado e as necessidades dos três cenários (nome, hasRating, recursive, kind, implementationId, trigger, etc.).

O diagrama completo do metamodelo encontra-se em `../diagrams/ref-metamodel.puml`; as restrições e refactorings estão documentados na secção *Constraints and Refactorings* do relatório da equipa em `part1/readme.md`.
