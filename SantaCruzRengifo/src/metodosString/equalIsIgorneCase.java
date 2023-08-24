package metodosString;

import java.util.Scanner;

public class equalIsIgorneCase {
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		
		String nombre1, nombre2;
		
		System.out.println("\nIngrese un nombre: ");
		nombre1 = entrada.next();
		
		
		System.out.println("\nIngrese un nombre: ");
		nombre2 = entrada.next();
		
		
		
		if ( nombre1.equalsIgnoreCase(nombre2) ) { // Si son iguales te devuelve true sin importar que los nombres esten en mayuscula o en minuscula
			 System.out.println(nombre1 + " y " + nombre2 + " son IGUALES");
		}
			else {
			 System.out.println(nombre1 + " y " + nombre2 + " son DIFERENTES"); // distintos = falso,//caso contrario si son distintos te devuelve falso
		}
		
		
		
		
		
		
		
	}
}
