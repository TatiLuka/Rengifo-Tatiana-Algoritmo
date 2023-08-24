package sentencia_if_else;

import java.util.Scanner;

public class sentencia_if_else {
	/* En programaci�n una sentencia, es una l�nea de comandos. 
	  Por ejemplo: indicar que una variable es entera, o mostrar en 
	  pantalla una frase, o determinar la funci�n principal. Pero tambi�n
	  tenemos las llamadas SENTENCIAS DE CONTROL DE FLUJO.
	  En este script (o sea, en este programa), vamos a ver la sentencia condicional if.  */
	
	
	/* SENTENCIA CONDICIONAL IF 
	 	La instrucci�n if permite ejecutar ciertas instrucciones s�lo si de da una determinada condici�n. Else, se 
		puede usar o no. Su funci�n, es dar una instrucci�n que se har� s� o s�, si NO se cumpli� anteriormente la 
		condici�n del if. 
		
		Su sintaxis de uso es la sintaxis:
		if ( <condici�n> ) {
 			<instrucciones>}
 			
		else{
 		<instruccionesElse>
		}
		DETALLE: else NO lleva condiciones, ya que las mismas son analizadas por "if". 
		
		En caso de analizar mas de una condici�n:
		if ( <condici�n> ) {
 			<instrucciones>}
 			
		else if ( <condici�n2> ) {
 		<instruccionesElseIf>
		}
		
		else{
 		<instruccionesElse>
		}
		
		FORMAS DE ANALIZAR LA CONDICI�N: 
		-variable == numero (para analizar si es exactamente igual a un numero)
		
		-variable> numero : para analizar si es mayor a un numero
		
		-variable< numero : para analizar si es menor a un numero
		
		-variable>= numero : para analizar si es mayor o igual a un numero
		
		-variable<= numero : para analizar si es menor o igual a un numero
		
		-variable!= numero : para analizar si es distinta a un numero
		
		-numero1 && numero2 : el "&&" me permite analizar ambos numeros
		
		-numero1 || numero 2: el "||" me permite analizar un numero u otro
		
		-variable caracter == 'caracter': para analizar si una variable es exactamente el 
		caracter entre ap�strofes ' '
		
