import java.util.*;
abstract class Shape
{
  float side1,side2;
  Scanner sc=new Scanner(System.in);
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
		System.out.println("enter the sides of the square");
		side1=sc.nextInt();
	}
	void area()
	{
		result=side1*side1;
	}
	void show()
	{
		System.out.println("Area of the square is "+result);
	}
}
class Rectangle extends Shape
{
	float result;
	void input()
	{
		System.out.println("enter the value of the two sides");
		side1=sc.nextInt();
		side2=sc.nextInt();
	}
	void area()
	{
		System.out.println("now you can see the area of the rectanglr");
		result=side1*side2;
	}
	void show()
	{
		System.out.println("Area of the rectangle is:"+result);
	}
}
class Circle extends Shape
{
	float result;
	int r;
	float pi=3.14f
	void input()
	{
		System.out.println("enter the radius");
		r=sc.nextInt();
	}
	void area()
	{
		System.out.println("now you can see the area of the circle");
		result=pi*r*r;
	}
	void show()
	{
		System.out.println("Area of the circle is :"+result);
		
	}
	
}
class Mydrivershape
{
	public static void main(String args[])
	{
	Shape ob;   //instance of the class
	System.out.println("Operation of the circle");
	System.out.println("-----------------------------");
	ob=new Circle();
	ob.display)();
	ob.input();
	ob.area;
	ob.show();
	System.out.println("operaton of the square");
	System.out.println("-------------------------------");
	ob=new Square();
	ob.input();
	ob.area();
	ob.show();
	System.out.println("Operation of the Rectangle");
	ob=new Rectangle();
	ob.input();
	ob.area();
	ob.show();
}
	
}