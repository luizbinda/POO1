/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author luizfernando
 */
public abstract class ArmaProfissional extends ArmaArtesanal{
    private int calibre;

    public ArmaProfissional(int codigo, int serial) {
        super(codigo, serial);
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }
    
}
