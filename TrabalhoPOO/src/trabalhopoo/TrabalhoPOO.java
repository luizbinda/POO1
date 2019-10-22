/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.io.FileNotFoundException;


/**
 *
 * @author luizfernando
 */
public class TrabalhoPOO {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Estoque estoque_nigeriano = new Estoque("./estoque_boko_haram.txt");
        Estoque estoque_boko_haram = new Estoque("./estoque_boko_haram.txt");
        ExercitoNigeriano nigeria = new ExercitoNigeriano(estoque_nigeriano);
        ExercitoBokoHaram boko_haram = new ExercitoBokoHaram(estoque_boko_haram);
        
        nigeria.lerArmas("./Armas_exercito_nigeriano.txt");
        nigeria.fabricarArmas();
        boko_haram.lerArmas("./Armas_boko_haram.txt");
        boko_haram.fabricarArmas();

        System.out.println("---------------------");
        System.out.println("O exército nigeriano produz " + nigeria.getTotalArmasArtesanais() + " arma artesanal por dia" );  
        System.out.println("O boko haram produz " + boko_haram.getTotalArmasArtesanais() + " arma artesanal por dia" );  
        System.out.println("bocais  " + nigeria.maiorBocalBazukaZonka() );  
   
    }
    
}
