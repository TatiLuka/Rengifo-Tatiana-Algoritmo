package repaso;

import java.util.Scanner;

public class repaso {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		System.out.println("ingrese una cantidad de lista de números de DNI: ");
		int cantidad = datos.nextInt();
		int[] dni = new int[cantidad];
		int dniBuscado;

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

		String[] apellidos = { "Rengifo", "Lopez", "Santa Cruz" };

		for (int i = 0; i < apellidos.length; i++) {
			System.out.print(" apellidos " + apellidos[i] + "\n");
		}

		for (int i = 0; i <= 6; i++) {

			System.out.println("busque un número de DNI: ");
			dniBuscado = datos.nextInt();

			if (dniBuscado == dni[i]) {

				System.out.println("Pertenece a: " + apellidos[i]);

				break;

			}
		}
	}
}