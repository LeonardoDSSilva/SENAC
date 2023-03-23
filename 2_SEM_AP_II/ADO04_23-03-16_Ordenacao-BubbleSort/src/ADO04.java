import java.util.Random;
import java.util.Scanner;

public class ADO04 {
    public static void main(String[] args) throws Exception {
        Scanner scNum = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        do{
            int v[] = new int[10];
            
            limparTela();
            System.out.print("Qual valor deseja buscar? ");
            int num = scNum.nextInt();

            preencherVetor(v);
            System.out.println("Vetor original:");
            imprimirVetor(v);

            System.out.println("Vetor ordenado:");
            ordenarVetor(v);
            imprimirVetor(v);

            buscarValor(v, num);

            System.out.print("Deseja continuar? (S/N) ");
        } while (scStr.nextLine().toUpperCase().equals("S"));
        limparTela();
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    private static void buscarValor(int[] v, int num) {
        int pos = -1, cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                pos = i + 1;
                break;
            }
            cont ++;
        }
        if (pos == -1) {
            System.out.println("Valor não encontrado!");
        } else {
            System.out.println("Valor encontrado na posição " + pos);
        }
        System.out.println("Número de comparações: " + cont);
        System.out.println();
    }

    private static void ordenarVetor(int[] v) {
        int aux, contador = 0;
        boolean troca = true;
        for (int i = 0; i < v.length; i++) {
            troca = true;
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    troca = false;
                    contador ++;
                }
            }
            if (troca) break;
        }
        
        System.out.println("Número de comparações: " + contador);
    }

    private static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
        System.out.println();
    }

    private static void preencherVetor(int[] v) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(100);
        }
    }
}
