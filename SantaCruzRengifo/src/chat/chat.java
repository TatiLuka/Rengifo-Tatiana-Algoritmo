package chat;

import java.util.Scanner;

import java.util.InputMismatchException;

public class chat {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean[][] asientos = new boolean[3][4];
	        int ingresosTotales = 0;

	        while (true) {
	            try {
	                System.out.print("Ingrese la fila (A, B o C) o 'q' para salir: ");
	                String fila = scanner.next().toUpperCase();

	                if (fila.equals("Q")) {
	                    break;
	                }

	                int filaIndex = fila.charAt(0) - 'A';
	                
	                if (!fila.equals("A") && !fila.equals("B") && !fila.equals("C")) {
						throw new InputMismatchException("Fila no valida. Por favor, ingrese A, B o C.");
					}

	                System.out.print("Ingrese el numero de asiento (1-4): ");
	                int numeroAsiento = scanner.nextInt() - 1;

	                
	                
	                if (numeroAsiento < 0 || numeroAsiento >= 4) {
	                    throw new InputMismatchException("Numero de asiento no valido. Debe ser entre 1 y 4.");
	                }

	                if (asientos[filaIndex][numeroAsiento]) {
	                    System.out.println("El asiento " + fila + (numeroAsiento + 1) + " esta ocupado. Por favor, elija otro asiento.");
	                } else {
	                    int precio = 0;
	                    switch (fila) {
	                        case "A":
	                            precio = 500;
	                            break;
	                        case "B":
	                            precio = 700;
	                            break;
	                        case "C":
	                            precio = 1000;
	                            break;
	                    }

	                    System.out.println("El precio del asiento " + fila + (numeroAsiento + 1) + " es $" + precio);
	                    asientos[filaIndex][numeroAsiento] = true;
	                    ingresosTotales += precio;

	                    int asientosOcupados = 0;
	                    for (int i = 0; i < 3; i++) {
	                        for (int j = 0; j < 4; j++) {
	                            if (asientos[i][j]) {
	                                asientosOcupados++;
	                            }
	                        }
	                    }

	                    if (asientosOcupados == 12) {
	                        System.out.println("Sala llena.");
	                    }
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Error: " + e.getMessage());
	                scanner.nextLine(); 
	            }
	        }

	        System.out.println("Ingresos totales: $" + ingresosTotales);
	        scanner.close();
	    }
	}

