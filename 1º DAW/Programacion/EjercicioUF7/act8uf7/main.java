package act8uf7;

public class main {

	public static void main(String[] args) {

		Alumno al = new Alumno("Carmen Torres", 31553);
		al.calificar("Matem�ticas", 70);
		al.calificar("Lengua", 55);
		al.calificar("Ingl�s", 93);
		al.calificar("F�sica", 82);
		al.calificar("Educaci�n f�sica", 82);
		al.calificar("Biolog�a y geolog�a", 58);

		System.out.println(al.toString());
	}

}
