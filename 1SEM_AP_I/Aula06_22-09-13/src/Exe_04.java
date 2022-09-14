import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        int num;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        num = iScanner.nextInt();

        for (int i = 0; i < 10; i ++ ){
            System.out.println(num);
            num += num;
        }
    }
}