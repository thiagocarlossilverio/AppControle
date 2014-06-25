/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaGasto.java
 *
 * Created on 24/10/2010, 14:45:33
 */
package AppControle.telas;

import AppControle.beans.GastoBean;
import AppControle.beans.TipoGastoBean;
import AppControle.dao.GastoDao;
import AppControle.util.UtilInterface;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.util.List;
import AppControle.dao.TipoGastoDAO;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Thiago Carlos
 */
public class TelaGasto extends javax.swing.JFrame {

    private GastoDao daoGasto;
    private int id = -1;
    private String nomeCid = "";
    private List<TipoGastoBean> listaGasto;
    private TipoGastoDAO TipoGastodao;

    public TelaGasto() {
        initComponents();
        ImageIcon icone = new ImageIcon(new ImageIcon().getClass().getResource("/AppControle/util/boi.png"));
        this.setIconImage(icone.getImage());
        try {
            daoGasto = new GastoDao();
            TipoGastodao = new TipoGastoDAO();
        } catch (SQLException ex) {
            UtilInterface.msgErro("Erro: " + ex.getMessage());
        }
        txData.setFormats("dd/MM/yyyy");
        txData.getEditor().setEditable(false);
        txData.getEditor().setBackground(Color.WHITE);

        atualizarTabela();
        setLocationRelativeTo(null);
        atualizaCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txcodAnimal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cbTipoGasto = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txData = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Gastos");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Nº ANIMAL");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Descri.Gastos");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Dt.Gasto");
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txcodAnimal.setName("txcodAnimal"); // NOI18N
        txcodAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcodAnimalActionPerformed(evt);
            }
        });
        txcodAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcodAnimalKeyTyped(evt);
            }
        });
        getContentPane().add(txcodAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 322, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("VALOR");
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        txValor.setName("txValor"); // NOI18N
        txValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txValorKeyTyped(evt);
            }
        });
        getContentPane().add(txValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 106, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText(".R$");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.setName("jPanel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 670, -1));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero animal", "Valor da Compra", "Tipo Do Gasto", "Data do Gasto"
            }
        ));
        tabela.setName("tabela"); // NOI18N
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1040, 158));

        cbTipoGasto.setName("cbTipoGasto"); // NOI18N
        getContentPane().add(cbTipoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 320, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\AppControle\\Imagens\\Gastos.jpg")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 360, 280));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setName("jPanel1"); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\AppControle\\Imagens\\salvar.png")); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnAlterar.setIcon(new javax.swing.ImageIcon("C:\\AppControle\\Imagens\\editar.png")); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.setName("btnAlterar"); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\AppControle\\Imagens\\delete.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\AppControle\\Imagens\\cancelar.png")); // NOI18N
        jButton1.setText("Sair");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 530, 50));

        txData.setName("txData"); // NOI18N
        getContentPane().add(txData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 310, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizaCombo() {
        cbTipoGasto.removeAllItems();
        cbTipoGasto.addItem("<SELECIONE UM TIPO DE GASTO>");

        try {
            listaGasto = TipoGastodao.getLista("");

            for (TipoGastoBean cb : listaGasto) {
                cbTipoGasto.addItem(cb.getNomeGasto());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro na lista!!!\n\n" + e.getMessage());
        }
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                    Toolkit.getDefaultToolkit().beep();
        btnSalvar.setEnabled(false);
        btnAlterar.setEnabled(true);
        if (txcodAnimal.getText().trim().equals("")) {
            UtilInterface.msgInformação("DIGITE O NUMERO DO ANIMAL!!!");
            txcodAnimal.requestFocus();
            return;
        }
        try {
            if (id == -1) {
                daoGasto.inserir(preencheObjeto());
                UtilInterface.msgSucesso("Adicionado com Sucesso!");
            } else {
                daoGasto.altera(preencheObjeto());
                UtilInterface.msgSucesso("alterado com Sucesso!");
            }

            atualizarTabela();
            limparCampos();
        } catch (SQLException e) {
            if (e.getMessage().startsWith("Duplicate entry")) {
                JOptionPane.showMessageDialog(this, "Tipo duplicado", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro\n\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
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

            } catch (Exception e) {
                if (e.getMessage().startsWith("Cannot delete or update a parent row:")) {
                    JOptionPane.showMessageDialog(this, "Erro de Integridade!\n Exclusão Não Executada", "ERRO", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro Inesperado\n" + e.getMessage(), "ERRO", 0);
                }
            }
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
  preencherCampos();
 
    }//GEN-LAST:event_tabelaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             Toolkit.getDefaultToolkit().beep();
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair do Cadastro de Gasto: ", "Confirmação de saida!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
                Toolkit.getDefaultToolkit().beep();
        enableCampos(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txcodAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcodAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcodAnimalActionPerformed

    private void txcodAnimalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcodAnimalKeyTyped
        String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(",") && txcodAnimal.getText().indexOf(",") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (letra.equals(" ") && txcodAnimal.getText().indexOf(" ") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (txcodAnimal.getText().length() == 9) {
            evt.consume();
        }
        String permitido = "0123456789.,";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo

            evt.consume();
        }
    }//GEN-LAST:event_txcodAnimalKeyTyped

    private void txValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txValorKeyTyped
String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(",") && txValor.getText().indexOf(",") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (letra.equals(" ") && txValor.getText().indexOf(" ") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (txValor.getText().length() == 7) {
            evt.consume();



        }
        String permitido = "0123456789,.";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }
    }//GEN-LAST:event_txValorKeyTyped

    private GastoBean preencheObjeto() {

        GastoBean gb = new GastoBean();
        gb.setTipoGasto(this.listaGasto.get(this.cbTipoGasto.getSelectedIndex() - 1));
        gb.setDataGasto(Date.valueOf(UtilInterface.dataParaSQL(txData.getEditor().getText().trim())));
        gb.setValorGasto(Double.valueOf(txValor.getText().trim()));
        gb.setCodAnimal(Integer.parseInt(txcodAnimal.getText().trim()));
        return gb;
    }

    private void enableCampos(boolean cont) {
        txcodAnimal.setEnabled(cont);
        txData.setEnabled(cont);
        txValor.setEnabled(cont);
        btnExcluir.setEnabled(cont);
        btnSalvar.setEnabled(cont);
    }

    private void atualizarTabela() {

        GastoBean gb;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            List<GastoBean> listaGasto = daoGasto.getLista("");
            for (int i = 0; i < listaGasto.size(); i++) {
                gb = new GastoBean();
                gb = listaGasto.get(i);
                modelo.addRow(new Object[]{
                            gb.getCodAnimal(),
                            gb.getValorGasto(),
                            gb.getTipoGasto().getNomeGasto(),
                            gb.getDataGasto().toString()
                        });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void preencherCampos() {
        enableCampos(false);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        id = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        String data = modelo.getValueAt(tabela.getSelectedRow(), 3).toString();
        String valor = modelo.getValueAt(tabela.getSelectedRow(), 1).toString();
        String tipogasto = modelo.getValueAt(tabela.getSelectedRow(), 2).toString();
        txcodAnimal.setText(id + "");
        txData.getEditor().setText(modelo.getValueAt(tabela.getSelectedRow(), 3).toString());
        cbTipoGasto.setSelectedItem(tipogasto);
        txValor.setText(valor);
    }

    private void limparCampos() {
        txData.getEditor();
        txValor.setText(null);
        txcodAnimal.setText(null);
        atualizarTabela();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaGasto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbTipoGasto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private org.jdesktop.swingx.JXDatePicker txData;
    private javax.swing.JTextField txValor;
    private javax.swing.JTextField txcodAnimal;
    // End of variables declaration//GEN-END:variables

}
