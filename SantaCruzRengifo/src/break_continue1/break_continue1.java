package break_continue1;

import java.util.Scanner;

public class break_continue1 {

	public static void main(String[] args) throws InterruptedException {

		Scanner entrada = new Scanner(System.in);

		int N1;
		int[] N = new int[6];

		for (int i = 1; i <= 5; i++) {

			System.out.println("Ingrese un numero:");
			N[i] = entrada.nextInt();

		}

		for (int j = 1; j <= 5; j++) {
			if (N[j] < 0) {
				continue;
			}

			else {
				System.out.println("El valor de numero es: " + N[j]);
			}
		}
	}
}