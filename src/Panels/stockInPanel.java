/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import controller.functionTools;
import Dao.DataBase_Connection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ranjan
 */
public class stockInPanel extends javax.swing.JPanel {
    DataBase_Connection dao;
    protected Statement smtInstance;
    protected Connection conInstance;
    DefaultTableModel voucher_item_model;
    functionTools fnTools;
    private String sql= "SELECT * FROM instock_entry_table";
    private int productCode;
    /**
     * Creates new form stockInPanel
     */
    
    public stockInPanel() {
        initComponents();
        dao = new DataBase_Connection();
        conInstance = dao.getConnection();
        fnTools = new functionTools();
        
        fill_voucher_item_table(sql);
        
    }
    
    private void resetStockDetails(){
        txtItemName.setText("");
        txtQuan.setText("");
        txtpurchaseRate.setText("");
    }
    
    private void fill_voucher_item_table(String sql){
       voucher_item_model  =(DefaultTableModel)itemTable.getModel();
       try {
            
            
            smtInstance = conInstance.createStatement();
            ResultSet rs1 = smtInstance.executeQuery(sql);
            fnTools.remove_table_data(voucher_item_model,itemTable);
            int j= 0;
            rs1.beforeFirst();

            while (rs1.next()) {

                String a = rs1.getString("date");
                String b = rs1.getString("item_name");
                String c = rs1.getString("unit");
                String d = rs1.getString("total");
                voucher_item_model.insertRow(j,new Object[]{a,b,c,d});

                j++;
            }
                
            
             
         } catch (SQLException ex) {
           // Logger.getLogger(Pharmacy_In_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
              
}    
    
    private void saveData(){
        try {
            
            String sql1;
            
            String search = "SELECT * FROM instock_details WHERE item_name = '"+txtItemName.getText()+"'";
            smtInstance = conInstance.createStatement();
            ResultSet resultSearch = smtInstance.executeQuery(search);
            if(resultSearch.next()){
                productCode = resultSearch.getInt("item_code");
            }
            DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String todayDate =dateformat.format(cal.getTime());
            
            conInstance.setAutoCommit(false);
            sql1 = "INSERT INTO instock_entry_table(item_code, item_name, unit, total,date) values (?,?,?,?,?)";
            PreparedStatement pst = conInstance.prepareStatement(sql1);
                pst.setInt(1, productCode);
                pst.setString(2, txtItemName.getText());
                pst.setString(3, txtQuan.getText());
                pst.setString(4, txtpurchaseRate.getText());
                pst.setString(5, todayDate);
                
                pst.addBatch();
                
            pst.executeBatch();
            conInstance.commit(); 
            
            
        } catch (SQLException ex) {

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

        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addStockButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtQuan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpurchaseRate = new javax.swing.JTextField();

        setBackground(java.awt.Color.darkGray);
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(1114, 622));

        itemTable.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item", "Qnty", "Expence"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        itemTable.setRowHeight(24);
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        itemTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(itemTable);
        if (itemTable.getColumnModel().getColumnCount() > 0) {
            itemTable.getColumnModel().getColumn(0).setResizable(false);
            itemTable.getColumnModel().getColumn(1).setResizable(false);
            itemTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            itemTable.getColumnModel().getColumn(2).setResizable(false);
            itemTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            itemTable.getColumnModel().getColumn(3).setResizable(false);
            itemTable.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jPanel2.setBackground(new java.awt.Color(72, 89, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel18.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Lab Expense Entry");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(411, 411, 411))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.Color.lightGray);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addStockButton.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        addStockButton.setText("Add Stock");
        addStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockButtonActionPerformed(evt);
            }
        });
        addStockButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addStockButtonKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel2.setText("Item Name :");

        txtItemName.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        txtItemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtItemNameFocusGained(evt);
            }
        });
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

        txtQuan.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        txtQuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuanKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel3.setText("Unit:");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel4.setText("Total Expense :");

        txtpurchaseRate.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        txtpurchaseRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpurchaseRateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpurchaseRateKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStockButton)
                    .addComponent(txtpurchaseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpurchaseRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addStockButton, jLabel3, jLabel4, txtItemName});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockButtonActionPerformed
        try{
            String search = "SELECT * FROM instock_details WHERE item_name = '"+txtItemName.getText()+"'";
            smtInstance = conInstance.createStatement();
            ResultSet resultSearch = smtInstance.executeQuery(search);
            if(resultSearch.next()){
                String oldStock = resultSearch.getString("instock");
                String index = resultSearch.getString("item_code");
                int Stock = Integer.parseInt(oldStock)+Integer.parseInt(txtQuan.getText());
                String newStock= Integer.toString(Stock);
                String sqlupdate;
                sqlupdate = "update instock_details set instock ='"+ newStock +"' where item_code = '"+index+"'";
                smtInstance = conInstance.createStatement();
                int result = smtInstance.executeUpdate(sqlupdate);
                if(result!=0){
                    JOptionPane.showMessageDialog(null,"Stock Updated");
                }
                
            }
            else{
                String sql1;

                sql1= "insert into instock_details (item_name, instock)values ('"+txtItemName.getText()+"','"+txtQuan.getText()+"')";
                smtInstance = conInstance.createStatement();
                int result = smtInstance.executeUpdate(sql1);
                if(result!=0){
                    JOptionPane.showMessageDialog(null,"Stock inserted");
                }
            }
                
            
        }
        catch(SQLException ex){

        }
        saveData();
        resetStockDetails();
        
        fill_voucher_item_table(sql);
        txtItemName.requestFocus();
              
    }//GEN-LAST:event_addStockButtonActionPerformed

    private void txtQuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuanKeyPressed
       int key = evt.getKeyCode();
        if ((key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9) || (key >= KeyEvent.VK_NUMPAD0 && key <= KeyEvent.VK_NUMPAD9) || (key == KeyEvent.VK_BACK_SPACE)) {
            txtQuan.setEditable(true);
            
        } else if ((key == KeyEvent.VK_ENTER)&&(!txtQuan.getText().isEmpty())) {
            txtpurchaseRate.requestFocus();
        }else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID INSERT");
            txtQuan.setText("");
        }
       
    }//GEN-LAST:event_txtQuanKeyPressed

    private void txtQuanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuanKeyReleased
        
    }//GEN-LAST:event_txtQuanKeyReleased

    private void txtpurchaseRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpurchaseRateKeyReleased
        
    }//GEN-LAST:event_txtpurchaseRateKeyReleased

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased
       String sql1= "SELECT * FROM instock_entry_table where item_name like '"+txtItemName.getText()+"%'";
        fill_voucher_item_table(sql1);
    }//GEN-LAST:event_txtItemNameKeyReleased

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
       
    }//GEN-LAST:event_itemTableMouseClicked

    private void txtpurchaseRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpurchaseRateKeyPressed
        char car = evt.getKeyChar();
        int key = evt.getKeyCode();
        if ((key == KeyEvent.VK_ENTER)&&(!txtpurchaseRate.getText().isEmpty())) {
            addStockButton.requestFocus();
        }
        
        else if((car < '0'|| car > '9') && txtpurchaseRate.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Invalid Insert");
            txtpurchaseRate.setText("");
        }
        else if((car < '0'|| car > '9') && (car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Invalid Insert");
            txtpurchaseRate.setText("");
        }
    }//GEN-LAST:event_txtpurchaseRateKeyPressed

    private void txtItemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyPressed
        int key = evt.getKeyCode();
        if ((key == KeyEvent.VK_ENTER)&&(!txtItemName.getText().isEmpty())) {
            txtQuan.requestFocus();
        }else if ((key == KeyEvent.VK_ESCAPE)) {
            txtItemName.requestFocus();
            txtItemName.setText("");
            
        }
        if ((key == KeyEvent.VK_ENTER)&&(!txtItemName.getText().isEmpty())) {
         if(!fnTools.isEmpty(itemTable)){
        voucher_item_model  =(DefaultTableModel)itemTable.getModel();
        String Name = voucher_item_model.getValueAt(0, 1).toString();
        txtItemName.setText(Name);
            txtQuan.requestFocus();
         }
        }else if ((key == KeyEvent.VK_DOWN)) {
            if(!fnTools.isEmpty(itemTable)){
            voucher_item_model  =(DefaultTableModel)itemTable.getModel();
            itemTable.setRowSelectionInterval(0, 0);
            itemTable.requestFocus();
            
            }
        }
    }//GEN-LAST:event_txtItemNameKeyPressed

    private void addStockButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addStockButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStockButtonKeyPressed

    private void txtItemNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemNameFocusGained
        
    }//GEN-LAST:event_txtItemNameFocusGained

    private void itemTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTableKeyPressed
        int key = evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER){
            int row_index = itemTable.getSelectedRow();
            String value = itemTable.getModel().getValueAt(row_index,1).toString();
            txtItemName.setText(value);
            txtQuan.requestFocus();
        }
    }//GEN-LAST:event_itemTableKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStockButton;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtpurchaseRate;
    // End of variables declaration//GEN-END:variables
}
