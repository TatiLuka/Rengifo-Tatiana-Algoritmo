package metodosString;

import java.util.Scanner;

public class chatAt {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		String apellido;
		int n1;
		System.out.println("cual es su apellido? ");
		apellido = datos.next();// ingresamos el valor del string
		System.out.println("cuantos caracteres tiene su apellido");
		n1 = datos.nextInt();// asignamos un numero a la variable n1
		char posicion = apellido.charAt(n1 - 1);// la variable char posicion tomara el valor de un caracter del string
												// segun el valor de n1 puesta en el charAT
		System.out.println("su apellido termina con:" + posicion); // mostramos el valor de la variable posicion
		char prestamo;
		System.out.println("Usted desea realizar un prestamo? indique para afirmar (S) y para anular (N) ");

		// apellido = Perez;
		// char posicion0 = apellido.charAt(0) ; -> posicion0 = 'P';
		// char posicion1 = apellido.charAt(1) ; -> posicion1 = 'e';
		// char posicion2 = apellido.charAt(2) ; -> posicion2 = 'r';
		// char posicion3 = apellido.charAt(3) ; -> posicion3 = 'e';
		// char posicion4 = apellido.charAt(4) ; -> posicion4 = 'z';
		
		// Si quiero pasar la P a minuscula -> posicion0.toLowerCase();
		prestamo = datos.next().charAt(0); // aqui la variable "prestamo" toma el valor segun el caracter seleccionado

		if (prestamo == 's') { // al seleccionar el caracter (s) se ejecuta el mensaje
			System.out.println("¡Usted autorizo el prestamo!");
		}

		if (prestamo == 'n') {// al seleccionar el caracter (n) se ejecuta el otro mensaje
			System.out.println("¡Usted denego el prestamo!");

		}
	}
}
