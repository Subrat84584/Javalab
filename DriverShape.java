import java.util.*;
abstract class Shape{
	float side1,side2;
	Scanner sc= new Scanner(System.in);
	Shape()
	{
		System.out.println("Constructor of Shape");
	}
	abstract void input();
	abstract void area();
	abstract void show();
	void display()
	{
		System.out.println("Follow the method");
	}
}
class Square extends Shape
{
	float result;
	void input()
	{
		System.out.println("Enter the side of Square");
		side1=sc.nextFloat();
	}
	void area()
	{
		result= side1*side1;
	}
	void show()
	{
		System.out.printlln("Area of Square is"+result);
	}
}
class Rectangle extends Shape
{
	float result;
	void input()
	{
		System.out.println("Enter the side of Rectangle");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		}
	void area()
	{
		result= side1*side2;
	}
	void show()
	{
		System.out.printlln("Area of Rectangle is"+result);
	}
}
class Circle extends Shape
{
	float result;
	void input()
	{
		System.out.println("Enter the radius of circle");
		side1=sc.nextFloat();
		}
	void area()
	{
		result= 3.14*(side1*side1);
	}
	void show()
	{
		System.out.printlln("Area of Circle is"+result);
	}
}
class DriverShape
{
	public static void main(String args[])
	{
		Shpae ob;
		System.out.println("Operations of Circle");
		ob= new Circle();
		ob.display();
		ob.input();
		ob.area();
		ob.show();
		System.out.println("Operations of Square");
		ob= new Square();
		ob.display();
		ob.input();
		ob.area();
		ob.show();
		System.out.println("Operations of Rectangle");
		ob= new Rectangle();
		ob.display();
		ob.input();
		ob.area();
		ob.show();
	}
}
		