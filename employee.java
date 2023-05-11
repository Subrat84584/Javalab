import java.util.*;
class Employee
{
 String name;
 int id;
 Float basic,Gross;
 void input()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the name");
	 name=sc.nextLine();
	 System.out.println("enter the id");
	 id=sc.nextInt();
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
	 System.out.println("id:"+id);
	 System.out.println("Gross:"+Gross);
 }
 public static void main(String args[])
 {
	 int i;
	 Employee ob[]=new Employee[4];
	 for(i=0;i<4;i++)
	 {
		 ob[i]=new Employee();
	 }
	 for(i=0;i<4;i++)
	 {
		 ob[i].input();
	 }
	 for(i=0;i<4;i++)
	 {
		 ob[i].calculate();
	 }
	 System.out.println("Now you can see the details and gross salary");
	 System.out.println("----------------------------------------------");
	 for(i=0;i<4;i++)
	 {
		 ob[i].show();
		 System.out.println("\n");
	 }
 }
}