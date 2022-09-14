import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        int num01, num02, operacao; 
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Informe a 1ª variavel: ");
        num01 = iScanner.nextInt();
        System.out.print("Informe a 2ª variavel: ");
        num02 = iScanner.nextInt();
        System.out.println("Informe um numero para realizar uma operação: ");
        System.out.println("1 - \t Soma\n2 - \t Subtração\n3 - \t Multicação\n4 - \t Divisão\n");
        operacao = iScanner.nextInt();

        switch (operacao){
            case 1:
                System.out.printf("%d + %d = %d", num01, num02, (num01 + num02));
            break;
            case 2:
                System.out.printf("%d - %d = %d", num01, num02, (num01 - num02));
            break;
            case 3:
                System.out.printf("%d * %d = %d", num01, num02, (num01 * num02));
            break;
            case 4:
                System.out.printf("%d / %d = %d", num01, num02, (num01 / num02));
            break;
            default:
                System.out.println("Não sera possivel realizar a operação: Numero Invalido !!!");
            break;
        }
    }
}
