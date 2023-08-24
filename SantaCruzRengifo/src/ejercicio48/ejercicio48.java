package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {

	public static void main(String[] args) {

		String[] apellidos= { "Rengifo", "Lopez", "Santa Cruz","Flores"};
		String apellidoMax = "";
		String apellidosMin = "{";	
		
		for (int i = 0; i<apellidos.length; i++) {
		
		if (apellidos[i].compareTo(apellidoMax)>0) {
			apellidoMax = apellidos[i];
			
		}

		if (apellidos[i].compareTo(apellidosMin)<0) {
		apellidosMin = apellidos[i];
		
		}
		
		}
		
		System.out.println("Ultimo apellido: " + apellidoMax);
		System.out.println("primer apellido: " + apellidosMin);
}
}
