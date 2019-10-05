package kuis1;

/**
 *
 * @author MARTIN
 */
public class Mobil {
    public String nama;
    public String jenis;
    public int harga;
    public String warna;
    public int max;
    public int min;

    public Mobil(){
    }

    public Mobil(String nama, String jenis, int harga, String warna, int max, int min) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.warna = warna;
        this.max = max;
        this.min = min;
    }
    
    public void tampilData(){
        System.out.println("Nama Mobil      : "+nama);
        System.out.println("Jenis Mobil     : "+jenis);
        System.out.println("Harga Mobil     : "+harga);
        System.out.println("Warna Mobil     : "+warna);
        System.out.println("Kecepetan Max   : "+max);
        System.out.println("Kecepetan Min   : "+min);
    }
}
