package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int Num1;
		
		System.out.println("ingrese un numero : ");
		Num1= entrada.nextInt();
		
		if (Num1 != 0) {
			System.out.println("se puede realizar la division ");
		}
	 
		else {
			System.out.println("no puede ");

		}
}

}	