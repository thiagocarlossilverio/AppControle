package AppControle.util;

import javax.swing.ImageIcon;

public class TelaMsg extends javax.swing.JFrame {

    public  TelaMsg(int opc, String txt) {
        initComponents();
        setLocationRelativeTo(null);
        msg.setText(txt);

        if (opc == 1) {
            ImageIcon ic = new ImageIcon("C:\\AppControle\\Imagens\\erro.png");
            icone.setIcon(ic);

        } else if (opc == 2) {
            ImageIcon ic = new ImageIcon("C:\\AppControle\\Imagens\\sucesso.png");
            icone.setIcon(ic);

        } else if (opc == 3) {
            ImageIcon ic = new ImageIcon("C:\\AppControle\\Imagens\\pergunta.png");
            icone.setIcon(ic);
        } else if (opc == 4) {
            ImageIcon ic = new ImageIcon("C:\\AppControle\\Imagens\\informação.png");
            icone.setIcon(ic);

        }
        setVisible(true);
        requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icone = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("MENSAGEM DE ALERTA");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppControle/util/informação.png"))); // NOI18N
        getContentPane().add(icone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 120));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 320, 110));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new TelaMsg(1, "TESTE").setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables
}
