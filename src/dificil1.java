
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
public class dificil1 extends javax.swing.JFrame {

    /**
     * Creates new form dificil1
     */
    public dificil1() {
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

        lblimg1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rdbc = new javax.swing.JRadioButton();
        rdbd = new javax.swing.JRadioButton();
        btncontinuar = new javax.swing.JButton();
        rdba = new javax.swing.JRadioButton();
        rdbb = new javax.swing.JRadioButton();
        btnanular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nível Difícil - Questão 1");
        getContentPane().setLayout(null);

        lblimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        getContentPane().add(lblimg1);
        lblimg1.setBounds(520, 170, 330, 320);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" O que é desenvolvimento sustentável:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 57, 266, 17);

        rdbc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbc.setText(" Condições que cercam e influenciam os seres vivos ");
        rdbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbcActionPerformed(evt);
            }
        });
        getContentPane().add(rdbc);
        rdbc.setBounds(40, 242, 343, 25);

        rdbd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbd.setText("ganhar dinheiro  agredindo o meio ambiente");
        rdbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbdActionPerformed(evt);
            }
        });
        getContentPane().add(rdbd);
        rdbd.setBounds(40, 285, 295, 25);

        btncontinuar.setText("Continuar");
        btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btncontinuar);
        btncontinuar.setBounds(619, 540, 90, 23);

        rdba.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdba.setText("Jovens se desenvolvem e se sustentam sem ajuda dos pais");
        rdba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbaActionPerformed(evt);
            }
        });
        getContentPane().add(rdba);
        rdba.setBounds(40, 156, 387, 25);

        rdbb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbb.setText("Equilíbrio entre produção ambiental e desenvolvimento econômico");
        rdbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbActionPerformed(evt);
            }
        });
        getContentPane().add(rdbb);
        rdbb.setBounds(40, 199, 429, 25);

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
        if(rdbb.isSelected()){
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
        new dificil2().show();
        Menu.ajuda="n";
    }//GEN-LAST:event_btncontinuarActionPerformed

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

    private void btnanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanularActionPerformed
       
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
            java.util.logging.Logger.getLogger(dificil1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dificil1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dificil1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dificil1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dificil1().setVisible(true);
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
