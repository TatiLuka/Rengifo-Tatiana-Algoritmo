package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {

	static String correo, contraseña;

	public static void gmail() {
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("ingrese su correo: ");
		  correo = entrada.next();
		}
		
		while(!CorreoValido(correo));
		
		do {
			System.out.println("ingrese su contraseña: ");
			contraseña = entrada.next();
		}
		
		while (!ContraseñaValida(contraseña));
	}

	public static boolean CorreoValido(String correo) {
		int arroba = -1;
		int punto = -1;

		for (int i = 0; i < correo.length(); i++) {
			
			if (correo.charAt(i) == '@') {
				arroba = i;
			}

			if (correo.charAt(i) == '.') {
				punto = i;
			}

		}

		if (arroba == -1 || punto == -1 || arroba > punto) {
			System.out.println("Correo invalido, Ingrese de nuevo su correo ");
			return false;
		}

		return true;

	}

	public static boolean ContraseñaValida(String contraseña) {
    	   if(contraseña.length() < 6 || contraseña.length() > 12){
    	   System.out.println("Contraseña invalida, debe contener entre 6 y 12 caracteres");
    	   return false;
	}
	return true;
	
	}

	
	public static void main(String[] args) {
		
     gmail();
}
	}
	

