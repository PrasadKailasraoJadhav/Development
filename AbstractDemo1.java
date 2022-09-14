 
import java.lang.*;
abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Demo Constructor");

	}
	public void fun() //concreate
	{
		System.out.println("Demo fun");
	}

	public abstract void gun();// Abstact
}

class Hello extends  Demo
{
	public int  x,y;
	public Hello()
	{
		System.out.println("Hello Constructor");

	}
	public void sun()//Concreate
	{
		System.out.println("Hello sun");
	}
	public void gun()//concreate
	{
		System.out.println("Hello gun");
	}
}
class AbstractDemo1
{
	public static void main(String args[])
	{
		Hello hobj=new Hello();
		hobj.fun();
		hobj.gun();
		hobj.sun();


	}
}


/*




*/






































