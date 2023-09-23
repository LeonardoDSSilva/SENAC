package ldss.ado02;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UnsupportedLookAndFeelException;
import ldss.ado02.views.TelaPrincipal;


/**
 *
 * @author ldss1
 */
public class ADO02 {

    public static void main(String[] args) {
        //Define o padrão das janelas
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(ADO02.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
