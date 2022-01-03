package Exercicios;

/*Gere e imprima uma matrix M 4x4 com valores
 * aleat�rios entre 0 e 9
 */

import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		int [][] M=new int[4][4];
		
		//Preencher matriz
		
		for(int i=0;i<M.length;i++) {
			for (int j=0;j<M[i].length;j++) {
				M[i][j]=random.nextInt(9);
			}
		}
		
		//Exibir a matriz
		for (int[] linha:M) {
			for (int coluna:linha) {
				System.out.println(coluna+" ");
			}
			System.out.println();
		}
	}

}
