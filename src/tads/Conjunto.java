package tads;

import java.util.ArrayList;

public class Conjunto<T> {
	
	private ArrayList<T> elementos;
	private ArrayList<T> auxiliar;
	private ArrayList<T> iterseccion;
	private int actual;
	
	public Conjunto() {
		this.elementos = new ArrayList<T>();
		this.auxiliar = new ArrayList<T>();
		this.iterseccion = new ArrayList<T>();
		actual = 0;
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
	public int tamano() {
		return elementos.size();
	}
	public boolean vacio() {
		return elementos.size()==0;
	}
	
	public void union (Conjunto<T> newConjunto) {
		T item;
		for(int i=0; i < newConjunto.tamano(); i++) {
			item = newConjunto.dameUnElemento();
				this.agregar(item);   //ya que agregar por definicion no perminte elementos repetidos por lo tanto no es necesarion comprobar que el elemento esta repetido
		}
		
	}
	public T dameElemento() {
		T aux = null;
		while(!vacio()) {
			aux=elementos.get(actual);
			return aux;
		}										//mal funcionamiento
		actual++;
		if(actual==elementos.size()) {
			actual = 0;
		}
		return aux;
	}
	public T dameUnElemento() {
		T aux1=null;
		for(int i = 0; i< elementos.size(); i++) {
			if(!(auxiliar.contains(elementos.get(i)))) {
				aux1 = elementos.get(i);
		}
	}
		auxiliar.add(aux1);
		return aux1;
	}
	protected String mostrarElementos() {
		String cadena = "";
		for(int i = 0; i < elementos.size(); i++) {
			cadena = cadena+" "+elementos.get(i);
		}
		return cadena;
	}
	protected String mostrarAuxiliar() {
		String cadenaAuxiliar = "";
		for(int j = 0; j < auxiliar.size(); j++) {
			cadenaAuxiliar = cadenaAuxiliar+" "+auxiliar.get(j); 
		}
		return cadenaAuxiliar;
	}
	protected boolean estaEnAuxiliar(Integer valor) {
		boolean enAuxiliar = false;
		for(int i = 0; i<auxiliar.size(); i++) {
			enAuxiliar = enAuxiliar || valor == auxiliar.get(i);
		}
		return enAuxiliar;
	}
	//union con crear un 3 Conjunto destrutiva
	
	//idea miesntras sea distinto de null
	//interseccion que debe estar en ambos conjuntos
	//como remplazar el conjunto "elementos" para que que tenga los elementos de auxiliar 
	//la interseccion son los elemetos que pertenecen a los dos conjunto
	//esto significa que tengo que eliminar los elementos del conjunto principal que no pertenezcan al segundo conjunto
	//simplificando: si algun item del conjunto principal no pertenece en el conjunto dado lo elimino!
	//VER 0.1 
	public void interseccion (Conjunto<T> conjunto) {
		T itemA=null;
		for(int i = 0; i < conjunto.tamano(); i++) {
				itemA = conjunto.dameElemento();
			if(!(estaEnconjuntoPrincipal(itemA))) {
				elementos.remove(itemA);
			}
		}
	}
	private boolean estaEnconjuntoPrincipal(T elemento) {
		boolean esta = false;
		for(int i = 0; i < elementos.size(); i++ ) {
			esta = esta || elementos.contains(elemento);
		}
		return esta;
	}
	//VER 0.2
	public void interseccionB (Conjunto<T> conjunto) {
		T itemB = null;
		for(int i = 0; i < elementos.size(); i++ ) {
			itemB = elementos.get(i);
			if(!(conjunto.pertenece(itemB))) {
				elementos.remove(itemB);
			}
		}
		
	}
}

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
