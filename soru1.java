package com.company;

import java.util.Arrays;   // Arrays paketimi import etti.

public class Main {
    public static void main(String[] args) {

        // 100 elemanl� bir dizi olu�turun ve bu dizinin t�m elemanlar�n� rastgele olacak �ekilde �retin.
        // Bu i�lemden sonra dizideki elemanlar�n ortalamas�n� hesaplayarak bu ortalaman�n alt�nda ka�tane eleman oldu�unu yazd�r�n.

        int say�lar[]=new int[100];

        for(int i=0 ; i  < say�lar.length; i++){  //rastgele eleman atayacak k�s�m.
            int rastgelesat�= (int)(Math.random()*101);
            say�lar[i] = rastgelesat�;
        }

        ortalamBul(say�lar);

    }


    public static void ortalamBul(int dizi[]){

        int elemanToplam=0;
        for(int i =0 ; i < dizi.length; i++){
            elemanToplam=elemanToplam + dizi[i];
        }
        int ortalama= elemanToplam/100;

        System.out.println("Elemanlar�n toplam� �u kadar : "+ elemanToplam);
        System.out.println("Elemanlar�n toplam ortalamas� : "+ ortalama);
        int ortalamalt�=0;
        for(int i=0; i < dizi.length; i++){
            if(ortalama<dizi[i]){
                ortalamalt�= ortalamalt�+1;
            }
        }
        System.out.println("ortalama alt� eleman say�s�da : " + ortalamalt�);

    }
}


