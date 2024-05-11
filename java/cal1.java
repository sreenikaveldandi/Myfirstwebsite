abstract class cal
{  int x;
   int y;
   cal(int p,int q) //constructor
{
    	x=p;
      y=q;
}
abstract void find(); //abstract method
}

class add extends cal{    
  add(int x,int y)  //constructor
{
  super(x,y); //calls superclass constructor
}

void find () //overrides
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
   System.out.println(" mul "+p);
}
}





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
}
} 
