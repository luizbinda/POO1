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
public class LancaChamasMirak extends ArmaProfissional{

    public LancaChamasMirak(int codigo, int serial){
        super(codigo, serial);
        
        this.custo = new MateriaPrima();
        this.custo.setMadeira(500);
        this.custo.setAco(20);
        this.custo.setFerro(20);
        this.custo.setAluminio(20);
        this.custo.setChumbo(20);
        this.custo.setCobre(10);
        this.custo.setOuro(10);
        this.custo.setPrata(10);
        this.custo.setPedra(40);

        this.setPontuacao(40);
        this.setCalibre(50);

    }
}
