
package Kuis1;

/**
 *
 * @author User
 */
public class Mesin {
    public int speed;
    public int gear;
    public int speedMax;
    public int speedMin;
    public int speedAwal;
    public int speedDown;

    public Mesin() {
    }

    public Mesin(int speed, int gear, int speedMax, int speedMin) {
        this.speed = speed;
        this.gear = gear;
        this.speedMax = speedMax;
        this.speedMin = speedMin;
        
    }

    public Mesin(int speedAwal) {
        this.speedAwal = speedAwal;
    }
    
    public int getSpeedAwal() {
        return speedAwal;
    }

    public void setSpeedAwal(int speedAwal) {
        this.speedAwal = speedAwal;
    }

    public int getSpeedDown() {
        return speedDown;
    }

    public void setSpeedDown(int speedDown) {
        this.speedDown = speedDown;
    }
    
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public int getSpeedMin() {
        return speedMin;
    }

    public void setSpeedMin(int speedMin) {
        this.speedMin = speedMin;
    }
    
    public void gantiGear(int newValue){
        gear = newValue;
    }
    public void tambahKecepatan(int increment){
        speed = speedAwal + increment;
    }
    public void rem(int decrement){
        speed = speedAwal - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Kecepatan Maksimal : " + speedMax + " km/jam");
        System.out.println("Kecepatan Minimal : " + speedMin + " km/jam");
        System.out.println("Masukkan gear : " +gear);
        System.out.println("Kecepatan Awal : " +speedAwal);
        System.out.println("Tambah kecepatan : " + speed);
        System.out.println("Kurangi Kecepatan : " + speedDown);
    }
}
   