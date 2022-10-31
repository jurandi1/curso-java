package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n"
				, 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Junior\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n%n",
				nome, sobrenome, idade);
		
		/* Particularidade dos métodos nextInt() e nextDouble(). 
		 * Ambos os métodos têm a mesma particularidade, mas vou
		 * explicá-la através do nextInt() com o exemplo abaixo:
		 */
		 
	    System.out.println("Qual a sua idade?");
	    idade = sc.nextInt();
	    sc.nextLine(); //lê o "\n" que o sc.nextInt() deixa para trás.
	    System.out.println("Qual o seu nome?");
	    nome = sc.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    sobrenome = sc.nextLine();
	 
	    
		
		sc.close();
	}

}
