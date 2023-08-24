package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {

	static float n1,n2;
	static float asistencias;
	static int clases;
    static String nombre;	
	
	public static void nombres () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el nombre y apellido: ");
		nombre = entrada.next();

	}
	
	public static void porcentajeAsistencias () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de asistencias del alumno : ");
		asistencias = entrada.nextFloat();
		System.out.println("Ingresa la cantidad de clases totales : ");
		clases = entrada.nextInt();

	}	
	
	public static float dividir(float a, float b) { 
		    float div = (asistencias / clases)* 100;
		    return div ;
		}
     
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		nombres ();
		porcentajeAsistencias ();
	   dividir(n1, n2); 
	    System.out.println("El porcentaje es: " + dividir(n1, n2) + "%");
	    
	}
	
} 

