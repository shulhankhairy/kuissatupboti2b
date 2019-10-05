package Quiz;

import java.util.Scanner;

public class RunThis {
    public static void list(){
        System.out.println("===== List Mobil =====\n" +
                "Ferrari\n" +
                "Renault\n" +
                "Mercedes\n" +
                "Lorena\n");
    }

    public static void Option(){
        System.out.println("========================\n" +
                "1. Tambah Kecepatan\n" +
                "2. Kurangi Kecepatan\n" +
                "3. Nyalakan Mobil\n" +
                "4. Matikan Mobil\n" +
                "5. Keluar\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outer = 0;
        int inner = 0;
        int opt = 0;
        list();
        System.out.print("Masukkan Merk Mobil: ");
        String merkMobil = scanner.next();
        Mesin mesin = new Mesin();
        Mobil mobil = new Mobil(merkMobil, mesin);
        while (inner != 5){
            Option();
            opt = scanner.nextInt();
            switch (opt){
                case 1:
                    mobil.tambahKecepatan();
                    mobil.stat();
                    break;
                case 2:
                    mobil.kurangiKecepatan();
                    mobil.stat();
                    break;
                case 3:
                    mobil.setKontak("Nyala");
                    mobil.stat();
                    break;
                case 4:
                    mobil.setKontak("Mati");
                    mobil.stat();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
