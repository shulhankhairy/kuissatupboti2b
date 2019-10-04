package Quiz1PBOTI2B;

/**
 *
 * @author ps42
 */
import java.util.Scanner;

public class Mobil {
    public static void main(String[] args){
        Mesin mesin1 = new Mesin();
        Mesin mesin2 = new Mesin();
        Mesin mesin3 = new Mesin();
        Mesin mesin4 = new Mesin();
        
        Scanner sc = new Scanner(System.in);
        
        mesin1.setMerk("Ferari");
        mesin1.setKecepatan(0);
        mesin1.tambahFerari();
        mesin1.setMaxKecepatan(430);
        mesin1.printStatus();
        mesin1.cetakStatus();
        System.out.println("----------------------------");
        
        mesin2.setMerk("Renault");
        mesin2.setKecepatan(0);
        mesin2.tambahRenault();
        mesin2.setMaxKecepatan(385);
        mesin2.printStatus();
        mesin2.cetakStatus();
        System.out.println("----------------------------");
        
        mesin3.setMerk("Mercedez");
        mesin3.setKecepatan(0);
        mesin3.tambahMercedez();
        mesin3.setMaxKecepatan(430);
        mesin3.printStatus();
        mesin3.cetakStatus();
        System.out.println("----------------------------");
        
        mesin4.setMerk("Audi");
        mesin4.setKecepatan(0);
        mesin4.tambahAudi();
        mesin4.setMaxKecepatan(400);
        mesin4.printStatus();
        mesin4.cetakStatus();
        System.out.println("----------------------------");
    }
}