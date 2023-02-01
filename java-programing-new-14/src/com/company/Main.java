package com.company;

public class  Main  {

    public static void main(String[] args) {

        System.out.println("bilgisar muhendisi kısmı---------");


        IMuhendis pcMuhendisi1=new PcMuhendisi(false,false);
        pcMuhendisi1.askerlikdurumusorghula();
        pcMuhendisi1.adlisicil_sorgula();
        System.out.println(pcMuhendisi1.mezuniyet_ortalamasi(3.2));
        String[]tecrube={"vestel","havelsan"};
        pcMuhendisi1.is_tecrubesi(tecrube);
        System.out.println("------makine muhendisi kısmı----");
        MakineMuhendisi makinemuhendisi1=new MakineMuhendisi(true,false);
        String[]tecrube1={};
        String[]referans={"emre terzi","aysunur terzi"};
        makinemuhendisi1.adlisicil_sorgula();
        makinemuhendisi1.askerlikdurumusorghula();
        System.out.println(makinemuhendisi1.mezuniyet_ortalamasi(2.3));
        makinemuhendisi1.is_tecrubesi(tecrube1);
        makinemuhendisi1.referansgetir(referans);
        makinemuhendisi1.calisma();

//interface kullanrak kural koy ve bunu diğer classlar içinde metotları doldur
        //diğer classlardaki metotları override edeebilirsin veya başka bir metot da ekleyebilirsin


}
    }
