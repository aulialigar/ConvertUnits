/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertunits;

/**
 *
 * @author Smktelkom
 */
public class currency extends javax.swing.JFrame {

    /**
     * Creates new form c
     */
    public currency() {
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

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pilihan1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        inputm = new javax.swing.JTextField();
        temp4 = new javax.swing.JComboBox<>();
        outputm = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/D:/Make it FUN/XI/PBO/SM2/small.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 180, 110, 40);

        jLabel4.setFont(new java.awt.Font("Arrow Crafter", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-----^");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 110, 40, 30);

        pilihan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Rp.) Rupiah", "($) Dollar", "(€) Euro", "(SR) Riyal", "(¥) Yen" }));
        getContentPane().add(pilihan1);
        pilihan1.setBounds(20, 90, 110, 30);

        jButton2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/D:/Make it FUN/XI/PBO/SM2/ba.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 240, 110, 40);
        getContentPane().add(inputm);
        inputm.setBounds(20, 110, 110, 40);

        temp4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Rp.) Rupiah", "($) Dollar", "(€) Euro", "(SR) Riyal", "(¥) Yen" }));
        getContentPane().add(temp4);
        temp4.setBounds(180, 90, 110, 30);

        outputm.setEditable(false);
        getContentPane().add(outputm);
        outputm.setBounds(180, 110, 110, 40);

        jPanel2.setBackground(new java.awt.Color(244, 192, 66));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 96, 33));
        jLabel2.setText("Currency");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(150, 20, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 420, 70);

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/D:/Downloads/bahan pbo/sahamm.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 80, 390, 240);

        jPanel1.setBackground(new java.awt.Color(9, 110, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 420, 230);

        setSize(new java.awt.Dimension(436, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String atasm = pilihan1.getSelectedItem().toString();
        String bawahm = temp4.getSelectedItem().toString();
        float Input = Float.parseFloat(inputm.getText()) ;
        float Hasil;  
        
        //Rupiah
         if(pilihan1.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasil = Input;
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="($) Dollar"){
        Hasil = (float) (Input/13157.8947);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(€) Euro"){
        Hasil = (float) (Input/14534.8684);
        outputm.setText(String.valueOf(Hasil));}
         
        if (pilihan1.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasil = (float) (Input/3519.19737);
        outputm.setText(String.valueOf(Hasil));}
         
        if (pilihan1.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasil = (float) (Input/125.934211);
        outputm.setText(String.valueOf(Hasil));}
         
        //Dollar
        if (pilihan1.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="($) Dollar"){
        Hasil = Input;
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasil = (float) (Input*13157.8947);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(€) Euro"){
        Hasil = (float) (Input*0.905);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasil = (float) (Input*3.75);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasil = (float) (Input*104.5);
        outputm.setText(String.valueOf(Hasil));}
        
        //Euro
        if (pilihan1.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(€) Euro"){
        Hasil = Input;
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasil = (float) (Input*14534.8684);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="($) Dollar"){
        Hasil = (float) (Input*1.10465);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasil = (float) (Input*4.142);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasil = (float) (Input*115.416);
        outputm.setText(String.valueOf(Hasil));}
        
        //Riyal
         if (pilihan1.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasil = Input;
        outputm.setText(String.valueOf(Hasil));}
         
         if (pilihan1.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasil = (float) (Input*3519.19737);
        outputm.setText(String.valueOf(Hasil));}
         
         if (pilihan1.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="($) Dollar"){
        Hasil = (float) (Input*0.27);
        outputm.setText(String.valueOf(Hasil));}
         
         if (pilihan1.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(€) Euro"){
        Hasil = (float) (Input*0.24);
        outputm.setText(String.valueOf(Hasil));}
         
         if (pilihan1.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasil = (float) (Input*27.865);
        outputm.setText(String.valueOf(Hasil));}
         
        //Yen
        if (pilihan1.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasil = Input;
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasil = Input*126;
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="($) Dollar"){
        Hasil = (float) (Input*0.009571);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(€) Euro"){
        Hasil = (float) (Input*0.008664);
        outputm.setText(String.valueOf(Hasil));}
        
        if (pilihan1.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasil = (float) (Input*0.035886);
        outputm.setText(String.valueOf(Hasil));}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField outputm;
    private javax.swing.JComboBox<String> pilihan1;
    private javax.swing.JComboBox<String> temp4;
    // End of variables declaration//GEN-END:variables
}
