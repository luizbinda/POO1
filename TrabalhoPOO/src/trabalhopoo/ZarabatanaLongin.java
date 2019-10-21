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
public class ZarabatanaLongin extends ArmaArtesanal {

    public ZarabatanaLongin(int codigo, int serial, boolean acessorio) {
        super(codigo, serial);
        this.setPontuacao(2);

        this.custo = new MateriaPrima();
        this.custo.setMadeira(300);
        this.custo.setPedra(20);

        if (acessorio) {
            this.acessorios.add(new Acessorios());            
        }
    }
}
