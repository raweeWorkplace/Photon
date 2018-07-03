/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Dao.DataBase_Connection;
import PanelForms.Test.Encryption;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ranjan
 */
public class rateManagementPanel extends javax.swing.JPanel {
    DataBase_Connection dao;
    protected Statement smtInstance;
    protected Connection conInstance;
    functionTools fnTools;
    DefaultTableModel rate_table_model;
    
    /**
     * Creates new form rateManagementPanel
     */
    public rateManagementPanel() {
        initComponents();
        dao = new DataBase_Connection();
        conInstance = dao.getConnection();
        loginDisplayPanel.setVisible(false);
        btnLogOff.setVisible(false);
        fnTools = new functionTools();
        
    }
    
    
  
    
    private void resetStockDetails(){
        txtItemName.setText("");
        txtMRP.setText("");
        txtCP.setText("");
        txtWholeSellMargin.setText("");
        txtWSP.setText("");
        txtSN.setText("");
    }
    
    
     private void fill_rate_table(){
       rate_table_model  =(DefaultTableModel)rateTable.getModel();
       String values = txtItemName.getText();
        try {
            
            String  sql1= "select * from instock_entry_table as ins, voucher_table as vou where ins.voucherNo = vou.voucherNo and item_name Like '"+values+"%' order by id";
            Statement st = conInstance.createStatement();
            ResultSet rs1 = st.executeQuery(sql1);
                fnTools.remove_table_data(rate_table_model,rateTable);
                int i = 0;
                while ( rs1.next() ) //step through the result set
                {
                    i++;//count raws
                }
                if (i>0){
                        int j= 0;
                        rs1.beforeFirst();
                        
                        while (rs1.next()) {
                                      
                    String A = rs1.getString("id");
                    String com = rs1.getString("company_name");
                    String B = rs1.getString("item_name");
                    String C = rs1.getString("mrp");
                    String D = rs1.getString("rate");
                    String E = rs1.getString("wholesell_price");
                    rate_table_model.insertRow(j,new Object[]{A,com,B,C,D,E});
                 
                    j++;
                }
                }
            
             
         } catch (SQLException ex) {
           // Logger.getLogger(Pharmacy_In_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
              
}   
        
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginDisplayPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        rateTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtWholeSellMargin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        txtMRP = new javax.swing.JTextField();
        txtWSP = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnLogOff = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUname_txt = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        pwdPassword = new javax.swing.JPasswordField();

        setBackground(java.awt.Color.darkGray);

        loginDisplayPanel.setBackground(java.awt.Color.lightGray);
        loginDisplayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel1.setText("Item Name :");

        txtItemName.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });
        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNameKeyReleased(evt);
            }
        });

        rateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Company Name", "Item Name", "MRP", "Cost Price", "wholesell Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rateTableMouseClicked(evt);
            }
        });
        rateTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rateTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(rateTable);
        if (rateTable.getColumnModel().getColumnCount() > 0) {
            rateTable.getColumnModel().getColumn(0).setResizable(false);
            rateTable.getColumnModel().getColumn(0).setPreferredWidth(8);
            rateTable.getColumnModel().getColumn(1).setResizable(false);
            rateTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            rateTable.getColumnModel().getColumn(2).setResizable(false);
            rateTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            rateTable.getColumnModel().getColumn(3).setResizable(false);
            rateTable.getColumnModel().getColumn(3).setPreferredWidth(8);
            rateTable.getColumnModel().getColumn(4).setResizable(false);
            rateTable.getColumnModel().getColumn(4).setPreferredWidth(8);
            rateTable.getColumnModel().getColumn(5).setResizable(false);
            rateTable.getColumnModel().getColumn(5).setPreferredWidth(8);
        }

        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel4.setText("ID :");

        txtSN.setEditable(false);
        txtSN.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        txtSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel5.setText("MRP :");

        jLabel14.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel14.setText("Wholeseller Margin :");

        txtWholeSellMargin.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        txtWholeSellMargin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWholeSellMarginKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWholeSellMarginKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel6.setText("Cost Price :");

        txtCP.setEditable(false);
        txtCP.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel11.setText("Wholesell Price :");

        UpdateButton.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        txtMRP.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        txtMRP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMRPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMRPKeyReleased(evt);
            }
        });

        txtWSP.setEditable(false);
        txtWSP.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        txtWSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWSPKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout loginDisplayPanelLayout = new javax.swing.GroupLayout(loginDisplayPanel);
        loginDisplayPanel.setLayout(loginDisplayPanelLayout);
        loginDisplayPanelLayout.setHorizontalGroup(
            loginDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDisplayPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSN, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMRP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWholeSellMargin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWSP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(loginDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(loginDisplayPanelLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginDisplayPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel14});

        loginDisplayPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCP, txtMRP, txtSN, txtWSP, txtWholeSellMargin});

        loginDisplayPanelLayout.setVerticalGroup(
            loginDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDisplayPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(loginDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txtMRP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtWholeSellMargin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtWSP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        loginDisplayPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel14, jLabel4, jLabel5, jLabel6, txtCP, txtMRP, txtSN, txtWSP, txtWholeSellMargin});

        jPanel1.setBackground(new java.awt.Color(72, 89, 253));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Inventory Rate Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(327, 327, 327))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanel2.setBackground(new java.awt.Color(119, 132, 255));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Password :");

        btnLogOff.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        btnLogOff.setForeground(java.awt.Color.blue);
        btnLogOff.setText("LogOff");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Username :");

        txtUname_txt.setEditable(false);
        txtUname_txt.setText("admin");
        txtUname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUname_txtActionPerformed(evt);
            }
        });

        btnLogIn.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        btnLogIn.setForeground(java.awt.Color.blue);
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        pwdPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtUname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnLogIn)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOff))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, txtUname_txt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginDisplayPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased
        // TODO add your handling code here:
        fill_rate_table();
    }//GEN-LAST:event_txtItemNameKeyReleased

    private void txtWholeSellMarginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWholeSellMarginKeyPressed
       int key = evt.getKeyCode();
        char car = evt.getKeyChar();
        if ((key == KeyEvent.VK_ENTER)&&(!txtMRP.getText().isEmpty())) {
            UpdateButton.requestFocus();
        }
        else if((car < '0'|| car > '9') && txtWholeSellMargin.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Invalid Insert");
            txtWholeSellMargin.setText("");
        }
        else if((car < '0'|| car > '9') && (car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Invalid Insert");
            txtWholeSellMargin.setText("");
        }
    }//GEN-LAST:event_txtWholeSellMarginKeyPressed

    private void txtWholeSellMarginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWholeSellMarginKeyReleased
        if ((!"".equals(txtWholeSellMargin.getText())) && (!"".equals(txtMRP.getText()))) {
            float tax = Float.parseFloat(txtWholeSellMargin.getText());
            float taxtotal = Float.parseFloat(txtMRP.getText());
            float total = taxtotal-taxtotal * tax/100;//tax*Double.parseDouble(lblSubTotal.getText())/100;
            txtWSP.setText(new DecimalFormat("##.##").format(total));
            //lblDue.setText(new DecimalFormat("##.##").format(total));

        }
    }//GEN-LAST:event_txtWholeSellMarginKeyReleased

    private void txtSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNActionPerformed

    private void rateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rateTableMouseClicked
       
    }//GEN-LAST:event_rateTableMouseClicked

    private void txtMRPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMRPKeyReleased
        
        if ((!"".equals(txtWholeSellMargin.getText())) && (!"".equals(txtMRP.getText()))) {
            float tax = Float.parseFloat(txtWholeSellMargin.getText());
            float taxtotal = Float.parseFloat(txtMRP.getText());
            float total = taxtotal-taxtotal * tax/100;//tax*Double.parseDouble(lblSubTotal.getText())/100;
            txtWSP.setText(new DecimalFormat("##.##").format(total));
            //lblDue.setText(new DecimalFormat("##.##").format(total));

        }
    }//GEN-LAST:event_txtMRPKeyReleased

    private void txtWSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWSPKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWSPKeyReleased

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(txtMRP.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Enter MRP");
         txtMRP.requestFocus();
        }
       else if(txtSN.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Enter Serial Number");
         txtSN.requestFocus();
        }
        else if(txtWholeSellMargin.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Enter Whole Seller Margin");
         txtWholeSellMargin.requestFocus();
        }
        else {
        try {
            String updateQuery = "UPDATE instock_entry_table SET mrp = '"+txtMRP.getText()+"',wholesell_price='"+txtWSP.getText()+"' WHERE id ='"+txtSN.getText()+"' ";
            smtInstance = conInstance.createStatement();
           int r = smtInstance.executeUpdate(updateQuery);
           if(r!=0){
               JOptionPane.showMessageDialog(null, "Rate Updated");
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(rateManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        fill_rate_table();
        resetStockDetails();
        txtItemName.requestFocus();
        }
        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void txtUname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUname_txtActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        if(pwdPassword.getPassword().length>0){
        try {
            String user = txtUname_txt.getText();
            String password1 = new String(pwdPassword.getPassword());
            String password = Encryption.SHA1(password1);
            String sql = "select UserId,Password from Login_tbl where UserName = '"+user+"'";
            smtInstance = conInstance.createStatement();
            ResultSet rs = smtInstance.executeQuery(sql);
            while (rs.next()) {

                String usname = rs.getString(1);
                String pswrd = rs.getString(2);

                if (user.equals(usname) && password.equals(pswrd)) {
                    
                    loginDisplayPanel.setVisible(true);
                    btnLogOff.setVisible(true);
                    btnLogIn.setVisible(false);
                    pwdPassword.setText("");
                    txtItemName.requestFocus();
                    

                } else {
                    //System.out.println("enter the valid username and password");
                    JOptionPane.showMessageDialog(this, "Incorrect login or password",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    pwdPassword.setText("");
                    pwdPassword.requestFocus();
                            
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(rateManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtMRPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMRPKeyPressed
        int key = evt.getKeyCode();
        char car = evt.getKeyChar();
        if ((key == KeyEvent.VK_ENTER)&&(!txtMRP.getText().isEmpty())) {
            txtWholeSellMargin.requestFocus();
        }
        
        else if((car < '0'|| car > '9') && txtMRP.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Invalid Insert");
            txtMRP.setText("");
        }
        else if((car < '0'|| car > '9') && (car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Invalid Insert");
            txtMRP.setText("");
        }
    }//GEN-LAST:event_txtMRPKeyPressed

    private void pwdPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdPasswordKeyPressed
        int key = evt.getKeyCode();
        
        if ((key == KeyEvent.VK_ENTER)&&(pwdPassword.getPassword().length>0)) {
            btnLogIn.requestFocus();
        }
    }//GEN-LAST:event_pwdPasswordKeyPressed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
                    loginDisplayPanel.setVisible(false);
                    btnLogOff.setVisible(false);
                    btnLogIn.setVisible(true);
                    pwdPassword.setText("");
                    pwdPassword.requestFocus();
    }//GEN-LAST:event_btnLogOffActionPerformed

    private void txtItemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyPressed
        int key = evt.getKeyCode();
        
        if ((key == KeyEvent.VK_DOWN)&&(!txtItemName.getText().isEmpty())) {
            rateTable.requestFocus();
        }
    }//GEN-LAST:event_txtItemNameKeyPressed

    private void rateTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateTableKeyPressed
        int key = evt.getKeyCode();
        if ((key == KeyEvent.VK_ENTER)&&(!txtItemName.getText().isEmpty())) {
        int index = rateTable.getSelectedRow();
        rate_table_model  =(DefaultTableModel)rateTable.getModel();
        String Name = rate_table_model.getValueAt(index, 2).toString();
        String sn = rate_table_model.getValueAt(index, 0).toString();
        String Mrp = rate_table_model.getValueAt(index, 3).toString();
        String rate = rate_table_model.getValueAt(index, 4).toString();
        txtItemName.setText(Name);
        txtSN.setText(sn);
        txtCP.setText(rate);
        txtMRP.setText(Mrp);
        txtMRP.requestFocus();
      }
    }//GEN-LAST:event_rateTableKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnLogOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel loginDisplayPanel;
    public javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTable rateTable;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtMRP;
    private javax.swing.JTextField txtSN;
    private javax.swing.JTextField txtUname_txt;
    private javax.swing.JTextField txtWSP;
    private javax.swing.JTextField txtWholeSellMargin;
    // End of variables declaration//GEN-END:variables
}
