package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int tamaño;
		Scanner sw = new Scanner(System.in);
		System.out.println("Introduce la frase");
		String frase = sw.nextLine();
		tamaño = frase.length();//saca la cantidad de caracteres q tenemos en el string
		System.out.println("Longitud: " + tamaño);//muestra la cantidad de caracteres que hay en el string
		System.out.println("Mayusculas: " + frase.toUpperCase());//pasa todo el string a mayusculas
		System.out.println("Palabra por Palabra");
		String[] arrayDeCadenas = frase.split(" ");
		for (int i = 0; i < arrayDeCadenas.length; i++)
		{
			System.out.println(arrayDeCadenas[i]);
		}
		char[] arrayDeLetras = frase.toCharArray();
	    int cantidadDeMinisculas = 0;
	    for (int i = 0; i < arrayDeLetras.length; i++) {
	      if (!Character.isUpperCase(arrayDeLetras[i]) && arrayDeLetras[i] != ' ') {//analiza caracter a caracter de tal manera que si son diferentes significa que estamos encima de una minuscula  
	        cantidadDeMinisculas++;//y se suma 1 al contador
	      }

	    }
	    System.out.println("En minisculas hay: " + cantidadDeMinisculas);//muestra el contador de minusculas
		System.out.println("El trinagulo");
		//muestra el string entero y le va quitando 1 caracter en cada iteración del bucle en el eje y
		for (x = 0; x < tamaño; x++)
		{
			for (y = 0; y < tamaño - x; y++)
			{
				System.out.print(frase.charAt(y));
			}
			System.out.println();
		}
	}

}

