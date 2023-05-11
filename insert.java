import java.util.*;
class insert
{
       public static void main(String args[])
	   {
            int i,size,value,pos,m=0,temp=0;
			int a[]=new int[10];
			System.out.println("enter the size");
			Scanner sc=new Scanner(System.in);
			size=sc.nextInt();
			System.out.println("enter the element");
             for(i=0;i<size;i++)
			 {
				  a[i]=sc.nextInt();
			 }				 
			 System.out.println("enter the element");
			 pos=sc.nextInt();
			 System.out.println("enter the value");
			 value=sc.nextInt();
			 for(i=0;i<size;i++)
			 {
				 if(a[i]==pos)
					 m=i;
			 }
			     temp=m+1;
				 a[temp]=value;
			 System.out.println("now you can see the new array");
			 for(i=0;i<size;i++)
			 {
				 System.out.println(a[i]);
			 }
			 
			 
	   }
}