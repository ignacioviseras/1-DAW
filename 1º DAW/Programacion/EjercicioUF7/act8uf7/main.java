package act8uf7;

public class main {

	public static void main(String[] args) {

		Alumno al = new Alumno("Carmen Torres", 31553);
		al.calificar("Matemáticas", 70);
		al.calificar("Lengua", 55);
		al.calificar("Inglés", 93);
		al.calificar("Física", 82);
		al.calificar("Educación física", 82);
		al.calificar("Biología y geología", 58);

		System.out.println(al.toString());
	}

}
