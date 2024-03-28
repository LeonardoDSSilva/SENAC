/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ldss.ex02;

/**
 *
 * @author ldss1
 */
public class Ex02 extends Thread {

    public static void main(String[] args) {
        // Instanciando a classe Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Verificando se as instâncias são iguais
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(s1 == s2);
        
    }
}
