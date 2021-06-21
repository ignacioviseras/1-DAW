package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el coste del producto");
		int coste = Integer.parseInt(sc.nextLine());// coste de un producto
		System.out.println("Ingresa el dinero");
		int pago = Integer.parseInt(sc.nextLine());// dinero que inserta un cliente
		int cambio = pago - coste;
		int billetes[] = {0,0,0,0}; //array para los billetes

		while (cambio > 0) {//cuando esta a 0 el cambio cierra bucle
			if (cambio >= 50) {//mira el tamaño del dinero
				billetes[0]++;//añade 1 en su posicion del array para saber cuandtos billestes de ese numero hay
				cambio = cambio - 50;//resta 50 al dinero ingresado
			} else if (cambio >= 20) {
				billetes[1]++;
				cambio = cambio - 20;
			} else if (cambio >= 10) {
				billetes[2]++;
				cambio = cambio - 10;
			} else if (cambio >= 5) {
				billetes[3]++;
				cambio = cambio - 5;
			}
		
		}

		System.out.println(billetes[0] + " Billete de 50");
		System.out.println(billetes[1] + " Billete de 20");
		System.out.println(billetes[2] + " Billete de 10");
		System.out.println(billetes[3] + " Billete de 5");
	}

}
