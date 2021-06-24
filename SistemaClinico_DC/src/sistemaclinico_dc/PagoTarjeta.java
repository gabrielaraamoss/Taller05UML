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
public class PagoTarjeta implements Pago {
    
    protected float monto;
    protected String propietario, banco, numero;
    protected Date expira;

    public PagoTarjeta(float monto, String propietario, String banco, String numero, Date expira) {
        this.monto = monto;
        this.propietario = propietario;
        this.banco = banco;
        this.numero = numero;
        this.expira = expira;
    }
    
    

    @Override
    public boolean realizarPago(Double monto) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
