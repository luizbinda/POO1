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
public class LançaFogueteOnOn extends ArmaProfissional {
        
    public LançaFogueteOnOn(int codigo, int serial, Boolean acessorio){
        super(codigo, serial);
        
        this.custo = new MateriaPrima();
        this.custo.setAco(1000);
        this.custo.setFerro(1000);
        this.custo.setAluminio(400);
        this.custo.setChumbo(20);
        this.custo.setOuro(10);
        
        this.setPontuacao(150);
        this.setCalibre(1000);

        if (acessorio) {
            custo = new MateriaPrima();
            custo.setPrata(500);
            setAcessorios(1, this.acessorios, custo, 150);            
        }
    }

    @Override
    public void fabricar(Estoque estoque){
        super.fabricar(estoque);
        this.fabricarAcessorio(estoque);
    }
}

