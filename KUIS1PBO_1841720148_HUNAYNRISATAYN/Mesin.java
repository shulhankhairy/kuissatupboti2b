/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunayn.kuis1;

/**
 *
 * @author User
 */
public class Mesin {
    private int kecepatan = 0;
    private int kecepatanSeparate;
    private boolean kontakOn = false;
    private boolean mobilOn = false;
    private String jnsMesin;
    
    public void nyalakanMesin () {
        kontakOn = true;
    }
    
    public void matikanMesin () {
        kontakOn = false;
        kecepatan = 0;
        matikanMobil();
    }
    
    public void nyalakanMobil () {
        mobilOn = true;
    }
    
    public void matikanMobil () {
        mobilOn = false;
    }
    
    public void tambahKecepatan (String jnsMesin) {
        this.jnsMesin = jnsMesin;
        if (mobilOn == true) {
            if (kontakOn == true) {
                if (kecepatan >= 430) {
                    System.out.println("Kecepatan tidak bisa bertambah karena telah maximal");
                }
                else {
                    if (jnsMesin == "ferrari")
                        kecepatan += 30;
                    else if (jnsMesin == "renault")
                        if (kecepatan >= 385)
                            System.out.println("Kecepatan tidak bisa bertambah karena telah maximal");
                        else
                            kecepatan += 55;
                    else if (jnsMesin == "mercedes")
                        kecepatan += 65;
                }
            }
            else
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
        else {
            System.out.println("Mesin tidak bisa dinyalakan karena mobil off! \n");
        }
    }
    
    public void kurangiKecepatan (String jnsMesin) {
        this.jnsMesin = jnsMesin;
        if (mobilOn == true) {
            if (kontakOn == true) {
                if (kecepatan > 0) {
                    if (jnsMesin == "ferrari") {
                        kecepatan -= 10;
                    }
                    else if (jnsMesin == "renault") {
                        kecepatan -= 20;
                    }
                    else if (jnsMesin == "mercedes") {
                        kecepatan -= 35;
                    }
                }
                else
                    System.out.println("Kecepatan tidak bisa berkurang karena telah minimum");
            }
            else 
                System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena mobil off! \n");
        }
    }
    
    public void tambahKecepatanSeparate (String jnsMesin, int kecepatanSeparate) {
        this.jnsMesin = jnsMesin;
        this.kecepatanSeparate = kecepatanSeparate;
        if (mobilOn == true) {
            if (kontakOn == true) {
                    kecepatan += kecepatanSeparate;
                }
            else
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
        else {
            System.out.println("Mesin tidak bisa dinyalakan karena mobil off! \n");
        }
    }
    
    public void kurangiKecepatanSeparate (String jnsMesin, int kecepatanSeparate) {
        this.jnsMesin = jnsMesin;
        this.kecepatanSeparate = kecepatanSeparate;
        if (mobilOn == true) {
            if (kontakOn == true) {
                if (kecepatan > 0) {
                    kecepatan -= kecepatanSeparate;
                }
                else
                    System.out.println("Kecepatan tidak bisa berkurang karena telah minimum");
            }
            else 
                System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena mobil off! \n");
        }
    }
    
    public void printStatus (String jnsMesin) {
        System.out.println("Mobil : " + jnsMesin);
        if (mobilOn) {
            System.out.println("Mobil On");
            if (kontakOn == true) {
                System.out.println("Mesin On");
            }
            else {
                System.out.println("Mesin Off");
            }
            System.out.println("Kecepatan : " + kecepatan + "\n");
        }
        else
            System.out.println("Mobil Off");
    }
}
