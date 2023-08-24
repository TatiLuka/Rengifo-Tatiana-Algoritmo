package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] Socinum = {1011, 2367, 8748, 9121, 817, 6423, 2034} ;
		String[] NombreSoci = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
		int numSocio;

		System.out.println("ingrese un numero de socio/a:");
		numSocio = datos.nextInt();

		for (int i = 0; i <= 6; i++) {

		if( numSocio == Socinum[i]) {

		System.out.println("Pertenece al Socio/a: "+ NombreSoci[i]);


		System.out.println("\n Nombre: "+NombreSoci[i]+"\n Numero de socio: "+Socinum[i]);
		
		}

		}
		}
	}