/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TERCERO;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author CAT
 */
public class Logi extends javax.swing.JFrame {

    public String use;
    public String con;
    public String usuario;
    public String contraseña;
    public String user;
    public String contra;
    public String pass;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.use);
        hash = 73 * hash + Objects.hashCode(this.con);
        hash = 73 * hash + Objects.hashCode(this.usuario);
        hash = 73 * hash + Objects.hashCode(this.contraseña);
        hash = 73 * hash + Objects.hashCode(this.user);
        hash = 73 * hash + Objects.hashCode(this.contra);
        hash = 73 * hash + Objects.hashCode(this.pass);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Logi other = (Logi) obj;
        if (!Objects.equals(this.use, other.use)) {
            return false;
        }
        if (!Objects.equals(this.con, other.con)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.contra, other.contra)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        return true;
    }
    
    

    /**
     * Creates new form Login
     */
    public Logi() {
        initComponents();
        this.setMaximumSize(new Dimension(410, 475));
        this.setMinimumSize(new Dimension(410, 475));
        jBoton.setFocusPainted(false);
        jBoton.setBorderPainted(false);
        jBoton.setContentAreaFilled(false);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jPcontra = new javax.swing.JPasswordField();
        jBingresar = new javax.swing.JButton();
        jBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 20, 60, 30);

        jTusuario.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel2.add(jTusuario);
        jTusuario.setBounds(30, 90, 220, 40);

        jPcontra.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel2.add(jPcontra);
        jPcontra.setBounds(30, 140, 220, 40);

        jBingresar.setBackground(new java.awt.Color(51, 0, 153));
        jBingresar.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jBingresar.setText("LOGIN");
        jBingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingresarActionPerformed(evt);
            }
        });
        jPanel2.add(jBingresar);
        jBingresar.setBounds(80, 200, 120, 30);

        jBoton.setText("Crear ");
        jBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActionPerformed(evt);
            }
        });
        jPanel2.add(jBoton);
        jBoton.setBounds(90, 230, 110, 32);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 50, 280, 330);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingresarActionPerformed
      usuario="reclutador";//usuario chido que va a buscar
      contraseña="123";
      user="usuario";//usuario solicitante medio chafa 
      contra="12345";
      pass=new String(jPcontra.getPassword());
       if(jTusuario.getText().equals(usuario)&& pass.equals(contraseña)){//validacion de la contraseña del reclutador 
          Ventanareclutador re=new Ventanareclutador();
          re.setVisible(true);
          re.setLocationRelativeTo(null);
          dispose();
       }else if(jTusuario.getText().equals(user)&& pass.equals(contra)){//validacion del usuario solicitante
           Ventanatrabajo tra=new Ventanatrabajo();
           tra.setVisible(true);
           tra.setLocationRelativeTo(null);
           dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.INFORMATION_MESSAGE);
       }
       
    }//GEN-LAST:event_jBingresarActionPerformed

    private void jBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Logi log = new Logi();
                log.setVisible(true);
                log.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBingresar;
    private javax.swing.JButton jBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPcontra;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
}
