package com.company;

import org.w3c.dom.ls.LSOutput;

public class MakineMuhendisi implements IMuhendis,ICalisma {
    @Override
    public void calisma() {
        System.out.println("makine mühendisi çalışıyor");

    }

    private boolean askerlik;
    private boolean adlisicil;

    public MakineMuhendisi(boolean askerlik, boolean adlisicil) {
        this.askerlik = askerlik;
        this.adlisicil = adlisicil;
    }

    @Override
    public void askerlikdurumusorghula() {
        if (askerlik){
            System.out.println("askerliğimi yaptım");
        }
        else{
            System.out.println("askerliğimi henüz yapmadım");
        }


    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
         return "oralamam" +derece;

    }

    @Override
    public void adlisicil_sorgula() {
        if (adlisicil){
            System.out.println("adli sicil kaydım bulunuyor");
        }
        else
        {
            System.out.println("herhangi bir adli sicil  kaydım bulıunmuyor");
        }

    }

    public void referansgetir(String[] array1){
        if (array1.length==0){
            System.out.println("herhangi bir referanslarım bulunmuyır");
        }
        else{
            System.out.println("referanslarım");

            for (int i=0;i<array1.length;i++){
                System.out.println(array1[i]);
            }

        }
    }






    public void is_tecrubesi(String[] array) {
        if (array.length==0){
            System.out.println("herhangi bir iş tecrübem bulunmuyır");
        }
        else{
            System.out.println("makine mühendisi olarak şu şirketlerde çalıştım");
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }

        }
    }
}
