package com.company;

import java.util.Scanner;

public class Main {

    public static void arrayi_bastir(int[] array){

        for(int i=0;i<array.length;i++)
            System.out.println(i+"indeks "+array[i]);




    }
    public static double ortalama_bul(int[]array){
        int toplam=0;
        for(int i=0;i<array.length;i++)

        {
            toplam+=array[i];


        }
return ((double) toplam/array.length);


    }

    public static void main(String[] args) {





       int []b={1,2,3,4,5};
        arrayi_bastir(b);
        System.out.println("indekslerin ortalamsı="+ortalama_bul(b));














    }
}
