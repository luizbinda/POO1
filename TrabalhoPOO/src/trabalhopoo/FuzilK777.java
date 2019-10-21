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
public class FuzilK777 extends ArmaProfissional{

    public FuzilK777(int codigo, int serial) {
        super(codigo, serial);
        this.setPontuacao(50);
        this.setCalibre(100);

        this.custo = new MateriaPrima();
        this.custo.setFerro(800);
        this.custo.setAluminio(20);
        this.custo.setChumbo(20);
        this.custo.setCobre(20);
        this.custo.setOuro(20);
        this.custo.setPrata(20);
        this.custo.setPedra(20);

    }
    
}
