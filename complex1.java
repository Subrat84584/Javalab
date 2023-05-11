import java.util.*;
class complex1
{
     int real,img;
	 void input()
	 {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the real value");
			real=sc.nextInt();
			System.out.println("enter the img");
			img=sc.nextInt();
	 }
	 complex1 add(complex1 s)
	 {
	       complex1 temp=new complex1();
		   temp.real=real+s.real;
		   temp.img=img+s.img;
		   return  temp;
	 }
	 public static void main(String args[])
	 {
	      complex1 c1=new complex1();
		  complex1 c2=new complex1();
		  complex1 c3=new complex1();
		  c1.input();
		  System.out.println("now you can see the second object");
		  c2.input();
          c3=c1.add(c2);
		  System.out.println("after addition ="+c3.real+"+i"+c3.img);
        		  
	 }
}