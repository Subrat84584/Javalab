import java.util.*;
class Palin
{
public static void main(String args[])
{
        int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		num=sc.nextInt();
		int flag=num;
		while(num!=0)
		{
		   rem=num%10;
		   sum=sum*10+rem;
		   num=num/10;
		}
		if(sum==flag)
			System.out.println("yes");
		else
			System.out.println("no");
		
}
}