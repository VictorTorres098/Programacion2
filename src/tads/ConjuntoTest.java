package tads;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConjuntoTest {
	//los casos de prueba se sirve para probar que el codigo haga para lo que fue echo
	//pero antes tenemos que tener bien definido que es lo que nuestro codigo haga
	
	Conjunto<String> conjunto;
	Conjunto<String> conjuntoVacio;
	String elemNoPertenece;
	String elemPertenece;
	int cantElementosEnConjunto;
	/**
	 * 	ya echos = <
	 * 
	 * agregar elemento
	 * 	-Agregar elemento que no esta <
	 * 	-Agregar elemento que ya pertenece <
	 * quitar un elemento
	 * 	-quitar elemento de conjunto vacio
	 *	-quitar elemento que no pertenece
	 *	-quitar elemento que si pertenece
	 *consultar el tamamo
	 *	-Verigicar el tamano para varios conjunto prearmados <
	 *consultar si pertenece
	 *	-Consultar si pertenece un elemento que no pertenece
	 *	-Consultar si pertenece un elemento que ya pertenece
	 *	-Consultar si pertenece un elemento a un conjunto vacio 
	 */
	@Before
	public void setUp() throws Exception{
		
		elemNoPertenece = "Sistema";
		elemPertenece = "auto";
		
		conjunto = new Conjunto<>();
		conjuntoVacio = new Conjunto<>();
		conjunto.agregar("auto");
		conjunto.agregar("casa");
		conjunto.agregar("carta");
		conjunto.agregar("perro");
		cantElementosEnConjunto = 4;
	}

	@Test
	public void testAgregarElementoRepetido() {
		//si se agrega un elemento la cantidad esperada va a ser +1
		assertTrue(conjunto.pertenece(elemPertenece));
		int cantidadInicial = conjunto.tamano();
		
		conjunto.agregar(elemPertenece);
		
		assertEquals(cantidadInicial, conjunto.tamano());
	}
	
	@Test
	public void testAgregarElementoNuevo() {
		assertTrue(conjunto.pertenece(elemPertenece));
		
		int cantidadInicial = conjunto.tamano();
		int cantidadEsperada = cantidadInicial+1;
		
		
		conjunto.agregar(elemNoPertenece);
		
		assertTrue(conjunto.pertenece(elemNoPertenece));
		assertEquals(cantidadEsperada, conjunto.tamano());
		
	}
	
	@Test
	public void testConsultarTamanoConjuntoVacio() {
		assertEquals(0, conjuntoVacio.tamano());
	}
}
