package kuis1;

/**
 *
 * @author MARTIN
 */
public class mesinM extends Mobil {
    private int kecepatanM;
    private boolean kontakOn=false;
    
    public mesinM(){
    }

    public mesinM(int kecepatanM, String nama, String jenis, int harga, String warna, int max, int min) {
        super(nama, jenis, harga, warna, max, min);
        this.kecepatanM = kecepatanM;
    }
    
    public void nyalakanMesinM(){
        kontakOn=true;
    }
    
    public void matikanMesinM(){
        int kecepatanF=0;
        kontakOn=false;
    }
    
    public void tambahKecepatanM(){
        if(kontakOn==true){
            kecepatanM+=65;
        }else{
            System.out.println("Mesin Mati");
        }
    }
    
    public void kurangiKecepatanM(){
        if(kontakOn==true){
            kecepatanM-=35;
        }else{
            System.out.println("Mesin Mati");
        }
    }
    
    public void printM(){
        System.out.println("=========MERCEDES=========");
        super.tampilData();
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatanM+" km/jam");
        System.out.println("=========================");
    }
}