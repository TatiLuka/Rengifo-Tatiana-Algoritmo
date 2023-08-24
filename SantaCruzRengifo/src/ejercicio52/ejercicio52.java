package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[2][2];

		matriz[0][0] = -3;
		matriz[0][1] = 2;
		matriz[1][0] = 9;
		matriz[1][1] = 4;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				

				if (matriz[i][j] <= 0) {
				System.out.println(" el numero es negativo ingrese un nuevo número ");
				matriz[i][j] = entrada.nextInt();
				
				}
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println();
		}

	}

}

