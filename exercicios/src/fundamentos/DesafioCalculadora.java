package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Qual operação? + ou - ou * ou / ou %
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();

		System.out.println("Qual a operação? [+ - * / %]");
		String op = sc.next();
		
		// Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);	
		sc.close();
	}
}
