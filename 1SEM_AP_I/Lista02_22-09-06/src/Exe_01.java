import java.util.Scanner;
public class Exe_01 {
    public static void main(String[] args) {
        float saldo;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Digite o saldo da conta: ");
        saldo = iScanner.nextFloat();
        System.out.printf("O saldo reajustado é: R$ %.2f", (saldo * 1.05));
    }
}
