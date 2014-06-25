/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaAnimal.java
 *
 * Created on 06/11/2010, 16:59:50
 */
package AppControle.telas;

import AppControle.beans.AnimalBean;
import AppControle.beans.RacaBean;
import AppControle.dao.AnimalDAO;
import AppControle.dao.RacaDAO;
import AppControle.util.UtilInterface;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago Carlos
 */
public class TelaAnimal extends javax.swing.JFrame {

    private AnimalDAO Dao;
    private RacaDAO daoRaca;
    private int id = 0;
    private boolean salvar = true;
    private String nomeCid = "";
    private List<RacaBean> listaRacas;

    public TelaAnimal() {
        initComponents();
        ImageIcon icone = new ImageIcon(new ImageIcon().getClass().getResource("/AppControle/util/boi.png"));
        this.setIconImage(icone.getImage());
        try {
            Dao = new AnimalDAO();
            daoRaca = new RacaDAO();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Impossivel conectar ao banco");
        }

        txDataGasto.setFormats("dd/MM/yyyy");
        txDataGasto.getEditor().setEditable(false);
        txDataGasto.getEditor().setBackground(Color.WHITE);


        atualizarTabela();
        bloquearBotoes(false);
        bloquearCampos(false);
        atualizaCombo();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txCor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jpsexo = new javax.swing.JPanel();
        rbMacho = new javax.swing.JRadioButton();
        rbFemea = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txValorCusto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cbRaca = new javax.swing.JComboBox();
        txDataGasto = new org.jdesktop.swingx.JXDatePicker();
        cbMesNascimento = new javax.swing.JComboBox();
        txAnoNascimento = new javax.swing.JFormattedTextField();
        txPesoEntrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE ANIMAIS");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("COR:");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mes Nascimento");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("PESO DE ENTRADA:");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DATA DE ENTRADA:");
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText(".KG");
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        txCor.setName("txCor"); // NOI18N
        txCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCorActionPerformed(evt);
            }
        });
        txCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txCorKeyTyped(evt);
            }
        });
        getContentPane().add(txCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setName("jPanel4"); // NOI18N

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/delete.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel4.add(btnExcluir);

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/editar.png"))); // NOI18N
        btnAlterar.setText("alterar");
        btnAlterar.setName("btnAlterar"); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAlterar);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalvar);

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setName("btnNovo"); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNovo);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-18, 380, 1000, 40));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setName("jPanel5"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1000, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/boi.png"))); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 220));

        jpsexo.setBorder(new javax.swing.border.MatteBorder(null));
        jpsexo.setName("jpsexo"); // NOI18N

        buttonGroup1.add(rbMacho);
        rbMacho.setText("Macho");
        rbMacho.setName("rbMacho"); // NOI18N

        buttonGroup1.add(rbFemea);
        rbFemea.setText("Femea");
        rbFemea.setName("rbFemea"); // NOI18N

        javax.swing.GroupLayout jpsexoLayout = new javax.swing.GroupLayout(jpsexo);
        jpsexo.setLayout(jpsexoLayout);
        jpsexoLayout.setHorizontalGroup(
            jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpsexoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(rbMacho)
                .addGap(18, 18, 18)
                .addComponent(rbFemea)
                .addGap(31, 31, 31))
        );
        jpsexoLayout.setVerticalGroup(
            jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpsexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFemea)
                    .addComponent(rbMacho))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jpsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 240, -1));
        jpsexo.getAccessibleContext().setAccessibleName("Sexo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Raça");
        jLabel10.setName("jLabel10"); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("VALOR DE CUSTO");
        jLabel11.setName("jLabel11"); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 90, -1, -1));

        txValorCusto.setName("txValorCusto"); // NOI18N
        txValorCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txValorCustoActionPerformed(evt);
            }
        });
        txValorCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txValorCustoFocusLost(evt);
            }
        });
        txValorCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txValorCustoKeyTyped(evt);
            }
        });
        getContentPane().add(txValorCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 110, 170, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("R$.");
        jLabel12.setName("jLabel12"); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ano Nascimento");
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tabela.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Animal", "Data Entrada", "Peso Entrada", "Valor de Custo", "Raça", "Cor", "Mes Nasc", "Ano Nas", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setName("tabela"); // NOI18N
        tabela.setRowHeight(20);
        tabela.setRowMargin(0);
        tabela.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tabela.setSelectionForeground(new java.awt.Color(51, 51, 255));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowHorizontalLines(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 980, 180));

        cbRaca.setName("cbRaca"); // NOI18N
        getContentPane().add(cbRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 200, 30));

        txDataGasto.setName("txDataGasto"); // NOI18N
        txDataGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDataGastoActionPerformed(evt);
            }
        });
        txDataGasto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txDataGastoKeyTyped(evt);
            }
        });
        getContentPane().add(txDataGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 32));

        cbMesNascimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<< SELECIONE >>", "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));
        cbMesNascimento.setName("cbMesNascimento"); // NOI18N
        getContentPane().add(cbMesNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 220, 29));

        try {
            txAnoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txAnoNascimento.setName("txAnoNascimento"); // NOI18N
        getContentPane().add(txAnoNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 170, 30));

        txPesoEntrada.setName("txPesoEntrada"); // NOI18N
        txPesoEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txPesoEntradaKeyTyped(evt);
            }
        });
        getContentPane().add(txPesoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
               Toolkit.getDefaultToolkit().beep();
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o animal: " + id, "Confirmação de Exclusão!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            try {
                Dao.remove(id);
                UtilInterface.msgSucesso("O animal " + nomeCid.trim() + " foi excluida com sucesso!");
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
       private void preencherCampos() {
        bloquearCampos(false);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        id = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        nomeCid = modelo.getValueAt(tabela.getSelectedRow(), 1).toString();

        try {
            AnimalBean ab = Dao.retornaUm(id);
            txDataGasto.getEditor().setText(new SimpleDateFormat("dd/MM/yyyy").format(ab.getDataEntrada()));
            cbRaca.setSelectedItem(ab.getRaca().getNomeRaca().trim());
            txPesoEntrada.setText(ab.getPesoEntrada() + "");
            txValorCusto.setText(ab.getValorCompra() + "");
            cbMesNascimento.setSelectedIndex(ab.getMesNas());
            txCor.setText(ab.getCor());
            txAnoNascimento.setText(ab.getAnoNas() + "");
            // txcodAnimal.setText(ab.getCodAnimal()+"");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);

    }

    private void limparCampos() {
        cbRaca.setSelectedIndex(0);
        txPesoEntrada.setText(null);
        txValorCusto.setText(null);
        txCor.setText(null);
        // txcodAnimal.setText(null);
        cbMesNascimento.setSelectedIndex(0);
        txAnoNascimento.setText(null);
    }

    private AnimalBean preencheObjeto() {
        AnimalBean ab = new AnimalBean();

        ab.setCodAnimal(id);
        ab.setDataEntrada(Date.valueOf(UtilInterface.dataParaSQL(txDataGasto.getEditor().getText().trim())));
        ab.setRaca(listaRacas.get(cbRaca.getSelectedIndex() - 1));
        ab.setPesoEntrada(Float.parseFloat(txPesoEntrada.getText().trim()));
        ab.setValorCompra(Float.parseFloat(txValorCusto.getText().trim()));
        ab.setMesNas(cbMesNascimento.getSelectedIndex());
        ab.setCor(txCor.getText().trim());



        String sexo = "";
        if (rbMacho.isSelected()) {
            sexo = "M";
        } else if (rbFemea.isSelected()) {
            sexo = "F";
        }

        ab.setSexo(sexo);
        ab.setAnoNas(Integer.parseInt(txAnoNascimento.getText().trim()));


        return ab;

    }

    private void bloquearBotoes(boolean opc) {
        btnAlterar.setEnabled(opc);
        btnExcluir.setEnabled(opc);
        btnSalvar.setEnabled(opc);
    }

    private void bloquearCampos(boolean opc) {

        txDataGasto.setEnabled(opc);
        cbRaca.setEnabled(opc);
        txPesoEntrada.setEnabled(opc);
        txValorCusto.setEnabled(opc);
        txCor.setEnabled(opc);
        cbMesNascimento.setEnabled(opc);
        txAnoNascimento.setEnabled(opc);
    }

    private boolean validaCampos() {
        boolean aux = true;
        String msg = "Campos obrigatórios:\n";
        if (txPesoEntrada.getText().trim().equals(null) || txPesoEntrada.getText().trim().equals("")) {
            aux = false;
            msg += "Data Entrada;\n";
        } else if (txCor.getText().trim().equals("")) {
            aux = false;
            msg += "Número do Animal;\n";
        } else if (cbRaca.getSelectedIndex() == 0) {
            aux = false;
            msg += "Raca;\n";
        } else if (txDataGasto.getEditor().getText().trim().equals(null) || txDataGasto.getEditor().getText().trim().equals("")) {
            aux = false;
            msg += "DataEntrada;\n";
        } else if (!rbMacho.isSelected() && !rbFemea.isSelected()) {
            aux = false;
            msg += "\nSexo;";
        }

        if (!aux) {
            msg += "\nPreencha Corretamente os Campos!";
            UtilInterface.msgErro(msg);
        }

        return aux;
    }

    private void atualizarTabela() {

        AnimalBean ab;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            List<AnimalBean> listaAnimal = Dao.getLista("", "cod_animal asc");
            for (int i = 0; i < listaAnimal.size(); i++) {
                ab = new AnimalBean();
                ab = listaAnimal.get(i);
                modelo.addRow(new Object[]{
                            ab.getCodAnimal(),
                            new SimpleDateFormat("dd/MM/yyyy").format(ab.getDataEntrada()),
                            ab.getPesoEntrada(),
                            ab.getValorCompra(),
                            ab.getRaca().getNomeRaca().toUpperCase().trim(),
                            ab.getCor(),
                            ab.getMesNas(),
                            ab.getAnoNas(),
                            ab.getSexo()
                        });

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void atualizaCombo() {
        cbRaca.removeAllItems();
        cbRaca.addItem("<selecione uma Raca>");

        try {
            listaRacas = daoRaca.getLista("");

            for (RacaBean rB : listaRacas) {
                cbRaca.addItem(rB.getNomeRaca());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro na lista!!!\n\n" + e.getMessage());
        }
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Toolkit.getDefaultToolkit().beep();

        if (validaCampos()) {

            if (salvar) {
                try {
                    Dao.inserir(preencheObjeto());
                    UtilInterface.msgSucesso("Adicionado com Sucesso!");
                    bloquearBotoes(false);
                    bloquearCampos(false);
                    limparCampos();
                    atualizarTabela();

                } catch (SQLException e) {
                    UtilInterface.msgErro("erro ao inserir" + e);
                    e.getMessage();
                    e.printStackTrace();
                }
            } else {
                try {
                    Dao.altera(preencheObjeto(), id);
                    atualizarTabela();
                    UtilInterface.msgSucesso("Alterado com Sucesso!");
                    bloquearBotoes(false);
                    bloquearCampos(false);
                    limparCampos();
                } catch (SQLException ex) {
                    UtilInterface.msgErro("ERRO\n" + ex.getMessage());
                }
                bloquearCampos(true);
            }
        }

}//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Toolkit.getDefaultToolkit().beep();
        salvar = true;
        bloquearCampos(true);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        limparCampos();
}//GEN-LAST:event_btnNovoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int row = tabela.getSelectedRow();

        id = Integer.parseInt(tabela.getValueAt(row, 0).toString());

        preencherCampos();
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        preencherCampos();
}//GEN-LAST:event_tabelaKeyReleased

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Toolkit.getDefaultToolkit().beep();
        salvar = false;
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        bloquearCampos(true);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair do Cadastro de animal: ", "Confirmação de saida!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txDataGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDataGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDataGastoActionPerformed

    private void txDataGastoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDataGastoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txDataGastoKeyTyped

    private void txValorCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txValorCustoKeyTyped
String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(",") && txValorCusto.getText().indexOf(",") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (letra.equals(" ") && txValorCusto.getText().indexOf(" ") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (txValorCusto.getText().length() == 9) {
            evt.consume();


            
        }
        String permitido = "0123456789.";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txValorCustoKeyTyped

    private void txValorCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txValorCustoFocusLost
txValorCusto.setText(txValorCusto.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_txValorCustoFocusLost

    private void txCorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCorKeyTyped
String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(".") && txValorCusto.getText().indexOf(".") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        
        if (txCor.getText().length() == 9) {
            evt.consume();


            
        }
        String permitido = "QWERTYUIOPASDFGHJKLÇZXCVBNM~qwertyuiop´~çlkjhgfdsazxcvbnm,.;^";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }        // TODO add your handling code here:
        if(txCor.getText().length()==19)
            evt.consume();
        // TODO add your handling code here:

    }//GEN-LAST:event_txCorKeyTyped

    private void txCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCorActionPerformed

    private void txValorCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txValorCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txValorCustoActionPerformed

    private void txPesoEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesoEntradaKeyTyped
String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(",") && txPesoEntrada.getText().indexOf(",") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (letra.equals(" ") && txPesoEntrada.getText().indexOf(" ") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }
        if (txPesoEntrada.getText().length() == 5) {
            evt.consume();



        }
        String permitido = "0123456789.";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }        // TODO add your handling code here:

    }//GEN-LAST:event_txPesoEntradaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaAnimal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbMesNascimento;
    private javax.swing.JComboBox cbRaca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpsexo;
    private javax.swing.JRadioButton rbFemea;
    private javax.swing.JRadioButton rbMacho;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txAnoNascimento;
    private javax.swing.JTextField txCor;
    private org.jdesktop.swingx.JXDatePicker txDataGasto;
    private javax.swing.JTextField txPesoEntrada;
    private javax.swing.JTextField txValorCusto;
    // End of variables declaration//GEN-END:variables
}
