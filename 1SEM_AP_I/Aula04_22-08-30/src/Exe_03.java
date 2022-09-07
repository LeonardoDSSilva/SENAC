import java.util.Scanner;
public class Exe_03 {
    public static void main(String[] args) {
        int num01, num02;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Informe um numero: ");
        num01 = iScanner.nextInt();
        System.out.printf("Informe um numero: ");
        num02 = iScanner.nextInt();
        if (num01 > num02) {
            System.out.printf(" %d > %d", num01, num02);
        } else {
            System.out.printf(" %d > %d", num02, num01);
        }
    }
}
