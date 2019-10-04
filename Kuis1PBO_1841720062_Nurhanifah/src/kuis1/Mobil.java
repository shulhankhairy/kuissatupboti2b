package kuis1;

/**
 *
 * @author ASUS A405U
 */
public class Mobil {

    public Mesin getMesin() {
        return mesin;
    }
    private String merk ;
    private Mesin mesin;

    public Mobil(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public Mesin getMesin(Mesin mesin) {
        return mesin;
    }
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    public void tambahKecepatan(){
        mesin.tambahKecepatan();
    }
    public void kurangiKecepatan(){
        mesin.kurangiKecepatan();
    }
    public void status(){
        System.out.println(merk);
        mesin.status();
    } 
    
    
}
