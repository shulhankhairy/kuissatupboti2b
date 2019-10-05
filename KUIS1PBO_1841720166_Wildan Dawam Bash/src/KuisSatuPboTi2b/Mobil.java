/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KuisSatuPboTi2b;

/**
 *
 * @author Hiyaaa
 */
public class Mobil {
    private Mesin mesin;

    public Mobil(Mesin mesin) {       
        this.mesin = mesin;
    }
    
    public String getMerk() {
        return this.mesin.getMerk();
    }

    public void setMerk(String merk) {
        this.mesin.setMerk(merk);
    }
    
    public void tambahKecepatan(){
        this.mesin.tambahKecepatan();
    }
    
    public void nyalakanMesin() {
        this.mesin.nyalakanMesin();
    }

    public void matikanMesin() {
        this.mesin.matikanMesin();
    }

    public void kurangiKecepatan() {
        this.mesin.kurangiKecepatan();
    }

    public void Status() {
        this.mesin.Status();
    }        
    
}
