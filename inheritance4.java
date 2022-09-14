import java.lang.*;

class Base
{
	public int i;
	public int j;

	
	public void fun()
	{
		System.out.println("Inside  base fun");
	}
	
}

class Derived extends Base
{
	public int x;
	public int y;

	public void sun()
	{

		System.out.println("Inside derived sun");
		
	}
}

class DerivedX extends Derived
{
	public int x;
	public int y;

	public void gun()
	{

		System.out.println("Inside derivedx sun");
		
	}
}

class Inheritance2
{	
	public static void main(String args[])
	{
		System.out.println("Inside Main");

		Derived dobj=new Derived();
		dobj.sun();

		
	}
}