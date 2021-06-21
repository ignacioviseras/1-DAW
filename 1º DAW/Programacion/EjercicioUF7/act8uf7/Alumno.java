package act8uf7;

import act8uf7.Calificacion;
import java.util.ArrayList;


public class Alumno {
	private String nombre;
	private int matricula;
	
	public ArrayList<Calificacion> calificaciones;
	Calificacion cal;
	
	
	public Alumno () {
		this.nombre = "";
		this.matricula = 0;
		calificaciones = new ArrayList<Calificacion>();
	}	
	
	public Alumno(String nom, int mat) {
		this.nombre = nom;
		this.matricula = mat;
		calificaciones = new ArrayList<Calificacion>();
	}

	public void calificar(String asignatura, int nota) {
		Calificacion cal = new Calificacion(asignatura, nota);
		calificaciones.add(cal);
	}
	
	@Override
	public String toString() {
		double media = 0;
		int suma = 0;
		for(int i=0; i <calificaciones.size();i++) {
			suma = suma+calificaciones.get(i).getNota();
			}
		media = suma / calificaciones.size();
		return("El alumno:"+this.getNombre()+"con el numero de matricula "+this.getMatricula() + "\n"+ this.calificaciones.toString()+"\n" + "La media de las notas es: "+ media);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public Calificacion getCal() {
		return cal;
	}

	public void setCal(Calificacion cal) {
		this.cal = cal;
	}
	
}
