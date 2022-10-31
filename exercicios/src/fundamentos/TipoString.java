package fundamentos;

import java.util.Locale;

public class TipoString {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("olá Pessoal!".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println("");

		var nome = "Jurandi";
		var sobrenome = "Junior";
		var idade = 21;
		var salario = 1800.00;

		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário"
				+ salario + "\n\n";

		System.out.println(maisUmaFrase);

		/* Utilizando o printf
		 * Especificador || 	Formato
				%s			String de caracteres
				%d			Número inteiro decimal
				%u			Número inteiro decimal sem sinal
				%o			Número inteiro octal sem sinal
				%x, %X		Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
				%f			Float
				%2f			Double
				%e, %E		Número real, em notação científica, minúsculo ou maiúsculo
				%b			Boolean
				%c			Caractere (char)
		 */

		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

		System.out.println("");

		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		System.out.println("");

		System.out.println("Frase qualquer:");
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		System.out.println("Frase qualquer".replace("q", "Q"));

	}

}
