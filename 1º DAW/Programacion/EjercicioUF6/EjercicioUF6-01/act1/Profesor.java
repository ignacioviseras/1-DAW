package act1;

public class Profesor extends Persona{
	private String competencias;
	


	public Profesor(String dni, String nom, String dir, String tel, String com) {
		super(dni, nom, dir, tel);
		this.competencias = com;
	}
	
	public Profesor() {
		super();
		this.competencias = "";
	}
	
	public String ponerNotas() {
		return("El profesor " + super.getNombre() + " va a corregir examenes");
	}
	
	public String toString(){
		return("   Persona | " +super.getDni()+ " " +super.getNombre()+ " " +super.getTelefono()+ " ");
	}
	
	@Override
	public String trabajar() {
		return("El profesor "+super.getNombre()+" va a dar clase");
	}
	
	
	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

}
