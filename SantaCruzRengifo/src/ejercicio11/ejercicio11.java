package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	int Num1;
	
		System.out.println("ingresa un numero: ");
	Num1 = entrada.nextInt();
	
	if (Num1 == 0 ){
		System.out.println("su numero es igual a 0 ");}
	
	else if (Num1>=1){
		System.out.println("su numero es positivo");	}

	else if (Num1<=-1) {
		System.out.println("su numero es negativo ");}
	}
}

