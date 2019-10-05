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
public class Mesin {
    private String merk;
    private int kecepatan;
    private int max;
    private boolean kontakOn = false;
    
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void setMax(){
            if(merk == "Ferrari"){
                kecepatan = 430;
            }else if(merk == "Mercedes"){
                kecepatan = 430;
            }else if(merk == "Renault"){
                kecepatan = 385;
            }else{            
            }
    }
    
    public void tambahKecepatan(){
        if(kontakOn == true){
            if(merk == "Ferrari"){
                kecepatan += 30;
            }else if(merk == "Mercedes"){
                kecepatan += 65;
            }else if(merk == "Renault"){
                kecepatan += 55;
            }
            setMax();
        }else{
            System.out.println("Mesin anda belum menyala");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn == true){
            if(merk == "Ferrari"){
                kecepatan -= 10;
            }else if(merk == "Mercedes"){
                kecepatan -= 35;
            }else if(merk == "Renault"){
                kecepatan -= 20;
            }
        }else{
            System.out.println("Mesin anda belum menyala");
        }
    }
    
    public void Status(){
        System.out.println("============= "+merk+" =============");
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+merk+" saat ini : "+kecepatan);
        System.out.println("===================================");
        System.out.println("");
    }
}
