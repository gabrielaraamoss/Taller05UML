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
public class Secretaria extends Persona {

    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecha) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecha);
    }
    
    public void verificarCita(){
    System.out.println("verificando cita (; ");
    
}
    public void agendarCita(){
    System.out.println("Agendando cita");}
    
    
}
