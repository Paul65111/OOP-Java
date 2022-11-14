package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dati numarul de studenti:");
        Algebra a=new Algebra("Popescu","Mihai",sc.nextInt());
        Algebra b=new Algebra("Costea","Angela");
        a.setVarsta(52);
        a.afisareInfo();
        System.out.println();
        b.setVarsta(47);
        b.afisareInfo();
        System.out.println();
        Analiza c=new Analiza("Ionescu","Adrian",17);
        Analiza d=new Analiza("Cristea","Florina");
        c.setVarsta(33);
        c.afisareInfo();
        System.out.println();
        d.setVarsta(183);
        d.afisareInfo();
    }
}
abstract class Profesor{
    protected String nume;
    protected String prenume;
    protected int varsta;
    abstract public void setVarsta(int varsta);
    public void afisareInfo(){
        System.out.println("nume:"+nume);
        System.out.println("prenume:"+ prenume);
        System.out.println("varsta:"+varsta);
    }
}
abstract class profMatematica extends Profesor{


}
abstract class profFizica extends Profesor{

}
class Algebra extends profMatematica{
    protected int nrstudAlgebra;
    public Algebra(String nume,String prenume){
        this.nume=nume;
        this.prenume=prenume;
    }
    public Algebra(String nume,String prenume,int nrstudAlgebra){
        this.nume=nume;
        this.prenume=prenume;
        this.nrstudAlgebra=nrstudAlgebra;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public void afisareInfo(){
        System.out.println("nume:"+nume);
        System.out.println("prenume:"+ prenume);
        System.out.println("varsta:"+varsta);
        System.out.println("numar studenti:"+nrstudAlgebra);
    }
}
class Analiza extends profMatematica{
    protected int nrstudAnaliza;
    public Analiza(String nume,String prenume){
        this.nume=nume;
        this.prenume=prenume;
    }
    public Analiza(String nume,String prenume,int nrstudAnaliza){
        this.nume=nume;
        this.prenume=prenume;
        this.nrstudAnaliza=nrstudAnaliza;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public void afisareInfo(){
        System.out.println("nume:"+nume);
        System.out.println("prenume:"+ prenume);
        System.out.println("varsta:"+varsta);
        System.out.println("numar student:"+nrstudAnaliza);
    }
}

