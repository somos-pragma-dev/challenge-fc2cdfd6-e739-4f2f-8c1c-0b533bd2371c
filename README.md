# Desarrollo de una API REST para gestión de productos

El equipo de desarrollo de una empresa fintech necesita implementar una API REST para gestionar productos. La API debe permitir crear, leer, actualizar y eliminar productos, con persistencia en una base de datos H2 y documentación mediante Swagger. Los productos tienen atributos como nombre, precio, stock y categoría. La API debe prohibir precios negativos y nombres duplicados. Además, debe decidir cómo estructurar y qué hacer cuando una validación falla.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Crear una API REST con persistencia en H2 y documentación con Swagger |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del modelo de datos

**Objetivo:** Definir el modelo de datos para los productos, incluyendo validaciones y restricciones.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los atributos necesarios para un producto (nombre, precio, stock, categoría).
- Establecer las validaciones necesarias (precio positivo, nombre único).
- Decidir cómo manejar las fallas de validación.

**Entregable:** Modelo de datos para productos con validaciones y restricciones definidas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar las validaciones en el modelo de datos.
- Piensa en los posibles modos de falla y cómo manejarlos.

</details>

### Fase 2: Implementación de la persistencia

**Objetivo:** Implementar la persistencia de los productos en una base de datos H2.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configurar la conexión a la base de datos H2.
- Crear las tablas necesarias para almacenar los productos.
- Implementar las operaciones CRUD para los productos.

**Entregable:** Base de datos H2 con las tablas y operaciones CRUD implementadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar las tablas para cumplir con las validaciones definidas.
- Piensa en cómo manejar las operaciones CRUD de manera eficiente.

</details>

### Fase 3: Documentación con Swagger

**Objetivo:** Documentar la API REST utilizando Swagger.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configurar Swagger para documentar la API.
- Añadir descripciones y ejemplos para cada operación.
- Validar que la documentación sea clara y completa.

**Entregable:** Documentación de la API REST utilizando Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo hacer que la documentación sea clara y completa.
- Piensa en cómo añadir ejemplos que ayuden a entender las operaciones.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de datos y por qué es importante en una API REST?
- **paraQueSirve**: ¿Para qué sirve la persistencia en una base de datos y cómo se implementa en este reto?
- **comoSeUsa**: ¿Cómo se usa Swagger para documentar una API REST y por qué es importante?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una API REST y cómo se pueden tomar de manera efectiva?

## Criterios de Evaluacion

- Definir el modelo de datos para productos con validaciones y restricciones.
- Implementar la persistencia de los productos en una base de datos H2.
- Documentar la API REST utilizando Swagger.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
