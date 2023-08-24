package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
	
	public static void main (String[] args) {
		Scanner datos = new Scanner (System.in);
	
		int lleta;
	
			System.out.println("\t que talle de remera desea?");
			System.out.println("\n 1-talle s \n 2-talle m \n 3-talle l \n 4-salir" );
	
			System.out.println("\n que desea:");
	
			lleta = datos.nextInt();
		switch(lleta) { 

			case 1:
			System.out.println("quedan 5 remeras");
			break; 
			
			case 2:
			System.out.println("quedan 2 remeras");
			break;
			
			case 3:
			System.out.println("no quedan remeras");
			break;
			
			case 4:
			System.out.println("adios hasta luego!!");
			break;
			
			default:
			System.out.println("el valor introducido no esta dentro del rango de numeros aceptados.");
			break;
					}

											}
						}
