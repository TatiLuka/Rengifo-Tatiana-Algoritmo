package metodosString;

public class substring {

	public static void main(String[] args) {
		String saludo = "Hola, vengo a saludar.";
					//   0123456  (posicion de cada caracter en el String de arriba).
		String recorteSaludo = saludo.substring(6);
		/*substring() se queda con una parte de otro String. 
			
			substring(argumento1): recorta el String desde una posición, hacia el final.
			substring(argumento1, argumento2): recorta el string entre dos posiciones de otro String.
		
		*/
		
		System.out.println(recorteSaludo);

	}

}
