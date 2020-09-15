/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controlador.Conexion;
import modelo.ModeloEstudiante;
 
 
public class VistaEstudiante extends javax.swing.JFrame {

    ModeloEstudiante estudiante;

                    
Conexion cc= new Conexion();
Connection cn= cc.conexion();
    public VistaEstudiante() {
        initComponents();
        setTitle("Escuela");
        mostrardatos("");
    }

void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CLAVE");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("DOMICILIO");
    modelo.addColumn("EMAIL");
    modelo.addColumn("DIRECCIÓN");
    modelo.addColumn("GENERO");
    modelo.addColumn("F. NACIMIENTO");
    TablaAlumnos.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM java_estudiante ";
    }else{             
       sql="SELECT * FROM java_estudiante WHERE clave LIKE '%"+valor+"%' OR  nombre LIKE '%"+valor+"%' OR domicilio LIKE '%"+valor+"%' OR email LIKE '%"+valor+"%' OR genero LIKE '%"+valor+"%' \n";			
    }                    
 
    String []datos = new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);                        
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString(6);
                datos[5]=rs.getString(7);
                datos[6]=rs.getString(8);
                modelo.addRow(datos);
            }
            TablaAlumnos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(VistaEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        tbnActualizar1 = new javax.swing.JButton();
        cbxGenero = new javax.swing.JComboBox<>();
        jclrFechaNacimiento = new com.toedter.calendar.JCalendar();
        jLabel8 = new javax.swing.JLabel();

        eliminar.setText("Eliminar Empleado");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminar);

        modificar.setText("Modificar Empleado");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 525));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Escuela");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 40, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 60, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Domicilio");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 140, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 210, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 310, 170, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Genero");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 260, 70, 17);

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtClave);
        txtClave.setBounds(40, 30, 190, 20);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(40, 80, 190, 20);

        txtDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDomicilio);
        txtDomicilio.setBounds(40, 130, 190, 20);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(40, 230, 190, 20);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(40, 180, 190, 20);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(260, 50, 100, 23);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(260, 110, 100, 25);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(840, 110, 100, 25);

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        TablaAlumnos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(TablaAlumnos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 150, 700, 300);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(710, 110, 120, 20);

        tbnActualizar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnActualizar1.setText("Actualizar");
        tbnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnActualizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(tbnActualizar1);
        tbnActualizar1.setBounds(260, 80, 100, 23);

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        getContentPane().add(cbxGenero);
        cbxGenero.setBounds(40, 280, 190, 20);
        getContentPane().add(jclrFechaNacimiento);
        jclrFechaNacimiento.setBounds(40, 330, 184, 153);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Clave");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 10, 33, 17);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrardatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

                
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String invalido ="";
                    
        if(txtClave.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una clave..");
        }
        else if(txtNombre.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una nombre..");
        }
        else if(txtDomicilio.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese un domicilio.");
        }
        else if(txtTelefono.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una telefono..");
        }
        else if(txtEmail.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una email..");
        }else {
                try { 
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO java_estudiante(id, clave, nombre, domicilio, telefono, email, fechaNacimiento,genero) VALUES (?,?,?,?,?,?,?,?)");
                    pst.setString(1, txtClave.getText());
                    pst.setString(2, txtClave.getText());
                    pst.setString(3, txtNombre.getText());
                    pst.setString(4, txtDomicilio.getText());
                    pst.setString(5, txtTelefono.getText());
                    pst.setString(6, txtEmail.getText());
                    pst.setString(7, jclrFechaNacimiento.getDate().toString());
                    pst.setString(8, cbxGenero.getSelectedItem().toString());
                    pst.executeUpdate();
                    mostrardatos("");
                    limpiar();                    
                    JOptionPane.showMessageDialog(null,"Ingeso correcto!.");
            } catch (SQLException e) {
                System.out.print(e.getMessage());
            }  
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void limpiar (){
        txtClave.setEnabled(true);
        
        String borrar="";
        txtClave.setText(borrar);
        txtNombre.setText(borrar);
        txtDomicilio.setText(borrar);
        txtTelefono.setText(borrar); 
        txtEmail.setText(borrar); 
        txtBuscar.setText(borrar);
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
                    limpiar();

    }//GEN-LAST:event_btnNuevoActionPerformed
    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
    int fila= TablaAlumnos.getSelectedRow();
    if(fila>=0){        
        txtClave.setText(TablaAlumnos.getValueAt(fila, 0).toString());
        txtClave.setEnabled(false);
        txtNombre.setText(TablaAlumnos.getValueAt(fila, 1).toString());
        txtDomicilio.setText(TablaAlumnos.getValueAt(fila, 2).toString());
        txtTelefono.setText(TablaAlumnos.getValueAt(fila, 3).toString());
        txtEmail.setText(TablaAlumnos.getValueAt(fila, 4).toString());
        cbxGenero.setActionCommand(TablaAlumnos.getValueAt(fila, 6).toString());
    }
    else{
    JOptionPane.showMessageDialog(null,"No seleciono fila");
    }
        
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    int fila = TablaAlumnos.getSelectedRow();
    String cod="";
    cod=TablaAlumnos.getValueAt(fila, 0).toString();
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM java_estudiante WHERE  clave='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
    } catch (SQLException e) {}   
    }//GEN-LAST:event_eliminarActionPerformed

    private void tbnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnActualizar1ActionPerformed

        String invalido ="";
        if(txtClave.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una clave..");
        }
        else if(txtNombre.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una nombre..");
        }
        else if(txtDomicilio.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese un domicilio.");
        }
        else if(txtTelefono.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una telefono..");
        }
        else if(txtEmail.getText().equals(invalido) ) {
            JOptionPane.showMessageDialog(null,"Ingese una email..");
        }else {            
                try {
                    
                    PreparedStatement pst = cn.prepareStatement("UPDATE java_estudiante SET nombre='"+txtNombre.getText()+"',domicilio='"+txtDomicilio.getText()+"',telefono='"+txtTelefono.getText()+"',email='"+txtEmail.getText()+"', fechaNacimiento='"+jclrFechaNacimiento.getDate().toString()+"', genero='"+cbxGenero.getSelectedItem().toString()+"' WHERE clave='"+txtClave.getText()+"'"); 
                    pst.executeUpdate(); 
                    mostrardatos("");
                    
                    limpiar();
                    JOptionPane.showMessageDialog(null,"Modifico correcto!.");
                    
                } catch (SQLException e) {
                    System.out.print(e.getMessage());
                }
        }

    }//GEN-LAST:event_tbnActualizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar jclrFechaNacimiento;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JButton tbnActualizar1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
