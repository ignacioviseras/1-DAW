package Creacion;

import java.time.LocalDateTime;

import Creacion.Fiesta;
import static Creacion.Fiesta.Nfiesta;
public class Main {

	public static void main(String[] args) {

		LocalDateTime fecha = LocalDateTime.now();
		String fechaHora = fecha.toString();
		String tipoFiesta = "carnavales";
		String direccion = "Fuencarral";
		
		System.out.println("------------------------Fiesta0---------------------------------");
		Fiesta f = new Fiesta();//Creo una de fiesta
		
		LocalDateTime fecha1 = LocalDateTime.now();
		f.setFechaHora(fecha1.toString());
		f.setTipoFiesta("cumpleaños");//estoy utilizando un tipo de fiesta nuevo ya que no se utilizara el de carnavales
		f.setDireccion(direccion);//asigno la direccion de arriba que es funcarral
		f.setBocadillos(7);//digo cuantos bocatas quiero
		f.setBebidas(7);//digo cuantas bebidas quiero
		f.invitar(9);//Aqui estoy usando el invitar que tiene Ninvt ya que le concreto un numero
		f.cancelarinvitacion(2);//Aqui estoy usando el cancelar invition que tiene Ninvt ya que le concreto un numero
		
		System.out.println(f.consultar());
		System.out.println("Coste de la fiesta: " +f.getpreciofiesta()+ "€");
		System.out.println("El numero de fiesta: "+Nfiesta);
		System.out.println("------------------------Fiesta1---------------------------------");
		Fiesta f1 = new Fiesta(direccion, fechaHora, tipoFiesta, 0, 0, 0);//Creo una fiesta nueva (Diferente a la fiesta de arriba)


		f1.invitar(4);//Aqui estoy usando el invitar que tiene Ninvt ya que le concreto un numero
		System.out.println(f1.consultar());
		f1.cancelarinvitacion();//Cancelas 1 invitacion ya que no concretas el numero
		System.out.println(f1.consultar());//Muestras como se cambia el numeros de invitados 
		f1.setBebidas(50);//Dices cuantas bebidas quieres
		f1.cancelarinvitacion();//cancelas otra invitacion
		System.out.println(f1.consultar());//muestras los cambios
		f1.invitar();//invitas a 1 mas
		System.out.println(f1.consultar());//muestras el resultado final
		System.out.println("El precio de la fiesta es:" +f1.getpreciofiesta()+ "€");//muestras cuanto va a costar la fiesta en total
		System.out.println("El numero de fiesta: "+Nfiesta);//Dices el numero de fiesta q es utilizando el contador 
	}

}
