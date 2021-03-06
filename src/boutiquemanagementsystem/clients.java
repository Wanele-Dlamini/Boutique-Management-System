
package boutiquemanagementsystem;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Wanele Dlamini
 */
public class clients extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public clients() {
        initComponents();
        conn = dbConnect.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        r_cash = new javax.swing.JRadioButton();
        r_credit = new javax.swing.JRadioButton();
        r_laybuy = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        txt_first = new javax.swing.JTextField();
        txt_last = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_item = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_deposit = new javax.swing.JTextField();
        txt_installment = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Client:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 150, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name(s):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 180, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 200, 140, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 290, 120, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No.:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 370, 180, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Bought:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 450, 130, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 520, 100, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("E");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(190, 520, 20, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Deposit");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 360, 90, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Installment:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 440, 120, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(490, 510, 80, 40);

        r_cash.setBackground(new java.awt.Color(0, 0, 0));
        r_cash.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        r_cash.setForeground(new java.awt.Color(255, 255, 255));
        r_cash.setText("Cash");
        r_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cashActionPerformed(evt);
            }
        });
        jPanel1.add(r_cash);
        r_cash.setBounds(910, 170, 140, 33);

        r_credit.setBackground(new java.awt.Color(0, 0, 0));
        r_credit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        r_credit.setForeground(new java.awt.Color(255, 255, 255));
        r_credit.setText("Credit");
        r_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_creditActionPerformed(evt);
            }
        });
        jPanel1.add(r_credit);
        r_credit.setBounds(910, 230, 140, 33);

        r_laybuy.setBackground(new java.awt.Color(0, 0, 0));
        r_laybuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        r_laybuy.setForeground(new java.awt.Color(255, 255, 255));
        r_laybuy.setText("Lay-buy");
        r_laybuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_laybuyActionPerformed(evt);
            }
        });
        jPanel1.add(r_laybuy);
        r_laybuy.setBounds(910, 300, 140, 33);

        jButton1.setText("attach");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 280, 130, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boutiquemanagementsystem/images/back-arrow.jpg"))); // NOI18N
        jButton2.setText("Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1100, 20, 180, 60);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boutiquemanagementsystem/images/add.png"))); // NOI18N
        jButton3.setText("Add Client");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(910, 400, 180, 60);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boutiquemanagementsystem/images/delete.png"))); // NOI18N
        jButton4.setText("Delete Client");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(910, 490, 180, 60);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boutiquemanagementsystem/images/update.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1120, 400, 170, 60);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boutiquemanagementsystem/images/clear.png"))); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1120, 490, 170, 60);

        txt_search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(200, 10, 230, 30);

        txt_first.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_first);
        txt_first.setBounds(200, 140, 230, 30);

        txt_last.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_last);
        txt_last.setBounds(200, 210, 230, 30);

        txt_email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_email);
        txt_email.setBounds(210, 290, 220, 30);

        txt_phone.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_phone);
        txt_phone.setBounds(210, 370, 220, 30);

        txt_item.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_item);
        txt_item.setBounds(210, 450, 220, 30);

        txt_price.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_price);
        txt_price.setBounds(210, 520, 220, 30);

        txt_deposit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_deposit);
        txt_deposit.setBounds(620, 360, 260, 30);

        txt_installment.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_installment);
        txt_installment.setBounds(620, 440, 260, 30);

        txt_date.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(txt_date);
        txt_date.setBounds(620, 520, 260, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(600, 360, 20, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Type Of Purchase:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(910, 120, 190, 50);

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(620, 140, 260, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boutiquemanagementsystem/images/c-bg.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainMenu n = new MainMenu();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Add This Client?","Add Client", JOptionPane.YES_NO_OPTION);
        if(x == 0){
        try{
            String sql = "INSERT INTO Clients(name,last,email,phone,item,price,deposit,installment,date,purchase,item_image)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?)";
            
            pst = conn.prepareStatement(sql);
            pst.setString(1,txt_first.getText());
            pst.setString(2,txt_last.getText());
            pst.setString(3,txt_email.getText());
            pst.setString(4,txt_phone.getText());
            pst.setString(5,txt_item.getText());
            pst.setString(6,txt_price.getText());
            pst.setString(7,txt_deposit.getText());
            pst.setString(8,txt_installment.getText());
            pst.setString(9,txt_date.getText());
            pst.setString(10,purchase);
            pst.setBytes(11,item_img);
            //pst.setString(10,txt_type.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Client Added Successfully!");
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void r_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cashActionPerformed
        // TODO add your handling code here:
        purchase = "cash";
        r_cash.setSelected(true);
        r_credit.setSelected(false);
        r_laybuy.setSelected(false);
    }//GEN-LAST:event_r_cashActionPerformed

    private void r_creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_creditActionPerformed
        // TODO add your handling code here:
        purchase = "credit";
        r_cash.setSelected(false);
        r_credit.setSelected(true);
        r_laybuy.setSelected(false);
    }//GEN-LAST:event_r_creditActionPerformed

    private void r_laybuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_laybuyActionPerformed
        // TODO add your handling code here:
        purchase = "laybuy";
        r_cash.setSelected(false);
        r_credit.setSelected(false);
        r_laybuy.setSelected(true);
    }//GEN-LAST:event_r_laybuyActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique", "root", "123456789");
            
            String sql = "SELECT * FROM Clients WHERE last = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                
            String add1 = rs.getString("name");
            txt_first.setText(add1);
            
            String add2 = rs.getString("last");
            txt_last.setText(add2);
            
            String add3 = rs.getString("email");
            txt_email.setText(add3);
            
            String add4 = rs.getString("phone");
            txt_phone.setText(add4);
            
            String add5 = rs.getString("item");
            txt_item.setText(add5);
            
            String add6 = rs.getString("price");
            txt_price.setText(add6);
            
            String add7 = rs.getString("deposit");
            txt_deposit.setText(add7);
            
            String add8 = rs.getString("installment");
            txt_installment.setText(add8);
            
            String add9 = rs.getString("date");
            txt_date.setText(add9);
            
             byte[] item_img = rs.getBytes("item_image");
               ImageIcon image = new ImageIcon(item_img);
               Image im = image.getImage();
               Image myImg = im.getScaledInstance(img.getWidth(),
                       img.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newImage = new ImageIcon(myImg);
               img.setIcon(newImage);
            
               if("Cash".equals(rs.getString("purchase"))){
                   r_cash.setSelected(true);
               }else if("Laybuy".equals(rs.getString("purchase"))){
                   r_laybuy.setSelected(true);
               }
               else if("Credit".equals(rs.getString("purchase"))){
                   r_credit.setSelected(true);
               }   
                
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Update This Client?","Update Client", JOptionPane.YES_NO_OPTION);
        if(x == 0){
        try{
            String val1 = txt_first.getText();
            String val2 = txt_last.getText();
            String val3 = txt_email.getText();
            String val4 = txt_phone.getText();
            String val5 = txt_item.getText();
            String val6 = txt_price.getText();
            String val7 = txt_deposit.getText();
            String val8 = txt_installment.getText();
            String val9 = txt_date.getText();
            
            String sql = "UPDATE Clients SET name = '"+val1+"', last = '"+val2+"', email = '"+val3+"', phone = '"+val4+"',"
                    + "item = '"+val5+"', price = '"+val6+"', deposit = '"+val7+"', installment = '"+val8+"',"
                    + "date = '"+val9+"' WHERE last = '"+val2+"' ";
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Client Information Updated!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Delete This Client?","Delete Client", JOptionPane.YES_NO_OPTION);
        if(x == 0){
            try{
                String sql = "DELETE FROM Clients WHERE last = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1,txt_phone.getText());
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Client Deleted Successfully!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            txt_first.setText(" ");
            txt_last.setText(" ");
            txt_email.setText(" ");
            txt_phone.setText(" ");
            txt_item.setText(" ");
            txt_price.setText(" ");
            txt_deposit.setText(" ");
            txt_installment.setText("");
            txt_date.setText(" ");
            txt_search.setText(" ");
            r_cash.setSelected(false);
            r_laybuy.setSelected(false);
            r_credit.setSelected(false);
            img.setIcon(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFileChooser  chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(),
                img.getHeight(),Image.SCALE_DEFAULT));
        img.setIcon(imageIcon);
        
        try{
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[]buf = new byte [1024];
            for(int number; (number=fix.read(buf)) != -1;){
                bos.write(buf,0,number);
            }
            item_img = bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r_cash;
    private javax.swing.JRadioButton r_credit;
    private javax.swing.JRadioButton r_laybuy;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_deposit;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_first;
    private javax.swing.JTextField txt_installment;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_last;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables


    private String purchase;
    
    private ImageIcon format = null;
    String filename = null;
    byte[]item_img = null;
}
