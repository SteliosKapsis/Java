/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmathisi1;

/**
 *
 * @author babis
 */
public class ExamGui extends javax.swing.JFrame {

    /**
     * Creates new form ExamGui
     */
    public ExamGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Enotita1Btn = new javax.swing.JButton();
        Enotita2n1Btn = new javax.swing.JButton();
        Enotita2n2Btn = new javax.swing.JButton();
        Enotita4Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ενότητες");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        Enotita1Btn.setText("Ενότητα 1");
        Enotita1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enotita1BtnActionPerformed(evt);
            }
        });

        Enotita2n1Btn.setText("Ενότητα 2-1");
        Enotita2n1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enotita2n1BtnActionPerformed(evt);
            }
        });

        Enotita2n2Btn.setText("Ενότητα  2-2");
        Enotita2n2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enotita2n2BtnActionPerformed(evt);
            }
        });

        Enotita4Btn.setText("Ενότητα 4");
        Enotita4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enotita4BtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Επιλέξτε ενότητα για να ξεκινήσει το αντίστοιχο τεστ:");

        ReturnBtn.setText("Επιστροφή");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Enotita1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Enotita2n1Btn)
                        .addGap(18, 18, 18)
                        .addComponent(Enotita2n2Btn)
                        .addGap(18, 18, 18)
                        .addComponent(Enotita4Btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enotita1Btn)
                    .addComponent(Enotita2n1Btn)
                    .addComponent(Enotita2n2Btn)
                    .addComponent(Enotita4Btn))
                .addGap(35, 35, 35)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enotita2n1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enotita2n1BtnActionPerformed
         Exam2GUI frameT2 = new Exam2GUI();
        frameT2.setTitle("Διαγώνισμα Ενότητας 2");
        frameT2.setVisible(true);
        frameT2.setResizable(true);
        frameT2.setLocationRelativeTo(null);
        super.dispose();
    }//GEN-LAST:event_Enotita2n1BtnActionPerformed

    private void Enotita1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enotita1BtnActionPerformed
        
        Exam1GUI frameT1 = new Exam1GUI();
        frameT1.setTitle("Διαγώνισμα Ενότητας 1");
        frameT1.setVisible(true);
        frameT1.setResizable(true);
        frameT1.setLocationRelativeTo(null);
        super.dispose();
                
    }//GEN-LAST:event_Enotita1BtnActionPerformed

    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
        FirstGUI frame = new FirstGUI();
        frame.setTitle("Εφαρμογή");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        super.dispose();
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void Enotita2n2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enotita2n2BtnActionPerformed
        
        Exam22GUI frameT22 = new Exam22GUI();
        frameT22.setTitle("Διαγώνισμα Ενότητας 2-2");
        frameT22.setVisible(true);
        frameT22.setResizable(true);
        frameT22.setLocationRelativeTo(null);
        super.dispose();
    }//GEN-LAST:event_Enotita2n2BtnActionPerformed

    private void Enotita4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enotita4BtnActionPerformed
        
        Exam4GUI frameT4 = new Exam4GUI();
        frameT4.setTitle("Διαγώνισμα Ενότητας 4");
        frameT4.setVisible(true);
        frameT4.setResizable(true);
        frameT4.setLocationRelativeTo(null);
        super.dispose();
    }//GEN-LAST:event_Enotita4BtnActionPerformed

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
            java.util.logging.Logger.getLogger(ExamGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enotita1Btn;
    private javax.swing.JButton Enotita2n1Btn;
    private javax.swing.JButton Enotita2n2Btn;
    private javax.swing.JButton Enotita4Btn;
    private javax.swing.JButton ReturnBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
