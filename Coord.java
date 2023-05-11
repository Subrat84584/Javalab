import java.util.*;
import java.util.Math;
class Coord
{
  int x,y;
  Coord(int m,int n)
  {
	  System.out.println("Now you are entering the co ordinate value");
	  x=m;
	  y=n;
  }
  float distance(Coord ob1,Coord ob2)
  {
	  float dis;
	  dis=Math.sqrt((ob2.x-ob1.x)*(ob2.x-ob1.x)+(ob2.y-ob1.y)*(ob2.y-ob1.y));
	  return dis;
  }
}

class Driver
{
 public static void main(String args[])
  {
	  Coord ob=new Coord(4,4);
	  Coord ob2=new Coord(2,2);
	  Coord ob3=new Coord(ob,ob2);
	  
  }
}
