package ejercicio64;

import java.util.Scanner;

public class ejercicio64 {
	

	static String nombre,apellido,nombreMinusculas,apellidoMayus;
	static char inicial_n,inicialAP;
	
	
	public static void IngDeDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el nombre: ");
		nombre = entrada.next();
		
		System.out.println("ingrese el apellido: ");
		apellido = entrada.next();
	}
	
	public static void palabras() {

	    nombreMinusculas = nombre.toLowerCase(); 
		apellidoMayus = apellido.toLowerCase(); 
	
		nombreMinusculas.toLowerCase().charAt(0);
		System.out.println(nombreMinusculas + "\n" + apellidoMayus);  
	}
	
	
	public static void inicial() {
		
		inicial_n = nombre.toUpperCase().charAt(0);
		inicialAP = apellido.toUpperCase().charAt(0);
		
		System.out.println(inicial_n);
		System.out.println(inicialAP);
		
		
	}
	
	public static void recortar() {
		
		String recortado = nombreMinusculas.substring(1);
		String recorteAP = apellidoMayus.substring(1);
		
		System.out.println(recortado);
	   System.out.println(recorteAP);
	}
	
	
	public static void main(String[] args) {
			
		IngDeDatos();
		palabras();
		inicial();
		recortar();
}
}