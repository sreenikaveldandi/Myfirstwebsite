class TestArray{
    public static void main(String args[]) {

    int a[]= {10, 20, 30, 40, 50}; //Initialization
    //Traversing array
    for (int i=0; i<a.length; i++) { //length is the property //a.length will give the size of array
         System.out.println(a[i]);
          //if we use only print o/p will be 1020304050average = 30.0 
          //if we use print(a[i]+" ") o/p will be 10 20 30 40 50 average = 30.0
    } 
    //in this place we can use System.out.println() if we use above cmt so avg can print in nxt line
    // Average calculation
    float sum= 0, avg;//declartion of variables nd memory allocation ,initialisation
    for (int i=0; i<a.length; i++) //Calculating the sum of 1
    sum += a[i];
    avg = sum/a.length;
    System.out.println("Average = " + avg);
    
    }
}   