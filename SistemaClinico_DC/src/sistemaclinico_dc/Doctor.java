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
public class Doctor extends Persona {
    protected int regDoctor;
    protected String especialidad;

    public Secretaria secretaria;

    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecha){
        super(usuario, clave, nombre, apellido, cedula, direccion, fecha);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;

    }


    public void recetar(){
    System.out.println("Resetando v:");}
    
    public void agregarPlanNut(){
        System.out.println("Agregando plan");
    }
    
    public void imprimirReceta(){
    System.out.println("imprimiendo *o* ");}
    
    public void registraSecretaria(Secretaria secretaria){
        this.secretaria=secretaria;}
    
}

