package quizz.view;

import java.util.Scanner;

public class View{
    static Scanner scn = new Scanner(System.in);
    public void Menu(){
        System.out.println("masukan nama kendaraan yang ingin anda pakai");
        System.out.println("1. toyomba\n2. mustibisha \n3.LemperGember");
        int pilihan = scn.nextInt();
        switch (pilihan) {
            case 1:
                mobil1();
                break;
            case 2:
                mobil2();
                break;

            case 3:
                mobil3();
                break;
            default:
            System.out.println("input anda salah");
                break;
        }

       
        
    }
    public void mobil1(){
        
    }
    public void mobil2(){

    }
    public void mobil3(){

    }



}