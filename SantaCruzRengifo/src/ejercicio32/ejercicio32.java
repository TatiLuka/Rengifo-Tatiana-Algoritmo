package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {

	public static void main(String[] args)throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		int por, resultado;
		
		System.out.println("ingrese un numero: ");
		por = entrada.nextInt();
		
		for (int tabla =1;   tabla <=20;  tabla++  ) {
			
		resultado = por*tabla;  
		
		System.out.println(por+"x"+tabla+"="+resultado);
		
		}
}
}