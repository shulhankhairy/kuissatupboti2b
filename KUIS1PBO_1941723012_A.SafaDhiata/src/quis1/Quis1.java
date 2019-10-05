package quis1;
public class Quis1 {
public static void main(String[] args) {
           Mobil m = new Mobil("Buggati");
        m.setMobilOn();
        m.tambahKecepatan();
        m.tambahKecepatan();
        m.printKecepatan();
        m.tambahKecepatan();
        m.tambahKecepatan();
        m.printKecepatan();
        m.tambahKecepatan();
        System.out.println("== Hasil :");
        m.printInfo();

        System.out.println("_______________");
        Mobil mbl2 = new Mobil("Ferrari");
        mbl2.setMobilOn();
        mbl2.tambahKecepatan();
        mbl2.tambahKecepatan();
        mbl2.kurangKecepatan();
        System.out.println("== Hasil :");
        mbl2.printInfo();

        System.out.println("________________");
        Mobil m3 = new Mobil("Renault");
        m3.setMobilOn();
        m3.printKecepatan();
        m3.tambahKecepatan();
        m3.kurangKecepatan();
        m3.kurangKecepatan();
        System.out.println("== Hasil :");
        m3.printInfo();
        
        System.out.println("_________________");
        Mobil m4 = new Mobil("Mercedez");
        m4.setMobilOn();
        m4.printKecepatan();
        m4.tambahKecepatan();
        m4.kurangKecepatan();
        m4.kurangKecepatan();
        System.out.println("== Hasil :");
        m4.printInfo();
    }
}
        
    
    

