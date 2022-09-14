import java.lang.*;

class Base
{
public int i,j;
public void fun()
{System.out.println("Base fun");}

public void gun()
{System.out.println("Base gun");}

public void sun()
{System.out.println("Base sun");}

}

class Derived extends Base
{
public int x,y;

public void fun()
{System.out.println("Derived fun");}

public void sun()
{System.out.println("Derived  sun");}

public void run()
{System.out.println("derived  run");}

}


class Virtual
{
	public static void main(String args[])
	{
		// Base bobj=new Base();
		// Derived dobj=new Derived();

		 Base obj= new Derived();

		 //derived obj2=new Base();
		 obj.fun();
		 obj.gun();
		 obj.sun();
		// obj.run();
	}
}
