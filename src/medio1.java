
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class medio1 extends javax.swing.JFrame {

    /**
     * Creates new form medio1
     */
    public medio1() {
        initComponents();
        btncontinuar.setEnabled(false);
        getContentPane().setBackground(Color.white);
       
        setSize(800,620);
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rdba = new javax.swing.JRadioButton();
        rdbb = new javax.swing.JRadioButton();
        rdbc = new javax.swing.JRadioButton();
        rdbd = new javax.swing.JRadioButton();
        btncontinuar = new javax.swing.JButton();
        lblimg1 = new javax.swing.JLabel();
        btnanular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nível Medio - Questão 1");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Qual o material é o principal responsavel pelo aquecimento global ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(56, 69, 458, 17);

        rdba.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdba.setText("CO2");
        rdba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbaActionPerformed(evt);
            }
        });
        getContentPane().add(rdba);
        rdba.setBounds(56, 157, 53, 25);

        rdbb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbb.setText("C2O");
        rdbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbActionPerformed(evt);
            }
        });
        getContentPane().add(rdbb);
        rdbb.setBounds(56, 200, 53, 25);

        rdbc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbc.setText("CH4");
        rdbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbcActionPerformed(evt);
            }
        });
        getContentPane().add(rdbc);
        rdbc.setBounds(56, 243, 51, 25);

        rdbd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbd.setText("O3");
        rdbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbdActionPerformed(evt);
            }
        });
        getContentPane().add(rdbd);
        rdbd.setBounds(56, 281, 43, 25);

        btncontinuar.setText("Continuar");
        btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btncontinuar);
        btncontinuar.setBounds(639, 540, 90, 23);

        lblimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        getContentPane().add(lblimg1);
        lblimg1.setBounds(510, 160, 330, 320);

        btnanular.setText("Ajuda");
        btnanular.setToolTipText("Anula 2 alternativas incorretas e desconta 10 pontos.");
        btnanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanularActionPerformed(evt);
            }
        });
        getContentPane().add(btnanular);
        btnanular.setBounds(60, 540, 61, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbaActionPerformed
        if(rdba.isSelected()){
            btncontinuar.setEnabled(true);
            rdbb.setSelected(false);
            rdbc.setSelected(false);
            rdbd.setSelected(false);
        }
        else {
            btncontinuar.setEnabled(false);
        }
    }//GEN-LAST:event_rdbaActionPerformed

    private void rdbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbActionPerformed
        if(rdbb.isSelected()){
            btncontinuar.setEnabled(true);
            rdba.setSelected(false);
            rdbc.setSelected(false);
            rdbd.setSelected(false);
        }
        else {
            btncontinuar.setEnabled(false);
        }
    }//GEN-LAST:event_rdbbActionPerformed

    private void rdbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbcActionPerformed
        if(rdbc.isSelected()){
            btncontinuar.setEnabled(true);
            rdba.setSelected(false);
            rdbb.setSelected(false);
            rdbd.setSelected(false);
        }
        else {
            btncontinuar.setEnabled(false);
        }
    }//GEN-LAST:event_rdbcActionPerformed

    private void rdbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbdActionPerformed
        if(rdbd.isSelected()){
            btncontinuar.setEnabled(true);
            rdba.setSelected(false);
            rdbb.setSelected(false);
            rdbc.setSelected(false);
        }
        else {
            btncontinuar.setEnabled(false);
        }
    }//GEN-LAST:event_rdbdActionPerformed

    private void btncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuarActionPerformed
        if(rdba.isSelected()){
           if(Menu.ajuda.equals("n"))
            {
            JOptionPane.showMessageDialog(null,"Resposta certa , você ganhou 20 pontos.");
            Menu.pontuaçao=Menu.pontuaçao+20;
            }
            else if (Menu.ajuda.equals("s"))
            {
                JOptionPane.showMessageDialog(null,"Você acertou utilizando a ferramenta de ajuda , você ganhou 10 pontos.");
                Menu.pontuaçao=Menu.pontuaçao+10;
            }
        }

        else{
             JOptionPane.showMessageDialog(null,"Resposta errada.","Errou", JOptionPane.ERROR_MESSAGE);

        }
        dispose();
        new medio2().show();
         Menu.ajuda="n";
    }//GEN-LAST:event_btncontinuarActionPerformed

    private void btnanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanularActionPerformed
        rdbc.setEnabled(false);
        rdbd.setEnabled(false);
        Menu.ajuda="s";
    }//GEN-LAST:event_btnanularActionPerformed

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
            java.util.logging.Logger.getLogger(medio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medio1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanular;
    private javax.swing.JButton btncontinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JRadioButton rdba;
    private javax.swing.JRadioButton rdbb;
    private javax.swing.JRadioButton rdbc;
    private javax.swing.JRadioButton rdbd;
    // End of variables declaration//GEN-END:variables
}
