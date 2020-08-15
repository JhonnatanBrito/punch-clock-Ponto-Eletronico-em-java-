/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pontoeletronico;

import Utilidades.ModeloTabela;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import pontoeletronico.ConectaBanco;
/**
 *
 * @author Jhonn
 */
public class AjustePonto extends javax.swing.JFrame {
 Utilidades.ConectaBanco conecta = new Utilidades.ConectaBanco();
    String nome;
    public AjustePonto(String nome) {
        initComponents();
        conecta.conexao();
        this.nome = nome;
        PreencherTabela("select * from "+ nome);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaPonto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        listaFuncionario = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabelaPonto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabelaPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaPontoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabelaPontoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabelaPontoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaPonto);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("Ajuste de Ponto");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoeletronico/icon40x40.png"))); // NOI18N
        jToggleButton1.setMaximumSize(new java.awt.Dimension(100, 100));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(100, 100));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        listaFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listaFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(listaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaPontoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaPontoMouseReleased



    }//GEN-LAST:event_jTabelaPontoMouseReleased

    private void jTabelaPontoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaPontoMouseEntered
   
        
     
    }//GEN-LAST:event_jTabelaPontoMouseEntered

    private void jTabelaPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaPontoMouseClicked
        // TODO add your handling code here:
        
        String data  = "null";
        String tEntrada  = "null";
        String tSaidaAlmoco  = "null";
        String tEntradaAlmoco  = "null";
        String tSaida = "null";
        int linhaSelecionada = jTabelaPonto.getSelectedRow();
           
 
        if (evt.getClickCount() > 1) { 
        
        data=jTabelaPonto.getValueAt(linhaSelecionada, 0).toString();
        
        final Object ent = jTabelaPonto.getValueAt(linhaSelecionada, 1);
        final Object saidal = jTabelaPonto.getValueAt(linhaSelecionada, 2);
        final Object entral = jTabelaPonto.getValueAt(linhaSelecionada, 3);
        final Object sai = jTabelaPonto.getValueAt(linhaSelecionada, 4);
          
        if(ent == null){tEntrada = "" ;}
        else {tEntrada=jTabelaPonto.getValueAt(linhaSelecionada, 1).toString(); }
        if(saidal == null){tSaidaAlmoco = "" ; }
        else {tSaidaAlmoco=jTabelaPonto.getValueAt(linhaSelecionada, 2).toString(); }
        if(entral == null){tEntradaAlmoco = "" ; } 
        else { tEntradaAlmoco=jTabelaPonto.getValueAt(linhaSelecionada, 3).toString();}
        if(sai == null){tSaida = ""; }  
        else { tSaida=jTabelaPonto.getValueAt(linhaSelecionada, 4).toString(); }
        
        // JOptionPane.showMessageDialog(null, tSaida);
            new CorrigePonto(nome,data,tEntrada,tSaidaAlmoco,tEntradaAlmoco,tSaida).setVisible(true);
     } 
        
    }//GEN-LAST:event_jTabelaPontoMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        PreencherTabela("select * from "+ nome);

// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void listaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFuncionarioActionPerformed
      String consulta = "Select * from login;";
        
        
        try (PreparedStatement pst = conecta.conn.prepareStatement(consulta);
         ResultSet rs = pst.executeQuery()){ 
             
         while(rs.next()){
        
        
listaFuncionario.addItem(rs.getString("nome"));

         
        }
        }catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"Não foi Possível Carregar os Horarios !");
     }
           
         
    }//GEN-LAST:event_listaFuncionarioActionPerformed
public void PreencherTabela(String SQL){
ArrayList dados = new ArrayList();
String[] Colunas = new String[]{"Data","Entrada","Saida Almoço","Entrada Almoço","Saida"}; 


//conecta.executaSQL(SQL);
      

     try (
     
         
         PreparedStatement pst = conecta.conn.prepareStatement(SQL);
         ResultSet rs = pst.executeQuery()){ 
             
         while(rs.next()){

  dados.add(new Object[]{rs.getString("data"),rs.getString("entrada"),rs.getString("saidaal"),rs.getString("entradaal"),rs.getString("saida")});  

         }
     
     }
         catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"Não foi Possível Carregar os Horarios !");
     }
     
     ModeloTabela modelo = new ModeloTabela(dados, Colunas);
     jTabelaPonto.setModel(modelo);
     jTabelaPonto.getColumnModel().getColumn(0).setPreferredWidth(130);
     jTabelaPonto.getColumnModel().getColumn(0).setResizable(false);
     jTabelaPonto.getColumnModel().getColumn(1).setPreferredWidth(130);
     jTabelaPonto.getColumnModel().getColumn(1).setResizable(false);    
     jTabelaPonto.getColumnModel().getColumn(2).setPreferredWidth(130);
     jTabelaPonto.getColumnModel().getColumn(2).setResizable(false);
     jTabelaPonto.getColumnModel().getColumn(3).setPreferredWidth(115);
     jTabelaPonto.getColumnModel().getColumn(3).setResizable(false);
     jTabelaPonto.getColumnModel().getColumn(4).setPreferredWidth(115);
     jTabelaPonto.getColumnModel().getColumn(4).setResizable(false);
     jTabelaPonto.getTableHeader().setReorderingAllowed(false);
     jTabelaPonto.setAutoResizeMode(jTabelaPonto.AUTO_RESIZE_OFF);
     jTabelaPonto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
}
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
            java.util.logging.Logger.getLogger(AjustePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjustePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjustePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjustePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        //        new AjustePonto(String nome).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaPonto;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox listaFuncionario;
    // End of variables declaration//GEN-END:variables
}
