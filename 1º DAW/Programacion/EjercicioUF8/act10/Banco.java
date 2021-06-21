package act10;


import java.util.Scanner;
import act10.NumerosrojoExecpcion;
import act10.CuentaBancaria;

public class Banco {

	public static void main(String[] args) throws NumerosrojoExecpcion, numeronegativo{
		NumerosrojoExecpcion nr;
		numeronegativo ng;
		
		Scanner lector = new Scanner(System.in);
		String fin = "";
		CuentaBancaria Cuenta = new CuentaBancaria(798456, "Fidel");
		


		Cuenta.agregarMovimiento("ingreso inicial ", 100);
		System.out.println("Vamos a crear una cuenta y realiza ingraso de 100");
		do {
			System.out.println("Cuanto dinero retiramo??");
			int dinero;
			dinero = Integer.parseInt(lector.nextLine());
			
			try {	
			if (dinero>0) {
				try {
					if(Cuenta.ObtenerSaldo() - dinero >= 0) {
						Cuenta.agregarMovimiento("Retirada de", - dinero);
						System.out.println(Cuenta);
						System.out.println(Cuenta.listaMovimientos());
					}else {
						throw new NumerosrojoExecpcion(Cuenta.ObtenerSaldo());
					}
				}	catch(NumberFormatException | NumerosrojoExecpcion e) {
					System.out.println("Limite de saldo disponible en cuenta excedido " + e);
					System.out.println(e.getMessage());
					System.out.println(e.toString());
				}
			}else {
				throw new numeronegativo(Cuenta.ObtenerSaldo());
			}
			}catch (NumberFormatException | numeronegativo n) {
				System.out.println("No metas un negativo " + n);
				System.out.println(n.getMessage());
				System.out.println(n.toString());
			}			
			System.out.println("-------Escribe Fin para terminar--------");
			fin = lector.nextLine();
		}while (!("Fin".equalsIgnoreCase(fin)));
		lector.close();
		System.out.println("-------Vuelva pronto--------");
	}
}