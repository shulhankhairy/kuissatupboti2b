/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author ASUS
 */
public class Mobil{
    private Mesin mesin;
    private String mobilMerk;
    
    Mobil(){
        
    }

    public Mobil(String mobilMerk, String merkMesin) {
        this.mesin = new Mesin();
        mesin.setMerk(merkMesin);
        this.mobilMerk = mobilMerk;
    }

    public String getMobilMerk() {
        return mobilMerk;
    }

    public void setMobilMerk(String mobilMerk) {
        this.mobilMerk = mobilMerk;
    }

    public Mesin getMesin() {
        return mesin;
    }
    public void tambahKecepatan(){
        mesin.tambahKecepatan();
        System.out.println(mesin.getKecepatan()+"Km/Jam");
    }
    public void kurangiKecepatan(){
        mesin.kurangiKecepatan();
        System.out.println(mesin.getKecepatan()+"Km/Jam");
    }
    
}