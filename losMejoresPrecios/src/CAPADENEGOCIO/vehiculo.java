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
public class vehiculo {
    private int IdVehiculos;
    private String descripcion;
    private String color;
    private String placas;
    private String estado;
    private String accion;
    
    public vehiculo(){
        
    }

    public int getIdVehiculos() {
        return IdVehiculos;
    }

    public void setIdVehiculos(int IdVehiculos) {
        this.IdVehiculos = IdVehiculos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
}
