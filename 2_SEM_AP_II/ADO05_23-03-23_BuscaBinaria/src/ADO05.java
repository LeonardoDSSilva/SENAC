import java.util.Random;
import java.util.Scanner;

public class ADO05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        int[] vetor = new int[100];

        do{
            limparTela();
            carregaVetorAleatorio(vetor);
            exibeVetor(vetor);
            System.out.print("Qual o valor que deseja procurar? ");
            int valor = sc.nextInt();
            ordenarVetor(vetor);
            buscaBinaria(vetor, valor);
            System.out.println();
            System.out.println("Vetor ordenado: ");
            exibeVetor(vetor);
            
            System.out.println();
            System.out.print("Deseja continuar? (S/N) ");
        }while(scString.nextLine().toUpperCase().equals("S"));

        sc.close();
        scString.close();
    }

    private static void limparTela() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    private static void buscaBinaria(int[] vetor, int valor) {
        int inicio = 0, contador = 0;
        int fim = vetor.length - 1;
        int meio =  inicio + fim / 2;
        int posição = -1;
        
        while (inicio <= fim) {
            if (vetor[meio] == valor) {
                posição = meio;
                break;
            } else if (vetor[meio] < valor) inicio = meio + 1;
            else fim = meio - 1;
            meio = (inicio + fim) / 2;
            contador++;
        }
        if (posição != - 1) System.out.println("Valor encontrado na posição " + posição);
        else System.out.println("Valor não encontrado");
        System.out.println("Número de comparações: " + contador);
    }

    private static void ordenarVetor(int[] v) {
        int aux;
        boolean troca = true;
        for (int i = 0; i < v.length; i++) {
            troca = true;
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    troca = false;
                }
            }
            if (troca) break;
        }
    }

    private static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
        System.out.println();
    }

    private static void carregaVetorAleatorio(int[] vetor) {
        Random r = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(500);
        }
    }
}
