package sistemaOneDemand;

import java.util.LinkedList;

public class Pelicula {
	private String titulo;
	private String genero;
	private String resena;
	private Fecha dateFilmacion;     //
	private Integer reproducciones;
	//decidir que estructura de datos usar para reparto de actores
	private LinkedList<Actor> reparto;
	private String repartoDeActores;
	
	public Pelicula(String titulo, String genero, String resena, Fecha fechafilamacion) {
		this.titulo = titulo;
		this.genero = genero;
		this.resena = resena;
		this.reproducciones = 0;
		this.dateFilmacion=fechafilamacion;
		this.reparto = new LinkedList();
	}

	public String getGenero() {
		return genero;
	}
	public Integer getReproducciones() {
		return reproducciones;
	}
	public String  getInformacion() {
		return titulo+"\n"+resena+"\n"+dateFilmacion;
	}
	public String getReparto() {
		for(Actor r : reparto) {
			repartoDeActores=r+","; 
		}
		return repartoDeActores;
	}
	public void addReproduccion() {
		reproducciones++;
	}
	public void agregarActor(Actor actor) {
		reparto.add(actor);
	}
	
	
	
	

}
