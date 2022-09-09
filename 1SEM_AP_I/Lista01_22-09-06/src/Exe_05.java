import java.util.Scanner;
public class Exe_05 {
    public static void main(String[] args) {
        float mercadoria, pagamento;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe o valor da Mercadoria: ");
        mercadoria = iScanner.nextFloat();
        System.out.print("Informe o pagamento: ");
        pagamento = iScanner.nextFloat();
        if (pagamento >= mercadoria) {
            System.out.printf("\nSeu troco é de R$ %.2f\n Obrigado pela preferência, volte sempre!\n", (pagamento - mercadoria));
        } else {
            System.out.println("Valor insuficiente para pagar a compra");
        }
    }
}
