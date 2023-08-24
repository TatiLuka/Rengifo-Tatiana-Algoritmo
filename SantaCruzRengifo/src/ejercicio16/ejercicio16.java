package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
 
		int horas, minutos, segundos;
		
		System.out.println("ingrese el numero de horas (que no sea mayor de 24)");
        horas = entrada.nextInt();	
	
        System.out.println("ingrese el numero de minutos (que no sea mayor de 60)");
        minutos = entrada.nextInt();	
        
        System.out.println("ingrese el numero de segundos (que no sea mayor de 60)");
        segundos = entrada.nextInt();
        
        if (horas<=24 && minutos<=60 && segundos<=60) {
        	
        	System.out.println(" el numero ingresado es correcto: ");
            	
        }
        
        else {
        	System.out.println("el numero ingresado es incorrecto");
           
        }
        
        
        
        
	}
	
}
