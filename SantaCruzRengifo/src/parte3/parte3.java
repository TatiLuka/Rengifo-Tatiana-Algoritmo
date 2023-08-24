package parte3;

import java.util.Scanner;

public class parte3 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in); 
		
	   char talle;
	   int  talle1,talle2,descuento1;
	   
	   
	System.out.println("ingrese una letra mayuscula entre S, M o L: "); 
	 talle = entrada.next().charAt(0);
	 
	 switch(talle) {
	 
	 case 'S':
		 System.out.println("cuantas remeras desea comprar: ");	 
		 talle1 = entrada.nextInt();
		
		 
		 if (talle1 >= 15 && talle1 <=30 ) {
			 
					 
	     System.out.println("\ncuantas remeras compro: "+ talle1); 
	     
	     talle1 = talle1*5500;
	     
	     talle2 = talle1/100*15;
		
	     descuento1 = talle1 - talle2;
		
	     System.out.println("\ngasto total: "+talle1);
	     System.out.println("\nprecio de las remeras: "+descuento1);	
		 }			 
		
		
		 else if (talle1 < 15){
			 
			  talle1 = talle1*5500;
			 
          System.out.println("El precio total es: "+talle1);		 
		 }
		 else if (talle1 > 30) {
			 System.out.println("No hay stock");
		 }

		 break;
		 
		 
	 case 'M':
		 System.out.println("cuantas remeras desea comprar: ");	 
		 talle1 = entrada.nextInt();
		
		 
		 if (talle1 >= 22 && talle1 <=40 ) {
			 talle1 = talle1*5500;
		     
		     talle2 = talle1/100*15;
			
		     descuento1 = talle1 - talle2;	 
					 
	     System.out.println("\ncuantas remeras compro: "+ talle1);
		
	     System.out.println("\ngasto total: "+talle1);
	     System.out.println("\nprecio de las remeras: "+descuento1);	
		 }			 
		
		
		 else if (talle1 < 15){
			 
			  talle1 = talle1*5500;
			 
          System.out.println("El precio total es: "+talle1);		 
		 }
		 else if (talle1 > 40) {
			 System.out.println("No hay stock");
		 }

		 break;
	
	 case 'L':
		 System.out.println("cuantas remeras desea comprar: ");	 
		 talle1 = entrada.nextInt();
		
		 
		 if (talle1 >= 35 && talle1 <=50 ) {
			 
					 
	     System.out.println("\ncuantas remeras compro: "+ talle1); 
	     
	     talle1 = talle1*5500;
	     
	     talle2 = talle1/100*15;
		
	     descuento1 = talle1 - talle2;
		
	     System.out.println("\ngasto total: "+talle1);
	     System.out.println("\nprecio de las remeras: "+descuento1);	
		 }			 
		
		
		 else if (talle1 < 35){
			 
			  talle1 = talle1*5500;
			 
          System.out.println("El precio total es: "+talle1);		 
		 }
		 else if (talle1 > 50) {
			 System.out.println("No hay stock");
		 }

		 break;
		 
		 
		 
		 
		 
		 
	 }
	 
	}
		
	 
	 
	   

	}