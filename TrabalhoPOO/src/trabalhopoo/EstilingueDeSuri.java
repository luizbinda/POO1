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

public class EstilingueDeSuri extends ArmaArtesanal {

    public EstilingueDeSuri(int codigo, int serial) {
        super(codigo, serial);
        this.setPontuacao(1);

        this.custo = new MateriaPrima();
        this.custo.setMadeira(100);
        this.custo.setAluminio(50);
        this.custo.setCouro(30);
        this.custo.setPedra(100);
    }
 
}
