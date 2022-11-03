package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário:");
		String valor1 = sc.next().replace(",", ".");
		System.out.print("\nInforme o segundo salário:");
		String valor2 = sc.next().replace(",", ".");;
		System.out.print("\nInforme o terceiro salário:");
		String valor3 = sc.next().replace(",", ".");;
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.print("A média dos salários é " + media);
		
		sc.close();
		
	}

}
