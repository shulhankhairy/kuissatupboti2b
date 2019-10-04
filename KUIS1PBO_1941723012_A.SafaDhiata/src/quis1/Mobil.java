package quis1;
public class Mobil {

    private String merk;
    private boolean mobilMenyala = false;
    Mesin mesinMobil;

    public Mobil() {
    }

    public Mobil(String merk) {
        this.merk = merk;
        mesinMobil = new Mesin(merk);
    }

    public String getMerk() {
        return merk;
    }

    public void setMobilOn() {
        this.mobilMenyala = true;
        if(isMobilMenyala()){
            mesinMobil.setMesinOn();
        }
    }

    public void setMobilOff(){
        mesinMobil.setMesinOff();
        this.mobilMenyala = false;
    }

    public void tambahKecepatan(){
        mesinMobil.tambahKecepatan(this.merk);
    }

    public void kurangKecepatan(){
        mesinMobil.kurangiKecepatan(this.merk);
    }

    public boolean isMobilMenyala() {
        return mobilMenyala;
    }

    public void printInfo(){
        System.out.println("Mobil Menyala : " + this.mobilMenyala);
        mesinMobil.printInfoMesin();
    }

    public void printKecepatan(){
        mesinMobil.printKecepatan();
    
    }
}