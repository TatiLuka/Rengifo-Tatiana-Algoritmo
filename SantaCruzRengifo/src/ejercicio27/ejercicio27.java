package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contraseņa = 2006, intentos = 0;
		boolean intento = false;
		

		System.out.println(" ingrese una contraseņa: ");
		contraseņa = entrada.nextInt();

		while (contraseņa != 2006 && intentos < 3 && intento == false) {
			intentos++;
			System.out.println("\nContraseņa incorrecta ");
			
			System.out.println("Intentaste: "+intentos+"vez/veces");
			contraseņa = entrada.nextInt();
}
		
		if (contraseņa == 2006) {
		intento = true; 
		System.out.println("Contraseņa correcta! ");
}
		
		if (contraseņa!=2006) {
		System.out.println("Contraseņa bloqueada! ");
		
}
		
}
}