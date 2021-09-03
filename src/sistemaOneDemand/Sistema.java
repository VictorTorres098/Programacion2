package sistemaOneDemand;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
	///para el catalogo de peliculas usaremos la estuctura de diccionario
	HashMap<Integer, Pelicula> catalogoPeliculas;
	
	public Sistema() {
		this.catalogoPeliculas = new HashMap<>();
	}
	public void agregarPelicula(Integer codigo,Pelicula pelicula) {
		if(!exitePelicula(codigo)) {
			catalogoPeliculas.put(codigo, pelicula);
		}	
	}
	public boolean exitePelicula(Integer codigo) {
		return catalogoPeliculas.containsKey(codigo);
	}
	public void bajarPelicula(Integer codigo) {
		catalogoPeliculas.remove(codigo);
	}
	public void verPelicula(Integer codigo) {
		catalogoPeliculas.get(codigo).addReproduccion();
	}
	public Integer consultarReproducciones(Integer codigo) {
		return catalogoPeliculas.get(codigo).getReproducciones();
	}
	//Falta implementar mostrarPorGenero, mostarPorActor
	//SSSasd
	//test
	

}
