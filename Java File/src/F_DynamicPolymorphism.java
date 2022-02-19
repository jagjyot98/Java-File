// import java.util.*;
class circle
{
	public void draw()
	{
		System.out.println("circle");
	}
}
class rect extends circle
{
	public void draw()
	{
		System.out.println("rectangle");
	}
}

public class F_DynamicPolymorphism {
    public static void main(String args [])
	{
		circle obj1=new circle();
		circle obj2=new rect();

        obj1.draw();
		obj2.draw();
    }
}
