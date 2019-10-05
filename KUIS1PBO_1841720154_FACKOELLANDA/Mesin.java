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
public class Mesin {
    private String merk;
    private int kecepatan;
    private boolean mesinOn=false;
    

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }
    

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    
    public void nyalakanMesin(){
        mesinOn = true;
    }
    public void matikanMesin(){
        mesinOn=false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(mesinOn = true){
            if(merk == "Ferrari"){
                kecepatan += 30;
            }else if(merk == "Mercedes"){
                kecepatan += 65;
            }else if(merk == "Renault"){
                kecepatan += 55;
            }
        }else{
            System.out.println("Mesin anda belum menyala");
        }
    }
    
    public void kurangiKecepatan(){
        if(mesinOn == true){
            if(merk == "Ferrari"){
                kecepatan += 30;
            }else if(merk == "Mercedes"){
                kecepatan += 65;
            }else if(merk == "Renault"){
                kecepatan += 55;
            }
        }else{
            System.out.println("Mesin anda belum menyala");
        }
    }
    public void print(){
        if(mesinOn == true){
            System.out.println("Mesin On");
        }else{
            System.out.println("Mesin Off");
        }
        System.out.println("Merk ="+merk);
        System.out.println("Kecepatan= "+kecepatan);
        
    }
    
    
}

