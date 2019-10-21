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
public class ArmaProfissional extends ArmaArtesanal{
    private int calibre;

    public ArmaProfissional(int codigo, int serial, int pontuacao, int calibre) {
        super(codigo, serial, pontuacao);
        this.calibre = calibre;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }
    
}
