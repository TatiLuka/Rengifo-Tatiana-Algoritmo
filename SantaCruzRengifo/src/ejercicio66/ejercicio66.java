package ejercicio66;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio66 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		
		try {
			
			System.out.println("ingrese un numero: ");
		    num = entrada.nextInt();
			
	    while (num != 15) {
          System.out.println("vuelva intentarlo");
          num = entrada.nextInt();
	    	
			}
	
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");
		}
		finally { 
        	System.out.println("Programa finalizado.");
        }
	}
}