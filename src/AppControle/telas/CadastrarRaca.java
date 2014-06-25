package AppControle.telas;

import AppControle.beans.RacaBean;
import AppControle.dao.RacaDAO;
import AppControle.util.UtilInterface;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago Carlos
 */
public class CadastrarRaca extends javax.swing.JFrame {

    private RacaDAO daoRaca;
    private int id = 0;
    private String nomeCid = "";

    public CadastrarRaca() {
        initComponents();
        ImageIcon icone = new ImageIcon(new ImageIcon().getClass().getResource("/AppControle/util/boi.png"));
        this.setIconImage(icone.getImage());
        try {
            daoRaca = new RacaDAO();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "ERRO!!Banco indisponivel ");
        }
        atualizarTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txNomeRaca = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnexcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Raça");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome Da Raca");
        jLabel1.setName("jLabel1"); // NOI18N

        txNomeRaca.setName("txNomeRaca"); // NOI18N
        txNomeRaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomeRacaKeyTyped(evt);
            }
        });

        btnsalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/salvar.png"))); // NOI18N
        btnsalvar.setText("Cadastrar");
        btnsalvar.setName("btnsalvar"); // NOI18N
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        btnexcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/delete.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setName("btnexcluir"); // NOI18N
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setName("jPanel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME DA RAÇA"
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setName("jLabel2"); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/editar.png"))); // NOI18N
        btnAlterar.setText("alterar");
        btnAlterar.setName("btnAlterar"); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/boi.png"))); // NOI18N
        jLabel3.setName("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnexcluir)
                                .addGap(10, 10, 10)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txNomeRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(jScrollPane3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txNomeRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-559)/2, (screenSize.height-469)/2, 559, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if (validaCampos()) {
            Toolkit.getDefaultToolkit().beep();
            try {
                daoRaca.inserir(preencheObjeto());
                UtilInterface.msgSucesso("Adicionado com Sucesso!");
                atualizarTabela();
            } catch (SQLException e) {
                if (e.getMessage().startsWith("Duplicate entry")) {
                    JOptionPane.showMessageDialog(this, "Tipo duplicado", "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro\n\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private boolean validaCampos() {
        boolean aux = true;
        String msg = "Campos obrigatórios:\n";
        if (txNomeRaca.getText().trim().equals(null) || txNomeRaca.getText().trim().equals("")) {
            aux = false;
            msg += "Nome Raça;\n";
        }
        if (!aux) {
            msg += "\nPreencha Corretamente os Campos!";
            UtilInterface.msgErro(msg);
        }

        return aux;
    }

    private void preencherCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        id = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        nomeCid = modelo.getValueAt(tabela.getSelectedRow(), 1).toString();


        txNomeRaca.setText( nomeCid );



        btnsalvar.setEnabled(true);
        btnexcluir.setEnabled(true);

    }

    private void limparCampos() {
        txNomeRaca.setText(null);

    }
    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
                Toolkit.getDefaultToolkit().beep();
        int linha = this.tabela.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showConfirmDialog(null, "Selecione a raça " + id, "ALERTA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            return;
        }

        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o animal: " + id, "Confirmação de Exclusão!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            try {
                daoRaca.remove(Integer.parseInt(tabela.getModel().getValueAt(linha, 0).toString()));
                UtilInterface.msgSucesso("a Raça " + nomeCid.trim() + " foi excluida com sucesso!");
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


    }//GEN-LAST:event_btnexcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              Toolkit.getDefaultToolkit().beep();
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair do Cadastro de Raças: ", "Confirmação de saida!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txNomeRacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeRacaKeyTyped
     String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(",") && txNomeRaca.getText().indexOf(",") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }

        if (txNomeRaca.getText().length() == 20) {
            evt.consume();



        }
        String permitido = "QWERTYUIOPASDFGHJKLÇZXCVBNM~qwertyuiop´~çlkjhgfdsazxcvbnm,.;^";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }        // TODO add your handling code here:
        if (txNomeRaca.getText().length() == 19) {
            evt.consume();
        }



    }//GEN-LAST:event_txNomeRacaKeyTyped

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Toolkit.getDefaultToolkit().beep();
        if (txNomeRaca.getText().trim().equals("")) {
            UtilInterface.msgInformação("DIGITE O NOME!!!");
            txNomeRaca.requestFocus();
            return;
        }
        
          try {

         daoRaca.altera(preencheObjeto());
         txNomeRaca.setText("");
          JOptionPane.showMessageDialog(this, "Alterado ");
         atualizarTabela();
     } catch (SQLException e) {
         if (e.getMessage().startsWith("Duplicate entry")) {
             JOptionPane.showMessageDialog(this, "Tipo duplicado", "ERRO", JOptionPane.ERROR_MESSAGE);
         } else {
             JOptionPane.showMessageDialog(this, "Erro\n\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
         }
     }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        preencherCampos();
    }//GEN-LAST:event_tabelaMouseClicked
    private RacaBean preencheObjeto() {
        RacaBean rb = new RacaBean();
        rb.setCodRaca(id);
        rb.setNomeRaca(txNomeRaca.getText().trim());
        return rb;
    }

    private void atualizarTabela() {
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        RacaBean rb;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            List<RacaBean> listaRaca = daoRaca.getLista("");
            for (int i = 0; i < listaRaca.size(); i++) {
                rb = new RacaBean();
                rb = listaRaca.get(i);
                modelo.addRow(new Object[]{
                            rb.getCodRaca(),
                            rb.getNomeRaca()
                        });

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastrarRaca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txNomeRaca;
    // End of variables declaration//GEN-END:variables
}
