import java.util.Scanner;

public class Exm_01 {
    public static void main(String[] args) {
        String nome;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Informe um Nome: ");
        nome = iScanner.nextLine();
        System.out.printf("Seja Bem vindo %s", nome);

    }
}