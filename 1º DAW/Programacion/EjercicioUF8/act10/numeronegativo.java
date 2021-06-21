package act10;

public class numeronegativo extends Exception{
	private static final long serialVersionUid = 1L;
	private double negativo;
	
	public numeronegativo(double nuevoMovimiento) {
		super("No puedes meter numeros negativos");
		this.negativo = negativo;
	}
	
	@Override
	public String toString() {
		return("numeronegativo [nuevoMovimiento No Actualizado]" + negativo+ "]");
	}
}
