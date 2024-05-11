
class a3DArray {
    public static void main(String args[]) {
    int my3DArray [][][] = new int [3] [4] [5]; //declaring,allocating memory //its actualyy 3 2d arrays i.e 3pages 4rows 5coloumns
    int i, j, k;
    for (i =0; i<3; i++) //initializing
          for(j=0; j<4; j++)
               for (k=0; k<5; k++)
                   my3DArray[i][j][k] = i* j* k; 
    //printing arrays
    for (i=0; i<3; i++) {
         for(j=0; j<4; j++) {
               for (k=0; k<5; k++)
               System.out.print (my3DArray[i] [j] [k] + " ");
               System.out.println();
               }
                       System.out.println();
         }
    }
} 
