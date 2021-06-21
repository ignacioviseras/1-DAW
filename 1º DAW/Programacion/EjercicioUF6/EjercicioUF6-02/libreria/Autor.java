package libreria;

public class Autor {
	private String nombre;
	private String biografia;
	
	public Autor() {
		this.nombre = "";
		this.biografia = "";
	}
	
	
	
	public Autor (String nom, String bio) {
		this.nombre = nom;
		this.biografia= bio;
	}
	
	public String toString() {
		return ("El autor "+ this.getNombre()+ ", con la biografia " + this.getBiografia());
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getBiografia() {
		return biografia;
	}



	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	
}
