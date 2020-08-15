/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pontoeletronico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaBanco {
  public Statement stm;
  public ResultSet rs;
  public  Connection con;      
  String usuario = "jhonn";
  String senha = "jesus";
  private final String driver = "oracle.jdbc.OracleDriver" ;
  private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
  
    public void conexao() throws SQLException{
    try {
       Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,usuario,senha);
          JOptionPane.showMessageDialog(null, "conectado");
         }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "Erro ao conectar"+ex);
         } catch (ClassNotFoundException ex) {
          Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    }
    
    
    
    public void desconectar(){
     
      try {
          con.close();
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"erro na Desconexao"+ ex);
      }
        
        }
    
    
}
