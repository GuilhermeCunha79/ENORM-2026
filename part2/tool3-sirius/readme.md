# Acceleo generator

This module generates a minimal Java backend skeleton per ENORM RefModel.

## Entry template
- `src/org/eclipse/acceleo/module/sample/common/generate.mtl`
- Entry point: `generateElement(RefModel)`

## Output layout
Generated files are placed under `generated-backends/<appName>` in the chosen output folder.

## Run (Eclipse)
1. Right-click an `.enorm` model file.
2. Run As -> Acceleo Application.
3. Select `org.eclipse.acceleo.module.sample.common.generate` and the `generateElement` template.
4. Choose an output folder in your workspace.

This will generate one backend folder for each model run (Amazon, Reddit, YouTube).
