package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe lado 1");
		int lado1 = sc.nextInt(); //lee lo escrito por teclado y lo guarda en lado 1
		
		System.out.println("Escribe lado 2");
		int lado2 = sc.nextInt(); //lee lo escrito por teclado y lo guarda en lado 2
		
		System.out.println("Escribe lado 3");
		int lado3 = sc.nextInt(); //lee lo escrito por teclado y lo guarda en lado 3
		
		System.out.println("Lado 1 "+lado1);//muesta lado 1
		System.out.println("Lado 2 "+lado2);//muesta lado 3
		System.out.println("Lado 3 "+lado3);//muesta lado 3
		
		if (lado1+lado2>lado3 && lado2+lado3>lado1  && lado3+lado1>lado2) {
            if(lado1==lado2 && lado2==lado3){
            	System.out.println("El triandulo es Equilátero");
            }else {
            	if (lado1==lado2 && lado1!=lado3){
            		System.out.println("El triandulo es Isósceles");
            	}else {
            		System.out.println("El triandulo es Escaleno");
            		}          			
            }
        }else {
            System.out.println("Triangulo no valido");
        }
	}
	

}
