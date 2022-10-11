import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        int num = 0;
        Scanner iScanner = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Digite um número por favor: ");
        num = iScanner.nextInt();
        System.out.println();

        for (int i = 0; i <= num; i++) {
            if (i == 0) System.out.println(i); // Quando for apenas 0
            else if (i % 2 != 0) System.out.println((i * 10)); // Quando for ímpar
            else System.out.printf("%d, %d, %d\n", (i - 1), i, (i + 1)); // Quando for par
        }
    }
}