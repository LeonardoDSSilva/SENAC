import java.util.Scanner;
public class Exe_05 {
    public static void main(String[] args) {
        String nome;
        float salario, vendas;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        nome = iScanner.nextLine();
        System.out.print("Digite o salário do vendedor: ");
        salario = iScanner.nextFloat();
        System.out.print("Digite o valor das vendas do vendedor: ");
        vendas = iScanner.nextFloat();
        System.out.printf("O salário final do vendedor %s é: R$ %.2f", nome, (salario + (vendas * 0.05)));
    }
}