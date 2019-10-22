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
public class BazukaZonka extends ArmaProfissional implements Comparable <BazukaZonka> {

    public BazukaZonka(int codigo, int serial, boolean acessorio) {
        super(codigo, serial, 200, 40);

        this.custo = new MateriaPrima();
        this.custo.setAco(1000);
        this.custo.setFerro(1000);
        this.custo.setAluminio(500);
        this.custo.setChumbo(20);
        this.custo.setPrata(200);
        this.custo.setPedra(100);

        if (acessorio) {
            custo = new MateriaPrima();
            custo.setAco(200);
            custo.setOuro(100);
            setAcessorios(1, this.acessorios, custo, 100);
        }
    }

    public BazukaZonka(int codigo, int serial, int acessorio) {
        super(codigo, serial, 200, 40);

        this.custo = new MateriaPrima();
        this.custo.setAco(1000);
        this.custo.setFerro(1000);
        this.custo.setAluminio(500);
        this.custo.setChumbo(20);
        this.custo.setPrata(200);
        this.custo.setPedra(100);

        if (acessorio > 3) {
            acessorio = 3;
        }

        if (acessorio > 0) {
            custo = new MateriaPrima();
            custo.setAco(200);
            custo.setOuro(100);
            setAcessorios(acessorio, this.acessorios, custo, 100);
        }
    }

    @Override
    public void fabricar(Estoque estoque) {
        super.fabricar(estoque);
        this.fabricarAcessorio(estoque);
    }

    @Override
    public int compareTo(BazukaZonka t) {
        if (this.acessorios.size() > t.acessorios.size()) {
            return 1;
        }
        if (this.acessorios.size() == t.acessorios.size()) {
            return 0;
        }
        return -1;
    }
}
