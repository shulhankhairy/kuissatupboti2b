package quiz1;
public class car {
    private String ferrari;
    private String renault;
    private String marcedes;
    private machine m;

    public car() {
    }
    public car(String ferrari, String renault, String marcedes) {
        this.ferrari = ferrari;
        this.renault = renault;
        this.marcedes = marcedes;
    }
    public String getFerrari() {
        return ferrari;
    }
    public void setFerrari(String ferrari) {
        this.ferrari = ferrari;
    }
    public String getRenault() {
        return renault;
    }
    public void setRenault(String renault) {
        this.renault = renault;
    }
    public String getMarcedes() {
        return marcedes;
    }
    public void setMarcedes(String marcedes) {
        this.marcedes = marcedes;
    }
    public void info(){
    }
}