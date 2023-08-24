package ejercicio50;

import java.util.Scanner;

public class ejercicio50 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" cuantas personas van apostar:  ");
		int cantidad = entrada.nextInt();

		int[] dinero = new int[cantidad];

		for (int i = 0; i < dinero.length; i++) {

			System.out.println(" ingrese el numero que quiere apostar:  ");
			dinero[i] = entrada.nextInt();

		}

		int dineroMax = 0;
		int dineroMin = 10000;

		for (int t = 0; t < dinero.length; t++) {
			if (dinero[t] > dineroMax) {
				dineroMax = dinero[t];

			}

		}
		System.out.println(" La puesta menor es: " + dineroMin);

		for (int l = 0; l < dinero.length; l++) {

			for (int c = 0; c < (dinero.length - l - 1); c++) {

				if (dinero[c] > dinero[c + 1]) {

					int temporal = dinero[c];

					dinero[c] = dinero[c + 1];

					dinero[c + 1] = temporal;

					if (dinero[c + l] < 500) {
						System.out.print("Numero destacado");
					}
				}
			}
		}
		for (int i = 0; i < dinero.length; i++) {
			System.out.print("\nlista ascendente: " + dinero[i] + "\n");
		}

	}
}