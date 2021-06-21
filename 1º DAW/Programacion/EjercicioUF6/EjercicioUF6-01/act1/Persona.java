package act1;

public abstract class Persona {

	private String dni;
	private String Nombre;
	private String Direccion;
	private String Telefono;
	
	public Persona() {
		this.dni = "";
		this.Nombre = "";
		this.Direccion = "";
		this.Telefono = "";
	}
	
	public Persona(String dni, String nom, String dir, String tel) {
		this.dni = dni;
		this.Nombre = nom;
		this.Direccion = dir;
		this.Telefono = tel;
	}
	
	
	public String llamar(Persona p) {
		return(this.Nombre + " llama a " + p.getNombre());
	}
	
	abstract public String trabajar();
	@Override
	
	
	public String toString(){
		return("   Persona | " +this.dni+ " " +this.Nombre+ " " +this.Telefono+ " ");
	}
	
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}
