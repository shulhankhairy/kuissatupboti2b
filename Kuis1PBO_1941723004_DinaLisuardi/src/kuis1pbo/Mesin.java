/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1pbo;;

/**
 *
 * @author lenovo
 */
public class Mesin {
    private String jenis;
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public Mesin(String mesin) {
        this.jenis = mesin;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
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
   public void matikanMesin(){
       kontakOn = false;
       kecepatan = 0;
   }
   public void nyalakanMesin(){
       kontakOn = true;
   }
   public void tambahKecepatan(){
       if(jenis.equalsIgnoreCase("Ferarri")){
           if(kontakOn == true){
               kecepatan += 30;
           }else if(kecepatan > 430)
               System.out.println("Kecepatan tidak bisa ditambahkan");
       }else if(jenis.equalsIgnoreCase("Renault")){
            if(kontakOn == true){
                kecepatan += 55;
            }else if(kecepatan > 385){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Marcedes")){
            if(kontakOn == true){
                kecepatan += 65;
            }else if(kecepatan > 430){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }else{
            
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
   }
}
   public void kurangiKecepatan(){
       if(jenis.equalsIgnoreCase("Ferarri")){
           if(kontakOn == true){
               kecepatan -= 10;             
           }else if(kecepatan < 0){
               System.out.println("Kecepatan harus ditambah");
           }
       }else if(jenis.equalsIgnoreCase("Renault")){
           if(kontakOn == true){
               kecepatan -= 20;
           }else if(kecepatan < 0){
               System.out.println("Kecepatan harus ditambah");
           }
       }else if(jenis.equalsIgnoreCase("Marcedes")){
           if(kontakOn == true){
               kecepatan -= 35;
           }else if(kecepatan < 0){
               System.out.println("Kecepatan harus ditambah");
           }
       }else{
           System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
       }
   }
    public void status(){
        if(kontakOn ==  true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off ");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
}
}