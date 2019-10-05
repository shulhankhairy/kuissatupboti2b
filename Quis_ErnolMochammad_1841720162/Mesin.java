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
public class Mesin {
    private String jenisMesin;
    private int kecepatan = 0;
    private int kecRenault=0;
    private boolean kondisiMesin = false; 
    private Mobil mobil;

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mesin(){
        
    }
    public Mesin(int Kecepatan) {
        this.kecepatan = Kecepatan;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int Kecepatan) {
        this.kecepatan = Kecepatan;
    }

    public int getKecRenault() {
        return kecRenault;
    }

    public void setKecRenault(int kecRenault) {
        this.kecRenault = kecRenault;
    }
    
    
    public void MesinOn(){
        this.kondisiMesin=true;
    }
    public void MesinOff(){
        this.kecepatan=0;
        this.kondisiMesin=false;
    }

    public boolean isKodisiMesin() {
        return kondisiMesin;
    }

    public void setKodisiMesin(boolean kodisiMesin) {
        this.kondisiMesin = kodisiMesin;
    }
    
    public boolean cekKecepatan(int kecepatan, boolean tambah){
        if (tambah) {
            return (kecepatan + this.kecepatan) <= 100;
        } else if(!tambah){
            return (this.kecepatan - kecepatan ) > 0;
        }
        return false;
    }
    
    //mengecek kecepatan Renault
    public boolean cekKecRenault(int kec, boolean tambah){
        if(tambah){
            return (kec + this.kecepatan) <= 200;
        }else if(!tambah){
            return (this.kecepatan + kec) > 0;
        }
        return false;
    }
    //mengecek kecepatan 
    public void tambahKecepatan(String typeMobil){
        if (this.kondisiMesin) {
            if (typeMobil.equals("Ferrari") && cekKecepatan(30, true)) {
                this.kecepatan += 30;
            } else if (typeMobil.equals("Renault") && cekKecRenault(55, true)) {
                this.kecepatan += 55;
            } else if (typeMobil.equals("Mercedes") && cekKecepatan(65, true)) {
                this.kecepatan += 65;
            } else if (typeMobil.equals("Lamborgini") && cekKecepatan(65, true)) {
                this.kecepatan += 100;
            } else {
                System.out.println("kecepatan max");
            }
        } else{
            System.out.println("Mesin masih mati");
        }
    }
    
    public void kurangKecepatan(String typeMobil){
        if (this.kondisiMesin) {
            if (typeMobil.equals("Ferrari") && cekKecepatan(5, false)) {
                this.kecepatan -= 10;
            } else if (typeMobil.equals("Renault") && cekKecRenault(10, false)) {
                this.kecepatan -= 20;
            } else if (typeMobil.equals("Mercedes") && cekKecepatan(30, false)) {
                this.kecepatan -= 35;    
            } else if (typeMobil.equals("Lamborgini") && cekKecepatan(65, true)) {
                this.kecepatan -= 15;
            } else {
                System.out.println("kecepatan kurang");
            }
        } else {
            System.out.println("Mesin masih mati");
        }
    }
    
    public void infoMesin() {
        System.out.println("Kondisi Mesin : " + this.kondisiMesin);
        System.out.println("Kecepatan Mesin : " + getKecepatan());
    }
    
    public void printKecepatan() {
        System.out.println("Kecepatan Mobil : " + getKecepatan());
    }
}
