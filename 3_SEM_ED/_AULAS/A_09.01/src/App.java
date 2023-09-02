public class App {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());
        System.out.println(pilha);
        System.out.println( "Tamhanho da Pilha: " + pilha.tamanho());
        System.out.println();
        
        for (int i = 0; i < 10; i++) {
            pilha.empilha(i);
        }
        
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());
        System.out.println("Desempilhar elemento " + pilha.desempilha());
        System.out.println(pilha);
        System.out.println( "Tamhanho da Pilha: " + pilha.tamanho());
        System.out.println();


        System.out.println( new TesteStack());
    }
}
