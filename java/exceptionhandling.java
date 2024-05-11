//package exceptionexample;
class exceptionhandling{
    public static void main(String[] args){
        try{
            int a=10,b=0;
            System.out.println(a/b);
        }catch(java.lang.ArithmeticException e){
            System.out.println("Second Value should not be 0");
        }
        }
    }

