package repaso_2;

import java.util.Scanner;

public class repaso_2 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);
		
		String[] apellidos = { "Rengifo", "Lopez", "Santa Cruz" };
		
		int [] edad = { 30, 40, 50 };
		
		int [] dni = { 47694193, 47758260, 47494829 };
		
		String[] marca = { "Chevrolet", "Peugeot", "Renault" };
		
		String[] modelos = { " Corsa", "208", "Sandero" };
		
		int [] anio = { 2018, 2021, 2022 };
		
		String[] patente = { " AD178JK", "AD200RS", "AD202VW" };
		
		for (int i = 0; i < anio.length; i++) {
		 if (anio[i] > 2020 && edad[i]>25 ) {
		
			 System.out.println("El auto "+marca[i]+" del año "+anio[i]+",patenete "+patente[i]+",pertenece a "+apellidos[i]+" que tiene "+edad[i]+" años "+"y su DNI es "+dni[i]);
}
	}
}
}