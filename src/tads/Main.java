package tads;

public class Main {

	public static void main(String[] args) {
		
		Conjunto elementos = new Conjunto();
		elementos.agregar(1);
		elementos.agregar(2);
		elementos.agregar(3);
		elementos.agregar(5);
		elementos.agregar(6);
		//System.out.println(elementos.MostrarConjunto());
		//System.out.println(elementos.MostrarConjunto());
		Conjunto elementosB = new Conjunto();
		elementosB.agregar(7);
		elementosB.agregar(3);
		elementosB.agregar(15);
		elementosB.agregar(6);
//		System.out.println(elementos.tamano());
//		System.out.println(elementosB.tamano());
//		elementos.union(elementosB);
//		System.out.println(elementos.tamano());
//		System.out.println(elementosB.tamano());
		
		//deberia imprimir unicamente el item 3 ya que es el unico que se repite
		elementos.interseccionB(elementosB);
		
//		for(int i = 0; i < elementos.tamano(); i++) {
//			System.out.println(elementos.dameUnElemento());
//		}
		
		/////////////////////////////////////////////DICCIONARIO//////////////////////////////////////////////////
		Diccionario test = new Diccionario();
		test.agregar(1, "uno");
		test.agregar(2, "dos");
//		System.out.println(test.buscarSignificado(1));
		


	}

}
