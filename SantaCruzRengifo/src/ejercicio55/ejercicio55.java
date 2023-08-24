package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {

	static float n1;

	public static void alCuadrado() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		n1 = entrada.nextInt();

	}

	public static float elevar(float a) {
		float eleva = a * a;
		return eleva;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		alCuadrado();
		elevar(n1);
		System.out.println("El resultado al cuadrado es : " + elevar(n1));

	}
}
