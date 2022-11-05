package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio5 {
	
	//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Base:");
		double base = sc.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);

		sc.close();
	}
}
