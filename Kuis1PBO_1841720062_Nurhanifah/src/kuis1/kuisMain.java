/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author ASUS A405U
 */
public class kuisMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesin m1 = new Mesin("Ferary");
        m1.nyalakanMesin();
        Mobil Mb = new Mobil("Ferary",m1);
        Mb.setMesin(m1);
        m1.setMobil(Mb);
        Mb.tambahKecepatan();
        Mb.kurangiKecepatan();
        Mb.status();
        System.out.println("================================");
        Mb.tambahKecepatan();
        Mb.tambahKecepatan();
        Mb.tambahKecepatan();
        Mb.tambahKecepatan();
        Mb.tambahKecepatan();
        Mb.tambahKecepatan();
        Mb.tambahKecepatan();
        Mb.status();
        System.out.println("===============================");
        Mesin m2 = new Mesin("Renault");
        m2.nyalakanMesin();
        Mobil Mb1 = new Mobil("Renault",m2);
        Mb1.setMesin(m1);
        m1.setMobil(Mb1);
        Mb1.tambahKecepatan();
        Mb1.kurangiKecepatan();
        Mb1.status();
        System.out.println("===============================");
        Mesin m3 = new Mesin("Mercedes");
        m3.nyalakanMesin();
        Mobil Mb3 = new Mobil("Mercedes",m3);
        Mb3.setMesin(m1);
        m1.setMobil(Mb3);
        Mb3.tambahKecepatan();
        Mb3.tambahKecepatan();
        Mb3.tambahKecepatan();
        Mb3.kurangiKecepatan();
        Mb3.status();
        System.out.println("===============================");
        
    }
    
}
