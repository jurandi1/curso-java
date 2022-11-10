package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {
	/**
	 * 8. Criar um programa que receba uma palavra e imprime no console letra por
	 * letra.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra: "); 
		String palavra = sc.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		sc.close();
	}
}