/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mobil {
    private Mesin mesin;
    private String merkMobil;
    

    public Mobil(String merkMobil, String jenisMesin) {
        this.merkMobil = merkMobil;
        this.mesin = new Mesin();
        mesin.setJenisMesin(jenisMesin);
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }
    
    public String getjenisMesin(){
        return mesin.getJenisMesin();
    }
    
    public void tambahKecepatanMobil(){
        mesin.tambahKecepatan();
        System.out.println(mesin.getKecepatan()+ "  Km/Jam");
    }
    
    public void kurangiKecepatan(){
        mesin.kurangKecepatan();
        System.out.println(mesin.getKecepatan()+ "  Km/Jam");
    }
    
    public void status(){
        mesin.printStatus();
    }
    
    public void nyalakan(){
        mesin.nyalakanMesin();
    }
    
    public void matikan(){
        mesin.matikanMesin();
    }
    
}
