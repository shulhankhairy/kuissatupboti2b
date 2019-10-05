
package kuis1;

/**
 *
 * @author ASUS A405U
 */
public class Mesin {
    private String jenis;
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private Mobil mobil;

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mesin(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }
 
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(jenis.equalsIgnoreCase("Ferary")){
            if(kontakOn == true){
                kecepatan += 30;
            }else if(kecepatan > 430){
                System.out.println("Kecepatan tidak bisa ditambahkan");
        }else if(jenis.equalsIgnoreCase("Renault")){
            if(kontakOn == true){
                kecepatan += 55;
            }else if(kecepatan > 385){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Mercedes")){
            if(kontakOn == true){
                kecepatan += 65;
            }else if(kecepatan > 430){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }
            else{
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
            }
        }
    }
    public void kurangiKecepatan(){
        if(jenis.equalsIgnoreCase("Ferary")){
            if(kontakOn == true){
                kecepatan -= 10;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
        }else if(jenis.equalsIgnoreCase("Renault")){
            if(kontakOn == true){
                kecepatan -= 20;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Mercedes")){
            if(kontakOn == true){
                kecepatan -= 35;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
            }
        }
            else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
            }
        }
    }
    public void status(){
        if(kontakOn ==  true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off ");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
        