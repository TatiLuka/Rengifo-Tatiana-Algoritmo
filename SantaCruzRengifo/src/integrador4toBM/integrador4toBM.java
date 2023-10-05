package integrador4toBM;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class integrador4toBM {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Intenta adivinar un número entre 1 y 100.");

        while (!adivinado && intentos < 10) {
            try {
                System.out.print("Ingresa un número: ");
                int numeroIngresado = scanner.nextInt();

                intentos++;

                if (numeroIngresado == numeroSecreto) {
                    System.out.println("\nAdivinaste el número secreto " + numeroSecreto + " en " + intentos + " intentos.");
                    adivinado = true;
                    
                } 
                
                else if (numeroIngresado < numeroSecreto && intentos < 10) {
                    System.out.println("\nEl número secreto es mayor. Sigue intentando.");
                } 
                
                else if (numeroIngresado > numeroSecreto && intentos < 10){
                    System.out.println("\nEl número secreto es menor. Sigue intentando.");
                }
                
           
                
                System.out.println("\nNumero de intentos: "+intentos);
              
                
            } 
            
            catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
              
                scanner.nextLine();
            }
        }

        if (!adivinado) {
            System.out.println("\nTe quedaste sin intentos :( ");
        }

        
    }
}
