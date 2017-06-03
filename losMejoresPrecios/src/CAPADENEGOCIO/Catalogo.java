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
public class Catalogo {
    private int IdCatalogo;
    private String descripcion;
    private String accion;
    
    public Catalogo(){
    }

    public int getIdCatalogo() {
        return IdCatalogo;
    }

    public void setIdCatalogo(int IdCatalogo) {
        this.IdCatalogo = IdCatalogo;
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
