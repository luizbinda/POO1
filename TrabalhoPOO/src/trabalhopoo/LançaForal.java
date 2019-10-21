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
public class LançaForal extends ArmaArtesanal{

    public LançaForal(int codigo, int serial, boolean acessorio) {
        super(codigo, serial, 1);

        this.custo = new MateriaPrima();
        this.custo.setMadeira(100);
        this.custo.setFerro(100);
        this.custo.setPedra(200);

        if (acessorio) {
            this.acessorios.add(new Acessorios());            
        }
    }  
}
