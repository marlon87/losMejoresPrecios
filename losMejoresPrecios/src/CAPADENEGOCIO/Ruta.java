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
public class Ruta {
    private int IdRuta;
    private int zona;
    private String departamento;
    private String municipio;
    private String aldea;
    private int IdVehiculo;
    private int IdEmpleado;
    private String nombre;
    private String accion;
    
    public Ruta(){
        
    }

    public int getIdRuta() {
        return IdRuta;
    }

    public void setIdRuta(int IdRuta) {
        this.IdRuta = IdRuta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    public int getIdVehiculo() {
        return IdVehiculo;
    }

    public void setIdVehiculo(int IdVehiculo) {
        this.IdVehiculo = IdVehiculo;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
    
    
}
