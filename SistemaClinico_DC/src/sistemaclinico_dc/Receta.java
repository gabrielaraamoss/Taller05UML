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
class Receta {
    
    protected Date fecha;
    public PlanNutricional plan;
    public Medicamento medicamento;

    public Receta(Date fecha, PlanNutricional plan, Medicamento medicamento) {
        this.fecha = fecha;
        this.plan = plan;
        this.medicamento = medicamento;
    }
   
    
}
