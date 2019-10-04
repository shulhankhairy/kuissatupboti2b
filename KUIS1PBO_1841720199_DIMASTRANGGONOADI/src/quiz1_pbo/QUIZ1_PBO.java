
package quiz1_pbo;
import java.util.Scanner;
public class QUIZ1_PBO {

 
   
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    ferrari f = new ferrari();
    mercedes m = new mercedes();
    renault r = new renault();
    audi a = new audi();
        int pilihan;
        System.out.println("\tMESIN MOBIL");
        System.out.println("\tMenu Pilihan  Mobil\n1.FERRARI\n2.MERCEDES\n3.RENAULT\n4.AUDI");
        System.out.println("Pilih mesin mobil yang akan dicoba (1/2/3/4) = ");
        pilihan = sc.nextInt();
        if(pilihan==1){
            System.out.println("============ MESIN FERRARI =============");
            System.out.println("KECEPATAN AWAL : "+ f.setKecepatan(0));
            System.out.println("Apakah anda ingin menambahkan kecepatan?(Masukkan kecepatan tambahan) : ");
            f.tambahKecepatan();
            System.out.println("Apakah anda ingin mengurangi kecepatan? (Masukkan untuk mengurangi)");
            f.kurangiKecepatan();
        }
        else if(pilihan==2){
            System.out.println("============ MESIN MERCEDES ============");
            System.out.println("KECEPATAN AWAL : "+ m.setKecepatan(0));
            System.out.println("Apakah anda ingin menambahkan kecepatan?(Masukkan kecepatan tambahan) : ");
            m.tambahKecepatan();
          
             System.out.println("Apakah anda ingin mengurangi kecepatan? (Masukkan untuk mengurangi)");
            m.kurangiKecepatan();
        }
        else if(pilihan==3){
            System.out.println("============= MESIN RENAULT ============");
            System.out.println("KECEPATAN AWAL : "+ r.setKecepatan(0));
            System.out.println("Apakah anda ingin menambahkan kecepatan?(Masukkan kecepatan tambahan) : ");
            m.tambahKecepatan();
             System.out.println("Apakah anda ingin mengurangi kecepatan? (Masukkan untuk mengurangi)");
            r.kurangiKecepatan();
        }
        else if(pilihan==4){
            System.out.println("============= MESIN RENAULT ============");
            System.out.println("KECEPATAN AWAL : "+ a.setKecepatan(0));
            System.out.println("Apakah anda ingin menambahkan kecepatan?(Masukkan kecepatan tambahan) : ");
            m.tambahKecepatan();
             System.out.println("Apakah anda ingin mengurangi kecepatan? (Masukkan untuk mengurangi)");
            a.kurangiKecepatan();
        }
        else{
            System.out.println("PILIHAN YANG ANDA MASUKKAN ERROR");
        }
    }
    
}
