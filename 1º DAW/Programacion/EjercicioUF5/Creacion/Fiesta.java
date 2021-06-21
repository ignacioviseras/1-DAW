package Creacion;

public class Fiesta {
	private String tipoFiesta;	//cumpleaños, carnavales, familiar, pijamas, fin_de_curso
	private String fechaHora;
	private String direccion;
	private int bebidas;
	private int bocadillos;
	private int invitados;
	static public int Nfiesta = 0;//contador para cada vez que se crea una fiesta se sepa cuantas fiestas se han creado
	
	public Fiesta() {
		this.tipoFiesta = " ";
		this.fechaHora = null;
		this.direccion = " ";
		this.bebidas = 0;
		this.bocadillos = 0;
		this.invitados = 0;
		Nfiesta++;
	}
	
	public Fiesta(String tipo, String fecha, String dir, int beb, int boca,int invt) {
		this.tipoFiesta = tipo;
		this.fechaHora = fecha;
		this.direccion = dir;
		this.bebidas = beb;
		this.bocadillos = boca;
		this.invitados = invt;
		Nfiesta++;
	}
	String consultar() {
		return(this.fechaHora +"  "+ this.tipoFiesta +"  "+ this.direccion +"  "+ this.bebidas +"  "+ this.bocadillos +"  "+ this.invitados +"  ");
	}
	
	int invitar() {
		this.invitados++;
		return this.invitados;
	}
	
	int invitar(int Ninvt) {
		this.invitados = this.invitados + Ninvt;
		return this.invitados;
	}
	
	int cancelarinvitacion() {
		this.invitados--;
		return this.invitados;
	}
	
	int cancelarinvitacion(int Ninvt) {
		this.invitados = this.invitados - Ninvt;
		return this.invitados;
	}
	
	public int getpreciofiesta() {
		return (this.invitados * 5 + this.bebidas*2 + this.bocadillos*3);
	}
	
	public void setcancelarinvitacion(int invitados) {
		this.invitados = invitados;
	}
	
	public int getcancelarinvitacion() {
		return this.invitados;
	}
	
	
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public static int getNfiesta() {
		return Nfiesta;
	}

	public static void setNfiesta(int nfiesta) {
		Nfiesta = nfiesta;
	}

}
