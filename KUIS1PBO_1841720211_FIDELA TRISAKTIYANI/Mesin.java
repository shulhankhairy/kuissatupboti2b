/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KuisSatuPboTI2b;

/**
 *
 * @author FIDELA
 */
public class Mesin {
    private Mobil m;
    private int kecepatan;
    private boolean kontakNyala = false;
    
    
    public void nyalakanMesin()
    {
        kontakNyala = true;
    }
    
    public void matikanMesin()
    {
        kontakNyala = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(String merk, int increment)
    {
        if(kontakNyala == true)
        {
            if(merk.equals("Ferrari") || merk.equals("Mercedes")){
                if(increment == 0)
                {
                    System.out.println("Silahkan menaambah kecepatan Anda");
                }
                else if(increment <= 430)
                {
                     kecepatan = kecepatan+increment;
                }else
                {
                    System.out.println("Kecepatan maxsimum 430 \n");
                }
            }
            else if(merk.equals("Renault")){
                
                if(kecepatan >= 385)
                {
                    kecepatan = kecepatan+increment;
                }else
                {
                    System.out.println("Kecepatan maximum 385 \n");
                }
            }
            else{
                
                if(kecepatan >= 385)
                {
                    kecepatan = kecepatan+increment;
                }else
                {
                    System.out.println("Kecepatan maximum 385 \n");
                }
            }
        }else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin mati! \n");
        }
    }
    
    public void kurangiKecepatan(int decrement)
    {
        if(kontakNyala == true)
        {
            kecepatan = kecepatan - decrement;
        }
        else
        {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Mati! \n");
        }
    }
    
    public void printInfo()
    {
        if(kontakNyala == true)
        {
            //System.out.print("Merk Mobil: "+m.getMerk());
            System.out.println("Mesin Menyala");
        }
        else{
            System.out.println("Mesin Mati");
        }
        System.out.println("Kecepatan : " +kecepatan+ "\n");
    }
    
    
}
