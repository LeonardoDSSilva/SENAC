import java.util.Scanner;

import ado10.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        do {
            System.out.println("Qual exercício você quer executar?");
            System.out.println("1 - TesteArrayListNumero");
            System.out.println("2 - TesteHashSetCPF");
            System.out.println("3 - TesteMapaAluno");

            switch (scInt.nextInt()){
                case 1:
                    TesteArrayListNumero.main(args);
                    break;
                case 2:
                    TesteHashSetCPF.main(args);
                    break;
                case 3:
                    TesteMapaAluno.main(args);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja executar outro exercício? (S/N)");
        } while (scStr.nextLine().toUpperCase().equals("S"));
        scInt.close();
        scStr.close();
    }
}
