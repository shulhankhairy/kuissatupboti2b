/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuissatupbo;

/**
 *
 * @author MANGGAR LAPTOP
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");
        Mesin m1 = new Mesin();
        Mobil Ferrari = new Mobil(m1);
        Ferrari.setMerk("Ferrari");
        Ferrari.nyalakanMesin();
        Ferrari.tambahKecepatan();
        Ferrari.print();

        System.out.println("=======================");
        Mesin m2 = new Mesin();
        Mobil Renault = new Mobil(m2);
        Renault.setMerk("Renault");
        Renault.nyalakanMesin();
        Renault.tambahKecepatan();
        Renault.print();
        
        System.out.println("=======================");
        Mesin m3 = new Mesin();
        Mobil Mercedes = new Mobil(m3);
        Mercedes.setMerk("Mercedes");
        Mercedes.tambahKecepatan();
        Mercedes.nyalakanMesin();
        Mercedes.matikanMesin();
        Mercedes.print();
        System.out.println("=======================");
        
        
    }
}