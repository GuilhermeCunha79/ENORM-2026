# Tutorial detalhado (Activity 4 e 5) alinhado com `ref-metamodel-v2`

Este tutorial explica, passo a passo, o que deves fazer para cumprir as **Atividades 4 e 5** do enunciado P1 com base no novo metamodelo:

- `diagrams/metamodel/ref-metamodel-v2.puml`
- `diagrams/metamodel/ref-metamodel-v2.png`

Inclui:
- onde clicar no Eclipse;
- que ficheiros editar;
- resultados esperados em cada passo;
- ligação direta ao que o enunciado pede.

---

## 0) Referências do enunciado (o que estamos a cumprir)

Documento: `diagrams/enunciado/enorm_project-p1.pdf`

- **Secção 2.4 – Activity 4: Design Domain Metamodel**
  - Team tasks:
    - Design a metamodel for the new DSL;
    - Use formal notation (class diagram or similar);
    - Add metamodel design to team report.
  - Individual tasks:
    - Implement the metamodel in the selected tool.

- **Secção 2.4 – Activity 5: Design Metamodel Constraints and Transformations**
  - Team tasks:
    - Add constraints;
    - Use formal notation (OCL or pseudo-code);
    - Include refactorings for constraints when suitable;
    - Add constraints/refactorings design to report.
  - Individual tasks (Xtext):
    - Create Xtext DSL from existing Ecore;
    - Implement constraints with Validation Rules;
    - Implement refactorings with Quick Fixes.

- **Secção 3.2 / 3.3 / 3.4**
  - Metamodel deve ser união dos cenários;
  - Definir constraints formais;
  - Definir transformações/refactorings para corrigir erros.

---

## 1) Estado atual do teu projeto (importante antes de mexer)

Com base no repositório atual:

- O metamodelo **de referência** é o `v2` em PlantUML (`diagrams/metamodel/ref-metamodel-v2.puml`).
- O Ecore atual em `part1/eclipse/pt.isep.enorm.ref/model/ref.ecore` está **mais simples** que o v2 (faltam classes/enums/relações do v2).
- O Xtext atual (`RefDsl.xtext`, `RefDslValidator`, `RefDslQuickfixProvider`) implementa apenas parte das regras.

Conclusão: para cumprir 4 e 5 **de acordo com o novo metamodelo**, tens de:
1) atualizar implementação Ecore para v2;
2) atualizar/regenerar Xtext a partir desse Ecore;
3) alinhar constraints/refactorings com o novo domínio.

---

## 2) Preparação (5-10 min)

### 2.1 Fazer backup lógico

1. Abre terminal na raiz do repo.
2. Cria branch de trabalho:
   - `git checkout -b feat/activity4-5-v2-alignment`

**Resultado esperado:** branch nova ativa, para poderes reverter sem risco.

### 2.2 Abrir workspace correto no Eclipse

1. `File` -> `Switch Workspace` -> `Other...`
2. Seleciona a pasta de workspace onde estão os projetos:
   - `part1/tool2-xtext` (ou a tua pasta Eclipse usada no dia a dia)
3. Reinicia Eclipse quando pedir.

**Resultado esperado:** no `Package Explorer` vês os projetos abaixo (importa-os se o workspace estiver vazio).

**Onde estão no disco (importante):**

| Projeto | Pasta no repositório |
|---------|----------------------|
| `pt.isep.enorm.ref` | `part1/eclipse/pt.isep.enorm.ref` (metamodelo EMF / `model/ref.ecore`) |
| `pt.isep.enorm.refdsl` | `part1/tool2-xtext/pt.isep.enorm.refdsl` |
| `pt.isep.enorm.refdsl.ui` | `part1/tool2-xtext/pt.isep.enorm.refdsl.ui` |
| `pt.isep.enorm.refdsl.ide` | `part1/tool2-xtext/pt.isep.enorm.refdsl.ide` |

O projeto **`pt.isep.enorm.ref` não está dentro de `part1/tool2-xtext`**. Para o importar: **File → Import → Existing Projects into Workspace**, **Browse** em `part1/eclipse` (ou em `part1/eclipse/pt.isep.enorm.ref`) e marca `pt.isep.enorm.ref`.

Lista esperada no `Package Explorer`:

- `pt.isep.enorm.ref`
- `pt.isep.enorm.refdsl`
- `pt.isep.enorm.refdsl.ui`
- `pt.isep.enorm.refdsl.ide`

---

## 3) Activity 4 (Team + Individual) com `ref-metamodel-v2`

> Enunciado: secção 2.4 Activity 4 + secção 3.2.

## 3.1 Team task A4.1: consolidar design formal do metamodelo

1. Usa `diagrams/metamodel/ref-metamodel-v2.puml` como fonte de verdade.
2. Confirma que o diagrama mostra:
   - pacotes: Core, Actors & Context, Structure, Feedback, Governance & Behavior;
   - classes e enums;
   - relações com cardinalidades.
3. Exporta/usa `ref-metamodel-v2.png` no relatório.

**Resultado esperado:** a equipa tem um diagrama formal único e atualizado.

---

## 3.2 Individual task A4.2: implementar o metamodelo v2 em Ecore

### 3.2.1 Abrir e editar o Ecore

1. No `Package Explorer`, abre:
   - `pt.isep.enorm.ref/model/ref.ecore`
2. Se abrir em editor texto:
   - botão direito no ficheiro -> `Open With` -> `Sample Ecore Model Editor`.

**Nota (repositório):** o `ref.ecore` neste projeto já foi atualizado para corresponder ao `ref-metamodel-v2.puml` (pacote `ref`, enums v2, classes e referências). Se quiseres rever o que foi modelado, abre o ficheiro no editor Ecore. Depois de atualizar o GenModel e gerar código, segue **`pt.isep.enorm.ref/model/README_REF_V2.md`** (reload do `ref.genmodel`, **Generate Model Code**, e impacto no Xtext).

### 3.2.2 Atualizar o pacote

No nó raiz `EPackage ref`:
- `name = ref`
- `nsURI` (mantém estável no teu projeto; se mudares, terás impacto no Xtext)
- `nsPrefix = ref`

### 3.2.3 Criar/atualizar EEnums do v2

No editor Ecore:
1. Seleciona `EPackage`.
2. Botão direito -> `New Child` -> `EEnum`.
3. Define nome e adiciona `ELiterals`.

Enums que devem existir (v2):
- `UserKind` (GENERIC, BUYER, SELLER, CREATOR, MODERATOR)
- `ContextKind` (GLOBAL, COMMUNITY, CHANNEL, CATALOG)
- `PrimitiveType` (TEXT, NUMBER, BOOLEAN, DATE, DATETIME, IMAGE, VIDEO, URL)
- `FeedbackKind` (COMMENT, REVIEW, REACTION, VOTE, REPORT, SUBSCRIPTION)
- `FeedbackSubjectScope` (RESOURCE_ONLY, FEEDBACK_ONLY, RESOURCE_OR_FEEDBACK)
- `FeedbackStatus` (ENABLED, DISABLED)
- `RatingScaleKind` (NUMERIC, ORDINAL, PERCENTAGE)
- `ValidationKind` (AUTOMATIC, MANUAL)
- `RuleSeverity` (INFO, WARNING, ERROR)
- `ModerationMode` (AUTOMATIC, MANUAL, HYBRID)
- `ModerationDecision` (APPROVED, FLAGGED, HIDDEN, REMOVED, BLOCKED, REJECTED)
- `ActionKind` (READ, CREATE, UPDATE, DELETE, COMMENT, RATE, VOTE, REPORT, SUBSCRIBE, MODERATE, VALIDATE)

**Resultado esperado:** lista de EEnums alinhada ao `ref-metamodel-v2.puml`.

### 3.2.4 Criar/atualizar EClasses do v2

Cria/atualiza EClasses (botão direito -> `New Child` -> `EClass`):
- `RefModel`
- `UserType`
- `ContextType`
- `ResourceType`
- `Attribute`
- `ResourceRelation`
- `FeedbackType`
- `FeedbackDefinition`
- `FeedbackPolicy`
- `RatingPolicy`
- `ValidationRule`
- `ModerationPolicy`
- `AuthorizationRule`
- `AutomationRule`
- `VerificationPolicy`

Depois, para cada classe, adiciona `EAttribute` com os tipos certos (EString, EBoolean, EInt, EDouble ou enum apropriado), conforme v2.

### 3.2.5 Criar relações (EReference) com cardinalidades

Para cada associação do v2:
1. Na classe origem -> botão direito -> `New Child` -> `EReference`.
2. Define:
   - `name`
   - `eType` (classe destino)
   - `lowerBound` / `upperBound`
   - `containment` (true/false)
3. Se tiver inversa, define `eOpposite` (quando fizer sentido no teu modelo).

Exemplos críticos:
- `RefModel` contem listas (`containment=true`) de tipos/configurações.
- `ResourceType` contem `Attribute`.
- `FeedbackDefinition` referencia `type`, `subjectResource`, `author`, `subjectFeedback`, `policy`, `rating`.
- `ValidationRule` referencia alvos (`appliesToResource`, `appliesToFeedback`) e `invokedBy`.
- `AuthorizationRule` referencia `actor`, `context`, `resourceTarget`, `feedbackTarget`.

**Resultado esperado:** estrutura Ecore equivalente ao diagrama v2.

### 3.2.6 Gerar código EMF (obrigatório para validar Activity 4 individual)

1. Abre `pt.isep.enorm.ref/model/ref.genmodel`.
2. No editor, seleciona nó raiz `Ref` (GenPackage).
3. Botão direito -> `Generate Model Code`.
4. (Opcional) `Generate Edit Code`.

**Resultado esperado:**
- pasta `src-gen` atualizada em `pt.isep.enorm.ref`;
- classes geradas (`RefPackage`, `RefFactory`, `*Impl`).

### 3.2.7 Verificação final Activity 4

Checklist:
- [ ] Diagrama formal v2 no relatório (team).
- [ ] `ref.ecore` alinhado ao v2 (individual).
- [ ] `src-gen` sem erros de compilação.
- [ ] Projeto `pt.isep.enorm.ref` sem erros na vista `Problems`.

---

## 4) Activity 5 (Team): constraints e refactorings do metamodelo

> Enunciado: secção 2.4 Activity 5 + secção 3.3 e 3.4.

## 4.1 Team task A5.1: definir constraints formais

Usa pseudo-código (aceite pelo enunciado quando OCL não for usado).

Documento já criado e recomendado:
- `diagrams/metamodel/Metamodel_Constraints_Essential.md`

Este documento deve estar na secção de equipa do relatório, com:
- constraint;
- severidade (error/warning);
- refactoring associado (quando possível).

### Constraints essenciais mínimas (recomendadas)

- unicidade de nomes (`UserType`, `ResourceType`, `FeedbackType`);
- sem self/ciclos em heranças (`superTypes`);
- `FeedbackDefinition` com target consistente com `subjectScope`;
- `ValidationRule` com pelo menos um target;
- `AuthorizationRule` com actor e target;
- coerência de `RatingPolicy` (`hasRating`, min<max);
- campos obrigatórios em `AutomationRule` (trigger/action).

**Resultado esperado:** catálogo de constraints/refactorings formalizado no relatório.

---

## 4.2 Team task A5.2: definir refactorings para corrigir erros

Para cada constraint corrigível automaticamente, define quick fix:
- capitalizar nomes;
- remover self de `superTypes`;
- adicionar writer default;
- padding de `implementationId`;
- set default values quando seguro.

Para constraints ambíguas (ex.: duplicados, targets errados), manter sem auto-fix e pedir decisão ao utilizador.

**Resultado esperado:** tabela constraint -> refactoring no relatório de equipa.

---

## 5) Activity 5 (Individual Xtext): implementação técnica

> Enunciado diz explicitamente para Xtext: criar DSL com base no Ecore existente e usar Validation Rules + Quick Fixes.

## 5.1 Atualizar Xtext para o novo metamodelo

Tens 2 opções. A recomendada é a A.

### Opção A (recomendada): recriar linguagem Xtext a partir do Ecore atualizado

1. `File` -> `New` -> `Other...`
2. `Xtext` -> `Xtext Project from Existing Ecore Models` -> `Next`.
3. Preenche:
   - Project name (podes usar novo sufixo, ex. `pt.isep.enorm.refdsl.v2`);
   - Language name;
   - File extension (`refdsl`).
4. Em `EPackage selection`, adiciona/seleciona o `ref.ecore` atualizado.
5. `Finish`.

**Resultado esperado:**
- gramática inicial gerada a partir do Ecore v2;
- projetos `*.ui`, `*.ide`, `*.tests` gerados.

### Opção B: manter projeto atual e atualizar manualmente

1. Edita `RefDsl.xtext` para cobrir novas classes/enums/referências do v2.
2. Garante correspondência 1:1 com Ecore atualizado.
3. Mais risco de inconsistência; usa apenas se já tens muito código acoplado.

---

## 5.2 Regenerar artefactos Xtext

1. Abre `pt.isep.enorm.refdsl/src/.../GenerateRefDsl.mwe2`.
2. Botão direito -> `Run As` -> `MWE2 Workflow`.
3. Espera terminar no `Console`.

**Resultado esperado:**
- atualização de `src-gen`;
- parser/serializer/validator base atualizados;
- sem erros de geração.

---

## 5.3 Implementar constraints no `RefDslValidator.java`

Ficheiro:
- `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/validation/RefDslValidator.java`

Passos:
1. Define constantes `INVALID_*` para cada regra.
2. Cria métodos `@Check`.
3. Usa `error(...)` para bloqueantes e `warning(...)` para recomendações.
4. Referencia o feature correto com `RefDslPackage.Literals....`.

**Resultado esperado:** ao editar `.refdsl`, aparecem markers na vista `Problems`.

---

## 5.4 Implementar refactorings no `RefDslQuickfixProvider.java`

Ficheiro:
- `pt.isep.enorm.refdsl.ui/src/pt/isep/enorm/refdsl/ui/quickfix/RefDslQuickfixProvider.java`

Passos:
1. Para cada constraint com auto-correção, cria método `@Fix(CODIGO)`.
2. Usa `IssueResolutionAcceptor.accept(...)`.
3. Implementa `ISemanticModification` para alterar o modelo.

**Resultado esperado:** `Ctrl+1` mostra quick fixes e corrige os erros automaticamente quando aplicável.

---

## 5.5 Testar em runtime (Eclipse Application)

1. `Run` -> `Run Configurations...`
2. Cria/usa `Eclipse Application` para os plugins do workspace.
3. `Run`.
4. Na instância runtime:
   - `File` -> `New` -> `Project` -> `General` -> `Project`;
   - cria ficheiro `*.refdsl`;
   - escreve modelo com erros propositados.
5. Testa:
   - validações aparecem;
   - quick fixes com `Ctrl+1` funcionam.

**Resultado esperado:** evidência funcional da Activity 5 individual.

---

## 6) Activity 6 (Team + Individual): Model Projections/Visualizations

> Enunciado (2.4 + 3.5): produzir projeções **textuais** e **gráficas (PlantUML)** dos modelos da DSL.

### 6.0 Cobertura explícita do enunciado (check rápido)

Esta secção cobre integralmente o que a Activity 6 pede:
- pesquisa e definição de notações textual/gráfica (team);
- descrição no relatório de como **cada elemento** do metamodelo é projetado (team);
- implementação técnica das projeções na ferramenta escolhida (individual);
- geração de PlantUML (gráfico) e texto (textual) a partir dos modelos;
- descrição da implementação no relatório individual.

No caso específico de Xtext (tool 2), este tutorial usa abordagem prática com geração por código Java; também é válido usar mecanismos de code generation do Xtext, desde que o resultado final (projeções) seja gerado e demonstrado.

## 6.1 Team task A6.1: definir notação textual e gráfica (para relatório)

### Objetivo
Antes de programar, fechar em equipa como cada elemento do metamodelo é representado:
- em texto (projeção textual);
- em gráfico (PlantUML).

### Onde clicar / o que fazer
1. Abre `diagrams/metamodel/ref-metamodel-v2.puml`.
2. Abre `diagrams/enunciado/enorm_project-p1.pdf` (secção 3.5 e Listing 3.1).
3. No relatório da equipa, cria uma tabela:

| Elemento do metamodelo | Representação textual | Representação gráfica (PlantUML) |
|---|---|---|
| `UserType` | `USER TYPE <name>` | classe com estereótipo `<<UserType>>` |
| `ResourceType` | `RESOURCE TYPE <name> ...` | classe com atributos |
| `FeedbackType` | `FEEDBACK TYPE <name> ...` | classe com notas de política |
| `ValidationRule` | `VALIDATION <kind> ...` | nó/regra ligado ao alvo |

4. Define convenções mínimas:
   - nomes em maiúsculas para cabeçalhos (`USER TYPES`, `RESOURCE TYPES`, etc.);
   - cardinalidades visíveis no gráfico (`1`, `0..*`, ...);
   - enums mostrados em listas ou notas.

**Resultado esperado:** tabela de mapeamento textual/gráfico pronta no relatório.

---

## 6.2 Individual task A6.2: implementar geração de projeção textual

### Estratégia simples (aceite para P1)
Usar o gerador já criado pelo Xtext (`RefDslGenerator.xtend`) para gerar um ficheiro `.txt` a partir de um modelo `.refdsl`.

### Passo-a-passo no Eclipse (projeto `v2`)
1. No `Package Explorer`, abre:
   - `pt.isep.enorm.refdsl.v2/src/pt/isep/enorm/refdsl/v2/generator/RefDslGenerator.xtend`.
2. No método `doGenerate(...)`, implementa geração textual para os elementos do modelo (ex.: `Attribute`).
3. Gera ficheiros com:
   - `fsa.generateFile('projections/<nome>.txt', conteudoTextual)`.
4. Guarda o ficheiro (`Ctrl+S`) e confirma que não há erros de compilação no projeto.
5. Na instância runtime, cria/edita `test.refdsl` e guarda (`Ctrl+S`) para disparar o gerador.
6. Verifica no projeto runtime:
   - pasta `src-gen/projections/`;
   - ficheiros `.txt` gerados automaticamente.

### Formato recomendado da saída textual (`.txt`)
Exemplo:
```
ATTRIBUTE: content
  required: true
  multiValued: false
  type: TEXT
```

### Verificação
- o ficheiro é criado em `src-gen/projections/<modelo>.txt` (no projeto runtime);
- conteúdo reflete o estado atual do modelo;
- sem edição manual (gerado automaticamente).

---

## 6.3 Individual task A6.3: implementar geração PlantUML (projeção gráfica)

### Objetivo
Gerar um `.puml` automaticamente a partir do mesmo modelo `.refdsl`, no mesmo `RefDslGenerator.xtend`.

### Passo-a-passo no Eclipse
1. No mesmo `RefDslGenerator.xtend`, no `doGenerate(...)`, adiciona também geração PlantUML.
2. Gera texto PlantUML com esta estrutura base:
   - `@startuml`
   - elementos/nós/arestas
   - `@enduml`
3. Guarda em:
   - `fsa.generateFile('projections/<modelo>.puml', conteudoPlantUml)`.
4. (Opcional) renderiza para PNG:
   - VSCode/Cursor com extensão PlantUML, ou
   - PlantUML local (`plantuml arquivo.puml`).

### Esqueleto mínimo da saída `.puml`
```
@startuml
class Attribute {
  name : String
  required : Boolean
  multiValued : Boolean
  type : PrimitiveType
}
@enduml
```

### Verificação
- `.puml` gerado sem erro em `src-gen/projections/`;
- abre/renderiza corretamente;
- representa os elementos do modelo.

---

## 6.4 Demonstração da Activity 6 (o que mostrar)

Na defesa/aula e no relatório individual:
1. modelo `.refdsl` de entrada;
2. ficheiro textual gerado (`.txt`);
3. ficheiro gráfico gerado (`.puml` + imagem);
4. pequena explicação de como executaste o gerador.

---

## 7) Activity 7 (Application Engineering) super detalhada

> Enunciado (2.4): modelar cenários, injetar erros, validar/refatorar, gerar projeções para todos os modelos.

### 7.0 Cobertura explícita do enunciado (check rápido)

Esta secção cobre integralmente o que a Activity 7 pede:
- modelação de aplicações para os cenários (team);
- implementação dos modelos na ferramenta (individual);
- verificação de constraints e aplicação de refactorings/quick fixes (individual);
- inclusão de erros intencionais e correção guiada por validação/refatoração (individual);
- geração de projeções/visualizações para todos os modelos (individual);
- documentação de tudo no relatório (team + individual).

## 7.1 Team task A7.1: desenhar modelos dos cenários (Amazon/YouTube/Reddit)

### Onde clicar / como preparar
1. No relatório da equipa, cria secção `Application Engineering`.
2. Para cada cenário (Amazon, YouTube, Reddit):
   - desenha um modelo exemplo (estilo object diagram/UML);
   - identifica instâncias principais e relações.
3. Guarda as figuras no repositório (`diagrams/...`) e referencia no relatório.

**Resultado esperado:** 3 modelos de cenário definidos pela equipa.

---

## 7.2 Individual task A7.2: implementar modelos no editor da DSL

### Passos no runtime Eclipse
1. Abre runtime (`Run Configurations` -> `Eclipse Application` -> `Run`).
2. Em `RefDslRuntimeTest`, cria:
   - `amazon.refdsl`
   - `youtube.refdsl`
   - `reddit.refdsl`
3. Preenche cada ficheiro com um modelo válido para o cenário.
4. Guarda e confirma que o parser aceita.

**Resultado esperado:** 3 modelos `.refdsl` instanciados no editor.

---

## 7.3 Individual task A7.3: injetar erros intencionais + validar + quick fix

### Em cada ficheiro de cenário
1. Introduz erros de propósito (ex.: nomes fora da convenção, campos obrigatórios vazios, etc.).
2. Guarda e abre `Problems`.
3. Clica no erro/aviso e usa `Ctrl+1`.
4. Aplica quick fix.
5. Guarda novamente e confirma redução de erros.

**Nota importante (evita bloqueios):**
- Para demonstrar `Ctrl+1`, privilegia **erros semânticos** (produzidos por `@Check` no validator).
- Erros de **sintaxe/parser** (ex.: `no viable alternative`, `missing EOF`) normalmente não têm quick fix custom e não invalidam a atividade.

### Evidência mínima por cenário
- print com erro;
- print do quick fix (`Ctrl+1`);
- print depois da correção.

**Resultado esperado:** constraints/refactorings demonstrados nos 3 cenários.

---

## 7.4 Individual task A7.4: gerar projeções para todos os modelos

1. Executa o gerador textual para:
   - `amazon.refdsl`, `youtube.refdsl`, `reddit.refdsl`.
2. Executa o gerador PlantUML para os mesmos.
3. Confirma saída em:
   - `projections/amazon.txt`, `projections/amazon.puml`, ...
4. (Opcional) gera PNG e inclui no relatório.

**Resultado esperado:** todos os cenários com projeção textual e gráfica.

---

## 7.5 Critério de fecho da Activity 7

Podes considerar Activity 7 fechada quando:
1. existem 3 modelos de cenário implementados na DSL;
2. cada modelo foi validado com constraints/quick fixes;
3. cada modelo tem projeção textual e projeção gráfica;
4. tudo está documentado no relatório individual e de equipa.

---

## 8) O que tens de colocar no relatório (exatamente)

## 8.1 Team report – Activity 4

- diagrama formal do metamodelo (`ref-metamodel-v2.png`);
- explicação breve por pacote;
- justificação de união dos cenários.

## 8.2 Team report – Activity 5

- tabela de constraints (pseudo-código/OCL);
- tabela de refactorings por constraint;
- critérios de severidade (error/warning).

## 8.3 Team report – Activity 6 e 7

- tabela de mapeamento elemento -> projeção textual/gráfica;
- modelos de cenário (Amazon/YouTube/Reddit);
- como os cenários exercitam o metamodelo.

## 8.4 Individual report (tool 2 - Xtext)

- como implementaste o Ecore/metamodelo no Xtext;
- onde estão as validações (`RefDslValidator`);
- onde estão os quick fixes (`RefDslQuickfixProvider`);
- como geraste projeções textuais e PlantUML;
- prints/resultados de execução no Eclipse runtime.

---

## 9) Checklists finais (prontas para validação)

## 9.1 Activity 4 checklist

- [ ] `ref.ecore` representa o `ref-metamodel-v2.puml`.
- [ ] `ref.genmodel` gerou código sem erros.
- [ ] diagrama v2 incluído no relatório.
- [ ] explicação da modelação no relatório da equipa.

## 9.2 Activity 5 checklist

- [ ] constraints formalizadas (pseudo-código/OCL) no relatório.
- [ ] refactorings propostos para constraints corrigíveis.
- [ ] `RefDslValidator` com `@Check` alinhados ao v2.
- [ ] `RefDslQuickfixProvider` com `@Fix` alinhados.
- [ ] testes em runtime realizados e evidenciados.

## 9.3 Activity 6 checklist

- [ ] notação textual e gráfica definida no relatório.
- [ ] gerador textual implementado e executado.
- [ ] gerador PlantUML implementado e executado.
- [ ] projeções guardadas para os modelos de teste.

## 9.4 Activity 7 checklist

- [ ] modelos Amazon/YouTube/Reddit criados em `.refdsl`.
- [ ] erros intencionais detetados pelas constraints.
- [ ] quick fixes aplicados e evidenciados.
- [ ] projeções geradas para todos os cenários.

---

## 10) Resultados esperados para dizeres “está concluído”

Podes considerar Atividade 4 e 5 concluídas quando:

1. Existe coerência entre:
   - `ref-metamodel-v2.puml`,
   - `ref.ecore`,
   - `RefDsl.xtext`.
2. As constraints documentadas no relatório estão implementadas no validator.
3. Os refactorings documentados no relatório aparecem como quick fixes.
4. A demonstração em Eclipse runtime mostra erros/avisos + correção automática.

---

## 11) Nota prática (diferença entre “documentado” e “implementado”)

O enunciado pede duas coisas em paralelo:
- **desenho/documentação** (team report);
- **implementação funcional na ferramenta** (individual).

Se tiveres só tabelas no relatório sem validator/quickfix a funcionar, Activity 5 fica incompleta.
Se tiveres código mas não estiver explicado no relatório, também fica incompleta.

Tens de fechar os dois lados.

