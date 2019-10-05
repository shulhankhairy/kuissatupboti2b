package kuiss;

public class Mesin {

    private int kecepatan;
    private Mobil mobil;

    public Mesin() {

    }
    public void setKecepatan(Mobil mobil) {
        this.mobil = mobil;
    }
    public int getKecepatan() {
        return kecepatan;
    }
    
     public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void tambahKecepatan(Mobil mobil) {
        if (mobil.getStatusMobil() == true) {
            if (mobil.getJenis() == "Ferrari") {
                kecepatan += 30;
                if (kecepatan > 120) {
                    kecepatan = 150;
                    System.out.println("Kecepatan Maksimum 120");
                }
            } else if (mobil.getJenis()== "Renault") {
                kecepatan += 55;
                if (kecepatan > 120) {
                    kecepatan = 385;
                    System.out.println("Kecepatan Maksimum 385");
                }
            } else if (mobil.getJenis()== "Mercedes") {
                kecepatan += 65;
                if (kecepatan > 120) {
                    kecepatan = 430;
                    System.out.println("Kecepatan Maksimum 100");
                }
            }
        } else {
            System.out.println("Mesin mobil mati. Nyalakan meisn terlebih dahulu.");
        }

    }

    public void kurangiKecepatan(Mobil mobil) {
        if (mobil.getStatusMobil() == true) {
            if (mobil.getJenis()== "Ferrari") {
                kecepatan -= 10;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Minimum 0");
                }
            } else if (mobil.getJenis()== "Renault") {
                kecepatan -= 20;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Minimum 0");
                }
            } else if (mobil.getJenis()== "Mercedes") {
                kecepatan -= 35;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Minimum 0");
                }
            }
        } else {
            System.out.println("Mesin mobil mati. Nyalakan mesin terlebih dahulu.");
        }
    }
}
