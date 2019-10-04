package quis1;
public class Mesin {

    private String mesin;
    private int kecepatan = 0;
    private boolean mesinMenyala = false;

    public Mesin(String mesin) {
        this.mesin = mesin;
    }

    public String getMesin() {
        return mesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public void setMesinOn() {
        this.mesinMenyala = true;
    }

    public void setMesinOff() {
        this.kecepatan = 0;
        this.mesinMenyala = false;
    }

    public void tambahKecepatan(String merk) {
        if (this.mesinMenyala) {
            if (merk.equals("ferrari") && cekKecepatan(30, true)) {
                this.kecepatan += 30;
            } else if (merk.equals("Renault") && cekKecepatan(55, true)) {
                this.kecepatan += 55;
            } else if (merk.equals("Mercedez") && cekKecepatan(65, true)) {
                this.kecepatan += 65;
            } else if (merk.equals("Buggati") && cekKecepatanBugatti(50, true)) {
                this.kecepatan += 50;
            } else {
                System.out.println("kecepatan max");
            }
        } else{
            System.out.println("Mesin masih mati");
        }
    }

    public void kurangiKecepatan(String merk) {
        if (this.mesinMenyala) {
            if (merk.equals("Ferrari") && cekKecepatan(10, false)) {
                this.kecepatan -= 10;
            } else if (merk.equals("Renault") && cekKecepatan(20, false)) {
                this.kecepatan -= 20;
            } else if (merk.equals("Mercedez") && cekKecepatan(35, false)) {
                this.kecepatan -= 35;
            } else if (merk.equals("Buggati") && cekKecepatanBugatti(30, false)) {
                this.kecepatan -= 30;
            } else {
                System.out.println("kecepatan kurang");
            }
        } else {
            System.out.println("Mesin masih mati");
        }
    }

    public void printInfoMesin() {
        System.out.println("Mesin menyala : " + this.mesinMenyala);
        System.out.println("Jenis Mesin : " + getMesin());
        System.out.println("Kecepatan Mobil : " + getKecepatan());
    }

    public void printKecepatan() {
        System.out.println("Kecepatan Mobil : " + getKecepatan());
    }

    public boolean cekKecepatan(int kecepatan, boolean plus) {
        if (plus) {
            return (kecepatan + this.kecepatan) <= 100;
        } else if(!plus){
            return (this.kecepatan - kecepatan ) > 0;
        }
        return false;
    }

    public boolean cekKecepatanBugatti(int kecepatan, boolean plus) {
        if(plus){
            return (kecepatan + this.kecepatan) <= 315;
        }else if(!plus){
            return (this.kecepatan + kecepatan) > 0;
        }
        return false;
    }
}