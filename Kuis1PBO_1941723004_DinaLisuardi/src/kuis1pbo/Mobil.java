/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1pbo;

/**
 *
 * @author lenovo
 */
public class Mobil {
    private String Merk;
    private Mesin mesin;
    
    public Mobil(String Merk, Mesin mesin){
        this.Merk = Merk;
        this.mesin = mesin;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
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
    public void status(){
        System.out.println(Merk);
        mesin.status();
    }
}
