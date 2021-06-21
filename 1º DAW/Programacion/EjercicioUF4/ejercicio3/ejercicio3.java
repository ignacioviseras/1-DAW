package ejercicio3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamaño, fin , inicio;
		String palabra, conversion;
		StringBuilder cadena = new StringBuilder();
		StringBuilder texto = new StringBuilder();
		do{
			Scanner sw = new Scanner(System.in);
			System.out.println("Escribe una palabra: ");
			palabra = sw.nextLine();
			if(!palabra.equalsIgnoreCase("fin")) {
				tamaño = palabra.length();
				System.out.println("Longitud de: " + tamaño + " Caracteres");
				System.out.println("En mayusculas: " + palabra.toUpperCase());
				cadena.append(palabra);
				cadena.append(';');
				System.out.println("Cadena de palabras: " + cadena);
				
				texto.append(palabra);
				texto.append(' ');
				conversion = texto.toString();//convertimos el stringbuilder a string para utilizarlo en el tokenizer
				
		        StringTokenizer separar = new StringTokenizer(conversion);
		        while (separar.hasMoreTokens()){
		            String token = separar.nextToken();
		            System.out.println("Tokenizer: " + token);
		        }
		       //Esto es el primer intento del tokenizer pero no consegui hacerlos asi
		       /* int nDatos = separar.countTokens();
				String[] datos = new double[nDatos];
				int i=0;  
		         while(separar.hasMoreTokens()){
		        	 datos[i] = separar.nextToken();
		            System.out.println(separar.nextToken());
		         }*/
			}
			//Este while pertenece al do y lo que hacemos con esto es 
			//que cuando se escriba fin en mayus o minus nos va a sacar del programa
			//ademas de eso nos quita la palabra fin de la salida final
		}while(!(palabra.equalsIgnoreCase("fin")));
		//Se utilizo en su momento para eliminar la palabra fin pero consegui hacerlo sin usarlo
		/*fin=cadena.length();
		inicio = fin - 4;
		cadena.delete(inicio, fin);*/
        System.out.println("Cadena final: " + texto);
        System.out.println("Longitud de cadena total: " + texto.length());
	}
}
