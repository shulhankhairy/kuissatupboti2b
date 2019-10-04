package kuis1;

/**
 *
 * @author user
 */
public class Mobil {

    private String merkMobil;
    private Mesin mesin;

    public Mobil() {

    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public void info() {
        System.out.println("");
        mesin.printStatus();
    }
}
