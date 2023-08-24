package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("que calificacion tendras en el año");
		
		double numRandom = (Math.random()*10);
		 int numAleatorio = (int) numRandom;
		 
		System.out.println("tu nota final : "+numAleatorio);
		
		
	}

}
