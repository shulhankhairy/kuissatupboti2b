package kuiss;

public class Mobil {
    private boolean statusMobil=false;
    private String jenis;
    private Mesin mesin;

    public Mobil(){
    
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }
    
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public boolean getStatusMobil() {
        return statusMobil;
    }
    
    public void nyalakanMobil(){
        statusMobil=true;
    }
    
    public void matikanMobil(){
        statusMobil=false;
    }
    
    public void info(){
        System.out.println("Jenis: "+getJenis());
        if(statusMobil == true){
            System.out.println("Keadaan Mobil : Mesin nyala");
        }else{
            System.out.println("Keadaan Mobil : Mesin mati");
        }
        System.out.println("Kecepatan Mobil : "+ mesin.getKecepatan());
        System.out.println("=======================================================");
    }
    
}
