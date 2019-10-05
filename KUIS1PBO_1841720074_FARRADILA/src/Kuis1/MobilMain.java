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
public class MobilMain {
     public static void main(String[] args){
        Mesin ms1 = new Mesin("Ferrari");
        System.out.println("------FERRARI-------------");
        ms1.printStatus();
        ms1.nyalakanMesin();
        ms1.printStatus();
        ms1.tambahKecepatan();
        ms1.printStatus();
        
        Mesin ms2 = new Mesin("Renault");
        System.out.println("------RENAULT-------------");
        ms2.printStatus();
        ms2.nyalakanMesin();
        ms2.printStatus();
        ms2.tambahKecepatan();
        ms2.printStatus();
        
        Mesin ms3 = new Mesin("Marcedes");
        System.out.println("------MARCEDES-------------");
        ms3.printStatus();
        ms3.nyalakanMesin();
        ms3.printStatus();
        ms3.tambahKecepatan();
        ms3.printStatus();
    }
}
