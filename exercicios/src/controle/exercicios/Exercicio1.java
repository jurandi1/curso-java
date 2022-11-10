package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	/**
	 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
	 * 10 e é par;
	 */

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Informe um número: ");
		 int num = sc.nextInt();
		 
		 if(num >= 0 && num <= 10) {
			 if(num % 2 == 0) {
				 System.out.println("O numero " + num + " está entre 0 e 10 e é par.");
			 } else {
				 System.out.println("O numero " + num + " está entre 0 e 10, mas não é par.");
			 }
		 } else {
			 System.out.println("O numero " + num + " não está entre 0 e 10.");
		 }
		sc.close();
	}
}
