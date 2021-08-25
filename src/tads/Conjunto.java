package tads;

import java.util.ArrayList;

public class Conjunto<T> {
	
	private ArrayList<T> elementos;
	private ArrayList<T> auxiliar;
	
	public Conjunto() {
		elementos = new ArrayList<T>();
		auxiliar = new ArrayList<T>();
	}
	public void agregar(T elemento) {
		if(!pertenece(elemento)) {
			elementos.add(elemento);
		}
	}
	public void eliminar(T elemento) {
		if(!pertenece(elemento)) {
			elementos.remove(elemento);
		}
	}
	public boolean pertenece(T elemento) {
		return elementos.contains(elemento);
	}
	public T MostrarConjunto () {
		for(int i=0; i<elementos.size(); i++) {
			return elementos.get(i);
		}
		return null;
	}
}
//test

/**
 * @author victor
 * DATOS:
 * Colecion de datos
 * lista
 * 
 * ACCIONES:
 * Agregar (elemento)
 * Eliminar (elemento)
 * String MostrarConjunto 
 * boolean EstaVacio 
 * entero CantidadElementos
 * boolean Pertenece
 * elemento ReturnElemento "crear una lista que almacene los elementos ya revisados"
 * 
 * IREP:
 * Todos los elementos sean del mismo tipo
 * No se permite elementos repetidos
 * Sin orden especifico
 * la lista solamente puede recivir los elementos que pertenezcan a la coleccion de datos
 * 
 */
