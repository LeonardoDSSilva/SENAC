import java.util.Scanner;
public class Exe_02 {
    public static void main(String[] args) {
        int opcao;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Escolha uma opção de Carro: \n 1 - Carro \t R$ 100.000,00 \n 2 - Carro \t R$ 150.000,00 \n Informe a opção: ");
        opcao = iScanner.nextInt();
        if (opcao == 1) {
            System.out.printf("Você deve dar entrada de R$ %.2f e parcelar o restante em 12x de R$ %.2f ", (100000 * 0.4), (100000 * 0.6) / 12);
        } else if (opcao == 2) {
            System.out.printf("Você deve dar entrada de R$ %.2f e parcelar o restante em 12x de R$ %.2f ", (150000 * 0.4), (150000 * 0.6) / 12);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
