package Quis1;

/**
 *
 * @author XLenox
 */
public class Mobil {
    
    private String nama;

    public Mobil() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampil(){
        System.out.println("Mobil : " + getNama());
    }
}
