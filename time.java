import java.util.*;
class time
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
	 void add(time t1,time t2)
	 {
	      int sec;
          sec=((t1.hr+t2.hr)*3600)+((t1.min+t2.min)*60)+(t1.s+t2.s);
           hr=sec/3600;
            min=(sec%3600)/60;
              sec=(sec%3600)%60;
            System.out.println("After the addition="+"hr="+hr+"min="+min+"sec="+sec);			  
	 }
	 public static void main(String args[])
	 {
	      time t1=new time();
		  time t2=new time();
		  time t3=new time();
		  t1.input(); 
		  System.out.println("now you can emter the second time");
		  t2.input();
		  t3.add(t1,t2);
	 }
}