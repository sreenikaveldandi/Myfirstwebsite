abstract class xyz
{
  abstract void display();
   final void write()
{
    System.out.println(" i am non abstract method member");
}
}
 class pqr extends xyz
{
   void display()
{     System.out.println(" i am abstract class member");
}

void write()
{
    System.out.println(" i am non abstract method member");
}

}
  class absTest
{
  public static void main(String[] args)
{
   pqr o=new pqr();
      o.display();
      o.write();
   xyz r;
    r=o;
    r.display();
    r.write();
    }
}