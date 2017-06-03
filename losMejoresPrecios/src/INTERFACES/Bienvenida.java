/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package INTERFACES;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author israis007
 */
public class Bienvenida extends javax.swing.JFrame {
private int auxiliar = 0;
private boolean realizado = false;
hilo ejecutar = new hilo();
    /**
     * Creates new form welcome
     */
    public Bienvenida() {
        initComponents();
        Bienvenida.this.getRootPane().setOpaque(false);        
        Bienvenida.this.getContentPane ().setBackground (new Color (0, 0, 0, 0));
        Bienvenida.this.setBackground (new Color (0, 0, 0, 0)); 
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 340, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("BIENVENIDOS ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        text.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/w.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(realizado == false){
        realizado = true;
        barra.setMaximum(49);
        barra.setMinimum(0);
        barra.setStringPainted(true);
        ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    private class hilo extends Thread{
    @Override
    public void run(){
        try {while(true){
            auxiliar++;
            barra.setValue(auxiliar);
            repaint();
            switch(auxiliar){
                case 3:
                    text.setText("Cargando programa...");
                    break;
                case 20:
                    text.setText("Leyendo preferencias");
                    break;
                case 50:
                    text.setText("Carga finalizada");
                    break;
                case 60:
                    principal p = new principal();
                    p.setVisible(true);
                    p.setLocationRelativeTo(Bienvenida.this);
                    Bienvenida.this.dispose();
                    break;                    
            }
            Thread.sleep(100);}
        } catch (InterruptedException ex) {
            Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}

