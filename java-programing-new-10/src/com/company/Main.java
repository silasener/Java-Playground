package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static  void yazdir(ArrayList<String>a){

        for (int i=0;i<a.size();i++){

            System.out.println(a.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<String>arrayList1=new ArrayList<String>();

        arrayList1.add("metalica");//arrayliste ekleme
        arrayList1.add("guns");
        arrayList1.add("black");
        arrayList1.add("iron");
        arrayList1.add("maiden");
        arrayList1.remove("metalica");//arraylistten kaldir
        System.out.println(arrayList1.get(0));//istediğimiz indeksi yazdırmak;
        System.out.println(arrayList1.get(1));
        System.out.println(arrayList1.get(2));
        arrayList1.set(3,"megadeth");//3.indeksi megadeth yaptık;

        System.out.println(arrayList1.size());//array listin uzunluğunu yazdırmak
        System.out.println(arrayList1.indexOf("guns"));// gunsun kaçıncı indekse olduğunu bulmak;

        for(int i=0;i<arrayList1.size();i++){

            System.out.println(arrayList1.get(i));
        }//arraylisti yazdırmak;


yazdir(arrayList1);

    }
}
