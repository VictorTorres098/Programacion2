package sistemaOneDemand;

public class Actor {
	private String nombre;
	private String nacionalidad;
	private Fecha fecha;
	
	public Actor(String nombre, String nacionalidad, Fecha fecha) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public String getInformacion() {
		return "Nombre: "+nombre+"\n"+"Nacionalidad: "+nacionalidad+"\n"+"Fecha: "+fecha;
	}

}
