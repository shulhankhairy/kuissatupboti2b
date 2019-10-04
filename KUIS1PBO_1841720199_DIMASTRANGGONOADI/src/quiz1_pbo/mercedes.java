
package quiz1_pbo;
import java.util.Scanner;
public class mercedes extends mesin{
 Scanner sc = new Scanner(System.in);
 public int kecepatanTambahan,kecepatanSaatIni,kecepatanKurang;
    mercedes(){
        
    }

    public mercedes(int kecepatan, String merk) {
        super(kecepatan, merk);
    }
        public void tambahKecepatan(){
        
        System.out.println("Tambah kecepatan yang diinginkan = "+"kecepatan saat ini"+" "+( kecepatan )+"\nMasukkan Kecepatan tambahan : ");
        kecepatanTambahan = sc.nextInt();
        if(kecepatanTambahan >55){
            System.out.println("Kecepatan hanya dapat ditambahkan sebesar 55 KM/JAM");
        }
        else{
            kecepatanSaatIni = kecepatanTambahan+setKecepatan(200);
            System.out.println("Kecepatan Saat ini : "+kecepatanSaatIni);
        }
        //KONDISI BERIKUTNYA
        if(kecepatan>=430){
            System.out.println("KECEPATAN MAKSIMUM HANYA 430 KM/JAM");
        }
        else if(kecepatan<=0){
            System.out.println("KECEPATAN MINIMAL O KM/JAM");    
        }
    }
         public void kurangiKecepatan(){
         System.out.println("Kurangi kecepatan yang diinginkan = "+"kecepatan saat ini"+" "+( kecepatanSaatIni )+"\nKurangi kecepatan tambahan sebanyak: ");
        kecepatanTambahan = sc.nextInt();
        if(kecepatanTambahan >20){
            System.out.println("Kecepatan hanya dapat dikurangi sebesar 20 KM/JAM");
        }else{
            kecepatanKurang =kecepatanSaatIni-kecepatanTambahan;
            System.out.println("kecepatan saat ini : "+kecepatanKurang);
        }
        //KONDISI BERIKUTNYA
        if(kecepatan>=430){
            System.out.println("KECEPATAN MAKSIMUM HANYA 430 KM/JAM");
        }
        else if(kecepatan<=0){
            System.out.println("KECEPATAN MINIMAL O KM/JAM");    
        }
    }

    public int setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
        
        if(kecepatan>=430){
        System.out.println("KECEPATAN MAKSIMUM HANYA 430 KM/JAM");
        }
        else if(kecepatan<=0){
        System.out.println("KECEPATAN MINIMAL 0 KM/JAM");    
        }
        return kecepatan;
    }
    

    public int getKecepatan() {
        return kecepatan;
    }
    
    

    
}
