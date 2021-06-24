/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Paciente extends Persona{
    
    protected String Email;
    
    public HistoriaClinica historia;
    public Receta receta;
    
    public List<Cita> citas;

    /**
     *
     * @param Email
     * @param historia
     * @param receta
     * 
     */
    
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecha){
        super(usuario, clave, nombre, apellido, cedula, direccion, fecha);
                this.Email = Email;
        this.historia = historia;
        this.receta = receta;
    } 

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    public boolean solicitarCita(){
    return false;}
    
}
