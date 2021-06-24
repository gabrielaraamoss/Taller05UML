/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
class HistoriaClinica {
    protected int numero;
    protected ArrayList enfermedades, alergias, otros;

    public HistoriaClinica(int numero, ArrayList enfermedades, ArrayList alergias, ArrayList otros) {
        this.numero = numero;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }

    
}
