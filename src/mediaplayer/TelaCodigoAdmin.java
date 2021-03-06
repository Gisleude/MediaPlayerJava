/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayer;

import model.Usuario;
import conexaoDb.ConexaoDb;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gisleude
 */
public class TelaCodigoAdmin extends javax.swing.JFrame {

    private int code;
    public Usuario user;

    public void setCode(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }


    ConexaoDb conecta = new ConexaoDb(); // Variavel global de conexao
    /**
     * Creates new form TelaCodigoVIP
     */
    public TelaCodigoAdmin() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_code_admin = new javax.swing.JLabel();
        l_desc_code_admin = new javax.swing.JLabel();
        t_code_admin = new javax.swing.JTextField();
        b_submit = new javax.swing.JButton();
        b_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MediaPlayer - Código Admin");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        l_code_admin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        l_code_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key_64.png"))); // NOI18N
        l_code_admin.setText("Código Administrador");

        l_desc_code_admin.setText("Digite o código de Administrador");

        b_submit.setText("Enviar");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });

        b_cancel.setText("Cancelar");
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(l_code_admin)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_desc_code_admin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(t_code_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(l_code_admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_desc_code_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_code_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancel)
                    .addComponent(b_submit))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
      Login login = new Login();
      login.setVisible(true);
      dispose();
    }//GEN-LAST:event_b_cancelActionPerformed

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitActionPerformed
       PreparedStatement pst;
        try {
            pst = conecta.conn.prepareStatement("insert into usuario (user_name,user_email,user_password,user_nivel)values(?,?,?,?)");
            code = Integer.parseInt(t_code_admin.getText());
            if(code == 986532){
                JOptionPane.showMessageDialog(rootPane,"Código Correto");
                pst.setString(1,user.getNome());
                pst.setString(2,user.getEmail());
                pst.setString(3,user.getSenha());
                pst.setString(4,"3");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"Registrado com sucesso");
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        else{
            JOptionPane.showMessageDialog(rootPane,"Código Incorreto");
        }
        } catch (SQLException ex) {
            Logger.getLogger(TelaCodigoVIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_submitActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCodigoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCodigoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCodigoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCodigoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCodigoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_submit;
    private javax.swing.JLabel l_code_admin;
    private javax.swing.JLabel l_desc_code_admin;
    private javax.swing.JTextField t_code_admin;
    // End of variables declaration//GEN-END:variables
}
