import java.util.*;
class tim
{
     int hr,min,s;
	 void input()
	 {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("enter the hr");
	     hr=sc.nextInt();
		 System.out.println("enter the min");
		 min=sc.nextInt();
		 System.out.println("enter the second");
		 s=sc.nextInt();
		 
	 }
	 tim add(tim t)
	 {
	      tim temp=new tim();
		  int sec;
          sec=((hr+t.hr)*3600)+((min+t.min)*60)+(s+t.s);
           temp.hr=sec/3600;
            temp.min=(sec%3600)/60;
              temp.s=(sec%3600)%60;
            return temp;			  
	 }
	 public static void main(String args[])
	 {
	      tim t1=new tim();
		  tim t2=new tim();
		  tim t3=new tim();
		  t1.input(); 
		  System.out.println("now you can emter the second time");
		  t2.input();
		  t3=t1.add(t2);
		  System.out.println("After the addition="+"hr="+t3.hr+"min="+t3.min+"sec="+t3.s);			  
	 }
	 
}