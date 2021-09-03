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
 * -cantidadElementos		= public int cantidadElementos() {}
 * -perteneceClave			= boolean perteneceClave(C clave)
 * -mostarTodo				= public String toString(){ } 
 */
public class Diccionario<C,S> {
	
	private LinkedList<Tupla<C,S>> entradas;
	
	public Diccionario() {
		entradas = new LinkedList<Tupla<C,S>>(); 
	}
	
	

}

