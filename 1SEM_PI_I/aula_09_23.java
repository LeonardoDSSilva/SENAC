import java.util.Scanner;

public class aula_09_23 {

    public static void main(String[] args) {
        int numerosecreto = 42, num, i = 1;

        Scanner iScanner = new Scanner(System.in);

        System.out.println("\nAdivinhe o número secreto você tem 3 tentativas para acertar");
        do {
            switch (i) {
                case 1:
                    System.out.println("\nDica: é um número par");
                    break;
                case 2:
                    System.out.println("\nVocê errou, tente novamente você tem mais 1 tentativa - Dica: tem 2 dígitos");
                    break;
                default:
                    System.out.println("\nUtima tentativa - Dica: Este número é a resposta para a vida, o universo e tudo mais");
                    break;
            }

            System.out.print("Digite um número: ");
            num = iScanner.nextInt();

            i++;

        } while (num != numerosecreto && i < 4); // i <= 3
        
        if (i == 4) {
            System.out.println("\nVocê errou e acabou suas tentativas ! ^_^ O número secreto era " + numerosecreto);
        } else {
            System.out.println("\nParabéns você acertou :-)");
        }
    }
}