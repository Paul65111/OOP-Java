package com.company;

public class Main {

    public static void main(String[] args) {
        Pasari d= new Pasari();
        Animale.getNumara();
        Pasari e= new Pasari(1);
        Animale.getNumara();
        Mamifere f=new Mamifere();
        Animale.getNumara();
        //f.mananca();
        //d.mananca();
        d.setGreutate(9);
       // d.getGreutate();
    }
}
abstract class Animale{
    int greutate;
    int ID;
    final double pi=3.14;
    static int numara=0;
    Animale(int ID){
        this.ID=ID;
        numara=numara+1;

    }
    //public abstract void mananca();
    Animale(){
        ID=0;
        numara=numara+1;
    }
    public static void getNumara(){
        System.out.println(numara);
    }

    public void GetID() {
        System.out.println(ID);
    }

    public void  setGreutate(int greutate){
        this.greutate=greutate;
    }
    public void getGreutate(){
        System.out.println(greutate);
    }
}
class Pasari extends Animale{
    public void mananca() {
        System.out.println("pot manca doar iarba");
    }
    Pasari(int ID) {
        super(ID);
    }
    Pasari(){
        ID=0;
    }

    public void zboara(){
        System.out.println("poate sa zboare");
    }
}
class Mamifere extends Animale{
    public void mananca() {
        System.out.println("pot manca si iarba si carne");
    }
    public void umbla(){
        System.out.println("poate sa umble");
    }
}


