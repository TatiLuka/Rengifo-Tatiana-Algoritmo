package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contrase�a, intentos = 0;

		System.out.println(" ingrese una contrase�a: ");
		contrase�a = entrada.nextInt();

		while (contrase�a != 2006 && intentos < 3) {
			intentos++;
			System.out.println("\nContrase�a incorrecta ");
			
			
			System.out.println("Intentaste: "+intentos+"vez/veces");
			contrase�a = entrada.nextInt();

		
		}
		
		if (contrase�a == 2006) {
		System.out.println("Contrase�a correcta! ");
		}
		if (contrase�a!=2006) {
		System.out.println("Contrase�a bloqueada! ");
		}
	}
}