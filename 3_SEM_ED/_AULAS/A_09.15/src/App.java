import estruturaestatica.Fila;

public class App {
    public static void main(String[] args)  {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println("A fila está vazia? " + fila.estaVazia());
        System.out.println("Qual o tamanho da fila: " + fila.tamanho());

        System.out.println(fila.toString());

        System.out.println(fila.desenfileira());

        System.out.println(fila.toString());

    }
}
