// Crie um programa que exiba as tabuadas de 2 até 9
public class Exe_03 {

  public static void main(String[] args) {
    int num = 2;
    System.out.println();
    do {
      for (int i = 0; i <= 10; i++) {
        System.out.printf("%d * %d = %d \n", num, i, (num * i));
      }
      System.out.println();
      num++;
    } while (num <= 9);
  }
}
