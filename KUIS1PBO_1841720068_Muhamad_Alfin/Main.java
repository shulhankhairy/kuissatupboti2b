package Quis1;

/**
 *
 * @author XLenox
 */
public class Main {
    
    public static void main(String[] args) {
        
        Mobil mbl = new Mobil();
        Mesin msn = new Mesin();
        
        mbl.setNama("Ferrari");
        msn.nyalakanMesin();
        msn.tambahKecepatan(mbl.getNama(),30);
        mbl.tampil();
        msn.printStatus();
        msn.kurangiKecepatan(10);
        msn.printStatus();
        
        System.out.println("==================================");
        mbl.setNama("Renault");
        msn.nyalakanMesin();
        msn.tambahKecepatan(mbl.getNama(), 55);
        mbl.tampil();
        msn.printStatus();
        msn.kurangiKecepatan(20);
        msn.printStatus();
        
        System.out.println("==================================");
        mbl.setNama("Mercedes");
        msn.nyalakanMesin();
        msn.tambahKecepatan(mbl.getNama(), 65);
        mbl.tampil();
        msn.printStatus();
        msn.kurangiKecepatan(35);
        msn.printStatus();
        
        System.out.println("==================================");
        mbl.setNama("Mercedes");
        msn.matikanMesin();
        msn.tambahKecepatan(mbl.getNama(), 10);
        mbl.getNama();
        msn.printStatus();
        
        System.out.println("==================================");
        mbl.setNama("Civic");
        msn.nyalakanMesin();
        msn.tambahKecepatan(mbl.getNama(), 80);
        mbl.tampil();
        msn.printStatus();
        msn.kurangiKecepatan(20);
        msn.printStatus();
    }
}
