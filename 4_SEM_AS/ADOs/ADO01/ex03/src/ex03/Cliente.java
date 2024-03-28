/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.Scanner;

import ordenacao.Ordenacao;
import ordenacao.Vetor;

/**
 *
 * @author ldss1
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tipo de ordenacao que deseja: ");
        System.out.println("1 - Insertion Sort");
        System.out.println("2 - Bubble Sort");
        System.out.println("3 - Selection Sort");
        System.out.print("Opcao: ");
        int tipo = sc.nextInt();
        
        try {
            Vetor vetor = new Vetor();
            System.out.print("Vetor original: ");
            System.out.println(vetor);

            // Desing Pattern Strategy
            vetor.setVetor(Ordenacao.values()[tipo-1].ordenar(vetor.getVetor()));
            System.out.print("Vetor ordenado: ");
            System.out.println(vetor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Opcao invalida");
        }

        sc.close();


    }
    
}
