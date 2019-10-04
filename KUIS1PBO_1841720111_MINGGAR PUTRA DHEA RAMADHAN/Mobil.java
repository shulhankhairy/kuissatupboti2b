package quis1;
public class Mobil {
    private Mesin mesin;
    private String merkMobil;

    public Mobil(String merkMobil, String merkMesin) {
        this.mesin = new Mesin();
        mesin.setMerk(merkMesin);
        this.merkMobil = merkMobil;
    }

    public void nyalakanMesinMobil(){
        mesin.nyalakanMesin();
    }
    
    public void matikanMesinMobil(){
        mesin.matikanMesin();
    }    
    
    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public String getMerkMesin() {
        return mesin.getMerk();
    }
    
    public void tambahKecepatanMobil(){
        mesin.tambahKecepatan();
    }
    
    public void kurangiKecepatanMobil(){
        mesin.kurangiKecepatan();
    }
    
    public void Status(){
        System.out.println("||==================== "+ "Mobil " + merkMobil + " ====================||");
        mesin.Info();
        System.out.println("Kecepatan Anda : " + mesin.getKecepatan() + " Km/Jam");
        System.out.println("||====================================================================||");
    }
}
