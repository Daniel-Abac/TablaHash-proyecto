/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablahash;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Menu_Principal extends javax.swing.JFrame {
    private Tabla tablaHash;
    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tabla Hash");
        this.setLocationRelativeTo(null);
        InsertarPelicula.setEnabled(false);
        Buscar.setEnabled(false);
        Eliminar.setEnabled(false);
        Estadistica.setEnabled(false);
        MostrarTabla.setEnabled(false);
        Reiniciar.setEnabled(false);
       
        jDialog.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        jLabel_ID = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel_Nombre = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel_Año = new javax.swing.JLabel();
        jTextField_Año = new javax.swing.JTextField();
        jLabel_Genero = new javax.swing.JLabel();
        jTextField_Genero = new javax.swing.JTextField();
        boton_listo = new javax.swing.JButton();
        jLabel_InsertarDatos = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        jLabel_Iniciar = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        jLabel_Reiniciar = new javax.swing.JLabel();
        Reiniciar = new javax.swing.JButton();
        jLabel_Insertar = new javax.swing.JLabel();
        InsertarPelicula = new javax.swing.JButton();
        jLabel_Buscar = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel_Eliminar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        jLabel_Mostrar = new javax.swing.JLabel();
        MostrarTabla = new javax.swing.JButton();
        jLabel_Estadistica = new javax.swing.JLabel();
        Estadistica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_texto = new javax.swing.JTextArea();
        jTextField_TamanoTabla = new javax.swing.JTextField();
        jLabel_TamanoTabla = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();

        jDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_ID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ID.setText("ID:");
        jDialog.getContentPane().add(jLabel_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 20, 20));
        jDialog.getContentPane().add(jTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, -1));

        jLabel_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre.setText("Nombre: ");
        jDialog.getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, -1));
        jDialog.getContentPane().add(jTextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 120, -1));

        jLabel_Año.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Año.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Año.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Año.setText("Año:");
        jDialog.getContentPane().add(jLabel_Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 30, -1));
        jDialog.getContentPane().add(jTextField_Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, -1));

        jLabel_Genero.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Genero.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Genero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Genero.setText("Genero:");
        jDialog.getContentPane().add(jLabel_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextField_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_GeneroActionPerformed(evt);
            }
        });
        jDialog.getContentPane().add(jTextField_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, -1));

        boton_listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/video-editor.png"))); // NOI18N
        boton_listo.setBorderPainted(false);
        boton_listo.setContentAreaFilled(false);
        boton_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_listoActionPerformed(evt);
            }
        });
        jDialog.getContentPane().add(boton_listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 35, -1));

        jLabel_InsertarDatos.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_InsertarDatos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_InsertarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InsertarDatos.setText("Insertar");
        jDialog.getContentPane().add(jLabel_InsertarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        Fondo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpeg"))); // NOI18N
        jDialog.getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 290));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Iniciar.setText("Iniciar");
        getContentPane().add(jLabel_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 20));

        Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encender.png"))); // NOI18N
        Iniciar.setBorderPainted(false);
        Iniciar.setContentAreaFilled(false);
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 40));

        jLabel_Reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Reiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Reiniciar.setText("Reiniciar");
        getContentPane().add(jLabel_Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        Reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reiniciar.png"))); // NOI18N
        Reiniciar.setBorderPainted(false);
        Reiniciar.setContentAreaFilled(false);
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 40, 40));

        jLabel_Insertar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Insertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Insertar.setText("Inserta Pelicula");
        getContentPane().add(jLabel_Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        InsertarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/video-editor.png"))); // NOI18N
        InsertarPelicula.setBorderPainted(false);
        InsertarPelicula.setContentAreaFilled(false);
        InsertarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(InsertarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 40));

        jLabel_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Buscar.setText("Buscar Pelicula");
        getContentPane().add(jLabel_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/movie-folder.png"))); // NOI18N
        Buscar.setBorderPainted(false);
        Buscar.setContentAreaFilled(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 40, 40));

        jLabel_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Eliminar.setText("Eliminar Pelicula");
        getContentPane().add(jLabel_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        Eliminar.setBorderPainted(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 40, 40));

        jLabel_Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Mostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Mostrar.setText("Mostrar Tabla");
        getContentPane().add(jLabel_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        MostrarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proyector.png"))); // NOI18N
        MostrarTabla.setBorderPainted(false);
        MostrarTabla.setContentAreaFilled(false);
        MostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 40, -1));

        jLabel_Estadistica.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Estadistica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Estadistica.setText("Estadistica");
        getContentPane().add(jLabel_Estadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        Estadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagrama.png"))); // NOI18N
        Estadistica.setBorderPainted(false);
        Estadistica.setContentAreaFilled(false);
        Estadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticaActionPerformed(evt);
            }
        });
        getContentPane().add(Estadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 40, 40));

        area_texto.setColumns(20);
        area_texto.setRows(5);
        jScrollPane1.setViewportView(area_texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 280, 520));

        jTextField_TamanoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TamanoTablaActionPerformed(evt);
            }
        });
        jTextField_TamanoTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TamanoTablaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_TamanoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        jLabel_TamanoTabla.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TamanoTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TamanoTabla.setText("Ingrese el tamaño de la tabla:");
        getContentPane().add(jLabel_TamanoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpeg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 570));

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcion De Multiplicacion", "Funcion De Division" }));
        getContentPane().add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String cadena_valor = JOptionPane.showInputDialog(null,"Ingrese el ID de la pelicula");
        try {
        int valor = Integer.valueOf(cadena_valor);
        if(tablaHash.Buscar(valor)){
            JOptionPane.showMessageDialog(rootPane,"El valor existe","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            area_texto.setText(tablaHash.getCadena());
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"El contacto no existe","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo valores numericos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void jTextField_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_GeneroActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        if(jTextField_TamanoTabla.getText().length() == 0){
          JOptionPane.showMessageDialog(null, "Llene el campo de texto", "Error", JOptionPane.ERROR_MESSAGE);
      }
      else{
       int size = Integer.valueOf(jTextField_TamanoTabla.getText());
       tablaHash = new Tabla(combo1.getSelectedIndex(),size);
      jTextField_TamanoTabla.setEnabled(false);
       
        InsertarPelicula.setEnabled(true);
        Buscar.setEnabled(true);
        Eliminar.setEnabled(true);
        Estadistica.setEnabled(true);
        MostrarTabla.setEnabled(true);
        Reiniciar.setEnabled(true);
        
        Iniciar.setEnabled(false);
        combo1.setEnabled(false); 
      }
    }//GEN-LAST:event_IniciarActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        InsertarPelicula.setEnabled(false);
        Buscar.setEnabled(false);
        Eliminar.setEnabled(false);
        Estadistica.setEnabled(false);
        MostrarTabla.setEnabled(false);
        Reiniciar.setEnabled(false);
        area_texto.setText("");
        
        Iniciar.setEnabled(true);
        combo1.setEnabled(true);
        jTextField_TamanoTabla.setEnabled(true);
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void InsertarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarPeliculaActionPerformed
        jDialog.setVisible(true);
    }//GEN-LAST:event_InsertarPeliculaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String cadena_valor = JOptionPane.showInputDialog("Ingrese el numero que desea eliminar");
        
        try {
            int valor_eliminar = Integer.valueOf(cadena_valor);
           if(tablaHash.Eliminar(valor_eliminar)){
            JOptionPane.showMessageDialog(rootPane,"El valor se elimino","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"El valor no existe","Error",JOptionPane.ERROR_MESSAGE);
        } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo valores numericos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
         area_texto.setText(tablaHash.MostrarTabla());
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticaActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Porcentaje de memoria utilizada: "+tablaHash.getPorcentaje()+"%"+"\n"
                                     + "Peliculas Creados: "+tablaHash.getNumValores()+"\n"
                                     +"Posiciones Vacias: "+tablaHash.PosicionesVacias()
       );
    }//GEN-LAST:event_EstadisticaActionPerformed

    private void boton_listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_listoActionPerformed
        int id;
        if(jTextField_Nombre.getText().length()!=0 && jTextField_ID.getText().length()!=0){
           String nombre = jTextField_Nombre.getText();
           id = Integer.valueOf(jTextField_ID.getText());
           String anio = jTextField_Año.getText();
           String genero = jTextField_Genero.getText();
           
          boolean inserto = tablaHash.Insertar(nombre, anio, genero, id);
          
          if(inserto){//si el valor se inserto
              JOptionPane.showMessageDialog(rootPane,"El valor se inserto correctamente\n"+tablaHash.getCadena(),"Mensaje",JOptionPane.INFORMATION_MESSAGE);
              jTextField_Año.setText("");
              jTextField_ID.setText("");
              jTextField_Nombre.setText("");
              jTextField_Genero.setText("");
          }
          else{// si el valor no se inserto 
              JOptionPane.showMessageDialog(rootPane,"El valor ya existe","Error",JOptionPane.ERROR_MESSAGE);
          }
           
           jDialog.dispose(); 
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Llene los campos obligatorios","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_boton_listoActionPerformed

    private void jTextField_TamanoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TamanoTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TamanoTablaActionPerformed

    private void jTextField_TamanoTablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TamanoTablaKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_TamanoTablaKeyTyped

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Estadistica;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton InsertarPelicula;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JTextArea area_texto;
    private javax.swing.JButton boton_listo;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel_Año;
    private javax.swing.JLabel jLabel_Buscar;
    private javax.swing.JLabel jLabel_Eliminar;
    private javax.swing.JLabel jLabel_Estadistica;
    private javax.swing.JLabel jLabel_Genero;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Iniciar;
    private javax.swing.JLabel jLabel_Insertar;
    private javax.swing.JLabel jLabel_InsertarDatos;
    private javax.swing.JLabel jLabel_Mostrar;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Reiniciar;
    private javax.swing.JLabel jLabel_TamanoTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Año;
    private javax.swing.JTextField jTextField_Genero;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_TamanoTabla;
    // End of variables declaration//GEN-END:variables
}

