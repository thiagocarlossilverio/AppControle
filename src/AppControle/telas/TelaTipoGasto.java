/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaTipoGasto.java
 *
 * Created on 12/11/2010, 10:36:10
 */
package AppControle.telas;

import AppControle.beans.TipoGastoBean;
import java.util.List;
import AppControle.util.UtilInterface;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import AppControle.beans.GastoBean;
import AppControle.dao.TipoGastoDAO;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago Carlos
 */
public class TelaTipoGasto extends javax.swing.JFrame {

    private TipoGastoDAO daoGasto;
    private int id = 0;
    private String nomeCid = "";
    private boolean salvar;


    public TelaTipoGasto() {
        initComponents();
        ImageIcon icone = new ImageIcon(new ImageIcon().getClass().getResource("/AppControle/util/boi.png"));
        this.setIconImage(icone.getImage());
        try {
            daoGasto = new TipoGastoDAO();
        } catch (SQLException ex) {
            UtilInterface.msgErro("Erro: " + ex.getMessage());
        }

        atualizarTabela();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txNomeDescricao = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnexcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TIPO DE GASTO");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome Do Gasto");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 56, -1, -1));

        txNomeDescricao.setName("txNomeDescricao"); // NOI18N
        txNomeDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomeDescricaoKeyTyped(evt);
            }
        });
        getContentPane().add(txNomeDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 84, 320, 31));

        btnsalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/salvar.png"))); // NOI18N
        btnsalvar.setText("Cadastrar");
        btnsalvar.setName("btnsalvar"); // NOI18N
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 213, -1, -1));

        btnexcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/delete.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setName("btnexcluir"); // NOI18N
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 114, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setName("jPanel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição do gasto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setName("tabela"); // NOI18N
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 500, 173));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 30));

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/editar.png"))); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.setName("btnAlterar"); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 31));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-530)/2, (screenSize.height-456)/2, 530, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        Toolkit.getDefaultToolkit().beep();
        if (txNomeDescricao.getText().trim().equals("")) {
            UtilInterface.msgInformação("DIGITE O NOME!!!");
            txNomeDescricao.requestFocus();
            return; // pára o processamento
        }

        try {
            daoGasto.inserir(preencheObjeto());
            UtilInterface.msgSucesso("Adicionado com Sucesso!");
            txNomeDescricao.setText("");
            atualizarTabela();
        } catch (SQLException e) {
            if (e.getMessage().startsWith("Duplicate entry")) {
                JOptionPane.showMessageDialog(this, "Tipo duplicado", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro\n\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnsalvarActionPerformed
    private void preencherCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        id = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        nomeCid = modelo.getValueAt(tabela.getSelectedRow(), 1).toString();
        txNomeDescricao.setText(nomeCid);
        txNomeDescricao.setEnabled(true);
        btnsalvar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnexcluir.setEnabled(true);


    }

    private void limparCampos() {
        txNomeDescricao.setText(null);
        atualizarTabela();
    }
    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
                Toolkit.getDefaultToolkit().beep();
        int linha = this.tabela.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showConfirmDialog(null, "Selecione O Gasto " + id, "ALERTA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            return;
        }

        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Gasto: " + id, "Confirmação de Exclusão!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            try {
                daoGasto.remove(Integer.parseInt(tabela.getModel().getValueAt(linha, 0).toString()));
                UtilInterface.msgSucesso("O Gasto " + nomeCid.trim() + " foi excluida com sucesso!");
                atualizarTabela();
                limparCampos();

            } catch (SQLException e) {
                e.getMessage();
                e.printStackTrace();
                atualizarTabela();
            }
        }
    }

    private TipoGastoBean preencheObjeto() {
        TipoGastoBean gb = new TipoGastoBean();
        gb.setCodTipoGasto(id);
        gb.setNomeGasto(txNomeDescricao.getText().trim());
        return gb;
    }

    private void atualizarTabela() {
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        TipoGastoBean gb;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            List<TipoGastoBean> listaGasto = daoGasto.getLista("");
            for (int i = 0; i < listaGasto.size(); i++) {
                gb = new TipoGastoBean();
                gb = listaGasto.get(i);
                modelo.addRow(new Object[]{
                            gb.getCodTipoGasto(),
                            gb.getNomeGasto()
                        });

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnexcluirActionPerformed

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Toolkit.getDefaultToolkit().beep();
     int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair ?", "Confirmação de Saída!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

     if (opc == JOptionPane.YES_OPTION) {
         dispose();
     }
 }//GEN-LAST:event_jButton1ActionPerformed

 private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
     preencherCampos();
     btnexcluir(true);
 }//GEN-LAST:event_tabelaMouseClicked

 private void txNomeDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeDescricaoKeyTyped
     String letra = String.valueOf(evt.getKeyChar());

     if (txNomeDescricao.getText().length() == 25) {
         evt.consume();
     }

     String permitido = " abcdefghijklmnopqrstuvwxyzçáéíóúâôãõABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚÂÊÔÃÕÇ";

     if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
         evt.consume();
     }
 }//GEN-LAST:event_txNomeDescricaoKeyTyped

 private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

     Toolkit.getDefaultToolkit().beep();
     if (txNomeDescricao.getText().trim().equals("")) {
         UtilInterface.msgInformação("DIGITE O NOME!!!");
         txNomeDescricao.requestFocus();
         return; // pára o processamento
     }

     try {

         daoGasto.altera(preencheObjeto());
         txNomeDescricao.setText("");
         UtilInterface.msgSucesso("Alterado com Sucesso!");
         atualizarTabela();
     } catch (SQLException e) {
         if (e.getMessage().startsWith("Duplicate entry")) {
             JOptionPane.showMessageDialog(this, "Tipo duplicado", "ERRO", JOptionPane.ERROR_MESSAGE);
         } else {
             JOptionPane.showMessageDialog(this, "Erro\n\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
         }
     }

     btnsalvar.setEnabled(false);
     btnexcluir.setEnabled(true);
     btnAlterar.setEnabled(false);



}//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new TelaTipoGasto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txNomeDescricao;
    // End of variables declaration//GEN-END:variables

    private void btnexcluir(boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
