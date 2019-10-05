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
public class Mesin{
     private String merk;
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public Mesin(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean isKontakOn() {
        return kontakOn;
    }

    public void setKontakOn(boolean kontakOn) {
        this.kontakOn = kontakOn;
    }
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(merk=="Ferrari"){
            if(kontakOn==true){
                kecepatan +=30;
                if(kecepatan > 430){
                        System.out.println("Kecepatan anda max");
                    }
                }else{
                    System.out.println("Tidak dapat menambah kecepatan");
                }
            }else if(merk=="Renoult"){
            if(kontakOn==true){
                kecepatan +=55;
                if(kecepatan > 385){
                        System.out.println("Kecepatan anda max");
                    }
                }else{
                    System.out.println("Tidak dapat menambah kecepatan");
                }         
            }else if(merk=="Mercedes"){
            if(kontakOn==true){
                kecepatan +=65;
                if(kecepatan > 430){
                        System.out.println("Kecepatan anda max");
                    }
                }else{
                    System.out.println("Tidak dapat menambah kecepatan");
                }
        }else{
            System.out.println("Mesin anda Belum menyala");
        }   
    }
    
        
    
    public void kurangiKecepatan(){
        if(merk=="Ferrari"){
            if(kontakOn==true){
                kecepatan -=10;
                if(kecepatan<0){
                    System.out.println("Mobil anda Berhenti");
                }
            }else{
                System.out.println("Tambah kecepatan anda !!");                
            }    
        }else if(merk=="Renault"){
            if(kontakOn==true){
                kecepatan -=20;
                if(kecepatan<0){
                    System.out.println("Mobil anda Berhenti");
                }
            }else{
                System.out.println("Tambah kecepatan anda !!");                
            }     
        }else if(merk=="Mercedes"){
            if(kontakOn==true){
                kecepatan -=35;
                if(kecepatan<0){
                    System.out.println("Mobil anda Berhenti");
                }
            }else{
                System.out.println("Tambah kecepatan anda !!");
            }                
        } else{
            System.out.println("Mesin anda belum menyala");
        }   
    }
    
    public void printStatus(){
        if(kontakOn ==  true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off ");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    } 
}
