package act1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;
		Alumno al = new Alumno("12345678H", "Alicia Torres", "islas filipinas", "789456", "1º Daw");
		Profesor pf = new Profesor("98765432F", "Raul S", "Canal", "741258963", "BBDD y program");
		Administrativo ad = new Administrativo("36925814T", "Maria dolore nieve", "La Viña", "78952461", " matriculas y asistencia");
		
		System.out.println("Lista de personas");
		System.out.println(" ");
		System.out.println(al.toString());
		System.out.println(pf.toString());
		System.out.println(ad.toString());
		System.out.println(" ");
		System.out.println("---------------Llamadita----------------------");
		System.out.println(al.llamar(pf));
		System.out.println(" ");
		System.out.println("---------------hacer examen-------------------");
		System.out.println(al.hacerExamen());
		System.out.println(" ");
		System.out.println("---------------poner notas de exmanes----------");
		System.out.println(pf.ponerNotas());
		System.out.println(" ");
		System.out.println("---------------papeleo-------------------------");
		System.out.println(ad.gestionarMatricula());
		System.out.println(" ");
		System.out.println("---------------Trabajo de cada persona---------");
		System.out.println(al.trabajar());
		System.out.println(pf.trabajar());
		System.out.println(ad.trabajar());
	}

}
