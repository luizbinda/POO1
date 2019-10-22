/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;

/**
 *
 * @author luizfernando
 */
public abstract class ArmaArtesanal extends Objeto {
    private final int serial; 
    private final int codigo;
    protected ArrayList <Objeto> acessorios;

    public ArmaArtesanal(int codigo, int serial, int pontuacao) {
        this.serial = serial;
        this.codigo = codigo;
        this.pontuacao = pontuacao;
        this.acessorios = new ArrayList();
    }

    public int getSerial() {
        return serial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setAcessorios(int qtd, ArrayList acessorios, MateriaPrima custo, int pontuacao) {
         
        for (int i = qtd; i > 0; i--) {
            this.acessorios.add(new Objeto()); 
        }
        for( Objeto acessorio : this.acessorios){
            acessorio.setCusto(custo);
            acessorio.setPontuacao(pontuacao);
        }
    }

    public void fabricarAcessorio(Estoque estoque){
        if(!this.acessorios.isEmpty()){
            for( Objeto acessorio : this.acessorios){
                acessorio.fabricar(estoque);
            }
        }
    }
    
    @Override
    public int getPontuacao() {
        int pontuacao = super.getPontuacao();

        for( Objeto acessorio : this.acessorios){
            pontuacao += acessorio.getPontuacao();
        } 
        
        return pontuacao;
    }
}
