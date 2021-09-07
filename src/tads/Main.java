package tads;

public class Main {

	public static void main(String[] args) {
		
		Conjunto elementos = new Conjunto();
		elementos.agregar(12);
		elementos.agregar(13);
		elementos.agregar(233);
		//System.out.println(elementos.MostrarConjunto());
		//System.out.println(elementos.MostrarConjunto());
		Conjunto elementosB = new Conjunto();
		elementosB.agregar(454);
		elementosB.agregar(54);
		elementosB.agregar(14);
		elementosB.agregar(124);
//		System.out.println(elementos.tamano());
//		System.out.println(elementosB.tamano());
		elementos.union(elementosB);
//		System.out.println(elementos.tamano());
//		System.out.println(elementosB.tamano());
		for(int i = 0; i < elementos.tamano(); i++) {
			System.out.println(elementos.dameUnElemento());
		}


	}

}
