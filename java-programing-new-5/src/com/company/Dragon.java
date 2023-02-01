package com.company;

public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliyetenek;

    public Dragon(String kullanici, int donuzHizi, int saldirigücü, String kutsalCanavar, String gizliyetenek) {
        super(kullanici, donuzHizi, saldirigücü);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {

        System.out.println(getKullanici()+"" +kutsalCanavar+"ortaya çıkartıyot");
        System.out.println(getKullanici()+"in gizli saldirisi hayalet kasırgası");

    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("kutsal canavar adi"+kutsalCanavar);
        System.out.println("gizli yetenek"+gizliyetenek);
    }
}
