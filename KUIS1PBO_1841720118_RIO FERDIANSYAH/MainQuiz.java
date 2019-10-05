/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author ASUS
 */
public class MainQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil ferrari = new Mobil("Ferrai","Ferrari");
        System.out.println(ferrari.getMobilMerk());
        ferrari.tambahKecepatan();
        ferrari.tambahKecepatan();
        ferrari.kurangiKecepatan();
        
        System.out.println();
        Mobil renault = new Mobil("Renault","Renault");
        System.out.println(renault.getMobilMerk());
        renault.tambahKecepatan();
        renault.tambahKecepatan();
        renault.kurangiKecepatan();
        
        System.out.println();
        Mobil Mercedes = new Mobil("Mercedes","Mercedes");
        System.out.println(Mercedes.getMobilMerk());
        Mercedes.tambahKecepatan();
        Mercedes.tambahKecepatan();
        Mercedes.kurangiKecepatan();
/*        Mobil mobil1 = new Mobil("Ferrari","Ferrari");
        Mobil mobil2 = new Mobil("Renault","Renault");
        Mobil mobil3 = new Mobil("Mercedes","Mercedes");
        
        Mesin mesin = new Mesin();
        mesin.printStatus();
        mesin.tambahKecepatan();
        
        mesin.nyalakanMesin();
        mesin.printStatus();
        
        mesin.tambahKecepatan();
        mesin.printStatus();
        
        mesin.matikanMesin();
        mesin.printStatus();*/
    }
}
