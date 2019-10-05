package Quiz1PBOTI2B;

/**
 *
 * @author ps42
 */
public class Mesin {
    private String Merk;
    private int Kecepatan, kecepatan, maxKecepatan;
    private boolean kontakOn = false;

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public int getKecepatan() {
        return Kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    

    public void setMaxKecepatan(int maxKecepatan) {
        this.maxKecepatan = maxKecepatan;
    }
    
    public void nyalakanMesin(){
        kontakOn = false;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    
    public void tambahFerari(){
        if(kontakOn == true){
            kecepatan += 30;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
    
    public void kurangiFerari(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
    
        public void tambahRenault(){
        if(kontakOn == true){
            kecepatan += 55;
        }
        else{
            System.out.println("Mesin mati");
        }
    }   
        
         public void kurangiRenault(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
        
        public void tambahMercedez(){
        if(kontakOn == true){
            kecepatan += 65;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
        
         public void kurangiMercedez(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
        
        public void tambahAudi(){
        if(kontakOn == true){
            kecepatan += 40;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
        
         public void kurangiAudi(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Mesin mati");
        }
    }
    
        public void printStatus(){
            if(kontakOn == true){
                System.out.println("Kontak On");
            }
            else{
                System.out.println("Kontak Off");
            }
            System.out.println("Kecepatan "+ kecepatan);
        }
        
    public void cetakStatus(){
		 System.out.println("Merk                  : " + Merk);
		 System.out.println("Penambahan Kecepatan  : " + Kecepatan);
                 System.out.println("Max Kecepatan         : " + maxKecepatan);
	 }
 }
