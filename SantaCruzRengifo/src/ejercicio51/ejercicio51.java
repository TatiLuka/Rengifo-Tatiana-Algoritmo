package ejercicio51;

import java.util.Scanner;

public class ejercicio51 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[][] matriz = new float[2][3];

		matriz[0][0] = 3.456f;
		matriz[0][1] = 2.123f;
		matriz[0][2] = 4.351f;
		matriz[1][0] = 4.412f;
		matriz[1][1] = 5.051f;
		matriz[1][2] = 6.432f;


		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
