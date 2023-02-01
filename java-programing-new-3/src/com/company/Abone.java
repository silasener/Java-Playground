package com.company;

public class Abone {
    public String isim;
    public  int bakiye;
    public String sehir;


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
