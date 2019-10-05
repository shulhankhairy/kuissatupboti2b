/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunayn.kuis1;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Mesin ferrari = new Mesin();
        Mesin renault = new Mesin();
        Mesin mercedes = new Mesin();
        Mesin cityCar = new Mesin();
        Mobil mobil = new Mobil();
        
        ferrari.nyalakanMobil();
        ferrari.nyalakanMesin();
        ferrari.tambahKecepatan("ferrari");
        ferrari.tambahKecepatan("ferrari");
        ferrari.kurangiKecepatan("ferrari");
        ferrari.printStatus("ferrari");
        
        renault.nyalakanMobil();
        renault.nyalakanMesin();
        renault.tambahKecepatan("renault");
        renault.kurangiKecepatan("renault");
        renault.tambahKecepatan("renault");
        renault.kurangiKecepatan("renault");
        renault.printStatus("renault");
        
        mercedes.nyalakanMobil();
        mercedes.nyalakanMesin();
        mercedes.tambahKecepatan("mercedes");
        mercedes.kurangiKecepatan("mercedes");
        mercedes.tambahKecepatan("mercedes");
        mercedes.kurangiKecepatan("mercedes");
        mercedes.printStatus("mercedes");
        
        cityCar.nyalakanMobil();
        cityCar.nyalakanMesin();
        cityCar.tambahKecepatanSeparate("Jazz", 14);
        cityCar.tambahKecepatanSeparate("Jazz", 28);
        cityCar.kurangiKecepatanSeparate("Jazz", 5);
        cityCar.printStatus("Jazz");
    }
}
