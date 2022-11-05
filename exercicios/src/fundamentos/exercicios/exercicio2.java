package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio2 {
	
	//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double conversao = celsius * 1.8 + 32;
		
		System.out.printf("Valor em Farenheit: %.1f", conversao);

		sc.close();
	}
}
