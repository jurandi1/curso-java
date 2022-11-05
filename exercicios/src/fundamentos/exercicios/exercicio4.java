package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio4 {
	
	//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		double valor = sc.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.print("\nO valor ao quadrado é: " 
					+ quadrado 
					+ "\nO valor ao cubo é: " 
					+ cubo);

		sc.close();
	}
}
