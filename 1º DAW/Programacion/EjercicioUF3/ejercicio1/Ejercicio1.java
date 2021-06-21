package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		num1 = (int) (Math.random()*20+1);
		if ((num1>5)||(num1<15)) {
			num2 = num1 + 15;
			System.out.println(num2);
		}else {
			System.out.println (num1+5);
		}
	}

}
