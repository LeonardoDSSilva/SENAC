import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();

        System.out.print("Obrigado por participar da nossa pesquisa");
    }

}
