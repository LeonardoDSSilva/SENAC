import java.util.Scanner;
public class Exe_01 {
    public static void main(String[] args) {
        float num01, num02;
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Informe um numero: ");
        num01 = iScanner.nextFloat();
        System.out.printf("Informe um numero: ");
        num02 = iScanner.nextFloat();

        System.out.printf("%.2f + %.2f = %.2f", num01, num02, (num01 + num02));
    }
}
