package Constructors;


class Circle{
    double radius;

    Circle(){
        this(0);
    }

    Circle(double radius){
        this.radius=radius;

    }
}
public class CircleClass {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Circle circle2=new Circle(10);
        System.out.println(circle.radius);
        System.out.println(circle2.radius);
    }
}
