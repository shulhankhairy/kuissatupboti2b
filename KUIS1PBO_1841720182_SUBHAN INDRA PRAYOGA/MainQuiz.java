/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.Scanner;

/**
 *
 * @author De_Hansingingslasher
 */
public class MainQuiz {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    
    Mesin M = new Mesin();
        System.out.println("1. Ferrari");
        System.out.println("2. Renault");
        System.out.println("3. Mercedes");
        System.out.println("4. Honda");
        System.out.print("Insert Salah Satu Mobil : ");
        int x = sc.nextInt();
        
        if (x==1) {
            int z;
            do{
                System.out.println("1. Nyalakan Mesin");
                System.out.println("2. Matikan Mesin");
                System.out.println("3. Tambah Kecepatan");
                System.out.println("4. Kurangi Kecepatan");
                System.out.println("5. Keluar");
                System.out.print("Masukkan Salah Satu : ");
                z = sc.nextInt();    
                if (z==1) {
                        M.Mo.nyalakanMesin();
                        M.printStatusFerrari();
                }
                if (z==2) {
                        M.Mo.matikanMesin();
                        M.printStatusFerrari();
                }
                if(z==3){
                        M.tambahKecepatanFerrari();
                        M.printStatusFerrari();
                }
                if(z==4){
                        M.kurangiKecepatanFerrari();
                        M.printStatusFerrari();
                    }
                }
            while (z!=5);
        }
        
        else if (x==2) {
            int z;
            do{
                System.out.println("1. Nyalakan Mesin");
                System.out.println("2. Matikan Mesin");
                System.out.println("3. Tambah Kecepatan");
                System.out.println("4. Kurangi Kecepatan");
                System.out.println("5. Keluar");
                System.out.print("Masukkan Salah Satu : ");
                z = sc.nextInt();    
                if (z==1) {
                        M.Mo.nyalakanMesin();
                        M.printStatusRenault();
                }
                if (z==2) {
                        M.Mo.matikanMesin();
                        M.printStatusRenault();
                }
                if(z==3){
                        M.tambahKecepatanRenault();
                        M.printStatusRenault();
                }
                if(z==4){
                        M.kurangiKecepatanRenault();
                        M.printStatusRenault();
                    }
                }
            while (z!=5);
        }
        else if (x==3) {
            int z;
            do{
                System.out.println("1. Nyalakan Mesin");
                System.out.println("2. Matikan Mesin");
                System.out.println("3. Tambah Kecepatan");
                System.out.println("4. Kurangi Kecepatan");
                System.out.println("5. Keluar");
                System.out.print("Masukkan Salah Satu : ");
                z = sc.nextInt();    
                if (z==1) {
                        M.Mo.nyalakanMesin();
                        M.printStatusMercedes();
                    }
                    if (z==2) {
                        M.Mo.matikanMesin();
                        M.printStatusMercedes();
                    }
                    if(z==3){
                        M.tambahKecepatanMercedes();
                        M.printStatusMercedes();
                    }
                    if(z==4){
                        M.kurangiKecepatanMercedes();
                        M.printStatusMercedes();
                    }
                }
            while (z!=5);
        }
        else if (x==3) {
            int z;
            do{
                System.out.println("1. Nyalakan Mesin");
                System.out.println("2. Matikan Mesin");
                System.out.println("3. Tambah Kecepatan");
                System.out.println("4. Kurangi Kecepatan");
                System.out.println("5. Keluar");
                System.out.print("Masukkan Salah Satu : ");
                z = sc.nextInt();    
                if (z==1) {
                        M.Mo.nyalakanMesin();
                        M.printStatusHonda();
                    }
                    if (z==2) {
                        M.Mo.matikanMesin();
                        M.printStatusHonda();
                    }
                    if(z==3){
                        M.tambahKecepatanHonda();
                        M.printStatusHonda();
                    }
                    if(z==4){
                        M.kurangiKecepatanHonda();
                        M.printStatusHonda();
                    }
                }
            while (z!=5);
        }
        else{
            System.out.println("Data Yang Anda Masukkan Salah");
        }
    }
    
}
