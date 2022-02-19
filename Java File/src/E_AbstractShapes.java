// import java.util.*;
abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
    public void numberOfSides(){
        System.out.println("4 sides");
    }
}
class Triangle extends Shape
{
    public void numberOfSides(){
        System.out.println("3 sides");
    }
}
class Hexagon extends Shape
{
    public void numberOfSides(){
        System.out.println("6 sides");
    }
}
class E_AbstractShapes
{
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        Triangle obj2=new Triangle();
        Hexagon obj3=new Hexagon();

        obj1.numberOfSides();
        obj2.numberOfSides();
        obj3.numberOfSides();
    }
}