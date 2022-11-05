package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio3 {
	
	//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.1f", imc);

		sc.close();
	}
}
