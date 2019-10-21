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
     private int total_armas = 0;
     private int total_armas_artesanais = 0;
     private int total_armas_profissionais = 0;
     protected Estoque estoque;
     protected ArrayList <ArmasArquivo> armas;

     public Exercito(Estoque estoque) {
        this.estoque = estoque;
        this.armas = new ArrayList<>();
    }

     public abstract int fabricarArmas();

     public void lerArmas(String path) throws FileNotFoundException{
        FileInputStream armas_arquivo = new FileInputStream(path);
        Scanner scan = new Scanner(armas_arquivo);  
        this.setTotal_armas(scan.nextInt());
        int codigo = 0;
        int serial = 0;
        int acessorio = 0;
        
        while (scan.hasNext()) {
            codigo = scan.nextInt();
            serial = scan.nextInt();
            if(scan.hasNext()){
                if(scan.hasNextBoolean())  
                    acessorio = scan.nextBoolean() ? 1 : 0;
                else if(scan.hasNextInt())
                    acessorio = scan.nextInt();
            }
            this.armas.add(new ArmasArquivo(codigo, serial, acessorio));
            codigo = 0;
            serial = 0;
            acessorio = 0;
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

    public int getTotal_armas_artesanais() {
        return total_armas_artesanais;
    }

    public void setTotal_armas_artesanais(int total_armas_artesanais) {
        this.total_armas_artesanais = total_armas_artesanais;
    }

    public int getTotal_armas_profissionais() {
        return total_armas_profissionais;
    }

    public void setTotal_armas_profissionais(int total_armas_profissionais) {
        this.total_armas_profissionais = total_armas_profissionais;
    }

}
