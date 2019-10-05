package quis1;
public class Mesin {
    private String merk;
    private int kecepatan = 0;
    public boolean kontakOn = false;

    public Mesin(){
        
    }
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }   
    
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    
    public void tambahKecepatan(){
        if(kontakOn == true){
            if(merk.equalsIgnoreCase("Ferrari")){
                if(kecepatan >= 430){
                    kecepatan -= 40;
                }
                    kecepatan += 30;
                }else if(merk.equalsIgnoreCase("Renault")){
                if(kecepatan >= 385){
                    kecepatan -= 75;
                }
                    kecepatan += 55;
                }else if(merk.equalsIgnoreCase("Mercedes")){
                if(kecepatan >= 430){
                    kecepatan -= 100;
                }
                    kecepatan += 65;
                }else if(merk.equalsIgnoreCase("Avanza")){
                 if(kecepatan >= 420){
                     kecepatan -=70;
                 }
                    kecepatan +=50;
                }
        }else{
            System.out.println("Anda Tidak Dapat Menambah Kecepatan Karena Mesin Mati");
        }
    }
        
    public void kurangiKecepatan(){
        if(kontakOn == false){
            if(merk.equalsIgnoreCase("Ferrari")){
                if(kecepatan >= 10){
                    kecepatan -=10;}
                }
            else if(merk.equalsIgnoreCase("Renault")){
                if(kecepatan >= 20){
                    kecepatan -=20;}
            }
            else if(merk.equalsIgnoreCase("Mercedes")){
                if(kecepatan >= 35){
                    kecepatan -=35;}
            }
            else if(merk.equalsIgnoreCase("Avanza")){
                if(kecepatan >=30){
                    kecepatan -=30;}
            }
            else{
                System.out.println("Kecepatan Tidak Dapat Mengurangi Kecepatan Karena Mesin Mati");
            }
        }
    }
    
    public void Info(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kecepatan : " + kecepatan);
        }
    }
}
