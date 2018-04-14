package library.management.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.WindowAdapter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author exam
 */
public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        this.addWindowListener(new WindowAdapter() 
        {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
              onExit();
            }
        });
        initComponents();        
    }
    
    public void onExit()
    {
        StartPage page;
        page = new StartPage();
        page.setVisible(true);
        this.dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signupID = new javax.swing.JTextField();
        signupPassword = new javax.swing.JPasswordField();
        signuprepeatPassword = new javax.swing.JPasswordField();
        signupName = new javax.swing.JTextField();
        signupContact = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(593, 484));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Enter Signup Details");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("College ID");
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("Password");
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Repeat Password");
        jLabel4.setPreferredSize(new java.awt.Dimension(75, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("Name");
        jLabel5.setPreferredSize(new java.awt.Dimension(75, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("Contact Number");
        jLabel6.setPreferredSize(new java.awt.Dimension(75, 30));

        signupID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupIDFocusLost(evt);
            }
        });
        signupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupIDActionPerformed(evt);
            }
        });

        signupPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupPasswordActionPerformed(evt);
            }
        });

        signuprepeatPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuprepeatPasswordActionPerformed(evt);
            }
        });

        signupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupNameActionPerformed(evt);
            }
        });

        signupContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupContactActionPerformed(evt);
            }
        });

        signupButton.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        signupButton.setText("Signup");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signupButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(signupPassword)
                        .addComponent(signuprepeatPassword)
                        .addComponent(signupID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signupName)
                        .addComponent(signupContact)))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signuprepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void signupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupIDActionPerformed

    private void signupPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupPasswordActionPerformed

    private void signuprepeatPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuprepeatPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signuprepeatPasswordActionPerformed

    private void signupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupNameActionPerformed

    private void signupContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupContactActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        if(signupContact.getText().trim().length() == 0 || signupName.getText().trim().length() == 0 || signupID.getText().trim().length() == 0 || signupPassword.getText().trim().length() == 0 || signuprepeatPassword.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Input Fields Empty bro -_-");
            return;
        }
        boolean ans = Arrays.equals(signupPassword.getPassword(), signuprepeatPassword.getPassword());
        if(!ans)
        {
            JOptionPane.showMessageDialog(this, "Passwords do not match");            
            return;
        }
        try
        {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/library","nigger", "nigger");
            System.out.print("Database is connected !");
            ResultSet nrs = conn.createStatement().executeQuery("select count(*) as `count` from `login` where `collegeid`='"+signupID.getText().trim()+"'");
            nrs.next();
            int count = nrs.getInt("count");
            if(count == 1)
            {
                JOptionPane.showMessageDialog(this, "Account with this User ID already exists!");
                return;
            }
            MessageDigest md;
            String outEncoded = "";
            try 
            {
                md = MessageDigest.getInstance("SHA-256");
                md.update( signupPassword.getText().getBytes() );
                byte[] aMessageDigest = md.digest();

                outEncoded = Base64.getEncoder().encodeToString( aMessageDigest );
            } 
            catch (NoSuchAlgorithmException ex) 
            {
                Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);
            }            
            // the mysql insert statement
            String query = "insert into login"
              + " values (?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, signupID.getText());
            preparedStmt.setString (2, outEncoded);
            preparedStmt.setString (3, signupName.getText());
            preparedStmt.setString (4, signupContact.getText().trim());

            // execute the preparedstatement
            preparedStmt.execute();
            conn.close();
            JOptionPane.showMessageDialog(this, "Signup Complete! Log In now");
            StartPage page;
            page = new StartPage();
            page.setVisible(true);
            this.dispose();
        }
        catch (SQLException ex) 
        {
            // handle any errors
            System.out.println("Sign Up errors");
            System.out.println("\tSQLException: " + ex.getMessage());
            System.out.println("\tSQLState: " + ex.getSQLState());
            System.out.println("\tVendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_signupButtonActionPerformed

    private void signupIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_signupIDFocusLost

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField signupContact;
    private javax.swing.JTextField signupID;
    private javax.swing.JTextField signupName;
    private javax.swing.JPasswordField signupPassword;
    private javax.swing.JPasswordField signuprepeatPassword;
    // End of variables declaration//GEN-END:variables
}
