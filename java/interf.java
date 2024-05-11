interface inter
{
   int x=9;
   int y=10;
void cal();
}

interface inter1
   {
      int p=3;
      int q=4;
void cal();
}

class X implements inter ,inter1
{
  public  void cal()
{
System.out.println(" "+p+" " +q);
System.out.println("  "+x+"  "+y);
} }
class interf
{
   public static void main(String args[])
{
   X x=new X();
    x.cal();
}
}   

/*abstract class cal
{  int x;
   int y;
   cal(int p,int q)
{
    	x=p;
y=q;
}
abstract void find();
}

class add extends cal{
  add(int x,int y)
{
  super(x,y);
}

void find ()
{
    int p;
p=x+y;
   System.out.println(" add "+p);
}
}
class mul extends cal{
  mul(int x,int y)
{
  super(x,y);
}

void find ()
{
    int p;
p=x*y;
   System.out.println(" add "+p);
}}





class cal1
{
  public static void main(String arg[])
{
    add o=new add(2,3);
    cal r=o;
    r.find();
    mul m=new mul(4,5);
    r=m;
    r.find();
}}*/
