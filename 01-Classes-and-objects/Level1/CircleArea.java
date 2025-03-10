package Level1;
public class CircleArea {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius=15;
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}
class Circle{
    double radius;

    void calculateArea(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle: "+area);
    }
    void calculatePerimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of circle: "+perimeter);
    }
}
