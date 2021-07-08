package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Klavyeden girilen vize ve final notlarýnýna göre öðrencinin dersi geçip geçmediðini söyleyen bir uygulama yazýnýz.
        // (Geçme notu : 50, vizenin %40ý, finalin %60ýgeçerlidir.)
        Scanner veriAl = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vize = veriAl.nextInt();

        System.out.println("final notunuzu giriniz");
        int fnal= veriAl.nextInt();
        // yüzde alma (vize * 40) / 100      yüzdesini verir
        int ortalama = ((vize * 40) / 100) + ((fnal * 60) / 100);

        if(ortalama >= 50){
            System.out.println("geçtiniz");
        }else{
            System.out.println("geçemediniz");
        }

     }
}
