/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pontoeletronico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Utilidades.ConectaBanco;
/**
 *
 * @author Jhonn
 */


public class Ponto extends javax.swing.JFrame {

    ConectaBanco conexao = new ConectaBanco();
   
 	String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String pegalogsen = "select login,senha,funcao,nome from login";
    //    String inserir = "insert into login values (?,?,?,?,?)" ;
  
        String logincheck;
        String nome;
        Date datas = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String data = f.format(datas);
        
   //    String data = datas.getTime();
        
    public Ponto() {
        initComponents();
       conexao.conexao();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldFuncional = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setText("Funcional");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Trocar Senha");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldFuncional.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFuncionalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setText("Senha");

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jTextFieldFuncional, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldSenha))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(469, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
      
      
        char[] pass = jPasswordFieldSenha.getPassword();
       String senha = new String(pass);
       int checar = 1;

         
     try(PreparedStatement pst = conexao.conn.prepareStatement(pegalogsen);
         ResultSet rs = pst.executeQuery()){
               while(rs.next()){
  		
  		  if(jTextFieldFuncional.getText().equals(rs.getString(1)) && senha.equals(rs.getString(2))){
                       
                       nome= rs.getString(1);
                      
                      if("g".equals(rs.getString(3)) || "G".equals(rs.getString(3))){
                          
                        
                          new MenuG(data,nome).setVisible(true);
                             this.dispose();
                        }
                      
                   
                    
                           else {
                        
                             new Menu(data,nome).setVisible(true);
                             this.dispose();
                        }
                   
                        
                    checar = 3;
                    
                   }
           
            }
             if(checar == 1){
             JOptionPane.showMessageDialog(null, "Login ou Senha Invalido");     
             }
               
               
     }  catch (SQLException ex) {
         Logger.getLogger(Ponto.class.getName()).log(Level.SEVERE, null, ex);
     }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFuncionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFuncionalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
char[] pass = jPasswordFieldSenha.getPassword();
       String senha = new String(pass);
       int checar = 1;
     try(Connection con = DriverManager.getConnection(url,"jhonn","jesus");
		
		PreparedStatement pst = con.prepareStatement(pegalogsen);
           ResultSet rs = pst.executeQuery()){
               while(rs.next()){
  		//	String s = rs.getInt(1) + "::"+rs.getInt(2)+ "::"+rs.getDouble(3);
  		//	 System.out.println(s);
  		  if(jTextFieldFuncional.getText().equals(rs.getString(1)) && senha.equals(rs.getString(2))  ){
                     
                      logincheck = jTextFieldFuncional.getText();
                      
                      new TrocaSenha(logincheck,senha).setVisible(true);
                       this.dispose();
                        
                    checar = 3;
                    
                   }
           
            }
             if(checar == 1){
             JOptionPane.showMessageDialog(null, "Login ou Senha Invalido");     
             }
               
               
     }  catch (SQLException ex) {
         Logger.getLogger(Ponto.class.getName()).log(Level.SEVERE, null, ex);
     }
       
         

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    /**
     * @param args the command line arguments'  
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
            java.util.logging.Logger.getLogger(Ponto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ponto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ponto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ponto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
     ConectaBanco conecta = new ConectaBanco();
           
                
                new Ponto().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldFuncional;
    // End of variables declaration//GEN-END:variables
}