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
public class Fabricar extends MateriaPrima {

    protected int pontuacao;
    protected MateriaPrima custo;

    public void fabricar(Estoque estoque){
        estoque.setMadeira(estoque.getMadeira() - this.custo.getMadeira());
        estoque.setAco(estoque.getAco() - this.custo.getAco());
        estoque.setFerro(estoque.getFerro() - this.custo.getFerro());
        estoque.setAluminio(estoque.getAluminio() - this.custo.getAluminio());
        estoque.setChumbo(estoque.getChumbo() - this.custo.getChumbo());
        estoque.setCobre(estoque.getCobre() - this.custo.getCobre());
        estoque.setOuro(estoque.getOuro() - this.custo.getOuro());
        estoque.setPrata(estoque.getPrata() - this.custo.getPrata());
        estoque.setCouro(estoque.getCouro() - this.custo.getCouro());
        estoque.setPedra(estoque.getPedra() - this.custo.getPedra());
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setCusto(MateriaPrima custo) {
        this.custo = custo;
    }
}
