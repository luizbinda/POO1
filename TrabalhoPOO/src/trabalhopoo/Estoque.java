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

public class  Estoque extends MateriaPrima {

    public Estoque(String path) throws FileNotFoundException {
        FileInputStream estoque = new FileInputStream(path);
        Scanner scan = new Scanner(estoque); 
      
        scan.next();
        this.setMadeira(scan.nextInt());

        scan.next();
        this.setAco(scan.nextInt());
        
        scan.next();
        this.setFerro(scan.nextInt());

        scan.next();
        this.setAluminio(scan.nextInt());

        scan.next();
        this.setChumbo(scan.nextInt());

        scan.next();
        this.setCobre(scan.nextInt());

        scan.next();
        this.setOuro(scan.nextInt());

        scan.next();
        this.setPrata(scan.nextInt());

        scan.next();
        this.setCouro(scan.nextInt());

        scan.next();
        this.setPedra(scan.nextInt());

        scan.close();


    }
  
    public void getTotalEstoque(){
        System.out.println(this.getMadeira());
        System.out.println(this.getFerro());
        System.out.println(this.getAluminio());
        System.out.println(this.getChumbo());
        System.out.println(this.getCobre());
        System.out.println(this.getOuro());
        System.out.println(this.getPrata());
        System.out.println(this.getCouro());
        System.out.println(this.getPedra());
    }

    public boolean verificarEstoque(){
        if(this.getMadeira() < 0)
            return false;
        if(this.getFerro() < 0)
            return false;
        if(this.getAluminio() < 0)
            return false;
        if(this.getChumbo() < 0)
            return false;
        if(this.getCobre() < 0)
            return false;
        if(this.getOuro() < 0)
            return false;
        if(this.getPrata() < 0)
            return false;
        if(this.getCouro() < 0)
            return false;
        if(this.getPedra() < 0)
            return false;
        return true;
    }

}


