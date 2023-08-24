package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contraseña = 2006, intentos = 0;
		boolean intento = false;
		

		System.out.println(" ingrese una contraseña: ");
		contraseña = entrada.nextInt();

		while (contraseña != 2006 && intentos < 3 && intento == false) {
			intentos++;
			System.out.println("\nContraseña incorrecta ");
			
			System.out.println("Intentaste: "+intentos+"vez/veces");
			contraseña = entrada.nextInt();
}
		
		if (contraseña == 2006) {
		intento = true; 
		System.out.println("Contraseña correcta! ");
}
		
		if (contraseña!=2006) {
		System.out.println("Contraseña bloqueada! ");
		
}
		
}
}