package quiz;
public class Mobil {
    Mesin mesin;
    String nama;
    String merk;
    boolean menyala = false;
    
    boolean menyalakan(){
        return menyala = true;
    }
    boolean mematikan(){
        return menyala = false;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    void tmbhKec(){
        if(menyala==true){
            mesin.tambahKec(merk);
        }else{
            System.out.println("Mesin Mati");
        }
    }
    void krngKec(){
        if(menyala==true){
            mesin.kurangKec(merk);
        }else{
            System.out.println("Mesin Mati");
        }
    }
    void cetakMobil(){
        System.out.println("Merk = "+merk);
        System.out.println("Kondisi = "+mesin.status);
        System.out.println("Kecepatan = "+mesin.kecepatan);
        
    }
}
