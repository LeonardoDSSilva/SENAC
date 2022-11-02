package exe_04;

import java.util.Scanner;

public class Exe_04 {

  public static void main(String[] args) {
    Ambiente[] ambientes = new Ambiente[10];
    int indice = 1;

    Scanner numScanner = new Scanner(System.in);
    Scanner strScanner = new Scanner(System.in);

    for (int i = 0; i < ambientes.length; i++) {
      ambientes[i] = new Ambiente();

      System.out.println("Informe o nome do ambiente: ");
      ambientes[i].nomeAmbiente = strScanner.nextLine();

      System.out.println("Informe a largura do ambiente: ");
      ambientes[i].largura = numScanner.nextFloat();

      System.out.println("Informe o comprimento do ambiente: ");
      ambientes[i].comprimento = numScanner.nextFloat();

      ambientes[i].area = ambientes[i].largura * ambientes[i].comprimento;
    }

    for (Ambiente ambiente : ambientes) {
      System.out.printf(
        " %d: %s -- %.2f x %.2f -- %.2f m² \n",
        indice,
        ambiente.nomeAmbiente,
        ambiente.largura,
        ambiente.comprimento,
        ambiente.area
      );
      indice++;
    }
  }
}
