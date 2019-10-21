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
public class MetralhadoraHamHam extends ArmaProfissional{
        
    public MetralhadoraHamHam(int codigo, int serial){
        super(codigo, serial);
        
        this.custo = new MateriaPrima();
        this.custo.setMadeira(20);
        this.custo.setAco(50);
        this.custo.setFerro(50);
        this.custo.setAluminio(50);
        this.custo.setChumbo(50);
        this.custo.setCouro(20);
        this.custo.setPedra(20);

        this.setPontuacao(10);
        this.setCalibre(80);

    }
    
}
