import java.util.Scanner;

public class Exe_02a {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner iScanner = new Scanner(System.in);
        while (num != -1) {
            System.out.print("Informe um número (Caso vc desaja parar digite -1): ");
            num = iScanner.nextInt();
            if (num % 2 == 0) sum += num;
        }
        System.out.println("A soma dos números pares é: " + sum);
    }
}
