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
public class PistolaCanked extends ArmaProfissional {

    public PistolaCanked(int codigo, int serial, boolean acessorio){
        super(codigo, serial, 5, 40);
        
        this.custo = new MateriaPrima();
        this.custo.setMadeira(50);
        this.custo.setAco(100);
        this.custo.setFerro(50);
        this.custo.setChumbo(20);
        this.custo.setCobre(10);
        this.custo.setOuro(30);
        this.custo.setPrata(20);

        if (acessorio) {            
            custo = new MateriaPrima();
            custo.setPrata(60);
            setAcessorios(1, this.acessorios, custo, 10);         
        }
    }
    
    @Override
    public void fabricar(Estoque estoque){
        super.fabricar(estoque);
        this.fabricarAcessorio(estoque);
        
    }
    
}
