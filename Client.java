import PPA.Marvello;
import PPA.Info;
import PPA.LB.Demoo;
import  PPA.LB.DS.Helloo;
class Client
{
	public static void main(String arg[])
	{
		Marvello mobj=new Marvello();
		Info iobj=new Info();
		Demoo dobj=new Demoo();
		Helloo hobj=new Helloo();
		mobj.fun();
		iobj.gun();
		dobj.sun();//Nested Package
		hobj.run();
	}
}