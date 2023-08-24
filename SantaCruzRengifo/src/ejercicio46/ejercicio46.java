package ejercicio46;

import java.util.Scanner;

public class ejercicio46 {

	public static void main(String[] args) throws InterruptedException {
	
		Scanner datos = new Scanner(System.in);

		int[] Socinum = {1011, 2367, 8748, 9121, 817, 6423, 2034} ;
		String[] NombreSoci = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
		int numSocio;
		int N1;

		System.out.println("ingrese un numero de socio/a:");
		numSocio = datos.nextInt();

		for (int i = 0; i <= 6; i++) {
			if (Socinum[i] % 2 == 0) {

		if( numSocio == Socinum[i]) {

		System.out.println("Pertenece al Socio/a: "+ NombreSoci[i]);


		System.out.println("\n Nombre: "+NombreSoci[i]+"\n Numero de socio: "+Socinum[i]);
		
		}

		}
		}
	}
}
	
	
	
	
