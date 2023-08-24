package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		char decision = 'N';
		boolean quiero_salir = false;
		
		
		System.out.println(" ¿puedo salir? ");
		contraseña = datos.nextInt();
		
		while (decision == 'N' && quiero_salir == false) {
		 
			if (decision == 'S') {
				quiero_salir = true; 
				
			} else if (decision == 'N') {
				System.out.println(" ¿puedo salir? ");
				decision = entrada.next().charAt(0);
			}
		}
	}
}

