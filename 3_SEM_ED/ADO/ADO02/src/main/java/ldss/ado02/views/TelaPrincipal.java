/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ldss.ado02.views;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

import ldss.ado02.models.Senha;

/**
 *
 * @author ldss1
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ArrayList<Senha> senhas = new ArrayList<Senha>();
    int chamadaNormal = 0;
    int chamadaPreferencial = 0;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btn_Normal = new javax.swing.JButton();
        btn_Preferencial = new javax.swing.JButton();
        lbl_Senha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_TempoEsperaPrevisto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_UltimaSenhaChamada = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Chamar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Normal = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Preferencial = new javax.swing.JTable();
        lbl_SenhaChamada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_Normal.setText("NORMAL");
        btn_Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NormalActionPerformed(evt);
            }
        });

        btn_Preferencial.setText("PREFERENCIAL");
        btn_Preferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PreferencialActionPerformed(evt);
            }
        });

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_Senha.setText("jLabel1");

        jLabel2.setText("SENHA:");

        jLabel3.setText("TEMPO DE ESPERA PREVISTO:");

        lbl_TempoEsperaPrevisto.setText("jLabel4");

        jLabel5.setText("ULTIMA SENHA CHAMADA:");

        lbl_UltimaSenhaChamada.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TempoEsperaPrevisto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(278, 278, 278))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Normal, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(btn_Preferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_UltimaSenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Senha)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_UltimaSenhaChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_TempoEsperaPrevisto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Preferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SENHA", jPanel1);

        btn_Chamar.setText("CHAMAR");
        btn_Chamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChamarActionPerformed(evt);
            }
        });

        tbl_Normal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SENHA", "TEMPO DE ESPERA"
            }
        ));
        jScrollPane1.setViewportView(tbl_Normal);

        tbl_Preferencial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SENHA", "TEMPO DE ESPERA"
            }
        ));
        jScrollPane3.setViewportView(tbl_Preferencial);

        lbl_SenhaChamada.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_SenhaChamada.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Chamar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_SenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Chamar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CHAMADA", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PreferencialActionPerformed(java.awt.event.ActionEvent evt) {
        int senhaPreferencial = senhas.stream().filter(s -> s.getTipoSenha().equals("PREFERENCIAL")).toArray().length;
        senhas.add(new Senha( String.format("P%04d", senhaPreferencial + 1), "PREFERENCIAL", LocalTime.now()));
        lbl_Senha.setText(senhas.get(senhas.size() - 1).getSenha());
        lbl_Senha.setForeground(new java.awt.Color(255, 0, 0));
        lbl_UltimaSenhaChamada.setText(senhas.get(senhas.size() - 1).getSenha());
    }

    private void btn_ChamarActionPerformed(java.awt.event.ActionEvent evt) {
        // int senhaNormal = senhas.stream().filter(s -> s.getTipoSenha().equals("NORMAL")).toArray().length;

        // Chama a senha preferencial a cada 5 senhas normais
        

        for (Senha senha : senhas) {
            if (senha.getTipoSenha().equals("NORMAL") && chamadaNormal == 4 ) {
                chamadaNormal ++;
                lbl_UltimaSenhaChamada.setText(senha.getSenha());
                lbl_UltimaSenhaChamada.setForeground(new java.awt.Color(255, 0, 0));
                break;
            } else {
                
                lbl_UltimaSenhaChamada.setText(senha.getSenha());
                lbl_UltimaSenhaChamada.setForeground(new java.awt.Color(0, 0, 0));
                chamadaNormal = 0;
            }

            long tempoEspera = senha.getHoraGeracao().until(LocalTime.now(), ChronoUnit.SECONDS);
            lbl_SenhaChamada.setText(senha.getSenha());
            if (senha.getTipoSenha().equals("NORMAL")) {
                lbl_SenhaChamada.setForeground(new java.awt.Color(0, 0, 0));
                ((javax.swing.table.DefaultTableModel) tbl_Normal.getModel()).addRow(new Object[] { senha.getSenha(), tempoEspera });
            } else {
                lbl_SenhaChamada.setForeground(new java.awt.Color(255, 0, 0));
                ((javax.swing.table.DefaultTableModel) tbl_Preferencial.getModel()).addRow(new Object[] { senha.getSenha(), tempoEspera });
            }
            senhas.remove(senha);
        }
        if (senhas.size() == 0) {
            lbl_SenhaChamada.setText("NÃO HÁ SENHAS");
            lbl_SenhaChamada.setForeground(new java.awt.Color(255, 0, 0));
    private String calcularTempoEspera(int quantSenhasChamadas) {

        int totalMinutos = 0;

        if (quantSenhasChamadas > 0) {
            for( int i = 0; i < quantSenhasChamadas; i++ ) {

                
                long tempoEspera = (long) tbl_Exibicao.getModel().getValueAt(i, 1);
                totalMinutos += tempoEspera;
            }
            long mediaMinutos = totalMinutos / quantSenhasChamadas;
            return String.format("%d minutos", totalMinutos > 0 ? totalMinutos : 0);
        }
        return "0 minutos";

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Chamar;
    private javax.swing.JButton btn_Normal;
    private javax.swing.JButton btn_Preferencial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_SenhaChamada;
    private javax.swing.JLabel lbl_TempoEsperaPrevisto;
    private javax.swing.JLabel lbl_UltimaSenhaChamada;
    private javax.swing.JTable tbl_Normal;
    private javax.swing.JTable tbl_Preferencial;
    // End of variables declaration//GEN-END:variables
}
