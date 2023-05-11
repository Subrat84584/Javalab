import java.util.*;
class Base
{
	int no1;
	Base(int value1)
	{
		no1=value1;
	}
}
class Derived1 extends Base
{
	int no2;
	Derived1(int value1,int value2)
	{
		super(value2);
		no2=value1;
	}
}
 class Derived2 extends Derived1
 {
	 int no3;
	 Derived2(int value1,int value2,int value3)
	 {
		 super(value2,value3);
		 no3=value1;
	 }
	 void show()
	 {
		 System.out.println("no1= "+no1);
		 System.out.println("no2= "+no2);
		 System.out.println("no3= "+no3);
	 }
 }
 class DriverSuper
 {
	 public static void main(String args[])
	 {
		 Derived2 ob= new Derived2(10,20,30);
		 ob.show();
	 }
 }
 