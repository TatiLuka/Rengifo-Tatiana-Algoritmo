package ejercicio28;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args)throws InterruptedException {
		Scanner entrada = new Scanner(System.in);		

		int bateria = 100;
		
	   while (bateria != 0) {
	
			  bateria--;
			  Thread.sleep(200);
			  
			  if(bateria==20) {
				  Thread.sleep(1000);
				  System.out.println("Bateria Baja");
			 
			  }
			  System.out.println("tienes "+bateria+ " % de bateria ");
	   
			  if(bateria==0) {
					 System.out.println("Bateria Agotada");  
			     }
			  }
			  
	}



}
