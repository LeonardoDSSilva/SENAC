import java.util.Scanner;
public class Exe_04 {
    public static void main(String[] args) {
        int num;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = iScanner.nextInt();
        System.out.printf(" %d x 00 = %d\n", num, num * 0);
        System.out.printf(" %d x 01 = %d\n", num, num * 1);
        System.out.printf(" %d x 02 = %d\n", num, num * 2);
        System.out.printf(" %d x 03 = %d\n", num, num * 3);
        System.out.printf(" %d x 04 = %d\n", num, num * 4);
        System.out.printf(" %d x 05 = %d\n", num, num * 5);
        System.out.printf(" %d x 06 = %d\n", num, num * 6);
        System.out.printf(" %d x 07 = %d\n", num, num * 7);
        System.out.printf(" %d x 08 = %d\n", num, num * 8);
        System.out.printf(" %d x 09 = %d\n", num, num * 9);
        System.out.printf(" %d x 10 = %d\n", num, num * 10);
    }

}
