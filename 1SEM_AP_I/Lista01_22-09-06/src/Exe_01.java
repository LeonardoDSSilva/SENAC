import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        float x, y;
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Informe o Comprimento: ");
        x = iScanner.nextFloat();
        System.out.print("Informe a Largura: ");
        y = iScanner.nextFloat();

        float area = x * y;

        System.out.printf("O cômodo de %.2f X %.2f tem area de %.2f m²", x, y, (x * y));
    }
}
