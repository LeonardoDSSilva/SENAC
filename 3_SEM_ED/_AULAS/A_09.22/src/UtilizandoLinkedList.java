import java.util.LinkedList;

public class UtilizandoLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();

		System.out.println("Tamanho da Lista = " + lista.size());

		// Adicionar elementos na lista
		lista.add("Cláudio");
		lista.add("João");
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("José");
		
		// Exibindo o tamanho da lista
		System.out.println("Tamanho da Lista = " + lista.size());

		// Exibindo os dados da lista
		System.out.println(lista);
		
		// Exibindo que está no início da lista
		System.out.println("Inicio da Lista = " + lista.getFirst());

		// Exibindo que está no final da lista
		System.out.println("Fim da Lista = " + lista.getLast());

		// Buscar a informação que está na 2º posição da lista
		System.out.println("Quem está na posição 2? " + lista.get(2));

		// Busca um nome na lista
		System.out.println("Tem Maria na lista? "+ lista.contains("Maria"));

		// Remover uma informacao da lista por posicao
		lista.remove(0);

		//Remover uma informacao da lista por conteudo
		lista.remove("Maria");
		System.out.println("Tamanho da Lista = " + lista.size());
		System.out.println(lista);

	}
}
