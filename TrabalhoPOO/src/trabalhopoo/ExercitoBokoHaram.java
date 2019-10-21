/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.io.FileInputStream;
import java.util.Iterator;
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
    public int fabricarArmas() {
        while(this.estoque.verificarEstoque()){
            Iterator i = this.armas.iterator();
            while( i.hasNext()){
                ArmasArquivo aux = (ArmasArquivo) i.next();
                switch (aux.getCodigo()) {
                case 1:
                    ZarabatanaLongin ZarabatanaLongin = new ZarabatanaLongin(aux.getCodigo(), aux.getSerial(), (aux.getAcessorio() == 1));
                    ZarabatanaLongin.fabricar(this.estoque);
                    break;
                case 2:
                    LançaForal LançaForal = new LançaForal(aux.getCodigo(), aux.getSerial(), (aux.getAcessorio() == 1));
                    LançaForal.fabricar(this.estoque);
                    break;
                case 3:
                    MetralhadoraHamHam MetralhadoraHamHam = new MetralhadoraHamHam(aux.getCodigo(), aux.getSerial());
                    MetralhadoraHamHam.fabricar(this.estoque);              
                    break;
                case 4:
                    LancaChamasMirak LancaChamasMirak = new LancaChamasMirak(aux.getCodigo(), aux.getSerial());
                    LancaChamasMirak.fabricar(this.estoque);  
                    break;
                case 5:
                    LançaFogueteOnOn LançaFogueteOnOn = new LançaFogueteOnOn(aux.getCodigo(), aux.getSerial(), (aux.getAcessorio() == 1));
                    LançaFogueteOnOn.fabricar(this.estoque);
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
