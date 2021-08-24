package entregableAcum;

public class Acumuladores {
	
	///entregar el codigo por PDF
//	Implementar la función existeColumnaMultiplol(int[ ][ ] mat, int k, int c), que recibe una matriz
//	de enteros, mat, y un valor entero, k, y retorna True si existe alguna columna donde todos sus
//	elementos sean iguales a los elementos de la columna c multiplicados por k, posición a posición.
//	Utilizar acumuladores booleanos para resolverlo.
//	Si la matriz es vacía devuelve False, c es un valor válido y k siempre es un entero válido.
	
	
	
//  tomar el primer valor de la columna multiplicarla y buscar el resultado de algun elemento de la columna dada multiplicada x2 en los elementos de otras columnas 
	
	public static boolean exiteColumnaMultiplo(int [][] mat, int k, int c) {
		if( k<=0 && c > mat[0].length && mat.length==0) {
			return false;
		}
		boolean columnaConMultiplo = false; 							//ya que debe exitir algun int que coicida 
		for(int i = 0; i < mat[0].length; i++) {
				columnaConMultiplo = columnaConMultiplo || coicidenciaColumna(mat, i , c , k);
			
		}
		return columnaConMultiplo;
	}
	public static boolean coicidenciaColumna (int [][] mat, int i, int c, int k) {
		boolean ret = true;
		for(int j = 0; j < mat.length; j++) {
			ret = ret && mat[j][i] == mat[j][c]*k;
		}
		return ret;
	}
//	a) Implementar una funcion filaColumnaIgual(int[][]mat)que compruebe si hay alguna fila cuyos
//	elementos son iguales a los elementos de una columna en el mismo orden, la matriz es cuadrada.
	
	public static boolean filaColumnaIgual (int [][] mat) {
		boolean algunaIgualdad = false;
		for(int i = 0; i < mat.length; i++) {
			algunaIgualdad = algunaIgualdad || ElementoCoincide(mat, i);
		}
		return algunaIgualdad;
	}
	public static boolean ElementoCoincide (int [][] mat, int indice) {
		boolean elementoIgual = true;
		for(int i = 0; i < mat.length; i++) {
			elementoIgual = elementoIgual && mat[i][indice]==mat[indice][i];
		}
		return elementoIgual;
	}

}
