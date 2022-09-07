import java.util.Scanner;

public class EXEM02 {
    public static void main(String[] args) {
        int num01, num02, resul = 0;

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Informe um numero:");
        num01 = iScanner.nextInt();
        System.out.println("Informe um numero:");
        num02 = iScanner.nextInt();

        resul = num01 + num02;

        System.out.println("Soma: "+resul);

    }
    
}
