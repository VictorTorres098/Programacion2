package entregableAcum;

public class Main {

	public static void main(String[] args) {
		int [][] matriz =  {{1,9,6,2},
							{9,12,18,18},
							{15,14,9,30}};
		//int mat [][] = new int [0][0];
		
		System.out.println(Acumuladores.exiteColumnaMultiplo(matriz, 2, 0));
		
		//System.out.println(matriz.length);
		//System.out.println(matriz[0].length);
	}

}
