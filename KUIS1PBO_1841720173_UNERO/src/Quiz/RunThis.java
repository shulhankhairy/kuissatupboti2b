package Quiz;

public class RunThis {
    public static void main(String[] args) {
        // Mercedes
        Mesin mesinMercedes = new Mesin();
        Mobil mercedes = new Mobil("Mercedes", mesinMercedes);

        // Renault
        Mesin mesinRenault = new Mesin();
        Mobil renault = new Mobil("Renault", mesinRenault);

        // Ferrari
        Mesin mesinFerrari = new Mesin();
        Mobil ferrari = new Mobil("Ferrari", mesinFerrari);

        // 
        mercedes.setKontak("Nyala");
        mercedes.tambahKecepatan();
        mercedes.tambahKecepatan();
        mercedes.tambahKecepatan();
        mercedes.tambahKecepatan();
        mercedes.tambahKecepatan();
        mercedes.tambahKecepatan();
        mercedes.tambahKecepatan();
        mercedes.stat();
        mercedes.kurangiKecepatan();
        mercedes.stat();
    }
}
