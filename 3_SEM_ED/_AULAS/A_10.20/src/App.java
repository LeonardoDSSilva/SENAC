public class App {
    public static void main(String[] args) throws Exception {

        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionaVertice("Paulo");
        grafo.adicionaVertice("Lorenzo");
        grafo.adicionaVertice("Cleuza");
        grafo.adicionaVertice("Kleber");
        grafo.adicionaVertice("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(3.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(1.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(1.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(3.0, "Claudio", "Paulo");
        
/*         System.out.println("Vertices:");
        grafo.imprimirVertices();

        System.out.println("Arestas:");
        grafo.imprimirArestas(); */


        System.out.println("Busca em largura:");
        grafo.BuscaEmLargura();

        System.out.println("\nBusca em profundidade:");
        grafo.BuscaEmProfundidade();

    }
}
