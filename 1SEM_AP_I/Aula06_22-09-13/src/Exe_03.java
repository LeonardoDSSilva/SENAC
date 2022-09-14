import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {
        int num;

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Informe um nome para realixar a tabuada: ");
        num = iScanner.nextInt();
        System.out.println();
        for (int i = 0; i <= 10; i++){
            System.out.printf("\t %d * %d = %d \n", num, i, (num * i));
        }
    }
}
