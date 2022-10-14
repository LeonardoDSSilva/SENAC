import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class aula_10_13 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        String resposta;
        

        do{
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.println("####");
            System.out.println("CaSinPo");
            System.out.println("####");

            modo();

            System.out.println();
            
            System.out.println("Aperte o enter para jogar novamente ou digite 'sair' para sair");
            resposta = iScanner.nextLine();
            
        }while(!resposta.equals("sair"));
    }

    private static void modo() {

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner iScanner = new Scanner(System.in);
        int vitorias = 0, derrotas = 0, empates = 0;
        String resposta = "";

        System.out.println("Qual o modo de jogo");
        System.out.println("1 - Aposta");
        System.out.println("2 - Rodadas");
        int modo = iScanner.nextInt();

        switch (modo) {
            case 1:

                System.out.print("\033[H\033[2J");  
                System.out.flush();

                System.out.println("Aposta");
                int ponto = 100, pontosu = 0, pontosc = 0, aposta = 0;

                do {

                    do {
                        System.out.println("Digite o valor da aposta: ");
                        aposta = iScanner.nextInt();
                        if (aposta > ponto) System.out.println("Valor inválido");
                        System.out.println("Valor da aposta: " + ponto);
                    } while (aposta > ponto);
    
                    Random rand = new Random();
                    int computador = rand.nextInt(ponto) + 1;
    
                    System.out.println("Computador Apostou: " + computador);
    
                    int pontos1 = jogo();
    
                    if (pontos1 == 1) {
                        ponto += aposta;
                        pontosu += aposta;
                        
                    } else if (pontos1 == -1) {
                        ponto -= aposta;
                        pontosc += computador;
                    }
                    System.out.printf("Placar: Você %d x %d Computador\n", pontosu, pontosc);

                    if (ponto > 0 ) {
                        System.out.println("Voce quer continuar apostando? (s/n)");
                        resposta = iScanner.next().toUpperCase();
                    }
                    
                } while (ponto > 0 && !resposta.equals("N"));

                break;
            case 2:
                
                System.out.print("Quantas rodadas: ");
                int rodadas = iScanner.nextInt();

                System.out.println("Modo melhor de " + rodadas);
                for (int i = 1; i <= rodadas; i++) {
                    int pontos = jogo();
                    if (pontos == 1) vitorias++;
                    else if (pontos == 2) derrotas++;
                    else empates++;
                }

                System.out.print("\033[H\033[2J");  
                System.out.flush();
                
                System.out.println("Fim de jogo");
                System.out.println("Vitorias: " + vitorias);
                System.out.println("Derrotas: " + derrotas);
                System.out.println("Empates: " + empates);

                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static int jogo() {
        int ponto = 0;
        
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Escolha sua usuario");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int usuario = iScanner.nextInt();

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        escolha(usuario, "Você");
        
        if (usuario >= 1 && usuario <= 3) {
            
            int computador = (int) (Math.random() * 3) + 1;
            escolha(computador, "Computador");
            
            System.out.println();
            if (usuario == computador) {
                System.out.println("Empate");
                ponto = 0;
            } else if (usuario == 1 && computador == 3) {
                System.out.println("Você ganhou");
                ponto = 1;
            } else if (usuario == 2 && computador == 1) {
                System.out.println("Você ganhou");
                ponto = 1;
            } else if (usuario == 3 && computador == 2) {
                System.out.println("Você ganhou");
                ponto = 1;
            } else {
                System.out.println("Você perdeu");
                ponto = -1;
            }
        }
        return ponto;
    }

    private static void escolha(int computador, String usuario) {
        switch (computador) {
            case 1:
            System.out.println(usuario + " escolheu Pedra");
            break;
            case 2:
            System.out.println(usuario + " escolheu Papel");
            break;
            case 3: 
            System.out.println(usuario + " escolheu Tesoura");
            break;
            default:
            System.out.println("Opção inválida");
            break;
        }
    }
}