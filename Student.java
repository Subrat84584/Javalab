import java.util.*;
class Student
{
	String name;
	int roll_no;
	int arr[]=new int[4];
	int i;
	Scanner sc=new Scanner(System.in);
	void setData()
	{
		System.out.println("Enter the student name :");
		name=sc.next();
		System.out.println("Enter the student roll number");
		roll_no=sc.nextInt();
		System.out.println("Enter the four subject of the student: ");
		for(i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	void calculate()
	{
		float avg;
		int sum=0;
		for(i=0;i<4;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/4;
		if(avg>=90 && avg<=100)
		{
			System.out.println("grade:"+'o');
		}
		if(avg>=)
	}
	void Display()
	{
		System.out.println("All the information of Student with foue subject");
		System.out.println("--------------------------------------------------");
		System.out.println("name of the student:"+name);
		System.out.println("roll number of the student:"+roll_no);
		System.out.println("four subject marks");
		for(i=0;i<4;i++)
		{
			System.out.println("marks:"+arr[i]);
		}
	}
	public static void main(String args[])
	{
		int i;
		Student ob[]=new Student[5];
		for(i=0;i<5;i++)
		{
			ob[i]=new Student();  //memory allocate
		}
		System.out.println("now you insert the data");
		for(i=0;i<5;i++)
		{
			ob[i].setData();
		}
		System.out.println("now you can see the student details");
		for(i=0;i<5;i++)
		{
			ob[i].Display();
		}
	}
}