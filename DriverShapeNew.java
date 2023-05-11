import java.util.*;
interface Shape
{
	float side1=10;
	float side2=20;
	 void area();
	 void show();
	 }
class Square implements Shape
{
	float result;
	/*public void input()
	{
		System.out.println("Enter the side of Square");
		side=sc.nextFloat();
	}*/
	public void area()
	{
		result= side1*side1;
	}
	public void show()
	{
		System.out.println("Area of Square is"+result);
	}
}
class Rectangle implements Shape
{
	float result;
	/*public void input()
	{
		System.out.println("Enter the side of Rectangle");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		}*/
	public void area()
	{
		result= side1*side2;
	}
	public void show()
	{
		System.out.println("Area of Rectangle is"+result);
	}
}
class Circle implements Shape
{
	float result;
	/*public void input()
	{
		System.out.println("Enter the side1ius of circle");
		side1=sc.nextFloat();
		}*/
	public void area()
	{
		result= 3.14f*(side1*side1);
	}
	public void show()
	{
		System.out.println("Area of Circle is"+result);
	}
}
class DriverShapeNew
{
	public static void main(String args[])
	{
		Shape ob;
		System.out.println("Operations of Circle");
		ob= new Circle();
		ob.area();
		ob.show();
		System.out.println("Operations of Square");
		ob= new Square();
		ob.area();
		ob.show();
		System.out.println("Operations of Rectangle");
		ob= new Rectangle();
		ob.area();
		ob.show();
	}
}
		