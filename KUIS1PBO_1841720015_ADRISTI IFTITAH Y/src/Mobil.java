/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adristi
 */
public class Mobil {
    public String jenis;
    public int kecepatan = 0;
    public boolean mesin0n=false;

    public Mobil(String jenis) {
        this.jenis = jenis;
    }
    
    
    public void nyalakanMesin(){
        mesin0n = true;
    }
    
    public void matikanMesin(){
        mesin0n = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(jenis.equalsIgnoreCase("Ferari")){
            if(mesin0n == true){
                kecepatan += 30;
            }else if(kecepatan > 430){
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off"+"\n");
            }
        }else if(jenis.equalsIgnoreCase("Renault")){
            if(mesin0n == true){
                kecepatan += 55;
            }else if(kecepatan > 385){
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off"+"\n");
            }
        }else if(jenis.equalsIgnoreCase("Mercedes")){
            if(mesin0n == true){
                kecepatan += 65;
            }else if(kecepatan > 430){
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off"+"\n");
            }
        }
        
    }
    
    public void kurangiKecepatan(){
        if(jenis.equalsIgnoreCase("Ferari")){
            if(mesin0n == true){
                kecepatan -= 10;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off"+"\n");
            }
        }else if(jenis.equalsIgnoreCase("Renault")){
            if(mesin0n == true){
                kecepatan -= 20;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off"+"\n");
            }
        }else if(jenis.equalsIgnoreCase("Mercedes")){
            if(mesin0n == true){
                kecepatan -= 35;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off"+"\n");
            }
        }
        
    }
    
    public void tampilData(){
        if(mesin0n == true){
            System.out.println("Mesin Menyala");
        }else{
            System.out.println("Mesin Mati");
        }
        System.out.println("Kecepatan" + kecepatan +"\n");
    }
    
}
