/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author luizfernando
 */
public abstract class Exercito {

    private int dias = 0;
    private int total_armas = 0;
    private static int armas_artesanais;
    protected Estoque estoque;
    protected ArrayList<ArmaArtesanal> arrayArmas;

    public abstract void armasProduzidas(int codigo, int serial, int acessorio);

    public Exercito(Estoque estoque) {
        this.estoque = estoque;
    }

    public int fabricarArmas() {
        while (this.estoque.verificarEstoque()) {
            Iterator i = this.arrayArmas.iterator();
            while (i.hasNext()) {
                ArmaArtesanal aux = (ArmaArtesanal) i.next();
                aux.fabricar(this.estoque);
                if (!this.estoque.verificarEstoque()) {
                    break;
                }
            }
            this.setDias(this.getDias() + 1);
        }
        return this.getDias();
    }

    public abstract int descobirAcessorio(int codigo, Scanner scan);

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

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getTotal_armas() {
        return total_armas;
    }

    public void setTotal_armas(int total_armas) {
        this.total_armas = total_armas;
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

    public int getTotalArmasProfissionais() {
        int total_armas_profissionais = 0;
        for (ArmaArtesanal arma : arrayArmas) {
            if (arma instanceof ArmaProfissional) {
                total_armas_profissionais++;
            }
        }
        return total_armas_profissionais;
    }

}
