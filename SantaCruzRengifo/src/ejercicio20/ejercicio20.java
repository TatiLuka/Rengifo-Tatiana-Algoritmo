package ejercicio20;

import java.util.Scanner;

public class ejercicio20
{
public static void main(String[] args) throws InterruptedException
{
Scanner datos = new Scanner(System.in);
int seguidores = 1;

while (seguidores <=100) {
System.out.println("seguidores totales: "+seguidores);
Thread.sleep(20);

seguidores++;



}
System.out.println("felicidades! haz llegado a los 100 seguidores :)");
}

}