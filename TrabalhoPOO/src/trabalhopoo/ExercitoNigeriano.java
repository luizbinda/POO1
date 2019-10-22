/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.Scanner;

/**
 *
 * @author luizfernando
 */

public class ExercitoNigeriano extends Exercito{
    
    public ExercitoNigeriano(Estoque estoque){
        super(estoque);
    }

    @Override
    public void armasProduzidas(int codigo, int serial, int acessorio){
        switch (codigo) {
            case 1:
                ArmaArtesanal arma = new EstilingueDeSuri(codigo, serial);
                this.arrayArmas.add(arma);
                break;
            case 2:
                ArmaArtesanal arma1 = new PistolaCanked(codigo, serial, acessorio == 1);
                this.arrayArmas.add(arma1);
                break;
            case 3:
                ArmaArtesanal arma2 = new MetralhadoraNinek(codigo, serial);
                this.arrayArmas.add(arma2);          
                break;
            case 4:
                ArmaArtesanal arma3 = new FuzilK777(codigo, serial);
                this.arrayArmas.add(arma3);  
                break;
            case 5:
                ArmaArtesanal arma4 = new BazukaZonka(codigo, serial, acessorio);
                this.arrayArmas.add(arma4);
                break;
            }          
    }

    @Override
    public int descobirAcessorio(int codigo, Scanner scan) {
        int acessorio = 0;
        if(codigo == 2)
            acessorio = scan.nextBoolean() ? 1 : 0 ;

        if(codigo == 5){
            acessorio = scan.hasNextBoolean() ? scan.nextBoolean() == true ? 1 : 0 : scan.nextInt();
        } 
        return acessorio;
    }
      
    public int getBazukaZonkaMaiorBocal() {
        boolean existe = false;
        int bocais = 0;
        int max_bocais = 0;
        for (ArmaArtesanal arma : arrayArmas) {
            if (arma instanceof BazukaZonka) {
                existe = true;
                for ( Object acessorio : arma.acessorios)
                    bocais++;
                
                if( max_bocais < bocais)
                    max_bocais = bocais;
            }
        }   
        return bocais;     
    }
}
