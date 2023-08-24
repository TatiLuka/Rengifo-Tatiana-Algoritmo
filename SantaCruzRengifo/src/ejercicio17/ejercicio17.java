package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int Num1, Num2, Num3;

		System.out.println("Ingrese un numero : ");
		Num1 = entrada.nextInt();

		System.out.println("Ingrese otro numero : ");
		Num2 = entrada.nextInt();

		System.out.println("Ingrese un tercer numero : ");
		Num3 = entrada.nextInt();

		if (Num1 > Num2 && Num1 < Num3) {
			System.out.println("\nel mayor: " + Num3);
			System.out.println("el segundo mayor: " + Num1);
			System.out.println("el menor: " + Num2);

		}

		if (Num1 > Num2 && Num2 < Num3) {
			System.out.println("\nel mayor: " + Num1);
			System.out.println("el segundo mayor: " + Num3);
			System.out.println("el menor: " + Num2);

		}

		if (Num2 > Num3 && Num3 < Num1) {
			System.out.println("\nel mayor: " + Num2);
			System.out.println("el segundo mayor: " + Num1);
			System.out.println("el menor: " + Num3);
		}

		if (Num2 > Num1 && Num2 < Num3) {
			System.out.println("\nel mayor: " + Num2);
			System.out.println("el segundo mayor: " + Num3);
			System.out.println("el menor: " + Num1);

		}

		if (Num3 > Num1 && Num3 < Num2) {
			System.out.println("\nel mayor: " + Num3);
			System.out.println("el segundo mayor: " + Num2);
			System.out.println("el menor: " + Num1);

		}

		if (Num3 > Num2 && Num3 < Num1) {
			System.out.println("\nel mayor: " + Num3);
			System.out.println("el segundo mayor: " + Num1);
			System.out.println("el menor: " + Num2);
		}

	}

}
