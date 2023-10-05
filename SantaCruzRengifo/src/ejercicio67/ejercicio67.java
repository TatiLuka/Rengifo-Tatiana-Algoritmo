package ejercicio67;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio67 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);


			try {
			System.out.println("Ingrese un numero para calcular la raiz: ");
			int numero = entrada.nextInt();

			int raiz_cuadrada = (int) Math.sqrt(numero);
			System.out.println("la raiz es:"+raiz_cuadrada);

			if (numero < 0 ) {
			throw new ArithmeticException();
			}

			  } catch (ArithmeticException e) {
			           System.out.println("Error: numero negativo.");
			       } 
	         catch (InputMismatchException e) {
			           System.out.println("Error: Debes ingresar un dato valido.");
			       } 

}
}


