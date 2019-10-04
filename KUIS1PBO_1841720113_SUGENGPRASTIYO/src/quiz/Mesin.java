package quiz;

public class Mesin {

    int kecepatan;
    boolean nyala = true;
    String status = "mati";
    boolean nyala() {
        status = "nyala";
        nyala = true;
        return nyala;
    }

    boolean mati() {
        status = "mati";
        nyala = false;
        return nyala;
    }

    int tambahKec(String mesin) {
        if (nyala == true) {
            if (kecepatan < 430) {
                if (mesin.equalsIgnoreCase("Ferrari")) {
                    kecepatan = kecepatan + 30;
                }else if (mesin.equalsIgnoreCase("Renault")) {
                if (kecepatan < 385) {
                    kecepatan = kecepatan + 55;
                }else {
                    System.out.println("Kecepatan Renault Penuh");
                }
                }else if(mesin.equalsIgnoreCase("Mercedes")){
                    kecepatan = kecepatan + 65;
                }else if(mesin.equalsIgnoreCase("Xenia")){
                    kecepatan = kecepatan + 30;
                }
                else{
                    System.out.println("Inputan Salah");
                }
            }else{
                System.out.println("Kecepatan Penuh");
            }
        }else{
            System.out.println("Mesin Mati");
        } 
        return kecepatan;
    }
    
    int kurangKec(String mesin){
        if (nyala == true) {
            if (kecepatan >0) {
                if (mesin.equalsIgnoreCase("Ferrari")) {
                    kecepatan = kecepatan - 10;
                }else if (mesin.equalsIgnoreCase("Renault")) {
                if (kecepatan < 385) {
                    kecepatan = kecepatan - 20;
                }else {
                    System.out.println("Kecepatan Renault Penuh");
                }
                }else if(mesin.equalsIgnoreCase("Mercedes")){
                    kecepatan = kecepatan - 35;
                }else if(mesin.equalsIgnoreCase("Xenia")){
                    kecepatan = kecepatan - 10;
                }
                else{
                    System.out.println("Inputan Salah");
                }
            }else{
                System.out.println("Silahkan menyalakan mesin terlebih dahulu");
            }
        }else{
            System.out.println("Mesin Masih Mati");
        } 
        return kecepatan;
    }
}
