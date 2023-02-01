package com.company;

public class Test {



    public static void main(String[] args) {


Resolution resolution1=new Resolution(10,10);
Monitor monitor1=new Monitor("340t","Asus","23 inc",resolution1);
Anakart anakart1=new Anakart("250t","asus",15,"mac");
Kasa kasa1=new Kasa("341t","acer","aliminyum");
Bilgisayar bilgisayar1=new Bilgisayar(monitor1,kasa1,anakart1);


bilgisayar1.getKasa().bilgisayariac();
bilgisayar1.getMonitor().monitorukapat();
bilgisayar1.getAnakart().isletim_sistemi_yukle("windows");

    }


}
