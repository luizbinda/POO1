/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luizfernando
 */
public abstract class Exercito {

    private int dias = 0;
    protected Estoque estoque;
    protected ArrayList <ArmaArtesanal> arrayArmas;
    protected static ArrayList <Integer> armas_com_calibre_maior_que_100;

    public abstract void armasProduzidas(int codigo, int serial, int acessorio);
    public abstract int descobirAcessorio(int codigo, Scanner scan);

    public Exercito(Estoque estoque) {
        this.estoque = estoque;
        armas_com_calibre_maior_que_100 = new ArrayList <>();

    }

    public int fabricarArmas() {
        while (this.estoque.verificarEstoque()) {
            for (ArmaArtesanal arma : arrayArmas){
                arma.fabricar(this.estoque);
                if (!this.estoque.verificarEstoque())
                    return this.getDias();
            }
            this.setDias(this.getDias() + 1);
        }        
        return this.getDias();
    }

    public void lerArmas(String path) throws FileNotFoundException {
        FileInputStream armas_arquivo = new FileInputStream(path);
        Scanner scan = new Scanner(armas_arquivo);
        this.arrayArmas = new ArrayList<>(scan.nextInt());
        int codigo = 0;
        int serial = 0;
        int acessorio = 0;

        while (scan.hasNext()) {
            codigo = scan.nextInt();
            serial = scan.nextInt();
            acessorio = descobirAcessorio(codigo, scan);      
            armasProduzidas(codigo, serial, acessorio);
        }
        scan.close();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getTotalArmasArtesanais() {
        int total_armas_artesanais = 0;
        for (ArmaArtesanal arma : arrayArmas) {
            if (!(arma instanceof ArmaProfissional)) {
                total_armas_artesanais++;
            }
        }
        return total_armas_artesanais;
    }

    public int getPontuacaoExercito() {
        int pontucao_total = 0;
        for( int i = 0; i < getDias(); i++){
            for (ArmaArtesanal arma : arrayArmas) {
                pontucao_total += arma.getPontuacao();
            }
        }
        return pontucao_total;
    }

}
