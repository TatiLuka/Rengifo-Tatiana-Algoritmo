package examen;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		int cantidad = 0, cant_max = 0, cant_min = 10, promedio = 0;

		int[] arreglo = new int[5];

		for (int hora = 0; hora <= 4; hora += 4) {

			System.out.println("produce: ");
			cantidad = datos.nextInt();
			
			promedio += cantidad;

			if (cantidad > cant_max) {
				cant_max = cantidad;
			}

			if (cantidad < cant_min) {
				cant_min = cantidad;

			}

			arreglo[hora] = cantidad;
		}

		System.out.println("la cantidad minima es: " + cant_min);
		System.out.println("la cantidad maxima es: " + cant_max);

		for (int i = 0; i < (arreglo.length - 1) ; i++) {

			for (int j = 0; j < (arreglo.length - i - 1); j++) {

				if (arreglo[j] > arreglo[j + 1]) {

					int temporal = arreglo[j];

					arreglo[j] = arreglo[j + 1];

					arreglo[j + 1] = temporal;

				}
			}
		}

		System.out.println("\nArreglo ordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}

		System.out.println("\nmenor a 20:");
		for (int num : arreglo) {

			if (num <= 20) {
				System.out.print(num + " ");
			}
		}

		System.out.println("\npromedio es:" + promedio / 4);

	}

}
