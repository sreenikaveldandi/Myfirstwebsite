class exception
{
     public static void main(String ar[])
     {
          System.out.println("stat1");
          int  a=0;
          int ab[] = new int [5];

         
            try{
                a=10/2;
                System.out.println("a= "+a);
            }
          catch(ArithmeticException e)
          {
               a=0;
               System.out.println(e);
          }
          try 
          {
            
            ab[5]=10;
            System.out.println(ab[5]);
            }
          catch(ArrayIndexOutOfBoundsException e)
          {
               System.out.println(e);
          }
          finally{
            System.out.println("executed");
          }
        //   catch(Exception e)
        //   {
        //   }
        //   System.out.println("more stats");
        //   System.out.println("a=" + a);
        //   System.out.println("many more stats");
        }
}