/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TestKuis {
    public static void main(String[] args) {
        Mobil ferrari = new Mobil("ferrari","jenisferrari");
        
        System.out.println(ferrari.getMerkMobil());
        System.out.println(ferrari.getjenisMesin());
        ferrari.status();
        
        ferrari.tambahKecepatanMobil();
        ferrari.kurangiKecepatan();
        ferrari.status();
        
        ferrari.nyalakan();
        ferrari.tambahKecepatanMobil();
        ferrari.tambahKecepatanMobil();
        ferrari.kurangiKecepatan();
        ferrari.kurangiKecepatan();
        ferrari.tambahKecepatanMobil();
        ferrari.tambahKecepatanMobil();
        ferrari.tambahKecepatanMobil();
        ferrari.tambahKecepatanMobil();
        ferrari.tambahKecepatanMobil();
        ferrari.tambahKecepatanMobil();
        ferrari.kurangiKecepatan();
        ferrari.status();
        ferrari.matikan();
        
        Mobil renault = new Mobil("renault","jenisrenault");
        
        System.out.println(renault.getMerkMobil());
        System.out.println(renault.getjenisMesin());
        renault.status();
        
        renault.tambahKecepatanMobil();
        renault.status();
        
        renault.nyalakan();
        renault.tambahKecepatanMobil();
        renault.tambahKecepatanMobil();
        renault.tambahKecepatanMobil();
        renault.kurangiKecepatan();
        renault.kurangiKecepatan();
        renault.status();
        renault.matikan();
        renault.status();
        
        Mobil mercedes = new Mobil("mercedes","jenismercedes");
        
        System.out.println(mercedes.getMerkMobil());
        System.out.println(mercedes.getjenisMesin());
        mercedes.status();
        
        mercedes.tambahKecepatanMobil();
        mercedes.status();
        
        mercedes.nyalakan();
        mercedes.tambahKecepatanMobil();
        mercedes.tambahKecepatanMobil();
        mercedes.tambahKecepatanMobil();
        mercedes.kurangiKecepatan();
        mercedes.kurangiKecepatan();
        mercedes.status();
        mercedes.matikan();
        mercedes.status();
        
        Mobil spesial = new Mobil("spesial","jenisspesial");
        
        System.out.println(spesial.getMerkMobil());
        System.out.println(spesial.getjenisMesin());
        spesial.status();
        
        spesial.tambahKecepatanMobil();
        spesial.status();
        
        spesial.nyalakan();
        spesial.tambahKecepatanMobil();
        spesial.tambahKecepatanMobil();
        spesial.tambahKecepatanMobil();
        spesial.kurangiKecepatan();
        spesial.kurangiKecepatan();
        spesial.status();
        spesial.matikan();
        spesial.status();
    }
}
