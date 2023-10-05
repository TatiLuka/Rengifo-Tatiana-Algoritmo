/* 
  										ARREGLOS O ARRAYS:
  Son estructuras que almacenan datos en una misma variable (int, float, double, long, char, etc.), pero de manera ordenada
  Es decir, guarda datos en "casilleros". HacÃ© de cuenta que es un armario. En un primer estante del armario, guarda un dato.
  En el siguiente estante, guarda otro dato. SIEMPRE del mismo tipo (no puedo mezclar int con float, por ejemplo).
  
  En Java, los arreglos se definen de las siguientes manera:
  
  PRIMERA MANERA -> CUANDO EL PROGRAMADOR NO SABE CUÃ�LES SON LOS DATOS A INGRESAR, SINO QUE LO VA A INGRESAR UN USUARIO:
  
  tipo de arreglo(int, float, char, etc.) [] nombre del arreglo = new tipo de arreglo (mismo que se declarÃ³ antes) [cantidad de datos a guardar];
  LOS ARREGLOS COMIENZAN EN LA POSICIÃ“N 0
  
   Ejemplo:
    int[] Seba = new int[10]; 
     tipo de arreglo: int
     nombre del arreglo: Seba
     cantidad de elementos del arreglo: 10.
     
  SEGUNDA MANERA -> EL PROGRAMADOR SABE QUÃ‰ DATOS ESTARÃ�N EN EL ARREGLO: 
  
     Ejemplo:
    int[] numeros = new int[3]; 
    numeros [0] = 2; 
    numeros [1] = 5;
    numeros [2] = 10;
    
     tipo de arreglo: int
     nombre del arreglo: numeros
     cantidad de elementos del arreglo: 3.
    elemento del primer arreglo (en la posiciÃ³n 0): 2
  	elemento del segundo arreglo (en la posiciÃ³n 1): 5
  	elemento del tercer arreglo (en la posiciÃ³n 2): 10
  	
 */


// EJEMPLO

package array;

public class arreglos {
	public static void main (String args []) {
		
		int[] RiverPlate = new int[3]; /* en este caso, 3 es el nÃºmero de elementos. Acordate que primero SE DEFINEN los arreglos.
										A mi se me ocurriÃ³ llamarlo "RiverPlate" */
		
		RiverPlate[0] = 6; // [0] es la primera posiciÃ³n
		RiverPlate[1] = 11; // [1] es la segunda posiciÃ³n
		RiverPlate[2] = 15; // [2] es la tercera posiciÃ³n
		
		System.out.println("Numero del primer arreglo: "+RiverPlate[0]);
		System.out.println("Numero del segundo arreglo: "+RiverPlate[1]);
		System.out.println("Numero del tercer arreglo: "+RiverPlate[2]);
		
		
	}
	
		
}
