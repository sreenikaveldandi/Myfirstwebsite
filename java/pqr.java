class xyz
{
    int r;
    int i;
    int add()
{
   return(r+i);
}
void read1(int x,int y)
{
  r=x;
  i=y;
}
void print1()
{
  System.out.println("add of two numbers"+add());
} }
public class pqr
{  public  static void main(String args[])
{
    xyz x=new xyz();
    int p,q;
 p=Integer.parseInt(args[0]);
 q=Integer.parseInt(args[1]);
   x.read1(p,q);
   x.print1();
 } }
