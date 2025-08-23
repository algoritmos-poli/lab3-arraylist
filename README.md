# Laboratorio 3 - ArrayList

## Introducción

Comprender cómo trabajar con `ArrayLists` es crucial para construir software flexible y eficiente, especialmente al gestionar datos dinámicos como listas de objetos. Este laboratorio le ayudará a practicar la creación y el trabajo con `ArrayLists`, enfocándose en un ejemplo que simula un sistema básico de reserva de asientos para una sala de cine.

Imagine que usted está desarrollando un sistema simple de reserva de asientos en línea. El sistema debería permitir a los clientes reservar un asiento, cancelar su reservación o verificar si un asiento está reservado. Adicionalmente, debería ser capaz de mostrar el estado actual del asiento.

## Objetivo

> Construya la funcionalidad central del sistema de reserva de asientos, comenzando con una clase `Seat` simple. Usted utilizará la clase `Seat` ya implementada e implementará la adición de nuevas reservas, la eliminación de reservas, la actualización de reservas y la visualización de reservas.

## Instrucciones

### Código inicial

Para este laboratorio, usted ya ha configurado un proyecto y las clases en Java.

1. **Clase `Seat`**

   ¡Es momento de iniciar la primera tarea! Antes de hacerlo, abra el código para la clase Seat desde la carpeta `src` en el código de inicio que se le ha proporcionado. Este incluye:
   * `isBooked` (booleano)
   * `seatNumber` (entero)

2. **Clase `SeatBooking`**

   Esta clase ya se proporciona e incluye la estructura de los métodos:
   * `addNewBooking(String seatNumber)`
   * `removeBooking(String seatNumber)`

3. **Clase `Main`**

   Esta clase ha sido proporcionada y no requiere ninguna modificación.

### Tarea 1 - Añadir nueva reserva

Se ha creado una clase `SeatBooking` para gestionar las miles de solicitudes de reserva de asientos. Ahora, necesita construir una funcionalidad que permita añadir nuevas reservas utilizando un `ArrayList`.

Este método debería añadir nuevas reservas de asientos al `ArrayList`, almacenando eficazmente cada reserva. Asegúrese de que cuando alguien reserve un asiento, su método confirme la reserva guardando los detalles del asiento en su lista de asientos reservados.

**Nota**: Utilice el método predefinido `addNewBooking(String, seatNumber)` en la clase `SeatBooking`.

#### A codificar

* **TODO 1**: cree una nueva instancia de la clase `Seat`.
* **TODO 2**: marque el asiento como reservado estableciendo su propiedad `isBooked` a `true`.
* **TODO 3**: añada el objeto `Seat` recién creado y reservado a la `bookedSeatsList`.
* **TODO 4**: imprima un mensaje en la consola confirmando que el asiento ha sido reservado exitosamente. Por ejemplo si el usuario selecciono el asiento A4, el mensaje de salide deberia ser similar al que se muestra a continuación:
  
  ```
  Seat A4 has been successfully booked!
  ```
El codigo inicial para esta parte se muestra a continuación:

```java
Class SeatBooking{
    public void addNewBooking(String seatNumber){
        // TODO 1: create a new instance of the Seat class.
        // TODO 2: mark the seat as booked by setting its isBooked property to true
        // TODO 3: add the newly created and booked Seat object to the bookedSeatsList
        // TODO 4: print a message to the console confirming that the seat has been successfully booked
    }
}
```

### Tarea 2 - Eliminar reserva

Suponga que un usuario decide que ya no desea asistir a la película. Podría buscar una forma de cancelar su reserva. Su tarea es construir un método que gestione las cancelaciones de asientos. Este método debería eliminar las reservas de asientos de un `ArrayList` cuando un usuario cancela una reservación.

**Nota**: Utilice el método ya proporcionado, `cancelBooking`, en la clase `SeatBooking`, el cual toma un `String seatNumber` como parámetro.

#### A codificar

* **TODO 5**: verifique si el `seatNumber` del Seat actual coincide con el `seatNumber` proporcionado.
* **TODO 6**: si se encuentra una coincidencia, elimine el asiento de la `bookedSeatsList` e imprima un mensaje de confirmación. Por ejemplo, si se eliminase la reserva para el asiento A4, se deberia mostrar un mensaje de la forma:
  
  ```
  Booking for seat A4 has been successfully canceled!
  ```

* **TODO 7**: si no se encuentra ningún asiento coincidente después del bucle, imprima un mensaje indicando que el asiento no fue encontrado. El mensaje a imprimir (asumiendo que se quiere cancelar el asiento A4), deberá ser similar al siguiente:
  
  ```
  No booking found for seat number A4
  ```

La parte del codigó asociada a esta tarea se muestra a continuación:

```java
Class SeatBooking {
    // Method to remove a booking
    public void cancelBooking(String seatNumber) {
        for (Seat seat : bookedSeatsList) {
            // TODO 5: Check if the current seat's seatNumber matches the one provided
            // TODO 6: If a match is found, remove the seat from the bookedSeatsList and print a confirmation message
            System.out.println("Booking for seat " + seatNumber + " has been successfully canceled!");
            return;
            }
        }
    // TODO 7: If no matching seat is found, print a message indicating that the seat was not found
}
```

### Tarea 3 - Actualizar información de reserva de asiento

Excelente trabajo. Ha gestionado las cancelaciones y progresa adecuadamente. Ahora, considere un escenario en el que un usuario ha reservado un asiento para una película, pero posteriormente se da cuenta de que desea cambiar su asiento porque el actual está demasiado cerca de la pantalla, resultando incómodo. Para gestionar esta situación, necesitará construir un método que permita a los usuarios actualizar su reserva con un nuevo asiento.

**Nota**: Utilice el método ya proporcionado `updateBooking` que toma los siguientes parámetros: `currentSeatNumber`, `newSeatNumber`. Puede realizar esto eliminando la reserva existente y creando la nueva.

#### A codificar

* **TODO 8**: verifique si el asiento coincide con el número de asiento antiguo.
* **TODO 9**: anule la reserva del asiento actual (establezca `isBooked` a `false`).
* **TODO 10**: elimine el asiento antiguo de la lista. No olvide desplegar los mesajes correspondientes a lo casos de actualizacion o fallo en la actualizacion de la reserva. A continuación se muestra un caso donde se desea cambiar la reserva del puesto A3 al A4:
  * **Mensaje exito**:
    
    ```
    Booking updated successfully to new seat number: A4
    ```

  * **Mensaje fallo**: 
    
    ```
    No booking found for seat number: A3
    ```

La parte del codigó asociada a esta tarea se muestra a continuación:

```java
Class SeatBooking{
public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        for (Seat seat : bookedSeatsList) {
            // TODO 8: check if the seat matches the old seat number
            // TODO 9: unbook the current seat (set isBooked to false)
            // TODO 10: remove the old seat from the list

            Seat newSeat = new Seat(newSeatNumber);
            newSeat.setBooked(true);
            bookedSeatsList.add(newSeat);

            System.out.println("Seat " + oldSeatNumber + " has been updated to " + newSeatNumber + "!");
            return;
        }
        System.out.println("Seat " + oldSeatNumber + " not found.");
    }

```

### Tarea 4 - Mostrar la información de los asientos reservados

Imagine que un gerente de una sala de cine necesita visualizar todas las reservas de asientos actuales para una función en particular, para asegurar que la sala no esté sobrevendida, ayudar a gestionar solicitudes especiales y planificar los requerimientos de personal para una eficiencia operativa óptima. Implemente un método que pueda mostrar todos los asientos reservados para ayudar al gerente a visualizar las reservas.

#### A codificar

* **TODO 11**: verifique si la `bookedSeatsList` está vacía.
* **TODO 12**: itere a través de la `bookedSeatsList`.
* **TODO 13**: verifique si el asiento está reservado.
* **TODO 14**: muestre el número del asiento.

El fragmento de código para esta parte se muestra a continuación:

```java
Class SeatBooking{
// Method to display all bookings
    public void displayBookings() {
        // TODO 11: check if the bookedSeatsList is empty
        // TODO 12: iterate through the bookedSeatsList
        // TODO 13: check if the seat is booked
        // TODO 14: display the seat number
    }
}
```

> [!WARNING]
> Asegúrese de añadir una verificación de si la lista está vacía antes de iterar sobre ella. Esto garantiza que el sistema no intente mostrar reservas de una lista vacía, lo que podría ocasionar errores o confusión.

### Tarea 5 - Evaluar y confirmar la funcionalidad del proyecto

Ahora que ha añadido código para manipular el `ArrayList`, ¡es momento de ponerlo a prueba!
* Compile y ejecute el código.
* Compare la salida de su programa con los resultados esperados.

#### Salida esperada

```
1
Seat A1 has been successfully booked!
Seat A2 has been successfully booked!
Seat A3 has been successfully booked!

4
All bookings:
Seat Number: A1
Seat Number: A2
Seat Number: A3

2
Seat A2 has been successfully removed!
All bookings after removal:
Seat Number: A1
Seat Number: A3

3
Seat A1 has been updated to B1!
All bookings after update:
Seat Number: A3
Seat Number: B1
```

### Solución de problemas

* Asegúrese de que el código compile sin errores. Lea cuidadosamente cualquier mensaje de error para comprender y corregir los problemas.
* Verifique que `bookedSeatsList` esté inicializada correctamente en el constructor de SeatBooking y que los objetos `Seat` sean añadidos correctamente a la lista.
* Asegúrese de que la lógica para verificar si un asiento ya está reservado o cancelado antes de añadir, actualizar o eliminar una reserva esté implementada correctamente.
* Añada declaraciones de impresión para rastrear el flujo de ejecución y el estado de la lista. Utilice puntos de interrupción (breakpoints) y recorra el código paso a paso en el IDE para identificar problemas.

## Conclusión

¡Felicitaciones! Ha completado la actividad. Dominar los `ArrayLists` y la programación orientada a objetos es esencial para construir soluciones de software flexibles y escalables. Estas habilidades pueden ser aplicadas a diversas aplicaciones, tales como sistemas de gestión de inventarios, gestión de relaciones con el cliente y gestión de eventos. Su competencia en estas áreas mejorará significativamente su capacidad para desarrollar soluciones de software efectivas.

> [!IMPORTANT]
> Este laboratorio es una adaptación al español de la practica **Manipulating Arrays** del curso **Data Structures and Algorithms** ([link](https://www.coursera.org/learn/developer-data-structures-and-algorithms?specialization=amazon-junior-software-developer)).