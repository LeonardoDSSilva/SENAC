import java.util.Scanner;

public class Exe_02b {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner iScanner = new Scanner(System.in);
        do {
            System.out.print("Informe um número (Caso vc desaja parar digite -1): ");
            num = iScanner.nextInt();
            if (num % 2 == 0) sum += num;
        } while (num != -1);
        System.out.println("A soma dos números pares é: " + sum);
    }
}