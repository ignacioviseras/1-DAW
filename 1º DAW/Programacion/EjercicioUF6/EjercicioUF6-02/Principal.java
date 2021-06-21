import libreria.Autor;
import libreria.Libro;

public class Principal {

	public static void main(String[] args) {
		
		Autor aut = new Autor("Julio Cort�zar", "Escritor y traductor argentino.");
		
		Libro lib = new Libro("Rayuela", "Novela", aut);
		System.out.println("----------Autor-----------");
		System.out.println(aut.toString());
		System.out.println(" ");
		System.out.println("----------libro-----------");
		System.out.println(lib.toString());
		
		
		System.out.println(" ");
		Libro lib2 = new Libro("Rayuela", "Novela", "Julio Cort�zar", "Escritor y traductor argentino.");
		System.out.println(lib2.toString());
		lib2.getAutor().setBiografia("Protesto contra el regimen militar");
		System.out.println(lib2.toString());
		lib2.setGenero("Poesia");
		System.out.println(lib2.toString());
	}

}
