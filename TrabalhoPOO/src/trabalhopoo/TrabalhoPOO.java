/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.io.FileInputStream;
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
        
        Estoque estoque_nigeriano = new Estoque("C:\\Users\\luizfernando\\Documents\\NetBeansProjects\\TrabalhoPOO\\estoque_exercito_nigeriano.txt");
        Estoque estoque_boko_haram = new Estoque("C:\\Users\\luizfernando\\Documents\\NetBeansProjects\\TrabalhoPOO\\estoque_boko_haram.txt");
        ExercitoNigeriano nigeria = new ExercitoNigeriano(estoque_nigeriano);
        
        nigeria.lerArmas("C:\\Users\\luizfernando\\Documents\\NetBeansProjects\\TrabalhoPOO\\Armas_exercito_nigeriano.txt");

        nigeria.fabricarArmas();
        
        System.out.println("---------------------");
        nigeria.getEstoque().getTotalEstoque();
        System.out.println(nigeria.getDias());  
    }
    
}
