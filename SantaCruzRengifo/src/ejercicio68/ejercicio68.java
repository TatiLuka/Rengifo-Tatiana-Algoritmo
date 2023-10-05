package ejercicio68;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio68 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		String[] apellidos = {"rengifo","romero","tuñer","santa cruz","beltran"};
		
	   try {
		   
		   for (int i = 0; i <= 4; i++) {
		   System.out.println("Ingrese un numero : ");
		   numero = entrada.nextInt();
			
		if (numero <0 || numero > 4) {
	    throw new IndexOutOfBoundsException();
	}
		
		String apellidoEmpleado = apellidos[numero];
        System.out.println("El apellido del empleado es: " + apellidoEmpleado);
		   }
		   } 
	         catch (IndexOutOfBoundsException e) {
			           System.out.println("Error.");
			       } 
	         catch (InputMismatchException e) {
			           System.out.println("Error: Debes ingresar un dato valido.");
			       } 

	}
}
