/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author luizfernando
 */

public class ArmasArquivo {
    private int codigo;
    private int serial;
    private int acessorio;

    public ArmasArquivo(int codigo, int serial, int acessorio) {
        this.codigo = codigo;
        this.serial = serial;
        this.acessorio = acessorio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(int acessorio) {
        this.acessorio = acessorio;
    }
    
}
