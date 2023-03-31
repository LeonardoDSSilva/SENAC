import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        int vaga = 0, menu; float caixa = 0;
        Scanner iScanner = new Scanner(System.in);

        do {
            System.out.println("1 - Entrada de veículo");
            System.out.println("2 - Saída de veículo");
            System.out.println("3 - Fechamento do dia");

            System.out.print("Informe a opção desejada: ");
            menu = iScanner.nextInt();
            System.out.println();
            switch (menu){
                case 1:
                if (vaga <= 9) {
                    vaga +=1;
                    System.out.println("Há "+ (10 - vaga) +" vagas disponivel");
                }
                else System.out.println("Não há vaga disponivel");
                break;
                case 2:
                System.out.println(vaga);
                if (vaga > 0) {
                    vaga -= 1; caixa += 25;
                    System.out.printf("Há %d vagas disponivel", (10 - vaga));
                }
                else System.out.println("Não há Carro Estacionado");
                break;
                case 3:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();

                    System.out.println("Encerrado ..."); 
                    if (vaga == 0) System.out.println("Não há Carro EStacionado");
                    else System.out.println("Há "+ vaga +" Carros Estacionado");
                    System.out.printf("Valor Total R$ %.2f\n", caixa); 
                    System.out.printf("Foi registado %d Carros\n", (( (int)caixa / 25) + vaga)); 
                break;
                default: System.out.println("Opcao Invalida"); break;
            }
            System.out.println();
        } while (menu != 3);
    }
}
