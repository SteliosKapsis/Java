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
public class Exam4GUI extends javax.swing.JFrame {
    String ans1;
    String ans2;
    String ans3;
    String ans4;
    String ans5;
    /**
     * Creates new form Exam4GUI
     */
    public Exam4GUI() {
        initComponents();
        ans1="false1,";
        ans2="false2,";
        ans3="false3,";
        ans4="false4,";
        ans5="false5";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        E4buttonGroup1 = new javax.swing.ButtonGroup();
        Ε4buttonGroup2 = new javax.swing.ButtonGroup();
        Ε4buttonGroup3 = new javax.swing.ButtonGroup();
        Ε4buttonGroup4 = new javax.swing.ButtonGroup();
        Ε4buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        E4Btn1n1 = new javax.swing.JRadioButton();
        E4Btn1n2 = new javax.swing.JRadioButton();
        E4Btn1n3 = new javax.swing.JRadioButton();
        E4Btn1n4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        E4Btn2n1 = new javax.swing.JRadioButton();
        E4Btn2n2 = new javax.swing.JRadioButton();
        E4Btn2n3 = new javax.swing.JRadioButton();
        E4Btn2n4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        E4Sosto1 = new javax.swing.JRadioButton();
        E4Lathos1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        E4Sosto2 = new javax.swing.JRadioButton();
        E4Lathos2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        E4Sosto3 = new javax.swing.JRadioButton();
        E4Lathos3 = new javax.swing.JRadioButton();
        Submit4Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Α) Ερωτήσεις πολλαπλής επιλογής:");

        jLabel2.setText("1) Οι κυριότεροι παράγοντες που επηρεάζουν τη γονιμότητα στην Ελλάδα είναι:");

        E4buttonGroup1.add(E4Btn1n1);
        E4Btn1n1.setText("Έλλειψη παροχών από το κράτος ");
        E4Btn1n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn1n1ActionPerformed(evt);
            }
        });

        E4buttonGroup1.add(E4Btn1n2);
        E4Btn1n2.setText("Έλλειψη παιδίατρων");
        E4Btn1n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn1n2ActionPerformed(evt);
            }
        });

        E4buttonGroup1.add(E4Btn1n3);
        E4Btn1n3.setText("Αδυναμία φροντίδας παιδιού από τους γονείς");
        E4Btn1n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn1n3ActionPerformed(evt);
            }
        });

        E4buttonGroup1.add(E4Btn1n4);
        E4Btn1n4.setText("Όλα τα παραπάνω");
        E4Btn1n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn1n4ActionPerformed(evt);
            }
        });

        jLabel3.setText("2) Η χρησιμότητα της κοινωνιολογίας είναι:");

        Ε4buttonGroup2.add(E4Btn2n1);
        E4Btn2n1.setText("Διαφωτισμός κοινωνικών φαινομένων");
        E4Btn2n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn2n1ActionPerformed(evt);
            }
        });

        Ε4buttonGroup2.add(E4Btn2n2);
        E4Btn2n2.setText("Εξάλειψη της μοιρολατρίας");
        E4Btn2n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn2n2ActionPerformed(evt);
            }
        });

        Ε4buttonGroup2.add(E4Btn2n3);
        E4Btn2n3.setText("Πρακτικές εφαρμογές στη καθημερινή ζωή");
        E4Btn2n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn2n3ActionPerformed(evt);
            }
        });

        Ε4buttonGroup2.add(E4Btn2n4);
        E4Btn2n4.setText("Όλα τα παραπάνω");
        E4Btn2n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Btn2n4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Β) Ερωτήσεις σωστού-λάθους:");

        jLabel5.setText("1) Κοινωνιολογία είναι η επιστημονική μελέτη της κοινωνικής συμπεριφοράς μεταξύ 2 ή περισσοτέρων ανθρώπων. ");

        Ε4buttonGroup3.add(E4Sosto1);
        E4Sosto1.setText("Σωστό");
        E4Sosto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Sosto1ActionPerformed(evt);
            }
        });

        Ε4buttonGroup3.add(E4Lathos1);
        E4Lathos1.setText("Λάθος");
        E4Lathos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Lathos1ActionPerformed(evt);
            }
        });

        jLabel6.setText("2) Κοινωνική ανθρωπολογία μελετά τις προσωπικές σχέσεις των αγροτικών κοινωνιών");

        Ε4buttonGroup4.add(E4Sosto2);
        E4Sosto2.setText("Σωστό");
        E4Sosto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Sosto2ActionPerformed(evt);
            }
        });

        Ε4buttonGroup4.add(E4Lathos2);
        E4Lathos2.setText("Λάθος");
        E4Lathos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Lathos2ActionPerformed(evt);
            }
        });

        jLabel7.setText("3) Κοινωνιολογία ορίζεται η ακαδημαϊκή και εφαρμοσμένη επιστήμη που ασχολείται με την μελέτη της σκέψης και της συμπεριφοράς");

        Ε4buttonGroup5.add(E4Sosto3);
        E4Sosto3.setText("Σωστό");
        E4Sosto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Sosto3ActionPerformed(evt);
            }
        });

        Ε4buttonGroup5.add(E4Lathos3);
        E4Lathos3.setText("Λάθος");
        E4Lathos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4Lathos3ActionPerformed(evt);
            }
        });

        Submit4Btn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Submit4Btn.setText("Submit");
        Submit4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit4BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E4Btn1n1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E4Btn1n2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E4Btn1n3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E4Btn1n4))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(E4Btn2n1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(E4Btn2n2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(E4Btn2n3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E4Btn2n4))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(E4Sosto1)
                        .addGap(18, 18, 18)
                        .addComponent(E4Lathos1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(E4Sosto2)
                        .addGap(18, 18, 18)
                        .addComponent(E4Lathos2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(E4Sosto3)
                        .addGap(18, 18, 18)
                        .addComponent(E4Lathos3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(Submit4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E4Btn1n1)
                    .addComponent(E4Btn1n2)
                    .addComponent(E4Btn1n3)
                    .addComponent(E4Btn1n4))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E4Btn2n1)
                    .addComponent(E4Btn2n2)
                    .addComponent(E4Btn2n3)
                    .addComponent(E4Btn2n4))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E4Sosto1)
                    .addComponent(E4Lathos1))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E4Sosto2)
                    .addComponent(E4Lathos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E4Sosto3)
                    .addComponent(E4Lathos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Submit4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Submit4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit4BtnActionPerformed
        // TODO add your handling code here:
        ExamGui frameT = new ExamGui();
        frameT.setTitle("Διαγώνισμα");
        frameT.setVisible(true);
        frameT.setResizable(true);
        frameT.setLocationRelativeTo(null);
        super.dispose();
        System.out.print("Exam4GUI: " + ans1 + ans2 + ans3 + ans4 + ans5);
        CreateFile.create();
        WriteToFile.write("Exam4GUI: ");
        WriteToFile.write(ans1 + ans2 + ans3 + ans4 + ans5);
    }//GEN-LAST:event_Submit4BtnActionPerformed

    private void E4Btn1n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn1n1ActionPerformed
        // TODO add your handling code here:
        ans1="true1,";
    }//GEN-LAST:event_E4Btn1n1ActionPerformed

    private void E4Btn1n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn1n2ActionPerformed
        // TODO add your handling code here:
        ans1="false1,";
    }//GEN-LAST:event_E4Btn1n2ActionPerformed

    private void E4Btn1n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn1n3ActionPerformed
        // TODO add your handling code here:
        ans1="false1,";
    }//GEN-LAST:event_E4Btn1n3ActionPerformed

    private void E4Btn1n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn1n4ActionPerformed
        // TODO add your handling code here:
        ans1="false1,";
    }//GEN-LAST:event_E4Btn1n4ActionPerformed

    private void E4Btn2n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn2n1ActionPerformed
        // TODO add your handling code here:
        ans2="false2,";
    }//GEN-LAST:event_E4Btn2n1ActionPerformed

    private void E4Btn2n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn2n2ActionPerformed
        // TODO add your handling code here:
        ans2="false2,";
    }//GEN-LAST:event_E4Btn2n2ActionPerformed

    private void E4Btn2n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn2n3ActionPerformed
        // TODO add your handling code here:
        ans2="false2,";
    }//GEN-LAST:event_E4Btn2n3ActionPerformed

    private void E4Btn2n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Btn2n4ActionPerformed
        // TODO add your handling code here:
        ans2="true2,";
    }//GEN-LAST:event_E4Btn2n4ActionPerformed

    private void E4Sosto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Sosto1ActionPerformed
        // TODO add your handling code here:
        ans3="true3,";
    }//GEN-LAST:event_E4Sosto1ActionPerformed

    private void E4Lathos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Lathos1ActionPerformed
        // TODO add your handling code here:
        ans3="false3,";
    }//GEN-LAST:event_E4Lathos1ActionPerformed

    private void E4Sosto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Sosto2ActionPerformed
        // TODO add your handling code here:
        ans4="false4,";
    }//GEN-LAST:event_E4Sosto2ActionPerformed

    private void E4Lathos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Lathos2ActionPerformed
        // TODO add your handling code here:
        ans4="true4,";
    }//GEN-LAST:event_E4Lathos2ActionPerformed

    private void E4Sosto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Sosto3ActionPerformed
        // TODO add your handling code here:
        ans5="false5";
    }//GEN-LAST:event_E4Sosto3ActionPerformed

    private void E4Lathos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4Lathos3ActionPerformed
        // TODO add your handling code here:
        ans5="true5";
    }//GEN-LAST:event_E4Lathos3ActionPerformed

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
            java.util.logging.Logger.getLogger(Exam4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam4GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton E4Btn1n1;
    private javax.swing.JRadioButton E4Btn1n2;
    private javax.swing.JRadioButton E4Btn1n3;
    private javax.swing.JRadioButton E4Btn1n4;
    private javax.swing.JRadioButton E4Btn2n1;
    private javax.swing.JRadioButton E4Btn2n2;
    private javax.swing.JRadioButton E4Btn2n3;
    private javax.swing.JRadioButton E4Btn2n4;
    private javax.swing.JRadioButton E4Lathos1;
    private javax.swing.JRadioButton E4Lathos2;
    private javax.swing.JRadioButton E4Lathos3;
    private javax.swing.JRadioButton E4Sosto1;
    private javax.swing.JRadioButton E4Sosto2;
    private javax.swing.JRadioButton E4Sosto3;
    private javax.swing.ButtonGroup E4buttonGroup1;
    private javax.swing.JButton Submit4Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup Ε4buttonGroup2;
    private javax.swing.ButtonGroup Ε4buttonGroup3;
    private javax.swing.ButtonGroup Ε4buttonGroup4;
    private javax.swing.ButtonGroup Ε4buttonGroup5;
    // End of variables declaration//GEN-END:variables
}
