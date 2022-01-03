package Exercicios;

/*Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa
 */
public class OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = { 6, 5, 4, 3, 2, 1 };

		// Exibir vetor:
		System.out.println("Vetor: ");
		int cont = 0;
		while (cont <= (vetor.length - 1)) {
			System.out.println(vetor[cont] + " ");
			cont++;
		}

		// Exibir vetor inverso:
		System.out.println("Vetor inverso: ");
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
	}

}
