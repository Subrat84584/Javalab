import java.util.*;
class part
{
     public static void main(String args[])
	 {
		 int i,j,k=0;
		 for(i=1;i<=9;i++)
		 {
			 k=i<5?k++:k--;
			 for(j=1;j<=5;j++)
			 {
				 if(j<=k)
					 System.out.println("*");
				 else
					 System.out.println(" ");
			 }
			 System.out.println("\n");
		 }
	 }
}