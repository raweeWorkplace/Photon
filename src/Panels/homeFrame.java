/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Test.purchaseVoucherPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author ranjan
 */
public class homeFrame extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();

    expencesPanel expences;
    homePanel home;
    billingPanel sales;
    GridBagConstraints gridBag;
    public String globalVariableCashier;
    BufferedImage bi;
    aboutPanel about;
    masterPanel master;
    reportPanel report;

    public String getGlobalVariableCashier() {
        return globalVariableCashier;
    }

    public void setGlobalVariableCashier(String globalVariableCashier) {
        this.globalVariableCashier = globalVariableCashier;
        lblUser.setText(getGlobalVariableCashier());
    }

    /**
     * Creates new form homeFrame
     */
    public homeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {

            bi = ImageIO.read(getClass().getResource("/BillingIcon/ICON.png"));
            this.setIconImage(bi);
            this.setTitle("PHOTON");
        } catch (IOException ex) {
            Logger.getLogger(homeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        getTodayDate();
        displayPanel.setLayout(layout);

        init();
        addPanel();
        state();
        home.setVisible(true);
    }

    private void init() {
        gridBag = new GridBagConstraints();
        expences = new expencesPanel();
        home = new homePanel();
        sales = new billingPanel();
        about = new aboutPanel();
        master = new masterPanel();
        report = new reportPanel();

    }

    private void addPanel() {
        displayPanel.add(expences, gridBag);
        displayPanel.add(home, gridBag);
        displayPanel.add(sales, gridBag);
        displayPanel.add(about, gridBag);
        displayPanel.add(master,gridBag);
        displayPanel.add(report,gridBag);

    }

    private void state() {

        expences.setVisible(false);
        home.setVisible(false);
        sales.setVisible(false);
        about.setVisible(false);
        master.setVisible(false);
        report.setVisible(false);
    }

    private void getTodayDate() {
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        //System.out.println(dateformat.format(cal.getTime()));

        lblTodayDate.setText(dateformat.format(cal.getTime()));

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
        jLabel9 = new javax.swing.JLabel();
        lblTodayDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        basePanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        billingPanel = new javax.swing.JPanel();
        labelBilling = new javax.swing.JLabel();
        expencePanel = new javax.swing.JPanel();
        labelExpences = new javax.swing.JLabel();
        masterPanel = new javax.swing.JPanel();
        labelMaster = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        labelReport = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        labelAbout = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        displayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.gray);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Date:");

        lblTodayDate.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblTodayDate.setForeground(java.awt.Color.white);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Welcome:");

        lblUser.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblUser.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(58, 58, 58)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 813, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblTodayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblTodayDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel9, lblTodayDate, lblUser});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        basePanel.setBackground(java.awt.Color.gray);

        sideBarPanel.setBackground(java.awt.Color.gray);

        homePanel.setBackground(java.awt.Color.lightGray);
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
        });
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHome.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelHome.setForeground(java.awt.Color.white);
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/house.png"))); // NOI18N
        labelHome.setText("HOME");
        labelHome.setToolTipText("");
        labelHome.setBorder(null);
        labelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHome.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        labelHome.setIconTextGap(8);
        labelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHomeMouseClicked(evt);
            }
        });
        homePanel.add(labelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 50));

        billingPanel.setBackground(java.awt.Color.lightGray);
        billingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingPanelMouseClicked(evt);
            }
        });
        billingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBilling.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelBilling.setForeground(java.awt.Color.white);
        labelBilling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/billing-icon.png"))); // NOI18N
        labelBilling.setText("BILLING");
        labelBilling.setAlignmentX(5.0F);
        labelBilling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBilling.setIconTextGap(8);
        labelBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBillingMouseClicked(evt);
            }
        });
        billingPanel.add(labelBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 140, 50));

        expencePanel.setBackground(java.awt.Color.lightGray);
        expencePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expencePanelMouseClicked(evt);
            }
        });

        labelExpences.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelExpences.setForeground(java.awt.Color.white);
        labelExpences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/expences-icon.png"))); // NOI18N
        labelExpences.setText("EXPENCE");
        labelExpences.setAlignmentX(5.0F);
        labelExpences.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExpences.setIconTextGap(8);
        labelExpences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExpencesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout expencePanelLayout = new javax.swing.GroupLayout(expencePanel);
        expencePanel.setLayout(expencePanelLayout);
        expencePanelLayout.setHorizontalGroup(
            expencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expencePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelExpences, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        expencePanelLayout.setVerticalGroup(
            expencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExpences, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        masterPanel.setBackground(java.awt.Color.lightGray);
        masterPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterPanelMouseClicked(evt);
            }
        });
        masterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMaster.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelMaster.setForeground(java.awt.Color.white);
        labelMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/master-icon.png"))); // NOI18N
        labelMaster.setText("MASTER");
        labelMaster.setAlignmentX(5.0F);
        labelMaster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMaster.setIconTextGap(8);
        labelMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMasterMouseClicked(evt);
            }
        });
        masterPanel.add(labelMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

        reportPanel.setBackground(java.awt.Color.lightGray);
        reportPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportPanelMouseClicked(evt);
            }
        });
        reportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReport.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelReport.setForeground(java.awt.Color.white);
        labelReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/clipboard.png"))); // NOI18N
        labelReport.setText("REPORT");
        labelReport.setAlignmentX(5.0F);
        labelReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelReport.setIconTextGap(8);
        labelReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelReportMouseClicked(evt);
            }
        });
        reportPanel.add(labelReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

        exitPanel.setBackground(java.awt.Color.lightGray);
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
        });
        exitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelExit.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelExit.setForeground(java.awt.Color.white);
        labelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/logout.png"))); // NOI18N
        labelExit.setText("EXIT");
        labelExit.setAlignmentX(5.0F);
        labelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExit.setIconTextGap(8);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });
        exitPanel.add(labelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 50));

        aboutPanel.setBackground(java.awt.Color.lightGray);
        aboutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutPanelMouseClicked(evt);
            }
        });
        aboutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAbout.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelAbout.setForeground(java.awt.Color.white);
        labelAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/about-us-icon.png"))); // NOI18N
        labelAbout.setText("ABOUT");
        labelAbout.setAlignmentX(5.0F);
        labelAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAbout.setIconTextGap(8);
        labelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAboutMouseClicked(evt);
            }
        });
        labelAbout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelAboutKeyPressed(evt);
            }
        });
        aboutPanel.add(labelAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

        displayPanel.setBackground(java.awt.Color.lightGray);
        displayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        displayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPanel.setViewportView(displayPanel);

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(expencePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(homePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(billingPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(masterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(exitPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanel)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(basePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        state();
        home.setVisible(true);
        home.txtBilNo.requestFocus();
    }//GEN-LAST:event_labelHomeMouseClicked

    private void labelBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBillingMouseClicked
         state();
        sales.setVisible(true);
        sales.txtCustName.requestFocus(); 
    }//GEN-LAST:event_labelBillingMouseClicked

    private void labelExpencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExpencesMouseClicked
         state();
        expences.setVisible(true);
        expences.txtItemName.requestFocus(); 
    }//GEN-LAST:event_labelExpencesMouseClicked

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        
        int select = JOptionPane.showConfirmDialog(null, "Do you want to close the application ?", "Warning",JOptionPane.YES_NO_OPTION);
        if(select==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelAboutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelAboutKeyPressed
        
    }//GEN-LAST:event_labelAboutKeyPressed

    private void labelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAboutMouseClicked
        state();
        about.setVisible(true); 
    }//GEN-LAST:event_labelAboutMouseClicked

    private void labelMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMasterMouseClicked
        state();
       master.setVisible(true); 
    }//GEN-LAST:event_labelMasterMouseClicked

    private void labelReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReportMouseClicked
        state();
       report.setVisible(true); 
    }//GEN-LAST:event_labelReportMouseClicked

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        state();
        home.setVisible(true);
        home.txtBilNo.requestFocus();
    }//GEN-LAST:event_homePanelMouseClicked

    private void billingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingPanelMouseClicked
        state();
        sales.setVisible(true);
        sales.txtCustName.requestFocus(); 
    }//GEN-LAST:event_billingPanelMouseClicked

    private void reportPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPanelMouseClicked
        state();
       report.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_reportPanelMouseClicked

    private void masterPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterPanelMouseClicked
       state();
       master.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_masterPanelMouseClicked

    private void aboutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutPanelMouseClicked
        state();
        about.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_aboutPanelMouseClicked

    private void expencePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expencePanelMouseClicked
        state();
        expences.setVisible(true);
        expences.txtItemName.requestFocus(); 
               // TODO add your handling code here:
    }//GEN-LAST:event_expencePanelMouseClicked

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        int select = JOptionPane.showConfirmDialog(null, "Do you want to close the application ?", "Warning",JOptionPane.YES_NO_OPTION);
        if(select==JOptionPane.YES_OPTION){
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exitPanelMouseClicked

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
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billingPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JPanel expencePanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAbout;
    private javax.swing.JLabel labelBilling;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelExpences;
    private javax.swing.JLabel labelHome;
    public javax.swing.JLabel labelMaster;
    public javax.swing.JLabel labelReport;
    private javax.swing.JLabel lblTodayDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel masterPanel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel sideBarPanel;
    // End of variables declaration//GEN-END:variables
}
