package Quiz;

public class Mobil{
    private String merekMobil;
    private Mesin mesin;

    public Mobil() {
    }

    public Mobil(String merekMobil, Mesin mesin) {
        this.merekMobil = merekMobil;
        this.mesin = mesin;
    }

    public String getMerekMobil() {
        return merekMobil;
    }

    public void setMerekMobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setKontak(String cond){
        if (cond.equals("Nyala"))
            mesin.onMesin();
        else
            mesin.offMesin();
    }

    public void tambahKecepatan(){
        mesin.addSpeed(this.merekMobil);
    }

    public void kurangiKecepatan(){
        mesin.deleteSpeed(this.merekMobil);
    }

    public void stat(){
        if (mesin.isKontakOn())
            mesin.status(this.merekMobil);
        else
            System.out.println("Hidupkan Mobil dahulu");
    }
}
