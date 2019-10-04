package quiz1;
public class mainkuis {
    public static void main (String [] args){
        machine m = new machine();
        System.out.println("Ferrari");
        m.nyalakanMesin();
        m.printStatus();
        
        machine m1 = new machine();
        System.out.println("Renault");
        m1.matikanMesin();
        m1.tambahKecepatanRenault(55);
        m1.kurangiKecepatanRenault(20);
        m1.printStatus();
        
        machine m2 = new machine ();
        System.out.println("Marcedez");
        m2.nyalakanMesin();
        m2.tambahKecepatanMarcedez(65);
        m2.kurangiKecepatanMarcedez(35);
        m2.printStatus();
        
        machine m3 = new machine();
        System.out.println("Pajero");
        m3.kurangiKecepatanPajero(45);
        m3.printStatus();
    } 
}
