package funcionesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class funcionesArrays {
// Declaro la variable global que indica los elementos del array.
	static int cantidadNumeros;

// Declaro el array global, pero NO lo creo (no coloco new Int[]). Solo lo declaro.
// No lo creo al array, porque todavia no se cuantos elementos hay.
	static int[] numerosPares;

// Funci�n que devuelve un array de los primeros 'n' numeros pares
	public static int[] obtenerNumerosPares(int n) {
		
		System.out.println("Quiero que vean la macana");
		
		numerosPares = new int[n]; // Creacion del array "numerosPares"
		for (int i = 0; i < n; i++) {
			numerosPares[i] = 2 * (i + 1); // Calculamos el numero par correspondiente
		}
		return numerosPares; // se devuelve el array sin colocar "[]"
	}
// Fin de la funcion obtenerNumerosPares
	
// Comienzo de la funcion elementosArray
	
	public static void elementosArray() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantos numeros pares queres ver?");
		cantidadNumeros = entrada.nextInt(); // Cantidad de numeros pares a obtener
	}
// Fin de la funcion elementosArray
	
	
// Comienzo de la funcion principal
	public static void main(String[] args) {
		
		elementosArray(); // llamada a la funci�n elementosArray()
		
		/* En la funcion principal, conviene almacenar la funcion que retorna un array
		 * en otro array. Esto es, porque el array "arrayNumeros" va a almacenar CADA
		 * elemento del array retornado por la funcion. 
		 * Si llamamos directamente a la funcion dentro de un "syso", recordemos que 
		 * al llamar a la funcion, se van a ejecutar todas las lineas de codigo dentro de 
		 * esa funcion, confundiendo la lectura. Entonces, al almacenar lo que retorna
		 * la funcion en otro array, solo se guardaran los elementos de la funcion, y el 
		 * "syso" podra mostrar sus valores, sin ejecutar toda la funcion.	
		 * */
		int arrayNumeros[] = obtenerNumerosPares(cantidadNumeros);

			
		// Mostramos el contenido del array en la consola
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.println("Los primeros " + cantidadNumeros + " n�meros pares son: "
					+ arrayNumeros[i]);
		}
	}
// Fin de la funcion principal

}