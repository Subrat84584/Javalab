import java.util.*;
class Base
{
      int no1;
	  Base(int value1)
	  {
	  no1=value1;
	  }
}
class derived1 extends Base
{
	 int no2;
	 derived1(int value1,int value2)
	 {
		 super(value2);
		 no2=value1;
	 }
	 void show()
	 {
		 System.out.println("no1="+no1);
		 System.out.println("no2="+no2);
	 }
}
class derived2 extends Base
{
	int no3;
	derived2(int value1,int value2)
	{
		super(value2);
		no3=value1;
	}
	void display()
	{
		System.out.println("no="+no1);
		System.out.println("no2"+no3);
	}
}
class Driversuper2
{
	public static void main(String args[])
	{
		derived2 ob = new derived2(20,10);
		derived1 ob2 = new derived1(30,10);
        ob.display();
		ob2.show();
		
	}
}