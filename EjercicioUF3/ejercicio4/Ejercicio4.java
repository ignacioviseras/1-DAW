package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio1 = (int) (Math.random() * (10 - 0)) +0;//Genera numero aleatorio con un rango de 10 a 0
		int aleatorio2 = (int) (Math.random() * (10 - 0)) +0;//lo mismo que arriba solo que para tener un 2 dato
		Scanner sc = new Scanner(System.in);//declara para usar teclado
		int opcion = 0;

		do {
			System.out.println("Introduce el numero de opcion que desea. ");
			System.out.println("1:Suma 2:Resta 3:Multiplica 4:Dividir 5:Resto division 6:Finaliza ");
			
			System.out.print("Opcion: ");
			opcion = Integer.parseInt(sc.nextLine());//lee el teclado y asigna la opcion
			switch (opcion) {
			case 1:
				System.out.println(aleatorio1 + aleatorio2);//hace la operacion que se ve entre los 2 datos aleatorios
				System.out.println("Resultado suma: " );
				break;
			case 2:
				System.out.println(aleatorio1 - aleatorio2);//hace la operacion que se ve entre los 2 datos aleatorios
				System.out.println("Resultado resta: " );
				break;
			case 3:
				System.out.println(aleatorio1 * aleatorio2);//hace la operacion que se ve entre los 2 datos aleatorios
				System.out.println("Resultado multiplicación: " );
				break;
			case 4:
				System.out.println(aleatorio1 / aleatorio2);//hace la operacion que se ve entre los 2 datos aleatorios
				System.out.println("Resultado división: " );
				break;
			case 5:
				System.out.println(aleatorio1 % aleatorio2);//hace la operacion que se ve entre los 2 datos aleatorios
				System.out.println("Resultado del resto de división: " );
				break;
			case 6:
				
				break;
			default:
				System.out.println("Dato invalido");
				System.out.println("-----------------------------");
				break;
			}
		} while (!(opcion == 6));//si la opcion es 6 sales del bucle si no lo ignora
		System.out.println("Fin");
	}

}
