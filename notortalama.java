package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Klavyeden girilen vize ve final notlar�n�na g�re ��rencinin dersi ge�ip ge�medi�ini s�yleyen bir uygulama yaz�n�z.
        // (Ge�me notu : 50, vizenin %40�, finalin %60�ge�erlidir.)
        Scanner veriAl = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vize = veriAl.nextInt();

        System.out.println("final notunuzu giriniz");
        int fnal= veriAl.nextInt();
        // y�zde alma (vize * 40) / 100      y�zdesini verir
        int ortalama = ((vize * 40) / 100) + ((fnal * 60) / 100);

        if(ortalama >= 50){
            System.out.println("ge�tiniz");
        }else{
            System.out.println("ge�emediniz");
        }

     }
}
