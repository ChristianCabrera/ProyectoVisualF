/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TERCERO;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class Ventanareclutador extends javax.swing.JFrame {

    public static String buscar, texto, nuevotexto="", contenidos, curri, coin, nuevotexto1="", nuevotexto2="", nuevotexto3="";
    public String num;
    public FileReader lector;
    public BufferedReader contenido;
    public String[] palabras;
    public int[] coincidencia = new int[4];
    public int x = 0,q=0,z=0,b=0;

    /**
     * Creates new form Ventanareclutador
     */
    public Ventanareclutador() {
        initComponents();

        this.setMinimumSize(new Dimension(1000, 1009));
        this.setMaximumSize(new Dimension(1000, 1009));
        jPbusqueda.setVisible(false);
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPbusqueda = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Ingrese palabras clave");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(660, 160, 240, 30);

        jPbusqueda.setBackground(new java.awt.Color(204, 204, 204));
        jPbusqueda.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPbusqueda.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 610, 470);

        jPanel1.add(jPbusqueda);
        jPbusqueda.setBounds(0, 70, 630, 490);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 260, 170, 40);
        jPanel1.add(jTbuscar);
        jTbuscar.setBounds(650, 200, 260, 50);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("PERFIL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 30, 120, 30);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Logi lo = new Logi();
        Cventana cv = new Cventana();
jTextArea2.setText("");
        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            lector = new FileReader("nuevoCurriculum1.txt");
//El contenido de lector se guarda en un BufferedReader
            contenido = new BufferedReader(lector);
//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            nuevotexto = "";
            while ((texto = contenido.readLine()) != null) {
                contenidos = texto;
                nuevotexto = nuevotexto + contenidos;
            }
            System.out.println(nuevotexto);
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");
        }
x=0;
        //if(cv!=null){//AIUDA VALIDAR SI NADIE HA ENVIADO NADA QUE MANDE EL MENSAJE NO SE A ENCONTRADO NADA(SALE UN ERROR)
        buscar = jTbuscar.getText();
        palabras = buscar.split("\\s+");
        JOptionPane.showMessageDialog(null, "Se ha encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        //for(int i= 0; i>nuevotexto.length();i++){
        for (String palabra : palabras) {
            if (nuevotexto.contains(palabra)) {//validar si contiene esa palabras
                System.out.println("concidencia" + x);
                coincidencia[0] = x;
               x++;
                //jLprogramas.setText(cv.getProgramas());//hacer bien la validacion cuando encuentre las palabras claves y agregar idioma
            }  //else{
            // JOptionPane.showMessageDialog(null, "No se ha encontrado nada","Información",JOptionPane.INFORMATION_MESSAGE);
         
        }
        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            lector = new FileReader("nuevoCurriculum2.txt");
//El contenido de lector se guarda en un BufferedReader
            contenido = new BufferedReader(lector);
//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
           nuevotexto1 = "";
            while ((texto = contenido.readLine()) != null) {
                contenidos = texto;
                nuevotexto1 = nuevotexto1 + contenidos;
            }
            System.out.println(nuevotexto1);
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");}
        q=0;
        //if(cv!=null){//AIUDA VALIDAR SI NADIE HA ENVIADO NADA QUE MANDE EL MENSAJE NO SE A ENCONTRADO NADA(SALE UN ERROR)
        buscar = jTbuscar.getText();
        palabras = buscar.split("\\s+");
        JOptionPane.showMessageDialog(null, "Se ha encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        //for(int i= 0; i>nuevotexto.length();i++){
        for (String palabra : palabras) {
            if (nuevotexto1.contains(palabra)) {//validar si contiene esa palabras
                System.out.println("concidencia1" + q);

                coincidencia[1] = q;
              q++;
                //jLprogramas.setText(cv.getProgramas());//hacer bien la validacion cuando encuentre las palabras claves y agregar idioma
            } //else{
            // JOptionPane.showMessageDialog(null, "No se ha encontrado nada","Información",JOptionPane.INFORMATION_MESSAGE);
        }
        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            lector = new FileReader("nuevoCurriculum3.txt");
//El contenido de lector se guarda en un BufferedReader
            contenido = new BufferedReader(lector);
//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
           nuevotexto2 = "";
            while ((texto = contenido.readLine()) != null) {
                contenidos = texto;
                nuevotexto2 = nuevotexto2 + contenidos;
            }
            System.out.println(nuevotexto2);
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");}
          z=0;
        //if(cv!=null){//AIUDA VALIDAR SI NADIE HA ENVIADO NADA QUE MANDE EL MENSAJE NO SE A ENCONTRADO NADA(SALE UN ERROR)
        buscar = jTbuscar.getText();
        palabras = buscar.split("\\s+");
        JOptionPane.showMessageDialog(null, "Se ha encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        //for(int i= 0; i>nuevotexto.length();i++){
        for (String palabra : palabras) {
            if (nuevotexto2.contains(palabra)) {//validar si contiene esa palabras
                System.out.println("concidencia2" + z);

                coincidencia[2] = z;
           z++;
                //jLprogramas.setText(cv.getProgramas());//hacer bien la validacion cuando encuentre las palabras claves y agregar idioma
            }  //else{
            // JOptionPane.showMessageDialog(null, "No se ha encontrado nada","Información",JOptionPane.INFORMATION_MESSAGE);
          
        }
        
        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            lector = new FileReader("nuevoCurriculum4.txt");
//El contenido de lector se guarda en un BufferedReader
            contenido = new BufferedReader(lector);
//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            nuevotexto3 = "";
            while ((texto = contenido.readLine()) != null) {
                contenidos = texto;
                nuevotexto3 = nuevotexto3 + contenidos;
            }
            System.out.println(nuevotexto3);
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");}
          b=0;
        //if(cv!=null){//AIUDA VALIDAR SI NADIE HA ENVIADO NADA QUE MANDE EL MENSAJE NO SE A ENCONTRADO NADA(SALE UN ERROR)
        buscar = jTbuscar.getText();
        palabras = buscar.split("\\s+");
        JOptionPane.showMessageDialog(null, "Se ha encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        //for(int i= 0; i>nuevotexto.length();i++){
        for (String palabra : palabras) {
            if (nuevotexto3.contains(palabra)) {//validar si contiene esa palabras
                System.out.println("concidencia 3" + b);
                coincidencia[3]= b;
                b++;
                 
                //jLprogramas.setText(cv.getProgramas());//hacer bien la validacion cuando encuentre las palabras claves y agregar idioma
            }  //else{
            // JOptionPane.showMessageDialog(null, "No se ha encontrado nada","Información",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        
        
         
       

        if (coincidencia[0] > coincidencia[1] && coincidencia[0] > coincidencia[2] && coincidencia[0] > coincidencia[3] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.setText(nuevotexto+"\n");
        }

        if (coincidencia[1] > coincidencia[0] && coincidencia[1] > coincidencia[2] && coincidencia[1] > coincidencia[3] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.setText(nuevotexto1+"\n");
        }

        if (coincidencia[2] > coincidencia[0] && coincidencia[2] > coincidencia[1] && coincidencia[2] > coincidencia[3] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.setText(nuevotexto2+"\n");
        }
         if (coincidencia[3] > coincidencia[0] && coincidencia[3] > coincidencia[1] && coincidencia[3] > coincidencia[2] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.setText(nuevotexto3+"\n");
        }
        
        
        
        
        
        
       

        if (coincidencia[0] == coincidencia[1] && coincidencia[0] == coincidencia[1] && coincidencia[0] == coincidencia[3] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.append(nuevotexto+"\n");
        }

        if (coincidencia[1] == coincidencia[0] && coincidencia[1] == coincidencia[2] && coincidencia[1] == coincidencia[3] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.append(nuevotexto1+"\n");
        }

        if (coincidencia[2] == coincidencia[1] && coincidencia[2] == coincidencia[0] && coincidencia[2] == coincidencia[3] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.append(nuevotexto2+"\n");
        }
          if (coincidencia[3]  == coincidencia[0] && coincidencia[3] == coincidencia[1] && coincidencia[3] == coincidencia[2] ) {
            jPbusqueda.setVisible(true);//label que es el nombre va imprimir el nombre que el solicitante puso y programas que maneja
            jTextArea2.append(nuevotexto3+"\n");
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
            java.util.logging.Logger.getLogger(Ventanareclutador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanareclutador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanareclutador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanareclutador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanareclutador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTbuscar;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
