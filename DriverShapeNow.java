import java.util.*;
abstract class Shape{
	float dimOne,dimTwo;
	int s,a,b,c;
	Scanner sc= new Scanner(System.in);
	abstract void input();
	abstract void computearea();
	abstract void show();
}
class Rectangle extends Shape
{
	float result;
	void input()
	{
		System.out.println("Enter the dimensions of Rectangle");
		dimOne=sc.nextFloat();
		dimTwo=sc.nextFloat();
		}
	void computearea()
	{
		result= dimOne*dimTwo;
	}
	void show()
	{
		System.out.println("Area of Rectangle is"+result);
	}
}
class Triangle extends Shape
{
	float result;
	void input()
	{
		System.out.println("Enter the dimensions of a Triangle");
		side1=sc.nextFloat();
		}
	void computearea()
	{
		result= ;
	}
	void show()
	{
		System.out.println("Area of Circle is"+result);
	}
}
class DriverShapeNow
{
	public static void main(String args[])
	{
		Shpae ob;
		System.out.println("Operations of Triangle");
		ob= new Square();
		ob.input();
		ob.computearea();
		ob.show();
		System.out.println("Operations of Rectangle");
		ob= new Rectangle();
		ob.input();
		ob.computearea();
		ob.show();
	}
}
		