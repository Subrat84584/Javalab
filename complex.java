import java.util.*;
class complex
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
	 void add(complex s1,complex s2)
	 {
		   real=s1.real+s2.real;
		   img=s1.img+s2.img;
		   System.out.println("After addition= "+real+"+i"+img);
	 }
	 public static void main(String args[])
	 {
	      complex c1=new complex();
		  complex c2=new complex();
		  complex c3=new complex();
		  c1.input();
		  System.out.println("now you can see the second object");
		  c2.input();
          c3.add(c1,c2);
        		  
	 }
}