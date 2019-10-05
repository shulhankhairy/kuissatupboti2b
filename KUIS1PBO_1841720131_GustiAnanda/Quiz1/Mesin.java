/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Gin
 */
public class Mesin {
    public int kecepatanMax,kecepatanMin,tambah,kurang;
    public String merkMesin,cekMesin;

   
    
    public Mesin(){
    }

    public Mesin(int kecepatanMax, int kecepatanMin, int tambah, int kurang, String merkMesin, String cekMesin) {
        this.kecepatanMax = kecepatanMax;
        this.kecepatanMin = kecepatanMin;
        this.tambah = tambah;
        this.kurang = kurang;
        this.merkMesin = merkMesin;
        this.cekMesin = cekMesin;
    }
    
     public String getCekMesin() {
        return cekMesin;
    }

    public void setCekMesin(String cekMesin) {
        this.cekMesin = cekMesin;
    }
    
    public int getKecepatanMax() {
        return kecepatanMax;
    }

    public void setKecepatanMax(int kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }

    public int getKecepatanMin() {
        return kecepatanMin;
    }

    public void setKecepatanMin(int kecepatanMin) {
        this.kecepatanMin = kecepatanMin;
    }

    public int getTambah() {
        return tambah;
    }

    public void setTambah(int tambah) {
        this.tambah = tambah;
    }

    public int getKurang() {
        return kurang;
    }

    public void setKurang(int kurang) {
        this.kurang = kurang;
    }

    public String getMerkMesin() {
        return merkMesin;
    }

    public void setMerkMesin(String merkMesin) {
        this.merkMesin = merkMesin;
    }
    
    public void tampilMesin(){
        System.out.println("Jenis Mesin         : " + merkMesin);
        System.out.println("Kecepatan Max       : " + kecepatanMax);
        System.out.println("Kecepatan Min       : " + kecepatanMin);
        System.out.println("Tambah Kecepatan    : " + tambah);
        System.out.println("Kurang Kecepatan    : " + kurang);        
    }
}