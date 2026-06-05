# DSL para Pricing SaaS — Trabajo MIS 2025/2026

**Dominio:** Pricing de servicios SaaS (Software as a Service)  
**Asignatura:** Modelado y Sistemas de Información — Máster en Ingeniería del Software: Cloud, Datos y Gestión TI  
**Universidad de Sevilla — Curso 2025/2026**  
**Autor:** Daniel Ruiz López

---

## Descripción

Este proyecto implementa un toolchain completo de **Ingeniería Dirigida por Modelos (MDE)** para el dominio del pricing de servicios SaaS. Permite modelar, visualizar, editar y transformar la estructura de precios de cualquier producto SaaS (planes, features, límites de uso y addons).

El dominio está inspirado en el framework de investigación **iPricing / Pricing4SaaS** de la Universidad de Sevilla.

Como instancia de ejemplo se modela el pricing de **Zoom** (planes Basic, Pro y Business, con el addon Translated Captions).

---

## Estructura del repositorio

```
TrabajoMOD/
│
├── lsi.us.es.mis.pricing/                  # Metamodelo (Ecore)
├── lsi.us.es.mis.pricing.design/           # Editor gráfico (Sirius)
├── lsi.us.es.mis.pricing.instance/         # Instancias de ejemplo
│   ├── src/
│   │   └── zoom.pricing                    # Instancia textual (Xtext)
│   └── src-gen/
│       ├── zoom.html                       # Salida M2T — HTML
│       ├── zoom.txt                        # Salida M2T — texto plano
│       └── zoom.yaml                       # Salida M2T — YAML
├── lsi.us.es.mis.pricing.edit/             # Proyecto EMF edit (generado)
├── lsi.us.es.mis.pricing.editor/           # Proyecto EMF editor (generado)
├── lsi.us.es.mis.pricing.tests/            # Tests del metamodelo
├── lsi.us.es.mis.xtext.pricing/            # Gramática Xtext + transformaciones M2T (Xtend)
├── lsi.us.es.mis.xtext.pricing.ide/        # Proyecto Xtext IDE (generado)
├── lsi.us.es.mis.xtext.pricing.ui/         # Proyecto Xtext UI (generado)
├── lsi.us.es.mis.xtext.pricing.ui.tests/   # Tests UI Xtext
└── lsi.us.es.mis.xtext.pricing.tests/      # Tests Xtext
```

---

## Artefactos

### 1. Metamodelo (`lsi.us.es.mis.pricing`)

Metamodelo Ecore que define el lenguaje de dominio para pricing SaaS.

**Clases principales:**

| Clase | Descripción |
|-------|-------------|
| `Pricing` | Raíz del modelo — representa el pricing completo de un SaaS |
| `Plan` | Plan de suscripción con nombre, descripción y precio |
| `AddOn` | Complemento opcional, con dependencias e incompatibilidades entre addons |
| `Feature` | Característica incluida en un plan o addon |
| `UsageLimit` | Límite de uso (clase abstracta) |
| `Renewable` | Límite renovable periódicamente — tiene un `Period` asociado |
| `NonRenewable` | Límite no renovable — con atributo `trackable` |
| `Period` | Período de renovación de un límite (valor + unidad de tiempo) |

**Enumerados:** `ValueType` (NUMERIC, BOOLEAN, TEXT) · `TimeUnit` (SEC, MIN, HOUR, DAY, MONTH, YEAR)

**Decisiones de diseño destacadas:**
- **Herencia** en `UsageLimit` → `Renewable` / `NonRenewable`
- **Self-references** en `AddOn`: `dependsOn` y `excludes`
- **Cross-references**: `availableFor` (AddOn → Plan) y `linkedTo` (Feature → UsageLimit)

---

### 2. Editor Gráfico (`lsi.us.es.mis.pricing.design`)

Editor visual implementado con **Sirius** en Obeo Designer.

**Características:**
- Contenedores coloreados por tipo (Plan en azul, AddOn en naranja)
- Nodos para Feature (verde) y UsageLimits (amarillo/naranja según tipo)
- Arcos para todas las relaciones del metamodelo
- Paleta completa: Create Plan, AddOn, Feature, Renewable, NonRenewable
- Herramientas de arco: AvailableFor, DependsOn, Excludes, LinkedTo, FeatureAddOn

**Ficheros clave:**
- `description/pricing.odesign` — especificación del editor Sirius

---

### 3. Editor Textual (`lsi.us.es.mis.xtext.pricing`)

DSL textual implementado con **Xtext**, generado a partir del Ecore existente.

**Características:**
- Autocompletado (Ctrl+Space)
- Coloreado de sintaxis
- Validación automática en tiempo real
- Asistente para referencias cruzadas

**Ficheros clave:**
- `src/lsi/us/es/mis/xtext/pricing/MyPricingDsl.xtext` — gramática Xtext
- `src/lsi/us/es/mis/xtext/pricing/generator/MyPricingDslHTMLGenerator.xtend` — transformación M2T

---

### 4. Transformación M2T (`lsi.us.es.mis.xtext.pricing`)

Transformación **modelo a texto** implementada con **Xtend**.

Genera tres formatos de salida a partir del modelo XMI:

| Fichero | Formato | Descripción |
|---------|---------|-------------|
| `zoom.txt` | Texto plano | Listado estructurado del pricing |
| `zoom.html` | HTML | Página web navegable con planes, features y addons |
| `zoom.yaml` | YAML | Representación estructurada del pricing |

---

### 5. Instancias de ejemplo (`lsi.us.es.mis.pricing.instance`)

Instancias del pricing de **Zoom** creadas con ambos editores:

- `src/zoom.pricing` — instancia textual (Xtext)
- `src-gen/zoom.html` — salida M2T en HTML
- `src-gen/zoom.txt` — salida M2T en texto plano  
- `src-gen/zoom.yaml` — salida M2T en YAML

Las instancias del editor gráfico (`.xmi` y `.aird`) se encuentran en el mismo proyecto.

---

## Requisitos

- **Obeo Designer Community 11.9.1** (incluye EMF, Sirius y Xtext preintegrados)
- Java 11+

## Cómo importar

1. Clona el repositorio
2. En Obeo Designer: `File > Import > Existing Projects into Workspace`
3. Selecciona la carpeta raíz del repositorio
4. Importa todos los proyectos
5. Abre `lsi.us.es.mis.pricing.instance` para explorar las instancias de ejemplo

---

## Diagrama de estados del toolchain

```
┌─────────────┐     define      ┌──────────────────┐
│  Metamodelo │ ─────────────►  │  Editor Gráfico  │
│   (Ecore)   │                 │    (Sirius)       │
│             │ ─────────────►  │  Editor Textual  │
└─────────────┘     genera      │    (Xtext)        │
                                └────────┬─────────┘
                                         │ instancia
                                         ▼
                                ┌──────────────────┐
                                │   Modelo XMI /   │
                                │  .pricing file   │
                                └────────┬─────────┘
                                         │ transforma
                                         ▼
                                ┌──────────────────┐
                                │  Salida M2T      │
                                │  txt / html /    │
                                │  yaml (Xtend)    │
                                └──────────────────┘
```

---

*Trabajo desarrollado para la asignatura Modelado y Sistemas de Información — Universidad de Sevilla 2025/2026*
