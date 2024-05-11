
class a2DArray {
    public static void main(String[] args){
        int my2DArray [][] = new int[3][4];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++)
               my2DArray[i][j] = i*j ;
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(my2DArray[i][j] + " ");
                 
            }
            System.out.println();
        }
    } 
}
