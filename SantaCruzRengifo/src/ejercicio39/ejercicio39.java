package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = new String[11];

		int[] edad = new int[11];

		for (int i = 0; i < 11; i++) {

			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();

			System.out.println("Ingresa su edad: ");
			edad[i] = datos.nextInt();

		}

		for (int i = 0; i < 11; i++) {

			System.out.println("Nombre del jugador: " + (i+1));
			System.out.println(nombre[i]);

			System.out.println("Edad del jugador numero: " + (i+1));
			System.out.println(edad[i]);

			System.out.println("\n ");

		}
	}
}