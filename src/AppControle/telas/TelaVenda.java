package AppControle.telas;

/**
 *
 * @author Thiago Carlos
 */
import AppControle.beans.AnimalBean;
import AppControle.dao.AnimalvDAO;
import AppControle.util.UtilInterface;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVenda extends javax.swing.JFrame {

    private AnimalvDAO Dao;
    private int id = 0;
    private List<AnimalBean> listaAnimal;
    private AnimalvDAO daoAnimal;

    public TelaVenda() {
        initComponents();
        ImageIcon icone = new ImageIcon(new ImageIcon().getClass().getResource("/AppControle/util/boi.png"));
        this.setIconImage(icone.getImage());
        try {
            daoAnimal = new AnimalvDAO();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "impossivel conectar ao banco");
        }

        lbDataAtual.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        atualizarTabela();
        setLocationRelativeTo(null);
    }

    private boolean validaCampos() {
        boolean aux = true;
        String msg = "Campos obrigatórios:\n";
        if (txValorSaida.getText().trim() == null || txValorSaida.getText().trim().equals("")) {
            aux = false;
            msg += "Data Entrada;\n";
        } else if (txPesoSaida.getText().trim().equals("")) {
            aux = false;
            msg += "Número do Animal;\n";
        }

        if (!aux) {
            msg += "\nPreencha Corretamente os Campos!";
            UtilInterface.msgErro(msg);
        }

        return aux;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lbDataAtual = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txPesoSaida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txValorSaida = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        btnVender = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbNumero = new javax.swing.JLabel();
        lbDataVenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        setTitle("CADASTRAR ANIMAIS PRONTO PARA VENDA");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDataAtual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDataAtual.setForeground(new java.awt.Color(204, 102, 0));
        lbDataAtual.setName("lbDataAtual"); // NOI18N
        getContentPane().add(lbDataAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Número do Animal:");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 122, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Peso de Saida:");
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 20));

        txPesoSaida.setName("txPesoSaida"); // NOI18N
        txPesoSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txPesoSaidaKeyTyped(evt);
            }
        });
        getContentPane().add(txPesoSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 195, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Valor de Saida:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("R$.");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        txValorSaida.setName("txValorSaida"); // NOI18N
        txValorSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txValorSaidaKeyTyped(evt);
            }
        });
        getContentPane().add(txValorSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 195, 28));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 820, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO DO ANIMAL", "DATA DA VENDA", "PESO DE SAIDA", "VALOR DE VENDA", "VENDIDO?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setName("tabela"); // NOI18N
        tabela.setSelectionBackground(new java.awt.Color(204, 255, 102));
        tabela.setSelectionForeground(new java.awt.Color(0, 102, 204));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 810, 240));

        panel1.setBackground(new java.awt.Color(153, 255, 153));
        panel1.setName("panel1"); // NOI18N

        btnVender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/Sobre.png"))); // NOI18N
        btnVender.setText("VENDER");
        btnVender.setName("btnVender"); // NOI18N
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/sair.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 350, 60));

        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(153, 153, 255));
        lbNumero.setName("lbNumero"); // NOI18N
        getContentPane().add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 30));

        lbDataVenda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbDataVenda.setForeground(new java.awt.Color(153, 153, 255));
        lbDataVenda.setName("lbDataVenda"); // NOI18N
        getContentPane().add(lbDataVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data da Compra:");
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Data Atual:");
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-820)/2, (screenSize.height-572)/2, 820, 572);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        Toolkit.getDefaultToolkit().beep();

        if (validaCampos()) {
            try {
                daoAnimal.vender(preencheObjeto());
                UtilInterface.msgSucesso("Vendido com Sucesso!");
                btnVender.setEnabled(false);
                txPesoSaida.setEditable(false);
                txValorSaida.setEditable(false);
                limparCampos();
                atualizarTabela();
            } catch (SQLException e) {
                UtilInterface.msgErro("Erro ao vender " + e.getMessage());
                e.getMessage();
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnVenderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair ? ", "Confirmação de Cancelamento!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        preencherCampos();
    }//GEN-LAST:event_tabelaMouseClicked

    private void txValorSaidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txValorSaidaKeyTyped
       String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(".") && txValorSaida.getText().indexOf(".") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }

        String permitido = "0123456789.";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }
    }//GEN-LAST:event_txValorSaidaKeyTyped

    private void txPesoSaidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesoSaidaKeyTyped
       String letra = String.valueOf(evt.getKeyChar());

        if (letra.equals(".") && txPesoSaida.getText().indexOf(".") > -1) { // se for 2 pontos pára a função
            evt.consume();
        }

        String permitido = "0123456789.";

        if (!permitido.contains(letra)) { // se o permitido não contém a letra digitada, pára o processo
            evt.consume();
        }
    }//GEN-LAST:event_txPesoSaidaKeyTyped
    private void preencherCampos() {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        String jaVendido = modelo.getValueAt(tabela.getSelectedRow(), 4).toString();

        if (jaVendido.equals("SIM")) {
            btnVender.setEnabled(false);
            txPesoSaida.setEditable(false);
            txValorSaida.setEditable(false);
        } else {
            btnVender.setEnabled(true);
            txPesoSaida.setEditable(true);
            txValorSaida.setEditable(true);
        }

        id = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());

        try {
            AnimalBean ab = daoAnimal.retornaUm(id);
            lbDataVenda.setText(new SimpleDateFormat("dd/MM/yyyy").format(ab.getDataEntrada()));
            lbNumero.setText(ab.getCodAnimal() + "");
            txPesoSaida.setText(ab.getPesoSaida() + "");
            txValorSaida.setText(ab.getValorSaida() + "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void limparCampos() {
        txPesoSaida.setText(null);
        txValorSaida.setText(null);
    }

    private AnimalBean preencheObjeto() {
        AnimalBean ab = new AnimalBean();

        ab.setCodAnimal(id);
        ab.setPesoSaida(Float.parseFloat(txPesoSaida.getText().trim()));
        ab.setValorSaida(Float.parseFloat(txValorSaida.getText().trim()));

        return ab;
    }

    private void atualizarTabela() {
        AnimalBean ab;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            List<AnimalBean> listaAnimal = daoAnimal.getLista("", " cod_animal asc");
            for (int i = 0; i < listaAnimal.size(); i++) {
                ab = new AnimalBean();
                ab = listaAnimal.get(i);
                modelo.addRow(new Object[]{
                            ab.getCodAnimal(),
                            ab.getDataSaida() != null ? new SimpleDateFormat("dd/MM/yyyy").format(ab.getDataSaida()) : "",
                            ab.getPesoSaida(),
                            ab.getValorSaida(),
                            ab.getDataSaida() != null ? "SIM" : "NÃO"
                        });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbDataAtual;
    private javax.swing.JLabel lbDataVenda;
    private javax.swing.JLabel lbNumero;
    private java.awt.Panel panel1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txPesoSaida;
    private javax.swing.JTextField txValorSaida;
    // End of variables declaration//GEN-END:variables
}
