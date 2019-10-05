package kuis1;

/**
 *
 * @author user
 */
public class Mesin {

    private String jenisMesin;
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public Mesin() {
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tambahKecepatan() {
        if (jenisMesin.equalsIgnoreCase("Ferrari")) {
            if (kontakOn = true) {
                kecepatan += 15;
            } else if (kecepatan > 430) {
                System.out.println("Kecepatan Maksimum");
            }
            if (jenisMesin.equalsIgnoreCase("Renault")) {
                if (kontakOn = true) {
                    kecepatan += 20;
                } else if (kecepatan > 385) {
                    System.out.println("Kecepatan Maksimum");
                }
                if (jenisMesin.equalsIgnoreCase("Mercedes")) {
                    if (kontakOn = true) {
                        kecepatan += 20;
                    } else if (kecepatan > 430) {
                        System.out.println("Kecepatan Maksimum");
                    }
                    if (jenisMesin.equalsIgnoreCase("City Car")) {
                        if (kontakOn = true) {
                            kecepatan += 20;
                        } else if (kecepatan > 400) {
                            System.out.println("Kecepatan Maksimum");
                        }
                    }
                }
            }
        }

    }

    public void KurangiKecepatan() {
        if (jenisMesin.equalsIgnoreCase("Ferrari")) {
            if (kontakOn = true) {
                kecepatan -= 15;
            } else if (kecepatan > 430) {
                System.out.println("Tidak dapat melakukan penambahan kecepatan");
            }
            if (jenisMesin.equalsIgnoreCase("Renault")) {
                if (kontakOn = true) {
                    kecepatan -= 20;
                } else if (kecepatan > 385) {
                    System.out.println("Tidak dapat melakukan penambahan kecepatan");
                }
                if (jenisMesin.equalsIgnoreCase("Mercedes")) {
                    if (kontakOn = true) {
                        kecepatan -= 15;
                    } else if (kecepatan > 430) {
                        System.out.println("Tidak dapat melakukan penambahan kecepatan");
                    }
                    if (jenisMesin.equalsIgnoreCase("City Car")) {
                        if (kontakOn = true) {
                            kecepatan -= 20;
                        } else if (kecepatan > 400) {
                            System.out.println("Tidak dapat melakukan penambahan kecepatan");
                        }
                    }
                }
            }
        }

    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Jenis Mesin " + jenisMesin + "");
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
