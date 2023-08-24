package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		float numero;
		Scanner entrada = new Scanner (System.in);
	
		System.out.println("ingrese cuanto se saco en el examen");
	
		numero = entrada.nextFloat();
		
		double numero2 = 1.10;
		int numRedondeado = (int) Math.round(numero);
		
		System.out.println("la nota del examen es "+numRedondeado);
	
	
	}
	
	
	
}
