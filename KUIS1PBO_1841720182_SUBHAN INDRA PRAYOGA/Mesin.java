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
public class Mesin {
   Mobil Mo = new Mobil();
        
         public void tambahKecepatanFerrari(){
            if(Mo.On == true){
                Mo.kecepatan +=30;
                if (Mo.kecepatan >= 430){
                    Mo.kecepatan = 430;
                    if (Mo.kecepatan==430) {
                        System.out.println("Kecepatan Tidak Bisa di tambah lagi");
                    }
                }
                
                else {
                System.out.println("Kecepatan Maksimalnya 430 km/jam");
                }
            }
            else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati! ");
            }
        }
         
        public void kurangiKecepatanFerrari(){
            if (Mo.On == true){
                Mo.kecepatan -= 10;
                if (Mo.kecepatan <= 0){
                    Mo.kecepatan = 0;
                    if (Mo.kecepatan==0) {
                        System.out.println("Mobil Berhenti");
                    }
                }
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Mati!");
            }
        }
        public void printStatusFerrari(){
            System.out.println("===============================");
            if (Mo.On == true){
                System.out.println("Kontak On ");
            }
            else{
                System.out.println("Kontak Off");
            }
            System.out.println("Kecepatan "+Mo.kecepatan+"\n");
            System.out.println("===============================");
        }
        
        public void tambahKecepatanRenault(){
            if(Mo.On == true){
                 Mo.kecepatan +=55;
                if (Mo.kecepatan >= 385){
                   Mo.kecepatan =385;
                   if (Mo.kecepatan==385) {
                        System.out.println("Kecepatan Tidak Bisa di tambah lagi");
                    }
                }
                
                else {
                System.out.println("Kecepatan Melebihi Maksimalnya 385 km/jam");
                }
            }
            else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati! ");
            }
        }
         
        public void kurangiKecepatanRenault(){
            if (Mo.On == true){
                Mo.kecepatan -= 20;
                if (Mo.kecepatan <= 0){
                    Mo.kecepatan = 0;
                    if (Mo.kecepatan==0) {
                        System.out.println("Mobil Berhenti");
                    }
                }
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Mati!");
            }
        }
        public void printStatusRenault(){
            System.out.println("===============================");
            if (Mo.On == true){
                System.out.println("Kontak On ");
            }
            else{
                System.out.println("Kontak Off");
            }
            System.out.println("Kecepatan "+Mo.kecepatan+"\n");
            System.out.println("===============================");
        }
        
        public void tambahKecepatanMercedes(){
            if(Mo.On == true){
                Mo.kecepatan +=65;
                if (Mo.kecepatan >= 430){
                    Mo.kecepatan=430;
                    if (Mo.kecepatan==430) {
                        System.out.println("Kecepatan Tidak Bisa di tambah lagi");
                    }
                }
                
                else {
                System.out.println("Kecepatan Melebihi Maksimalnya 430 km/jam");
                }
            }
            else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati! ");
            }
        }
         
        public void kurangiKecepatanMercedes(){
            if (Mo.On == true){
                Mo.kecepatan -= 35;
                if (Mo.kecepatan <= 0){
                    Mo.kecepatan = 0;
                    if (Mo.kecepatan==0) {
                        System.out.println("Mobil Berhenti");
                    }
                }
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Mati!");
            }
        }
         public void printStatusMercedes(){
             System.out.println("===============================");
            if (Mo.On == true){
                System.out.println("Kontak On ");
            }
            else{
                System.out.println("Kontak Off");
            }
            System.out.println("Kecepatan "+Mo.kecepatan+"\n");
            System.out.println("===============================");
        }
         
         public void tambahKecepatanHonda(){
            if(Mo.On == true){
                Mo.kecepatan +=50;
                if (Mo.kecepatan >= 400){
                    Mo.kecepatan=400;
                    if (Mo.kecepatan==400) {
                        System.out.println("Kecepatan Tidak Bisa di tambah lagi");
                    }
                }
                else {
                System.out.println("Kecepatan Melebihi Maksimalnya 400 km/jam");
                }
            }
            else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati! ");
            }
        }
         
        public void kurangiKecepatanHonda(){
            if (Mo.On == true){
                Mo.kecepatan -= 20;
                if (Mo.kecepatan <= 0){
                    Mo.kecepatan = 0;
                    if (Mo.kecepatan==0) {
                        System.out.println("Mobil Berhenti");
                    }
                }
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Mati!");
            }
        }
         public void printStatusHonda(){
             System.out.println("===============================");
            if (Mo.On == true){
                System.out.println("Kontak On ");
            }
            else{
                System.out.println("Kontak Off");
            }
            System.out.println("Kecepatan "+Mo.kecepatan+"\n");
            System.out.println("===============================");
         }
}
