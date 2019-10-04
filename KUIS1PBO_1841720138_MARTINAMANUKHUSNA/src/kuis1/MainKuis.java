package kuis1;

/**
 *
 * @author MARTIN
 */
public class MainKuis {
    public static void main(String[] args) {
        mesinF m = new mesinF();
        m.nama      ="Ferrari";
        m.jenis     ="sport turbo";
        m.harga     =800000000;
        m.warna     ="red";
        m.max       =430;
        m.min       =0;
        m.nyalakanMesinF();
        m.tambahKecepatanF();
        m.printF();
        System.out.println();
        
        mesinR mr = new mesinR();
        mr.nama     ="Renault";
        mr.jenis    ="turbo extreme";
        mr.harga    =900000000;
        mr.warna    ="blue";
        mr.max      =430;
        mr.min      =0;
        mr.nyalakanMesinR();
        mr.tambahKecepatanR();
        mr.printR();
        System.out.println();
        
        mesinM mm = new mesinM();
        mm.nama     ="Mercedes";
        mm.jenis    ="maximum turbo";
        mm.harga    =550000000;
        mm.warna    ="grey";
        mm.max      =385;
        mm.min      =0;
        mm.nyalakanMesinM();
        mm.tambahKecepatanM();
        mm.printM();
        System.out.println();
    }
}
