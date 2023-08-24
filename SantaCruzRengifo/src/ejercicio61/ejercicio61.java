package ejercicio61;

import java.util.Scanner;

public class ejercicio61 {

		static String nombre, nombre_min;
		static String apellido, apellido_may;

		public static void IngDeDatos() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("ingrese el nombre: ");
			nombre = entrada.next();
			System.out.println("ingrese el apellido: ");
			apellido = entrada.next();
		}

		public static void palabras() {

			String nombre_min = nombre.toLowerCase(); 
			String apellido_mayu = apellido.toUpperCase(); 

			System.out.println(nombre_min + "\n" + apellido_mayu);
			
			
			System.out.println("\nEl nombre tiene: " + nombre.length() + " caracteres");
			System.out.println("El apellido tiene: " + apellido.length() + " caracteres");
		}

		public static void main(String[] args) {

			IngDeDatos();
			palabras();

		}
	}

	
