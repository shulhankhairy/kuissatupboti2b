package kuis1;

/**
 *
 * @author MARTIN
 */
public class mesinF extends Mobil {
    private int kecepatanF;
    private boolean kontakOn=false;
    
    public mesinF(){
    }

    public mesinF(int kecepatanF, String nama, String jenis, int harga, String warna, int max, int min) {
        super(nama, jenis, harga, warna, max, min);
        this.kecepatanF = kecepatanF;
    }
    
    public void nyalakanMesinF(){
        kontakOn=true;
    }
    
    public void matikanMesinF(){
        int kecepatanF=0;
        kontakOn=false;
    }
    
    public void tambahKecepatanF(){
        if(kontakOn==true){
            kecepatanF+=30;
        }else{
            System.out.println("Mesin Mati");
        }
    }
    
    public void kurangiKecepatanF(){
        if(kontakOn==true){
            kecepatanF-=10;
        }else{
            System.out.println("Mesin Mati");
        }
    }
    
    public void printF(){
        System.out.println("=========FERRARI=========");
        super.tampilData();
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatanF+" km/jam");
        System.out.println("=========================");
    }
}