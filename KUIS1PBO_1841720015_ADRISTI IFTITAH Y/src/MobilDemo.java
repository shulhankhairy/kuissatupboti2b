/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MobilDemo {
    public static void main(String[] args) {

        Mesin ms = new Mesin("Ferari");
        ms.tampilData();
        Mobil m = new Mobil("Ferari");
        m.nyalakanMesin();
        m.tambahKecepatan();
        m.tampilData();
        m.tambahKecepatan();
        m.tampilData();
        m.tambahKecepatan();
        m.tampilData();
        m.tambahKecepatan();
        m.tampilData();
        m.tambahKecepatan();
        m.tampilData();
        m.kurangiKecepatan();
        m.tampilData();
        m.tambahKecepatan();
        m.tampilData();
        System.out.println("=======================");
        
        Mesin ms1 = new Mesin();
        ms1.setMesin("Renault");
        ms1.tampilData();
        Mobil m1 = new Mobil("Renault");
        m1.nyalakanMesin();
        m1.tambahKecepatan();
        m1.tampilData();
        m1.tambahKecepatan();
        m1.tampilData();
        m1.tambahKecepatan();
        m1.tampilData();
        m1.tambahKecepatan();
        m1.tampilData();
        m1.tambahKecepatan();
        m1.tampilData();
        m1.kurangiKecepatan();
        m1.tampilData();
        m1.kurangiKecepatan();
        m1.tampilData();
        System.out.println("=======================");
        
        Mesin ms2 = new Mesin();
        ms2.setMesin("Mercedes");
        ms2.tampilData();
        Mobil m2 = new Mobil("Mercedes");
        m2.nyalakanMesin();
        m2.tambahKecepatan();
        m2.tampilData();
        m2.tambahKecepatan();
        m2.tampilData();
        m2.tambahKecepatan();
        m2.tampilData();
        m2.tambahKecepatan();
        m2.tampilData();
        m2.tambahKecepatan();
        m2.tampilData();
        m2.kurangiKecepatan();
        m2.tampilData();
        m2.tambahKecepatan();
        m2.tampilData();
        System.out.println("=======================");
        
    }
}