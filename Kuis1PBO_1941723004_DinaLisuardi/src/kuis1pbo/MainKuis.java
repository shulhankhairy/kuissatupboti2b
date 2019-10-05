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
public class MainKuis {
    public static void main(String[] args) {
        Mesin ms = new Mesin("Ferarri");
        ms.nyalakanMesin();
        Mobil mb = new Mobil("Ferarri",ms);
        mb.tambahKecepatan();
        mb.kurangiKecepatan();
        mb.status();
        
        System.out.println("============================================");
        mb.tambahKecepatan();
        mb.tambahKecepatan();
        mb.tambahKecepatan();
        mb.tambahKecepatan();
        mb.tambahKecepatan();
        mb.tambahKecepatan();
        mb.tambahKecepatan();
        mb.status();
        
        System.out.println("===========================================");
        Mesin ms2 = new Mesin("Renault");
        ms2.nyalakanMesin();
        Mobil mb2 = new Mobil("Renault",ms2);
        mb2.tambahKecepatan();
        mb2.kurangiKecepatan();
        mb2.status();
         
        System.out.println("===========================================");
        Mesin ms3 = new Mesin("Marcedes");
        ms3.nyalakanMesin();
        Mobil mb3 = new Mobil("Marcedes",ms3);
        mb3.tambahKecepatan();
        mb3.kurangiKecepatan();
        mb3.status();
        
    }
}
