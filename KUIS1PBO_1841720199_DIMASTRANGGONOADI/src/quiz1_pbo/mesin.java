
package quiz1_pbo;

public class mesin {
    
    protected int kecepatan;
    protected String merk;
    public boolean kondisiON = false;
    public mesin() {
    }
    
    public void hidupkanMesin(){
        kondisiON = true;
    }

    public mesin(int kecepatan, String merk) {
        this.kecepatan = kecepatan;
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    public int Kecepatan(){
        return kecepatan;
    }
    
    
    
    
}
