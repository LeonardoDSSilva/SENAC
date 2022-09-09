import java.util.Scanner;
public class Exe_03 {
    public static void main(String[] args) {
        float saldo = 0, operacao;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe o Saldo da sua Conta: ");
        saldo = iScanner.nextFloat();
        operacao = saldo - 20;
        if (operacao < 0) {
            System.out.println("Saldo Insuficiente!");
        } else {
            System.out.printf("O novo Saldo é de R$ %.2f ", operacao);
        }
    }
}
