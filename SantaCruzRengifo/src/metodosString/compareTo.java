package metodosString;

import java.util.Scanner;

public class compareTo {
	public static void main(String[] args) {

		String cadena1 = "americano";
		String cadena2 = "coche";

		System.out.println(cadena1.compareTo(cadena2));
		
		/* Si cadena1 comienza con una letra MENOR alfabéticamente: cadena1.compareTo(cadena2) 
		  	será NEGATIVO.
		*/
		
		/* Si cadena1 comienza con una letra MAYOR alfabéticamente: cadena1.compareTo(cadena2) 
	  		será POSITIVO.
		 */
		
		/* Si cadena1 ES IGUAL a la cadena2: cadena1.compareTo(cadena2): el resultado sera 0.
		 */

	}
}
