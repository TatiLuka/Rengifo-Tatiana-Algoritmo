package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

    char talle;
		
	System.out.println("ingrese un caracter entre S,M y L :");
	talle = entrada.next().charAt(0);
	
	if (talle == 'S') {
		System.out.println("solo quedan 5 remeras");
	}
		
	else if (talle == 'M') {
		System.out.println("solo quedan 2 remeras");
	}	
		
	else if (talle == 'L') {
		System.out.println("no quedan mas remeras");
	}
	
}

}
	


