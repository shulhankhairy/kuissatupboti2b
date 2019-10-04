/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author FARRADILA AYU D
 */
public class Mobil {
    private String merk;
    private Mesin mesin;

    public Mobil(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void tambahKecepatan(){
        mesin.tambahKecepatan();
    }
    public void kurangiKecepatan(){
        mesin.kurangiKecepatan();
    }
    public void printStatus(){
        System.out.println(merk);
        mesin.printStatus();
    }
}
