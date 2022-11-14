package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        c.setRadius(3.5);
        c.setColor("red");
        s.setSide(4.2);
        s.setColor("blue");
        System.out.println(c.ComputePerimeter());
        System.out.println(s.ComputePerimeter());
        System.out.println(c.color);
    }
}
abstract class Figure{
    protected String color;
    public void setColor(String color){
        this.color=color;
    }
    public abstract double ComputePerimeter();

}
class Circle extends Figure{
    double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double ComputePerimeter(){
        return 3.14*radius*2;
    }
}
class Square extends Figure{
    double side;
    public void setSide(double side){
        this.side=side;
    }
    public double ComputePerimeter(){
        return 4*side;
    }
}
//class Triangle extends Figure{

//}
