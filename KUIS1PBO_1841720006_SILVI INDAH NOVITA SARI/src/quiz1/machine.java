package quiz1;
public class machine {
    private int kecepatan=0;
    private boolean msOn = false;
    
    public void nyalakanMesin(){
        msOn=true;
    }
    public void matikanMesin(){
        msOn=false;
        kecepatan= 0;
    }
    public void tambahKecepatanFerrari(int input){
        
        if(msOn == true){
            kecepatan += 30;
            if(kecepatan>=30){
               kecepatan = 430;
            }
        }else{
            System.out.println("Kecepatan Maksimal 430! \n");
        }
    }
    public void tambahKecepatanRenault (int input){
        
        if(msOn == true){
            kecepatan += 55;
            if(kecepatan>=55){
               kecepatan = 385;
            }
        }else{
            System.out.println("Kecepatan Maksimal 385! \n");
        }
    }
    public void tambahKecepatanMarcedez (int input){
        
        if(msOn == true){
            kecepatan += 65;
            if(kecepatan>=65){
               kecepatan = 430;
            }
        }else{
            System.out.println("Kecepatan Maksimal 385! \n");
        }
    }
    public void tambahKecepatanPajero (int input){
        
        if(msOn == true){
            kecepatan += 75;
            if(kecepatan>=75){
               kecepatan = 480;
            }
        }else{
            System.out.println("Kecepatan Maksimal 480! \n");
        }
    }
    public void kurangiKecepatanFerrari(int input){
        if (msOn == true){
            kecepatan -= 10;
        }else{
            System.out.println("Kecepatan Tidak Berkurang, Mesin Off!");
        }
    }
    public void kurangiKecepatanRenault(int input){
        if (msOn == true){
            kecepatan -= 20;
        }else{
            System.out.println("Kecepatan Tidak Berkurang, Mesin Off!");
        }
    }
    public void kurangiKecepatanMarcedez(int input){
        if (msOn == true){
            kecepatan -= 35;
        }else{
            System.out.println("Kecepatan Tidak Berkurang, Mesin Off!");
        }
    }
    public void kurangiKecepatanPajero(int input){
        if (msOn == true){
            kecepatan -= 45;
        }else{
            System.out.println("Kecepatan Tidak Berkurang, Mesin Off!");
        }
    }
    public void printStatus(){
        if (msOn == true){
            System.out.println("Mesin On ");
        }
        else{
            System.out.println("Mobil Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}