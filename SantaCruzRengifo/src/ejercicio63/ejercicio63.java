package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {

	static String correo, contrase�a;

	public static void gmail() {
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("ingrese su correo: ");
		  correo = entrada.next();
		}
		
		while(!CorreoValido(correo));
		
		do {
			System.out.println("ingrese su contrase�a: ");
			contrase�a = entrada.next();
		}
		
		while (!Contrase�aValida(contrase�a));
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

	public static boolean Contrase�aValida(String contrase�a) {
    	   if(contrase�a.length() < 6 || contrase�a.length() > 12){
    	   System.out.println("Contrase�a invalida, debe contener entre 6 y 12 caracteres");
    	   return false;
	}
	return true;
	
	}

	
	public static void main(String[] args) {
		
     gmail();
}
	}
	

