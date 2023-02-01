package com.company;
class hayvan{

    private String isim;

    public hayvan(String isim) {
        this.isim = isim;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){

        return"hayvan konuşuyor";

    }
}



class kedi extends hayvan{


    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor";


    }
}
class Kopek extends hayvan{


    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor";

    }
}

class at extends hayvan{

    public at(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor";

    }
}
















public class Main {


    public static void konustur(Object object){
        if (object instanceof Kopek){
            Kopek kopek=(Kopek) object;
            kopek.konus();






        }
        else if(object instanceof  kedi){
            kedi kedi=(kedi) object;
            System.out.println(kedi.konus());




        }
        else if (object instanceof at){
            at at=(at) object;
            System.out.println( at.konus());



        }
        else if(object instanceof hayvan){
            hayvan hayvan=(hayvan) object;
            System.out.println( hayvan.konus());





        }

        //System.out.println(hayvan.konus());









    } //polymorphism;


    public static void main(String[] args) {

       hayvan hayvan1=new kedi("tekir");
       hayvan hayvan2=new Kopek("karabaş");
       hayvan hayvan3=new at("kısrak");



        System.out.println(hayvan2.konus());
        System.out.println(hayvan1.konus());
        System.out.println(hayvan3.konus());


        Kopek kopek1=new Kopek("karabaşş");


        if (kopek1 instanceof hayvan){
            System.out.println("bu nesne hayvan sınıfından");





        }
        Kopek kopek2=new Kopek("karabaş1");
        kedi kedi1=new kedi("lionn");
        at at2=new at("şahbatur");
        hayvan hayvan4=new hayvan("hayvanavatn");
        konustur(kopek2);
        konustur(kedi1);
        konustur(at2);
        konustur(hayvan4);







       konustur(new kedi("tekir"));    //polymorphism;
       konustur(new at("kısrak"));     //polymorphism;
       konustur(new Kopek("karabaş")); //polymorphism;



    }
}
