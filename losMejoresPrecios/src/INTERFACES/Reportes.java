/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES;
import Conection.conectarBD;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/** 
 *
 * @author DAVID
 */
public class Reportes extends javax.swing.JFrame {

    conectarBD cn;
    
    public Reportes() {
        initComponents();
        setLocationRelativeTo(null);
        //actualizar_pendientes(""));
        //setResizable(false);
    }

    private String[] getcolumnasCliente() {
        String columna[] = new String[]{"Id cliente", "Nombre", "Apellido", "Direccion", "Cui", "Nit"};
        return columna;
    }
    
    void reporteCliente(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasCliente());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[6];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    private String[] getcolumnasProducto() {
        String columna[] = new String[]{"Id", "Descripcion", "Categoria", "Precio Compra", "Precio Venta", "Existencia", "Garantia"};
        return columna;
    }
    
    void reporteProducto(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasProducto());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[7];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    private String[] getcolumnasEmpleado() {
        String columna[] = new String[]{"Id", "Nombre", "Apellido", "Direccion", "Telefono", "Sexo", "Cargo", "Fecha Ingreo", "Salario"};
        return columna;
    }
    
    void reporteEmpleado(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasEmpleado());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[9];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    private String[] getcolumnasFormaPago() {
        String columna[] = new String[]{"Id", "Descripcion"};
        return columna;
    }
    
    void reporteFormadepago(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasFormaPago());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[2];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    private String[] getcolumnasProveedores() {
        String columna[] = new String[]{"Id", "Nit", "Nombre", "Direccion", "Telefono", "Correo"};
        return columna;
    }
    
    void reporteProveedores(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasProveedores());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[6];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    private String[] getcolumnasRuta() {
        String columna[] = new String[]{"Id", "Zona", "Departamento", "Municipio", "Aldeas", "Id Vehiculo", "Id Empleado", "nombre"};
        return columna;
    }
    
    void reporteRutas(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasRuta());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[8];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    private String[] getcolumnasVehiculos() {
        String columna[] = new String[]{"Id", "Descripcion", "Color", "Placas", "Estado"};
        return columna;
    }
    
    void reporteVehiculos(String tabla) {
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnasVehiculos());
        this.TablaDatos.setModel(modelo);
        String sql = "SELECT * FROM losMejoresPrecios."+tabla;
        try {
            cn = new conectarBD();
            PreparedStatement st = cn.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Object dato[] = new Object[5];
            while (rs.next()) {
                for (int i = 0; i < dato.length; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                modelo.addRow(dato);
            }
            this.TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);       
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496182226_arrow-return-180.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione Tipo de Reporte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 240, -1));

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "clientes", "productos", "empleado", "formadepago", "proveedores", "rutas", "vehiculos" }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });
        jPanel1.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 200, -1));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 810, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        principal p = new principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        // TODO add your handling code here:
        String op = opciones.getSelectedItem().toString();
        
        switch(op){
            case "clientes":
                this.opciones.setSelectedIndex(1);
                reporteCliente(op);
                break;
            case "productos":
                this.opciones.setSelectedIndex(2);
                reporteProducto(op);
                break;
            case "empleado":
                this.opciones.setSelectedIndex(3);
                reporteEmpleado(op);
                break;
            case "formadepago":
                this.opciones.setSelectedIndex(4);
                reporteFormadepago(op);
                break;
            case "proveedores":
                this.opciones.setSelectedIndex(5);
                reporteProveedores(op);
                break;
            case "rutas":
                this.opciones.setSelectedIndex(6);
                reporteRutas(op);
                break;
            case "vehiculos":
                this.opciones.setSelectedIndex(7);
                reporteVehiculos(op);
                break;
                
        }
        
        
    }//GEN-LAST:event_opcionesActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
