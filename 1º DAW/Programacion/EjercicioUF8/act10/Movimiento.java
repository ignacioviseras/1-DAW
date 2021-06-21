package act10;

import java.time.LocalDate;

public class Movimiento {
	private LocalDate fecha;
	private String concepto;
	private double cantidad;
	private double saldo;
	
	public Movimiento(String concepto, double cantidad, double saldo) {
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.saldo = saldo;
		this.fecha = LocalDate.now();
	}
	
	
	@Override
	public String toString() {
		return(fecha + " concepto = "+concepto+", Cantidad = "+ cantidad + ", Saldo = " +saldo);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}