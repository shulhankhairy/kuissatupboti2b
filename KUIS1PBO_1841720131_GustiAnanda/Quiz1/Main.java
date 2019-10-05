/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import java.util.Scanner;

/**
 *
 * @author Gin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mesin m = new Mesin();
        Mobil mb = new Mobil();
        
        System.out.print("Jenis Mobil   : ");
        mb.merkMesin = sc.nextLine();
        
        
// Memasukkan Kecepatan awal Mobil //
        mb.dataMobil(400);
        mb.tampilMobil();
    }
}
