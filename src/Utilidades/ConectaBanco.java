/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilidades;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhonn
 */
public class ConectaBanco {
    
   public    Statement stm;
   public    ResultSet rs;
    String driver;
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String usuario = "jhonn";
    String senha = "jesus";
  public  Connection conn;
    
    public void conexao(){

        try {
            //System.setProperty("jdbc.Drivers", driver);
            conn= DriverManager.getConnection(url,usuario,senha);
//            JOptionPane.showMessageDialog(null, "Conectado ao Banco");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro ao conectar \n"+ ex.getMessage());
        
        }
        
    }    
    
   public void executaSQL(String SQL){
    
       try {
           PreparedStatement pst = conn.prepareStatement(SQL);
           pst.executeQuery();
       } catch (SQLException ex) {
           Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao fechar a conexao \n"+ ex.getMessage());
        }
       
    
    }}