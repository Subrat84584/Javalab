import java.util.*;
import java.lang.Math;
class Power
{
public static void main(String args[])
{
       int num1,num2,res;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your fst number");
	   num1=sc.nextInt();
	   System.out.println("enter the second number");
	   num2=sc.nextInt();
	   res=Math.pow(num1,num2);
	   System.out.println("result is="+res);
}
}