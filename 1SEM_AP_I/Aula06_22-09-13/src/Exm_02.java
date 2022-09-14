import java.util.Scanner;

public class Exm_02 {

  public static void main(String[] args) {
    int num;
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Informe um número: ");
    num = iScanner.nextInt();
    if (num >= 0) {
      if (num % 2 == 0) {
        System.out.println("O número é par e positivo");
      } else {
        System.out.println("O número é ímpar e positivo");
      }
    } else {
      if (num % 2 == 0) {
        System.out.println("O número é par e negativo");
      } else {
        System.out.println("O número é ímpar e negativo");
      }
    }
  }
}
