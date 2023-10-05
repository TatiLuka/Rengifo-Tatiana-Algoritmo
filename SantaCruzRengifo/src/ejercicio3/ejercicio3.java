package ejercicio5;


import java.util.Scanner;

public class ejercicio5 {

public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
float valor;
int valor2;

System.out.println("Ingrese un numero que quieras saber la raiz ");
valor = entrada.nextFloat();
valor2 = entrada.nextInt();

float raiz_cuadrada = (float) Math.sqrt(valor);
System.out.println("Tu resultado es:"+raiz_cuadrada);

int raiz_cuadrada2 = (int) Math.sqrt(valor2);
System.out.println("Tu resultado es:"+raiz_cuadrada2);


}
}