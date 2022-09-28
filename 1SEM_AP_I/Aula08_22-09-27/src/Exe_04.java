import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        int vaga = 0, menu; float caixa = 0;
        Scanner iScanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        do {
            System.out.println("1 - Entrada de veículo");
            System.out.println("2 - Saída de veículo");
            System.out.println("3 - Fechamento do dia");

            System.out.print("Informe a opção desejada: ");
            menu = iScanner.nextInt();
            System.out.println();
            switch (menu){
                case 1:
                vaga +=1;
                if (vaga <= 10) {
                    System.out.println("Há "+ (10 - vaga) +" vagas disponivel");
                }
                else System.out.println("Não há vaga disponivel");
                break;
                case 2:
                if (vaga > 0) {
                    vaga -= 1; caixa += 25;
                    System.out.printf("Há %d vagas disponivel", (10 - vaga));
                }
                else System.out.println("Não há Carro EStacionado");
                break;
                case 3:
                    System.out.println("Encerrado ..."); 
                    System.out.printf("Ha %d estacionados\n", vaga); 
                    System.out.printf("Valor Total R$ %.2f\n", caixa); 
                    System.out.printf("Foi registado %d\n", (( (int)caixa / 25) + vaga)); 
                break;
                default: System.out.println("Opcao Invalida"); break;
            }
            System.out.println();
        } while (menu != 3);
    }
}
