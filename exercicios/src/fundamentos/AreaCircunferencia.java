package fundamentos;

import java.util.Locale;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double raio = 3.4;
		final double PI = 3.14159; // uma vez que tem a palavra final o valor não pode ser alterado
		
		double area = PI * raio * raio;	
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m².");
	}

}
