package operadoresbooleanos;

public class Boolean {

	public static void main(String[] args) {
		
		
		int [] valor = {12,88,12,20,22};
							//columna
		int [][] matriz =  {{1,2,3},	//fila
							{4,5,6}};  					//modificar para probar funciones con matriz
		
		int [] elms = {1,2};
		int [] array = {3,2,1}; //true   
		
		
		
		////////////////TEST//////////////////////////////////////
		//System.out.println(todosPares(valor));
		//System.out.println(matrizConFilaPar(matriz));
		//System.out.println(hayColumnaPar(matriz));
		//System.out.println(algunaFilaPar(matriz)); //con for anidados
		//System.out.println(mayor10(valor));
		//System.out.println(pertenecenTodos(elms, array));
		//System.out.println(filasAscendente(matriz,0));
		imprimirPorColumnas(matriz);

	}
	public static boolean todosPares(int [] valor) {
		boolean tPares=true;
		for(int i = 0; i < valor.length; i++) {
			tPares = tPares && esPar(valor[i]);
		}
		return tPares;
	}
	public static boolean hayPares(int [] valor) {
		boolean algunPar = false;
		for(int i = 0; i< valor.length ; i++) {
			algunPar = algunPar || esPar(valor[i]);
		}
		return algunPar;
	}
	public static boolean esPar(int valor) {   //buenas costumbres 
		return valor%2==0;
	}
	///imprimir la matriz por filas y por columnas
	public static void imprimirPorFilas(int [][] m) {
		for(int fila = 0; fila< m.length; fila++ ) {
			for(int col = 0; col<m[fila].length; col++) {
				System.out.print(" " + m[fila] [col]);
			}
			System.out.println();
		}
	}
	public static void imprimirPorColumnas(int [] [] m) {
		for(int col=0; col < m[0].length; col++ ) {
			for(int fila=0; fila< m.length; fila++) {
				System.out.print(" "+m[fila] [col]);
			}
			System.out.println();
		}
	}
	
	//matrizes 
	//ver si hay algun elemento par en alguna fila
	
	public static boolean algunaParEnFila(int[] fila ){
		boolean algunaFila = false;
		for (int i = 0 ; i < fila.length; i++) {
			algunaFila = algunaFila || esPar(fila[i]);
		}
		return algunaFila;
	}
	public static boolean matrizConFilaPar (int [][] matriz) {
		boolean hayFila = false;
		for(int i=0; i<matriz.length ; i++) {
			hayFila = hayFila || algunaParEnFila(matriz[i]);
		}
		return hayFila;
		
	}
	//que haya alguna columna con todos los elementos Pares
	public static boolean columnaPar(int col, int [][] matriz) {
		boolean todosPar = true;
		for(int i = 0; i<matriz.length; i++) {
			todosPar = todosPar && esPar(matriz[i][col]);
		}
		return todosPar;
	}
	public static boolean hayColumnaPar(int [][] matriz) {
		boolean hayColumna = false;
		for(int i = 0; i < matriz[0].length ; i++) {
			hayColumna = hayColumna || columnaPar(i, matriz); //columna y matriz
		}
		return hayColumna;
	}
	//con for anidados algun par en alguna fila
	public static boolean algunaFilaPar(int [][] matriz) {
		boolean algunPar = false;   //recorre una fila 
		boolean algunaFilaPar = false;
		for(int i = 0; i < matriz.length; i++) {
			algunaFilaPar = algunaFilaPar || algunPar;
			for (int j = 0; j < matriz[i].length; j++) {
				algunPar = algunPar || esPar(matriz[i][j]);
			}
		}
		return algunaFilaPar;
	}
	
	//ejercicios
	
	//recibe una lista de
	//números, que sea verdadera si todos los números son mayores a 10.
	
	
	public static boolean mayor10(int [] lista) {
		boolean esMayor = true; 						//ya que quiero comprobar que todos los valores de la lista son mayor que 10
		for(int i = 0; i<lista.length ;i++) {
			esMayor = esMayor && lista[i]>10;
		}
		return esMayor;
	}
	//implementar una funcion que determine si un arreglo es subconjunto de otro
	//simplificando que todos los valores de elems tambien esten presentes en array
	public static boolean pertenecenTodos(int [] elems, int [] array) {
		boolean pertenece = true;
		for(int i = 0; i<elems.length ; i++) {
			pertenece = pertenece && estaEnArray(elems[i], array);
		}
		return pertenece;
	}
	public static boolean estaEnArray(int valor, int [] array) {
		boolean algunValorIgual = false;
		for(int i = 0; i < array.length ; i++) {
			algunValorIgual = algunValorIgual || valor==array[i];
		}
		return algunValorIgual;
	}
	//recibe una matriz de enteros, y devuelva verdadero si y solo si en cada una de las filas exite al menos un numero negativo 
	public static boolean tieneNegativos (int [][] matriz) {
		boolean todasLasFilasConNegativo = true;
		for(int i = 0; i < matriz.length ; i++) {
			todasLasFilasConNegativo = todasLasFilasConNegativo && tieneNegativoFila(i, matriz);
		}
		return todasLasFilasConNegativo;
	}
	public static boolean tieneNegativoFila(int valor, int [][]matriz) {
		boolean hayAlgunNegativo = false;
		for(int j = 0 ; j < matriz[valor].length ; j++) {
			hayAlgunNegativo = hayAlgunNegativo || matriz[valor][j]<0;
		}
		return hayAlgunNegativo;
	}
	
	//todas las filas estan en orden estrictamente ascendente 
	//todas las columnas tiene al menos un elemto impar y otro par
	
	public static boolean filasAscendente(int[][] matriz, int fila) {
		boolean esAscendente = true;
		int valor = matriz[fila][0];
		for(int i = 0; i< matriz[0].length; i++) {
			esAscendente = esAscendente && matriz[0][1]<=matriz[fila][i]; 
			System.out.println(valor);
			System.out.println("I ="+matriz[fila][i]);
			
		}
		return esAscendente;
	}
	
}
