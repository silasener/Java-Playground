package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("beyblade programına hoşgeldiniz");
        System.out.println("çıkış için q ya basın");
        Scanner  scanner=new Scanner(System.in);

while(true){
    System.out.println("hangi beyblade istiyorsunuz");

    String islem=scanner.nextLine();
    if (islem.equals("q")){

        System.out.println("programdan çikilıyor");
        break;
    }

    else{
        BeybladeFabrikasi fabrika1=new BeybladeFabrikasi();
        Beyblade beyblade1=fabrika1.beybladeüret(islem);
        if (beyblade1==null){

            System.out.println("lütfen geçerli bir beyblade ismi giriniz");

        }
        else{ beyblade1.bilgilerigoster();
            beyblade1.saldir();
            beyblade1.kutsalCanavarOrtayaCıkar();




        }
    }

}





    }
}
