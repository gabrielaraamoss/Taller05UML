/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

/**
 *
 * @author Hp
 */
public class PagoEfectivo implements Pago {
    
    protected float monto;

    public PagoEfectivo(float monto) {
        this.monto = monto;
    }
    
    

    @Override
    public boolean realizarPago(Double monto) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
