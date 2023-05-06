/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ldss.lojainformatica;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ldss1
 */
public class Lojainformatica {

    public static void main(String[] args) {
        //Define o padrão das janelas
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    System.out.println("Erro ao definir o padrão de janelas");
                }
            }
        }

        //Abre a tela principal
        new ldss.lojainformatica.view.TelaPrincipal().setVisible(true);

    }
}
