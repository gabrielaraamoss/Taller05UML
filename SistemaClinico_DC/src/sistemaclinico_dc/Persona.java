/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class Persona {
    protected String usuario, clave, nombre, apellido, cedula,
            direccion;
    protected Date fecha;

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecha) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fecha = fecha;
    }
   
    
    public boolean logIn(){
    return true;}
    
    public boolean logOut(){
    return false;}
    
            
    
}
