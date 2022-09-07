import java.util.Scanner;
public class Exe_02 {
    public static void main(String[] args) {
        String nome;
        float nota01, nota02;
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Informe o nome do aluno: ");
        nome = iScanner.nextLine();

        System.out.println("Informe a 1ª nota: ");
        nota01 = iScanner.nextFloat();
        System.out.println("Informe a 2ª nota: ");
        nota02 = iScanner.nextFloat();

        System.out.printf("A média do aluno %s é %.2f", nome, ((nota01 + nota02)/2));

    }
    
}
