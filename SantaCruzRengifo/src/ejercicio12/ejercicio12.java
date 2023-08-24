package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	int nota; 
	  
	
	System.out.println("ingrese sus calificaciones : ");
	nota = entrada.nextInt();
	
	if (nota<1 || nota>10) {
		System.out.println("numero incorrecto");
	}
	
	else if (nota>=1 && nota<=3) {
		System.out.println("su nota es insuficiente");
	}
		
	else if (nota>3 && nota<6) {
		System.out.println("su nota no es logrado");
	}	
		
	else if (nota>=6 && nota<=7) {
		System.out.println("su nota es suficiente");
	}	
		
	else if (nota>=8 && nota<=9) {
		System.out.println("su nota es notable");
	}	
		
	else if (nota == 10) {
		System.out.println("su nota es sobresaliente");
	}	
		
	}
}
