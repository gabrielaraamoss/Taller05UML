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
public class Administrador extends Persona {
 
public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecha) {
    super(usuario, clave, nombre, apellido, cedula, direccion, fecha);

}

    
    public void registrarUsuario(){}
    
    public void asignarRol(Persona persona){
        
    }
    
}
