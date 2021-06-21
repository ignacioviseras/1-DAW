package act1;

public class Administrativo extends Persona{
	private String tareas;
	

	public Administrativo(String dni, String nom, String dir, String tel, String tar) {
		super(dni, nom, dir, tel);
		this.tareas=tar;
	}
	

	public Administrativo() {
		super();
		this.tareas="";
	}
	
	public String gestionarMatricula() {
		return("El administrativo "+super.getNombre()+"va a gestionar una matricula");
	}
	
	
	public String toString(){
		return("   Persona | " +super.getDni()+ " " +super.getNombre()+ " " +super.getTelefono()+ " ");
	}
	

	@Override
	public String trabajar() {
		return("La Administradora "+super.getNombre()+" va a gestiona los papele" +"y hacer"+ this.tareas);
	}

	
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
}
