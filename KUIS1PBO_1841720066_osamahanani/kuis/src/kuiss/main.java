package kuiss;

public class main {
    public static void main(String[] args) {
     
        Mobil m = new Mobil();
        Mesin msn = new Mesin();
        m.setMesin(msn); 
        m.setJenis("Ferrari");
        m.nyalakanMobil();
        msn.tambahKecepatan(m);
        msn.tambahKecepatan(m);
        msn.tambahKecepatan(m);
        msn.tambahKecepatan(m);
        m.info();
        
        Mobil m2 = new Mobil();
        Mesin msn2 = new Mesin();
        m.setMesin(msn2);
        m2.setJenis("Renault");
        m2.nyalakanMobil();
        msn2.tambahKecepatan(m2);
        msn2.tambahKecepatan(m2);
        msn2.tambahKecepatan(m2);
        m2.info();
        
        Mobil m3 = new Mobil();
        Mesin msn3 = new Mesin();
        m.setMesin(msn3);
        m3.setJenis("Mercedes");
        m3.nyalakanMobil();
        msn3.tambahKecepatan(m3);
        msn3.tambahKecepatan(m3);
        msn3.tambahKecepatan(m3);
        m3.info();
        
    }
}
