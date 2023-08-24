package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {
	public static void main(String args[]) {
		Scanner leer = new Scanner(System.in);

		int promedio = 0;

		int[] temperatura = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese las temperaturas: " + (i + 1));
			temperatura[i] = leer.nextInt();

			promedio += temperatura[i]; //

		}

		System.out.println("el promedio es: " + (promedio / 5));

	}
}
