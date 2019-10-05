/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author ASUS
 */
class Mesin {
    private String merk;
    private double kecepatan;
    private boolean kontakOn=false;

    public Mesin() {
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

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(){
        if(KontakOn==true){
            if("Ferrari".equalsIgnoreCase(merk) ){
                if(kecepatan>=430){
                    kecepatan -=40;
                }
                kecepatan += 30;
            }
        
            else if("Renault".equalsIgnoreCase(merk)){
                if(kecepatan>=385){
                    kecepatan -=75;
                }
                kecepatan += 55;
            }
            else if("Mercedes".equalsIgnoreCase(merk) ){
                if(kecepatan>=430){
                    kecepatan -=100;
                }
                kecepatan += 65;
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off!! \n");
        }    
    }
    public void kurangiKecepatan(){
        if(kontakOn==true){
            if("Ferrari".equalsIgnoreCase(merk) ){
                if(kecepatan >= 10){
                    kecepatan -= 10;
                }            
            }
            else if("Renault".equalsIgnoreCase(merk)){
                if(kecepatan >= 20){
                    kecepatan -= 20;
                }  
            }
            else if("Mercedes".equalsIgnoreCase(merk)){
                if(kecepatan >= 35){
                    kecepatan -= 35;
                }  
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off!! \n");    
    }
/*    public void printStatus(){
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }*/
}