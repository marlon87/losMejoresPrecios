/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES;
//hola moviendo1

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID
 */
public class Facturas extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ventas_contado
     */
    public Facturas() {
        initComponents();
        setLocationRelativeTo(null);
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad");
        modelo.addColumn("PrecioVenta");
        modelo.addColumn("Subtotal");
        this.datos.setModel(modelo);
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
        GenerarFactura = new javax.swing.JButton();
        AgregarCliente = new javax.swing.JButton();
        descuento = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        id_factura = new javax.swing.JTextField();
        nit = new javax.swing.JTextField();
        codigo_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        direccioncliente = new javax.swing.JTextField();
        tipodepago = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        nombreempleado_factu = new javax.swing.JTextField();
        buscacliente = new javax.swing.JButton();
        buscaempleado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        nombrecliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        codigo_empleado_factu = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        anulacionfactura = new javax.swing.JButton();
        estadofactura = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        obtienecodigo = new javax.swing.JTextField();
        obtieneprecioventa = new javax.swing.JTextField();
        obtiennombre = new javax.swing.JTextField();
        obtienecantidad1 = new javax.swing.JTextField();
        addtable = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenerarFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GenerarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496176881_Generate-tables.png"))); // NOI18N
        GenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(GenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 240, -1, -1));

        AgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496212138_floppy_disk_save.png"))); // NOI18N
        jPanel1.add(AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 360, 70, 50));
        jPanel1.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 130, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496182226_arrow-return-180.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 290, 70, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descuento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 70, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de pago");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero de Factura");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Serie");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 40, -1));
        jPanel1.add(serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venta de Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 380, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nit:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 40, -1));

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Codigo", "Descripcion", "Cantidad", "Precio Venta", "Sub Total"
            }
        ));
        datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 1190, 270));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Codigo_Empleado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, -1));

        id_factura.setEditable(false);
        jPanel1.add(id_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 20));

        nit.setEditable(false);
        jPanel1.add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 100, -1));

        codigo_cliente.setEditable(false);
        jPanel1.add(codigo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 40, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Direccion:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 100, -1));

        direccioncliente.setEditable(false);
        jPanel1.add(direccioncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 450, -1));

        tipodepago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Cheque", "Tarjeta de Credito", "Tarjeta de Debito", "Credito", " " }));
        tipodepago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodepagoActionPerformed(evt);
            }
        });
        jPanel1.add(tipodepago, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, 70, 20));

        total.setEditable(false);
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 620, 130, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Iva:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 70, 20));

        iva.setEditable(false);
        jPanel1.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 580, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre del Empleado:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, -1));

        nombreempleado_factu.setEditable(false);
        jPanel1.add(nombreempleado_factu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 200, -1));

        buscacliente.setText("Buscar Cliente F2");
        buscacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaclienteActionPerformed(evt);
            }
        });
        jPanel1.add(buscacliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 130, 50));

        buscaempleado.setText("Buscar Empleado F1");
        buscaempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(buscaempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 130, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 100, -1));

        nombrecliente.setEditable(false);
        jPanel1.add(nombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Codigo_cliente:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 100, -1));

        codigo_empleado_factu.setEditable(false);
        jPanel1.add(codigo_empleado_factu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 50, -1));

        subtotal.setEditable(false);
        jPanel1.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 560, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("SubTotal");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 70, 20));

        anulacionfactura.setText("ANULACION");
        jPanel1.add(anulacionfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 130, 50));

        estadofactura.setEditable(false);
        jPanel1.add(estadofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 170, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Estado de la Factura:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 140, -1));

        jButton1.setText("Agregar Productos F3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 140, 50));

        obtienecodigo.setEditable(false);
        jPanel1.add(obtienecodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, -1));

        obtieneprecioventa.setEditable(false);
        jPanel1.add(obtieneprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 100, -1));

        obtiennombre.setEditable(false);
        jPanel1.add(obtiennombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 80, -1));
        jPanel1.add(obtienecantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 100, -1));

        addtable.setText("+");
        addtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtableActionPerformed(evt);
            }
        });
        jPanel1.add(addtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 80, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        principal p = new principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void GenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarFacturaActionPerformed
        // TODO add your handling code here:
        ReporteFacturas r = new ReporteFacturas();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GenerarFacturaActionPerformed

    private void tipodepagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodepagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodepagoActionPerformed

    private void buscaempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaempleadoActionPerformed
        // TODO add your handling code here:
        Consultaempleadosfactura ver = new Consultaempleadosfactura();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        //this.setVisible(false);
    }//GEN-LAST:event_buscaempleadoActionPerformed

    private void buscaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaclienteActionPerformed
        // TODO add your handling code here:
        consultaclientes ver2 = new consultaclientes();
        ver2.setVisible(true);
        ver2.setLocationRelativeTo(null);
    }//GEN-LAST:event_buscaclienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        consultaproductos ver3 = new consultaproductos();
        ver3.setVisible(true);
        ver3.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_datosMouseClicked

    private void addtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtableActionPerformed
             double cont2=0;
        String[] agregar = new String[5];
        agregar[0] = obtienecodigo.getText();
        agregar[1] = obtiennombre.getText();
        agregar[2] = obtienecantidad1.getText();
        agregar[3] = obtieneprecioventa.getText();
        double canti = Double.parseDouble(obtienecantidad1.getText());
        double preci = Double.parseDouble(obtieneprecioventa.getText());
        double resul = canti * preci;
        agregar[4] = String.valueOf(String.format("%.2f", resul));
        modelo.addRow(agregar);
for(int i=0;i<this.modelo.getRowCount();i++)
        {
        cont2=Double.parseDouble(this.modelo.getValueAt(i,3).toString())+cont2;
        }
        subtotal.setText(String.valueOf(String.format("%.2f",cont2)));
        iva.setText(String.valueOf(String.format("%.2f",cont2*0.12)));
        total.setText(String.valueOf(String.format("%.2f",(cont2*0.12)+cont2)));
       
    }//GEN-LAST:event_addtableActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked
    private String[] getcolumnas() {
        //String columna[] = new String[]{"Id", "Descripcion", "Categoria","PRECIO COMPRA" ,"PRECIO VENTA", "existencia", "Tiempo Garantia"};
        String columna[] = new String[]{"Codigo", "Descripcion", "Cantidad", "Precio Venta", "Sub Total"};
        return columna;
    }

    public void cargar5() {
        /*     //  modelo = new DefaultTableModel(null,getcolumnas());
    
    // this.datos.setModel(modelo);
    
    //Sección 2
    String fila2[] = new String[6];
    
    //Sección 3
    //fila2[0]=obtiene1.getText();
    fila2[0]=obtienecodigo.getText();
    fila2[1]=obtiennombre.getText();
    fila2[2]=obtienecantidad1.getText();
    fila2[3]=obtieneprecioventa.getText();
    double canti=Double.parseDouble(obtienecantidad1.getText());
    double preci=Double.parseDouble(obtieneprecioventa.getText());
    double resul=canti*preci;
    fila2[4]=String.valueOf(String.format("%.2f", resul));
    //Sección 4
    modelo.addRow(fila2);
    datos.setModel(modelo);*/
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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCliente;
    private javax.swing.JButton GenerarFactura;
    private javax.swing.JButton addtable;
    private javax.swing.JButton anulacionfactura;
    private javax.swing.JButton buscacliente;
    private javax.swing.JButton buscaempleado;
    public static javax.swing.JTextField codigo_cliente;
    public static javax.swing.JTextField codigo_empleado_factu;
    private javax.swing.JTable datos;
    private javax.swing.JTextField descuento;
    public static javax.swing.JTextField direccioncliente;
    private javax.swing.JTextField estadofactura;
    private javax.swing.JTextField id_factura;
    private javax.swing.JTextField iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField nit;
    public static javax.swing.JTextField nombrecliente;
    public static javax.swing.JTextField nombreempleado_factu;
    public static javax.swing.JTextField obtienecantidad1;
    public static javax.swing.JTextField obtienecodigo;
    public static javax.swing.JTextField obtieneprecioventa;
    public static javax.swing.JTextField obtiennombre;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField serie;
    private javax.swing.JTextField subtotal;
    private javax.swing.JComboBox<String> tipodepago;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
