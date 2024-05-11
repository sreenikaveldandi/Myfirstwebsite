import java.util.Scanner;
class grades{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the marks in physics: ");
        int p=obj.nextInt();
        System.out.println("enter the marks in maths: ");
        int m=obj.nextInt();
        System.out.println("enter the marks in chemistry: ");
        int c=obj.nextInt();
        if(p<50 || m<50 || c<50){
            System.out.println("Fail");

        }
        else{
            int avg=(m+p+c)/3;    //we can do in if else loop also in else loop but declare avg before if
        switch(avg/10){
            case 9:
            System.out.println("O");
            break;
            case 8:
            System.out.println("A+");
            break;
            case 7:
            System.out.println("A");
            break;
            case 6:
            System.out.println("B+");
            break;
            default:
            System.out.println("Enter the correct marks");
           

        }
    }
         

    }
}