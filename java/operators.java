
   
  int a=8,b=3;
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  int c;
  
  char C='a',g;
  
  float h=2.3f,i;
  b=(int)(a+h);
  
  System.out.println(5/2.2);
  System.out.println(a+" + " +h+"="+ b);   
  c=a*b;
  System.out.println(a+" * " +b+"="+ c);   
  c=a/b;
  System.out.println(a+" / " +b+"="+ c);   
  c=a-b;
  System.out.println(a+" - " +b+"="+ c);  
  boolean d,e,f; 
  e=true;
  f=false;
  d=e && f;
  System.out.println(e+" && " +f+"="+ d);   
  d=e || f;
  System.out.println(e+" || " +f+"="+ d);   
  c=a&b;
  System.out.println(a+" & " +b+"="+ c);   
  c=a|b;
  System.out.println(a+" | " +b+"="+ c);   
  c=a^b;
  System.out.println(a+" ^ " +b+"="+ c);   
  c=a<<b;
  System.out.println(a+" << " +b+"="+ c);   
  c=a>>b;
  System.out.println(a+" >> " +b+"="+ c);  
  b=2;
  a=16; 
  c=a>>>b;
  System.out.println(a+" >>> " +b+"="+ c);   
  
  System.out.println(" ~ " +b+"="+ ~b);   
  System.out.println(" !" +e+"="+ !e);   
  
  a+=b;
  System.out.println(a+" += " +b+"= "+ a);   
  a*=b;
  System.out.println(a+" *= " +"="+ a);   
  a/=b;
  System.out.println(a+" /= " +"="+ a);   
  a-=b;
  System.out.println(a+" -= " +"="+ a);  
  
  
  a&=b;
  System.out.println(a+" & =" +b+"="+ a);   
  a|=b;
  System.out.println(a+" | =" +b+"="+ a);   
  a^=b;
  System.out.println(a+" ^= " +b+"="+ a);   
  a<<=b;
  System.out.println(a+" <<= " +b+"="+ a);   
  a>>=b;
  System.out.println(a+" >> =" +b+"="+ a);  
  b=2;a=16; 
  a>>>=b;
  System.out.println(a+" >>> =" +b+"="+ a);   
  if (Character.isUpperCase(aChar)) {           
    System.out.println("The character " + aChar + " is upper case.");   
        }
   else
   {             System.out.println("The character " + aChar + " is lower case.");         }   
        System.out.println("The value of aBoolean is " + aBoolean);    
   } 
  }
  2).
  import javax.swing.JOptionPane;
  class jop
  {
  public static void main(String args[])
  {
    int x,y;
  int z;
  x=Integer.parseInt(JOptionPane.showInputDialog("enter the a value"));
  y=Integer.parseInt(JOptionPane.showInputDialog("enter the a value"));
  z=x+y;
  System.out.println(" "+z);
  }
  }   
  3.class prim
  {
  public static void main(String arg[])
  {int x,i,j,count =0;
  boolean flag;
  j=Integer.parseInt(arg[0]);
  for(x=2;x<=j;x++)
  {
  flag=false;
  for(i=2;i<=x/2;i++)
  {count++;
     if(x%i==0)
       flag=true;
  }
  if (flag!=true)
    System.out.println(" "+ x);
  }
  System.out.println(" "+count);
  }}
  
  4.import javax.swing.JOptionPane;
  class mat1
  {
  public static void main(String args[])
  {
    int x[];
   x=new int[10];
  int y[]=new int[10];
  
  int z[]={45,78,65,99,88};
  int i,j;
  for(i=0;i<5;i++)
  
  x[i]=Integer.parseInt(JOptionPane.showInputDialog("enter the a value"));
  for(j=0;j<5;j++)
  y[j]=x[j];
  for(j=0;j<5;j++)
  System.out.println(" "+y[j]);
  for(j=0;j<5;j++)
  System.out.println(" "+z[j]);
  } }
  5.
  import javax.swing.JOptionPane;
  class lmn
  {
  public static void main(String[ ] args)
  {
     int b,i,j,x;
  int a[]=new int[5];
  int c[][];
  b=Integer.parseInt(args[0]);
  System.out.println(b);
  
  for(i=0;i<5;i++)
  { a[i]=i;
  }
  for(i=0;i<5;i++)
  { System.out.print(a[i]+" ");
  }
  x=Integer.parseInt(JOptionPane.showInputDialog("enter the a value"));
  System.out.print(x+" ");
  c=new int[5][];
  for(i=0;i<5;i++)
  { c[i]=new int[5];
  }
  for(i=0;i<5;i++)
  {
  for(j=0;j<5;j++)
  {
  c[i][j]=i+j;	
  }
  }
  for(i=0;i<5;i++)
  {
  for(j=0;j<5;j++)
  {
  System.out.print(c[i][j]+" ");
  }
  System.out.println();
  }}}
  6.
  class max
  {
  static double  sqr(int x)
  {
  return(Math.sqrt(x));
  }
  public static void main(String arg[])
  {int i;
  int a[]={4,3,1,5,9,8,7,6,2,0};
  int max=a[0];
  int min=a[0];
  
  for(i=1;i<10;i++)
  {
  if(a[i]>max)
  {
  max=a[i];
  }
  if(a[i]<min)
  min=a[i];
  }
  System.out.println(" "+max);
  System.out.println(" "+min);
  System.out.println(" "+sqr(9));
  }
  }
  5.
  class arthop
  {
     static int add(int x,int y)
  {
    return(x+y);
  }
  static int mul(int x,int y)
  {return(x*y);
  }
  
  }
  class arth
  {
  public static void main(String args[])
  {
  
  int x,y;
  
  x=arthop.add(2,3);
  System.out.println(" "+x);
  y=arthop.mul(4,5);
  System.out.println(" "+y);
  }
  }
  
  6. class xyz
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
  Explain public static void main(String args[])
  What is meant by Local variable and Instance Variable?
  What is the purpose of static method? 
  Why Java is platform independent. 
  What is the bytecode?
  Why java is not 100% Object-oriented?
  


