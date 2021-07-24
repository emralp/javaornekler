package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Vardiya Saatleri: Vardiyalı çalışan, nöbet tutan kişilere (doktor, polis, şoför, işçi) ulaşmak zor olabiliyor.
         Uyku esnasında uyandırma endişesiyle aramaya çekinebiliyoruz. Öyle bir uygulama olsaydı ki kişi hangi saatlerde
          mesaide, hangi saatlerde uykuda olacağını belirtebilseydi de o saatlerde rahatsız etmeseydik.
         */

        //kullanıcıdan meslek al
        Scanner veriAl=new Scanner(System.in);
        System.out.println("Hangi mesleğin mesai saatlerini öğrenmek istiyorsunuz");
        meslekNo();
        int sayı=veriAl.nextInt();  // kullanıcıdan verialdı.
        mesleskSec(sayı);


    }

    public static void meslekNo(){
        System.out.println("1-Doktor \n" +
                "2-Polis \n"+
                "3-Öğretmen \n"+
                "4-eczacı");
    }

    public static void mesleskSec(int sayı){
        if(sayı==1){
            System.out.println("Doktorun mesai saaitleri 13.00-20.00 arasındadır.");
        }else if(sayı==2){
            System.out.println("Polisin mesai saaitleri 9.00-23.00 arasındadır.");
        }else if(sayı==3){
            System.out.println("Öğretmenin mesai saaitleri 10.00-17.00 arasındadır.");
        }else if(sayı==4){
            System.out.println("Eczacının mesai saaitleri 11.00-20.00 arasındadır.");
        }else {
            System.out.println("Girdiğiniz değer menüde yok");
            meslekNo();
        }
    }

}

