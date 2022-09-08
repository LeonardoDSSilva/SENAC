import java.util.Scanner;
public class Exe_03 {
    public static void main(String[] args) {
        int num;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = iScanner.nextInt();
        System.out.printf("O antecessor de %d é %d e o sucessor é %d", num, num - 1, num + 1);
    }
}
