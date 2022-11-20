package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		int qNotas = sc.nextInt();
		
		double[] notas = new double[qNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A média é %.1f", media, "!");
		sc.close();
	}
}
