/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunayn.kuis1;

/**
 *
 * @author User
 */
public class Mobil {
    private Mesin ferrari;
    private Mesin renault;
    private Mesin mercedes;
    private Mesin cityCar;

    public Mobil() {
    }

    public Mobil(Mesin ferrari, Mesin renault, Mesin mercedes, Mesin cityCar) {
        this.ferrari = ferrari;
        this.renault = renault;
        this.mercedes = mercedes;
        this.cityCar = cityCar;
    }

    public void setFerrari(Mesin ferrari) {
        this.ferrari = ferrari;
    }

    public void setRenault(Mesin renault) {
        this.renault = renault;
    }

    public void setMercedes(Mesin mercedes) {
        this.mercedes = mercedes;
    }

    public void setCityCar(Mesin cityCar) {
        this.cityCar = cityCar;
    }

    public Mesin getFerrari() {
        return ferrari;
    }

    public Mesin getRenault() {
        return renault;
    }

    public Mesin getMercedes() {
        return mercedes;
    }

    public Mesin getCityCar() {
        return cityCar;
    }
}
