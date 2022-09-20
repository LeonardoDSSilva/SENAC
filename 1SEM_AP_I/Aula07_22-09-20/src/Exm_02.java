import java.util.Scanner;

public class Exm_02 {

  public static void main(String[] args) {
    String continuar;
    Scanner iScanner = new Scanner(System.in);
    do {
      System.out.print("Deseja continuar ? (S-Sim/ N-Não): ");
      continuar = iScanner.next().toUpperCase();
    } while (continuar.equalsIgnoreCase("S"));
  }
}
