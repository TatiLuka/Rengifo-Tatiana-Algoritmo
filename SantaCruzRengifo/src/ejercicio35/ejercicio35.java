package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args)throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		float nota, not_min = 11,not_max = 0, promedio=0;
		
		
		for (int calificacion = 1;  calificacion <=5;  calificacion++  ) {
			System.out.println(" ingrese la calificacion del alumno: ");
			nota = entrada.nextInt();
			
			if ( nota < not_min) {
			   not_min = nota;  	   
			}
		 
		   if (nota > not_max) {
			   not_max = nota;
		   }
			
          promedio += nota;
		   
		}
		System.out.println("su nota minima es: "+not_min);
		System.out.println("su nota maxima es: "+not_max);
       
	    promedio = promedio/5;

	    System.out.println("el promedio es: "+promedio);
	    
	}		
}
