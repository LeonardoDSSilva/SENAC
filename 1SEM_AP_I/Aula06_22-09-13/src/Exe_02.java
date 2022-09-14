import java.util.Scanner;
public class Exe_02 {
    public static void main(String[] args) {
        String nome01, nome02, nome03;

        Scanner iScanner = new Scanner(System.in);
        
        System.out.print("Informe o 1º nome: ");
        nome01 = iScanner.next().toUpperCase();
        System.out.print("Informe o 2º nome: ");
        nome02 = iScanner.next().toUpperCase();
        System.out.print("Informe o 2º nome: ");
        nome03 = iScanner.next().toUpperCase();

        if (nome01.compareTo(nome02) <= 0 && nome01.compareTo(nome03) <= 0 && nome01.compareTo(nome03) <= 0) {
            if (nome02.compareTo(nome03) <= 0) {
                System.out.printf("%s, %s, %s", nome01, nome02, nome03);
            } else {
                System.out.printf("%s, %s, %s", nome01, nome03, nome02);
            }
        } else if (nome02.compareTo(nome01) <= 0 && nome02.compareTo(nome03) <= 0 && nome02.compareTo(nome03) <= 0) {
            if (nome01.compareTo(nome03) <= 0) {
                System.out.printf("%s, %s, %s", nome02, nome01, nome03);
            } else {
                System.out.printf("%s, %s, %s", nome02, nome03, nome01);
            }
        } else if (nome03.compareTo(nome01) <= 0 && nome03.compareTo(nome02) <= 0 && nome03.compareTo(nome02) <= 0) {
            if (nome01.compareTo(nome02) <= 0) {
                System.out.printf("%s, %s, %s", nome03, nome01, nome02);
            } else {
                System.out.printf("%s, %s, %s", nome03, nome02, nome01);
            }
        }
    }
}
