package com.company;

public class GelismisAbone {
    private String isim;
    private int bakiye=120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye>0 && bakiye<120){


            this.bakiye = bakiye;

        }

        this.sehir = sehir;
    }
    public void dogalgazKullan(int miktar){
        if (this.bakiye-miktar<0){

            System.out.println("Yetersiz bakiye");

        }
        else{

            this.bakiye-=miktar;
            if (this.bakiye<=0){


                System.out.println("bakiyeniz bitmiştir yeni bakiye yükleyiniz(max120 tl)");
            }
            else{
                System.out.println("yeni bakiye= "+bakiye);
            }


        }
    }
    public void bakiye_ogren(){
        System.out.println("bakiye="+bakiye);






    }



}
