import java.util.Scanner;
public class Exe_06 {
    public static void main(String[] args) {
        int idade, mes, dia, dia_vividos;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        idade = iScanner.nextInt();
        System.out.print("Informe o mês(mm) que nasceu: ");
        mes = iScanner.nextInt();
        System.out.print("Informe o dia(dd) que nasceu: ");
        dia = iScanner.nextInt();
        idade *= 365;
        mes *= 30;
        System.out.printf("\nVocê já viveu %d dias", (idade + mes + dia));
    }
}
