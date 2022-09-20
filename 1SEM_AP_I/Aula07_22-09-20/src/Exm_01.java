import java.util.Scanner;

public class Exm_01 {

  public static void main(String[] args) {
    String continuar = "S";
    Scanner iScanner = new Scanner(System.in);

    while (continuar.equals("S")) {
      System.out.print("Deseja continuar ? (S-Sim/ N-Não): ");
      continuar = iScanner.next().toUpperCase();
    }
  }
}
