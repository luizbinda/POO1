/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author luizfernando
 */
public abstract class ArmaArtesanal extends Fabricar {
    private int serial; 
    private int codigo;
    protected ArrayList acessorios;

    public ArmaArtesanal(int codigo, int serial, int pontuacao) {
        this.serial = serial;
        this.codigo = codigo;
        this.pontuacao = pontuacao;
        this.acessorios = new ArrayList();
 
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAcessorios(int qtd, ArrayList acessorios, MateriaPrima custo, int pontuacao) {
         
        for (int i = qtd; i > 0; i--) {
            this.acessorios.add(new Acessorios()); 
        }

        Iterator i = this.acessorios.iterator();   
        while (i.hasNext()) {
            Acessorios aux = (Acessorios) i.next();
            aux.setCusto(custo);
            aux.setPontuacao(pontuacao);
        }
    }

    public void fabricarAcessorio(Estoque estoque){
        if(!this.acessorios.isEmpty()){
            Iterator i = this.acessorios.iterator();
            while (i.hasNext()) {
                Acessorios acessorio = (Acessorios) i.next();
                acessorio.fabricar(estoque);
                this.setPontuacao(getPontuacao() + acessorio.getPontuacao());
            }
        }
    }

}
