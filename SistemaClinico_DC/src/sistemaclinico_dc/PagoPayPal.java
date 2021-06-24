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
public class PagoPayPal implements Pago{
    
    protected float monto;
    protected String email;

    public PagoPayPal(float monto, String email) {
        this.monto = monto;
        this.email = email;
    }

    
    @Override
    public boolean realizarPago(Double monto) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
}
