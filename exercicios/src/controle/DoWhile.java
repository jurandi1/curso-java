package controle;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// if(...) sentença; ou {}
		// while(...) sentença; ou {}
		// for(variável ; expressão ; modificação da variável incremente, decremento, aditiva, multiplicativa, divisiva...) sentença; ou {}
		
		// do sentença; ou {} while(...);
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as"
					+ " palavras mágicas...");
			System.out.print("Quer sair?");
			texto = sc.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		sc.close();
	}
}
