import java.util.Scanner;

/*
Crie um programa que calcule e exiba a soma dos números inteiros informados pelo 
usuário, 
    a. O programa deve permitir que o usuário escolha ver o valor atual da soma ou não.
    b. O programa deve perguntar ao usuário se ele deseja continuar somando ou não
 */
public class Exe_04 {

  public static void main(String[] args) {
    int num, soma = 0;
    String continuar, ver;
    Scanner iScanner = new Scanner(System.in);

    do {
      System.out.print("Informe um numero: ");
      num = iScanner.nextInt();

      soma += num;

      System.out.print("Deseja ver o resultado ? (S-Sim/ N-Não): ");
      ver = iScanner.next().toUpperCase();

      if (ver.equals("S")) {
        System.out.println(soma);
      }

      System.out.print("Deseja continuar ? (S-Sim/ N-Não): ");
      continuar = iScanner.next().toUpperCase();
    } while (continuar.equalsIgnoreCase("S"));
  }
}
