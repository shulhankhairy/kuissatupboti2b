/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis_ErnolMochammad_1841720162;

/**
 *
 * @author ernol
 */
public class Mobil {
    private String typeMobil;
    private boolean kondisiMobil = false;
    private Mesin mesin;
    private boolean kondisiMesin = false;

    public Mobil(String typeMobil) {
        this.typeMobil = typeMobil;
    }

    Mobil() {
    }

    

    public String getTypeMobil() {
        return typeMobil;
    }

    public void setTypeMobil(String typeMobil) {
        this.typeMobil = typeMobil;
    }

    public boolean isKondisiMobil() {
        return kondisiMobil;
    }
    public boolean kondisiMesin(){
        return kondisiMesin;
    }
    
    public void setMobilOn() {
        this.kondisiMesin = true;
        if(this.kondisiMesin=true){
            mesin.MesinOn();
        }
    }
    
    public void setMobilOff(){
        mesin.MesinOff();
        this.kondisiMesin = false;
    }

    public void tambahKecepatan(){
        mesin.tambahKecepatan(this.typeMobil);
    }
    
    public void kurangKecepatan(){
        mesin.kurangKecepatan(this.typeMobil);
    }
    
    public void setKondisiMobil(boolean kondisiMobil) {
        this.kondisiMobil = kondisiMobil;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }    
     public void printInfo(){
        System.out.println("kondisi Mobil : " + this.kondisiMesin);
        mesin.infoMesin();
    }
    
    public void printKecepatan(){
        mesin.printKecepatan();
    }
}
