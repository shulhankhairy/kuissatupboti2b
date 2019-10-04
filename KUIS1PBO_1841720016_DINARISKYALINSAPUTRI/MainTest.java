package kuis1;

/**
 *
 * @author user
 */
public class MainTest {

    public static void main(String[] args) {
        Mesin m1 = new Mesin();
        m1.setJenisMesin("Ferrari");
        m1.tambahKecepatan();
        m1.nyalakanMesin();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        m1.printStatus();

        Mesin m2 = new Mesin();
        m2.setJenisMesin("Renault");
        m2.tambahKecepatan();
        m2.nyalakanMesin();
        m2.setKecepatan(100);
        m2.tambahKecepatan();
        m2.printStatus();

        Mesin m3 = new Mesin();
        m3.setJenisMesin("Mercendes");
        m3.tambahKecepatan();
        m3.nyalakanMesin();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.printStatus();

        Mesin m4 = new Mesin();
        m4.setJenisMesin("City Car");
        m4.tambahKecepatan();
        m4.nyalakanMesin();
        m4.tambahKecepatan();
        m4.tambahKecepatan();
        m4.printStatus();
    }
}
