
import java.lang.*;

final class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}

}
//class Derived extends Base{} //not Allowed bcoz Base  class is final 
class Derived
{
	public bobj=new Base(); // composition
	public void gun()
	{
		System.out.println("Derived gun");
	}
}
class final4
{
	public static void main(String args[])
	{
		Derived dobj=new Derived();
		dobj.bobj.fun();
		dobj.gun();

	}
}