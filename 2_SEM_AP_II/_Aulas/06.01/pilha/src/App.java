public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        System.out.println("Pilha vazia? " + pilha.getIsEmpty());
        System.out.println("Pilha cheia? " + pilha.getIsFull());
        System.out.println("O valor da posição do topo da pilha é: " + pilha.peek());
        
        pilha.push(25);
        pilha.push(30);
        pilha.push(35);

        System.out.println("Pilha vazia? " + pilha.getIsEmpty());
        System.out.println("Pilha cheia? " + pilha.getIsFull());
        System.out.println("O valor da posição do topo da pilha é: " + pilha.peek());

        pilha.push(40);
        pilha.push(45);

        System.out.println("Pilha vazia? " + pilha.getIsEmpty());
        System.out.println("Pilha cheia? " + pilha.getIsFull());
        System.out.println("O valor da posição do topo da pilha é: " + pilha.peek());

        pilha.push(50);

        pilha.clear();
        System.out.println("O valor da posição do topo da pilha é: " + pilha.peek());
    }
}
