/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ldss1
 */
package ldss.notepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TelaNotepad extends javax.swing.JFrame {

    /**
     * Creates new form TelaNotepad
     */
    Arquivo arquivo = new Arquivo();

    public TelaNotepad() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mni_Novo = new javax.swing.JMenuItem();
        mni_Abrir = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mni_Salvar = new javax.swing.JMenuItem();
        mni_SalvarComo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mni_Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mni_Copiar = new javax.swing.JMenuItem();
        mni_Colar = new javax.swing.JMenuItem();
        mni_Recortar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mni_SelecionarTudo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mni_Sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOTEPAD");

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        areaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaTextoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(areaTexto);

        jMenu1.setText("Arquivo");

        mni_Novo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Novo.setText("Novo");
        mni_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_NovoActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Novo);

        mni_Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Abrir.setText("Abrir");
        mni_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Abrir);
        jMenu1.add(jSeparator3);

        mni_Salvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Salvar.setText("Salvar");
        mni_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_SalvarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Salvar);

        mni_SalvarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_SalvarComo.setText("Salvar Como");
        mni_SalvarComo.setEnabled(false);
        mni_SalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_SalvarComoActionPerformed(evt);
            }
        });
        jMenu1.add(mni_SalvarComo);
        jMenu1.add(jSeparator2);

        mni_Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Sair.setText("Sair");
        mni_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_SairActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        mni_Copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Copiar.setText("Copiar");
        mni_Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_CopiarActionPerformed(evt);
            }
        });
        jMenu2.add(mni_Copiar);

        mni_Colar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Colar.setText("Colar");
        mni_Colar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_ColarActionPerformed(evt);
            }
        });
        jMenu2.add(mni_Colar);

        mni_Recortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Recortar.setText("Recortar");
        mni_Recortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_RecortarActionPerformed(evt);
            }
        });
        jMenu2.add(mni_Recortar);
        jMenu2.add(jSeparator1);

        mni_SelecionarTudo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_SelecionarTudo.setText("Selecionar Tudo");
        mni_SelecionarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_SelecionarTudoActionPerformed(evt);
            }
        });
        jMenu2.add(mni_SelecionarTudo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        mni_Sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mni_Sobre.setText("Sobre");
        mni_Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_SobreActionPerformed(evt);
            }
        });
        jMenu3.add(mni_Sobre);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_CopiarActionPerformed
        // TODO add your handling code here:
        areaTexto.copy();
    }//GEN-LAST:event_mni_CopiarActionPerformed

    private void mni_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_AbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser selecaoArquivo = new JFileChooser();
        selecaoArquivo.setDialogTitle("Abrir Arquivo");
        selecaoArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos de texto", "txt"));

        selecaoArquivo.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos de texto (.txt) ", "txt"));
        selecaoArquivo.setMultiSelectionEnabled(false);
        selecaoArquivo.setAcceptAllFileFilterUsed(false);

        int retorno = selecaoArquivo.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = selecaoArquivo.getSelectedFile().getAbsolutePath();
            String nome = selecaoArquivo.getSelectedFile().getName();
            String caminho = selecaoArquivo.getSelectedFile().getParent();
            this.setTitle(nome);

            arquivo.setNome(nome);
            arquivo.setCaminho(caminho);
            mni_SalvarComo.setEnabled(true);

            try {
                FileReader arquivo = new FileReader(nomeArquivo);
                BufferedReader lerArquivo = new BufferedReader(arquivo);

                String linha = lerArquivo.readLine();
                while (linha != null) {
                    areaTexto.append(linha + "\n");
                    linha = lerArquivo.readLine();
                }
                lerArquivo.close();
            } catch (IOException ex) {
                System.out.println("Erro ao ler arquivo");
            }
        }
    }//GEN-LAST:event_mni_AbrirActionPerformed

    private void mni_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_SairActionPerformed
        // TODO add your handling code here:
        // Verifica se o arquivo foi salvo
        if (arquivo.getAlterado()) {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja salvar o arquivo?");

            if (opcao == JOptionPane.YES_OPTION) {
                if (arquivo.getCaminho() != null) {
                    mni_SalvarActionPerformed(evt);
                } else {
                    mni_SalvarComoActionPerformed(evt);
                }
            }
        }
        System.exit(0);
    }//GEN-LAST:event_mni_SairActionPerformed

    private void mni_SalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_SalvarComoActionPerformed
        // TODO add your handling code here:
        JFileChooser selecaoArquivo = new JFileChooser();
        selecaoArquivo.setDialogTitle("Salvar Arquivo");
        selecaoArquivo.setApproveButtonText("Salvar");
        selecaoArquivo.setApproveButtonToolTipText("Salvar");
        selecaoArquivo.setDialogType(JFileChooser.SAVE_DIALOG);
        selecaoArquivo.setCurrentDirectory(arquivo.getCaminho() != null ? new File(arquivo.getCaminho()) : new File(System.getProperty("user.home")));

        selecaoArquivo.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos de texto (.txt) ", "txt"));
        selecaoArquivo.setAcceptAllFileFilterUsed(false);

        int retorno = selecaoArquivo.showSaveDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = selecaoArquivo.getSelectedFile().getAbsolutePath();

            // Verifica se o arquivo existe e se o usuário deseja sobrescrever
            if (new File(nomeArquivo).exists()) {
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja sobrescrever o arquivo?", "Arquivo já existe", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.NO_OPTION) {
                    mni_SalvarComoActionPerformed(evt);
                }
            }
            try {

                FileWriter arquivo1 = new FileWriter(nomeArquivo + ".txt");
                BufferedWriter escreverArquivo = new BufferedWriter(arquivo1);

                escreverArquivo.write(areaTexto.getText());
                escreverArquivo.close();
                mni_SalvarComo.setEnabled(true);
                arquivo.setAlterado(false);

            } catch (IOException ex) {
                System.out.println("Erro ao escrever arquivo");
            }
        }

        // fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos de texto", "txt"));

    }//GEN-LAST:event_mni_SalvarComoActionPerformed

    private void mni_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_SalvarActionPerformed
        // TODO add your handling code here:
        // Verifica se tem algum conteudo no areaTexto
        if (areaTexto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há conteúdo para salvar", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            // Verifica se o arquivo já foi salvo
            if (arquivo.getNome() == null) {
                mni_SalvarComoActionPerformed(evt);
            } else {
                try {
                    FileWriter arquivo1 = new FileWriter(arquivo.getCaminho() + "\\" + arquivo.getNome());
                    BufferedWriter escreverArquivo = new BufferedWriter(arquivo1);

                    escreverArquivo.write(areaTexto.getText());
                    escreverArquivo.close();
                    mni_SalvarComo.setEnabled(true);
                    arquivo.setAlterado(false);
                } catch (IOException ex) {
                    System.out.println("Erro ao escrever arquivo");
                }
            }
        }

    }//GEN-LAST:event_mni_SalvarActionPerformed

    private void areaTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoKeyPressed
        // TODO add your handling code here:
        arquivo.setAlterado(true);
    }//GEN-LAST:event_areaTextoKeyPressed

    private void mni_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_NovoActionPerformed
        // TODO add your handling code here:
        if (arquivo.getAlterado()) {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja salvar o arquivo?");

            if (opcao == JOptionPane.YES_OPTION) {
                if (arquivo.getCaminho() != null) {
                    mni_SalvarActionPerformed(evt);
                } else {
                    mni_SalvarComoActionPerformed(evt);
                }
            }
        }
        areaTexto.setText("");
    }//GEN-LAST:event_mni_NovoActionPerformed

    private void mni_ColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_ColarActionPerformed
        // TODO add your handling code here:
        areaTexto.paste();
    }//GEN-LAST:event_mni_ColarActionPerformed

    private void mni_RecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_RecortarActionPerformed
        // TODO add your handling code here:
        areaTexto.cut();
    }//GEN-LAST:event_mni_RecortarActionPerformed

    private void mni_SelecionarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_SelecionarTudoActionPerformed
        // TODO add your handling code here:
        areaTexto.selectAll();
    }//GEN-LAST:event_mni_SelecionarTudoActionPerformed

    private void mni_SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_SobreActionPerformed
        // TODO add your handling code here:
        String descricao = "O App é um editor de texto simples, que permite ao usuário criar, editar e salvar arquivos de texto."
                + "\n\n"
                + "Desenvolvido por: Leonardo Silva"
                + "\n versão: 1.0";
        JOptionPane.showMessageDialog(this, descricao, "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mni_SobreActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mni_Abrir;
    private javax.swing.JMenuItem mni_Colar;
    private javax.swing.JMenuItem mni_Copiar;
    private javax.swing.JMenuItem mni_Novo;
    private javax.swing.JMenuItem mni_Recortar;
    private javax.swing.JMenuItem mni_Sair;
    private javax.swing.JMenuItem mni_Salvar;
    private javax.swing.JMenuItem mni_SalvarComo;
    private javax.swing.JMenuItem mni_SelecionarTudo;
    private javax.swing.JMenuItem mni_Sobre;
    // End of variables declaration//GEN-END:variables
}
