package ejercicio65;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio65 {


    public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

    	try {
    		System.out.println("ingrese su edad");
    	   int edad = entrada.nextInt();
    	
    	if (edad < 0 ) {
    		throw new ArithmeticException();
    	}
    	
    	if (edad > 100 ) {
    		throw new InputMismatchException();
    	}	
    	
        System.out.println("Edad: " + edad);

    	
         }catch (ArithmeticException e) { 
             System.out.println("Error: su edad no puede ser negativo");	
             
         }catch (InputMismatchException e) {
                 System.out.println("Error: Debes ingresar un dato valido.");	
    }	
	
	
	
}
}
