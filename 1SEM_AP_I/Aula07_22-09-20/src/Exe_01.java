import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        String caractere;
        int i = 1;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe a qual o caractere: ");
        caractere = iScanner.next();
        do {
            System.out.print(caractere);
            i++;
        } while (i <= 100);


    }
}
