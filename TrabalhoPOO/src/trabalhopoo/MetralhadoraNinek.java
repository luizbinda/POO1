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
public class MetralhadoraNinek extends ArmaProfissional{
    public MetralhadoraNinek(int codigo, int serial){
        super(codigo, serial);
        
        this.custo = new MateriaPrima();
        this.custo.setMadeira(200);
        this.custo.setAco(200);
        this.custo.setFerro(200);
        this.custo.setOuro(10);
        this.custo.setPrata(10);

        this.setPontuacao(20);
        this.setCalibre(80);

    }
    
}
