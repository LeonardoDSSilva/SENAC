import java.util.Scanner;
public class Exe_05 {
    public static void main(String[] args) {
        float num01, num02;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        num01 = iScanner.nextFloat();
        System.out.print("Informe um numero: ");
        num02 = iScanner.nextFloat();

        if (num01 > num02) {
            System.out.printf("%.0f > %.0f", num01, num02);
        } else {
            System.out.printf("%.0f > %.0f", num02, num01);
        }
    }
}
