package Quis1;

/**
 *
 * @author XLenox
 */
public class Mesin {

    private int kecepatan;
    private boolean kontakOn = false;
    private Mobil mbl;
    
    public Mesin() {
    }
    
    public void nyalakanMesin()
    {
        kontakOn = true;
    }
    
    public void matikanMesin()
    {
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(String mobil , int increment)
    {
        if(kontakOn == true)
        {
            if(mobil.equals("Ferrari") || mobil.equals("Mercedes")){
            
                if(increment == 0){
                    System.out.println("Silakan tambah kecepatan mobil anda");
                }
                else if(increment <= 430){
                    kecepatan += increment;
                }else{
                    System.out.println("Kecepatan maksimum 430 KM/jam");
                }
            }
            else if(mobil.equals("Renault")){
                if(increment == 0){
                    System.out.println("Silakan tambah kecepatan mobil anda");
                }
                else if(kecepatan <= 385){
                    kecepatan += increment;
                }
                else{
                    System.out.println("Kecepatan maksimum 385 KM/jam");
                }
            }
            else{
                if(increment == 0){
                    System.out.println("Silakan tambah kecepatan mobil anda");
                }
                else if(kecepatan <= 200){
                    kecepatan += increment;
                }
                else{
                    System.out.println("Kecepatan maksimum 200 KM/jam");
                }
            }
        }
        else
        {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin OFF! \n");
        }
    }
    
    public void kurangiKecepatan(int decrement)
    {
        if(kontakOn == true)
        {
            if(kecepatan >= 0){
                kecepatan -= decrement;
            }
            else{
                System.out.println("Silakan tambah kecepatan mobil anda");
            }
        }
        else
        {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus()
    {
        if(kontakOn == true)
        {
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak OFF");
        }
        //System.out.println("Mobil : " + mbl.getNama());
        System.out.println("Kecepatan " + kecepatan + " KM/jam");
    }
}
