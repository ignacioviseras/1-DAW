package act10;

import java.util.ArrayList;

public class CuentaBancaria {

          private int miCuenta;
          private String cliente;
          private double saldo;
          private ArrayList<Movimiento> movimientos;
          
          public CuentaBancaria(int numeroCuenta, String cliente) {
                this.miCuenta = numeroCuenta;
                this.cliente = cliente;
                this.saldo = 0;
                this.movimientos = new ArrayList();
           }

           public void agregarMovimiento(String concepto, double cantidad) {
                 this.saldo = this.saldo + cantidad;
                 this.movimientos.add(new Movimiento(concepto, cantidad, saldo));
         }

         @Override
         public String toString() {
               return "Número de Cuenta= " + miCuenta + ", Cliente ->" + cliente + ", Con un saldo de Saldo = " + saldo;
         }

         public String listaMovimientos() {
        	 String listado = "";
	
        	 for (Movimiento mov : this.movimientos) {
        		 listado = listado + mov.toString()+"\n";
        	 }                          
        	 	return listado;
         }
 		
         public double ObtenerSaldo() throws NumerosrojoExecpcion{
        	 int i = 0;
        	 return(movimientos.get(i).getSaldo());
         }
} 