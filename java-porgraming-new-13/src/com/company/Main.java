package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void listeyi_bastir(LinkedList<String>gidilecek_yerler){

        for (String s:gidilecek_yerler
             ) {
            System.out.println(s);

        }


    }
    public static void listeyibastir2(LinkedList<String>gidilecekyerler){

        ListIterator<String>iterator1= gidilecekyerler.listIterator();

while(iterator1.hasNext())   {

    System.out.println(iterator1.next());//iterator1 ilerieterek yazdır (next)
}//iteraterin gösterdiği bir obje varsa yazdırmaya devam et (has next)




    }


public static void sirali_ekle(LinkedList<String>gidilecekyerler,String yeni){

    ListIterator<String>iterator2= gidilecekyerler.listIterator();
    int karsilastir=iterator2.next().compareTo(yeni);//baş harflarıne göre sıralayarak ata


    if (karsilastir==0){
        System.out.println("listenizde bu eleman var");
        return;

    }
else if (karsilastir<0){
    //yeni değer itaretor.nexten daha büyük; ilerlemeye devam ediyrouz



    }
else if (karsilastir>0){

    iterator2.previous();
    iterator2.add(yeni);
    return;
    }


}
















    public static void main(String[] args) {
        ArrayList<String>diller=new ArrayList<String>();
        diller.add("java");
        diller.add("c++");
        diller.add("c^");

        for (String s:diller
             ) {
            System.out.println(s);

       }//


        LinkedList<String>gidilecek_yerler=new LinkedList<String>();

                 gidilecek_yerler.add("postane");
                 gidilecek_yerler.add("okul");
                 gidilecek_yerler.add("hastane");
                 gidilecek_yerler.add("spor salonu");
                 gidilecek_yerler.add("ev");
                 listeyi_bastir(gidilecek_yerler);
        System.out.println("----interator1 ile yazdirilmasi----");
                 listeyibastir2(gidilecek_yerler);

        System.out.println("---------4.indekse alışveriş merkezi atama--------------------");
       gidilecek_yerler.add(4,"alışveriş merkezi");//4. idekse alışveriş merkezi ata
       listeyi_bastir(gidilecek_yerler);
        System.out.println("------------2.indeksi kaldırma--------------------");
       gidilecek_yerler.remove(2);//2.indeksi sil
        listeyibastir2(gidilecek_yerler);
        System.out.println("----- araba market at alfabatik sıralı ekleme işlemi------");
        sirali_ekle(gidilecek_yerler,"market");
        sirali_ekle(gidilecek_yerler,"araba");
        listeyi_bastir(gidilecek_yerler);












    }
}
