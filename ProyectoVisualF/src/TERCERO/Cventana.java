/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TERCERO;

import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class Cventana extends javax.swing.JFrame {

    public static String nom, ubica, correo,contenido;
    public static String exp, skills, programas, idiomas;
    public static int numero;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUbica() {
        return ubica;
    }

    public void setUbica(String ubica) {
        this.ubica = ubica;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getProgramas() {
        return programas;
    }

    public void setProgramas(String programas) {
        this.programas = programas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    /**
     * Creates new form Cventana
     */
    public Cventana() {
        initComponents();
        this.setMinimumSize(new Dimension(864, 720));
        this.setMaximumSize(new Dimension(864, 720));
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
        jLabel1 = new javax.swing.JLabel();
        jTcorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTubicacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTnumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTidioms = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTprograms = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTexlab = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTskills = new javax.swing.JTextArea();
        jBsubir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel1.setText("Correo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 70, 60, 30);

        jTcorreo.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jPanel1.add(jTcorreo);
        jTcorreo.setBounds(630, 70, 190, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 20, 70, 30);

        jTnombre.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jPanel1.add(jTnombre);
        jTnombre.setBounds(210, 20, 460, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel3.setText("Habilidades:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 120, 90, 30);

        jTubicacion.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jPanel1.add(jTubicacion);
        jTubicacion.setBounds(100, 70, 190, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel4.setText("Num cel:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 70, 70, 30);

        jTnumero.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jPanel1.add(jTnumero);
        jTnumero.setBounds(370, 70, 190, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel5.setText("Ubicación:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 70, 80, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel6.setText("Idiomas:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 370, 70, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel7.setText("Experiencia Laboral:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 120, 150, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel8.setText("Programas:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 370, 90, 30);

        jTidioms.setColumns(20);
        jTidioms.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jTidioms.setRows(5);
        jScrollPane6.setViewportView(jTidioms);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(480, 400, 340, 200);

        jTprograms.setColumns(20);
        jTprograms.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jTprograms.setRows(5);
        jScrollPane7.setViewportView(jTprograms);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(20, 400, 340, 200);

        jTexlab.setColumns(20);
        jTexlab.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jTexlab.setRows(5);
        jScrollPane8.setViewportView(jTexlab);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(20, 150, 340, 200);

        jTskills.setColumns(20);
        jTskills.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jTskills.setRows(5);
        jScrollPane9.setViewportView(jTskills);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(480, 150, 340, 200);

        jBsubir.setBackground(new java.awt.Color(153, 153, 153));
        jBsubir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jBsubir.setForeground(new java.awt.Color(255, 255, 255));
        jBsubir.setText("SUBIR");
        jBsubir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jBsubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsubir);
        jBsubir.setBounds(620, 620, 200, 40);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubirActionPerformed
        Cventana cv=new Cventana();

        if (jTnombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto nombre", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setNom(jTnombre.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros", "Error", JOptionPane.WARNING_MESSAGE);
            }
            nom =jTnombre.getText();
        }
        if (jTubicacion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto ubicacion", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setUbica(jTubicacion.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros en la ubicacion", "Error", JOptionPane.WARNING_MESSAGE);
            }
            ubica= jTubicacion.getText();
        }
        if (jTnumero.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto del numero", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setNumero(Integer.parseInt(jTnumero.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros en el numero de telefono", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        }
        
        if (jTcorreo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto correo", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setCorreo(jTcorreo.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros en el correo", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (jTexlab.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto experiencia laboral", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setExp(jTexlab.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (jTskills.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto habilidades", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setSkills(jTskills.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (jTprograms.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto programas", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setProgramas(jTprograms.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (jTidioms.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Cuadro de texto idiomas", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cv.setIdiomas(jTidioms.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Favor de solo ingresar caracteres y no numeros", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if((jTnombre.getText().trim().equals(""))||(jTubicacion.getText().trim().equals(""))||(jTnumero.getText().trim().equals(""))||(jTcorreo.getText().trim().equals(""))||(jTexlab.getText().trim().equals(""))||(jTskills.getText().trim().equals(""))||(jTprograms.getText().trim().equals(""))||(jTidioms.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");
        }else{
            JOptionPane.showMessageDialog(null, "Muchas gracias se ha enviado tu cv");
            Logi log=new Logi();
            log.setVisible(true);
            dispose();
        }
        contenido = (" nombre            "+nom+
                     "\n domicilio            "+ubica+
                     "\n numero de telefono   "+jTnumero.getText()+
                     "\n correo               "+ jTcorreo.getText()+
                     "\n experencia           "+ jTexlab.getText()+
                     "\n Habilidades          "+ jTskills.getText()+
                     "\n Lenguajes            "+ jTprograms.getText()+
                     "\n Idiomas              "+ jTidioms.getText() 
                );
       try {
            String ruta = "nuevoCurriculum.txt";
         
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);       
            bw.write(contenido);
               
            
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBsubirActionPerformed

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
            java.util.logging.Logger.getLogger(Cventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cventana neo=new Cventana();
                neo.setVisible(true);
                neo.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsubir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextArea jTexlab;
    private javax.swing.JTextArea jTidioms;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTnumero;
    private javax.swing.JTextArea jTprograms;
    private javax.swing.JTextArea jTskills;
    private javax.swing.JTextField jTubicacion;
    // End of variables declaration//GEN-END:variables
}
