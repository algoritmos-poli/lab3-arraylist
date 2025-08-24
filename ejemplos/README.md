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

### 7. [`AdvertisementManager3.java`](AdvertisementManager3.java)

* **Descripción:** Este código demuestra cómo modificar un elemento existente en una posición específica de la lista utilizando el método `set(index, element)`.
* **Preguntas para el análisis:**
    1.  ¿Cuál es la diferencia fundamental en el comportamiento de `ads.set(1, "...")` comparado con `ads.add(1, "...")`?
    2.  ¿Qué tipo de excepción se produciría si intentaras usar `set` en un índice que no existe en la lista (por ejemplo, `ads.set(5, "...")` en este caso)?


## Desafío: Gestionar una aplicación de recomendación de libros


### Escenario

Imagine que usted está a cargo de una aplicación de recomendación de libros que proporciona a los usuarios una lista de lecturas imprescindibles. Su tarea es mantener la lista de recomendaciones actualizada, añadiendo nuevos libros, actualizando los existentes y eliminando aquellos que ya no son relevantes.

### Datos Proporcionados

Usted dispone de la siguiente información:
* Una clase `Book` (Libro) definida con los atributos de `title` (título) y `author` (autor).
* Una lista inicial que contiene tres recomendaciones de libros.

### Requisitos

Por favor, complete los siguientes pasos en el bloque de código interactivo:
1. Añada tres nuevas recomendaciones de libros a la lista.
   * Incorpore los tres nuevos libros, que se mencionan a continuación, a la lista de recomendaciones utilizando el método `add()`.
      
     | title | author |
     |---|---|
     | The Programmer| Andrew |
     |Design Patterns | Erich |
     |Refactoring | Martin |
   
   A continuación, muestre el contenido del ArrayList. Ahora, ejecute el código. ¿Observa usted 3 elementos? En caso afirmativo, proceda al siguiente paso.

2. Ahora, a continuación del código existente que creó en el punto anterior, actualice los títulos y autores de dos de las recomendaciones existentes.   
   * Para realizar esta actualización, utilice el método set() e indique el índice del elemento que desea modificar.
    
   |index |title |author |
   |----|----|----|
   |1|Clean Code|Robert C|
   |2|Java Concurrency|Brian|

   Nuevamente, muestre el ArrayList. ¿Observa los cambios realizados en los elementos? Si es así, proceda al siguiente paso.

3. Elimine dos libros que ya no son relevantes: el primero y el cuarto.

   Para ambas eliminaciones, utilice el método `remove(index)` de la clase ArrayList. Recuerde que el conteo de índices comienza desde cero, por lo que la primera posición corresponde al índice `0`.
   
   Al mostrar nuevamente el `ArrayList`, ¿observa que los elementos fueron eliminados? Si es así, ¡excelente trabajo! Ahora usted sabe cómo añadir, modificar y eliminar elementos de un `ArrayList`.

### Codigo inicial

Su reto consiste en escribir la parte comentada del código que se da a continuación para obtener la salida deseada al tener en cuenta las tareas previamente mencionadas.

```java
import java.util.ArrayList;

public class RecommendationBookManager {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String args[]) {
        ArrayList<Book> recommendations = new ArrayList<>();
        recommendations.add(new Book("Effective Java", "Joshua Bloch"));
        recommendations.add(new Book("Clean Code", "Robert C. Martin"));
        recommendations.add(new Book("Java Concurrency", "Brian Goetz"));

        // TODO 1: Add 3 new books to the recommendation list
        recommendations.add(new Book("The Programmer", "Andrew"));
        recommendations.add(new Book("Design Patterns", "Erich"));
        recommendations.add(new Book("Refactoring", "Martin"));

        System.out.println("Recommendations after adding new books:");
        System.out.println(recommendations);      

        /* TODO 2: Update existing recommendations
         * at index 1 (2nd element)
         * at index 2 (3rd element)
         */
        recommendations.set(1, new Book("Clean Code", "Robert C"));
        recommendations.set(2, new Book("Java Concurrency", "Brian"));

        System.out.println("Recommendations after updating some books:");
        System.out.println(recommendations);

        /* TODO 3: Remove outdated recommendations
         * at index 0 (first place)
         * at index 3 (fourth place)
         */
        recommendations.remove(0);
        recommendations.remove(3);

        System.out.println("Recommendations after removing outdated books:");
        System.out.println(recommendations);
    }
}
```


> [!TIP]
> 1. Al utilizar los métodos `set()` y `remove()`, asegúrese de hacer referencia a índices válidos dentro del `ArrayList`. Los índices comienzan en `0`, por lo tanto, si usted intenta acceder a un índice que no existe, obtendrá una excepción de tipo `IndexOutOfBoundsException`.
> 2. Al agregar o actualizar un elemento, asegúrese de que los elementos sean únicos dentro de su `ArrayList`.
> 3. Si usted elimina elementos por su valor, asegúrese de que el objeto exista en el `ArrayList`.

### Verificación del funcionamiento

La siguiente salida refleja la salida deseada para el desafío.

```
Recommendations after adding new books:
    [Effective Java by Joshua , Clean Code by Robert C. , Java Concurrency by Brian, The Programmer by Andrew , Design Patterns by Erich , Refactoring by Martin ]
Recommendations after updating some books:
    [Effective Java by Joshua , Clean Code by Robert C., Java Concurrency by Brian, The Programmer by Andrew , Design Patterns by Erich , Refactoring by Martin ]
Recommendations after removing outdated books:
    [Clean Code by Robert C., Java Concurrency by Brian, The Programmer by Andrew , Refactoring by Martin ]

```

Tome un momento para reflexionar sobre el desafío que usted ha completado, haciéndose las siguientes preguntas:
* ¿En qué áreas tuvo usted dificultades y por qué?
* ¿Cómo solucionó los errores (en caso de haberlos)?
* ¿Qué lecciones se lleva usted para el futuro?

## Mejores prácticas de codificación

Si usted no obtuvo la salida deseada, tómese un tiempo para solucionar los problemas de su código. Los errores le ocurren a todo el mundo, incluso a los mejores desarrolladores de software. Trabajar en su resolución es parte del trabajo.

Si usted tuvo dificultades, considere hacer lo siguiente:
1. **Lea detenidamente los mensajes de error**: Los mensajes de error de Java son descriptivos y lo dirigirán al número de línea y al tipo de error. Intente ver si puede solucionarlo mediante prueba y error.
2. **Revise los errores comunes**:
   * Asegúrese de que todas las llaves `{}`, los corchetes `[]`, los puntos y comas `;`, los paréntesis `()` y los corchetes angulares `<>` estén colocados correctamente.
   * Verifique que usted está accediendo a índices válidos dentro del `ArrayList`. Recuerde, los índices comienzan en 0, así que asegúrese de no estar intentando acceder a un índice que no existe.
   * Asegúrese de que está agregando, actualizando y eliminando el tipo correcto de elementos del `ArrayList`. En este caso, asegúrese de que está trabajando con objetos de tipo `Book` (Libro).

## Conclusión

¡Bien hecho! En esta lectura, usted ha explorado cómo agregar, actualizar y eliminar elementos en un `ArrayList`, operaciones críticas que son vitales de dominar para cualquier desarrollador de software. Su desafío implicó modificar la lista de recomendaciones de libros agregando nuevos títulos, actualizando los existentes y eliminando libros obsoletos. Al trabajar en estas tareas, usted ha ganado experiencia práctica en la gestión de estructuras de datos dinámicas como los `ArrayLists`.

Comprender cómo manipular `ArrayLists` de manera eficiente es esencial en diversas aplicaciones del mundo real, tales como la gestión de una biblioteca de contenido generado por usuarios, el mantenimiento de un catálogo de productos o el seguimiento de la información de los clientes. Esta **habilidad fundamental** será de incalculable valor a medida que usted aborde proyectos más complejos, permitiéndole construir aplicaciones robustas y flexibles que manejen datos dinámicos con facilidad. Con este conocimiento en su haber, usted está bien preparado para enfrentar los desafíos del desarrollo de software en el mundo real y para continuar avanzando en su trayectoria como un **desarrollador competente**.

> [!IMPORTANT]
> Estes contenido es una adaptación al español de la actividad **Declaring ArrayLists** del curso **Data Structures and Algorithms** ([link](https://www.coursera.org/learn/developer-data-structures-and-algorithms?specialization=amazon-junior-software-developer)).
