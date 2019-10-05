/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mesin {
    private String jenisMesin;
    private int kecepatan;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn=true;
    }
    
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    
    public Mesin(){
        
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }
    
    public void tambahKecepatan(){
        if (kontakOn == true) {
            if(jenisMesin.equalsIgnoreCase("jenisferrari")){
                if(kecepatan>430){
                    System.out.println("Kecepatan maksimum Ferrari 430 Km/jam ");
                }else{
                     kecepatan = kecepatan + 30;  
                }
            }
            
            else if(jenisMesin.equalsIgnoreCase("jenisrenault")){
                if(kecepatan>385){
                    System.out.println("Kecepatan maksimum Renault 385 Km/jam ");
                }else{
                     kecepatan = kecepatan + 55;  
                }
            }
            
            else if(jenisMesin.equalsIgnoreCase("jenismercedes")){
                if(kecepatan>430){
                    System.out.println("Kecepatan maksimum Mercedes 430 Km/jam ");
                }else{
                     kecepatan = kecepatan + 65;  
                }
            }
            
            else if(jenisMesin.equalsIgnoreCase("jenisspesial")){
                if(kecepatan>1000){
                    System.out.println("Kecepatan maksimum Mercedes 430 Km/jam ");
                }else{
                     kecepatan = kecepatan + 200;  
                }
            }
            
            else{
                System.out.println("tidak terdapat jenis mobil");
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }    
    
    public void kurangKecepatan(){
        if(kontakOn==true){
            if(jenisMesin.equalsIgnoreCase("jenisferrari")){
                kecepatan = kecepatan - 10;
            }else if(jenisMesin.equalsIgnoreCase("jenisrenault")){
                kecepatan = kecepatan - 20;
            }else if(jenisMesin.equalsIgnoreCase("jenismercedes")){
                kecepatan = kecepatan - 35;
            }else if(jenisMesin.equalsIgnoreCase("jenisspesial")){
                kecepatan = kecepatan - 80;
            }
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }    
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
    
}
