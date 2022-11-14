package com.company;

class Main {

    public static void main(String[] args) {

        Passenger p1=new Boeing(1);
        p1.setMaxPassagers(100);
        p1.getEngine(244);
        System.out.println("Plane ID:"+p1.getPlaneID());
        System.out.println("max passagers="+p1.getMaxPassagers());

        Concorde p2=new Concorde();
        p2.setMaxPassagers(150);
        System.out.println("Plane ID:"+p2.getPlaneID());
        System.out.println("max passagers="+p2.getMaxPassagers());
        p2.goSuperSonic();
        p2.goSubSonic();

        MIG p3=new MIG();
        p3.getEngine(655);
        p3.launchMissile();
        p3.highSpeedGeometry();
        p3.normalGeometry();

        TomCat p4=new TomCat();
        p4.refuel();
        p4.launchMissile();
        p4.getEngine(456);
        //p1.info();
        ///p2.info();
        //p3.info();
        //p4.info();
    }
}
public abstract class Planes {
    protected int planeID;
    protected static int planeIDincrement;
    protected int engine;
    Planes(int planeID){
        this.planeID=planeID;
        planeIDincrement=planeID;
    }

    Planes(){
        planeIDincrement++;
    }
    public void getEngine(int engine){
        this.engine=engine;
    }
    public int getPlaneID(){
        return planeIDincrement;
    }
    public int getTotalEnginePower(){
        return engine;
    }
    public void info(){
        this.fly();
        System.out.print(getTotalEnginePower()+" ");
        this.land();
        this.takeOff();
        System.out.println();
    }
    public void takeOff(){
        System.out.print("takeoff ");
    }
    public void land(){
        System.out.print("land ");
    }
    public void fly(){
        System.out.print("fly ");
    }
}
 abstract class Passenger extends Planes{
    int maxPassagers;
    public void setMaxPassagers(int maxPassagers){
        this.maxPassagers=maxPassagers;
    }
    public int getMaxPassagers(){
        return maxPassagers;
    }
    Passenger(int planeID) {
        super(planeID);
    }
    Passenger(){
        super();
    }
}
class Boeing extends Passenger{
    Boeing(int planeID){
        super(planeID);
    }
    Boeing() {
        super();
    }
}
class Concorde extends Passenger{
    public void goSuperSonic(){
        System.out.println("plane ID:"+planeIDincrement);
        System.out.println("supersonic mode activated");
    }
    public void goSubSonic(){
        System.out.println("plane ID:"+planeIDincrement);
        System.out.println("supersonic mode deactivated");
    }
    Concorde(int planeID){
        super(planeID);
    }
    Concorde() {
        super();
    }
}
abstract class Fighter extends Planes{
    Fighter(int planeID){
        super(planeID);
    }
    Fighter(){
        super();
    }
    public void launchMissile(){
        System.out.println("plane ID:"+planeIDincrement);
        System.out.println("Launch rocket");
    }
}
class MIG extends Fighter{
    MIG(int planeID){
        super(planeID);
    }
    MIG(){
        super();
    }
    public void highSpeedGeometry(){
        System.out.println("plane ID:"+planeIDincrement);
        System.out.println("High speed selected geometry");
    }
    public void normalGeometry(){
        System.out.println("plane ID:"+planeIDincrement);
        System.out.println("Normal selected geometry");
    }
}
class TomCat extends Fighter{
    TomCat(int planeID){
        super(planeID);
    }
    TomCat() {
        super();
    }
    public void refuel(){
        System.out.println("plane ID:"+planeIDincrement);
        System.out.println("TomCat-Refuelling");
    }
}
