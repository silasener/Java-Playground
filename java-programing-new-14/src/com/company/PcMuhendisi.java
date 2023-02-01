package com.company;

public class PcMuhendisi implements IMuhendis {

    private boolean askerlik;
    private  boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
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
        return "ortalamam"+derece;

    }

    @Override
    public void adlisicil_sorgula() {
        if (adli_sicil){
            System.out.println("adli sicil kaydım bulunuyor");
        }
        else
        {
            System.out.println("herhangi bir adli sicil  kaydım bulıunmuyor");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("bilgisayar mühendisi olarak şu şirketlerde çalıştım");
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}
