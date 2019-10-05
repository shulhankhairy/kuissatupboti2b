/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuissatupbo;

/**
 *
 * @author MANGGAR LAPTOP
 */
public class Mobil{
    private Mesin mesin;

    public Mobil(Mesin mesin) {
        this.mesin = mesin;
    }

    
    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }


    public void setMerk(String merk) {
        mesin.setMerk(merk);
    }

    public String getMerk() {
        return mesin.getMerk();
    }

    public void setKecepatan(int kecepatan) {
        mesin.setKecepatan(kecepatan);
    }

    public int getKecepatan() {
        return mesin.getKecepatan();
    }

    public void nyalakanMesin() {
        mesin.nyalakanMesin();
    }

    public void matikanMesin() {
        mesin.matikanMesin();
    }

    public void tambahKecepatan() {
        mesin.tambahKecepatan();
    }

    public void kurangiKecepatan() {
        mesin.kurangiKecepatan();
    }

    public void print() {
        mesin.print();
    }
    
}
