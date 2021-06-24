/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;
/jolj
/**
 *
 * @author Hp
 */
public class AreaMedica {
    
    protected String especialidad;
    protected float costor;
    
    public Doctor doctor;

    public AreaMedica(String especialidad, float costor) {
        this.especialidad = especialidad;
        this.costor = costor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
}
