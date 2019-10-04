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
public class Mobil extends Mesin{
    public String jenisMobil, cekMobil;
    
    public Mobil(){
        
    }

    public Mobil(String jenisMobil, String cekMobil) {
        this.cekMobil = cekMobil;
        this.jenisMobil = jenisMobil;
    }

    public Mobil(String cekMobil,String jenisMobil, int kecepatanMax, int kecepatanMin, int tambah, int kurang, String merkMesin, String cekMesin) {
        super(kecepatanMax, kecepatanMin, tambah, kurang, merkMesin, cekMesin);
        this.jenisMobil = jenisMobil;
        this.cekMobil = cekMobil;
    }

    public void dataMobil(int kecepatan){
           
        switch (merkMesin) {
            case "Renault":
                kecepatanMax = 385;
                kecepatanMin = 0;
                tambah = 55;
                kurang = 20;
                tambah = tambah + kecepatan ;
                kurang = kurang - kecepatan;
                if(tambah>=kecepatanMax){
                    System.out.println("Batas Kecepatan Max 385 Km/Jam !!!");
                }
                break;
            case "Ferarri":
                kecepatanMax = 430;
                kecepatanMin = 0;
                tambah = 30;
                kurang = 10;
                tambah = tambah + kecepatan ;
                kurang = kurang - kecepatan;
                if(tambah>=kecepatanMax){
                    System.out.println("Batas Kecepatan Max 430 Km/Jam !!!");
                }
                break;
            case "Mercedes":
                kecepatanMax = 430;
                kecepatanMin = 0;
                tambah = 65;
                kurang = 35;
                tambah = tambah + kecepatan ;
                kurang = kurang - kecepatan;
                if(tambah>=kecepatanMax){
                    System.out.println("Batas Kecepatan Max 430 Km/Jam !!!");
                }
                break;
             case "Kopaja":
                kecepatanMax = 800;
                kecepatanMin = 0;
                tambah = 70;
                kurang = 20;
                tambah = tambah + kecepatan ;
                kurang = kurang - kecepatan;
                if(tambah>=kecepatanMax){
                    System.out.println("Batas Kecepatan Max 800 Km/Jam !!!");
                }
                break;
            default:
                break;
        }
        
    }
    
            

    public void tampilMobil() {
               System.out.println("Kecepatan Max Mobil   : " + kecepatanMax);
               System.out.println("Kecepatan Min Mobil   : " + kecepatanMin); 
               System.out.println("Tambah Kecepatan      : " + tambah);
               System.out.println("Kurang Kecepatan      : " + kurang);
    }
    
    
    
}
