package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {									
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numero = new int[3];
		
		double numeroaleatorio = (Math.random() * 50);
		
		for (int i = 0; i < 3; i++) {
		
		System.out.println("ingresa un numero entre el 0 y 50 : ");
		numero[i]= entrada.nextInt();
		
}
		
		if (numero[0] == numeroaleatorio) {
			System.out.println("ganaste"+numero[0]);
		}
			
		else if (numero[1]==numeroaleatorio) {	
				System.out.println("ganaste"+numero[1]);

}
		else if (numero[2]==numeroaleatorio) {
			   System.out.println("ganaste"+numero[2]);
		}
		
		else {
			System.out.println("perdiste");
		}
}
}

	
	