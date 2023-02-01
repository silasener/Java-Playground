package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int []arrayi_doldur(int sayi){
        Scanner scanner1=new Scanner(System.in);
        int[]çikti=new int[sayi];


        for (int i=0;i<sayi;i++){


            çikti[i]=scanner1.nextInt();

        }
return çikti;








    }
    public static void arrayi_bastir(int []array){
        for (int i=0;i<array.length;i++){

            System.out.println(i+". endeks"+array[i]);

        }




    }

    public static void main(String[] args) {
        //int[]a=arrayi_doldur(5);


        int[]a1={1,2,3,4,5,6};
        int[]a2={1,2,3,4,5,6};
        if (Arrays.equals(a1 , a2)){
            System.out.println("birbirlrinr eşit");


        }
        else
            System.out.println("eşit değiller");








    }
    public static void array_sort(int[] array){
        Arrays.sort(array);
        System.out.println("arrayimizin küçükten büyüğe sıralanışı");
        arrayi_bastir(array);

    }
}
