
package act10;

public class NumerosrojoExecpcion extends Exception{
	private static final long serialVersionUid = 1L;//se pone para evitar warnings de compilacion
	private double nuevoMovimiento;
	
	
	
	public NumerosrojoExecpcion(double  nuevoMovimiento) {		//constructor de la clase
		super("Movimiento lleva a numeros rojos, no se realizara la operacion");		//Mensaje que aparecera cuando salte el error es decir 
		this.nuevoMovimiento = nuevoMovimiento;											//cuando le meta un numero mas grande que el inicial
	
	}
	
	
	
	@Override
	public String toString() {
		return("NumerosrojoExecpcion [nuevoMovimiento No Actualizado]" + nuevoMovimiento+ "]");
	}
}

