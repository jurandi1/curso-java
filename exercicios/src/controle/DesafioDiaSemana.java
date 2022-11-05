package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o nome do dia da semana: ");
		String dia = sc.next().toUpperCase();

		if (dia.equalsIgnoreCase("domingo")){
			System.out.println("Dia 1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Dia 2");
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println("Dia 3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Dia 5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Dia 6");
		} else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println("Dia 7");
		} else {
			System.out.println("Dia Inválido");
		}

		sc.close();
	}
}
