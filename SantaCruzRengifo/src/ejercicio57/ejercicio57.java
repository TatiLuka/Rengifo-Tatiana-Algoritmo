package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {

	static float n1;
	static float n;

	public static float numero() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero  : ");
		n = entrada.nextFloat();

		int numero = (int) n;
		n1 = (n - numero);
		return numero;
  }

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		numero();
		System.out.println("la parte decimal es: " + n1);

	}
}