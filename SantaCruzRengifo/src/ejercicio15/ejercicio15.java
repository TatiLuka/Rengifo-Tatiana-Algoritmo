package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float Num, Num1;
		
		System.out.println("\t cajero automatico");
		System.out.println("ingrese el costo total: ");
		Num = entrada.nextFloat();
		
		if (Num> 15000) {
		
         Num1 = Num;

         Num1 = Num1 * 0.10f; 
		
         Num = Num - Num1;
         
		System.out.println("El costo es: "+Num);}
		
		else if (Num< 15000) {
			System.out.println("el costo total que ingreso");
		
		}
	

	
	
	}
	
}	
	
	
