package com.company;

public class Beyblade {
private String kullanici;
private int donuzHizi;
private int saldirigücü;

    public Beyblade(String kullanici, int donuzHizi, int saldirigücü) {
        this.kullanici = kullanici;
        this.donuzHizi = donuzHizi;
        this.saldirigücü = saldirigücü;
    }

    public void saldir(){
        System.out.println(kullanici+" "+saldirigücü+"ve"+donuzHizi+"ile saldiiryor");
    }
    public void kutsalCanavarOrtayaCıkar(){
        System.out.println("bu beybladein kutsal canavari bulunmuyor");

    }
public void bilgilerigoster(){
    System.out.println("beybladeçi ismi"+kullanici);
    System.out.println("saldiri gücü"+saldirigücü);
    System.out.println("dönüş hızımız"+donuzHizi);





}

















    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public int getDonuzHizi() {
        return donuzHizi;
    }

    public void setDonuzHizi(int donuzHizi) {
        this.donuzHizi = donuzHizi;
    }

    public int getSaldirigücü() {
        return saldirigücü;
    }

    public void setSaldirigücü(int saldirigücü) {
        this.saldirigücü = saldirigücü;
    }
}
