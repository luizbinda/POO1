/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luizfernando
 */
public class ExercitoBokoHaram extends Exercito {
    public ExercitoBokoHaram(Estoque estoque){
        super(estoque);
    }
    
    @Override
    public void armasProduzidas(int codigo, int serial, int acessorio){
        switch (codigo) {
            case 1:
                ArmaArtesanal arma = new ZarabatanaLongin(codigo, serial, acessorio == 1);
                this.arrayArmas.add(arma);
                break;
            case 2:
                ArmaArtesanal arma1 = new LançaForal(codigo, serial, acessorio == 1);
                this.arrayArmas.add(arma1);
                break;
            case 3:
                ArmaArtesanal arma2 = new MetralhadoraHamHam(codigo, serial);
                this.arrayArmas.add(arma2);          
                break;
            case 4:
                ArmaArtesanal arma3 = new LancaChamasMirak(codigo, serial);
                this.arrayArmas.add(arma3);  
                break;
            case 5:
                ArmaArtesanal arma4 = new LançaFogueteOnOn(codigo, serial, acessorio == 1);
                this.arrayArmas.add(arma4);
                Exercito.armas_com_calibre_maior_que_100.add(serial);
                break;
        }          
    }

   @Override
    public int descobirAcessorio(int codigo, Scanner scan) {
        int acessorio = 0;
        if(codigo == 1 || codigo == 2 || codigo == 5)
            acessorio = scan.nextBoolean() ? 1 : 0 ;
        return acessorio;
    }
    

    public void getMaiorQuantidadeLançaFogueteOnOn() {
        ArrayList <LançaFogueteOnOn> foguetes = new ArrayList<>(); 
        for (ArmaArtesanal arma : arrayArmas) {
            if (arma instanceof LançaFogueteOnOn) {
                foguetes.add((LançaFogueteOnOn) arma);
            }         
        }       

        int com_foguetes_especias = 0;
        int sem_foguetes_especias = 0;

        for (LançaFogueteOnOn foguete : foguetes){
            if( foguete.acessorios.size() > 0)
                com_foguetes_especias++;
            else
                sem_foguetes_especias++;
        } 
        if(com_foguetes_especias > sem_foguetes_especias )
            System.out.println("SIM");
        else if(com_foguetes_especias < sem_foguetes_especias ) 
            System.out.println("NÃO");
        else
            System.out.println("EMPATE");

    }






}
