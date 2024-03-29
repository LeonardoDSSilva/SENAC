/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ldss.lojainformatica.view;

import java.awt.Color;

import javax.swing.JOptionPane;

import ldss.lojainformatica.DAO.ComputadorDAO;
import ldss.lojainformatica.model.Computador;

/**
 *
 * @author ldss1
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Computador computador;

    public TelaCadastro() {
        initComponents();
    }

    public TelaCadastro(Computador computador) {
        initComponents();

        setTitle("Atualizar Computador");
        btn_Adicionar.setText("Atualizar");

        txt_Marca.setText(computador.getMarca());
        cmb_HD.setSelectedItem(computador.getHd());

        tgl_AMD.setSelected(computador.getProcessador().equals("AMD"));
        tgl_Apple.setSelected(computador.getProcessador().equals("APPLE SILICON"));
        tgl_Intel.setSelected(computador.getProcessador().equals("INTEL"));
        tgl_Qualcomm.setSelected(computador.getProcessador().equals("QUALCOMM"));

        this.computador = computador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgp_Processador = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Marca = new javax.swing.JTextField();
        cmb_HD = new javax.swing.JComboBox<>();
        btn_Adicionar = new javax.swing.JButton();
        pnl_Processador = new javax.swing.JPanel();
        tgl_AMD = new javax.swing.JToggleButton();
        tgl_Apple = new javax.swing.JToggleButton();
        tgl_Intel = new javax.swing.JToggleButton();
        tgl_Qualcomm = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Computador");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setText("MARCA");

        jLabel2.setText("HD");

        txt_Marca.setText("Leonardo Silva");
        txt_Marca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_MarcaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_MarcaFocusLost(evt);
            }
        });

        cmb_HD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo de HD...", "HDD 512GB", "HDD 1TB", "SSD 256GB", "SSD 512GB", "SSD 1TB" }));

        btn_Adicionar.setText("Inserir");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        pnl_Processador.setBorder(javax.swing.BorderFactory.createTitledBorder("PROCESSADOR"));
        pnl_Processador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bgp_Processador.add(tgl_AMD);
        tgl_AMD.setText("AMD");
        tgl_AMD.setActionCommand("AMD");

        bgp_Processador.add(tgl_Apple);
        tgl_Apple.setText("APPLE SILICON");
        tgl_Apple.setActionCommand("APPLE SILICON");

        bgp_Processador.add(tgl_Intel);
        tgl_Intel.setText("INTEL");
        tgl_Intel.setActionCommand("INTEL");

        bgp_Processador.add(tgl_Qualcomm);
        tgl_Qualcomm.setText("QUALCOMM");
        tgl_Qualcomm.setActionCommand("QUALCOMM");

        javax.swing.GroupLayout pnl_ProcessadorLayout = new javax.swing.GroupLayout(pnl_Processador);
        pnl_Processador.setLayout(pnl_ProcessadorLayout);
        pnl_ProcessadorLayout.setHorizontalGroup(
            pnl_ProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tgl_AMD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl_Apple, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl_Intel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl_Qualcomm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ProcessadorLayout.setVerticalGroup(
            pnl_ProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgl_AMD)
                    .addComponent(tgl_Apple)
                    .addComponent(tgl_Intel)
                    .addComponent(tgl_Qualcomm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Adicionar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_Processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(15, 15, 15)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Marca)
                                .addComponent(cmb_HD, 0, 296, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnl_Processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Adicionar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        // TODO add your handling code here:

        Boolean retorno = false;
        String avisos = "";
        String processador = "";
        String marca = txt_Marca.getText();
        String hd = cmb_HD.getSelectedItem().toString();

        if (computador == null) {
            if (bgp_Processador.getSelection() != null) {
                processador = bgp_Processador.getSelection().getActionCommand();
                pnl_Processador.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.lightGray, 1, true), "PROCESSADOR"));
            } else {
                avisos += "Selecione um processador!\n";
                pnl_Processador.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.red, 1, true), "PROCESSADOR"));
            }

            if (marca.isEmpty() || hd == "Selecione um tipo de HD..." || processador.isEmpty()) {
                if (marca.isEmpty()) {
                    txt_Marca.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                    avisos += "Preencha o campo marca!\n";
                } else {
                    txt_Marca.setBorder(javax.swing.BorderFactory.createLineBorder(Color.lightGray));
                }
                if (hd == "Selecione um tipo de HD...") {
                    avisos += "Selecione um tipo de HD!\n";
                    cmb_HD.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                } else {
                    cmb_HD.setBorder(javax.swing.BorderFactory.createLineBorder(Color.lightGray));
                }
                if (!avisos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, avisos, "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {

                Computador objComputador = new Computador(marca, hd, processador);

                retorno = ComputadorDAO.inserirComputador(objComputador);

                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Computador cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    TelaPrincipal.carregarTabela(ComputadorDAO.listarComputadores());
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar computador!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (computador != null) {
            if (bgp_Processador.getSelection() != null) {
                processador = bgp_Processador.getSelection().getActionCommand();
                pnl_Processador.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.lightGray, 1, true), "PROCESSADOR"));
            } else {
                avisos += "Selecione um processador!\n";
                pnl_Processador.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.red, 1, true), "PROCESSADOR"));
            }

            if (marca.isEmpty() || hd == "Selecione um tipo de HD..." || processador.isEmpty()) {
                if (marca.isEmpty()) {
                    txt_Marca.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                    avisos += "Preencha o campo marca!\n";
                } else {
                    txt_Marca.setBorder(javax.swing.BorderFactory.createLineBorder(Color.lightGray));
                }
                if (hd == "Selecione um tipo de HD...") {
                    avisos += "Selecione um tipo de HD!\n";
                    cmb_HD.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                } else {
                    cmb_HD.setBorder(javax.swing.BorderFactory.createLineBorder(Color.lightGray));
                }
                if (!avisos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, avisos, "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {

                computador.setMarca(marca);
                computador.setHd(hd);
                computador.setProcessador(processador);

                retorno = ComputadorDAO.atualizarComputador(computador);

                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Computador atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    TelaPrincipal.carregarTabela(ComputadorDAO.listarComputadores());
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar computador!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void txt_MarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_MarcaFocusGained
        // TODO add your handling code here:
        if (txt_Marca.getText().equals("Leonardo Silva"))
            txt_Marca.setText("");
    }//GEN-LAST:event_txt_MarcaFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txt_MarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_MarcaFocusLost
        // TODO add your handling code here:
        if (txt_Marca.getText().equals(""))
            txt_Marca.setText("Leonardo Silva");
    }//GEN-LAST:event_txt_MarcaFocusLost

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgp_Processador;
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JComboBox<String> cmb_HD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl_Processador;
    private javax.swing.JToggleButton tgl_AMD;
    private javax.swing.JToggleButton tgl_Apple;
    private javax.swing.JToggleButton tgl_Intel;
    private javax.swing.JToggleButton tgl_Qualcomm;
    private javax.swing.JTextField txt_Marca;
    // End of variables declaration//GEN-END:variables
}
