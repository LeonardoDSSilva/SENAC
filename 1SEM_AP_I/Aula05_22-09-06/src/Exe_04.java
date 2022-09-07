import java.util.Scanner;
public class Exe_04 {
    public static void main(String[] args) {
        String nome;
        float nota01, nota02, media;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe o nome do Aluno: ");
        nome = iScanner.nextLine();
        System.out.print("Informe a 1ª nota: ");
        nota01 = iScanner.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        nota02 = iScanner.nextFloat();
        media = ((nota01 + nota02)/2);
        if (media >= 6) {
            System.out.printf("A media do Aluno %s é %.2f portanto o aluno esta APROVADO", nome, media);
        } else {
            System.out.printf("A media do Aluno %s é %.2f portanto o aluno esta REAPROVADO", nome, media);
            
        }
    }
}
