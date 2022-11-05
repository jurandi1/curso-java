package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio1 {
	
	//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
	
		System.out.printf("Valor em Celsius: %.1f", conversao);

		sc.close();
	}
}
