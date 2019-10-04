/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis_ErnolMochammad_1841720162;

/**
 *
 * @author ernol
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("True = mesin On");
        System.out.println("False = mesin Off");
        System.out.println("==============="); //mencoba menambah dan mengurangi kecepatan
        System.out.println("Mobil Ferrari");
        System.out.println("---------------");
        Mobil ml1 = new Mobil("Ferrari");
        Mesin ms1 = new Mesin();
        ml1.setMesin(ms1);
        ms1.setMobil(ml1);
        ml1.setMobilOn();
        ml1.tambahKecepatan();
        ml1.tambahKecepatan();
        ml1.kurangKecepatan();
        System.out.println("=== Hasil ===");
        ml1.printInfo();
        
        System.out.println("===============");
        System.out.println("Mobil Renault");
        System.out.println("---------------");
        Mobil ml2 = new Mobil("Renault"); // mencoba menambah kecepatan sampai max
        Mesin ms2 = new Mesin();
        ml2.setMesin(ms2);
        ms2.setMobil(ml2);
        ml2.setMobilOn();
        ml2.tambahKecepatan();
        ml2.tambahKecepatan();
        ml2.printKecepatan();
        ml2.tambahKecepatan();
        ml2.tambahKecepatan();
        ml2.printKecepatan();
        ml2.tambahKecepatan();
        System.out.println("=== Hasil ===");
        ml2.printInfo();
        
        System.out.println("==============="); //mencoba menambah dan mengurangi kecepatan
        System.out.println("Mobil Mercedes");
        Mobil ml3 = new Mobil("Mercedes");
        System.out.println("---------------");
        Mesin ms3 = new Mesin();
        ml3.setMesin(ms3);
        ms3.setMobil(ml3);
        ml3.setMobilOn();
        ml3.tambahKecepatan();
        ml3.tambahKecepatan();
        ml3.kurangKecepatan();
        System.out.println("=== Hasil ===");
        ml3.printInfo();
        
        System.out.println("==============="); //mencoba menambah dan mengurangi kecepatan
        System.out.println("Mobil Lamborgini");
        System.out.println("---------------");
        Mobil ml4 = new Mobil("Lamborgini");
        Mesin ms4 = new Mesin();
        ml4.setMesin(ms4);
        ms4.setMobil(ml4);
        ml4.setMobilOn();
        ml4.tambahKecepatan();
        ml4.tambahKecepatan();
        ml4.kurangKecepatan();
        System.out.println("=== Hasil ===");
        ml4.printInfo();
        
        
        
    }
}
