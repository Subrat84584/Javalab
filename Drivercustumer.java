import java.util.*;
class Bank
{
	int accno;
	String name;
	float bal;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("enter the accoutn number");
		accno=sc.nextInt();
		System.out.println("enter the name of the costumers");
		name=sc.next();
		System.out.println("enter the balanace of the custumer");
	    bal=sc.nextFloat();
	}
}
class custumer extends Bank
{
	  float amount;
	  void deposite()
	  {
		  System.out.println("enter the ammout of the deposite");
		  amount=sc.nextInt();
		  bal=amount+bal;
	  }
	  void withdraw()
	  {
		  System.out.println("enter the ammout of deposite");
		  amount=sc.nextInt();
		  bal=bal-amount;
	  }
	  void show()
	  {
		  System.out.println("name="+name);
		  System.out.println("accno="+accno);
		  System.out.println("balance="+bal);
	  }
}
class Drivercustumer
{
	  public static void main(String args[])
	  {
		  custumer ob =new custumer();
		  ob.input();
		  System.out.println("Before deposite");
		  System.out.println("---------------------");
		  ob.show();
		  ob.deposite();
		  System.out.println("After deposite");
		  System.out.println("----------------------");
		  ob.show();
		  System.out.println("After withdraw");
		  ob.withdraw();
		  ob.show();
	  }
}