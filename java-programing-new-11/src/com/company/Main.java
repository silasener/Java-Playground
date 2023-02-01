package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<String>();
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        //  ilkel int yerine Integer yazılır Integer sınıfının özellikleri alınır.
        for (int i=0;i<10;i++){
            arrayList2.add(Integer.valueOf(i*4));//outuboxing ilkel inti valuof ile Integer sınıfına aldık




        }
    }
}
