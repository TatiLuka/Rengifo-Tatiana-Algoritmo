package ejercicio49;

import java.util.Scanner;

public class ejercicio49 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		System.out.println("ingrese una cantidad de lista de números de DNI: ");
		int cantidad = datos.nextInt();

		int[] dni = new int[cantidad];

		for (int i = 0; i < (dni.length); i++) {
			System.out.println("ingresa un dni: ");
			dni[i] = datos.nextInt();

		}
		for (int i = 0; i < (dni.length); i++) {

			for (int j = 0; j < (dni.length - i - 1); j++) {

				if (dni[j] > dni[j + 1]) {

					int temporal = dni[j];

					dni[j] = dni[j + 1];

					dni[j + 1] = temporal;

				}
			}

		}

		for (int i = 0; i < dni.length; i++) {
			System.out.print("lista ascendente: " + dni[i] + "\n");
		}
		System.out.println();
		for (int i = dni.length - 1; i >= 0; i--) {
			System.out.print("lista descendente: " + dni[i] + "\n");
		}
	}
}
