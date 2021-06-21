package libreria;

public class Libro {

	private String titulo;
	private String genero;
	private Autor autor;
	

	public Libro(String tit, String gen, Autor aut) {
		this.titulo = tit;
		this.genero = gen;
		this.autor = aut;
	}
	
	public Libro(String tit, String gen, String aut, String bio) {
		this.titulo=tit;
		this.genero=gen;
		this.autor = new Autor(aut, bio);
	}
	
	public String toString() {
		return("El libro " +this.getTitulo()+ " "+"del genero "+ this.getGenero()+ " "+"escrito por "+ this.getAutor());
	}
	

	
	
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}
