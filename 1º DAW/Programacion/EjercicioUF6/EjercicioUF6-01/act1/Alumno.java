package act1;

public class Alumno extends Persona{
	private String curso;
	

	public Alumno() {
		super();
		this.curso = "";
	}
	
	public Alumno(String dni, String nom, String dir, String tel, String cur) {
		super(dni, nom, dir, tel);
		this.curso = cur;
	}
	
	public String hacerExamen() {
		return("El alumno " +super.getNombre() + "va a hacer un examen");
	}
	
	public String toString(){
		return("   Persona | " +super.getDni()+ " " +super.getNombre()+ " " +super.getTelefono()+ " ");
	}
	
	@Override
	public String trabajar() {
		return("El alumno "+super.getNombre()+" va a aprender en clases de " +this.curso);
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
