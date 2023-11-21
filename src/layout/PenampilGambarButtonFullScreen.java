/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author antonid
 */
public class PenampilGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarButtonFullScreen
     */
    public PenampilGambarButtonFullScreen() {
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

        btnPanel = new javax.swing.JPanel();
        btnMS = new javax.swing.JButton();
        btnMP = new javax.swing.JButton();
        btnBotan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imgPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMS = new javax.swing.JLabel();
        lblMP = new javax.swing.JLabel();
        lblBotan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnPanel.setBackground(new java.awt.Color(204, 255, 204));
        btnPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penampil Gambar Button (FullScreen Undecorated)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 12))); // NOI18N
        btnPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btnMS.setText("MS");
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });
        btnPanel.add(btnMS);

        btnMP.setText("MP");
        btnMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPActionPerformed(evt);
            }
        });
        btnPanel.add(btnMP);

        btnBotan.setText("Botan");
        btnBotan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotanActionPerformed(evt);
            }
        });
        btnPanel.add(btnBotan);

        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnPanel.add(btnExit);

        getContentPane().add(btnPanel, java.awt.BorderLayout.PAGE_START);

        imgPanel.setBackground(new java.awt.Color(255, 255, 204));
        imgPanel.setLayout(new java.awt.CardLayout());
        imgPanel.add(jLabel1, "card5");

        lblMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MS.png"))); // NOI18N
        lblMS.setName(""); // NOI18N
        imgPanel.add(lblMS, "0");
        lblMS.getAccessibleContext().setAccessibleName("0");
        lblMS.getAccessibleContext().setAccessibleDescription("");

        lblMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MP.jpg"))); // NOI18N
        imgPanel.add(lblMP, "1");
        lblMP.getAccessibleContext().setAccessibleName("1");

        lblBotan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Botan.png"))); // NOI18N
        imgPanel.add(lblBotan, "2");
        lblBotan.getAccessibleContext().setAccessibleName("2");

        getContentPane().add(imgPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imgPanel.getLayout()); 
        cl.show(imgPanel, "0");
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imgPanel.getLayout()); 
        cl.show(imgPanel, "1");
    }//GEN-LAST:event_btnMPActionPerformed

    private void btnBotanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotanActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imgPanel.getLayout()); 
        cl.show(imgPanel, "2");        
    }//GEN-LAST:event_btnBotanActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(PenampilGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PenampilGambarButtonFullScreen().setVisible(true);
                
                PenampilGambarButtonFullScreen fullFrame = new PenampilGambarButtonFullScreen();
                
                GraphicsDevice device =
                    GraphicsEnvironment.getLocalGraphicsEnvironment ().getDefaultScreenDevice(); device.setFullScreenWindow (fullFrame);
                fullFrame.setVisible (true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBotan;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMP;
    private javax.swing.JButton btnMS;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBotan;
    private javax.swing.JLabel lblMP;
    private javax.swing.JLabel lblMS;
    // End of variables declaration//GEN-END:variables
}
