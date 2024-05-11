/*class A
{
 void display()
{
System.out.println("i am in A");
}
}
class B extends A
{	
void display()
{
System.out.println(" i am in B");
}
}
class testover
{
public static void main(String[] args)
{
   B ob=new B();
A oa;
ob.display();
oa=ob;
oa.display();
A oa1=new B();
oa1.display();
}}*/
//In summary, this code demonstrates method overriding in Java, where the subclass B overrides the display() method of its superclass A. When an object of class B is created, 
//both the superclass and subclass versions of the display() method can be called using the same reference variable of type A, depending on the actual object type.
