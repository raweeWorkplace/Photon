/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author idiotbox
 */
public class masterPanel extends javax.swing.JPanel {
    
    GridBagLayout layout = new GridBagLayout();
    clientRegPanel clientReg;
    GridBagConstraints gridBag;
    photoSizeDetailPanel sizeEntry;
    clientRateManagementPanel clientRate;

    /**
     * Creates new form masterPanel
     */
    public masterPanel() {
        initComponents();
        displayPanel.setLayout(layout);
        init();
        addPanel();
        state();
        clientReg.setVisible(true);
        clientReg.cmbCliebtType.requestFocus();
    }

    private void init() {
        gridBag = new GridBagConstraints();
        clientReg = new clientRegPanel();
        sizeEntry = new photoSizeDetailPanel();
        clientRate = new clientRateManagementPanel();

    }

    private void addPanel() {
        displayPanel.add(clientReg, gridBag);
        displayPanel.add(sizeEntry, gridBag);
        displayPanel.add(clientRate, gridBag);

    }

    private void state() {
        
        clientReg.setVisible(false);
        sizeEntry.setVisible(false);
        clientRate.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clientPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ratePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(java.awt.Color.gray);

        displayPanel.setBackground(java.awt.Color.lightGray);
        displayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        imagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePanelMouseClicked(evt);
            }
        });
        imagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/icons8-picture-60.png"))); // NOI18N
        imagePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 68, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel5.setText("Picture");
        imagePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel6.setText("Management");
        imagePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        clientPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientPanelMouseClicked(evt);
            }
        });
        clientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/icons8-client-management-60.png"))); // NOI18N
        clientPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 68, -1));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel8.setText("Client ");
        clientPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, -1));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel9.setText("Management");
        clientPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        ratePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratePanelMouseClicked(evt);
            }
        });
        ratePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/icons8-average-60.png"))); // NOI18N
        ratePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 68, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel2.setText("Rate ");
        ratePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel3.setText("Management");
        ratePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(clientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ratePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clientPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientPanelMouseClicked
        state();
        clientReg.setVisible(true);
        clientReg.cmbCliebtType.requestFocus();
    }//GEN-LAST:event_clientPanelMouseClicked

    private void imagePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanelMouseClicked
        state();
        sizeEntry.setVisible(true);
        sizeEntry.txtsize.requestFocus();
        
    }//GEN-LAST:event_imagePanelMouseClicked

    private void ratePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratePanelMouseClicked
        state();
        clientRate.setVisible(true);
        clientRate.txtCompanyName.requestFocus();
    }//GEN-LAST:event_ratePanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clientPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel ratePanel;
    // End of variables declaration//GEN-END:variables
}
