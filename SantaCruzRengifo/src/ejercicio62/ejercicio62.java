package ejercicio62;

import java.util.Scanner;

public class ejercicio62 {

	static String MenorApellido = "";
	static String MayorApellido = "";

	public static void palabras() {

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese un apellido: " + (i+1));
			String apellido = entrada.next();

			
		if (i == 0)	{
			MenorApellido = apellido;
			MayorApellido = apellido;
			
		}
			
		else if (apellido.compareTo(MenorApellido) < 0) {
			MenorApellido = apellido;
		
		}
		
		if (apellido.compareTo(MayorApellido) > 0) {
			MayorApellido = apellido;
			

		}
		
		}
		
		System.out.println( " El menor alfabeticamente es: " + MenorApellido );
		System.out.println( " El mayor alfabeticamente es: " + MayorApellido );
		
	
		
	}

	

	public static void main(String[] args) {

		palabras();
	}

}