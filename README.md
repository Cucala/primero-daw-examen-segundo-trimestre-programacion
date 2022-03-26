# Examen del modulo de programación de primero de ciclo de DAW
## Ejercicio 1 (2,5 puntos)
Se desea manejar una lista de robots. Cada robot tiene un número y un porcentaje de vida. El número de elementos de la lista será un valor aleatorio entre 5 y 10. El porcentaje de vida de cada ROBOT será un valor aleatorio entre 1 y 100.

Se pide construir una aplicación en java que permita cumplir con la siguiente funcionalidad:
  - Imprimir la lista de robot ordenada por porcentaje de vida de los robots. Al principio de la lista DEBEN estar los robots con menos porcentaje de vida.
  - Imprimir la cantidad de robot que tiene más del 50% de vida.
  - Imprimir el número de los TRES robots que tienen mayor porcentaje de vida.

## Ejercicio 2 (2,5 puntos)
Se quiere implementar el control de un Ferry. Para ello cree una clase Vehículo que incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia o ausencia de tripulación, número de ruedas, fecha de matriculación, medio por el que se desplaza, etc. Incluya los métodos que considere oportunos.

A partir de la clase anterior, y mediante herencia cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un camión, una bicicleta, una lancha.

Incluya en cada clase algún atributo específico que la diferencie de las demás. Por ejemplo, para el coche un booleano que determine si es de tres o cinco puertas, para el camión la altura (indiferente en los otros vehículos), etc.

Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.

## Ejercicio 3 (5 puntos)
Se va a implementar un juego en el que el usuario tenga que adivinar un número que conoce el programa. El código correspondiente a cada clase que se implemente deberá estar en un fichero java separado y que tenga el mismo nombre que la clase.

- Clase **Game**:
  - Añadirle un método abstracto play() que no tome parámetros y que tendrán que implementar las clases derivadas.
  - La clase Game ahora pasa a ser una clase abstracta por lo que ya no se podrán crear instancias de la misma.
  - La función main ya no estará dentro de esta clase.
- Clase **GuessNumber**:
  - Deriva de la clase Game.
  - Tiene un constructor que toma dos parámetros de tipo entero. El primero es el número de vidas que, a su vez, se lo pasará al constructor de la clase base. El segundo parámetro es un número a adivinar entre 0 y 10.
  - Implementa el método play() de la clase base:
    - Llama al método restart() que ha heredado.
    - Muestra un mensaje al usuario pidiendo que adivine un número entre el 0 y el 10.
    - Lee un entero del teclado y lo compara con el valor predefinido por el programador: 
      - Si es igual, muestra un mensaje Acertaste!! y, tras llamar a updateRecord(), sale del método.
      - Si es diferente, llama al método die() heredado.
      - Si el método die() devuelve true, significa que aún le quedan más vidas al jugador por lo que se muestra un mensaje indicando si el número a adivinar es mayor o menor y se le pide que lo intente de nuevo.
      - Si el método die() devuelve false significa que ya no le quedan más vidas al jugador, con lo que sale del método Juega.
  - Añade un método validate() que toma como parámetro el dato introducido por el usuario y devuelve un boolean, en el caso de que el dato sea un numero será true. 
  - En el método play() pedirá un nuevo número por teclado si el método validate() devuelve false, en este caso no restará vida y volvera a pedir un número.
- Clase **GuessPair**:
  - Deriva de la clase GuessNumber.
  - Redefine el método validate() devolviendo true si el número es par. Si el número es impar, muestra un mensaje de error por pantalla y devuelve false.
- Clase **GuessOdd**:
  - Deriva de la clase GuessNumber.
  - Redefine el método validate() devolviendo true si el número es impar. Si el número es par, muestra un mensaje de error por pantalla y devuelve false.
- Clase **RobotFactory**:
  - El método main crea una instancia de cada uno de los tres juegos creados: GuessNumber, GuessPair y GuessOdd. Como número de vidas de cada juego se pondrá 3 y como número a adivinar un número cualquiera (Random), otro par y otro impar respectivamente, todos comprendidos entre el 0 y el 10.
  - El jugador mediante un menú seleccionara a que juego quiere jugar cuando finalice el juego volverá a este menú. Para salir el jugador escribirá Salir.
