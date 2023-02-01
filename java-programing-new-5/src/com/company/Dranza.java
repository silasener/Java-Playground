package com.company;

public class Dranza extends Beyblade

{private String kutsalCanavar;

    public Dranza(String kullanici, int donuzHizi, int saldirigücü, String kutsalCanavar) {
        super(kullanici, donuzHizi, saldirigücü);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getKullanici()+" " +kutsalCanavar+" ortaya çıkartıyot");
        System.out.println(getKullanici()+" in gizli saldirisi alev kılıcı");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println(" kutsal canavar adi"+kutsalCanavar);

    }
}
