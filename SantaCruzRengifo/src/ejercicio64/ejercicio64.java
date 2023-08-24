package ejercicio64;

import java.util.Scanner;

public class ejercicio64 {
	

	static String nombre,apellido,nombreMinusculas;
	
	public static void IngDeDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el nombre: ");
		nombre = entrada.next();
		
		System.out.println("ingrese el apellido: ");
		apellido = entrada.next();
	}
	
	public static void palabras() {

	    nombreMinusculas = nombre.toLowerCase(); 
		nombreMinusculas = apellido.toLowerCase(); 
	
		nombreMinusculas.toLowerCase().charAt(0));
	}
	

	
	public static void main(String[] args) {
	
	
}
}