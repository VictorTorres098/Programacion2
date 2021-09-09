
package tads;

import java.util.LinkedList;

/**
 * @author victor
 * TAD Diccionario
 * -Estructura que almacena 2 datos relacionados: clave-valor 
 * -La cantidad de claves tiene que ser la misma que de significados
 * -No tiene tamanaño fijo
 * -La clave no se repite
 * -Una clave tiene un unico significado
 * -Se puede buscar por clave su significado
 * ¿Ordenado?
 * ¿Se podria buscar por significado?
 * 
 * DATOS:
 * +registro de pares clave-significado
 * 
 * ACCIONES:
 * -agregar/editar/cambiar
 * -quitar
 * -buscarSignificado
 * -vacio
 * -cantidadElementos
 * -perteneceClave
 * -mostarTodo
 * 
 * IREP:
 * -no puede tener claves repetidas
 * -todas las claves son del mismo tipo
 * -todos los valores son del mismo tipo
 * -la clave no puede ser indefinida(null).
 * 
 * 
 * --------------------INTERFAZ-----------------------
 * la interfaz tiene que mostrar que recibe y que devuelve
 * -agregar/editar/cambiar: = void agregar(Tupla<C,S> tupla){} /si la clave ya esta definida, se actualiza su significado 	  
 * -quitar					= void quitar(C clave)
 * -buscarSignificado		= S buscarSignificado(C clave)
 * -vacio					= boolean vacio(){}
 * -tamano					= public int tamano() {}
 * -perteneceClave			= boolean perteneceClave(C clave)
 */
public class Diccionario<C,S> {
	
	private LinkedList<Tupla<C,S>> entradas;
	private Conjunto<C> claves;
	
	public Diccionario() {
		entradas = new LinkedList<Tupla<C,S>>();
		claves = new Conjunto<C>();
	}
	public void agregar(C clave, S significado) {
		if(!pertenece(clave)) {
			entradas.add(new Tupla<>(clave, significado));
			claves.agregar(clave);
		}
	}
	public void quitar(C clave) {
		if(pertenece(clave)) {
			entradas.remove(clave);
		}
	}
	public boolean pertenece(C clave) {
		return claves.pertenece(clave);
	}
	public S buscarSignificado(C clave) {
		S significadoAux = null;
		if(pertenece(clave)) {
			Tupla<C,S> aux = buscarItem(clave);		//creo una tupla auxiliar para que tome el valor del elemento con la clave dada
			significadoAux = aux.getY();
		}
		return significadoAux;
	}
	public int tamano() {
		return entradas.size();
	}
	public boolean vacio() {
		return entradas.isEmpty(); 					// Es lo mismo que entradas.size()==0;
	}
	private Tupla<C,S> buscarItem(C clave){
		for(int i = 0; i < tamano(); i++) {
			if(entradas.get(i).getX().equals(clave)) {
				return entradas.get(i);
			}
		}
		return null;
	}
	private Conjunto<C> obtenerClaves(){
		return claves;
	}
	

}

