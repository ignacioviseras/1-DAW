package act8uf7;

public class Calificacion {
	
	private String asignatura;
	private int nota;
	
	public Calificacion() {
		this.asignatura = "";
		this.nota = 0;
	}
	
	public Calificacion(String asg, int nt) {
		this.asignatura = asg;
		this.nota = nt;
	}
	
	@Override
	public String toString() {
		return ("Sus notas son: "+this.getAsignatura()+ "  "+this.getNota());
	}

	
	
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
}
