
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Ricardo Garcia nº14 3º Modulo de Informática
 */
public class Menu extends javax.swing.JFrame {

   public static int pontuaçao=0;
   public static String ajuda="n";
   
    public Menu() {
        initComponents();
        getContentPane().setBackground(Color.white);
        btncontinuar.setEnabled(false);
        setSize(800,600);
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
        lblimg = new javax.swing.JLabel();
        rdbfacil = new javax.swing.JRadioButton();
        rdbdificil = new javax.swing.JRadioButton();
        rdbmedio = new javax.swing.JRadioButton();
        lblimg2 = new javax.swing.JLabel();
        btncontinuar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz-Meio Ambiente");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setText("Bem vindo ao Quiz");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 38, 173, 25);
        getContentPane().add(lblimg);
        lblimg.setBounds(342, 317, 153, 162);

        rdbfacil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbfacil.setText("Fácil");
        rdbfacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbfacilActionPerformed(evt);
            }
        });
        getContentPane().add(rdbfacil);
        rdbfacil.setBounds(103, 352, 51, 25);

        rdbdificil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbdificil.setText("Difícil");
        rdbdificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbdificilActionPerformed(evt);
            }
        });
        getContentPane().add(rdbdificil);
        rdbdificil.setBounds(103, 438, 55, 25);

        rdbmedio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbmedio.setText("Médio");
        rdbmedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmedioActionPerformed(evt);
            }
        });
        getContentPane().add(rdbmedio);
        rdbmedio.setBounds(103, 395, 61, 25);

        lblimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.jpg"))); // NOI18N
        getContentPane().add(lblimg2);
        lblimg2.setBounds(103, 81, 264, 198);

        btncontinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogar.jpg"))); // NOI18N
        btncontinuar.setToolTipText("Inicia o Jogo");
        btncontinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btncontinuar);
        btncontinuar.setBounds(570, 500, 65, 23);

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-fechar.png"))); // NOI18N
        btnsair.setToolTipText("Encerra o Quiz");
        btnsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair);
        btnsair.setBounds(110, 500, 60, 23);

        jMenu1.setText("Jogo");

        jMenuItem1.setText("Fácil");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Médio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Difícil");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem8.setText("Sobre");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator2);

        jMenuItem9.setText("Sair");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Regras");

        jMenuItem4.setText("Fácil");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Médio");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Difícil");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbdificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbdificilActionPerformed
       rdbmedio.setSelected(false);
        rdbfacil.setSelected(false);
        if (rdbdificil.isSelected()){
            btncontinuar.setEnabled(true);
           //lblimg.setIcon(new ImageIcon("F:\\IMG\\dificil.jpg"));
            //codigo errado
            lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dificil.jpg")));
       }
       else{
            lblimg.setIcon(new ImageIcon("")); 
            btncontinuar.setEnabled(false);
       }
    }//GEN-LAST:event_rdbdificilActionPerformed

    private void rdbfacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbfacilActionPerformed
       rdbmedio.setSelected(false);
        rdbdificil.setSelected(false);
        if (rdbfacil.isSelected()){
             btncontinuar.setEnabled(true);
          //lblimg.setIcon(new ImageIcon("F:\\IMG\\facil.jpg")); 
             lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facil.jpg")));
       }
       else{
            lblimg.setIcon(new ImageIcon("")); 
            btncontinuar.setEnabled(false);
       }
    }//GEN-LAST:event_rdbfacilActionPerformed

    private void rdbmedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmedioActionPerformed
 rdbfacil.setSelected(false);
        rdbdificil.setSelected(false);
        if (rdbmedio.isSelected()){
             btncontinuar.setEnabled(true);
          // lblimg.setIcon(new ImageIcon("F:\\IMG\\medio.jpg"));
             lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medio.jpg")));
       }
       else{
            lblimg.setIcon(new ImageIcon("")); 
            btncontinuar.setEnabled(false);
       }      
    }//GEN-LAST:event_rdbmedioActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
               System.exit(0);       
    }//GEN-LAST:event_btnsairActionPerformed

    private void btncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuarActionPerformed
        if (rdbmedio.isSelected()){
           hide();
           
            new medio1().show();
       }
        else if (rdbfacil.isSelected()){
            hide();
            
            new facil1().show();
       }      
        else if (rdbdificil.isSelected()){
            hide();
            
            new dificil1().show();
       }      
    }//GEN-LAST:event_btncontinuarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      hide();
           
            new facil1().show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        hide();
           
            new medio1().show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        hide();
            
            new dificil1().show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null,"Você responderá 5 questões de nível Fácil valendo 20 pontos cada uma.\n"
                    + "Basta escolher a alternativa que você considera a correta e clicar no Botão Continuar.\n"
                    + "Caso esteja com Dificuldades na questão você também pode contar com a Ferramenta Ajuda \n"
                    + "que se localiza no canto inferior esquerdo da tela,\n"
                    + "essa ferramenta anula duas alternativas incorretas ,porém desconta 10 pontos caso você acerte.\n"
                    + "Boa Sorte, O planeta está em suas mãos.");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       JOptionPane.showMessageDialog(null,"Você responderá 5 questões de nível médio valendo 20 pontos cada uma.\n"
                    + "Basta escolher a alternativa que você considera a correta e clicar no Botão Continuar.\n"
                    + "Caso esteja com Dificuldades na questão você também pode contar com o botão Ajuda \n"
                    + "que se localiza no canto inferior esquerdo da tela,\n"
                    + "essa ferramenta anula duas alternativas incorretas ,porém desconta 10 pontos caso você acerte.\n"
                    + "Boa Sorte, O planeta está em suas mãos.");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JOptionPane.showMessageDialog(null,"Você responderá 5 questões de nível Díficil valendo 20 pontos cada uma.\n"
                    + "Basta escolher a alternativa que você considera a correta e clicar no Botão Continuar.\n"
                    + "Caso esteja com Dificuldades na questão você também pode contar com o botão Ajuda \n"
                    + "que se localiza no canto inferior esquerdo da tela,\n"
                    + "essa ferramenta anula apenas uma alternativa incorreta ,porém desconta 10 pontos caso você acerte.\n"
                    + "Boa Sorte, o planeta está em suas mãos.");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       new sobre().show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncontinuar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblimg2;
    private javax.swing.JRadioButton rdbdificil;
    private javax.swing.JRadioButton rdbfacil;
    private javax.swing.JRadioButton rdbmedio;
    // End of variables declaration//GEN-END:variables
}
