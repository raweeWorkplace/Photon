/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;


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

/**
 *
 * @author ranjan
 */
public class homeFrame extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    
    stockInPanel sip;
    homePanel hop;
    dailyReportPanel ssp;
    billingPanel salesPanel;
    stockDetailPanel rateMgmnt;
    clientRegPanel clientReg;
    purchaseVoucherPanel purVouPanel;
    GridBagConstraints gbr;
    public String globalVariableCashier;
    BufferedImage bi;
    photoSizeDetailPanel sizeEntry;
    clientReportPanel client_report;
    clientRateManagementPanel cli;
    aboutPanel about;

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
            
            bi = ImageIO.read(getClass().getResource("/BillingIcon/invoice.png"));
            this.setIconImage(bi);
            this.setTitle("Lab Assistant || HICOLA COLOUR LAB");
        } catch (IOException ex) {
            Logger.getLogger(homeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        getTodayDate();
        displayPanel.setLayout(layout);
        
        init();
        addPanel();
        state();
        hop.setVisible(true);
    }
    
    private void init(){
        gbr= new GridBagConstraints();
        sip = new stockInPanel();
        hop = new homePanel();
        ssp = new dailyReportPanel();
        salesPanel = new billingPanel();
        rateMgmnt = new stockDetailPanel();
        clientReg = new clientRegPanel();
        purVouPanel = new purchaseVoucherPanel();
        sizeEntry = new photoSizeDetailPanel();
        client_report = new clientReportPanel();
        cli = new clientRateManagementPanel();
        about = new aboutPanel();

        
    }
    
    private void addPanel(){
        displayPanel.add(sip, gbr);
        displayPanel.add(hop,gbr);
        displayPanel.add(ssp,gbr);
        displayPanel.add(salesPanel,gbr);
        displayPanel.add(rateMgmnt,gbr);
        displayPanel.add(clientReg,gbr);
        displayPanel.add(purVouPanel,gbr);
        displayPanel.add(sizeEntry,gbr);
        displayPanel.add(client_report,gbr);
        displayPanel.add(cli,gbr);
        displayPanel.add(about,gbr);
                
    }
    
    private void state(){
        
        sip.setVisible(false);
        hop.setVisible(false);
        ssp.setVisible(false);
        salesPanel.setVisible(false);
        rateMgmnt.setVisible(false);
        clientReg.setVisible(false);
        purVouPanel.setVisible(false);
        sizeEntry.setVisible(false);
        client_report.setVisible(false);
        cli.setVisible(false);
        about.setVisible(false);
    }
    
    private void getTodayDate(){
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblTodayDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        displayPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        phamaHome = new javax.swing.JMenuItem();
        salesMenu = new javax.swing.JMenu();
        Billing = new javax.swing.JMenuItem();
        purchaseMenu = new javax.swing.JMenu();
        stockIn = new javax.swing.JMenuItem();
        masterMenu = new javax.swing.JMenu();
        clientMgmnt = new javax.swing.JMenuItem();
        salesRefund = new javax.swing.JMenuItem();
        rateManagement1 = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        clientReport = new javax.swing.JMenuItem();
        dailyReport = new javax.swing.JMenuItem();
        stockMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        LogOff = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);

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
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTodayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(lblTodayDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, lblUser});

        displayPanel.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1242, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(displayPanel);

        jMenuBar1.setBackground(java.awt.Color.lightGray);
        jMenuBar1.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionForeground"));
        jMenuBar1.setMargin(new java.awt.Insets(0, 10, 0, 0));

        homeMenu.setBackground(java.awt.Color.white);
        homeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/home.png"))); // NOI18N
        homeMenu.setText("HOME");
        homeMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        homeMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                homeMenuFocusGained(evt);
            }
        });
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuActionPerformed(evt);
            }
        });

        phamaHome.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        phamaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/house.png"))); // NOI18N
        phamaHome.setText("Phama Home");
        phamaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phamaHomeActionPerformed(evt);
            }
        });
        homeMenu.add(phamaHome);

        jMenuBar1.add(homeMenu);

        salesMenu.setBackground(java.awt.Color.white);
        salesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/invoice.png"))); // NOI18N
        salesMenu.setText("SALES");
        salesMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        Billing.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        Billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/slot-machine.png"))); // NOI18N
        Billing.setText("Billing");
        Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingActionPerformed(evt);
            }
        });
        salesMenu.add(Billing);

        jMenuBar1.add(salesMenu);

        purchaseMenu.setBackground(java.awt.Color.white);
        purchaseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PanelForms/Test/icon/put-in-cart.png"))); // NOI18N
        purchaseMenu.setText("PURCHASE");
        purchaseMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        stockIn.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        stockIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/stock.png"))); // NOI18N
        stockIn.setText("Stocking In");
        stockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockInActionPerformed(evt);
            }
        });
        purchaseMenu.add(stockIn);

        jMenuBar1.add(purchaseMenu);

        masterMenu.setBackground(java.awt.Color.white);
        masterMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PanelForms/Test/icon/man-sitting-on-office-desk-working-in-front-a-monitor-of-computer.png"))); // NOI18N
        masterMenu.setText("MASTER");
        masterMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        clientMgmnt.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        clientMgmnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/add-profile.png"))); // NOI18N
        clientMgmnt.setText("Client Management");
        clientMgmnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientMgmntActionPerformed(evt);
            }
        });
        masterMenu.add(clientMgmnt);

        salesRefund.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        salesRefund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/scale.png"))); // NOI18N
        salesRefund.setText("Size Entry");
        salesRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesRefundActionPerformed(evt);
            }
        });
        masterMenu.add(salesRefund);

        rateManagement1.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        rateManagement1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/1488294545_Artboard_1.png"))); // NOI18N
        rateManagement1.setText("Client Rate Management");
        rateManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateManagement1ActionPerformed(evt);
            }
        });
        masterMenu.add(rateManagement1);

        jMenuBar1.add(masterMenu);

        reportMenu.setBackground(java.awt.Color.white);
        reportMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PanelForms/Test/icon/payment-method.png"))); // NOI18N
        reportMenu.setText("REPORT");
        reportMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        clientReport.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        clientReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/clipboard.png"))); // NOI18N
        clientReport.setText("Client Report");
        clientReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientReportActionPerformed(evt);
            }
        });
        reportMenu.add(clientReport);

        dailyReport.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        dailyReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/clipboard.png"))); // NOI18N
        dailyReport.setText("Daily Report");
        dailyReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyReportActionPerformed(evt);
            }
        });
        reportMenu.add(dailyReport);

        stockMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        stockMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/clipboard.png"))); // NOI18N
        stockMenu.setText("Stock Report");
        stockMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMenuActionPerformed(evt);
            }
        });
        reportMenu.add(stockMenu);

        jMenuBar1.add(reportMenu);

        exitMenu.setBackground(java.awt.Color.white);
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/logout.png"))); // NOI18N
        exitMenu.setText("EXIT");
        exitMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        LogOff.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        LogOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/log-out.png"))); // NOI18N
        LogOff.setText("Log Off");
        LogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOffActionPerformed(evt);
            }
        });
        exitMenu.add(LogOff);

        jMenuItem1.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PanelForms/Test/icon/client-profile.png"))); // NOI18N
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        exitMenu.add(jMenuItem1);

        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesRefundActionPerformed
        state();
        sizeEntry.setVisible(true);
        sizeEntry.txtsize.requestFocus();
    }//GEN-LAST:event_salesRefundActionPerformed

    private void stockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockInActionPerformed
       state();
       sip.setVisible(true);
       sip.txtItemName.requestFocus();
    }//GEN-LAST:event_stockInActionPerformed

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
       
    }//GEN-LAST:event_homeMenuActionPerformed

    private void homeMenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeMenuFocusGained
       
    }//GEN-LAST:event_homeMenuFocusGained

    private void dailyReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyReportActionPerformed
       state();
       ssp.setVisible(true);
    }//GEN-LAST:event_dailyReportActionPerformed

    private void clientReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientReportActionPerformed
       state();
       client_report.setVisible(true);
       client_report.txtCompanyName.requestFocus();
       
    }//GEN-LAST:event_clientReportActionPerformed

    private void clientMgmntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientMgmntActionPerformed
        state();
        clientReg.setVisible(true);
        clientReg.cmbCliebtType.requestFocus();
    }//GEN-LAST:event_clientMgmntActionPerformed

    private void phamaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phamaHomeActionPerformed
//        init();
//        displayPanel.removeAll();
//        addPanel();
        state();
        hop.setVisible(true);
        hop.txtBilNo.requestFocus();
    }//GEN-LAST:event_phamaHomeActionPerformed

    private void LogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOffActionPerformed
        System.exit(0);
    }//GEN-LAST:event_LogOffActionPerformed

    private void BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingActionPerformed
        state();
        salesPanel.setVisible(true);
        salesPanel.txtCustName.requestFocus();
    }//GEN-LAST:event_BillingActionPerformed

    private void rateManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateManagement1ActionPerformed
        state();
        cli.setVisible(true);
        cli.txtCompanyName.requestFocus();
    }//GEN-LAST:event_rateManagement1ActionPerformed

    private void stockMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMenuActionPerformed
        state();
        rateMgmnt.setVisible(true);
        rateMgmnt.btnSearch.requestFocus();
    }//GEN-LAST:event_stockMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        state();
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Billing;
    private javax.swing.JMenuItem LogOff;
    private javax.swing.JMenuItem clientMgmnt;
    private javax.swing.JMenuItem clientReport;
    private javax.swing.JMenuItem dailyReport;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTodayDate;
    private javax.swing.JLabel lblUser;
    public javax.swing.JMenu masterMenu;
    private javax.swing.JMenuItem phamaHome;
    public javax.swing.JMenu purchaseMenu;
    private javax.swing.JMenuItem rateManagement1;
    public javax.swing.JMenu reportMenu;
    private javax.swing.JMenu salesMenu;
    private javax.swing.JMenuItem salesRefund;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JMenuItem stockIn;
    private javax.swing.JMenuItem stockMenu;
    // End of variables declaration//GEN-END:variables
}
