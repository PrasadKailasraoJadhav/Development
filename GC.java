import java.lang.*;

class Demo
{
    public int Arr[];

    public Demo(int size)
    {
        System.out.println("Allocating the resourcess in Constructor");
        this.Arr=new int[size];

    }
    protected void finalize()
    {
        System.out.println("Deaalocating resouece in finalize ");
        this.Arr=null;
    }
}

class GC
{
    public static void main(String arg[])
    {
       Demo dobj=new Demo(10);
       dobj=null;
       System.gc();
       System.out.println("End of Main");
    }
}