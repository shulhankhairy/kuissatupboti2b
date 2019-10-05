/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KuisSatuPboTI2b;

/**
 *
 * @author FIDELA
 */
public class Mobil {
    private String merk;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void printCetak()
    {
        System.out.println("Merk Mobil "+getMerk());
    }
}
