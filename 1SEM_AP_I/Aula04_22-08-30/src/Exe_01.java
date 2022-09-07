import java.util.Scanner;
public class Exe_01 {
    public static void main(String[] args)  {
        float num01, num02;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Informe o 1 numero: ");
        num01 = iScanner.nextFloat();
        System.out.println("Informe o 2 numero: ");
        num02 = iScanner.nextFloat();
        System.out.printf(" %.0f + %.0f = %.0f", num01, num02, (num01+ num02));

    }
}