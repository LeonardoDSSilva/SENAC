import java.util.Stack;

public class TesteStack {
	public TesteStack() {
		Stack<Integer> stack = new Stack<Integer>();

		// Método para verificar se a pilha está vazia
		System.out.println(stack.isEmpty());

		// Método para Empilhar
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// Método para verificar o tamanho da pilha
		System.out.println(stack.size());

		// Método ToString para exibir a pilha
		System.out.println(stack);

		// Método para verificar o topo
		System.out.println(stack.peek());

		// Método para desempilhar
		System.out.println(stack.pop());

		// Método ToString para exibir a pilha
		System.out.println(stack);
	}
}
