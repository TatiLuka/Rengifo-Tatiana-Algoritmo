package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {

	/*
	 * Se le solicita a un usuario que ingrese un n�mero (puede ser entero o
	 * flotante). Armar una funci�n para el ingreso de ese n�mero. Luego, armar otra
	 * funci�n que devuelva �true� si el n�mero es positivo, o �false� si es
	 * negativo. Mostrar en pantalla el resultado de la funci�n.
	 */
	
	static float n;
	static boolean positivo = false;

	public static void numero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un numero  : ");
		n = entrada.nextFloat();
	}

	public static boolean positivo() {
		Scanner entrada = new Scanner(System.in);

		
		if (n < 0) {
			System.out.println("Es negativo");

			positivo = false;
		}

		else if (n > 0) {
			System.out.println("es positivo");

			positivo = true;
		}

		return positivo;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		numero();
		positivo();

	}
}
