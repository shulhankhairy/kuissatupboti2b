package quiz;
public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        Mesin mes = new Mesin();
        m.menyalakan();
        mes.nyala();
        System.out.println("======================");
        m.setMerk("Ferrari");
        m.setMesin(mes);
        m.tmbhKec();
        m.cetakMobil();
        System.out.println("======================");
    }
}
