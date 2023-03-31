import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        float trabalho = 0, prova, media = 0;
        String nome, continuar;

        do {
            System.out.print("\033[H\033[2J");  
            System.out.flush();     

            Scanner iScanner = new Scanner(System.in);
            nome = ""; trabalho = 0; prova = 0; media = 0;
            
            System.out.print("O qual é nome do Aluno: ");
            nome = iScanner.nextLine();
            System.out.println();
            
            for(int i = 1; i <= 4; i++){
                System.out.printf("Informe a %dª nota do trabalho: ", i);
                trabalho += iScanner.nextFloat();
            } 
            System.out.print("\nInforme a nota da prova: " );
            prova = iScanner.nextFloat();
            System.out.println();
            
            media = ((trabalho/4) + prova ) / 2;
            
            if (media >= 7) System.out.printf("O aluno %s, obteve a média %.2f portanto esta aprovado\n", nome, media);
            else System.out.printf("O aluno %s, obteve a média %.2f portanto esta reprovado\n", nome, media);
            
            System.out.println();
            System.out.print("Deseja continuar S - Sim e N - Não: ");
            continuar = iScanner.next().toUpperCase();
            
        } while (continuar.equalsIgnoreCase("S"));
    }
}
