package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // declaração e  inicialização
		System.out.println(a);
		a = 12;
		System.out.println(a);
		
		// a = "...";
		
		/*Utilizando "var" o Java vai inferir o valor atribuido
		 *a variável e vai definir o tipo da variável. */
		var b = 4.5;   
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // Variável declarada
		d = 123.65; //Variável inicializada
		System.out.println(d); // Váriavel usada;
		
		var e = 123.45; // utilizando "var" tem que ser declarada na mesma linha
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01; O Java exige  que você seja explícito
		System.out.println(f);
		
	}
}
