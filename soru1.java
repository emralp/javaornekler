package com.company;

import java.util.Arrays;   // Arrays paketimi import etti.

public class Main {
    public static void main(String[] args) {

        // 100 elemanlý bir dizi oluþturun ve bu dizinin tüm elemanlarýný rastgele olacak þekilde üretin.
        // Bu iþlemden sonra dizideki elemanlarýn ortalamasýný hesaplayarak bu ortalamanýn altýnda kaçtane eleman olduðunu yazdýrýn.

        int sayýlar[]=new int[100];

        for(int i=0 ; i  < sayýlar.length; i++){  //rastgele eleman atayacak kýsým.
            int rastgelesatý= (int)(Math.random()*101);
            sayýlar[i] = rastgelesatý;
        }

        ortalamBul(sayýlar);

    }


    public static void ortalamBul(int dizi[]){

        int elemanToplam=0;
        for(int i =0 ; i < dizi.length; i++){
            elemanToplam=elemanToplam + dizi[i];
        }
        int ortalama= elemanToplam/100;

        System.out.println("Elemanlarýn toplamý þu kadar : "+ elemanToplam);
        System.out.println("Elemanlarýn toplam ortalamasý : "+ ortalama);
        int ortalamaltý=0;
        for(int i=0; i < dizi.length; i++){
            if(ortalama<dizi[i]){
                ortalamaltý= ortalamaltý+1;
            }
        }
        System.out.println("ortalama altý eleman sayýsýda : " + ortalamaltý);

    }
}


