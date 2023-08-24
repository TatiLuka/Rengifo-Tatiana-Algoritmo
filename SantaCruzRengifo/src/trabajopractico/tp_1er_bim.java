package trabajopractico; // es el nombre del paquete 

import java.util.Scanner; // es para usar el scanner

public class tp_1er_bim { // es el nombre de la clase 
	public static void main(String[] args) {// esto es la funcion principal
		Scanner datos = new Scanner(System.in); // es para scannear e ingresar datos 
		
		int opc; // se crea una variable 
		
		//System.out.println es para mostrar algo en pantalla
		System.out.println("\tEste programa te permite resolver algunos problemas");
		System.out.println("\tEliga una opcion: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo." );

		opc = datos.nextInt(); // es para generar datos enteros 

		switch (opc) { // Switch analiza la variable (opc)

		case 1: // es para ejecutar un caso
			System.out.println("Ingresa un numero para calcular su raiz cuadrada: "); // es para mostrar algo en pantalla
			

			int num_raiz; // crea la variable num_raiz
			num_raiz = datos.nextInt(); // es para generar un dato entero 

			if (num_raiz != 0) { // es para saber si num_raiz es distinto a 0
				int raiz_cuadrada = (int) Math.sqrt(num_raiz);
				System.out.println("El resultado es: " + raiz_cuadrada);
			
			}
				else { // es para que si no se cumple el if, se cumpla el else  
				System.out.println("No se puede calcular la raiz de un negativo."); // es para mostrar en pantalla
			}

			break; // break indica que aca termina el switch 
			
		case 2:// para ejecutar otro caso
			System.out.println("Ingresa un numero: "); //es para mostrar algo en pantalla
			

			int num_signo; // crea la variable num_signo 
			num_signo = datos.nextInt(); // es para generar un dato 

			if (num_signo == 0) {// si el num_signo es = a 0 muestra en pantalla " el numero es cero "
				System.out.println("El numero es cero");
			} else if (num_signo > 0) { // si el num_signo es > a 0 muestra en pantalla " el numero es positivo "
				System.out.println("El numero es positivo");
			} else if (num_signo < 0){ // si el num_signo es < a 0 muestra en pantalla " el numero es negativo "
				System.out.println("El numero es negativo");
			}
			break;// es para indicar que ahi termina el switch 
			
		case 3: // es para 
			System.out.println("Ingresa un numero entre 0 y 9"); //es para mostrar la frase en pantalla
            
		
			int num_bingo; // crea la variable num_bingo
			num_bingo = datos.nextInt(); // es para generar un dato 

			double num_ganador_double =  (Math.random() * 9); // es para generar un numero random  
			int num_ganador =  (int) num_ganador_double; // es para igualar el valor de num_ganador a num_ganador_double

			if (num_bingo == num_ganador) { // si num_bingo es = a num_ganador en pantalla muestra "ganaste" 
				System.out.println("Ganaste!");//es para mostrar algo en pantalla
		} 
			else  {
				System.out.println("Perdiste :,(");//es para mostrar algo en pantalla
				System.out.println("El numero ganador es: " + num_ganador);// muestra en pantalla el numero ganador 
			
		}
			break; // es para indicar que ahi termina el switch 
		
		default: // es para indicar que la opcion no esta indicada en el switch
			System.out.println("Opcion incorrecta."); // es para mostrar algo en pantalla
			break; // es para indicar que ahi termina el switch 

		}
	}

}
