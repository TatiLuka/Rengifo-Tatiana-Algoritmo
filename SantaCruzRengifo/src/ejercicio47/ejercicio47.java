package ejercicio47;

import java.util.Scanner;

public class ejercicio47 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de notas del alumno");
		int cantidad = datos.nextInt();

		String[] Nombre = {};
		int[] Notas = { cantidad };
		int length = Notas.length;

		for (int i = 0; i <= Notas.length; i++) {

			System.out.println("Ingrese su Nota");
			Notas[i] = datos.nextInt();

		}

	}
}