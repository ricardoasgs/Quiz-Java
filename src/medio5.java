
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
public class medio5 extends javax.swing.JFrame {

    /**
     * Creates new form medio5
     */
    public medio5() {
        initComponents();
         btncontinuar2.setEnabled(false);
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

        rdba = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rdbc = new javax.swing.JRadioButton();
        rdbb = new javax.swing.JRadioButton();
        rdbd = new javax.swing.JRadioButton();
        btncontinuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rdba1 = new javax.swing.JRadioButton();
        rdbb1 = new javax.swing.JRadioButton();
        rdbc1 = new javax.swing.JRadioButton();
        lblimg1 = new javax.swing.JLabel();
        rdbd1 = new javax.swing.JRadioButton();
        btncontinuar2 = new javax.swing.JButton();
        btnanular = new javax.swing.JButton();

        rdba.setText("A- ");
        rdba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbaActionPerformed(evt);
            }
        });

        jLabel1.setText("Pergunta:");

        rdbc.setText("C- ");
        rdbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbcActionPerformed(evt);
            }
        });

        rdbb.setText("B- ");
        rdbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbActionPerformed(evt);
            }
        });

        rdbd.setText("D-");
        rdbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbdActionPerformed(evt);
            }
        });

        btncontinuar.setText("Continuar");
        btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nível Medio - Questão 5");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("O que são Efluentes ?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(66, 39, 149, 17);

        rdba1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdba1.setText("São rios que correm para um outro rio principal");
        rdba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdba1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdba1);
        rdba1.setBounds(58, 119, 313, 25);

        rdbb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbb1.setText(" é a água retirada do rio, lago ou lençol subterrâneo");
        rdbb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdbb1);
        rdbb1.setBounds(58, 162, 339, 25);

        rdbc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbc1.setText("Águas fluviais ou de esgotos que são despejadas nas águas costeiras");
        rdbc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbc1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdbc1);
        rdbc1.setBounds(58, 205, 443, 25);

        lblimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        getContentPane().add(lblimg1);
        lblimg1.setBounds(520, 150, 583, 320);

        rdbd1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbd1.setText("São águas poluídas que cruzam rios");
        rdbd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbd1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdbd1);
        rdbd1.setBounds(58, 248, 243, 25);

        btncontinuar2.setText("Continuar");
        btncontinuar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btncontinuar2);
        btncontinuar2.setBounds(619, 530, 90, 23);

        btnanular.setText("Ajuda");
        btnanular.setToolTipText("Anula 2 alternativas incorretas e desconta 10 pontos.");
        btnanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanularActionPerformed(evt);
            }
        });
        getContentPane().add(btnanular);
        btnanular.setBounds(50, 530, 61, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbaActionPerformed
       
    }//GEN-LAST:event_rdbaActionPerformed

    private void rdbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbcActionPerformed
     
    }//GEN-LAST:event_rdbcActionPerformed

    private void rdbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbActionPerformed
        
    }//GEN-LAST:event_rdbbActionPerformed

    private void rdbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbdActionPerformed
        
    }//GEN-LAST:event_rdbdActionPerformed

    private void btncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuarActionPerformed
        if(rdbc1.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta certa , você ganhou 20 pontos.");
            Menu.pontuaçao=Menu.pontuaçao+20;

        }
        else{
            JOptionPane.showMessageDialog(null,"Resposta errada.");

        }
        hide();
        new Pontuação().show();
    }//GEN-LAST:event_btncontinuarActionPerformed

    private void rdba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdba1ActionPerformed
        if(rdba1.isSelected()){
            btncontinuar2.setEnabled(true);
            rdbb1.setSelected(false);
            rdbc1.setSelected(false);
            rdbd1.setSelected(false);
        }
        else {
            btncontinuar2.setEnabled(false);
        }
    }//GEN-LAST:event_rdba1ActionPerformed

    private void rdbb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbb1ActionPerformed
        if(rdbb1.isSelected()){
            btncontinuar2.setEnabled(true);
            rdba1.setSelected(false);
            rdbc1.setSelected(false);
            rdbd1.setSelected(false);
        }
        else {
            btncontinuar2.setEnabled(false);
        }
    }//GEN-LAST:event_rdbb1ActionPerformed

    private void rdbc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbc1ActionPerformed
        if(rdbc1.isSelected()){
            btncontinuar2.setEnabled(true);
            rdba1.setSelected(false);
            rdbb1.setSelected(false);
            rdbd1.setSelected(false);
        }
        else {
            btncontinuar2.setEnabled(false);
        }
    }//GEN-LAST:event_rdbc1ActionPerformed

    private void rdbd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbd1ActionPerformed
        if(rdbd1.isSelected()){
            btncontinuar2.setEnabled(true);
            rdba1.setSelected(false);
            rdbb1.setSelected(false);
            rdbc1.setSelected(false);
        }
        else {
            btncontinuar2.setEnabled(false);
        }
    }//GEN-LAST:event_rdbd1ActionPerformed

    private void btncontinuar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar2ActionPerformed
        if(rdbc1.isSelected()){
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
        new Pontuação().show();
         Menu.ajuda="n";
    }//GEN-LAST:event_btncontinuar2ActionPerformed

    private void btnanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanularActionPerformed
        rdbd1.setEnabled(false);
        rdbb1.setEnabled(false);
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
            java.util.logging.Logger.getLogger(medio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medio5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanular;
    private javax.swing.JButton btncontinuar;
    private javax.swing.JButton btncontinuar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JRadioButton rdba;
    private javax.swing.JRadioButton rdba1;
    private javax.swing.JRadioButton rdbb;
    private javax.swing.JRadioButton rdbb1;
    private javax.swing.JRadioButton rdbc;
    private javax.swing.JRadioButton rdbc1;
    private javax.swing.JRadioButton rdbd;
    private javax.swing.JRadioButton rdbd1;
    // End of variables declaration//GEN-END:variables
}
