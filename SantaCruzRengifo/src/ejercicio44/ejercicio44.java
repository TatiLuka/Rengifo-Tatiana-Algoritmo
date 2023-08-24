package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] N1 = new int[5];

		for (int i = 1; i <= 4; i++) {

			System.out.println("ingrese un numero: ");
			N1[i] = entrada.nextInt();

			if (N1[i] % 2 == 0) {
				System.out.println("El valor es: " + N1[i]);

			}
		}
	}
}
