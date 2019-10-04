/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adristi
 */
public class Mesin {
    public String jMesin;
    public Mobil mobil;
    
    public Mesin(){
        
    }
    public Mesin(String jMesin) {
        this.jMesin = jMesin;
    }
    
    public void setMesin(String jMesin){
        this.jMesin = jMesin;
    }
    
    public void tampilData(){
        System.out.println("Jenis Mesin : "+jMesin);
    }
    
}
