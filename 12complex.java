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
	 complex add(complex s)
	 {
	       complex temp;
		   temp.real=real+s.real;
		   temp.img=img+s.img;
		   return  temp;
	 }
	 public static void main(String args[])
	 {
	      complex c1=new complex();
		  complex c2=new complex();
		  complex c3=new complex();
		  c1.input();
		  System.out.println("now you can see the second object");
		  c2.input();
          c3=c1.add(c2);
		  System.out.println("after addition ="+c3.real+"+i"+img);
        		  
	 }
}