/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author De_Hansingingslasher
 */
public class Mobil {
    
    public int kecepatan = 0;
    public boolean On = false;
        
        public void nyalakanMesin(){
            On=true;
        }
        public void matikanMesin(){
            On=false;
            kecepatan= 0;
        }
    
    
}
