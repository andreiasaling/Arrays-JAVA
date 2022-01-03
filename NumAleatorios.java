package Exercicios;

import java.util.Random;
import java.util.Scanner;

/*Faça um programa que leia 20 números aleatórios (entre 0 e 100)
 * e armazene-os em um vetor. Ao final mostre os números e
 * seus sucessores e antecessores
 */

public class NumAleatorios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int[] numerosrandom = new int[20];

		// Preencher o vetor
		for (int i = 0; i < numerosrandom.length; i++) {
			int numero = random.nextInt(100);
			numerosrandom[i] = numero;
		}

		// Exibir o vetor com antecessor e sucessor
		for (int numero : numerosrandom) {
			System.out.println("Antecessor: " + (numero - 1) + " ");
			System.out.println("Número aleatório: " + numero + " ");
			System.out.println("Sucessor: " + (numero + 1) + " \n");

		}

	}

}
