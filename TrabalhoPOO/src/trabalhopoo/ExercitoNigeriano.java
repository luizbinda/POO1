/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author luizfernando
 */

public class ExercitoNigeriano extends Exercito{

    private ArrayList <EstilingueDeSuri> EstilingueDeSuri;
    private ArrayList <PistolaCanked> PistolaCanked;
    private ArrayList <MetralhadoraNinek> MetralhadoraNinek;
    private ArrayList <FuzilK777> FuzilK777;
    private ArrayList <BazukaZonka> BazukaZonka;
    
    public ExercitoNigeriano(Estoque estoque){
        super(estoque);
    }
   
    @Override
    public int fabricarArmas() {
        while(this.estoque.verificarEstoque()){
            Iterator i = this.armas.iterator();
            while( i.hasNext()){
                ArmasArquivo aux = (ArmasArquivo) i.next();
                switch (aux.getCodigo()) {
                case 1:
                    EstilingueDeSuri EstilingueDeSuri = new EstilingueDeSuri(aux.getCodigo(), aux.getSerial());
                    EstilingueDeSuri.fabricar(this.estoque);
                    break;
                case 2:
                    PistolaCanked PistolaCanked = new PistolaCanked(aux.getCodigo(), aux.getSerial(), (aux.getAcessorio() == 1));
                    PistolaCanked.fabricar(this.estoque);
                    break;
                case 3:
                    MetralhadoraNinek MetralhadoraNinek = new MetralhadoraNinek(aux.getCodigo(), aux.getSerial());
                    MetralhadoraNinek.fabricar(this.estoque);              
                    break;
                case 4:
                    FuzilK777 FuzilK777 = new FuzilK777(aux.getCodigo(), aux.getSerial());
                    FuzilK777.fabricar(this.estoque);  
                    break;
                case 5:
                    BazukaZonka BazukaZonka = new BazukaZonka(aux.getCodigo(), aux.getSerial(), aux.getAcessorio());
                    BazukaZonka.fabricar(this.estoque);
                    break;
                }                
                if(!this.estoque.verificarEstoque())
                    break;
            }
            this.setDias( this.getDias() + 1);
        }
        return this.getDias();
    }
       
}
