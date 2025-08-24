# Guía de Práctica: Introducción a `ArrayList` en Java

Este repositorio contiene una serie de ejemplos diseñados para ilustrar el uso y las características fundamentales de la clase `ArrayList` en Java. A través de la ejecución y el análisis de estos archivos, se busca que el estudiante comprenda la declaración, manipulación y ventajas de esta estructura de datos dinámica.

---

## Información Previa: `ArrayList`

Un `ArrayList` es una implementación de la interfaz `List` que utiliza un arreglo dinámico para almacenar elementos. Su principal ventaja sobre los arreglos convencionales es su capacidad para cambiar de tamaño automáticamente a medida que se añaden o eliminan elementos. Esto lo convierte en una estructura de datos flexible y potente para una amplia variedad de aplicaciones.

### Funciones Principales

A continuación, se resumen algunos de los métodos más comunes utilizados en los ejemplos:

| Método | Descripción |
| :--- | :--- |
| `add(elemento)` | Añade un elemento al final de la lista. |
| `add(índice, elemento)` | Inserta un elemento en una posición específica, desplazando los elementos existentes. |
| `remove(índice)` | Elimina el elemento que se encuentra en la posición especificada. |
| `remove(objeto)` | Elimina la primera ocurrencia del objeto especificado dentro de la lista. |
| `size()` | Devuelve el número de elementos actualmente almacenados en la lista. |

---

## Análisis y Ejecución de los Códigos Fuente

Se invita a los estudiantes a ejecutar y analizar cada uno de los siguientes archivos para comprender los conceptos en la práctica.

**Instrucción general de ejecución:** Para correr cada ejemplo, abre el archivo `.java` en tu IDE de preferencia (como Eclipse, IntelliJ IDEA o VS Code), haz clic derecho sobre el editor de código y selecciona la opción "Run" o "Run as Java Application". La salida se mostrará en la consola del IDE.

### 1. [`BasicArrayList.java`](BasicArrayList.java)

* **Descripción:** Este código demuestra la declaración de un `ArrayList` sin el uso de genéricos (tipos específicos). Permite observar cómo una misma lista puede contener objetos de diferentes tipos, como `String` e `Integer`.
* **Preguntas para el análisis:**
    1.  ¿Qué riesgos o desventajas implica crear un `ArrayList` sin especificar un tipo de dato?
    2.  Si quisiera obtener el número `123` y sumarle otro número, ¿qué proceso adicional tendría que realizar después de extraerlo de la lista?

### 2. [`GenericArrayList.java`](GenericArrayList.java)

* **Descripción:** Este ejemplo introduce el concepto de **genéricos** (`<String>`), que garantiza la seguridad de tipos. La lista se declara para aceptar únicamente objetos de tipo `String`, evitando errores en tiempo de ejecución.
* **Preguntas para el análisis:**
    1.  Descomente la línea `// stringList.add(123);`. ¿Qué sucede cuando intenta compilar o ejecutar el archivo? ¿Por qué?
    2.  ¿Qué beneficios principales ofrece el uso de genéricos en las colecciones de Java?

### 3. [`ArrayListDeclaration.java`](ArrayListDeclaration.java)

* **Descripción:** Este código muestra una forma eficiente de inicializar un `ArrayList` a partir de un arreglo existente utilizando el método `Arrays.asList()`. Es una técnica común para crear listas pre-pobladas.
* **Preguntas para el análisis:**
    1.  ¿Cuál es la diferencia entre la lista creada por `Arrays.asList()` y el `ArrayList` final?
    2.  Investigue: ¿Qué limitaciones tiene la lista devuelta directamente por `Arrays.asList()`?

### 4. [`CapacityArrayList.java`](CapacityArrayList.java)

* **Descripción:** Este ejemplo demuestra cómo inicializar un `ArrayList` con una **capacidad inicial** específica. Esta es una práctica recomendada para optimizar el rendimiento cuando se conoce de antemano el número aproximado de elementos que se van a almacenar.
* **Preguntas para el análisis:**
    1.  El programa imprime un tamaño (`size`) de 1. ¿Por qué el tamaño no es 50?
    2.  ¿En qué escenarios sería más eficiente definir una capacidad inicial en lugar de usar el constructor por defecto?

### 5. [`AdvertisementManager.java`](AdvertisementManager.java)

* **Descripción:** Este código ilustra cómo añadir elementos a un `ArrayList`, tanto al final de la lista como en una posición específica utilizando `add(index, element)`.
* **Preguntas para el análisis:**
    1.  ¿Qué le sucede al elemento que originalmente estaba en el índice 1 ("20% Off All Items") después de ejecutar `ads.add(1, ...)`?
    2.  ¿Qué ocurriría si intentara añadir un elemento en un índice que está fuera del rango actual de la lista (por ejemplo, el índice 10)?

### 6. [`AdvertisementManager2.java`](AdvertisementManager2.java)

* **Descripción:** Este ejemplo práctico muestra las dos formas principales de eliminar elementos de un `ArrayList`: por su **índice** numérico (`remove(0)`) y por el **contenido** del objeto (`remove("...")`).
* **Preguntas para el análisis:**
    1.  Si la lista tuviera dos elementos idénticos, por ejemplo, dos veces el string "Free Shipping", ¿qué pasaría al ejecutar `ads.remove("Free Shipping")`?
    2.  ¿Cuál de los dos métodos de eliminación (`remove(index)` vs. `remove(object)`) considera que es computacionalmente más costoso y por qué?


