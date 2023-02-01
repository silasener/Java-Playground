package com.company;

public class Draciel extends Beyblade {
    public String kutsalCanavar;

    public Draciel(String kullanici, int donuzHizi, int saldirigücü, String kutsalCanavar) {
        super(kullanici, donuzHizi, saldirigücü);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getKullanici()+" " +kutsalCanavar+"ortaya çıkartıyot");
        System.out.println(getKullanici()+" in gizli saldirisi kale savunmasi");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println(" kutsal canavar adi "+kutsalCanavar);
    }
}
