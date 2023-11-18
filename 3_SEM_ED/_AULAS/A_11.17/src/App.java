import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Arvore arvore = new Arvore();

        for (int i = 0; i < 10; i++) {
            arvore.insert(random.nextInt(100), arvore.root);
        }

        System.out.print("In Order:");
        arvore.inOrder(arvore.root);

        System.out.print("\nPre Order:");
        arvore.preOrder(arvore.root);

        System.out.print("\nPost Order:");
        arvore.postOrder(arvore.root);

    }
}
