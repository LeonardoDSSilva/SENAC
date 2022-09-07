import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        float nota01, nota02;
        String nome;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Informe o nome do aluno: ");
        nome = iScanner.nextLine();
        System.out.printf("Informa a 1ª nota desse aluno: ");
        nota01 = iScanner.nextFloat();
        System.out.printf("Informa a 2ª nota desse aluno: ");
        nota02 = iScanner.nextFloat();
        System.out.printf("Aluno %s teve media de %.2f", nome, ((nota01+nota02)/2));
    }
    
}
