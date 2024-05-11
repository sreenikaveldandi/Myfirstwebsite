class exception2
{
     public static void main(String ar[])
     {
         int i=40, j=0;

         int a[]=new int[5];

          try {

               System.out.println("hi");

               try {
                    i=i/2;
               }

               catch(ArithmeticException e)
               {
                    System.out.println(e);
               }

               a[3]=10;
               System.out.println(a[3]);
               a[5]=11;  //exception
     
               System.out.println(a[5]);
              
          }

          catch(ArithmeticException e)
          {
               System.out.println("Myerror : " + e);
          }

          catch(ArrayIndexOutOfBoundsException e)
          {
               System.out.println("Check the Limit"+e);

          }


          catch(Exception e)
          {
              System.out.println("eee"+e);
          }
              System.out.println("hhhh");
}
}