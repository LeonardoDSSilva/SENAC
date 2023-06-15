/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ldss.notepad;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ldss1
 */
public class Notepad {

    public static void main(String[] args) {

        //Define o padrão das janelas
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        TelaNotepad tela = new TelaNotepad();
        tela.setVisible(true);

    }
}
