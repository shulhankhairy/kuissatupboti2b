/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KuisSatuPboTI2b;

/**
 *
 * @author FIDELA
 */
public class MainMobil {
    public static void main(String[] args) {
        Mobil f = new Mobil();
        Mobil m = new Mobil();
        Mobil r = new Mobil();
        Mobil l = new Mobil();
        Mesin mn = new Mesin();
        
        System.out.println("------Ferarri--------------");
        f.setMerk("Ferrari");
        mn.nyalakanMesin();
        mn.tambahKecepatan(f.getMerk(), 30);
        f.printCetak();
        mn.printInfo();
        mn.kurangiKecepatan(10);
        mn.printInfo();
        
        System.out.println("-------Mercedes------------");
        m.setMerk("Mercedes");
        mn.nyalakanMesin();
        mn.tambahKecepatan(m.getMerk(), 65);
        m.printCetak();
        mn.printInfo();
        mn.kurangiKecepatan(35);
        mn.printInfo();
        
        System.out.println("--------Renault-------------");
        r.setMerk("Renault");
        mn.nyalakanMesin();
        mn.tambahKecepatan(f.getMerk(), 55);
        r.printCetak();
        mn.printInfo();
        mn.kurangiKecepatan(20);
        mn.printInfo();
        
        System.out.println("--------Lamborghini-----------");
        l.setMerk("Lamborghini");
        mn.nyalakanMesin();
        mn.tambahKecepatan(f.getMerk(), 45);
        l.printCetak();
        mn.printInfo();
        mn.kurangiKecepatan(15);
        mn.printInfo();
    }
}
