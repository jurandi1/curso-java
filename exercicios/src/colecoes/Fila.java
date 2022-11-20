package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> adicionam elementos na fila
		// A diferença do comporatamento ocorre quando a fila está cheia!
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element -> obter o próximo elemento da fila (Sem Remover)
		// A diferença do comporatamento ocorre quando a fila esta vazia!
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // Lança uma exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		
		// poll e remove -> obter o próximo elemento da fila e remove!
		// A diferença do comporatamento ocorre quando a fila esta vazia!
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
