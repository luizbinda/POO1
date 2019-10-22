/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import java.util.Collections;
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
      
    public void getBazukaZonkaMaiorBocal() {
        ArrayList <BazukaZonka> bazukas = new ArrayList<>(); 
        for (ArmaArtesanal arma : arrayArmas) {
            if (arma instanceof BazukaZonka) {
                bazukas.add((BazukaZonka) arma);
            }         
        }    
        Collections.sort(bazukas);
    
        boolean mais_de_uma = false;
        BazukaZonka maior = bazukas.get(bazukas.size() - 1);
        bazukas.remove(bazukas.size() - 1);
   
        System.out.print("A Bazuka Zonka de serial " + maior.getSerial());
        for (BazukaZonka bazuka : bazukas){
            if( maior.compareTo(bazuka) == 0){
                System.out.print(", " + bazuka.getSerial());
                mais_de_uma = true;
            }

        } 

        if(mais_de_uma)
            System.out.println(" são as bazukas com mais bocais (" + maior.acessorios.size() + ").");
        else
            System.out.println(" é a bazuka com mais bocais (" + maior.acessorios.size() + ").");

    }
}
