package quis1;
public class QuisMain {
    public static void main(String[] args) {
        Mesin mesin = new Mesin();
        Mobil mobil1 = new Mobil("Ferrari", "Ferrari");
        Mobil mobil2 = new Mobil("Renault", "Renault");
        Mobil mobil3 = new Mobil("Mercedes", "Mercedes");
        Mobil mobil4 = new Mobil("Avanza", "Avanza");
        mobil1.nyalakanMesinMobil();
        mobil1.tambahKecepatanMobil();
        mobil1.tambahKecepatanMobil();
        mobil1.tambahKecepatanMobil();
        mobil1.kurangiKecepatanMobil();
        mobil1.Status();
        System.out.println();
//        mobil2.nyalakanMesinMobil();
        mobil2.tambahKecepatanMobil();
        mobil2.nyalakanMesinMobil();
        mobil2.tambahKecepatanMobil();
        mobil2.kurangiKecepatanMobil();
        mobil2.Status();
        System.out.println();
        mobil3.nyalakanMesinMobil();
        mobil3.tambahKecepatanMobil();
        mobil3.kurangiKecepatanMobil();
        mobil3.kurangiKecepatanMobil();
        mobil3.matikanMesinMobil();
        mobil3.Status();
        System.out.println();
        mobil4.nyalakanMesinMobil();
        mobil4.tambahKecepatanMobil();
        mobil4.Status();
    }
}
