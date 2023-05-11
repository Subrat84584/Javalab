import java.util.*;
class EmployeeG
{
 String name;
 int age;
 Float basic,Gross;
 void input()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the name");
	 name=sc.nextLine();
	 System.out.println("enter the age");
	 age=sc.nextInt();
	 System.out.println("enter basic salary");
	 basic=sc.nextFloat();
 }
 void calculate()
 {
	 Gross=basic+(basic*0.15f)+(basic*0.2f)-(basic*0.05f);
 }
 void show()
 {
	 System.out.println("Name:"+name);
	 System.out.println("Age:"+age);
	 System.out.println("Gross:"+gross);
 }
 public static void main(String args[])
 {
	 Employee ob=new Employee();
	 ob.input();
	 ob.calculate();
	 ob.show();
 }
}