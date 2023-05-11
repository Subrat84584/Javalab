import java.util.*;
class complex
{
     int real,img;
	 complex input()
	 {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the real value");
			real=sc.nextInt();
			System.out.println("enter the img");
			img=sc.nextInt();
	 }
	 complex calculate(complex s1,complex s2)
	 {
		 complex temp;
		 temp.real=s1.real+s2.real;
		 temp.img=s2.img+s2.img;
		 return temp;
	 }
	 void show()
	 {
		 System.out.println("after addition="+c3.real+"+"+c3.img+"i");
	 }
	 public static void main(String args[])
	 {
	      complex c1=new complex();
		  complex c2=new complex();
		  complex c3=new complex(c1,c2);
		  c3.show();
     }
}