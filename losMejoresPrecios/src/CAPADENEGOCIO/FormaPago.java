/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPADENEGOCIO;

/**
 *
 * @author DAVID
 */
public class FormaPago {
    private int IdFormaPago;
    private String descripcion;
    private String accion;
    
    public FormaPago(){
        
    }

    public int getIdFormaPago() {
        return IdFormaPago;
    }

    public void setIdFormaPago(int IdFormaPago) {
        this.IdFormaPago = IdFormaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
     
    
}
