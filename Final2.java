
import java.lang.*;

class Base
{
public void fun()
{
	System.out.println("Base fun");
}
public final void gun()
{
	System.out.println("Base gun");
}

}
class Derived extends Base
{
public void fun()//Overriding Allowed 
{
	System.out.println("Derived fun");
}
/*public final void gun()  //this overriding is not allowed bcoz method is final
{
	System.out.println("Base gun");
}*/
}
class Final2
{
	public static void main(String args[])
	{
		Derived dobj=new Derived();
		dobj.fun(); //Derived Fun

		dobj.gun(); //Base fun


	}
}