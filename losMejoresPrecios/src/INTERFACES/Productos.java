/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES;

import CAPADENEGOCIO.productos;
import Conection.conectarBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID
 */
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    conectarBD cn;
    productos reg = new productos();

    public Productos() {
        initComponents();
        setLocationRelativeTo(null);
        actualizar_pendientes();
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
        jLabel2 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id_categoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id_producto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        precio_compra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        precio_venta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ACTUALIZAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        garantia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO EMPLEADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripción ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Categoría");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, -1));
        jPanel1.add(id_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, -1));
        jPanel1.add(id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tiempo Garantía");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 110, 20));
        jPanel1.add(existencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496182226_arrow-return-180.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 80, 30));

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
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 700, 270));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio Compra");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, -1));
        jPanel1.add(precio_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio Venta");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, -1));
        jPanel1.add(precio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, -1));

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Opciones")));

        ACTUALIZAR.setText("Editar");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("Eliminar");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496176447_user-add.png"))); // NOI18N
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        NUEVO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 520, 130));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Existencia");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 20));
        jPanel1.add(garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        principal p = new principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed
 
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // Nuevo registro
        try {
            reg.setIdProducto(Integer.parseInt(this.id_producto.getText()));
            reg.setDescripcion(this.descripcion.getText());
            reg.setIdCategoria(Integer.parseInt(this.id_categoria.getText()));
            reg.setPreciocompra(Float.parseFloat(precio_compra.getText()));
            reg.setPrecioventa(Float.parseFloat(precio_venta.getText()));
            reg.setExistencia(Integer.parseInt(existencia.getText()));
            reg.setGarantia(garantia.getText());
            reg.setAccion("new");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        cn = new conectarBD(); 
        String res = cn.ProcedimientoProducto(reg.getIdProducto(), reg.getDescripcion(),reg.getIdCategoria(),
                reg.getPreciocompra(), reg.getPrecioventa(),reg.getExistencia(), reg.getGarantia(),reg.getAccion());
        JOptionPane.showMessageDialog(null, "" + res);

        actualizar_pendientes();
        Borrar();
        this.ELIMINAR.setEnabled(true);
        this.ACTUALIZAR.setEnabled(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        //Lanzar datos a panel ingreso de Datos

        int fila = this.TablaDatos.getSelectedRow();
        try {
            reg.setIdProducto(Integer.parseInt(TablaDatos.getValueAt(fila, 0).toString()));
            reg.setDescripcion(TablaDatos.getValueAt(fila, 1).toString());
            reg.setIdCategoria(Integer.parseInt(TablaDatos.getValueAt(fila, 2).toString()));
            reg.setPreciocompra(Float.parseFloat(TablaDatos.getValueAt(fila, 3).toString()));
            reg.setPrecioventa(Float.parseFloat(TablaDatos.getValueAt(fila, 4).toString()));
            reg.setExistencia(Integer.parseInt(TablaDatos.getValueAt(fila, 5).toString()));
            reg.setGarantia(TablaDatos.getValueAt(fila, 6).toString());

            reg.setAccion("query");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

        id_producto.setText(String.valueOf(reg.getIdProducto()));
        descripcion.setText(reg.getDescripcion());
        id_categoria.setText(String.valueOf(reg.getIdCategoria()));
        precio_compra.setText(String.valueOf(reg.getPreciocompra()));
        precio_venta.setText(String.valueOf(reg.getPrecioventa()));
        existencia.setText(String.valueOf(reg.getExistencia()));
        garantia.setText(reg.getGarantia());
        
        this.ELIMINAR.setEnabled(true);
        this.ACTUALIZAR.setEnabled(true);
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // TODO add your handling code here:
        try {
            reg.setIdProducto(Integer.parseInt(this.id_producto.getText()));
            reg.setDescripcion(this.descripcion.getText());
            reg.setIdCategoria(Integer.parseInt(this.id_categoria.getText()));
            reg.setPreciocompra(Float.parseFloat(precio_compra.getText()));
            reg.setPrecioventa(Float.parseFloat(precio_venta.getText()));
            reg.setExistencia(Integer.parseInt(existencia.getText()));
            reg.setGarantia(garantia.getText());
            reg.setAccion("update");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        cn = new conectarBD(); 
        String res = cn.ProcedimientoProducto(reg.getIdProducto(), reg.getDescripcion(),reg.getIdCategoria(),
                reg.getPreciocompra(), reg.getPrecioventa(),reg.getExistencia(), reg.getGarantia(),reg.getAccion());
        JOptionPane.showMessageDialog(null, "" + res);
        
        actualizar_pendientes();
        Borrar();
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:

        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            DefaultTableModel dtm = (DefaultTableModel) TablaDatos.getModel(); //TableProducto es el nombre de mi tabla ;) 
            int fila = TablaDatos.getSelectedRow();
            if (fila < 1) {
                this.ELIMINAR.setEnabled(false);
                this.ACTUALIZAR.setEnabled(false);
            }
            dtm.removeRow(TablaDatos.getSelectedRow());
            try {
            reg.setIdProducto(Integer.parseInt(this.id_producto.getText()));
            reg.setDescripcion(this.descripcion.getText());
            reg.setIdCategoria(Integer.parseInt(this.id_categoria.getText()));
            reg.setPreciocompra(Float.parseFloat(precio_compra.getText()));
            reg.setPrecioventa(Float.parseFloat(precio_venta.getText()));
            reg.setExistencia(Integer.parseInt(existencia.getText()));
            reg.setGarantia(garantia.getText());
            reg.setAccion("delete");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        cn = new conectarBD(); 
        String res = cn.ProcedimientoProducto(reg.getIdProducto(), reg.getDescripcion(),reg.getIdCategoria(),
                reg.getPreciocompra(), reg.getPrecioventa(),reg.getExistencia(), reg.getGarantia(),reg.getAccion());
        JOptionPane.showMessageDialog(null, "" + res);
        }
        actualizar_pendientes();
        Borrar();
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        // TODO add your handling code here:
        Borrar();
    }//GEN-LAST:event_NUEVOActionPerformed
    void actualizar_pendientes() {
 
        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnas());

        this.TablaDatos.setModel(modelo); 

        String sql = "SELECT * FROM losMejoresPrecios.productos";

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
       this.ELIMINAR.setEnabled(false);
        this.ACTUALIZAR.setEnabled(false);

    }

    void Borrar() {
        id_producto.setText("");
        descripcion.setText("");
        id_categoria.setText("");
        precio_compra.setText("");
        precio_venta.setText("");
        existencia.setText("");
        garantia.setText("");
        this.ELIMINAR.setEnabled(false);
        this.ACTUALIZAR.setEnabled(false);
    }

    private String[] getcolumnas() {
        String columna[] = new String[]{"Id", "Descripcion", "Categoria", "Precio Compra", "Precio Venta", "Existencia", "Garantia"};
        return columna;
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton NUEVO;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField existencia;
    private javax.swing.JTextField garantia;
    private javax.swing.JTextField id_categoria;
    private javax.swing.JTextField id_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio_compra;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}