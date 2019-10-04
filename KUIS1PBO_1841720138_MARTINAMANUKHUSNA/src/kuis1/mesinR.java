package kuis1;

/**
 *
 * @author MARTIN
 */
public class mesinR extends Mobil {
    private int kecepatanR;
    private boolean kontakOn=false;
    
    mesinR(){
    }

    public mesinR(int kecepatanR, String nama, String jenis, int harga, String warna, int max, int min) {
        super(nama, jenis, harga, warna, max, min);
        this.kecepatanR = kecepatanR;
    }
    
    public void nyalakanMesinR(){
        kontakOn=true;
    }
    
    public void matikanMesinR(){
        int kecepatanR=0;
        kontakOn=false;
    }
    
    public void tambahKecepatanR(){
        if(kontakOn==true){
            kecepatanR+=55;
        }else{
            System.out.println("Mesin Mati");
        }
    }
    
    public void kurangiKecepatanR(){
        if(kontakOn==true){
            kecepatanR-=20;
        }else{
            System.out.println("Mesin Mati");
        }
    }
    
    public void printR(){
        System.out.println("=========RENAULT=========");
        super.tampilData();
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatanR+" km/jam");
        System.out.println("=========================");
    }
}
