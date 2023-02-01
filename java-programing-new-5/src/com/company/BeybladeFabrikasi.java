package com.company;

public class BeybladeFabrikasi {

public Beyblade beybladeüret(String beyblade_turu){


if (beyblade_turu.equals("Dragon")){
    return new Dragon("Takao",800,300,"mavi ejderha","Kutsal canavrla konuşma");



}
else if (beyblade_turu.equals("Dranza")){


    return new Dranza("Kai",600,400,"kırmızı anka kuşu");

}
else if (beyblade_turu.equals("Dragya")){


    return new Dranza("Rei",600,400,"beyaz kaplan");

}
else if (beyblade_turu.equals("Draciel")){


    return new Dranza("Max",500,300,"kırmızı anka kuşu");

}
else {
    return null;

}







    }
}


