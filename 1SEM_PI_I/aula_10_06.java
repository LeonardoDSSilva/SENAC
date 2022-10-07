import java.util.Scanner;

public class aula_10_06 {

  public static void main(String[] args) {
    float nota = 0, soma = 0;
    int tam = 1, con = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite a nota do aluno: ");
    tam = input.nextInt();
    while (con < tam) {
      do {
        System.out.printf("Digite a nota %d° do aluno: ", con + 1);
        nota = input.nextFloat();
        if (nota < 0) System.out.println("Nota invalida informe novamente");
      } while (0 > nota);
      con++;
      soma += nota;
    }
    System.out.println("A media do aluno é: " + (soma / tam));
  }
}
