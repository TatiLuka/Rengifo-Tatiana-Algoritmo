package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String Nombre;
		
		int Num1;

		System.out.println("ingresa tu nombre : ");
		Nombre = entrada.next();
		
        double numero = (Math.random() * 99);

		int resultado = (int) numero;

		System.out.println("Nombre " + Nombre);
		
		System.out.println("ingresa un numero entre el 0 y 99 : ");
		Num1 = entrada.nextInt();
		
		if (Num1 == resultado) {
		System.out.println("Ganaste!");
		}
			
		else {	
		System.out.println("perdiste");
		}
		
		System.out.println("su numero de bingo es :" + resultado);
	}
}

	
	
	
	
	
	
	
	

