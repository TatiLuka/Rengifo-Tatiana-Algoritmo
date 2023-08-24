package ejercicio30;

import java.util.Scanner;

public class ejercicio30 {

	public static void main(String[] args)throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
   for (int seguidores = 1;  seguidores <=100;  seguidores++) {	
	   System.out.println("seguidores totales: "+seguidores);
	   Thread.sleep(20);

	   seguidores++;
	
}
 
   System.out.println("felicidades! haz llegado a los 100 seguidores :)");
   
	}
}