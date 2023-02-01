package com.company;

public class Main {

    public static void main(String[] args) {

        String[] array1={"elma","armut","kiraz"};
        for (String a:array1){

            System.out.println(a);
        }

        Deneme[] array2={new Deneme("emre"),new Deneme("aysu"),new Deneme("neriman")};
        for (Deneme b:array2){
            b.yaz();

        }


    }
}
