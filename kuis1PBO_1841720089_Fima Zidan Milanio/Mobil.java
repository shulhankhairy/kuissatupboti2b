
package Kuis1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mobil extends Mesin{
    public String merk;

    Scanner sc = new Scanner(System.in);
    
    public Mobil(String merk, int speed, int gear, int speedMax, int speedMin) {
        super(speed, gear, speedMax, speedMin);
        this.merk = merk;
    }

    public Mobil() {
        
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
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

    public void cetakData(){
        int maneh = 1;
        while (maneh == 1){
        System.out.println("Merk Mobil \n1. Ferrari \n2. Renault \n3.Mercedes");
        System.out.println("");
        System.out.print("Pilih Merk Mobil Anda : ");
        int pilih = sc.nextInt();
        System.out.println("");
        if (pilih==1) {
            System.out.println("Merk Mobil : Ferrari");
            int speedMax = 430;
            int speedMin = 0;
            int gear = 1;
            int speedAwal = 200;
            speed = speedAwal + 30;
            speedDown = speedAwal - 10;
            super.getSpeed();
            super.cetakStatus();
        }
        else if (pilih == 2) {
            System.out.println("Merk Mobil : Renault");
            speedMax = 385;
            speedMin = 0;
            gear = 1;
            speedAwal = 100;
            speed = speedAwal + 55;
            speedDown = speedAwal - 20;
            super.cetakStatus();
        }
        
        else if (pilih == 3) {
            System.out.println("Merk Mobil : Mercedes");
            speedMax = 430;
            speedMin = 0;
            gear = 1;
            speedAwal = 100;
            speed = speedAwal + 65;
            speedDown = speedAwal - 35;
            super.cetakStatus();
        }
        else{
            System.out.println("Pilihan Tidak Tersedia");
        }
        System.out.print("Apakah Anda Ingin Kredit Lagi Y/T?");
	
        char ya = sc.next().charAt(0);
	// ya = sc.next().charAt(0);

	if (ya=='Y' || ya == 'y') {
            maneh = 1;
	}
	else if (ya=='T' || ya == 't'){
            maneh = 0;
	}
        System.out.println("");
        }
    }
}
