/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES;

import CAPADENEGOCIO.Ruta;
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
public class rutas extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    conectarBD cn;
    Ruta reg = new Ruta();

    public rutas() {
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
        zona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        departamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_ruta = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        municipio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aldeas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ACTUALIZAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        AGREGAR = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        BuscarEmpleado = new javax.swing.JButton();
        BuscarVehiculo = new javax.swing.JButton();
        id_vehiculo_rutas = new javax.swing.JTextField();
        id_empleado_rutas = new javax.swing.JTextField();
        nombre_empleado_rutas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO RUTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Zona");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel1.add(zona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Departamento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, -1));

        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });
        jPanel1.add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Ruta");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, -1));
        jPanel1.add(id_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496182226_arrow-return-180.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 80, 30));

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
        jLabel7.setText("Municipio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, -1));
        jPanel1.add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Aldeas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id Vehiculo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 110, 20));
        jPanel1.add(aldeas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, -1));

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

        AGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496176447_user-add.png"))); // NOI18N
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        NUEVO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });

        BuscarEmpleado.setText("Buscar Empleado");
        BuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEmpleadoActionPerformed(evt);
            }
        });

        BuscarVehiculo.setText("Buscar Vehiculo");
        BuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 520, 210));
        jPanel1.add(id_vehiculo_rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, -1));
        jPanel1.add(id_empleado_rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 170, -1));
        jPanel1.add(nombre_empleado_rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, -1));

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

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        // Nuevo registro
        try {
            reg.setIdRuta(Integer.parseInt(this.id_ruta.getText()));
            reg.setZona(Integer.parseInt(this.zona.getText()));
            reg.setDepartamento(this.departamento.getText());
            reg.setMunicipio(municipio.getText());
            reg.setAldea(aldeas.getText());
            reg.setIdVehiculo(Integer.parseInt(id_vehiculo_rutas.getText()));
            reg.setIdEmpleado(Integer.parseInt(id_empleado_rutas.getText()));
            reg.setNombre(nombre_empleado_rutas.getText());
            reg.setAccion("new");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        cn = new conectarBD();
        String res = cn.ProcedimientoRuta(reg.getIdRuta(), reg.getZona(), reg.getDepartamento(),
                reg.getMunicipio(), reg.getAldea(), reg.getIdVehiculo(), reg.getIdEmpleado(), reg.getNombre(),
                reg.getAccion());
        JOptionPane.showMessageDialog(null, "" + res);

        actualizar_pendientes();
        Borrar();
        this.ELIMINAR.setEnabled(true);
        this.ACTUALIZAR.setEnabled(true);
    }//GEN-LAST:event_AGREGARActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        //Lanzar datos a panel ingreso de Datos

        int fila = this.TablaDatos.getSelectedRow();
        try {
            reg.setIdRuta(Integer.parseInt(TablaDatos.getValueAt(fila, 0).toString()));
            reg.setZona(Integer.parseInt(TablaDatos.getValueAt(fila, 1).toString()));
            reg.setDepartamento(TablaDatos.getValueAt(fila, 2).toString());
            reg.setMunicipio(TablaDatos.getValueAt(fila, 3).toString());
            reg.setAldea(TablaDatos.getValueAt(fila, 4).toString());
            reg.setIdVehiculo(Integer.parseInt(TablaDatos.getValueAt(fila, 5).toString()));
            reg.setIdEmpleado(Integer.parseInt(TablaDatos.getValueAt(fila, 6).toString()));
            reg.setNombre(TablaDatos.getValueAt(fila, 7).toString());
            reg.setAccion("query");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

        id_ruta.setText(String.valueOf(reg.getIdRuta()));
        zona.setText(String.valueOf(reg.getZona()));
        departamento.setText(reg.getDepartamento());
        municipio.setText(reg.getMunicipio());
        aldeas.setText(reg.getAldea());
        id_vehiculo_rutas.setText(String.valueOf(reg.getIdVehiculo()));
        id_empleado_rutas.setText(String.valueOf(reg.getIdEmpleado()));
        nombre_empleado_rutas.setText(reg.getNombre());
        

        this.ELIMINAR.setEnabled(true);
        this.ACTUALIZAR.setEnabled(true);
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // TODO add your handling code here:
        try {
            reg.setIdRuta(Integer.parseInt(this.id_ruta.getText()));
            reg.setZona(Integer.parseInt(this.zona.getText()));
            reg.setDepartamento(this.departamento.getText());
            reg.setMunicipio(municipio.getText());
            reg.setAldea(aldeas.getText());
            reg.setIdVehiculo(Integer.parseInt(id_vehiculo_rutas.getText()));
            reg.setIdEmpleado(Integer.parseInt(id_empleado_rutas.getText()));
            reg.setNombre(nombre_empleado_rutas.getText());
            reg.setAccion("update");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        cn = new conectarBD();
        String res = cn.ProcedimientoRuta(reg.getIdRuta(), reg.getZona(), reg.getDepartamento(),
                reg.getMunicipio(), reg.getAldea(), reg.getIdVehiculo(), reg.getIdEmpleado(), reg.getNombre(),
                reg.getAccion());
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
            reg.setIdRuta(Integer.parseInt(this.id_ruta.getText()));
            reg.setZona(Integer.parseInt(this.zona.getText()));
            reg.setDepartamento(this.departamento.getText());
            reg.setMunicipio(municipio.getText());
            reg.setAldea(aldeas.getText());
            reg.setIdVehiculo(Integer.parseInt(id_vehiculo_rutas.getText()));
            reg.setIdEmpleado(Integer.parseInt(id_empleado_rutas.getText()));
            reg.setNombre(nombre_empleado_rutas.getText());
            reg.setAccion("delete");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        cn = new conectarBD();
        String res = cn.ProcedimientoRuta(reg.getIdRuta(), reg.getZona(), reg.getDepartamento(),
                reg.getMunicipio(), reg.getAldea(), reg.getIdVehiculo(), reg.getIdEmpleado(), reg.getNombre(),
                reg.getAccion());
        JOptionPane.showMessageDialog(null, "" + res);
        }
        actualizar_pendientes();
        Borrar();
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        // TODO add your handling code here:
        Borrar();
    }//GEN-LAST:event_NUEVOActionPerformed

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departamentoActionPerformed

    private void BuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEmpleadoActionPerformed
        // TODO add your handling code here:
        ConsultaEmpleadosRutas ver = new ConsultaEmpleadosRutas();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        //this.setVisible(false);
    }//GEN-LAST:event_BuscarEmpleadoActionPerformed

    private void BuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarVehiculoActionPerformed
        // TODO add your handling code here:
        ConsultaVehiculos cv = new ConsultaVehiculos();
        cv.setVisible(true);
        cv.setLocationRelativeTo(null);
    }//GEN-LAST:event_BuscarVehiculoActionPerformed
    void actualizar_pendientes() {

        DefaultTableModel modelo = new DefaultTableModel(null, getcolumnas());

        this.TablaDatos.setModel(modelo);

        String sql = "SELECT * FROM losMejoresPrecios.rutas";

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
       this.ELIMINAR.setEnabled(false);
        this.ACTUALIZAR.setEnabled(false);

    }

    void Borrar() {
        id_ruta.setText("");
        zona.setText("");
        departamento.setText("");
        municipio.setText("");
        aldeas.setText("");
        id_vehiculo_rutas.setText("");
        id_empleado_rutas.setText("");
        nombre_empleado_rutas.setText("");
        
        this.ELIMINAR.setEnabled(false);
        this.ACTUALIZAR.setEnabled(false);
    }

    private String[] getcolumnas() {
        String columna[] = new String[]{"Id", "Zona", "Departamento", "Municipio", "Aldeas", "Id Vehiculo", "Id Empleado", "nombre"};
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
            java.util.logging.Logger.getLogger(rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton AGREGAR;
    private javax.swing.JButton BuscarEmpleado;
    private javax.swing.JButton BuscarVehiculo;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton NUEVO;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField aldeas;
    private javax.swing.JTextField departamento;
    public static javax.swing.JTextField id_empleado_rutas;
    private javax.swing.JTextField id_ruta;
    public static javax.swing.JTextField id_vehiculo_rutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField municipio;
    public static javax.swing.JTextField nombre_empleado_rutas;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField zona;
    // End of variables declaration//GEN-END:variables
}
